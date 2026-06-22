package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1190w1 implements Iterator<Map.Entry<Object, Object>> {
    Object[] b;
    Object c = null;
    int d = 0;
    final /* synthetic */ C1193x1 e;

    C1190w1(C1193x1 c1193x1) {
        this.e = c1193x1;
        this.b = c1193x1.b.o0(false, false);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.b.length;
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        Object[] objArr = this.b;
        int i = this.d;
        this.d = i + 1;
        Object obj = objArr[i];
        this.c = obj;
        return new C1187v1(obj, this.e.b.get(obj));
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        this.e.b.remove(obj);
        this.c = null;
    }
}
