package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class v implements w {
    public static final v a = new v();

    /* JADX WARN: Type inference failed for: r9v24, types: [T, java.math.BigDecimal] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String strJ = dVar.J();
                dVar.o(16);
                return (T) Double.valueOf(Double.parseDouble(strJ));
            }
            long jH = dVar.h();
            dVar.o(16);
            if (type == Short.TYPE || type == Short.class) {
                if (jH > 32767 || jH < -32768) {
                    throw new C1415d(u.c("short overflow : ", jH));
                }
                return (T) Short.valueOf((short) jH);
            }
            if (type != Byte.TYPE && type != Byte.class) {
                return (jH < -2147483648L || jH > 2147483647L) ? (T) Long.valueOf(jH) : (T) Integer.valueOf((int) jH);
            }
            if (jH > 127 || jH < -128) {
                throw new C1415d(u.c("short overflow : ", jH));
            }
            return (T) Byte.valueOf((byte) jH);
        }
        if (dVar.p() == 3) {
            if (type == Double.TYPE || type == Double.class) {
                String strJ2 = dVar.J();
                dVar.o(16);
                return (T) Double.valueOf(Double.parseDouble(strJ2));
            }
            if (type == Short.TYPE || type == Short.class) {
                BigDecimal bigDecimalS = dVar.s();
                dVar.o(16);
                return (T) Short.valueOf(com.github.catvod.spider.merge.H.A.t0(bigDecimalS));
            }
            if (type == Byte.TYPE || type == Byte.class) {
                BigDecimal bigDecimalS2 = dVar.s();
                dVar.o(16);
                return (T) Byte.valueOf(com.github.catvod.spider.merge.H.A.c(bigDecimalS2));
            }
            ?? r9 = (T) dVar.s();
            dVar.o(16);
            return dVar.l(com.github.catvod.spider.merge.B.c.UseBigDecimal) ? r9 : (T) Double.valueOf(r9.doubleValue());
        }
        if (dVar.p() == 18 && "NaN".equals(dVar.K())) {
            dVar.nextToken();
            if (type == Double.class) {
                return (T) Double.valueOf(Double.NaN);
            }
            if (type == Float.class) {
                return (T) Float.valueOf(Float.NaN);
            }
            return null;
        }
        Object objO = bVar.o(null);
        if (objO == null) {
            return null;
        }
        if (type == Double.TYPE || type == Double.class) {
            try {
                return (T) com.github.catvod.spider.merge.H.A.m(objO);
            } catch (Exception e) {
                throw new C1415d(com.github.catvod.spider.merge.A.c.d("parseDouble error, field : ", obj), e);
            }
        }
        if (type == Short.TYPE || type == Short.class) {
            try {
                return (T) com.github.catvod.spider.merge.H.A.r(objO);
            } catch (Exception e2) {
                throw new C1415d(com.github.catvod.spider.merge.A.c.d("parseShort error, field : ", obj), e2);
            }
        }
        if (type != Byte.TYPE && type != Byte.class) {
            return (T) com.github.catvod.spider.merge.H.A.g(objO);
        }
        try {
            return (T) com.github.catvod.spider.merge.H.A.j(objO);
        } catch (Exception e3) {
            throw new C1415d(com.github.catvod.spider.merge.A.c.d("parseByte error, field : ", obj), e3);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }
}
