package com.ticketmaster.mvvmcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ticketmaster.mvvmcompose.R

val WorkSansFamily = FontFamily(
    Font(R.font.worksans_regular, FontWeight.W400, FontStyle.Normal),
    Font(R.font.worksans_medium, FontWeight.W500, FontStyle.Normal),
    Font(R.font.worksans_bold, FontWeight.W700, FontStyle.Normal),
    Font(R.font.worksans_semibold, FontWeight.W600, FontStyle.Normal)
)

val WorkSansTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = WorkSansFamily,
        fontWeight = FontWeight.W700,
    ),
    titleMedium = TextStyle(
        fontFamily = WorkSansFamily,
        fontWeight = FontWeight.W600,
    ),
    bodyMedium = TextStyle(
        fontFamily = WorkSansFamily,
        fontWeight = FontWeight.W500,
    ),
    bodySmall = TextStyle(
        fontFamily = WorkSansFamily,
        fontWeight = FontWeight.W400
    ),
)