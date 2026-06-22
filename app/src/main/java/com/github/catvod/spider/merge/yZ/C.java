package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.KW.AbstractC0824l;
import com.github.catvod.spider.merge.KW.C0813a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class C<Symbol, ATNInterpreter extends AbstractC0824l> {
    protected ATNInterpreter b;
    private List<InterfaceC1436a> a = new B();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0813a d();

    public final InterfaceC1436a e() {
        return new z(this.a);
    }

    public final ATNInterpreter f() {
        return this.b;
    }

    public final int g() {
        return this.c;
    }

    public boolean h(int i) {
        return true;
    }

    public final void i(int i) {
        this.c = i;
    }
}
