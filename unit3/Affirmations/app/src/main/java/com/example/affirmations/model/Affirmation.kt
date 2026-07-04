package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @param:StringRes
    @get:StringRes
    val stringResourceId: Int,

    @param:DrawableRes
    @get:DrawableRes
    val imageResourceId: Int
)
