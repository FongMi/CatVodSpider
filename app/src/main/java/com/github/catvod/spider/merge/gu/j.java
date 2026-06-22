package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Mm.i;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class j implements InterfaceC1227d {
    protected final int a;
    protected int b = 0;

    j(int i) {
        this.a = i;
    }

    public static j k(f fVar) {
        int iA = h.a(fVar.e());
        if (iA == 0) {
            int iG = fVar.g();
            int iH = fVar.h();
            byte[] bArrC = fVar.c();
            fVar.a();
            return new i(iG, iH, bArrC);
        }
        if (iA == 1) {
            int iG2 = fVar.g();
            int iH2 = fVar.h();
            char[] cArrD = fVar.d();
            fVar.a();
            return new g(iG2, iH2, cArrD);
        }
        if (iA != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iG3 = fVar.g();
        int iH3 = fVar.h();
        int[] iArrF = fVar.f();
        fVar.a();
        return new h(iG3, iH3, iArrF);
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final void d(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final int g() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final int i() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final void j() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.gu.r
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return h(i.b(0, this.a - 1));
    }
}
