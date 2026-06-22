package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.C0019b;
import com.github.catvod.spider.merge.M.E;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.M.G;
import com.github.catvod.spider.merge.N.C0085s;
import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class h extends m {
    private g j;
    private F k;
    private int l;

    static {
        new C0085s(oZP.d("0106032D09"), 1);
    }

    public h(String str) {
        super(G.m(oZP.d("561D182E18"), E.c), str, null);
        this.j = new g();
        this.l = 1;
        this.k = new F(new C0019b());
    }

    public final g A0() {
        return this.j;
    }

    public final h B0(F f) {
        this.k = f;
        return this;
    }

    public final F C0() {
        return this.k;
    }

    public final h D0() {
        this.l = 2;
        return this;
    }

    public final int E0() {
        return this.l;
    }

    public final h F0() {
        h hVar = new h(e());
        c cVar = this.g;
        if (cVar != null) {
            hVar.g = cVar.clone();
        }
        hVar.j = this.j.clone();
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.L.m, com.github.catvod.spider.merge.L.s
    public final String s() {
        return oZP.d("560B18221938100103");
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final String t() {
        return c0();
    }

    @Override // com.github.catvod.spider.merge.L.m
    public final m u0(String str) {
        y0().u0(str);
        return this;
    }

    public final m y0() {
        m mVarN;
        m next;
        Iterator<m> it = U().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String strD = oZP.d("1D1B1A2D");
            if (!zHasNext) {
                mVarN = N(strD);
                break;
            }
            mVarN = it.next();
            if (mVarN.i0().equals(strD)) {
                break;
            }
        }
        Iterator<m> it2 = mVarN.U().iterator();
        do {
            boolean zHasNext2 = it2.hasNext();
            String strD2 = oZP.d("17001338");
            if (!zHasNext2) {
                return mVarN.N(strD2);
            }
            next = it2.next();
            if (strD2.equals(next.i0())) {
                break;
            }
        } while (!oZP.d("131D162C0926101B").equals(next.i0()));
        return next;
    }

    @Override // com.github.catvod.spider.merge.L.m, com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h i() {
        h hVar = (h) super.i();
        hVar.j = this.j.clone();
        return hVar;
    }
}
