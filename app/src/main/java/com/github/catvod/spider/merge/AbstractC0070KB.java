package com.github.catvod.spider.merge;

import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.KB */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class AbstractC0070KB extends AbstractC0123i {

    /* renamed from: q */
    AbstractC0123i f435q;

    /* renamed from: com.github.catvod.spider.merge.KB$FD */
    static class FD extends AbstractC0070KB {
        public FD(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return !this.f435q.mo235q(c0127lK, c0127lK2);
        }

        public String toString() {
            return String.format(":not(%s)", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$J */
    static class J extends AbstractC0070KB {
        public J(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKM665pE;
            return (c0127lK == c0127lK2 || (c0127lKM665pE = c0127lK2.m665pE()) == null || !this.f435q.mo235q(c0127lK, c0127lKM665pE)) ? false : true;
        }

        public String toString() {
            return String.format("%s + ", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$Qe */
    static class Qe extends AbstractC0070KB {
        public Qe(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb;
            return (c0127lK == c0127lK2 || (c0127lKMo278pb = c0127lK2.mo278pb()) == null || !this.f435q.mo235q(c0127lK, c0127lKMo278pb)) ? false : true;
        }

        public String toString() {
            return String.format("%s > ", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$Qt */
    static class Qt extends AbstractC0070KB {
        public Qt(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            if (c0127lK == c0127lK2) {
                return false;
            }
            for (C0127lK c0127lKMo278pb = c0127lK2.mo278pb(); c0127lKMo278pb != null; c0127lKMo278pb = c0127lKMo278pb.mo278pb()) {
                if (this.f435q.mo235q(c0127lK, c0127lKMo278pb)) {
                    return true;
                }
                if (c0127lKMo278pb == c0127lK) {
                    break;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$oK */
    static class oK extends AbstractC0070KB {
        public oK(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            if (c0127lK == c0127lK2) {
                return false;
            }
            for (C0127lK c0127lKM665pE = c0127lK2.m665pE(); c0127lKM665pE != null; c0127lKM665pE = c0127lKM665pE.m665pE()) {
                if (this.f435q.mo235q(c0127lK, c0127lKM665pE)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$p */
    static class p extends AbstractC0070KB {
        public p(AbstractC0123i abstractC0123i) {
            this.f435q = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            Iterator<C0127lK> it = c0127lK2.m651M2().iterator();
            while (it.hasNext()) {
                C0127lK next = it.next();
                if (next != c0127lK2 && this.f435q.mo235q(c0127lK2, next)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.f435q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.KB$t7 */
    static class t7 extends AbstractC0123i {
        t7() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK == c0127lK2;
        }
    }

    AbstractC0070KB() {
    }
}
