package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0000a {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public V[] c;
    public W[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0023y[] h;
    public final ArrayList i;

    public C0000a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    public final r a(int i) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (r) arrayList.get(i);
    }

    public final com.github.catvod.spider.merge.C.f b(int i, com.github.catvod.spider.merge.z.r rVar) throws Throwable {
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                com.github.catvod.spider.merge.C.f fVarC = c((AbstractC0008i) arrayList.get(i));
                if (!fVarC.d(-2)) {
                    return fVarC;
                }
                com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
                fVar.c(fVarC);
                fVar.f();
                while (rVar != null) {
                    int i2 = rVar.b;
                    if (i2 < 0 || !fVarC.d(-2)) {
                        break;
                    }
                    fVarC = c(((X) ((AbstractC0008i) arrayList.get(i2)).c(0)).c);
                    fVar.c(fVarC);
                    fVar.f();
                    rVar = rVar.a;
                }
                if (fVarC.d(-2)) {
                    fVar.a(-1);
                }
                return fVar;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }

    public final com.github.catvod.spider.merge.C.f c(AbstractC0008i abstractC0008i) throws Throwable {
        com.github.catvod.spider.merge.C.f fVar = abstractC0008i.f;
        if (fVar != null) {
            return fVar;
        }
        com.github.catvod.spider.merge.C.f fVarD = d(abstractC0008i, null);
        abstractC0008i.f = fVarD;
        fVarD.b = true;
        return fVarD;
    }

    public final com.github.catvod.spider.merge.C.f d(AbstractC0008i abstractC0008i, com.github.catvod.spider.merge.z.r rVar) throws Throwable {
        C0019u c0019u = new C0019u(this);
        com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
        c0019u.c(abstractC0008i, rVar != null ? Q.a(abstractC0008i.a, rVar) : null, fVar, new HashSet(), new BitSet());
        return fVar;
    }
}
