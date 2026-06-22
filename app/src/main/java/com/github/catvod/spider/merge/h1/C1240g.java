package com.github.catvod.spider.merge.h1;

import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1240g extends V {
    private SortedSet<C1245l> J;

    public C1240g() {
        super(0);
        this.b = 140;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.SortedSet<com.github.catvod.spider.merge.h1.l>, java.util.TreeSet] */
    public final void d1(C1245l c1245l) {
        P(c1245l);
        if (this.J == null) {
            this.J = new TreeSet(new C1238e());
        }
        this.J.add(c1245l);
        c1245l.a0(this);
    }
}
