package com.example.tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas.models.CarItem
import com.example.tugas.models.carList
import com.example.tugas.ui.theme.TugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("grid") { LazyGridScreen(navController) }
        composable("about") { AboutScreen(navController) }
        composable("detail/{carName}") { backStackEntry ->
            val carName = backStackEntry.arguments?.getString("carName")
            val carItem = carList.find { it.name == carName }
            carItem?.let { DetailScreen(it, navController) }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarWithMenu(navController: NavController, title: String) {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(title) },
        actions = {
            IconButton(onClick = { expanded = true }) {
                Icon(Icons.Filled.MoreVert, contentDescription = "Menu")
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Home") },
                    onClick = {
                        navController.navigate("home") {
                            popUpTo("home") { inclusive = true }
                        }
                        expanded = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("Grid") },
                    onClick = {
                        navController.navigate("grid") {
                            popUpTo("grid") { inclusive = true }
                        }
                        expanded = false
                    }
                )
                DropdownMenuItem(
                    text = { Text("About") },
                    onClick = {
                        navController.navigate("about") {
                            popUpTo("about") { inclusive = true }
                        }
                        expanded = false
                    }
                )
            }
        }
    )
}