package com.example.netflixclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun MoviePreviewDetails() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painterResource(id = R.drawable.poster_1), contentDescription = "",
            modifier = Modifier.size(280.dp))
        MovieDetails()
        MovieInfromation()
    }
}

@Composable
@Preview(showBackground = true)
fun MovieDetails() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp, start = 80.dp, end = 80.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Scandeleous",
            color = Color.LightGray,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
        Text(
            text = "Serial",
            color = Color.LightGray,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
        Text(text = "Teen", color = Color.LightGray, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
        Text(text = "2023", color = Color.LightGray, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)

    }
}

@Preview
@Composable
fun MovieInfromation(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 80.dp, end = 80.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
           Image(painterResource(id = R.drawable.add), contentDescription = "",
               modifier = Modifier.padding(start = 12.dp))
            Text(text = "My list", color = Color.LightGray, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)

        }
        Button(onClick = {},
            colors= ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(5.dp),) {
            Text(text = "Play", color = Color.Black, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
            
        }
        Column() {
            Image(painterResource(id = R.drawable.info_24), contentDescription = "")
            Text(text = "Info", color = Color.LightGray, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)

        }
    }

}