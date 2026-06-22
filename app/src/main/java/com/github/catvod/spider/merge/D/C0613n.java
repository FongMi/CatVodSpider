package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0613n implements X, com.github.catvod.spider.merge.C.w {
    private static final BigInteger a = BigInteger.valueOf(-9007199254740991L);
    private static final BigInteger b = BigInteger.valueOf(9007199254740991L);
    public static final C0613n c = new C0613n();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() != 2) {
            Object objO = bVar.o(null);
            if (objO == null) {
                return null;
            }
            return (T) com.github.catvod.spider.merge.H.A.h(objO);
        }
        String strJ = dVar.J();
        dVar.o(16);
        if (strJ.length() <= 65535) {
            return (T) new BigInteger(strJ);
        }
        throw new C1415d("decimal overflow");
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullNumberAsZero);
            return;
        }
        BigInteger bigInteger = (BigInteger) obj;
        String string = bigInteger.toString();
        if (string.length() < 16 || !i0.a(i, h0Var.d, i0.BrowserCompatible) || (bigInteger.compareTo(a) >= 0 && bigInteger.compareTo(b) <= 0)) {
            h0Var.write(string);
        } else {
            h0Var.v(string);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }
}
