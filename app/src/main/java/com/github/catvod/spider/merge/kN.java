package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class kN {
    public static byte[] S(String str) {
        return l8(str, S.l);
    }

    private static byte[] l8(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }
}
