package com.github.catvod.spider.merge.d;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {

    @SerializedName("data")
    private d a;

    @SerializedName("content")
    private d b;

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

    public static d g(String str) {
        try {
            d dVar = (d) new Gson().fromJson(str, d.class);
            return dVar == null ? new d() : dVar;
        } catch (Exception unused) {
            return new d();
        }
    }

    public final String a() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final d b() {
        d dVar = this.b;
        return dVar == null ? new d() : dVar;
    }

    public final d c() {
        d dVar = this.a;
        return dVar == null ? new d() : dVar;
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
        return ((C0557a) new Gson().fromJson(new String(Base64.decode(str, 0)), C0557a.class)).a().b();
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
