package com.example.superheroesapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroesapp.R

// Set of Material typography styles to start with
//val Typography = Typography(
//    body1 = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp
//    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
//)

val Roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_black, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
   // defaultFontFamily = Roboto,
    h1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = Roboto ,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),

    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
