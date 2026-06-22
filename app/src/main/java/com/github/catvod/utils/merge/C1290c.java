package com.github.catvod.utils.merge;

import java.net.URI;

/**
 * URL resolution utility (replaces missing merge.l.C1290c)
 */
public final class C1290c {

    public static String a(String baseUrl, String relativeUrl) {
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

    public static StringBuilder b(StringBuilder sb, String... parts) {
        for (String part : parts) {
            sb.append(part);
        }
        return sb;
    }
}
