package com.github.catvod.spider.merge.G0;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    private byte[] a;

    public a(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final short b() {
        return (short) (this.a[0] & 255);
    }

    public final void c(int i, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = this.a;
        byte[] bArr3 = new byte[length + bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        byte[] bArr4 = this.a;
        if (i < bArr4.length) {
            System.arraycopy(bArr4, i, bArr3, bArr.length + i, bArr4.length - i);
        }
        this.a = bArr3;
    }

    public final void d(byte[] bArr) {
        c(this.a.length, bArr);
    }

    public final int e() {
        return this.a.length;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "";
        }
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }
}
