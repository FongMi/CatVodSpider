package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.mt;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class xU extends gx {

    @Nullable
    private Iw C;
    private boolean G;
    private ArrayList<Iw> OY;

    @Nullable
    private Iw Q;
    private mt.XT R;

    @Nullable
    private C1399vv W;
    private boolean bc;
    private oL c;
    private boolean eD;
    private String[] oH = {null};
    private List<String> r1;
    private boolean rD;
    private oL uS;
    static final String[] v = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] A = {"ol", "ul"};
    static final String[] cD = {"button"};
    static final String[] s = {"html", "table"};
    static final String[] hR = {"optgroup", "option"};
    static final String[] Kf = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] E9 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    private void B(A0 a0) {
        C1399vv c1399vv;
        if (this.OL.isEmpty()) {
            this.b.f(a0);
        } else if (H()) {
            x(a0);
        } else {
            l8().f(a0);
        }
        if (a0 instanceof Iw) {
            Iw iw = (Iw) a0;
            if (!iw.cE().l() || (c1399vv = this.W) == null) {
                return;
            }
            c1399vv.g(iw);
        }
    }

    private boolean PP(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.oH;
        strArr3[0] = str;
        return o(strArr3, strArr, strArr2);
    }

    private void cE(ArrayList<Iw> arrayList, Iw iw, Iw iw2) {
        int iLastIndexOf = arrayList.lastIndexOf(iw);
        Rc.T4(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, iw2);
    }

    private boolean im(ArrayList<Iw> arrayList, Iw iw) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == iw) {
                return true;
            }
            size--;
        }
        return false;
    }

    private boolean o(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.OL.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM = this.OL.get(size).m();
            if (tv.b(strM, strArr)) {
                return true;
            }
            if (tv.b(strM, strArr2)) {
                return false;
            }
            if (strArr3 != null && tv.b(strM, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    private void s(String... strArr) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            Iw iw = this.OL.get(size);
            if (tv.T4(iw.m(), strArr) || iw.m().equals("html")) {
                return;
            }
            this.OL.remove(size);
        }
    }

    private boolean t2(Iw iw, Iw iw2) {
        return iw.m().equals(iw2.m()) && iw.OL().equals(iw2.OL());
    }

    void A(Iw iw) {
        int i = 0;
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            Iw iw2 = this.OY.get(size);
            if (iw2 == null) {
                return;
            }
            if (t2(iw, iw2)) {
                i++;
            }
            if (i == 3) {
                this.OY.remove(size);
                return;
            }
        }
    }

    boolean A0(String str) {
        return O(str, cD);
    }

    boolean Bz(String[] strArr) {
        return o(strArr, v, null);
    }

    Iw C(String str) {
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            Iw iw = this.OY.get(size);
            if (iw == null) {
                return null;
            }
            if (iw.m().equals(str)) {
                return iw;
            }
        }
        return null;
    }

    Iw DL(mt.i iVar) {
        hs hsVarHR = hs.hR(iVar.G(), this.N);
        Iw iw = new Iw(hsVarHR, null, this.N.S(iVar.n));
        B(iw);
        if (iVar.bc()) {
            if (!hsVarHR.N()) {
                hsVarHR.cD();
            } else if (!hsVarHR.OL()) {
                this.T4.c("Tag cannot be self closing; not a void tag");
            }
        }
        return iw;
    }

    void DX(Iw iw) {
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            if (this.OY.get(size) == iw) {
                this.OY.remove(size);
                return;
            }
        }
    }

    void E9() {
        s("tr", "template");
    }

    void F(Iw iw, Iw iw2) {
        cE(this.OL, iw, iw2);
    }

    void FG() {
        this.OY.add(null);
    }

    Iw G() {
        return this.Q;
    }

    void GO() {
        boolean z = false;
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            Iw iw = this.OL.get(size);
            if (size == 0) {
                iw = this.C;
                z = true;
            }
            String strM = iw != null ? iw.m() : "";
            if ("select".equals(strM)) {
                T(oL.Kf);
                return;
            }
            if ("td".equals(strM) || ("th".equals(strM) && !z)) {
                T(oL.hR);
                return;
            }
            if ("tr".equals(strM)) {
                T(oL.s);
                return;
            }
            if ("tbody".equals(strM) || "thead".equals(strM) || "tfoot".equals(strM)) {
                T(oL.cD);
                return;
            }
            if ("caption".equals(strM)) {
                T(oL.v);
                return;
            }
            if ("colgroup".equals(strM)) {
                T(oL.A);
                return;
            }
            if ("table".equals(strM)) {
                T(oL.HM);
                return;
            }
            if ("head".equals(strM)) {
                T(oL.tT);
                return;
            }
            if ("body".equals(strM)) {
                T(oL.tT);
                return;
            }
            if ("frameset".equals(strM)) {
                T(oL.c);
                return;
            } else if ("html".equals(strM)) {
                T(oL.T4);
                return;
            } else {
                if (z) {
                    T(oL.tT);
                    return;
                }
            }
        }
    }

    boolean H() {
        return this.G;
    }

    boolean H6(String str) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            String strM = this.OL.get(size).m();
            if (strM.equals(str)) {
                return true;
            }
            if (!tv.b(strM, hR)) {
                return false;
            }
        }
        Rc.l8("Should not be reachable");
        return false;
    }

    @Override // com.github.catvod.spider.merge.gx
    public /* bridge */ /* synthetic */ boolean HM(String str, Rz rz) {
        return super.HM(str, rz);
    }

    boolean I(Iw iw) {
        return im(this.OY, iw);
    }

    boolean J() {
        return this.rD;
    }

    void Jb() {
        this.c = this.uS;
    }

    void K(Iw iw) {
        this.Q = iw;
    }

    void KP(C1399vv c1399vv) {
        this.W = c1399vv;
    }

    void Kf() {
        s("table");
    }

    void Kw(Iw iw) {
        A(iw);
        this.OY.add(iw);
    }

    void L(Iw iw) {
        this.OL.add(iw);
    }

    boolean LD(Iw iw) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            if (this.OL.get(size) == iw) {
                this.OL.remove(size);
                return true;
            }
        }
        return false;
    }

    void Lw(mt.c cVar) {
        B(new qF(cVar.c()));
    }

    void M(mt.Y y) {
        Iw iwL8 = l8();
        if (iwL8 == null) {
            iwL8 = this.b;
        }
        String strM = iwL8.m();
        String strE9 = y.E9();
        iwL8.f(y.l() ? new PU(strE9) : ec(strM) ? new Lh(strE9) : new DQ(strE9));
    }

    void Nb() {
        Iw iwGh = gh();
        if (iwGh == null || h(iwGh)) {
            return;
        }
        boolean z = true;
        int size = this.OY.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            iwGh = this.OY.get(i);
            if (iwGh == null || h(iwGh)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i++;
                iwGh = this.OY.get(i);
            }
            Rc.HM(iwGh);
            Iw iwU = U(iwGh.m());
            iwU.OL().OL(iwGh.OL());
            this.OY.set(i, iwU);
            if (i == size) {
                return;
            } else {
                z = false;
            }
        }
    }

    boolean O(String str, String[] strArr) {
        return PP(str, v, strArr);
    }

    Iw OT() {
        return this.OL.remove(this.OL.size() - 1);
    }

    String OY() {
        return this.l;
    }

    void Q() {
        W(null);
    }

    C1399vv R() {
        return this.W;
    }

    @Override // com.github.catvod.spider.merge.gx
    rO S() {
        return rO.l8;
    }

    void T(oL oLVar) {
        this.uS = oLVar;
    }

    Iw U(String str) {
        Iw iw = new Iw(hs.hR(str, this.N), null);
        Ws(iw);
        return iw;
    }

    int UM(Iw iw) {
        for (int i = 0; i < this.OY.size(); i++) {
            if (iw == this.OY.get(i)) {
                return i;
            }
        }
        return -1;
    }

    void Ut(Iw iw, Iw iw2) {
        cE(this.OY, iw, iw2);
    }

    void W(String str) {
        while (str != null && !l8().m().equals(str) && tv.b(l8().m(), Kf)) {
            OT();
        }
    }

    void W8(Iw iw, int i) {
        A(iw);
        this.OY.add(i, iw);
    }

    void Ws(Iw iw) {
        B(iw);
        this.OL.add(iw);
    }

    void Xc() {
        this.r1 = new ArrayList();
    }

    void Y(Iw iw, Iw iw2) {
        int iLastIndexOf = this.OL.lastIndexOf(iw);
        Rc.T4(iLastIndexOf != -1);
        this.OL.add(iLastIndexOf + 1, iw2);
    }

    oL Yr() {
        return this.uS;
    }

    @Override // com.github.catvod.spider.merge.gx
    @ParametersAreNonnullByDefault
    protected void b(Reader reader, String str, B8 b8) {
        super.b(reader, str, b8);
        this.uS = oL.l8;
        this.c = null;
        this.eD = false;
        this.Q = null;
        this.W = null;
        this.C = null;
        this.OY = new ArrayList<>();
        this.r1 = new ArrayList();
        this.R = new mt.XT();
        this.bc = true;
        this.G = false;
        this.rD = false;
    }

    boolean b6(mt mtVar, oL oLVar) {
        this.tT = mtVar;
        return oLVar.n(mtVar, this);
    }

    Iw bc(String str) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            Iw iw = this.OL.get(size);
            if (iw.m().equals(str)) {
                return iw;
            }
        }
        return null;
    }

    void c(boolean z) {
        this.bc = z;
    }

    void cD() {
        while (!this.OY.isEmpty() && pu() != null) {
        }
    }

    boolean d(String str) {
        return O(str, null);
    }

    Iw e(String str) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            Iw iw = this.OL.get(size);
            this.OL.remove(size);
            if (iw.m().equals(str)) {
                return iw;
            }
        }
        return null;
    }

    boolean eD() {
        return this.bc;
    }

    protected boolean ec(String str) {
        return str.equals("script") || str.equals("style");
    }

    C1399vv f(mt.i iVar, boolean z) {
        C1399vv c1399vv = new C1399vv(hs.hR(iVar.G(), this.N), null, this.N.S(iVar.n));
        KP(c1399vv);
        B(c1399vv);
        if (z) {
            this.OL.add(c1399vv);
        }
        return c1399vv;
    }

    void g(boolean z) {
        this.G = z;
    }

    Iw gh() {
        if (this.OY.size() <= 0) {
            return null;
        }
        return this.OY.get(r0.size() - 1);
    }

    boolean h(Iw iw) {
        return im(this.OL, iw);
    }

    void hR() {
        s("tbody", "tfoot", "thead", "template");
    }

    boolean hd(String str) {
        return O(str, A);
    }

    @Override // com.github.catvod.spider.merge.gx
    protected boolean l(mt mtVar) {
        this.tT = mtVar;
        return this.uS.n(mtVar, this);
    }

    void m(String... strArr) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            Iw iw = this.OL.get(size);
            this.OL.remove(size);
            if (tv.b(iw.m(), strArr)) {
                return;
            }
        }
    }

    boolean mF(String str) {
        return PP(str, s, null);
    }

    oL n6() {
        return this.c;
    }

    void nZ(Iw iw) {
        if (this.eD) {
            return;
        }
        String strL8 = iw.l8("href");
        if (strL8.length() != 0) {
            this.l = strL8;
            this.eD = true;
            this.b.o(strL8);
        }
    }

    ArrayList<Iw> oH() {
        return this.OL;
    }

    Iw pu() {
        int size = this.OY.size();
        if (size > 0) {
            return this.OY.remove(size - 1);
        }
        return null;
    }

    boolean r0(Iw iw) {
        return tv.b(iw.m(), E9);
    }

    g9 r1() {
        return this.b;
    }

    List<String> rD() {
        return this.r1;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.tT + ", state=" + this.uS + ", currentElement=" + l8() + '}';
    }

    void uS(oL oLVar) {
        if (this.l8.l8().l8()) {
            this.l8.l8().add(new cz(this.S.Bz(), "Unexpected token [%s] when in state [%s]", this.tT.hR(), oLVar));
        }
    }

    Iw v(Iw iw) {
        for (int size = this.OL.size() - 1; size >= 0; size--) {
            if (this.OL.get(size) == iw) {
                return this.OL.get(size - 1);
            }
        }
        return null;
    }

    void vi(String str) {
        for (int size = this.OL.size() - 1; size >= 0 && !this.OL.get(size).m().equals(str); size--) {
            this.OL.remove(size);
        }
    }

    void x(A0 a0) {
        Iw iwV;
        Iw iwBc = bc("table");
        boolean z = false;
        if (iwBc == null) {
            iwV = this.OL.get(0);
        } else if (iwBc.G() != null) {
            iwV = iwBc.G();
            z = true;
        } else {
            iwV = v(iwBc);
        }
        if (!z) {
            iwV.f(a0);
        } else {
            Rc.HM(iwBc);
            iwBc.Y(a0);
        }
    }

    Iw y(mt.i iVar) {
        if (iVar.R() && !iVar.n.isEmpty() && iVar.n.n(this.N) > 0) {
            T4("Duplicate attribute");
        }
        if (!iVar.bc()) {
            Iw iw = new Iw(hs.hR(iVar.G(), this.N), null, this.N.S(iVar.n));
            Ws(iw);
            return iw;
        }
        Iw iwDL = DL(iVar);
        this.OL.add(iwDL);
        this.T4.C(m.l8);
        this.T4.cD(this.R.cD().rD(iwDL.F()));
        return iwDL;
    }
}
