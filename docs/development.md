# 爬蟲開發

先從 [README](../README.md) 選擇 Demo 並載入配置。範例統一放在 Demo 程式碼，本文只說明接口、參數與限制；實際爬蟲只保留需要的功能。

## 執行環境

目前 TV 專案使用以下語言基準，App 與對應 runtime 模組需配套更新：

| 語言 | 環境與寫法 |
| --- | --- |
| Java | Java 17 語法、Android 7.0 起；繼承 Spider，使用注入的 net，以 spiderJar 打包並執行 R8 |
| Python | CPython 3.10、Chaquopy 17.1.0；可用 `match/case`、`str \| None` 等 3.10 語法，爬蟲入口維持同步 `def`，網路使用 `self.net` |
| QuickJS | QuickJS-NG 0.17.0 基底，含上游更新；使用 ES module 的 `export default`，支援 `async/await`、`?.`、`??`，網路使用注入的 `net` |

Java SDK 以 compileOnly 引用，取得與更新方式見 [README](../README.md#打包-jar)。Function JAR 使用 com.fongmi.quickjs 的 QuickJSContext、JSArray 等 API，配套更新後重新編譯，不打包 SDK 類別。

主機驗證使用 Python 3.10；App 不等待 Python coroutine。

QuickJS 的宿主功能由 App 注入，需使用 v11 配套的 wrapper、runtime 與 TV 介接：

| 功能 | 支援範圍 |
| --- | --- |
| 計時與輸出 | timeout／interval、額外參數與共用取消 ID；console 的 assert、dir、count、time、trace、group、table，clear 只重設縮排 |
| 網址與事件 | URL／URLSearchParams、Event／EventTarget／CustomEvent、AbortController／AbortSignal（timeout、any、reason） |
| 資料與串流 | structuredClone、Blob／File／FormData、Web Streams 與 BYOB；clone 不支援 function／SharedArrayBuffer |
| 編碼 | UTF-8 TextEncoder、多編碼 TextDecoder（含 GBK／GB18030／Big5）、TextEncoderStream／TextDecoderStream |
| HTTP | Headers／Request／Response；網路請求使用注入的 `net.http`／`net.json` |
| 加密 | getRandomValues／randomUUID、SHA、HMAC、AES-GCM／CBC、raw／octet JWK、wrap／unwrap；不支援 RSA、橢圓曲線或 KDF；GCM tag 為 96、104、112、120、128 bits，附加於密文末端 |
| 模組 | JSON module import attributes，type 為 json |

大型資料用 `net.openStream`，proxy 轉送用 `net.stream`。不是 Node.js 環境。`Intl` 與 `Atomics.waitAsync` 未提供。

共用 aesX／Crypto bridge 的 GCM 密文末端含 16-byte tag，二進位明文用 Base64；Web Crypto 的 tagLength 依上表。

## 入口

| 用途 | Java | Python | QuickJS |
| --- | --- | --- | --- |
| 初始化 | `init(context, extend)` | `init(extend)` | `init(ext)`；`default(site)` 建立實例 |
| 分類與篩選 | `homeContent(filter)` | `homeContent(filter)` | `home(filter)` |
| 推薦 | `homeVideoContent()` | `homeVideoContent()` | `homeVod()` |
| 分類列表 | `categoryContent(tid, pg, filter, extend)` | `categoryContent(tid, pg, filter, extend)` | `category(tid, pg, filter, extend)` |
| 搜尋 | `searchContent(key, quick, pg)` | `searchContent(key, quick, pg)` | `search(key, quick, pg)` |
| 詳情 | `detailContent(ids)` | `detailContent(ids)` | `detail(id)` |
| 播放 | `playerContent(flag, id, vipFlags)` | `playerContent(flag, id, vipFlags)` | `play(flag, id, vipFlags)` |
| 即時彈幕 | `danmaku(id, Consumer<JSONObject>)` | `danmaku(id, emit)` | `danmaku(id, emit)` |
| 操作 | `action(value)` | `action(value)` | `action(value)` |
| 直播 | `liveContent(url)` | `liveContent(url)` | `live(url)` |
| 本機代理 | `proxy(params)` | `localProxy(params)` | `proxy(params)` |
| 嗅探判斷 | `manualVideoCheck()`／`isVideoFormat(url)` | `manualVideoCheck()`／`isVideoFormat(url)` | `sniffer()`／`isVideo(url)` |
| 釋放 | `destroy()` | `destroy()` | `destroy()` |

Java Demo 用 Gson 組裝標準 JSON 字串；Python 資料方法回傳 dict／list；QuickJS 回傳物件／陣列，Promise 由 App 等待。proxy 與布林接口維持各自格式。Java／Python 的 detail 收 ID 集合，QuickJS 收單一 ID。

`destroy()` 用來關閉自行建立的資源。QuickJS 的 destroy hook（含回傳的 Promise）有 5 秒期限，逾時仍會釋放 runtime；呼叫前已取消網路工作，不在此安排新請求。

Java 使用本專案 `com.github.catvod.bean` 模型，以 `create()` 建立並鏈式填值，方法不加 `set` 前綴。`com.github.catvod.utils.Response` 用 Gson 組裝 JSON 與分頁，兩者隨爬蟲 JAR 打包；App 的 `Result` 只負責接收解析。

`Response.vod()` 填詳情，`classes()`／`filters()` 填分類與篩選，`put(name, value)` 填其他欄位，`string()` 輸出 JSON。明確的 `0`／`false` 保留，null 模型欄位省略；也可直接用 Gson 組裝標準 JSON。

`Response.url()` 接受播放網址字串或 `Url` 多畫質模型，傳入 `null` 時移除 URL 欄位。

| 回傳資料 | Java 模型與方法 |
| --- | --- |
| 分類、影片 | `Class.create().id().name().flag()`、`Vod.create().id().name().pic().remarks()` |
| 篩選、選項 | `Filter.create().key().name().value().init()`、`Value.create().n().v()` |
| 樣式 | `Style.create().type().ratio()`、`Cate.create().land().circle().ratio()` |
| 字幕 | `Sub.create().url().name().lang().format(ext).flag()`，交給 `Response.subs()` |
| 彈幕 | `Danmaku.create().name().url()`，交給 `Response.danmaku()` |
| DRM | `Drm.create().key().type().header().forceKey()`，交給 `Response.drm()` |
| 跳過片段 | `SkipSegment.create().type().start().end()`，交給 `Response.skips()` |
| 多畫質 | `Url.create().values().position()`，values 使用 `Value`，交給 `Response.url()` |
| 網頁 | `Web.create().url().mode().cookie()`，cookie 使用 `Web.Cookie.create().url().keys()`，交給 `Response.web()` |

播放附加欄位的實作見 [Java Demo](../app/src/main/java/com/github/catvod/spider/Demo.java) 的 `playerContent`。

`Response` 也提供 `playUrl、artwork、jxFrom、flag、desc、format、click、key、position、code、msg` 鏈式方法。上述播放與網頁模型未填的可選欄位省略；`ending` 片段可不呼叫 `.end()`，Web Cookie 未填 `.url()` 時使用網頁網址。多畫質的 position 是從 0 開始的索引，與回應頂層以毫秒計的起播 position 不同。

Java 的 `Sub.format(ext)` 傳入字幕副檔名，例如 `vtt`、`srt`、`ass`，由模型呼叫 `VodUtil.getSubMimeType(ext)` 轉成 MIME；回傳 JSON 的 `subs[].format` 仍使用 MIME。

分類與搜尋回傳 `list、page、pagecount、limit`，有精確總筆數才加 `total`。完整單頁清單可只填 `list、page=1、pagecount=1`。網站已分頁時直接回傳當頁，不再次切片或推算 total；App 以 `page < pagecount` 決定載入下一頁。`filters` 的鍵對應分類 `type_id`。實作見 Demo 的分類與搜尋入口。

線路用 `$$$` 分隔，每線集數用 `#`，每集為 `名稱$播放值`。清理名稱中的分隔符；播放值可用自訂 ID，在播放時取得實際網址。

VOD 的 `style.type` 支援 rect／oval／list，同頁保持一致；分類使用 land／circle／ratio。資料夾、action 卡片與演員超連結見 Demo。Site.lang 由 App 處理搜尋語系，爬蟲不轉字。

## Demo 功能

三語言使用相同的 12 筆資料、分類 ID、篩選、搜尋與播放 ID；共通操作的 action 名稱及順序一致。從「互動功能」選擇以下操作：

| 功能 | 操作／入口 |
| --- | --- |
| 列表與樣式 | 首頁、分類、資料夾、演員／導演連結；搜尋「示範」檢查分頁 |
| 播放 | 主要／備用／代理線、多畫質、字幕、DRM、片段跳過、起播位置、直播回看、播放詳情更新 |
| HTTP | json、request_sync、request、binary、cookie、cookie_clear、session |
| 並行與下載 | parallel、parallel_map、download、sleep |
| 串流 | stream_read、proxy_stream；本機 proxy 轉送與分塊讀取 |
| WebSocket | websocket 單次交換；socket-start／socket-state／socket-stop 持續收訊 |
| 快取與儲存 | ttl_cache／ttl_peek／ttl_background／ttl_persist／ttl_clear／ttl_clear_all；cache_write／cache_read／cache_delete 操作 Local |
| 腳本與互動 | script、runtime、proxy、toast、site_key、web、web_view；live_danmaku 選項啟用即時彈幕 |

語言差異保留在對應 Demo：

| 語言 | 專屬操作與差異 |
| --- | --- |
| Java | text_get／text_post 取得正文；native_toast／dialog 呼叫 Android；binary 使用 buffer=1；串流使用 InputStream |
| Python | ttl_text 讀取 JSON 快取文字；native_toast／dialog 呼叫 Android；proxy_body 使用 generator；binary 回傳 bytes |
| QuickJS | html_query 解析 HTML 欄位；proxy_body 使用 async generator；binary 回傳 ArrayBuffer；下載保留在 App cache |

## 播放詳情更新

在 `playerContent(flag, id, vipFlags)`／`play(flag, id, vipFlags)` 的回傳結果中，以 `list[0]` 帶回 VOD 詳情。`vod_id` 可省略，提供時會連動歷史與收藏識別。

以下 `vod` 為詳情資料，`url` 為播放網址。

```java
return Response.create().url(url).vod(vod).string();
```

```python
return {"parse": 0, "url": url, "list": [vod]}
```

```javascript
return {parse: 0, url, list: [vod]};
```

Node.js 的 `/play` 與 type=4 HTTP API 使用相同 JSON 格式。App 採用結果時更新 VOD；預載結果在切集時套用，取消或過期的結果會丟棄。

episode 依相同 `vod_play_from` 合併，相同名稱與播放值去重，其餘追加，保留目前選集位置。

## Demo 選項

選項放在 Site.ext 或直播 ext，使用到的功能才需要填。web_url 預設 https://example.com/，request_url 省略時沿用 web_url；外部請求與播放需換成自己的有效來源。

| ext | 用途 |
| --- | --- |
| `image_base` | 封面網址前綴，留空使用 App 預設圖 |
| `web_url、game_url、cookie_name` | 一般網頁、獨立內容及單一登入 Cookie；game_url 留空時使用 web_url |
| `web_cookie` | 登入 Cookie 分組陣列，取代 cookie_name |
| `request_url、request_method、request_headers、request_options` | request／request_sync／binary 的網址、方法、標頭與 HTTP options；binary 固定使用自己的 buffer 型別 |
| `json_url` | JSON API |
| `ws_url、ws_data、ws_headers` | WebSocket |
| `ws_idle` | 持續連線的接收逾時毫秒數，預設 0 關閉；僅用於確定有持續訊息或心跳回覆的來源 |
| `live_danmaku` | true 時，播放回應附上爬蟲即時彈幕來源，使用 ws_url 的文字訊息 |
| `media_url、backup_media_url` | 主要與備用播放網址 |
| `media_urls` | 多畫質 `{values: [{n, v}], position}`，取代主要線 media_url |
| `media_headers、backup_media_headers、media_format` | 播放標頭及格式 |
| `timeshift` | 直播回看 `{url, start, window}`，三語言 Demo 原樣附在播放回應 |
| `subtitles、danmaku、drm` | 字幕物件陣列、彈幕物件陣列及 DRM 物件 |
| `skips、start_position_ms` | 跳過片段與起播位置，時間為毫秒 |
| `sniff_url` | 未填主要播放網址時，交給 App 嗅探的網頁 |

沒有播放網址時顯示提示；有 sniff_url 時回傳 parse=1。直播未填播放網址時回傳空清單。HLS 代理線需使用以 .m3u8 結尾的 media_url。完整附加欄位的組裝方式見對應 Demo 的播放方法。

字幕的 flag=1 為預設選取，flag=2 為強制字幕。skips 的 start／end 是影片開頭起算的毫秒；播放到 start 時跳至 end，ending 可省略 end。

## 網路

Java 使用繼承的 `net`；Python 使用 `self.net`；QuickJS 使用注入的 `net`。下文以 net 簡寫，時間單位為毫秒。Java 的 options 除特別標示外使用 JSON 字串。

### HTTP

只取 JSON 用 `net.json(url, options)`；連線失敗、HTTP 非 2xx 或無效 JSON 會拋出例外。需要狀態碼、錯誤正文或 bytes 時，用 Java／Python `net.req`、QuickJS `await net.http`，分開檢查 error 與 code；Java 先解析 JSON 字串。實作見 Demo 的 `json`／`request` 操作，驗證方式見[接口驗證](../.agents/skills/catvod-spider/references/validation.md)。

Java 只要正文可用 `net.get(url)`、`net.get(url, headers)`、`net.post(url, json, headers)`。網路失敗拋出例外，HTTP 非 2xx 仍保留正文；需要判斷狀態碼時用 net.req。

| HTTP options | 用途 |
| --- | --- |
| `headers` | 標頭物件 |
| `params` | 自動編碼 query，陣列值重複同一個 key |
| `method、data、postType` | POST 資料；postType 為 json／form／form-data |
| `body` | 原始文字，搭配 Content-Type，與 data 擇一 |
| `buffer` | 0 文字、1 byte 陣列、2 Base64；3 在 Python 回傳 bytes、QuickJS 回傳 ArrayBuffer |
| `redirect` | 預設 1 跟隨重新導向，0 不跟隨 |
| `timeout、callTimeout` | 連線讀寫／整次請求逾時，單位毫秒 |
| `cookie` | true 使用 WebView Cookie |

QuickJS 的 http／json／batch／map／ws／cached／download／sleep／openStream／stream 回傳 Promise，取結果時用 await；req 預設同步，refresh 直接返回。獨立請求可並行等待 I/O，JS 與 callback 仍在同一執行緒依序執行；不要同步等待同一 JS 執行緒的 callback。

Python／QuickJS Demo 的 `binary` 操作使用 `buffer: 3`。Python 回傳 bytes，可用 `memoryview(content)[start:end]` 建立切片檢視；QuickJS 回傳 ArrayBuffer，長度用 `content.byteLength`，讀取內容用 `new Uint8Array(content)`。建立檢視不複製原有資料，跨語言傳遞不保證 zero copy。

Python／QuickJS 用 `net.getUserAgent()` 取得 App 的 User-Agent，再按站點需要放進 headers；不會自動套用到每個請求。

### Cookie 與 Session

Cookie 使用 `net.getCookie(url)` 讀取、`net.setCookie(url, cookie)` 寫入。cookie 是單筆 Set-Cookie 格式，寫入回傳布林值；清除可寫入 `Max-Age=0` 的過期 Cookie。站點 net 讀寫 WebView Cookie，請求加 `cookie:true` 才會自動帶入與更新。

隔離 Cookie 用 `net.session()`，在回傳的物件上請求、讀寫 Cookie 與快取；不共用 WebView Cookie 或站點 TTL 快取，也不支援 persist。session 自動帶入與更新自己的 Cookie。Java 用 try-with-resources，Python 用 with，QuickJS 用 try/finally 呼叫 close；關閉會取消其請求、等待、串流與連線，釋放自己的 Cookie 和快取，之後不可繼續使用。

### 並行與等待

批次用 `net.batch(requests, limit)`，每筆為 `{url, options}`，預設最多 4 筆並行、按輸入順序回傳。Java 傳 requests JSON、回傳 Net.Result[]；Python／QuickJS 回傳結果陣列。每筆結果都要檢查狀態。

每項還需快取、簽名或解析時，用 `net.map(items, mapper, limit)`；Java 傳 List，Python 加 self，QuickJS 加 await。mapper 收 `(item, index)`，每次預設最多 4 項並行，按輸入順序回傳；拋錯時停止派送後續項目，已啟動的工作繼續完成。Java／Python 回呼在背景執行緒執行，QuickJS 可用 async，JS 本身仍依序執行；不要修改共用狀態。關閉 net／Session 會取消其網路操作；Java／Python 也會中斷 map 的等待，任意運算或第三方阻塞不保證可強制中止。見 Demo 的 `parallel_map`。

`net.sleep(ms)` 可取消，取消後不繼續請求。

### 下載

下載用 Java `net.download(url, optionsJson, file)`、Python／QuickJS `net.download(url, path, options)`，直接寫檔。相對路徑以 App cache 為基準，父目錄需存在；完整傳輸後才取代目標檔案。下載不回傳 HTTP 狀態，也不會僅因非 2xx 拒絕，檔案內容由呼叫者確認。

Java 需要進度與暫停控制時，使用共用 SDK 的 `Download.create(url, file).start(callback)`，以 `pause()` 暫停、收到 `paused()` 後再次 `start(callback)` 繼續，`cancel()` 取消。預設拒絕非 2xx 與空檔，回呼在主執行緒執行；`progress(total, downloaded, speed)` 的單位是 bytes 與 bytes/s，未知 total 為負數。檔案內容仍須驗證。對話框、暫存檔與資源釋放見 [Market](../app/src/main/java/com/github/catvod/spider/Market.java)。

下載可傳 HTTP options，另支援以下選項：

| options | 用途 |
| --- | --- |
| `maxBytes` | 寫入上限，正整數 bytes；省略時不設上限 |
| `size` | 預期完整大小，正整數 bytes；與實際大小不符時失敗 |
| `threads` | 0（預設）自動選擇，1 單路，2..4 指定分段並行上限 |

共用下載器管理暫存檔，依 GET、Range 與 ETag／Last-Modified 等條件決定續傳與分段；帶 `cookie:true` 或使用 session 時不續傳。Demo 的 download 操作使用預設選項，Python 讀取完成後移除暫存目錄，QuickJS 保留在 App cache。

### 串流讀取與代理

讀取介面提供 `code、headers、contentType`，HTTP 狀態自行判斷；同一 reader 不可並行讀取。三語言 Demo 的 `stream_read` 計算回應大小，`proxy_stream` 經本機代理讀取，均限 15 秒，適用有限長度回應。

| 語言 | 開啟與讀取 | EOF／釋放 |
| --- | --- | --- |
| Java | net.requestStreamAsync(url, NetOptions).get() 取得繼承 InputStream 的 Net.StreamResult | read 回傳 -1；try-with-resources 關閉 |
| Python | self.net.openStream(url, options)；reader.read(size) 回傳 bytes | None；with 或 finally 關閉 |
| QuickJS | await net.openStream(url, options)；await reader.read(size) 回傳 ArrayBuffer | null；finally 關閉 |

Java 等待 Future 被中斷時，取消 Future 並保留中斷狀態，見 Demo 的 openStream。Python／QuickJS 的 size 預設 65,536，範圍 1..1,048,576 bytes。

Java 將 StreamResult 放入 proxy 第三格。Python／QuickJS 原樣轉送用 `net.stream(url, options)`，Python 加上 self；回應的 `code、contentType、stream、headers` 依序放入 proxy 回傳值。成功交付後由 App 關閉 stream，不交付時自行 close；QuickJS handle 只供當次 proxy 使用一次，不存入 Local／快取。

| 語言 | 自訂正文 | 每塊型別 |
| --- | --- | --- |
| Java | proxy 第三格回傳自訂 InputStream | 依 InputStream 介面讀取 |
| Python | `self.net.stream(generator())` | bytes／bytearray／連續 memoryview |
| QuickJS | `await net.stream(asyncGenerator())` | ArrayBuffer／TypedArray |

產生器在播放器讀取時才執行，可依序開啟多個上游請求，不接受 HTTP options。reader 在產生器內開啟，以 with／finally 關閉；App 關閉 body 時取消其等待中的串流請求與讀取，再關閉產生器。Python 無法強制中止任意計算或第三方阻塞操作。見 Python／QuickJS Demo 的 `proxy_body`。

QuickJS 每次拉取沿用站點呼叫逾時，整段輸出不受最初 proxy 方法期限限制。上游直播可用 `callTimeout:0` 關閉整次 HTTP 期限，保留 timeout 防止讀取卡住。串流功能需更新配套 App 與對應模組。

### WebSocket

WebSocket 一次交換用 `net.ws(url, options)`，成功回應 code=101，首個完整訊息放在 content 後關閉。

持續收訊用 `net.connect(url, options, callback)`，立即回傳連線；callback 接收 `(socket, event)`。使用回呼傳入的 socket，避免 open 早於外部變數賦值。切台或 destroy 時呼叫 `close()`；需立即中斷時用 `cancel()`。主動關閉或站點／session 釋放後，不再重連。

實作見三語言 Demo 的 `socket-start`、`socket-state` 與 `socket-stop` 操作。

事件為 open／message／retry／error／close；open 的 code=101，message 包含 binary 與 content，retry 包含 code 及選填 reason／error，表示等待重連；error／close 表示永久結束。二進位 content 在 Java 是 byte[]、Python 是 bytes、QuickJS 是 Uint8Array；文字為字串。send 回傳 false 表示未接受發送，不能當成已送達伺服器。

connect 沿用 headers／params／cookie／session；data 或 body 可指定開啟後的首個文字封包。timeout 為建立連線的期限，成功後不限制連線總時長。ping 是協定 Ping 的間隔，單位毫秒，預設 0 關閉；平台要求的訂閱與應用層心跳仍由爬蟲處理。

`idle` 是未收到文字或二進位訊息的逾時毫秒數，預設 0 關閉。送出訊息或協定 Ping／Pong 不會重設期限；逾時進入錯誤／重連流程。只用於保證有持續訊息或應用心跳回覆的來源。

`reconnect:true` 啟用暫時網路／伺服器錯誤的自動重連，預設 false。等待由 1 秒倍增至 30 秒，連線穩定 30 秒後重設；認證、憑證、協定或 callback 錯誤不重連。每次 open 重新訂閱，retry 時停止心跳並清除殘包，不另設重連計時器。

Java／Python 回呼不保證在主執行緒，操作 UI 時須切回主執行緒。QuickJS 回呼回到其 JS 執行緒，並在爬蟲方法返回後繼續有效。回呼保持簡短；QuickJS 待處理事件超過 256 筆會回報錯誤並取消連線。

### TTL 快取

`net.cached(key, options, loader)` 儲存 loader 回傳的 JSON 資料，同 key 合併載入。Java 的回傳值使用 JSON 字串。

Python `self.net.cachedText(key, options, loader)` 回傳同一項目的 JSON 文字，loader 仍回傳 JSON 資料。大型目錄可按文字重用私有索引，但每次須經原生快取判斷有效期，destroy 時釋放快照。實作見 [Python Demo](../examples/python/spider.py) 的 `ttl_text`；一般資料用 `cached`，每次取得獨立可修改物件。

| options | 用途 |
| --- | --- |
| `ttl` | 必填，毫秒；0 不快取 |
| `stale` | 預設 true，過期先回舊值並背景更新；false 等待新資料 |
| `persist` | 預設 false；true 持久化公開資料，隔離 session 不支援 |

`net.peek(key)` 只讀已有值，包括過期值；`net.refresh(key, options, loader)` 立即返回並依 TTL 背景更新。`net.clearCache(key)` 清一筆，省略 key 清全部並取消載入。快取按站點隔離，可被系統清除；播放網址使用短 TTL、stale:false，不持久化。

### Local

Local 保存小型設定：Java 使用 local、Python 使用 self.local、QuickJS 使用 local，皆提供 `get(key)、set(key, value)、delete(key)`，App 按 Site.key 隔離。Java 使用 JSON 字串，Python／QuickJS 直接存 JSON 值；不存在的 key 回傳 null（Python 為 None）。清快取不會刪除 Local。

## 執行 JavaScript

短段腳本用 `js.eval(source, options)`；Java 的 options 與回傳值使用 JSON 字串，Python 加 self，QuickJS 加 await。每次建立隔離環境，回傳最後一個運算式的 JSON 值；undefined、函式、非有限數值及循環物件會失敗，不接受 Promise。內建 `md5X(text)`，不提供網路、DOM 或模組匯入。

`options.globals` 傳入 JSON 變數，不拼接資料到程式碼，也不能覆蓋 md5X；`options.timeout` 為正整數毫秒，預設 5000。完成、逾時或取消時關閉環境；站點釋放會取消尚未完成的執行。三種語言都需要更新後的 App 與 QuickJS 模組，Python 另需 Python 模組。見 Demo 的 `script`。

## 分頁與超連結

完整清單分頁使用 Java `Response.page(items, page, limit).string()`、Python `self.page(items, pg, limit)`、QuickJS `page(items, pg, limit)`。網站已分頁時使用 `Response.create().vods(items).page(page, pagecount, limit, total).string()`，未知 total 時只填已知欄位。完整單頁清單可用 `.page()`，只輸出 page=1 與 pagecount=1。超連結用 Java `Json.link`、Python `self.link`、QuickJS `link`。

Python／QuickJS 的 page 也可傳第四個參數 `total`。省略時切分完整清單；傳入精確總筆數時，items 使用網站回傳的當頁資料，不再切片。total 未知時直接回傳已知的 page／pagecount／limit，不估算總筆數。

## 直播回看

在播放回應附上 `timeshift`，App 便會顯示可回拉的直播時間軸。來源須確實提供對應時間的內容；未填時沿用原本播放行為。

直播列表的 `Channel.timeshift` 使用相同格式。節目表回看仍用 `catchup`，時間軸以該節目為範圍。

```json
{
  "parse": 0,
  "url": "https://example.com/live.flv",
  "timeshift": {
    "url": "http://127.0.0.1:9978/proxy?do=js&siteKey=demo&time={time}",
    "start": 1792700000000,
    "window": 7200000
  }
}
```

`start` 是本場直播開始的 Unix 毫秒，`window` 是最多可回看的毫秒數。`url` 使用 `getProxyUrl` 產生，保留 `{time}`（亦接受 URL 編碼）；App 以目標 Unix 毫秒取代後 GET，0 表示回到直播。端點回傳直接播放的 `url、header、format` JSON，按來源保留範圍調整邊界，不在本機累積直播。

拖曳至最右側或回到預設位置會重新取得直播來源；連續拖曳與切台會取消舊請求。取源失敗顯示提示並保留目前播放。回看期間暫停爬蟲即時彈幕，回到直播後恢復；一般彈幕檔不受影響。此欄位需搭配支援直播回看的 App。

## 即時彈幕

播放回應的 `danmaku[].url` 用 `getDanmakuUrl(id)` 產生，Python 使用 `self.getDanmakuUrl(id)`；App 呼叫該站點的 `danmaku(id, emit)`。HTTP(S) 來源仍按彈幕檔案載入。

emit 傳入彈幕物件，例如 `{"text":"即時彈幕","color":6737151}`。Java 使用 JSONObject 並呼叫 `emit.accept(item)`、Python 使用 dict、QuickJS 使用物件。

Java 回傳 AutoCloseable，Python／QuickJS 回傳停止函式。切台或關閉時，App 呼叫停止；爬蟲取消自己的連線與心跳，不關閉站點 net。

| 欄位 | 說明 | 預設 |
| --- | --- | --- |
| text | 必填文字，不得全空白，最多 4096 字元 | — |
| color | RGB 整數，0～16777215 | 白色 |
| size | 字級 0～96 sp；0 跟隨使用者設定 | 0 |
| type | 1 滾動、4 底部、5 頂部、6 反向 | 1 |
| colors | 2～8 個 RGB 整數組成漸層；省略時使用 color | — |

狀態也使用 emit，格式為 `{"state":"retrying","msg":"連線中斷，等待恢復"}`，不可同時包含 text。msg 選填，最多 512 字元，不放 Cookie、token 或簽名網址。

| state | 說明 |
| --- | --- |
| ready | 確認訂閱可用；不要僅因 WebSocket open 就回報 |
| retrying | 連線中斷，正在恢復 |
| error | 終止錯誤，不再恢復；App 會停止訂閱並忽略後續回呼 |

connecting 由 App 設定，相同 state／msg 會合併，初始化失敗轉成 error。主動停止時清除狀態，不需回報 closed；狀態只記錄日誌。

爬蟲負責解碼並把平台樣式轉成 RGB／sp；App 按使用者設定顯示，超量或過期訊息可能丟棄。需配套更新 App、runtime 與 catvod-api.jar。

三語言 Demo 的 live_danmaku 以收到首個文字訊息回報 ready；實際站點須依平台確認訂閱並解碼封包。

## QuickJS HTML 欄位解析

`htmlQuery(html, plan)` 一次解析 HTML 並回傳普通物件，不發請求、不保留 DOM。實作見 [QuickJS Demo](../examples/javascript/spider.js) 的 `htmlQueryAction`／`html_query`；欄位、回傳值與限制見 [HTML 查詢參考](html-query.md)。必填值驗證、trim、相對 URL 與去重由爬蟲處理。

## 網頁與本機代理

action 回傳 `web` 開網頁、`msg` 顯示提示。實作見 Demo 的 `web`／`web_view`／`toast` 操作。

url 限 HTTP(S)。一般網頁省略 mode，獨立內容設 mode=view，不啟動外部 App、不自動全螢幕。返回先退出全螢幕，再依歷史回上一頁，沒有歷史才關閉。Java 提示可用 `Response.notify()`。

Cookie 同組全部需要、不同組任一組即可；需有新值且頁面同源。各組可指定 url，未指定時用開啟網址。這是登入完成條件，與 HTTP 的 cookie:true 分開。

直播回傳 `[{name, channel: [{name, urls}]}]`，多線路網址加 `$線路名稱`；TXT／M3U 也可直接回傳文字。

本機代理網址用 `getProxyUrl(params)`，Java 傳 Map，Python 需加 self。App 自動加入 do／siteKey 並編碼 query。proxy 回傳 `[status, mime, body, headers]`；Java body 用 InputStream，Python 可用 bytes，QuickJS 可用文字、byte 陣列、ArrayBuffer 或 TypedArray。EPG 在產生的網址後接 `&date={date}`，由 App 代入日期。

分塊轉送與產生器正文見[串流讀取與代理](#串流讀取與代理)。

## Android UI

Java／Python 的 `getActivity()` 即時取得目前 Activity，可能為 null／None。自訂 Dialog 在主執行緒執行時才取得，不保存 Activity 或自行註冊生命週期 callback。Java 工具類可用 `Runtime.activity()`，Application Context 用 `Runtime.context()`。

共用 SDK 的 `com.github.catvod.Runtime` 提供 Context、Activity 與 Toast；Python 透過 `java.jclass` 呼叫，Toast 由 App 切到主執行緒。實作見 Java／Python Demo 的 `native_toast`／`dialog`。QuickJS 使用 action 回傳值。JAR 的 `com.github.catvod.spider.Init.init(Context)` 是獨立的可選初始化入口。

Java 分享檔案使用 AndroidX FileProvider，authority 為 `context.getPackageName() + ".provider"`，Intent 加 `FLAG_GRANT_READ_URI_PERMISSION`；可分享目錄由 TV 的 file_paths.xml 決定。新增 Android 呼叫需在 TV 的混淆版驗證。
