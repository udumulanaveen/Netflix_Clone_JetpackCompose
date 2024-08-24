package com.example.netflixclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Navbar(
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painterResource(id = R.drawable.netflix_symbol),
            contentDescription = "logo",
            modifier = Modifier.size(60.dp)
        )
        Row() {
            Image(
                painterResource(id = R.drawable.search),
                contentDescription = "search",
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(30.dp)
            )
            Image(
                painterResource(id = R.drawable.profile),
                contentDescription = "home",
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(30.dp)
            )
        }

    }
}