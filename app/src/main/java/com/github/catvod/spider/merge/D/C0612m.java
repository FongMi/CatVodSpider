package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0612m implements X, com.github.catvod.spider.merge.C.w {
    static final BigDecimal a = BigDecimal.valueOf(-9007199254740991L);
    static final BigDecimal b = BigDecimal.valueOf(9007199254740991L);
    public static final C0612m c = new C0612m();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        try {
            com.github.catvod.spider.merge.B.d dVar = bVar.g;
            if (dVar.p() != 2 && dVar.p() != 3) {
                Object objO = bVar.o(null);
                if (objO == null) {
                    return null;
                }
                return (T) com.github.catvod.spider.merge.H.A.g(objO);
            }
            T t = (T) dVar.s();
            dVar.o(16);
            return t;
        } catch (Exception e) {
            throw new C1415d(com.github.catvod.spider.merge.A.c.d("parseDecimal error, field : ", obj), e);
        }
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullNumberAsZero);
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        int iScale = bigDecimal.scale();
        String string = (!i0.a(i, h0Var.d, i0.WriteBigDecimalAsPlain) || iScale < -100 || iScale >= 100) ? bigDecimal.toString() : bigDecimal.toPlainString();
        if (iScale == 0 && string.length() >= 16 && i0.a(i, h0Var.d, i0.BrowserCompatible) && (bigDecimal.compareTo(a) < 0 || bigDecimal.compareTo(b) > 0)) {
            h0Var.v(string);
            return;
        }
        h0Var.write(string);
        if (h0Var.g(i0.WriteClassName) && type != BigDecimal.class && bigDecimal.scale() == 0) {
            h0Var.write(46);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }
}
