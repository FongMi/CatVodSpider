package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.nW */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0133nW implements Map.Entry<String, String>, Cloneable {

    /* renamed from: q */
    private static final String[] f726q = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: QU */
    @Nullable
    private String f727QU;

    /* renamed from: UJ */
    @Nullable
    C0094Tz f728UJ;

    /* renamed from: xC */
    private String f729xC;

    public C0133nW(String str, @Nullable String str2, @Nullable C0094Tz c0094Tz) {
        C0111bw.m559se(str);
        String strTrim = str.trim();
        C0111bw.m557i(strTrim);
        this.f729xC = strTrim;
        this.f727QU = str2;
        this.f728UJ = c0094Tz;
    }

    /* renamed from: Mo */
    protected static void m683Mo(String str, @Nullable String str2, Appendable appendable, C0082OO.p pVar) throws IOException {
        appendable.append(str);
        if (m685se(str, str2, pVar)) {
            return;
        }
        appendable.append("=\"");
        C0090SP.m424u(appendable, C0094Tz.m443MH(str2), pVar, true, false, false);
        appendable.append('\"');
    }

    /* renamed from: i */
    protected static boolean m684i(String str) {
        return Arrays.binarySearch(f726q, str) >= 0;
    }

    /* renamed from: se */
    protected static boolean m685se(String str, @Nullable String str2, C0082OO.p pVar) {
        return pVar.m325W() == C0082OO.p.EnumC0167p.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && m684i(str)));
    }

    @Override // java.util.Map.Entry
    /* renamed from: MH, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        String strM453FN = this.f727QU;
        C0094Tz c0094Tz = this.f728UJ;
        if (c0094Tz != null) {
            strM453FN = c0094Tz.m453FN(this.f729xC);
            int iM460k = this.f728UJ.m460k(this.f729xC);
            if (iM460k != -1) {
                this.f728UJ.f545QU[iM460k] = str;
            }
        }
        this.f727QU = str;
        return C0094Tz.m443MH(strM453FN);
    }

    @Override // java.util.Map.Entry
    /* renamed from: QU, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return C0094Tz.m443MH(this.f727QU);
    }

    /* renamed from: UJ */
    public String m688UJ() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        try {
            m690u(sbM779xC, new C0082OO("").m320zw());
            return C0157x3.m778w8(sbM779xC);
        } catch (IOException e) {
            throw new C0140qw(e);
        }
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0133nW.class != obj.getClass()) {
            return false;
        }
        C0133nW c0133nW = (C0133nW) obj;
        String str = this.f729xC;
        if (str == null ? c0133nW.f729xC != null : !str.equals(c0133nW.f729xC)) {
            return false;
        }
        String str2 = this.f727QU;
        String str3 = c0133nW.f727QU;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f729xC;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f727QU;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0133nW clone() {
        try {
            return (C0133nW) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return m688UJ();
    }

    /* renamed from: u */
    protected void m690u(Appendable appendable, C0082OO.p pVar) throws IOException {
        m683Mo(this.f729xC, this.f727QU, appendable, pVar);
    }

    @Override // java.util.Map.Entry
    /* renamed from: xC, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f729xC;
    }
}
