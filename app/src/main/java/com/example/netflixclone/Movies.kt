package com.example.netflixclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Movies (
    val movieThumbnail: Int
)

@Composable
fun MovesListUiModel(imageResource: Int){
    Image(painterResource(id = imageResource), contentDescription = "",
        modifier = Modifier
            .height(200.dp)
            .width(150.dp))
}

@Composable
fun MovesListUiModelImplementation(movieType:String) {



Column(
    modifier = Modifier.fillMaxWidth()

) {
Text(text =movieType, fontSize = 18.sp, fontWeight = FontWeight.Bold,color = Color.LightGray,
    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp))
    LazyRow{
        itemsIndexed(getRandomMovies()){
            _,item ->
            MovesListUiModel(imageResource = item.movieThumbnail)
        }
    }

}


}

fun getRandomMovies():List<Movies>{
    val movies = mutableListOf<Movies>()
    movies.add(Movies(R.drawable.poster_1))
    movies.add(Movies(R.drawable.poster_2))
    movies.add(Movies(R.drawable.poster_3))
    movies.add(Movies(R.drawable.poster_4))
    movies.add(Movies(R.drawable.poster_5))
    movies.add(Movies(R.drawable.poster_6))
    movies.add(Movies(R.drawable.poster_7))
    movies.add(Movies(R.drawable.poster_8))
    movies.shuffle()
    return movies
}

