package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.G.m;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.a$a, reason: collision with other inner class name */
    private static class C0012a implements e {
        private final i a;
        private final c b;
        private final d c;

        C0012a(i iVar, c cVar, d dVar) {
            this.a = iVar;
            this.b = cVar;
            this.c = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void a(m mVar, int i) {
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void b(m mVar, int i) {
            if (mVar instanceof i) {
                i iVar = (i) mVar;
                if (this.c.a(this.a, iVar)) {
                    this.b.add(iVar);
                }
            }
        }
    }

    static class b {

        @Nullable
        private i a = null;

        @Nullable
        private i b = null;
        private final d c;

        b(d dVar) {
            this.c = dVar;
        }

        @Nullable
        final i a(i iVar, i iVar2) {
            this.a = iVar;
            this.b = null;
            m mVarG = iVar2;
            int i = 0;
            while (mVarG != null) {
                int iB = b(mVarG);
                if (iB == 5) {
                    break;
                }
                int i2 = 1;
                if (iB != 1 || mVarG.h() <= 0) {
                    while (mVarG.s() == null && i > 0) {
                        if (iB == 1 || iB == 2) {
                            iB = 1;
                        }
                        m mVarA = mVarG.A();
                        i--;
                        if (iB == 4) {
                            mVarG.C();
                        }
                        mVarG = mVarA;
                        iB = 1;
                    }
                    if (iB != 1 && iB != 2) {
                        i2 = iB;
                    }
                    if (mVarG == iVar2) {
                        break;
                    }
                    m mVarS = mVarG.s();
                    if (i2 == 4) {
                        mVarG.C();
                    }
                    mVarG = mVarS;
                } else {
                    mVarG = mVarG.g(0);
                    i++;
                }
            }
            return this.b;
        }

        public final int b(m mVar) {
            if (!(mVar instanceof i)) {
                return 1;
            }
            i iVar = (i) mVar;
            if (!this.c.a(this.a, iVar)) {
                return 1;
            }
            this.b = iVar;
            return 5;
        }
    }

    public static c a(d dVar, i iVar) {
        c cVar = new c();
        com.github.catvod.spider.merge.F.a.g(new C0012a(iVar, cVar, dVar), iVar);
        return cVar;
    }
}
