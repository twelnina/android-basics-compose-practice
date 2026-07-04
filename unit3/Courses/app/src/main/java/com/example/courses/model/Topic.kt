package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @param:StringRes
    @get:StringRes
    val stringResourceId: Int,

    val participantCount: Int,

    @param:DrawableRes
    @get:DrawableRes
    val drawableResourceId: Int
)