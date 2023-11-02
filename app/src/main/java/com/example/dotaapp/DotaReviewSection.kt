package com.example.dotaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
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
import androidx.compose.ui.unit.sp
import com.example.dotaapp.ui.theme.LavenderBlush
import com.example.dotaapp.ui.theme.MettalicSilver
import com.example.dotaapp.ui.theme.Mirage
import com.example.dotaapp.ui.theme.StarImage
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
            name = "Auguste Conte",
            date = "February 14, 2019",
            comment = "“Once you start to learn its secrets, there’s a wild and " +
                    "exciting variety of play here that’s unmatched, even by its peers.”"
        )
        Divider(
            color = Mirage,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp)
        )
        CommentBlock(
            userAvatarPainter = painterResource(id = R.drawable.user2),
            name = "Jang Marcelino",
            date = "February 14, 2019",
            comment = "“Once you start to learn its secrets, there’s a wild and " +
                    "exciting variety of play here that’s unmatched, even by its peers.”"
        )
    }
}

@Composable
private fun ReviewsHeader(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.review_ratings),
            fontSize = 16.sp,
            color = LavenderBlush,
            letterSpacing = 0.6.sp,
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = 4.9.toString(),
                color = Color.White,
                fontSize = 48.sp
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
                    color = MettalicSilver,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp
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
                    color = Color.White,
                    fontSize = 16.sp,
                    letterSpacing = 0.5.sp
                )
                Text(
                    text = date,
                    color = White66,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp
                )
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = comment,
            color = MettalicSilver,
            fontSize = 12.sp,
            letterSpacing = 0.5.sp,
            lineHeight = 16.sp
        )
    }
}

@Preview
@Composable
private fun DotaReviewSectionPreview() {
    DotaReviewSection()
}