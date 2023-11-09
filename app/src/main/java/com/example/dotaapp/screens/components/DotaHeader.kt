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
fun DotaHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom
    ) {
        LogoImage()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.xs_padding)))
        Column {
            Text(
                text = stringResource(R.string.dota_title),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )
            Row {
                RatingRow()
                Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.xxs_padding)))
                Text(
                    text = stringResource(R.string.dota_installs_count),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.s_padding)))
        }
    }
}

@Composable
fun RatingRow(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.xxs_padding)),
        modifier = modifier
    ) {
        repeat(5) {
            StarImage(modifier = Modifier.size(dimensionResource(id = R.dimen.star_size)))
        }
    }
}

@Preview
@Composable
private fun DotaHeaderPreview() {
    DotaHeader()
}