package com.github.catvod.spider.merge.L;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class e extends p {
    public e(String str) {
        this.d = str;
    }

    @Override // com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: clone */
    public final Object g() {
        return (e) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q g() {
        return (e) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String o() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final void q(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.e && this.b == 0) {
            q qVar = this.a;
            if ((qVar instanceof l) && ((l) qVar).d.d) {
                q.m(appendable, i, gVar);
            }
        }
        appendable.append("<!--").append(y()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String toString() {
        return p();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final void r(Appendable appendable, int i, g gVar) {
    }
}
