package com.github.catvod.spider.merge.c1;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0946b implements Iterator<C0945a> {
    int b = 0;
    final /* synthetic */ C0947c c;

    C0946b(C0947c c0947c) {
        this.c = c0947c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.b < this.c.b) {
            C0947c c0947c = this.c;
            if (!c0947c.w(c0947c.c[this.b])) {
                break;
            }
            this.b++;
        }
        return this.b < this.c.b;
    }

    @Override // java.util.Iterator
    public final C0945a next() {
        C0947c c0947c = this.c;
        String[] strArr = c0947c.c;
        int i = this.b;
        C0945a c0945a = new C0945a(strArr[i], (String) c0947c.d[i], c0947c);
        this.b++;
        return c0945a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0947c c0947c = this.c;
        int i = this.b - 1;
        this.b = i;
        c0947c.C(i);
    }
}
