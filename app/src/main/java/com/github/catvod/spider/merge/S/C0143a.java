package com.github.catvod.spider.merge.s;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.JSObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class C0143a implements JSCallFunction {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0143a(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public final Object call(Object[] objArr) {
        return JSObject.a(this.a, this.b, objArr);
    }
}
