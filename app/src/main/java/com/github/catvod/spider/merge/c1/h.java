package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.d1.C0972E;
import com.github.catvod.spider.merge.d1.F;
import com.github.catvod.spider.merge.d1.G;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h extends m {
    private g k;
    private F l;
    private int m;
    private final String n;
    private boolean o;

    public h(String str) {
        super(G.m("#root", C0972E.c), str, null);
        this.k = new g();
        this.m = 1;
        this.o = false;
        this.n = str;
        this.l = F.b();
    }

    private m A0() {
        for (m mVar : S()) {
            if (mVar.f0().equals("html")) {
                return mVar;
            }
        }
        return M("html");
    }

    public final String B0() {
        return this.n;
    }

    public final g C0() {
        return this.k;
    }

    public final h D0(F f) {
        this.l = f;
        return this;
    }

    public final F E0() {
        return this.l;
    }

    public final h F0() {
        this.m = 2;
        return this;
    }

    public final int G0() {
        return this.m;
    }

    public final h H0() {
        h hVar = new h(e());
        C0947c c0947c = this.h;
        if (c0947c != null) {
            hVar.h = c0947c.clone();
        }
        hVar.k = this.k.clone();
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.c1.m, com.github.catvod.spider.merge.c1.s
    public final String s() {
        return "#document";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String t() {
        return b0();
    }

    public final m v0() {
        m mVarA0 = A0();
        for (m mVar : mVarA0.S()) {
            if ("body".equals(mVar.f0()) || "frameset".equals(mVar.f0())) {
                return mVar;
            }
        }
        return mVarA0.M("body");
    }

    public final Charset w0() {
        return this.k.b();
    }

    public final void x0(Charset charset) {
        w wVar;
        m mVar;
        this.o = true;
        this.k.a(charset);
        if (this.o) {
            int iJ = this.k.j();
            if (iJ == 1) {
                m mVarM0 = m0("meta[charset]");
                if (mVarM0 == null) {
                    m mVarA0 = A0();
                    Iterator<m> it = mVarA0.S().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = new m(G.m("head", t.a(mVarA0).g()), mVarA0.e(), null);
                            mVarA0.i0(mVar);
                            break;
                        } else {
                            mVar = it.next();
                            if (mVar.f0().equals("head")) {
                                break;
                            }
                        }
                    }
                    mVarM0 = mVar.M("meta");
                }
                mVarM0.P("charset", w0().displayName());
                Iterator<m> it2 = l0("meta[name=charset]").iterator();
                while (it2.hasNext()) {
                    it2.next().B();
                }
                return;
            }
            if (iJ == 2) {
                s sVar = m().get(0);
                if (sVar instanceof w) {
                    w wVar2 = (w) sVar;
                    if (wVar2.I().equals("xml")) {
                        wVar2.H("encoding", w0().displayName());
                        if (wVar2.n("version")) {
                            wVar2.H("version", "1.0");
                            return;
                        }
                        return;
                    }
                    wVar = new w("xml", false);
                } else {
                    wVar = new w("xml", false);
                }
                wVar.H("version", "1.0");
                wVar.H("encoding", w0().displayName());
                i0(wVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.c1.m, com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h i() {
        h hVar = (h) super.i();
        hVar.k = this.k.clone();
        return hVar;
    }

    public final i z0() {
        for (s sVar : this.g) {
            if (sVar instanceof i) {
                return (i) sVar;
            }
            if (!(sVar instanceof q)) {
                return null;
            }
        }
        return null;
    }
}
