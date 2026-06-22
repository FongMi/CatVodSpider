package com.github.catvod.spider.merge.z;

import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0293l {
    public static final com.github.catvod.spider.merge.A.e c;
    public final C0282a a;
    protected final Y b;

    static {
        UUID uuid = C0292k.f;
        UUID uuid2 = C0292k.f;
        com.github.catvod.spider.merge.A.e eVar = new com.github.catvod.spider.merge.A.e(new C0287f(true));
        c = eVar;
        eVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0293l(C0282a c0282a, Y y) {
        this.a = c0282a;
        this.b = y;
    }

    public abstract void a();
}
