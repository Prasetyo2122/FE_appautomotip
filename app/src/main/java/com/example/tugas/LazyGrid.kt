package com.example.tugas

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas.models.CarItem
import com.example.tugas.models.carList

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LazyGridScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBarWithMenu(navController, title = "Lazy Grid") }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(carList) { car ->
                    CarItemRow(car) { navController.navigate("detail/${car.name}") }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazyGridScreen() {
    val navController = rememberNavController()
    LazyGridScreen(navController)
}


