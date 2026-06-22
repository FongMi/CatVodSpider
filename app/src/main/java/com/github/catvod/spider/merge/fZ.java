package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.sB;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class fZ {

    private static class aA implements Lk {
        private final jk S;
        private final i3 T4;
        private final Iw l8;

        aA(Iw iw, jk jkVar, i3 i3Var) {
            this.l8 = iw;
            this.S = jkVar;
            this.T4 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void S(A0 a0, int i) {
            if (a0 instanceof Iw) {
                Iw iw = (Iw) a0;
                if (this.T4.l8(this.l8, iw)) {
                    this.S.add(iw);
                }
            }
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void l8(A0 a0, int i) {
        }
    }

    private static class ut implements sB {

        @Nullable
        private Iw S = null;
        private final i3 T4;
        private final Iw l8;

        ut(Iw iw, i3 i3Var) {
            this.l8 = iw;
            this.T4 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.sB
        public sB.aA S(A0 a0, int i) {
            if (a0 instanceof Iw) {
                Iw iw = (Iw) a0;
                if (this.T4.l8(this.l8, iw)) {
                    this.S = iw;
                    return sB.aA.STOP;
                }
            }
            return sB.aA.CONTINUE;
        }

        @Override // com.github.catvod.spider.merge.sB
        public sB.aA l8(A0 a0, int i) {
            return sB.aA.CONTINUE;
        }
    }

    @Nullable
    public static Iw S(i3 i3Var, Iw iw) {
        ut utVar = new ut(iw, i3Var);
        uM.l8(utVar, iw);
        return utVar.S;
    }

    public static jk l8(i3 i3Var, Iw iw) {
        jk jkVar = new jk();
        uM.S(new aA(iw, jkVar, i3Var), iw);
        return jkVar;
    }
}
