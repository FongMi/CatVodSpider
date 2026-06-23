package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.d0.C0125b;
import com.github.catvod.spider.merge.C0.d0.D;
import com.github.catvod.spider.merge.C0.d0.E;
import com.github.catvod.spider.merge.C0.d0.F;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h extends l {
    private g l;
    private E m;
    private int n;

    public h() {
        super(F.l("#root", D.c), "", null);
        this.l = new g();
        this.n = 1;
        this.m = new E(new C0125b());
    }

    @Override // com.github.catvod.spider.merge.C0.c0.l
    public final l o0(String str) {
        l lVarM;
        l lVarM2;
        Iterator<l> it = Q().iterator();
        while (true) {
            if (!it.hasNext()) {
                lVarM = M("html");
                break;
            }
            l next = it.next();
            if (next.d0().equals("html")) {
                lVarM = next;
                break;
            }
        }
        Iterator<l> it2 = lVarM.Q().iterator();
        while (true) {
            if (!it2.hasNext()) {
                lVarM2 = lVarM.M("body");
                break;
            }
            lVarM2 = it2.next();
            if ("body".equals(lVarM2.d0()) || "frameset".equals(lVarM2.d0())) {
                break;
            }
        }
        lVarM2.o0(str);
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.l, com.github.catvod.spider.merge.C0.c0.r
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h j() {
        h hVar = (h) super.j();
        hVar.l = this.l.clone();
        return hVar;
    }

    public final g s0() {
        return this.l;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.l, com.github.catvod.spider.merge.C0.c0.r
    public final String t() {
        return "#document";
    }

    public final h t0(E e) {
        this.m = e;
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final String u() {
        return X();
    }

    public final E u0() {
        return this.m;
    }

    public final h v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return this.n;
    }
}
