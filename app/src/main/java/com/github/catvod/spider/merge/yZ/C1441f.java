package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1441f {
    private ByteBuffer b;
    private int a = 1;
    private CharBuffer c = null;
    private IntBuffer d = null;
    private int e = -1;

    C1441f(int i) {
        this.b = ByteBuffer.allocate(i);
    }

    private void b(CharBuffer charBuffer) {
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
                c(charBuffer);
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

    private void c(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = this.d.array();
        int iPosition2 = this.d.position() + this.d.arrayOffset();
        while (true) {
            int i = -1;
            if (iPosition >= iLimit) {
                break;
            }
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iPosition2] = Character.toCodePoint((char) this.e, c);
                } else {
                    iArrArray[iPosition2] = this.e;
                    iPosition2++;
                    if (!Character.isHighSurrogate(c)) {
                        iArrArray[iPosition2] = 65535 & c;
                    }
                }
                iPosition2++;
                this.e = i;
            } else if (!Character.isHighSurrogate(c)) {
                iArrArray[iPosition2] = c & 65535;
                iPosition2++;
            }
            i = c & 65535;
            this.e = i;
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

    private static int e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final void a(CharBuffer charBuffer) {
        int iRemaining = charBuffer.remaining();
        int iA = C1442g.a(this.a);
        if (iA != 0) {
            if (iA != 1) {
                if (iA == 2 && this.d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(e(this.d.capacity() + iRemaining));
                    this.d.flip();
                    intBufferAllocate.put(this.d);
                    this.d = intBufferAllocate;
                }
            } else if (this.c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate = CharBuffer.allocate(e(this.c.capacity() + iRemaining));
                this.c.flip();
                charBufferAllocate.put(this.c);
                this.c = charBufferAllocate;
            }
        } else if (this.b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(e(this.b.capacity() + iRemaining));
            this.b.flip();
            byteBufferAllocate.put(this.b);
            this.b = byteBufferAllocate;
        }
        if (!charBuffer.hasArray()) {
            throw new UnsupportedOperationException(ZrJ.d("2D0C0F02"));
        }
        int iA2 = C1442g.a(this.a);
        if (iA2 != 0) {
            if (iA2 == 1) {
                b(charBuffer);
                return;
            } else {
                if (iA2 != 2) {
                    return;
                }
                c(charBuffer);
                return;
            }
        }
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        byte[] bArrArray = this.b.array();
        int iPosition2 = this.b.position() + this.b.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (c > 255) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                ByteBuffer byteBuffer = this.b;
                byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                if (Character.isHighSurrogate(c)) {
                    int iRemaining2 = charBuffer.remaining();
                    this.b.flip();
                    IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(this.b.remaining() + iRemaining2, this.b.capacity() / 4));
                    while (this.b.hasRemaining()) {
                        intBufferAllocate2.put(this.b.get() & 255);
                    }
                    this.a = 3;
                    this.b = null;
                    this.d = intBufferAllocate2;
                    c(charBuffer);
                    return;
                }
                int iRemaining3 = charBuffer.remaining();
                this.b.flip();
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(Math.max(this.b.remaining() + iRemaining3, this.b.capacity() / 2));
                while (this.b.hasRemaining()) {
                    charBufferAllocate2.put((char) (this.b.get() & 255));
                }
                this.a = 2;
                this.b = null;
                this.c = charBufferAllocate2;
                b(charBuffer);
                return;
            }
            bArrArray[iPosition2] = (byte) (c & 255);
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        ByteBuffer byteBuffer2 = this.b;
        byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
    }

    public final C1443h d() {
        int iA = C1442g.a(this.a);
        if (iA == 0) {
            this.b.flip();
        } else if (iA == 1) {
            this.c.flip();
        } else if (iA == 2) {
            this.d.flip();
        }
        return new C1443h(this.a, this.b, this.c, this.d);
    }
}
