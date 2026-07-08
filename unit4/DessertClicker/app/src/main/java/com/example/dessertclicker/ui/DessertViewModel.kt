package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DessertViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DessertUiState())
    val uiState = _uiState.asStateFlow()

    fun onDessertClicked() {
        _uiState.update { currentState ->
            val newDessertSold = currentState.dessertSold + 1

            currentState.copy(
                dessertSold = newDessertSold,

                dessertToShow = determineDessertToShow(
                    desserts = Datasource.dessertList, dessertsSold = newDessertSold
                ), revenue = currentState.revenue + currentState.dessertToShow.price
            )
        }
    }

    private fun determineDessertToShow(
        desserts: List<Dessert>, dessertsSold: Int
    ): Dessert {
        var dessertsToShow = desserts.first()
        for (dessert in desserts) {
            if (dessertsSold >= dessert.startProductionAmount) {
                dessertsToShow = dessert
            } else {
                break
            }
        }

        return dessertsToShow
    }
}