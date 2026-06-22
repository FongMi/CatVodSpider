package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.z.AbstractC0293l;
import com.github.catvod.spider.merge.z.C0282a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0248C<Symbol, ATNInterpreter extends AbstractC0293l> {
    protected ATNInterpreter b;
    private List<InterfaceC0257a> a = new C0247B();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0282a d();

    public final InterfaceC0257a e() {
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
