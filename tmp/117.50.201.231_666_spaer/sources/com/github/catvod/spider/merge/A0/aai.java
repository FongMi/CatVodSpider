package com.github.catvod.spider.merge.A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class aai {
    public static ss a(String str) {
        int length = str.length();
        sq sqVar = new sq();
        sqVar.a = 1;
        sqVar.b = ByteBuffer.allocate(length);
        sqVar.c = null;
        sqVar.d = null;
        sqVar.e = -1;
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        int iRemaining = charBufferAllocate.remaining();
        int iH = wb.h(sqVar.a);
        if (iH != 0) {
            if (iH != 1) {
                if (iH == 2 && sqVar.d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(sq.f(sqVar.d.capacity() + iRemaining));
                    sqVar.d.flip();
                    intBufferAllocate.put(sqVar.d);
                    sqVar.d = intBufferAllocate;
                }
            } else if (sqVar.c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(sq.f(sqVar.c.capacity() + iRemaining));
                sqVar.c.flip();
                charBufferAllocate2.put(sqVar.c);
                sqVar.c = charBufferAllocate2;
            }
        } else if (sqVar.b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sq.f(sqVar.b.capacity() + iRemaining));
            sqVar.b.flip();
            byteBufferAllocate.put(sqVar.b);
            sqVar.b = byteBufferAllocate;
        }
        if (!charBufferAllocate.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iH2 = wb.h(sqVar.a);
        if (iH2 == 0) {
            char[] cArrArray = charBufferAllocate.array();
            int iPosition = charBufferAllocate.position() + charBufferAllocate.arrayOffset();
            int iLimit = charBufferAllocate.limit() + charBufferAllocate.arrayOffset();
            byte[] bArrArray = sqVar.b.array();
            int iPosition2 = sqVar.b.position() + sqVar.b.arrayOffset();
            while (true) {
                if (iPosition >= iLimit) {
                    charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                    ByteBuffer byteBuffer = sqVar.b;
                    byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                    break;
                }
                char c = cArrArray[iPosition];
                if (c <= 255) {
                    bArrArray[iPosition2] = (byte) (c & 255);
                    iPosition++;
                    iPosition2++;
                } else {
                    charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                    ByteBuffer byteBuffer2 = sqVar.b;
                    byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                    if (Character.isHighSurrogate(c)) {
                        int iRemaining2 = charBufferAllocate.remaining();
                        sqVar.b.flip();
                        IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(sqVar.b.remaining() + iRemaining2, sqVar.b.capacity() / 4));
                        while (sqVar.b.hasRemaining()) {
                            intBufferAllocate2.put(sqVar.b.get() & 255);
                        }
                        sqVar.a = 3;
                        sqVar.b = null;
                        sqVar.d = intBufferAllocate2;
                        sqVar.h(charBufferAllocate);
                    } else {
                        int iRemaining3 = charBufferAllocate.remaining();
                        sqVar.b.flip();
                        CharBuffer charBufferAllocate3 = CharBuffer.allocate(Math.max(sqVar.b.remaining() + iRemaining3, sqVar.b.capacity() / 2));
                        while (sqVar.b.hasRemaining()) {
                            charBufferAllocate3.put((char) (sqVar.b.get() & 255));
                        }
                        sqVar.a = 2;
                        sqVar.b = null;
                        sqVar.c = charBufferAllocate3;
                        sqVar.g(charBufferAllocate);
                    }
                }
            }
        } else if (iH2 == 1) {
            sqVar.g(charBufferAllocate);
        } else if (iH2 == 2) {
            sqVar.h(charBufferAllocate);
        }
        int iH3 = wb.h(sqVar.a);
        if (iH3 == 0) {
            sqVar.b.flip();
        } else if (iH3 == 1) {
            sqVar.c.flip();
        } else if (iH3 == 2) {
            sqVar.d.flip();
        }
        int i = sqVar.a;
        ByteBuffer byteBuffer3 = sqVar.b;
        CharBuffer charBuffer = sqVar.c;
        IntBuffer intBuffer = sqVar.d;
        sr srVar = new sr(i, byteBuffer3, charBuffer, intBuffer);
        int iH4 = wb.h(i);
        if (iH4 == 0) {
            srVar.f();
            int iG = srVar.g();
            byte[] bArrArray2 = byteBuffer3.array();
            srVar.e();
            return new ss(iG, bArrArray2, 2);
        }
        if (iH4 == 1) {
            srVar.f();
            int iG2 = srVar.g();
            char[] cArrArray2 = charBuffer.array();
            srVar.e();
            return new ss(iG2, cArrArray2, 0);
        }
        if (iH4 != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        srVar.f();
        int iG3 = srVar.g();
        int[] iArrArray = intBuffer.array();
        srVar.e();
        return new ss(iG3, iArrArray, 1);
    }
}
