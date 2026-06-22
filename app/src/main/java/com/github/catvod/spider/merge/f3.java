package com.github.catvod.spider.merge;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class f3 {
    public static String OL(String str) {
        return xy.b(T4(str));
    }

    public static MessageDigest S() {
        return l8("SHA-256");
    }

    public static byte[] T4(String str) {
        return b(kN.S(str));
    }

    public static byte[] b(byte[] bArr) {
        return S().digest(bArr);
    }

    public static MessageDigest l8(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
