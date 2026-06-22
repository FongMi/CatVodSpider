package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0813a {
    public final List<AbstractC0825m> a = new ArrayList();
    public final List<AbstractC0833v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public C[] h;
    public final List<r0> i;

    public C0813a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    public final void a(AbstractC0825m abstractC0825m) {
        if (abstractC0825m != null) {
            abstractC0825m.a = this;
            abstractC0825m.b = this.a.size();
        }
        this.a.add(abstractC0825m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.v>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.v>] */
    public final AbstractC0833v b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (AbstractC0833v) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    public final com.github.catvod.spider.merge.Bk.k c(int i, com.github.catvod.spider.merge.yZ.D d) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException(ZrJ.d("302D3D2C242C1D63383929311C63253825271C3165"));
        }
        com.github.catvod.spider.merge.Bk.k kVarE = e((AbstractC0825m) this.a.get(i));
        if (!kVarE.d(-2)) {
            return kVarE;
        }
        com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        kVar.c(kVarE);
        kVar.h();
        while (d != null && d.b >= 0 && kVarE.d(-2)) {
            kVarE = e(((f0) ((AbstractC0825m) this.a.get(d.b)).d(0)).c);
            kVar.c(kVarE);
            kVar.h();
            d = d.a;
        }
        if (kVarE.d(-2)) {
            kVar.a(-1);
        }
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.v>] */
    public final int d() {
        return this.b.size();
    }

    public final com.github.catvod.spider.merge.Bk.k e(AbstractC0825m abstractC0825m) {
        com.github.catvod.spider.merge.Bk.k kVar = abstractC0825m.f;
        if (kVar != null) {
            return kVar;
        }
        com.github.catvod.spider.merge.Bk.k kVarF = f(abstractC0825m, null);
        abstractC0825m.f = kVarF;
        kVarF.i();
        return abstractC0825m.f;
    }

    public final com.github.catvod.spider.merge.Bk.k f(AbstractC0825m abstractC0825m, com.github.catvod.spider.merge.yZ.D d) {
        C0836y c0836y = new C0836y(this);
        com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        c0836y.a(abstractC0825m, d != null ? X.a(abstractC0825m.a, d) : null, kVar, new HashSet(), new BitSet());
        return kVar;
    }
}
