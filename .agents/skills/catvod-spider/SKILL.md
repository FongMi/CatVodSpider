---
name: catvod-spider
description: Develop or upgrade Java, Python and QuickJS TV spiders using the shared APIs and CatVodSpider examples.
---

# CatVodSpider

從 [README](../../../README.md#開始開發) 選擇對應 Demo；接口、參數與語言差異以[開發說明](../../../docs/development.md)為準。代碼範例集中在 Demo，實際爬蟲只保留需要的功能。

## 開發流程

1. 先確認站點的分類、篩選、搜尋、詳情與播放來源，優先官方 API，只實現來源支援的功能與權限。
2. 依[執行環境](../../../docs/development.md#執行環境)選用語法與宿主 API。Python 入口維持同步 `def`；QuickJS 可回傳 Promise，由 App 等待，不是 Node.js 環境。
3. 接通列表 ID → 詳情 → 每集播放值 → 播放網址，再補篩選、分頁與需要的互動。共通能力及語言專屬範例見 [Demo 功能](../../../docs/development.md#demo-功能)。
4. 保持精簡、扁平，按實際操作切 function。使用 App 注入的 self.net／net，不複製內部實作或另建網路封裝。

## 網路與資源

- JSON 用 net.json；需要狀態碼、錯誤正文或 bytes 時，用 Java／Python net.req、QuickJS await net.http。先檢查 error 與 code，403、登入頁及解析失敗不能偽裝成成功空列表，不增加無根據的重試。
- 固定 HTTP 批次用 net.batch；每項還需快取、簽名或解析時用 net.map。保留輸入順序與並行上限，Java／Python 回呼在背景執行緒執行，避免修改共用狀態。
- 二進位、分塊讀取、下載、Cookie／Session、WebSocket 與快取統一依[網路](../../../docs/development.md#網路)。reader 用 with／finally 關閉；proxy 成功交付 stream 後由 App 接管，不能留給其他呼叫使用。
- 自訂串流的 reader 在產生器內開啟，逐塊輸出，不累積整段直播。App 管理傳輸與取消，站點續接與封包改寫留在爬蟲。Python 與 QuickJS 的每塊型別不同，依文件選用。
- 使用共用 TTL、Local 與 Session。播放網址用短 TTL、stale:false，不持久化；Cookie、token、簽名網址不寫入日誌或長期 Local。Python cachedText 的私有索引仍須經原生快取判斷有效期，destroy 釋放快照。
- WebSocket 持續收訊用 net.connect，需要恢復時設 reconnect:true；使用回呼傳入的 socket，每次 open 重新訂閱，retry 停止心跳並清除殘包。只有保證持續收訊的來源才設定 idle，不另建重連計時器。
- 短段 JavaScript 用 [js.eval](../../../docs/development.md#執行-javascript)，以 globals 傳資料；不要自行建立 QuickJS 或拼接參數。環境及期限由 App 管理，需配套模組。

## 回傳與互動

- 回傳型別及入口對照見[入口](../../../docs/development.md#入口)。Java／Python detail 收 ID 集合，QuickJS 收單一 ID；proxy、布林接口與彈幕停止函式各有自己的格式。
- [播放詳情更新](../../../docs/development.md#播放詳情更新)使用播放結果的 list[0]；App 採用結果時套用，預載資料在切集時更新，取消或過期的結果丟棄。episode 依播放分組合併並去重。
- 分類與搜尋都要接分頁，filters 的鍵對應 type_id。完整清單用共用 page；網站已分頁就直接回傳當頁，total 只填精確總數。同頁 VOD 樣式一致，搜尋語系由 Site.lang 處理，爬蟲不轉字。
- Java 使用本專案 com.github.catvod.bean 與 Response，以 create() 和無 set 前綴的鏈式方法組裝；它們隨爬蟲 JAR 打包，宿主 SDK 使用 compileOnly。字幕 Sub.format(ext) 收副檔名，JSON 的 subs[].format 使用 MIME。
- 超連結用共用 link，本機代理用 getProxyUrl，不自行拼 do／siteKey。網頁操作回傳 action 的 web／msg，格式見[網頁與本機代理](../../../docs/development.md#網頁與本機代理)。
- [直播回看](../../../docs/development.md#直播回看)以 timeshift 交給 App 管理時間軸與取消；節目表回看仍用 catchup。[即時彈幕](../../../docs/development.md#即時彈幕)透過 getDanmakuUrl 與 danmaku(id, emit)，協定、解碼及樣式轉換留在爬蟲；ready 須確認訂閱可用，不能僅以 WebSocket open 判斷。停止時只取消自己的連線與心跳，不關閉站點 net。
- Java／Python 的 Context、Activity、Toast 使用 com.github.catvod.Runtime。Dialog 在主執行緒執行時才取得 Activity，可能為 null／None，不保存 Activity；JAR 自己的 Init 是可選入口，詳見 [Android UI](../../../docs/development.md#android-ui)。Java 互動式下載及取消見[下載](../../../docs/development.md#下載)。
- QuickJS 的 HTML 欄位解析用 htmlQuery，Jsoup 規則不保證 Cheerio 相容；必填值、trim、相對 URL 與去重由爬蟲處理。限制見 [HTML 查詢](../../../docs/html-query.md)。

## 驗證

依[接口驗證](references/validation.md)核對首頁、篩選、搜尋、下一頁、尾頁、無結果及列表 → 詳情 → 播放。主機適配器只驗證解析與輸出，不能證明 App 載入、快取、取消、Cookie 或播放成功。

測試位置、打包及交付依 [AGENTS.md](../../../AGENTS.md)，分開回報主機與 App 的實際結果。
