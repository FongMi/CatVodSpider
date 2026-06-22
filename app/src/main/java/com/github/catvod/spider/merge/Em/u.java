package com.github.catvod.spider.merge.Em;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class u extends p {
    public u(String str) {
        this.f = str;
    }

    static boolean M(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.Em.r
    /* JADX INFO: renamed from: K */
    public u j() {
        return (u) super.j();
    }

    public final String L() {
        return I();
    }

    @Override // com.github.catvod.spider.merge.Em.p, com.github.catvod.spider.merge.Em.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.Em.p, com.github.catvod.spider.merge.Em.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public String t() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final String toString() {
        return u();
    }

    @Override // com.github.catvod.spider.merge.Em.r
    void w(Appendable appendable, int i, g gVar) throws IOException {
        boolean zF = gVar.f();
        if (zF && this.d == 0) {
            r rVar = this.c;
            if ((rVar instanceof l) && ((l) rVar).m0().a() && !com.github.catvod.spider.merge.Dw.e.c(I())) {
                r(appendable, i, gVar);
            }
        }
        n.d(appendable, I(), gVar, false, zF && !l.h0(this.c), zF && (this.c instanceof h));
    }

    @Override // com.github.catvod.spider.merge.Em.r
    void x(Appendable appendable, int i, g gVar) {
    }
}
