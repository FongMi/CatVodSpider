package com.github.catvod.spider.merge;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޙ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0311 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static BigInteger m1198(BigInteger bigInteger, BigInteger bigInteger2) {
        return new BigInteger((bigInteger2.toByteArray().length * 8) - 1, new SecureRandom()).abs().add(bigInteger);
    }
}
