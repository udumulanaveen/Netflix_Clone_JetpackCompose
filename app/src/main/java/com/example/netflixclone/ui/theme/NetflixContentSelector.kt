package com.example.netflixclone.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R

@Composable
@Preview
fun NetflixContentSelector() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(horizontal = 30.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Tv Shows",
            color = Color.LightGray,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = "Movies",
            color = Color.LightGray,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Row() {
            Text(
                text = "Categories",
                color = Color.LightGray,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Image(painterResource(id = R.drawable.drop), contentDescription = "Netflix Logo")
        }

    }
}