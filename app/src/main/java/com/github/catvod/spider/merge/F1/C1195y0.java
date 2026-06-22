package com.github.catvod.spider.merge.f1;

import java.util.AbstractList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1195y0 extends AbstractList {
    private int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ B0 e;

    C1195y0(B0 b0, int i, int i2) {
        this.e = b0;
        this.c = i;
        this.d = i2;
        this.b = b0.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        B0.q1(this.e, this.b);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        B0.q1(this.e, this.b);
        return this.d - this.c;
    }
}
