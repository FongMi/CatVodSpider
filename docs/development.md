# 爬蟲開發

先從 [README](../README.md) 選擇範例並載入配置。三份 Demo 展示共通的分類、清單、播放、網路、儲存與網頁功能，另有各語言的專用操作；實際爬蟲只保留需要的部分。

## 入口

| 用途 | Python | QuickJS | Java |
| --- | --- | --- | --- |
| 初始化 | `init(extend)` | `init(ext)`；`default(site)` 建立實例 | `init(context, extend)` |
| 分類與篩選 | `homeContent(filter)` | `home(filter)` | `homeContent(filter)` |
| 推薦 | `homeVideoContent()` | `homeVod()` | `homeVideoContent()` |
| 分類列表 | `categoryContent(tid, pg, filter, extend)` | `category(tid, pg, filter, extend)` | `categoryContent(tid, pg, filter, extend)` |
| 搜尋 | `searchContent(key, quick, pg)` | `search(key, quick, pg)` | `searchContent(key, quick, pg)` |
| 詳情 | `detailContent(ids)` | `detail(id)` | `detailContent(ids)` |
| 播放 | `playerContent(flag, id, vipFlags)` | `play(flag, id, vipFlags)` | `playerContent(flag, id, vipFlags)` |
| 操作 | `action(value)` | `action(value)` | `action(value)` |
| 直播 | `liveContent(url)` | `live(url)` | `liveContent(url)` |
| 本機代理 | `localProxy(params)` | `proxy(params)` | `proxy(params)` |
| 嗅探判斷 | `manualVideoCheck()`／`isVideoFormat(url)` | `sniffer()`／`isVideo(url)` | `manualVideoCheck()`／`isVideoFormat(url)` |
| 釋放 | `destroy()` | `destroy()` | `destroy()` |

Python 資料方法回傳 dict／list；QuickJS 回傳物件／陣列，Promise 由 App 等待；Java Demo 用 Gson 組裝標準 JSON 字串。proxy 與布林接口維持各自格式。QuickJS 的 detail 收單一 ID，Python／Java 收 ID 集合。

Java 使用本專案 `com.github.catvod.bean` 的純資料模型，以 `Vod.create().id("123").name("影片")` 填值；模型統一以 `create()` 建立，鏈式方法不加 `set` 前綴。篩選選項使用 `Value`，影片樣式使用 `Style`，資料夾分類樣式使用 `Cate`。`com.github.catvod.utils.Response` 用 Gson 組裝 JSON、分頁與輸出，兩者隨爬蟲 JAR 打包；App 的 `Result` 只負責接收及解析。

`Response.create().vod(vod).string()` 回傳詳情，`Response.create().classes(classes).filters(filters).string()` 回傳分類與篩選。其他欄位可用 `put(name, value)`；明確的 `0`／`false` 保留，值為 `null` 的模型欄位省略。也可直接使用 Gson 組裝標準 JSON，不必依賴 App 的 Java 模型。

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

例如播放回傳可直接鏈式組裝：

```java
return Response.create().url("https://example.com/video.m3u8")
        .danmaku(List.of(Danmaku.create().name("彈幕").url("https://example.com/danmaku.xml")))
        .subs(List.of(Sub.create().name("繁體中文").url("https://example.com/sub.vtt").format("vtt").flag(1)))
        .skips(List.of(SkipSegment.create().type("opening").start(0).end(90000)))
        .position(0).string();
```

`Response` 也提供 `playUrl、artwork、jxFrom、flag、desc、format、click、key、position、code、msg` 鏈式方法。上述播放與網頁模型未填的可選欄位省略；`ending` 片段可不呼叫 `.end()`，Web Cookie 未填 `.url()` 時使用網頁網址。多畫質的 position 是從 0 開始的索引，與回應頂層以毫秒計的起播 position 不同。

Java 的 `Sub.format(ext)` 傳入字幕副檔名，例如 `vtt`、`srt`、`ass`，由模型呼叫 `VodUtil.getSubMimeType(ext)` 轉成 MIME；回傳 JSON 的 `subs[].format` 仍使用 MIME。

有分頁的分類與搜尋回傳 `list、page、pagecount、limit`；有精確總筆數時加 `total`。完整單頁清單回傳 `list、page=1、pagecount=1`，`limit` 與 `total` 可省略。`page < pagecount` 才會繼續載入，不另寫 loadMore。網站已分頁時直接回傳當頁，不再次切片，也不以頁數乘頁大小推算 total；最小 JSON 見[技能的分頁範例](../.agents/skills/catvod-spider/SKILL.md#網站已分頁)。`filters` 的鍵對應分類 `type_id`，只加入站點支援的篩選。

線路用 `$$$` 分隔，每線集數用 `#`，每集為 `名稱$播放值`。清理名稱中的分隔符；播放值可用自訂 ID，在播放時取得實際網址。

VOD 的 `style.type` 支援 rect／oval／list，同頁保持一致；分類使用 land／circle／ratio。資料夾、action 卡片與演員超連結見 Demo。Site.lang 由 App 處理搜尋語系，爬蟲不轉字。

## Demo 選項

選項放在 Site.ext 或直播 ext，使用到的功能才需要填。Demo 內建 12 筆虛構影片，搜尋「示範」可檢查搜尋分頁；點「互動功能」分類的卡片可操作網路與儲存。

| ext | 用途 |
| --- | --- |
| `image_base` | 封面網址前綴，留空使用 App 預設圖 |
| `web_url、game_url、cookie_name` | 一般網頁、獨立內容及單一登入 Cookie；game_url 留空時使用 web_url |
| `web_cookie` | 登入 Cookie 分組陣列，取代 cookie_name |
| `request_url、request_method、request_headers、request_options` | HTTP 操作；options 可設定 params／data／body／buffer |
| `json_url` | JSON API |
| `ws_url、ws_data、ws_headers` | WebSocket |
| `media_url、backup_media_url` | 主要與備用播放網址 |
| `media_urls` | 多畫質 `{values: [{n, v}], position}`，取代主要線 media_url |
| `media_headers、backup_media_headers、media_format` | 播放標頭及格式 |
| `subtitles、danmaku、drm` | 字幕、彈幕及 DRM |
| `skips、start_position_ms` | 跳過片段與起播位置，時間為毫秒 |
| `sniff_url` | 未填主要播放網址時，交給 App 嗅探的網頁 |

沒有播放網址時顯示提示；有 sniff_url 時回傳 parse=1。直播未填播放網址時回傳空清單。HLS 代理線需使用以 .m3u8 結尾的 media_url。完整附加欄位的組裝方式見對應 Demo 的播放方法。

QuickJS 的 HTML 解析、二進位、並行映射與串流操作，需搭配支援這些介面的 runtime 模組。

字幕的 flag=1 為預設選取，flag=2 為強制字幕。skips 的 start／end 是影片開頭起算的毫秒；播放到 start 時跳至 end，ending 可省略 end。

## 網路

Python 使用 `self.net`；QuickJS 使用注入的 `net`；Java 使用繼承的 `net`。下文以 net 簡寫，Java 的 options 使用 JSON 字串。

只取 JSON 時使用 `net.json(url, options)`，實作見三語言 Demo 的 JSON 請求操作。

連線失敗、HTTP 非 2xx 或無效 JSON 會拋出例外。需要自行處理狀態碼、錯誤正文或 bytes 時，用 Python `self.net.req`、QuickJS `await net.http`、Java `net.req`；分開檢查回應的 error 與 code。Java 先解析回傳的 JSON 字串。回應格式與不依賴 TV repo 的主機驗證方法見[接口驗證](../.agents/skills/catvod-spider/references/validation.md)。

| HTTP options | 用途 |
| --- | --- |
| `headers` | 標頭物件 |
| `params` | 自動編碼 query，陣列值重複同一個 key |
| `method、data、postType` | POST 資料；postType 為 json／form／form-data |
| `body` | 原始文字，搭配 Content-Type，與 data 擇一 |
| `buffer` | 0 文字、1 byte 陣列、2 Base64；3 在 Python 回傳 bytes、QuickJS 回傳 ArrayBuffer |
| `timeout、callTimeout` | 連線讀寫／整次請求逾時，單位毫秒 |
| `cookie` | true 使用 WebView Cookie |

QuickJS 的 http／json／batch／map／ws／cached／download／sleep／openStream／stream 回傳 Promise，取結果時用 await；req 預設同步，refresh 直接返回。獨立請求可並行，不要同步等待同一 JS 執行緒的 callback。

Demo 的 `binary` 操作使用 `buffer: 3`。QuickJS 回傳 ArrayBuffer，長度用 `content.byteLength`，讀取內容用 `new Uint8Array(content)`；Python 回傳 bytes，可用 `memoryview(content)[start:end]` 建立切片檢視。建立檢視不複製原有資料，跨語言傳遞不保證 zero copy。

隔離 Cookie 用 `net.session()`，Python 用 with，QuickJS／Java 用 try/finally 關閉。

Java 只要正文可用 `net.get(url)`、`net.get(url, headers)`、`net.post(url, json, headers)`。網路失敗拋出例外，HTTP 非 2xx 仍保留正文；需要判斷狀態碼時用 net.req。

批次用 `net.batch(requests, limit)`，每筆為 `{url, options}`，預設最多 4 筆並行、按輸入順序回傳。Python／QuickJS 回傳結果陣列；Java 傳 requests JSON、回傳 Net.Result[]。每筆結果都要檢查狀態。

QuickJS 需要在每筆請求後解析或轉換資料時，可用 `await net.map(items, async (item, index) => result, limit)`；預設並行上限 4，按輸入順序回傳結果。回呼拋出錯誤時整批拒絕並停止啟動後續項目，已啟動的工作繼續完成。Demo 的 `parallel_map` 使用上限 2 請求 request_url 與 json_url，回傳各項索引與狀態；回呼自行檢查 HTTP 狀態。

WebSocket 一次交換用 `net.ws(url, options)`，成功回應 code=101，首個完整訊息放在 content 後關閉。

持續收訊用 `net.connect(url, options, callback)`，立即回傳連線；callback 接收 `(socket, event)`。使用回呼傳入的 socket，避免 open 早於外部變數賦值。切台或 destroy 時呼叫 `close()`；需立即中斷時用 `cancel()`。站點或 session 釋放時也會取消其連線，不自動重連。

實作見三語言 Demo 的 `socket-start`、`socket-state` 與 `socket-stop` 操作。

事件為 open／message／error／close；open 的 code=101，message 包含 binary 與 content，error 包含 error，close 包含 code 與 reason。二進位 content 在 Python 是 bytes、QuickJS 是 Uint8Array、Java 是 byte[]；文字為字串。send 接受文字或上述二進位資料，回傳 false 表示未接受發送，不能當成已送達伺服器。

connect 沿用 headers／params／cookie／session；data 或 body 可指定開啟後的首個文字封包。timeout 為建立連線的期限，成功後不限制連線總時長。ping 是協定 Ping 的間隔，單位毫秒，預設 0 關閉；平台要求的訂閱與應用層心跳仍由爬蟲處理。

Java／Python 回呼不保證在主執行緒，操作 UI 時須切回主執行緒。QuickJS 回呼回到其 JS 執行緒，並在爬蟲方法返回後繼續有效。回呼保持簡短；QuickJS 待處理事件超過 256 筆會回報錯誤並取消連線。

下載用 Python／QuickJS `net.download(url, path, options)`、Java `net.download(url, optionsJson, file)`，直接寫檔。相對路徑以 App cache 為基準，父目錄需存在，失敗後的部分檔案由呼叫者處理。

`net.sleep(ms)` 可取消，取消後不繼續請求。

## QuickJS 分塊讀取

`await net.openStream(url, options)` 取得 `code、headers、contentType、read、close`。`await reader.read(size)` 回傳 ArrayBuffer，EOF 回傳 null；預設每塊 65,536 bytes，size 範圍為 1..1,048,576，同一 reader 同時只能有一次 read。

```javascript
const reader = await net.openStream(url, {timeout: 15000, callTimeout: 15000});
try {
    if (reader.code < 200 || reader.code >= 300) throw new Error(`HTTP ${reader.code}`);
    for (;;) {
        const chunk = await reader.read(65536);
        if (chunk === null) break;
        // 在此處理 new Uint8Array(chunk)，不要累積整份回應。
    }
} finally { reader.close(); }
```

Demo 的 `stream_read` 逐塊計算 request_url 的 bytes，不保存完整正文；`proxy_stream` 經本機代理完成同樣操作。兩者用有限長度的 HTTP 回應測試，整次請求限 15 秒。`net.stream` 則把正文交給 App 的 proxy，不提供 read；用法見下方 proxy 說明。

## QuickJS HTML 欄位解析

全域 `htmlQuery(html, plan)` 一次解析 HTML，回傳普通物件；不發出網路請求，也不保留 DOM。Demo 的 `html_query` 操作不需要外部站點，示範取 ID、標題及多位演員：

```javascript
const {videos} = htmlQuery(html, {
    queries: {
        videos: {
            selector: "article.video",
            fields: {
                id: {attribute: "data-id"},
                title: {selector: "h2"},
                actors: {selector: ".actor", all: true},
            },
        },
    },
});
```

每個 query 的 selector 選列，fields 的 selector 選該列的子孫；省略欄位 selector 就讀該列本身。attribute 讀屬性，省略則讀文字；all:true 回傳陣列。缺少節點／屬性回傳 null，all:true 沒有匹配時回傳空陣列。

必填欄位驗證、trim、相對 URL 補全及去重由爬蟲處理；解析失敗不能偽裝成成功空列表。選擇器與 HTML 使用 Jsoup 規則，欄位與限制見 [HTML 查詢參考](html-query.md)。

## 快取與儲存

`net.cached(key, options, loader)` 儲存 loader 回傳的 JSON 資料，同 key 合併載入。Java 的回傳值使用 JSON 字串。

Python 的 `self.net.cachedText(key, options, loader)` 回傳同一快取項目的 JSON 文字；loader 仍回傳 dict／list 等 JSON 資料。大型目錄可依文字內容是否改變，重用爬蟲私有的解析結果與搜尋索引。每次使用仍須呼叫 cachedText，由原生快取決定有效期、更新與清除；destroy 時釋放私有快照。`cached()` 維持每次回傳獨立可修改物件的行為。

Python Demo 的 `ttl_text` 操作直接展示這段文字，與 `ttl_cache`／`ttl_peek` 共用 `demo:ttl`；`ttl_clear` 會清除同一項目。此操作需要提供 cachedText 的 Python runtime 模組；一般已解析資料繼續使用 cached，不必每次先 cachedText 再 json.loads。

| options | 用途 |
| --- | --- |
| `ttl` | 必填，毫秒；0 不快取 |
| `stale` | 預設 true，過期先回舊值並背景更新；false 等待新資料 |
| `persist` | 預設 false；true 持久化公開資料，隔離 session 不支援 |

`net.peek(key)` 只讀已有值，包括過期值；`net.refresh(key, options, loader)` 立即返回並依 TTL 背景更新。`net.clearCache(key)` 清一筆，省略 key 清全部並取消載入。快取按站點隔離，可被系統清除；播放網址使用短 TTL、stale:false，不持久化。

Local 保存小型設定：Python `self.local`、QuickJS／Java `local` 使用 `get(key)、set(key, value)、delete(key)`，App 按 Site.key 隔離。Python／QuickJS 直接存 JSON 值，Java 使用 JSON 字串；不存在的 key 回傳 None／null。清快取不會刪除 Local。

完整清單分頁使用 Python `self.page(items, pg, limit)`、QuickJS `page(items, pg, limit)`、Java `Response.page(items, page, limit).string()`。網站已分頁時使用 `Response.create().vods(items).page(page, pagecount, limit, total).string()`，未知 total 時只填已知欄位。完整單頁清單可用 `.page()`，只輸出 page=1 與 pagecount=1。超連結用 Python `self.link`、QuickJS `link`、Java `Json.link`。

## 網頁、直播與 proxy

action 回傳 JSON 即可開網頁或顯示提示：

```json
{"web": {"url": "https://example.com/login", "cookie": [{"keys": ["sid", "token"]}]}}
```

url 限 HTTP(S)。一般網頁省略 mode，獨立內容使用 `"mode": "view"`，不啟動外部 App、不自動全螢幕。返回先退出全螢幕，再依網頁歷史回上一頁，沒有歷史才關閉。提示回傳 `{"msg": "訊息"}`；Java 可用 `Response.notify("訊息")`。

Cookie 同組全部需要、不同組任一組即可；需有新值且頁面同源。各組可指定 url，未指定時用開啟網址。這是登入完成條件，與 HTTP 的 cookie:true 分開。

直播回傳 `[{name, channel: [{name, urls}]}]`，多線路網址加 `$線路名稱`；TXT／M3U 也可直接回傳文字。

本機代理網址用 `getProxyUrl(params)`，Python 需加 self，Java 傳 Map。App 自動加入 do／siteKey 並編碼 query。proxy 回傳 `[status, mime, body, headers]`；Python body 可用 bytes，QuickJS 可用文字、byte 陣列、ArrayBuffer 或 TypedArray，Java 用 InputStream。EPG 在產生的網址後接 `&date={date}`，由 App 代入日期。

QuickJS 原樣轉送上游正文時，可直接交出 `net.stream` 的 handle：

```javascript
async function proxy(params) {
    const response = await net.stream(url, {timeout: 15000, callTimeout: 15000});
    return [response.code, response.contentType, response.stream, response.headers];
}
```

成功回傳後由 App 接管並關閉 stream；如果不回傳這個正文，呼叫 `response.stream.close()`。handle 只能在當次 proxy 呼叫交付一次，不可存入 Local／快取或傳到其他呼叫。Demo 的 `demo=stream` 分支原樣轉送 request_url，既有 playlist 分支仍負責產生 HLS 清單；需要改寫正文時使用文字或 bytes 模式。

## Android UI

Java／Python 的 `getActivity()` 即時取得目前 Activity，可能為 null／None。自訂 Dialog 在主執行緒執行時才取得，不保存 Activity 或自行註冊生命週期 callback。Java 工具類可用 `Runtime.activity()`，Application Context 用 `Runtime.context()`。

Java 的執行中提示用 `Runtime.toast("訊息")`；Python 可用 `jclass("com.github.catvod.Runtime").toast("訊息")`，需先 `from java import jclass`。App 自動切主執行緒。QuickJS 使用 action JSON，沒有 Java 反射。

共用 SDK 使用 `com.github.catvod.Runtime` 提供 Context、Activity 與 Toast，Java 需匯入這個類別。JAR 自己的 `com.github.catvod.spider.Init.init(Context)` 是獨立的可選初始化入口。

Java 分享檔案使用 AndroidX FileProvider，authority 為 `context.getPackageName() + ".provider"`，Intent 加 `FLAG_GRANT_READ_URI_PERMISSION`；可分享目錄由 TV 的 file_paths.xml 決定。新增 Android 呼叫需在 TV 的混淆版驗證。
