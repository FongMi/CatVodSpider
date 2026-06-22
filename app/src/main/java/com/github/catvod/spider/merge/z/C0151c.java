package com.github.catvod.spider.merge.z;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0151c {
    public final int a;
    public final ByteBuffer b;
    public final CharBuffer c;
    public final IntBuffer d;

    public C0151c(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public final int a() {
        int iA = AbstractC0150b.a(this.a);
        if (iA == 0) {
            return this.b.arrayOffset();
        }
        if (iA == 1) {
            return this.c.arrayOffset();
        }
        if (iA == 2) {
            return this.d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public final int b() {
        Buffer buffer;
        int iA = AbstractC0150b.a(this.a);
        if (iA == 0) {
            buffer = this.b;
        } else if (iA == 1) {
            buffer = this.c;
        } else {
            if (iA != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.d;
        }
        return buffer.position();
    }

    public final int c() {
        Buffer buffer;
        int iA = AbstractC0150b.a(this.a);
        if (iA == 0) {
            buffer = this.b;
        } else if (iA == 1) {
            buffer = this.c;
        } else {
            if (iA != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.d;
        }
        return buffer.remaining();
    }
}
