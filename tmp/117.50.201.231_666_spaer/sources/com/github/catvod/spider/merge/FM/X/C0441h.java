package com.github.catvod.spider.merge.FM.x;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0441h {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    C0441h(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    final int a() {
        int iA = C0440g.a(this.a);
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

    final byte[] b() {
        return this.b.array();
    }

    final char[] c() {
        return this.c.array();
    }

    final int d() {
        return this.a;
    }

    final int[] e() {
        return this.d.array();
    }

    public final int f() {
        Buffer buffer;
        int iA = C0440g.a(this.a);
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

    public final int g() {
        Buffer buffer;
        int iA = C0440g.a(this.a);
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
