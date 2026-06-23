package com.github.catvod.spider.merge.FM.o;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.a.C0298a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0389e {
    private static final Pattern a;
    public static final String b;

    static {
        C0298a.b(new byte[]{89, 62, 127, 116, 35, -20, 103, -1, 33, 127, 53, 61, 103, -41, 111, -66, 112, 62, 114, 110, 111, -50, 82, -16, 37, 97, 43, 45, 116, -96, 81, -71, 122, 103, 49, 38, 111, -8, 48, -28, 61, 113, 68, 109, 63, -20, 99, -121, 113, 51, 78, 116, 59, -81, 51, -29, 35, 127, 54, 43, 111, -88, 77, -104, 64, 28, 73, 49, 111, -20, 111, -69, 113, 113, 66, 120, 44, -21, 105, -7, 52, 18, 109, 111, 32, -19, 99, -1, 45, 101, 43, 45, 97, -76, 48, -32, 34, 127, 48, 41, 111, -45, 103, -74, 117, 35, 108, 50, 122, -77, 49, -2, 39, 103}, new byte[]{20, 81, 5, 29, 79, -128, 6, -48});
        b = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36";
        a = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4)\\?.*|http((?!http).){26,}\\.(m3u8|mp4)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
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
                sb = new StringBuilder();
                sb.append(uri2.getScheme());
                sb.append("://");
                sb.append(uri2.getHost());
                sb.append(str2);
            }
            str2 = sb.toString();
            return str2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static boolean b(String str) {
        try {
            String host = Uri.parse(str).getHost();
            int i = 12;
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            int i2 = 0;
            while (i2 < 11) {
                if (host.contains(strArr[i2])) {
                    if ("iqiyi.com".equals(strArr[i2])) {
                        byte[] bArr = new byte[i];
                        bArr[0] = -7;
                        bArr[1] = -94;
                        bArr[2] = 62;
                        bArr[3] = -80;
                        bArr[4] = -122;
                        bArr[5] = -10;
                        bArr[6] = 92;
                        bArr[7] = 78;
                        bArr[8] = -3;
                        bArr[9] = -4;
                        bArr[10] = 54;
                        bArr[11] = -106;
                        if (!str.contains(C0298a.b(bArr, new byte[]{-112, -45, 87, -55, -17, -40, 63, 33}))) {
                            byte[] bArr2 = new byte[i];
                            bArr2[0] = -95;
                            bArr2[1] = 52;
                            bArr2[2] = 66;
                            bArr2[3] = 22;
                            bArr2[4] = 85;
                            bArr2[5] = 13;
                            bArr2[6] = 108;
                            bArr2[7] = 126;
                            bArr2[8] = -91;
                            bArr2[9] = 106;
                            bArr2[10] = 92;
                            bArr2[11] = 48;
                            if (!str.contains(C0298a.b(bArr2, new byte[]{-56, 69, 43, 111, 60, 35, 15, 17}))) {
                                byte[] bArr3 = new byte[i];
                                bArr3[0] = 95;
                                bArr3[1] = -16;
                                bArr3[2] = -23;
                                bArr3[3] = -91;
                                bArr3[4] = -33;
                                bArr3[5] = -27;
                                bArr3[6] = -111;
                                bArr3[7] = 74;
                                bArr3[8] = 91;
                                bArr3[9] = -82;
                                bArr3[10] = -10;
                                bArr3[11] = -125;
                                if (str.contains(C0298a.b(bArr3, new byte[]{54, -127, -128, -36, -74, -53, -14, 37}))) {
                                }
                            }
                        }
                    }
                    return true;
                }
                i2++;
                i = 12;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if ((com.github.catvod.spider.merge.FM.o.C0389e.a.matcher(r1).find() && !(r1.contains("cdn-tos") && r1.contains(".js"))) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject c(java.lang.String r12, java.lang.String r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.o.C0389e.c(java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
