package com.github.catvod.spider.merge.y;

import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1430t implements G {
    public static final C1430t a = new C1430t();

    C1430t() {
    }

    @Override // com.github.catvod.spider.merge.y.G
    public final Object a(N n, Object obj, Object obj2) {
        if (!(obj2 instanceof Collection)) {
            throw new UnsupportedOperationException();
        }
        Object obj3 = null;
        for (Object obj4 : (Collection) obj2) {
            if (obj4 != null && (obj3 == null || N.b(obj3, obj4) < 0)) {
                obj3 = obj4;
            }
        }
        return obj3;
    }
}
