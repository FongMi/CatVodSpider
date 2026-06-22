package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] d = {ZrJ.d("182F27223F230C2F273E2B371C2625"), ZrJ.d("183032232B"), ZrJ.d("18363F222E2A1A3638"), ZrJ.d("1A2B2E2E23201D"), ZrJ.d("1A2C263D29260D"), ZrJ.d("1D26282129371C"), ZrJ.d("1D262D2C3D290D"), ZrJ.d("1D262D283A"), ZrJ.d("1D2A382C2A291C27"), ZrJ.d("1F2C3920262A0F2227242C240D26"), ZrJ.d("112A2F292D2B"), ZrJ.d("102D2E3F3C"), ZrJ.d("1030262C38"), ZrJ.d("10372E203B2616332E"), ZrJ.d("1436273921351526"), ZrJ.d("14363F282C"), ZrJ.d("172C233F2D23"), ZrJ.d("172C39283B2C0326"), ZrJ.d("172C382529211C"), ZrJ.d("172C3D2C242C1D223F28"), ZrJ.d("172C3C3F2935"), ZrJ.d("16332E23"), ZrJ.d("0B262A29272B153A"), ZrJ.d("0B263A3821371C27"), ZrJ.d("0B263D283A361C27"), ZrJ.d("0A262A2024200A30"), ZrJ.d("0A2627282B311C27"), ZrJ.d("0A2C393929271526"), ZrJ.d("0D313E283B351C262F"), ZrJ.d("0D3A3B2825300A37262C3C2611")};
    private static final Pattern e = Pattern.compile(ZrJ.d("222266370968231C71101368186E310C651F496E7212726B2469"));
    private static final Pattern f = Pattern.compile(ZrJ.d("221D662C653F386E117D657C26796510"));
    private static final Pattern g = Pattern.compile(ZrJ.d("221D17357875541F337C2E1901742D60143D40256B6F6F6A441E60"));
    private static final Pattern h = Pattern.compile(ZrJ.d("221F337D7868253B7A2B143D4E256611307C1F63696A677824"));
    private String a;

    @Nullable
    private String b;

    @Nullable
    c c;

    public a(String str, @Nullable String str2, @Nullable c cVar) {
        com.github.catvod.spider.merge.XU.k.g(str);
        String strTrim = str.trim();
        com.github.catvod.spider.merge.XU.k.e(strTrim);
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
    static void d(java.lang.String r7, @javax.annotation.Nullable java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.UY.g r10) throws java.io.IOException {
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
            java.lang.String[] r0 = com.github.catvod.spider.merge.UY.a.d
            java.lang.String r7 = com.github.catvod.spider.merge.Bk.l.c(r7)
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
            java.lang.String r7 = "4461"
            java.lang.String r7 = com.github.catvod.spider.merge.ZrJ.d(r7)
            r9.append(r7)
            java.lang.String r1 = com.github.catvod.spider.merge.UY.c.i(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.UY.o.d(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.UY.a.d(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.UY.g):void");
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
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        try {
            g gVarA0 = new h("").A0();
            String str = this.a;
            String str2 = this.b;
            String strB = b(str, gVarA0.k());
            if (strB != null) {
                d(strB, str2, sbB, gVarA0);
            }
            return com.github.catvod.spider.merge.XU.n.h(sbB);
        } catch (IOException e2) {
            throw new com.github.catvod.spider.merge.XI.v(e2);
        }
    }
}
