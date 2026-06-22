package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S implements X, com.github.catvod.spider.merge.C.w {
    public static S a = new S();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Object objQ;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        try {
            int iP = dVar.p();
            if (iP == 2) {
                long jH = dVar.h();
                dVar.o(16);
                objQ = (T) Long.valueOf(jH);
            } else if (iP == 3) {
                objQ = (T) Long.valueOf(com.github.catvod.spider.merge.H.A.o0(dVar.s()));
                dVar.o(16);
            } else {
                if (iP == 12) {
                    C1416e c1416e = new C1416e(true);
                    bVar.u(c1416e);
                    objQ = (T) com.github.catvod.spider.merge.H.A.q(c1416e);
                } else {
                    objQ = com.github.catvod.spider.merge.H.A.q(bVar.o(null));
                }
                if (objQ == null) {
                    return null;
                }
            }
            return type == AtomicLong.class ? (T) new AtomicLong(((Long) objQ).longValue()) : (T) objQ;
        } catch (Exception e) {
            throw new C1415d(com.github.catvod.spider.merge.A.c.d("parseLong error, field : ", obj), e);
        }
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullNumberAsZero);
            return;
        }
        long jLongValue = ((Long) obj).longValue();
        h0Var.r(jLongValue);
        if (!h0Var.g(i0.WriteClassName) || jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class || type == Long.TYPE) {
            return;
        }
        h0Var.write(76);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }
}
