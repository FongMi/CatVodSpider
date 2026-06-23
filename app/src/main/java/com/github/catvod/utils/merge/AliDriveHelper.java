package com.github.catvod.utils.merge;

import java.util.HashMap;
import java.util.Map;

/**
 * 阿里云盘代理服务工具类
 * <p>
 * 注意：AliDriveApi 已删除，以下方法返回默认值或空结果。
 * 如需完整阿里云盘功能，需要重新实现 AliDriveApi。
 */
public final class AliDriveHelper {

    private static final String DEFAULT_PROXY_URL = "http://127.0.0.1:9966";

    private AliDriveHelper() {
    }

    public static String getProxyBaseUrl() {
        return DEFAULT_PROXY_URL;
    }

    public static String createBySecUpload(String fileName, String url, long fileSize, String sha1Hash) {
        // AliDriveApi removed - requires reimplementation
        return "";
    }

    public static String getDanmakuUrl(String[] playParams) {
        // AliDriveApi removed - requires reimplementation
        return "";
    }

    public static Map<String, String> getDefaultHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        headers.put("Referer", "https://www.aliyundrive.com/");
        return headers;
    }
}
