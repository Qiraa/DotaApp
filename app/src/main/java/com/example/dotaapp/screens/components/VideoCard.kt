package com.example.dotaapp.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotaapp.R

@Composable
fun VideoCard(painter: Painter) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painter,
            contentDescription = stringResource(R.string.gameplay_video),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .clip(RoundedCornerShape(dimensionResource(id = R.dimen.video_shape)))
                .height(dimensionResource(id = R.dimen.video_height))
                .width(dimensionResource(id = R.dimen.video_width))
        )
        Card(
            shape = CircleShape,
            colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.24f)),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.play),
                tint = Color.White,
                contentDescription = stringResource(id = R.string.play_content_description),
                modifier = Modifier
                    .wrapContentSize()
                    .padding(dimensionResource(id = R.dimen.s_padding))
            )
        }
    }
}

@Composable
fun Videos(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.xl_padding))
    ) {
        VideoCard(painter = painterResource(id = R.drawable.video1))
        VideoCard(painter = painterResource(id = R.drawable.video2))
    }
}

@Preview
@Composable
private fun VideoPreview() {
    VideoCard(painter = painterResource(id = R.drawable.video1))
}