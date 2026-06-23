package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d extends l {
    public d(String str) {
        this.d = str;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final Object clone() {
        return (d) super.clone();
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: j */
    public final m clone() {
        return (d) super.clone();
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final m m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String t() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String toString() {
        return u();
    }

    @Override // com.github.catvod.spider.merge.G.m
    final void w(Appendable appendable, int i, f.a aVar) throws IOException {
        if (aVar.g() && this.b == 0) {
            m mVar = this.a;
            if ((mVar instanceof i) && ((i) mVar).q0().a()) {
                r(appendable, i, aVar);
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.G.m
    final void x(Appendable appendable, int i, f.a aVar) {
    }
}
