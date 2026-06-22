package com.github.catvod.spider.merge.m1;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1317i implements Serializable {
    private List<URL> b = new ArrayList();
    private List<String> c = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.net.URL>] */
    public final void a(URL url) {
        this.b.add(url);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void b(String str) {
        this.c.add(str);
    }
}
