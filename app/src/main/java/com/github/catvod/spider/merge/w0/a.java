package com.github.catvod.spider.merge.W0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements com.github.catvod.spider.merge.S0.c {
    private byte[] a;

    public a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public final byte[] a() {
        return this.a;
    }
}
