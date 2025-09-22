package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0123i;
import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.lK */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0127lK extends AbstractC0077NC {

    /* renamed from: MH */
    @Nullable
    private WeakReference<List<C0127lK>> f707MH;

    /* renamed from: W */
    @Nullable
    private C0094Tz f708W;

    /* renamed from: i */
    private C0073Lt f709i;

    /* renamed from: se */
    List<AbstractC0077NC> f710se;

    /* renamed from: UJ */
    private static final List<C0127lK> f705UJ = Collections.emptyList();

    /* renamed from: u */
    private static final Pattern f706u = Pattern.compile("\\s+");

    /* renamed from: Mo */
    private static final String f704Mo = C0094Tz.m442IS("baseUri");

    /* renamed from: com.github.catvod.spider.merge.lK$Qe */
    private static final class Qe extends AbstractC0122hs<AbstractC0077NC> {

        /* renamed from: q */
        private final C0127lK f711q;

        Qe(C0127lK c0127lK, int i) {
            super(i);
            this.f711q = c0127lK;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0122hs
        /* renamed from: q */
        public void mo630q() {
            this.f711q.mo273go();
        }
    }

    /* renamed from: com.github.catvod.spider.merge.lK$p */
    class p implements InterfaceC0150u2 {

        /* renamed from: q */
        final /* synthetic */ StringBuilder f712q;

        p(StringBuilder sb) {
            this.f712q = sb;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: q */
        public void mo287q(AbstractC0077NC abstractC0077NC, int i) {
            if ((abstractC0077NC instanceof C0127lK) && ((C0127lK) abstractC0077NC).m662mu() && (abstractC0077NC.m257E() instanceof C0119h) && !C0119h.m607Z(this.f712q)) {
                this.f712q.append(' ');
            }
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: xC */
        public void mo288xC(AbstractC0077NC abstractC0077NC, int i) {
            if (abstractC0077NC instanceof C0119h) {
                C0127lK.m635BY(this.f712q, (C0119h) abstractC0077NC);
            } else if (abstractC0077NC instanceof C0127lK) {
                C0127lK c0127lK = (C0127lK) abstractC0077NC;
                if (this.f712q.length() > 0) {
                    if ((c0127lK.m662mu() || c0127lK.f709i.m242QU().equals("br")) && !C0119h.m607Z(this.f712q)) {
                        this.f712q.append(' ');
                    }
                }
            }
        }
    }

    public C0127lK(C0073Lt c0073Lt, @Nullable String str, @Nullable C0094Tz c0094Tz) {
        C0111bw.m559se(c0073Lt);
        this.f710se = AbstractC0077NC.f459q;
        this.f708W = c0094Tz;
        this.f709i = c0073Lt;
        if (str != null) {
            m262M(str);
        }
    }

    /* renamed from: AI */
    private boolean m634AI(C0082OO.p pVar) {
        return this.f709i.m250xC() || (mo278pb() != null && mo278pb().m655bA().m250xC()) || pVar.m326i();
    }

    /* renamed from: BY */
    public static void m635BY(StringBuilder sb, C0119h c0119h) {
        String strM610Oz = c0119h.m610Oz();
        if (m640hp(c0119h.f461xC) || (c0119h instanceof C0145t)) {
            sb.append(strM610Oz);
        } else {
            C0157x3.m775q(sb, strM610Oz, C0119h.m607Z(sb));
        }
    }

    /* renamed from: OF */
    private static String m636OF(C0127lK c0127lK, String str) {
        while (c0127lK != null) {
            C0094Tz c0094Tz = c0127lK.f708W;
            if (c0094Tz != null && c0094Tz.m465w8(str)) {
                return c0127lK.f708W.m453FN(str);
            }
            c0127lK = c0127lK.mo278pb();
        }
        return "";
    }

    /* renamed from: Oz */
    private static void m637Oz(C0127lK c0127lK, StringBuilder sb) {
        if (!c0127lK.f709i.m242QU().equals("br") || C0119h.m607Z(sb)) {
            return;
        }
        sb.append(" ");
    }

    /* renamed from: f */
    private static <E extends C0127lK> int m639f(C0127lK c0127lK, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c0127lK) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: hp */
    static boolean m640hp(@Nullable AbstractC0077NC abstractC0077NC) {
        if (abstractC0077NC instanceof C0127lK) {
            C0127lK c0127lKMo278pb = (C0127lK) abstractC0077NC;
            int i = 0;
            while (!c0127lKMo278pb.f709i.m239FN()) {
                c0127lKMo278pb = c0127lKMo278pb.mo278pb();
                i++;
                if (i >= 6 || c0127lKMo278pb == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: rO */
    private void m642rO(StringBuilder sb) {
        for (AbstractC0077NC abstractC0077NC : this.f710se) {
            if (abstractC0077NC instanceof C0119h) {
                m635BY(sb, (C0119h) abstractC0077NC);
            } else if (abstractC0077NC instanceof C0127lK) {
                m637Oz((C0127lK) abstractC0077NC, sb);
            }
        }
    }

    /* renamed from: x */
    private boolean m643x(C0082OO.p pVar) {
        return (!m655bA().m245i() || m655bA().m248u() || (mo278pb() != null && !mo278pb().m662mu()) || m270Xl() == null || pVar.m326i()) ? false : true;
    }

    /* renamed from: A */
    public String m644A() {
        return this.f709i.m244W();
    }

    /* renamed from: BE */
    public C0127lK m645BE(String str, String str2) {
        super.mo127UJ(str, str2);
        return this;
    }

    /* renamed from: BU */
    public C0116dX m646BU() {
        if (this.f461xC == null) {
            return new C0116dX(0);
        }
        List<C0127lK> listM663nT = mo278pb().m663nT();
        C0116dX c0116dX = new C0116dX(listM663nT.size() - 1);
        for (C0127lK c0127lK : listM663nT) {
            if (c0127lK != this) {
                c0116dX.add(c0127lK);
            }
        }
        return c0116dX;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: E5 */
    public C0127lK mo279rF() {
        return (C0127lK) super.mo279rF();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: GD */
    public C0127lK mo123F() {
        this.f710se.clear();
        return this;
    }

    /* renamed from: I */
    public C0127lK m649I(int i) {
        return m663nT().get(i);
    }

    /* renamed from: Kq */
    public List<C0119h> m650Kq() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0077NC abstractC0077NC : this.f710se) {
            if (abstractC0077NC instanceof C0119h) {
                arrayList.add((C0119h) abstractC0077NC);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: L */
    public C0127lK mo314L() {
        return (C0127lK) super.mo314L();
    }

    /* renamed from: M2 */
    public C0116dX m651M2() {
        return C0162zx.m785q(new AbstractC0123i.p(), this);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: Mo */
    public String mo124Mo() {
        return m636OF(this, f704Mo);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: RH */
    protected List<AbstractC0077NC> mo265RH() {
        if (this.f710se == AbstractC0077NC.f459q) {
            this.f710se = new Qe(this, 4);
        }
        return this.f710se;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: UN */
    void mo128UN(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        if (this.f710se.isEmpty() && this.f709i.m247se()) {
            return;
        }
        if (pVar.m328se() && !this.f710se.isEmpty() && (this.f709i.m250xC() || (pVar.m326i() && (this.f710se.size() > 1 || (this.f710se.size() == 1 && !(this.f710se.get(0) instanceof C0119h)))))) {
            m260IS(appendable, i, pVar);
        }
        appendable.append("</").append(m661kZ()).append('>');
    }

    /* renamed from: Z */
    public C0127lK m652Z(AbstractC0077NC abstractC0077NC) {
        return (C0127lK) super.m274i(abstractC0077NC);
    }

    /* renamed from: a */
    public String m653a() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        C0075Mj.m252xC(new p(sbM779xC), this);
        return C0157x3.m778w8(sbM779xC).trim();
    }

    /* renamed from: b */
    public C0116dX m654b(String str) {
        return C0055AV.m119q(str, this);
    }

    /* renamed from: bA */
    public C0073Lt m655bA() {
        return this.f709i;
    }

    /* renamed from: el */
    public <T extends Appendable> T m656el(T t) {
        int size = this.f710se.size();
        for (int i = 0; i < size; i++) {
            this.f710se.get(i).m256BP(t);
        }
        return t;
    }

    /* renamed from: eq */
    public int m657eq() {
        if (mo278pb() == null) {
            return 0;
        }
        return m639f(this, mo278pb().m663nT());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: go */
    void mo273go() {
        super.mo273go();
        this.f707MH = null;
    }

    /* renamed from: id */
    public C0127lK m658id(AbstractC0077NC abstractC0077NC) {
        C0111bw.m559se(abstractC0077NC);
        m277m(abstractC0077NC);
        mo265RH();
        this.f710se.add(abstractC0077NC);
        abstractC0077NC.m281t(this.f710se.size() - 1);
        return this;
    }

    /* renamed from: ip */
    public C0116dX m659ip() {
        return new C0116dX(m663nT());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: k */
    protected boolean mo275k() {
        return this.f708W != null;
    }

    /* renamed from: kB */
    public String m660kB() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        m642rO(sbM779xC);
        return C0157x3.m778w8(sbM779xC).trim();
    }

    /* renamed from: kZ */
    public String m661kZ() {
        return this.f709i.m242QU();
    }

    /* renamed from: mu */
    public boolean m662mu() {
        return this.f709i.m243UJ();
    }

    /* renamed from: nT */
    List<C0127lK> m663nT() {
        List<C0127lK> list;
        if (mo131se() == 0) {
            return f705UJ;
        }
        WeakReference<List<C0127lK>> weakReference = this.f707MH;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f710se.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC0077NC abstractC0077NC = this.f710se.get(i);
            if (abstractC0077NC instanceof C0127lK) {
                arrayList.add((C0127lK) abstractC0077NC);
            }
        }
        this.f707MH = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: om */
    public String m664om() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        for (AbstractC0077NC abstractC0077NC : this.f710se) {
            if (abstractC0077NC instanceof C0135oh) {
                sbM779xC.append(((C0135oh) abstractC0077NC).m697Oz());
            } else if (abstractC0077NC instanceof C0149ti) {
                sbM779xC.append(((C0149ti) abstractC0077NC).m718Oz());
            } else if (abstractC0077NC instanceof C0127lK) {
                sbM779xC.append(((C0127lK) abstractC0077NC).m664om());
            } else if (abstractC0077NC instanceof C0145t) {
                sbM779xC.append(((C0145t) abstractC0077NC).m610Oz());
            }
        }
        return C0157x3.m778w8(sbM779xC);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: p */
    public String mo129p() {
        return this.f709i.m242QU();
    }

    @Nullable
    /* renamed from: pE */
    public C0127lK m665pE() {
        List<C0127lK> listM663nT;
        int iM639f;
        if (this.f461xC != null && (iM639f = m639f(this, (listM663nT = mo278pb().m663nT()))) > 0) {
            return listM663nT.get(iM639f - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: pS */
    public C0127lK mo255B(@Nullable AbstractC0077NC abstractC0077NC) {
        C0127lK c0127lK = (C0127lK) super.mo255B(abstractC0077NC);
        C0094Tz c0094Tz = this.f708W;
        c0127lK.f708W = c0094Tz != null ? c0094Tz.clone() : null;
        Qe qe = new Qe(c0127lK, this.f710se.size());
        c0127lK.f710se = qe;
        qe.addAll(this.f710se);
        return c0127lK;
    }

    @Nullable
    /* renamed from: pt */
    public C0127lK m667pt(String str) {
        return C0055AV.m118QU(str, this);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: se */
    public int mo131se() {
        return this.f710se.size();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: u */
    public C0094Tz mo282u() {
        if (this.f708W == null) {
            this.f708W = new C0094Tz();
        }
        return this.f708W;
    }

    /* renamed from: uR */
    public String m668uR() {
        C0094Tz c0094Tz = this.f708W;
        return c0094Tz != null ? c0094Tz.m450B("id") : "";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: v */
    public final C0127lK mo278pb() {
        return (C0127lK) this.f461xC;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: w8 */
    protected void mo283w8(String str) {
        mo282u().m459go(f704Mo, str);
    }

    /* renamed from: wt */
    public boolean m670wt(String str) {
        C0094Tz c0094Tz = this.f708W;
        if (c0094Tz == null) {
            return false;
        }
        String strM450B = c0094Tz.m450B("class");
        int length = strM450B.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM450B);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM450B.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM450B.regionMatches(true, i, str, 0, length2)) {
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
                return strM450B.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* renamed from: y */
    public String m671y() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        m656el(sbM779xC);
        String strM778w8 = C0157x3.m778w8(sbM779xC);
        return C0063G.m196q(this).m328se() ? strM778w8.trim() : strM778w8;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: yS */
    void mo132yS(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        if (pVar.m328se() && m634AI(pVar) && !m643x(pVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m260IS(appendable, i, pVar);
        }
        appendable.append('<').append(m661kZ());
        C0094Tz c0094Tz = this.f708W;
        if (c0094Tz != null) {
            c0094Tz.m454KT(appendable, pVar);
        }
        if (!this.f710se.isEmpty() || !this.f709i.m247se()) {
            appendable.append('>');
        } else if (pVar.m325W() == C0082OO.p.EnumC0167p.html && this.f709i.m248u()) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public C0127lK(C0073Lt c0073Lt, String str) {
        this(c0073Lt, str, null);
    }
}
