package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j0 implements X, com.github.catvod.spider.merge.C.w {
    public static j0 a = new j0();

    public static <T> T f(com.github.catvod.spider.merge.B.b bVar) {
        T t;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 4) {
            t = (T) dVar.K();
        } else {
            if (dVar.p() != 2) {
                Object objO = bVar.o(null);
                if (objO == null) {
                    return null;
                }
                return (T) objO.toString();
            }
            t = (T) dVar.J();
        }
        dVar.o(16);
        return t;
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        if (type == StringBuffer.class) {
            com.github.catvod.spider.merge.B.d dVar = bVar.g;
            if (dVar.p() == 4) {
                String strK = dVar.K();
                dVar.o(16);
                return (T) new StringBuffer(strK);
            }
            Object objO = bVar.o(null);
            if (objO == null) {
                return null;
            }
            return (T) new StringBuffer(objO.toString());
        }
        if (type != StringBuilder.class) {
            return (T) f(bVar);
        }
        com.github.catvod.spider.merge.B.d dVar2 = bVar.g;
        if (dVar2.p() == 4) {
            String strK2 = dVar2.K();
            dVar2.o(16);
            return (T) new StringBuilder(strK2);
        }
        Object objO2 = bVar.o(null);
        if (objO2 == null) {
            return null;
        }
        return (T) new StringBuilder(objO2.toString());
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        String str = (String) obj;
        h0 h0Var = l.j;
        if (str == null) {
            h0Var.u(i0.WriteNullStringAsEmpty);
        } else {
            h0Var.v(str);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }
}
