package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ȉ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0039 implements Cloneable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Map<String, C0039> f222 = new HashMap();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final String[] f223;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final String[] f224;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final String[] f225;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final String[] f226;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final String[] f227;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static final String[] f228;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static final String[] f229;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private String f230;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private String f231;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private boolean f232 = true;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private boolean f233 = true;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private boolean f234 = false;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private boolean f235 = false;

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private boolean f236 = false;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private boolean f237 = false;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private boolean f238 = false;

    static {
        String[] strArr = {SOY.d("12263C1A"), SOY.d("12373012"), SOY.d("183D350F"), SOY.d("1C20301B11041F26"), SOY.d("0931231F0403"), SOY.d("143D2215061E0A26"), SOY.d("0926281A11"), SOY.d("17372517"), SOY.d("163B3F1D"), SOY.d("0E3B251A11"), SOY.d("1C20301B11"), SOY.d("143D3704151A1F21"), SOY.d("093732021D1814"), SOY.d("143327"), SOY.d("1B21381211"), SOY.d("123523190107"), SOY.d("123730121105"), SOY.d("1C3D3E021105"), SOY.d("0A"), SOY.d("1263"), SOY.d("1260"), SOY.d("1261"), SOY.d("1266"), SOY.d("1267"), SOY.d("1264"), SOY.d("0F3E"), SOY.d("153E"), SOY.d("0A2034"), SOY.d("1E3B27"), SOY.d("183E3E151F060F3D2513"), SOY.d("1220"), SOY.d("1B363504110409"), SOY.d("1C3B36030612"), SOY.d("1C3B361515070E3B3E18"), SOY.d("1C3D231B"), SOY.d("1C3B341A10041F26"), SOY.d("133C22"), SOY.d("1E373D"), SOY.d("1E3E"), SOY.d("1E26"), SOY.d("1E36"), SOY.d("163B"), SOY.d("0E33331A11"), SOY.d("193321021D1814"), SOY.d("0E3A341710"), SOY.d("0E343E1900"), SOY.d("0E303E120D"), SOY.d("193D3D1106180F22"), SOY.d("193D3D"), SOY.d("0E20"), SOY.d("0E3A"), SOY.d("0E36"), SOY.d("0C3B35131B"), SOY.d("1B27351F1B"), SOY.d("19333F001504"), SOY.d("1E3725171D1B09"), SOY.d("17373F03"), SOY.d("0A3E301F1A031F2A25"), SOY.d("0E373C0618160E37"), SOY.d("1B20251F171B1F"), SOY.d("17333818"), SOY.d("092436"), SOY.d("1733251E"), SOY.d("19373F021105")};
        f223 = strArr;
        String strD = SOY.d("133C210300");
        String strD2 = SOY.d("0E37290215051F33");
        f224 = new String[]{SOY.d("15303B131703"), SOY.d("18332213"), SOY.d("1C3D3F02"), SOY.d("0E26"), SOY.d("13"), SOY.d("18"), SOY.d("0F"), SOY.d("183B36"), SOY.d("093F301A18"), SOY.d("1F3F"), SOY.d("092623191A10"), SOY.d("1E343F"), SOY.d("193D3513"), SOY.d("09333C06"), SOY.d("113035"), SOY.d("0C3323"), SOY.d("193B2513"), SOY.d("1B303304"), SOY.d("0E3B3C13"), SOY.d("1B3123191A0E17"), SOY.d("1733231D"), SOY.d("0827330F"), SOY.d("0826"), SOY.d("0822"), SOY.d("1B"), SOY.d("133F36"), SOY.d("1820"), SOY.d("0D3023"), SOY.d("173321"), SOY.d("0B"), SOY.d("092733"), SOY.d("092721"), SOY.d("18363E"), SOY.d("133423171912"), SOY.d("1F3F331310"), SOY.d("09223018"), strD, SOY.d("09373D131703"), strD2, SOY.d("1633331318"), SOY.d("182725021B19"), SOY.d("1522251106180F22"), SOY.d("1522251F1B19"), SOY.d("163736131A13"), SOY.d("1E332517181E0926"), SOY.d("113728111119"), SOY.d("152725060103"), SOY.d("0A203E1106120921"), SOY.d("1737251306"), SOY.d("1B203417"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F"), SOY.d("09273C1B150503"), SOY.d("193D3C1B15191E"), SOY.d("1E37271F1712"), SOY.d("1B203417"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("17373F031D031F3F"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F"), SOY.d("1E332517"), SOY.d("183638"), SOY.d("09")};
        f225 = new String[]{SOY.d("17372517"), SOY.d("163B3F1D"), SOY.d("18332213"), SOY.d("1C20301B11"), SOY.d("133F36"), SOY.d("1820"), SOY.d("0D3023"), SOY.d("1F3F331310"), SOY.d("1220"), strD, SOY.d("113728111119"), SOY.d("193D3D"), SOY.d("193D3C1B15191E"), SOY.d("1E37271F1712"), SOY.d("1B203417"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("17373F031D031F3F"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F")};
        f226 = new String[]{SOY.d("0E3B251A11"), SOY.d("1B"), SOY.d("0A"), SOY.d("1263"), SOY.d("1260"), SOY.d("1261"), SOY.d("1266"), SOY.d("1267"), SOY.d("1264"), SOY.d("0A2034"), SOY.d("1B363504110409"), SOY.d("163B"), SOY.d("0E3A"), SOY.d("0E36"), SOY.d("0931231F0403"), SOY.d("0926281A11"), SOY.d("133C22"), SOY.d("1E373D"), SOY.d("09")};
        f227 = new String[]{SOY.d("0A2034"), SOY.d("0A3E301F1A031F2A25"), SOY.d("0E3B251A11"), strD2};
        f228 = new String[]{SOY.d("182725021B19"), SOY.d("1C3B341A10041F26"), strD, SOY.d("113728111119"), SOY.d("15303B131703"), SOY.d("152725060103"), SOY.d("09373D131703"), strD2};
        f229 = new String[]{strD, SOY.d("113728111119"), SOY.d("15303B131703"), SOY.d("09373D131703"), strD2};
        for (String str : strArr) {
            m305(new C0039(str));
        }
        for (String str2 : f224) {
            C0039 c0039 = new C0039(str2);
            c0039.f232 = false;
            c0039.f233 = false;
            m305(c0039);
        }
        for (String str3 : f225) {
            C0039 c00392 = f222.get(str3);
            C0034.m284(c00392);
            c00392.f234 = true;
        }
        for (String str4 : f226) {
            C0039 c00393 = f222.get(str4);
            C0034.m284(c00393);
            c00393.f233 = false;
        }
        for (String str5 : f227) {
            C0039 c00394 = f222.get(str5);
            C0034.m284(c00394);
            c00394.f236 = true;
        }
        for (String str6 : f228) {
            C0039 c00395 = f222.get(str6);
            C0034.m284(c00395);
            c00395.f237 = true;
        }
        for (String str7 : f229) {
            C0039 c00396 = f222.get(str7);
            C0034.m284(c00396);
            c00396.f238 = true;
        }
    }

    private C0039(String str) {
        this.f230 = str;
        this.f231 = C0256.m916(str);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private static void m305(C0039 c0039) {
        f222.put(c0039.f230, c0039);
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static C0039 m306(String str) {
        return m307(str, C0435.f1065);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static C0039 m307(String str, C0435 c0435) {
        C0034.m284(str);
        Map<String, C0039> map = f222;
        C0039 c0039 = map.get(str);
        if (c0039 != null) {
            return c0039;
        }
        String strM1622 = c0435.m1622(str);
        C0034.m282(strM1622);
        String strM916 = C0256.m916(strM1622);
        C0039 c00392 = map.get(strM916);
        if (c00392 == null) {
            C0039 c00393 = new C0039(strM1622);
            c00393.f232 = false;
            return c00393;
        }
        if (!c0435.m1624() || strM1622.equals(strM916)) {
            return c00392;
        }
        C0039 c0039Clone = c00392.clone();
        c0039Clone.f230 = strM1622;
        return c0039Clone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039)) {
            return false;
        }
        C0039 c0039 = (C0039) obj;
        return this.f230.equals(c0039.f230) && this.f234 == c0039.f234 && this.f233 == c0039.f233 && this.f232 == c0039.f232 && this.f236 == c0039.f236 && this.f235 == c0039.f235 && this.f237 == c0039.f237 && this.f238 == c0039.f238;
    }

    public int hashCode() {
        return (((((((((((((this.f230.hashCode() * 31) + (this.f232 ? 1 : 0)) * 31) + (this.f233 ? 1 : 0)) * 31) + (this.f234 ? 1 : 0)) * 31) + (this.f235 ? 1 : 0)) * 31) + (this.f236 ? 1 : 0)) * 31) + (this.f237 ? 1 : 0)) * 31) + (this.f238 ? 1 : 0);
    }

    public String toString() {
        return this.f230;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0039 clone() {
        try {
            return (C0039) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public boolean m309() {
        return this.f233;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public String m310() {
        return this.f230;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m311() {
        return this.f232;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m312() {
        return this.f234;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public boolean m313() {
        return this.f237;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public boolean m314() {
        return !this.f232;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public boolean m315() {
        return f222.containsKey(this.f230);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public boolean m316() {
        return this.f234 || this.f235;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public String m317() {
        return this.f231;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public boolean m318() {
        return this.f236;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    C0039 m319() {
        this.f235 = true;
        return this;
    }
}
