# CatVodSpider

開發爬蟲時使用 [catvod-spider 技能](.agents/skills/catvod-spider/SKILL.md)。接口與參數見 [docs/development.md](docs/development.md)，範例入口見 [README](README.md)。

- 保留既有 dirty work，只修改任務相關檔案，維持 UTF-8、CRLF。沒有要求時不提交、推送、上傳配置或操作裝置。
- 本專案不新增測試檔、測試工具或 testImplementation；共用接口與 R8 驗證放在 TV repo。Java 程式修改後執行 `gradlew.bat spiderJar` 確認打包。
- 完成時說明修改、實際驗證結果與未驗證範圍。
