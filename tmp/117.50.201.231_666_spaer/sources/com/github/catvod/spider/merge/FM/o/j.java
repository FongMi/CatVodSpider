package com.github.catvod.spider.merge.FM.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j extends b {
    private int a;
    private b[] b;
    private boolean[] c = new boolean[7];
    private int d;
    private int e;

    public j() {
        b[] bVarArr = new b[7];
        this.b = bVarArr;
        bVarArr[0] = new n();
        this.b[1] = new l();
        this.b[2] = new c();
        this.b[3] = new g();
        this.b[4] = new d();
        this.b[5] = new a();
        this.b[6] = new e();
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        if (this.d == -1) {
            d();
            if (this.d == -1) {
                this.d = 0;
            }
        }
        return this.b[this.d].c();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        int i = this.a;
        if (i == 2) {
            return 0.99f;
        }
        if (i == 3) {
            return 0.01f;
        }
        int i2 = 0;
        float f = 0.0f;
        while (true) {
            b[] bVarArr = this.b;
            if (i2 >= bVarArr.length) {
                return f;
            }
            if (this.c[i2]) {
                float fD = bVarArr[i2].d();
                if (f < fD) {
                    this.d = i2;
                    f = fD;
                }
            }
            i2++;
        }
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        int i2;
        byte[] bArr2 = new byte[i];
        int i3 = i + 0;
        boolean z = true;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if ((bArr[i5] & 128) != 0) {
                bArr2[i4] = bArr[i5];
                i4++;
                z = true;
            } else if (z) {
                bArr2[i4] = bArr[i5];
                i4++;
                z = false;
            }
        }
        int i6 = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i6 >= bVarArr.length) {
                break;
            }
            if (this.c[i6]) {
                int iF = bVarArr[i6].f(bArr2, i4);
                i2 = 2;
                if (iF == 2) {
                    this.d = i6;
                    break;
                }
                i2 = 3;
                if (iF == 3) {
                    this.c[i6] = false;
                    int i7 = this.e - 1;
                    this.e = i7;
                    if (i7 <= 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i6++;
        }
        this.a = i2;
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        int i = 0;
        this.e = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i >= bVarArr.length) {
                this.d = -1;
                this.a = 1;
                return;
            } else {
                bVarArr[i].h();
                this.c[i] = true;
                this.e++;
                i++;
            }
        }
    }
}
