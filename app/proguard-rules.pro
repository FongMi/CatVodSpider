# Merge
-flattenpackagehierarchy com.github.catvod.spider.merge

# dontwarn
-dontwarn org.slf4j.**
-dontwarn org.xmlpull.v1.**
-dontwarn com.google.re2j.**
-dontwarn android.content.res.**

# slf4j
-keep class org.slf4j.** { *; }

# AndroidX
-keep class androidx.core.** { *; }

# Spider
-keep class com.github.catvod.crawler.* { *; }
-keep class com.github.catvod.spider.* { public <methods>; }
-keep class com.github.catvod.js.Function { *; }

# OkHttp
-dontwarn okhttp3.**
-keep class okio.** { *; }
-keep class okhttp3.** { *; }

# QuickJS
-keep class com.whl.quickjs.** { *; }

# Sardine
-keep class com.thegrizzlylabs.sardineandroid.** { *; }

# SMBJ
-keep class com.hierynomus.** { *; }
-keep class net.engio.mbassy.** { *; }
-dontwarn org.ietf.jgss.**
-dontwarn javax.**

# Logger
-keep class com.orhanobut.logger.** { *; }