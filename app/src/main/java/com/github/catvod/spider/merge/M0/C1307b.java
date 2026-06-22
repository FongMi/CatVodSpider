package com.github.catvod.spider.merge.m0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1307b {
    private Map<String, String> a = new HashMap();
    private int b = 0;
    private boolean c = true;
    private ExecutorService d;

    public final C1308c e() {
        if (this.d == null) {
            this.d = Executors.newCachedThreadPool(C1308c.g);
        }
        return new C1308c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final C1307b f(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final C1307b g() {
        this.b = 2;
        return this;
    }
}
