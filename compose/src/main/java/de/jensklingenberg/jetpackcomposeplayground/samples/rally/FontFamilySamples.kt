/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.jensklingenberg.jetpackcomposeplayground.samples.rally


import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.text.TextStyle
import androidx.ui.text.font.Font
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontSynthesis
import androidx.ui.text.font.FontWeight




@Composable
fun FontFamilySansSerifSample() {
    Text(
        text = "Demo Text sans-serif",
        style = TextStyle(fontFamily = FontFamily.SansSerif)
    )
}


@Composable
fun FontFamilySerifSample() {
    Text(
        text = "Demo Text serif",
        style = TextStyle(fontFamily = FontFamily.Serif)
    )
}


@Composable
fun FontFamilyMonospaceSample() {
    Text(
        text = "Demo Text monospace",
        style = TextStyle(fontFamily = FontFamily.Monospace)
    )
}


@Composable
fun FontFamilyCursiveSample() {
    Text(
        text = "Demo Text cursive",
        style = TextStyle(fontFamily = FontFamily.Cursive)
    )
}


@Composable
fun CustomFontFamilySample() {
    val fontFamily = FontFamily(
        Font(name = "my_font_400_regular.ttf", weight = FontWeight.W400, style = FontStyle.Normal),
        Font(name = "my_font_400_italic.ttf", weight = FontWeight.W400, style = FontStyle.Italic)
    )
    Text(text = "Demo Text", style = TextStyle(fontFamily = fontFamily))
}


@Composable
fun FontFamilySynthesisSample() {
    // The font family contains a single font, with normal weight
    val fontFamily = FontFamily(
        Font(name = "myfont.ttf", weight = FontWeight.Normal)
    )
    // Configuring the Text composable to be bold
    // Using FontSynthesis.Weight to have the system render the font bold my making the glyphs
    // thicker
    Text(
        text = "Demo Text",
        style = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontSynthesis = FontSynthesis.Weight
        )
    )
}