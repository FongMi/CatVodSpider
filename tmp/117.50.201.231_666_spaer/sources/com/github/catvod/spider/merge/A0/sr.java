package com.github.catvod.spider.merge.A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sr {
    public final int a;
    public final ByteBuffer b;
    public final CharBuffer c;
    public final IntBuffer d;

    public sr(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public final int e() {
        int iH = wb.h(this.a);
        if (iH == 0) {
            return this.b.arrayOffset();
        }
        if (iH == 1) {
            return this.c.arrayOffset();
        }
        if (iH == 2) {
            return this.d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public final int f() {
        int iH = wb.h(this.a);
        if (iH == 0) {
            return this.b.position();
        }
        if (iH == 1) {
            return this.c.position();
        }
        if (iH == 2) {
            return this.d.position();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public final int g() {
        int iH = wb.h(this.a);
        if (iH == 0) {
            return this.b.remaining();
        }
        if (iH == 1) {
            return this.c.remaining();
        }
        if (iH == 2) {
            return this.d.remaining();
        }
        throw new UnsupportedOperationException("Not reached");
    }
}
