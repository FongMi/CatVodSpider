package com.github.catvod.spider.merge.C0.c0;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] f = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String c;
    private String d;
    c e;

    public a(String str, String str2, c cVar) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        String strTrim = str.trim();
        com.github.catvod.spider.merge.C0.N.a.i(strTrim);
        this.c = strTrim;
        this.d = str2;
        this.e = cVar;
    }

    protected static boolean c(String str, String str2, g gVar) {
        if (gVar.g() != 1) {
            return false;
        }
        if (str2 != null) {
            if (!str2.isEmpty() && !str2.equalsIgnoreCase(str)) {
                return false;
            }
            if (!(Arrays.binarySearch(f, str) >= 0)) {
                return false;
            }
        }
        return true;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.c;
        if (str == null ? aVar.c != null : !str.equals(aVar.c)) {
            return false;
        }
        String str2 = this.d;
        String str3 = aVar.d;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.c;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2 = str;
        String strJ = this.d;
        c cVar = this.e;
        if (cVar != null) {
            strJ = cVar.j(this.c);
            int iO = this.e.o(this.c);
            if (iO != -1) {
                this.e.e[iO] = str2;
            }
        }
        this.d = str2;
        return strJ == null ? "" : strJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge.C0.Z.a */
    public final String toString() throws com.github.catvod.spider.merge.C0.Z.a {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        try {
            g gVarS0 = new h().s0();
            String str = this.c;
            String str2 = this.d;
            sbA.append((CharSequence) str);
            if (!c(str, str2, gVarS0)) {
                sbA.append((CharSequence) "=\"");
                if (str2 == null) {
                    str2 = "";
                }
                n.d(sbA, str2, gVarS0, true, false, false);
                sbA.append('\"');
            }
            return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.C0.Z.a(e);
        }
    }
}
