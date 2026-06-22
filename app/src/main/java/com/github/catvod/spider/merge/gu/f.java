package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Dw.h;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public static e b(int i) {
        return new e(i);
    }

    final int a() {
        int iA = h.a(this.a);
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

    final byte[] c() {
        return this.b.array();
    }

    final char[] d() {
        return this.c.array();
    }

    final int e() {
        return this.a;
    }

    final int[] f() {
        return this.d.array();
    }

    public final int g() {
        Buffer buffer;
        int iA = h.a(this.a);
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

    public final int h() {
        Buffer buffer;
        int iA = h.a(this.a);
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
