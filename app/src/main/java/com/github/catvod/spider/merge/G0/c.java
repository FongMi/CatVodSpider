package com.github.catvod.spider.merge.G0;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    public static BigInteger a(BigInteger bigInteger) {
        return new BigInteger((bigInteger.toByteArray().length * 8) - 1, new SecureRandom()).abs().add(BigInteger.ONE);
    }
}
