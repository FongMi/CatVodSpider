package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* renamed from: com.github.catvod.spider.merge.b */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0110b extends C0100Vm {
    /* renamed from: xC */
    public static String m551xC(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return charset == null ? new String(bArr) : new String(bArr, charset);
    }
}
