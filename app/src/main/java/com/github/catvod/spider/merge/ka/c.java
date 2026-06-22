package com.github.catvod.spider.merge.ka;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {

    @SerializedName("data")
    private c a;

    @SerializedName("content")
    private c b;

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

    public static c g(String str) {
        try {
            c cVar = (c) new Gson().fromJson(str, c.class);
            return cVar == null ? new c() : cVar;
        } catch (Exception unused) {
            return new c();
        }
    }

    public final String a() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final c b() {
        c cVar = this.b;
        return cVar == null ? new c() : cVar;
    }

    public final c c() {
        c cVar = this.a;
        return cVar == null ? new c() : cVar;
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
        return ((a) new Gson().fromJson(new String(Base64.decode(str, 0)), a.class)).a().b();
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
