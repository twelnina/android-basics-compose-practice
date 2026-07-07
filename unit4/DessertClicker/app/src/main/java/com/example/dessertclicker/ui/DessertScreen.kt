package com.example.dessertclicker.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun DessertClickerScreen(
    dessertViewModel: DessertViewModel
) {
    val dessertUiState by dessertViewModel.uiState.collectAsState()
}