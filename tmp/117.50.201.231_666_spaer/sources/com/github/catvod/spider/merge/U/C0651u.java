package com.github.catvod.spider.merge.u;

import java.util.BitSet;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0651u {
    public final C0632a a;

    public C0651u(C0632a c0632a) {
        this.a = c0632a;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    protected final void a(AbstractC0640i abstractC0640i, S s, com.github.catvod.spider.merge.w.i iVar, Set set, BitSet bitSet) {
        if (set.add(new C0633b(abstractC0640i, 0, s, b0.a))) {
            if (abstractC0640i == null) {
                if (s == null) {
                    iVar.a(-2);
                    return;
                } else if (s.f()) {
                    iVar.a(-1);
                    return;
                }
            }
            if (abstractC0640i instanceof Z) {
                if (s == null) {
                    iVar.a(-2);
                    return;
                }
                if (s.f()) {
                    iVar.a(-1);
                    return;
                }
                if (s != S.b) {
                    boolean z = bitSet.get(abstractC0640i.c);
                    try {
                        bitSet.clear(abstractC0640i.c);
                        for (int i = 0; i < s.h(); i++) {
                            a((AbstractC0640i) this.a.a.get(s.d(i)), s.c(i), iVar, set, bitSet);
                        }
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z) {
                            bitSet.set(abstractC0640i.c);
                        }
                    }
                }
            }
            int iB = abstractC0640i.b();
            for (int i2 = 0; i2 < iB; i2++) {
                i0 i0VarD = abstractC0640i.d(i2);
                if (i0VarD.getClass() == a0.class) {
                    a0 a0Var = (a0) i0VarD;
                    if (bitSet.get(a0Var.a.c)) {
                        continue;
                    } else {
                        d0 d0VarI = d0.i(s, a0Var.c.b);
                        try {
                            bitSet.set(((a0) i0VarD).a.c);
                            a(i0VarD.a, d0VarI, iVar, set, bitSet);
                        } finally {
                            bitSet.clear(a0Var.a.c);
                        }
                    }
                } else if ((i0VarD instanceof AbstractC0641j) || i0VarD.b()) {
                    a(i0VarD.a, s, iVar, set, bitSet);
                } else if (i0VarD.getClass() == j0.class) {
                    iVar.c(com.github.catvod.spider.merge.w.i.g(1, this.a.f));
                } else {
                    com.github.catvod.spider.merge.w.i iVarC = i0VarD.c();
                    if (iVarC != null) {
                        if (i0VarD instanceof K) {
                            com.github.catvod.spider.merge.w.i iVarG = com.github.catvod.spider.merge.w.i.g(1, this.a.f);
                            if (iVarG.f()) {
                                iVarC = null;
                            } else if (iVarC.f()) {
                                iVarC = new com.github.catvod.spider.merge.w.i(new int[0]);
                                iVarC.c(iVarG);
                            } else {
                                iVarC = com.github.catvod.spider.merge.w.i.k(iVarG, iVarC);
                            }
                        }
                        iVar.c(iVarC);
                    }
                }
            }
        }
    }
}
