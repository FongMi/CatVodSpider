package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class al extends yt {
    public final /* synthetic */ Method a;
    public final /* synthetic */ int b;

    public al(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.A0.yt
    public final Object c(Class cls) {
        String strD = xg.d(cls);
        if (strD == null) {
            return this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
    }
}
