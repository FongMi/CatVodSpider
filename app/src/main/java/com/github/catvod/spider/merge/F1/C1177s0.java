package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1177s0 extends s2 {
    C1177s0(s2 s2Var) {
        super(s2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    public final Object e(n2 n2Var) {
        Object obj = this.e;
        if (!(obj instanceof C1174r0)) {
            return obj;
        }
        C1174r0 c1174r0 = (C1174r0) obj;
        try {
            c1174r0.d();
            return c1174r0.c();
        } finally {
            this.e = c1174r0.c();
        }
    }
}
