package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1100P implements t2 {
    private final LinkedHashMap<Object, s2> b = new LinkedHashMap<>();

    private Object b(Object obj, int i) {
        return obj == null ? String.valueOf(i) : obj;
    }

    public final void a(s2 s2Var) {
        Object objValueOf = s2Var.b;
        if (objValueOf == null) {
            objValueOf = String.valueOf(s2Var.c);
        }
        this.b.put(objValueOf, s2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final void f(Object obj, int i) {
        Object objB = b(obj, i);
        s2 s2Var = this.b.get(objB);
        if (s2Var != null) {
            if ((s2Var.a() & 4) == 0) {
                this.b.remove(objB);
            } else if (C1185v.h().u()) {
                throw C1157l2.C1("msg.delete.property.with.configurable.false", obj);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final s2 i(Object obj, int i, int i2) {
        s2 s2Var = this.b.get(b(obj, i));
        if (s2Var != null) {
            return s2Var;
        }
        s2 s2Var2 = new s2(obj, i, i2);
        a(s2Var2);
        return s2Var2;
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<s2> iterator() {
        return this.b.values().iterator();
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final s2 r(Object obj, int i) {
        return this.b.get(b(obj, i));
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final int size() {
        return this.b.size();
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final void y(s2 s2Var, s2 s2Var2) {
        Object objValueOf = s2Var.b;
        if (objValueOf == null) {
            objValueOf = String.valueOf(s2Var.c);
        }
        this.b.put(objValueOf, s2Var2);
    }
}
