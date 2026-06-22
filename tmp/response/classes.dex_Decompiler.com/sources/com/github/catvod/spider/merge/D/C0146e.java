package com.github.catvod.spider.merge.d;

import android.util.Base64;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0132s;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0146e {

    @SerializedName("data")
    private C0146e a;

    @SerializedName("content")
    private C0146e b;

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

    public static C0146e g(String str) {
        try {
            C0146e c0146e = (C0146e) new Gson().fromJson(str, C0146e.class);
            return c0146e == null ? new C0146e() : c0146e;
        } catch (Exception unused) {
            return new C0146e();
        }
    }

    public final String a() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final C0146e b() {
        C0146e c0146e = this.b;
        return c0146e == null ? new C0146e() : c0146e;
    }

    public final C0146e c() {
        C0146e c0146e = this.a;
        return c0146e == null ? new C0146e() : c0146e;
    }

    public final Map<String, String> d() {
        HashMap map = new HashMap();
        String strA = C0098a.a(new byte[]{10}, new byte[]{126, -21, 93, 40, 47, 122, 70, 109});
        String str = this.c;
        if (str == null) {
            str = "";
        }
        map.put(strA, str);
        String strA2 = C0098a.a(new byte[]{12, 126}, new byte[]{111, 21, -1, -70, -37, -80, 125, 91});
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        map.put(strA2, str2);
        map.put(C0098a.a(new byte[]{-90, 50, 109, 45, -89, -50, -47}, new byte[]{-57, 66, 29, 99, -58, -93, -76, 121}), C0098a.a(new byte[]{-90, 19, -34, 27, 55, -44, 36, 8, -75, 22, -63, 7}, new byte[]{-57, 127, -73, 98, 66, -70, 123, 108}));
        map.put(C0098a.a(new byte[]{-112, 113, 12, -122, -97, 104, 93, 109, -97, 98, 25}, new byte[]{-15, 1, 124, -61, -15, 28, 47, 12}), C0098a.a(new byte[]{4, 71, -76}, new byte[]{115, 34, -42, 86, 76, -106, 10, 13}));
        map.put(C0098a.a(new byte[]{-2, 55, -32, -55, -123, 49, 47, 100}, new byte[]{-105, 68, -83, -90, -25, 88, 67, 1}), C0098a.a(new byte[]{87, 81, -89, 10, 26}, new byte[]{49, 48, -53, 121, 127, -33, 55, -99}));
        map.put(C0098a.a(new byte[]{-82, -43, -97, -12}, new byte[]{-62, -76, -15, -109, 103, -7, 32, 110}), C0098a.a(new byte[]{-97, -85, -70, -97, 67}, new byte[]{-27, -61, -27, -36, 13, -57, 87, -82}));
        map.put(C0098a.a(new byte[]{-82, -115, 78, 100, 2, -29, -57, -75, -80}, new byte[]{-36, -24, 58, 17, 112, -115, -110, -57}), "");
        map.put(C0098a.a(new byte[]{29, -64, 42, 36, -6, 124, -111, 102}, new byte[]{123, -78, 69, 73, -87, 21, -27, 3}), C0098a.a(new byte[]{-47, 95}, new byte[]{-28, 109, -124, -4, -41, -85, -72, -10}));
        map.put(C0098a.a(new byte[]{-27, 19, -20, 54, 63, 1, -106, 3, -12}, new byte[]{-121, 122, -106, 102, 94, 115, -9, 110}), "");
        map.put(C0098a.a(new byte[]{-34, 79, 78, 61, 0, -45, -81, -69, -47, 73, 93}, new byte[]{-80, 46, 56, 81, 97, -67, -56, -50}), C0098a.a(new byte[]{-98, -109, -35, 61, -104}, new byte[]{-28, -5, -16, 126, -42, 66, 23, -60}));
        map.put(C0098a.a(new byte[]{123, -100, -111, -28, -83, -127, 24, -9, 122, -113, -118}, new byte[]{21, -3, -25, -76, -63, -32, 108, -111}), C0098a.a(new byte[]{110, 115, -37, 84, -82, -63, -22, -53}, new byte[]{35, 18, -72, 29, -64, -75, -113, -89}));
        return map;
    }

    public final String e() {
        String str = this.g;
        if (str == null) {
            str = "";
        }
        return ((C0142a) C0132s.a(new String(Base64.decode(str, 0)), C0142a.class)).a().b();
    }

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        if (str.equals(C0098a.a(new byte[]{74, -23, -54, 82, -17, 72, 116, 89, 77}, new byte[]{9, -90, -124, 20, -90, 26, 57, 28}))) {
            String str2 = this.g;
            if ((str2 != null ? str2 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }
}
