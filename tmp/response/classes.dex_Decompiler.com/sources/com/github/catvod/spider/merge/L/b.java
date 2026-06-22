package com.github.catvod.spider.merge.L;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class b implements Iterator<a> {
    int a = 0;
    final /* synthetic */ c b;

    b(c cVar) {
        this.b = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.a < this.b.a) {
            c cVar = this.b;
            if (!cVar.t(cVar.b[this.a])) {
                break;
            }
            this.a++;
        }
        return this.a < this.b.a;
    }

    @Override // java.util.Iterator
    public final a next() {
        c cVar = this.b;
        String[] strArr = cVar.b;
        int i = this.a;
        a aVar = new a(strArr[i], (String) cVar.c[i], cVar);
        this.a++;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c cVar = this.b;
        int i = this.a - 1;
        this.a = i;
        cVar.y(i);
    }
}
