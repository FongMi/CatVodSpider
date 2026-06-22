package com.github.catvod.spider.merge;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޗ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0309 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private byte[] f829;

    public C0309(byte[] bArr) {
        this.f829 = bArr;
    }

    public String toString() {
        if (this.f829.length == 0) {
            return "";
        }
        try {
            return new String(this.f829, SOY.d("3B01123F3D"));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public byte[] m1190() {
        byte[] bArr = this.f829;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public short m1191(int i) {
        return (short) (this.f829[i] & 255);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public void m1192(int i, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = this.f829;
        byte[] bArr3 = new byte[length + bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        byte[] bArr4 = this.f829;
        if (i < bArr4.length) {
            System.arraycopy(bArr4, i, bArr3, bArr.length + i, bArr4.length - i);
        }
        this.f829 = bArr3;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public void m1193(byte[] bArr) {
        m1192(this.f829.length, bArr);
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public int m1194() {
        return this.f829.length;
    }
}
