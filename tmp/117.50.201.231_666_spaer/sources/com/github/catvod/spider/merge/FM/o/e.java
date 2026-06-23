package com.github.catvod.spider.merge.FM.O;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e extends b {
    private static final com.github.catvod.spider.merge.FM.S.e e = new com.github.catvod.spider.merge.FM.S.e();
    private int b;
    private com.github.catvod.spider.merge.FM.S.b a = new com.github.catvod.spider.merge.FM.S.b(e);
    private com.github.catvod.spider.merge.FM.Q.e c = new com.github.catvod.spider.merge.FM.Q.e();
    private byte[] d = new byte[2];

    public e() {
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        return com.github.catvod.spider.merge.FM.N.a.k;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        return this.c.a();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        int i2 = i + 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int iC = this.a.c(bArr[i3]);
            if (iC == 1) {
                this.b = 3;
                break;
            }
            if (iC == 2) {
                this.b = 2;
                break;
            }
            if (iC == 0) {
                int iB = this.a.b();
                if (i3 == 0) {
                    byte[] bArr2 = this.d;
                    bArr2[1] = bArr[0];
                    this.c.d(bArr2, 0, iB);
                } else {
                    this.c.d(bArr, i3 - 1, iB);
                }
            }
            i3++;
        }
        this.d[0] = bArr[i2 - 1];
        if (this.b == 1 && this.c.c() && d() > 0.95f) {
            this.b = 2;
        }
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        this.a.d();
        this.b = 1;
        this.c.e();
        Arrays.fill(this.d, (byte) 0);
    }
}
