package com.example.dotaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotaapp.ui.theme.LavenderBlush
import com.example.dotaapp.ui.theme.MettalicSilver
import com.example.dotaapp.ui.theme.Mirage
import com.example.dotaapp.ui.theme.White66

@Composable
fun DotaReviewSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        ReviewsHeader()
        Spacer(modifier = Modifier.size(32.dp))
        CommentBlock(
            userAvatarPainter = painterResource(id = R.drawable.user1),
            name = stringResource(R.string.comment1_username),
            date = stringResource(R.string.comment1_date),
            comment = stringResource(R.string.comment1_text)
        )
        Divider(
            color = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp)
        )
        CommentBlock(
            userAvatarPainter = painterResource(id = R.drawable.user2),
            name = stringResource(R.string.comment2_username),
            date = stringResource(R.string.comment2_date),
            comment = stringResource(R.string.comment2_text)
        )
    }
}


@Composable
private fun ReviewsHeader(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.review_ratings),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = 4.9.toString(),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    repeat(4) {
                        StarImage()
                    }
                    StarImage(isHalf = true)
                }
                Text(
                    text = stringResource(R.string.reviews_count),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
private fun CommentBlock(
    userAvatarPainter: Painter,
    name: String,
    date: String,
    comment: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row {
            Image(
                painter = userAvatarPainter,
                null,
                modifier = Modifier.size(36.dp)
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = name,
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = date,
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = comment,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyMedium


        )
    }
}

@Preview
@Composable
private fun DotaReviewSectionPreview() {
    DotaReviewSection()
}