package com.github.catvod.spider.merge.o1;

import com.github.catvod.spider.merge.r1.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1359a {
    private String a;
    private String b;
    private byte[] d;
    private e e;
    private final Map<String, List<String>> c = new LinkedHashMap();
    private boolean f = true;

    public final C1360b g() {
        return new C1360b(this);
    }

    public final C1359a h(String str) {
        this.a = "GET";
        this.b = str;
        return this;
    }

    public final C1359a i(String str) {
        this.a = "HEAD";
        this.b = str;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.util.List<java.lang.String>>] */
    public final C1359a j(Map<String, List<String>> map) {
        this.c.clear();
        if (map != null) {
            this.c.putAll(map);
        }
        return this;
    }

    public final C1359a k(e eVar) {
        this.e = eVar;
        return this;
    }

    public final C1359a l(String str, byte[] bArr) {
        this.a = "POST";
        this.b = str;
        this.d = bArr;
        return this;
    }
}
