# QuickJS HTML 查詢

`htmlQuery(source, plan)` 接收 HTML 字串與可序列化為 JSON 的查詢物件，一次解析後回傳普通物件，不保留 DOM。基本用法見[開發說明](development.md#quickjs-html-欄位解析)與 JS Demo 的 `html_query` 操作。

## 查詢與欄位

plan 必須包含 queries 物件，每個具名查詢需要 selector 與 fields，可選填 maxRows。多組查詢共用同一次解析，結果按查詢名稱回傳陣列。

查詢的 selector 選列，fields 的 selector 選該列的子孫，不包含該列本身。欄位選項如下：

| 選項 | 用途 |
| --- | --- |
| `selector` | CSS 選擇器；省略時讀該列本身，空字串無效 |
| `attribute` | 讀取屬性；省略時讀文字，空字串無效 |
| `all` | 布林值，預設 false 讀第一個節點；true 讀全部節點 |

## 回傳值

缺少節點／屬性回傳 null，已存在的空值是空字串。all:true 沒有匹配時回傳空陣列，匹配到的節點缺少屬性時保留 null。查詢與欄位依 plan 順序輸出，匹配列與 all:true 內的值依 DOM 順序排列。

文字按 DOM 順序串接，不插入分隔符、不自動 trim，包含 script／style 資料並略過註解。屬性值會解碼 HTML entity，不會補相對 URL 或 trim。

選擇器、HTML 修復與 entity 解碼沿用 Jsoup 規則；class 比對不分大小寫，不保證 Cheerio 相容。必填欄位驗證、文字清理、URL 組合及去重由爬蟲處理。

## 限制

| 項目 | 上限 |
| --- | --- |
| HTML | 2,097,152 個 UTF-16 字元 |
| 序列化後的 plan | 16,384 個 UTF-16 字元 |
| queries | 1..16 組，每組 fields 為 1..32 個 |
| query／field 名稱 | 1..128 個 UTF-16 字元 |
| 每組 query 的列數 | maxRows 為 1..1,024，預設 1,024 |
| 序列化後的結果 | 1,048,576 個 UTF-16 字元，包含 JSON 跳脫字元 |

超限會拋出例外，不回傳截斷結果。未知選項、無效型別與 CSS 選擇器也會拋出例外；所有選擇器會在解析 HTML 前驗證，包括沒有匹配列的查詢。
