package com.github.catvod.spider;

final class DemoData {

    static final String CATALOG = """
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

    static final String[][] CATEGORIES = {
        {"vod_portrait", "VOD 直式"},
        {"vod_landscape", "VOD 橫式"},
        {"vod_oval", "VOD 圓形"},
        {"vod_list", "VOD 列表"},
        {"class_landscape", "分類橫式"},
        {"class_oval", "分類圓形"},
        {"folders", "資料夾"},
        {"actions", "互動功能"}
    };

    static final String[][] FILTERS = {
        {"genre", "類型", "動畫", "戲劇", "綜藝", "紀錄"},
        {"area", "地區", "台灣", "日本", "韓國"},
        {"year", "年份", "2026", "2025", "2024", "2023", "2022", "2021"}
    };

    static final String[][] FOLDERS = {
        {"genre", "動畫", "戲劇", "綜藝", "紀錄"},
        {"area", "台灣", "日本", "韓國"}
    };

    static final String[][] ACTIONS = {
        {"web_view", "開啟獨立內容", "mode=view，返回依網頁歷史"},
        {"native_toast", "執行中 Toast", "呼叫 App 的 Init.toast"},
        {"json", "JSON 請求", "net.json 驗證 HTTP 與 JSON"},
        {"request_sync", "同步 HTTP", "同步取得完整回應"},
        {"session", "隔離 Session", "在獨立 Cookie 流程完成請求並關閉"},
        {"parallel", "並行請求", "同時取得 3 份回應"},
        {"download", "下載檔案", "Net.download 寫入 App 快取，用完移除"},
        {"binary", "二進位回應", "buffer=1，取得 byte 陣列"},
        {"ttl_persist", "持久化快取", "重建爬蟲後仍可讀取"},
        {"ttl_background", "立即回快取、背景更新", "先 peek，再交給 refresh 背景更新"},
        {"ttl_clear_all", "清除全部 TTL 快取", "只清目前站點的 TTL 資料"},
        {"proxy", "本機 proxy", "透過 App HTTP server 呼叫此爬蟲"},
        {"runtime", "測試 App 與加密 bridge", "驗證 SHA-256 與 AES-GCM"},
        {"toast", "顯示 Toast", "action 回傳 msg，由 App 顯示"},
        {"dialog", "顯示 Dialog", "主執行緒取得目前 Activity，再建立對話框"},
        {"site_key", "顯示 Site key", "由 App 在 init 前注入的 siteKey"},
        {"web", "開啟網頁", "action 回傳 web，由 App 開啟"},
        {"cookie", "檢查登入 Cookie", "只顯示是否存在，不顯示 Cookie 內容"},
        {"cookie_clear", "清除登入 Cookie", "寫入過期 Cookie 並確認結果"},
        {"request", "HTTP + Cookie 請求", "使用 net.req，只顯示狀態與長度"},
        {"websocket", "WebSocket 訊息交換", "使用 net.ws，只顯示狀態與長度"},
        {"socket-start", "WebSocket 持續連線", "持續收訊並發送二進位範例"},
        {"socket-state", "WebSocket 連線狀態", "查看文字與二進位訊息數"},
        {"socket-stop", "WebSocket 停止連線", "關閉連線並釋放資源"},
        {"sleep", "可取消等待", "等待 250 毫秒；爬蟲關閉或任務中斷會取消"},
        {"ttl_cache", "TTL 快取", "有效期內重用資料；過期背景更新"},
        {"ttl_peek", "讀取已有快取", "只讀已有值，不發出請求或延長 TTL"},
        {"ttl_clear", "清除 TTL 快取", "清除同一個 key，並取消正在載入的資料"},
        {"cache_write", "寫入 Local", "保存 JSON 物件、陣列及純量"},
        {"cache_read", "讀取 Local", "使用 local.get 讀取相同 key"},
        {"cache_delete", "刪除 Local", "使用 local.delete 清除資料"},
        {"text_get", "GET 正文", "使用 net.get"},
        {"text_post", "POST 正文", "使用 net.post"}
    };

    private DemoData() {
    }
}
