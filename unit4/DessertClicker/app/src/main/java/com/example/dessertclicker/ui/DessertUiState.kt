package com.example.dessertclicker.ui

import androidx.annotation.DrawableRes

data class DessertUiState(
    val revenue: Int = 0,
    val dessertSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int = 0,

    @param:DrawableRes
    @get:DrawableRes
    val currentDessertImageId: Int = 0
)
