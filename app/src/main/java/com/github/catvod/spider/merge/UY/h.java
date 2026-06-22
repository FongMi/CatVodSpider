package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.C0735s;
import com.github.catvod.spider.merge.Mp.C0840b;
import com.github.catvod.spider.merge.Mp.E;
import com.github.catvod.spider.merge.Mp.F;
import com.github.catvod.spider.merge.Mp.G;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h extends m {
    private g j;
    private F k;
    private int l;

    static {
        new C0735s(ZrJ.d("0D2A3F212D"), 1);
    }

    public h(String str) {
        super(G.m(ZrJ.d("5A3124223C"), E.c), str, null);
        this.j = new g();
        this.l = 1;
        this.k = new F(new C0840b());
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

    @Override // com.github.catvod.spider.merge.UY.m, com.github.catvod.spider.merge.UY.s
    public final String s() {
        return ZrJ.d("5A27242E3D281C2D3F");
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String t() {
        return c0();
    }

    @Override // com.github.catvod.spider.merge.UY.m
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
            String strD = ZrJ.d("11372621");
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
            String strD2 = ZrJ.d("1B2C2F34");
            if (!zHasNext2) {
                return mVarN.N(strD2);
            }
            next = it2.next();
            if (strD2.equals(next.i0())) {
                break;
            }
        } while (!ZrJ.d("1F312A202D361C37").equals(next.i0()));
        return next;
    }

    @Override // com.github.catvod.spider.merge.UY.m, com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h i() {
        h hVar = (h) super.i();
        hVar.j = this.j.clone();
        return hVar;
    }
}
