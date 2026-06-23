package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.a.C0529a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0605n implements Serializable {
    private int[] a;
    private final ReentrantReadWriteLock b;

    public C0605n(String str) throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock;
        int length = str.length();
        if (length < 5 || length >= 256) {
            throw new Exception();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            byte[] bytes = str.getBytes();
            int[] iArr = new int[256];
            for (int i = 0; i < 256; i++) {
                iArr[i] = i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 256; i3++) {
                i2 = (((i2 + iArr[i3]) + bytes[i3 % bytes.length]) & 255) % 256;
                int i4 = iArr[i3];
                iArr[i3] = iArr[i2];
                iArr[i2] = i4;
            }
            this.a = iArr;
        } finally {
            writeLock.unlock();
        }
    }

    public final byte[] a(byte[] bArr) {
        ReentrantReadWriteLock.ReadLock lock = this.b.readLock();
        lock.lock();
        try {
            int[] iArr = (int[]) this.a.clone();
            byte[] bArr2 = new byte[bArr.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                i = (i + 1) % 256;
                i2 = (i2 + iArr[i]) % 256;
                int i4 = iArr[i];
                iArr[i] = iArr[i2];
                iArr[i2] = i4;
                bArr2[i3] = (byte) (iArr[(iArr[i] + iArr[i2]) % 256] ^ bArr[i3]);
            }
            return bArr2;
        } finally {
            lock.unlock();
        }
    }

    public final String b(byte[] bArr) {
        Charset.defaultCharset();
        return new String(a(bArr));
    }

    public final String c(String str) {
        byte[] bArrA = a(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrA) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public final byte[] d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("invalid hex string");
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StringBuilder sbA = C0529a.a("");
            int i3 = i + 1;
            sbA.append(charArray[i]);
            sbA.append(charArray[i3]);
            bArr[i2] = new Integer(Integer.parseInt(sbA.toString(), 16) & 255).byteValue();
            i = i3 + 1;
            i2++;
        }
        return bArr;
    }
}
