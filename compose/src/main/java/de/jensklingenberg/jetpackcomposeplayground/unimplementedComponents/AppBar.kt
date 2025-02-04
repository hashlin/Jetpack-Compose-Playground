package de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents


import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.layout.Row
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.rallyBlue

@Composable
fun AppBar(title: String = "") {
    Surface(color = rallyBlue) {
        Row(mainAxisAlignment = MainAxisAlignment.Center) {
            Text(
                text = title,
                style = +themeTextStyle { h4.copy(color = Color(0xFFFFFFFF.toInt())) }
            )
        }
    }
}

