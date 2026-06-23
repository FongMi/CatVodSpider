package com.github.catvod.spider.merge.FM.O;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i extends b {
    private static final byte[] d = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    private static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};
    private int a;
    private byte b;
    private int[] c = new int[4];

    public i() {
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        return com.github.catvod.spider.merge.FM.N.a.r;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        int[] iArr;
        float f;
        if (this.a == 3) {
            return 0.01f;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.c;
            if (i >= iArr.length) {
                break;
            }
            i2 += iArr[i];
            i++;
        }
        if (i2 <= 0) {
            f = 0.0f;
        } else {
            float f2 = i2;
            f = ((iArr[3] * 1.0f) / f2) - ((iArr[1] * 20.0f) / f2);
        }
        return (f >= 0.0f ? f : 0.0f) * 0.5f;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        ByteBuffer byteBufferA = a(bArr, i);
        byte[] bArrArray = byteBufferA.array();
        int iPosition = byteBufferA.position();
        int i2 = 0;
        while (true) {
            if (i2 >= iPosition) {
                break;
            }
            byte b = d[bArrArray[i2] & 255];
            byte b2 = e[(this.b * 8) + b];
            if (b2 == 0) {
                this.a = 3;
                break;
            }
            int[] iArr = this.c;
            iArr[b2] = iArr[b2] + 1;
            this.b = b;
            i2++;
        }
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        this.a = 1;
        this.b = (byte) 1;
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
