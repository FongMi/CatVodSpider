package com.github.catvod.spider.merge.FM.x;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0438e implements InterfaceC0428F {
    public static final C0438e a = new C0438e();

    public static AbstractC0445l b(String str) {
        C0439f c0439f = new C0439f(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        c0439f.a(charBufferAllocate);
        C0441h c0441hD = c0439f.d();
        int iA = C0440g.a(c0441hD.d());
        if (iA == 0) {
            int iF = c0441hD.f();
            int iG = c0441hD.g();
            byte[] bArrB = c0441hD.b();
            c0441hD.a();
            return new C0444k(iF, iG, bArrB);
        }
        if (iA == 1) {
            int iF2 = c0441hD.f();
            int iG2 = c0441hD.g();
            char[] cArrC = c0441hD.c();
            c0441hD.a();
            return new C0442i(iF2, iG2, cArrC);
        }
        if (iA != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iF3 = c0441hD.f();
        int iG3 = c0441hD.g();
        int[] iArrE = c0441hD.e();
        c0441hD.a();
        return new C0443j(iF3, iG3, iArrE);
    }

    public InterfaceC0427E a(com.github.catvod.spider.merge.FM.A.n nVar, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        C0446m c0446m = new C0446m(nVar, i, i2, i3, i4);
        c0446m.b = i5;
        c0446m.c = i6;
        if (str != null) {
            c0446m.f = str;
        }
        return c0446m;
    }
}
