package com.example.dotaapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotaapp.screens.components.DotaDetailsSection
import com.example.dotaapp.screens.components.DotaReviewSection
import com.example.dotaapp.screens.components.InstallButton
import com.example.dotaapp.R

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .navigationBarsPadding()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_banner),
            contentDescription = stringResource(id = R.string.banner_content_description),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
        )
        DotaDetailsSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.xl_padding))
                .offset(y = dimensionResource(id = R.dimen.logo_offset))
        )

        DotaReviewSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.xl_padding))
        )

        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.xxxl_padding)))
        InstallButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.xl_padding))
        )

    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}