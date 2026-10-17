---
name: catvod-spider
description: Develop or upgrade Java, Python and QuickJS TV spiders using the TV shared APIs and CatVodSpider examples.
---

# CatVodSpider

範例與打包見 [README](../../../README.md)，接口與參數見 [開發說明](../../../docs/development.md)。從對應 Demo 開始，只保留需要的功能；代碼範例集中在 Demo，文件只保留接口、參數與限制。

## 寫法

- 依[執行環境](../../../docs/development.md#執行環境)所列的版本選用語法與宿主 API。Python 入口用同步 `def`，App 不等待 coroutine；QuickJS 可回傳 Promise，由 App 等待。
- 優先官方 API，確認分類、篩選、搜尋、詳情與播放的資料來源。列表 ID 接到 detail，每集播放值接到 play；只實現站點支援的功能與權限。
- 使用 App 注入的 Python `self.net`、QuickJS `net`、Java 繼承的 `net`。不要另建網路封裝或複製 App 的內部實作。
- Context、Activity 與 Toast 使用共用 SDK 的 `com.github.catvod.Runtime`；爬蟲 JAR 不打包宿主 SDK 類別。JAR 自己的 `com.github.catvod.spider.Init` 是獨立的可選初始化入口。
- Java 使用本專案 `com.github.catvod.bean` 的純資料模型，以 `Vod.create().id(...).name(...)` 鏈式填值，模型統一以 `create()` 建立，方法不加 `set` 前綴。播放附加資料使用 `Sub`、`Danmaku`、`Drm`、`SkipSegment`、`Url`，網頁操作使用 `Web`；`Response` 用 Gson 組裝標準 JSON。模型隨爬蟲 JAR 打包，不引用 App bean；App 的 `Result` 只負責接收解析，不放爬蟲 builder。
- JSON API 優先用 `net.json`；需要狀態碼、錯誤正文或 bytes 時用 `net.req`／QuickJS `net.http`。網路失敗、403、登入頁及解析失敗不可偽裝成成功空列表，不增加無根據的重試或站點 workaround。
- 二進位回應用 `buffer:3`，Python 取得 bytes，可用 memoryview 建立切片檢視；QuickJS 取得 ArrayBuffer，以 Uint8Array 檢視。QuickJS 逐塊處理用 `net.openStream`，read 到 null 為 EOF，以 finally 關閉；proxy 原樣轉送用 `net.stream`，成功回傳 handle 後由 App 接管，不保留到其他呼叫。
- QuickJS 批次 HTML 欄位可用全域 `htmlQuery`，同一 plan 放多組 queries；自行驗證必填值、trim 與補相對 URL。它使用 Jsoup 規則，不是 Cheerio 相容介面；用法與限制見開發說明。
- 固定 HTTP 批次用共用 `net.batch`；QuickJS 每項還要解析或轉換時用 `net.map(items, async (item, index) => result, limit)`，保持並行上限並檢查每項 HTTP 狀態。
- 保持精簡、扁平，按實際操作切 function。不要為一個簡單操作增加類別或抽象層。
- Java 字幕用 `Sub.create().format(ext)` 傳副檔名，由 `Sub` 呼叫 `VodUtil.getSubMimeType(ext)`；JSON 的 `subs[].format` 使用 MIME。

## 容易寫錯的地方

- Python 回傳 dict／list，QuickJS 回傳物件／陣列，Java 回傳 JSON 字串；proxy 與布林接口例外。QuickJS 的 detail 收單一 ID，Python／Java 收 ID 集合。
- 分類與搜尋都要接分頁；`filters` 的鍵對應 `type_id`。完整清單先切片，網站已分頁時直接回傳當頁；同頁 VOD 樣式一致。
- 使用共用快取、Local、超連結及 `getProxyUrl`；不要自己拼 proxy 的 do／siteKey。搜尋語系由 Site.lang 決定，爬蟲不轉字。
- Python 大型 JSON 目錄可用 `self.net.cachedText` 取得快取文字，再按內容重用私有索引；每次讀取仍通過原生快取，destroy 釋放快照，不另設有效期。一般資料繼續使用回傳獨立物件的 `cached`。
- 播放網址可能過期，使用短 TTL、`stale:false`，不持久化。Cookie、token 與簽名網址不放進 log 或長期 Local。自己建立的 session 與資源要關閉，取消後不繼續請求。
- WebSocket 一次交換用 `net.ws`，持續收訊用 `net.connect(url, options, callback)`。callback 收到連線與事件；使用回呼傳入的連線 send，切台或 destroy 時關閉。平台訂閱、解碼與應用層心跳由爬蟲處理。
- 開網頁和完成提示回傳 action 的 `web`／`msg`。Java／Python 自訂 Dialog 在主執行緒執行時才取得 Activity，可能為 null／None，不保存 Activity。
- 共用 `aesX`／Crypto bridge 的 GCM 密文末端含 16-byte tag，二進位明文用 Base64。

## 網站已分頁

分類與搜尋直接回傳當頁的 list、page、pagecount、limit，不再切片。limit 是頁大小，total 只填精確總數，未知時省略。回傳型別與其他分頁方式見[入口](../../../docs/development.md#入口)。

## 驗證

依 [接口驗證](references/validation.md)，用真實回應核對列表 → 詳情 → 播放值，並檢查首頁、下一頁、尾頁與無結果。403、登入頁和解析失敗不能變成成功空列表。

主機適配器只驗證解析與輸出，不能證明 App 載入、快取、取消、Cookie 或播放成功。交付依 [AGENTS.md](../../../AGENTS.md)，分開回報主機與 App 的實際結果。
