package com.github.catvod.spider.merge.f1;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class u2 implements t2 {
    protected t2 b;

    u2(int i) {
        this.b = i > 2000 ? new C1100P() : new C1091G();
    }

    protected void a() {
        t2 t2Var = this.b;
        if (!(t2Var instanceof C1091G) || t2Var.size() < 2000) {
            return;
        }
        C1100P c1100p = new C1100P();
        Iterator<s2> it = this.b.iterator();
        while (it.hasNext()) {
            c1100p.a(it.next());
        }
        this.b = c1100p;
    }

    public int b() {
        return this.b.size();
    }

    public long c() {
        return 0L;
    }

    public void d(long j) {
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public void f(Object obj, int i) {
        this.b.f(obj, i);
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public s2 i(Object obj, int i, int i2) {
        a();
        return this.b.i(obj, i, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<s2> iterator() {
        return this.b.iterator();
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public s2 r(Object obj, int i) {
        return this.b.r(obj, i);
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public int size() {
        return this.b.size();
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public void y(s2 s2Var, s2 s2Var2) {
        this.b.y(s2Var, s2Var2);
    }
}
