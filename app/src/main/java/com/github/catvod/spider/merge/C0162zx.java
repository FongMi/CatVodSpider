package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.InterfaceC0054A;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.zx */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0162zx {

    /* renamed from: com.github.catvod.spider.merge.zx$Qe */
    private static class Qe implements InterfaceC0054A {

        /* renamed from: QU */
        private final AbstractC0123i f771QU;

        /* renamed from: q */
        private final C0127lK f772q;

        /* renamed from: xC */
        @Nullable
        private C0127lK f773xC = null;

        Qe(C0127lK c0127lK, AbstractC0123i abstractC0123i) {
            this.f772q = c0127lK;
            this.f771QU = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0054A
        /* renamed from: q */
        public InterfaceC0054A.p mo116q(AbstractC0077NC abstractC0077NC, int i) {
            return InterfaceC0054A.p.CONTINUE;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0054A
        /* renamed from: xC */
        public InterfaceC0054A.p mo117xC(AbstractC0077NC abstractC0077NC, int i) {
            if (abstractC0077NC instanceof C0127lK) {
                C0127lK c0127lK = (C0127lK) abstractC0077NC;
                if (this.f771QU.mo235q(this.f772q, c0127lK)) {
                    this.f773xC = c0127lK;
                    return InterfaceC0054A.p.STOP;
                }
            }
            return InterfaceC0054A.p.CONTINUE;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.zx$p */
    private static class p implements InterfaceC0150u2 {

        /* renamed from: QU */
        private final AbstractC0123i f774QU;

        /* renamed from: q */
        private final C0127lK f775q;

        /* renamed from: xC */
        private final C0116dX f776xC;

        p(C0127lK c0127lK, C0116dX c0116dX, AbstractC0123i abstractC0123i) {
            this.f775q = c0127lK;
            this.f776xC = c0116dX;
            this.f774QU = abstractC0123i;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: q */
        public void mo287q(AbstractC0077NC abstractC0077NC, int i) {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: xC */
        public void mo288xC(AbstractC0077NC abstractC0077NC, int i) {
            if (abstractC0077NC instanceof C0127lK) {
                C0127lK c0127lK = (C0127lK) abstractC0077NC;
                if (this.f774QU.mo235q(this.f775q, c0127lK)) {
                    this.f776xC.add(c0127lK);
                }
            }
        }
    }

    /* renamed from: q */
    public static C0116dX m785q(AbstractC0123i abstractC0123i, C0127lK c0127lK) {
        C0116dX c0116dX = new C0116dX();
        C0075Mj.m252xC(new p(c0127lK, c0116dX, abstractC0123i), c0127lK);
        return c0116dX;
    }

    @Nullable
    /* renamed from: xC */
    public static C0127lK m786xC(AbstractC0123i abstractC0123i, C0127lK c0127lK) {
        Qe qe = new Qe(c0127lK, abstractC0123i);
        C0075Mj.m251q(qe, c0127lK);
        return qe.f773xC;
    }
}
