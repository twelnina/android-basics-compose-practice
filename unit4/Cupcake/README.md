# Cupcake

Cupcake is a multi-screen ordering app built as a practice project for Android Basics with Compose.

Choose a quantity, flavor, and pickup date, then review the calculated price and share the completed order with another app. This project focuses on navigation between Compose screens, shared UI state, and testing an end-to-end ordering flow.

## Demo

https://github.com/user-attachments/assets/f7c0e7be-4f49-49c5-91e9-7eb0159e5743

## What I Practiced

- Building a multi-screen flow with Navigation Compose
- Managing order data with `ViewModel` and `StateFlow`
- Sharing state between composables while keeping screens reusable
- Updating prices from user selections, including a same-day pickup surcharge
- Sending order details to another app with an implicit `Intent`
- Testing screen content and navigation with Compose UI tests

## Features

- Select the number of cupcakes to order
- Choose a flavor and pickup date
- Display a running subtotal throughout the order flow
- Review all selections on an order summary screen
- Navigate back or cancel to restart the order
- Share the completed order through Android's share sheet

## Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- AndroidX Lifecycle / ViewModel
- Kotlin Coroutines / StateFlow
- Compose UI Testing
- Gradle Kotlin DSL

## Reference

This project is based on learning material from Google's Android Basics with Compose course.
