package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class in implements Map.Entry<String, String>, Cloneable {
    private static final String[] l8 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String S;

    @Nullable
    private String T4;

    @Nullable
    Rz b;

    public in(String str, @Nullable String str2, @Nullable Rz rz) {
        Rc.HM(str);
        String strTrim = str.trim();
        Rc.tT(strTrim);
        this.S = strTrim;
        this.T4 = str2;
        this.b = rz;
    }

    protected static boolean HM(String str, @Nullable String str2, g9.aA aAVar) {
        return aAVar.n() == g9.aA.EnumC0001aA.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && tT(str)));
    }

    protected static void l(String str, @Nullable String str2, Appendable appendable, g9.aA aAVar) throws IOException {
        appendable.append(str);
        if (HM(str, str2, aAVar)) {
            return;
        }
        appendable.append("=\"");
        Y9.OL(appendable, Rz.N(str2), aAVar, true, false, false);
        appendable.append('\"');
    }

    protected static boolean tT(String str) {
        return Arrays.binarySearch(l8, str) >= 0;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        String strV = this.T4;
        Rz rz = this.b;
        if (rz != null) {
            strV = rz.v(this.S);
            int iE9 = this.b.E9(this.S);
            if (iE9 != -1) {
                this.b.T4[iE9] = str;
            }
        }
        this.T4 = str;
        return Rz.N(strV);
    }

    protected void OL(Appendable appendable, g9.aA aAVar) throws IOException {
        l(this.S, this.T4, appendable, aAVar);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.S;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return Rz.N(this.T4);
    }

    public String b() {
        StringBuilder sbS = tv.S();
        try {
            OL(sbS, new g9("").K());
            return tv.cD(sbS);
        } catch (IOException e) {
            throw new E(e);
        }
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || in.class != obj.getClass()) {
            return false;
        }
        in inVar = (in) obj;
        String str = this.S;
        if (str == null ? inVar.S != null : !str.equals(inVar.S)) {
            return false;
        }
        String str2 = this.T4;
        String str3 = inVar.T4;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.S;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.T4;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: l8, reason: merged with bridge method [inline-methods] */
    public in clone() {
        try {
            return (in) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return b();
    }
}
