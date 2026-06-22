package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0263g;
import java.io.Reader;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class l1 extends k1 {
    @Override // com.github.catvod.spider.merge.M.k1
    final E c() {
        return E.d;
    }

    @Override // com.github.catvod.spider.merge.M.k1
    @ParametersAreNonnullByDefault
    protected final void d(Reader reader, String str, F f) {
        super.d(reader, str, f);
        this.e.add(this.d);
        com.github.catvod.spider.merge.L.g gVarA0 = this.d.A0();
        gVarA0.j();
        gVarA0.c(com.github.catvod.spider.merge.L.n.e);
        gVarA0.h();
    }

    @Override // com.github.catvod.spider.merge.M.k1
    protected final boolean g(Q q) {
        com.github.catvod.spider.merge.L.m mVar;
        com.github.catvod.spider.merge.L.w wVarK;
        int iA = C0263g.a(q.a);
        if (iA != 0) {
            com.github.catvod.spider.merge.L.m mVar2 = null;
            if (iA == 1) {
                N n = (N) q;
                G gK = k(n.w(), this.h);
                if (n.u()) {
                    n.n.k(this.h);
                }
                E e = this.h;
                com.github.catvod.spider.merge.L.c cVar = n.n;
                e.c(cVar);
                com.github.catvod.spider.merge.L.m mVar3 = new com.github.catvod.spider.merge.L.m(gK, null, cVar);
                l(mVar3);
                if (!n.m) {
                    this.e.add(mVar3);
                } else if (!gK.g()) {
                    gK.l();
                }
            } else if (iA == 2) {
                String strD = this.h.d(((M) q).d);
                int size = this.e.size() - 1;
                int i = size >= 256 ? size - 256 : 0;
                int size2 = this.e.size();
                while (true) {
                    size2--;
                    if (size2 < i) {
                        break;
                    }
                    com.github.catvod.spider.merge.L.m mVar4 = this.e.get(size2);
                    if (mVar4.s().equals(strD)) {
                        mVar2 = mVar4;
                        break;
                    }
                }
                if (mVar2 != null) {
                    int size3 = this.e.size();
                    do {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        mVar = this.e.get(size3);
                        this.e.remove(size3);
                    } while (mVar != mVar2);
                }
            } else if (iA == 3) {
                J j = (J) q;
                com.github.catvod.spider.merge.L.e eVar = new com.github.catvod.spider.merge.L.e(j.m());
                if (j.f && eVar.L() && (wVarK = eVar.K()) != null) {
                    eVar = wVarK;
                }
                l(eVar);
            } else if (iA == 4) {
                I i2 = (I) q;
                String strL = i2.l();
                l(i2 instanceof H ? new com.github.catvod.spider.merge.L.d(strL) : new com.github.catvod.spider.merge.L.v(strL));
            } else if (iA != 5) {
                StringBuilder sbC = C0133t.c(oZP.d("200112391C30161B12254C211A04122F4C210C1F127B4C"));
                sbC.append(P.a(q.a));
                com.github.catvod.spider.merge.J.c.a(sbC.toString());
                throw null;
            }
        } else {
            K k = (K) q;
            com.github.catvod.spider.merge.L.i iVar = new com.github.catvod.spider.merge.L.i(this.h.d(k.k()), k.f.toString(), k.g.toString());
            iVar.L(k.e);
            l(iVar);
        }
        return true;
    }

    protected final void l(com.github.catvod.spider.merge.L.s sVar) {
        a().L(sVar);
    }
}
