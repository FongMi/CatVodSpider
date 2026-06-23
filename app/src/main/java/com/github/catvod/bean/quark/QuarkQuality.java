package com.github.catvod.bean.quark;

import java.util.HashMap;
import java.util.Map;

/**
 * Quark quality mapping utility (replaces com.github.catvod.spider.merge.S.b)
 */
public final class QuarkQuality {

    private static final Map<String, Integer> QUALITY_MAP = new HashMap<>();
    static {
        QUALITY_MAP.put("4kz", 4096);
        QUALITY_MAP.put("4k", 4096);
        QUALITY_MAP.put("2k", 2048);
        QUALITY_MAP.put("super", 1080);
        QUALITY_MAP.put("high", 720);
        QUALITY_MAP.put("low", 480);
        QUALITY_MAP.put("normal", 360);
        QUALITY_MAP.put("auto", 360);
    }

    /** Map quality key to numeric value (replaces S.b.a) */
    public static Integer a(String qualityKey) {
        if (qualityKey == null) return 360;
        Integer val = QUALITY_MAP.get(qualityKey);
        return val != null ? val : 360;
    }
}
