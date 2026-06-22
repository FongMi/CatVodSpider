package com.github.catvod.spider.merge.y;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1433w implements G {
    private final String[] a;
    private final long[] b;

    public C1433w(String[] strArr) {
        this.a = strArr;
        this.b = new long[strArr.length];
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = com.github.catvod.spider.merge.H.A.z(strArr[i]);
            i++;
        }
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList(this.a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.a;
            if (i >= strArr.length) {
                return arrayList;
            }
            arrayList.add(n.k(obj2, strArr[i], this.b[i]));
            i++;
        }
    }
}
