package com.github.catvod.spider.merge.FM.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m extends b {
    private int a;
    private com.github.catvod.spider.merge.FM.R.l b;
    private boolean c;
    private short d;
    private int e;
    private int[] f;
    private int g;
    private int h;
    private b i;

    public m(com.github.catvod.spider.merge.FM.R.l lVar) {
        this.b = lVar;
        this.c = false;
        this.i = null;
        this.f = new int[4];
        h();
    }

    public m(com.github.catvod.spider.merge.FM.R.l lVar, boolean z, b bVar) {
        this.b = lVar;
        this.c = z;
        this.i = bVar;
        this.f = new int[4];
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        b bVar = this.i;
        return bVar == null ? this.b.a() : bVar.c();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        int i = this.e;
        if (i <= 0) {
            return 0.01f;
        }
        float fD = ((((this.f[3] * 1.0f) / i) / this.b.d()) * this.h) / this.g;
        if (fD >= 1.0f) {
            return 0.99f;
        }
        return fD;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        int i2;
        int i3 = i + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            short sB = this.b.b(bArr[i4]);
            if (sB < 250) {
                this.g++;
            }
            if (sB < 64) {
                this.h++;
                short s = this.d;
                if (s < 64) {
                    this.e++;
                    if (this.c) {
                        int[] iArr = this.f;
                        byte bC = this.b.c((sB * 64) + s);
                        iArr[bC] = iArr[bC] + 1;
                    } else {
                        int[] iArr2 = this.f;
                        byte bC2 = this.b.c((s * 64) + sB);
                        iArr2[bC2] = iArr2[bC2] + 1;
                    }
                }
            }
            this.d = sB;
        }
        if (this.a == 1 && this.e > 1024) {
            float fD = d();
            if (fD <= 0.95f) {
                i2 = fD < 0.05f ? 3 : 2;
            }
            this.a = i2;
        }
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        this.a = 1;
        this.d = (short) 255;
        for (int i = 0; i < 4; i++) {
            this.f[i] = 0;
        }
        this.e = 0;
        this.g = 0;
        this.h = 0;
    }
}
