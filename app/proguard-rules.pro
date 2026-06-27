# Merge
-flattenpackagehierarchy com.github.catvod.spider.merge

# dontwarn
-dontwarn org.slf4j.**
-dontwarn org.xmlpull.v1.**
-dontwarn com.google.re2j.**
-dontwarn android.content.res.**
-dontwarn android.support.annotation.**

# slf4j
-keeppackagenames org.slf4j.**
-keep class org.slf4j.** { *; }

# Android runtime
-keeppackagenames androidx.annotation.**
-keeppackagenames androidx.startup.**
-keeppackagenames androidx.tracing.**
-keeppackagenames javax.xml.namespace.**
-keeppackagenames org.xmlpull.v1.**
-keep class javax.xml.namespace.** { *; }
-keep class org.xmlpull.v1.** { *; }

# Demo app
-keeppackagenames com.github.catvod.MainActivity*
-keeppackagenames com.github.catvod.databinding.**

# AndroidX
-keep class androidx.core.** { *; }

# Gson
-keep class com.google.gson.** { *; }

# Kotlin
-keep class kotlin.** { *; }

# Spider
-keep class com.github.catvod.crawler.* { *; }
-keep class com.github.catvod.spider.* { public <methods>; }
-keep class com.github.catvod.js.Function { *; }

# OkHttp
-dontwarn okhttp3.**
-keeppackagenames okio.**
-keep class okio.** { *; }
-keep class okhttp3.** { *; }

# QuickJS
-keeppackagenames com.whl.quickjs.**
-keep class com.whl.quickjs.** { *; }

# Sardine
-keeppackagenames com.thegrizzlylabs.sardineandroid.**
-keep class com.thegrizzlylabs.sardineandroid.** { *; }

# SMBJ
-keeppackagenames net.engio.mbassy.**
-keep class com.hierynomus.** { *; }
-keep class net.engio.mbassy.** { *; }
-dontwarn org.ietf.jgss.**
-dontwarn javax.**

# Logger
-keep class com.orhanobut.logger.** { *; }
