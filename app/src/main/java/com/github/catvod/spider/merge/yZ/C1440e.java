package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.yZ.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1440e implements F {
    public static final C1440e a = new C1440e();

    public static l b(String str) {
        C1441f c1441f = new C1441f(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        c1441f.a(charBufferAllocate);
        C1443h c1443hD = c1441f.d();
        int iA = C1442g.a(c1443hD.d());
        if (iA == 0) {
            int iF = c1443hD.f();
            int iG = c1443hD.g();
            byte[] bArrB = c1443hD.b();
            c1443hD.a();
            return new C1446k(iF, iG, bArrB);
        }
        if (iA == 1) {
            int iF2 = c1443hD.f();
            int iG2 = c1443hD.g();
            char[] cArrC = c1443hD.c();
            c1443hD.a();
            return new C1444i(iF2, iG2, cArrC);
        }
        if (iA != 2) {
            throw new UnsupportedOperationException(ZrJ.d("372C3F6D3A20182023282C"));
        }
        int iF3 = c1443hD.f();
        int iG3 = c1443hD.g();
        int[] iArrE = c1443hD.e();
        c1443hD.a();
        return new C1445j(iF3, iG3, iArrE);
    }

    public E a(com.github.catvod.spider.merge.Bk.n nVar, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        m mVar = new m(nVar, i, i2, i3, i4);
        mVar.b = i5;
        mVar.c = i6;
        if (str != null) {
            mVar.f = str;
        }
        return mVar;
    }
}
