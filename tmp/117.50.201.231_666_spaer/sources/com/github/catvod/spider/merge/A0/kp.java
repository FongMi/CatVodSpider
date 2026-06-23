package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class kp extends lo {
    public final ub a;

    public kp(ub ubVar, vg vgVar) {
        super(vgVar);
        this.a = ubVar;
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final Object d() {
        return this.a.m();
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final Object e(Object obj) {
        return obj;
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final void f(Object obj, rd rdVar, jv jvVar) throws IllegalAccessException {
        Object objB = jvVar.f.b(rdVar);
        if (objB == null && jvVar.g) {
            return;
        }
        Field field = jvVar.b;
        if (!jvVar.h) {
            field.set(obj, objB);
            return;
        }
        throw new yc("Cannot set value of 'static final' " + ce.e(field, false));
    }
}
