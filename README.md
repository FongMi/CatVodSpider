# CatVodSpider

TV 的 Java、Python 與 QuickJS 爬蟲及範例，基於 [CatVod](https://github.com/CatVodTVOfficial/CatVodTVSpider)。

## 開始開發

| 語言 | 範例 |
| --- | --- |
| Python | [examples/python/spider.py](examples/python/spider.py) |
| QuickJS | [examples/javascript/spider.js](examples/javascript/spider.js) |
| Java | [Demo.java](app/src/main/java/com/github/catvod/spider/Demo.java) |

複製對應範例，換成站點資料，只保留需要的功能。接口與 Demo 選項見[開發說明](docs/development.md)。

修改 [examples/config.json](examples/config.json) 的 `api` 與 `ext`，再讓 TV 載入這份配置。Python／QuickJS 可直接載入；Java 需先打包。

使用本機路徑或網站皆可，保留 `examples` 與 `jar` 的相對位置。現有 Java 爬蟲配置見 [json/config.json](json/config.json)。

## 打包 JAR

Java 最低支援 Android 7.0。在本專案根目錄執行：

```powershell
.\gradlew.bat spiderJar
```

打包會執行 R8，成品為 `jar/custom_spider.jar` 與 `jar/custom_spider.jar.md5`。

匯出到其他目錄可執行 `build.bat "D:\Output"`，也可傳入完整 JAR 路徑。

## 使用 AI

AI 指引見 [AGENTS.md](AGENTS.md) 與 [catvod-spider 技能](.agents/skills/catvod-spider/SKILL.md)。例如：

> 請用 $catvod-spider 為這個站點寫 Python 爬蟲，支援分類、篩選與搜尋分頁。
