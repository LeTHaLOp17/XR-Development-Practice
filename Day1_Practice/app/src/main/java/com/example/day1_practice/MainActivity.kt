package com.example.day1_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent   // ✅ needed for setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {   // ✅ use ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {   // ✅ now works
            App()
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
fun App() {
    MaterialTheme {
        HelloCard(name = "Ayush")
    }
}