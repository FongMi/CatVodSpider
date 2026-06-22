package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.S.o;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k extends b {
    private static final com.github.catvod.spider.merge.S.n f = new com.github.catvod.spider.merge.S.n();
    private static final com.github.catvod.spider.merge.S.g g = new com.github.catvod.spider.merge.S.g();
    private static final com.github.catvod.spider.merge.S.i h = new com.github.catvod.spider.merge.S.i();
    private static final com.github.catvod.spider.merge.S.k i = new com.github.catvod.spider.merge.S.k();
    private static final com.github.catvod.spider.merge.S.f j = new com.github.catvod.spider.merge.S.f();
    private static final com.github.catvod.spider.merge.S.e k = new com.github.catvod.spider.merge.S.e();
    private static final com.github.catvod.spider.merge.S.j l = new com.github.catvod.spider.merge.S.j();
    private static final o m = new o();
    private static final com.github.catvod.spider.merge.S.h n = new com.github.catvod.spider.merge.S.h();
    private static final com.github.catvod.spider.merge.S.m o = new com.github.catvod.spider.merge.S.m();
    private static final com.github.catvod.spider.merge.S.d p = new com.github.catvod.spider.merge.S.d();
    private int a;
    private b[] b;
    private boolean[] c = new boolean[13];
    private int d;
    private int e;

    public k() {
        b[] bVarArr = new b[13];
        this.b = bVarArr;
        bVarArr[0] = new m(f);
        this.b[1] = new m(g);
        this.b[2] = new m(h);
        this.b[3] = new m(i);
        this.b[4] = new m(j);
        this.b[5] = new m(k);
        this.b[6] = new m(l);
        this.b[7] = new m(m);
        this.b[8] = new m(n);
        this.b[9] = new m(o);
        h hVar = new h();
        b[] bVarArr2 = this.b;
        bVarArr2[10] = hVar;
        com.github.catvod.spider.merge.S.d dVar = p;
        bVarArr2[11] = new m(dVar, false, hVar);
        this.b[12] = new m(dVar, true, hVar);
        b[] bVarArr3 = this.b;
        hVar.j(bVarArr3[11], bVarArr3[12]);
        h();
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final String c() {
        if (this.d == -1) {
            d();
            if (this.d == -1) {
                this.d = 0;
            }
        }
        return this.b[this.d].c();
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final float d() {
        int i2 = this.a;
        if (i2 == 2) {
            return 0.99f;
        }
        if (i2 == 3) {
            return 0.01f;
        }
        int i3 = 0;
        float f2 = 0.0f;
        while (true) {
            b[] bVarArr = this.b;
            if (i3 >= bVarArr.length) {
                return f2;
            }
            if (this.c[i3]) {
                float fD = bVarArr[i3].d();
                if (f2 < fD) {
                    this.d = i3;
                    f2 = fD;
                }
            }
            i3++;
        }
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final int e() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final int f(byte[] bArr, int i2) {
        int i3;
        ByteBuffer byteBufferB = b(bArr, i2);
        if (byteBufferB.position() != 0) {
            int i4 = 0;
            while (true) {
                b[] bVarArr = this.b;
                if (i4 >= bVarArr.length) {
                    break;
                }
                if (this.c[i4]) {
                    int iF = bVarArr[i4].f(byteBufferB.array(), byteBufferB.position());
                    i3 = 2;
                    if (iF == 2) {
                        this.d = i4;
                        break;
                    }
                    i3 = 3;
                    if (iF == 3) {
                        this.c[i4] = false;
                        int i5 = this.e - 1;
                        this.e = i5;
                        if (i5 <= 0) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
            this.a = i3;
        }
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final void h() {
        int i2 = 0;
        this.e = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i2 >= bVarArr.length) {
                this.d = -1;
                this.a = 1;
                return;
            } else {
                bVarArr[i2].h();
                this.c[i2] = true;
                this.e++;
                i2++;
            }
        }
    }
}
