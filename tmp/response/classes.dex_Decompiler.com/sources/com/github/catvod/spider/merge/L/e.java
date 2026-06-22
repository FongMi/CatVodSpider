package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.C0019b;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e extends q {
    public e(String str) {
        this.d = str;
    }

    private static boolean M(String str) {
        return str.length() > 1 && (str.startsWith(oZP.d("54")) || str.startsWith(oZP.d("4A")));
    }

    @Nullable
    public final w K() {
        String strI = I();
        String strSubstring = strI.substring(1, strI.length() - 1);
        if (M(strSubstring)) {
            return null;
        }
        String str = oZP.d("49") + strSubstring + oZP.d("4B");
        F f = new F(new C0019b());
        f.g();
        h hVarE = f.e(str, super.e());
        if (hVarE.y0().V().size() <= 0) {
            return null;
        }
        m mVar = hVarE.y0().U().get(0);
        w wVar = new w(t.a(hVarE).f().d(mVar.t0()), strI.startsWith(oZP.d("54")));
        wVar.d().e(mVar.d());
        return wVar;
    }

    public final boolean L() {
        return M(I());
    }

    @Override // com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.L.q, com.github.catvod.spider.merge.L.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final s i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.L.q, com.github.catvod.spider.merge.L.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final String s() {
        return oZP.d("560C182C01301B1B");
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.L.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.i() && this.b == 0) {
            s sVar = this.a;
            if ((sVar instanceof m) && ((m) sVar).s0().a()) {
                q(appendable, i, gVar);
            }
        }
        appendable.append(oZP.d("494E5A6C")).append(I()).append(oZP.d("584249"));
    }

    @Override // com.github.catvod.spider.merge.L.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
