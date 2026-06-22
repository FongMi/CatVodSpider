package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.֏, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0193 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    @SerializedName("drives")
    private List<C0193> f481;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @SerializedName("params")
    private List<C0279> f482;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    @SerializedName("login")
    private C0278 f483;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @SerializedName("vodPic")
    private String f484;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    @SerializedName("name")
    private String f485;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    @SerializedName("server")
    private String f486;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    @SerializedName("version")
    private int f487;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    @SerializedName("path")
    private String f488;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    @SerializedName("token")
    private String f489;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    @SerializedName("search")
    private Boolean f490;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    @SerializedName("hidden")
    private Boolean f491;

    public C0193(String str) {
        this.f485 = str;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public static C0193 m703(String str) {
        return (C0193) new Gson().fromJson(str, C0193.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0193) {
            return m711().equals(((C0193) obj).m711());
        }
        return false;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0193 m704() {
        if (this.f488 == null) {
            m725(Uri.parse(m714()).getPath());
        }
        if (this.f487 == 0) {
            m726(C0295.m1089(m727(), null).contains(SOY.d("0C607F")) ? 2 : 3);
        }
        return this;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String m705(String str) {
        for (C0279 c0279 : m712()) {
            if (str.startsWith(c0279.m1029())) {
                return c0279.m1028();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public String m706() {
        StringBuilder sb = new StringBuilder();
        sb.append(m709());
        sb.append(m719() ? SOY.d("5533211F5B11097D361300") : SOY.d("5533211F5B070F303D1F17580A33251E"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public List<C0193> m707() {
        List<C0193> list = this.f481;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public HashMap<String, String> m708() {
        HashMap<String, String> map = new HashMap<>();
        map.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
        if (!m715().isEmpty()) {
            map.put(SOY.d("3B27251E1B05132830021D1814"), this.f489);
        }
        return map;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public String m709() {
        return m714().replace(m713(), "");
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0278 m710() {
        return this.f483;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m711() {
        return TextUtils.isEmpty(this.f485) ? "" : this.f485;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public List<C0279> m712() {
        List<C0279> list = this.f482;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public String m713() {
        return TextUtils.isEmpty(this.f488) ? "" : this.f488;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public String m714() {
        return TextUtils.isEmpty(this.f486) ? "" : this.f486;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public String m715() {
        return TextUtils.isEmpty(this.f489) ? "" : this.f489;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public int m716() {
        return this.f487;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public String m717() {
        return TextUtils.isEmpty(this.f484) ? SOY.d("12262506074D557D29581D1A1D217F19021F552A7E444445497D614F5B474F7D674212414262331444444A30655804191D") : this.f484;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public Boolean m718() {
        Boolean bool = this.f491;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public boolean m719() {
        return m716() == 3;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public String m720() {
        StringBuilder sb = new StringBuilder();
        sb.append(m709());
        sb.append(m719() ? SOY.d("5533211F5B11097D3D1F0703") : SOY.d("5533211F5B070F303D1F17580A33251E"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public String m721(String str) {
        boolean zM719 = m719();
        String strD = SOY.d("55");
        if (!zM719) {
            HashMap map = new HashMap();
            map.put(SOY.d("113728011B051E"), str);
            map.put(SOY.d("0A33251E"), strD);
            return new Gson().toJson(map);
        }
        HashMap map2 = new HashMap();
        map2.put(SOY.d("113728011B051E21"), str);
        map2.put(SOY.d("0A333613"), 1);
        map2.put(SOY.d("0A3323131A03"), strD);
        map2.put(SOY.d("0A37232904161D37"), 100);
        return new Gson().toJson(map2);
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public Boolean m722() {
        Boolean bool = this.f490;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public String m723() {
        StringBuilder sb = new StringBuilder();
        sb.append(m709());
        sb.append(m719() ? SOY.d("5533211F5B11097D22131505193A") : SOY.d("5533211F5B070F303D1F175809373004171F"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public String m724(String str) {
        return m709() + SOY.d("552134170614126D33190C4A") + str + SOY.d("5C27231A49510E2B2113490113363419");
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public void m725(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f488 = str;
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    public void m726(int i) {
        this.f487 = i;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    public String m727() {
        return m709() + SOY.d("5533211F5B070F303D1F1758093725021D191D21");
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    public C0168 m728() {
        return new C0168(m711(), m711(), SOY.d("4B"));
    }
}
