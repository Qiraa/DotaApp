package com.example.dotaapp.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotaapp.R

@Composable
fun ReviewsHeader(modifier: Modifier = Modifier) {
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
            Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.m_padding)))
            Column {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(
                        dimensionResource(id = R.dimen.xxs_padding)
                    )
                ) {
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

@Preview
@Composable
private fun ReviewHeaderPreview() {
    ReviewsHeader()
}
