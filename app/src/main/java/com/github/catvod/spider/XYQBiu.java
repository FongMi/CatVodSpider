package com.github.catvod.spider;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AbstractC0291;
import com.github.catvod.spider.merge.C0243;
import com.github.catvod.spider.merge.C0284;
import com.github.catvod.spider.merge.C0287;
import com.github.catvod.spider.merge.C0295;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.xc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class XYQBiu extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static SharedPreferences f51;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static boolean f52;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static Pattern f53 = Pattern.compile("(https://www.(alipan|aliyundrive).com/s/[^\"]+)");

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static String f54 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static String f55 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static String f56 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static String f57 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static String[] f58 = {"ajax/verify_check", "ajax.php?ac=code_check", "/verify/index.html", "?scheckAC=check"};

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public xc f59;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private String f60 = "";

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private String f61 = "";

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private String f62 = "";

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private String f63 = "";

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private JSONObject f64 = new JSONObject();

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private String f65 = "[\\W|\\S|.]*?MacPlayerConfig.player_list[\\W|\\S|.]*?=([\\W|\\S|.]*?),MacPlayerConfig.downer_list";

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected String f66 = null;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected JSONObject f67 = null;

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    protected String f68 = null;

    public static boolean checkstring(String str) {
        String[] strArr = {"m3u8.pw/Cache", "from=https://banyung.pw", "getm3u8?url=http"};
        for (int i = 0; i < 3; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkveriry(String str) {
        for (String str2 : f58) {
            if (str.contains(str2) && !str.contains("myui-vodbox-content")) {
                return true;
            }
        }
        return false;
    }

    public static String string2Hex(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            String strValueOf = String.valueOf((int) str.charAt(i));
            if (str2.equals("djs")) {
                sb.append(strValueOf);
            } else {
                sb.append(Integer.parseInt(strValueOf) + 1);
            }
        }
        return sb.toString();
    }

    public static String vertype(String str) {
        for (String str2 : f58) {
            if (str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x078c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x078e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x047b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m50(java.lang.String r22, java.lang.String r23, boolean r24, java.util.HashMap<java.lang.String, java.lang.String> r25) {
        /*
            Method dump skipped, instruction units count: 1941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static String m51(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b1 A[Catch: Exception -> 0x03af, TRY_LEAVE, TryCatch #0 {Exception -> 0x03af, blocks: (B:202:0x038a, B:204:0x0390, B:206:0x039b, B:208:0x03a3, B:211:0x03b1), top: B:253:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #16 {Exception -> 0x0164, blocks: (B:26:0x00bb, B:28:0x00c4, B:30:0x00cc, B:43:0x0108, B:45:0x010e, B:47:0x011a, B:50:0x0121, B:53:0x0133, B:55:0x0139, B:57:0x0146, B:59:0x014e, B:60:0x015a, B:33:0x00dc), top: B:285:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9 A[Catch: Exception -> 0x01d3, TRY_LEAVE, TryCatch #20 {Exception -> 0x01d3, blocks: (B:83:0x01b0, B:85:0x01b3, B:87:0x01bb, B:90:0x01c9), top: B:293:0x01b0 }] */
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m52(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static String m53() {
        int i = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int i2 = i - 20;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        String str = "";
        while (i2 >= i) {
            if (i2 == i) {
                str = str + String.valueOf(i2);
            } else {
                str = str + String.valueOf(i2) + "&";
            }
            i2--;
        }
        return str;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private JSONObject m54(String str, String str2, String str3, String str4) {
        String strD = "默认";
        String strD2 = "全部";
        String strD3 = "by";
        String strD4 = "&";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            boolean zEquals = str.equals(strD3);
            String strD5 = "v";
            String strD6 = "n";
            String strD7 = "空";
            if (!zEquals && !str4.equals(strD7) && !str3.contains(strD2)) {
                jSONObject.put(strD6, strD2);
                jSONObject.put(strD5, "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            } else if (str.equals(strD3) && !str4.equals(strD7) && !str3.contains(strD)) {
                jSONObject.put(strD6, strD);
                jSONObject.put(strD5, "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            }
            if (str4.contains(strD4) && !str4.equals(strD7)) {
                String[] strArrSplit = str3.split(strD4);
                String[] strArrSplit2 = str4.split(strD4);
                for (int i = 0; i < strArrSplit.length; i++) {
                    jSONObject.put(strD6, strArrSplit[i]);
                    jSONObject.put(strD5, strArrSplit2[i].replaceAll("＆＆", strD4));
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            } else if (!str4.equals(strD7)) {
                jSONObject.put(strD6, str3);
                jSONObject.put(strD5, str4);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str);
            jSONObject2.put("name", str2);
            jSONObject2.put("value", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private String m55(String str) {
        return m56(str, "");
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private String m56(String str, String str2) {
        String strOptString = this.f67.optString(str);
        return (strOptString.isEmpty() || strOptString.equals("空") || strOptString.equals("&&")) ? str2 : strOptString;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private String m57(String str, String str2, String str3) {
        HashMap<String, String> mapM66 = str3.equals("show") ? m66(str) : m67(str);
        for (int i = 0; i < 3; i++) {
            boolean zContains = str2.contains("/huadong_");
            String strD = "\r|\n";
            String strD2 = "验证</title>";
            String strD3 = "/renji_";
            if (zContains || str2.contains(strD3)) {
                String strM62 = m62(C0287.m1054(str, C0243.m884(str2).m199("body").m1692("script").m1686("src")), this.f63, mapM66);
                String strD4 = "key=\"";
                String strD5 = "\"";
                String str4 = C0287.m1069(strM62, strD4, strD5).get(0);
                String str5 = C0287.m1069(strM62, "value=\"", strD5).get(0);
                String str6 = C0287.m1069(strM62, "FilterValue.get(\"/a20be899", strD5).get(0);
                StringBuilder sb = new StringBuilder();
                sb.append("/a20be899");
                sb.append(str6);
                sb.append(str4);
                sb.append("&value=");
                sb.append(C0284.m1040(string2Hex(str5, str2.contains(strD3) ? "djs" : "hd"), C0284.f712));
                String strM1054 = C0287.m1054(str, sb.toString());
                HashMap map = new HashMap();
                C0295.m1090(strM1054, mapM66, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f62 = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                str2 = m62(str, this.f63, mapM66);
                if (!str2.contains(strD2)) {
                    return str2.replaceAll(strD, "");
                }
            }
            if (!str2.contains(strD2)) {
                return str2.replaceAll(strD, "");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private String m58(String str, String str2, String str3) {
        StringBuilder sb;
        String strD;
        HashMap<String, String> mapM66 = str3.equals("show") ? m66(str) : m67(str);
        for (int i = 0; i < 3; i++) {
            boolean zContains = str2.contains("检测中");
            String strD2 = "\r|\n";
            String strD3 = "<title>检测中</title>";
            if (zContains && str2.contains("btwaf")) {
                String str4 = C0287.m1069(str2, "btwaf=", "\"").get(0);
                if (str.contains("?")) {
                    sb = new StringBuilder();
                    sb.append(str);
                    strD = "&btwaf=";
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    strD = "?btwaf=";
                }
                sb.append(strD);
                sb.append(str4);
                String string = sb.toString();
                HashMap map = new HashMap();
                String strM1090 = C0295.m1090(string, mapM66, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f62 = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                if (!strM1090.contains(strD3)) {
                    return strM1090.replaceAll(strD2, "");
                }
                str2 = m62(str, this.f63, mapM66);
            }
            if (!str2.contains(strD3)) {
                return str2.replaceAll(strD2, "");
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f A[Catch: Exception -> 0x02a7, TRY_LEAVE, TryCatch #4 {Exception -> 0x02a7, blocks: (B:36:0x012c, B:38:0x0170, B:39:0x019f, B:31:0x010e, B:33:0x011f, B:35:0x0128, B:34:0x0124), top: B:107:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023c A[Catch: Exception -> 0x02a5, TRY_ENTER, TryCatch #5 {Exception -> 0x02a5, blocks: (B:48:0x0202, B:50:0x0208, B:53:0x0216, B:54:0x021d, B:63:0x023c, B:65:0x0257, B:67:0x025c, B:68:0x0263, B:44:0x01c4, B:47:0x01d5), top: B:109:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bc A[LOOP:0: B:101:0x003a->B:98:0x02bc, LOOP_END] */
    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m59(java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06be A[Catch: all -> 0x0703, TRY_LEAVE, TryCatch #7 {all -> 0x0703, blocks: (B:207:0x0698, B:209:0x069f, B:221:0x06b8, B:223:0x06be, B:220:0x06b5), top: B:258:0x0698 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0403 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112 A[Catch: Exception -> 0x074f, TryCatch #6 {Exception -> 0x074f, blocks: (B:30:0x00fd, B:32:0x0103, B:40:0x0137, B:42:0x0180, B:43:0x01a7, B:46:0x01b9, B:48:0x01e9, B:50:0x01ef, B:52:0x01f5, B:90:0x0320, B:94:0x0362, B:95:0x0381, B:97:0x03a4, B:109:0x03fd, B:99:0x03ad, B:101:0x03b1, B:102:0x03c0, B:104:0x03c4, B:105:0x03d9, B:107:0x03dd, B:53:0x020a, B:55:0x021d, B:56:0x023a, B:58:0x0250, B:63:0x026a, B:65:0x0276, B:60:0x025c, B:62:0x0262, B:67:0x028a, B:69:0x0298, B:71:0x02ae, B:73:0x02ba, B:74:0x02be, B:76:0x02ca, B:79:0x02da, B:81:0x02e6, B:87:0x0303, B:89:0x030f, B:83:0x02f2, B:85:0x02f8, B:78:0x02d6, B:33:0x0112, B:35:0x0118, B:37:0x011e, B:38:0x012d), top: B:266:0x00fd }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.github.catvod.spider.XYQBiu] */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r3v42, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r7v12, types: [org.json.JSONObject] */
    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m60(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectM50 = m50(str, str2, z, map);
        return jSONObjectM50 != null ? jSONObjectM50.toString() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0513 A[Catch: Exception -> 0x07a8, LOOP:10: B:116:0x050d->B:118:0x0513, LOOP_END, TryCatch #4 {Exception -> 0x07a8, blocks: (B:3:0x0054, B:6:0x00a6, B:8:0x00c0, B:10:0x00da, B:14:0x0109, B:178:0x070f, B:15:0x012d, B:17:0x0139, B:19:0x016a, B:21:0x0176, B:23:0x0182, B:40:0x0231, B:42:0x0245, B:44:0x0266, B:45:0x028d, B:85:0x0432, B:87:0x043a, B:89:0x0444, B:91:0x044e, B:93:0x045e, B:95:0x0483, B:96:0x0496, B:112:0x04fd, B:113:0x0500, B:119:0x052e, B:121:0x053d, B:123:0x054b, B:125:0x0551, B:126:0x057a, B:129:0x057e, B:131:0x0584, B:133:0x0592, B:135:0x0599, B:136:0x059f, B:137:0x05a3, B:138:0x05a7, B:140:0x05b3, B:142:0x05b9, B:143:0x05ee, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:151:0x0622, B:152:0x0627, B:153:0x062e, B:155:0x0640, B:157:0x064c, B:160:0x0653, B:162:0x0659, B:163:0x066d, B:164:0x067a, B:171:0x06dc, B:176:0x070b, B:169:0x06d8, B:116:0x050d, B:118:0x0513, B:24:0x0197, B:26:0x01aa, B:27:0x01d1, B:28:0x01dc, B:29:0x01e8, B:32:0x0204, B:34:0x0210, B:35:0x0214, B:37:0x0221, B:39:0x022d, B:173:0x06e8, B:166:0x0686), top: B:191:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x053d A[Catch: Exception -> 0x07a8, TryCatch #4 {Exception -> 0x07a8, blocks: (B:3:0x0054, B:6:0x00a6, B:8:0x00c0, B:10:0x00da, B:14:0x0109, B:178:0x070f, B:15:0x012d, B:17:0x0139, B:19:0x016a, B:21:0x0176, B:23:0x0182, B:40:0x0231, B:42:0x0245, B:44:0x0266, B:45:0x028d, B:85:0x0432, B:87:0x043a, B:89:0x0444, B:91:0x044e, B:93:0x045e, B:95:0x0483, B:96:0x0496, B:112:0x04fd, B:113:0x0500, B:119:0x052e, B:121:0x053d, B:123:0x054b, B:125:0x0551, B:126:0x057a, B:129:0x057e, B:131:0x0584, B:133:0x0592, B:135:0x0599, B:136:0x059f, B:137:0x05a3, B:138:0x05a7, B:140:0x05b3, B:142:0x05b9, B:143:0x05ee, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:151:0x0622, B:152:0x0627, B:153:0x062e, B:155:0x0640, B:157:0x064c, B:160:0x0653, B:162:0x0659, B:163:0x066d, B:164:0x067a, B:171:0x06dc, B:176:0x070b, B:169:0x06d8, B:116:0x050d, B:118:0x0513, B:24:0x0197, B:26:0x01aa, B:27:0x01d1, B:28:0x01dc, B:29:0x01e8, B:32:0x0204, B:34:0x0210, B:35:0x0214, B:37:0x0221, B:39:0x022d, B:173:0x06e8, B:166:0x0686), top: B:191:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0686 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0444 A[Catch: Exception -> 0x07a8, TryCatch #4 {Exception -> 0x07a8, blocks: (B:3:0x0054, B:6:0x00a6, B:8:0x00c0, B:10:0x00da, B:14:0x0109, B:178:0x070f, B:15:0x012d, B:17:0x0139, B:19:0x016a, B:21:0x0176, B:23:0x0182, B:40:0x0231, B:42:0x0245, B:44:0x0266, B:45:0x028d, B:85:0x0432, B:87:0x043a, B:89:0x0444, B:91:0x044e, B:93:0x045e, B:95:0x0483, B:96:0x0496, B:112:0x04fd, B:113:0x0500, B:119:0x052e, B:121:0x053d, B:123:0x054b, B:125:0x0551, B:126:0x057a, B:129:0x057e, B:131:0x0584, B:133:0x0592, B:135:0x0599, B:136:0x059f, B:137:0x05a3, B:138:0x05a7, B:140:0x05b3, B:142:0x05b9, B:143:0x05ee, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:151:0x0622, B:152:0x0627, B:153:0x062e, B:155:0x0640, B:157:0x064c, B:160:0x0653, B:162:0x0659, B:163:0x066d, B:164:0x067a, B:171:0x06dc, B:176:0x070b, B:169:0x06d8, B:116:0x050d, B:118:0x0513, B:24:0x0197, B:26:0x01aa, B:27:0x01d1, B:28:0x01dc, B:29:0x01e8, B:32:0x0204, B:34:0x0210, B:35:0x0214, B:37:0x0221, B:39:0x022d, B:173:0x06e8, B:166:0x0686), top: B:191:0x0054, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r34) {
        /*
            Method dump skipped, instruction units count: 1965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0199 A[Catch: Exception -> 0x01d8, TryCatch #3 {Exception -> 0x01d8, blocks: (B:34:0x01c7, B:24:0x018c, B:27:0x0199, B:29:0x01b2, B:31:0x01be), top: B:60:0x0137 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r29) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String homeVideoContent() {
        String strD;
        JSONArray jSONArrayOptJSONArray;
        String strD2 = "&";
        String strD3 = "1";
        try {
            m64();
            if (m55("homeContent").equals(strD3)) {
                JSONArray jSONArray = new JSONArray();
                String[] strArrSplit = m56("class_value", "").split(strD2);
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    strD = "list";
                    if (i >= length) {
                        break;
                    }
                    JSONObject jSONObjectM50 = m50(strArrSplit[i].replaceAll("＆＆", strD2), strD3, false, new HashMap<>());
                    if (jSONObjectM50 != null && (jSONArrayOptJSONArray = jSONObjectM50.optJSONArray(strD)) != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length() && i2 < 5; i2++) {
                            jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                        }
                    }
                    if (jSONArray.length() >= 20) {
                        break;
                    }
                    i++;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(strD, jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            super.init(r5, r6)
            r4.f66 = r6
            com.github.catvod.spider.merge.xc r6 = new com.github.catvod.spider.merge.xc
            r6.<init>()
            r4.f59 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.app.Application r0 = com.github.catvod.spider.Init.context()
            java.lang.String r0 = r0.getPackageName()
            r6.append(r0)
            java.lang.String r0 = "25222313121208373F151104"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 0
            android.content.SharedPreferences r6 = r5.getSharedPreferences(r6, r0)
            com.github.catvod.spider.XYQBiu.f51 = r6
            java.lang.String r0 = "2A27331A1D1428373704110412063E1D1119"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L74
            java.lang.String r0 = com.github.catvod.spider.Proxy.AnonymousClass3.localProxyUrl()     // Catch: java.lang.Exception -> L6f
            java.lang.String r2 = "552223190C0E"
            java.lang.String r2 = com.github.catvod.spider.merge.SOY.d(r2)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = "5534381A1158220B00222235152A7E17181E0E3D3A131A590E2A25"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r0.replace(r2, r3)     // Catch: java.lang.Exception -> L6f
            r2 = 0
            java.lang.String r0 = com.github.catvod.spider.merge.C0295.m1089(r0, r2)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Exception -> L6f
            int r2 = r0.length()     // Catch: java.lang.Exception -> L6f
            r3 = 32
            if (r2 != r3) goto L74
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L6f
            if (r1 != 0) goto L74
            r1 = r0
            goto L75
        L6f:
            r6 = move-exception
            com.github.catvod.crawler.SpiderDebug.log(r6)
            goto L75
        L74:
            r1 = r6
        L75:
            com.github.catvod.spider.merge.xc r6 = r4.f59
            r6.init(r5, r1)
            return
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
    }

    public boolean isVideoFormat(String str) {
        m64();
        String lowerCase = m56("VideoFormat", ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a").toLowerCase();
        String strD = "#";
        String[] strArrSplit = lowerCase.split(strD);
        String[] strArrSplit2 = m56("VideoFilter", "=http#.html").toLowerCase().split(strD);
        String lowerCase2 = str.toLowerCase();
        if ((lowerCase2.contains("=http") || lowerCase2.contains(".html")) && !checkstring(lowerCase2)) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (lowerCase2.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase2.contains(str3) && !checkstring(lowerCase2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        m64();
        return m55("ManualSniffer").equals("1");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:467|155|156|(3:469|157|(9:159|(1:480)(1:208)|252|253|254|255|256|257|258)(2:481|209))|473|210|(6:450|212|(2:221|(2:223|224))|(3:229|462|(4:231|456|232|233)(4:237|417|238|239))(1:228)|242|258)(0)|415|416) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x041c, code lost:
    
        r13 = new org.json.JSONObject(r13.substring(r13.indexOf(123), r13.lastIndexOf(125) + 1));
        r0 = r13.getString(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0443, code lost:
    
        r18 = r13.getString(com.github.catvod.spider.merge."from");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0445, code lost:
    
        r19 = r13.getString(com.github.catvod.spider.merge."link_next");
        r20 = r13.has(com.github.catvod.spider.merge."key");
        r21 = r13.has(com.github.catvod.spider.merge."tm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0473, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."id") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0483, code lost:
    
        r22 = java.lang.Integer.valueOf(r13.getInt(com.github.catvod.spider.merge."id"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0486, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0492, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."nid") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a2, code lost:
    
        r23 = java.lang.Integer.valueOf(r13.getInt(com.github.catvod.spider.merge."nid"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04a5, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04b1, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."vod_pic_thumb") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04bd, code lost:
    
        r24 = r13.getString(com.github.catvod.spider.merge."vod_pic_thumb");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04c0, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04cc, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."vod_title") == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04d8, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."vod_title_name") == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04da, code lost:
    
        r15 = r13.getString(com.github.catvod.spider.merge."vod_title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04f0, code lost:
    
        r26 = r15;
        r25 = r13.getString(com.github.catvod.spider.merge."vod_title_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04f6, code lost:
    
        r26 = r15;
        r13 = null;
        r15 = null;
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04fe, code lost:
    
        r25 = null;
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x050c, code lost:
    
        if (r13.has(com.github.catvod.spider.merge."encrypt") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x050e, code lost:
    
        r13 = r13.getInt(com.github.catvod.spider.merge."encrypt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0519, code lost:
    
        if (r13 != 1) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x051b, code lost:
    
        r0 = java.net.URLDecoder.decode(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0521, code lost:
    
        if (r13 != 2) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0523, code lost:
    
        r0 = java.net.URLDecoder.decode(new java.lang.String(android.util.Base64.decode(r0, 0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0531, code lost:
    
        r13 = r0;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0535, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0536, code lost:
    
        r13 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x053a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x053b, code lost:
    
        r13 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x053f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0540, code lost:
    
        r13 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0544, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0545, code lost:
    
        r13 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0549, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x054a, code lost:
    
        r13 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0601, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x059a A[Catch: Exception -> 0x0601, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x0601, blocks: (B:210:0x0566, B:229:0x05b3, B:221:0x059a), top: B:473:0x0566 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0848 A[Catch: Exception -> 0x0a73, TryCatch #9 {Exception -> 0x0a73, blocks: (B:343:0x0848, B:345:0x084e, B:351:0x086e, B:352:0x0873, B:354:0x0879, B:358:0x0889, B:339:0x0837, B:348:0x0859), top: B:433:0x0837, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08a9 A[Catch: Exception -> 0x089e, TryCatch #12 {Exception -> 0x089e, blocks: (B:361:0x0897, B:377:0x0966, B:367:0x08a9, B:370:0x0906, B:372:0x091b, B:373:0x094c, B:376:0x0954), top: B:437:0x0897 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0809 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r35, java.lang.String r36, java.util.List<java.lang.String> r37) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String searchContent(String str, boolean z) {
        return m60(str, "1");
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected String m61(String str, String str2, String str3, Map<String, String> map) {
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQBiu.4
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1087(C0295.m1082(), str, str2, map, abstractC0292);
            return new String(abstractC0292.getResult().body().bytes(), str3).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected String m62(String str, String str2, Map<String, String> map) {
        String strD = "clan://";
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQBiu.2
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            if (str.startsWith(strD)) {
                return C0295.m1089(str.replace(strD, Proxy.AnonymousClass3.localProxyUrl().replace("/proxy", "/file/")), null);
            }
            C0295.m1083(C0295.m1082(), str, null, map, abstractC0292);
            return new String(abstractC0292.getResult().body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected String m63(String str, Map<String, String> map, String str2, Map<String, String> map2) {
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQBiu.3
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1086(C0295.m1082(), str, map, map2, abstractC0292);
            return new String(abstractC0292.getResult().body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected void m64() {
        String str;
        if (this.f67 != null || (str = this.f66) == null) {
            return;
        }
        try {
            if (str.startsWith("http")) {
                this.f67 = new JSONObject(C0295.m1089(this.f66, null));
            } else {
                this.f67 = new JSONObject(this.f66);
            }
            this.f68 = m56("OCR_API", "https://api.nn.ci/ocr/b64/text");
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected String m65(String str, String str2, boolean z) {
        try {
            this.f64.put("referer", str2);
            return str + "@Headers=" + this.f64.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected HashMap<String, String> m66(String str) throws JSONException {
        String str2;
        String string;
        String str3;
        String string2;
        String str4;
        String string3;
        String str5;
        HashMap<String, String> map = new HashMap<>();
        String strTrim = m56("UserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        String strD = "苹果电脑";
        String strD2 = "MAC_UA";
        String strD3 = "苹果手机";
        String strD4 = "IOS_UA";
        String strD5 = "Cookie";
        String strD6 = "手机";
        String strD7 = "MOBILE_UA";
        String strD8 = "电脑";
        String strD9 = "PC_UA";
        String strD10 = "user-agent";
        String strD11 = ";";
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string4 = strArrSplit2[1];
                if (string4.equals(strD9) || string4.equals(strD8)) {
                    string4 = f54;
                } else if (string4.equals(strD7) || string4.equals(strD6)) {
                    string4 = f55;
                } else if (string4.equals(strD4) || string4.equals(strD3)) {
                    string4 = f56;
                } else if (string4.equals(strD2) || string4.equals(strD)) {
                    string4 = f57;
                }
                String str7 = strD;
                if (this.f62.isEmpty() || !str6.equalsIgnoreCase("cookie")) {
                    str4 = strD2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string4);
                    if (this.f62.isEmpty()) {
                        str4 = strD2;
                        string3 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strD11);
                        str4 = strD2;
                        sb2.append(this.f62);
                        string3 = sb2.toString();
                    }
                    sb.append(string3);
                    if (this.f60.isEmpty()) {
                        str5 = "";
                    } else {
                        str5 = strD11 + this.f60;
                    }
                    sb.append(str5);
                    string4 = sb.toString();
                }
                if (str6.equalsIgnoreCase(strD10)) {
                    this.f64.put(strD10, string4);
                }
                boolean zEqualsIgnoreCase = str6.equalsIgnoreCase("referer");
                String strD12 = "WebView";
                if (!zEqualsIgnoreCase && !string4.equalsIgnoreCase(strD12)) {
                    map.put(str6, string4);
                } else if (!string4.equalsIgnoreCase(strD12)) {
                    map.put(str6, string4);
                }
                i++;
                strArrSplit = strArr;
                strD = str7;
                strD2 = str4;
            }
            if (!this.f62.isEmpty() && this.f62.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                if (this.f62.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f62);
                    if (this.f60.isEmpty()) {
                        str3 = this.f60;
                    } else {
                        str3 = strD11 + this.f60;
                    }
                    sb3.append(str3);
                    string2 = sb3.toString();
                } else {
                    string2 = this.f60;
                }
                map.put(strD5, string2);
            }
        } else {
            if (strTrim.isEmpty()) {
                strTrim = "okhttp/3.12.11";
            } else if (strTrim.equals(strD9) || strTrim.equals(strD8)) {
                strTrim = f54;
            } else if (strTrim.equals(strD7) || strTrim.equals(strD6)) {
                strTrim = f55;
            } else if (strTrim.equals(strD4) || strTrim.equals(strD3)) {
                strTrim = f56;
            } else if (strTrim.equals(strD2) || strTrim.equals(strD)) {
                strTrim = f57;
            }
            if (!this.f62.isEmpty() && this.f62.length() > 1) {
                if (this.f62.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f62);
                    if (this.f60.isEmpty()) {
                        str2 = this.f60;
                    } else {
                        str2 = strD11 + this.f60;
                    }
                    sb4.append(str2);
                    string = sb4.toString();
                } else {
                    string = this.f60;
                }
                map.put(strD5, string);
            }
            map.put("User-Agent", strTrim);
            this.f64.put(strD10, strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected HashMap<String, String> m67(String str) throws JSONException {
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        HashMap<String, String> map = new HashMap<>();
        String strTrim = m56("SUserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        String strD = "苹果电脑";
        String strD2 = "MAC_UA";
        String strD3 = "苹果手机";
        String strD4 = "IOS_UA";
        String strD5 = "Cookie";
        String strD6 = "手机";
        String strD7 = "MOBILE_UA";
        String strD8 = "电脑";
        String strD9 = "PC_UA";
        String strD10 = "user-agent";
        String strD11 = ";";
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string2 = strArrSplit2[1];
                if (string2.equals(strD9) || string2.equals(strD8)) {
                    string2 = f54;
                } else if (string2.equals(strD7) || string2.equals(strD6)) {
                    string2 = f55;
                } else if (string2.equals(strD4) || string2.equals(strD3)) {
                    string2 = f56;
                } else if (string2.equals(strD2) || string2.equals(strD)) {
                    string2 = f57;
                }
                String str7 = strD;
                if (this.f62.isEmpty() || !str6.equalsIgnoreCase("cookie")) {
                    str4 = strD2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string2);
                    if (this.f62.isEmpty()) {
                        str4 = strD2;
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strD11);
                        str4 = strD2;
                        sb2.append(this.f62);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    if (this.f61.isEmpty()) {
                        str5 = "";
                    } else {
                        str5 = strD11 + this.f61;
                    }
                    sb.append(str5);
                    string2 = sb.toString();
                }
                if (str6.equalsIgnoreCase(strD10)) {
                    this.f64.put(strD10, string2);
                }
                boolean zEqualsIgnoreCase = str6.equalsIgnoreCase("referer");
                String strD12 = "WebView";
                if (!zEqualsIgnoreCase && !string2.equalsIgnoreCase(strD12)) {
                    map.put(str6, string2);
                } else if (!string2.equalsIgnoreCase(strD12)) {
                    map.put(str6, string2);
                }
                i++;
                strArrSplit = strArr;
                strD = str7;
                strD2 = str4;
            }
            if (!this.f62.isEmpty() && this.f62.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(!this.f62.isEmpty() ? this.f61 : this.f62);
                if (this.f61.isEmpty()) {
                    str3 = this.f61;
                } else {
                    str3 = strD11 + this.f61;
                }
                sb3.append(str3);
                map.put(strD5, sb3.toString());
            }
        } else {
            if (strTrim.isEmpty()) {
                return m66(str);
            }
            if (strTrim.equals(strD9) || strTrim.equals(strD8)) {
                strTrim = f54;
            } else if (strTrim.equals(strD7) || strTrim.equals(strD6)) {
                strTrim = f55;
            } else if (strTrim.equals(strD4) || strTrim.equals(strD3)) {
                strTrim = f56;
            } else if (strTrim.equals(strD2) || strTrim.equals(strD)) {
                strTrim = f57;
            }
            if (!this.f62.isEmpty() && this.f62.length() > 1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(!this.f62.isEmpty() ? this.f61 : this.f62);
                if (this.f61.isEmpty()) {
                    str2 = this.f61;
                } else {
                    str2 = strD11 + this.f61;
                }
                sb4.append(str2);
                map.put(strD5, sb4.toString());
            }
            map.put("User-Agent", strTrim);
            this.f64.put(strD10, strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    String m68(String str) {
        return str.replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "").replaceAll("\\s{2,}", "");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m60(str, str2);
    }
}
