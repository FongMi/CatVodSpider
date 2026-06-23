package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abo extends yt {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public abo(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.yt
    public final Object c(Class cls) {
        String strD = xg.d(cls);
        if (strD == null) {
            return this.a.invoke(this.b, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
    }
}
