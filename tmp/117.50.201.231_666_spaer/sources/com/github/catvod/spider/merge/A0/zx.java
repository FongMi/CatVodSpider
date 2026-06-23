package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zx extends il implements Iterable {
    public final ArrayList f = new ArrayList();

    @Override // com.github.catvod.spider.merge.A0.il
    public final double a() {
        return g().a();
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final int b() {
        return g().b();
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final long d() {
        return g().d();
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final String e() {
        return g().e();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof zx) && ((zx) obj).f.equals(this.f));
    }

    public final il g() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 1) {
            return (il) arrayList.get(0);
        }
        throw new IllegalStateException(wb.c("Array must have size 1, but has size ", size));
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f.iterator();
    }
}
