package com.example.dessertclicker.ui

import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert

data class DessertUiState(
    val revenue: Int = 0,
    val dessertSold: Int = 0,
    val dessertToShow: Dessert = Datasource.dessertList[0],
)
