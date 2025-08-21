package com.example.day1_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent   // ✅ needed for setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {   // ✅ use ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MaterialTheme {
                Column {
                    GreetingCard()
                    ToggleButtonExample()
                    NumberList()
                }
            }
        }
    }
}

@Composable
fun HelloCard(name: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(
                text = "Hello, $name 👋",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(Modifier.height(8.dp))
            var clicks by remember { mutableStateOf(0) }
            Button(onClick = { clicks++ }) {
                Text("Clicked $clicks times")
            }
        }
    }
}
@Composable
fun GreetingCard() {
    var name by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Enter your name") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(
                text = "Hello, $name!",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun ToggleButtonExample() {
    var showButton by remember { mutableStateOf(true) }
    var count by remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Show Button")
            Switch(
                checked = showButton,
                onCheckedChange = { showButton = it }
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (showButton) {
            Button(onClick = { count++ }) {
                Text("Clicked $count times")
            }
        }
    }
}

@Composable
fun NumberList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        items(20) { index ->
            Text("Item ${index + 1}", modifier = Modifier.padding(8.dp))
        }
    }
}


@Composable
fun App() {
    MaterialTheme {
        HelloCard(name = "Ayush")
    }
}