package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aau implements Iterator {
    public ed a;
    public fw b;
    public fw c;
    public fw d;
    public fw e;
    public final Class f;

    public aau(ed edVar, Class cls) {
        wc.e(edVar);
        this.f = cls;
        if (cls.isInstance(edVar)) {
            this.b = edVar;
        }
        this.c = edVar;
        this.d = edVar;
        this.a = edVar;
        this.e = (ed) edVar.ap;
    }

    public final void g() {
        fw fwVar;
        if (this.b != null) {
            return;
        }
        if (this.e != null && this.c.ap == null) {
            this.c = this.d;
        }
        fw fwVarW = this.c;
        loop0: while (true) {
            fwVar = null;
            if (fwVarW.n() > 0) {
                fwVarW = (fw) fwVarW.q().get(0);
            } else if (this.a.equals(fwVarW)) {
                fwVarW = null;
            } else if (fwVarW.ax() != null) {
                fwVarW = fwVarW.ax();
            } else {
                do {
                    fwVarW = fwVarW.w();
                    if (fwVarW == null || this.a.equals(fwVarW)) {
                        break loop0;
                    }
                } while (fwVarW.ax() == null);
                fwVarW = fwVarW.ax();
            }
            if (fwVarW == null) {
                break;
            } else if (this.f.isInstance(fwVarW)) {
                fwVar = fwVarW;
                break;
            }
        }
        this.b = fwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        g();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        g();
        fw fwVar = this.b;
        if (fwVar == null) {
            throw new NoSuchElementException();
        }
        this.d = this.c;
        this.c = fwVar;
        this.e = fwVar.w();
        this.b = null;
        return fwVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.ba();
    }
}
