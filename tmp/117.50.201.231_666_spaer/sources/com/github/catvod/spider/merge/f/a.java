package com.github.catvod.spider.merge.F;

import android.text.TextUtils;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.G.m;
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.b.C0536B;
import com.github.catvod.spider.merge.b.C0545i;
import com.github.catvod.spider.merge.b.C0546j;
import com.github.catvod.spider.merge.b.C0548l;
import com.github.catvod.spider.merge.b.w;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import com.google.gson.JsonParser;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    public static String a() {
        String strSubstring = String.format("%012d", Long.valueOf(System.currentTimeMillis())).substring(0, 12);
        int i = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (!Character.isDigit(cCharAt)) {
                throw new IllegalArgumentException("时间戳必须全部为数字");
            }
            int numericValue = Character.getNumericValue(cCharAt);
            i = (i2 % 2 == 0 ? numericValue * 1 : numericValue * 3) + i;
        }
        int i3 = i % 11;
        if (i3 == 10) {
            i3 = (i + 1) % 11;
        }
        return strSubstring + i3;
    }

    public static String a(String str, String str2, String str3, String str4) {
        String asString;
        String strA = C0602k.a(C0602k.c("/config.json"));
        try {
            asString = new JSONObject(strA).optString("proxyMode");
        } catch (Exception e) {
            asString = new JsonParser().parse(strA).getAsJsonObject().get("proxyMode").getAsString();
        }
        String[] strArrC = c(str, str2, str3, str4);
        if (!"Java多线程".equals(asString)) {
            if (is1314GoProxyActive()) {
                return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", "http://127.0.0.1:1314", URLEncoder.encode(strArrC[0]), Integer.valueOf(strArrC[1]));
            }
            C0590I.i("GO代理未启用，请去【配置中心】下载或切换模式");
        }
        return String.format(Proxy.getUrl() + "?do=pan&site=%s&shareId=%s&fileId=%s&fileToken=%s", str, str2, str3, str4);
    }

    public static int b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static String b(String str, String str2, String str3, String str4) {
        String asString;
        String strA = C0602k.a(C0602k.c("/config.json"));
        try {
            asString = new JSONObject(strA).optString("proxyMode");
        } catch (Exception e) {
            asString = new JsonParser().parse(strA).getAsJsonObject().get("proxyMode").getAsString();
        }
        String[] strArrD = d(str, str2, str3, str4);
        if (!"Java多线程".equals(asString)) {
            if (is1314GoProxyActive()) {
                return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", "http://127.0.0.1:1314", URLEncoder.encode(strArrD[0]), Integer.valueOf(strArrD[1]));
            }
            C0590I.i("GO代理未启用，请去【配置中心】下载或切换模式");
        }
        return String.format(Proxy.getUrl() + "?do=pan&type=2&site=%s&shareId=%s&fileId=%s&fileToken=%s", str, str2, str3, str4);
    }

    public static String[] c(String str, String str2, String str3, String str4) {
        String[] strArr = new String[3];
        if ("ali".equals(str)) {
            strArr[0] = processAliyunDriveUrl(C0545i.d().h(str2, str3));
            String str5 = "8";
            String strA = C0602k.a(C0602k.c("/config.json"));
            if (!TextUtils.isEmpty(strA)) {
                try {
                    String strOptString = new JSONObject(strA).optString("aliThread");
                    if (!TextUtils.isEmpty(strOptString)) {
                        str5 = strOptString;
                    }
                } catch (Exception unused) {
                }
            }
            strArr[1] = str5;
            strArr[2] = "64";
        } else if ("quark".equals(str)) {
            strArr[0] = w.e().h(str2, str3, str4);
            String str6 = "16";
            String strA2 = C0602k.a(C0602k.c("/config.json"));
            if (!TextUtils.isEmpty(strA2)) {
                try {
                    String strOptString2 = new JSONObject(strA2).optString("quarkThread");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        str6 = strOptString2;
                    }
                } catch (Exception unused2) {
                }
            }
            strArr[1] = str6;
            strArr[2] = getQuarkSizeValue();
        } else if ("uc".equals(str)) {
            strArr[0] = C0536B.c().f(str2, str3, str4);
            String uCThreadValue = "16";
            String strA3 = C0602k.a(C0602k.c("/config.json"));
            if (!TextUtils.isEmpty(strA3)) {
                try {
                    String strOptString3 = new JSONObject(strA3).optString("ucThread");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        uCThreadValue = strOptString3;
                    }
                } catch (Exception unused3) {
                }
            }
            if ("自动".equals(uCThreadValue)) {
                uCThreadValue = getUCThreadValue();
            }
            strArr[1] = uCThreadValue;
            strArr[2] = getUCSizeValue();
        } else if ("cloud189".equals(str)) {
            strArr[0] = C0548l.c().h(str3, str2);
            strArr[1] = "10";
            strArr[2] = "512";
        } else if ("baidu".equals(str)) {
            strArr[0] = C0546j.f().l(str3);
            strArr[1] = "10";
            strArr[2] = "512";
        }
        return strArr;
    }

    public static String d(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String[] d(String str, String str2, String str3, String str4) {
        String[] strArr = new String[3];
        if ("quark".equals(str)) {
            strArr[0] = w.e().i(str2, str3, str4);
            String str5 = "16";
            String strA = C0602k.a(C0602k.c("/config.json"));
            if (!TextUtils.isEmpty(strA)) {
                try {
                    String strOptString = new JSONObject(strA).optString("quarkThread");
                    if (!TextUtils.isEmpty(strOptString)) {
                        str5 = strOptString;
                    }
                } catch (Exception unused) {
                }
            }
            strArr[1] = str5;
            strArr[2] = getQuarkSizeValue();
        } else {
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
            C0590I.i("unsupported drive type: " + str);
        }
        return strArr;
    }

    public static String e(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String f(String str) {
        return e(str).trim();
    }

    public static void g(e eVar, m mVar) {
        c.g(mVar);
        m mVarG = mVar;
        int i = 0;
        while (mVarG != null) {
            m mVarA = mVarG.A();
            int iH = mVarA != null ? mVarA.h() : 0;
            m mVarS = mVarG.s();
            eVar.b(mVarG, i);
            if (mVarA != null && !mVarG.q()) {
                if (iH == mVarA.h()) {
                    mVarG = mVarA.g(mVarG.H());
                } else if (mVarS == null) {
                    i--;
                    mVarG = mVarA;
                } else {
                    mVarG = mVarS;
                }
            }
            if (mVarG.h() > 0) {
                mVarG = mVarG.g(0);
                i++;
            } else {
                while (mVarG.s() == null && i > 0) {
                    eVar.a(mVarG, i);
                    mVarG = mVarG.A();
                    i--;
                }
                eVar.a(mVarG, i);
                if (mVarG == mVar) {
                    return;
                } else {
                    mVarG = mVarG.s();
                }
            }
        }
    }

    public static String getQuarkSizeValue() {
        String strA;
        try {
            File fileB = C0602k.b("/quark_cookie.txt");
            if (fileB == null || !fileB.exists() || fileB.length() <= 0 || (strA = C0602k.a(fileB)) == null) {
                return "256";
            }
            String strTrim = strA.trim();
            return strTrim.length() == 0 ? "256" : "SUPER_VIP".equals(new JSONObject(strTrim).optString("member_type")) ? "512" : "256";
        } catch (Exception unused) {
            return "256";
        }
    }

    public static String getUCSizeValue() {
        String strA;
        try {
            File fileB = C0602k.b("/uc_cookie.txt");
            if (fileB == null || !fileB.exists() || fileB.length() <= 0 || (strA = C0602k.a(fileB)) == null) {
                return "64";
            }
            String strTrim = strA.trim();
            return strTrim.length() == 0 ? "64" : "SUPER_VIP".equals(new JSONObject(strTrim).optString("member_type")) ? "512" : "64";
        } catch (Exception unused) {
            return "64";
        }
    }

    public static String getUCThreadValue() {
        String strA;
        try {
            File fileB = C0602k.b("/uc_cookie.txt");
            if (fileB == null || !fileB.exists() || fileB.length() <= 0 || (strA = C0602k.a(fileB)) == null) {
                return "16";
            }
            String strTrim = strA.trim();
            if (strTrim.length() == 0) {
                return "16";
            }
            String strOptString = new JSONObject(strTrim).optString("member_type");
            return "NORMAL".equals(strOptString) ? "128" : "VIP".equals(strOptString) ? "128" : "16";
        } catch (Exception unused) {
            return "16";
        }
    }

    public static int h(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int i(int i, Object obj) {
        return h(i, obj != null ? obj.hashCode() : 0);
    }

    public static boolean is1314GoProxyActive() {
        String strL = C0575b.l("http://127.0.0.1:1314/api/ping", new HashMap());
        return strL != null && strL.equals("ok");
    }

    public static String processAliyunDriveUrl(String str) {
        return (str == null || str.isEmpty() || !str.contains("dl1-v6.aliyundrive.cloud")) ? str : str.replace("dl1-v6.aliyundrive.cloud", "cn-beijing-data.aliyundrive.net");
    }
}
