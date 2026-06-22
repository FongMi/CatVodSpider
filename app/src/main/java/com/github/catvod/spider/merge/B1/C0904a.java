package com.github.catvod.spider.merge.b1;

import com.github.catvod.spider.merge.a1.C0899d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0904a extends BufferedInputStream {
    private final boolean b;
    private final int c;
    private int d;
    private boolean e;

    private C0904a(InputStream inputStream, int i) {
        super(inputStream, 32768);
        C0899d.d(i >= 0);
        this.c = i;
        this.d = i;
        this.b = i != 0;
        System.nanoTime();
    }

    public static C0904a a(InputStream inputStream, int i) {
        return inputStream instanceof C0904a ? (C0904a) inputStream : new C0904a(inputStream, i);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.e || (this.b && this.d <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.e = true;
            return -1;
        }
        if (this.b && i2 > (i3 = this.d)) {
            i2 = i3;
        }
        try {
            int i4 = super.read(bArr, i, i2);
            this.d -= i4;
            return i4;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        this.d = this.c - ((BufferedInputStream) this).markpos;
    }
}
