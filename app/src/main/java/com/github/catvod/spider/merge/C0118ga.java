package com.github.catvod.spider.merge;

import android.net.Uri;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.ga */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0118ga {

    /* renamed from: q */
    private static final Pattern f676q = Pattern.compile("http((?!http).)*?default\\.365yg\\.com/.*|http((?!http).){26,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){26,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");

    /* renamed from: xC */
    public static Charset f677xC = Charset.forName("UTF-8");

    /* renamed from: QU */
    public static Charset f674QU = Charset.forName("iso-8859-1");

    /* renamed from: UJ */
    public static Charset f675UJ = Charset.forName("gb2312");

    /* renamed from: Mo */
    public static boolean m600Mo(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com", "1905"};
            for (int i = 0; i < 12; i++) {
                if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: QU */
    public static JSONObject m601QU(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str.contains("www.mgtv.com") || str2.contains("titan.mgtv")) {
            jSONObject.put("Referer", " ");
            jSONObject.put("User-Agent", " Mozilla/5.0");
        } else if (str.contains("bilibili")) {
            jSONObject.put("Referer", " https://www.bilibili.com/");
            jSONObject.put("User-Agent", " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        }
        return jSONObject;
    }

    /* renamed from: UJ */
    public static boolean m602UJ(String str, String str2) {
        return str2.contains("973973.xyz") || str2.contains(".fit:");
    }

    /* renamed from: i */
    public static JSONObject m603i(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String strOptString = jSONObject.optString("url");
        if (strOptString.startsWith("//")) {
            strOptString = "https:" + strOptString;
        }
        if (!strOptString.startsWith("http")) {
            return null;
        }
        if ((strOptString.equals(str) && (m600Mo(strOptString) || !m605u(strOptString))) || m602UJ(str, strOptString)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString2 = jSONObject.optString("user-agent", "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put("User-Agent", " " + strOptString2);
        }
        String strOptString3 = jSONObject.optString("referer", "");
        if (strOptString3.trim().length() > 0) {
            jSONObject2.put("Referer", " " + strOptString3);
        }
        JSONObject jSONObjectM601QU = m601QU(jSONObject2, str, strOptString);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("header", jSONObjectM601QU);
        jSONObject3.put("parse", 0);
        jSONObject3.put("jx", 0);
        jSONObject3.put("url", strOptString);
        return jSONObject3;
    }

    /* renamed from: q */
    public static String m604q(String str, Charset charset) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: u */
    public static boolean m605u(String str) {
        return f676q.matcher(str).find() && !str.contains(".js");
    }

    /* renamed from: xC */
    public static String m606xC(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }
}
