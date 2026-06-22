package com.github.catvod.spider.merge.I;

import java.util.HashMap;

public final class BuilderUtils {
    public static String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static HashMap c(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }
}
