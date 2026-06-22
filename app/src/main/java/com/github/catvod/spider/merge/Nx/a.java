package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Mm.j;
import com.github.catvod.spider.merge.gu.C;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    public final List<m> a = new ArrayList();
    public final List<v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public C[] h;
    public final List<r0> i;

    public a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    public final void a(m mVar) {
        if (mVar != null) {
            mVar.a = this;
            mVar.b = this.a.size();
        }
        this.a.add(mVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.v>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.v>] */
    public final v b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (v) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    public final j c(int i, C c) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        j jVarE = e((m) this.a.get(i));
        if (!jVarE.d(-2)) {
            return jVarE;
        }
        j jVar = new j(new int[0]);
        jVar.c(jVarE);
        jVar.h();
        while (c != null && c.b >= 0 && jVarE.d(-2)) {
            jVarE = e(((m) this.a.get(c.b)).d(0).c);
            jVar.c(jVarE);
            jVar.h();
            c = c.a;
        }
        if (jVarE.d(-2)) {
            jVar.a(-1);
        }
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.v>] */
    public final int d() {
        return this.b.size();
    }

    public final j e(m mVar) {
        j jVar = mVar.f;
        if (jVar != null) {
            return jVar;
        }
        j jVarF = f(mVar, null);
        mVar.f = jVarF;
        jVarF.i();
        return mVar.f;
    }

    public final j f(m mVar, C c) {
        y yVar = new y(this);
        j jVar = new j(new int[0]);
        yVar.a(mVar, c != null ? X.a(mVar.a, c) : null, jVar, new HashSet(), new BitSet());
        return jVar;
    }
}
