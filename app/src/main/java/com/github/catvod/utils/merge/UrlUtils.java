package com.github.catvod.utils.merge;

import java.net.URI;

/**
 * URL 解析工具
 */
public final class UrlUtils {

    /**
     * 将相对 URL 解析为绝对 URL
     *
     * @param baseUrl     基础 URL，如 "https://drive-pc.quark.cn/"
     * @param relativeUrl 相对路径，如 "/api/list" 或完整 URL
     * @return 解析后的绝对 URL
     */
    public static String resolveUrl(String baseUrl, String relativeUrl) {
        if (relativeUrl == null || relativeUrl.isEmpty()) {
            return baseUrl;
        }
        if (relativeUrl.startsWith("http://") || relativeUrl.startsWith("https://")) {
            return relativeUrl;
        }
        try {
            URI base = URI.create(baseUrl);
            if (relativeUrl.startsWith("/")) {
                return base.getScheme() + "://" + base.getHost() + relativeUrl;
            }
            return base.resolve(relativeUrl).toString();
        } catch (Exception e) {
            return baseUrl + relativeUrl;
        }
    }
}
