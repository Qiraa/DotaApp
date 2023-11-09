package com.example.dotaapp.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotaapp.R
import com.example.dotaapp.ui.theme.Dark

@Composable
fun LogoImage(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(dimensionResource(id = R.dimen.border_size), Dark),
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_icon),
            contentDescription = stringResource(id = R.string.dota_icon_content_description),
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.m_padding))
                .size(dimensionResource(id = R.dimen.dota_icon_size))
        )
    }
}

@Preview
@Composable
private fun LogoImagePreview() {
    LogoImage()
}