package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qe implements Map.Entry, Cloneable {
    public static final String[] a = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern b = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern c = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public final String d;
    public String e;
    public qh f;

    public qe(String str, String str2, qh qhVar) {
        wc.e(str);
        String strTrim = str.trim();
        wc.c(strTrim);
        this.d = strTrim;
        this.e = str2;
        this.f = qhVar;
    }

    public static String g(String str, int i) {
        if (i == 2 && !j(str)) {
            String strReplaceAll = b.matcher(str).replaceAll("_");
            if (j(strReplaceAll)) {
                return strReplaceAll;
            }
            return null;
        }
        if (i != 1 || i(str)) {
            return str;
        }
        String strReplaceAll2 = c.matcher(str).replaceAll("_");
        if (i(strReplaceAll2)) {
            return strReplaceAll2;
        }
        return null;
    }

    public static void h(String str, String str2, Appendable appendable, ut utVar) throws IOException {
        appendable.append(str);
        if (utVar.f == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(a, qf.c(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        ec.h(appendable, str2, utVar, 2);
        appendable.append('\"');
    }

    public static boolean i(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || cCharAt == ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '/' || cCharAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (qe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qe.class != obj.getClass()) {
            return false;
        }
        qe qeVar = (qe) obj;
        return Objects.equals(this.d, qeVar.d) && Objects.equals(this.e, qeVar.e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.e;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.d, this.e);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iL;
        String str2 = (String) obj;
        String strH = this.e;
        qh qhVar = this.f;
        if (qhVar != null && (iL = qhVar.l((str = this.d))) != -1) {
            strH = this.f.h(str);
            this.f.c[iL] = str2;
        }
        this.e = str2;
        return strH == null ? "" : strH;
    }

    public final String toString() {
        StringBuilder sbG = ws.g();
        try {
            ut utVar = new em().a;
            String str = this.e;
            String strG = g(this.d, utVar.f);
            if (strG != null) {
                h(strG, str, sbG, utVar);
            }
            return ws.n(sbG);
        } catch (IOException e) {
            throw new tv(e);
        }
    }
}
