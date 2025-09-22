package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.Zo */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class AbstractC0108Zo {

    /* renamed from: q */
    O f572q;

    /* renamed from: com.github.catvod.spider.merge.Zo$FD */
    static final class FD extends AbstractC0108Zo {

        /* renamed from: QU */
        private String f573QU;

        /* renamed from: UJ */
        boolean f574UJ;

        /* renamed from: xC */
        private final StringBuilder f575xC;

        FD() {
            super();
            this.f575xC = new StringBuilder();
            this.f574UJ = false;
            this.f572q = O.Comment;
        }

        /* renamed from: Tz */
        private void m519Tz() {
            String str = this.f573QU;
            if (str != null) {
                this.f575xC.append(str);
                this.f573QU = null;
            }
        }

        /* renamed from: IS */
        String m520IS() {
            String str = this.f573QU;
            return str != null ? str : this.f575xC.toString();
        }

        /* renamed from: KT */
        final FD m521KT(char c) {
            m519Tz();
            this.f575xC.append(c);
            return this;
        }

        /* renamed from: k */
        final FD m522k(String str) {
            m519Tz();
            if (this.f575xC.length() == 0) {
                this.f573QU = str;
            } else {
                this.f575xC.append(str);
            }
            return this;
        }

        public String toString() {
            return "<!--" + m520IS() + "-->";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: w8 */
        AbstractC0108Zo mo517w8() {
            AbstractC0108Zo.m504F(this.f575xC);
            this.f573QU = null;
            this.f574UJ = false;
            return this;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$J */
    static class J extends AbstractC0108Zo {

        /* renamed from: xC */
        private String f576xC;

        J() {
            super();
            this.f572q = O.Character;
        }

        /* renamed from: KT */
        J m523KT(String str) {
            this.f576xC = str;
            return this;
        }

        /* renamed from: k */
        String m524k() {
            return this.f576xC;
        }

        public String toString() {
            return m524k();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: w8 */
        AbstractC0108Zo mo517w8() {
            this.f576xC = null;
            return this;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$O */
    public enum O {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$Qe */
    static final class Qe extends J {
        Qe(String str) {
            m523KT(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108Zo.J
        public String toString() {
            return "<![CDATA[" + m524k() + "]]>";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$Qt */
    static final class Qt extends AbstractC0108Zo {

        /* renamed from: Mo */
        boolean f584Mo;

        /* renamed from: QU */
        String f585QU;

        /* renamed from: UJ */
        final StringBuilder f586UJ;

        /* renamed from: u */
        final StringBuilder f587u;

        /* renamed from: xC */
        final StringBuilder f588xC;

        Qt() {
            super();
            this.f588xC = new StringBuilder();
            this.f585QU = null;
            this.f586UJ = new StringBuilder();
            this.f587u = new StringBuilder();
            this.f584Mo = false;
            this.f572q = O.Doctype;
        }

        /* renamed from: E */
        public boolean m526E() {
            return this.f584Mo;
        }

        /* renamed from: IS */
        public String m527IS() {
            return this.f587u.toString();
        }

        /* renamed from: KT */
        String m528KT() {
            return this.f588xC.toString();
        }

        /* renamed from: Tz */
        String m529Tz() {
            return this.f586UJ.toString();
        }

        /* renamed from: k */
        String m530k() {
            return this.f585QU;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: w8 */
        AbstractC0108Zo mo517w8() {
            AbstractC0108Zo.m504F(this.f588xC);
            this.f585QU = null;
            AbstractC0108Zo.m504F(this.f586UJ);
            AbstractC0108Zo.m504F(this.f587u);
            this.f584Mo = false;
            return this;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$Vm */
    static final class Vm extends yn {
        Vm() {
            this.f572q = O.StartTag;
        }

        /* renamed from: T */
        Vm m531T(String str, C0094Tz c0094Tz) {
            this.f597xC = str;
            this.f593W = c0094Tz;
            this.f591QU = C0139qf.m699q(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0108Zo.yn, com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public yn mo517w8() {
            super.mo517w8();
            this.f593W = null;
            return this;
        }

        public String toString() {
            if (!m542UN() || this.f593W.size() <= 0) {
                return "<" + m547m() + ">";
            }
            return "<" + m547m() + " " + this.f593W.toString() + ">";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$oK */
    static final class oK extends AbstractC0108Zo {
        oK() {
            super();
            this.f572q = O.EOF;
        }

        public String toString() {
            return "";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: w8 */
        AbstractC0108Zo mo517w8() {
            return this;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$t7 */
    static final class t7 extends yn {
        t7() {
            this.f572q = O.EndTag;
        }

        public String toString() {
            return "</" + m547m() + ">";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Zo$yn */
    static abstract class yn extends AbstractC0108Zo {

        /* renamed from: MH */
        private boolean f589MH;

        /* renamed from: Mo */
        private String f590Mo;

        /* renamed from: QU */
        protected String f591QU;

        /* renamed from: UJ */
        private String f592UJ;

        /* renamed from: W */
        C0094Tz f593W;

        /* renamed from: i */
        private boolean f594i;

        /* renamed from: se */
        boolean f595se;

        /* renamed from: u */
        private StringBuilder f596u;

        /* renamed from: xC */
        protected String f597xC;

        yn() {
            super();
            this.f596u = new StringBuilder();
            this.f594i = false;
            this.f589MH = false;
            this.f595se = false;
        }

        /* renamed from: l */
        private void m533l() {
            this.f589MH = true;
            String str = this.f590Mo;
            if (str != null) {
                this.f596u.append(str);
                this.f590Mo = null;
            }
        }

        /* renamed from: BP */
        final void m534BP() {
            if (this.f592UJ != null) {
                m543Xl();
            }
        }

        /* renamed from: E */
        final void m535E(int[] iArr) {
            m533l();
            for (int i : iArr) {
                this.f596u.appendCodePoint(i);
            }
        }

        /* renamed from: Fp */
        final boolean m536Fp() {
            return this.f595se;
        }

        /* renamed from: IS */
        final void m537IS(String str) {
            m533l();
            if (this.f596u.length() == 0) {
                this.f590Mo = str;
            } else {
                this.f596u.append(str);
            }
        }

        /* renamed from: KT */
        final void m538KT(char c) {
            m546k(String.valueOf(c));
        }

        /* renamed from: P */
        final yn m539P(String str) {
            this.f597xC = str;
            this.f591QU = C0139qf.m699q(str);
            return this;
        }

        /* renamed from: Tz */
        final void m540Tz(char c) {
            m533l();
            this.f596u.append(c);
        }

        /* renamed from: U */
        final void m541U() {
            this.f594i = true;
        }

        /* renamed from: UN */
        final boolean m542UN() {
            return this.f593W != null;
        }

        /* renamed from: Xl */
        final void m543Xl() {
            if (this.f593W == null) {
                this.f593W = new C0094Tz();
            }
            String str = this.f592UJ;
            if (str != null) {
                String strTrim = str.trim();
                this.f592UJ = strTrim;
                if (strTrim.length() > 0) {
                    this.f593W.m457UJ(this.f592UJ, this.f589MH ? this.f596u.length() > 0 ? this.f596u.toString() : this.f590Mo : this.f594i ? "" : null);
                }
            }
            this.f592UJ = null;
            this.f594i = false;
            this.f589MH = false;
            AbstractC0108Zo.m504F(this.f596u);
            this.f590Mo = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0108Zo
        /* renamed from: d */
        public yn mo517w8() {
            this.f597xC = null;
            this.f591QU = null;
            this.f592UJ = null;
            AbstractC0108Zo.m504F(this.f596u);
            this.f590Mo = null;
            this.f594i = false;
            this.f589MH = false;
            this.f595se = false;
            this.f593W = null;
            return this;
        }

        /* renamed from: fH */
        final String m544fH() {
            return this.f591QU;
        }

        /* renamed from: go */
        final void m545go(String str) {
            String str2 = this.f597xC;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f597xC = str;
            this.f591QU = C0139qf.m699q(str);
        }

        /* renamed from: k */
        final void m546k(String str) {
            String str2 = this.f592UJ;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f592UJ = str;
        }

        /* renamed from: m */
        final String m547m() {
            String str = this.f597xC;
            return str != null ? str : "[unset]";
        }

        /* renamed from: p */
        final void m548p(char c) {
            m545go(String.valueOf(c));
        }

        /* renamed from: pb */
        final String m549pb() {
            String str = this.f597xC;
            C0111bw.m561xC(str == null || str.length() == 0);
            return this.f597xC;
        }

        /* renamed from: yS */
        final boolean m550yS(String str) {
            C0094Tz c0094Tz = this.f593W;
            return c0094Tz != null && c0094Tz.m465w8(str);
        }
    }

    /* renamed from: F */
    static void m504F(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* renamed from: B */
    final boolean m505B() {
        return this.f572q == O.StartTag;
    }

    /* renamed from: FN */
    final boolean m506FN() {
        return this.f572q == O.EndTag;
    }

    /* renamed from: MH */
    final boolean m507MH() {
        return this.f572q == O.Comment;
    }

    /* renamed from: Mo */
    final boolean m508Mo() {
        return this instanceof Qe;
    }

    /* renamed from: QU */
    final Qt m509QU() {
        return (Qt) this;
    }

    /* renamed from: RH */
    String m510RH() {
        return getClass().getSimpleName();
    }

    /* renamed from: UJ */
    final t7 m511UJ() {
        return (t7) this;
    }

    /* renamed from: W */
    final boolean m512W() {
        return this.f572q == O.EOF;
    }

    /* renamed from: i */
    final boolean m513i() {
        return this.f572q == O.Character;
    }

    /* renamed from: q */
    final J m514q() {
        return (J) this;
    }

    /* renamed from: se */
    final boolean m515se() {
        return this.f572q == O.Doctype;
    }

    /* renamed from: u */
    final Vm m516u() {
        return (Vm) this;
    }

    /* renamed from: w8 */
    abstract AbstractC0108Zo mo517w8();

    /* renamed from: xC */
    final FD m518xC() {
        return (FD) this;
    }

    private AbstractC0108Zo() {
    }
}
