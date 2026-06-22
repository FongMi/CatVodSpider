package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.C.u;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends InputStream {
    private byte[] b;
    private int c;
    private int d;
    private final l e;

    public b(InputStream inputStream) throws IOException {
        l lVar = new l();
        this.e = lVar;
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.b = new byte[16384];
        this.c = 0;
        this.d = 0;
        try {
            l.a(lVar, inputStream);
        } catch (c e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        l lVar = this.e;
        int i = lVar.a;
        if (i == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i == 11) {
            return;
        }
        lVar.a = 11;
        a.b(lVar.c);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d >= this.c) {
            byte[] bArr = this.b;
            int i = read(bArr, 0, bArr.length);
            this.c = i;
            this.d = 0;
            if (i == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        return bArr2[i2] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(u.b("Bad offset: ", i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(u.b("Bad length: ", i2));
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
        }
        if (i2 == 0) {
            return 0;
        }
        int iMax = Math.max(this.c - this.d, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i2);
            System.arraycopy(this.b, this.d, bArr, i, iMax);
            this.d += iMax;
            i += iMax;
            i2 -= iMax;
            if (i2 == 0) {
                return iMax;
            }
        }
        try {
            l lVar = this.e;
            lVar.Y = bArr;
            lVar.T = i;
            lVar.U = i2;
            lVar.V = 0;
            e.e(lVar);
            int i4 = this.e.V;
            if (i4 == 0) {
                return -1;
            }
            return i4 + iMax;
        } catch (c e) {
            throw new IOException("Brotli stream decoding failed", e);
        }
    }
}
