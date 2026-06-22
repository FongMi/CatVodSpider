package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0945a implements Map.Entry<String, String>, Cloneable {
    private static final String[] e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern f = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern g = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern h = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern i = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    private String b;
    private String c;
    C0947c d;

    public C0945a(String str, String str2, C0947c c0947c) {
        C0899d.h(str);
        String strTrim = str.trim();
        C0899d.f(strTrim);
        this.b = strTrim;
        this.c = str2;
        this.d = c0947c;
    }

    public static String b(String str, int i2) {
        if (i2 == 2) {
            Pattern pattern = f;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = g.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i2 == 1) {
            Pattern pattern2 = h;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = i.matcher(str).replaceAll("");
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
    static void d(java.lang.String r7, java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.c1.g r10) throws java.io.IOException {
        /*
            r9.append(r7)
            int r0 = r10.j()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            if (r8 == 0) goto L2a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L19
            boolean r0 = r8.equalsIgnoreCase(r7)
            if (r0 == 0) goto L2b
        L19:
            java.lang.String[] r0 = com.github.catvod.spider.merge.c1.C0945a.e
            java.lang.String r7 = com.github.catvod.spider.merge.g.b.b(r7)
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
            if (r1 != 0) goto L44
            java.lang.String r7 = "=\""
            r9.append(r7)
            java.lang.String r1 = com.github.catvod.spider.merge.c1.C0947c.k(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.c1.o.e(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c1.C0945a.d(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.c1.g):void");
    }

    public final String a() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        return C0947c.k(this.c);
    }

    public final Object clone() {
        try {
            return (C0945a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0945a.class != obj.getClass()) {
            return false;
        }
        C0945a c0945a = (C0945a) obj;
        String str = this.b;
        if (str == null ? c0945a.b != null : !str.equals(c0945a.b)) {
            return false;
        }
        String str2 = this.c;
        String str3 = c0945a.c;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        int iT;
        String str2 = str;
        String strN = this.c;
        C0947c c0947c = this.d;
        if (c0947c != null && (iT = c0947c.t(this.b)) != -1) {
            strN = this.d.n(this.b);
            this.d.d[iT] = str2;
        }
        this.c = str2;
        return C0947c.k(strN);
    }

    public final String toString() {
        StringBuilder sbB = C0906c.b();
        try {
            g gVarC0 = new h("").C0();
            String str = this.b;
            String str2 = this.c;
            String strB = b(str, gVarC0.j());
            if (strB != null) {
                d(strB, str2, sbB, gVarC0);
            }
            return C0906c.h(sbB);
        } catch (IOException e2) {
            throw new com.github.catvod.spider.merge.Z0.a(e2);
        }
    }
}
