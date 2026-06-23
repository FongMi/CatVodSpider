package com.github.catvod.bean.uc;

import java.util.HashMap;
import java.util.Map;

/**
 * UC quality mapping utility (replaces com.github.catvod.spider.merge.T.a)
 */
public final class UcQuality {

    public static final UcQuality NORMAL = new UcQuality("NORMAL");

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

    private final String name;

    public UcQuality(String name) {
        this.name = name;
    }

    /** Map quality key to numeric value (replaces T.a.a) */
    public static Integer a(String qualityKey) {
        if (qualityKey == null) return 360;
        Integer val = QUALITY_MAP.get(qualityKey);
        return val != null ? val : 360;
    }

    public String getName() { return name; }
}
