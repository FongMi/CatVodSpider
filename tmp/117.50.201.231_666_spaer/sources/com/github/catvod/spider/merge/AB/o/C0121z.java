package com.github.catvod.spider.merge.AB.o;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0121z {
    private static final Pattern a = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4)\\?.*|http((?!http).){26,}\\.(m3u8|mp4)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
    public static final String b = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36";

    static {
        Charset charset = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.ISO_8859_1;
    }

    public static String a(String str, String str2) {
        StringBuilder sb;
        try {
            if (str2.startsWith("//")) {
                Uri uri = Uri.parse(str);
                sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append(":");
                sb.append(str2);
            } else {
                if (str2.contains("://")) {
                    return str2;
                }
                Uri uri2 = Uri.parse(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uri2.getScheme());
                sb2.append("://");
                sb2.append(uri2.getHost());
                sb2.append(str2);
                sb = sb2;
            }
            return sb.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static boolean b(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            for (int i = 0; i < 11; i++) {
                if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if ((com.github.catvod.spider.merge.AB.o.C0121z.a.matcher(r9).find() && !(r9.contains("cdn-tos") && r9.contains(".js"))) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject c(java.lang.String r8, java.lang.String r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AB.o.C0121z.c(java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
