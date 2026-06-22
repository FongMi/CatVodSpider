package com.github.catvod.spider.merge.Fs;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class i1 {
    protected E a;
    C0631a b;
    Q c;
    protected com.github.catvod.spider.merge.Em.h d;
    protected ArrayList<com.github.catvod.spider.merge.Em.l> e;
    protected String f;
    protected O g;
    protected D h;
    private M i = new M();
    private L j = new L();

    i1() {
    }

    protected final com.github.catvod.spider.merge.Em.l a() {
        int size = this.e.size();
        if (size > 0) {
            return this.e.get(size - 1);
        }
        return null;
    }

    protected abstract boolean b(String str);

    protected abstract boolean c(O o);

    protected final boolean d(String str) {
        O o = this.g;
        L l = this.j;
        if (o == l) {
            L l2 = new L();
            l2.s(str);
            return c(l2);
        }
        l.g();
        l.s(str);
        return c(l);
    }

    public boolean e(com.github.catvod.spider.merge.Em.c cVar) {
        M m = this.i;
        if (this.g == m) {
            m = new M();
        } else {
            m.g();
        }
        m.b = "input";
        m.j = cVar;
        m.c = com.github.catvod.spider.merge.Dw.s.c("input");
        return c(m);
    }

    protected final boolean f(String str) {
        M m = this.i;
        if (this.g == m) {
            m = new M();
        } else {
            m.g();
        }
        m.s(str);
        return c(m);
    }
}
