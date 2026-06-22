package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class b extends i {
    public static String S(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return charset == null ? new String(bArr) : new String(bArr, charset);
    }
}
