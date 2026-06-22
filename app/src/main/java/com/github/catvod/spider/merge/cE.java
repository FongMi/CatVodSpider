package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class cE extends i3 {
    i3 l8;

    static class OD extends cE {
        public OD(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            if (iw == iw2) {
                return false;
            }
            for (Iw iwW8 = iw2.W8(); iwW8 != null; iwW8 = iwW8.W8()) {
                if (this.l8.l8(iw, iwW8)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.l8);
        }
    }

    static class XT extends i3 {
        XT() {
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw == iw2;
        }
    }

    static class Y extends cE {
        public Y(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwW8;
            return (iw == iw2 || (iwW8 = iw2.W8()) == null || !this.l8.l8(iw, iwW8)) ? false : true;
        }

        public String toString() {
            return String.format("%s + ", this.l8);
        }
    }

    static class aA extends cE {
        public aA(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            for (Iw iw3 : iw2.gh()) {
                if (iw3 != iw2 && this.l8.l8(iw2, iw3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.l8);
        }
    }

    static class c extends cE {
        public c(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return !this.l8.l8(iw, iw2);
        }

        public String toString() {
            return String.format(":not(%s)", this.l8);
        }
    }

    static class ut extends cE {
        public ut(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG;
            return (iw == iw2 || (iwG = iw2.G()) == null || !this.l8.l8(iw, iwG)) ? false : true;
        }

        public String toString() {
            return String.format("%s > ", this.l8);
        }
    }

    static class xq extends cE {
        public xq(i3 i3Var) {
            this.l8 = i3Var;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            if (iw == iw2) {
                return false;
            }
            for (Iw iwG = iw2.G(); iwG != null; iwG = iwG.G()) {
                if (this.l8.l8(iw, iwG)) {
                    return true;
                }
                if (iwG == iw) {
                    break;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", this.l8);
        }
    }

    cE() {
    }
}
