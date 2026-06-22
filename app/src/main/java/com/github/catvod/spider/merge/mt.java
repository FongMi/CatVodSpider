package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class mt {
    Q l8;

    static final class OD extends mt {
        OD() {
            super();
            this.l8 = Q.EOF;
        }

        @Override // com.github.catvod.spider.merge.mt
        mt cD() {
            return this;
        }

        public String toString() {
            return "";
        }
    }

    static abstract class Ph extends mt {
        boolean HM;
        private boolean N;
        private StringBuilder OL;
        protected String S;
        protected String T4;
        private String b;
        private String l;
        Rz n;
        private boolean tT;

        Ph() {
            super();
            this.OL = new StringBuilder();
            this.tT = false;
            this.N = false;
            this.HM = false;
        }

        private void C() {
            this.N = true;
            String str = this.l;
            if (str != null) {
                this.OL.append(str);
                this.l = null;
            }
        }

        final String A0() {
            return this.T4;
        }

        final void E9(String str) {
            String str2 = this.b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.b = str;
        }

        final String G() {
            String str = this.S;
            Rc.S(str == null || str.length() == 0);
            return this.S;
        }

        final void Kf(char c) {
            E9(String.valueOf(c));
        }

        final String O() {
            String str = this.S;
            return str != null ? str : "[unset]";
        }

        final void OY() {
            if (this.b != null) {
                oH();
            }
        }

        final void Q(char c) {
            W(String.valueOf(c));
        }

        final boolean R() {
            return this.n != null;
        }

        final void W(String str) {
            String str2 = this.S;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.S = str;
            this.T4 = kA.l8(str);
        }

        final boolean bc() {
            return this.HM;
        }

        final void c(String str) {
            C();
            if (this.OL.length() == 0) {
                this.l = str;
            } else {
                this.OL.append(str);
            }
        }

        final void d() {
            this.tT = true;
        }

        final void eD(int[] iArr) {
            C();
            for (int i : iArr) {
                this.OL.appendCodePoint(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.mt
        /* JADX INFO: renamed from: hd, reason: merged with bridge method [inline-methods] */
        public Ph cD() {
            this.S = null;
            this.T4 = null;
            this.b = null;
            mt.s(this.OL);
            this.l = null;
            this.tT = false;
            this.N = false;
            this.HM = false;
            this.n = null;
            return this;
        }

        final void oH() {
            if (this.n == null) {
                this.n = new Rz();
            }
            String str = this.b;
            if (str != null) {
                String strTrim = str.trim();
                this.b = strTrim;
                if (strTrim.length() > 0) {
                    this.n.b(this.b, this.N ? this.OL.length() > 0 ? this.OL.toString() : this.l : this.tT ? "" : null);
                }
            }
            this.b = null;
            this.tT = false;
            this.N = false;
            mt.s(this.OL);
            this.l = null;
        }

        final boolean r1(String str) {
            Rz rz = this.n;
            return rz != null && rz.cD(str);
        }

        final Ph rD(String str) {
            this.S = str;
            this.T4 = kA.l8(str);
            return this;
        }

        final void uS(char c) {
            C();
            this.OL.append(c);
        }
    }

    public enum Q {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    static final class XT extends Ph {
        XT() {
            this.l8 = Q.EndTag;
        }

        public String toString() {
            return "</" + O() + ">";
        }
    }

    static class Y extends mt {
        private String S;

        Y() {
            super();
            this.l8 = Q.Character;
        }

        String E9() {
            return this.S;
        }

        Y Kf(String str) {
            this.S = str;
            return this;
        }

        @Override // com.github.catvod.spider.merge.mt
        mt cD() {
            this.S = null;
            return this;
        }

        public String toString() {
            return E9();
        }
    }

    static final class c extends mt {
        private final StringBuilder S;
        private String T4;
        boolean b;

        c() {
            super();
            this.S = new StringBuilder();
            this.b = false;
            this.l8 = Q.Comment;
        }

        private void uS() {
            String str = this.T4;
            if (str != null) {
                this.S.append(str);
                this.T4 = null;
            }
        }

        final c E9(String str) {
            uS();
            if (this.S.length() == 0) {
                this.T4 = str;
            } else {
                this.S.append(str);
            }
            return this;
        }

        final c Kf(char c) {
            uS();
            this.S.append(c);
            return this;
        }

        String c() {
            String str = this.T4;
            return str != null ? str : this.S.toString();
        }

        @Override // com.github.catvod.spider.merge.mt
        mt cD() {
            mt.s(this.S);
            this.T4 = null;
            this.b = false;
            return this;
        }

        public String toString() {
            return "<!--" + c() + "-->";
        }
    }

    static final class i extends Ph {
        i() {
            this.l8 = Q.StartTag;
        }

        i Bz(String str, Rz rz) {
            this.S = str;
            this.n = rz;
            this.T4 = kA.l8(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.mt.Ph, com.github.catvod.spider.merge.mt
        /* JADX INFO: renamed from: hd */
        public Ph cD() {
            super.cD();
            this.n = null;
            return this;
        }

        public String toString() {
            if (!R() || this.n.size() <= 0) {
                return "<" + O() + ">";
            }
            return "<" + O() + " " + this.n.toString() + ">";
        }
    }

    static final class ut extends Y {
        ut(String str) {
            Kf(str);
        }

        @Override // com.github.catvod.spider.merge.mt.Y
        public String toString() {
            return "<![CDATA[" + E9() + "]]>";
        }
    }

    static final class xq extends mt {
        final StringBuilder OL;
        final StringBuilder S;
        String T4;
        final StringBuilder b;
        boolean l;

        xq() {
            super();
            this.S = new StringBuilder();
            this.T4 = null;
            this.b = new StringBuilder();
            this.OL = new StringBuilder();
            this.l = false;
            this.l8 = Q.Doctype;
        }

        String E9() {
            return this.T4;
        }

        String Kf() {
            return this.S.toString();
        }

        public String c() {
            return this.OL.toString();
        }

        @Override // com.github.catvod.spider.merge.mt
        mt cD() {
            mt.s(this.S);
            this.T4 = null;
            mt.s(this.b);
            mt.s(this.OL);
            this.l = false;
            return this;
        }

        public boolean eD() {
            return this.l;
        }

        String uS() {
            return this.b.toString();
        }
    }

    static void s(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    final boolean A() {
        return this.l8 == Q.StartTag;
    }

    final boolean HM() {
        return this.l8 == Q.Doctype;
    }

    final boolean N() {
        return this.l8 == Q.Comment;
    }

    final i OL() {
        return (i) this;
    }

    final c S() {
        return (c) this;
    }

    final xq T4() {
        return (xq) this;
    }

    final XT b() {
        return (XT) this;
    }

    abstract mt cD();

    String hR() {
        return getClass().getSimpleName();
    }

    final boolean l() {
        return this instanceof ut;
    }

    final Y l8() {
        return (Y) this;
    }

    final boolean n() {
        return this.l8 == Q.EOF;
    }

    final boolean tT() {
        return this.l8 == Q.Character;
    }

    final boolean v() {
        return this.l8 == Q.EndTag;
    }

    private mt() {
    }
}
