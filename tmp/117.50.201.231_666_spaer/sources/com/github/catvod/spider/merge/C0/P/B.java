package com.github.catvod.spider.merge.C0.P;

import com.github.catvod.spider.merge.C0.Q.a;
import com.github.catvod.spider.merge.C0.Q.l;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class B<Symbol, ATNInterpreter extends com.github.catvod.spider.merge.C0.Q.l> {
    protected ATNInterpreter b;
    private List<a> a = new A();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract a f();

    public final a g() {
        return new y(this.a);
    }

    public final ATNInterpreter h() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public boolean j(int i) {
        return true;
    }

    public final void k(int i) {
        this.c = i;
    }
}
