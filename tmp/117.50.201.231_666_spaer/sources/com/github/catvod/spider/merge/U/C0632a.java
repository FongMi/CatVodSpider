package com.github.catvod.spider.merge.u;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0632a {
    public final List<AbstractC0640i> a = new ArrayList();
    public final List<r> b = new ArrayList();
    public Y[] c;
    public Z[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0654x[] h;
    public final List<h0> i;

    public C0632a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    public final void a(AbstractC0640i abstractC0640i) {
        if (abstractC0640i != null) {
            abstractC0640i.a = this;
            abstractC0640i.b = this.a.size();
        }
        this.a.add(abstractC0640i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.r>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.r>] */
    public final r b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (r) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    public final com.github.catvod.spider.merge.w.i c(int i, com.github.catvod.spider.merge.t.y yVar) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        com.github.catvod.spider.merge.w.i iVarE = e((AbstractC0640i) this.a.get(i));
        if (!iVarE.d(-2)) {
            return iVarE;
        }
        com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
        iVar.c(iVarE);
        iVar.h();
        while (yVar != null && yVar.b >= 0 && iVarE.d(-2)) {
            iVarE = e(((a0) ((AbstractC0640i) this.a.get(yVar.b)).d(0)).c);
            iVar.c(iVarE);
            iVar.h();
            yVar = yVar.a;
        }
        if (iVarE.d(-2)) {
            iVar.a(-1);
        }
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.r>] */
    public final int d() {
        return this.b.size();
    }

    public final com.github.catvod.spider.merge.w.i e(AbstractC0640i abstractC0640i) {
        com.github.catvod.spider.merge.w.i iVar = abstractC0640i.f;
        if (iVar != null) {
            return iVar;
        }
        com.github.catvod.spider.merge.w.i iVarF = f(abstractC0640i, null);
        abstractC0640i.f = iVarF;
        iVarF.i();
        return abstractC0640i.f;
    }

    public final com.github.catvod.spider.merge.w.i f(AbstractC0640i abstractC0640i, com.github.catvod.spider.merge.t.y yVar) {
        C0651u c0651u = new C0651u(this);
        com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
        c0651u.a(abstractC0640i, yVar != null ? S.a(abstractC0640i.a, yVar) : null, iVar, new HashSet(), new BitSet());
        return iVar;
    }
}
