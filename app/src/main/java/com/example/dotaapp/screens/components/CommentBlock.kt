package com.example.dotaapp.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotaapp.R

@Composable
fun CommentBlock(
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
                modifier = Modifier.size(dimensionResource(id = R.dimen.user_avatar_size))
            )
            Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.m_padding)))
            Column(
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(id = R.dimen.xs_padding)
                )
            ) {
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
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.m_padding)))
        Text(
            text = comment,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyMedium


        )
    }
}

@Preview
@Composable
private fun CommentBlockPreview() {
    CommentBlock(
        userAvatarPainter = painterResource(id = R.drawable.user1),
        name = stringResource(id = R.string.comment1_username),
        date = stringResource(id = R.string.comment1_date),
        comment = stringResource(id = R.string.comment1_text)
    )
}