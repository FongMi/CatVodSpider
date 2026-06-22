package com.github.catvod.spider.merge.o1;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1361c {
    private final int a;
    private final String b;
    private final Map<String, List<String>> c;
    private final String d;
    private final String e;

    public C1361c(int i, String str, Map<String, List<String>> map, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = map == null ? Collections.emptyMap() : map;
        this.d = str2 == null ? "" : str2;
        this.e = str3;
    }

    public final String a() {
        for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.equalsIgnoreCase("Content-Type") && !entry.getValue().isEmpty()) {
                return entry.getValue().get(0);
            }
        }
        return null;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }
}
