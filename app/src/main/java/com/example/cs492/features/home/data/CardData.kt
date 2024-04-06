package com.example.cs492.features.home.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.CardMembership
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.ControlCamera
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.DeviceUnknown
import androidx.compose.material.icons.filled.Devices
import androidx.compose.material.icons.filled.DocumentScanner
import androidx.compose.material.icons.filled.EnhancedEncryption
import androidx.compose.material.icons.filled.Handyman
import androidx.compose.material.icons.filled.InstallMobile
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MonetizationOn
import androidx.compose.material.icons.filled.NetworkCell
import androidx.compose.material.icons.filled.NetworkCheck
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PhonelinkSetup
import androidx.compose.material.icons.filled.Power
import androidx.compose.material.icons.filled.PrivacyTip
import androidx.compose.material.icons.filled.QuestionAnswer
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.RunCircle
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material.icons.filled.SystemSecurityUpdate
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VoiceChat
import androidx.compose.material.icons.filled.Wifi
import com.example.cs492.components.ExpandableHeaderCardData
import com.example.cs492.components.LinkButton
import com.example.cs492.util.ImageType

val HomePageCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Why is phone privacy important?",
        icon = ImageType.Vector(Icons.Filled.PrivacyTip),
        iconContentDescription = "privacy tip icon",
        descriptionText = """
            
            Firstly, smartphones store an immense amount of personal data, from conversations and photos to passwords and personal information. 
            
            Losing access to this information due to theft or loss of the phone poses significant risks, including identity theft, financial loss, and privacy breaches. 
            
            Public Wi-Fi networks, often used without a second thought, are hotbeds for data interception by malicious actors, making data privacy on phones a critical concern.
            
            While you can't control which WIFI you have access to you do have the ability to learn about different spheres of security to protect yourself
            
            American internet users revealed that 81% of respondents believed they had no control over data collected by private companies, we want to bring this number down.
            
            To read the full study on american privacy controls, click the button below
        """.trimIndent(),
        linkData =
        LinkButton(
            link = "https://www.pewresearch.org/internet/2019/11/15/americans-and-privacy-concerned-confused-and-feeling-lack-of-control-over-their-personal-information/",
            buttonText = "Read the PEW Research Article"
        )
    ),
    ExpandableHeaderCardData(
        headerText = "What can this app teach me?",
        icon = ImageType.Vector(Icons.Filled.QuestionMark),
        iconContentDescription = "question mark icon",
        descriptionText = """
            
            This app will go over many aspects of security and privacy, all related to the android device you're using to read this information.
            
            The topics it will cover include: 
            
            1) App permissions and the dangers behind them
            2) Navigating Security on your Android Phone
            3) Security Blogs on flaws within Android Apps
            4) Breakdown of app marketplaces 
            
            This is a quick overview but each section of our app goes into in-depth research on each of these topics.
            
            To view any of these topics use the side navigation panel at the top left of the app
        """.trimIndent(),
    ),
    ExpandableHeaderCardData(
        headerText = "Android security tips for beginners?",
        icon = ImageType.Vector(Icons.Filled.Book),
        iconContentDescription = "book icon",
        descriptionText = """
            
            There are many resources to learn, but a quick overview on tips to follow:
            
            1. Avoid Installing Apps from Unknown Sources - unless you thoroughly researched the marketplace.
            
            2. Scrutinize App Permissions - always figure out which permissions each app requires and which ones they simply want
            
            3. Update Your Android version regularly - SEV (Security vulnerabilities) will always exist, but so will patches 
            
            4. Use Secure Connections - Avoid public Wi-Fi networks when possible, as they can be insecure
            
            5. Device Locking Mechanisms: Utilize a strong lock screen password or biometric lock to prevent unauthorized access
            
            6. Data Encryption: Enable data encryption on your device to protect your personal information 
            
            7. Manage Notifications: Disable notifications on the lock screen for apps that display sensitive information
            
            8. Implement Two-Factor Authentication: Use two-factor authentication for Google and other apps that offer it
            
            These tips were sourced from NY Times - to read a full breakdown and learn more click the link below
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://www.nytimes.com/wirecutter/guides/privacy-tips-for-android-phone/",
            buttonText = "Click here for the NY Times"
        )
    ),
    ExpandableHeaderCardData(
        headerText = "How can I support this project?",
        icon = ImageType.Vector(Icons.Filled.MonetizationOn),
        iconContentDescription = "book icon",
        descriptionText = """
            
            This project is starting out as an altruistic endeavor.
            
            Please share this app with anyone you believe could benefit from it, especially the elderly.
            
            If you want to donate, you can buy a coffee for the developers using the link below
            
            But ultimately the best thing you can do is share this content with others that need it :)
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://www.buymeacoffee.com/tldralgos",
            buttonText = "Buy me a coffee"
        )
    ),
)

val PermissionTypeCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Understanding Install-time Permissions",
        icon = ImageType.Vector(Icons.Filled.InstallMobile),
        iconContentDescription = "security icon",
        descriptionText = """
            
            Install-time permissions are granted automatically when you install an app, providing it with limited access to perform certain actions or access specific types of data. 
            
            These permissions cover actions that have minimal impact on the system and other apps, enhancing user convenience by eliminating the need for manual approval. 
            
            Examples include internet access or vibration control. While these permissions pose little risk to user privacy or app operation, it's crucial to review them during installation to understand what your app can do.
            
            For a detailed list of install-time permissions and their implications, consult the Android permissions documentation.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission",
            buttonText = "Android Permissions Documentation"
        )
    ),
    ExpandableHeaderCardData(
        headerText = "Navigating Runtime Permissions",
        icon = ImageType.Vector(Icons.AutoMirrored.Filled.DirectionsRun),
        iconContentDescription = "permissions icon",
        descriptionText = """
            
            Runtime permissions, also known as dangerous permissions, require your approval to access more sensitive data or perform certain actions. 
            
            This system ensures you have control over what information your apps can access, from your location to your contacts.
            
            Whenever an app requests a runtime permission, a prompt will appear explaining what the app wants to access and why. 
            
            It's essential to consider the necessity of granting these permissions based on the app's functionality and your privacy preferences.
            
            Learn how to manage and understand the impact of runtime permissions on your Android device.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/guide/topics/permissions/overview#runtime",
            buttonText = "Manage runtime permissions"
        )
    ),
    ExpandableHeaderCardData(
        headerText = "Special Permissions and System Overrides",
        icon = ImageType.Vector(Icons.Filled.Build),
        iconContentDescription = "build icon",
        descriptionText = """
            
            Special permissions grant apps the capability to perform operations that can significantly affect your device's system, such as overlaying other apps or modifying system settings.
            
            Due to their impact, these permissions are not only safeguarded by the Android system but often require navigating to specific settings menus to enable them manually.
            
            Understanding and managing these permissions is crucial for maintaining your device's security and ensuring that apps do not overstep their boundaries.
            
            For more information on special permissions and how to control them, visit the Android special app access settings guide.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/guide/topics/permissions/overview#special",
            buttonText = "Special app access settings"
        )
    ),

    // Other existing entries...
)

val NormalPermissionCardData: List<ExpandableHeaderCardData> = listOf(
    // Internet Access
    ExpandableHeaderCardData(
        headerText = "Internet permission",
        icon = ImageType.Vector(Icons.Filled.Wifi),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            
            android.permission.INTERNET
            
            Classified as a normal level permission in Android's security model, allows apps to access the internet for sending and receiving data. 
            While essential for a vast array of legitimate functionalities, this permission also opens the door to potential misuses. 
            Malicious apps could exploit it to transmit sensitive user data without consent, display intrusive advertisements, or engage in unauthorized actions such as background resource consumption. 
            Despite its necessity, the misuse of internet access underscores the importance of cautious app installation practices, emphasizing the need for users to stick to reputable sources and for developers to adhere to best practices in app security and data privacy.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#INTERNET",
            buttonText = "Read documentation"
        )
    ),
    // Network State
    ExpandableHeaderCardData(
        headerText = "Access Network State permission",
        icon = ImageType.Vector(Icons.Filled.NetworkCheck),
        iconContentDescription = "Network state icon",
        descriptionText = """
            
            android.permission.ACCESS_NETWORK_STATE
            
            Categorized under the normal permission level in Android, enables apps to access information about the network state, such as whether an internet connection is available and the type of connection (Wi-Fi, cellular). 
            This permission is crucial for apps that need to adjust their behavior based on connectivity status, ensuring efficient data usage and a smoother user experience. 
            However, it could potentially be misused by applications to monitor a user's network activities and preferences without their knowledge. For instance, an app could track when a user connects to Wi-Fi or switches to cellular data, gathering data that could be used to infer patterns in the user's daily routine or locations. 
            This underscores the importance of downloading apps from trusted developers and being mindful of the permissions an app requests.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#ACCESS_NETWORK_STATE",
            buttonText = "Read documentation"
        )
    ),
    // Wi-Fi State
    ExpandableHeaderCardData(
        headerText = "Access Wifi State Permission",
        icon = ImageType.Vector(Icons.Filled.NetworkCell),
        iconContentDescription = "Wi-Fi state icon",
        descriptionText = """
            
            android.permission.ACCESS_WIFI_STATE
            
            Allows applications to access information about Wi-Fi networks, such as whether Wi-Fi is enabled and details about the connected Wi-Fi network. 
            This permission is essential for apps that require managing Wi-Fi connections, optimizing data usage, or providing functionality based on Wi-Fi connectivity. 
            However, it also presents a potential for misuse, such as enabling apps to track a user's movement across different Wi-Fi networks, which could be used for creating a profile of the user's habits and locations. 
            Moreover, malicious apps could exploit this information to infer when a device, and possibly its user, is in a vulnerable state for attacks. As always, the risks highlight the importance of staying vigilant about the permissions an app requests.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#ACCESS_NETWORK_STATE",
            buttonText = "Read documentation"
        )
    ),
    // Set Alarm
    ExpandableHeaderCardData(
        headerText = "Set Alarm Permission",
        icon = ImageType.Vector(Icons.Filled.Alarm),
        iconContentDescription = "Set alarm icon",
        descriptionText = """
            
            android.permission.SET_ALARM
            
            Classified under Android's normal permission category, enables applications to set alarms or reminders on a user's device. 
            This functionality is particularly useful for calendar, to-do list, or alarm clock applications, enhancing user experience by allowing these apps to schedule notifications or alerts according to the user's preferences and needs. 
            While seemingly benign, in theory, this permission could be misused by applications to set unwanted alarms, potentially disrupting a user's routine by triggering unexpected or intrusive notifications. 
            Such misuse, though less likely to compromise privacy or security directly, underscores the necessity of downloading apps from trusted sources and paying close attention to the permissions apps require.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#SET_ALARM",
            buttonText = "Read documentation"
        )
    ),
    // Wake Lock
    ExpandableHeaderCardData(
        headerText = "Wake Lock Permission",
        icon = ImageType.Vector(Icons.Filled.Lock),
        iconContentDescription = "Wake lock icon",
        descriptionText = """
            
            android.permission.WAKE_LOCK
            
            Crucial for applications that need to keep the device awake for certain operations, like playing music or running a long task in the background. 
            This permission prevents the device from entering sleep mode, ensuring that apps can continue their activities without interruption. 
            However, if misused, this permission can lead to significant battery drain by preventing the device from sleeping when it's not actively used. 
            Applications could exploit this to run processes in the background longer than necessary, diminishing the device's overall battery life. 
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#WAKE_LOCK",
            buttonText = "Read documentation"
        )
    ),
    // Receive Boot Completed
    ExpandableHeaderCardData(
        headerText = "Receive Boot Completed Permission",
        icon = ImageType.Vector(Icons.Filled.Power),
        iconContentDescription = "Boot completed icon",
        descriptionText = """
            
            android.permission.RECEIVE_BOOT_COMPLETED
            
            Allows applications to receive a notification when the device finishes booting up. 
            This permission is often used by apps that need to perform tasks or initialize services upon device startup, such as alarm clock apps or apps that provide system utilities. 
            While generally innocuous, misuse of this permission could involve apps initiating unnecessary processes or services upon booting up, potentially slowing down the device's startup time or consuming excessive system resources. 
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#RECEIVE_BOOT_COMPLETED",
            buttonText = "Read documentation"
        )
    ),
    // Bluetooth
    ExpandableHeaderCardData(
        headerText = "Bluetooth Permission",
        icon = ImageType.Vector(Icons.Filled.Bluetooth),
        iconContentDescription = "Bluetooth icon",
        descriptionText = """
            
            android.permission.BLUETOOTH
            
            Allows applications to communicate with Bluetooth-enabled devices, facilitating functionalities such as pairing, connecting, and transferring data wirelessly. 
            This permission is essential for various types of apps, including those for wireless peripherals, health trackers, and IoT devices. 
            However, misuse of this permission could involve apps accessing Bluetooth functionalities for unauthorized purposes, such as tracking users' locations via Bluetooth beacons or attempting to connect to nearby devices without user consent. W
            While the risks are relatively low compared to more sensitive permissions, users should still exercise caution when granting this permission, ensuring that apps have a legitimate need for Bluetooth access. 
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#BLUETOOTH",
            buttonText = "Read documentation"
        )
    ),
    // Foreground Service
    ExpandableHeaderCardData(
        headerText = "Forground Service Permission",
        icon = ImageType.Vector(Icons.Filled.RunCircle),
        iconContentDescription = "Foreground service icon",
        descriptionText = """
            
            android.permission.FOREGROUND_SERVICE
            
            Allows applications to run foreground services, which are essential for tasks that require ongoing processing even when the app is not in the foreground. 
            This permission is commonly used by apps that provide features like music playback, navigation, or ongoing notifications. 
            However, misuse of this permission could involve apps running foreground services unnecessarily, consuming device resources and potentially draining battery life. A
            Additionally, malicious apps could abuse this permission to disguise background processes, potentially compromising user privacy or security. 
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#FOREGROUND_SERVICE",
            buttonText = "Read documentation"
        )
    ),
)

val DangerousPermissionCardData: List<ExpandableHeaderCardData> = listOf(
    // Camera
    ExpandableHeaderCardData(
        headerText = "Camera Permission",
        icon = ImageType.Vector(Icons.Filled.Camera),
        iconContentDescription = "Camera icon",
        descriptionText = """
            
            android.permission.CAMERA
            
            Allows applications to access the device's camera for capturing photos or recording videos. 
            This permission is essential for camera apps, augmented reality applications, and various other functionalities requiring camera access. 
            However, misuse of this permission could involve apps accessing the camera without user consent, potentially compromising user privacy by capturing images or videos without authorization. 
            Users should exercise caution when granting this permission, ensuring that apps requesting camera access have a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#CAMERA",
            buttonText = "Read documentation"
        )
    ),
    // Access Fine Location
    ExpandableHeaderCardData(
        headerText = "Access Fine Location Permission",
        icon = ImageType.Vector(Icons.Filled.LocationOn),
        iconContentDescription = "Location icon",
        descriptionText = """
            
            android.permission.ACCESS_FINE_LOCATION
            
            Allows applications to access precise location information from the Global Positioning System (GPS) or network sources. 
            This permission is essential for location-based services such as navigation, mapping, and location-aware applications. 
            However, misuse of this permission could involve apps tracking users' movements without their consent, potentially compromising their privacy or exposing them to surveillance. 
            Users should carefully consider granting this permission and review the purposes for which apps request access to their location information.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#ACCESS_FINE_LOCATION",
            buttonText = "Read documentation"
        )
    ),
    // Read/Write External Storage
    ExpandableHeaderCardData(
        headerText = "Read/Write External Storage Permission",
        icon = ImageType.Vector(Icons.Filled.Storage),
        iconContentDescription = "Storage icon",
        descriptionText = """
            
            android.permission.READ_EXTERNAL_STORAGE 
            android.permission.WRITE_EXTERNAL_STORAGE
            
            Allows applications to read from and write to external storage, such as the device's SD card. 
            This permission is essential for apps that need to access files stored externally, such as file managers, media players, and document editors. 
            However, misuse of this permission could involve apps accessing sensitive user data stored on external storage without authorization, potentially leading to data breaches or unauthorized access to personal information. 
            Only grant external storage access only to trusted applications with a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#READ_EXTERNAL_STORAGE",
            buttonText = "Read documentation"
        )
    ),
    // Record Audio
    ExpandableHeaderCardData(
        headerText = "Record Audio Permission",
        icon = ImageType.Vector(Icons.Filled.Mic),
        iconContentDescription = "Microphone icon",
        descriptionText = """
            
            android.permission.RECORD_AUDIO
            
            Allows applications to record audio using the device's microphone. 
            This permission is essential for voice recording apps, communication apps supporting voice calls, and various other functionalities requiring audio recording. 
            However, misuse of this permission could involve apps recording audio without user consent, potentially compromising user privacy by eavesdropping on conversations or capturing sensitive information. 
            Ensure apps requesting microphone access have a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#RECORD_AUDIO",
            buttonText = "Read documentation"
        )
    ),
    // Read/Write Contacts
    ExpandableHeaderCardData(
        headerText = "Read/Write Contacts Permission",
        icon = ImageType.Vector(Icons.Filled.ContactPhone),
        iconContentDescription = "Contacts icon",
        descriptionText = """
            
            android.permission.READ_CONTACTS 
            android.permission.WRITE_CONTACTS
            
            Allows applications to read and write contact data on the device. 
            This permission is essential for apps that manage contact information, such as contact managers, dialer apps, and messaging apps. 
            However, misuse of this permission could involve apps accessing sensitive contact information without user consent, potentially leading to privacy breaches or unauthorized use of contact data. 
            Grant contact access only to trusted applications with a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#READ_CONTACTS",
            buttonText = "Read documentation"
        )
    ),
    // Send/Receive SMS
    ExpandableHeaderCardData(
        headerText = "android.permission.SEND_SMS / android.permission.RECEIVE_SMS",
        icon = ImageType.Vector(Icons.AutoMirrored.Filled.Message),
        iconContentDescription = "SMS icon",
        descriptionText = """
            
            android.permission.SEND_SMS
            android.permission.RECEIVE_SMS
            
            Allows applications to send and receive SMS (Short Message Service) messages. 
            This permission is essential for messaging apps, SMS backup apps, and various other functionalities requiring SMS communication. 
            However, misuse of this permission could involve apps sending or receiving SMS messages without user consent, potentially leading to unauthorized charges, spam, or phishing attacks. 
            Ensure  apps requesting SMS access have a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#SEND_SMS",
            buttonText = "Read documentation"
        )
    ),
    // Call Phone
    ExpandableHeaderCardData(
        headerText = "android.permission.CALL_PHONE",
        icon = ImageType.Vector(Icons.Filled.Phone),
        iconContentDescription = "Phone icon",
        descriptionText = """
            
            android.permission.CALL_PHONE
            
            Allows applications to initiate a phone call without going through the Dialer user interface for the user to confirm the call. 
            This permission is essential for apps that provide calling functionality, such as dialer apps, voice over IP (VoIP) apps, and communication apps. 
            However, misuse of this permission could involve apps initiating phone calls without user consent, potentially leading to unauthorized charges or nuisance calls. 
            Ensure that apps requesting call access have a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#CALL_PHONE",
            buttonText = "Read documentation"
        )
    ),
    // Read Calendar
    ExpandableHeaderCardData(
        headerText = "android.permission.READ_CALENDAR",
        icon = ImageType.Vector(Icons.Filled.CalendarToday),
        iconContentDescription = "Calendar icon",
        descriptionText = """
            
            android.permission.READ_CALENDAR
           
            Allows applications to read calendar events on the device. 
            This permission is essential for apps that need access to calendar data, such as calendar apps, reminder apps, and scheduling apps. 
            However, misuse of this permission could involve apps accessing sensitive calendar information without user consent, potentially leading to privacy breaches or unauthorized use of calendar data. 
            Grant calendar access only to trusted applications with a legitimate need for it.
        """.trimIndent(),
        linkData = LinkButton(
                link="https://developer.android.com/reference/android/Manifest.permission#READ_CALENDAR",
                buttonText = "Read documentation"
            )
    )
)

val SignaturePermissionCardData: List<ExpandableHeaderCardData> = listOf(
    // SYSTEM_ALERT_WINDOW
    ExpandableHeaderCardData(
        headerText = "android.permission.SYSTEM_ALERT_WINDOW",
        icon = ImageType.Vector(Icons.Filled.AddAlert),
        iconContentDescription = "Alert window icon",
        descriptionText = """
            
            android.permission.SYSTEM_ALERT_WINDOW
            
            This permission allows apps to draw overlay windows on top of other apps. 
            It's typically used for features like chat heads, screen filters, or floating widgets. 
            However, due to its potential for abuse in creating intrusive or malicious overlays, Google has restricted this permission to apps signed with the system's certificate.
            A recent update in Android 11 shows the newly updated permission requirements - that go into in-depth analysis of how apps can request them.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/about/versions/11/privacy/permissions#system-alert",
            buttonText = "Read documentation"
        )
    ),
    // WRITE_SETTINGS
    ExpandableHeaderCardData(
        headerText = "android.permission.WRITE_SETTINGS",
        icon = ImageType.Vector(Icons.Filled.Settings),
        iconContentDescription = "Write settings icon",
        descriptionText = """
            
            android.permission.WRITE_SETTINGS
            
            This permission allows apps to modify system settings, such as changing the system's wallpaper or altering network preferences. 
            It's a powerful permission that can significantly affect the device's behavior.
            It's restricted to apps signed with the system's certificate, ensuring only trusted system apps can make such changes.
            
            Although restricted it can be overcome via the ADB (android debuging bridge) which is why it's crucial to only download apps from trusted sources
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#WRITE_SETTINGS",
            buttonText = "Read documentation"
        )
    ),
    // PACKAGE_USAGE_STATS
    ExpandableHeaderCardData(
        headerText = "android.permission.PACKAGE_USAGE_STATS",
        icon = ImageType.Vector(Icons.Filled.Assessment),
        iconContentDescription = "Package usage stats icon",
        descriptionText = """
            
            android.permission.PACKAGE_USAGE_STATS
            
            This permission allows apps to retrieve information about the user's usage of the device and apps. 
            It's often used by device management or analytics apps to provide insights into app usage patterns. 
            However, because it can potentially expose sensitive information about the user's behavior, it's restricted to apps signed with the system's certificate.
            
            Apps can get this permission, however users will have to navigate to setting pages on their own to enable it.
            To read more about this process and the UsageStatsManager that handles it, click the link below
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/app/usage/UsageStatsManager",
            buttonText = "Read documentation"
        )
    ),
    // READ_VOICEMAIL
    ExpandableHeaderCardData(
        headerText = "android.permission.READ_VOICEMAIL",
        icon = ImageType.Vector(Icons.Filled.VoiceChat),
        iconContentDescription = "Read voicemail icon",
        descriptionText = """
            
            android.permission.READ_VOICEMAIL
            
            This permission allows apps to read voicemail content stored on the device. 
            It's typically used by voicemail management apps to provide features like transcribing voicemail messages or integrating them with other communication services. 
            Due to the sensitive nature of voicemail content, this permission is restricted to apps signed with the system's certificate.
        """.trimIndent(),
        linkData = LinkButton(
            link = "https://developer.android.com/reference/android/Manifest.permission#READ_VOICEMAIL",
            buttonText = "Read documentation"
        )
    )
)



val ScreenLockCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Screen Lock Security",
        icon = ImageType.Vector(Icons.Filled.Security),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            Choose from various methods such as pattern, PIN, password, fingerprint, or face recognition to prevent unauthorized access. 
            Set up your screen lock by navigating to Settings > Security > Screen lock on your phone.
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Screen Lock Notifications",
        icon = ImageType.Vector(Icons.Filled.Notifications),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            ScreenLockCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Screen Lock Types",
        icon = ImageType.Vector(Icons.Filled.Category),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            ScreenLockCardData
        """.trimIndent()
    )
)

val PrivacyCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Permissions Manager",
        icon = ImageType.Vector(Icons.Filled.ManageAccounts),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            PermissionsManagerCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Privacy Dashboard",
        icon = ImageType.Vector(Icons.Filled.Dashboard),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            PermissionsManagerCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Controls",
        icon = ImageType.Vector(Icons.Filled.ControlCamera),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            PermissionsManagerCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Special App Access Settings",
        icon = ImageType.Vector(Icons.Filled.AdminPanelSettings),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            PermissionsManagerCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Ads Data Management",
        icon = ImageType.Vector(Icons.Filled.Handyman),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            PermissionsManagerCardData
        """.trimIndent()
    )
)

val FindMyDeviceCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Google Account",
        icon = ImageType.Vector(Icons.Filled.AccountCircle),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            FindMyDeviceCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Location",
        icon = ImageType.Vector(Icons.Filled.LocationOn),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            FindMyDeviceCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Device Finders",
        icon = ImageType.Vector(Icons.Filled.Map),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            FindMyDeviceCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Google Play Visibility",
        icon = ImageType.Vector(Icons.Filled.Visibility),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            FindMyDeviceCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Backup Codes",
        icon = ImageType.Vector(Icons.Filled.Code),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            FindMyDeviceCardData
        """.trimIndent()
    )

)

val GooglePlayProtectCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Device Certification",
        icon = ImageType.Vector(Icons.Filled.Devices),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            GooglePlayProtectCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Play Protect Scan",
        icon = ImageType.Vector(Icons.Filled.DocumentScanner),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            GooglePlayProtectCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Reporting Unknown Apps",
        icon = ImageType.Vector(Icons.Filled.Report),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            GooglePlayProtectCardData
        """.trimIndent()
    ),
)

val RootDetectionCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "What is Rooted Device",
        icon = ImageType.Vector(Icons.Filled.DeviceUnknown),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            RootDetectionCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Is Your Device Rooted?",
        icon = ImageType.Vector(Icons.Filled.QuestionMark),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            RootDetectionCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Unrooting",
        icon = ImageType.Vector(Icons.Filled.QuestionAnswer),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            RootDetectionCardData
        """.trimIndent()
    )
)

val SoftwareUpdatesCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Device Android Version",
        icon = ImageType.Vector(Icons.Filled.Android),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            SoftwareUpdatesCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Check Android Updates Available",
        icon = ImageType.Vector(Icons.Filled.Update),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            SoftwareUpdatesCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Security & System Updates",
        icon = ImageType.Vector(Icons.Filled.SystemSecurityUpdate),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            SoftwareUpdatesCardData
        """.trimIndent()
    ),
)

val DeviceEncryptionCardData: List<ExpandableHeaderCardData> = listOf(
    ExpandableHeaderCardData(
        headerText = "Encrypt Phone",
        icon = ImageType.Vector(Icons.Filled.EnhancedEncryption),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            DeviceEncryptionCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Trusted Credentials",
        icon = ImageType.Vector(Icons.Filled.Verified),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            DeviceEncryptionCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "User Credentials",
        icon = ImageType.Vector(Icons.Filled.VerifiedUser),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            DeviceEncryptionCardData
        """.trimIndent()
    ),
    ExpandableHeaderCardData(
        headerText = "Certificates",
        icon = ImageType.Vector(Icons.Filled.CardMembership),
        iconContentDescription = "Internet access icon",
        descriptionText = """
            DeviceEncryptionCardData
        """.trimIndent()
    ),
)













