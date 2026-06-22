package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1135g0 implements Iterator<Object> {
    private Object b;
    private boolean c;
    final /* synthetic */ C1139h0 d;

    public C1135g0(C1139h0 c1139h0) {
        this.d = c1139h0;
    }

    public final boolean b() {
        return this.c;
    }

    public final void c() {
        this.c = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return false;
        }
        Object objB = this.d.d.b(this.d.b, this.d.c, this.d.f, C1157l2.y);
        Object objT0 = p2.t0(p2.Z(objB), "done");
        if (objT0 == I2.c) {
            objT0 = G2.b;
        }
        if (C1157l2.g1(objT0)) {
            this.c = true;
            return false;
        }
        this.b = C1157l2.U(objB, "value", this.d.b, this.d.c);
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            throw new NoSuchElementException();
        }
        return this.b;
    }
}
