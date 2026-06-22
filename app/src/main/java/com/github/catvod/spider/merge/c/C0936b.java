package com.github.catvod.spider.merge.c;

import android.os.Bundle;
import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.I.z0;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.g.C1201a;
import java.math.BigInteger;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0936b {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C0936b.class.getClassLoader());
        }
    }

    public static z0 b(String str, c cVar, MessageDigest messageDigest) {
        BigInteger bigInteger = new BigInteger(l.d(messageDigest.digest(str.getBytes())), 16);
        com.github.catvod.spider.merge.F0.a aVar = cVar.a;
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerA = com.github.catvod.spider.merge.G0.c.a(aVar.c);
        BigInteger bigIntegerMod = C1201a.g(aVar.d, bigIntegerA, aVar.c, aVar.a, aVar.b).a.mod(aVar.c);
        return new z0(bigIntegerMod, bigInteger.add(bigIntegerMod.multiply(cVar.b)).multiply(C1201a.b(bigIntegerA, aVar.c)).mod(aVar.c));
    }
}
