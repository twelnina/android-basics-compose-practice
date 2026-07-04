package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Hero (
    @param:StringRes
    @get:StringRes
    val nameRes: Int,

    @param:StringRes
    @get:StringRes
    val descriptionRes: Int,

    @param:DrawableRes
    @get:DrawableRes
    val imageRes: Int
)