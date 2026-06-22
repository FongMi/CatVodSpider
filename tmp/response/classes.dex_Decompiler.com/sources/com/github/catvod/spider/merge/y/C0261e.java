package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0261e implements InterfaceC0251F {
    public static final C0261e a = new C0261e();

    public static AbstractC0268l b(String str) {
        C0262f c0262f = new C0262f(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        c0262f.a(charBufferAllocate);
        C0264h c0264hD = c0262f.d();
        int iA = C0263g.a(c0264hD.d());
        if (iA == 0) {
            int iF = c0264hD.f();
            int iG = c0264hD.g();
            byte[] bArrB = c0264hD.b();
            c0264hD.a();
            return new C0267k(iF, iG, bArrB);
        }
        if (iA == 1) {
            int iF2 = c0264hD.f();
            int iG2 = c0264hD.g();
            char[] cArrC = c0264hD.c();
            c0264hD.a();
            return new C0265i(iF2, iG2, cArrC);
        }
        if (iA != 2) {
            throw new UnsupportedOperationException(oZP.d("3B0003611E30140C1F2408"));
        }
        int iF3 = c0264hD.f();
        int iG3 = c0264hD.g();
        int[] iArrE = c0264hD.e();
        c0264hD.a();
        return new C0266j(iF3, iG3, iArrE);
    }

    public InterfaceC0250E a(com.github.catvod.spider.merge.B.n nVar, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        C0269m c0269m = new C0269m(nVar, i, i2, i3, i4);
        c0269m.b = i5;
        c0269m.c = i6;
        if (str != null) {
            c0269m.f = str;
        }
        return c0269m;
    }
}
