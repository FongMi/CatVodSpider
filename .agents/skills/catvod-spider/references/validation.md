# 接口驗證

先從對應 Demo 確認入口與回傳型別，再驗證站點資料。主機驗證可在倉庫外的暫存目錄執行；爬蟲倉庫保持文件與範例，不新增測試工具。

## HTTP 回應

Python `self.net.req` 回傳 dict，QuickJS `await net.http` 回傳物件，Java `net.req` 回傳 JSON 字串。文字請求的回應包含 code、content；有 error 時先處理錯誤，再檢查 code，不能把 HTTP 403 的正文當成列表。

```json
{"code": 200, "content": "實際 HTML 或 JSON 文字"}
```

JSON API 使用 net.json，取得的是解析後的資料，不是上述 HTTP 回應。Cookie、token、簽名播放網址不要存進驗證紀錄。

## Python 主機驗證

用實際請求的 URL、狀態碼與原始正文建立暫存的 responses.json，以下只展示結構；正文須換成真實回應：

```json
{"https://example.com/list?page=1": {"code": 200, "content": "真實回應"}}
```

將下面內容存成同目錄的 check.py，修改爬蟲路徑與分類 ID，再執行 `python check.py`。這個流程不需讀取 App 原始碼，只注入解析所需的 base.spider 與 net。沒有收錄的 URL 或未支援的方法會直接失敗；依爬蟲實際使用的功能補充，不仿造整個執行環境。

```python
import json
import runpy
import sys
import types
from pathlib import Path

SPIDER = Path(r"D:\Crawler\site.py")
RESPONSES = Path(__file__).with_name("responses.json")


class BaseSpider:
    def page(self, items, pg, limit):
        pg = int(pg)
        if pg < 1 or limit < 1:
            raise ValueError("頁碼與頁大小必須大於零")
        start = (pg - 1) * limit
        return {"list": items[start:start + limit], "page": pg,
                "pagecount": (len(items) + limit - 1) // limit,
                "limit": limit, "total": len(items)}


class Net:
    def __init__(self):
        self.responses = json.loads(RESPONSES.read_text(encoding="utf-8"))

    def req(self, url, options=None):
        return dict(self.responses[url])

    def json(self, url, options=None):
        result = self.req(url, options)
        if result.get("error") or not 200 <= result["code"] < 300:
            raise ValueError(result.get("error") or "HTTP %s" % result["code"])
        return json.loads(result["content"])

    def cached(self, key, options, loader):
        return loader()


base = types.ModuleType("base")
module = types.ModuleType("base.spider")
module.Spider = BaseSpider
base.spider = module
sys.modules["base"] = base
sys.modules["base.spider"] = module

spider = runpy.run_path(str(SPIDER))["Spider"]()
spider.net = Net()
spider.init("")
result = spider.categoryContent("分類 ID", "1", False, {})
assert isinstance(result["list"], list)
assert result["list"], "請選擇已知有資料的分類"
assert result["page"] == 1
assert all(item["vod_id"] and item["vod_name"] for item in result["list"])
print(json.dumps(result, ensure_ascii=False))
```

這個適配器只讀保存的回應，忽略請求 options，cached 每次都執行 loader。它不實作 HTTP、Cookie、TTL、取消、Local、proxy 或 Android 元件。需要這些功能時先分開驗證資料解析，再使用 App 驗證實際行為；不可把替身通過當成共用接口通過。Python 版本與非標準套件的可用性也需在目標 App 確認。

## 核對項目

- 使用已知片名確認搜尋結果相關，核對兩頁內容不同、尾頁和真實無結果；分類與組合篩選抽查詳情是否符合。
- 列表 ID 接到詳情，每集播放值接到播放接口。多線名稱、集數和連結逐條比對原始回應，不假定各線集數相同。
- 分頁的 page、pagecount 使用網站值，limit 使用頁大小；未知 total 不推算。頁數、總數會變動，不把一次觀察的數字當成固定條件。
- 以 HTTP 403、登入頁、格式改變及 error 回應確認失敗會顯示錯誤，而非回傳成功空列表；不把自製資料當成真實站點驗證。
- 媒體網址取得、HLS 清單取得、分段取得、實際解碼與連續播放分開報告，不關閉憑證驗證來掩蓋問題。

QuickJS 可用主機 JavaScript 驗證解析函式和 JSON，但 Promise、注入函式及模組載入仍需 App 驗證；Node.js 通過不能證明 QuickJS 通過。Java 的 Android 元件、JAR 載入與 R8 需在 App 驗證，不能用 Python 或 JavaScript 替身代替。
