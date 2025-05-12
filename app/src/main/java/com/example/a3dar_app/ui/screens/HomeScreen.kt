package com.example.a3dar_app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.a3dar_app.ui.navigation.ARScreen
import com.example.a3dar_app.ui.navigation.AlphabetScreen
import com.example.a3dar_app.ui.navigation.QuizScreen

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button (onClick = { navController.navigate(AlphabetScreen) }){
            Text(text = "Alphabets")
        }
        Button (onClick = { navController.navigate(QuizScreen) }){
            Text(text = "Quiz")
        }
    }
}