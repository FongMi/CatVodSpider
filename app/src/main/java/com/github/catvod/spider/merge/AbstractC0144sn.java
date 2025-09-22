package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.sn */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class AbstractC0144sn extends AbstractC0123i {

    /* renamed from: q */
    final ArrayList<AbstractC0123i> f737q;

    /* renamed from: xC */
    int f738xC;

    /* renamed from: com.github.catvod.spider.merge.sn$p */
    static final class p extends AbstractC0144sn {
        p(Collection<AbstractC0123i> collection) {
            super(collection);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            for (int i = this.f738xC - 1; i >= 0; i--) {
                if (!this.f737q.get(i).mo235q(c0127lK, c0127lK2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return C0157x3.m773W(this.f737q, "");
        }

        p(AbstractC0123i... abstractC0123iArr) {
            this(Arrays.asList(abstractC0123iArr));
        }
    }

    AbstractC0144sn() {
        this.f738xC = 0;
        this.f737q = new ArrayList<>();
    }

    @Nullable
    /* renamed from: QU */
    AbstractC0123i m705QU() {
        int i = this.f738xC;
        if (i > 0) {
            return this.f737q.get(i - 1);
        }
        return null;
    }

    /* renamed from: UJ */
    void m706UJ() {
        this.f738xC = this.f737q.size();
    }

    /* renamed from: xC */
    void m707xC(AbstractC0123i abstractC0123i) {
        this.f737q.set(this.f738xC - 1, abstractC0123i);
    }

    AbstractC0144sn(Collection<AbstractC0123i> collection) {
        this();
        this.f737q.addAll(collection);
        m706UJ();
    }

    /* renamed from: com.github.catvod.spider.merge.sn$Qe */
    static final class Qe extends AbstractC0144sn {
        Qe(Collection<AbstractC0123i> collection) {
            if (this.f738xC > 1) {
                this.f737q.add(new p(collection));
            } else {
                this.f737q.addAll(collection);
            }
            m706UJ();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            for (int i = 0; i < this.f738xC; i++) {
                if (this.f737q.get(i).mo235q(c0127lK, c0127lK2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return C0157x3.m773W(this.f737q, ", ");
        }

        /* renamed from: u */
        public void m708u(AbstractC0123i abstractC0123i) {
            this.f737q.add(abstractC0123i);
            m706UJ();
        }

        Qe(AbstractC0123i... abstractC0123iArr) {
            this(Arrays.asList(abstractC0123iArr));
        }

        Qe() {
        }
    }
}
