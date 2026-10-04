# Merge
-flattenpackagehierarchy com.github.catvod.spider.merge

# Jsoup
-dontwarn com.google.re2j.**

# Spider
-keep class com.github.catvod.spider.* { public <methods>; }
-keep class com.github.catvod.js.Function { *; }

# Gson
-keepattributes Signature,RuntimeVisibleAnnotations,AnnotationDefault
-keepclasseswithmembers,allowobfuscation class * {
    @com.google.gson.annotations.SerializedName <fields>;
}
-if class * { @com.google.gson.annotations.SerializedName <fields>; }
-keepclassmembers,allowobfuscation,allowoptimization class <1> { <init>(); }
