package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡩ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0392 implements InterfaceC0313 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final Collection<? extends InterfaceC0313> f975;

    public C0392(Collection<? extends InterfaceC0313> collection) {
        if (collection == null) {
            throw new NullPointerException(SOY.d("1E373D1313160E3722"));
        }
        this.f975 = collection;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0313
    /* JADX INFO: renamed from: Ϳ */
    public void mo1200(AbstractC0389 abstractC0389, C0576 c0576, int i, int i2, boolean z, BitSet bitSet, C0407 c0407) {
        Iterator<? extends InterfaceC0313> it = this.f975.iterator();
        while (it.hasNext()) {
            it.next().mo1200(abstractC0389, c0576, i, i2, z, bitSet, c0407);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0313
    /* JADX INFO: renamed from: Ԩ */
    public void mo1201(AbstractC0389 abstractC0389, C0576 c0576, int i, int i2, int i3, C0407 c0407) {
        Iterator<? extends InterfaceC0313> it = this.f975.iterator();
        while (it.hasNext()) {
            it.next().mo1201(abstractC0389, c0576, i, i2, i3, c0407);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0313
    /* JADX INFO: renamed from: ԩ */
    public void mo1202(AbstractC0394<?, ?> abstractC0394, Object obj, int i, int i2, String str, C0393 c0393) {
        Iterator<? extends InterfaceC0313> it = this.f975.iterator();
        while (it.hasNext()) {
            it.next().mo1202(abstractC0394, obj, i, i2, str, c0393);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0313
    /* JADX INFO: renamed from: Ԫ */
    public void mo1203(AbstractC0389 abstractC0389, C0576 c0576, int i, int i2, BitSet bitSet, C0407 c0407) {
        Iterator<? extends InterfaceC0313> it = this.f975.iterator();
        while (it.hasNext()) {
            it.next().mo1203(abstractC0389, c0576, i, i2, bitSet, c0407);
        }
    }
}
