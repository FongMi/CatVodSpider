package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.n1.C1352c;
import com.github.catvod.spider.merge.n1.InterfaceC1351b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j extends AbstractC1315g<AbstractC1313e, InterfaceC1314f> {
    private final com.github.catvod.spider.merge.I1.k e;
    private final C1352c f;
    private final com.github.catvod.spider.merge.s1.c g;

    public j(int i) {
        super(i);
        this.e = new com.github.catvod.spider.merge.I1.k(i);
        this.f = new C1352c(i);
        this.g = new com.github.catvod.spider.merge.s1.c(i);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1309a
    public final Object a(Object obj) {
        InterfaceC1314f interfaceC1314f = (InterfaceC1314f) obj;
        if (interfaceC1314f instanceof com.github.catvod.spider.merge.I1.j) {
            return this.e.a((com.github.catvod.spider.merge.I1.j) interfaceC1314f);
        }
        if (interfaceC1314f instanceof InterfaceC1351b) {
            return this.f.a((InterfaceC1351b) interfaceC1314f);
        }
        if (interfaceC1314f instanceof com.github.catvod.spider.merge.s1.b) {
            return this.g.a((com.github.catvod.spider.merge.s1.b) interfaceC1314f);
        }
        throw new IllegalArgumentException("Invalid extractor type: " + interfaceC1314f);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1315g
    public final List<Throwable> e() {
        ArrayList arrayList = new ArrayList(super.e());
        arrayList.addAll(this.e.e());
        arrayList.addAll(this.f.e());
        arrayList.addAll(this.g.e());
        return Collections.unmodifiableList(arrayList);
    }
}
