package com.github.catvod.spider.merge.FM.d;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0336d {

    @SerializedName("data")
    private C0336d a;

    @SerializedName("content")
    private C0336d b;

    @SerializedName("t")
    private String c;

    @SerializedName("ck")
    private String d;

    @SerializedName("codeContent")
    private String e;

    @SerializedName("qrCodeStatus")
    private String f;

    @SerializedName("bizExt")
    private String g;

    public static C0336d g(String str) {
        try {
            C0336d c0336d = (C0336d) new Gson().fromJson(str, C0336d.class);
            return c0336d == null ? new C0336d() : c0336d;
        } catch (Exception unused) {
            return new C0336d();
        }
    }

    public final String a() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final C0336d b() {
        C0336d c0336d = this.b;
        return c0336d == null ? new C0336d() : c0336d;
    }

    public final C0336d c() {
        C0336d c0336d = this.a;
        return c0336d == null ? new C0336d() : c0336d;
    }

    public final Map<String, String> d() {
        HashMap map = new HashMap();
        String str = this.c;
        if (str == null) {
            str = "";
        }
        map.put("t", str);
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        map.put("ck", str2);
        map.put("appName", "aliyun_drive");
        map.put("appEntrance", "web");
        map.put("isMobile", "false");
        map.put("lang", "zh_CN");
        map.put("returnUrl", "");
        map.put("fromSite", "52");
        map.put("bizParams", "");
        map.put("navlanguage", "zh-CN");
        map.put("navPlatform", "MacIntel");
        return map;
    }

    public final String e() {
        String str = this.g;
        if (str == null) {
            str = "";
        }
        return ((C0333a) new Gson().fromJson(new String(Base64.decode(str, 0)), C0333a.class)).a().b();
    }

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        if (str.equals("CONFIRMED")) {
            String str2 = this.g;
            if ((str2 != null ? str2 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }
}
