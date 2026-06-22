package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1432v implements G {
    private final int[] a;

    public C1432v(int[] iArr) {
        this.a = iArr;
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        C1413b c1413b = new C1413b(this.a.length);
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return c1413b;
            }
            c1413b.add(n.i(obj2, iArr[i]));
            i++;
        }
    }
}
