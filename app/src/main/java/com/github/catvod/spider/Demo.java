package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;

import com.github.catvod.Runtime;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Danmaku;
import com.github.catvod.bean.Drm;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.SkipSegment;
import com.github.catvod.bean.Style;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Url;
import com.github.catvod.bean.Value;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.Web;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Net;
import com.github.catvod.net.NetOptions;
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

import org.json.JSONObject;

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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * TV Java 功能範例；配置與接口說明見 docs/development.md。
 */
public class Demo extends Spider {

    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
    private static final int PAGE_SIZE = 4;
    private static final List<String> VIDEO_SUFFIXES = List.of(".m3u8", ".mpd", ".mp4", ".mkv", ".flv", ".mp3", ".m4a", ".aac");
    private static final List<String> PLAY_SOURCES = List.of("main", "backup", "proxy");
    private static final List<String> SKIP_TYPES = List.of("opening", "middle", "ending");

    private JsonObject socketState = new JsonObject();
    private JsonObject options;
    private JsonArray catalog;
    private NetSocket socket;

    @Override
    public void init(Context context, String extend) throws Exception {
        options = JsonParser.parseString(extend.isEmpty() ? "{}" : extend).getAsJsonObject();
        if (options.has("request_options") && !options.get("request_options").isJsonObject()) throw new IllegalArgumentException("request_options 必須是物件");
        options.addProperty("web_url", httpUrl(option("web_url").isEmpty() ? "https://example.com/" : option("web_url"), "web_url"));
        options.addProperty("request_url", httpUrl(option("request_url").isEmpty() ? webUrl() : option("request_url"), "request_url"));
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
        if (tid.equals("actions")) return Response.page(actionCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        if (tid.equals("folders")) return Response.page(folderCards(), Integer.parseInt(pg), PAGE_SIZE).string();
        boolean folder = tid.startsWith("folder/") || tid.startsWith("actor/") || tid.startsWith("director/");
        List<JsonObject> records = categoryRecords(tid, extend, folder);
        Comparator<JsonObject> order = categoryOrder(extend.getOrDefault("sort", "latest"));
        if (!folder) records.sort(order);
        String style = folder ? "list" : categoryStyle(tid);
        String picture = tid.equals("class_landscape") ? "landscape" : tid.equals("class_oval") ? "oval" : style;
        List<Vod> items = new ArrayList<>();
        for (JsonObject record : records) items.add(card(record, style, picture));
        return Response.page(items, Integer.parseInt(pg), PAGE_SIZE).string();
    }

    private List<JsonObject> categoryRecords(String tid, Map<String, String> filter, boolean folder) {
        List<JsonObject> records = new ArrayList<>();
        boolean content = !categoryStyle(tid).isEmpty() || tid.equals("class_landscape") || tid.equals("class_oval");
        for (JsonElement element : catalog) {
            JsonObject record = element.getAsJsonObject();
            if (folder ? matchesFolder(record, tid) : content && matchesFilters(record, filter)) records.add(record);
        }
        return records;
    }

    private Comparator<JsonObject> categoryOrder(String sort) {
        Comparator<JsonObject> order = sort.equals("name") ? Comparator.comparing(v -> v.get("name").getAsString()) : Comparator.comparing((JsonObject v) -> v.get("year").getAsString()).thenComparing(v -> v.get("id").getAsString());
        return !sort.equals("name") && !sort.equals("oldest") ? order.reversed() : order;
    }

    private String categoryStyle(String tid) {
        return switch (tid) {
            case "vod_portrait" -> "portrait";
            case "vod_landscape" -> "landscape";
            case "vod_oval" -> "oval";
            case "vod_list" -> "list";
            default -> "";
        };
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        List<Vod> items = new ArrayList<>();
        String query = key.trim().toLowerCase(Locale.ROOT);
        for (int i = 0; !query.isEmpty() && i < catalog.size(); i++) {
            JsonObject record = catalog.get(i).getAsJsonObject();
            String text = "示範 " + record.get("name").getAsString() + " " + record.get("genre").getAsString() + " " + record.get("area").getAsString() + " " + record.get("year").getAsString() + " " + record.get("director").getAsString() + " " + record.getAsJsonArray("actors");
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
        List<Vod> items = new ArrayList<>();
        for (String id : ids) {
            JsonObject record = record(id.replaceFirst("^vod/", ""));
            if (record == null) return Response.create().vods(List.of()).msg("找不到此範例影片").string();
            items.add(detailVod(record));
        }
        return Response.create().vods(items).string();
    }

    private Vod detailVod(JsonObject record) throws Exception {
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
        return card(record, "portrait", "portrait").typeName(record.get("genre").getAsString()).area(record.get("area").getAsString()).director(clickable("director", record.get("director").getAsString())).actor(String.join("、", actors)).content(record.get("content").getAsString()).playFrom(flags).playUrl(urls);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] parts = id.split("/");
        if (parts.length != 4 || !parts[0].equals("play") || !PLAY_SOURCES.contains(parts[3])) return Response.notify("無效的範例播放 ID");
        JsonObject record = record(parts[1]);
        int episode = episodeNumber(parts[2]);
        if (record == null || episode < 1 || episode > record.getAsJsonArray("episodes").size()) return Response.notify("找不到此範例集數");
        String source = parts[3];
        String key = source.equals("backup") ? "backup_media_url" : "media_url";
        String url = option(key);
        Url qualities = source.equals("main") && options.has("media_urls") ? qualities(options.getAsJsonObject("media_urls")) : null;
        Map<String, String> headers = mediaHeaders(source.equals("backup") ? "backup_media_headers" : "media_headers");
        if (qualities == null && url.isEmpty() && source.equals("main") && !option("sniff_url").isEmpty()) return Response.create().parse().url(httpUrl(option("sniff_url"), "sniff_url")).header(headers).vod(detailVod(record)).string();
        if (qualities == null && url.isEmpty()) return Response.notify("請先設定 ext." + key + " 再測試播放");
        Object media = qualities != null ? qualities : source.equals("proxy") ? proxyUrl(Map.of("demo", "playlist")) : httpUrl(url, key);
        Response result = Response.create().url(media).header(headers).vod(detailVod(record)).artwork(picture(record, "landscape")).desc(record.get("name").getAsString() + "・" + record.getAsJsonArray("episodes").get(episode - 1).getAsString());
        if (options.has("skips")) result.skips(skips(options.getAsJsonArray("skips")));
        if (options.has("timeshift")) result.put("timeshift", options.get("timeshift"));
        applyPlaybackOptions(result);
        return result.string();
    }

    private int episodeNumber(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void applyPlaybackOptions(Response result) {
        if (options.has("subtitles") && !options.get("subtitles").isJsonNull()) result.subs(Arrays.asList(GSON.fromJson(options.get("subtitles"), Sub[].class)));
        if (options.has("danmaku") && !options.get("danmaku").isJsonNull()) result.danmaku(Arrays.asList(GSON.fromJson(options.get("danmaku"), Danmaku[].class)));
        if (options.has("drm")) result.drm(GSON.fromJson(options.get("drm"), Drm.class));
        if (options.has("media_format") && !options.get("media_format").isJsonNull()) result.format(option("media_format"));
        if (options.has("live_danmaku") && options.get("live_danmaku").getAsBoolean()) result.danmaku(List.of(Danmaku.create().name("即時彈幕").url(danmakuUrl("demo"))));
        if (options.has("start_position_ms")) result.position(milliseconds(options.get("start_position_ms")));
    }

    private Map<String, String> mediaHeaders(String key) {
        Map<String, String> headers = new LinkedHashMap<>();
        JsonElement value = options.get(key);
        if (value != null && value.isJsonObject()) for (Map.Entry<String, JsonElement> entry : value.getAsJsonObject().entrySet()) headers.put(entry.getKey(), entry.getValue().getAsString());
        return headers;
    }

    @Override
    public String liveContent(String url) throws Exception {
        List<String> urls = new ArrayList<>();
        for (String[] entry : new String[][]{{"media_url", "主要線"}, {"backup_media_url", "備用線"}}) if (!option(entry[0]).isEmpty()) urls.add(httpUrl(option(entry[0]), entry[0]) + "$" + entry[1]);
        return GSON.toJson(urls.isEmpty() ? List.of() : List.of(Map.of("name", "範例直播", "channel", List.of(Map.of("name", "示範頻道", "urls", urls)))));
    }

    @Override
    public Object[] proxy(Map<String, String> params) throws Exception {
        if ("stream".equals(params.get("demo"))) {
            Net.StreamResult response = openStream(httpUrl(option("request_url", option("web_url")), "request_url"));
            return new Object[]{response.code, response.contentType, response, proxyHeaders(response.headers)};
        }
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

    private Map<String, String> proxyHeaders(Map<String, Object> source) {
        Map<String, String> headers = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : source.entrySet()) {
            Object value = entry.getValue();
            headers.put(entry.getKey(), value instanceof List<?> values ? values.stream().map(Object::toString).collect(Collectors.joining(", ")) : value.toString());
        }
        return headers;
    }

    @Override
    public String action(String value) throws Exception {
        switch (value) {
            case "script":
                String evaluated = js.eval("({value: value + 1, digest: md5X(text)})", GSON.toJson(Map.of("globals", Map.of("value", 41, "text", "demo"), "timeout", 1000)));
                return Response.notify("腳本執行結果：" + evaluated);
            case "site_key":
                return Response.notify("目前 Site key：" + siteKey);
            case "toast":
                return Response.notify("這是 Java action 回傳、由 App 顯示的 Toast");
            case "native_toast":
                Runtime.toast("Java 執行中的提示");
                return "{}";
            case "dialog":
                return showDialog();
            case "dialog_steps":
                return showDialogSteps();
            case "qrcode":
                return showQRCode();
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
                return Response.notify("本機 proxy：" + JsonParser.parseString(net.json(proxyUrl(Map.of("demo", "json")), "{}")).getAsJsonObject().get("name").getAsString());
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
        switch (value) {
            case "socket-start" -> {
                return connectSocket();
            }
            case "socket-stop" -> {
                if (socket != null) socket.close();
                socket = null;
                return Response.notify("WebSocket 已停止");
            }
            case "socket-state" -> {
                JsonObject state = socketState;
                synchronized (state) {
                    return Response.notify(state.toString());
                }
            }
            case "json" -> {
                return Response.notify("JSON 請求成功：" + JsonParser.parseString(net.json(httpUrl(option("json_url"), "json_url"), "{}")).getClass().getSimpleName());
            }
            case "websocket" -> {
                return websocket();
            }
        }
        String url = httpUrl(option("request_url", option("web_url")), "request_url");
        switch (value) {
            case "stream_read":
                return Response.notify("串流讀取完成：" + countStreamBytes(url) + " bytes");
            case "proxy_stream":
                return Response.notify("串流讀取完成：" + countStreamBytes(proxyUrl(Map.of("demo", "stream"))) + " bytes");
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
            case "parallel_map":
                List<String> urls = List.of(url, httpUrl(option("json_url"), "json_url"));
                List<Map<String, Object>> values = net.map(urls, this::requestSummary, 2);
                return Response.notify("並行映射完成：" + GSON.toJson(values));
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

    private Map<String, Object> requestSummary(String url, int index) throws Exception {
        JsonObject response = JsonParser.parseString(net.req(url, "{\"timeout\":15000}")).getAsJsonObject();
        checkResponse(response);
        return Map.of("index", index, "code", response.get("code").getAsInt());
    }

    private Net.StreamResult openStream(String url) throws Exception {
        CompletableFuture<Net.StreamResult> pending = net.requestStreamAsync(url, NetOptions.from(GSON.toJson(Map.of("timeout", 15000, "callTimeout", 15000))));
        try {
            return pending.get();
        } catch (InterruptedException error) {
            pending.cancel(true);
            Thread.currentThread().interrupt();
            throw error;
        }
    }

    private long countStreamBytes(String url) throws Exception {
        try (Net.StreamResult response = openStream(url)) {
            if (response.code < 200 || response.code >= 300) throw new IllegalStateException("HTTP " + response.code);
            byte[] buffer = new byte[65536];
            long length = 0;
            for (int count; (count = response.read(buffer)) != -1; ) length += count;
            return length;
        }
    }

    private String request(String url, String value) throws Exception {
        JsonObject settings = GSON.toJsonTree(Map.of("timeout", 15000, "callTimeout", 15000, "cookie", value.equals("request"), "method", option("request_method", "GET"))).getAsJsonObject();
        if (options.has("request_headers") && options.get("request_headers").isJsonObject()) settings.add("headers", options.get("request_headers"));
        if (options.has("request_options")) for (Map.Entry<String, JsonElement> entry : options.getAsJsonObject("request_options").entrySet()) settings.add(entry.getKey(), entry.getValue());
        if (value.equals("binary")) settings.addProperty("buffer", 1);
        JsonObject data = JsonParser.parseString(net.req(url, GSON.toJson(settings))).getAsJsonObject();
        checkResponse(data);
        JsonElement content = data.get("content");
        return Response.notify("HTTP " + data.get("code").getAsInt() + "，回應長度 " + (content.isJsonArray() ? content.getAsJsonArray().size() : content.getAsString().length()));
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

    @Override
    public AutoCloseable danmaku(String id, Consumer<JSONObject> emit) throws Exception {
        if (option("ws_url").isEmpty()) throw new IllegalArgumentException("請先在 ext 設定 ws_url");
        JsonObject settings = GSON.toJsonTree(Map.of("timeout", 15000, "ping", 30000, "reconnect", true)).getAsJsonObject();
        if (options.has("ws_idle")) settings.add("idle", options.get("ws_idle"));
        if (options.has("ws_data")) settings.add("data", options.get("ws_data"));
        if (options.has("ws_headers")) settings.add("headers", options.get("ws_headers"));
        AtomicBoolean ready = new AtomicBoolean();
        AtomicBoolean stopped = new AtomicBoolean();
        NetSocket connection = net.connect(option("ws_url"), GSON.toJson(settings), (socket, event) -> danmakuEvent(event, emit, ready, stopped));
        return () -> {
            stopped.set(true);
            connection.cancel();
        };
    }

    private void danmakuEvent(NetSocket.Event event, Consumer<JSONObject> emit, AtomicBoolean ready, AtomicBoolean stopped) {
        if (stopped.get()) return;
        if (event.type.equals("message") && !event.binary) {
            if (ready.compareAndSet(false, true)) emit.accept(new JSONObject(Map.of("state", "ready")));
            emit.accept(new JSONObject(Map.of("text", event.content, "color", 0x66ccff, "size", 25, "type", 1, "colors", List.of(0x66ccff, 0xcc99ff))));
        } else if (event.type.equals("retry")) {
            ready.set(false);
            emit.accept(new JSONObject(Map.of("state", "retrying", "msg", "彈幕連線中斷，等待恢復")));
        } else if (event.type.equals("error") || event.type.equals("close")) {
            stopped.set(true);
            String msg = event.error == null ? "彈幕連線已關閉" : event.error;
            emit.accept(new JSONObject(Map.of("state", "error", "msg", msg.substring(0, Math.min(msg.length(), 512)))));
        }
    }

    private String connectSocket() throws Exception {
        if (option("ws_url").isEmpty()) return Response.notify("請先在 ext 設定 ws_url");
        if (socket != null) socket.cancel();
        JsonObject state = new JsonObject();
        state.addProperty("state", "連線中");
        state.addProperty("text", 0);
        state.addProperty("binary", 0);
        state.addProperty("retries", 0);
        socketState = state;
        JsonObject settings = GSON.toJsonTree(Map.of("timeout", 15000, "ping", 30000, "reconnect", true)).getAsJsonObject();
        if (options.has("ws_idle")) settings.add("idle", options.get("ws_idle"));
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
                case "retry" -> {
                    state.addProperty("state", "重新連線中");
                    state.addProperty("retries", state.get("retries").getAsInt() + 1);
                    state.addProperty("retryCode", event.code);
                }
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
        Web web = Web.create().url(url);
        if (view) web.mode("view");
        else if (options.has("web_cookie")) web.cookie(Arrays.asList(GSON.fromJson(options.get("web_cookie"), Web.Cookie[].class)));
        else if (!option("cookie_name").isEmpty()) web.cookie(List.of(Web.Cookie.create().keys(List.of(cookieName()))));
        return Response.create().web(web).string();
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
        return httpUrl(option("web_url", "https://example.com/"), "web_url");
    }

    private String download() throws Exception {
        File file = File.createTempFile("spider-demo-", ".bin", Runtime.context().getCacheDir());
        try {
            net.download(httpUrl(option("request_url", webUrl()), "request_url"), "{}", file);
            return Response.notify("下載完成：" + file.length() + " bytes");
        } finally {
            file.delete();
        }
    }

    private String cacheValue() throws Exception {
        return GSON.toJson(Map.of("updated", System.currentTimeMillis(), "items", Arrays.asList(1, true, null)));
    }

    private String showDialog() throws Exception {
        JSONObject result = dialog(new JSONObject(DemoData.DIALOG_FORM), this::onDialog);
        return result == null ? "{}" : Response.notify("已確認表單；輸入內容不會記錄或保存");
    }

    private JSONObject onDialog(JSONObject event) throws Exception {
        net.sleep(250);
        return switch (event.getString("button")) {
            case "fill" -> new JSONObject("""
                    {"values":{"text":"範例內容","choice":"first","choices":["first","second"]},
                    "inputs":[{"name":"text","enabled":true}],"buttons":[{"id":"confirm","enabled":true}]}
                    """);
            case "error" -> new JSONObject("{\"errors\":{\"text\":\"這是欄位錯誤提示示範\"}}");
            default -> new JSONObject().put("close", true);
        };
    }

    private String showQRCode() throws Exception {
        AtomicInteger version = new AtomicInteger(1);
        String initial = "https://example.com/?v=" + version.get();
        JSONObject options = new JSONObject("""
                {"title":"QR Code 範例","copyable":true,
                "buttons":[{"id":"refresh","label":"更新","close":false},{"id":"close","label":"關閉"}]}
                """).put("message", initial).put("qrcode", initial);
        dialog(options, event -> {
            if (!event.getString("button").equals("refresh")) return null;
            net.sleep(250);
            String content = "https://example.com/?v=" + version.incrementAndGet();
            return new JSONObject().put("qrcode", content).put("message", content);
        });
        return "{}";
    }

    private String showDialogSteps() throws Exception {
        AtomicInteger index = new AtomicInteger();
        JSONObject options = new JSONObject("""
                {"title":"第一步","message":"可更新示意圖片，輸入內容後繼續。",
                "inputs":[{"name":"text","label":"內容","helperText":"確認後進入下一步","required":true}],
                "buttons":[{"id":"next","label":"下一步"},{"id":"refresh","label":"更新圖片","close":false,"validate":[]}]}
                """).put("image", DemoData.DIALOG_IMAGES[0]);
        JSONObject first = dialog(options, event -> event.getString("button").equals("refresh")
                ? new JSONObject().put("image", DemoData.DIALOG_IMAGES[index.updateAndGet(value -> 1 - value)]) : null);
        if (first == null) return "{}";
        JSONObject second = dialog(new JSONObject().put("title", "第二步").put("message", first.getJSONObject("values").getString("text")).put("copyable", true));
        return second == null ? "{}" : Response.notify("已完成兩步對話框；輸入內容不會記錄或保存");
    }

    private String runtime() {
        String plain = Crypto.aes("GCM", false, "0388dace60b6a392f328c2b971b2fe78ab6e47d42cec13bdf53a67b21257bddf", false, "00000000000000000000000000000000", "000000000000000000000000", true);
        boolean passed = Crypto.sha256("abc").equals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad") && plain.equals("AAAAAAAAAAAAAAAAAAAAAA==") && !Crypto.randomUrlSafe(16).isEmpty();
        return Response.notify(passed ? "App 與加密 bridge 測試通過" : "App 或加密 bridge 測試失敗");
    }

    private List<SkipSegment> skips(JsonArray values) throws Exception {
        List<SkipSegment> segments = new ArrayList<>();
        for (JsonElement element : values) segments.add(skipSegment(element.getAsJsonObject()));
        return segments;
    }

    private SkipSegment skipSegment(JsonObject value) {
        String type = value.getAsJsonPrimitive("type").getAsString();
        if (!SKIP_TYPES.contains(type)) throw new IllegalArgumentException("skips.type 格式錯誤");
        long start = milliseconds(value.get("start"));
        SkipSegment segment = SkipSegment.create().type(type).start(start);
        if (!value.has("end") && type.equals("ending") && start > 0) return segment;
        long end = milliseconds(value.get("end"));
        if (end <= start) throw new IllegalArgumentException("skips.end 必須晚於 start");
        return segment.end(end);
    }

    private Url qualities(JsonObject value) throws Exception {
        JsonArray values = value.getAsJsonArray("values");
        if (values.isEmpty()) throw new IllegalArgumentException("media_urls.values 不可為空");
        List<Value> qualities = new ArrayList<>();
        for (JsonElement element : values) {
            JsonObject item = element.getAsJsonObject();
            qualities.add(Value.create().n(item.getAsJsonPrimitive("n").getAsString()).v(httpUrl(item.getAsJsonPrimitive("v").getAsString(), "media_urls.v")));
        }
        long position = value.has("position") ? milliseconds(value.get("position")) : 0;
        if (position >= values.size()) throw new IllegalArgumentException("media_urls.position 必須是有效畫質索引");
        return Url.create().values(qualities).position((int) position);
    }

    private long milliseconds(JsonElement value) {
        if (value == null || !value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber() || !value.getAsString().matches("-?(0|[1-9][0-9]*)")) throw new IllegalArgumentException("時間必須是非負整數毫秒");
        long milliseconds = Long.parseLong(value.getAsString());
        if (milliseconds < 0) throw new IllegalArgumentException("時間必須是非負整數毫秒");
        return milliseconds;
    }

    private JsonObject record(String id) throws Exception {
        for (JsonElement element : catalog) if (element.getAsJsonObject().get("id").getAsString().equals(id)) return element.getAsJsonObject();
        return null;
    }

    private Vod card(JsonObject record, String style, String pictureStyle) throws Exception {
        return Vod.create().id("vod/" + record.get("id").getAsString()).name(record.get("name").getAsString()).pic(picture(record, pictureStyle)).remarks(record.get("remark").getAsString()).year(record.get("year").getAsString()).style(style.isEmpty() ? null : style(style));
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
        if (tid.startsWith("actor/")) for (JsonElement actor : record.getAsJsonArray("actors")) if (actor.getAsString().equals(Uri.decode(tid.substring(6)))) return true;
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
            String remark = group[0].equals("genre") ? "依類型開啟" : "依地區開啟";
            for (int i = 1; i < group.length; i++) items.add(Vod.create().id("folder/" + group[0] + "/" + Uri.encode(group[i])).name(group[i] + "資料夾").pic("").remarks(remark).tag("folder").style(style("list")));
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
        Uri target = Uri.parse(url);
        String path = target.getPath();
        if (path == null) return false;
        String normalized = path.toLowerCase(Locale.ROOT);
        return ("http".equalsIgnoreCase(target.getScheme()) || "https".equalsIgnoreCase(target.getScheme())) && target.getHost() != null && VIDEO_SUFFIXES.stream().anyMatch(normalized::endsWith) && !normalized.contains("/ad/");
    }

    @Override
    public void destroy() {
        if (socket != null) socket.cancel();
        socket = null;
    }
}
