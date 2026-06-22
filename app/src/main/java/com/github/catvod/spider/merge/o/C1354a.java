package com.github.catvod.spider.merge.o;

import com.github.catvod.spider.merge.b.AbstractC0901a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1354a extends AbstractC0901a {
    private static volatile C1354a c;
    private C1356c a;
    private C1356c b;

    private C1354a() {
        C1356c c1356c = new C1356c();
        this.b = c1356c;
        this.a = c1356c;
    }

    public static C1354a o() {
        if (c != null) {
            return c;
        }
        synchronized (C1354a.class) {
            if (c == null) {
                c = new C1354a();
            }
        }
        return c;
    }

    public final boolean p() {
        return this.a.o();
    }
}
