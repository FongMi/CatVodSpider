// TV QuickJS 功能範例；配置與接口說明見 CatVodSpider/docs/development.md。

const PAGE_SIZE = 4;
const SEARCH_ALL_KEYWORD = "示範";
const REQUEST_TIMEOUT_MS = 15000;
const CACHE_KEY = "message";

// 真實爬蟲可把這個陣列換成 API 或 HTML 解析結果，其餘介面保持不變。
const CATALOG = [
    {
        id: "demo-01", name: "星光探險隊", genre: "動畫", area: "台灣", year: "2026",
        director: "林導演", actors: ["小安", "小晴"], remark: "更新至 3 集",
        episodes: ["第 1 集", "第 2 集", "第 3 集"],
        content: "一群朋友追尋失落星圖的原創示範故事。",
    },
    {
        id: "demo-02", name: "城市觀察日記", genre: "紀錄", area: "日本", year: "2026",
        director: "周導演", actors: ["阿杰", "小美"], remark: "全 2 集",
        episodes: ["上集", "下集"], content: "從日常交通與市場觀察城市生活。",
    },
    {
        id: "demo-03", name: "料理研究室", genre: "綜藝", area: "韓國", year: "2025",
        director: "陳導演", actors: ["小晴", "大宇"], remark: "更新至 4 集",
        episodes: ["第 1 集", "第 2 集", "第 3 集", "第 4 集"],
        content: "用常見食材完成四道家常料理。",
    },
    {
        id: "demo-04", name: "午後推理社", genre: "戲劇", area: "台灣", year: "2025",
        director: "李導演", actors: ["阿杰", "若葉"], remark: "全 3 集",
        episodes: ["線索", "追蹤", "答案"], content: "三位社員從校園小事練習推理。",
    },
    {
        id: "demo-05", name: "海邊小旅行", genre: "紀錄", area: "台灣", year: "2024",
        director: "周導演", actors: ["大宇"], remark: "正片", episodes: ["正片"],
        content: "沿著海岸記錄自然景色與地方文化。",
    },
    {
        id: "demo-06", name: "節奏練習生", genre: "綜藝", area: "日本", year: "2024",
        director: "陳導演", actors: ["小美", "若葉"], remark: "全 2 集",
        episodes: ["預賽", "決賽"], content: "表演者以節奏合作完成舞台任務。",
    },
    {
        id: "demo-07", name: "紙飛機計畫", genre: "動畫", area: "日本", year: "2023",
        director: "林導演", actors: ["若葉", "小安"], remark: "全 3 集",
        episodes: ["起飛", "風向", "返航"], content: "紙飛機乘著不同風向展開旅程。",
    },
    {
        id: "demo-08", name: "轉角咖啡店", genre: "戲劇", area: "韓國", year: "2023",
        director: "李導演", actors: ["大宇", "小晴"], remark: "全 2 集",
        episodes: ["相遇", "再會"], content: "一間咖啡店串起幾段溫暖的日常。",
    },
    {
        id: "demo-09", name: "機器人運動會", genre: "動畫", area: "韓國", year: "2022",
        director: "林導演", actors: ["阿杰", "小美"], remark: "全 4 集",
        episodes: ["開幕", "接力", "決勝", "閉幕"], content: "小型機器人組隊參加創意競賽。",
    },
    {
        id: "demo-10", name: "深夜電台", genre: "戲劇", area: "台灣", year: "2022",
        director: "李導演", actors: ["小安", "大宇"], remark: "正片", episodes: ["正片"],
        content: "主持人透過來電聽見城市裡的故事。",
    },
    {
        id: "demo-11", name: "週末任務隊", genre: "綜藝", area: "韓國", year: "2021",
        director: "陳導演", actors: ["若葉", "小晴"], remark: "全 3 集",
        episodes: ["任務一", "任務二", "任務三"], content: "成員分組完成城市探索任務。",
    },
    {
        id: "demo-12", name: "山林的一天", genre: "紀錄", area: "日本", year: "2021",
        director: "周導演", actors: ["小美"], remark: "正片", episodes: ["正片"],
        content: "以一天的時間觀察山林生態。",
    },
];

function createSpider(site = {}) {
    const siteKey = isObject(site) ? stringValue(site.key).trim() : "";
    let options = {};
    let socket = null;
    let socketState = {state: "未連線", text: 0, binary: 0};

    function init(ext) {
        options = parseOptions(ext);
        if (options.request_options != null && !isObject(options.request_options)) throw new Error("request_options 必須是物件");
        const imageBase = stringValue(options.image_base).replace(/\/+$/, "");
        if (imageBase) ensureHttpUrl(imageBase, "image_base");
        options.image_base = imageBase;
        if (stringValue(options.web_url)) ensureHttpUrl(options.web_url, "web_url");
        if (stringValue(options.cookie_name)) ensureCookieName(options.cookie_name);
        if (stringValue(options.request_url)) ensureHttpUrl(options.request_url, "request_url");
    }

    function home(filter) {
        const result = {
            class: [
                {type_id: "vod_portrait", type_name: "VOD 直式"},
                {type_id: "vod_landscape", type_name: "VOD 橫式"},
                {type_id: "vod_oval", type_name: "VOD 圓形"},
                {type_id: "vod_list", type_name: "VOD 列表"},
                {type_id: "class_landscape", type_name: "分類橫式", land: 1, ratio: 1.78},
                {type_id: "class_oval", type_name: "分類圓形", circle: 1, ratio: 1.0},
                {type_id: "folders", type_name: "資料夾", type_flag: "1"},
                {type_id: "actions", type_name: "互動功能", type_flag: "1"},
            ],
        };
        if (filter) {
            result.filters = {};
            for (const typeId of [
                "vod_portrait", "vod_landscape", "vod_oval", "vod_list",
                "class_landscape", "class_oval",
            ]) {
                result.filters[typeId] = filterRows();
            }
        }
        return result;
    }

    function homeVod() {
        // 第一筆 VOD 的 style 決定整個首頁區塊，因此每筆都保持相同橫式樣式。
        return {list: CATALOG.slice(0, PAGE_SIZE).map((item) => card(item, "landscape"))};
    }

    function category(tid, pg, filter, extend) {
        const selected = isObject(extend) ? extend : {};
        let items;
        if (tid === "actions") {
            items = actionCards();
        } else if (tid === "folders") {
            items = folderCards();
        } else if (tid.startsWith("folder/genre/")) {
            const genre = decodePart(tid.slice("folder/genre/".length));
            items = CATALOG.filter((item) => item.genre === genre).map((item) => card(item, "list"));
        } else if (tid.startsWith("folder/area/")) {
            const area = decodePart(tid.slice("folder/area/".length));
            items = CATALOG.filter((item) => item.area === area).map((item) => card(item, "list"));
        } else if (tid.startsWith("actor/")) {
            const actor = decodePart(tid.slice("actor/".length));
            items = CATALOG.filter((item) => item.actors.includes(actor)).map((item) => card(item, "list"));
        } else if (tid.startsWith("director/")) {
            const director = decodePart(tid.slice("director/".length));
            items = CATALOG.filter((item) => item.director === director).map((item) => card(item, "list"));
        } else if (contentType(tid)) {
            const styleName = {
                vod_portrait: "portrait",
                vod_landscape: "landscape",
                vod_oval: "oval",
                vod_list: "list",
            }[tid];
            const pictureStyle = {
                class_landscape: "landscape",
                class_oval: "oval",
            }[tid] || styleName;
            // class_* 不放 VOD.style，讓 Class.land / Class.circle 決定整個分類頁樣式。
            items = filteredRecords(selected).map((item) => card(item, styleName, pictureStyle));
        } else {
            items = [];
        }
        return page(items, pg, PAGE_SIZE);
    }

    function detail(id) {
        const ident = removePrefix(stringValue(id), "vod/");
        const record = findRecord(ident);
        if (!record) return {list: [], msg: "找不到此範例影片"};

        const flags = ["主要線"];
        const urls = [episodeLine(record, "main")];
        if (stringValue(options.backup_media_url).trim()) {
            flags.push("備用線");
            urls.push(episodeLine(record, "backup"));
        }

        if (stringValue(options.media_url).split("?", 1)[0].toLowerCase().endsWith(".m3u8")) {
            flags.push("代理線");
            urls.push(episodeLine(record, "proxy"));
        }
        const item = card(record, "portrait");
        Object.assign(item, {
            type_name: record.genre,
            vod_year: record.year,
            vod_area: record.area,
            vod_director: clickable("director", record.director),
            vod_actor: record.actors.map((name) => clickable("actor", name)).join("、"),
            vod_content: record.content,
            vod_play_from: flags.join("$$$"),
            vod_play_url: urls.join("$$$"),
        });
        return {list: [item]};
    }

    function search(key, quick, pg = "1") {
        const query = stringValue(key).trim().toLowerCase();
        if (!query) return page([], pg, PAGE_SIZE);
        const items = CATALOG.filter((item) => [
            SEARCH_ALL_KEYWORD, item.name, item.genre, item.area, item.year, item.director, ...item.actors,
        ].some((value) => stringValue(value).toLowerCase().includes(query)))
            .map((item) => card(item, "list"));
        return page(items, pg, PAGE_SIZE);
    }

    function play(flag, id, vipFlags) {
        const parts = stringValue(id).split("/");
        if (parts.length !== 4 || parts[0] !== "play" || !["main", "backup", "proxy"].includes(parts[3])) {
            return {parse: 0, msg: "無效的範例播放 ID"};
        }

        const record = findRecord(parts[1]);
        const episodeIndex = Number(parts[2]);
        if (!record || !Number.isInteger(episodeIndex) || episodeIndex < 1 || episodeIndex > record.episodes.length) {
            return {parse: 0, msg: "找不到此範例集數"};
        }

        const source = parts[3];
        const optionKey = source === "backup" ? "backup_media_url" : "media_url";
        const choices = source === "main" && options.media_urls != null ? qualities(options.media_urls) : null;
        const url = choices ? choices.values[choices.position].v : stringValue(options[optionKey]).trim();
        if (!url && source === "main" && options.sniff_url) return {parse: 1, jx: 0, url: ensureHttpUrl(options.sniff_url, "sniff_url"), header: stringMap(options.media_headers, "media_headers")};
        if (!url) return {parse: 0, msg: `請先設定 ext.${optionKey} 再測試播放`};
        ensureHttpUrl(url, optionKey);

        const headerKey = source === "main" ? "media_headers" : "backup_media_headers";
        const result = {
            parse: 0,
            jx: 0,
            url: source === "proxy" ? getProxyUrl({demo: "playlist"}) : choices || url,
            header: stringMap(options[headerKey], headerKey),
            artwork: picture(record, "landscape"),
            desc: `${record.name}・${record.episodes[episodeIndex - 1]}`,
        };

        if (options.skips != null) result.skips = skips(options.skips);
        const mediaFormat = stringValue(options.media_format).trim();
        if (mediaFormat) result.format = mediaFormat;
        const subtitleItems = subtitles(options.subtitles);
        if (subtitleItems.length) result.subs = subtitleItems;
        const danmakuItems = danmaku(options.danmaku);
        if (danmakuItems.length) result.danmaku = danmakuItems;
        const drmItem = drm(options.drm);
        if (drmItem) result.drm = drmItem;

        if (Object.prototype.hasOwnProperty.call(options, "start_position_ms")) {
            const position = options.start_position_ms;
            if (!Number.isInteger(position) || position < 0) {
                throw new Error("start_position_ms 必須是大於或等於 0 的整數");
            }
            result.position = position;
        }
        return result;
    }

    async function action(value) {
        if (["json", "session", "parallel", "binary", "request_sync"].includes(value)) return networkAction(value);
        if (value === "download") {
            await net.download(ensureHttpUrl(options.request_url || options.web_url, "request_url"), "spider-demo.bin");
            return {msg: "下載完成，檔案已寫入 App 快取"};
        }
        if (value === "ttl_persist") {
            const data = await net.cached("demo:persist", {ttl: 60000, stale: false, persist: true}, cacheValue);
            return {msg: "持久化快取：" + data.updated};
        }
        if (value === "ttl_background") {
            const data = net.peek("demo:background");
            net.refresh("demo:background", {ttl: 1000, stale: false, persist: true}, async () => {
                await net.sleep(250);
                return cacheValue();
            });
            return {msg: "背景更新已安排；目前值：" + (data ? data.updated : "尚未載入")};
        }
        if (value === "ttl_clear_all") {
            net.clearCache();
            return {msg: "已清除目前站點的全部 TTL 快取"};
        }
        if (value === "web_view") return {web: {url: ensureHttpUrl(options.game_url || options.web_url, "game_url"), mode: "view"}};
        if (value === "proxy") {
            const data = await net.json(getProxyUrl({demo: "json"}));
            return {msg: "本機 proxy：" + data.name};
        }
        if (value === "ttl_cache") {
            const data = await net.cached("demo:ttl", {ttl: 60000}, () => ({value: "範例資料"}));
            return {msg: "TTL 快取：" + data.value};
        }
        if (value === "ttl_peek") {
            const data = net.peek("demo:ttl");
            return {msg: data === null ? "目前沒有 TTL 快取" : "已有 TTL 快取：" + data.value};
        }
        if (value === "ttl_clear") {
            net.clearCache("demo:ttl");
            return {msg: "已清除 TTL 快取"};
        }
        if (value === "sleep") {
            await net.sleep(250);
            return {msg: "等待完成（250 毫秒）"};
        }
        if (value === "toast") {
            return {msg: "這是 QuickJS action 回傳、由 App 顯示的 Toast"};
        }
        if (value === "site_key") {
            return {msg: `目前 Site key：${siteKey}`};
        }
        if (value === "web") {
            const url = stringValue(options.web_url).trim();
            if (!url) return {msg: "請先在 ext 設定 web_url"};
            const web = {url: ensureHttpUrl(url, "web_url")};
            const key = stringValue(options.cookie_name).trim();
            if (options.web_cookie) web.cookie = options.web_cookie;
            else if (key) web.cookie = [{keys: [key]}];
            return {web};
        }
        if (value === "cookie") {
            const url = stringValue(options.web_url).trim();
            const name = stringValue(options.cookie_name).trim();
            if (!url || !name) return {msg: "請先在 ext 設定 web_url 與 cookie_name"};
            const cookie = net.getCookie(ensureHttpUrl(url, "web_url"));
            return {msg: cookieValue(cookie, name)
                ? "指定的 WebView Cookie 已存在；有效性仍須由站點 API 確認"
                : "尚未取得指定的 WebView Cookie"};
        }
        if (value === "cookie_clear") {
            const url = stringValue(options.web_url).trim();
            const name = stringValue(options.cookie_name).trim();
            if (!url || !name) return {msg: "請先在 ext 設定 web_url 與 cookie_name"};
            net.setCookie(ensureHttpUrl(url, "web_url"), `${name}=; Path=/; Max-Age=0`);
            const cleared = !cookieValue(net.getCookie(url), name);
            return {msg: cleared ? "已清除指定的 WebView Cookie" : "WebView Cookie 清除失敗"};
        }
        if (value === "request") {
            const url = stringValue(options.request_url).trim();
            if (!url) return {msg: "請先在 ext 設定 request_url"};
            try {
                ensureHttpUrl(url, "request_url");
                const headers = stringMap(options.request_headers, "request_headers");
                if (!Object.keys(headers).some((key) => key.toLowerCase() === "user-agent")) {
                    const userAgent = stringValue(net.getUserAgent());
                    if (userAgent) headers["User-Agent"] = userAgent;
                }
                const response = await net.http(url, {
                    method: stringValue(options.request_method) || "GET",
                    headers,
                    timeout: REQUEST_TIMEOUT_MS,
                    callTimeout: REQUEST_TIMEOUT_MS,
                    cookie: true,
                    ...(options.request_options || {}),
                });
                if (response.error) return {msg: `HTTP 請求失敗：${response.error}`};
                const code = Number(response.code) || 0;
                return {msg: `HTTP ${code}，回應長度 ${response.content.length}，已啟用 WebView Cookie`};
            } catch (error) {
                return {msg: `HTTP 請求失敗：${errorName(error)}`};
            }
        }
        if (value === "socket-stop") {
            socket?.close();
            socket = null;
            return {msg: "WebSocket 已停止"};
        }
        if (value === "socket-state") return {msg: JSON.stringify(socketState)};
        if (value === "socket-start") return connectSocket();
        if (value === "websocket") {
            const url = stringValue(options.ws_url).trim();
            if (!url) return {msg: "請先在 ext 設定 ws_url"};
            try {
                const response = await net.ws(url, {
                    data: options.ws_data ?? "",
                    headers: stringMap(options.ws_headers, "ws_headers"),
                    timeout: REQUEST_TIMEOUT_MS,
                });
                if (response.error) return {msg: `WebSocket 交換失敗：${response.error}`};
                return {msg: `WebSocket ${response.code}，回應 ${stringValue(response.content).length} 字元`};
            } catch (error) {
                return {msg: `WebSocket 交換失敗：${errorName(error)}`};
            }
        }
        if (value === "runtime") {
            try {
                const userAgent = stringValue(net.getUserAgent());
                const hashOk = sha256X("abc") === "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad";
                const randomOk = stringValue(randomX(16)).length > 0;
                // Binary plaintext uses Base64; the Java/JS string bridge changes NUL bytes.
                const plain = aesX(
                    "GCM", false,
                    "0388dace60b6a392f328c2b971b2fe78ab6e47d42cec13bdf53a67b21257bddf",
                    false,
                    "00000000000000000000000000000000",
                    "000000000000000000000000",
                    true);
                const aesOk = plain === "AAAAAAAAAAAAAAAAAAAAAA==";
                const passed = Boolean(userAgent) && hashOk && randomOk && aesOk;
                return {msg: passed ? "App 與加密 bridge 測試通過" : "App 或加密 bridge 測試失敗"};
            } catch (error) {
                return {msg: `App 或加密 bridge 測試失敗：${errorName(error)}`};
            }
        }
        if (value === "cache_write") {
            local.set(CACHE_KEY, {value: "範例資料", items: [1, true, null]});
            return {msg: "已寫入 QuickJS local"};
        }
        if (value === "cache_read") {
            const saved = local.get(CACHE_KEY);
            return {msg: saved == null ? "QuickJS local 尚無資料" : JSON.stringify(saved)};
        }
        if (value === "cache_delete") {
            local.delete(CACHE_KEY);
            return {msg: "已刪除 QuickJS local 資料"};
        }
        return {msg: "不支援此操作"};
    }

    function live(url) {
        const urls = [["media_url", "主要線"], ["backup_media_url", "備用線"]]
            .filter(([key]) => options[key]).map(([key, name]) => `${ensureHttpUrl(options[key], key)}$${name}`);
        return urls.length ? [{name: "範例直播", channel: [{name: "示範頻道", urls}]}] : [];
    }

    function proxy(params) {
        const headers = {"X-Demo": "1"};
        if (params.demo === "json") return [200, "application/json; charset=utf-8", '{"name":"demo","ok":true}', headers];
        if (params.demo === "playlist" && options.media_url) {
            return [200, "application/vnd.apple.mpegurl", "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\n" + ensureHttpUrl(options.media_url, "media_url") + "\n", headers];
        }
        return [404, "text/plain; charset=utf-8", "未知的範例 proxy", headers];
    }

    function cacheValue() {
        return {updated: Date.now(), items: [1, true, null]};
    }

    async function networkAction(value) {
        try {
            if (value === "json") {
                const data = await net.json(ensureHttpUrl(options.json_url, "json_url"), {timeout: REQUEST_TIMEOUT_MS});
                return {msg: "JSON 請求成功：" + typeof data};
            }
            const url = ensureHttpUrl(options.request_url || options.web_url, "request_url");
            if (value === "parallel") {
                const values = await net.batch([0, 1, 2].map(() => ({url, options: {timeout: REQUEST_TIMEOUT_MS}})));
                values.forEach(checkResponse);
                return {msg: "並行完成 3 次請求"};
            }
            if (value === "session") {
                const flow = net.session();
                try {
                    if (!flow.setCookie(url, "demo_session=1; Path=/")) throw new Error("Session Cookie 寫入失敗");
                    checkResponse(await flow.http(url, {timeout: REQUEST_TIMEOUT_MS}));
                    return {msg: "隔離 Session 請求完成，Cookie " + (flow.getCookie(url).includes("demo_session=1") ? "存在" : "不存在")};
                } finally { flow.close(); }
            }
            const settings = {timeout: REQUEST_TIMEOUT_MS, buffer: value === "binary" ? 1 : 0};
            const response = value === "request_sync" ? net.req(url, settings) : await net.http(url, settings);
            checkResponse(response);
            return {msg: `HTTP ${response.code}，回應長度 ${response.content.length}`};
        } catch (error) {
            return {msg: "網路示範失敗：" + String(error.message || error)};
        }
    }

    function checkResponse(value) {
        if (value.error) throw new Error(value.error);
        if (value.code < 200 || value.code >= 300) throw new Error(`HTTP ${value.code}`);
    }

    function qualities(value) {
        if (!isObject(value) || !Array.isArray(value.values) || !value.values.length) throw new Error("media_urls 必須包含非空的 values 陣列");
        const values = value.values.map(item => ({n: stringValue(item.n), v: ensureHttpUrl(item.v, "media_urls.v")}));
        const position = value.position ?? 0;
        if (!Number.isSafeInteger(position) || position < 0 || position >= values.length) throw new Error("media_urls.position 必須是有效畫質索引");
        return {values, position};
    }

    function skips(value) {
        if (!Array.isArray(value)) throw new Error("skips 必須是陣列");
        return value.map(item => {
            if (!isObject(item) || !["opening", "middle", "ending"].includes(item.type)) throw new Error("skips.type 格式錯誤");
            if (!Number.isSafeInteger(item.start) || item.start < 0) throw new Error("skips.start 必須是非負整數毫秒");
            if (!(item.end == null && item.type === "ending" && item.start > 0)
                && (!Number.isSafeInteger(item.end) || item.end <= item.start)) throw new Error("skips.end 必須晚於 start");
            return {...item};
        });
    }

    function sniffer() {
        return true;
    }

    function isVideo(url) {
        const path = stringValue(url).split(/[?#]/, 1)[0].toLowerCase();
        return [".m3u8", ".mpd", ".mp4", ".mkv", ".flv", ".mp3", ".m4a", ".aac"]
            .some((suffix) => path.endsWith(suffix));
    }

    function destroy() {
        socket?.cancel();
        socket = null;
        options = {};
    }

    function connectSocket() {
        const url = stringValue(options.ws_url).trim();
        if (!url) return {msg: "請先在 ext 設定 ws_url"};
        socket?.cancel();
        const state = {state: "連線中", text: 0, binary: 0};
        socketState = state;
        socket = net.connect(url, {
            data: options.ws_data,
            headers: stringMap(options.ws_headers, "ws_headers"),
            timeout: REQUEST_TIMEOUT_MS,
            ping: 30000,
        }, (connection, event) => socketEvent(connection, event, state));
        return {msg: "WebSocket 已開始連線"};
    }

    function socketEvent(connection, event, state) {
        if (event.type === "open") {
            state.state = "已連線";
            connection.send(new Uint8Array([0, 127, 128, 255]));
        } else if (event.type === "message") {
            state[event.binary ? "binary" : "text"]++;
        } else if (event.type === "error") {
            state.error = event.error;
        } else if (event.type === "close") {
            state.state = "已關閉";
        }
    }

    function filterRows() {
        return [
            {
                key: "sort", name: "排序", init: "latest",
                value: [
                    {n: "最新", v: "latest"},
                    {n: "最早", v: "oldest"},
                    {n: "名稱", v: "name"},
                ],
            },
            {
                key: "genre", name: "類型", init: "all",
                value: [{n: "全部", v: "all"}, ...["動畫", "戲劇", "綜藝", "紀錄"]
                    .map((name) => ({n: name, v: name}))],
            },
            {
                key: "area", name: "地區", init: "all",
                value: [{n: "全部", v: "all"}, ...["台灣", "日本", "韓國"]
                    .map((name) => ({n: name, v: name}))],
            },
            {
                key: "year", name: "年份", init: "all",
                value: [{n: "全部", v: "all"}, ...["2026", "2025", "2024", "2023", "2022", "2021"]
                    .map((year) => ({n: year, v: year}))],
            },
        ];
    }

    function contentType(tid) {
        return [
            "vod_portrait", "vod_landscape", "vod_oval", "vod_list",
            "class_landscape", "class_oval",
        ].includes(tid);
    }

    function filteredRecords(extend) {
        const genre = stringValue(extend.genre) || "all";
        const area = stringValue(extend.area) || "all";
        const year = stringValue(extend.year) || "all";
        const records = CATALOG.filter((item) =>
            (genre === "all" || item.genre === genre)
            && (area === "all" || item.area === area)
            && (year === "all" || item.year === year));
        const sort = stringValue(extend.sort) || "latest";
        if (sort === "name") return records.sort((left, right) => compare(left.name, right.name));
        if (sort === "oldest") {
            return records.sort((left, right) => Number(left.year) - Number(right.year)
                || compare(left.id, right.id));
        }
        return records.sort((left, right) => Number(right.year) - Number(left.year)
            || compare(right.id, left.id));
    }

    function findRecord(id) {
        return CATALOG.find((item) => item.id === id);
    }

    function card(record, styleName, pictureStyle) {
        const item = {
            vod_id: `vod/${record.id}`,
            vod_name: record.name,
            vod_pic: picture(record, pictureStyle || styleName || "portrait"),
            vod_remarks: record.remark,
            vod_year: record.year,
        };
        const styles = {
            portrait: {type: "rect", ratio: 0.75},
            landscape: {type: "rect", ratio: 1.78},
            oval: {type: "oval", ratio: 1.0},
            list: {type: "list"},
        };
        if (styles[styleName]) item.style = {...styles[styleName]};
        return item;
    }

    function picture(record, styleName) {
        const base = stringValue(options.image_base);
        if (!base) return "";
        const [width, height] = {
            landscape: [800, 450],
            oval: [600, 600],
        }[styleName] || [600, 800];
        return `${base}/${encodeURIComponent(record.id)}/${width}/${height}`;
    }

    function folderCards() {
        const items = [];
        for (const genre of ["動畫", "戲劇", "綜藝", "紀錄"]) {
            items.push(folderCard(`folder/genre/${encodeURIComponent(genre)}`, `${genre}資料夾`, "依類型開啟"));
        }
        for (const area of ["台灣", "日本", "韓國"]) {
            items.push(folderCard(`folder/area/${encodeURIComponent(area)}`, `${area}資料夾`, "依地區開啟"));
        }
        return items;
    }

    function folderCard(id, name, remark) {
        return {
            vod_id: id,
            vod_name: name,
            vod_remarks: remark,
            vod_tag: "folder",
            style: {type: "list"},
        };
    }

    function actionCards() {
        return [
            ["web_view", "開啟獨立內容", "mode=view，返回直接關閉"],
            ["json", "JSON 請求", "net.json 驗證 HTTP 與 JSON"],
            ["request_sync", "同步 HTTP", "同步取得完整回應"],
            ["session", "隔離 Session", "在獨立 Cookie 流程完成請求並關閉"],
            ["parallel", "並行請求", "同時取得 3 份回應"],
            ["download", "下載檔案", "串流寫入 App 快取"],
            ["binary", "二進位回應", "buffer=1，取得 byte 陣列"],
            ["ttl_persist", "持久化快取", "重建爬蟲後仍可讀取"],
            ["ttl_background", "立即回快取、背景更新", "先 peek，再交給 refresh 背景更新"],
            ["ttl_clear_all", "清除全部 TTL 快取", "只清目前站點的 TTL 資料"],
            ["proxy", "本機 proxy", "透過 App HTTP server 呼叫此爬蟲"],
            ["runtime", "測試 App 與加密 bridge", "驗證 User-Agent、SHA-256、亂數與 AES-GCM"],
            ["toast", "顯示 Toast", "action 回傳 msg，由 App 顯示"],
            ["site_key", "顯示 Site key", "由 App 在 init 前注入的 siteKey"],
            ["web", "開啟網頁", "action 回傳 web，由 App 開啟"],
            ["cookie", "檢查登入 Cookie", "只顯示是否存在，不顯示 Cookie 內容"],
            ["cookie_clear", "清除登入 Cookie", "寫入過期 Cookie 並確認結果"],
            ["request", "HTTP + Cookie 請求", "使用 net.http Promise，只顯示狀態與長度"],
            ["websocket", "WebSocket 訊息交換", "使用 net.ws Promise，只顯示狀態與長度"],
            ["socket-start", "WebSocket 持續連線", "持續收訊並發送二進位範例"],
            ["socket-state", "WebSocket 連線狀態", "查看文字與二進位訊息數"],
            ["socket-stop", "WebSocket 停止連線", "關閉連線並釋放資源"],
            ["sleep", "可取消等待", "等待 250 毫秒；爬蟲關閉或任務中斷會取消"],
            ["ttl_cache", "TTL 快取", "有效期內重用資料；過期背景更新"],
            ["ttl_peek", "讀取已有快取", "只讀已有值，不發出請求或延長 TTL"],
            ["ttl_clear", "清除 TTL 快取", "清除同一個 key，並取消正在載入的資料"],
            ["cache_write", "寫入 Local", "保存 JSON 物件、陣列及純量"],
            ["cache_read", "讀取 Local", "讀取相同 key"],
            ["cache_delete", "刪除 Local", "清除範例狀態"],
        ].map(([value, name, remark]) => ({
            vod_id: `action/${value}`,
            vod_name: name,
            vod_remarks: remark,
            action: value,
            style: {type: "list"},
        }));
    }

    function clickable(kind, name) {
        return link(name, {id: `${kind}/${encodeURIComponent(name)}`, name, type_flag: "1"});
    }

    function episodeLine(record, source) {
        return record.episodes.map((name, index) =>
            `${safeLabel(name)}$play/${record.id}/${index + 1}/${source}`).join("#");
    }

    function subtitles(value) {
        if (value == null || value === "") return [];
        if (!Array.isArray(value)) throw new Error("subtitles 必須是 JSON 陣列");
        const result = [];
        value.forEach((item, index) => {
            if (!isObject(item)) throw new Error(`subtitles[${index}] 必須是 JSON 物件`);
            const url = stringValue(item.url).trim();
            if (!url) return;
            ensureHttpUrl(url, `subtitles[${index}].url`);
            const sub = {
                name: stringValue(item.name) || `字幕 ${index + 1}`,
                url,
                lang: stringValue(item.lang),
                format: stringValue(item.format),
            };
            if (Object.prototype.hasOwnProperty.call(item, "flag")) {
                if (!Number.isInteger(item.flag)) throw new Error(`subtitles[${index}].flag 必須是整數`);
                sub.flag = item.flag;
            }
            result.push(sub);
        });
        return result;
    }

    function danmaku(value) {
        if (value == null || value === "") return [];
        if (typeof value === "string") {
            ensureHttpUrl(value, "danmaku");
            return [{name: "彈幕", url: value}];
        }
        if (!Array.isArray(value)) throw new Error("danmaku 必須是網址字串或 JSON 陣列");
        const result = [];
        value.forEach((item, index) => {
            const data = typeof item === "string" ? {url: item} : item;
            if (!isObject(data)) throw new Error(`danmaku[${index}] 必須是網址或 JSON 物件`);
            const url = stringValue(data.url).trim();
            if (!url) return;
            ensureHttpUrl(url, `danmaku[${index}].url`);
            result.push({name: stringValue(data.name) || `彈幕 ${index + 1}`, url});
        });
        return result;
    }

    function drm(value) {
        if (value == null || value === "" || (isObject(value) && !Object.keys(value).length)) return null;
        if (!isObject(value)) throw new Error("drm 必須是 JSON 物件");
        const key = stringValue(value.key).trim();
        const type = stringValue(value.type).trim().toLowerCase();
        if (!key || !["widevine", "playready", "clearkey"].includes(type)) {
            throw new Error("drm 需要 key，type 必須是 widevine、playready 或 clearkey");
        }
        ensureHttpUrl(key, "drm.key");
        return {
            key,
            type,
            forceKey: Boolean(value.forceKey),
            header: stringMap(value.header, "drm.header"),
        };
    }

    return {
        init,
        home,
        homeVod,
        category,
        detail,
        search,
        play,
        live,
        proxy,
        action,
        sniffer,
        isVideo,
        destroy,
    };
}

function parseOptions(ext) {
    if (ext == null || ext === "") return {};
    let value = ext;
    if (typeof value === "string") {
        try {
            value = JSON.parse(value);
        } catch (error) {
            throw new Error("Site.ext 必須是 JSON 物件");
        }
    }
    if (!isObject(value)) throw new Error("Site.ext 必須是 JSON 物件");
    return value;
}

function stringMap(value, name) {
    if (value == null || value === "") return {};
    if (!isObject(value)) throw new Error(`${name} 必須是 JSON 物件`);
    const result = {};
    for (const key of Object.keys(value)) {
        if (value[key] != null) result[String(key)] = String(value[key]);
    }
    return result;
}

function ensureHttpUrl(value, name) {
    const url = stringValue(value).trim();
    if (!/^https?:\/\/[^\s/]+(?:[/?#]|$)/i.test(url)) {
        throw new Error(`${name} 必須是完整 HTTP(S) 網址`);
    }
    return url;
}

function ensureCookieName(value) {
    const name = stringValue(value).trim();
    if (!name || !/^[!#$%&'*+\-.^_`|~0-9A-Za-z]+$/.test(name)) {
        throw new Error("cookie_name 格式無效");
    }
    return name;
}

function cookieValue(cookies, name) {
    for (const item of stringValue(cookies).split(";")) {
        const separator = item.indexOf("=");
        if (separator > 0 && item.slice(0, separator).trim() === name) {
            return item.slice(separator + 1).trim();
        }
    }
    return "";
}

function decodePart(value) {
    try {
        return decodeURIComponent(value);
    } catch (error) {
        return "";
    }
}

function compare(left, right) {
    if (left === right) return 0;
    return left < right ? -1 : 1;
}

function removePrefix(value, prefix) {
    return value.startsWith(prefix) ? value.slice(prefix.length) : value;
}

function safeLabel(value) {
    return stringValue(value).replace(/\$/g, "＄").replace(/#/g, "＃").trim();
}

function errorName(error) {
    return error && error.name ? String(error.name) : "Error";
}

function stringValue(value) {
    return value == null ? "" : String(value);
}

function isObject(value) {
    return value !== null && typeof value === "object" && !Array.isArray(value);
}



export default createSpider;
