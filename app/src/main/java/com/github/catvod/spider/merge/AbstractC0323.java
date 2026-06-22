package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0319;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޢ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0323 implements InterfaceC0317 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected final int f848;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected final String f849;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int f850;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޢ$Ϳ, reason: contains not printable characters */
    static /* synthetic */ class C0324 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final /* synthetic */ int[] f851;

        static {
            int[] iArr = new int[C0319.EnumC0322.values().length];
            f851 = iArr;
            try {
                iArr[C0319.EnumC0322.f844.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f851[C0319.EnumC0322.f845.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f851[C0319.EnumC0322.f846.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޢ$Ԩ, reason: contains not printable characters */
    private static final class C0325 extends AbstractC0323 {

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private final char[] f852;

        /* synthetic */ C0325(int i, int i2, String str, char[] cArr, int i3, C0324 c0324) {
            this(i, i2, str, cArr, i3);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0385
        /* JADX INFO: renamed from: Ԭ */
        public int mo1214(int i) {
            char c;
            int iSignum = Integer.signum(i);
            if (iSignum == -1) {
                int i2 = this.f850 + i;
                if (i2 < 0) {
                    return -1;
                }
                c = this.f852[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
                }
                int i3 = (this.f850 + i) - 1;
                if (i3 >= this.f848) {
                    return -1;
                }
                c = this.f852[i3];
            }
            return c & 65535;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0317
        /* JADX INFO: renamed from: Ԯ */
        public String mo1227(C0125 c0125) {
            int iMin = Math.min(c0125.f317, this.f848);
            return new String(this.f852, iMin, Math.min((c0125.f318 - c0125.f317) + 1, this.f848 - iMin));
        }

        private C0325(int i, int i2, String str, char[] cArr, int i3) {
            super(i, i2, str, null);
            this.f852 = cArr;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޢ$Ԫ, reason: contains not printable characters */
    private static final class C0326 extends AbstractC0323 {

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private final int[] f853;

        /* synthetic */ C0326(int i, int i2, String str, int[] iArr, int i3, C0324 c0324) {
            this(i, i2, str, iArr, i3);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0385
        /* JADX INFO: renamed from: Ԭ */
        public int mo1214(int i) {
            int iSignum = Integer.signum(i);
            if (iSignum == -1) {
                int i2 = this.f850 + i;
                if (i2 < 0) {
                    return -1;
                }
                return this.f853[i2];
            }
            if (iSignum == 0) {
                return 0;
            }
            if (iSignum != 1) {
                throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
            }
            int i3 = (this.f850 + i) - 1;
            if (i3 >= this.f848) {
                return -1;
            }
            return this.f853[i3];
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0317
        /* JADX INFO: renamed from: Ԯ */
        public String mo1227(C0125 c0125) {
            int iMin = Math.min(c0125.f317, this.f848);
            return new String(this.f853, iMin, Math.min((c0125.f318 - c0125.f317) + 1, this.f848 - iMin));
        }

        private C0326(int i, int i2, String str, int[] iArr, int i3) {
            super(i, i2, str, null);
            this.f853 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ޢ$Ԭ, reason: contains not printable characters */
    private static final class C0327 extends AbstractC0323 {

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private final byte[] f854;

        /* synthetic */ C0327(int i, int i2, String str, byte[] bArr, int i3, C0324 c0324) {
            this(i, i2, str, bArr, i3);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0385
        /* JADX INFO: renamed from: Ԭ */
        public int mo1214(int i) {
            byte b;
            int iSignum = Integer.signum(i);
            if (iSignum == -1) {
                int i2 = this.f850 + i;
                if (i2 < 0) {
                    return -1;
                }
                b = this.f854[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
                }
                int i3 = (this.f850 + i) - 1;
                if (i3 >= this.f848) {
                    return -1;
                }
                b = this.f854[i3];
            }
            return b & 255;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0317
        /* JADX INFO: renamed from: Ԯ */
        public String mo1227(C0125 c0125) {
            int iMin = Math.min(c0125.f317, this.f848);
            return new String(this.f854, iMin, Math.min((c0125.f318 - c0125.f317) + 1, this.f848 - iMin), StandardCharsets.ISO_8859_1);
        }

        private C0327(int i, int i2, String str, byte[] bArr, int i3) {
            super(i, i2, str, null);
            this.f854 = bArr;
        }
    }

    /* synthetic */ AbstractC0323(int i, int i2, String str, C0324 c0324) {
        this(i, i2, str);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static AbstractC0323 m1250(C0319 c0319, String str) {
        int i = C0324.f851[c0319.m1234().ordinal()];
        if (i == 1) {
            return new C0327(c0319.m1236(), c0319.m1237(), str, c0319.m1232(), c0319.m1231(), null);
        }
        if (i == 2) {
            return new C0325(c0319.m1236(), c0319.m1237(), str, c0319.m1233(), c0319.m1231(), null);
        }
        if (i == 3) {
            return new C0326(c0319.m1236(), c0319.m1237(), str, c0319.m1235(), c0319.m1231(), null);
        }
        throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    public final int size() {
        return this.f848;
    }

    public final String toString() {
        return mo1227(C0125.m418(0, this.f848 - 1));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: Ϳ */
    public final int mo1209() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԩ */
    public final void mo1211(int i) {
        this.f850 = i;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԭ */
    public final int mo1215() {
        return this.f850;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԯ */
    public final void mo1217() {
        int i = this.f848;
        int i2 = this.f850;
        if (i - i2 == 0) {
            throw new IllegalStateException(SOY.d("19333F181B035A313E180702173771333B31"));
        }
        this.f850 = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ֏ */
    public final void mo1218(int i) {
    }

    private AbstractC0323(int i, int i2, String str) {
        this.f848 = i2;
        this.f849 = str;
        this.f850 = 0;
    }
}
