package com.example.dotaapp

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DotaDescription(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.xs_padding)),
        modifier = modifier.horizontalScroll(rememberScrollState())
    ) {
        DescriptionTag(stringResource(id = R.string.tag_moba))
        DescriptionTag(stringResource(id = R.string.tag_multiplayer))
        DescriptionTag(stringResource(id = R.string.tag_strategy))
    }

    Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.xl_padding)))

    Text(
        text = stringResource(id = R.string.dota_description),
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.bodyMedium,
    )
}

@Preview
@Composable
private fun DotaDescriptionPreview() {
    DotaDescription()
}