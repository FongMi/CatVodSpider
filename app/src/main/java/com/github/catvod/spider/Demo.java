package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

import com.github.catvod.Runtime;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Style;
import com.github.catvod.bean.Value;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Net;
import com.github.catvod.net.NetSocket;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * TV Java 功能範例；配置與接口說明見 docs/development.md。
 */
public class Demo extends Spider {

    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
    private static final int PAGE_SIZE = 4;
    private NetSocket socket;
    private JsonObject socketState = new JsonObject();
    private JsonObject options;
    private JsonArray catalog;

    @Override
    public void init(Context context, String extend) throws Exception {
        options = JsonParser.parseString(extend.isEmpty() ? "{}" : extend).getAsJsonObject();
        if (options.has("request_options") && !options.get("request_options").isJsonObject()) throw new IllegalArgumentException("request_options 必須是物件");
        catalog = JsonParser.parseString(DemoData.CATALOG).getAsJsonArray();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        Map<String, List<Filter>> filters = new LinkedHashMap<>();
        for (String[] name : DemoData.CATEGORIES) {
            boolean interactive = name[0].equals("folders") || name[0].equals("actions");
            Class item = Class.create().id(name[0]).name(name[1]).flag(interactive ? "1" : null);
            if (name[0].equals("class_landscape")) item.land(1).ratio(1.78f);
            if (name[0].equals("class_oval")) item.circle(1).ratio(1.0f);
            if (!interactive && filter) filters.put(name[0], filterRows());
            classes.add(item);
        }
        return Response.create().classes(classes).filters(filter ? filters : null).string();
    }

    @Override
    public String homeVideoContent() throws Exception {
        List<Vod> items = new ArrayList<>();
        for (int i = 0; i < PAGE_SIZE; i++) items.add(card(catalog.get(i).getAsJsonObject(), "landscape", "landscape"));
        return Response.create().vods(items).string();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<JsonObject> records = new ArrayList<>();
        List<Vod> items = new ArrayList<>();
        if (tid.equals("actions")) return Response.page(actionCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        if (tid.equals("folders")) return Response.page(folderCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        boolean folder = tid.startsWith("folder/") || tid.startsWith("actor/") || tid.startsWith("director/");
        for (JsonElement element : catalog) {
            JsonObject record = element.getAsJsonObject();
            if (folder ? matchesFolder(record, tid) : (tid.startsWith("vod_") || tid.startsWith("class_")) && matchesFilters(record, extend)) records.add(record);
        }
        String sort = extend.getOrDefault("sort", "latest");
        Comparator<JsonObject> order = sort.equals("name") ? Comparator.comparing(v -> v.get("name").getAsString())
                : Comparator.comparing((JsonObject v) -> v.get("year").getAsString()).thenComparing(v -> v.get("id").getAsString());
        if (!sort.equals("name") && !sort.equals("oldest")) order = order.reversed();
        if (!folder) records.sort(order);
        String style = folder ? "list" : tid.equals("vod_portrait") ? "portrait" : tid.equals("vod_landscape") ? "landscape"
                : tid.equals("vod_oval") ? "oval" : tid.equals("vod_list") ? "list" : "";
        String picture = tid.equals("class_landscape") ? "landscape" : tid.equals("class_oval") ? "oval" : style;
        for (JsonObject record : records) items.add(card(record, style, picture));
        return Response.page(items, Integer.parseInt(pg), PAGE_SIZE).string();
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        List<Vod> items = new ArrayList<>();
        String query = key.trim().toLowerCase(Locale.ROOT);
        for (int i = 0; !query.isEmpty() && i < catalog.size(); i++) {
            JsonObject record = catalog.get(i).getAsJsonObject();
            String text = "示範 " + record.get("name").getAsString() + " " + record.get("genre").getAsString() + " " + record.get("area").getAsString()
                    + " " + record.get("year").getAsString() + " " + record.get("director").getAsString() + " " + record.getAsJsonArray("actors");
            if (text.toLowerCase(Locale.ROOT).contains(query)) items.add(card(record, "list", "list"));
        }
        return Response.page(items, Integer.parseInt(pg), PAGE_SIZE).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        JsonObject record = record(ids.get(0).replaceFirst("^vod/", ""));
        if (record == null) return Response.notify("找不到此範例影片");
        String flags = "主要線";
        String urls = episodeLine(record, "main");
        if (!option("backup_media_url").isEmpty()) {
            flags += "$$$備用線";
            urls += "$$$" + episodeLine(record, "backup");
        }
        if (option("media_url").split("\\?", 2)[0].toLowerCase(Locale.ROOT).endsWith(".m3u8")) {
            flags += "$$$代理線";
            urls += "$$$" + episodeLine(record, "proxy");
        }
        List<String> actors = new ArrayList<>();
        for (JsonElement name : record.getAsJsonArray("actors")) actors.add(clickable("actor", name.getAsString()));
        Vod item = card(record, "portrait", "portrait")
                .typeName(record.get("genre").getAsString()).area(record.get("area").getAsString())
                .director(clickable("director", record.get("director").getAsString())).actor(String.join("、", actors))
                .content(record.get("content").getAsString()).playFrom(flags).playUrl(urls);
        return Response.create().vod(item).string();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] parts = id.split("/");
        if (parts.length != 4 || !parts[0].equals("play") || !List.of("main", "backup", "proxy").contains(parts[3])) return Response.notify("無效的範例播放 ID");
        JsonObject record = record(parts[1]);
        int episode;
        try {
            episode = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            episode = 0;
        }
        if (record == null || episode < 1 || episode > record.getAsJsonArray("episodes").size()) return Response.notify("找不到此範例集數");
        String key = parts[3].equals("backup") ? "backup_media_url" : "media_url";
        String url = option(key);
        JsonObject choices = parts[3].equals("main") && options.has("media_urls") ? qualities(options.getAsJsonObject("media_urls")) : null;
        if (choices != null) url = choices.getAsJsonArray("values").get(choices.get("position").getAsInt()).getAsJsonObject().get("v").getAsString();
        JsonElement headers = options.get(parts[3].equals("backup") ? "backup_media_headers" : "media_headers");
        if (headers == null || !headers.isJsonObject()) headers = new JsonObject();
        if (url.isEmpty() && parts[3].equals("main") && !option("sniff_url").isEmpty())
            return GSON.toJson(Map.of("parse", 1, "jx", 0, "url", httpUrl(option("sniff_url"), "sniff_url"), "header", headers));
        if (url.isEmpty()) return Response.notify("請先設定 ext." + key + " 再測試播放");
        JsonObject result = GSON.toJsonTree(Map.of("parse", 0, "jx", 0,
                "url", parts[3].equals("proxy") ? getProxyUrl(Map.of("demo", "playlist")) : httpUrl(url, key),
                "header", headers, "artwork", picture(record, "landscape"),
                "desc", record.get("name").getAsString() + "・" + record.getAsJsonArray("episodes").get(episode - 1).getAsString())).getAsJsonObject();
        if (options.has("skips")) result.add("skips", skips(options.getAsJsonArray("skips")));
        if (choices != null) result.add("url", choices);
        for (String field : List.of("subs", "danmaku", "drm", "format")) {
            String source = field.equals("subs") ? "subtitles" : field.equals("format") ? "media_format" : field;
            if (options.has(source)) result.add(field, options.get(source));
        }
        if (options.has("start_position_ms")) result.addProperty("position", milliseconds(options.get("start_position_ms")));
        return GSON.toJson(result);
    }

    @Override
    public String liveContent(String url) throws Exception {
        List<String> urls = new ArrayList<>();
        for (String[] entry : new String[][]{{"media_url", "主要線"}, {"backup_media_url", "備用線"}})
            if (!option(entry[0]).isEmpty()) urls.add(httpUrl(option(entry[0]), entry[0]) + "$" + entry[1]);
        return GSON.toJson(urls.isEmpty() ? List.of() : List.of(Map.of("name", "範例直播", "channel", List.of(Map.of("name", "示範頻道", "urls", urls)))));
    }

    @Override
    public Object[] proxy(Map<String, String> params) throws Exception {
        String body = "未知的範例 proxy";
        String mime = "text/plain; charset=utf-8";
        int status = 404;
        if ("json".equals(params.get("demo"))) {
            body = GSON.toJson(Map.of("name", "demo", "ok", true));
            mime = "application/json; charset=utf-8";
            status = 200;
        } else if ("playlist".equals(params.get("demo")) && !option("media_url").isEmpty()) {
            body = "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\n" + httpUrl(option("media_url"), "media_url") + "\n";
            mime = "application/vnd.apple.mpegurl";
            status = 200;
        }
        return new Object[]{status, mime, new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)), Map.of("X-Demo", "1")};
    }

    @Override
    public String action(String value) throws Exception {
        switch (value) {
            case "site_key":
                return Response.notify("目前 Site key：" + siteKey);
            case "toast":
                return Response.notify("這是 Java action 回傳、由 App 顯示的 Toast");
            case "native_toast":
                Runtime.toast("Java 執行中的提示");
                return "{}";
            case "dialog":
                showDialog();
                return "{}";
            case "web":
                return web(false);
            case "web_view":
                return web(true);
            case "cookie":
                return Response.notify("指定的 WebView Cookie " + (cookieExists() ? "已存在" : "不存在"));
            case "cookie_clear":
                String name = cookieName();
                if (!net.setCookie(webUrl(), name + "=; Path=/; Max-Age=0")) throw new IllegalStateException("Cookie 清除失敗");
                return Response.notify(cookieExists() ? "WebView Cookie 清除失敗" : "已清除指定的 WebView Cookie");
            case "sleep":
                net.sleep(250);
                return Response.notify("等待完成（250 毫秒）");
            case "ttl_cache", "ttl_peek", "ttl_clear", "ttl_clear_all", "ttl_persist", "ttl_background",
                 "cache_write", "cache_read", "cache_delete":
                return cacheAction(value);
            case "proxy":
                return Response.notify("本機 proxy：" + JsonParser.parseString(net.json(getProxyUrl(Map.of("demo", "json")), "{}")).getAsJsonObject().get("name").getAsString());
            case "download":
                return download();
            case "runtime":
                return runtime();
            default:
                try {
                    return networkAction(value);
                } catch (Exception e) {
                    return Response.notify("網路示範失敗：" + e.getMessage());
                }
        }
    }

    private String cacheAction(String value) throws Exception {
        switch (value) {
            case "ttl_cache":
                return Response.notify("TTL 快取：" + JsonParser.parseString(net.cached("demo:ttl", "{\"ttl\":60000}", () -> GSON.toJson(Map.of("value", "範例資料")))).getAsJsonObject().get("value").getAsString());
            case "ttl_peek":
                String cached = net.peek("demo:ttl");
                return Response.notify(cached == null ? "目前沒有 TTL 快取" : "已有 TTL 快取：" + JsonParser.parseString(cached).getAsJsonObject().get("value").getAsString());
            case "ttl_clear":
                net.clearCache("demo:ttl");
                return Response.notify("已清除 TTL 快取");
            case "ttl_clear_all":
                net.clearCache();
                return Response.notify("已清除目前站點的全部 TTL 快取");
            case "ttl_persist":
                return Response.notify("持久化快取：" + JsonParser.parseString(net.cached("demo:persist", "{\"ttl\":60000,\"stale\":false,\"persist\":true}", this::cacheValue)).getAsJsonObject().get("updated").getAsLong());
            case "ttl_background":
                String saved = net.peek("demo:background");
                net.refresh("demo:background", "{\"ttl\":1000,\"stale\":false,\"persist\":true}", () -> {
                    net.sleep(250);
                    return cacheValue();
                });
                return Response.notify("背景更新已安排；目前值：" + (saved == null ? "尚未載入" : JsonParser.parseString(saved).getAsJsonObject().get("updated").getAsLong()));
            case "cache_write":
                local.set("demo:local", GSON.toJson(Map.of("value", "範例資料", "items", Arrays.asList(1, true, null))));
                return Response.notify("Local 已寫入");
            case "cache_read":
                return Response.notify("Local：" + local.get("demo:local"));
            case "cache_delete":
                local.delete("demo:local");
                return Response.notify("Local 已刪除");
            default:
                throw new IllegalArgumentException(value);
        }
    }

    private String networkAction(String value) throws Exception {
        if (value.equals("socket-start")) return connectSocket();
        if (value.equals("socket-stop")) {
            if (socket != null) socket.close();
            socket = null;
            return Response.notify("WebSocket 已停止");
        }
        if (value.equals("socket-state")) {
            JsonObject state = socketState;
            synchronized (state) {
                return Response.notify(state.toString());
            }
        }
        if (value.equals("json")) return Response.notify("JSON 請求成功：" + JsonParser.parseString(net.json(httpUrl(option("json_url"), "json_url"), "{}")).getClass().getSimpleName());
        if (value.equals("websocket")) return websocket();
        String url = httpUrl(option("request_url", option("web_url")), "request_url");
        switch (value) {

            case "text_get":
                return Response.notify("GET 正文長度：" + net.get(url).length());
            case "text_post":
                return Response.notify("POST 正文長度：" + net.post(url, GSON.toJson(Map.of("value", "demo"))).length());
            case "parallel":
                JsonArray requests = new JsonArray();
                for (int i = 0; i < 3; i++) requests.add(GSON.toJsonTree(Map.of("url", url, "options", Map.of("timeout", 15000))));
                for (Net.Result response : net.batch(GSON.toJson(requests))) {
                    if (response.error != null) throw new IllegalStateException(response.error);
                    if ((Integer) response.code < 200 || (Integer) response.code >= 300) throw new IllegalStateException("HTTP " + response.code);
                }
                return Response.notify("並行完成 3 次請求");
            case "session":
                try (Net flow = net.session()) {
                    if (!flow.setCookie(url, "demo_session=1; Path=/")) throw new IllegalStateException("Session Cookie 寫入失敗");
                    checkResponse(JsonParser.parseString(flow.req(url, "{\"timeout\":15000}")).getAsJsonObject());
                    return Response.notify("隔離 Session 請求完成，Cookie " + (flow.getCookie(url).contains("demo_session=1") ? "存在" : "不存在"));
                }
            case "binary", "request_sync", "request":
                return request(url, value);
            default:
                return Response.notify("範例不支援此操作");
        }
    }

    private String request(String url, String value) throws Exception {
        JsonObject settings = GSON.toJsonTree(Map.of("timeout", 15000, "callTimeout", 15000, "cookie", value.equals("request"),
                "method", option("request_method", "GET"))).getAsJsonObject();
        if (options.has("request_headers") && options.get("request_headers").isJsonObject()) settings.add("headers", options.get("request_headers"));
        if (options.has("request_options")) for (Map.Entry<String, JsonElement> entry : options.getAsJsonObject("request_options").entrySet()) settings.add(entry.getKey(), entry.getValue());
        if (value.equals("binary")) settings.addProperty("buffer", 1);
        JsonObject data = JsonParser.parseString(net.req(url, GSON.toJson(settings))).getAsJsonObject();
        checkResponse(data);
        return Response.notify("HTTP " + data.get("code").getAsInt() + "，回應長度 " + (value.equals("binary") ? data.getAsJsonArray("content").size() : data.get("content").getAsString().length()));
    }

    private String websocket() throws Exception {
        JsonObject ws = new JsonObject();
        ws.addProperty("timeout", 15000);
        if (options.has("ws_data")) ws.add("data", options.get("ws_data"));
        if (options.has("ws_headers") && options.get("ws_headers").isJsonObject()) ws.add("headers", options.get("ws_headers"));
        JsonObject response = JsonParser.parseString(net.ws(options.getAsJsonPrimitive("ws_url").getAsString(), GSON.toJson(ws))).getAsJsonObject();
        if (response.has("error")) throw new IllegalStateException(response.get("error").getAsString());
        return Response.notify("WebSocket " + response.get("code").getAsInt() + "，回應長度 " + response.get("content").getAsString().length());
    }

    private String connectSocket() throws Exception {
        if (option("ws_url").isEmpty()) return Response.notify("請先在 ext 設定 ws_url");
        if (socket != null) socket.cancel();
        JsonObject state = new JsonObject();
        state.addProperty("state", "連線中");
        state.addProperty("text", 0);
        state.addProperty("binary", 0);
        socketState = state;
        JsonObject settings = GSON.toJsonTree(Map.of("timeout", 15000, "ping", 30000)).getAsJsonObject();
        if (options.has("ws_data")) settings.add("data", options.get("ws_data"));
        if (options.has("ws_headers") && options.get("ws_headers").isJsonObject()) settings.add("headers", options.get("ws_headers"));
        socket = net.connect(options.getAsJsonPrimitive("ws_url").getAsString(), GSON.toJson(settings), (connection, event) -> socketEvent(connection, event, state));
        return Response.notify("WebSocket 已開始連線");
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

    private void checkResponse(JsonObject value) throws Exception {
        if (value.has("error")) throw new IllegalStateException(value.get("error").getAsString());
        int code = value.get("code").getAsInt();
        if (code < 200 || code >= 300) throw new IllegalStateException("HTTP " + code);
    }

    private String web(boolean view) throws Exception {
        String url = view && !option("game_url").isEmpty() ? httpUrl(option("game_url"), "game_url") : webUrl();
        JsonObject web = new JsonObject();
        web.addProperty("url", url);
        if (view) web.addProperty("mode", "view");
        else if (options.has("web_cookie")) web.add("cookie", options.getAsJsonArray("web_cookie"));
        else if (!option("cookie_name").isEmpty()) web.add("cookie", GSON.toJsonTree(List.of(Map.of("keys", List.of(cookieName())))));
        return GSON.toJson(Map.of("web", web));
    }

    private boolean cookieExists() {
        String name = cookieName();
        for (String part : net.getCookie(webUrl()).split(";")) if (part.trim().startsWith(name + "=") && part.trim().length() > name.length() + 1) return true;
        return false;
    }

    private String cookieName() {
        String value = option("cookie_name");
        if (!value.matches("[!#$%&'*+.^_`|~0-9A-Za-z-]+")) throw new IllegalArgumentException("cookie_name 格式無效");
        return value;
    }

    private String webUrl() {
        return httpUrl(option("web_url"), "web_url");
    }

    private String download() throws Exception {
        File file = File.createTempFile("spider-demo-", ".bin", Runtime.context().getCacheDir());
        try {
            net.download(httpUrl(option("request_url"), "request_url"), "{}", file);
            return Response.notify("下載完成：" + file.length() + " bytes");
        } finally {
            file.delete();
        }
    }

    private String cacheValue() throws Exception {
        return GSON.toJson(Map.of("updated", System.currentTimeMillis(), "items", Arrays.asList(1, true, null)));
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
        return Response.notify(passed ? "App 與加密 bridge 測試通過" : "App 或加密 bridge 測試失敗");
    }

    private JsonArray skips(JsonArray values) throws Exception {
        for (JsonElement element : values) {
            JsonObject value = element.getAsJsonObject();
            if (!List.of("opening", "middle", "ending").contains(value.getAsJsonPrimitive("type").getAsString())) throw new IllegalArgumentException("skips.type 格式錯誤");
            long start = milliseconds(value.get("start"));
            if (!value.has("end") && value.getAsJsonPrimitive("type").getAsString().equals("ending") && start > 0) continue;
            if (milliseconds(value.get("end")) <= start) throw new IllegalArgumentException("skips.end 必須晚於 start");
        }
        return values.deepCopy();
    }

    private JsonObject qualities(JsonObject value) throws Exception {
        JsonArray values = value.getAsJsonArray("values");
        if (values.isEmpty()) throw new IllegalArgumentException("media_urls.values 不可為空");
        for (JsonElement element : values) {
            JsonObject item = element.getAsJsonObject();
            item.getAsJsonPrimitive("n").getAsString();
            httpUrl(item.getAsJsonPrimitive("v").getAsString(), "media_urls.v");
        }
        long position = value.has("position") ? milliseconds(value.get("position")) : 0;
        if (position >= values.size()) throw new IllegalArgumentException("media_urls.position 必須是有效畫質索引");
        JsonObject result = value.deepCopy();
        result.addProperty("position", position);
        return result;
    }

    private long milliseconds(JsonElement value) {
        if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber() || !value.getAsString().matches("-?(0|[1-9][0-9]*)"))
            throw new IllegalArgumentException("時間必須是非負整數毫秒");
        long milliseconds = Long.parseLong(value.getAsString());
        if (milliseconds < 0) throw new IllegalArgumentException("時間必須是非負整數毫秒");
        return milliseconds;
    }

    private JsonObject record(String id) throws Exception {
        for (JsonElement element : catalog) if (element.getAsJsonObject().get("id").getAsString().equals(id)) return element.getAsJsonObject();
        return null;
    }

    private Vod card(JsonObject record, String style, String pictureStyle) throws Exception {
        return Vod.create().id("vod/" + record.get("id").getAsString()).name(record.get("name").getAsString()).pic(picture(record, pictureStyle)).remarks(record.get("remark").getAsString())
                .year(record.get("year").getAsString()).style(style.isEmpty() ? null : style(style));
    }

    private Style style(String name) {
        if (name.equals("list")) return Style.create().type("list");
        return Style.create().type(name.equals("oval") ? "oval" : "rect").ratio(name.equals("oval") ? 1.0f : name.equals("landscape") ? 1.78f : 0.75f);
    }

    private String picture(JsonObject record, String style) throws Exception {
        String base = option("image_base").replaceAll("/+$", "");
        if (base.isEmpty()) return "";
        return httpUrl(base, "image_base") + "/" + Uri.encode(record.get("id").getAsString()) + (style.equals("landscape") ? "/800/450" : style.equals("oval") ? "/600/600" : "/600/800");
    }

    private boolean matchesFilters(JsonObject record, Map<String, String> filter) {
        for (String key : List.of("genre", "area", "year")) {
            String value = filter.getOrDefault(key, "all");
            if (!value.equals("all") && !value.equals(record.get(key).getAsString())) return false;
        }
        return true;
    }

    private boolean matchesFolder(JsonObject record, String tid) {
        if (tid.startsWith("folder/genre/")) return record.get("genre").getAsString().equals(Uri.decode(tid.substring(13)));
        if (tid.startsWith("folder/area/")) return record.get("area").getAsString().equals(Uri.decode(tid.substring(12)));
        if (tid.startsWith("director/")) return record.get("director").getAsString().equals(Uri.decode(tid.substring(9)));
        if (tid.startsWith("actor/")) {
            for (JsonElement actor : record.getAsJsonArray("actors")) if (actor.getAsString().equals(Uri.decode(tid.substring(6)))) return true;
        }
        return false;
    }

    private List<Filter> filterRows() throws Exception {
        List<Filter> rows = new ArrayList<>();
        rows.add(Filter.create().key("sort").name("排序").value(List.of(Value.create().n("最新").v("latest"), Value.create().n("最早").v("oldest"), Value.create().n("名稱").v("name"))).init("latest"));
        for (String[] row : DemoData.FILTERS) {
            List<Value> values = new ArrayList<>();
            values.add(Value.create().n("全部").v("all"));
            for (int i = 2; i < row.length; i++) values.add(Value.create().n(row[i]).v(row[i]));
            rows.add(Filter.create().key(row[0]).name(row[1]).value(values).init("all"));
        }
        return rows;
    }

    private List<Vod> folderCards() throws Exception {
        List<Vod> items = new ArrayList<>();
        for (String[] group : DemoData.FOLDERS) {
            for (int i = 1; i < group.length; i++)
                items.add(Vod.create().id("folder/" + group[0] + "/" + Uri.encode(group[i])).name(group[i] + "資料夾").pic("").remarks("依分類開啟")
                        .tag("folder").style(style("list")));
        }
        return items;
    }

    private List<Vod> actionCards() throws Exception {
        List<Vod> items = new ArrayList<>();
        for (String[] value : DemoData.ACTIONS) {
            items.add(Vod.create().id("action/" + value[0]).name(value[1]).pic("").remarks(value[2]).style(style("list")).action(value[0]));
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

    private String episodeLine(JsonObject record, String source) throws Exception {
        List<String> episodes = new ArrayList<>();
        JsonArray names = record.getAsJsonArray("episodes");
        for (int i = 0; i < names.size(); i++) episodes.add(names.get(i).getAsString().replace('$', '＄').replace('#', '＃') + "$play/" + record.get("id").getAsString() + "/" + (i + 1) + "/" + source);
        return String.join("#", episodes);
    }

    private String option(String key) {
        return option(key, "");
    }

    private String option(String key, String fallback) {
        JsonElement value = options.get(key);
        if (value == null) return fallback;
        return value.isJsonPrimitive() ? value.getAsString() : value.toString();
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
