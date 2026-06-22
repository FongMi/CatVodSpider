package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ؠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0230 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("name")
    private String f596;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName(alternate = {"parent"}, value = "path")
    private String f597;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("type")
    private int f598;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @SerializedName("size")
    private long f599;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String f600;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f601;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String f602;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ؠ$Ϳ, reason: contains not printable characters */
    class C0231 extends TypeToken<List<C0230>> {
        C0231() {
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static List<C0230> m803(String str) {
        return (List) new Gson().fromJson(str, new C0231().getType());
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public static C0230 m804(String str) {
        return (C0230) new Gson().fromJson(str, C0230.class);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public Date m805() {
        try {
            return new SimpleDateFormat(SOY.d("032B280F593A377F351253235D1A194C191A4021225827242908"), Locale.getDefault()).parse(m807());
        } catch (Exception unused) {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public String m806() {
        return C0286.m1047(m808());
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public String m807() {
        return this.f602;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public String m808() {
        return TextUtils.isEmpty(this.f596) ? "" : this.f596;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public String m809() {
        return TextUtils.isEmpty(this.f597) ? "" : this.f597;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public String m810(String str) {
        return (m813().isEmpty() && m820()) ? str : m813();
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m811() {
        return C0286.m1048(m812());
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public long m812() {
        return this.f599;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public String m813() {
        return TextUtils.isEmpty(this.f600) ? "" : this.f600;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public int m814() {
        return this.f598;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public String m815() {
        if (TextUtils.isEmpty(this.f601)) {
            return "";
        }
        if (!this.f601.startsWith(SOY.d("557D"))) {
            return this.f601;
        }
        return SOY.d("122625064E") + this.f601;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public C0188 m816(C0193 c0193, String str) {
        return new C0188(m818(c0193.m711()), m808(), m810(str), c0193.m711(), m820());
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public C0188 m817(String str, String str2) {
        return new C0188(m818(str), m808(), m810(str2), m811(), m820());
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public String m818(String str) {
        return str + m809() + SOY.d("55") + m808();
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public boolean m819(boolean z) {
        if (m808().endsWith(SOY.d("542622")) || m808().endsWith(SOY.d("543F2111"))) {
            return false;
        }
        return z ? m814() == 0 || m814() == 4 : m814() == 0 || m814() == 2 || m814() == 5;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public boolean m820() {
        return m814() == 1;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public boolean m821(boolean z) {
        if (m808().endsWith(SOY.d("542622")) || m808().endsWith(SOY.d("543F2111"))) {
            return true;
        }
        return z ? m814() == 2 || m814() == 3 : m814() == 3 || m814() == 4;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public void m822(String str) {
        this.f596 = str;
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public void m823(String str) {
        this.f597 = str;
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public void m824(String str) {
        this.f600 = str;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public void m825(int i) {
        this.f598 = i;
    }
}
