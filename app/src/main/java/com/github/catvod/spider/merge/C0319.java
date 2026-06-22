package com.github.catvod.spider.merge;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0319 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final EnumC0322 f834;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final ByteBuffer f835;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final CharBuffer f836;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final IntBuffer f837;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޡ$Ϳ, reason: contains not printable characters */
    static /* synthetic */ class C0320 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final /* synthetic */ int[] f838;

        static {
            int[] iArr = new int[EnumC0322.values().length];
            f838 = iArr;
            try {
                iArr[EnumC0322.f844.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f838[EnumC0322.f845.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f838[EnumC0322.f846.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޡ$Ԩ, reason: contains not printable characters */
    public static class C0321 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private EnumC0322 f839;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private ByteBuffer f840;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private CharBuffer f841;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private IntBuffer f842;

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        private int f843;

        /* synthetic */ C0321(int i, C0320 c0320) {
            this(i);
        }

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private void m1238(CharBuffer charBuffer) {
            int i = C0320.f838[this.f839.ordinal()];
            if (i == 1) {
                m1239(charBuffer);
            } else if (i == 2) {
                m1240(charBuffer);
            } else {
                if (i != 3) {
                    return;
                }
                m1241(charBuffer);
            }
        }

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private void m1239(CharBuffer charBuffer) {
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            byte[] bArrArray = this.f840.array();
            int iArrayOffset3 = this.f840.arrayOffset() + this.f840.position();
            while (iArrayOffset < iArrayOffset2) {
                char c = cArrArray[iArrayOffset];
                if (c > 255) {
                    charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                    ByteBuffer byteBuffer = this.f840;
                    byteBuffer.position(iArrayOffset3 - byteBuffer.arrayOffset());
                    if (Character.isHighSurrogate(c)) {
                        m1243(charBuffer.remaining());
                        m1241(charBuffer);
                        return;
                    } else {
                        m1242(charBuffer.remaining());
                        m1240(charBuffer);
                        return;
                    }
                }
                bArrArray[iArrayOffset3] = (byte) (c & 255);
                iArrayOffset++;
                iArrayOffset3++;
            }
            charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
            ByteBuffer byteBuffer2 = this.f840;
            byteBuffer2.position(iArrayOffset3 - byteBuffer2.arrayOffset());
        }

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private void m1240(CharBuffer charBuffer) {
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            char[] cArrArray2 = this.f841.array();
            int iArrayOffset3 = this.f841.arrayOffset() + this.f841.position();
            while (iArrayOffset < iArrayOffset2) {
                char c = cArrArray[iArrayOffset];
                if (Character.isHighSurrogate(c)) {
                    charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                    CharBuffer charBuffer2 = this.f841;
                    charBuffer2.position(iArrayOffset3 - charBuffer2.arrayOffset());
                    m1244(charBuffer.remaining());
                    m1241(charBuffer);
                    return;
                }
                cArrArray2[iArrayOffset3] = c;
                iArrayOffset++;
                iArrayOffset3++;
            }
            charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
            CharBuffer charBuffer3 = this.f841;
            charBuffer3.position(iArrayOffset3 - charBuffer3.arrayOffset());
        }

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        private void m1241(CharBuffer charBuffer) {
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int iArrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            int[] iArrArray = this.f842.array();
            int iArrayOffset3 = this.f842.arrayOffset() + this.f842.position();
            while (iArrayOffset < iArrayOffset2) {
                char c = cArrArray[iArrayOffset];
                iArrayOffset++;
                if (this.f843 != -1) {
                    if (Character.isLowSurrogate(c)) {
                        iArrArray[iArrayOffset3] = Character.toCodePoint((char) this.f843, c);
                        iArrayOffset3++;
                        this.f843 = -1;
                    } else {
                        iArrArray[iArrayOffset3] = this.f843;
                        iArrayOffset3++;
                        if (Character.isHighSurrogate(c)) {
                            this.f843 = c & 65535;
                        } else {
                            iArrArray[iArrayOffset3] = 65535 & c;
                            iArrayOffset3++;
                            this.f843 = -1;
                        }
                    }
                } else if (Character.isHighSurrogate(c)) {
                    this.f843 = c & 65535;
                } else {
                    iArrArray[iArrayOffset3] = c & 65535;
                    iArrayOffset3++;
                }
            }
            int i = this.f843;
            if (i != -1) {
                iArrArray[iArrayOffset3] = i & 65535;
                iArrayOffset3++;
            }
            charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
            IntBuffer intBuffer = this.f842;
            intBuffer.position(iArrayOffset3 - intBuffer.arrayOffset());
        }

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        private void m1242(int i) {
            this.f840.flip();
            CharBuffer charBufferAllocate = CharBuffer.allocate(Math.max(this.f840.remaining() + i, this.f840.capacity() / 2));
            while (this.f840.hasRemaining()) {
                charBufferAllocate.put((char) (this.f840.get() & 255));
            }
            this.f839 = EnumC0322.f845;
            this.f840 = null;
            this.f841 = charBufferAllocate;
        }

        /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
        private void m1243(int i) {
            this.f840.flip();
            IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f840.remaining() + i, this.f840.capacity() / 4));
            while (this.f840.hasRemaining()) {
                intBufferAllocate.put(this.f840.get() & 255);
            }
            this.f839 = EnumC0322.f846;
            this.f840 = null;
            this.f842 = intBufferAllocate;
        }

        /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
        private void m1244(int i) {
            this.f841.flip();
            IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f841.remaining() + i, this.f841.capacity() / 2));
            while (this.f841.hasRemaining()) {
                intBufferAllocate.put(this.f841.get() & 65535);
            }
            this.f839 = EnumC0322.f846;
            this.f841 = null;
            this.f842 = intBufferAllocate;
        }

        /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
        private static int m1245(int i) {
            return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public void m1246(CharBuffer charBuffer) {
            m1248(charBuffer.remaining());
            if (!charBuffer.hasArray()) {
                throw new UnsupportedOperationException(SOY.d("2E1D1539"));
            }
            m1238(charBuffer);
        }

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        public C0319 m1247() {
            int i = C0320.f838[this.f839.ordinal()];
            if (i == 1) {
                this.f840.flip();
            } else if (i == 2) {
                this.f841.flip();
            } else if (i == 3) {
                this.f842.flip();
            }
            return new C0319(this.f839, this.f840, this.f841, this.f842, null);
        }

        /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
        public void m1248(int i) {
            int i2 = C0320.f838[this.f839.ordinal()];
            if (i2 == 1) {
                if (this.f840.remaining() < i) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m1245(this.f840.capacity() + i));
                    this.f840.flip();
                    byteBufferAllocate.put(this.f840);
                    this.f840 = byteBufferAllocate;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                if (this.f841.remaining() < i) {
                    CharBuffer charBufferAllocate = CharBuffer.allocate(m1245(this.f841.capacity() + i));
                    this.f841.flip();
                    charBufferAllocate.put(this.f841);
                    this.f841 = charBufferAllocate;
                    return;
                }
                return;
            }
            if (i2 == 3 && this.f842.remaining() < i) {
                IntBuffer intBufferAllocate = IntBuffer.allocate(m1245(this.f842.capacity() + i));
                this.f842.flip();
                intBufferAllocate.put(this.f842);
                this.f842 = intBufferAllocate;
            }
        }

        private C0321(int i) {
            this.f839 = EnumC0322.f844;
            this.f840 = ByteBuffer.allocate(i);
            this.f841 = null;
            this.f842 = null;
            this.f843 = -1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޡ$Ԫ, reason: contains not printable characters */
    public enum EnumC0322 {
        f844,
        f845,
        f846
    }

    /* synthetic */ C0319(EnumC0322 enumC0322, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer, C0320 c0320) {
        this(enumC0322, byteBuffer, charBuffer, intBuffer);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0321 m1230(int i) {
        return new C0321(i, null);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    int m1231() {
        int i = C0320.f838[this.f834.ordinal()];
        if (i == 1) {
            return this.f835.arrayOffset();
        }
        if (i == 2) {
            return this.f836.arrayOffset();
        }
        if (i == 3) {
            return this.f837.arrayOffset();
        }
        throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    byte[] m1232() {
        return this.f835.array();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    char[] m1233() {
        return this.f836.array();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    EnumC0322 m1234() {
        return this.f834;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    int[] m1235() {
        return this.f837.array();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public int m1236() {
        int i = C0320.f838[this.f834.ordinal()];
        if (i == 1) {
            return this.f835.position();
        }
        if (i == 2) {
            return this.f836.position();
        }
        if (i == 3) {
            return this.f837.position();
        }
        throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int m1237() {
        int i = C0320.f838[this.f834.ordinal()];
        if (i == 1) {
            return this.f835.remaining();
        }
        if (i == 2) {
            return this.f836.remaining();
        }
        if (i == 3) {
            return this.f837.remaining();
        }
        throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
    }

    private C0319(EnumC0322 enumC0322, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f834 = enumC0322;
        this.f835 = byteBuffer;
        this.f836 = charBuffer;
        this.f837 = intBuffer;
    }
}
