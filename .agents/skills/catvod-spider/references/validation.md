# 接口驗證

入口與回傳型別以 [Demo](../../../../README.md#開始開發) 為準。主機驗證放在倉庫外的暫存目錄，不新增測試工具到爬蟲倉庫。

## HTTP 回應

Python `self.net.req` 回傳 dict，QuickJS `await net.http` 回傳物件，Java `net.req` 回傳 JSON 字串。文字回應包含 code、content；先處理 error，再檢查 code。`net.json` 回傳解析後的資料，HTTP 非 2xx 或無效 JSON 會失敗。

保存實際請求的 URL、狀態碼與原始正文供比對；Cookie、token、簽名網址不寫入驗證紀錄。

## 主機驗證

- 使用[執行環境](../../../../docs/development.md#執行環境)指定的 Python 3.10，入口維持同步 `def`。
- 依爬蟲實際使用的入口與網路方法建立最小適配器；未收錄的 URL、未支援的方法直接失敗，不仿造整個 App。
- 使用保存的真實回應驗證解析與輸出；適配器不代表 Cookie、TTL、取消、Local、proxy 或 Android 行為正確。
- QuickJS 的 Promise、注入函式及模組載入仍需 App 驗證；Node.js 通過不能當成 QuickJS 通過。

## 核對項目

- 分類、篩選與搜尋結果符合已知片名；兩頁內容不同，尾頁及無結果處理正確。
- 列表 ID 接詳情，每集播放值接播放接口；線路、集數和連結與原始回應一致。
- page、pagecount 使用網站值，limit 使用頁大小；未知 total 不推算。
- HTTP 403、登入頁、格式改變及 error 需顯示錯誤，不回傳成功空列表。
- 網址取得、HLS 清單、分段、實際解碼與連續播放分開回報，不以關閉憑證驗證掩蓋問題。

App 驗證另核對載入、快取、取消、Cookie、proxy 與播放；Java 還需檢查 DEX、R8 與 Android 元件。主機與 App 結果分開回報。
