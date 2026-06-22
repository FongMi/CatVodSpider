package com.github.catvod.spider.merge.c;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0101e {

    @SerializedName("data")
    private C0101e a;

    @SerializedName("content")
    private C0101e b;

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

    public static C0101e g(String str) {
        try {
            C0101e c0101e = (C0101e) new Gson().fromJson(str, C0101e.class);
            return c0101e == null ? new C0101e() : c0101e;
        } catch (Exception unused) {
            return new C0101e();
        }
    }

    public final String a() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public final String b() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final C0101e c() {
        C0101e c0101e = this.b;
        return c0101e == null ? new C0101e() : c0101e;
    }

    public final C0101e d() {
        C0101e c0101e = this.a;
        return c0101e == null ? new C0101e() : c0101e;
    }

    public final HashMap e() {
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

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        return str.equals("CONFIRMED") && a().length() > 0;
    }
}
