package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class v extends q {
    public v(String str) {
        this.d = str;
    }

    static boolean N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: K */
    public v i() {
        return (v) super.i();
    }

    public final String L() {
        return I();
    }

    public final boolean M() {
        return com.github.catvod.spider.merge.FM.J.b.d(I());
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public String s() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    void v(Appendable appendable, int i, g gVar) throws IOException {
        boolean z;
        boolean z2;
        boolean zI = gVar.i();
        s sVar = this.a;
        m mVar = sVar instanceof m ? (m) sVar : null;
        boolean z3 = true;
        boolean z4 = zI && !m.m0(sVar);
        if (z4) {
            boolean z5 = (this.b == 0 && mVar != null && mVar.s0().c()) || (this.a instanceof h);
            boolean z6 = r() == null && mVar != null && mVar.s0().c();
            s sVarR = r();
            if ((!(sVarR instanceof m) || !((m) sVarR).q0(gVar)) && (!(sVarR instanceof v) || !((v) sVarR).M())) {
                z3 = false;
            }
            if (z3 && M()) {
                return;
            }
            if (this.b == 0 && mVar != null && mVar.s0().a() && !M()) {
                q(appendable, i, gVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        o.d(appendable, I(), gVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    void w(Appendable appendable, int i, g gVar) {
    }
}
