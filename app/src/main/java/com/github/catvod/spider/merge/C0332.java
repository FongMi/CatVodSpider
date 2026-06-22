package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0021;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߊ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0332 extends AbstractC0538 {

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    static final String[] f869;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    static final String[] f870;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    static final String[] f871;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    static final String[] f872;

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    static final String[] f873;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    static final String[] f874;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    static final String[] f875;

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private EnumC0199 f876;

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private EnumC0199 f877;

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private boolean f878;

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    @Nullable
    private C0011 f879;

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    @Nullable
    private C0448 f880;

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    @Nullable
    private C0011 f881;

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    private ArrayList<C0011> f882;

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    private List<String> f883;

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    private AbstractC0021.C0028 f884;

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    private boolean f885;

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    private boolean f886;

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    private boolean f887;

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    private String[] f888 = {null};

    static {
        String strD = SOY.d("1B22211A1103");
        String strD2 = SOY.d("193321021D1814");
        String strD3 = SOY.d("12263C1A");
        String strD4 = SOY.d("1733230701121F");
        String strD5 = SOY.d("15303B131703");
        String strD6 = SOY.d("0E33331A11");
        String strD7 = SOY.d("0E36");
        String strD8 = SOY.d("0E3A");
        f869 = new String[]{strD, strD2, strD3, strD4, strD5, strD6, strD7, strD8};
        String strD9 = SOY.d("153E");
        String strD10 = SOY.d("0F3E");
        f870 = new String[]{strD9, strD10};
        String strD11 = SOY.d("182725021B19");
        f871 = new String[]{strD11};
        f872 = new String[]{strD3, strD6};
        String strD12 = SOY.d("1522251106180F22");
        String strD13 = SOY.d("1522251F1B19");
        f873 = new String[]{strD12, strD13};
        f874 = new String[]{SOY.d("1E36"), SOY.d("1E26"), SOY.d("163B"), strD12, strD13, SOY.d("0A"), SOY.d("0822"), SOY.d("0826")};
        f875 = new String[]{SOY.d("1B363504110409"), strD, SOY.d("1B203417"), SOY.d("1B20251F171B1F"), SOY.d("1B21381211"), SOY.d("18332213"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("183E3E151F060F3D2513"), SOY.d("183D350F"), SOY.d("1820"), strD11, strD2, SOY.d("19373F021105"), SOY.d("193D3D"), SOY.d("193D3D1106180F22"), SOY.d("193D3C1B15191E"), SOY.d("1E36"), SOY.d("1E3725171D1B09"), SOY.d("1E3B23"), SOY.d("1E3B27"), SOY.d("1E3E"), SOY.d("1E26"), SOY.d("1F3F331310"), SOY.d("1C3B341A10041F26"), SOY.d("1C3B361515070E3B3E18"), SOY.d("1C3B36030612"), SOY.d("1C3D3E021105"), SOY.d("1C3D231B"), SOY.d("1C20301B11"), SOY.d("1C20301B11041F26"), SOY.d("1263"), SOY.d("1260"), SOY.d("1261"), SOY.d("1266"), SOY.d("1267"), SOY.d("1264"), SOY.d("12373012"), SOY.d("123730121105"), SOY.d("123523190107"), SOY.d("1220"), strD3, SOY.d("133423171912"), SOY.d("133F36"), SOY.d("133C210300"), SOY.d("13213818101202"), SOY.d("163B"), SOY.d("163B3F1D"), SOY.d("163B22021D191D"), strD4, SOY.d("17373F03"), SOY.d("17372517"), SOY.d("143327"), SOY.d("143D341B16121E"), SOY.d("143D3704151A1F21"), SOY.d("143D2215061E0A26"), strD5, strD9, SOY.d("0A"), SOY.d("0A33231719"), SOY.d("0A3E301F1A031F2A25"), SOY.d("0A2034"), SOY.d("0931231F0403"), SOY.d("093732021D1814"), SOY.d("09373D131703"), SOY.d("0926281A11"), SOY.d("09273C1B150503"), strD6, SOY.d("0E303E120D"), strD7, SOY.d("0E37290215051F33"), SOY.d("0E343E1900"), strD8, SOY.d("0E3A341710"), SOY.d("0E3B251A11"), SOY.d("0E20"), strD10, SOY.d("0D3023"), SOY.d("023F21")};
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private void m1265(String... strArr) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f1205.get(size);
            if (C0008.m137(c0011.m193(), strArr) || c0011.m193().equals(SOY.d("12263C1A"))) {
                return;
            }
            this.f1205.remove(size);
        }
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    private boolean m1266(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f888;
        strArr3[0] = str;
        return m1267(strArr3, strArr, strArr2);
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    private boolean m1267(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f1205.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM193 = this.f1205.get(size).m193();
            if (C0008.m138(strM193, strArr)) {
                return true;
            }
            if (C0008.m138(strM193, strArr2)) {
                return false;
            }
            if (strArr3 != null && C0008.m138(strM193, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ޥ, reason: contains not printable characters */
    private void m1268(AbstractC0191 abstractC0191) {
        C0448 c0448;
        if (this.f1205.isEmpty()) {
            this.f1204.m172(abstractC0191);
        } else if (m1313()) {
            m1309(abstractC0191);
        } else {
            m1732().m172(abstractC0191);
        }
        if (abstractC0191 instanceof C0011) {
            C0011 c0011 = (C0011) abstractC0191;
            if (!c0011.m202().m313() || (c0448 = this.f880) == null) {
                return;
            }
            c0448.m1678(c0011);
        }
    }

    /* JADX INFO: renamed from: ࡡ, reason: contains not printable characters */
    private boolean m1269(ArrayList<C0011> arrayList, C0011 c0011) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c0011) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ࡥ, reason: contains not printable characters */
    private boolean m1270(C0011 c0011, C0011 c00112) {
        return c0011.m193().equals(c00112.m193()) && c0011.mo164().equals(c00112.mo164());
    }

    /* JADX INFO: renamed from: ࢰ, reason: contains not printable characters */
    private void m1271(ArrayList<C0011> arrayList, C0011 c0011, C0011 c00112) {
        int iLastIndexOf = arrayList.lastIndexOf(c0011);
        C0034.m278(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c00112);
    }

    public String toString() {
        return SOY.d("2E2034133602133E3513060C1927230411190E063E1D111947") + this.f1207 + SOY.d("5672220215031F6F") + this.f876 + SOY.d("5672320306051F3C2533181217373F0249") + m1732() + '}';
    }

    @Override // com.github.catvod.spider.merge.AbstractC0538
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    C0435 mo1272() {
        return C0435.f1064;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0538
    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected void mo1273(Reader reader, String str, C0165 c0165) {
        super.mo1273(reader, str, c0165);
        this.f876 = EnumC0199.f508;
        this.f877 = null;
        this.f878 = false;
        this.f879 = null;
        this.f880 = null;
        this.f881 = null;
        this.f882 = new ArrayList<>();
        this.f883 = new ArrayList();
        this.f884 = new AbstractC0021.C0028();
        this.f885 = true;
        this.f886 = false;
        this.f887 = false;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0538
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected boolean mo1274(String str) {
        return str.equals(SOY.d("0931231F0403")) || str.equals(SOY.d("0926281A11"));
    }

    @Override // com.github.catvod.spider.merge.AbstractC0538
    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected boolean mo1275(AbstractC0021 abstractC0021) {
        this.f1207 = abstractC0021;
        return this.f876.mo761(abstractC0021, this);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0538
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ boolean mo1276(String str, C0542 c0542) {
        return super.mo1276(str, c0542);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    C0011 m1277(C0011 c0011) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            if (this.f1205.get(size) == c0011) {
                return this.f1205.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    void m1278(C0011 c0011) {
        int i = 0;
        for (int size = this.f882.size() - 1; size >= 0; size--) {
            C0011 c00112 = this.f882.get(size);
            if (c00112 == null) {
                return;
            }
            if (m1270(c0011, c00112)) {
                i++;
            }
            if (i == 3) {
                this.f882.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    void m1279() {
        while (!this.f882.isEmpty() && m1335() != null) {
        }
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    void m1280() {
        m1265(SOY.d("0E303E120D"), SOY.d("0E343E1900"), SOY.d("0E3A341710"), SOY.d("0E373C0618160E37"));
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    void m1281() {
        m1265(SOY.d("0E33331A11"));
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    void m1282() {
        m1265(SOY.d("0E20"), SOY.d("0E373C0618160E37"));
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    void m1283(EnumC0199 enumC0199) {
        if (this.f1201.m581().m641()) {
            this.f1201.m581().add(new C0378(this.f1202.m636(), SOY.d("2F3C340E041219263412540315393418542C5F210C56031F1F3C711F1A570926300211572177222B"), this.f1207.m242(), enumC0199));
        }
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    void m1284(boolean z) {
        this.f885 = z;
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    boolean m1285() {
        return this.f885;
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    void m1286() {
        m1287(null);
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    void m1287(String str) {
        while (str != null && !m1732().m193().equals(str) && C0008.m138(m1732().m193(), f874)) {
            m1323();
        }
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    C0011 m1288(String str) {
        for (int size = this.f882.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f882.get(size);
            if (c0011 == null) {
                return null;
            }
            if (c0011.m193().equals(str)) {
                return c0011;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    String m1289() {
        return this.f1206;
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    C0035 m1290() {
        return this.f1204;
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    C0448 m1291() {
        return this.f880;
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    C0011 m1292(String str) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f1205.get(size);
            if (c0011.m193().equals(str)) {
                return c0011;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    C0011 m1293() {
        return this.f879;
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    List<String> m1294() {
        return this.f883;
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    ArrayList<C0011> m1295() {
        return this.f1205;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    boolean m1296(String str) {
        return m1299(str, f871);
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    boolean m1297(String str) {
        return m1299(str, f870);
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    boolean m1298(String str) {
        return m1299(str, null);
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    boolean m1299(String str, String[] strArr) {
        return m1266(str, f869, strArr);
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    boolean m1300(String[] strArr) {
        return m1267(strArr, f869, null);
    }

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    boolean m1301(String str) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            String strM193 = this.f1205.get(size).m193();
            if (strM193.equals(str)) {
                return true;
            }
            if (!C0008.m138(strM193, f873)) {
                return false;
            }
        }
        C0034.m276(SOY.d("293A3E0318135A3C3E0254151F72231315141233331A11"));
        return false;
    }

    /* JADX INFO: renamed from: ޜ, reason: contains not printable characters */
    boolean m1302(String str) {
        return m1266(str, f872, null);
    }

    /* JADX INFO: renamed from: ޝ, reason: contains not printable characters */
    C0011 m1303(AbstractC0021.C0029 c0029) {
        if (c0029.m266() && !c0029.f192.isEmpty() && c0029.f192.m1752(this.f1208) > 0) {
            m1733(SOY.d("3E27211A1D141B26345615030E20381401031F"));
        }
        if (!c0029.m267()) {
            C0011 c0011 = new C0011(C0039.m307(c0029.m268(), this.f1208), null, this.f1208.m1621(c0029.f192));
            m1304(c0011);
            return c0011;
        }
        C0011 c0011M1307 = m1307(c0029);
        this.f1205.add(c0011M1307);
        this.f1203.m802(EnumC0470.f1130);
        this.f1203.m792(this.f884.mo241().m269(c0011M1307.m203()));
        return c0011M1307;
    }

    /* JADX INFO: renamed from: ޞ, reason: contains not printable characters */
    void m1304(C0011 c0011) {
        m1268(c0011);
        this.f1205.add(c0011);
    }

    /* JADX INFO: renamed from: ޟ, reason: contains not printable characters */
    void m1305(AbstractC0021.C0024 c0024) {
        C0011 c0011M1732 = m1732();
        if (c0011M1732 == null) {
            c0011M1732 = this.f1204;
        }
        String strM193 = c0011M1732.m193();
        String strM244 = c0024.m244();
        c0011M1732.m172(c0024.m234() ? new C0127(strM244) : mo1274(strM193) ? new C0002(strM244) : new C0016(strM244));
    }

    /* JADX INFO: renamed from: ޠ, reason: contains not printable characters */
    void m1306(AbstractC0021.C0025 c0025) {
        m1268(new C0003(c0025.m248()));
    }

    /* JADX INFO: renamed from: ޡ, reason: contains not printable characters */
    C0011 m1307(AbstractC0021.C0029 c0029) {
        C0039 c0039M307 = C0039.m307(c0029.m268(), this.f1208);
        C0011 c0011 = new C0011(c0039M307, null, this.f1208.m1621(c0029.f192));
        m1268(c0011);
        if (c0029.m267()) {
            if (!c0039M307.m315()) {
                c0039M307.m319();
            } else if (!c0039M307.m312()) {
                this.f1203.m798(SOY.d("2E3336561716143C3E0254151F72221318115A313D19071E14356A561A180E7230560218133671021510"));
            }
        }
        return c0011;
    }

    /* JADX INFO: renamed from: ޢ, reason: contains not printable characters */
    C0448 m1308(AbstractC0021.C0029 c0029, boolean z) {
        C0448 c0448 = new C0448(C0039.m307(c0029.m268(), this.f1208), null, this.f1208.m1621(c0029.f192));
        m1339(c0448);
        m1268(c0448);
        if (z) {
            this.f1205.add(c0448);
        }
        return c0448;
    }

    /* JADX INFO: renamed from: ޣ, reason: contains not printable characters */
    void m1309(AbstractC0191 abstractC0191) {
        C0011 c0011M1277;
        C0011 c0011M1292 = m1292(SOY.d("0E33331A11"));
        boolean z = false;
        if (c0011M1292 == null) {
            c0011M1277 = this.f1205.get(0);
        } else if (c0011M1292.mo170() != null) {
            c0011M1277 = c0011M1292.mo170();
            z = true;
        } else {
            c0011M1277 = m1277(c0011M1292);
        }
        if (!z) {
            c0011M1277.m172(abstractC0191);
        } else {
            C0034.m284(c0011M1292);
            c0011M1292.m176(abstractC0191);
        }
    }

    /* JADX INFO: renamed from: ޤ, reason: contains not printable characters */
    void m1310() {
        this.f882.add(null);
    }

    /* JADX INFO: renamed from: ޱ, reason: contains not printable characters */
    void m1311(C0011 c0011, C0011 c00112) {
        int iLastIndexOf = this.f1205.lastIndexOf(c0011);
        C0034.m278(iLastIndexOf != -1);
        this.f1205.add(iLastIndexOf + 1, c00112);
    }

    /* JADX INFO: renamed from: ࡠ, reason: contains not printable characters */
    C0011 m1312(String str) {
        C0011 c0011 = new C0011(C0039.m307(str, this.f1208), null);
        m1304(c0011);
        return c0011;
    }

    /* JADX INFO: renamed from: ࡢ, reason: contains not printable characters */
    boolean m1313() {
        return this.f886;
    }

    /* JADX INFO: renamed from: ࡣ, reason: contains not printable characters */
    boolean m1314() {
        return this.f887;
    }

    /* JADX INFO: renamed from: ࡤ, reason: contains not printable characters */
    boolean m1315(C0011 c0011) {
        return m1269(this.f882, c0011);
    }

    /* JADX INFO: renamed from: ࡦ, reason: contains not printable characters */
    boolean m1316(C0011 c0011) {
        return C0008.m138(c0011.m193(), f875);
    }

    /* JADX INFO: renamed from: ࡧ, reason: contains not printable characters */
    C0011 m1317() {
        if (this.f882.size() <= 0) {
            return null;
        }
        return this.f882.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: ࡨ, reason: contains not printable characters */
    void m1318() {
        this.f877 = this.f876;
    }

    /* JADX INFO: renamed from: ࡩ, reason: contains not printable characters */
    void m1319(C0011 c0011) {
        if (this.f878) {
            return;
        }
        String strMo116 = c0011.mo116(SOY.d("12203410"));
        if (strMo116.length() != 0) {
            this.f1206 = strMo116;
            this.f878 = true;
            this.f1204.m698(strMo116);
        }
    }

    /* JADX INFO: renamed from: ࡪ, reason: contains not printable characters */
    void m1320() {
        this.f883 = new ArrayList();
    }

    /* JADX INFO: renamed from: ࢠ, reason: contains not printable characters */
    boolean m1321(C0011 c0011) {
        return m1269(this.f1205, c0011);
    }

    /* JADX INFO: renamed from: ࢡ, reason: contains not printable characters */
    EnumC0199 m1322() {
        return this.f877;
    }

    /* JADX INFO: renamed from: ࢢ, reason: contains not printable characters */
    C0011 m1323() {
        return this.f1205.remove(this.f1205.size() - 1);
    }

    /* JADX INFO: renamed from: ࢣ, reason: contains not printable characters */
    void m1324(String str) {
        for (int size = this.f1205.size() - 1; size >= 0 && !this.f1205.get(size).m193().equals(str); size--) {
            this.f1205.remove(size);
        }
    }

    /* JADX INFO: renamed from: ࢤ, reason: contains not printable characters */
    C0011 m1325(String str) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f1205.get(size);
            this.f1205.remove(size);
            if (c0011.m193().equals(str)) {
                return c0011;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ࢥ, reason: contains not printable characters */
    void m1326(String... strArr) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f1205.get(size);
            this.f1205.remove(size);
            if (C0008.m138(c0011.m193(), strArr)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ࢦ, reason: contains not printable characters */
    int m1327(C0011 c0011) {
        for (int i = 0; i < this.f882.size(); i++) {
            if (c0011 == this.f882.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ࢧ, reason: contains not printable characters */
    boolean m1328(AbstractC0021 abstractC0021, EnumC0199 enumC0199) {
        this.f1207 = abstractC0021;
        return enumC0199.mo761(abstractC0021, this);
    }

    /* JADX INFO: renamed from: ࢨ, reason: contains not printable characters */
    void m1329(C0011 c0011) {
        this.f1205.add(c0011);
    }

    /* JADX INFO: renamed from: ࢩ, reason: contains not printable characters */
    void m1330(C0011 c0011) {
        m1278(c0011);
        this.f882.add(c0011);
    }

    /* JADX INFO: renamed from: ࢪ, reason: contains not printable characters */
    void m1331(C0011 c0011, int i) {
        m1278(c0011);
        this.f882.add(i, c0011);
    }

    /* JADX INFO: renamed from: ࢫ, reason: contains not printable characters */
    void m1332() {
        C0011 c0011M1317 = m1317();
        if (c0011M1317 == null || m1321(c0011M1317)) {
            return;
        }
        boolean z = true;
        int size = this.f882.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            c0011M1317 = this.f882.get(i);
            if (c0011M1317 == null || m1321(c0011M1317)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i++;
                c0011M1317 = this.f882.get(i);
            }
            C0034.m284(c0011M1317);
            C0011 c0011M1312 = m1312(c0011M1317.m193());
            c0011M1312.mo164().m1749(c0011M1317.mo164());
            this.f882.set(i, c0011M1312);
            if (i == size) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ࢬ, reason: contains not printable characters */
    void m1333(C0011 c0011) {
        for (int size = this.f882.size() - 1; size >= 0; size--) {
            if (this.f882.get(size) == c0011) {
                this.f882.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ࢭ, reason: contains not printable characters */
    boolean m1334(C0011 c0011) {
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            if (this.f1205.get(size) == c0011) {
                this.f1205.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ࢮ, reason: contains not printable characters */
    C0011 m1335() {
        int size = this.f882.size();
        if (size > 0) {
            return this.f882.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ࢯ, reason: contains not printable characters */
    void m1336(C0011 c0011, C0011 c00112) {
        m1271(this.f882, c0011, c00112);
    }

    /* JADX INFO: renamed from: ࢱ, reason: contains not printable characters */
    void m1337(C0011 c0011, C0011 c00112) {
        m1271(this.f1205, c0011, c00112);
    }

    /* JADX INFO: renamed from: ࢲ, reason: contains not printable characters */
    void m1338() {
        boolean z = false;
        for (int size = this.f1205.size() - 1; size >= 0; size--) {
            C0011 c0011 = this.f1205.get(size);
            if (size == 0) {
                c0011 = this.f881;
                z = true;
            }
            String strM193 = c0011 != null ? c0011.m193() : "";
            if (SOY.d("09373D131703").equals(strM193)) {
                m1343(EnumC0199.f523);
                return;
            }
            if (SOY.d("0E36").equals(strM193) || (SOY.d("0E3A").equals(strM193) && !z)) {
                m1343(EnumC0199.f522);
                return;
            }
            if (SOY.d("0E20").equals(strM193)) {
                m1343(EnumC0199.f521);
                return;
            }
            if (SOY.d("0E303E120D").equals(strM193) || SOY.d("0E3A341710").equals(strM193) || SOY.d("0E343E1900").equals(strM193)) {
                m1343(EnumC0199.f520);
                return;
            }
            if (SOY.d("193321021D1814").equals(strM193)) {
                m1343(EnumC0199.f518);
                return;
            }
            if (SOY.d("193D3D1106180F22").equals(strM193)) {
                m1343(EnumC0199.f519);
                return;
            }
            if (SOY.d("0E33331A11").equals(strM193)) {
                m1343(EnumC0199.f516);
                return;
            }
            if (SOY.d("12373012").equals(strM193)) {
                m1343(EnumC0199.f514);
                return;
            }
            if (SOY.d("183D350F").equals(strM193)) {
                m1343(EnumC0199.f514);
                return;
            }
            if (SOY.d("1C20301B11041F26").equals(strM193)) {
                m1343(EnumC0199.f526);
                return;
            } else if (SOY.d("12263C1A").equals(strM193)) {
                m1343(EnumC0199.f510);
                return;
            } else {
                if (z) {
                    m1343(EnumC0199.f514);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ࢳ, reason: contains not printable characters */
    void m1339(C0448 c0448) {
        this.f880 = c0448;
    }

    /* JADX INFO: renamed from: ࢴ, reason: contains not printable characters */
    void m1340(boolean z) {
        this.f886 = z;
    }

    /* JADX INFO: renamed from: ࢶ, reason: contains not printable characters */
    void m1341(C0011 c0011) {
        this.f879 = c0011;
    }

    /* JADX INFO: renamed from: ࢷ, reason: contains not printable characters */
    EnumC0199 m1342() {
        return this.f876;
    }

    /* JADX INFO: renamed from: ࢸ, reason: contains not printable characters */
    void m1343(EnumC0199 enumC0199) {
        this.f876 = enumC0199;
    }
}
