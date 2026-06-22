package com.github.catvod.spider.merge.XU;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.JSObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class u implements JSCallFunction {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public final Object call(Object[] objArr) {
        return JSObject.a(this.a, this.b, objArr);
    }
}
