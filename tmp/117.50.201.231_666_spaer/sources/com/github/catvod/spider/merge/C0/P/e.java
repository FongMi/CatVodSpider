package com.github.catvod.spider.merge.C0.P;

import com.github.catvod.spider.merge.C0.l.a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    private ByteBuffer b;
    private int a = 1;
    private CharBuffer c = null;
    private IntBuffer d = null;
    private int e = -1;

    e(int i) {
        this.b = ByteBuffer.allocate(i);
    }

    private void b(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset2 = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        char[] cArrArray2 = this.c.array();
        int iArrayOffset3 = this.c.arrayOffset() + this.c.position();
        while (iArrayOffset < iLimit + iArrayOffset2) {
            char c = cArrArray[iArrayOffset];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.c;
                charBuffer2.position(iArrayOffset3 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                this.c.flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(iRemaining + this.c.remaining(), this.c.capacity() / 2));
                while (this.c.hasRemaining()) {
                    intBufferAllocate.put(this.c.get() & 65535);
                }
                this.a = 3;
                this.c = null;
                this.d = intBufferAllocate;
                c(charBuffer);
                return;
            }
            cArrArray2[iArrayOffset3] = c;
            iArrayOffset++;
            iArrayOffset3++;
        }
        charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.c;
        charBuffer3.position(iArrayOffset3 - charBuffer3.arrayOffset());
    }

    private void c(CharBuffer charBuffer) {
        int i;
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iArrayOffset = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        int[] iArrArray = this.d.array();
        int iArrayOffset2 = this.d.arrayOffset() + this.d.position();
        while (iPosition < iLimit + iArrayOffset) {
            char c = cArrArray[iPosition];
            int i2 = iPosition + 1;
            if (this.e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iArrayOffset2] = Character.toCodePoint((char) this.e, c);
                } else {
                    iArrArray[iArrayOffset2] = this.e;
                    iArrayOffset2++;
                    if (!Character.isHighSurrogate(c)) {
                        iArrArray[iArrayOffset2] = 65535 & c;
                    }
                }
                iArrayOffset2++;
                i = -1;
                this.e = i;
                iPosition = i2;
            } else if (!Character.isHighSurrogate(c)) {
                iArrArray[iArrayOffset2] = c & 65535;
                iArrayOffset2++;
                iPosition = i2;
            }
            i = c & 65535;
            this.e = i;
            iPosition = i2;
        }
        int i3 = this.e;
        if (i3 != -1) {
            iArrArray[iArrayOffset2] = i3 & 65535;
            iArrayOffset2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.d;
        intBuffer.position(iArrayOffset2 - intBuffer.arrayOffset());
    }

    private static int e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final void a(CharBuffer charBuffer) {
        int iRemaining = charBuffer.remaining();
        int iA = a.a(this.a);
        if (iA != 0) {
            if (iA != 1) {
                if (iA == 2 && this.d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(e(iRemaining + this.d.capacity()));
                    this.d.flip();
                    intBufferAllocate.put(this.d);
                    this.d = intBufferAllocate;
                }
            } else if (this.c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate = CharBuffer.allocate(e(iRemaining + this.c.capacity()));
                this.c.flip();
                charBufferAllocate.put(this.c);
                this.c = charBufferAllocate;
            }
        } else if (this.b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(e(iRemaining + this.b.capacity()));
            this.b.flip();
            byteBufferAllocate.put(this.b);
            this.b = byteBufferAllocate;
        }
        if (!charBuffer.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iA2 = a.a(this.a);
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
        int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset2 = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        byte[] bArrArray = this.b.array();
        int iArrayOffset3 = this.b.arrayOffset() + this.b.position();
        while (iArrayOffset < iLimit + iArrayOffset2) {
            char c = cArrArray[iArrayOffset];
            if (c > 255) {
                charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                ByteBuffer byteBuffer = this.b;
                byteBuffer.position(iArrayOffset3 - byteBuffer.arrayOffset());
                if (Character.isHighSurrogate(c)) {
                    int iRemaining2 = charBuffer.remaining();
                    this.b.flip();
                    IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(iRemaining2 + this.b.remaining(), this.b.capacity() / 4));
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
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(Math.max(iRemaining3 + this.b.remaining(), this.b.capacity() / 2));
                while (this.b.hasRemaining()) {
                    charBufferAllocate2.put((char) (this.b.get() & 255));
                }
                this.a = 2;
                this.b = null;
                this.c = charBufferAllocate2;
                b(charBuffer);
                return;
            }
            bArrArray[iArrayOffset3] = (byte) (c & 255);
            iArrayOffset++;
            iArrayOffset3++;
        }
        charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
        ByteBuffer byteBuffer2 = this.b;
        byteBuffer2.position(iArrayOffset3 - byteBuffer2.arrayOffset());
    }

    public final f d() {
        int iA = a.a(this.a);
        if (iA == 0) {
            this.b.flip();
        } else if (iA == 1) {
            this.c.flip();
        } else if (iA == 2) {
            this.d.flip();
        }
        return new f(this.a, this.b, this.c, this.d);
    }
}
