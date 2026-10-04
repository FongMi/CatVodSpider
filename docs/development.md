# 爬蟲開發

本專案使用 TV 提供的執行環境。Python 是 Chaquopy，JS 是 QuickJS；QuickJS 的 `net`、`local` 等由 App 注入，不是 Node.js。Java 使用 `catvod-api.jar` 編譯，在 TV 內取得實作。

## 目錄

| 目錄 | 內容 |
| --- | --- |
| `app/src/main/java/com/github/catvod/spider` | Java 爬蟲 |
| `app/libs/catvod-api.jar` | TV 產生的編譯 API，使用 compileOnly |
| `examples/python` | 可直接載入的 Python 範例，也可放自己的 PY 及相對路徑依賴 |
| `examples/javascript` | 可直接載入的 QuickJS 範例，也可放自己的 JS 及相對路徑依賴 |
| `examples/config.json` | 三種語言的點播與直播配置 |
| `json`、`jar` | 現有 Java 爬蟲配置及成品 |
| `docs` | 接口與用法說明 |
| `.agents/skills/catvod-spider` | 專案內的 AI 開發 skill |

新增爬蟲時先從對應的 demo 複製，刪掉站點用不到的功能。完整範例便於查接口，實際爬蟲不必保留所有功能。三種語言的共同操作順序一致，各自保留執行環境支援的功能。

## Java 共用類別

SDK 準備與打包命令見 [README](../README.md#java-sdk)。`catvod-api.jar`、AndroidX、Gson、OkHttp、SMBJ 與 QuickJS API 使用 `compileOnly`，版本與 TV 對齊；WebDAV 的 Sardine AAR 由 `extractSardine` 抽取 `classes.jar` 供編譯。這些實作及原生庫由 TV 提供；爬蟲使用的 jsoup 保留 `implementation`。

SDK 提供 `com.github.catvod.bean` 的 `Class`、`Danmaku`、`Filter`、`Result`、`Sub`、`Vod`，含 `Filter.Value`、`Vod.Style`，可直接組裝回應，例如 `Result.string(...)` 或 `Result.get().url(...).string()`。App 保留公開名稱與 Gson 欄位，爬蟲不再複製同名類別。

`com.github.catvod.utils` 提供 `Crypto`、`Json`、`Path`、`Prefers`、`UriUtil`、`Util`。例如 `Json.safeObject(new Gson().toJsonTree(extend))` 讀取選項，`new File(Path.tv(), ".catalog")` 指定快取檔案；`Prefers` 使用 App 的預設 SharedPreferences。日誌使用 `com.github.catvod.crawler.SpiderDebug`，JS parser 的陣列轉換使用 `com.fongmi.quickjs.utils.JSUtil`。剪貼簿直接使用 Android `ClipboardManager`；容量格式化、影片／字幕判斷、縮圖與安裝檔等功能仍留在爬蟲。

## 範例配置

`examples/config.json` 使用相對路徑載入 Python、QuickJS 與 Java Demo。Java 的 `csp_Demo` 位於 `app/src/main/java/com/github/catvod/spider/Demo.java`，先執行 `spiderJar` 產生配置引用的 JAR，並保留 `examples` 與 `jar` 的相對位置。內建 12 筆虛構影片，搜尋「示範」可測試搜尋分頁；將目錄換成站點 API 或 HTML 解析結果，其他接口仍維持相同格式。

三份 demo 的功能入口一致，從「互動功能」分類點卡片即可執行操作。詳細說明集中在本文，實際爬蟲只保留需要的部分。

| 功能 | 三種語言的範例 |
| --- | --- |
| 卡片與分類 | 直式、橫式、圓形、列表；分類 land／circle／ratio；資料夾與 action 卡片 |
| 清單 | 篩選、推薦、分類及搜尋分頁；演員／導演超連結 |
| 播放 | 主要／備用線、多畫質 URL、嗅探、HLS proxy、標頭、格式、起播位置 |
| 播放附加資料 | 字幕及選取 flag、彈幕、DRM、片頭／片中／片尾跳過 |
| 網路 | 完整 HTTP、嚴格 JSON、二進位、隔離 Session、並行請求、WebSocket、可取消等待、串流下載 |
| 儲存 | Local JSON 讀寫刪、TTL、peek、持久化、背景更新、清一筆／全部 |
| 網頁 | 一般網頁、獨立內容視窗、多組登入 Cookie、Cookie 檢查及清除 |
| 直播與 proxy | Group／channel／多線路；JSON endpoint 與 HLS master playlist |
| 語言專屬 | Python／Java：目前 Activity、自訂 Dialog、Init.toast；QuickJS：注入的 UA／加密 bridge；Java：net.get／post |

以下選項放在點播 Site.ext 或直播 ext，只有使用到的功能才需填寫。

| ext | 用途 |
| --- | --- |
| `image_base` | 封面網址前綴；留空使用 App 預設圖 |
| `web_url`、`game_url`、`cookie_name` | 一般網頁、獨立內容、單一登入 Cookie；未填 game_url 時使用 web_url |
| `web_cookie` | 完整 Cookie 分組陣列；有填時取代 cookie_name 的單組條件 |
| `request_url`、`request_method`、`request_headers`、`request_options` | HTTP 操作；request_options 可帶 params／data／body／buffer 等共用 options |
| `json_url` | 嚴格 JSON 請求操作，需回傳有效 JSON |
| `ws_url`、`ws_data`、`ws_headers` | WebSocket 操作示範 |
| `media_url`、`backup_media_url` | 主要與備用播放網址 |
| `media_urls` | 主要線的多畫質物件，含 values 與 position；取代主要線的 media_url |
| `media_headers`、`backup_media_headers`、`media_format` | 播放標頭與格式 |
| `subtitles`、`danmaku`、`drm` | 字幕、彈幕與 DRM 回應 |
| `skips`、`start_position_ms` | 片段跳過與起播位置，時間均為毫秒 |
| `sniff_url` | 未設定主要播放網址時交給 App 嗅探的網頁網址 |

未設定播放網址時回傳提示；若有 sniff_url 則回傳 parse=1 交由 App 嗅探。直播未填 media_url／backup_media_url 時回傳空清單。HLS 代理線需設定以 .m3u8 結尾的 media_url。Site.lang 由 App 處理搜尋語系，爬蟲不轉字。Python 主檔與依賴依 site key／來源隔離，更新後重新載入配置或重啟 App，新實例才讀取新內容。

下列是播放附加選項；字幕 flag=2 表示強制字幕，flag=1 表示預設選取。skips 的 start 是片段開始時間，end 是要跳到的影片時間，兩者都從影片開頭起算。ending 可省略 end，表示從 start 起跳過片尾。

```json
{
  "media_urls": {"values": [{"n": "720p", "v": "https://example.com/720.m3u8"}, {"n": "1080p", "v": "https://example.com/1080.m3u8"}], "position": 0},
  "start_position_ms": 5000,
  "subtitles": [{"name": "繁體中文", "url": "https://example.com/sub.vtt", "lang": "zh-TW", "format": "text/vtt", "flag": 2}],
  "danmaku": [{"name": "彈幕", "url": "https://example.com/danmaku.xml"}],
  "drm": {"type": "clearkey", "key": "https://example.com/license", "header": {}, "forceKey": false},
  "skips": [{"type": "opening", "start": 0, "end": 90000}, {"type": "middle", "start": 600000, "end": 630000}, {"type": "ending", "start": 1200000}]
}
```

## 方法

| 用途 | Python | QuickJS | Java |
| --- | --- | --- | --- |
| 初始化 | `init(extend)` | `init(ext)`；`default(site)` 建立實例 | `init(context, extend)` |
| 分類與篩選 | `homeContent(filter)` | `home(filter)` | `homeContent(filter)` |
| 推薦 | `homeVideoContent()` | `homeVod()` | `homeVideoContent()` |
| 分類列表 | `categoryContent(tid, pg, filter, extend)` | `category(tid, pg, filter, extend)` | `categoryContent(tid, pg, filter, extend)` |
| 搜尋 | `searchContent(key, quick, pg)` | `search(key, quick, pg)` | `searchContent(key, quick, pg)` |
| 詳情 | `detailContent(ids)`，ID 陣列 | `detail(id)`，單一 ID | `detailContent(ids)`，ID List |
| 播放 | `playerContent(flag, id, vipFlags)` | `play(flag, id, vipFlags)` | `playerContent(flag, id, vipFlags)` |
| 操作 | `action(value)` | `action(value)` | `action(value)` |
| 直播 | `liveContent(url)` | `live(url)` | `liveContent(url)` |
| 本機代理 | `localProxy(params)` | `proxy(params)` | `proxy(params)` |
| 嗅探判斷 | `manualVideoCheck()`／`isVideoFormat(url)` | `sniffer()`／`isVideo(url)` | `manualVideoCheck()`／`isVideoFormat(url)` |
| 釋放 | `destroy()` | `destroy()` | `destroy()` |

Python 資料方法回傳 dict／list；QuickJS 資料方法回傳物件／陣列，Promise 會由 App 等待。App 將資料轉成 JSON；直播也可直接回傳 Group 陣列，TXT／M3U 仍使用文字。Java 回傳 JSON 字串，可用 SDK 的 `Result`、`Vod`、`Filter` 等模型。`proxy` 的 bytes／陣列與影片判斷的布林不做 JSON 轉換。

篩選的 key 必須對應分類 `type_id`，只加入站點能實現的項目。分類與搜尋都接收 `pg`，回傳 `list`、`page`、`pagecount`、`limit`、`total`。`page < pagecount` 才會繼續載入，沒有額外的 loadMore 入口。空結果應提供正確的分頁資訊；無法取得資料時保留可判讀的錯誤。

`vod_play_from` 的線路以 `$$$` 分隔；`vod_play_url` 的線路也用 `$$$`，每線各集用 `#`，每集用 `名稱$播放值`。先清理名稱中的分隔符，播放值可用穩定的自訂 ID，在 play 取得實際網址。不要將會過期的播放網址放進長期列表快取。

`Vod.style` 支援 `rect`、`oval`、`list`；同頁保持一致，App 以第一筆的 style 決定整頁。分類也可用 `land`、`circle`、`ratio`。資料夾、演員連結及 action 卡片的格式均在 demo 中示範。

## 網路與生命週期

```python
response = self.net.req(url, {"params": {"page": 1}, "timeout": 15000, "callTimeout": 15000})
if response.get("error"):
    raise RuntimeError(response["error"])
if response["code"] != 200:
    raise RuntimeError("HTTP %s" % response["code"])
```

```javascript
const response = await net.http(url, {params: {page: 1}, timeout: 15000, callTimeout: 15000});
if (response.error) throw new Error(response.error);
if (response.code !== 200) throw new Error(`HTTP ${response.code}`);
```

```java
JSONObject response = new JSONObject(net.req(url, "{\"timeout\":15000,\"callTimeout\":15000}"));
if (response.has("error")) throw new IOException(response.getString("error"));
if (response.getInt("code") != 200) throw new IOException("HTTP " + response.getInt("code"));
```

三種語言共用 App 的 OkHttp、DNS、代理與連線池。HTTP 狀態碼和網路 `error` 分開處理；403、登入頁或解析失敗不能當作正常空列表。`timeout`／`callTimeout` 單位是毫秒。Python `self.net.req` 同步；QuickJS `net.req` 預設同步，`net.http` 預設 Promise，可用 `Promise.all` 並行獨立請求；不要同步等待依賴同一個 JS 執行緒的 callback。

options 的 `headers` 是標頭物件，`params` 自動編碼 query；陣列值會重複同一個 key。POST 用 `data` 搭配 `postType`（json/form/form-data），或用 `body` 搭配 Content-Type 傳原始字串，兩者擇一。`buffer` 為 0 時回傳文字，1 為 byte 數值陣列，2 為 Base64，3 為原始 bytes。`timeout` 控制連線、讀寫；`callTimeout` 控制整次 HTTP 請求，預設 0。

Java 只需要正文時直接使用 App 的文字方法，不再自行組裝及解析網路回應 JSON：

```java
String text = net.get(url);
String result = net.post(url, json, headers);
```

GET 可用 `net.get(url, headers)` 指定標頭，或 `net.get(url, 3000)` 設定 timeout；POST 不帶 headers 時可用 `net.post(url, json)`。GET／POST 文字方法預設 timeout 為 15000 毫秒；POST 的 json 保留原始文字，未指定 Content-Type 時使用 `application/json; charset=utf-8`。網路失敗拋出例外，HTTP 非 2xx 保留正文；要判斷狀態碼或設定完整 options 時使用 `net.req`，其預設 timeout 為 10000 毫秒。Python 與 QuickJS 維持原入口和回傳物件。

`cookie: true` 使用 WebView Cookie。Python `self.net.session()`、QuickJS `net.session()`、Java `net.session()` 使用獨立 Cookie，適合一次播放解析的連續請求，用完關閉。Net 在 init 前由 App 注入，爬蟲釋放時由 App 關閉；自己建立的資源仍要釋放。Python 可使用 with，QuickJS／Java 使用 try/finally。

只需要 JSON 資料時，Python 用 `self.net.json(url, options)`、QuickJS 用 `await net.json(url, options)`、Java 用 `net.json(url, optionsJson)`。連線失敗、HTTP 非 2xx 或 JSON 格式錯誤會拋出例外／reject；需要自行處理 401／403、讀取錯誤正文或 bytes 時使用完整 `net.req`／`net.http`。

共用快取使用 Python `self.net.cached(key, options, loader)`、QuickJS `await net.cached(key, options, loader)`、Java `net.cached(key, optionsJson, loader)`。

| options | 用途 |
| --- | --- |
| `ttl` | 必填，毫秒；0 直接載入，不寫入快取 |
| `stale` | 預設 true；過期先回舊值、背景更新。false 時等待新資料 |
| `persist` | 預設 false；true 將公開 JSON 資料與時間按 site key 持久化 |

第一次載入等待 loader，同 key 合併請求；loader 驗證成功才回傳 JSON 值，失敗拋出例外。每個 key 使用一致的資料及 options。記憶體最多 64 筆，關閉時取消載入；隔離 session 不支援 persist。公開分類可用 persist，會過期的播放網址只用短 TTL、stale:false，不持久化。

Python `self.net.clearCache(key)`、QuickJS `net.clearCache(key)`、Java `net.clearCache(key)` 清除一筆；省略 key 清除目前爬蟲的全部 TTL 快取，含持久化資料，並取消正在載入的值。取消後的舊結果不會寫回。

Python `self.net.peek(key)`、QuickJS `net.peek(key)`、Java `net.peek(key)` 只讀已有值，包括過期值，不發出請求或延長 TTL；沒有資料回傳 None／null。Python／JS 回傳 JSON 值，Java 回傳 JSON 字串。需要先顯示舊資料時使用 peek，再呼叫 refresh 背景更新；播放網址使用 stale:false 等待有效值。

demo 的「持久化快取」保存公開時間戳，重新載入同一個 Site.key 後可讀取。「立即回快取、背景更新」先回覆目前值，再排程 refresh，首次沒有值也立即回覆；稍後重點卡片可看到更新時間。這個範例的 loader 只產生公開 JSON，可替換為 net.json。清除 TTL 快取不會刪除 Local。

```java
String value = net.cached("catalog", "{\"ttl\":600000,\"persist\":true}", () -> net.json(url, "{}"));
String saved = net.peek("catalog");
net.clearCache("catalog");
```

Local 直接讀寫 JSON 值：Python `self.local.get/set/delete(key)`、QuickJS `local.get/set/delete(key)`、Java 繼承的 `local.get/set/delete(key)`；set 另外接 value。App 自動按 Site.key 隔離，不經本地 HTTP。Python／JS 支援字串、數字、布林、null／None、陣列／list、物件／dict；不存在的 key 回傳 null／None，get 可帶預設值。Java 使用 JSON 字串，未存值回傳 null。

完整清單用 Python `self.page(items, pg, limit)`、QuickJS `page(items, pg, limit)`；API 已分頁時再傳 total 總筆數，不會重複切片。Java 完整清單用 `Result.page(items, page, limit).string()`，API 分頁保留 `Result.get().vod(items).page(page, pagecount, limit, total).string()`。空清單 pagecount 為 1。超連結用 Python `self.link(name, target)`、QuickJS `link(name, target)`、Java `Json.link(name, targetJsonObject)`；target 的 id、name、type_flag 與 filter 由站點決定。

`sleep` 的單位也是毫秒，取消時拋出例外／reject，不要捕捉後繼續請求。`ws` 完成一次訊息交換並回傳首個完整文字訊息，成功 code=101；data 可為物件或字串，timeout 包含連線與等待訊息，不會自動重連。Cookie、token、簽名網址及回應內容不要放進 log、提示或長期 Local。

批次請求使用 Python `self.net.batch(requests, limit=4)`、QuickJS `await net.batch(requests, limit=4)`、Java `net.batch(requestsJson, limit)`。每筆為 `{"url":"https://example.com/api","options":{"timeout":10000}}`；options 可省略。預設每批最多 4 筆並行，依輸入順序回傳。HTTP 403 等狀態保留在結果內，不等於整批成功；Python／JS 回傳一般網路結果陣列，Java 回傳 `Net.Result[]`，正文用 `text()` 或 `body`。

背景快取更新使用 Python `self.net.refresh(key, options, loader)`、QuickJS `net.refresh(key, options, loader)`、Java `net.refresh(key, optionsJson, loader)`，呼叫後立即返回。仍遵守 TTL 與共用載入規則；未到期不重抓，載入錯誤寫入 log。`peek` 只讀已有值，即使過期也可取得；`refresh` 不會把讀到的舊值重新標成新鮮。

每個網路 owner 的記憶體快取最多 64 筆、16 MiB 字串容量；持久快取保存於 App cache，每站最多 64 個檔案、16 MiB，超額移除最早更新的檔案。超大值仍回傳給當次呼叫，但不保留在相應快取。系統可清除 cache；需要永久保存的小型設定用 Local。這版改用檔案儲存，原 SharedPreferences 快取不搬移，首次會重新取得公開資料。

檔案下載使用 Python `self.net.download(url, path, options)`、QuickJS `await net.download(url, path, options)`、Java `net.download(url, optionsJson, file)`；直接串流寫入檔案，不先回傳整份 bytes。相對路徑以 App cache 為基準，父目錄需已存在。下載失敗會拋出例外，已寫入的部分檔案由呼叫者處理。Python／Java demo 用完移除暫存檔；JS demo 寫入固定名稱的 App cache。

Python 線上原始碼、相對依賴以及 QuickJS 遠端 module 使用 App 的 HTTP 連線池。QuickJS 同 URL 的同時載入合併；更新配置或重新載入會清除此輪的來源快取。取消當次 QuickJS 呼叫會中止其 HTTP／WebSocket／sleep，不關閉整個站點；共用快取的 loader 有獨立生命週期，由 clearCache 或 owner 關閉取消。

## 網頁與 Android UI

操作卡片將 value 交給 action，action 回傳 JSON 即可讓 App 開網頁：

```json
{"web": {"url": "https://example.com/login", "cookie": [{"keys": ["sid", "token"]}]}}
```

一般網頁省略 mode；獨立內容視窗使用 `"mode": "view"`，返回直接退出。Cookie 同組全部需要、不同組任一組即可；內容全螢幕仍由網頁或站點 rule 觸發。提示使用 `{"msg":"訊息"}`。不要為開網頁直接反射 App 的 Activity。

多組條件放在 ext.web_cookie，例如 `[{"keys":["sid","token"]},{"url":"https://example.com/auth","keys":["auth"]}]`。HTTP 的 cookie:true 只決定是否帶入 WebView Cookie，與網頁的登入完成條件分開。

本機 proxy 的網址使用 Python `self.getProxyUrl({"demo": "json"})`、QuickJS `getProxyUrl({demo: "json"})`、Java `getProxyUrl(Map.of("demo", "json"))`。App 自動加入 do、siteKey 並編碼 query，不要自行拼接這兩個保留欄位。App 會將 query 交給對應爬蟲。proxy 回傳 `[status, mime, body, headers]`，Python body 可為 bytes，QuickJS 支援文字與 byte 陣列，Java 使用 InputStream。demo 的 `demo=json` 回傳 JSON，`demo=playlist` 回傳指向 media_url 的 HLS master playlist。

直播 EPG 使用 `self.getProxyUrl({"type": "epg", "id": channel_id}) + "&date={date}"`，保留 `{date}`，由 App 代入日期。

Java／Python 的 `getActivity()` 即時讀取目前 resumed Activity，可能為 null／None。App 在 Application 啟動時就追蹤 Activity，爬蟲不需註冊生命週期 callback。自訂 dialog 在主執行緒執行，當下才取得 Activity：

```java
new Handler(Looper.getMainLooper()).post(() -> {
    Activity activity = getActivity();
    if (activity == null) return;
    new AlertDialog.Builder(activity)
            .setTitle("提示")
            .setMessage("爬蟲的自訂對話框")
            .setPositiveButton("確定", null)
            .show();
});
```

匯入 `android.app.Activity`、`android.app.AlertDialog`、`android.os.Handler` 與 `android.os.Looper`。未繼承 Spider 的工具類可用 `com.github.catvod.Init.activity()`；Application Context 使用 `Init.context()`。公開 SDK 入口由 App 保留 R8 名稱，新增 Android 呼叫仍須在混淆版驗證。QuickJS 沒有 Java 反射或 getActivity，使用 action JSON。

爬蟲執行中需要顯示 Toast 時，Java 可直接呼叫 `Init.toast("訊息")`；Python 使用以下入口。App 會切到主執行緒，爬蟲不必自己建立 Handler。操作完成的提示仍可直接回傳 action 的 `msg`。

```python
from java import jclass

Init = jclass("com.github.catvod.Init")
Init.toast("正在下載…")
```

Java 分享檔案時，使用 `androidx.core.content.FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file)` 取得 `content://` URI，交給其他 App 的 Intent 加上 `FLAG_GRANT_READ_URI_PERMISSION`。爬蟲以 `compileOnly libs.androidx.core` 編譯，App 提供 FileProvider、Provider 宣告與 `file_paths.xml` 分享目錄，並保留公開方法的 R8 名稱。

## AI 開發

本專案的 `AGENTS.md` 供 AI 讀取，Codex 另有 `.agents/skills/catvod-spider/SKILL.md`。其他工具可直接將該 skill 作為開發指引，不需要安裝全域 skill。實用的提示包含站點網址、語言、需求及可用帳號條件：

```text
請用 $catvod-spider 為指定站點寫 QuickJS 爬蟲。
先確認列表／篩選／詳情／播放的資料來源，優先使用官方 API。
只提供站點支援的分類與篩選，接好搜尋、分頁、詳情與播放。
保持代碼精簡，使用 TV 的共用接口。
```

Java 修改後執行 `gradlew.bat spiderJar` 確認打包；Python／QuickJS 可直接在 TV 載入範例配置。App 的共用接口與 R8 驗證放在 TV repo。
