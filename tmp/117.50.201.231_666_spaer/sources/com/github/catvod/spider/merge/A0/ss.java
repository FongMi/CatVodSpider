package com.github.catvod.spider.merge.A0;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ss implements uo {
    public final int a;
    public int b = 0;
    public final /* synthetic */ int c;
    public final Object d;

    public ss(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.d = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.uo
    public final int e(int i) {
        char c;
        byte b;
        switch (this.c) {
            case 0:
                int iSignum = Integer.signum(1);
                char[] cArr = (char[]) this.d;
                if (iSignum == -1) {
                    int i2 = this.b + 1;
                    if (i2 < 0) {
                        return -1;
                    }
                    c = cArr[i2];
                } else {
                    if (iSignum == 0) {
                        return 0;
                    }
                    if (iSignum != 1) {
                        throw new UnsupportedOperationException("Not reached");
                    }
                    int i3 = this.b;
                    if (i3 >= this.a) {
                        return -1;
                    }
                    c = cArr[i3];
                }
                return c & 65535;
            case 1:
                int iSignum2 = Integer.signum(1);
                int[] iArr = (int[]) this.d;
                if (iSignum2 == -1) {
                    int i4 = this.b + 1;
                    if (i4 < 0) {
                        return -1;
                    }
                    return iArr[i4];
                }
                if (iSignum2 == 0) {
                    return 0;
                }
                if (iSignum2 != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i5 = this.b;
                if (i5 >= this.a) {
                    return -1;
                }
                return iArr[i5];
            default:
                int iSignum3 = Integer.signum(1);
                byte[] bArr = (byte[]) this.d;
                if (iSignum3 == -1) {
                    int i6 = this.b + 1;
                    if (i6 < 0) {
                        return -1;
                    }
                    b = bArr[i6];
                } else {
                    if (iSignum3 == 0) {
                        return 0;
                    }
                    if (iSignum3 != 1) {
                        throw new UnsupportedOperationException("Not reached");
                    }
                    int i7 = this.b;
                    if (i7 >= this.a) {
                        return -1;
                    }
                    b = bArr[i7];
                }
                return b & 255;
        }
    }

    public final String f(bd bdVar) {
        switch (this.c) {
            case 0:
                int i = bdVar.b;
                int i2 = this.a;
                int iMin = Math.min(i, i2);
                return new String((char[]) this.d, iMin, Math.min((bdVar.c - bdVar.b) + 1, i2 - iMin));
            case 1:
                int i3 = bdVar.b;
                int i4 = this.a;
                int iMin2 = Math.min(i3, i4);
                return new String((int[]) this.d, iMin2, Math.min((bdVar.c - bdVar.b) + 1, i4 - iMin2));
            default:
                int i5 = bdVar.b;
                int i6 = this.a;
                int iMin3 = Math.min(i5, i6);
                return new String((byte[]) this.d, iMin3, Math.min((bdVar.c - bdVar.b) + 1, i6 - iMin3), StandardCharsets.ISO_8859_1);
        }
    }

    public final String toString() {
        return f(bd.d(0, this.a - 1));
    }
}
