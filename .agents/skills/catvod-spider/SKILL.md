---
name: catvod-spider
description: Develop or refactor Java, Python and QuickJS TV spiders in CatVodSpider using the TV shared APIs.
---

# CatVodSpider

從 Python `examples/python/spider.py`、QuickJS `examples/javascript/spider.js` 或 Java `app/src/main/java/com/github/catvod/spider/Demo.java` 開始，只保留站點需要的功能。三份 demo 的分類與操作入口一致，覆蓋功能及 ext 參數集中在 [開發說明](../../../docs/development.md)，配置為 `examples/config.json`。

## 接口

- 優先官方 API，先確認清單、篩選、搜尋、詳情與播放的真實來源；列表 ID 接到 detail，每集播放值接到 play。
- Python 回傳 dict/list；QuickJS 資料方法回傳物件／陣列，detail 收到單一 ID；App 負責序列化。Java 可用 SDK 的 Result、Vod、Filter 等模型。
- filters 的鍵對應 type_id。分類與搜尋都有 pg，回傳 list、page、pagecount、limit、total；page < pagecount 才會繼續載入，沒有 loadMore 方法。
- 同頁 Vod.style 保持一致；class 的 land/circle/ratio 決定分類樣式。資料夾用 vod_tag="folder"，操作卡片用 action。
- 線路用 $$$ 分隔，每線集數用 #，每集為名稱$播放值；清理名稱中的分隔符。Site.lang 由 App 處理，爬蟲不轉字。
- 播放可回傳多畫質 url.values／position、subs、danmaku、drm、skips 與 position；只帶站點實際提供的資料。skips 的 start/end 以影片開頭起算的毫秒表示，end 為跳轉目標；ending 可省略 end。
- live 回傳 Group/channel/urls，多線路加 $線路名稱。proxy 回傳狀態、MIME、body、headers，網址用 Python getProxyUrl(params)、QuickJS getProxyUrl(params)、Java getProxyUrl(Map)，由 App 自動加入 do/siteKey 並編碼 query。EPG 的 &date={date} 接在產生的網址後，保留日期替換符。

## 共用網路

- Python 用 self.net.req，QuickJS 用 net.req 同步、net.http 回傳 Promise；Java 用注入的 net，只要正文可用 net.get/post。不要另建網路封裝或複製 SDK 類別。
- HTTP code 與 error 分開判斷，403、登入頁及解析失敗不可回傳成功空列表。timeout、callTimeout、sleep、快取 TTL 都以毫秒計。
- cookie:true 才使用 WebView Cookie。session 使用隔離的 Cookie，用完以 with 或 try/finally 關閉。
- JSON API 可用 Python self.net.json、QuickJS net.json、Java net.json；非 2xx、連線失敗或無效 JSON 拋出例外。需要狀態碼或錯誤正文時使用完整 net.req/net.http。
- net.cached(key, options, loader) 使用 ttl、stale、persist。預設過期回舊值並背景更新；stale:false 到期等待新資料，persist:true 持久化公開資料。net.clearCache(key) 清一筆，省略 key 清全部並取消載入。隔離 session 不持久化。
- net.peek(key) 只讀已有值，包括過期值，不請求或延長 TTL。先顯示舊資料時搭配 refresh 背景更新；播放網址仍用 stale:false。Java 回傳 JSON 字串，Python／JS 回傳 JSON 值，沒有資料回傳 None／null。
- Local 保存 JSON 值，Python self.local、QuickJS local、Java local 使用 get/set/delete，App 自動按 site key 隔離。Python／JS 不需自行編碼 JSON；Java 傳 JSON 字串。
- Python self.page／self.link、QuickJS page／link、Java Result.page／Json.link 處理分頁與超連結格式。API 已分頁時傳總筆數，不重複切片；分類目標及篩選參數仍由站點決定。
- 批次 URL 請求用 net.batch(requests, limit)，預設每批最多 4 筆並行、按輸入順序回傳；檢查各筆 HTTP 狀態。背景更新用 net.refresh，仍遵守 TTL，不另建 thread/token。下載用 net.download 串流至檔案，相對路徑以 App cache 為基準；錯誤及部分檔案由呼叫者處理。Java 詳細參數見 docs/development.md。
- 持久快取是可清除的 App cache，每站最多 64 檔、16 MiB；簽名網址保持 stale:false，不存 Cookie/token。
- ws 完成一次訊息交換，回傳首個完整文字訊息；不會自動重連。自己建立的 session 與資源需釋放，取消後不繼續請求。

## Android 與網頁

- 開網頁與完成提示回傳 action JSON 的 web/msg，不反射 App 私有類別。獨立內容使用 mode:"view"，登入 Cookie 的格式見開發說明。
- Java/Python 的 getActivity 可能為 null/None。自訂 dialog 在主執行緒執行時才取得 Activity，不保存快照；執行中的文字提示可用 Init.toast，App 負責切到主執行緒。
- QuickJS 使用 App 注入的 bridge，不是 Node.js；AES-GCM 密文末端包含 16-byte tag，二進位明文使用 Base64。

## 代碼與交付

保持精簡、扁平，按實際操作切 function；只修改任務相關檔案，保留 CRLF 與既有行為。不在本專案增加測試檔、測試工具或 testImplementation；共用接口與 R8 驗證放在 TV repo。Java 修改後執行 gradlew.bat spiderJar 確認打包；沒有要求時不提交或發佈。
