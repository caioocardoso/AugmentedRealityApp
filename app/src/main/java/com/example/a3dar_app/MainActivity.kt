package com.example.a3dar_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.codewithfk.arlearner.ui.screens.ARScreen
import com.example.a3dar_app.ui.navigation.ARScreen
import com.example.a3dar_app.ui.navigation.AlphabetScreen
import com.example.a3dar_app.ui.navigation.HomeScreen
import com.example.a3dar_app.ui.navigation.QuizScreen
import com.example.a3dar_app.ui.screens.AlphabetScreen
import com.example.a3dar_app.ui.screens.HomeScreen
import com.example.a3dar_app.ui.theme._3dARAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _3dARAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = HomeScreen,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable<HomeScreen> {
                            HomeScreen(navController)
                        }
                        composable<ARScreen> {
                            val alphabet = it.toRoute<ARScreen>().model
                            ARScreen(navController = navController, model = alphabet)
                        }
                        composable<AlphabetScreen> {
                            AlphabetScreen(navController = navController)
                        }
                        composable<QuizScreen> {

                        }
                    }
                }
            }
        }
    }
}