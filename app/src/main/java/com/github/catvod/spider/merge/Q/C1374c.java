package com.github.catvod.spider.merge.q;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1374c extends m<Object, Object> {
    final /* synthetic */ C1375d d;

    C1374c(C1375d c1375d) {
        this.d = c1375d;
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void a() {
        this.d.clear();
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Object b(int i, int i2) {
        return this.d.c[i];
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int d() {
        return this.d.d;
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int e(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int f(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void g(Object obj, Object obj2) {
        this.d.add(obj);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void h(int i) {
        this.d.e(i);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Object i(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
