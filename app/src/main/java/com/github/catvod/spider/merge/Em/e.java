package com.github.catvod.spider.merge.Em;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends p {
    public e(String str) {
        this.f = str;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    /* JADX INFO: renamed from: clone */
    public final Object j() {
        return (e) super.j();
    }

    @Override // com.github.catvod.spider.merge.Em.p, com.github.catvod.spider.merge.Em.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final r j() {
        return (e) super.j();
    }

    @Override // com.github.catvod.spider.merge.Em.p, com.github.catvod.spider.merge.Em.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final String t() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final String toString() {
        return u();
    }

    @Override // com.github.catvod.spider.merge.Em.r
    final void w(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.f() && this.d == 0) {
            r rVar = this.c;
            if ((rVar instanceof l) && ((l) rVar).m0().a()) {
                r(appendable, i, gVar);
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.Em.r
    final void x(Appendable appendable, int i, g gVar) {
    }
}
