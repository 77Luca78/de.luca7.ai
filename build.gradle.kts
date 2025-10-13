kotlin
android {
    defaultConfig {
        versionName = System.getenv("GITHUBREFNAME") ?: "1.0.0"
        versionCode = (System.getenv("GITHUBRUNNUMBER") ?: "1").toInt()
    }
}