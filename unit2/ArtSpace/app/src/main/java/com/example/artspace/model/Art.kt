package com.example.artspace.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Art(
    @DrawableRes
    val drawableResourceId: Int,
    @StringRes
    val stringResourceTitleId: Int,
    @StringRes
    val stringResourceArtistId: Int
)