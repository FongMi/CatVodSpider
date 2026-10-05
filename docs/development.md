# 爬蟲開發

先從 [README](../README.md) 選擇範例並載入配置。三份 Demo 的分類與操作入口一致，展示清單、播放、網路、儲存與網頁功能；實際爬蟲只保留需要的部分。

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

Python 資料方法回傳 dict／list；QuickJS 回傳物件／陣列，Promise 由 App 等待；Java 回傳 JSON 字串，可用 Result、Vod、Filter。proxy 與布林接口維持各自格式。QuickJS 的 detail 收單一 ID，Python／Java 收 ID 集合。

分類與搜尋回傳 `list、page、pagecount、limit`；有精確總筆數時加 `total`。`page < pagecount` 才會繼續載入，不另寫 loadMore。網站已分頁時直接回傳當頁，不再次切片，也不以頁數乘頁大小推算 total；最小 JSON 見[技能的分頁範例](../.agents/skills/catvod-spider/SKILL.md#網站已分頁)。`filters` 的鍵對應分類 `type_id`，只加入站點支援的篩選。

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

字幕的 flag=1 為預設選取，flag=2 為強制字幕。skips 的 start／end 是影片開頭起算的毫秒；播放到 start 時跳至 end，ending 可省略 end。

## 網路

Python 使用 `self.net`；QuickJS 使用注入的 `net`；Java 使用繼承的 `net`。下文以 net 簡寫，Java 的 options 使用 JSON 字串。

只取 JSON 時：

```python
data = self.net.json(url, {"params": {"page": 1}})
```

```javascript
const data = await net.json(url, {params: {page: 1}});
```

```java
String data = net.json(url, "{\"params\":{\"page\":1}}");
```

連線失敗、HTTP 非 2xx 或無效 JSON 會拋出例外。需要自行處理狀態碼、錯誤正文或 bytes 時，用 Python `self.net.req`、QuickJS `await net.http`、Java `net.req`；分開檢查回應的 error 與 code。Java 先解析回傳的 JSON 字串。回應格式與不依賴 TV repo 的主機驗證方法見[接口驗證](../.agents/skills/catvod-spider/references/validation.md)。

| HTTP options | 用途 |
| --- | --- |
| `headers` | 標頭物件 |
| `params` | 自動編碼 query，陣列值重複同一個 key |
| `method、data、postType` | POST 資料；postType 為 json／form／form-data |
| `body` | 原始文字，搭配 Content-Type，與 data 擇一 |
| `buffer` | 0 文字、1 byte 陣列、2 Base64；Python 的 3 回傳 bytes |
| `timeout、callTimeout` | 連線讀寫／整次請求逾時，單位毫秒 |
| `cookie` | true 使用 WebView Cookie |

QuickJS 的 http／json／batch／ws／cached／download／sleep 回傳 Promise，取結果時用 await；req 預設同步，refresh 直接返回。獨立請求可並行，不要同步等待同一 JS 執行緒的 callback。

隔離 Cookie 用 `net.session()`，Python 用 with，QuickJS／Java 用 try/finally 關閉。

Java 只要正文可用 `net.get(url)`、`net.get(url, headers)`、`net.post(url, json, headers)`。網路失敗拋出例外，HTTP 非 2xx 仍保留正文；需要判斷狀態碼時用 net.req。

批次用 `net.batch(requests, limit)`，每筆為 `{url, options}`，預設最多 4 筆並行、按輸入順序回傳。Python／QuickJS 回傳結果陣列；Java 傳 requests JSON、回傳 Net.Result[]。每筆結果都要檢查狀態。

WebSocket 用 `net.ws(url, options)`，成功回應 code=101，首個完整文字訊息放在 content；不自動重連。

下載用 Python／QuickJS `net.download(url, path, options)`、Java `net.download(url, optionsJson, file)`，直接寫檔。相對路徑以 App cache 為基準，父目錄需存在，失敗後的部分檔案由呼叫者處理。

`net.sleep(ms)` 可取消，取消後不繼續請求。

## 快取與儲存

`net.cached(key, options, loader)` 儲存 loader 回傳的 JSON 資料，同 key 合併載入。Java 的回傳值使用 JSON 字串。

| options | 用途 |
| --- | --- |
| `ttl` | 必填，毫秒；0 不快取 |
| `stale` | 預設 true，過期先回舊值並背景更新；false 等待新資料 |
| `persist` | 預設 false；true 持久化公開資料，隔離 session 不支援 |

`net.peek(key)` 只讀已有值，包括過期值；`net.refresh(key, options, loader)` 立即返回並依 TTL 背景更新。`net.clearCache(key)` 清一筆，省略 key 清全部並取消載入。快取按站點隔離，可被系統清除；播放網址使用短 TTL、stale:false，不持久化。

Local 保存小型設定：Python `self.local`、QuickJS／Java `local` 使用 `get(key)、set(key, value)、delete(key)`，App 按 Site.key 隔離。Python／QuickJS 直接存 JSON 值，Java 使用 JSON 字串；不存在的 key 回傳 None／null。清快取不會刪除 Local。

完整清單分頁使用 Python `self.page(items, pg, limit)`、QuickJS `page(items, pg, limit)`、Java `Result.page(items, page, limit).string()`。網站已分頁時依網站值組裝分頁欄位。超連結用 Python `self.link`、QuickJS `link`、Java `Json.link`。

## 網頁、直播與 proxy

action 回傳 JSON 即可開網頁或顯示提示：

```json
{"web": {"url": "https://example.com/login", "cookie": [{"keys": ["sid", "token"]}]}}
```

url 限 HTTP(S)。一般網頁省略 mode，獨立內容使用 `"mode": "view"`，不啟動外部 App、不自動全螢幕。返回先退出全螢幕，再依網頁歷史回上一頁，沒有歷史才關閉。提示回傳 `{"msg": "訊息"}`。

Cookie 同組全部需要、不同組任一組即可；需有新值且頁面同源。各組可指定 url，未指定時用開啟網址。這是登入完成條件，與 HTTP 的 cookie:true 分開。

直播回傳 `[{name, channel: [{name, urls}]}]`，多線路網址加 `$線路名稱`；TXT／M3U 也可直接回傳文字。

本機代理網址用 `getProxyUrl(params)`，Python 需加 self，Java 傳 Map。App 自動加入 do／siteKey 並編碼 query。proxy 回傳 `[status, mime, body, headers]`；Python body 可用 bytes，QuickJS 可用文字或 byte 陣列，Java 用 InputStream。EPG 在產生的網址後接 `&date={date}`，由 App 代入日期。

## Android UI

Java／Python 的 `getActivity()` 即時取得目前 Activity，可能為 null／None。自訂 Dialog 在主執行緒執行時才取得，不保存 Activity 或自行註冊生命週期 callback。Java 工具類可用 `Init.activity()`，Application Context 用 `Init.context()`。

Java 的執行中提示用 `Init.toast("訊息")`；Python 可用 `jclass("com.github.catvod.Init").toast("訊息")`，需先 `from java import jclass`。App 自動切主執行緒。QuickJS 使用 action JSON，沒有 Java 反射。

Java 分享檔案使用 AndroidX FileProvider，authority 為 `context.getPackageName() + ".provider"`，Intent 加 `FLAG_GRANT_READ_URI_PERMISSION`；可分享目錄由 TV 的 file_paths.xml 決定。新增 Android 呼叫需在 TV 的混淆版驗證。
