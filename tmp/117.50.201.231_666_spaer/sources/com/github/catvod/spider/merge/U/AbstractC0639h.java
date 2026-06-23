package com.github.catvod.spider.merge.u;

import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0639h {
    public static final com.github.catvod.spider.merge.v.d c;
    public final C0632a a;
    protected final T b;

    static {
        UUID uuid = C0638g.f;
        UUID uuid2 = C0638g.f;
        com.github.catvod.spider.merge.v.d dVar = new com.github.catvod.spider.merge.v.d(new C0634c(true));
        c = dVar;
        dVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0639h(C0632a c0632a, T t) {
        this.a = c0632a;
        this.b = t;
    }

    public abstract void a();
}
