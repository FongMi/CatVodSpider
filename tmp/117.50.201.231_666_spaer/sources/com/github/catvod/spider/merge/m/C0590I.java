package com.github.catvod.spider.merge.m;

import android.text.TextUtils;
import android.util.TypedValue;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.RunnableC0543g;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0590I {
    public static final List<String> a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a");
    public static final Pattern b = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");
    public static final List<String> c = Arrays.asList("夸克原画", "夸克普画");
    public static final List<String> d = Arrays.asList("阿里原画", "阿里普画");
    public static final List<String> f = Arrays.asList("UC原画", "UC普画");
    public static final List<String> g = Arrays.asList("天翼原画");
    public static final List<String> e = Arrays.asList("百度原画");
    public static final List<String> h = Arrays.asList("123原画");

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int c(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static String e(double d2) {
        return d2 <= 0.0d ? "" : d2 > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.099511627776E12d), "TB") : d2 > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.073741824E9d), "GB") : d2 > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1024.0d), "KB");
    }

    public static boolean f() {
        for (Method method : Spider.class.getDeclaredMethods()) {
            if ("action".equals(method.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void i(String str) {
        if (str.equals(".aliyun")) {
            str = "已清除阿里Token";
        } else if (str.equals("quark_cookie.txt")) {
            str = "已清除夸克Cookie";
        } else if (str.equals("uc_cookie.txt")) {
            str = "已清除UC Cookie";
        } else if (str.equals("uc_token.txt")) {
            str = "已清除UC TV Token";
        } else if (str.equals("cloud189.txt")) {
            str = "已清除天翼Cookie";
        } else if (str.equals("cloud123.txt")) {
            str = "已清除123 Cookie";
        } else if (str.equals("baidu.txt")) {
            str = "已清除百度Cookie";
        } else if (str.equals("bili_cookie.txt")) {
            str = "已清除哔哩Cookie";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Init.run(new RunnableC0543g(str, 4));
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public static boolean m126i(String str) {
        return a.contains(m(str));
    }

    private static HashMap<String, String> j(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf != -1) {
                map.put(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public static String k(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String m(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    public static String n(String str, String str2, String str3) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            jSONObject.put("folder", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("sharePwd", str3);
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String o(String str, String str2, String str3, String str4) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            jSONObject.put("folder", str2);
            jSONObject.put("parentId", str3);
            jSONObject.put("fileToken", str4);
            if (!TextUtils.isEmpty("")) {
                jSONObject.put("sharePwd", "");
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q(String str, String str2) {
        try {
            HashMap<String, String> mapR = r(str);
            mapR.putAll(r(str2.split(";")[0]));
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : mapR.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static HashMap<String, String> r(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf != -1) {
                map.put(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }
}
