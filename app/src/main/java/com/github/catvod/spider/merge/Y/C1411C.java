package com.github.catvod.spider.merge.y;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1411C implements G {
    private final int a;
    private final int b;
    private final int c;

    public C1411C(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        int iIntValue = Integer.valueOf(n.h(obj2)).intValue();
        int i = this.a;
        if (i < 0) {
            i += iIntValue;
        }
        int i2 = this.b;
        if (i2 < 0) {
            i2 += iIntValue;
        }
        int i3 = ((i2 - i) / this.c) + 1;
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        while (i <= i2 && i < iIntValue) {
            arrayList.add(n.i(obj2, i));
            i += this.c;
        }
        return arrayList;
    }
}
