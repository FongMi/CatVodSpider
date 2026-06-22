package com.github.catvod.spider.merge.F0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    public static final a f;
    public static final ArrayList g;
    public static final HashMap h;
    public BigInteger a = BigInteger.ZERO;
    public BigInteger b;
    public BigInteger c;
    public b d;
    public long[] e;

    static {
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger.valueOf(7L);
        a aVar = new a(new BigInteger("fffffffffffffffffffffffffffffffffffffffffffffffffffffffefffffc2f", 16), new BigInteger("fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141", 16), new BigInteger("79be667ef9dcbbac55a06295ce870b07029bfcdb2dce28d959f2815b16f81798", 16), new BigInteger("483ada7726a3c4655da4fbfc0e1108a8fd17b448a68554199c47d08ffb10d4b8", 16), new long[]{1, 3, 132, 0, 10});
        f = aVar;
        ArrayList<a> arrayList = new ArrayList();
        g = arrayList;
        h = new HashMap();
        arrayList.add(aVar);
        for (a aVar2 : arrayList) {
            h.put(Integer.valueOf(Arrays.hashCode(aVar2.e)), aVar2);
        }
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, long[] jArr) {
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = new b(bigInteger3, bigInteger4);
        this.e = jArr;
    }
}
