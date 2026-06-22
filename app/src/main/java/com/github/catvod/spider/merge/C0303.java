package com.github.catvod.spider.merge;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޑ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0303 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0304 m1174(C0304 c0304, BigInteger bigInteger) {
        BigInteger bigIntegerM1175 = m1175(c0304.f822, bigInteger);
        return new C0304(c0304.f820.multiply(bigIntegerM1175.pow(2)).mod(bigInteger), c0304.f821.multiply(bigIntegerM1175.pow(3)).mod(bigInteger), BigInteger.ZERO);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static BigInteger m1175(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger.compareTo(bigInteger3) == 0) {
            return bigInteger3;
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigInteger6 = bigInteger3;
        BigInteger bigInteger7 = bigInteger4;
        while (bigIntegerMod.compareTo(BigInteger.ONE) > 0) {
            BigInteger bigIntegerDivide = bigInteger5.divide(bigIntegerMod);
            BigInteger bigIntegerSubtract = bigInteger6.subtract(bigInteger7.multiply(bigIntegerDivide));
            BigInteger bigIntegerSubtract2 = bigInteger5.subtract(bigIntegerMod.multiply(bigIntegerDivide));
            bigInteger5 = bigIntegerMod;
            bigIntegerMod = bigIntegerSubtract2;
            bigInteger6 = bigInteger7;
            bigInteger7 = bigIntegerSubtract;
        }
        return bigInteger7.mod(bigInteger2);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0304 m1176(C0304 c0304, C0304 c03042, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = c0304.f821;
        if (bigInteger3 != null) {
            BigInteger bigInteger4 = BigInteger.ZERO;
            if (!bigInteger3.equals(bigInteger4)) {
                BigInteger bigInteger5 = c03042.f821;
                if (bigInteger5 == null || bigInteger5.equals(bigInteger4)) {
                    return c0304;
                }
                BigInteger bigIntegerMod = c0304.f820.multiply(c03042.f822.pow(2)).mod(bigInteger2);
                BigInteger bigIntegerMod2 = c03042.f820.multiply(c0304.f822.pow(2)).mod(bigInteger2);
                BigInteger bigIntegerMod3 = c0304.f821.multiply(c03042.f822.pow(3)).mod(bigInteger2);
                BigInteger bigIntegerMod4 = c03042.f821.multiply(c0304.f822.pow(3)).mod(bigInteger2);
                if (bigIntegerMod.compareTo(bigIntegerMod2) == 0) {
                    return bigIntegerMod3.compareTo(bigIntegerMod4) != 0 ? new C0304(bigInteger4, bigInteger4, BigInteger.ONE) : m1177(c0304, bigInteger, bigInteger2);
                }
                BigInteger bigIntegerSubtract = bigIntegerMod2.subtract(bigIntegerMod);
                BigInteger bigIntegerSubtract2 = bigIntegerMod4.subtract(bigIntegerMod3);
                BigInteger bigIntegerMod5 = bigIntegerSubtract.multiply(bigIntegerSubtract).mod(bigInteger2);
                BigInteger bigIntegerMod6 = bigIntegerSubtract.multiply(bigIntegerMod5).mod(bigInteger2);
                BigInteger bigIntegerMod7 = bigIntegerMod.multiply(bigIntegerMod5).mod(bigInteger2);
                BigInteger bigIntegerMod8 = bigIntegerSubtract2.pow(2).subtract(bigIntegerMod6).subtract(BigInteger.valueOf(2L).multiply(bigIntegerMod7)).mod(bigInteger2);
                return new C0304(bigIntegerMod8, bigIntegerSubtract2.multiply(bigIntegerMod7.subtract(bigIntegerMod8)).subtract(bigIntegerMod3.multiply(bigIntegerMod6)).mod(bigInteger2), bigIntegerSubtract.multiply(c0304.f822).multiply(c03042.f822).mod(bigInteger2));
            }
        }
        return c03042;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static C0304 m1177(C0304 c0304, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = c0304.f821;
        if (bigInteger3 == null || bigInteger3.equals(BigInteger.ZERO)) {
            BigInteger bigInteger4 = BigInteger.ZERO;
            return new C0304(bigInteger4, bigInteger4, bigInteger4);
        }
        BigInteger bigIntegerMod = c0304.f821.pow(2).mod(bigInteger2);
        BigInteger bigIntegerMod2 = BigInteger.valueOf(4L).multiply(c0304.f820).multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(3L).multiply(c0304.f820.pow(2)).add(bigInteger.multiply(c0304.f822.pow(4))).mod(bigInteger2);
        BigInteger bigIntegerMod4 = bigIntegerMod3.pow(2).subtract(BigInteger.valueOf(2L).multiply(bigIntegerMod2)).mod(bigInteger2);
        return new C0304(bigIntegerMod4, bigIntegerMod3.multiply(bigIntegerMod2.subtract(bigIntegerMod4)).subtract(BigInteger.valueOf(8L).multiply(bigIntegerMod.pow(2))).mod(bigInteger2), BigInteger.valueOf(2L).multiply(c0304.f821).multiply(c0304.f822).mod(bigInteger2));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static C0304 m1178(C0304 c0304, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger bigInteger5 = BigInteger.ZERO;
        if (bigInteger5.compareTo(c0304.f821) == 0 || bigInteger5.compareTo(bigInteger) == 0) {
            return new C0304(bigInteger5, bigInteger5, BigInteger.ONE);
        }
        BigInteger bigInteger6 = BigInteger.ONE;
        if (bigInteger6.compareTo(bigInteger) == 0) {
            return c0304;
        }
        if (bigInteger.compareTo(bigInteger5) < 0 || bigInteger.compareTo(bigInteger2) >= 0) {
            return m1178(c0304, bigInteger.mod(bigInteger2), bigInteger2, bigInteger3, bigInteger4);
        }
        if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger5) == 0) {
            return m1177(m1178(c0304, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4);
        }
        if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger6) == 0) {
            return m1176(m1177(m1178(c0304, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4), c0304, bigInteger3, bigInteger4);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static C0304 m1179(C0304 c0304, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return m1174(m1178(m1180(c0304), bigInteger, bigInteger2, bigInteger3, bigInteger4), bigInteger4);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static C0304 m1180(C0304 c0304) {
        return new C0304(c0304.f820, c0304.f821, BigInteger.ONE);
    }
}
