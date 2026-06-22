package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1167p implements Serializable {
    private transient Map<C1164o, C1147j0> b;
    private transient Map<Class<?>, Object> c;
    private p2 d;

    public final boolean a(p2 p2Var) {
        if (p2Var.B() != null) {
            throw new IllegalArgumentException();
        }
        if (this != p2Var.I("ClassCache", this)) {
            return false;
        }
        this.d = p2Var;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.concurrent.ConcurrentHashMap] */
    final synchronized void b(Class<?> cls, Object obj) {
        if (this.c == null) {
            this.c = new ConcurrentHashMap(16, 0.75f, 1);
        }
        this.c.put(cls, obj);
    }

    final n2 c() {
        return this.d;
    }

    final Map<C1164o, C1147j0> d() {
        if (this.b == null) {
            this.b = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.concurrent.ConcurrentHashMap] */
    final Object e(Class<?> cls) {
        ?? r0 = this.c;
        if (r0 == 0) {
            return null;
        }
        return r0.get(cls);
    }
}
