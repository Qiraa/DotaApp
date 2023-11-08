package com.example.dotaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun InstallButton(
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues(vertical = 16.dp),
        modifier = modifier,
    ) {
        Text(
            text = stringResource(id = R.string.install_game),
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Composable
fun StarImage(
    isHalf: Boolean = false,
    modifier: Modifier = Modifier
) {
    if (isHalf) {
        Image(
            painter = painterResource(id = R.drawable.half_star),
            contentDescription = stringResource(R.string.half_star),
            modifier = modifier
        )
    } else {
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = stringResource(R.string.full_star),
            modifier = modifier
        )
    }
}