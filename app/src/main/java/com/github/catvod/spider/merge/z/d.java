package com.github.catvod.spider.merge.z;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class d implements l {
    public final int a;
    public int b = 0;
    public final /* synthetic */ int c;
    public final Object d;

    public d(int i, int i2, Object obj, int i3) {
        this.c = i3;
        this.a = i2;
        this.d = obj;
    }

    @Override // com.github.catvod.spider.merge.z.l
    public final int a(int i) {
        char c;
        byte b;
        switch (this.c) {
            case 0:
                int iSignum = Integer.signum(i);
                char[] cArr = (char[]) this.d;
                if (iSignum == -1) {
                    int i2 = this.b + i;
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
                    int i3 = (this.b + i) - 1;
                    if (i3 >= this.a) {
                        return -1;
                    }
                    c = cArr[i3];
                }
                return c & 65535;
            case 1:
                int iSignum2 = Integer.signum(i);
                int[] iArr = (int[]) this.d;
                if (iSignum2 == -1) {
                    int i4 = this.b + i;
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
                int i5 = (this.b + i) - 1;
                if (i5 >= this.a) {
                    return -1;
                }
                return iArr[i5];
            default:
                int iSignum3 = Integer.signum(i);
                byte[] bArr = (byte[]) this.d;
                if (iSignum3 == -1) {
                    int i6 = this.b + i;
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
                    int i7 = (this.b + i) - 1;
                    if (i7 >= this.a) {
                        return -1;
                    }
                    b = bArr[i7];
                }
                return b & 255;
        }
    }

    public final String b(com.github.catvod.spider.merge.C.e eVar) {
        switch (this.c) {
            case 0:
                int i = eVar.a;
                int i2 = this.a;
                int iMin = Math.min(i, i2);
                return new String((char[]) this.d, iMin, Math.min((eVar.b - eVar.a) + 1, i2 - iMin));
            case 1:
                int i3 = eVar.a;
                int i4 = this.a;
                int iMin2 = Math.min(i3, i4);
                return new String((int[]) this.d, iMin2, Math.min((eVar.b - eVar.a) + 1, i4 - iMin2));
            default:
                int i5 = eVar.a;
                int i6 = this.a;
                int iMin3 = Math.min(i5, i6);
                return new String((byte[]) this.d, iMin3, Math.min((eVar.b - eVar.a) + 1, i6 - iMin3), StandardCharsets.ISO_8859_1);
        }
    }

    public final String toString() {
        return b(com.github.catvod.spider.merge.C.e.a(0, this.a - 1));
    }
}
