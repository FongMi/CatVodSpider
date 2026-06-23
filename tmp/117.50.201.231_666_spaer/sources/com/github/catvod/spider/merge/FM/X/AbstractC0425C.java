package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.y.AbstractC0470l;
import com.github.catvod.spider.merge.FM.y.C0459a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0425C<Symbol, ATNInterpreter extends AbstractC0470l> {
    protected ATNInterpreter b;
    private List<InterfaceC0434a> a = new C0424B();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0459a d();

    public final InterfaceC0434a e() {
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
