package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.S0.c;
import com.github.catvod.spider.merge.S0.d;
import com.github.catvod.spider.merge.W0.b;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements com.github.catvod.spider.merge.S0.a {
    private com.github.catvod.spider.merge.S0.a e;
    private boolean f;
    private int d = 16;
    private byte[] a = new byte[16];
    private byte[] b = new byte[16];
    private byte[] c = new byte[16];

    public a(com.github.catvod.spider.merge.S0.a aVar) {
        this.e = aVar;
    }

    @Override // com.github.catvod.spider.merge.S0.a
    public final void a(boolean z, c cVar) {
        com.github.catvod.spider.merge.S0.a aVar;
        boolean z2 = this.f;
        this.f = z;
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            byte[] bArrA = bVar.a();
            if (bArrA.length != this.d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(bArrA, 0, this.a, 0, bArrA.length);
            reset();
            if (bVar.b() == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            } else {
                aVar = this.e;
                cVar = bVar.b();
            }
        } else {
            reset();
            if (cVar == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            aVar = this.e;
        }
        aVar.a(z, cVar);
    }

    @Override // com.github.catvod.spider.merge.S0.a
    public final int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f) {
            if (this.d + i > bArr.length) {
                throw new d("input buffer too short");
            }
            for (int i3 = 0; i3 < this.d; i3++) {
                byte[] bArr3 = this.b;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int iB = this.e.b(this.b, 0, bArr2, i2);
            byte[] bArr4 = this.b;
            System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return iB;
        }
        int i4 = this.d;
        if (i + i4 > bArr.length) {
            throw new d("input buffer too short");
        }
        System.arraycopy(bArr, i, this.c, 0, i4);
        int iB2 = this.e.b(bArr, i, bArr2, i2);
        for (int i5 = 0; i5 < this.d; i5++) {
            int i6 = i2 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.b[i5]);
        }
        byte[] bArr5 = this.b;
        this.b = this.c;
        this.c = bArr5;
        return iB2;
    }

    @Override // com.github.catvod.spider.merge.S0.a
    public final int c() {
        return this.e.c();
    }

    @Override // com.github.catvod.spider.merge.S0.a
    public final void reset() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        Arrays.fill(this.c, (byte) 0);
        this.e.reset();
    }
}
