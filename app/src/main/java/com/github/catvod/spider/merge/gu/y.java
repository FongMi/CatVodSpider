package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Dw.k;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class y implements a {
    private final Collection<? extends a> a;

    public y(Collection<? extends a> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.a = collection;
    }

    public final void a(B<?, ?> b, Object obj, int i, int i2, String str, z zVar) {
        Iterator<? extends a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(b, obj, i, i2, str, zVar);
        }
    }

    public final void b(w wVar, k kVar, int i, int i2, BitSet bitSet, com.github.catvod.spider.merge.Nx.f fVar) {
        Iterator<? extends a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(wVar, kVar, i, i2, bitSet, fVar);
        }
    }

    public final void c(w wVar, k kVar, int i, int i2, BitSet bitSet, com.github.catvod.spider.merge.Nx.f fVar) {
        Iterator<? extends a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(wVar, kVar, i, i2, bitSet, fVar);
        }
    }

    public final void d(w wVar, k kVar, int i, int i2, int i3, com.github.catvod.spider.merge.Nx.f fVar) {
        Iterator<? extends a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(wVar, kVar, i, i2, i3, fVar);
        }
    }
}
