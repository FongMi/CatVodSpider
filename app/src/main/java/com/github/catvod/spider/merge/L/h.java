package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.M.C0032b;
import com.github.catvod.spider.merge.M.D;
import com.github.catvod.spider.merge.M.E;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class h extends l {
    public g j;
    public C0019u k;
    public int l;

    public h(String str) {
        super(E.a("#root", D.c), str, null);
        this.j = new g();
        this.l = 1;
        this.k = new C0019u(new C0032b());
    }

    @Override // com.github.catvod.spider.merge.L.l
    /* JADX INFO: renamed from: B */
    public final l clone() {
        h hVar = (h) super.clone();
        hVar.j = this.j.clone();
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: clone */
    public final Object g() {
        h hVar = (h) super.clone();
        hVar.j = this.j.clone();
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.q
    public final q g() {
        h hVar = (h) super.clone();
        hVar.j = this.j.clone();
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.q
    public final String o() {
        return "#document";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String p() {
        return G();
    }
}
