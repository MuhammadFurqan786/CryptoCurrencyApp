# CryptoCurrencyApp

A modern Android application that displays cryptocurrency information using **Jetpack Compose** and **Clean Architecture**.

## Features
- List of cryptocurrencies with real-time data
- Detailed coin information
- Clean Architecture with Use Cases
- Dependency Injection
- Jetpack Compose UI

## Tech Stack
- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Architecture:** Clean Architecture + MVVM + Use Cases
- **Dependency Injection:** (Hilt / Koin – mention what you used)
- **Networking:** Retrofit + OkHttp
- **Async:** Coroutines + Flow

## Architecture Overview

### Layer Responsibilities

| Layer | Responsibility |
|-------|----------------|
| **Presentation** | UI (Jetpack Compose) + ViewModels. Observes state and sends user events. |
| **Domain** | Business logic (Use Cases) and repository contracts. Framework-independent. |
| **Data** | Implements repositories. Handles API calls and local database. |


**Data Flow:**
`UI → ViewModel → UseCase → Repository → API / Database`
