package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.L.C0219b;
import com.github.catvod.spider.merge.FM.L.E;
import com.github.catvod.spider.merge.FM.L.F;
import com.github.catvod.spider.merge.FM.L.G;
import com.github.catvod.spider.merge.FM.M.C0285s;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h extends m {
    private g j;
    private F k;
    private int l;

    static {
        new C0285s("title", 1);
    }

    public h(String str) {
        super(G.m("#root", E.c), str, null);
        this.j = new g();
        this.l = 1;
        this.k = new F(new C0219b());
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

    @Override // com.github.catvod.spider.merge.FM.K.m, com.github.catvod.spider.merge.FM.K.s
    public final String s() {
        return "#document";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String t() {
        return c0();
    }

    @Override // com.github.catvod.spider.merge.FM.K.m
    public final m u0(String str) {
        y0().u0(str);
        return this;
    }

    public final m y0() {
        m mVarN;
        Iterator<m> it = U().iterator();
        while (true) {
            if (!it.hasNext()) {
                mVarN = N("html");
                break;
            }
            mVarN = it.next();
            if (mVarN.i0().equals("html")) {
                break;
            }
        }
        for (m mVar : mVarN.U()) {
            if ("body".equals(mVar.i0()) || "frameset".equals(mVar.i0())) {
                return mVar;
            }
        }
        return mVarN.N("body");
    }

    @Override // com.github.catvod.spider.merge.FM.K.m, com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h i() {
        h hVar = (h) super.i();
        hVar.j = this.j.clone();
        return hVar;
    }
}
