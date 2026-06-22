package com.github.catvod.spider.merge;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ސ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0302 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0307 m1172(String str, C0305 c0305) {
        try {
            return m1173(str, c0305, MessageDigest.getInstance(SOY.d("291A105B46424C")));
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException(SOY.d("393D241A1057143D2556121E143671253C3657606440541A1F21221713125A36381111040E7238185407083D271F10121E723B1702165A373F001D05153C3C131A03"));
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0307 m1173(String str, C0305 c0305, MessageDigest messageDigest) {
        BigInteger bigIntegerM1187 = C0308.m1187(messageDigest.digest(str.getBytes()));
        C0301 c0301 = c0305.f823;
        BigInteger bigIntegerM1198 = C0311.m1198(BigInteger.ONE, c0301.f816);
        BigInteger bigIntegerMod = C0303.m1179(c0301.f817, bigIntegerM1198, c0301.f816, c0301.f813, c0301.f815).f820.mod(c0301.f816);
        return new C0307(bigIntegerMod, bigIntegerM1187.add(bigIntegerMod.multiply(c0305.f824)).multiply(C0303.m1175(bigIntegerM1198, c0301.f816)).mod(c0301.f816));
    }
}
