package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* renamed from: com.github.catvod.spider.merge.Vm */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0100Vm {
    /* renamed from: q */
    public static byte[] m470q(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        return charset == null ? charSequence.toString().getBytes() : charSequence.toString().getBytes(charset);
    }
}
