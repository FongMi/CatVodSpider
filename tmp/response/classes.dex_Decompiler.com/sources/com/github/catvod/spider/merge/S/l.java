package com.github.catvod.spider.merge.S;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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
