package com.github.catvod.spider.merge.W0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b implements com.github.catvod.spider.merge.S0.c {
    private byte[] a;
    private com.github.catvod.spider.merge.S0.c b;

    public b(com.github.catvod.spider.merge.S0.c cVar, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.a = bArr2;
        this.b = cVar;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public final byte[] a() {
        return this.a;
    }

    public final com.github.catvod.spider.merge.S0.c b() {
        return this.b;
    }
}
