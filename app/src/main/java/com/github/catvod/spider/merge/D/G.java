package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G implements X, com.github.catvod.spider.merge.C.w {
    public static G a = new G();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Object obj2;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int iP = dVar.p();
        if (iP == 8) {
            dVar.o(16);
            return null;
        }
        try {
            if (iP == 2) {
                int iC = dVar.c();
                dVar.o(16);
                obj2 = (T) Integer.valueOf(iC);
            } else if (iP == 3) {
                obj2 = (T) Integer.valueOf(com.github.catvod.spider.merge.H.A.Y(dVar.s()));
                dVar.o(16);
            } else if (iP == 12) {
                C1416e c1416e = new C1416e(true);
                bVar.u(c1416e);
                obj2 = (T) com.github.catvod.spider.merge.H.A.o(c1416e);
            } else {
                obj2 = (T) com.github.catvod.spider.merge.H.A.o(bVar.o(null));
            }
            obj = AtomicInteger.class;
            return type == obj ? (T) new AtomicInteger(((Integer) obj2).intValue()) : (T) obj2;
        } catch (Exception e) {
            String str = "parseInt error";
            if (obj != null) {
                str = "parseInt error, field : " + obj;
            }
            throw new C1415d(str, e);
        }
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        int i2;
        h0 h0Var = l.j;
        Number number = (Number) obj;
        if (number == null) {
            h0Var.u(i0.WriteNullNumberAsZero);
            return;
        }
        if (obj instanceof Long) {
            h0Var.r(number.longValue());
        } else {
            h0Var.q(number.intValue());
        }
        if (h0Var.g(i0.WriteClassName)) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                i2 = 66;
            } else if (cls != Short.class) {
                return;
            } else {
                i2 = 83;
            }
            h0Var.write(i2);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }
}
