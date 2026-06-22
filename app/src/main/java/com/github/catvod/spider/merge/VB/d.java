package com.github.catvod.spider.merge.VB;

import com.github.catvod.spider.merge.XI.h;
import com.github.catvod.spider.merge.XI.i;
import com.github.catvod.spider.merge.XI.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d implements h {
    boolean a = false;
    final Map<String, c> b = new HashMap();
    final LinkedBlockingQueue<m> c = new LinkedBlockingQueue<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.VB.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.VB.c>] */
    @Override // com.github.catvod.spider.merge.XI.h
    public final synchronized i a(String str) {
        c cVar;
        cVar = (c) this.b.get(str);
        if (cVar == null) {
            cVar = new c(str, this.c, this.a);
            this.b.put(str, cVar);
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.VB.c>] */
    public final void b() {
        this.b.clear();
        this.c.clear();
    }

    public final LinkedBlockingQueue<m> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.VB.c>] */
    public final List<c> d() {
        return new ArrayList(this.b.values());
    }

    public final void e() {
        this.a = true;
    }
}
