package com.github.catvod.spider.merge.FM.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class n extends b {
    private static final com.github.catvod.spider.merge.FM.S.n d = new com.github.catvod.spider.merge.FM.S.n();
    private int b;
    private int c = 0;
    private com.github.catvod.spider.merge.FM.S.b a = new com.github.catvod.spider.merge.FM.S.b(d);

    public n() {
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        return com.github.catvod.spider.merge.FM.N.a.u;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        float f = 0.99f;
        if (this.c >= 6) {
            return 0.99f;
        }
        for (int i = 0; i < this.c; i++) {
            f *= 0.5f;
        }
        return 1.0f - f;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = i + 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iC = this.a.c(bArr[i2]);
            if (iC == 1) {
                this.b = 3;
                break;
            }
            if (iC == 2) {
                this.b = 2;
                break;
            }
            if (iC == 0 && this.a.b() >= 2) {
                this.c++;
            }
            i2++;
        }
        if (this.b == 1 && d() > 0.95f) {
            this.b = 2;
        }
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        this.a.d();
        this.c = 0;
        this.b = 1;
    }
}
