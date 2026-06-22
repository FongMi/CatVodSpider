package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.z.C0287f;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class z implements InterfaceC0257a {
    private final Collection<? extends InterfaceC0257a> a;

    public z(Collection<? extends InterfaceC0257a> collection) {
        if (collection == null) {
            throw new NullPointerException(oZP.d("110A1B240B34010A04"));
        }
        this.a = collection;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0257a
    public final void a(AbstractC0248C<?, ?> abstractC0248C, Object obj, int i, int i2, String str, C0246A c0246a) {
        Iterator<? extends InterfaceC0257a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(abstractC0248C, obj, i, i2, str, c0246a);
        }
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0257a
    public final void b(x xVar, com.github.catvod.spider.merge.A.b bVar, int i, int i2, BitSet bitSet, C0287f c0287f) {
        Iterator<? extends InterfaceC0257a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(xVar, bVar, i, i2, bitSet, c0287f);
        }
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0257a
    public final void c(x xVar, com.github.catvod.spider.merge.A.b bVar, int i, int i2, int i3, C0287f c0287f) {
        Iterator<? extends InterfaceC0257a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(xVar, bVar, i, i2, i3, c0287f);
        }
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0257a
    public final void d(x xVar, com.github.catvod.spider.merge.A.b bVar, int i, int i2, BitSet bitSet, C0287f c0287f) {
        Iterator<? extends InterfaceC0257a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(xVar, bVar, i, i2, bitSet, c0287f);
        }
    }
}
