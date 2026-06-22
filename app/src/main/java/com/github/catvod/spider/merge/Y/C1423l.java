package com.github.catvod.spider.merge.y;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1423l implements G {
    public static final C1423l a = new C1423l();

    C1423l() {
    }

    private static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            return Double.valueOf(Math.floor(((Float) obj).floatValue()));
        }
        if (obj instanceof Double) {
            return Double.valueOf(Math.floor(((Double) obj).doubleValue()));
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).setScale(0, RoundingMode.FLOOR);
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger)) {
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        if (!(obj2 instanceof C1413b)) {
            return b(obj2);
        }
        C1413b c1413b = (C1413b) ((C1413b) obj2).clone();
        for (int i = 0; i < c1413b.size(); i++) {
            Object obj3 = c1413b.get(i);
            Object objB = b(obj3);
            if (objB != obj3) {
                c1413b.set(i, objB);
            }
        }
        return c1413b;
    }
}
