package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class i {
    public static byte[] l8(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        return charset == null ? charSequence.toString().getBytes() : charSequence.toString().getBytes(charset);
    }
}
