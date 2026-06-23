package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class p extends l {
    public p(String str) {
        this.d = str;
    }

    static boolean N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public p clone() {
        return (p) super.clone();
    }

    public final String L() {
        return I();
    }

    public final boolean M() {
        return com.github.catvod.spider.merge.F.b.d(I());
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final m m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public String t() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String toString() {
        return u();
    }

    @Override // com.github.catvod.spider.merge.G.m
    void w(Appendable appendable, int i, f.a aVar) throws IOException {
        boolean z;
        boolean z2;
        boolean zG = aVar.g();
        m mVar = this.a;
        i iVar = mVar instanceof i ? (i) mVar : null;
        boolean z3 = true;
        boolean z4 = zG && !i.l0(mVar);
        if (z4) {
            boolean z5 = (this.b == 0 && iVar != null && iVar.q0().c()) || (this.a instanceof f);
            boolean z6 = s() == null && iVar != null && iVar.q0().c();
            m mVarS = s();
            if ((!(mVarS instanceof i) || !((i) mVarS).o0(aVar)) && (!(mVarS instanceof p) || !((p) mVarS).M())) {
                z3 = false;
            }
            if (z3 && M()) {
                return;
            }
            if (this.b == 0 && iVar != null && iVar.q0().a() && !M()) {
                r(appendable, i, aVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        j.d(appendable, I(), aVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.merge.G.m
    void x(Appendable appendable, int i, f.a aVar) {
    }
}
