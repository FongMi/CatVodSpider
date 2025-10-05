#!/bin/bash

# 删除旧的 custom_spider.jar 和 Smali_classes 目录
rm -f "$(dirname "$0")/custom_spider.jar"
rm -rf "$(dirname "$0")/Smali_classes"

# 使用 apktool 反编译 APK 文件，仅提取主 classes
java -jar "$(dirname "$0")/3rd/apktool_2.11.0.jar" d -f --only-main-classes "$(dirname "$0")/../app/build/outputs/apk/release/app-release-unsigned.apk" -o "$(dirname "$0")/Smali_classes"

# 删除 spider.jar 中的相关目录
rm -rf "$(dirname "$0")/spider.jar/smali/com/github/catvod/spider"
rm -rf "$(dirname "$0")/spider.jar/smali/com/github/catvod/js"
rm -rf "$(dirname "$0")/spider.jar/smali/org/slf4j"

# 创建所需的目录结构（如果不存在）
mkdir -p "$(dirname "$0")/spider.jar/smali/com/github/catvod/"
mkdir -p "$(dirname "$0")/spider.jar/smali/org/slf4j/"

# 移动反编译后的文件到指定位置
mv "$(dirname "$0")/Smali_classes/smali/com/github/catvod/spider" "$(dirname "$0")/spider.jar/smali/com/github/catvod/"
mv "$(dirname "$0")/Smali_classes/smali/com/github/catvod/js" "$(dirname "$0")/spider.jar/smali/com/github/catvod/"
mv "$(dirname "$0")/Smali_classes/smali/org/slf4j" "$(dirname "$0")/spider.jar/smali/org/slf4j/"

# 使用 apktool 重新打包
java -jar "$(dirname "$0")/3rd/apktool_2.11.0.jar" b "$(dirname "$0")/spider.jar" -c

# 将生成的 dex.jar 重命名为 custom_spider.jar
mv "$(dirname "$0")/spider.jar/dist/dex.jar" "$(dirname "$0")/custom_spider.jar"

# 计算并保存 MD5 值
md5 -q "$(dirname "$0")/custom_spider.jar" > "$(dirname "$0")/custom_spider.jar.md5"

# 清理临时目录
rm -rf "$(dirname "$0")/spider.jar/build"
rm -rf "$(dirname "$0")/spider.jar/smali"
rm -rf "$(dirname "$0")/spider.jar/dist"
rm -rf "$(dirname "$0")/Smali_classes"
