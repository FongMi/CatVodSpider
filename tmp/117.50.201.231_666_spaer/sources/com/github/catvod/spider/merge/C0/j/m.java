package com.github.catvod.spider.merge.C0.j;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m {
    private static final Pattern a = Pattern.compile("http((?!http).)*?default\\.365yg\\.com/.*|http\\S{12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http\\S{12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?\\S*|http\\S{12,}?m3u8\\S*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?dycdn-tos\\.pstatp[^\\?]*|http.*?/play.{0,3}\\?[^url]{2,8}=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*|http((?!http).)*?douyin\\.com/.*/play/\\?.*|http((?!http).)*?huoshan\\.com/.*/\\?item.*|magnet:.*|ed2k:.*|ftp:.*|file:.*|tvbox-xg:.*|thunder:.*|push:.*");
    public static Charset b = Charset.forName("UTF-8");
    public static Charset c = Charset.forName("iso-8859-1");

    public static String a(String str, Charset charset) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
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

    public static String b(String str, String str2) {
        String strReplaceAll;
        StringBuilder sb;
        try {
            if (str2.startsWith("http") || str2.startsWith("magnet:") || str2.startsWith("ftp:") || str2.startsWith("ed2k:") || str2.startsWith("file:") || str2.startsWith("tvbox-xg:") || str2.startsWith("thunder:") || str2.startsWith("push:")) {
                return str2;
            }
            Uri uri = Uri.parse(str);
            if (str2.startsWith("://")) {
                sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append(str2);
            } else {
                if (!str2.startsWith("//")) {
                    if (!str2.contains("://") && str2.startsWith("/")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                        sb2.append(str2);
                        strReplaceAll = sb2.toString();
                    } else {
                        if (!str2.contains("http") || str2.startsWith("http")) {
                            return str2;
                        }
                        strReplaceAll = str2.replaceAll(".*(http.*)", "$1");
                    }
                    return strReplaceAll;
                }
                sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append(":");
                sb.append(str2);
            }
            strReplaceAll = sb.toString();
            return strReplaceAll;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static boolean c(String str) {
        if (a.matcher(str).find()) {
            return ((str.contains("cdn-tos") && (str.contains(".css") || str.contains(".js"))) || str.contains("url=http")) ? false : true;
        }
        return false;
    }

    public static boolean d(String str) {
        boolean z = true;
        try {
            if (!str.contains("url=http")) {
                String host = Uri.parse(str).getHost();
                String[] strArr = new String[12];
                strArr[0] = "iqiyi.com";
                strArr[1] = "v.qq.com";
                strArr[2] = "youku.com";
                strArr[3] = "le.com";
                strArr[4] = "tudou.com";
                strArr[5] = "mgtv.com";
                strArr[6] = "sohu.com";
                strArr[7] = "acfun.cn";
                strArr[8] = "bilibili.com";
                strArr[9] = "baofeng.com";
                strArr[10] = "pptv.com";
                strArr[11] = "1905.com";
                int i = 0;
                while (true) {
                    if (i >= 12) {
                        z = false;
                        break;
                    }
                    if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                        break;
                    }
                    i++;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            z = false;
        }
        return z;
    }

    public static JSONObject e(String str, String str2) throws JSONException {
        String str3;
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.has("data") ? jSONObject.getJSONObject("data").getString("url") : jSONObject.getString("url");
        if (string.startsWith("//")) {
            string = com.github.catvod.spider.merge.C0.b.n.a("https:", string);
        }
        if (!string.startsWith("http")) {
            return null;
        }
        if (string.equals(str) && (d(string) || !c(string))) {
            return null;
        }
        if (string.contains("973973.xyz") || string.contains(".fit:")) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString("user-agent", "");
        if (strOptString.trim().length() > 0) {
            jSONObject2.put("User-Agent", " " + strOptString);
        }
        String strOptString2 = jSONObject.optString("referer", "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put("Referer", " " + strOptString2);
        }
        if (!str.contains("www.mgtv.com") && !string.contains("titan.mgtv")) {
            if (str.contains("bilibili")) {
                jSONObject2.put("Referer", " https://www.bilibili.com/");
                str3 = " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", jSONObject2);
            jSONObject3.put("url", string);
            return jSONObject3;
        }
        jSONObject2.put("Referer", " ");
        str3 = " Mozilla/5.0";
        jSONObject2.put("User-Agent", str3);
        JSONObject jSONObject32 = new JSONObject();
        jSONObject32.put("header", jSONObject2);
        jSONObject32.put("url", string);
        return jSONObject32;
    }
}
