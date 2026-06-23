package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.C0426D;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0459a {
    public final List<AbstractC0471m> a = new ArrayList();
    public final List<AbstractC0479v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0454C[] h;
    public final List<r0> i;

    public C0459a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    public final void a(AbstractC0471m abstractC0471m) {
        if (abstractC0471m != null) {
            abstractC0471m.a = this;
            abstractC0471m.b = this.a.size();
        }
        this.a.add(abstractC0471m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.v>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.v>] */
    public final AbstractC0479v b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (AbstractC0479v) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    public final com.github.catvod.spider.merge.FM.A.k c(int i, C0426D c0426d) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        com.github.catvod.spider.merge.FM.A.k kVarE = e((AbstractC0471m) this.a.get(i));
        if (!kVarE.d(-2)) {
            return kVarE;
        }
        com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        kVar.c(kVarE);
        kVar.h();
        while (c0426d != null && c0426d.b >= 0 && kVarE.d(-2)) {
            kVarE = e(((f0) ((AbstractC0471m) this.a.get(c0426d.b)).d(0)).c);
            kVar.c(kVarE);
            kVar.h();
            c0426d = c0426d.a;
        }
        if (kVarE.d(-2)) {
            kVar.a(-1);
        }
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.v>] */
    public final int d() {
        return this.b.size();
    }

    public final com.github.catvod.spider.merge.FM.A.k e(AbstractC0471m abstractC0471m) {
        com.github.catvod.spider.merge.FM.A.k kVar = abstractC0471m.f;
        if (kVar != null) {
            return kVar;
        }
        com.github.catvod.spider.merge.FM.A.k kVarF = f(abstractC0471m, null);
        abstractC0471m.f = kVarF;
        kVarF.i();
        return abstractC0471m.f;
    }

    public final com.github.catvod.spider.merge.FM.A.k f(AbstractC0471m abstractC0471m, C0426D c0426d) {
        C0482y c0482y = new C0482y(this);
        com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        c0482y.a(abstractC0471m, c0426d != null ? X.a(abstractC0471m.a, c0426d) : null, kVar, new HashSet(), new BitSet());
        return kVar;
    }
}
