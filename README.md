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


## Getting Started
1. Clone the repository
2. Open in Android Studio
3. Sync Gradle and run on an emulator or device

## Screenshots
(Add 2–3 screenshots here)

## Author
**Muhammad Furqan**  
Senior Android Developer  
[GitHub](https://github.com/MuhammadFurqan786) • [LinkedIn](https://linkedin.com/in/muhammadfurqan786)
