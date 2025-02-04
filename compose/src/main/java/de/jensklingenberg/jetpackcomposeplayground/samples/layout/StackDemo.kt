package de.jensklingenberg.jetpackcomposeplayground.samples.layout

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp

import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.Padding
import androidx.ui.layout.Stack
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.text.style.TextAlign
import de.jensklingenberg.jetpackcomposeplayground.demos.ColoredRect
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.rallyBlue


@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Stack]
         */
fun StackDemo() {

    MaterialTheme {
        StackExample()
    }

}

@Composable
fun StackExample() {
    Stack {

        aligned(Alignment.TopCenter) {
            Text(
                text = "This text is drawed first ",
                style = +themeTextStyle { h4 }
                , paragraphStyle = androidx.ui.text.ParagraphStyle(textAlign = TextAlign.Center)
            )
        }

        aligned(Alignment.BottomRight) {
            Padding(padding = EdgeInsets(0.dp, 12.dp, 12.dp, 12.dp)) {
                FloatingActionButton(
                    text = "+",
                    color = rallyBlue
                )
            }
        }
        positioned(null, 20.dp, null, 20.dp) {
            ColoredRect(
                width = 50.dp,
                height = 50.dp,
                color = rallyBlue
            )
        }
        aligned(Alignment.Center) {
            Text(
                text = "This text is drawed last ",
                style = +themeTextStyle { h4 },
                paragraphStyle = androidx.ui.text.ParagraphStyle(textAlign = TextAlign.Center)
            )
        }

    }
}