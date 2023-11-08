package com.example.dotaapp.ui.theme

import android.app.Activity
import android.view.Surface
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = PapayaWhip,
    onPrimary = BlueCharcoal,
    secondary = ButterflyBlue.copy(alpha = 0.24f),
    onSecondary = ButterflyBlue,
    tertiary = Mirage,
    background = DarkBlue,
    onBackground = Color.White,
    surface = Color.Black,
    onSurface = MettalicSilver
)

private val LightColorScheme = lightColorScheme(
    primary = PapayaWhip,
    onPrimary = BlueCharcoal,
    secondary = ButterflyBlue.copy(alpha = 0.24f),
    onSecondary = ButterflyBlue,
    tertiary = Mirage,
    background = Color.White,
    onBackground = BlueCharcoal,
    surface = Color.LightGray,
    onSurface = MettalicSilver
)

@Composable
fun DotaAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}