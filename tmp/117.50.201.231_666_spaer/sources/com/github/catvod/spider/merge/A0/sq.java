package com.github.catvod.spider.merge.A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sq {
    public int a;
    public ByteBuffer b;
    public CharBuffer c;
    public IntBuffer d;
    public int e;

    public static int f(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final void g(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] cArrArray2 = this.c.array();
        int iPosition2 = this.c.position() + this.c.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.c;
                charBuffer2.position(iPosition2 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                this.c.flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.c.remaining() + iRemaining, this.c.capacity() / 2));
                while (this.c.hasRemaining()) {
                    intBufferAllocate.put(this.c.get() & 65535);
                }
                this.a = 3;
                this.c = null;
                this.d = intBufferAllocate;
                h(charBuffer);
                return;
            }
            cArrArray2[iPosition2] = c;
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.c;
        charBuffer3.position(iPosition2 - charBuffer3.arrayOffset());
    }

    public final void h(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = this.d.array();
        int iPosition2 = this.d.position() + this.d.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iPosition2] = Character.toCodePoint((char) this.e, c);
                    iPosition2++;
                    this.e = -1;
                } else {
                    iArrArray[iPosition2] = this.e;
                    int i = iPosition2 + 1;
                    if (Character.isHighSurrogate(c)) {
                        this.e = c & 65535;
                        iPosition2 = i;
                    } else {
                        iArrArray[i] = 65535 & c;
                        iPosition2 += 2;
                        this.e = -1;
                    }
                }
            } else if (Character.isHighSurrogate(c)) {
                this.e = c & 65535;
            } else {
                iArrArray[iPosition2] = c & 65535;
                iPosition2++;
            }
        }
        int i2 = this.e;
        if (i2 != -1) {
            iArrArray[iPosition2] = i2 & 65535;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.d;
        intBuffer.position(iPosition2 - intBuffer.arrayOffset());
    }
}
