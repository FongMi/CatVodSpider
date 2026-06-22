package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class v extends q {
    public v(String str) {
        this.e = str;
    }

    static boolean N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public v i() {
        return (v) super.i();
    }

    public final String L() {
        return I();
    }

    public final boolean M() {
        return C0906c.d(I());
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public String s() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    void v(Appendable appendable, int i, g gVar) {
        boolean z;
        boolean z2;
        boolean zI = gVar.i();
        s sVar = this.b;
        m mVar = sVar instanceof m ? (m) sVar : null;
        boolean z3 = true;
        boolean z4 = zI && !m.j0(sVar);
        if (z4) {
            boolean z5 = (this.c == 0 && mVar != null && mVar.q0().c()) || (this.b instanceof h);
            boolean z6 = r() == null && mVar != null && mVar.q0().c();
            s sVarR = r();
            if ((!(sVarR instanceof m) || !((m) sVarR).o0(gVar)) && (!(sVarR instanceof v) || !((v) sVarR).M())) {
                z3 = false;
            }
            if (z3 && M()) {
                return;
            }
            if (this.c == 0 && mVar != null && mVar.q0().a() && !M()) {
                q(appendable, i, gVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        o.e(appendable, I(), gVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.merge.c1.s
    void w(Appendable appendable, int i, g gVar) {
    }
}
