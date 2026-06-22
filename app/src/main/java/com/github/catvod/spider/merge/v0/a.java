package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.S0.b;
import com.github.catvod.spider.merge.S0.c;
import com.github.catvod.spider.merge.S0.d;
import com.github.catvod.spider.merge.S0.e;
import com.github.catvod.spider.merge.S0.f;
import com.github.catvod.spider.merge.c.C0936b;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends b {
    C0936b e;

    public a(com.github.catvod.spider.merge.S0.a aVar) {
        C0936b c0936b = new C0936b();
        this.d = aVar;
        this.e = c0936b;
        this.a = new byte[((com.github.catvod.spider.merge.U0.a) aVar).c()];
        this.b = 0;
    }

    public final int c(byte[] bArr, int i) {
        int iB;
        int iC = this.d.c();
        if (this.c) {
            if (this.b != iC) {
                iB = 0;
            } else {
                if ((iC * 2) + i > bArr.length) {
                    b();
                    throw new f();
                }
                iB = this.d.b(this.a, 0, bArr, i);
                this.b = 0;
            }
            C0936b c0936b = this.e;
            byte[] bArr2 = this.a;
            int i2 = this.b;
            c0936b.getClass();
            byte length = (byte) (bArr2.length - i2);
            while (i2 < bArr2.length) {
                bArr2[i2] = length;
                i2++;
            }
            return this.d.b(this.a, 0, bArr, i + iB) + iB;
        }
        if (this.b != iC) {
            b();
            throw new d("last block incomplete in decryption");
        }
        com.github.catvod.spider.merge.S0.a aVar = this.d;
        byte[] bArr3 = this.a;
        int iB2 = aVar.b(bArr3, 0, bArr3, 0);
        this.b = 0;
        try {
            C0936b c0936b2 = this.e;
            byte[] bArr4 = this.a;
            c0936b2.getClass();
            int i3 = bArr4[bArr4.length - 1] & 255;
            byte b = (byte) i3;
            boolean z = (i3 > bArr4.length) | (i3 == 0);
            for (int i4 = 0; i4 < bArr4.length; i4++) {
                z |= (bArr4.length - i4 <= i3) & (bArr4[i4] != b);
            }
            if (z) {
                throw new e();
            }
            int i5 = iB2 - i3;
            System.arraycopy(this.a, 0, bArr, i, i5);
            return i5;
        } finally {
            b();
        }
    }

    public final int d(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!this.c) {
            return i2;
        }
        return i2 + bArr.length;
    }

    public final void e(boolean z, c cVar) {
        this.c = z;
        b();
        if (!(cVar instanceof com.github.catvod.spider.merge.W0.c)) {
            this.e.getClass();
            this.d.a(z, cVar);
        } else {
            this.e.getClass();
            this.d.a(z, null);
        }
    }

    public final int f(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iA = a();
        int i4 = this.b + i2;
        byte[] bArr3 = this.a;
        int length = i4 % bArr3.length;
        int i5 = 0;
        int iMax = length == 0 ? Math.max(0, i4 - bArr3.length) : i4 - length;
        if (iMax > 0 && iMax + 0 > bArr2.length) {
            throw new f();
        }
        byte[] bArr4 = this.a;
        int length2 = bArr4.length;
        int i6 = this.b;
        int i7 = length2 - i6;
        if (i2 > i7) {
            System.arraycopy(bArr, i, bArr4, i6, i7);
            int iB = this.d.b(this.a, 0, bArr2, 0) + 0;
            this.b = 0;
            i2 -= i7;
            i += i7;
            while (i2 > this.a.length) {
                iB += this.d.b(bArr, i, bArr2, 0 + iB);
                i2 -= iA;
                i += iA;
            }
            i5 = iB;
        }
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b += i2;
        return i5;
    }
}
