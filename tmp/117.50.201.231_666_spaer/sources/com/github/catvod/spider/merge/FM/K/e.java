package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.L.C0219b;
import com.github.catvod.spider.merge.FM.L.F;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e extends q {
    public e(String str) {
        this.d = str;
    }

    private static boolean M(String str) {
        return str.length() > 1 && (str.startsWith("!") || str.startsWith("?"));
    }

    @Nullable
    public final w K() {
        String strI = I();
        String strSubstring = strI.substring(1, strI.length() - 1);
        if (M(strSubstring)) {
            return null;
        }
        F f = new F(new C0219b());
        f.g();
        h hVarE = f.e("<" + strSubstring + ">", super.e());
        if (hVarE.y0().V().size() <= 0) {
            return null;
        }
        m mVar = hVarE.y0().U().get(0);
        w wVar = new w(t.a(hVarE).f().d(mVar.t0()), strI.startsWith("!"));
        wVar.d().e(mVar.d());
        return wVar;
    }

    public final boolean L() {
        return M(I());
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final s i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String s() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.i() && this.b == 0) {
            s sVar = this.a;
            if ((sVar instanceof m) && ((m) sVar).s0().a()) {
                q(appendable, i, gVar);
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
