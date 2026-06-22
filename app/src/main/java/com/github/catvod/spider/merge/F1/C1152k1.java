package com.github.catvod.spider.merge.f1;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1152k1 extends AbstractC1088D {
    private Iterator l;

    private C1152k1() {
    }

    C1152k1(n2 n2Var, Iterable iterable) {
        super(n2Var, "JavaIterableIterator");
        this.l = iterable.iterator();
    }

    static void t1(p2 p2Var) {
        AbstractC1088D.q1(p2Var, new C1152k1(), "JavaIterableIterator");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Java Iterable Iterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final String p1() {
        return "JavaIterableIterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final boolean r1(C1185v c1185v) {
        return !this.l.hasNext();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final Object s1(C1185v c1185v, n2 n2Var) {
        if (!this.l.hasNext()) {
            return G2.b;
        }
        Object next = this.l.next();
        return c1185v.s().c(c1185v, this, next, next == null ? null : next.getClass());
    }
}
