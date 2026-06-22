package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.z.AbstractC0150b;
import com.github.catvod.spider.merge.z.C0149a;
import com.github.catvod.spider.merge.z.C0151c;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class h {
    public static com.github.catvod.spider.merge.z.d a(String str) {
        C0149a c0149a = new C0149a(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        int iRemaining = charBufferAllocate.remaining();
        int iA = AbstractC0150b.a(c0149a.a);
        if (iA != 0) {
            if (iA != 1) {
                if (iA == 2 && c0149a.d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(C0149a.c(c0149a.d.capacity() + iRemaining));
                    c0149a.d.flip();
                    intBufferAllocate.put(c0149a.d);
                    c0149a.d = intBufferAllocate;
                }
            } else if (c0149a.c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(C0149a.c(c0149a.c.capacity() + iRemaining));
                c0149a.c.flip();
                charBufferAllocate2.put(c0149a.c);
                c0149a.c = charBufferAllocate2;
            }
        } else if (c0149a.b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C0149a.c(c0149a.b.capacity() + iRemaining));
            c0149a.b.flip();
            byteBufferAllocate.put(c0149a.b);
            c0149a.b = byteBufferAllocate;
        }
        if (!charBufferAllocate.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iA2 = AbstractC0150b.a(c0149a.a);
        if (iA2 == 0) {
            char[] cArrArray = charBufferAllocate.array();
            int iPosition = charBufferAllocate.position() + charBufferAllocate.arrayOffset();
            int iLimit = charBufferAllocate.limit() + charBufferAllocate.arrayOffset();
            byte[] bArrArray = c0149a.b.array();
            int iPosition2 = c0149a.b.position() + c0149a.b.arrayOffset();
            while (true) {
                if (iPosition >= iLimit) {
                    charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                    ByteBuffer byteBuffer = c0149a.b;
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
                    ByteBuffer byteBuffer2 = c0149a.b;
                    byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                    if (Character.isHighSurrogate(c)) {
                        int iRemaining2 = charBufferAllocate.remaining();
                        c0149a.b.flip();
                        IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(c0149a.b.remaining() + iRemaining2, c0149a.b.capacity() / 4));
                        while (c0149a.b.hasRemaining()) {
                            intBufferAllocate2.put(c0149a.b.get() & 255);
                        }
                        c0149a.a = 3;
                        c0149a.b = null;
                        c0149a.d = intBufferAllocate2;
                        c0149a.b(charBufferAllocate);
                    } else {
                        int iRemaining3 = charBufferAllocate.remaining();
                        c0149a.b.flip();
                        CharBuffer charBufferAllocate3 = CharBuffer.allocate(Math.max(c0149a.b.remaining() + iRemaining3, c0149a.b.capacity() / 2));
                        while (c0149a.b.hasRemaining()) {
                            charBufferAllocate3.put((char) (c0149a.b.get() & 255));
                        }
                        c0149a.a = 2;
                        c0149a.b = null;
                        c0149a.c = charBufferAllocate3;
                        c0149a.a(charBufferAllocate);
                    }
                }
            }
        } else if (iA2 == 1) {
            c0149a.a(charBufferAllocate);
        } else if (iA2 == 2) {
            c0149a.b(charBufferAllocate);
        }
        int iA3 = AbstractC0150b.a(c0149a.a);
        if (iA3 == 0) {
            c0149a.b.flip();
        } else if (iA3 == 1) {
            c0149a.c.flip();
        } else if (iA3 == 2) {
            c0149a.d.flip();
        }
        int i = c0149a.a;
        ByteBuffer byteBuffer3 = c0149a.b;
        CharBuffer charBuffer = c0149a.c;
        IntBuffer intBuffer = c0149a.d;
        C0151c c0151c = new C0151c(i, byteBuffer3, charBuffer, intBuffer);
        int iA4 = AbstractC0150b.a(i);
        if (iA4 == 0) {
            int iB = c0151c.b();
            int iC = c0151c.c();
            byte[] bArrArray2 = byteBuffer3.array();
            c0151c.a();
            return new com.github.catvod.spider.merge.z.d(iB, iC, bArrArray2, 2);
        }
        if (iA4 == 1) {
            int iB2 = c0151c.b();
            int iC2 = c0151c.c();
            char[] cArrArray2 = charBuffer.array();
            c0151c.a();
            return new com.github.catvod.spider.merge.z.d(iB2, iC2, cArrArray2, 0);
        }
        if (iA4 != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iB3 = c0151c.b();
        int iC3 = c0151c.c();
        int[] iArrArray = intBuffer.array();
        c0151c.a();
        return new com.github.catvod.spider.merge.z.d(iB3, iC3, iArrArray, 1);
    }
}
