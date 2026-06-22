package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K implements X {
    public static K a = new K();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        J j = (J) obj;
        if (j == null) {
            l.w();
        } else {
            j.a(l, i);
        }
    }
}
