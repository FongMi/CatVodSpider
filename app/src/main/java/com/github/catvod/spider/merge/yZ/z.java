package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.KW.C0818f;
import com.github.catvod.spider.merge.ZrJ;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class z implements InterfaceC1436a {
    private final Collection<? extends InterfaceC1436a> a;

    public z(Collection<? extends InterfaceC1436a> collection) {
        if (collection == null) {
            throw new NullPointerException(ZrJ.d("1D2627282F240D2638"));
        }
        this.a = collection;
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1436a
    public final void a(C<?, ?> c, Object obj, int i, int i2, String str, A a) {
        Iterator<? extends InterfaceC1436a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(c, obj, i, i2, str, a);
        }
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1436a
    public final void b(x xVar, com.github.catvod.spider.merge.XI.b bVar, int i, int i2, BitSet bitSet, C0818f c0818f) {
        Iterator<? extends InterfaceC1436a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(xVar, bVar, i, i2, bitSet, c0818f);
        }
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1436a
    public final void c(x xVar, com.github.catvod.spider.merge.XI.b bVar, int i, int i2, int i3, C0818f c0818f) {
        Iterator<? extends InterfaceC1436a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(xVar, bVar, i, i2, i3, c0818f);
        }
    }

    @Override // com.github.catvod.spider.merge.yZ.InterfaceC1436a
    public final void d(x xVar, com.github.catvod.spider.merge.XI.b bVar, int i, int i2, BitSet bitSet, C0818f c0818f) {
        Iterator<? extends InterfaceC1436a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(xVar, bVar, i, i2, bitSet, c0818f);
        }
    }
}
