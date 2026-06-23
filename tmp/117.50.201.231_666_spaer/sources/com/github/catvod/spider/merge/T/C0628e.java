package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.t.C0629f;
import com.github.catvod.spider.merge.t.h;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0628e {
    public static h a(String str) {
        C0629f.a aVar = new C0629f.a(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        aVar.a(charBufferAllocate);
        C0629f c0629fD = aVar.d();
        int iA = g.a(c0629fD.d());
        if (iA == 0) {
            int iF = c0629fD.f();
            int iG = c0629fD.g();
            byte[] bArrB = c0629fD.b();
            c0629fD.a();
            return new h.c(iF, iG, bArrB);
        }
        if (iA == 1) {
            int iF2 = c0629fD.f();
            int iG2 = c0629fD.g();
            char[] cArrC = c0629fD.c();
            c0629fD.a();
            return new h.a(iF2, iG2, cArrC);
        }
        if (iA != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iF3 = c0629fD.f();
        int iG3 = c0629fD.g();
        int[] iArrE = c0629fD.e();
        c0629fD.a();
        return new h.b(iF3, iG3, iArrE);
    }
}
