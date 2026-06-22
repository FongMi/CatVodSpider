package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0040;
import com.github.catvod.spider.merge.C0035;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ĺ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0011 extends AbstractC0191 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final List<C0011> f155 = Collections.emptyList();

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final Pattern f156 = Pattern.compile(SOY.d("26217A"));

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final String f157 = C0542.m1745(SOY.d("18332213210513"));

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private C0039 f158;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    @Nullable
    private WeakReference<List<C0011>> f159;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    List<AbstractC0191> f160;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    @Nullable
    private C0542 f161;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ĺ$Ϳ, reason: contains not printable characters */
    class C0012 implements InterfaceC0539 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ StringBuilder f162;

        C0012(StringBuilder sb) {
            this.f162 = sb;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public void mo207(AbstractC0191 abstractC0191, int i) {
            if ((abstractC0191 instanceof C0011) && ((C0011) abstractC0191).m191() && (abstractC0191.m688() instanceof C0016) && !C0016.m211(this.f162)) {
                this.f162.append(' ');
            }
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public void mo208(AbstractC0191 abstractC0191, int i) {
            if (abstractC0191 instanceof C0016) {
                C0011.m156(this.f162, (C0016) abstractC0191);
            } else if (abstractC0191 instanceof C0011) {
                C0011 c0011 = (C0011) abstractC0191;
                if (this.f162.length() > 0) {
                    if ((c0011.m191() || c0011.f158.m310().equals(SOY.d("1820"))) && !C0016.m211(this.f162)) {
                        this.f162.append(' ');
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ĺ$Ԩ, reason: contains not printable characters */
    private static final class C0013 extends AbstractC0126<AbstractC0191> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final C0011 f164;

        C0013(C0011 c0011, int i) {
            super(i);
            this.f164 = c0011;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0126
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public void mo209() {
            this.f164.mo169();
        }
    }

    public C0011(String str) {
        this(C0039.m306(str), "", null);
    }

    /* JADX INFO: renamed from: ޡ, reason: contains not printable characters */
    private static void m155(C0011 c0011, C0455 c0455) {
        C0011 c0011Mo170 = c0011.mo170();
        if (c0011Mo170 == null || c0011Mo170.m203().equals(SOY.d("59203E1900"))) {
            return;
        }
        c0455.add(c0011Mo170);
        m155(c0011Mo170, c0455);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ޤ, reason: contains not printable characters */
    public static void m156(StringBuilder sb, C0016 c0016) {
        String strM213 = c0016.m213();
        if (m162(c0016.f477) || (c0016 instanceof C0127)) {
            sb.append(strM213);
        } else {
            C0008.m135(sb, strM213, C0016.m211(sb));
        }
    }

    /* JADX INFO: renamed from: ޱ, reason: contains not printable characters */
    private static void m157(C0011 c0011, StringBuilder sb) {
        if (!c0011.f158.m310().equals(SOY.d("1820")) || C0016.m211(sb)) {
            return;
        }
        sb.append(SOY.d("5A"));
    }

    /* JADX INFO: renamed from: ࢥ, reason: contains not printable characters */
    private static <E extends C0011> int m158(C0011 c0011, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c0011) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ࢧ, reason: contains not printable characters */
    private boolean m159(C0035.C0036 c0036) {
        return this.f158.m309() || (mo170() != null && mo170().m202().m309()) || c0036.m301();
    }

    /* JADX INFO: renamed from: ࢨ, reason: contains not printable characters */
    private boolean m160(C0035.C0036 c0036) {
        return (!m202().m314() || m202().m312() || (mo170() != null && !mo170().m191()) || m692() == null || c0036.m301()) ? false : true;
    }

    /* JADX INFO: renamed from: ࢬ, reason: contains not printable characters */
    private void m161(StringBuilder sb) {
        for (AbstractC0191 abstractC0191 : this.f160) {
            if (abstractC0191 instanceof C0016) {
                m156(sb, (C0016) abstractC0191);
            } else if (abstractC0191 instanceof C0011) {
                m157((C0011) abstractC0191, sb);
            }
        }
    }

    /* JADX INFO: renamed from: ࢯ, reason: contains not printable characters */
    static boolean m162(@Nullable AbstractC0191 abstractC0191) {
        if (abstractC0191 instanceof C0011) {
            C0011 c0011Mo170 = (C0011) abstractC0191;
            int i = 0;
            while (!c0011Mo170.f158.m318()) {
                c0011Mo170 = c0011Mo170.mo170();
                i++;
                if (i >= 6 || c0011Mo170 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ࢲ, reason: contains not printable characters */
    private static String m163(C0011 c0011, String str) {
        while (c0011 != null) {
            C0542 c0542 = c0011.f161;
            if (c0542 != null && c0542.m1755(str)) {
                return c0011.f161.m1753(str);
            }
            c0011 = c0011.mo170();
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public C0542 mo164() {
        if (this.f161 == null) {
            this.f161 = new C0542();
        }
        return this.f161;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: Ԭ */
    public String mo118() {
        return m163(this, f157);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ԯ */
    public int mo119() {
        return this.f160.size();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected void mo166(String str) {
        mo164().m1761(f157, str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected List<AbstractC0191> mo167() {
        if (this.f160 == AbstractC0191.f476) {
            this.f160 = new C0013(this, 4);
        }
        return this.f160;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected boolean mo168() {
        return this.f161 != null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: މ */
    public String mo122() {
        return this.f158.m310();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    void mo169() {
        super.mo169();
        this.f159 = null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ލ */
    void mo123(Appendable appendable, int i, C0035.C0036 c0036) throws IOException {
        if (c0036.m303() && m159(c0036) && !m160(c0036) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m687(appendable, i, c0036);
        }
        appendable.append('<').append(m203());
        C0542 c0542 = this.f161;
        if (c0542 != null) {
            c0542.m1758(appendable, c0036);
        }
        if (!this.f160.isEmpty() || !this.f158.m316()) {
            appendable.append('>');
        } else if (c0036.m304() == C0035.C0036.EnumC0037.f215 && this.f158.m312()) {
            appendable.append('>');
        } else {
            appendable.append(SOY.d("5A7D6F"));
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ގ */
    void mo124(Appendable appendable, int i, C0035.C0036 c0036) throws IOException {
        if (this.f160.isEmpty() && this.f158.m316()) {
            return;
        }
        if (c0036.m303() && !this.f160.isEmpty() && (this.f158.m309() || (c0036.m301() && (this.f160.size() > 1 || (this.f160.size() == 1 && !(this.f160.get(0) instanceof C0016)))))) {
            m687(appendable, i, c0036);
        }
        appendable.append(SOY.d("467D")).append(m203()).append('>');
    }

    /* JADX INFO: renamed from: ޢ, reason: contains not printable characters */
    public C0011 m172(AbstractC0191 abstractC0191) {
        C0034.m284(abstractC0191);
        m695(abstractC0191);
        mo167();
        this.f160.add(abstractC0191);
        abstractC0191.m700(this.f160.size() - 1);
        return this;
    }

    /* JADX INFO: renamed from: ޣ, reason: contains not printable characters */
    public C0011 m173(String str) {
        C0011 c0011 = new C0011(C0039.m307(str, C0176.m597(this).m584()), mo118());
        m172(c0011);
        return c0011;
    }

    /* JADX INFO: renamed from: ޥ, reason: contains not printable characters */
    public C0011 m174(String str) {
        C0034.m284(str);
        m172(new C0016(str));
        return this;
    }

    /* JADX INFO: renamed from: ࡠ, reason: contains not printable characters */
    public C0011 m175(String str, String str2) {
        super.mo430(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: ࡡ, reason: contains not printable characters */
    public C0011 m176(AbstractC0191 abstractC0191) {
        return (C0011) super.m682(abstractC0191);
    }

    /* JADX INFO: renamed from: ࡢ, reason: contains not printable characters */
    public C0011 m177(int i) {
        return m178().get(i);
    }

    /* JADX INFO: renamed from: ࡣ, reason: contains not printable characters */
    List<C0011> m178() {
        List<C0011> list;
        if (mo119() == 0) {
            return f155;
        }
        WeakReference<List<C0011>> weakReference = this.f159;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f160.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC0191 abstractC0191 = this.f160.get(i);
            if (abstractC0191 instanceof C0011) {
                arrayList.add((C0011) abstractC0191);
            }
        }
        this.f159 = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ࡤ, reason: contains not printable characters */
    public C0455 m179() {
        return new C0455(m178());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ࡥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0011 mo120() {
        return (C0011) super.mo120();
    }

    /* JADX INFO: renamed from: ࡦ, reason: contains not printable characters */
    public String m181() {
        StringBuilder sbM136 = C0008.m136();
        for (AbstractC0191 abstractC0191 : this.f160) {
            if (abstractC0191 instanceof C0002) {
                sbM136.append(((C0002) abstractC0191).m126());
            } else if (abstractC0191 instanceof C0003) {
                sbM136.append(((C0003) abstractC0191).m128());
            } else if (abstractC0191 instanceof C0011) {
                sbM136.append(((C0011) abstractC0191).m181());
            } else if (abstractC0191 instanceof C0127) {
                sbM136.append(((C0127) abstractC0191).m213());
            }
        }
        return C0008.m147(sbM136);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ࡧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0011 mo165(@Nullable AbstractC0191 abstractC0191) {
        C0011 c0011 = (C0011) super.mo165(abstractC0191);
        C0542 c0542 = this.f161;
        c0011.f161 = c0542 != null ? c0542.clone() : null;
        C0013 c0013 = new C0013(c0011, this.f160.size());
        c0011.f160 = c0013;
        c0013.addAll(this.f160);
        return c0011;
    }

    /* JADX INFO: renamed from: ࡨ, reason: contains not printable characters */
    public int m183() {
        if (mo170() == null) {
            return 0;
        }
        return m158(this, mo170().m178());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ࡩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0011 mo121() {
        this.f160.clear();
        return this;
    }

    /* JADX INFO: renamed from: ࡪ, reason: contains not printable characters */
    public C0455 m185() {
        return C0372.m1442(new AbstractC0040.C0041(), this);
    }

    /* JADX INFO: renamed from: ࢠ, reason: contains not printable characters */
    public C0455 m186(String str) {
        C0034.m282(str);
        return C0372.m1442(new AbstractC0040.C0076(C0256.m917(str)), this);
    }

    /* JADX INFO: renamed from: ࢡ, reason: contains not printable characters */
    public boolean m187(String str) {
        C0542 c0542 = this.f161;
        if (c0542 == null) {
            return false;
        }
        String strM1754 = c0542.m1754(SOY.d("193E300507"));
        int length = strM1754.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM1754);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM1754.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM1754.regionMatches(true, i, str, 0, length2)) {
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
                return strM1754.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ࢢ, reason: contains not printable characters */
    public <T extends Appendable> T m188(T t) {
        int size = this.f160.size();
        for (int i = 0; i < size; i++) {
            this.f160.get(i).m689(t);
        }
        return t;
    }

    /* JADX INFO: renamed from: ࢣ, reason: contains not printable characters */
    public String m189() {
        StringBuilder sbM136 = C0008.m136();
        m188(sbM136);
        String strM147 = C0008.m147(sbM136);
        return C0176.m596(this).m303() ? strM147.trim() : strM147;
    }

    /* JADX INFO: renamed from: ࢤ, reason: contains not printable characters */
    public String m190() {
        C0542 c0542 = this.f161;
        return c0542 != null ? c0542.m1754(SOY.d("1336")) : "";
    }

    /* JADX INFO: renamed from: ࢦ, reason: contains not printable characters */
    public boolean m191() {
        return this.f158.m311();
    }

    @Nullable
    /* JADX INFO: renamed from: ࢩ, reason: contains not printable characters */
    public C0011 m192() {
        if (this.f477 == null) {
            return null;
        }
        List<C0011> listM178 = mo170().m178();
        int iM158 = m158(this, listM178) + 1;
        if (listM178.size() > iM158) {
            return listM178.get(iM158);
        }
        return null;
    }

    /* JADX INFO: renamed from: ࢪ, reason: contains not printable characters */
    public String m193() {
        return this.f158.m317();
    }

    /* JADX INFO: renamed from: ࢫ, reason: contains not printable characters */
    public String m194() {
        StringBuilder sbM136 = C0008.m136();
        m161(sbM136);
        return C0008.m147(sbM136).trim();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ࢭ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0011 mo170() {
        return (C0011) this.f477;
    }

    /* JADX INFO: renamed from: ࢮ, reason: contains not printable characters */
    public C0455 m196() {
        C0455 c0455 = new C0455();
        m155(this, c0455);
        return c0455;
    }

    @Nullable
    /* JADX INFO: renamed from: ࢰ, reason: contains not printable characters */
    public C0011 m197() {
        List<C0011> listM178;
        int iM158;
        if (this.f477 != null && (iM158 = m158(this, (listM178 = mo170().m178()))) > 0) {
            return listM178.get(iM158 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ࢱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0011 mo171() {
        return (C0011) super.mo171();
    }

    /* JADX INFO: renamed from: ࢳ, reason: contains not printable characters */
    public C0455 m199(String str) {
        return C0170.m590(str, this);
    }

    @Nullable
    /* JADX INFO: renamed from: ࢴ, reason: contains not printable characters */
    public C0011 m200(String str) {
        return C0170.m592(str, this);
    }

    /* JADX INFO: renamed from: ࢶ, reason: contains not printable characters */
    public C0455 m201() {
        if (this.f477 == null) {
            return new C0455(0);
        }
        List<C0011> listM178 = mo170().m178();
        C0455 c0455 = new C0455(listM178.size() - 1);
        for (C0011 c0011 : listM178) {
            if (c0011 != this) {
                c0455.add(c0011);
            }
        }
        return c0455;
    }

    /* JADX INFO: renamed from: ࢷ, reason: contains not printable characters */
    public C0039 m202() {
        return this.f158;
    }

    /* JADX INFO: renamed from: ࢸ, reason: contains not printable characters */
    public String m203() {
        return this.f158.m310();
    }

    /* JADX INFO: renamed from: ࢹ, reason: contains not printable characters */
    public String m204() {
        StringBuilder sbM136 = C0008.m136();
        C0088.m352(new C0012(sbM136), this);
        return C0008.m147(sbM136).trim();
    }

    /* JADX INFO: renamed from: ࢺ, reason: contains not printable characters */
    public C0011 mo205(String str) {
        C0034.m284(str);
        mo121();
        C0035 c0035M690 = m690();
        if (c0035M690 == null || !c0035M690.m292().m583(m193())) {
            m172(new C0016(str));
        } else {
            m172(new C0002(str));
        }
        return this;
    }

    /* JADX INFO: renamed from: ࢻ, reason: contains not printable characters */
    public List<C0016> m206() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0191 abstractC0191 : this.f160) {
            if (abstractC0191 instanceof C0016) {
                arrayList.add((C0016) abstractC0191);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public C0011(C0039 c0039, @Nullable String str, @Nullable C0542 c0542) {
        C0034.m284(c0039);
        this.f160 = AbstractC0191.f476;
        this.f161 = c0542;
        this.f158 = c0039;
        if (str != null) {
            m698(str);
        }
    }

    public C0011(C0039 c0039, String str) {
        this(c0039, str, null);
    }
}
