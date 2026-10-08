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
- 分類與搜尋都要接分頁；`filters` 的鍵對應 `type_id`。完整清單使用共用 page，網站已分頁時直接回傳當頁；同頁 VOD 樣式一致。
- 使用共用快取、Local、分頁、超連結及 `getProxyUrl`；不要自己拼 proxy 的 do／siteKey。搜尋語系由 Site.lang 決定，爬蟲不轉字。
- 播放網址可能過期，使用短 TTL、`stale:false`，不持久化。Cookie、token 與簽名網址不放進 log 或長期 Local。自己建立的 session 與資源要關閉，取消後不繼續請求。
- WebSocket 一次交換用 `net.ws`，持續收訊用 `net.connect(url, options, callback)`。callback 收到連線與事件；使用回呼傳入的連線 send，切台或 destroy 時關閉。平台訂閱、解碼與應用層心跳由爬蟲處理。
- 開網頁和完成提示回傳 action 的 `web`／`msg`。Java／Python 自訂 Dialog 在主執行緒執行時才取得 Activity，可能為 null／None，不保存 Activity。
- QuickJS 使用 App bridge，不是 Node.js。AES-GCM 密文末端包含 16-byte tag，二進位明文使用 Base64。

## 網站已分頁

分類與搜尋使用相同格式。例如網站第 2 頁、共 8 頁、每頁最多 20 筆：

```json
{"list": [{"vod_id": "123", "vod_name": "影片名稱"}], "page": 2, "pagecount": 8, "limit": 20}
```

Python 回傳 dict，QuickJS 回傳物件，Java 回傳這份 JSON 的字串。不要再用完整清單的 page 方法切片；limit 是頁大小，不是尾頁實際筆數。網站提供精確總筆數時加 total，未知時省略，不能用 pagecount × limit 推算。App 以 page < pagecount 判斷繼續載入。

## 驗證

獨立開發時讀 [接口驗證](references/validation.md)，內含 HTTP 回應格式與可在暫存目錄執行的 Python 適配範例，不需要查 TV repo。先用真實回應驗證列表 → 詳情 → 播放值，分類與搜尋檢查首頁、下一頁、尾頁及無結果；確認 403、登入頁和解析失敗不會變成成功空列表。

主機適配器只驗證解析與輸出，不能證明 App 載入、快取、取消、Cookie 或播放成功。交付依 [AGENTS.md](../../../AGENTS.md)，分開回報主機與 App 的實際結果。
