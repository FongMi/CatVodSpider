package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.u.AbstractC0639h;
import com.github.catvod.spider.merge.u.C0632a;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class x<Symbol, ATNInterpreter extends AbstractC0639h> {
    protected ATNInterpreter b;
    private List<InterfaceC0624a> a = new a();
    private int c = -1;

    final class a extends CopyOnWriteArrayList<InterfaceC0624a> {
        a() {
            add(l.a);
        }
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    public abstract C0632a c();

    public final InterfaceC0624a d() {
        return new v(this.a);
    }

    public final ATNInterpreter e() {
        return this.b;
    }

    public final int f() {
        return this.c;
    }

    public boolean g(int i) {
        return true;
    }

    public final void h(int i) {
        this.c = i;
    }
}
