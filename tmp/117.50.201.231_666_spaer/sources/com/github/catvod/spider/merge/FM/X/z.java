package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.y.C0464f;
import com.github.catvod.spider.merge.FM.z.C0485b;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class z implements InterfaceC0434a {
    private final Collection<? extends InterfaceC0434a> a;

    public z(Collection<? extends InterfaceC0434a> collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.a = collection;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0434a
    public final void a(x xVar, C0485b c0485b, int i, int i2, BitSet bitSet, C0464f c0464f) {
        Iterator<? extends InterfaceC0434a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(xVar, c0485b, i, i2, bitSet, c0464f);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0434a
    public final void b(AbstractC0425C<?, ?> abstractC0425C, Object obj, int i, int i2, String str, C0423A c0423a) {
        Iterator<? extends InterfaceC0434a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(abstractC0425C, obj, i, i2, str, c0423a);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0434a
    public final void c(x xVar, C0485b c0485b, int i, int i2, int i3, C0464f c0464f) {
        Iterator<? extends InterfaceC0434a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(xVar, c0485b, i, i2, i3, c0464f);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0434a
    public final void d(x xVar, C0485b c0485b, int i, int i2, BitSet bitSet, C0464f c0464f) {
        Iterator<? extends InterfaceC0434a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(xVar, c0485b, i, i2, bitSet, c0464f);
        }
    }
}
