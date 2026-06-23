package com.github.catvod.utils.merge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cookie 解析与合并工具
 */
public final class CookieUtils {

    /**
     * 从 Cookie 字符串中提取 __pus 值
     *
     * @param cookie Cookie 字符串，如 "key1=val1; __pus=abc123; key2=val2"
     * @return __pus 的值，不存在则返回 null
     */
    public static String extractPusFromCookie(String cookie) {
        if (cookie == null || cookie.trim().isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("([^=;]+)=([^;]*)").matcher(cookie);
        while (matcher.find()) {
            String key = matcher.group(1).trim();
            String value = matcher.group(2).trim();
            if ("__pus".equals(key)) {
                return value;
            }
        }
        return null;
    }

    /**
     * 合并响应头中的 Set-Cookie 与已有 Cookie 字符串
     * <p>
     * 从 existingCookie 解析键值对，再从响应头的 Set-Cookie 中提取覆盖，
     * 最终拼接为 "key1=val1; key2=val2" 格式
     *
     * @param responseHeaders HTTP 响应头（可能包含 "Set-Cookie" 或 "set-cookie"）
     * @param existingCookie  已有的 Cookie 字符串
     * @return 合并后的 Cookie 字符串
     */
    public static String mergeCookies(Map<String, List<String>> responseHeaders, String existingCookie) {
        LinkedHashMap<String, String> cookies = new LinkedHashMap<>();

        // 解析已有 Cookie
        if (existingCookie != null && !existingCookie.trim().isEmpty()) {
            for (String pair : existingCookie.split(";")) {
                String trimmed = pair.trim();
                int eqIndex = trimmed.indexOf('=');
                if (!trimmed.isEmpty() && eqIndex > 0) {
                    String key = trimmed.substring(0, eqIndex);
                    String value = eqIndex < trimmed.length() - 1 ? trimmed.substring(eqIndex + 1) : "";
                    cookies.put(key, value);
                }
            }
        }

        // 从响应头的 Set-Cookie 中提取（覆盖已有值）
        List<String> setCookieHeaders = responseHeaders.get("Set-Cookie");
        if (setCookieHeaders == null) {
            setCookieHeaders = responseHeaders.get("set-cookie");
        }
        if (setCookieHeaders != null) {
            for (String setCookie : setCookieHeaders) {
                String cookiePair = setCookie.split(";")[0].trim();
                int eqIndex = cookiePair.indexOf('=');
                if (!cookiePair.isEmpty() && eqIndex > 0) {
                    String key = cookiePair.substring(0, eqIndex);
                    String value = eqIndex < cookiePair.length() - 1 ? cookiePair.substring(eqIndex + 1) : "";
                    cookies.put(key, value);
                }
            }
        }

        // 拼接为标准 Cookie 格式
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : cookies.entrySet()) {
            if (result.length() > 0) {
                result.append("; ");
            }
            result.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return result.toString();
    }

    // ========== 以下方法仅供 merge 包内部使用，保留兼容性 ==========

    public static void throwError(String message) {
        throw new com.github.catvod.spider.merge.a1.C0900e(message);
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new com.github.catvod.spider.merge.a1.C0900e("Must be true");
        }
    }

    public static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new com.github.catvod.spider.merge.a1.C0900e(message);
        }
    }

    public static void assertFalse(boolean condition) {
        if (condition) {
            throw new com.github.catvod.spider.merge.a1.C0900e("Must be false");
        }
    }

    public static void assertNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new com.github.catvod.spider.merge.a1.C0900e("String must not be empty");
        }
    }

    public static void assertNotEmpty(String str, String message) {
        if (str == null || str.isEmpty()) {
            throw new com.github.catvod.spider.merge.a1.C0900e(message);
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new com.github.catvod.spider.merge.a1.C0900e("Object must not be null");
        }
    }

    public static void assertNotNull(Object obj, String paramName) {
        if (obj == null) {
            throw new com.github.catvod.spider.merge.a1.C0900e(
                    String.format("The parameter '%s' must not be null.", paramName));
        }
    }
}
