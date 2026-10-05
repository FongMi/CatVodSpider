---
name: catvod-spider
description: Develop or refactor Java, Python and QuickJS TV spiders in CatVodSpider using the TV shared APIs.
---

# CatVodSpider

範例與打包見 [README](../../../README.md)，接口與參數見 [開發說明](../../../docs/development.md)。從對應語言的 Demo 開始，只保留站點需要的功能。

## 寫法

- 優先官方 API，確認分類、篩選、搜尋、詳情與播放的資料來源。列表 ID 接到 detail，每集播放值接到 play；只實現站點支援的功能與權限。
- 使用 App 注入的 Python `self.net`、QuickJS `net`、Java 繼承的 `net`。不要另建網路封裝，也不要複製 App 的共用類別。
- JSON API 優先用 `net.json`；需要狀態碼、錯誤正文或 bytes 時用 `net.req`／QuickJS `net.http`。網路失敗、403、登入頁及解析失敗不可偽裝成成功空列表，不增加無根據的重試或站點 workaround。
- 保持精簡、扁平，按實際操作切 function。不要為一個簡單操作增加類別或抽象層。

## 容易寫錯的地方

- Python 回傳 dict／list，QuickJS 回傳物件／陣列，Java 回傳 JSON 字串；proxy 與布林接口例外。QuickJS 的 detail 收單一 ID，Python／Java 收 ID 集合。
- 分類與搜尋都要接分頁；`filters` 的鍵對應 `type_id`。完整清單使用共用 page，API 已分頁時避免再次切片；同頁 VOD 樣式一致。
- 使用共用快取、Local、分頁、超連結及 `getProxyUrl`；不要自己拼 proxy 的 do／siteKey。搜尋語系由 Site.lang 決定，爬蟲不轉字。
- 播放網址可能過期，使用短 TTL、`stale:false`，不持久化。Cookie、token 與簽名網址不放進 log 或長期 Local。自己建立的 session 與資源要關閉，取消後不繼續請求。
- 開網頁和完成提示回傳 action 的 `web`／`msg`。Java／Python 自訂 Dialog 在主執行緒執行時才取得 Activity，可能為 null／None，不保存 Activity。
- QuickJS 使用 App bridge，不是 Node.js。AES-GCM 密文末端包含 16-byte tag，二進位明文使用 Base64。

交付與驗證依 [AGENTS.md](../../../AGENTS.md)，只回報實際執行的結果。
