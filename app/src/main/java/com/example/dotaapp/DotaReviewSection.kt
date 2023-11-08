package com.example.dotaapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DotaReviewSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        ReviewsHeader()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.xxl_padding)))
        CommentBlock(
            userAvatarPainter = painterResource(id = R.drawable.user1),
            name = stringResource(R.string.comment1_username),
            date = stringResource(R.string.comment1_date),
            comment = stringResource(R.string.comment1_text)
        )
        Divider(
            color = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.divider_horizontal_size))
                .padding(dimensionResource(id = R.dimen.divider_vertical_size))
        )
        CommentBlock(
            userAvatarPainter = painterResource(id = R.drawable.user2),
            name = stringResource(R.string.comment2_username),
            date = stringResource(R.string.comment2_date),
            comment = stringResource(R.string.comment2_text)
        )
    }
}

@Preview
@Composable
private fun DotaReviewSectionPreview() {
    DotaReviewSection()
}