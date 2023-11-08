package com.example.dotaapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DotaDetailsSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        DotaHeader()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.m_padding)))
        DotaDescription()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.m_padding)))
        Videos()
    }
}


@Preview
@Composable
private fun GameDescriptionPreview() {
    DotaDetailsSection()
}