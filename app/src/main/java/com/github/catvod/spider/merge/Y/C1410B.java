package com.github.catvod.spider.merge.y;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1410B implements G {
    private final String a;
    private final long b;
    private final boolean c;

    public C1410B(String str, boolean z) {
        this.a = str;
        this.b = com.github.catvod.spider.merge.H.A.z(str);
        this.c = z;
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        if (!this.c) {
            return n.k(obj2, this.a, this.b);
        }
        ArrayList arrayList = new ArrayList();
        n.e(obj2, this.a, arrayList);
        return arrayList;
    }
}
