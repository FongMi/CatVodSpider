package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.d1.F;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends q {
    public e(String str) {
        this.e = str;
    }

    private static boolean N(String str) {
        return str.length() > 1 && (str.startsWith("!") || str.startsWith("?"));
    }

    public final w K() {
        String strI = I();
        String strSubstring = strI.substring(1, strI.length() - 1);
        if (N(strSubstring)) {
            return null;
        }
        String strA = t0.a("<", strSubstring, ">");
        F fB = F.b();
        fB.h();
        h hVarF = fB.f(strA, super.e());
        if (hVarF.v0().T().size() <= 0) {
            return null;
        }
        m mVarR = hVarF.v0().R();
        w wVar = new w(t.a(hVarF).g().d(mVarR.r0()), strI.startsWith("!"));
        wVar.d().e(mVarR.d());
        return wVar;
    }

    public final String L() {
        return I();
    }

    public final boolean M() {
        return N(I());
    }

    @Override // com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final s i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String s() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.i() && this.c == 0) {
            s sVar = this.b;
            if ((sVar instanceof m) && ((m) sVar).q0().a()) {
                q(appendable, i, gVar);
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.c1.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
