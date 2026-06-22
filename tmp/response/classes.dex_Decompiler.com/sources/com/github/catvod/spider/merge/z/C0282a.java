package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0249D;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0282a {
    public final List<AbstractC0294m> a = new ArrayList();
    public final List<AbstractC0302v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0277C[] h;
    public final List<r0> i;

    public C0282a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    public final void a(AbstractC0294m abstractC0294m) {
        if (abstractC0294m != null) {
            abstractC0294m.a = this;
            abstractC0294m.b = this.a.size();
        }
        this.a.add(abstractC0294m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.v>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.v>] */
    public final AbstractC0302v b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (AbstractC0302v) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    public final com.github.catvod.spider.merge.B.k c(int i, C0249D c0249d) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException(oZP.d("3C010120003C114F04350D21104F19340137101D59"));
        }
        com.github.catvod.spider.merge.B.k kVarE = e((AbstractC0294m) this.a.get(i));
        if (!kVarE.d(-2)) {
            return kVarE;
        }
        com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
        kVar.c(kVarE);
        kVar.h();
        while (c0249d != null && c0249d.b >= 0 && kVarE.d(-2)) {
            kVarE = e(((f0) ((AbstractC0294m) this.a.get(c0249d.b)).d(0)).c);
            kVar.c(kVarE);
            kVar.h();
            c0249d = c0249d.a;
        }
        if (kVarE.d(-2)) {
            kVar.a(-1);
        }
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.v>] */
    public final int d() {
        return this.b.size();
    }

    public final com.github.catvod.spider.merge.B.k e(AbstractC0294m abstractC0294m) {
        com.github.catvod.spider.merge.B.k kVar = abstractC0294m.f;
        if (kVar != null) {
            return kVar;
        }
        com.github.catvod.spider.merge.B.k kVarF = f(abstractC0294m, null);
        abstractC0294m.f = kVarF;
        kVarF.i();
        return abstractC0294m.f;
    }

    public final com.github.catvod.spider.merge.B.k f(AbstractC0294m abstractC0294m, C0249D c0249d) {
        C0305y c0305y = new C0305y(this);
        com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
        c0305y.a(abstractC0294m, c0249d != null ? X.a(abstractC0294m.a, c0249d) : null, kVar, new HashSet(), new BitSet());
        return kVar;
    }
}
