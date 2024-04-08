package com.example.cs492.data.android_setting
enum class AppSettingType(private val role: String) {
    SCREEN_LOCK("Screen Lock"),
    PRIVACY("Privacy"),
    FIND_MY_DEVICE("Find My Device"),
    GOOGLE_PLAY_PROTECT("Google Play Protect"),
    ROOT_DETECTION("Root Detection"),
    SOFTWARE_UPDATES("Software Updates"),
    DEVICE_ENCRYPTION("Encryption & Credentials");
    override fun toString(): String {
        return role
    }
}
