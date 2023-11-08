package com.example.dotaapp

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DescriptionTag(text: String) {
    SuggestionChip(
        onClick = { },
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.chips_shape)),
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

@Preview
@Composable
private fun DescriptionTagPreview() {
    DescriptionTag(text = stringResource(id = R.string.tag_moba))
}