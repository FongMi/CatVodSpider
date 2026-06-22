package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0035;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.৲, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0436 implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[] f1068 = {SOY.d("1B3E3D1903110F3E3D0517051F373F"), SOY.d("1B21281817"), SOY.d("1B2725191218192722"), SOY.d("193A34151F121E"), SOY.d("193D3C0615140E"), SOY.d("1E37321A15051F"), SOY.d("1E373717011B0E"), SOY.d("1E37371306"), SOY.d("1E3B2217161B1F36"), SOY.d("1C3D231B1A180C333D1F10160E37"), SOY.d("123B35121119"), SOY.d("133C340400"), SOY.d("13213C1704"), SOY.d("1326341B0714152234"), SOY.d("17273D021D071637"), SOY.d("1727251310"), SOY.d("143D39041111"), SOY.d("143D2313071E0037"), SOY.d("143D221E15131F"), SOY.d("143D2717181E1E332513"), SOY.d("143D26041507"), SOY.d("15223418"), SOY.d("083730121B19162B"), SOY.d("083720031D051F36"), SOY.d("0837271306041F36"), SOY.d("0937301B18120921"), SOY.d("09373D1317031F36"), SOY.d("093D230215151637"), SOY.d("0E20241307071F3735"), SOY.d("0E2B2113190209263C17001412")};

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private String f1069;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @Nullable
    private String f1070;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @Nullable
    C0542 f1071;

    public C0436(String str, @Nullable String str2, @Nullable C0542 c0542) {
        C0034.m284(str);
        String strTrim = str.trim();
        C0034.m282(strTrim);
        this.f1069 = strTrim;
        this.f1070 = str2;
        this.f1071 = c0542;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected static void m1625(String str, @Nullable String str2, Appendable appendable, C0035.C0036 c0036) throws IOException {
        appendable.append(str);
        if (m1627(str, str2, c0036)) {
            return;
        }
        appendable.append(SOY.d("4770"));
        C0195.m735(appendable, C0542.m1743(str2), c0036, true, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected static boolean m1626(String str) {
        return Arrays.binarySearch(f1068, str) >= 0;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected static boolean m1627(String str, @Nullable String str2, C0035.C0036 c0036) {
        return c0036.m304() == C0035.C0036.EnumC0037.f215 && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && m1626(str)));
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0436.class != obj.getClass()) {
            return false;
        }
        C0436 c0436 = (C0436) obj;
        String str = this.f1069;
        if (str == null ? c0436.f1069 != null : !str.equals(c0436.f1069)) {
            return false;
        }
        String str2 = this.f1070;
        String str3 = c0436.f1070;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f1069;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1070;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return m1631();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0436 clone() {
        try {
            return (C0436) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f1069;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String getValue() {
        return C0542.m1743(this.f1070);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public String m1631() {
        StringBuilder sbM136 = C0008.m136();
        try {
            m1632(sbM136, new C0035("").m290());
            return C0008.m147(sbM136);
        } catch (IOException e) {
            throw new C0244(e);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected void m1632(Appendable appendable, C0035.C0036 c0036) throws IOException {
        m1625(this.f1069, this.f1070, appendable, c0036);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public String setValue(String str) {
        String strM1753 = this.f1070;
        C0542 c0542 = this.f1071;
        if (c0542 != null) {
            strM1753 = c0542.m1753(this.f1069);
            int iM1759 = this.f1071.m1759(this.f1069);
            if (iM1759 != -1) {
                this.f1071.f1215[iM1759] = str;
            }
        }
        this.f1070 = str;
        return C0542.m1743(strM1753);
    }
}
