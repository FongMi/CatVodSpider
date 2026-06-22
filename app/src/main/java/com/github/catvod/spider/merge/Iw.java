package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.i3;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Iw extends A0 {
    List<A0> HM;

    @Nullable
    private WeakReference<List<Iw>> N;

    @Nullable
    private Rz n;
    private hs tT;
    private static final List<Iw> b = Collections.emptyList();
    private static final Pattern OL = Pattern.compile("\\s+");
    private static final String l = "/baseUri";

    class aA implements Lk {
        final /* synthetic */ StringBuilder l8;

        aA(StringBuilder sb) {
            this.l8 = sb;
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void S(A0 a0, int i) {
            if (a0 instanceof DQ) {
                Iw.x(this.l8, (DQ) a0);
            } else if (a0 instanceof Iw) {
                Iw iw = (Iw) a0;
                if (this.l8.length() > 0) {
                    if ((iw.OT() || iw.tT.T4().equals("br")) && !DQ.Y(this.l8)) {
                        this.l8.append(' ');
                    }
                }
            }
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void l8(A0 a0, int i) {
            if ((a0 instanceof Iw) && ((Iw) a0).OT() && (a0.eD() instanceof DQ) && !DQ.Y(this.l8)) {
                this.l8.append(' ');
            }
        }
    }

    private static final class ut extends oU<A0> {
        private final Iw l8;

        ut(Iw iw, int i) {
            super(i);
            this.l8 = iw;
        }

        @Override // com.github.catvod.spider.merge.oU
        public void l8() {
            this.l8.W();
        }
    }

    public Iw(hs hsVar, @Nullable String str, @Nullable Rz rz) {
        Rc.HM(hsVar);
        this.HM = A0.l8;
        this.n = rz;
        this.tT = hsVar;
        if (str != null) {
            o(str);
        }
    }

    private static String DX(Iw iw, String str) {
        while (iw != null) {
            Rz rz = iw.n;
            if (rz != null && rz.cD(str)) {
                return iw.n.v(str);
            }
            iw = iw.G();
        }
        return "";
    }

    private static void FG(Iw iw, StringBuilder sb) {
        if (!iw.tT.T4().equals("br") || DQ.Y(sb)) {
            return;
        }
        sb.append(" ");
    }

    static boolean Kw(@Nullable A0 a0) {
        if (a0 instanceof Iw) {
            Iw iwG = (Iw) a0;
            int i = 0;
            while (!iwG.tT.v()) {
                iwG = iwG.G();
                i++;
                if (i >= 6 || iwG == null) {
                }
            }
            return true;
        }
        return false;
    }

    private void b6(StringBuilder sb) {
        for (A0 a0 : this.HM) {
            if (a0 instanceof DQ) {
                x(sb, (DQ) a0);
            } else if (a0 instanceof Iw) {
                FG((Iw) a0, sb);
            }
        }
    }

    private boolean e(g9.aA aAVar) {
        return (!cE().tT() || cE().OL() || (G() != null && !G().OT()) || oH() == null || aAVar.tT()) ? false : true;
    }

    private static <E extends Iw> int n6(Iw iw, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == iw) {
                return i;
            }
        }
        return 0;
    }

    private boolean vi(g9.aA aAVar) {
        return this.tT.S() || (G() != null && G().cE().S()) || aAVar.tT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(StringBuilder sb, DQ dq) {
        String strFG = dq.FG();
        if (Kw(dq.S) || (dq instanceof PU)) {
            sb.append(strFG);
        } else {
            tv.l8(sb, strFG, DQ.Y(sb));
        }
    }

    public Iw B(String str, String str2) {
        super.b(str, str2);
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0
    protected boolean E9() {
        return this.n != null;
    }

    public String F() {
        return this.tT.T4();
    }

    public String GO() {
        StringBuilder sbS = tv.S();
        uM.S(new aA(sbS), this);
        return tv.cD(sbS).trim();
    }

    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Iw v() {
        return (Iw) super.v();
    }

    @Override // com.github.catvod.spider.merge.A0
    public int HM() {
        return this.HM.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Iw A(@Nullable A0 a0) {
        Iw iw = (Iw) super.A(a0);
        Rz rz = this.n;
        iw.n = rz != null ? rz.clone() : null;
        ut utVar = new ut(iw, this.HM.size());
        iw.HM = utVar;
        utVar.addAll(this.HM);
        return iw;
    }

    public String J() {
        StringBuilder sbS = tv.S();
        for (A0 a0 : this.HM) {
            if (a0 instanceof Lh) {
                sbS.append(((Lh) a0).FG());
            } else if (a0 instanceof qF) {
                sbS.append(((qF) a0).FG());
            } else if (a0 instanceof Iw) {
                sbS.append(((Iw) a0).J());
            } else if (a0 instanceof PU) {
                sbS.append(((PU) a0).FG());
            }
        }
        return tv.cD(sbS);
    }

    public boolean Jb(String str) {
        Rz rz = this.n;
        if (rz == null) {
            return false;
        }
        String strA = rz.A("class");
        int length = strA.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strA);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strA.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strA.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strA.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public List<DQ> KP() {
        ArrayList arrayList = new ArrayList();
        for (A0 a0 : this.HM) {
            if (a0 instanceof DQ) {
                arrayList.add((DQ) a0);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final Iw G() {
        return (Iw) this.S;
    }

    public jk LD(String str) {
        return aI.l8(str, this);
    }

    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: Nb, reason: merged with bridge method [inline-methods] */
    public Iw PP() {
        return (Iw) super.PP();
    }

    @Override // com.github.catvod.spider.merge.A0
    public Rz OL() {
        if (this.n == null) {
            this.n = new Rz();
        }
        return this.n;
    }

    public boolean OT() {
        return this.tT.b();
    }

    @Override // com.github.catvod.spider.merge.A0
    public String Q() {
        return this.tT.T4();
    }

    @Override // com.github.catvod.spider.merge.A0
    void R(Appendable appendable, int i, g9.aA aAVar) throws IOException {
        if (this.HM.isEmpty() && this.tT.HM()) {
            return;
        }
        if (aAVar.HM() && !this.HM.isEmpty() && (this.tT.S() || (aAVar.tT() && (this.HM.size() > 1 || (this.HM.size() == 1 && !(this.HM.get(0) instanceof DQ)))))) {
            c(appendable, i, aAVar);
        }
        appendable.append("</").append(F()).append('>');
    }

    public Iw U(int i) {
        return ec().get(i);
    }

    public String UM() {
        StringBuilder sbS = tv.S();
        b6(sbS);
        return tv.cD(sbS).trim();
    }

    public jk Ut() {
        if (this.S == null) {
            return new jk(0);
        }
        List<Iw> listEc = G().ec();
        jk jkVar = new jk(listEc.size() - 1);
        for (Iw iw : listEc) {
            if (iw != this) {
                jkVar.add(iw);
            }
        }
        return jkVar;
    }

    @Override // com.github.catvod.spider.merge.A0
    void W() {
        super.W();
        this.N = null;
    }

    @Nullable
    public Iw W8() {
        List<Iw> listEc;
        int iN6;
        if (this.S != null && (iN6 = n6(this, (listEc = G().ec()))) > 0) {
            return listEc.get(iN6 - 1);
        }
        return null;
    }

    public String Xc() {
        StringBuilder sbS = tv.S();
        nZ(sbS);
        String strCD = tv.cD(sbS);
        return gv.l8(this).HM() ? strCD.trim() : strCD;
    }

    public Iw Y(A0 a0) {
        return (Iw) super.tT(a0);
    }

    @Override // com.github.catvod.spider.merge.A0
    protected void cD(String str) {
        OL().W(l, str);
    }

    public hs cE() {
        return this.tT;
    }

    List<Iw> ec() {
        List<Iw> list;
        if (HM() == 0) {
            return b;
        }
        WeakReference<List<Iw>> weakReference = this.N;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.HM.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            A0 a0 = this.HM.get(i);
            if (a0 instanceof Iw) {
                arrayList.add((Iw) a0);
            }
        }
        this.N = new WeakReference<>(arrayList);
        return arrayList;
    }

    public Iw f(A0 a0) {
        Rc.HM(a0);
        O(a0);
        hR();
        this.HM.add(a0);
        a0.y(this.HM.size() - 1);
        return this;
    }

    public jk gh() {
        return fZ.l8(new i3.aA(), this);
    }

    public String h() {
        Rz rz = this.n;
        return rz != null ? rz.A("id") : "";
    }

    @Override // com.github.catvod.spider.merge.A0
    protected List<A0> hR() {
        if (this.HM == A0.l8) {
            this.HM = new ut(this, 4);
        }
        return this.HM;
    }

    public jk im() {
        return new jk(ec());
    }

    @Override // com.github.catvod.spider.merge.A0
    public String l() {
        return DX(this, l);
    }

    public String m() {
        return this.tT.n();
    }

    public <T extends Appendable> T nZ(T t) {
        int size = this.HM.size();
        for (int i = 0; i < size; i++) {
            this.HM.get(i).OY(t);
        }
        return t;
    }

    @Nullable
    public Iw pu(String str) {
        return aI.T4(str, this);
    }

    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public Iw s() {
        this.HM.clear();
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0
    void r1(Appendable appendable, int i, g9.aA aAVar) throws IOException {
        if (aAVar.HM() && vi(aAVar) && !e(aAVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            c(appendable, i, aAVar);
        }
        appendable.append('<').append(F());
        Rz rz = this.n;
        if (rz != null) {
            rz.Kf(appendable, aAVar);
        }
        if (!this.HM.isEmpty() || !this.tT.HM()) {
            appendable.append('>');
        } else if (aAVar.n() == g9.aA.EnumC0001aA.html && this.tT.OL()) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public int t2() {
        if (G() == null) {
            return 0;
        }
        return n6(this, G().ec());
    }

    public Iw(hs hsVar, String str) {
        this(hsVar, str, null);
    }
}
