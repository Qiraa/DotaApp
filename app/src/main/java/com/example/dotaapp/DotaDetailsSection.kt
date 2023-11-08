package com.example.dotaapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotaapp.ui.theme.ButterflyBlue
import com.example.dotaapp.ui.theme.Dark
import com.example.dotaapp.ui.theme.MettalicSilver
import com.example.dotaapp.ui.theme.OuterSpace
import com.example.dotaapp.ui.theme.PaleBlue

@Composable
fun DotaDetailsSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        DotaHeader()
        Spacer(modifier = Modifier.size(16.dp))
        DotaDescription()
        Spacer(modifier = Modifier.size(16.dp))
        Videos()
    }
}

@Composable
private fun DotaHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom
    ) {
        LogoImage()
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Text(
                text = stringResource(R.string.dota_title),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )
            Row {
                RatingRow()
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = stringResource(R.string.dota_installs_count),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.size(12.dp))
        }
    }
}

@Composable
private fun DotaDescription(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.horizontalScroll(rememberScrollState())
    ) {
        DescriptionTag(stringResource(id = R.string.tag_moba))
        DescriptionTag(stringResource(id = R.string.tag_multiplayer))
        DescriptionTag(stringResource(id = R.string.tag_strategy))
    }

    Spacer(modifier = Modifier.size(24.dp))

    Text(
        text = stringResource(id = R.string.dota_description),
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.bodyMedium,
    )
}

@Composable
private fun Videos(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        VideoCard(painter = painterResource(id = R.drawable.video1))
        VideoCard(painter = painterResource(id = R.drawable.video2))
    }
}

@Composable
private fun LogoImage(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, Dark),
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_icon),
            contentDescription = stringResource(id = R.string.dota_icon_content_description),
            modifier = Modifier
                .padding(16.dp)
                .size(64.dp)
        )
    }
}

@Composable
private fun RatingRow(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
    ) {
        repeat(5) {
            StarImage(modifier = Modifier.size(12.dp))
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun DescriptionTag(text: String) {
    SuggestionChip(
        onClick = { },
        shape = RoundedCornerShape(100.dp),
        colors = SuggestionChipDefaults.suggestionChipColors(
            containerColor = MaterialTheme.colorScheme.secondary
        ),
        border = null,
        label = {
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
    )
}

@Composable
private fun VideoCard(painter: Painter) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painter,
            contentDescription = stringResource(R.string.gameplay_video),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .height(136.dp)
                .width(240.dp)
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
                    .padding(12.dp)
            )
        }
    }
}


@Preview
@Composable
private fun GameDescriptionPreview() {
    DotaDetailsSection()
}