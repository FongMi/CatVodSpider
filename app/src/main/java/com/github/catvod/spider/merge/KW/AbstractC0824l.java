package com.github.catvod.spider.merge.KW;

import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0824l {
    public static final com.github.catvod.spider.merge.XI.e c;
    public final C0813a a;
    protected final Y b;

    static {
        UUID uuid = C0823k.f;
        UUID uuid2 = C0823k.f;
        com.github.catvod.spider.merge.XI.e eVar = new com.github.catvod.spider.merge.XI.e(new C0818f(true));
        c = eVar;
        eVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0824l(C0813a c0813a, Y y) {
        this.a = c0813a;
        this.b = y;
    }

    public abstract void a();
}
