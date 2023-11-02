package com.example.dotaapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.dotaapp.R

@Composable
fun StarImage(
    isHalf: Boolean = false,
    modifier: Modifier = Modifier
) {
    if (isHalf) {
        Image(
            painter = painterResource(id = R.drawable.half_star),
            contentDescription = null,
            modifier = modifier
        )
    } else {
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = null,
            modifier = modifier
        )
    }
}

@Composable
fun StarImagePreview() {
    StarImage()
}