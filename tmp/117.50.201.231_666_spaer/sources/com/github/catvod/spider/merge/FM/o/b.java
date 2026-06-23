package com.github.catvod.spider.merge.FM.O;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class b {
    private boolean g(byte b) {
        int i = b & 255;
        return i < 65 || (i > 90 && i < 97) || i > 122;
    }

    public final ByteBuffer a(byte[] bArr, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = i + 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            if (b == 62) {
                z = false;
            } else if (b == 60) {
                z = true;
            }
            if (((b & 128) == 0) && g(b)) {
                if (i3 > i4 && !z) {
                    byteBufferAllocate.put(bArr, i4, i3 - i4);
                    byteBufferAllocate.put((byte) 32);
                }
                i4 = i3 + 1;
            }
            i3++;
        }
        if (!z && i3 > i4) {
            byteBufferAllocate.put(bArr, i4, i3 - i4);
        }
        return byteBufferAllocate;
    }

    public final ByteBuffer b(byte[] bArr, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = i + 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            if (!((b & 128) == 0)) {
                z = true;
            } else if (g(b)) {
                if (!z || i3 <= i4) {
                    i4 = i3 + 1;
                } else {
                    byteBufferAllocate.put(bArr, i4, i3 - i4);
                    byteBufferAllocate.put((byte) 32);
                    i4 = i3 + 1;
                    z = false;
                }
            }
            i3++;
        }
        if (z && i3 > i4) {
            byteBufferAllocate.put(bArr, i4, i3 - i4);
        }
        return byteBufferAllocate;
    }

    public abstract String c();

    public abstract float d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i);

    public abstract void h();
}
