package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G implements Cloneable {
    private static final Map<String, G> j = new HashMap();
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private String a;
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    static {
        String strD = ZrJ.d("0A2039243831");
        String strD2 = ZrJ.d("0A3732212D");
        String strD3 = ZrJ.d("14263F2C");
        String strD4 = ZrJ.d("152A2526");
        String strD5 = ZrJ.d("0D2A3F212D");
        String strD6 = ZrJ.d("1F312A202D");
        String strD7 = ZrJ.d("09");
        String strD8 = ZrJ.d("1172");
        String strD9 = ZrJ.d("1171");
        String strD10 = ZrJ.d("09312E");
        String[] strArr = {ZrJ.d("11372621"), ZrJ.d("11262A29"), ZrJ.d("1B2C2F34"), ZrJ.d("1F312A202D361C37"), strD, ZrJ.d("172C382E3A2C0937"), strD2, strD3, strD4, strD5, strD6, ZrJ.d("172C2D3F29281C30"), ZrJ.d("0A262839212A17"), ZrJ.d("17223D"), ZrJ.d("183022292D"), ZrJ.d("112439223D35"), ZrJ.d("11262A292D37"), ZrJ.d("1F2C24392D37"), strD7, strD8, strD9, ZrJ.d("1170"), ZrJ.d("1177"), ZrJ.d("1176"), ZrJ.d("1175"), ZrJ.d("0C2F"), ZrJ.d("162F"), strD10, ZrJ.d("1D2A3D"), ZrJ.d("1B2F242E23340C2C3F28"), ZrJ.d("1131"), ZrJ.d("18272F3F2D360A"), ZrJ.d("1F2A2C383A20"), ZrJ.d("1F2A2C2E29350D2A2423"), ZrJ.d("1F2C3920"), ZrJ.d("1F2A2E212C361C37"), ZrJ.d("102D38"), ZrJ.d("1D2627"), ZrJ.d("1D2F"), ZrJ.d("1D37"), ZrJ.d("1D27"), ZrJ.d("152A"), ZrJ.d("0D2229212D"), ZrJ.d("1A223B39212A17"), ZrJ.d("0D2B2E2C2C"), ZrJ.d("0D2524223C"), ZrJ.d("0D21242931"), ZrJ.d("1A2C272A3A2A0C33"), ZrJ.d("1A2C27"), ZrJ.d("0D31"), ZrJ.d("0D2B"), ZrJ.d("0D27"), ZrJ.d("0F2A2F2827"), ZrJ.d("18362F2427"), ZrJ.d("1A22253B2936"), ZrJ.d("1D263F2C21290A"), ZrJ.d("14262538"), ZrJ.d("092F2A2426311C3B3F"), ZrJ.d("0D26263D24240D26"), ZrJ.d("18313F242B291C"), ZrJ.d("14222223"), ZrJ.d("0A352C"), ZrJ.d("14223F25"), ZrJ.d("1A2625392D37"), ZrJ.d("0D26263D24240D26"), ZrJ.d("1D2A39"), ZrJ.d("18333B212D31"), ZrJ.d("1422393C3D201C"), ZrJ.d("152A3839212B1E")};
        String strD11 = ZrJ.d("162121282B31");
        String strD12 = ZrJ.d("102D3B383C");
        String strD13 = ZrJ.d("0A2627282B31");
        String strD14 = ZrJ.d("0D26333929371C22");
        String strD15 = ZrJ.d("1226322A2D2B");
        String strD16 = ZrJ.d("18312E2C");
        String strD17 = ZrJ.d("0922392C25");
        String strD18 = ZrJ.d("0A2C3E3F2B20");
        String strD19 = ZrJ.d("0D312A2E23");
        k = new String[]{strD11, ZrJ.d("1B223828"), ZrJ.d("1F2C2539"), ZrJ.d("0D37"), ZrJ.d("10"), ZrJ.d("1B"), ZrJ.d("0C"), ZrJ.d("1B2A2C"), ZrJ.d("0A2E2A2124"), ZrJ.d("1C2E"), ZrJ.d("0A3739222622"), ZrJ.d("1D2525"), ZrJ.d("1A2C2F28"), ZrJ.d("0A22263D"), ZrJ.d("12212F"), ZrJ.d("0F2239"), ZrJ.d("1A2A3F28"), ZrJ.d("1821293F"), ZrJ.d("0D2A2628"), ZrJ.d("18203922263C14"), ZrJ.d("14223926"), ZrJ.d("0B362934"), ZrJ.d("0B37"), ZrJ.d("0B33"), ZrJ.d("18"), ZrJ.d("102E2C"), ZrJ.d("1B31"), ZrJ.d("0E2139"), ZrJ.d("14223B"), ZrJ.d("08"), ZrJ.d("0A3629"), ZrJ.d("0A363B"), ZrJ.d("1B2724"), ZrJ.d("1025392C2520"), ZrJ.d("1C2E29282C"), ZrJ.d("0A332A23"), strD12, strD13, strD14, ZrJ.d("1522292824"), ZrJ.d("1B363F39272B"), ZrJ.d("16333F2A3A2A0C33"), ZrJ.d("16333F24272B"), ZrJ.d("15262C282621"), ZrJ.d("1D223F2C242C0A37"), strD15, ZrJ.d("16363F3D3D31"), ZrJ.d("0931242A3A200A30"), ZrJ.d("14263F283A"), strD16, strD17, strD18, strD19, ZrJ.d("0A362620293700"), ZrJ.d("1A2C2620292B1D"), ZrJ.d("1D263D242B20"), strD16, ZrJ.d("1B2238282E2A1737"), ZrJ.d("1B2438223D2B1D"), ZrJ.d("1426253821311C2E"), strD17, strD18, strD19, ZrJ.d("1D223F2C"), ZrJ.d("1B2722"), ZrJ.d("0A"), ZrJ.d("0A3739242320"), ZrJ.d("172C293F")};
        l = new String[]{strD3, strD4, ZrJ.d("1B223828"), strD6, ZrJ.d("102E2C"), ZrJ.d("1B31"), ZrJ.d("0E2139"), ZrJ.d("1C2E29282C"), ZrJ.d("1131"), strD12, strD15, ZrJ.d("1A2C27"), ZrJ.d("1A2C2620292B1D"), ZrJ.d("1D263D242B20"), strD16, ZrJ.d("1B2238282E2A1737"), ZrJ.d("1B2438223D2B1D"), ZrJ.d("1426253821311C2E"), strD17, strD18, strD19};
        m = new String[]{strD5, ZrJ.d("18"), strD7, strD8, strD9, ZrJ.d("1170"), ZrJ.d("1177"), ZrJ.d("1176"), ZrJ.d("1175"), strD10, ZrJ.d("18272F3F2D360A"), ZrJ.d("152A"), ZrJ.d("0D2B"), ZrJ.d("0D27"), strD, strD2, ZrJ.d("102D38"), ZrJ.d("1D2627"), ZrJ.d("0A")};
        n = new String[]{strD10, ZrJ.d("092F2A2426311C3B3F"), strD5, strD14};
        o = new String[]{ZrJ.d("1B363F39272B"), ZrJ.d("1F2A2E212C361C37"), strD12, strD15, strD11, ZrJ.d("16363F3D3D31"), strD13, strD14};
        p = new String[]{strD12, strD15, strD11, strD13, strD14};
        for (int i = 0; i < 69; i++) {
            G g = new G(strArr[i]);
            j.put(g.a, g);
        }
        for (String str : k) {
            G g2 = new G(str);
            g2.c = false;
            g2.d = false;
            j.put(g2.a, g2);
        }
        for (String str2 : l) {
            G g3 = (G) j.get(str2);
            com.github.catvod.spider.merge.XU.k.g(g3);
            g3.e = true;
        }
        for (String str3 : m) {
            G g4 = (G) j.get(str3);
            com.github.catvod.spider.merge.XU.k.g(g4);
            g4.d = false;
        }
        for (String str4 : n) {
            G g5 = (G) j.get(str4);
            com.github.catvod.spider.merge.XU.k.g(g5);
            g5.g = true;
        }
        for (String str5 : o) {
            G g6 = (G) j.get(str5);
            com.github.catvod.spider.merge.XU.k.g(g6);
            g6.h = true;
        }
        for (String str6 : p) {
            G g7 = (G) j.get(str6);
            com.github.catvod.spider.merge.XU.k.g(g7);
            g7.i = true;
        }
    }

    private G(String str) {
        this.a = str;
        this.b = com.github.catvod.spider.merge.Bk.l.c(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    public static boolean h(String str) {
        return j.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    public static G m(String str, E e) {
        com.github.catvod.spider.merge.XU.k.g(str);
        ?? r0 = j;
        G g = (G) r0.get(str);
        if (g != null) {
            return g;
        }
        String strD = e.d(str);
        com.github.catvod.spider.merge.XU.k.e(strD);
        String strC = com.github.catvod.spider.merge.Bk.l.c(strD);
        G g2 = (G) r0.get(strC);
        if (g2 == null) {
            G g3 = new G(strD);
            g3.c = false;
            return g3;
        }
        if (!e.f() || strD.equals(strC)) {
            return g2;
        }
        try {
            G g4 = (G) super.clone();
            g4.a = strD;
            return g4;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    protected final Object clone() {
        try {
            return (G) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return this.a.equals(g.a) && this.e == g.e && this.d == g.d && this.c == g.c && this.g == g.g && this.f == g.f && this.h == g.h && this.i == g.i;
    }

    public final boolean f() {
        return !this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Mp.G>] */
    public final boolean g() {
        return j.containsKey(this.a);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public final boolean i() {
        return this.e || this.f;
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        return this.g;
    }

    final G l() {
        this.f = true;
        return this;
    }

    public final String toString() {
        return this.a;
    }
}
