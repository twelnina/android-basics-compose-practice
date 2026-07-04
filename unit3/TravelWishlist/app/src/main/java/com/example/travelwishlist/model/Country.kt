package com.example.travelwishlist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Country(
    @param:StringRes
    @get:StringRes
    val region: Int,

    @param:StringRes
    @get:StringRes
    val countryName: Int,

    @param:StringRes
    @get:StringRes
    val countryDescription: Int,

    @param:DrawableRes
    @get:DrawableRes
    val imageResourceId: Int
)