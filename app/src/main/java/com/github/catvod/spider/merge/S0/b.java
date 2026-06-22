package com.github.catvod.spider.merge.S0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class b {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected a d;

    protected b() {
    }

    public final int a() {
        return this.d.c();
    }

    public final void b() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                this.b = 0;
                this.d.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }
}
