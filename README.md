# KoinInjectDemo

A minimalist Kotlin Multiplatform (KMP) demo showcasing how to use **Koin Annotations** for dependency injection in a Compose Multiplatform project.

> ⚙️ Part of the [KMP Bits](https://github.com/kmpbits) series — hands-on examples for real-world KMP development.

---

## ✨ Features

- **Koin Annotations**: Use `@Single`, `@Factory`, and `@KoinViewModel` for concise and type-safe dependency declarations.
- **Compose Multiplatform UI**: Shared UI code across Android and iOS platforms.
- **Platform-specific Implementations**: Use `expect/actual` for platform-specific logic, such as logging.
- **Gradle & KSP Configuration**: Set up KSP for code generation and include generated sources in your build.
- **ViewModel Integration**: Manage state with `StateFlow` and handle asynchronous operations using `viewModelScope`.

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio**: Giraffe or newer.
- **Kotlin**: 1.9 or newer.
- **KSP Plugin**: Ensure KSP is applied and configured correctly.

### Running the App

1. **Clone the repository**:

    ```bash
    git clone https://github.com/kmpbits/KoinInjectDemo.git
    cd KoinInjectDemo
    ```

2. **Open in Android Studio**  
   Open the project in Android Studio and let it sync.

3. **Run on Android**  
   Select the `androidApp` configuration and click **Run**.

4. **Run on iOS**  
   Open the `iosApp` module in Xcode, choose a simulator or device, and click **Run**.

---

## 🧩 Project Structure

```
KoinInjectDemo/
├── androidApp/         # Android-specific code
├── iosApp/             # iOS-specific code
├── composeApp/         # Shared KMP logic and Compose UI
├── build.gradle.kts    # Root build file
├── settings.gradle.kts # Gradle project settings
└── README.md
```

---

## 💡 Concepts Covered

- Using `@ComponentScan` and manually declared modules
- ViewModels in shared code with `@KoinViewModel`
- Gradle configuration for KSP and metadata generation
- Platform logging with `expect/actual`
- Dependency testing using fake implementations

---

## 📚 Learn More

- 📖 [Using Koin Annotations in KMP](https://your-article-link.com)
- 🧰 [Koin Official Documentation](https://insert-koin.io/docs)
- 🧪 [Koin Testing Guide](https://insert-koin.io/docs/reference/koin-test/)
- 💡 [KMP Bits Repository](https://github.com/kmpbits)

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
