package com.github.catvod.spider.merge.L;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b implements Iterator {
    public int a = 0;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        c cVar;
        while (true) {
            int i = this.a;
            cVar = this.b;
            if (i >= cVar.a || !c.i(cVar.b[i])) {
                break;
            }
            this.a++;
        }
        return this.a < cVar.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.b;
        String[] strArr = cVar.b;
        int i = this.a;
        a aVar = new a(strArr[i], (String) cVar.c[i], cVar);
        this.a++;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a - 1;
        this.a = i;
        this.b.l(i);
    }
}
