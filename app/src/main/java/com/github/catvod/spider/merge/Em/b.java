package com.github.catvod.spider.merge.Em;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class b implements Iterator<a> {
    int a = 0;
    final /* synthetic */ c b;

    b(c cVar) {
        this.b = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.a < this.b.c) {
            c cVar = this.b;
            if (!cVar.q(cVar.d[this.a])) {
                break;
            }
            this.a++;
        }
        return this.a < this.b.c;
    }

    @Override // java.util.Iterator
    public final a next() {
        c cVar = this.b;
        String[] strArr = cVar.d;
        int i = this.a;
        a aVar = new a(strArr[i], cVar.e[i], cVar);
        this.a++;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c cVar = this.b;
        int i = this.a - 1;
        this.a = i;
        cVar.v(i);
    }
}
