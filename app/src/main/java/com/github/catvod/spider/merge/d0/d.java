package com.github.catvod.spider.merge.D0;

import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d<T> {
    private Stack<Object> a;
    private T b;

    d(T t) {
        Stack<Object> stack = new Stack<>();
        this.a = stack;
        this.b = t;
        stack.push(t);
    }

    public final d a() {
        c cVar = new c();
        f("internalExperimentFlags", cVar);
        this.a.push(cVar);
        return this;
    }

    public final T b() {
        return this.b;
    }

    public final d<T> c() {
        if (this.a.size() == 1) {
            throw new m("Cannot end the root object or array");
        }
        this.a.pop();
        return this;
    }

    public final d<T> d(String str) {
        e eVar = new e();
        f(str, eVar);
        this.a.push(eVar);
        return this;
    }

    public final d<T> e(String str, int i) {
        f(str, Integer.valueOf(i));
        return this;
    }

    public final d<T> f(String str, Object obj) {
        try {
            ((e) this.a.peek()).put(str, obj);
            return this;
        } catch (ClassCastException unused) {
            throw new m("Attempted to write a keyed value to a JsonArray");
        }
    }

    public final d<T> g(String str, boolean z) {
        f(str, Boolean.valueOf(z));
        return this;
    }
}
