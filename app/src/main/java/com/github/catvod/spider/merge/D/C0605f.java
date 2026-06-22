package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0605f implements X {
    public static final C0605f a = new C0605f();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        if (obj == null) {
            l.j.u(i0.WriteNullStringAsEmpty);
        } else {
            l.v(obj.toString());
        }
    }
}
