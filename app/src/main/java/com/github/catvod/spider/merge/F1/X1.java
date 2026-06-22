package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.h1.C1257y;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class X1 {
    private com.github.catvod.spider.merge.h1.V a;
    private com.github.catvod.spider.merge.h1.U b;
    private int c;
    private boolean d;
    private Map<String, com.github.catvod.spider.merge.h1.H> e;
    private List<com.github.catvod.spider.merge.h1.J> f;
    private List<com.github.catvod.spider.merge.h1.E> g;
    final /* synthetic */ Y1 h;

    X1(Y1 y1, C1257y c1257y) {
        this.h = y1;
        this.a = y1.p;
        y1.p = c1257y;
        this.b = y1.q;
        y1.q = c1257y;
        this.e = y1.t;
        y1.t = null;
        this.f = y1.u;
        y1.u = null;
        this.g = y1.v;
        y1.v = null;
        this.c = y1.r;
        y1.r = 0;
        this.d = y1.s;
        y1.s = false;
    }

    final void a() {
        Y1 y1 = this.h;
        y1.p = this.a;
        y1.q = this.b;
        y1.t = this.e;
        this.h.u = this.f;
        this.h.v = this.g;
        this.h.r = this.c;
        this.h.s = this.d;
    }
}
