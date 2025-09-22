package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.i */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public abstract class AbstractC0123i {

    /* renamed from: com.github.catvod.spider.merge.i$Dl */
    public static final class Dl extends LA {
        public Dl(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK != c0127lK2 && c0127lK2.m657eq() < this.f684q;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f684q));
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$F */
    public static class F extends MS {
        public F(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: QU */
        protected String mo631QU() {
            return "nth-last-of-type";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: xC */
        protected int mo632xC(C0127lK c0127lK, C0127lK c0127lK2) {
            int i = 0;
            if (c0127lK2.mo278pb() == null) {
                return 0;
            }
            C0116dX c0116dXM659ip = c0127lK2.mo278pb().m659ip();
            for (int iM657eq = c0127lK2.m657eq(); iM657eq < c0116dXM659ip.size(); iM657eq++) {
                if (c0116dXM659ip.get(iM657eq).m655bA().equals(c0127lK2.m655bA())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$FD */
    public static final class FD extends AbstractC0123i {

        /* renamed from: q */
        private final String f680q;

        public FD(String str) {
            C0111bw.m557i(str);
            this.f680q = C0139qf.m699q(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            Iterator<C0133nW> it = c0127lK2.mo282u().m455Mo().iterator();
            while (it.hasNext()) {
                if (C0139qf.m699q(it.next().getKey()).startsWith(this.f680q)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.f680q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$HU */
    public static final class HU extends AbstractC0123i {

        /* renamed from: q */
        private final String f681q;

        public HU(String str) {
            this.f681q = C0139qf.m699q(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return C0139qf.m699q(c0127lK2.m660kB()).contains(this.f681q);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f681q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$J */
    public static abstract class J extends AbstractC0123i {

        /* renamed from: q */
        String f682q;

        /* renamed from: xC */
        String f683xC;

        public J(String str, String str2) {
            this(str, str2, true);
        }

        public J(String str, String str2, boolean z) {
            C0111bw.m557i(str);
            C0111bw.m557i(str2);
            this.f682q = C0139qf.m700xC(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.f683xC = z ? C0139qf.m700xC(str2) : C0139qf.m698QU(str2, z2);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$LA */
    public static abstract class LA extends AbstractC0123i {

        /* renamed from: q */
        int f684q;

        public LA(int i) {
            this.f684q = i;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$MS */
    public static abstract class MS extends AbstractC0123i {

        /* renamed from: q */
        protected final int f685q;

        /* renamed from: xC */
        protected final int f686xC;

        public MS(int i, int i2) {
            this.f685q = i;
            this.f686xC = i2;
        }

        /* renamed from: QU */
        protected abstract String mo631QU();

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb = c0127lK2.mo278pb();
            if (c0127lKMo278pb == null || (c0127lKMo278pb instanceof C0082OO)) {
                return false;
            }
            int iMo632xC = mo632xC(c0127lK, c0127lK2);
            int i = this.f685q;
            if (i == 0) {
                return iMo632xC == this.f686xC;
            }
            int i2 = this.f686xC;
            return (iMo632xC - i2) * i >= 0 && (iMo632xC - i2) % i == 0;
        }

        public String toString() {
            return this.f685q == 0 ? String.format(":%s(%d)", mo631QU(), Integer.valueOf(this.f686xC)) : this.f686xC == 0 ? String.format(":%s(%dn)", mo631QU(), Integer.valueOf(this.f685q)) : String.format(":%s(%dn%+d)", mo631QU(), Integer.valueOf(this.f685q), Integer.valueOf(this.f686xC));
        }

        /* renamed from: xC */
        protected abstract int mo632xC(C0127lK c0127lK, C0127lK c0127lK2);
    }

    /* renamed from: com.github.catvod.spider.merge.i$N */
    public static final class N extends AbstractC0123i {

        /* renamed from: q */
        private final String f687q;

        public N(String str) {
            this.f687q = str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m670wt(this.f687q);
        }

        public String toString() {
            return String.format(".%s", this.f687q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$O */
    public static final class O extends J {
        public O(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f682q) && C0139qf.m699q(c0127lK2.mo126QU(this.f682q)).startsWith(this.f683xC);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f682q, this.f683xC);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Q */
    public static final class Q extends AbstractC0123i {

        /* renamed from: q */
        private final String f688q;

        public Q(String str) {
            this.f688q = C0139qf.m699q(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return C0139qf.m699q(c0127lK2.m653a()).contains(this.f688q);
        }

        public String toString() {
            return String.format(":contains(%s)", this.f688q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Qe */
    public static final class Qe extends AbstractC0123i {

        /* renamed from: q */
        private final String f689q;

        public Qe(String str) {
            this.f689q = str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f689q);
        }

        public String toString() {
            return String.format("[%s]", this.f689q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Qt */
    public static final class Qt extends J {
        public Qt(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f682q) && this.f683xC.equalsIgnoreCase(c0127lK2.mo126QU(this.f682q).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.f682q, this.f683xC);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Sb */
    public static class Sb extends MS {
        public Sb(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: QU */
        protected String mo631QU() {
            return "nth-of-type";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: xC */
        protected int mo632xC(C0127lK c0127lK, C0127lK c0127lK2) {
            int i = 0;
            if (c0127lK2.mo278pb() == null) {
                return 0;
            }
            Iterator<C0127lK> it = c0127lK2.mo278pb().m659ip().iterator();
            while (it.hasNext()) {
                C0127lK next = it.next();
                if (next.m655bA().equals(c0127lK2.m655bA())) {
                    i++;
                }
                if (next == c0127lK2) {
                    break;
                }
            }
            return i;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Tb */
    public static final class Tb extends Sb {
        public Tb() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        public String toString() {
            return ":first-of-type";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$U */
    public static final class U extends MS {
        public U(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: QU */
        protected String mo631QU() {
            return "nth-last-child";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: xC */
        protected int mo632xC(C0127lK c0127lK, C0127lK c0127lK2) {
            if (c0127lK2.mo278pb() == null) {
                return 0;
            }
            return c0127lK2.mo278pb().m659ip().size() - c0127lK2.m657eq();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Ux */
    public static final class Ux extends LA {
        public Ux(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m657eq() > this.f684q;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f684q));
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$V */
    public static final class V extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            for (AbstractC0077NC abstractC0077NC : c0127lK2.m269W()) {
                if (!(abstractC0077NC instanceof C0149ti) && !(abstractC0077NC instanceof C0056BN)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Vm */
    public static final class Vm extends AbstractC0123i {

        /* renamed from: q */
        String f690q;

        /* renamed from: xC */
        Pattern f691xC;

        public Vm(String str, Pattern pattern) {
            this.f690q = C0139qf.m700xC(str);
            this.f691xC = pattern;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f690q) && this.f691xC.matcher(c0127lK2.mo126QU(this.f690q)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f690q, this.f691xC.toString());
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$Y */
    public static final class Y extends LA {
        public Y(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m657eq() == this.f684q;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f684q));
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$au */
    public static final class au extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            if (c0127lK2 instanceof C0086Q6) {
                return true;
            }
            for (C0119h c0119h : c0127lK2.m650Kq()) {
                C0086Q6 c0086q6 = new C0086Q6(C0073Lt.m237F(c0127lK2.m661kZ()), c0127lK2.mo124Mo(), c0127lK2.mo282u());
                c0119h.m280s(c0086q6);
                c0086q6.m658id(c0119h);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$b */
    public static final class b extends AbstractC0123i {

        /* renamed from: q */
        private final String f692q;

        public b(String str) {
            this.f692q = C0139qf.m699q(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return C0139qf.m699q(c0127lK2.m664om()).contains(this.f692q);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f692q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$d */
    public static final class d extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb = c0127lK2.mo278pb();
            if (c0127lKMo278pb == null || (c0127lKMo278pb instanceof C0082OO)) {
                return false;
            }
            Iterator<C0127lK> it = c0127lKMo278pb.m659ip().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().m655bA().equals(c0127lK2.m655bA())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$jm */
    public static final class jm extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb = c0127lK2.mo278pb();
            return (c0127lKMo278pb == null || (c0127lKMo278pb instanceof C0082OO) || !c0127lK2.m646BU().isEmpty()) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$l */
    public static final class l extends F {
        public l() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        public String toString() {
            return ":last-of-type";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$lm */
    public static final class lm extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb = c0127lK2.mo278pb();
            return (c0127lKMo278pb == null || (c0127lKMo278pb instanceof C0082OO) || c0127lK2.m657eq() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$mQ */
    public static final class mQ extends AbstractC0123i {

        /* renamed from: q */
        private final String f693q;

        public mQ(String str) {
            this.f693q = str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m644A().equals(this.f693q);
        }

        public String toString() {
            return String.format("%s", this.f693q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$oK */
    public static final class oK extends J {
        public oK(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f682q) && C0139qf.m699q(c0127lK2.mo126QU(this.f682q)).contains(this.f683xC);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f682q, this.f683xC);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$p */
    public static final class p extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$p8 */
    public static final class p8 extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            if (c0127lK instanceof C0082OO) {
                c0127lK = c0127lK.m649I(0);
            }
            return c0127lK2 == c0127lK;
        }

        public String toString() {
            return ":root";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$qB */
    public static final class qB extends MS {
        public qB(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: QU */
        protected String mo631QU() {
            return "nth-child";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i.MS
        /* renamed from: xC */
        protected int mo632xC(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m657eq() + 1;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$r */
    public static final class r extends AbstractC0123i {

        /* renamed from: q */
        private final Pattern f694q;

        public r(Pattern pattern) {
            this.f694q = pattern;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return this.f694q.matcher(c0127lK2.m653a()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.f694q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$s */
    public static final class s extends AbstractC0123i {
        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            C0127lK c0127lKMo278pb = c0127lK2.mo278pb();
            return (c0127lKMo278pb == null || (c0127lKMo278pb instanceof C0082OO) || c0127lK2.m657eq() != c0127lKMo278pb.m659ip().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$t7 */
    public static final class t7 extends J {
        public t7(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m261KT(this.f682q) && C0139qf.m699q(c0127lK2.mo126QU(this.f682q)).endsWith(this.f683xC);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f682q, this.f683xC);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$tG */
    public static final class tG extends AbstractC0123i {

        /* renamed from: q */
        private final String f695q;

        public tG(String str) {
            this.f695q = str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return c0127lK2.m644A().endsWith(this.f695q);
        }

        public String toString() {
            return String.format("%s", this.f695q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$tY */
    public static final class tY extends AbstractC0123i {

        /* renamed from: q */
        private final String f696q;

        public tY(String str) {
            this.f696q = str;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return this.f696q.equals(c0127lK2.m668uR());
        }

        public String toString() {
            return String.format("#%s", this.f696q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$vp */
    public static final class vp extends AbstractC0123i {

        /* renamed from: q */
        private final Pattern f697q;

        public vp(Pattern pattern) {
            this.f697q = pattern;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return this.f697q.matcher(c0127lK2.m660kB()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f697q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.i$yn */
    public static final class yn extends J {
        public yn(String str, String str2) {
            super(str, str2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0123i
        /* renamed from: q */
        public boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2) {
            return !this.f683xC.equalsIgnoreCase(c0127lK2.mo126QU(this.f682q));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f682q, this.f683xC);
        }
    }

    protected AbstractC0123i() {
    }

    /* renamed from: q */
    public abstract boolean mo235q(C0127lK c0127lK, C0127lK c0127lK2);
}
