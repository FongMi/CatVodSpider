package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.G.m;
import com.github.catvod.spider.merge.I.a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class h extends com.github.catvod.spider.merge.I.d {
    com.github.catvod.spider.merge.I.d a;

    static class a extends h {
        final a.b b;

        public a(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
            this.b = new a.b(dVar);
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            for (int i = 0; i < iVar2.h(); i++) {
                m mVarG = iVar2.g(i);
                if ((mVarG instanceof i) && this.b.a(iVar2, (i) mVarG) != null) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":has(%s)", this.a);
        }
    }

    static class b extends h {
        public b(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarJ0;
            return (iVar == iVar2 || (iVarJ0 = iVar2.j0()) == null || !this.a.a(iVar, iVarJ0)) ? false : true;
        }

        public final String toString() {
            return String.format("%s > ", this.a);
        }
    }

    static class c extends h {
        public c(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            i iVarM0;
            return (iVar == iVar2 || (iVarM0 = iVar2.m0()) == null || !this.a.a(iVar, iVarM0)) ? false : true;
        }

        public final String toString() {
            return String.format("%s + ", this.a);
        }
    }

    static class d extends h {
        public d(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return !this.a.a(iVar, iVar2);
        }

        public final String toString() {
            return String.format(":not(%s)", this.a);
        }
    }

    static class e extends h {
        public e(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            if (iVar == iVar2) {
                return false;
            }
            do {
                iVar2 = iVar2.j0();
                if (iVar2 == null) {
                    break;
                }
                if (this.a.a(iVar, iVar2)) {
                    return true;
                }
            } while (iVar2 != iVar);
            return false;
        }

        public final String toString() {
            return String.format("%s ", this.a);
        }
    }

    static class f extends h {
        public f(com.github.catvod.spider.merge.I.d dVar) {
            this.a = dVar;
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            if (iVar == iVar2) {
                return false;
            }
            do {
                iVar2 = iVar2.m0();
                if (iVar2 == null) {
                    return false;
                }
            } while (!this.a.a(iVar, iVar2));
            return true;
        }

        public final String toString() {
            return String.format("%s ~ ", this.a);
        }
    }

    static class g extends com.github.catvod.spider.merge.I.d {
        g() {
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            return iVar == iVar2;
        }
    }

    h() {
    }
}
