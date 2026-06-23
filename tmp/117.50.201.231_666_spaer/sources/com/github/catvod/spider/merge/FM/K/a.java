package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern f = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    private String a;

    @Nullable
    private String b;

    @Nullable
    c c;

    public a(String str, @Nullable String str2, @Nullable c cVar) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        String strTrim = str.trim();
        com.github.catvod.spider.merge.FM.I.c.e(strTrim);
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
    static void d(java.lang.String r7, @javax.annotation.Nullable java.lang.String r8, java.lang.Appendable r9, com.github.catvod.spider.merge.FM.K.g r10) throws java.io.IOException {
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
            java.lang.String[] r0 = com.github.catvod.spider.merge.FM.K.a.d
            java.lang.String r7 = com.github.catvod.spider.merge.FM.A.l.d(r7)
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
            java.lang.String r1 = com.github.catvod.spider.merge.FM.K.c.i(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            com.github.catvod.spider.merge.FM.K.o.d(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.K.a.d(java.lang.String, java.lang.String, java.lang.Appendable, com.github.catvod.spider.merge.FM.K.g):void");
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        try {
            g gVarA0 = new h("").A0();
            String str = this.a;
            String str2 = this.b;
            String strB = b(str, gVarA0.k());
            if (strB != null) {
                d(strB, str2, sbB, gVarA0);
            }
            return com.github.catvod.spider.merge.FM.J.b.h(sbB);
        } catch (IOException e2) {
            throw new com.github.catvod.spider.merge.FM.H.a(e2);
        }
    }
}
