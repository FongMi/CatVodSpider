# CatVodSpider

TV 的 Java、Python 與 QuickJS 爬蟲及開發範例，基於 [CatVod](https://github.com/CatVodTVOfficial/CatVodTVSpider)。

## 開始開發

| 語言 | 來源 | 配置 |
| --- | --- | --- |
| Java | [app/src/main/java/com/github/catvod/spider/Demo.java](app/src/main/java/com/github/catvod/spider/Demo.java) | [examples/config.json](examples/config.json) |
| Python | [examples/python/spider.py](examples/python/spider.py) | [examples/config.json](examples/config.json) |
| QuickJS | [examples/javascript/spider.js](examples/javascript/spider.js) | [examples/config.json](examples/config.json) |

從對應語言的 demo 開始，只保留站點需要的功能。三份範例包含 VOD 與分類樣式、篩選、搜尋及分類分頁、超連結、多畫質播放、字幕、彈幕、DRM、片段跳過、action、網頁、Cookie、HTTP／JSON／並行請求、WebSocket、串流下載、TTL／持久化／背景快取、Local、直播及本機 proxy。Python／Java 另有目前 Activity、自訂 Dialog 與 Init.toast，Java 示範 net.get／post。

Java 先執行 `spiderJar`，再將 `examples` 與 `jar` 放到 TV 可讀取的本機路徑或網站，載入 `examples/config.json`，保留兩個目錄的相對位置。配置提供三種語言的點播與直播入口；網路與播放示範需要在 ext 填入實際網址，參數與功能表見[開發說明](docs/development.md)。其他 Java 爬蟲見 [json/config.json](json/config.json)。

## Java SDK

使用專案的 Gradle Wrapper 與 Android SDK 編譯。Java 成品最低支援 Android 7.0（API 24），需搭配提供對應 API 的新版 TV。

在 TV 專案根目錄產生編譯 SDK：

```powershell
.\gradlew.bat :catvod:apiJar
```

將 TV 的 `catvod/build/outputs/api/catvod-api.jar` 複製到本專案的 `app/libs/catvod-api.jar`。SDK 以 `compileOnly` 使用，執行時由 TV 提供 Spider、Net、共用模型與工具。外部庫的使用方式見[Java 共用類別](docs/development.md#java-共用類別)。

## 打包 JAR

在本專案根目錄執行：

```powershell
.\gradlew.bat spiderJar
```

流程會執行 release R8、組裝 DEX JAR，並檢查 DEX 格式、數量、MD5、SDK 重複類別及依賴。成品為 [jar/custom_spider.jar](jar/custom_spider.jar) 與 [jar/custom_spider.jar.md5](jar/custom_spider.jar.md5)。

需要匯出到其他目錄時：

```powershell
.\build.bat "D:\Output"
```

也可傳入完整 `.jar` 路徑，同時匯出 JAR 與 MD5。共用接口與 R8 的執行驗證放在 TV repo。

## 開發文件

- [開發說明](docs/development.md)：三種語言的接口、配置、網路、網頁與 Android UI。
- [AGENTS.md](AGENTS.md) 與 [catvod-spider 技能](.agents/skills/catvod-spider/SKILL.md)：AI 開發指引。

使用 AI 時可直接提示：`請用 $catvod-spider 為這個站點寫 Python 爬蟲，支援分類、篩選與搜尋分頁。`
