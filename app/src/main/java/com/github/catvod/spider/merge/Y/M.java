package com.github.catvod.spider.merge.y;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class M implements G {
    public static final M b = new M(false);
    public static final M c = new M(true);
    public static final M d = new M(true);
    private boolean a;

    private M(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        if (!this.a) {
            return n.l(obj2);
        }
        ArrayList arrayList = new ArrayList();
        n.d(obj2, arrayList);
        return arrayList;
    }
}
