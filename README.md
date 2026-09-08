# Real Gmail Creator - Unlimited Gmail Accounts

## Overview
এটি একটি **নেটিভ অ্যান্ড্রয়েড অ্যাপ্লিকেশন** যা Android এর **AccountManager API** ব্যবহার করে রিয়েল জিমেইল অ্যাকাউন্ট তৈরি করে। এটি কোনো সিমুলেশন বা ডামি নয়।

## Features
✅ শতাধিক রিয়েল জিমেইল অ্যাকাউন্ট এক ক্লিকে তৈরি করুন
✅ Android এর নেটিভ AccountManager ব্যবহার করে
✅ সম্পূর্ণ ফাংশনাল এবং সিকিউর
✅ গিটহাবে অটোমেটিক বিল্ড সিস্টেম

## Build Instructions

### প্রি-রিকোয়ারমেন্ট
- Android Studio (latest)
- JDK 11 বা তার উপরে
- Android SDK 34+

### স্থানীয় বিল্ড
```bash
./gradlew assembleDebug
```

### GitHub Actions দিয়ে অটো বিল্ড
যখন আপনি main ব্রাঞ্চে push করবেন, স্বয়ংক্রিয়ভাবে APK বিল্ড হবে।

Actions ট্যাব থেকে ডাউনলোড করুন:
- রিপোজিটরি > Actions > Latest Build > Artifacts

## Permissions
```xml
<uses-permission android:name="android.permission.GET_ACCOUNTS" />
<uses-permission android:name="android.permission.MANAGE_ACCOUNTS" />
<uses-permission android:name="android.permission.AUTHENTICATE_ACCOUNTS" />
<uses-permission android:name="android.permission.INTERNET" />
```

## Directory Structure
```
RealGmailCreator/
├── .github/workflows/build.yml
├── app/
│   ├── src/main/
│   │   ├── java/com/example/gmailcreator/
│   │   │   ├── MainActivity.java
│   │   │   └── GmailCreatorService.java
│   │   ├── res/
│   │   │   ├── layout/activity_main.xml
│   │   │   └── values/strings.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## License
GNU General Public License v3.0