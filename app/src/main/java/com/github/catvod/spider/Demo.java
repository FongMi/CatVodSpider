package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

import com.github.catvod.Init;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Net;
import com.github.catvod.net.NetSocket;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.Json;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** TV Java 功能範例；配置與接口說明見 docs/development.md。 */
public class Demo extends Spider {

    private NetSocket socket;
    private JsonObject socketState = new JsonObject();

    private static final int PAGE_SIZE = 4;
    private static final String CATALOG = """
            [
                {"id":"demo-01","name":"星光探險隊","genre":"動畫","area":"台灣","year":"2026","director":"林導演","actors":["小安","小晴"],"remark":"更新至 3 集","episodes":["第 1 集","第 2 集","第 3 集"],"content":"一群朋友追尋失落星圖的原創示範故事。"},
                {"id":"demo-02","name":"城市觀察日記","genre":"紀錄","area":"日本","year":"2026","director":"周導演","actors":["阿杰","小美"],"remark":"全 2 集","episodes":["上集","下集"],"content":"從日常交通與市場觀察城市生活。"},
                {"id":"demo-03","name":"料理研究室","genre":"綜藝","area":"韓國","year":"2025","director":"陳導演","actors":["小晴","大宇"],"remark":"更新至 4 集","episodes":["第 1 集","第 2 集","第 3 集","第 4 集"],"content":"用常見食材完成四道家常料理。"},
                {"id":"demo-04","name":"午後推理社","genre":"戲劇","area":"台灣","year":"2025","director":"李導演","actors":["阿杰","若葉"],"remark":"全 3 集","episodes":["線索","追蹤","答案"],"content":"三位社員從校園小事練習推理。"},
                {"id":"demo-05","name":"海邊小旅行","genre":"紀錄","area":"台灣","year":"2024","director":"周導演","actors":["大宇"],"remark":"正片","episodes":["正片"],"content":"沿著海岸記錄自然景色與地方文化。"},
                {"id":"demo-06","name":"節奏練習生","genre":"綜藝","area":"日本","year":"2024","director":"陳導演","actors":["小美","若葉"],"remark":"全 2 集","episodes":["預賽","決賽"],"content":"表演者以節奏合作完成舞台任務。"},
                {"id":"demo-07","name":"紙飛機計畫","genre":"動畫","area":"日本","year":"2023","director":"林導演","actors":["若葉","小安"],"remark":"全 3 集","episodes":["起飛","風向","返航"],"content":"紙飛機乘著不同風向展開旅程。"},
                {"id":"demo-08","name":"轉角咖啡店","genre":"戲劇","area":"韓國","year":"2023","director":"李導演","actors":["大宇","小晴"],"remark":"全 2 集","episodes":["相遇","再會"],"content":"一間咖啡店串起幾段溫暖的日常。"},
                {"id":"demo-09","name":"機器人運動會","genre":"動畫","area":"韓國","year":"2022","director":"林導演","actors":["阿杰","小美"],"remark":"全 4 集","episodes":["開幕","接力","決勝","閉幕"],"content":"小型機器人組隊參加創意競賽。"},
                {"id":"demo-10","name":"深夜電台","genre":"戲劇","area":"台灣","year":"2022","director":"李導演","actors":["小安","大宇"],"remark":"正片","episodes":["正片"],"content":"主持人透過來電聽見城市裡的故事。"},
                {"id":"demo-11","name":"週末任務隊","genre":"綜藝","area":"韓國","year":"2021","director":"陳導演","actors":["若葉","小晴"],"remark":"全 3 集","episodes":["任務一","任務二","任務三"],"content":"成員分組完成城市探索任務。"},
                {"id":"demo-12","name":"山林的一天","genre":"紀錄","area":"日本","year":"2021","director":"周導演","actors":["小美"],"remark":"正片","episodes":["正片"],"content":"以一天的時間觀察山林生態。"}
            ]
            """;
    private static final String ACTIONS = """
            [
                ["web_view", "開啟獨立內容", "mode=view，返回直接關閉"],
                ["native_toast", "執行中 Toast", "呼叫 App 的 Init.toast"],
                ["json", "JSON 請求", "net.json 驗證 HTTP 與 JSON"],
                ["request_sync", "同步 HTTP", "同步取得完整回應"],
                ["session", "隔離 Session", "在獨立 Cookie 流程完成請求並關閉"],
                ["parallel", "並行請求", "同時取得 3 份回應"],
                ["download", "下載檔案", "Net.download 寫入 App 快取，用完移除"],
                ["binary", "二進位回應", "buffer=1，取得 byte 陣列"],
                ["ttl_persist", "持久化快取", "重建爬蟲後仍可讀取"],
                ["ttl_background", "立即回快取、背景更新", "先 peek，再交給 refresh 背景更新"],
                ["ttl_clear_all", "清除全部 TTL 快取", "只清目前站點的 TTL 資料"],
                ["proxy", "本機 proxy", "透過 App HTTP server 呼叫此爬蟲"],
                ["runtime", "測試 App 與加密 bridge", "驗證 SHA-256 與 AES-GCM"],
                ["toast", "顯示 Toast", "action 回傳 msg，由 App 顯示"],
                ["dialog", "顯示 Dialog", "主執行緒取得目前 Activity，再建立對話框"],
                ["site_key", "顯示 Site key", "由 App 在 init 前注入的 siteKey"],
                ["web", "開啟網頁", "action 回傳 web，由 App 開啟"],
                ["cookie", "檢查登入 Cookie", "只顯示是否存在，不顯示 Cookie 內容"],
                ["cookie_clear", "清除登入 Cookie", "寫入過期 Cookie 並確認結果"],
                ["request", "HTTP + Cookie 請求", "使用 net.req，只顯示狀態與長度"],
                ["websocket", "WebSocket 訊息交換", "使用 net.ws，只顯示狀態與長度"],
                ["socket-start", "WebSocket 持續連線", "持續收訊並發送二進位範例"],
                ["socket-state", "WebSocket 連線狀態", "查看文字與二進位訊息數"],
                ["socket-stop", "WebSocket 停止連線", "關閉連線並釋放資源"],
                ["sleep", "可取消等待", "等待 250 毫秒；爬蟲關閉或任務中斷會取消"],
                ["ttl_cache", "TTL 快取", "有效期內重用資料；過期背景更新"],
                ["ttl_peek", "讀取已有快取", "只讀已有值，不發出請求或延長 TTL"],
                ["ttl_clear", "清除 TTL 快取", "清除同一個 key，並取消正在載入的資料"],
                ["cache_write", "寫入 Local", "保存 JSON 物件、陣列及純量"],
                ["cache_read", "讀取 Local", "使用 local.get 讀取相同 key"],
                ["cache_delete", "刪除 Local", "使用 local.delete 清除資料"],
                ["text_get", "GET 正文", "使用 net.get"],
                ["text_post", "POST 正文", "使用 net.post"]
            ]
            """;
    private JSONObject options;
    private JSONArray catalog;

    @Override
    public void init(Context context, String extend) throws Exception {
        options = new JSONObject(extend.isEmpty() ? "{}" : extend);
        if (options.has("request_options") && !(options.get("request_options") instanceof JSONObject)) throw new IllegalArgumentException("request_options 必須是物件");
        catalog = new JSONArray(CATALOG);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        JSONArray classes = new JSONArray();
        String[][] names = {{"vod_portrait", "VOD 直式"}, {"vod_landscape", "VOD 橫式"}, {"vod_oval", "VOD 圓形"},
                {"vod_list", "VOD 列表"}, {"class_landscape", "分類橫式"}, {"class_oval", "分類圓形"},
                {"folders", "資料夾"}, {"actions", "互動功能"}};
        JSONObject filters = new JSONObject();
        for (String[] name : names) {
            JSONObject item = new JSONObject().put("type_id", name[0]).put("type_name", name[1]);
            if (name[0].equals("class_landscape")) item.put("land", 1).put("ratio", 1.78);
            if (name[0].equals("class_oval")) item.put("circle", 1).put("ratio", 1.0);
            if (name[0].equals("folders") || name[0].equals("actions")) item.put("type_flag", "1");
            else if (filter) filters.put(name[0], filterRows());
            classes.put(item);
        }
        JSONObject result = new JSONObject().put("class", classes);
        if (filter) result.put("filters", filters);
        return result.toString();
    }

    @Override
    public String homeVideoContent() throws Exception {
        JSONArray items = new JSONArray();
        for (int i = 0; i < PAGE_SIZE; i++) items.put(card(catalog.getJSONObject(i), "landscape", "landscape"));
        return new JSONObject().put("list", items).toString();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<JSONObject> records = new ArrayList<>();
        List<Vod> items = new ArrayList<>();
        if (tid.equals("actions")) return Result.page(actionCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        if (tid.equals("folders")) return Result.page(folderCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        boolean folder = tid.startsWith("folder/") || tid.startsWith("actor/") || tid.startsWith("director/");
        for (int i = 0; i < catalog.length(); i++) {
            JSONObject record = catalog.getJSONObject(i);
            if (folder ? matchesFolder(record, tid) : (tid.startsWith("vod_") || tid.startsWith("class_")) && matchesFilters(record, extend)) records.add(record);
        }
        String sort = extend.getOrDefault("sort", "latest");
        Comparator<JSONObject> order = sort.equals("name") ? Comparator.comparing(v -> v.optString("name"))
                : Comparator.comparing((JSONObject v) -> v.optString("year")).thenComparing(v -> v.optString("id"));
        if (!sort.equals("name") && !sort.equals("oldest")) order = order.reversed();
        if (!folder) records.sort(order);
        String style = folder ? "list" : tid.equals("vod_portrait") ? "portrait" : tid.equals("vod_landscape") ? "landscape"
                : tid.equals("vod_oval") ? "oval" : tid.equals("vod_list") ? "list" : "";
        String picture = tid.equals("class_landscape") ? "landscape" : tid.equals("class_oval") ? "oval" : style;
        for (JSONObject record : records) items.add(Vod.objectFrom(card(record, style, picture).toString()));
        return Result.page(items, Integer.parseInt(pg), PAGE_SIZE).string();
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        List<Vod> items = new ArrayList<>();
        String query = key.trim().toLowerCase(Locale.ROOT);
        for (int i = 0; !query.isEmpty() && i < catalog.length(); i++) {
            JSONObject record = catalog.getJSONObject(i);
            String text = "示範 " + record.getString("name") + " " + record.getString("genre") + " " + record.getString("area")
                    + " " + record.getString("year") + " " + record.getString("director") + " " + record.getJSONArray("actors");
            if (text.toLowerCase(Locale.ROOT).contains(query)) items.add(Vod.objectFrom(card(record, "list", "list").toString()));
        }
        return Result.page(items, Integer.parseInt(pg), PAGE_SIZE).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        JSONObject record = record(ids.get(0).replaceFirst("^vod/", ""));
        if (record == null) return Result.error("找不到此範例影片");
        String flags = "主要線";
        String urls = episodeLine(record, "main");
        if (!options.optString("backup_media_url").isEmpty()) {
            flags += "$$$備用線";
            urls += "$$$" + episodeLine(record, "backup");
        }
        if (options.optString("media_url").split("\\?", 2)[0].toLowerCase(Locale.ROOT).endsWith(".m3u8")) {
            flags += "$$$代理線";
            urls += "$$$" + episodeLine(record, "proxy");
        }
        List<String> actors = new ArrayList<>();
        JSONArray names = record.getJSONArray("actors");
        for (int i = 0; i < names.length(); i++) actors.add(clickable("actor", names.getString(i)));
        JSONObject item = card(record, "portrait", "portrait").put("type_name", record.getString("genre"))
                .put("vod_area", record.getString("area")).put("vod_director", clickable("director", record.getString("director")))
                .put("vod_actor", String.join("、", actors)).put("vod_content", record.getString("content"))
                .put("vod_play_from", flags).put("vod_play_url", urls);
        return new JSONObject().put("list", new JSONArray().put(item)).toString();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] parts = id.split("/");
        if (parts.length != 4 || !parts[0].equals("play") || !List.of("main", "backup", "proxy").contains(parts[3])) return Result.error("無效的範例播放 ID");
        JSONObject record = record(parts[1]);
        int episode;
        try { episode = Integer.parseInt(parts[2]); }
        catch (NumberFormatException e) { episode = 0; }
        if (record == null || episode < 1 || episode > record.getJSONArray("episodes").length()) return Result.error("找不到此範例集數");
        String key = parts[3].equals("backup") ? "backup_media_url" : "media_url";
        String url = options.optString(key);
        JSONObject choices = parts[3].equals("main") && options.has("media_urls") ? qualities(options.getJSONObject("media_urls")) : null;
        if (choices != null) url = choices.getJSONArray("values").getJSONObject(choices.getInt("position")).getString("v");
        JSONObject headers = options.optJSONObject(parts[3].equals("backup") ? "backup_media_headers" : "media_headers");
        if (url.isEmpty() && parts[3].equals("main") && !options.optString("sniff_url").isEmpty())
            return new JSONObject().put("parse", 1).put("jx", 0).put("url", httpUrl(options.optString("sniff_url"), "sniff_url")).put("header", headers == null ? new JSONObject() : headers).toString();
        if (url.isEmpty()) return Result.notify("請先設定 ext." + key + " 再測試播放");
        JSONObject result = new JSONObject().put("parse", 0).put("jx", 0).put("url", parts[3].equals("proxy") ? getProxyUrl(Map.of("demo", "playlist")) : httpUrl(url, key))
                .put("header", headers == null ? new JSONObject() : headers).put("artwork", picture(record, "landscape"))
                .put("desc", record.getString("name") + "・" + record.getJSONArray("episodes").getString(episode - 1));
        if (options.has("skips")) result.put("skips", skips(options.getJSONArray("skips")));
        if (choices != null) result.put("url", choices);
        for (String field : List.of("subs", "danmaku", "drm", "format")) {
            String source = field.equals("subs") ? "subtitles" : field.equals("format") ? "media_format" : field;
            if (options.has(source)) result.put(field, options.get(source));
        }
        if (options.has("start_position_ms")) result.put("position", milliseconds(options.get("start_position_ms")));
        return result.toString();
    }

    @Override
    public String liveContent(String url) throws Exception {
        JSONArray urls = new JSONArray();
        for (String[] entry : new String[][]{{"media_url", "主要線"}, {"backup_media_url", "備用線"}})
            if (!options.optString(entry[0]).isEmpty()) urls.put(httpUrl(options.getString(entry[0]), entry[0]) + "$" + entry[1]);
        JSONArray groups = new JSONArray();
        if (urls.length() > 0) groups.put(new JSONObject().put("name", "範例直播").put("channel", new JSONArray()
                .put(new JSONObject().put("name", "示範頻道").put("urls", urls))));
        return groups.toString();
    }

    @Override
    public Object[] proxy(Map<String, String> params) throws Exception {
        String body = "未知的範例 proxy";
        String mime = "text/plain; charset=utf-8";
        int status = 404;
        if ("json".equals(params.get("demo"))) {
            body = "{\"name\":\"demo\",\"ok\":true}";
            mime = "application/json; charset=utf-8";
            status = 200;
        } else if ("playlist".equals(params.get("demo")) && !options.optString("media_url").isEmpty()) {
            body = "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\n" + httpUrl(options.getString("media_url"), "media_url") + "\n";
            mime = "application/vnd.apple.mpegurl";
            status = 200;
        }
        return new Object[]{status, mime, new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)), Map.of("X-Demo", "1")};
    }

    @Override
    public String action(String value) throws Exception {
        switch (value) {
            case "site_key": return Result.notify("目前 Site key：" + siteKey);
            case "toast": return Result.notify("這是 Java action 回傳、由 App 顯示的 Toast");
            case "native_toast": Init.toast("Java 執行中的提示"); return "{}";
            case "dialog": showDialog(); return "{}";
            case "web": return web(false);
            case "web_view": return web(true);
            case "cookie": return Result.notify("指定的 WebView Cookie " + (cookieExists() ? "已存在" : "不存在"));
            case "cookie_clear":
                String name = cookieName();
                if (!net.setCookie(webUrl(), name + "=; Path=/; Max-Age=0")) throw new IllegalStateException("Cookie 清除失敗");
                return Result.notify(cookieExists() ? "WebView Cookie 清除失敗" : "已清除指定的 WebView Cookie");
            case "sleep": net.sleep(250); return Result.notify("等待完成（250 毫秒）");
            case "ttl_cache": return Result.notify("TTL 快取：" + new JSONObject(net.cached("demo:ttl", "{\"ttl\":60000}", () -> "{\"value\":\"範例資料\"}")).getString("value"));
            case "ttl_peek":
                String cached = net.peek("demo:ttl");
                return Result.notify(cached == null ? "目前沒有 TTL 快取" : "已有 TTL 快取：" + new JSONObject(cached).getString("value"));
            case "ttl_clear": net.clearCache("demo:ttl"); return Result.notify("已清除 TTL 快取");
            case "ttl_clear_all": net.clearCache(); return Result.notify("已清除目前站點的全部 TTL 快取");
            case "ttl_persist": return Result.notify("持久化快取：" + new JSONObject(net.cached("demo:persist", "{\"ttl\":60000,\"stale\":false,\"persist\":true}", this::cacheValue)).getLong("updated"));
            case "ttl_background":
                String saved = net.peek("demo:background");
                net.refresh("demo:background", "{\"ttl\":1000,\"stale\":false,\"persist\":true}", () -> { net.sleep(250); return cacheValue(); });
                return Result.notify("背景更新已安排；目前值：" + (saved == null ? "尚未載入" : new JSONObject(saved).getLong("updated")));
            case "cache_write": local.set("demo:local", "{\"value\":\"範例資料\",\"items\":[1,true,null]}"); return Result.notify("Local 已寫入");
            case "cache_read": return Result.notify("Local：" + local.get("demo:local"));
            case "cache_delete": local.delete("demo:local"); return Result.notify("Local 已刪除");
            case "proxy": return Result.notify("本機 proxy：" + new JSONObject(net.json(getProxyUrl(Map.of("demo", "json")), "{}")).getString("name"));
            case "download": return download();
            case "runtime": return runtime();
            default:
                try { return networkAction(value); }
                catch (Exception e) { return Result.notify("網路示範失敗：" + e.getMessage()); }
        }
    }

    private String networkAction(String value) throws Exception {
        if (value.equals("socket-start")) return connectSocket();
        if (value.equals("socket-stop")) {
            if (socket != null) socket.close();
            socket = null;
            return Result.notify("WebSocket 已停止");
        }
        if (value.equals("socket-state")) {
            JsonObject state = socketState;
            synchronized (state) {
                return Result.notify(state.toString());
            }
        }
        if (value.equals("json")) return Result.notify("JSON 請求成功：" + JsonParser.parseString(net.json(httpUrl(options.optString("json_url"), "json_url"), "{}")).getClass().getSimpleName());
        if (value.equals("websocket")) return websocket();
        String url = httpUrl(options.optString("request_url", options.optString("web_url")), "request_url");
        switch (value) {

            case "text_get": return Result.notify("GET 正文長度：" + net.get(url).length());
            case "text_post": return Result.notify("POST 正文長度：" + net.post(url, "{\"value\":\"demo\"}").length());
            case "parallel":
                JSONArray requests = new JSONArray();
                for (int i = 0; i < 3; i++) requests.put(new JSONObject().put("url", url).put("options", new JSONObject().put("timeout", 15000)));
                for (Net.Result response : net.batch(requests.toString())) {
                    if (response.error != null) throw new IllegalStateException(response.error);
                    if ((Integer) response.code < 200 || (Integer) response.code >= 300) throw new IllegalStateException("HTTP " + response.code);
                }
                return Result.notify("並行完成 3 次請求");
            case "session":
                try (Net flow = net.session()) {
                    if (!flow.setCookie(url, "demo_session=1; Path=/")) throw new IllegalStateException("Session Cookie 寫入失敗");
                    checkResponse(new JSONObject(flow.req(url, "{\"timeout\":15000}")));
                    return Result.notify("隔離 Session 請求完成，Cookie " + (flow.getCookie(url).contains("demo_session=1") ? "存在" : "不存在"));
                }
            case "binary":
            case "request_sync":
            case "request":
                JSONObject settings = new JSONObject().put("timeout", 15000).put("callTimeout", 15000).put("cookie", value.equals("request"))
                        .put("method", options.optString("request_method", "GET")).put("headers", options.optJSONObject("request_headers"));
                JSONObject extra = options.optJSONObject("request_options");
                if (extra != null) for (Iterator<String> keys = extra.keys(); keys.hasNext();) { String key = keys.next(); settings.put(key, extra.get(key)); }
                if (value.equals("binary")) settings.put("buffer", 1);
                JSONObject data = new JSONObject(net.req(url, settings.toString()));
                checkResponse(data);
                return Result.notify("HTTP " + data.getInt("code") + "，回應長度 " + (value.equals("binary") ? data.getJSONArray("content").length() : data.getString("content").length()));
            default: return Result.notify("範例不支援此操作");
        }
    }

    private String websocket() throws Exception {
        JSONObject ws = new JSONObject().put("data", options.opt("ws_data")).put("headers", options.optJSONObject("ws_headers")).put("timeout", 15000);
        JSONObject response = new JSONObject(net.ws(options.getString("ws_url"), ws.toString()));
        if (response.has("error")) throw new IllegalStateException(response.getString("error"));
        return Result.notify("WebSocket " + response.getInt("code") + "，回應長度 " + response.getString("content").length());
    }

    private String connectSocket() throws Exception {
        if (options.optString("ws_url").isEmpty()) return Result.notify("請先在 ext 設定 ws_url");
        if (socket != null) socket.cancel();
        JsonObject state = new JsonObject();
        state.addProperty("state", "連線中");
        state.addProperty("text", 0);
        state.addProperty("binary", 0);
        socketState = state;
        JSONObject settings = new JSONObject().put("data", options.opt("ws_data")).put("headers", options.optJSONObject("ws_headers")).put("timeout", 15000).put("ping", 30000);
        socket = net.connect(options.getString("ws_url"), settings.toString(), (connection, event) -> socketEvent(connection, event, state));
        return Result.notify("WebSocket 已開始連線");
    }

    private void socketEvent(NetSocket connection, NetSocket.Event event, JsonObject state) {
        synchronized (state) {
            switch (event.type) {
                case "open" -> {
                    state.addProperty("state", "已連線");
                    connection.send(new byte[]{0, 127, (byte) 128, (byte) 255});
                }
                case "message" -> {
                    String key = event.binary ? "binary" : "text";
                    state.addProperty(key, state.get(key).getAsInt() + 1);
                }
                case "error" -> state.addProperty("error", event.error);
                case "close" -> state.addProperty("state", "已關閉");
            }
        }
    }

    private void checkResponse(JSONObject value) throws Exception {
        if (value.has("error")) throw new IllegalStateException(value.getString("error"));
        int code = value.getInt("code");
        if (code < 200 || code >= 300) throw new IllegalStateException("HTTP " + code);
    }

    private String web(boolean view) throws Exception {
        String url = view && !options.optString("game_url").isEmpty() ? httpUrl(options.getString("game_url"), "game_url") : webUrl();
        JSONObject web = new JSONObject().put("url", url);
        if (view) web.put("mode", "view");
        else if (options.has("web_cookie")) web.put("cookie", options.getJSONArray("web_cookie"));
        else if (!options.optString("cookie_name").isEmpty()) web.put("cookie", new JSONArray().put(new JSONObject().put("keys", new JSONArray().put(cookieName()))));
        return new JSONObject().put("web", web).toString();
    }

    private boolean cookieExists() {
        String name = cookieName();
        for (String part : net.getCookie(webUrl()).split(";")) if (part.trim().startsWith(name + "=") && part.trim().length() > name.length() + 1) return true;
        return false;
    }

    private String cookieName() {
        String value = options.optString("cookie_name");
        if (!value.matches("[!#$%&'*+.^_`|~0-9A-Za-z-]+")) throw new IllegalArgumentException("cookie_name 格式無效");
        return value;
    }

    private String webUrl() {
        return httpUrl(options.optString("web_url"), "web_url");
    }

    private String download() throws Exception {
        File file = File.createTempFile("spider-demo-", ".bin", Init.context().getCacheDir());
        try {
            net.download(httpUrl(options.optString("request_url"), "request_url"), "{}", file);
            return Result.notify("下載完成：" + file.length() + " bytes");
        } finally { file.delete(); }
    }

    private String cacheValue() throws Exception {
        return new JSONObject().put("updated", System.currentTimeMillis()).put("items", new JSONArray().put(1).put(true).put(JSONObject.NULL)).toString();
    }

    private void showDialog() {
        new Handler(Looper.getMainLooper()).post(() -> {
            Activity activity = getActivity();
            if (activity == null) return;
            new AlertDialog.Builder(activity).setTitle("Java Dialog").setMessage("使用目前 Activity 顯示的自訂對話框").setPositiveButton("確定", null).show();
        });
    }

    private String runtime() {
        String plain = Crypto.aes("GCM", false, "0388dace60b6a392f328c2b971b2fe78ab6e47d42cec13bdf53a67b21257bddf", false,
                "00000000000000000000000000000000", "000000000000000000000000", true);
        boolean passed = Crypto.sha256("abc").equals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad") && plain.equals("AAAAAAAAAAAAAAAAAAAAAA==") && !Crypto.randomUrlSafe(16).isEmpty();
        return Result.notify(passed ? "App 與加密 bridge 測試通過" : "App 或加密 bridge 測試失敗");
    }

    private JSONArray skips(JSONArray values) throws Exception {
        for (int i = 0; i < values.length(); i++) {
            JSONObject value = values.getJSONObject(i);
            if (!List.of("opening", "middle", "ending").contains(value.getString("type"))) throw new IllegalArgumentException("skips.type 格式錯誤");
            long start = milliseconds(value.get("start"));
            if (!value.has("end") && value.getString("type").equals("ending") && start > 0) continue;
            if (milliseconds(value.get("end")) <= start) throw new IllegalArgumentException("skips.end 必須晚於 start");
        }
        return new JSONArray(values.toString());
    }

    private JSONObject qualities(JSONObject value) throws Exception {
        JSONArray values = value.getJSONArray("values");
        if (values.length() == 0) throw new IllegalArgumentException("media_urls.values 不可為空");
        for (int i = 0; i < values.length(); i++) {
            JSONObject item = values.getJSONObject(i);
            item.getString("n");
            httpUrl(item.getString("v"), "media_urls.v");
        }
        long position = value.has("position") ? milliseconds(value.get("position")) : 0;
        if (position >= values.length()) throw new IllegalArgumentException("media_urls.position 必須是有效畫質索引");
        return new JSONObject(value.toString()).put("position", position);
    }

    private long milliseconds(Object value) {
        if (!(value instanceof Integer || value instanceof Long) || ((Number) value).longValue() < 0) throw new IllegalArgumentException("時間必須是非負整數毫秒");
        return ((Number) value).longValue();
    }

    private JSONObject record(String id) throws Exception {
        for (int i = 0; i < catalog.length(); i++) if (catalog.getJSONObject(i).getString("id").equals(id)) return catalog.getJSONObject(i);
        return null;
    }

    private JSONObject card(JSONObject record, String style, String pictureStyle) throws Exception {
        JSONObject item = new JSONObject().put("vod_id", "vod/" + record.getString("id")).put("vod_name", record.getString("name"))
                .put("vod_pic", picture(record, pictureStyle)).put("vod_remarks", record.getString("remark")).put("vod_year", record.getString("year"));
        if (!style.isEmpty()) item.put("style", style(style));
        return item;
    }

    private JSONObject style(String name) throws Exception {
        JSONObject value = new JSONObject().put("type", name.equals("oval") ? "oval" : name.equals("list") ? "list" : "rect");
        if (!name.equals("list")) value.put("ratio", name.equals("oval") ? 1.0 : name.equals("landscape") ? 1.78 : 0.75);
        return value;
    }

    private String picture(JSONObject record, String style) throws Exception {
        String base = options.optString("image_base").replaceAll("/+$", "");
        if (base.isEmpty()) return "";
        return httpUrl(base, "image_base") + "/" + Uri.encode(record.getString("id")) + (style.equals("landscape") ? "/800/450" : style.equals("oval") ? "/600/600" : "/600/800");
    }

    private boolean matchesFilters(JSONObject record, Map<String, String> filter) {
        for (String key : List.of("genre", "area", "year")) {
            String value = filter.getOrDefault(key, "all");
            if (!value.equals("all") && !value.equals(record.optString(key))) return false;
        }
        return true;
    }

    private boolean matchesFolder(JSONObject record, String tid) {
        if (tid.startsWith("folder/genre/")) return record.optString("genre").equals(Uri.decode(tid.substring(13)));
        if (tid.startsWith("folder/area/")) return record.optString("area").equals(Uri.decode(tid.substring(12)));
        if (tid.startsWith("director/")) return record.optString("director").equals(Uri.decode(tid.substring(9)));
        if (tid.startsWith("actor/")) {
            JSONArray actors = record.optJSONArray("actors");
            for (int i = 0; i < actors.length(); i++) if (actors.optString(i).equals(Uri.decode(tid.substring(6)))) return true;
        }
        return false;
    }

    private JSONArray filterRows() throws Exception {
        JSONArray rows = new JSONArray();
        rows.put(new JSONObject().put("key", "sort").put("name", "排序").put("init", "latest").put("value", new JSONArray()
                .put(new JSONObject().put("n", "最新").put("v", "latest")).put(new JSONObject().put("n", "最早").put("v", "oldest")).put(new JSONObject().put("n", "名稱").put("v", "name"))));
        for (String[] row : new String[][]{{"genre", "類型", "動畫", "戲劇", "綜藝", "紀錄"}, {"area", "地區", "台灣", "日本", "韓國"}, {"year", "年份", "2026", "2025", "2024", "2023", "2022", "2021"}}) {
            JSONArray values = new JSONArray().put(new JSONObject().put("n", "全部").put("v", "all"));
            for (int i = 2; i < row.length; i++) values.put(new JSONObject().put("n", row[i]).put("v", row[i]));
            rows.put(new JSONObject().put("key", row[0]).put("name", row[1]).put("init", "all").put("value", values));
        }
        return rows;
    }

    private List<Vod> folderCards() throws Exception {
        List<Vod> items = new ArrayList<>();
        for (String[] group : new String[][]{{"genre", "動畫", "戲劇", "綜藝", "紀錄"}, {"area", "台灣", "日本", "韓國"}}) {
            for (int i = 1; i < group.length; i++) {
                Vod item = new Vod("folder/" + group[0] + "/" + Uri.encode(group[i]), group[i] + "資料夾", "", "依分類開啟", true);
                item.setStyle(Vod.Style.list());
                items.add(item);
            }
        }
        return items;
    }

    private List<Vod> actionCards() throws Exception {
        List<Vod> items = new ArrayList<>();
        JSONArray values = new JSONArray(ACTIONS);
        for (int i = 0; i < values.length(); i++) {
            JSONArray value = values.getJSONArray(i);
            items.add(new Vod("action/" + value.getString(0), value.getString(1), "", value.getString(2), Vod.Style.list(), value.getString(0)));
        }
        return items;
    }

    private String clickable(String kind, String name) {
        JsonObject target = new JsonObject();
        target.addProperty("id", kind + "/" + Uri.encode(name));
        target.addProperty("name", name);
        target.addProperty("type_flag", "1");
        return Json.link(name, target);
    }

    private String episodeLine(JSONObject record, String source) throws Exception {
        List<String> episodes = new ArrayList<>();
        JSONArray names = record.getJSONArray("episodes");
        for (int i = 0; i < names.length(); i++) episodes.add(names.getString(i).replace('$', '＄').replace('#', '＃') + "$play/" + record.getString("id") + "/" + (i + 1) + "/" + source);
        return String.join("#", episodes);
    }

    private String httpUrl(String value, String name) {
        Uri uri = Uri.parse(value);
        if (!("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) || uri.getHost() == null || value.contains("\n") || value.contains("\r")) throw new IllegalArgumentException(name + " 必須是完整 HTTP(S) 網址");
        return value;
    }

    @Override
    public boolean manualVideoCheck() {
        return true;
    }

    @Override
    public boolean isVideoFormat(String url) {
        String path = Uri.parse(url).getPath();
        return path != null && path.toLowerCase(Locale.ROOT).endsWith(".m3u8") && !path.contains("/ad/");
    }

    @Override
    public void destroy() {
        if (socket != null) socket.cancel();
        socket = null;
    }
}
