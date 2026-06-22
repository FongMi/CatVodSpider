package com.github.catvod.spider.merge.e;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0152a {

    @SerializedName("drives")
    private List<C0152a> a;

    @SerializedName("params")
    private List<C0156e> b;

    @SerializedName("login")
    private C0155d c;

    @SerializedName("vodPic")
    private String d;

    @SerializedName("name")
    private final String e;

    @SerializedName("server")
    private String f;

    @SerializedName("version")
    private int g;

    @SerializedName("path")
    private String h;

    @SerializedName("token")
    private String i;

    @SerializedName("search")
    private Boolean j;

    @SerializedName("hidden")
    private Boolean k;

    public C0152a(String str) {
        this.e = str;
    }

    public final C0152a a() {
        if (this.h == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f) ? "" : this.f).getPath();
            this.h = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.g == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append(C0098a.a(new byte[]{38, 100, -59, -107, -43, -4, -39, 63, 101, 108, -42, -45, -119, -23, -40, 41, 96, 107, -46, -113}, new byte[]{9, 5, -75, -4, -6, -116, -84, 93}));
            this.g = C0197c.l(sb.toString(), null).contains(C0098a.a(new byte[]{-118, -49, -84}, new byte[]{-4, -3, -126, -24, 87, 50, -126, -122})) ? 2 : 3;
        }
        return this;
    }

    public final String b(String str) {
        List<C0156e> arrayList = this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (C0156e c0156e : arrayList) {
            if (str.startsWith(c0156e.b())) {
                return c0156e.a();
            }
        }
        return "";
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? C0098a.a(new byte[]{107, 126, 6, 19, -18, -125, -19, 53, 35, 122, 2}, new byte[]{68, 31, 118, 122, -63, -27, -98, 26}) : C0098a.a(new byte[]{-83, 67, 119, 51, -118, 111, -26, 70, -18, 75, 100, 117, -43, 126, -25, 76}, new byte[]{-126, 34, 7, 90, -91, 31, -109, 36}));
        return sb.toString();
    }

    public final List<C0152a> d() {
        List<C0152a> list = this.a;
        return list == null ? new ArrayList() : list;
    }

    public final HashMap<String, String> e() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{-47, -3, 66, -27, -73, 37, 25, -25, -22, -6}, new byte[]{-124, -114, 39, -105, -102, 100, 126, -126}), C0098a.a(new byte[]{-27, 96, -6, -99, -117, -73, 29, -77, -99, 33, -80, -44, -49, -116, 21, -14, -52, 96, -9, -121, -57, -107, 40, -68, -103, 63, -82, -60, -36, -5, 43, -11, -58, 57, -76, -49, -57, -93, 74, -88, -127, 47, -63, -124, -105, -73, 25, -53, -51, 109, -53, -99, -109, -12, 73, -81, -97, 33, -77, -62, -57, -13, 55, -44, -4, 66, -52, -40, -57, -73, 21, -9, -51, 47, -57, -111, -124, -80, 19, -75, -120, 76, -24, -122, -120, -74, 25, -77, -103, 62, -73, -38, -41, -11, 76, -78, -104, 47, -45, -107, -127, -70, 14, -11, -121, 58, -77, -61, -55, -24, 74}, new byte[]{-88, 15, -128, -12, -25, -37, 124, -100}));
        if (!(TextUtils.isEmpty(this.i) ? "" : this.i).isEmpty()) {
            map.put(C0098a.a(new byte[]{103, -97, 40, 111, -39, -79, 47, 26, 71, -98, 53, 104, -40}, new byte[]{38, -22, 92, 7, -74, -61, 70, 96}), this.i);
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0152a) {
            return h().equals(((C0152a) obj).h());
        }
        return false;
    }

    public final String f() {
        return (TextUtils.isEmpty(this.f) ? "" : this.f).replace(i(), "");
    }

    public final C0155d g() {
        return this.c;
    }

    public final String h() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String i() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String j() {
        return TextUtils.isEmpty(this.d) ? C0098a.a(new byte[]{59, -40, -95, -59, 4, 110, -12, -110, 43, -126, -68, -40, 16, 39, -11, -46, 37, -60, -6, -51, 88, 102, -21, -113, 96, -125, -27, -116, 88, 100, -18, -110, 101, -104, -77, -125, 79, 100, -71, -33, 99, -97, -27, -41, 67, 122, -85, -45, 52}, new byte[]{83, -84, -43, -75, 119, 84, -37, -67}) : this.d;
    }

    public final Boolean k() {
        Boolean bool = this.k;
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    public final boolean l() {
        return this.g == 3;
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? C0098a.a(new byte[]{-107, 101, 23, -32, 13, -5, -40, 6, -42, 109, 20, -3}, new byte[]{-70, 4, 103, -119, 34, -99, -85, 41}) : C0098a.a(new byte[]{-97, -108, 60, 39, -110, 65, -97, 47, -36, -100, 47, 97, -51, 80, -98, 37}, new byte[]{-80, -11, 76, 78, -67, 49, -22, 77}));
        return sb.toString();
    }

    public final String n(String str) {
        HashMap map;
        Gson gson;
        if (l()) {
            map = new HashMap();
            map.put(C0098a.a(new byte[]{-48, 119, -64, 99, -127, -69, -23, 13}, new byte[]{-69, 18, -71, 20, -18, -55, -115, 126}), str);
            map.put(C0098a.a(new byte[]{-48, 0, -64, 113}, new byte[]{-96, 97, -89, 20, 7, -8, -5, 97}), 1);
            map.put(C0098a.a(new byte[]{-38, 81, -114, 104, 42, -1}, new byte[]{-86, 48, -4, 13, 68, -117, -31, 17}), C0098a.a(new byte[]{68}, new byte[]{107, 124, -37, -22, -3, -50, -77, 35}));
            map.put(C0098a.a(new byte[]{12, 65, 11, 79, -73, -62, 42, 108}, new byte[]{124, 36, 121, 16, -57, -93, 77, 9}), 100);
            gson = new Gson();
        } else {
            map = new HashMap();
            map.put(C0098a.a(new byte[]{69, 44, -125, 22, -86, -77, 69}, new byte[]{46, 73, -6, 97, -59, -63, 33, -74}), str);
            map.put(C0098a.a(new byte[]{37, 121, 59, -76}, new byte[]{85, 24, 79, -36, 52, 36, -121, -16}), C0098a.a(new byte[]{-70}, new byte[]{-107, 11, -97, 47, -11, 8, 75, -80}));
            gson = new Gson();
        }
        return gson.toJson(map);
    }

    public final Boolean o() {
        Boolean bool = this.j;
        return Boolean.valueOf(bool == null || bool.booleanValue());
    }

    public final String p() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append(l() ? C0098a.a(new byte[]{87, 75, -84, -29, -21, -120, -76, 45, 11, 79, -67, -8, -89, -122}, new byte[]{120, 42, -36, -118, -60, -18, -57, 2}) : C0098a.a(new byte[]{94, -34, -54, -11, 93, -69, -21, -29, 29, -42, -39, -77, 1, -82, -1, -13, 18, -41}, new byte[]{113, -65, -70, -100, 114, -53, -98, -127}));
        return sb.toString();
    }

    public final void q(String str) {
        this.i = str;
    }
}
