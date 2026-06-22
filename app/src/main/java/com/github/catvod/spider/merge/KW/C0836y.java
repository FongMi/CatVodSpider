package com.github.catvod.spider.merge.KW;

import java.util.BitSet;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0836y {
    public final C0813a a;

    public C0836y(C0813a c0813a) {
        this.a = c0813a;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    protected final void a(AbstractC0825m abstractC0825m, X x, com.github.catvod.spider.merge.Bk.k kVar, Set set, BitSet bitSet) {
        if (set.add(new C0814b(abstractC0825m, 0, x, l0.a))) {
            if (abstractC0825m == null) {
                if (x == null) {
                    kVar.a(-2);
                    return;
                } else if (x.f()) {
                    kVar.a(-1);
                    return;
                }
            }
            if (abstractC0825m instanceof e0) {
                if (x == null) {
                    kVar.a(-2);
                    return;
                }
                if (x.f()) {
                    kVar.a(-1);
                    return;
                }
                if (x != X.b) {
                    boolean z = bitSet.get(abstractC0825m.c);
                    try {
                        bitSet.clear(abstractC0825m.c);
                        for (int i = 0; i < x.h(); i++) {
                            a((AbstractC0825m) this.a.a.get(x.d(i)), x.c(i), kVar, set, bitSet);
                        }
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z) {
                            bitSet.set(abstractC0825m.c);
                        }
                    }
                }
            }
            int iB = abstractC0825m.b();
            for (int i2 = 0; i2 < iB; i2++) {
                t0 t0VarD = abstractC0825m.d(i2);
                if (t0VarD.getClass() == f0.class) {
                    f0 f0Var = (f0) t0VarD;
                    if (bitSet.get(f0Var.a.c)) {
                        continue;
                    } else {
                        n0 n0VarI = n0.i(x, f0Var.c.b);
                        try {
                            bitSet.set(((f0) t0VarD).a.c);
                            a(t0VarD.a, n0VarI, kVar, set, bitSet);
                        } finally {
                            bitSet.clear(f0Var.a.c);
                        }
                    }
                } else if ((t0VarD instanceof AbstractC0826n) || t0VarD.b()) {
                    a(t0VarD.a, x, kVar, set, bitSet);
                } else if (t0VarD.getClass() == u0.class) {
                    kVar.c(com.github.catvod.spider.merge.Bk.k.g(1, this.a.f));
                } else {
                    com.github.catvod.spider.merge.Bk.k kVarC = t0VarD.c();
                    if (kVarC != null) {
                        if (t0VarD instanceof P) {
                            com.github.catvod.spider.merge.Bk.k kVarG = com.github.catvod.spider.merge.Bk.k.g(1, this.a.f);
                            if (kVarG.f()) {
                                kVarC = null;
                            } else if (kVarC.f()) {
                                kVarC = new com.github.catvod.spider.merge.Bk.k(new int[0]);
                                kVarC.c(kVarG);
                            } else {
                                kVarC = com.github.catvod.spider.merge.Bk.k.k(kVarG, kVarC);
                            }
                        }
                        kVar.c(kVarC);
                    }
                }
            }
        }
    }
}
