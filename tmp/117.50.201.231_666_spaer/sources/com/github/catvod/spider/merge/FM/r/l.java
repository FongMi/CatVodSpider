package com.github.catvod.spider.merge.FM.R;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class l {
    protected short[] a;
    protected byte[] b;
    protected float c;
    protected String d;

    public l(short[] sArr, byte[] bArr, float f, String str) {
        this.a = sArr;
        this.b = bArr;
        this.c = f;
        this.d = str;
    }

    public final String a() {
        return this.d;
    }

    public final short b(byte b) {
        return this.a[b & 255];
    }

    public final byte c(int i) {
        return this.b[i];
    }

    public final float d() {
        return this.c;
    }
}
