# CodeLearn — Android (Kotlin + Jetpack Compose)

ماژول ۱: ساختار پروژه و فایل‌های پایه.

## ساختار پروژه

```
codelearn-android/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
├── .gitignore
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/gradle-wrapper.properties
└── app/
    ├── build.gradle.kts
    ├── proguard-rules.pro
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/codelearn/app/
        │   ├── MainActivity.kt
        │   ├── data/model/Language.kt
        │   └── ui/
        │       ├── CodeLearnApp.kt
        │       ├── screens/
        │       │   ├── SplashScreen.kt
        │       │   ├── LanguagePickerScreen.kt
        │       │   └── RoadmapScreen.kt
        │       └── theme/
        │           ├── Color.kt
        │           ├── Type.kt
        │           └── Theme.kt
        └── res/
            ├── values/{strings,themes,colors}.xml
            ├── drawable/ic_launcher_foreground.xml
            └── mipmap-anydpi{,-v26}/ic_launcher*.xml
```

## اجرا

### روش ۱ — Android Studio (ساده‌ترین)
1. Android Studio → **File → Open** → پوشه `codelearn-android` را انتخاب کن.
2. صبر کن Gradle Sync تمام شود (اولین بار چند دقیقه طول می‌کشد).
3. یک Emulator (API 26+) یا گوشی واقعی وصل کن.
4. دکمه **Run ▶** را بزن.

### روش ۲ — خط فرمان
```bash
cd codelearn-android
gradle wrapper --gradle-version 8.9   # اگر فایل gradlew نداری
./gradlew assembleDebug
# خروجی: app/build/outputs/apk/debug/app-debug.apk
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

## چک‌لیست تست

- [ ] Gradle Sync بدون خطا تمام می‌شود.
- [ ] اپ باز می‌شود و صفحه Splash با لوگو و متن «CodeLearn» نمایش داده می‌شود.
- [ ] بعد از ~۱.۴ ثانیه خودکار به صفحه انتخاب زبان می‌رود.
- [ ] چهار کارت زبان دیده می‌شود: Python، JavaScript، C++، HTML/CSS — هر کدام با رنگ اکسنت خودش.
- [ ] کلیک روی هر کارت → صفحه رودمپ همان زبان با هدر گرادیانی به رنگ آن زبان باز می‌شود.
- [ ] دکمه بازگشت (فلش) به صفحه انتخاب زبان برمی‌گردد.
- [ ] در حالت Dark Mode گوشی، پس‌زمینه تیره است؛ در Light Mode، تم روشن اعمال می‌شود.

## نکته
این کد در این محیط بیلد نشده (Android SDK در دسترس نیست). اگر خطایی در Sync دیدی، متن خطا را بفرست تا دقیق رفعش کنم.
