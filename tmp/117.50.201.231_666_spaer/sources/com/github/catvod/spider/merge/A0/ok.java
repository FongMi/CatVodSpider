package com.github.catvod.spider.merge.A0;

import com.github.catvod.js.Function;
import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class ok implements JSCallFunction {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ok(Function function, Method method) {
        this.c = function;
        this.b = method;
    }

    public /* synthetic */ ok(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    public final Object call(Object[] objArr) {
        switch (this.a) {
            case 0:
                return ((Function) this.c).lambda$setProperty$0(this.b, objArr);
            default:
                return QuickJSObject.Ϳ(this.b, this.c, objArr);
        }
    }
}
