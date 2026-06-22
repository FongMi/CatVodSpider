package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1097M extends C1144i1 {
    Field w;
    Object x;

    C1097M(n2 n2Var, C1186v0[] c1186v0Arr, Field field) {
        super(c1186v0Arr);
        this.w = field;
        D(n2Var);
        E(p2.m0(n2Var));
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        if (cls == C1157l2.p) {
            return this;
        }
        try {
            Object obj = this.w.get(this.x);
            Class<?> type = this.w.getType();
            C1185v c1185vH = C1185v.h();
            Object objC = c1185vH.s().c(c1185vH, this, obj, type);
            return objC instanceof n2 ? ((n2) objC).m(cls) : objC;
        } catch (IllegalAccessException unused) {
            throw C1185v.H("msg.java.internal.private", this.w.getName());
        }
    }
}
