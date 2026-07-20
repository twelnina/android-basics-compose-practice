# Lunch Tray

Lunch Tray is a multi-screen food ordering app built as a practice project for Android Basics with Compose.

Build your own lunch tray by choosing an entree, a side dish, and an accompaniment. The app dynamically tracks your selections, calculates the subtotal, taxes (8%), and final total, then displays an order summary at checkout. This project focuses on navigating between custom menus, managing a multi-step ordering state, and practicing core Jetpack Compose architecture patterns.

## What I Practiced

- Implementing multi-screen navigation using Jetpack Navigation Compose
- Managing order selections and dynamic cost calculations with `ViewModel` and `StateFlow`
- Sharing state between sequential screens (Entree, Side, Accompaniment, Checkout)
- Structuring menu data and dynamically rendering it across different selection screens
- Handling cancel actions and popping the backstack to safely restart the order flow

## Features

- Start a new order from a dedicated landing screen
- Browse and select from three distinct menu categories:
  - **Entrees:** Cauliflower, Three Bean Chili, Mushroom Pasta, or Spicy Black Bean Skillet
  - **Side Dishes:** Summer Salad, Butternut Squash Soup, Spicy Potatoes, or Coconut Rice
  - **Accompaniments:** Lunch Roll, Mixed Berries, or Pickled Veggies
- Dynamic pricing logic that calculates:
  - Subtotal (sum of items)
  - Tax (8% of subtotal)
  - Total (subtotal + tax)
- Review selections and price breakdown on the checkout summary screen
- Navigate backward to edit selections, or cancel at any point to reset and start over

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- AndroidX Lifecycle / ViewModel
- Kotlin Coroutines / StateFlow
- Gradle Kotlin DSL

## Reference

This project is based on learning material from Google's Android Basics with Compose course.
