package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jv {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ kv e;
    public final /* synthetic */ kv f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public jv(String str, Field field, Method method, kv kvVar, kv kvVar2, boolean z, boolean z2) {
        this.d = method;
        this.e = kvVar;
        this.f = kvVar2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void i(aag aagVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.b;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new yc("Accessor " + ce.e(method, false) + " threw exception", e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        aagVar.u(this.a);
        this.e.c(aagVar, objInvoke);
    }
}
