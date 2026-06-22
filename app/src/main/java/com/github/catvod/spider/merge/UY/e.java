package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.Mp.C0840b;
import com.github.catvod.spider.merge.Mp.F;
import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends q {
    public e(String str) {
        this.d = str;
    }

    private static boolean M(String str) {
        return str.length() > 1 && (str.startsWith(ZrJ.d("58")) || str.startsWith(ZrJ.d("46")));
    }

    @Nullable
    public final w K() {
        String strI = I();
        String strSubstring = strI.substring(1, strI.length() - 1);
        if (M(strSubstring)) {
            return null;
        }
        String str = ZrJ.d("45") + strSubstring + ZrJ.d("47");
        F f = new F(new C0840b());
        f.g();
        h hVarE = f.e(str, super.e());
        if (hVarE.y0().V().size() <= 0) {
            return null;
        }
        m mVar = hVarE.y0().U().get(0);
        w wVar = new w(t.a(hVarE).f().d(mVar.t0()), strI.startsWith(ZrJ.d("58")));
        wVar.d().e(mVar.d());
        return wVar;
    }

    public final boolean L() {
        return M(I());
    }

    @Override // com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final s i() {
        return (e) super.i();
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String s() {
        return ZrJ.d("5A20242025201737");
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (gVar.i() && this.b == 0) {
            s sVar = this.a;
            if ((sVar instanceof m) && ((m) sVar).s0().a()) {
                q(appendable, i, gVar);
            }
        }
        appendable.append(ZrJ.d("45626660")).append(I()).append(ZrJ.d("546E75"));
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
