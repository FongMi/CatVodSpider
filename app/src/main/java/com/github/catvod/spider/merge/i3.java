package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class i3 {

    public static final class D extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG = iw2.G();
            if (iwG == null || (iwG instanceof g9)) {
                return false;
            }
            Iterator<Iw> it = iwG.im().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().cE().equals(iw2.cE())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class F extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG = iw2.G();
            return (iwG == null || (iwG instanceof g9) || iw2.t2() != iwG.im().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class G extends i3 {
        private final String l8;

        public G(String str) {
            this.l8 = str;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.m().endsWith(this.l8);
        }

        public String toString() {
            return String.format("%s", this.l8);
        }
    }

    public static final class L extends rs {
        public L(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.t2() == this.l8;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.l8));
        }
    }

    public static final class MN extends i3 {
        private final String l8;

        public MN(String str) {
            this.l8 = str;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.m().equals(this.l8);
        }

        public String toString() {
            return String.format("%s", this.l8);
        }
    }

    public static final class No extends r {
        public No(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected int S(Iw iw, Iw iw2) {
            if (iw2.G() == null) {
                return 0;
            }
            return iw2.G().im().size() - iw2.t2();
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected String T4() {
            return "nth-last-child";
        }
    }

    public static final class O5 extends i3 {
        private final Pattern l8;

        public O5(Pattern pattern) {
            this.l8 = pattern;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.matcher(iw2.GO()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.l8);
        }
    }

    public static final class OD extends Y {
        public OD(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).contains(this.S);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.l8, this.S);
        }
    }

    public static final class Ph extends Y {
        public Ph(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return !this.S.equalsIgnoreCase(iw2.T4(this.l8));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.l8, this.S);
        }
    }

    public static final class Q extends Y {
        public Q(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).startsWith(this.S);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.l8, this.S);
        }
    }

    public static final class U extends i3 {
        private final String l8;

        public U(String str) {
            this.l8 = kA.l8(str);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.GO()).contains(this.l8);
        }

        public String toString() {
            return String.format(":contains(%s)", this.l8);
        }
    }

    public static final class VT extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG = iw2.G();
            return (iwG == null || (iwG instanceof g9) || iw2.t2() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class X0 extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            if (iw instanceof g9) {
                iw = iw.U(0);
            }
            return iw2 == iw;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class XT extends Y {
        public XT(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).endsWith(this.S);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.l8, this.S);
        }
    }

    public static abstract class Y extends i3 {
        String S;
        String l8;

        public Y(String str, String str2) {
            this(str, str2, true);
        }

        public Y(String str, String str2, boolean z) {
            Rc.tT(str);
            Rc.tT(str2);
            this.l8 = kA.S(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.S = z ? kA.S(str2) : kA.T4(str2, z2);
        }
    }

    public static final class Z extends r {
        public Z(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected int S(Iw iw, Iw iw2) {
            return iw2.t2() + 1;
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected String T4() {
            return "nth-child";
        }
    }

    public static final class Zv extends rs {
        public Zv(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw != iw2 && iw2.t2() < this.l8;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.l8));
        }
    }

    public static final class a extends i3 {
        private final String l8;

        public a(String str) {
            this.l8 = str;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Jb(this.l8);
        }

        public String toString() {
            return String.format(".%s", this.l8);
        }
    }

    public static final class aA extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class b extends i3 {
        private final String l8;

        public b(String str) {
            this.l8 = kA.l8(str);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.J()).contains(this.l8);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.l8);
        }
    }

    public static final class c extends i3 {
        private final String l8;

        public c(String str) {
            Rc.tT(str);
            this.l8 = kA.l8(str);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iterator<in> it = iw2.OL().l().iterator();
            while (it.hasNext()) {
                if (kA.l8(it.next().getKey()).startsWith(this.l8)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.l8);
        }
    }

    public static final class cI extends i3 {
        private final String l8;

        public cI(String str) {
            this.l8 = kA.l8(str);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.UM()).contains(this.l8);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.l8);
        }
    }

    public static final class cp extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG = iw2.G();
            return (iwG == null || (iwG instanceof g9) || !iw2.Ut().isEmpty()) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class dY extends j {
        public dY() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class ff extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            if (iw2 instanceof E2) {
                return true;
            }
            for (DQ dq : iw2.KP()) {
                E2 e2 = new E2(hs.s(iw2.F()), iw2.l(), iw2.OL());
                dq.H6(e2);
                e2.f(dq);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class i extends i3 {
        Pattern S;
        String l8;

        public i(String str, Pattern pattern) {
            this.l8 = kA.S(str);
            this.S = pattern;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8) && this.S.matcher(iw2.T4(this.l8)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.l8, this.S.toString());
        }
    }

    public static final class ib extends i3 {
        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            for (A0 a0 : iw2.n()) {
                if (!(a0 instanceof qF) && !(a0 instanceof Oi)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class ii extends rs {
        public ii(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.t2() > this.l8;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.l8));
        }
    }

    public static class j extends r {
        public j(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected int S(Iw iw, Iw iw2) {
            int i = 0;
            if (iw2.G() == null) {
                return 0;
            }
            for (Iw iw3 : iw2.G().im()) {
                if (iw3.cE().equals(iw2.cE())) {
                    i++;
                }
                if (iw3 == iw2) {
                    break;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected String T4() {
            return "nth-of-type";
        }
    }

    public static final class k extends i3 {
        private final String l8;

        public k(String str) {
            this.l8 = str;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.equals(iw2.h());
        }

        public String toString() {
            return String.format("#%s", this.l8);
        }
    }

    public static final class n extends ok {
        public n() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        public String toString() {
            return ":last-of-type";
        }
    }

    public static class ok extends r {
        public ok(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected int S(Iw iw, Iw iw2) {
            int i = 0;
            if (iw2.G() == null) {
                return 0;
            }
            jk jkVarIm = iw2.G().im();
            for (int iT2 = iw2.t2(); iT2 < jkVarIm.size(); iT2++) {
                if (jkVarIm.get(iT2).cE().equals(iw2.cE())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.i3.r
        protected String T4() {
            return "nth-last-of-type";
        }
    }

    public static final class p extends i3 {
        private final Pattern l8;

        public p(Pattern pattern) {
            this.l8 = pattern;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.matcher(iw2.UM()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.l8);
        }
    }

    public static abstract class r extends i3 {
        protected final int S;
        protected final int l8;

        public r(int i, int i2) {
            this.l8 = i;
            this.S = i2;
        }

        protected abstract int S(Iw iw, Iw iw2);

        protected abstract String T4();

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            Iw iwG = iw2.G();
            if (iwG == null || (iwG instanceof g9)) {
                return false;
            }
            int iS = S(iw, iw2);
            int i = this.l8;
            if (i == 0) {
                return iS == this.S;
            }
            int i2 = this.S;
            return (iS - i2) * i >= 0 && (iS - i2) % i == 0;
        }

        public String toString() {
            return this.l8 == 0 ? String.format(":%s(%d)", T4(), Integer.valueOf(this.S)) : this.S == 0 ? String.format(":%s(%dn)", T4(), Integer.valueOf(this.l8)) : String.format(":%s(%dn%+d)", T4(), Integer.valueOf(this.l8), Integer.valueOf(this.S));
        }
    }

    public static abstract class rs extends i3 {
        int l8;

        public rs(int i) {
            this.l8 = i;
        }
    }

    public static final class ut extends i3 {
        private final String l8;

        public ut(String str) {
            this.l8 = str;
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8);
        }

        public String toString() {
            return String.format("[%s]", this.l8);
        }
    }

    public static final class xq extends Y {
        public xq(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8) && this.S.equalsIgnoreCase(iw2.T4(this.l8).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.l8, this.S);
        }
    }

    protected i3() {
    }

    public abstract boolean l8(Iw iw, Iw iw2);
}
