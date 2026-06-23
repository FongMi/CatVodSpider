package com.github.catvod.spider.merge.t;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class h implements InterfaceC0627d {
    protected final int a;
    protected int b = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends h {
        private final char[] c;

        a(int i, int i2, char[] cArr) {
            super(i2);
            this.c = cArr;
        }

        @Override // com.github.catvod.spider.merge.t.InterfaceC0627d
        public final String d(com.github.catvod.spider.merge.w.h hVar) {
            int iMin = Math.min(hVar.a, this.a);
            return new String(this.c, iMin, Math.min((hVar.b - hVar.a) + 1, this.a - iMin));
        }

        @Override // com.github.catvod.spider.merge.t.p
        public final int g(int i) {
            char c;
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.b + 1;
                if (i2 < 0) {
                    return -1;
                }
                c = this.c[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i3 = (this.b + 1) - 1;
                if (i3 >= this.a) {
                    return -1;
                }
                c = this.c[i3];
            }
            return c & 65535;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h {
        private final int[] c;

        b(int i, int i2, int[] iArr) {
            super(i2);
            this.c = iArr;
        }

        @Override // com.github.catvod.spider.merge.t.InterfaceC0627d
        public final String d(com.github.catvod.spider.merge.w.h hVar) {
            int iMin = Math.min(hVar.a, this.a);
            return new String(this.c, iMin, Math.min((hVar.b - hVar.a) + 1, this.a - iMin));
        }

        @Override // com.github.catvod.spider.merge.t.p
        public final int g(int i) {
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.b + 1;
                if (i2 < 0) {
                    return -1;
                }
                return this.c[i2];
            }
            if (iSignum == 0) {
                return 0;
            }
            if (iSignum != 1) {
                throw new UnsupportedOperationException("Not reached");
            }
            int i3 = (this.b + 1) - 1;
            if (i3 >= this.a) {
                return -1;
            }
            return this.c[i3];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends h {
        private final byte[] c;

        c(int i, int i2, byte[] bArr) {
            super(i2);
            this.c = bArr;
        }

        @Override // com.github.catvod.spider.merge.t.InterfaceC0627d
        public final String d(com.github.catvod.spider.merge.w.h hVar) {
            int iMin = Math.min(hVar.a, this.a);
            return new String(this.c, iMin, Math.min((hVar.b - hVar.a) + 1, this.a - iMin), StandardCharsets.ISO_8859_1);
        }

        @Override // com.github.catvod.spider.merge.t.p
        public final int g(int i) {
            byte b;
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.b + 1;
                if (i2 < 0) {
                    return -1;
                }
                b = this.c[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i3 = (this.b + 1) - 1;
                if (i3 >= this.a) {
                    return -1;
                }
                b = this.c[i3];
            }
            return b & 255;
        }
    }

    h(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int c() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final void e(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int h() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final void i() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final void release() {
    }

    @Override // com.github.catvod.spider.merge.t.p
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return d(com.github.catvod.spider.merge.w.h.b(0, this.a - 1));
    }
}
