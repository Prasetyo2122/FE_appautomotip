package com.example.tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBarWithMenu(navController, title = "About") }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.pr),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Muhammad Arifandi Prasetyo", style = MaterialTheme.typography.titleMedium)
            Text("m.arifandiprasetyo354@gmail.com", style = MaterialTheme.typography.bodyMedium)
            Text("Politeknik Negeri Jakarta", style = MaterialTheme.typography.bodyMedium)
            Text("Teknik Informatika", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Second year student majoring in Informatics Engineering at the Jakarta State Polytechnic with a final GPA of 3.56. My dream is to become a dedicated and passionate web developer and UI/UX designer with experience in designing intuitive and engaging user interfaces. I have skills in using various design tools and web development technologies to create optimal digital experiences. I am constantly learning and following the latest trends in web design and development to ensure every project I work on meets the highest quality standards.",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.Gray),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutScreen() {
    AboutScreen(NavController(LocalContext.current))
}


