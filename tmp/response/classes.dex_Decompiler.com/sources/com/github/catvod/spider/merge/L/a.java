package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] d = {oZP.d("14031B2E1B3300031B320F27100A19"), oZP.d("141C0E2F0F"), oZP.d("141A032E0A3A161A04"), oZP.d("16071222073011"), oZP.d("16001A310D3601"), oZP.d("110A142D0D2710"), oZP.d("110A1120193901"), oZP.d("110A11241E"), oZP.d("110604200E39100B"), oZP.d("1300052C023A030E1B280834010A"), oZP.d("1D061325093B"), oZP.d("1C01123318"), oZP.d("1C1C1A201C"), oZP.d("1C1B122C1F361A1F12"), oZP.d("181A1B350525190A"), oZP.d("181A032408"), oZP.d("1B001F330933"), oZP.d("1B0005241F3C0F0A"), oZP.d("1B0004290D3110"), oZP.d("1B000120003C110E0324"), oZP.d("1B0000330D25"), oZP.d("1A1F122F"), oZP.d("070A1625033B1916"), oZP.d("070A06340527100B"), oZP.d("070A01241E26100B"), oZP.d("060A162C0030061C"), oZP.d("060A1B240F21100B"), oZP.d("060005350D37190A"), oZP.d("011D02241F25100A13"), oZP.d("011607240120061B1A2018361D")};
    private static final Pattern e = Pattern.compile(oZP.d("2E0E5A3B2D782F304D1C377814420D00410F45424E1E567B2845"));
    private static final Pattern f = Pattern.compile(oZP.d("2E315A20412F34422D71416C2A55591C"));
    private static final Pattern g = Pattern.compile(oZP.d("2E312B395C6558330F700A090D58116C302D4C0957634B7A48325C"));
    private static final Pattern h = Pattern.compile(oZP.d("2E330F715C7829174627302D42095A1D146C134F5566436828"));
    private String a;

    @Nullable
    private String b;

    @Nullable
    c c;

    public a(String str, @Nullable String str2, @Nullable c cVar) {
        com.github.catvod.spider.merge.J.c.g(str);
        String strTrim = str.trim();
        com.github.catvod.spider.merge.J.c.e(strTrim);
        this.a = strTrim;
        this.b = str2;
        this.c = cVar;
    }

    @Nullable
    public static String b(String str, int i) {
        if (i == 2) {
            Pattern pattern = e;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern pattern2 = g;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = h.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(java.lang.String r7, @javax.annotation.Nullable java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.L.g r10) throws java.io.IOException {
        /*
            r9.append(r7)
            int r0 = r10.k()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            if (r8 == 0) goto L2a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L19
            boolean r0 = r8.equalsIgnoreCase(r7)
            if (r0 == 0) goto L2b
        L19:
            java.lang.String[] r0 = com.github.catvod.spider.merge.L.a.d
            java.lang.String r7 = com.github.catvod.spider.merge.B.l.c(r7)
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            if (r7 < 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 == 0) goto L2b
        L2a:
            r1 = 1
        L2b:
            if (r1 != 0) goto L48
            java.lang.String r7 = "484D"
            java.lang.String r7 = com.github.catvod.spider.merge.oZP.d(r7)
            r9.append(r7)
            java.lang.String r1 = com.github.catvod.spider.merge.L.c.i(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.L.o.d(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.a.d(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.L.g):void");
    }

    public final String a() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        return c.i(this.b);
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = aVar.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(@Nullable String str) {
        int iQ;
        String str2 = str;
        String strL = this.b;
        c cVar = this.c;
        if (cVar != null && (iQ = cVar.q(this.a)) != -1) {
            strL = this.c.l(this.a);
            this.c.c[iQ] = str2;
        }
        this.b = str2;
        return c.i(strL);
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        try {
            g gVarA0 = new h("").A0();
            String str = this.a;
            String str2 = this.b;
            String strB = b(str, gVarA0.k());
            if (strB != null) {
                d(strB, str2, sbB, gVarA0);
            }
            return com.github.catvod.spider.merge.K.b.h(sbB);
        } catch (IOException e2) {
            throw new com.github.catvod.spider.merge.I.a(e2);
        }
    }
}
