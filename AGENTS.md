# CatVodSpider 開發指引

本專案的 Java 爬蟲使用 TV 的 catvod-api.jar；Python 執行於 Chaquopy，JS 執行於 QuickJS。不要複製 App 的 Spider、Net、共用模型或 Android bridge 到爬蟲。

- 開發爬蟲時先讀 `.agents/skills/catvod-spider/SKILL.md`，參數用法見 `docs/development.md` 及對應語言的 demo。
- Java 保留在 app；Python／QuickJS 放 examples 的對應語言目錄。
- 先確認來源、接口及完整呼叫流程。優先使用官方 API，只實現站點支援的分類、篩選與權限；網路錯誤、403、登入頁或解析失敗不可用假資料或成功的空列表掩蓋。
- 使用 Python self.net、QuickJS net、Java 繼承的 net。程式精簡、流程扁平、按實際操作切 function；不建立另一套網路／生命週期抽象，不增加無根據的重試或站點 workaround。
- 保留既有 dirty work，僅改任務相關檔案；編輯後維持 UTF-8、CRLF。不要自行上傳配置、提交、推送或操作其他作者的裝置。
- 本專案不新增測試檔案、測試工具或 testImplementation；共用接口與 R8 驗證放在 TV repo。Java 修改後執行 `gradlew.bat spiderJar` 確認打包。
- 完成報告列出修改、實際執行的命令／結果、未驗證範圍與需要作者提供的裝置或帳號。先完成已授權且能驗證的工作，不承諾第三方站點永遠可用。
