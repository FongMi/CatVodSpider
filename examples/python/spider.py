"""TV Python 功能範例；配置與接口說明見 CatVodSpider/docs/development.md。"""

import json
import re
import time
import tempfile
from pathlib import Path
from urllib.parse import quote, unquote, urlsplit

from base.spider import Spider as BaseSpider


PAGE_SIZE = 4
SEARCH_ALL_KEYWORD = "示範"
REQUEST_TIMEOUT_MS = 15000
CACHE_KEY = "python_spider_demo_message"
CACHE_VALUE = {"value": "範例資料", "items": [1, True, None]}
COOKIE_NAME_PATTERN = re.compile(r"^[!#$%&'*+\-.^_`|~0-9A-Za-z]+$")
USER_AGENT = (
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
    "AppleWebKit/537.36 (KHTML, like Gecko) "
    "Chrome/124.0.0.0 Safari/537.36"
)

# 真實爬蟲可把這個 tuple 換成 API 或 HTML 解析結果，其餘介面保持不變。
CATALOG = (
    {
        "id": "demo-01", "name": "星光探險隊", "genre": "動畫", "area": "台灣",
        "year": "2026", "director": "林導演", "actors": ("小安", "小晴"),
        "remark": "更新至 3 集", "episodes": ("第 1 集", "第 2 集", "第 3 集"),
        "content": "一群朋友追尋失落星圖的原創示範故事。",
    },
    {
        "id": "demo-02", "name": "城市觀察日記", "genre": "紀錄", "area": "日本",
        "year": "2026", "director": "周導演", "actors": ("阿杰", "小美"),
        "remark": "全 2 集", "episodes": ("上集", "下集"),
        "content": "從日常交通與市場觀察城市生活。",
    },
    {
        "id": "demo-03", "name": "料理研究室", "genre": "綜藝", "area": "韓國",
        "year": "2025", "director": "陳導演", "actors": ("小晴", "大宇"),
        "remark": "更新至 4 集", "episodes": ("第 1 集", "第 2 集", "第 3 集", "第 4 集"),
        "content": "用常見食材完成四道家常料理。",
    },
    {
        "id": "demo-04", "name": "午後推理社", "genre": "戲劇", "area": "台灣",
        "year": "2025", "director": "李導演", "actors": ("阿杰", "若葉"),
        "remark": "全 3 集", "episodes": ("線索", "追蹤", "答案"),
        "content": "三位社員從校園小事練習推理。",
    },
    {
        "id": "demo-05", "name": "海邊小旅行", "genre": "紀錄", "area": "台灣",
        "year": "2024", "director": "周導演", "actors": ("大宇",),
        "remark": "正片", "episodes": ("正片",),
        "content": "沿著海岸記錄自然景色與地方文化。",
    },
    {
        "id": "demo-06", "name": "節奏練習生", "genre": "綜藝", "area": "日本",
        "year": "2024", "director": "陳導演", "actors": ("小美", "若葉"),
        "remark": "全 2 集", "episodes": ("預賽", "決賽"),
        "content": "表演者以節奏合作完成舞台任務。",
    },
    {
        "id": "demo-07", "name": "紙飛機計畫", "genre": "動畫", "area": "日本",
        "year": "2023", "director": "林導演", "actors": ("若葉", "小安"),
        "remark": "全 3 集", "episodes": ("起飛", "風向", "返航"),
        "content": "紙飛機乘著不同風向展開旅程。",
    },
    {
        "id": "demo-08", "name": "轉角咖啡店", "genre": "戲劇", "area": "韓國",
        "year": "2023", "director": "李導演", "actors": ("大宇", "小晴"),
        "remark": "全 2 集", "episodes": ("相遇", "再會"),
        "content": "一間咖啡店串起幾段溫暖的日常。",
    },
    {
        "id": "demo-09", "name": "機器人運動會", "genre": "動畫", "area": "韓國",
        "year": "2022", "director": "林導演", "actors": ("阿杰", "小美"),
        "remark": "全 4 集", "episodes": ("開幕", "接力", "決勝", "閉幕"),
        "content": "小型機器人組隊參加創意競賽。",
    },
    {
        "id": "demo-10", "name": "深夜電台", "genre": "戲劇", "area": "台灣",
        "year": "2022", "director": "李導演", "actors": ("小安", "大宇"),
        "remark": "正片", "episodes": ("正片",),
        "content": "主持人透過來電聽見城市裡的故事。",
    },
    {
        "id": "demo-11", "name": "週末任務隊", "genre": "綜藝", "area": "韓國",
        "year": "2021", "director": "陳導演", "actors": ("若葉", "小晴"),
        "remark": "全 3 集", "episodes": ("任務一", "任務二", "任務三"),
        "content": "成員分組完成城市探索任務。",
    },
    {
        "id": "demo-12", "name": "山林的一天", "genre": "紀錄", "area": "日本",
        "year": "2021", "director": "周導演", "actors": ("小美",),
        "remark": "正片", "episodes": ("正片",),
        "content": "以一天的時間觀察山林生態。",
    },
)


def _filter_rows():
    """每次建立新物件，避免呼叫端若修改選取狀態時污染後續結果。"""
    return [
        {
            "key": "sort", "name": "排序", "init": "latest",
            "value": [
                {"n": "最新", "v": "latest"},
                {"n": "最早", "v": "oldest"},
                {"n": "名稱", "v": "name"},
            ],
        },
        {
            "key": "genre", "name": "類型", "init": "all",
            "value": [{"n": "全部", "v": "all"}] + [
                {"n": name, "v": name} for name in ("動畫", "戲劇", "綜藝", "紀錄")
            ],
        },
        {
            "key": "area", "name": "地區", "init": "all",
            "value": [{"n": "全部", "v": "all"}] + [
                {"n": name, "v": name} for name in ("台灣", "日本", "韓國")
            ],
        },
        {
            "key": "year", "name": "年份", "init": "all",
            "value": [{"n": "全部", "v": "all"}] + [
                {"n": year, "v": year} for year in ("2026", "2025", "2024", "2023", "2022", "2021")
            ],
        },
    ]


class Spider(BaseSpider):
    def init(self, extend=""):
        if isinstance(extend, dict):
            options = extend
        elif extend:
            options = json.loads(extend)
        else:
            options = {}
        if not isinstance(options, dict):
            raise ValueError("Site.ext 必須是 JSON 物件")

        self.options = options
        self.socket = None
        self.socket_state = {"state": "未連線", "text": 0, "binary": 0}
        self.cache_key = CACHE_KEY
        self.image_base = str(options.get("image_base") or "").rstrip("/")
        self.web_url = str(options.get("web_url") or "https://example.com/")
        self.request_url = str(options.get("request_url") or self.web_url)
        self.cookie_name = str(options.get("cookie_name") or "").strip()
        if self.cookie_name and not COOKIE_NAME_PATTERN.fullmatch(self.cookie_name):
            raise ValueError("cookie_name 格式無效")

        self._absolute_url(self.web_url, "web_url")
        self._absolute_url(self.request_url, "request_url")

    def getName(self):
        return "Python 完整範例"

    def homeContent(self, filter):
        result = {
            "class": [
                {"type_id": "vod_portrait", "type_name": "VOD 直式"},
                {"type_id": "vod_landscape", "type_name": "VOD 橫式"},
                {"type_id": "vod_oval", "type_name": "VOD 圓形"},
                {"type_id": "vod_list", "type_name": "VOD 列表"},
                {"type_id": "class_landscape", "type_name": "分類橫式", "land": 1, "ratio": 1.78},
                {"type_id": "class_oval", "type_name": "分類圓形", "circle": 1, "ratio": 1.0},
                {"type_id": "folders", "type_name": "資料夾", "type_flag": "1"},
                {"type_id": "actions", "type_name": "互動功能", "type_flag": "1"},
            ]
        }
        if filter:
            result["filters"] = {
                type_id: _filter_rows()
                for type_id in (
                    "vod_portrait", "vod_landscape", "vod_oval", "vod_list",
                    "class_landscape", "class_oval",
                )
            }
        return result

    def homeVideoContent(self):
        # 第一筆 VOD 的 style 決定整個首頁區塊，因此每筆都保持相同橫式樣式。
        items = [self._card(item, "landscape") for item in CATALOG[:PAGE_SIZE]]
        return {"list": items}

    def categoryContent(self, tid, pg, filter, extend):
        extend = extend if isinstance(extend, dict) else {}

        if tid == "actions":
            items = self._action_cards()
        elif tid == "folders":
            items = self._folder_cards()
        elif tid.startswith("folder/genre/"):
            genre = unquote(tid.removeprefix("folder/genre/"))
            items = [self._card(item, "list") for item in CATALOG if item["genre"] == genre]
        elif tid.startswith("folder/area/"):
            area = unquote(tid.removeprefix("folder/area/"))
            items = [self._card(item, "list") for item in CATALOG if item["area"] == area]
        elif tid.startswith("actor/"):
            actor = unquote(tid.removeprefix("actor/"))
            items = [self._card(item, "list") for item in CATALOG if actor in item["actors"]]
        elif tid.startswith("director/"):
            director = unquote(tid.removeprefix("director/"))
            items = [self._card(item, "list") for item in CATALOG if item["director"] == director]
        elif tid in (
            "vod_portrait", "vod_landscape", "vod_oval", "vod_list",
            "class_landscape", "class_oval",
        ):
            records = self._filtered_records(extend)
            card_style = {
                "vod_portrait": "portrait",
                "vod_landscape": "landscape",
                "vod_oval": "oval",
                "vod_list": "list",
            }.get(tid)
            picture_style = {
                "class_landscape": "landscape",
                "class_oval": "oval",
            }.get(tid, card_style)
            # class_* 不放 VOD.style，讓 Class.land / Class.circle 決定整個分類頁樣式。
            items = [self._card(item, card_style, picture_style) for item in records]
        else:
            items = []

        return self.page(items, pg, PAGE_SIZE)

    def searchContent(self, key, quick, pg="1"):
        query = str(key or "").strip().casefold()
        if not query:
            return self.page([], pg, PAGE_SIZE)
        matches = []
        for item in CATALOG:
            fields = (
                SEARCH_ALL_KEYWORD, item["name"], item["genre"], item["area"],
                item["year"], item["director"], *item["actors"],
            )
            if any(query in str(value).casefold() for value in fields):
                matches.append(self._card(item, "list"))
        return self.page(matches, pg, PAGE_SIZE)

    def detailContent(self, ids):
        ident = str(ids[0] if ids else "").removeprefix("vod/")
        record = self._record(ident)
        if record is None:
            return {"list": [], "msg": "找不到此範例影片"}

        flags = ["主要線"]
        urls = [self._episode_line(record, "main")]
        if str(self.options.get("backup_media_url") or "").strip():
            flags.append("備用線")
            urls.append(self._episode_line(record, "backup"))

        if self.options.get("media_url", "").split("?", 1)[0].lower().endswith(".m3u8"):
            flags.append("代理線")
            urls.append(self._episode_line(record, "proxy"))
        item = self._card(record, "portrait")
        item.update({
            "type_name": record["genre"],
            "vod_year": record["year"],
            "vod_area": record["area"],
            "vod_director": self._clickable("director", record["director"]),
            "vod_actor": "、".join(self._clickable("actor", name) for name in record["actors"]),
            "vod_content": record["content"],
            "vod_play_from": "$$$".join(flags),
            "vod_play_url": "$$$".join(urls),
        })
        return {"list": [item]}

    def playerContent(self, flag, id, vipFlags):
        parts = str(id or "").split("/")
        if len(parts) != 4 or parts[0] != "play" or parts[3] not in ("main", "backup", "proxy"):
            return {"parse": 0, "msg": "無效的範例播放 ID"}

        record = self._record(parts[1])
        try:
            episode_index = int(parts[2])
        except ValueError:
            episode_index = -1
        if record is None or not 1 <= episode_index <= len(record["episodes"]):
            return {"parse": 0, "msg": "找不到此範例集數"}

        source = parts[3]
        option_key = "backup_media_url" if source == "backup" else "media_url"
        url = str(self.options.get(option_key) or "").strip()
        qualities = self._qualities(self.options["media_urls"]) if source == "main" and "media_urls" in self.options else None
        if qualities:
            url = qualities["values"][qualities["position"]]["v"]
        sniff_url = str(self.options.get("sniff_url") or "").strip() if source == "main" else ""
        header_key = "media_headers" if source == "main" else "backup_media_headers"
        headers = self._string_map(self.options.get(header_key), header_key)
        if not url and sniff_url:
            self._absolute_url(sniff_url, "sniff_url")
            return {"parse": 1, "jx": 0, "url": sniff_url, "header": headers}
        if not url:
            return {"parse": 0, "msg": "請先設定 ext.%s 再測試播放" % option_key}
        self._absolute_url(url, option_key)

        result = {
            "parse": 0,
            "jx": 0,
            "url": self.getProxyUrl({"demo": "playlist"}) if source == "proxy" else qualities or url,
            "header": headers,
            "artwork": self._picture(record, "landscape"),
            "desc": "%s・%s" % (record["name"], record["episodes"][episode_index - 1]),
        }

        if "skips" in self.options:
            result["skips"] = self._skips(self.options["skips"])
        media_format = str(self.options.get("media_format") or "").strip()
        if media_format:
            result["format"] = media_format

        subtitles = self._subtitles(self.options.get("subtitles"))
        if subtitles:
            result["subs"] = subtitles
        danmaku = self._danmaku(self.options.get("danmaku"))
        if danmaku:
            result["danmaku"] = danmaku
        drm = self._drm(self.options.get("drm"))
        if drm:
            result["drm"] = drm

        if "start_position_ms" in self.options:
            position = self.options["start_position_ms"]
            if isinstance(position, int) and not isinstance(position, bool) and position >= 0:
                result["position"] = position
            else:
                raise ValueError("start_position_ms 必須是大於或等於 0 的整數")
        return result

    def action(self, action):
        if action in ("json", "session", "parallel", "binary", "request_sync"):
            return self._network_action(action)
        if action == "download":
            with tempfile.TemporaryDirectory() as directory:
                target = Path(directory) / "demo.bin"
                self.net.download(self.request_url, target)
                return {"msg": "下載完成：%s bytes" % target.stat().st_size}
        if action == "ttl_persist":
            value = self.net.cached("demo:persist", {"ttl": 60000, "stale": False, "persist": True}, self._cache_value)
            return {"msg": "持久化快取：" + str(value["updated"])}
        if action == "ttl_background":
            value = self.net.peek("demo:background")
            self.net.refresh("demo:background", {"ttl": 1000, "stale": False, "persist": True}, self._refresh_cache)
            return {"msg": "背景更新已安排；目前值：" + (str(value["updated"]) if value else "尚未載入")}
        if action == "ttl_clear_all":
            self.net.clearCache()
            return {"msg": "已清除目前站點的全部 TTL 快取"}
        if action == "web_view":
            return {"web": {"url": self._absolute_url(self.options.get("game_url") or self.web_url, "game_url"), "mode": "view"}}
        if action == "proxy":
            value = self.net.json(self.getProxyUrl({"demo": "json"}))
            return {"msg": "本機 proxy：" + value["name"]}
        if action == "native_toast":
            from java import jclass
            jclass("com.github.catvod.Init").toast("Python 執行中的提示")
            return {}
        if action == "runtime":
            from java import jclass
            crypto = jclass("com.github.catvod.utils.Crypto")
            plain = crypto.aes("GCM", False, "0388dace60b6a392f328c2b971b2fe78ab6e47d42cec13bdf53a67b21257bddf", False,
                               "00000000000000000000000000000000", "000000000000000000000000", True)
            passed = crypto.sha256("abc") == "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad" and plain == "AAAAAAAAAAAAAAAAAAAAAA=="
            return {"msg": "App 與加密 bridge 測試通過" if passed else "App 或加密 bridge 測試失敗"}
        if action == "ttl_cache":
            value = self.net.cached("demo:ttl", {"ttl": 60000}, lambda: {"value": "範例資料"})
            return {"msg": "TTL 快取：" + value["value"]}
        if action == "ttl_peek":
            value = self.net.peek("demo:ttl")
            return {"msg": "目前沒有 TTL 快取" if value is None else "已有 TTL 快取：" + value["value"]}
        if action == "ttl_clear":
            self.net.clearCache("demo:ttl")
            return {"msg": "已清除 TTL 快取"}
        if action == "sleep":
            self.net.sleep(250)
            return {"msg": "等待完成（250 毫秒）"}
        if action == "toast":
            return {"msg": "這是 Python action 回傳、由 App 顯示的 Toast"}
        if action == "dialog":
            self._show_dialog()
            return {}
        if action == "site_key":
            return {"msg": "目前 Site key：" + str(getattr(self, "siteKey", ""))}
        if action == "web":
            if not self.options.get("web_url"):
                return {"msg": "請先在 ext 設定 web_url"}
            web = {"url": self.web_url}
            if self.options.get("web_cookie"):
                web["cookie"] = self.options["web_cookie"]
            elif self.cookie_name:
                web["cookie"] = [{"keys": [self.cookie_name]}]
            return {"web": web}
        if action == "cookie":
            if not self.cookie_name:
                return {"msg": "請先在 ext 設定 cookie_name"}
            if self._cookie_value(self._cookies(), self.cookie_name):
                return {"msg": "指定的 WebView Cookie 已存在；有效性仍須由站點 API 確認"}
            return {"msg": "尚未取得指定的 WebView Cookie"}
        if action == "cookie_clear":
            if not self.cookie_name:
                return {"msg": "請先在 ext 設定 cookie_name"}
            try:
                cleared = self._clear_cookie()
                return {"msg": "已清除指定的 WebView Cookie" if cleared else "WebView Cookie 清除失敗"}
            except Exception as error:
                return {"msg": "WebView Cookie 清除失敗：" + type(error).__name__}
        if action == "request":
            try:
                response = self._request()
                if response.get("error"):
                    return {"msg": "HTTP 請求失敗：" + str(response["error"])}
                return {"msg": "HTTP %s，回應 %s bytes，已啟用 WebView Cookie" % (
                    response["code"], len(response["content"].encode("utf-8") if isinstance(response["content"], str) else response["content"]))}
            except Exception as error:
                return {"msg": "HTTP 請求失敗：" + type(error).__name__}
        if action == "socket-stop":
            if self.socket is not None:
                self.socket.close()
                self.socket = None
            return {"msg": "WebSocket 已停止"}
        if action == "socket-state":
            return {"msg": json.dumps(self.socket_state, ensure_ascii=False)}
        if action == "socket-start":
            return self._connect_socket()
        if action == "websocket":
            if not self.options.get("ws_url"):
                return {"msg": "請先在 ext 設定 ws_url"}
            try:
                data = self.options.get("ws_data")
                response = self.net.ws(self.options["ws_url"], {
                    "data": "" if data is None else data,
                    "headers": self._string_map(self.options.get("ws_headers"), "ws_headers"),
                    "timeout": REQUEST_TIMEOUT_MS,
                })
                if response.get("error"):
                    return {"msg": "WebSocket 交換失敗：" + str(response["error"])}
                return {"msg": "WebSocket %s，回應 %s bytes" % (
                    response["code"], len(response["content"].encode("utf-8")))}
            except Exception as error:
                return {"msg": "WebSocket 交換失敗：" + type(error).__name__}
        if action == "cache_write":
            self.local.set(self.cache_key, CACHE_VALUE)
            return {"msg": "已寫入 Python Local"}
        if action == "cache_read":
            value = self.local.get(self.cache_key)
            return {"msg": str(value) if value is not None else "Python Local 尚無資料"}
        if action == "cache_delete":
            self.local.delete(self.cache_key)
            return {"msg": "已刪除 Python Local 資料"}
        return {"msg": "不支援此操作"}

    def manualVideoCheck(self):
        return True

    def liveContent(self, url=""):
        urls = [self._absolute_url(self.options[key], key) + "$" + name
                for key, name in (("media_url", "主要線"), ("backup_media_url", "備用線")) if self.options.get(key)]
        return [{"name": "範例直播", "channel": [{"name": "示範頻道", "urls": urls}]}] if urls else []

    def localProxy(self, param):
        kind = param.get("demo")
        headers = {"X-Demo": "1"}
        if kind == "json":
            return [200, "application/json; charset=utf-8", '{"name":"demo","ok":true}', headers]
        if kind == "playlist" and self.options.get("media_url"):
            url = self._absolute_url(self.options["media_url"], "media_url")
            return [200, "application/vnd.apple.mpegurl", "#EXTM3U\n#EXT-X-STREAM-INF:BANDWIDTH=1280000\n" + url + "\n", headers]
        return [404, "text/plain; charset=utf-8", "未知的範例 proxy", headers]

    @staticmethod
    def _cache_value():
        return {"updated": int(time.time() * 1000), "items": [1, True, None]}

    def _refresh_cache(self):
        self.net.sleep(250)
        return self._cache_value()

    def _network_action(self, action):
        try:
            if action == "json":
                url = self._absolute_url(self.options.get("json_url"), "json_url")
                value = self.net.json(url, {"timeout": REQUEST_TIMEOUT_MS})
                return {"msg": "JSON 請求成功：" + type(value).__name__}
            if action == "parallel":
                values = self.net.batch([{ "url": self.request_url, "options": {"timeout": REQUEST_TIMEOUT_MS}} for _ in range(3)])
                for value in values:
                    self._check_response(value)
                return {"msg": "並行完成 3 次請求"}
            if action == "session":
                with self.net.session() as flow:
                    if not flow.setCookie(self.request_url, "demo_session=1; Path=/"):
                        raise ValueError("Session Cookie 寫入失敗")
                    self._check_response(flow.req(self.request_url, {"timeout": REQUEST_TIMEOUT_MS}))
                    exists = "demo_session=1" in flow.getCookie(self.request_url)
                return {"msg": "隔離 Session 請求完成，Cookie " + ("存在" if exists else "不存在")}
            options = {"timeout": REQUEST_TIMEOUT_MS, "buffer": 1 if action == "binary" else 0}
            value = self.net.req(self.request_url, options)
            self._check_response(value)
            return {"msg": "HTTP %s，回應長度 %s" % (value["code"], len(value["content"]))}
        except Exception as error:
            return {"msg": "網路示範失敗：" + str(error)}

    @staticmethod
    def _check_response(value):
        if value.get("error"):
            raise ValueError(value["error"])
        if not 200 <= value["code"] < 300:
            raise ValueError("HTTP %s" % value["code"])

    @staticmethod
    def _qualities(value):
        if not isinstance(value, dict) or not isinstance(value.get("values"), list) or not value["values"]:
            raise ValueError("media_urls 必須包含非空的 values 陣列")
        values = [{"n": str(item["n"]), "v": Spider._absolute_url(item["v"], "media_urls.v")} for item in value["values"]]
        position = value.get("position", 0)
        if isinstance(position, bool) or not isinstance(position, int) or not 0 <= position < len(values):
            raise ValueError("media_urls.position 必須是有效畫質索引")
        return {"values": values, "position": position}

    @staticmethod
    def _skips(value):
        if not isinstance(value, list):
            raise ValueError("skips 必須是陣列")
        for item in value:
            if not isinstance(item, dict) or item.get("type") not in ("opening", "middle", "ending"):
                raise ValueError("skips.type 格式錯誤")
            start, end = item.get("start"), item.get("end")
            if isinstance(start, bool) or not isinstance(start, int) or start < 0:
                raise ValueError("skips.start 必須是非負整數毫秒")
            if end is None and item["type"] == "ending" and start > 0:
                continue
            if isinstance(end, bool) or not isinstance(end, int) or end <= start:
                raise ValueError("skips.end 必須晚於 start")
        return [item.copy() for item in value]

    def isVideoFormat(self, url):
        parsed = urlsplit(str(url or ""))
        path = parsed.path.lower()
        return (
            parsed.scheme in ("http", "https")
            and bool(parsed.netloc)
            and path.endswith(".m3u8")
            and "/ad/" not in path
        )

    def destroy(self):
        if self.socket is not None:
            self.socket.cancel()
            self.socket = None
        self.options = {}

    def _connect_socket(self):
        if not self.options.get("ws_url"):
            return {"msg": "請先在 ext 設定 ws_url"}
        if self.socket is not None:
            self.socket.cancel()
        state = {"state": "連線中", "text": 0, "binary": 0}
        self.socket_state = state
        settings = {
            "headers": self._string_map(self.options.get("ws_headers"), "ws_headers"),
            "timeout": REQUEST_TIMEOUT_MS,
            "ping": 30000,
        }
        if "ws_data" in self.options:
            settings["data"] = self.options["ws_data"]
        self.socket = self.net.connect(self.options["ws_url"], settings,
                                       lambda socket, event: self._socket_event(socket, event, state))
        return {"msg": "WebSocket 已開始連線"}

    @staticmethod
    def _socket_event(socket, event, state):
        if event["type"] == "open":
            state["state"] = "已連線"
            socket.send(bytes([0, 127, 128, 255]))
        elif event["type"] == "message":
            state["binary" if event["binary"] else "text"] += 1
        elif event["type"] == "error":
            state["error"] = event["error"]
        elif event["type"] == "close":
            state["state"] = "已關閉"

    def _show_dialog(self):
        from android.app import AlertDialog
        from android.os import Handler, Looper
        from java import dynamic_proxy
        from java.lang import Runnable
        spider = self

        class ShowDialog(dynamic_proxy(Runnable)):
            def run(self):
                activity = spider.getActivity()
                if activity is not None:
                    AlertDialog.Builder(activity).setTitle("Python Dialog").setMessage("使用目前 Activity 顯示的自訂對話框").setPositiveButton("確定", None).show()

        Handler(Looper.getMainLooper()).post(ShowDialog())

    @staticmethod
    def _absolute_url(value, name):
        try:
            target = urlsplit(str(value))
            if target.scheme not in ("http", "https") or not target.hostname:
                raise ValueError
            target.port
            return str(value)
        except (TypeError, ValueError):
            raise ValueError("%s 必須是完整 HTTP(S) 網址" % name) from None

    def _filtered_records(self, extend):
        genre = str(extend.get("genre") or "all")
        area = str(extend.get("area") or "all")
        year = str(extend.get("year") or "all")
        records = [
            item for item in CATALOG
            if genre in ("all", item["genre"])
            and area in ("all", item["area"])
            and year in ("all", item["year"])
        ]
        sort = str(extend.get("sort") or "latest")
        if sort == "name":
            records.sort(key=lambda item: item["name"])
        elif sort == "oldest":
            records.sort(key=lambda item: (item["year"], item["id"]))
        else:
            records.sort(key=lambda item: (item["year"], item["id"]), reverse=True)
        return records

    @staticmethod
    def _record(ident):
        return next((item for item in CATALOG if item["id"] == ident), None)

    def _card(self, record, style_name=None, picture_style=None):
        item = {
            "vod_id": "vod/" + record["id"],
            "vod_name": record["name"],
            "vod_pic": self._picture(record, picture_style or style_name or "portrait"),
            "vod_remarks": record["remark"],
            "vod_year": record["year"],
        }
        styles = {
            "portrait": {"type": "rect", "ratio": 0.75},
            "landscape": {"type": "rect", "ratio": 1.78},
            "oval": {"type": "oval", "ratio": 1.0},
            "list": {"type": "list"},
        }
        if style_name in styles:
            item["style"] = styles[style_name].copy()
        return item

    def _picture(self, record, style_name):
        if not self.image_base:
            return ""
        width, height = {
            "landscape": (800, 450),
            "oval": (600, 600),
        }.get(style_name, (600, 800))
        return "%s/%s/%s/%s" % (self.image_base, quote(record["id"], safe=""), width, height)

    def _folder_cards(self):
        items = []
        for genre in ("動畫", "戲劇", "綜藝", "紀錄"):
            items.append(self._folder_card("folder/genre/" + quote(genre, safe=""), genre + "資料夾", "依類型開啟"))
        for area in ("台灣", "日本", "韓國"):
            items.append(self._folder_card("folder/area/" + quote(area, safe=""), area + "資料夾", "依地區開啟"))
        return items

    @staticmethod
    def _folder_card(ident, name, remark):
        return {
            "vod_id": ident,
            "vod_name": name,
            "vod_remarks": remark,
            "vod_tag": "folder",
            "style": {"type": "list"},
        }

    @staticmethod
    def _action_cards():
        return [
            {
                "vod_id": "action/" + action,
                "vod_name": name,
                "vod_remarks": remark,
                "action": action,
                "style": {"type": "list"},
            }
            for action, name, remark in (
                ("web_view", "開啟獨立內容", "mode=view，返回依網頁歷史"),
                ("native_toast", "執行中 Toast", "呼叫 App 的 Init.toast"),
                ("json", "JSON 請求", "net.json 驗證 HTTP 與 JSON"),
                ("request_sync", "同步 HTTP", "同步取得完整回應"),
                ("session", "隔離 Session", "在獨立 Cookie 流程完成請求並關閉"),
                ("parallel", "並行請求", "同時取得 3 份回應"),
                ("download", "下載檔案", "串流寫入暫存檔，用完移除"),
                ("binary", "二進位回應", "buffer=1，取得 byte 陣列"),
                ("ttl_persist", "持久化快取", "重建爬蟲後仍可讀取"),
                ("ttl_background", "立即回快取、背景更新", "先 peek，再交給 refresh 背景更新"),
                ("ttl_clear_all", "清除全部 TTL 快取", "只清目前站點的 TTL 資料"),
                ("proxy", "本機 proxy", "透過 App HTTP server 呼叫此爬蟲"),
                ("runtime", "測試 App 與加密 bridge", "驗證 SHA-256 與 AES-GCM"),
                ("toast", "顯示 Toast", "action 回傳 msg，由 App 顯示"),
                ("dialog", "顯示 Dialog", "主執行緒取得目前 Activity，再建立對話框"),
                ("site_key", "顯示 Site key", "由 App 在 init 前注入的 siteKey"),
                ("web", "開啟網頁", "action 回傳 web，由 App 開啟"),
                ("cookie", "檢查登入 Cookie", "只顯示是否存在，不顯示 Cookie 內容"),
                ("cookie_clear", "清除登入 Cookie", "寫入過期 Cookie 並確認結果"),
                ("request", "HTTP + Cookie 請求", "使用 self.net.req，只顯示狀態與長度"),
                ("websocket", "WebSocket 訊息交換", "使用 self.net.ws，只顯示狀態與長度"),
                ("socket-start", "WebSocket 持續連線", "持續收訊並發送二進位範例"),
                ("socket-state", "WebSocket 連線狀態", "查看文字與二進位訊息數"),
                ("socket-stop", "WebSocket 停止連線", "關閉連線並釋放資源"),
                ("sleep", "可取消等待", "等待 250 毫秒；爬蟲關閉或任務中斷會取消"),
                ("ttl_cache", "TTL 快取", "有效期內重用資料；過期背景更新"),
                ("ttl_peek", "讀取已有快取", "只讀已有值，不發出請求或延長 TTL"),
                ("ttl_clear", "清除 TTL 快取", "清除同一個 key，並取消正在載入的資料"),
                ("cache_write", "寫入 Local", "保存 JSON 物件、陣列及純量"),
                ("cache_read", "讀取 Local", "使用 self.local.get 讀取相同 key"),
                ("cache_delete", "刪除 Local", "使用 self.local.delete 清除資料"),
            )
        ]

    @staticmethod
    def _clickable(kind, name):
        return BaseSpider.link(name, {"id": "%s/%s" % (kind, quote(name, safe="")), "name": name, "type_flag": "1"})

    @staticmethod
    def _safe_label(value):
        return str(value or "").replace("$", "＄").replace("#", "＃").strip()

    def _episode_line(self, record, source):
        return "#".join(
            "%s$play/%s/%s/%s" % (self._safe_label(name), record["id"], index, source)
            for index, name in enumerate(record["episodes"], start=1)
        )

    @staticmethod
    def _string_map(value, name):
        if value in (None, ""):
            return {}
        if not isinstance(value, dict):
            raise ValueError(name + " 必須是 JSON 物件")
        result = {}
        for key, item in value.items():
            if item is not None:
                result[str(key)] = str(item)
        return result

    @classmethod
    def _subtitles(cls, value):
        if value in (None, ""):
            return []
        if not isinstance(value, list):
            raise ValueError("subtitles 必須是 JSON 陣列")
        result = []
        for index, item in enumerate(value):
            if not isinstance(item, dict):
                raise ValueError("subtitles[%s] 必須是 JSON 物件" % index)
            url = str(item.get("url") or "").strip()
            if not url:
                continue
            cls._absolute_url(url, "subtitles[%s].url" % index)
            result.append({
                "name": str(item.get("name") or "字幕 %s" % (index + 1)),
                "url": url,
                "lang": str(item.get("lang") or ""),
                "format": str(item.get("format") or ""),
            })
            if "flag" in item:
                if isinstance(item["flag"], bool) or not isinstance(item["flag"], int):
                    raise ValueError("subtitles.flag 必須是整數")
                result[-1]["flag"] = item["flag"]
        return result

    @classmethod
    def _danmaku(cls, value):
        if value in (None, ""):
            return []
        if isinstance(value, str):
            cls._absolute_url(value, "danmaku")
            return [{"name": "彈幕", "url": value}]
        if not isinstance(value, list):
            raise ValueError("danmaku 必須是網址字串或 JSON 陣列")
        result = []
        for index, item in enumerate(value):
            if isinstance(item, str):
                name, url = "彈幕 %s" % (index + 1), item
            elif isinstance(item, dict):
                name = str(item.get("name") or "彈幕 %s" % (index + 1))
                url = str(item.get("url") or "")
            else:
                raise ValueError("danmaku[%s] 必須是網址或 JSON 物件" % index)
            url = url.strip()
            if not url:
                continue
            cls._absolute_url(url, "danmaku[%s].url" % index)
            result.append({"name": name, "url": url})
        return result

    @classmethod
    def _drm(cls, value):
        if value in (None, "", {}):
            return None
        if not isinstance(value, dict):
            raise ValueError("drm 必須是 JSON 物件")
        key = str(value.get("key") or "").strip()
        drm_type = str(value.get("type") or "").strip().lower()
        if not key or drm_type not in ("widevine", "playready", "clearkey"):
            raise ValueError("drm 需要 key，type 必須是 widevine、playready 或 clearkey")
        cls._absolute_url(key, "drm.key")
        return {
            "key": key,
            "type": drm_type,
            "forceKey": bool(value.get("forceKey", False)),
            "header": cls._string_map(value.get("header"), "drm.header"),
        }

    def _cookies(self):
        cookies = str(self.net.getCookie(self.web_url) or "")
        if "\r" in cookies or "\n" in cookies:
            raise ValueError("WebView Cookie 格式無效")
        return cookies

    def _clear_cookie(self):
        self.net.setCookie(
            self.web_url,
            "%s=; Path=/; Max-Age=0" % self.cookie_name,
        )
        return not self._cookie_value(self._cookies(), self.cookie_name)

    @staticmethod
    def _cookie_value(cookies, name):
        for item in str(cookies or "").split(";"):
            key, separator, value = item.strip().partition("=")
            if separator and key == name:
                return value
        return ""

    def _request(self):
        headers = self._string_map(self.options.get("request_headers"), "request_headers")
        if not any(key.lower() == "user-agent" for key in headers):
            headers["User-Agent"] = str(self.net.getUserAgent() or USER_AGENT)
        options = {
            "method": str(self.options.get("request_method") or "GET"),
            "headers": headers,
            "timeout": REQUEST_TIMEOUT_MS,
            "cookie": True,
            "callTimeout": REQUEST_TIMEOUT_MS,
        }
        extra = self.options.get("request_options", {})
        if not isinstance(extra, dict):
            raise ValueError("request_options 必須是物件")
        options.update(extra)
        return self.net.req(self.request_url, options)
