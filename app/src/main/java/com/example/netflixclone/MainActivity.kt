package com.example.netflixclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.netflixclone.ui.theme.NetflixContentSelector

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier.fillMaxSize()
                    .background(color = Color.Black)
                    .verticalScroll(rememberScrollState())

            ){
                NetflixCloneApp()

            }
        }
    }
}

@Composable
fun NetflixCloneApp(){
    Navbar()
    NetflixContentSelector()
    MoviePreviewDetails()
    MovesListUiModelImplementation(movieType = "Watch It Again")
    MovesListUiModelImplementation(movieType = "New Release")
    MovesListUiModelImplementation(movieType = "Drama")
    MovesListUiModelImplementation(movieType = "Anime")
    MovesListUiModelImplementation(movieType = "Thriller")
    MovesListUiModelImplementation(movieType = "Action")
    MovesListUiModelImplementation(movieType = "New Release")
    MovesListUiModelImplementation(movieType = "Documentary")
    MovesListUiModelImplementation(movieType = "Telugu Series")
    MovesListUiModelImplementation(movieType = "Tv Shows")
}
