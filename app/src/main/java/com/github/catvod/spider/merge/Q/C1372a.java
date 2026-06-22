package com.github.catvod.spider.merge.q;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1372a extends m<Object, Object> {
    final /* synthetic */ C1373b d;

    C1372a(C1373b c1373b) {
        this.d = c1373b;
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void a() {
        this.d.clear();
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Object b(int i, int i2) {
        return this.d.c[(i << 1) + i2];
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Map<Object, Object> c() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int d() {
        return this.d.d;
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int e(Object obj) {
        return this.d.e(obj);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final int f(Object obj) {
        return this.d.g(obj);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void g(Object obj, Object obj2) {
        this.d.put(obj, obj2);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final void h(int i) {
        this.d.i(i);
    }

    @Override // com.github.catvod.spider.merge.q.m
    protected final Object i(int i, Object obj) {
        return this.d.j(i, obj);
    }
}
