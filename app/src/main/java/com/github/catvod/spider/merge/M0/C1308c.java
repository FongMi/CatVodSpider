package com.github.catvod.spider.merge.m0;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1308c {
    private static final ThreadFactory g = new ThreadFactoryC1306a();
    private Map<String, String> a;
    private int c;
    private boolean d;
    private ExecutorService e;
    private String b = null;
    private Proxy f = null;

    C1308c(C1307b c1307b) {
        this.a = (HashMap) c1307b.a;
        this.c = c1307b.b;
        this.d = c1307b.c;
        this.e = c1307b.d;
    }

    public final String b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final Proxy e() {
        return this.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(Proxy.Type type, String str, int i) {
        this.f = new Proxy(type, new InetSocketAddress(str, i));
    }
}
