package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0108Zo;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* renamed from: com.github.catvod.spider.merge.Ot */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0084Ot extends AbstractC0128lc {

    /* renamed from: BP */
    private ArrayList<C0127lK> f513BP;

    /* renamed from: E */
    private boolean f514E;

    /* renamed from: Fp */
    private boolean f515Fp;

    /* renamed from: IS */
    private EnumC0064Gi f516IS;

    /* renamed from: P */
    private boolean f517P;

    /* renamed from: Tz */
    private EnumC0064Gi f518Tz;

    /* renamed from: UN */
    private AbstractC0108Zo.t7 f519UN;

    /* renamed from: Xl */
    private String[] f520Xl = {null};

    /* renamed from: go */
    @Nullable
    private C0105Z f521go;

    /* renamed from: l */
    @Nullable
    private C0127lK f522l;

    /* renamed from: p */
    @Nullable
    private C0127lK f523p;

    /* renamed from: pb */
    private boolean f524pb;

    /* renamed from: yS */
    private List<String> f525yS;

    /* renamed from: FN */
    static final String[] f508FN = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: B */
    static final String[] f506B = {"ol", "ul"};

    /* renamed from: w8 */
    static final String[] f512w8 = {"button"};

    /* renamed from: F */
    static final String[] f507F = {"html", "table"};

    /* renamed from: RH */
    static final String[] f510RH = {"optgroup", "option"};

    /* renamed from: KT */
    static final String[] f509KT = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* renamed from: k */
    static final String[] f511k = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: BE */
    private void m335BE(AbstractC0077NC abstractC0077NC) {
        C0105Z c0105z;
        if (this.f722u.isEmpty()) {
            this.f717UJ.m658id(abstractC0077NC);
        } else if (m357L()) {
            m347BY(abstractC0077NC);
        } else {
            m676q().m658id(abstractC0077NC);
        }
        if (abstractC0077NC instanceof C0127lK) {
            C0127lK c0127lK = (C0127lK) abstractC0077NC;
            if (!c0127lK.m655bA().m241Mo() || (c0105z = this.f521go) == null) {
                return;
            }
            c0105z.m480Zu(c0127lK);
        }
    }

    /* renamed from: F */
    private void m336F(String... strArr) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f722u.get(size);
            if (C0157x3.m770QU(c0127lK.m644A(), strArr) || c0127lK.m644A().equals("html")) {
                return;
            }
            this.f722u.remove(size);
        }
    }

    /* renamed from: M */
    private boolean m337M(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f722u.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM644A = this.f722u.get(size).m644A();
            if (C0157x3.m772UJ(strM644A, strArr)) {
                return true;
            }
            if (C0157x3.m772UJ(strM644A, strArr2)) {
                return false;
            }
            if (strArr3 != null && C0157x3.m772UJ(strM644A, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: bA */
    private void m338bA(ArrayList<C0127lK> arrayList, C0127lK c0127lK, C0127lK c0127lK2) {
        int iLastIndexOf = arrayList.lastIndexOf(c0127lK);
        C0111bw.m554QU(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c0127lK2);
    }

    /* renamed from: eq */
    private boolean m339eq(C0127lK c0127lK, C0127lK c0127lK2) {
        return c0127lK.m644A().equals(c0127lK2.m644A()) && c0127lK.mo282u().equals(c0127lK2.mo282u());
    }

    /* renamed from: ip */
    private boolean m340ip(ArrayList<C0127lK> arrayList, C0127lK c0127lK) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c0127lK) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* renamed from: rF */
    private boolean m341rF(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f520Xl;
        strArr3[0] = str;
        return m337M(strArr3, strArr, strArr2);
    }

    /* renamed from: A */
    void m342A(String... strArr) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f722u.get(size);
            this.f722u.remove(size);
            if (C0157x3.m772UJ(c0127lK.m644A(), strArr)) {
                return;
            }
        }
    }

    /* renamed from: AI */
    void m343AI(String str) {
        for (int size = this.f722u.size() - 1; size >= 0 && !this.f722u.get(size).m644A().equals(str); size--) {
            this.f722u.remove(size);
        }
    }

    /* renamed from: B */
    void m344B(C0127lK c0127lK) {
        int i = 0;
        for (int size = this.f513BP.size() - 1; size >= 0; size--) {
            C0127lK c0127lK2 = this.f513BP.get(size);
            if (c0127lK2 == null) {
                return;
            }
            if (m339eq(c0127lK, c0127lK2)) {
                i++;
            }
            if (i == 3) {
                this.f513BP.remove(size);
                return;
            }
        }
    }

    /* renamed from: BP */
    String m345BP() {
        return this.f715Mo;
    }

    /* renamed from: BU */
    void m346BU(C0127lK c0127lK, C0127lK c0127lK2) {
        m338bA(this.f513BP, c0127lK, c0127lK2);
    }

    /* renamed from: BY */
    void m347BY(AbstractC0077NC abstractC0077NC) {
        C0127lK c0127lKM350FN;
        C0127lK c0127lKM351Fp = m351Fp("table");
        boolean z = false;
        if (c0127lKM351Fp == null) {
            c0127lKM350FN = this.f722u.get(0);
        } else if (c0127lKM351Fp.mo278pb() != null) {
            c0127lKM350FN = c0127lKM351Fp.mo278pb();
            z = true;
        } else {
            c0127lKM350FN = m350FN(c0127lKM351Fp);
        }
        if (!z) {
            c0127lKM350FN.m658id(abstractC0077NC);
        } else {
            C0111bw.m559se(c0127lKM351Fp);
            c0127lKM351Fp.m652Z(abstractC0077NC);
        }
    }

    /* renamed from: E */
    boolean m348E() {
        return this.f515Fp;
    }

    /* renamed from: E5 */
    void m349E5() {
        C0127lK c0127lKM358M2 = m358M2();
        if (c0127lKM358M2 == null || m403uR(c0127lKM358M2)) {
            return;
        }
        boolean z = true;
        int size = this.f513BP.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            c0127lKM358M2 = this.f513BP.get(i);
            if (c0127lKM358M2 == null || m403uR(c0127lKM358M2)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i++;
                c0127lKM358M2 = this.f513BP.get(i);
            }
            C0111bw.m559se(c0127lKM358M2);
            C0127lK c0127lKM353I = m353I(c0127lKM358M2.m644A());
            c0127lKM353I.mo282u().m464u(c0127lKM358M2.mo282u());
            this.f513BP.set(i, c0127lKM353I);
            if (i == size) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* renamed from: FN */
    C0127lK m350FN(C0127lK c0127lK) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            if (this.f722u.get(size) == c0127lK) {
                return this.f722u.get(size - 1);
            }
        }
        return null;
    }

    /* renamed from: Fp */
    C0127lK m351Fp(String str) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f722u.get(size);
            if (c0127lK.m644A().equals(str)) {
                return c0127lK;
            }
        }
        return null;
    }

    /* renamed from: GD */
    boolean m352GD(C0127lK c0127lK) {
        return C0157x3.m772UJ(c0127lK.m644A(), f511k);
    }

    /* renamed from: I */
    C0127lK m353I(String str) {
        C0127lK c0127lK = new C0127lK(C0073Lt.m238RH(str, this.f714MH), null);
        m412z(c0127lK);
        return c0127lK;
    }

    /* renamed from: IS */
    void m354IS(boolean z) {
        this.f515Fp = z;
    }

    /* renamed from: KT */
    void m355KT() {
        m336F("table");
    }

    /* renamed from: Kq */
    void m356Kq(C0105Z c0105z) {
        this.f521go = c0105z;
    }

    /* renamed from: L */
    boolean m357L() {
        return this.f524pb;
    }

    /* renamed from: M2 */
    C0127lK m358M2() {
        if (this.f513BP.size() <= 0) {
            return null;
        }
        return this.f513BP.get(r0.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0128lc
    /* renamed from: Mo */
    protected boolean mo359Mo(AbstractC0108Zo abstractC0108Zo) {
        this.f719i = abstractC0108Zo;
        return this.f518Tz.mo207W(abstractC0108Zo, this);
    }

    /* renamed from: OF */
    void m360OF(C0127lK c0127lK) {
        for (int size = this.f513BP.size() - 1; size >= 0; size--) {
            if (this.f513BP.get(size) == c0127lK) {
                this.f513BP.remove(size);
                return;
            }
        }
    }

    /* renamed from: Oz */
    void m361Oz() {
        this.f513BP.add(null);
    }

    /* renamed from: P */
    List<String> m362P() {
        return this.f525yS;
    }

    /* renamed from: RH */
    void m363RH() {
        m336F("tbody", "tfoot", "thead", "template");
    }

    /* renamed from: T */
    boolean m364T(String[] strArr) {
        return m337M(strArr, f508FN, null);
    }

    /* renamed from: Tz */
    void m365Tz(EnumC0064Gi enumC0064Gi) {
        if (this.f720q.m313q().m479q()) {
            this.f720q.m313q().add(new C0069K(this.f723xC.m173T(), "Unexpected token [%s] when in state [%s]", this.f719i.m510RH(), enumC0064Gi));
        }
    }

    /* renamed from: U */
    boolean m366U(String str) {
        return m389m(str, null);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0128lc
    @ParametersAreNonnullByDefault
    /* renamed from: UJ */
    protected void mo367UJ(Reader reader, String str, C0080Nz c0080Nz) {
        super.mo367UJ(reader, str, c0080Nz);
        this.f518Tz = EnumC0064Gi.f377q;
        this.f516IS = null;
        this.f514E = false;
        this.f523p = null;
        this.f521go = null;
        this.f522l = null;
        this.f513BP = new ArrayList<>();
        this.f525yS = new ArrayList();
        this.f519UN = new AbstractC0108Zo.t7();
        this.f515Fp = true;
        this.f524pb = false;
        this.f517P = false;
    }

    /* renamed from: UN */
    C0105Z m368UN() {
        return this.f521go;
    }

    /* renamed from: V */
    C0127lK m369V(AbstractC0108Zo.Vm vm) {
        C0073Lt c0073LtM238RH = C0073Lt.m238RH(vm.m549pb(), this.f714MH);
        C0127lK c0127lK = new C0127lK(c0073LtM238RH, null, this.f714MH.m234xC(vm.f593W));
        m335BE(c0127lK);
        if (vm.m536Fp()) {
            if (!c0073LtM238RH.m240MH()) {
                c0073LtM238RH.m249w8();
            } else if (!c0073LtM238RH.m248u()) {
                this.f716QU.m138IS("Tag cannot be self closing; not a void tag");
            }
        }
        return c0127lK;
    }

    /* renamed from: Xl */
    ArrayList<C0127lK> m370Xl() {
        return this.f722u;
    }

    /* renamed from: Z */
    void m371Z(C0127lK c0127lK, C0127lK c0127lK2) {
        int iLastIndexOf = this.f722u.lastIndexOf(c0127lK);
        C0111bw.m554QU(iLastIndexOf != -1);
        this.f722u.add(iLastIndexOf + 1, c0127lK2);
    }

    /* renamed from: Zu */
    void m372Zu(boolean z) {
        this.f524pb = z;
    }

    /* renamed from: a */
    void m373a() {
        boolean z = false;
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f722u.get(size);
            if (size == 0) {
                c0127lK = this.f522l;
                z = true;
            }
            String strM644A = c0127lK != null ? c0127lK.m644A() : "";
            if ("select".equals(strM644A)) {
                m381fi(EnumC0064Gi.f364KT);
                return;
            }
            if ("td".equals(strM644A) || ("th".equals(strM644A) && !z)) {
                m381fi(EnumC0064Gi.f368RH);
                return;
            }
            if ("tr".equals(strM644A)) {
                m381fi(EnumC0064Gi.f361F);
                return;
            }
            if ("tbody".equals(strM644A) || "thead".equals(strM644A) || "tfoot".equals(strM644A)) {
                m381fi(EnumC0064Gi.f380w8);
                return;
            }
            if ("caption".equals(strM644A)) {
                m381fi(EnumC0064Gi.f362FN);
                return;
            }
            if ("colgroup".equals(strM644A)) {
                m381fi(EnumC0064Gi.f358B);
                return;
            }
            if ("table".equals(strM644A)) {
                m381fi(EnumC0064Gi.f378se);
                return;
            }
            if ("head".equals(strM644A)) {
                m381fi(EnumC0064Gi.f373i);
                return;
            }
            if ("body".equals(strM644A)) {
                m381fi(EnumC0064Gi.f373i);
                return;
            }
            if ("frameset".equals(strM644A)) {
                m381fi(EnumC0064Gi.f363IS);
                return;
            } else if ("html".equals(strM644A)) {
                m381fi(EnumC0064Gi.f367QU);
                return;
            } else {
                if (z) {
                    m381fi(EnumC0064Gi.f373i);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    boolean m374b(C0127lK c0127lK) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            if (this.f722u.get(size) == c0127lK) {
                this.f722u.remove(size);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    void m375c(AbstractC0108Zo.J j) {
        C0127lK c0127lKM676q = m676q();
        if (c0127lKM676q == null) {
            c0127lKM676q = this.f717UJ;
        }
        String strM644A = c0127lKM676q.m644A();
        String strM524k = j.m524k();
        c0127lKM676q.m658id(j.m508Mo() ? new C0145t(strM524k) : m392nT(strM644A) ? new C0135oh(strM524k) : new C0119h(strM524k));
    }

    /* renamed from: cV */
    EnumC0064Gi m376cV() {
        return this.f518Tz;
    }

    /* renamed from: d */
    boolean m377d(String str) {
        return m389m(str, f506B);
    }

    /* renamed from: el */
    void m378el(C0127lK c0127lK) {
        if (this.f514E) {
            return;
        }
        String strMo130q = c0127lK.mo130q("href");
        if (strMo130q.length() != 0) {
            this.f715Mo = strMo130q;
            this.f514E = true;
            this.f717UJ.m262M(strMo130q);
        }
    }

    /* renamed from: f */
    EnumC0064Gi m379f() {
        return this.f516IS;
    }

    /* renamed from: fH */
    boolean m380fH(String str) {
        return m389m(str, f512w8);
    }

    /* renamed from: fi */
    void m381fi(EnumC0064Gi enumC0064Gi) {
        this.f518Tz = enumC0064Gi;
    }

    /* renamed from: go */
    void m382go(String str) {
        while (str != null && !m676q().m644A().equals(str) && C0157x3.m772UJ(m676q().m644A(), f509KT)) {
            m391mu();
        }
    }

    /* renamed from: hp */
    void m383hp(C0127lK c0127lK) {
        m344B(c0127lK);
        this.f513BP.add(c0127lK);
    }

    /* renamed from: id */
    C0105Z m384id(AbstractC0108Zo.Vm vm, boolean z) {
        C0105Z c0105z = new C0105Z(C0073Lt.m238RH(vm.m549pb(), this.f714MH), null, this.f714MH.m234xC(vm.f593W));
        m356Kq(c0105z);
        m335BE(c0105z);
        if (z) {
            this.f722u.add(c0105z);
        }
        return c0105z;
    }

    /* renamed from: k */
    void m385k() {
        m336F("tr", "template");
    }

    /* renamed from: kB */
    int m386kB(C0127lK c0127lK) {
        for (int i = 0; i < this.f513BP.size(); i++) {
            if (c0127lK == this.f513BP.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: kZ */
    void m387kZ(C0127lK c0127lK, C0127lK c0127lK2) {
        m338bA(this.f722u, c0127lK, c0127lK2);
    }

    /* renamed from: l */
    C0127lK m388l(String str) {
        for (int size = this.f513BP.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f513BP.get(size);
            if (c0127lK == null) {
                return null;
            }
            if (c0127lK.m644A().equals(str)) {
                return c0127lK;
            }
        }
        return null;
    }

    /* renamed from: m */
    boolean m389m(String str, String[] strArr) {
        return m341rF(str, f508FN, strArr);
    }

    /* renamed from: mT */
    void m390mT(AbstractC0108Zo.FD fd) {
        m335BE(new C0149ti(fd.m520IS()));
    }

    /* renamed from: mu */
    C0127lK m391mu() {
        return this.f722u.remove(this.f722u.size() - 1);
    }

    /* renamed from: nT */
    protected boolean m392nT(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* renamed from: om */
    boolean m393om() {
        return this.f517P;
    }

    /* renamed from: p */
    void m394p() {
        m382go(null);
    }

    /* renamed from: pE */
    void m395pE(C0127lK c0127lK, int i) {
        m344B(c0127lK);
        this.f513BP.add(i, c0127lK);
    }

    /* renamed from: pS */
    boolean m396pS(C0127lK c0127lK) {
        return m340ip(this.f513BP, c0127lK);
    }

    /* renamed from: pb */
    C0127lK m397pb() {
        return this.f523p;
    }

    /* renamed from: pt */
    C0127lK m398pt() {
        int size = this.f513BP.size();
        if (size > 0) {
            return this.f513BP.remove(size - 1);
        }
        return null;
    }

    /* renamed from: rO */
    boolean m399rO(AbstractC0108Zo abstractC0108Zo, EnumC0064Gi enumC0064Gi) {
        this.f719i = abstractC0108Zo;
        return enumC0064Gi.mo207W(abstractC0108Zo, this);
    }

    /* renamed from: s */
    boolean m400s(String str) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            String strM644A = this.f722u.get(size).m644A();
            if (strM644A.equals(str)) {
                return true;
            }
            if (!C0157x3.m772UJ(strM644A, f510RH)) {
                return false;
            }
        }
        C0111bw.m558q("Should not be reachable");
        return false;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0128lc
    /* renamed from: se */
    public /* bridge */ /* synthetic */ boolean mo401se(String str, C0094Tz c0094Tz) {
        return super.mo401se(str, c0094Tz);
    }

    /* renamed from: t */
    C0127lK m402t(AbstractC0108Zo.Vm vm) {
        if (vm.m542UN() && !vm.f593W.isEmpty() && vm.f593W.m458W(this.f714MH) > 0) {
            m673QU("Duplicate attribute");
        }
        if (!vm.m536Fp()) {
            C0127lK c0127lK = new C0127lK(C0073Lt.m238RH(vm.m549pb(), this.f714MH), null, this.f714MH.m234xC(vm.f593W));
            m412z(c0127lK);
            return c0127lK;
        }
        C0127lK c0127lKM369V = m369V(vm);
        this.f722u.add(c0127lKM369V);
        this.f716QU.m149l(EnumC0115dT.f657q);
        this.f716QU.m154w8(this.f519UN.mo517w8().m539P(c0127lKM369V.m661kZ()));
        return c0127lKM369V;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f719i + ", state=" + this.f518Tz + ", currentElement=" + m676q() + '}';
    }

    /* renamed from: uR */
    boolean m403uR(C0127lK c0127lK) {
        return m340ip(this.f722u, c0127lK);
    }

    /* renamed from: v */
    void m404v(C0127lK c0127lK) {
        this.f722u.add(c0127lK);
    }

    /* renamed from: w8 */
    void m405w8() {
        while (!this.f513BP.isEmpty() && m398pt() != null) {
        }
    }

    /* renamed from: wR */
    boolean m406wR(String str) {
        return m341rF(str, f507F, null);
    }

    /* renamed from: wt */
    void m407wt() {
        this.f516IS = this.f518Tz;
    }

    /* renamed from: x */
    C0127lK m408x(String str) {
        for (int size = this.f722u.size() - 1; size >= 0; size--) {
            C0127lK c0127lK = this.f722u.get(size);
            this.f722u.remove(size);
            if (c0127lK.m644A().equals(str)) {
                return c0127lK;
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0128lc
    /* renamed from: xC */
    C0068Jt mo409xC() {
        return C0068Jt.f429q;
    }

    /* renamed from: y */
    void m410y() {
        this.f525yS = new ArrayList();
    }

    /* renamed from: yS */
    C0082OO m411yS() {
        return this.f717UJ;
    }

    /* renamed from: z */
    void m412z(C0127lK c0127lK) {
        m335BE(c0127lK);
        this.f722u.add(c0127lK);
    }

    /* renamed from: zw */
    void m413zw(C0127lK c0127lK) {
        this.f523p = c0127lK;
    }
}
