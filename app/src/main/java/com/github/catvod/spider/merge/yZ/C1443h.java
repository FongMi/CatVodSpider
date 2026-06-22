package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1443h {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    C1443h(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    final int a() {
        int iA = C1442g.a(this.a);
        if (iA == 0) {
            return this.b.arrayOffset();
        }
        if (iA == 1) {
            return this.c.arrayOffset();
        }
        if (iA == 2) {
            return this.d.arrayOffset();
        }
        throw new UnsupportedOperationException(ZrJ.d("372C3F6D3A20182023282C"));
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
        int iA = C1442g.a(this.a);
        if (iA == 0) {
            buffer = this.b;
        } else if (iA == 1) {
            buffer = this.c;
        } else {
            if (iA != 2) {
                throw new UnsupportedOperationException(ZrJ.d("372C3F6D3A20182023282C"));
            }
            buffer = this.d;
        }
        return buffer.position();
    }

    public final int g() {
        Buffer buffer;
        int iA = C1442g.a(this.a);
        if (iA == 0) {
            buffer = this.b;
        } else if (iA == 1) {
            buffer = this.c;
        } else {
            if (iA != 2) {
                throw new UnsupportedOperationException(ZrJ.d("372C3F6D3A20182023282C"));
            }
            buffer = this.d;
        }
        return buffer.remaining();
    }
}
