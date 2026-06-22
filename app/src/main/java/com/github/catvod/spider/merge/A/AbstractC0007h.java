package com.github.catvod.spider.merge.A;

import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class AbstractC0007h {
    public static final com.github.catvod.spider.merge.B.e c;
    public final C0000a a;
    public final C0019u b;

    static {
        UUID uuid = C0006g.a;
        com.github.catvod.spider.merge.B.e eVar = new com.github.catvod.spider.merge.B.e(new C0004e(true));
        c = eVar;
        eVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0007h(C0000a c0000a, C0019u c0019u) {
        this.a = c0000a;
        this.b = c0019u;
    }

    public abstract void a();
}
