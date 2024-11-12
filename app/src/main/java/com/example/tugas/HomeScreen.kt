package com.example.tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas.models.CarItem
import com.example.tugas.models.carList

@OptIn(ExperimentalMaterial3Api::class)



@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBarWithMenu(navController, title = "Home") }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            LazyRow(contentPadding = PaddingValues(8.dp)) {
                items(carList) { car ->
                    CarItemRowSmall(car) { navController.navigate("detail/${car.name}") }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(carList) { car ->
                    CarItemRow(car) { navController.navigate("detail/${car.name}") }
                }
            }
        }
    }
}

@Composable
fun CarItemRow(car: CarItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() }
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(painter = painterResource(id = car.imageRes), contentDescription = car.name)
            Spacer(modifier = Modifier.height(8.dp))
            Text(car.name)
        }
    }
}

@Composable
fun CarItemRowSmall(car: CarItem, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Image(
            painter = painterResource(id = car.imageRes),
            contentDescription = car.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(car.name, style = MaterialTheme.typography.bodySmall)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(navController)
}


