package com.github.catvod.spider;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AbstractC0291;
import com.github.catvod.spider.merge.C0011;
import com.github.catvod.spider.merge.C0243;
import com.github.catvod.spider.merge.C0284;
import com.github.catvod.spider.merge.C0287;
import com.github.catvod.spider.merge.C0295;
import com.github.catvod.spider.merge.C0455;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.xc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class XYQHiker extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static SharedPreferences f73;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static boolean f74;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static Pattern f75 = Pattern.compile("(https://www.(alipan|aliyundrive).com/s/[^\"]+)");

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static String f76 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static String f77 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static String f78 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static String f79 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static String[] f80 = {"ajax/verify_check", "ajax.php?ac=code_check", "/verify/index.html", "?scheckAC=check"};

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private static String[] f81 = {"href", "src", "class", "title", "alt"};

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public xc f82;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private String f83 = "";

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private String f84 = "";

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private String f85 = "";

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private String f86 = "";

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private JSONObject f87 = new JSONObject();

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private String f88 = "[\\W|\\S|.]*?MacPlayerConfig.player_list[\\W|\\S|.]*?=([\\W|\\S|.]*?),MacPlayerConfig.downer_list";

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected String f89 = null;

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    protected JSONObject f90 = null;

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected String f91 = null;

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected boolean f92;

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
        for (String str2 : f80) {
            if (str.contains(str2) && !str.contains("myui-vodbox-content")) {
                return true;
            }
        }
        return false;
    }

    public static String getText(C0011 c0011, String str) {
        if ("*".equals(str)) {
            return "null";
        }
        String[] strArrSplit = str.split("\\|\\|");
        if (strArrSplit.length > 1) {
            for (String str2 : strArrSplit) {
                String strM78 = null;
                try {
                    strM78 = m78(c0011, str2);
                } catch (Exception e) {
                    StringUtils.printStackTrace();
                }
                if (!TextUtils.isEmpty(strM78)) {
                    return strM78;
                }
            }
        }
        return m78(c0011, str);
    }

    public static String getTextByRule(C0011 c0011, String str) {
        if (str == null || str.length() == 0 || "*".equals(str)) {
            return "";
        }
        boolean zContains = str.contains(".js:");
        String strD = "＋";
        return zContains ? m73(c0011, str, strD) : str.contains(strD) ? m73(c0011, str, strD) : m73(c0011, str, "\\+");
    }

    public static C0011 getTrueElement(String str, C0011 c0011) {
        if (str.startsWith("Text") || str.startsWith("Attr")) {
            return c0011;
        }
        for (String str2 : f81) {
            if (str2.equals(str)) {
                return c0011;
            }
        }
        String[] strArrSplit = str.split("--");
        if (strArrSplit.length > 1) {
            C0011 trueElement = getTrueElement(strArrSplit[0], c0011);
            String strMo287 = trueElement.mo287();
            for (int i = 1; i < strArrSplit.length; i++) {
                strMo287 = strMo287.replace(getTrueElement(strArrSplit[i], trueElement).mo287(), "");
                trueElement = C0243.m884(strMo287);
            }
            return trueElement;
        }
        String[] strArrSplit2 = str.split("\\|\\|");
        if (strArrSplit2.length > 1) {
            for (String str3 : strArrSplit2) {
                C0011 trueElement2 = null;
                try {
                    trueElement2 = getTrueElement(str3, c0011);
                } catch (Exception e) {
                    StringUtils.printStackTrace();
                }
                if (trueElement2 != null) {
                    return trueElement2;
                }
            }
        }
        String[] strArrSplit3 = str.split(",");
        if (strArrSplit3.length <= 1) {
            return c0011.m199(str).m1688();
        }
        int i2 = Integer.parseInt(strArrSplit3[1]);
        C0455 c0455M199 = c0011.m199(strArrSplit3[0]);
        return i2 < 0 ? c0455M199.get(c0455M199.size() + i2) : c0011.m199(strArrSplit3[0]).get(i2);
    }

    public static String listToString(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() <= 0) {
            return "";
        }
        if (list.size() <= 1) {
            return list.get(0);
        }
        sb.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(str);
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static C0455 selectElements(C0011 c0011, String str) {
        String[] strArrSplit = str.split("\\|\\|");
        C0455 c0455 = new C0455();
        for (String str2 : strArrSplit) {
            try {
                c0455.addAll(m83(c0011, str2));
            } catch (Exception e) {
                StringUtils.printStackTrace();
            }
        }
        return c0455;
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
        for (String str2 : f80) {
            if (str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07ba A[Catch: Exception -> 0x0ced, TryCatch #0 {Exception -> 0x0ced, blocks: (B:3:0x0028, B:7:0x003c, B:11:0x004d, B:13:0x006c, B:15:0x0088, B:17:0x0098, B:19:0x00a5, B:23:0x00b2, B:25:0x00bf, B:28:0x00cb, B:30:0x00d1, B:31:0x00e4, B:33:0x00ea, B:35:0x00f0, B:36:0x0103, B:40:0x0119, B:42:0x011f, B:43:0x0127, B:45:0x012d, B:47:0x0143, B:49:0x015e, B:51:0x0170, B:53:0x017a, B:55:0x0180, B:59:0x018c, B:61:0x0192, B:65:0x019e, B:66:0x01b6, B:70:0x01bf, B:71:0x01f6, B:74:0x0229, B:75:0x0250, B:78:0x0276, B:80:0x02cb, B:82:0x02d1, B:84:0x02d7, B:110:0x03b4, B:112:0x03c8, B:114:0x03d5, B:116:0x03e5, B:118:0x03f2, B:120:0x0402, B:122:0x040f, B:124:0x041f, B:126:0x042c, B:128:0x0436, B:133:0x044a, B:136:0x045a, B:141:0x0468, B:143:0x0472, B:148:0x0480, B:150:0x0490, B:152:0x049d, B:154:0x04ad, B:156:0x04ba, B:158:0x04ca, B:160:0x04d7, B:162:0x04e9, B:164:0x04f6, B:166:0x0508, B:168:0x0515, B:170:0x0527, B:172:0x0534, B:174:0x0546, B:176:0x0553, B:179:0x057b, B:181:0x0585, B:183:0x058b, B:185:0x05a8, B:187:0x05c5, B:199:0x061d, B:287:0x07d6, B:284:0x07b3, B:286:0x07ba, B:498:0x0ca8, B:188:0x05cd, B:190:0x05d1, B:191:0x05e0, B:193:0x05e4, B:194:0x05f9, B:196:0x05fd, B:289:0x07ef, B:291:0x080d, B:293:0x081a, B:295:0x082a, B:297:0x0837, B:299:0x0847, B:301:0x0854, B:303:0x0864, B:305:0x0871, B:307:0x0883, B:309:0x0890, B:311:0x08a2, B:313:0x08af, B:315:0x08c1, B:317:0x08ce, B:319:0x08de, B:324:0x08ee, B:328:0x0900, B:330:0x0907, B:333:0x0913, B:334:0x091b, B:336:0x0921, B:337:0x092f, B:340:0x093b, B:341:0x093f, B:343:0x0945, B:344:0x0949, B:345:0x0959, B:347:0x095e, B:348:0x0967, B:349:0x0973, B:495:0x0c85, B:497:0x0c8c, B:316:0x08c8, B:312:0x08a9, B:308:0x088a, B:304:0x086b, B:300:0x084e, B:296:0x0831, B:292:0x0814, B:175:0x054d, B:171:0x052e, B:167:0x050f, B:163:0x04f0, B:159:0x04d1, B:155:0x04b4, B:151:0x0497, B:125:0x0426, B:121:0x0409, B:117:0x03ec, B:113:0x03cf, B:85:0x02ec, B:87:0x02ff, B:88:0x0324, B:90:0x033a, B:92:0x0340, B:94:0x034b, B:95:0x0357, B:97:0x036d, B:99:0x0379, B:100:0x037d, B:102:0x0389, B:105:0x0399, B:107:0x03a5, B:109:0x03ab, B:104:0x0395, B:18:0x009f, B:14:0x0076, B:10:0x0047, B:6:0x0036), top: B:510:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b10 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0b93 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0b9c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0ba8 A[Catch: Exception -> 0x09a0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x09a0, blocks: (B:354:0x098b, B:357:0x0995, B:365:0x09d9, B:367:0x09e5, B:373:0x0a0f, B:440:0x0b16, B:472:0x0b97, B:477:0x0ba8, B:482:0x0bf3, B:485:0x0c11, B:464:0x0b79, B:432:0x0af4), top: B:522:0x098b }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0bba A[Catch: Exception -> 0x0c81, TRY_ENTER, TryCatch #32 {Exception -> 0x0c81, blocks: (B:351:0x0979, B:363:0x09cd, B:369:0x0a01, B:376:0x0a16, B:436:0x0b06, B:444:0x0b21, B:468:0x0b89, B:480:0x0be7, B:483:0x0bf7, B:486:0x0c15, B:479:0x0bba, B:362:0x09a8), top: B:574:0x0979 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0bf3 A[Catch: Exception -> 0x09a0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x09a0, blocks: (B:354:0x098b, B:357:0x0995, B:365:0x09d9, B:367:0x09e5, B:373:0x0a0f, B:440:0x0b16, B:472:0x0b97, B:477:0x0ba8, B:482:0x0bf3, B:485:0x0c11, B:464:0x0b79, B:432:0x0af4), top: B:522:0x098b }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0c11 A[Catch: Exception -> 0x09a0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x09a0, blocks: (B:354:0x098b, B:357:0x0995, B:365:0x09d9, B:367:0x09e5, B:373:0x0a0f, B:440:0x0b16, B:472:0x0b97, B:477:0x0ba8, B:482:0x0bf3, B:485:0x0c11, B:464:0x0b79, B:432:0x0af4), top: B:522:0x098b }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0c8c A[Catch: Exception -> 0x0ced, TryCatch #0 {Exception -> 0x0ced, blocks: (B:3:0x0028, B:7:0x003c, B:11:0x004d, B:13:0x006c, B:15:0x0088, B:17:0x0098, B:19:0x00a5, B:23:0x00b2, B:25:0x00bf, B:28:0x00cb, B:30:0x00d1, B:31:0x00e4, B:33:0x00ea, B:35:0x00f0, B:36:0x0103, B:40:0x0119, B:42:0x011f, B:43:0x0127, B:45:0x012d, B:47:0x0143, B:49:0x015e, B:51:0x0170, B:53:0x017a, B:55:0x0180, B:59:0x018c, B:61:0x0192, B:65:0x019e, B:66:0x01b6, B:70:0x01bf, B:71:0x01f6, B:74:0x0229, B:75:0x0250, B:78:0x0276, B:80:0x02cb, B:82:0x02d1, B:84:0x02d7, B:110:0x03b4, B:112:0x03c8, B:114:0x03d5, B:116:0x03e5, B:118:0x03f2, B:120:0x0402, B:122:0x040f, B:124:0x041f, B:126:0x042c, B:128:0x0436, B:133:0x044a, B:136:0x045a, B:141:0x0468, B:143:0x0472, B:148:0x0480, B:150:0x0490, B:152:0x049d, B:154:0x04ad, B:156:0x04ba, B:158:0x04ca, B:160:0x04d7, B:162:0x04e9, B:164:0x04f6, B:166:0x0508, B:168:0x0515, B:170:0x0527, B:172:0x0534, B:174:0x0546, B:176:0x0553, B:179:0x057b, B:181:0x0585, B:183:0x058b, B:185:0x05a8, B:187:0x05c5, B:199:0x061d, B:287:0x07d6, B:284:0x07b3, B:286:0x07ba, B:498:0x0ca8, B:188:0x05cd, B:190:0x05d1, B:191:0x05e0, B:193:0x05e4, B:194:0x05f9, B:196:0x05fd, B:289:0x07ef, B:291:0x080d, B:293:0x081a, B:295:0x082a, B:297:0x0837, B:299:0x0847, B:301:0x0854, B:303:0x0864, B:305:0x0871, B:307:0x0883, B:309:0x0890, B:311:0x08a2, B:313:0x08af, B:315:0x08c1, B:317:0x08ce, B:319:0x08de, B:324:0x08ee, B:328:0x0900, B:330:0x0907, B:333:0x0913, B:334:0x091b, B:336:0x0921, B:337:0x092f, B:340:0x093b, B:341:0x093f, B:343:0x0945, B:344:0x0949, B:345:0x0959, B:347:0x095e, B:348:0x0967, B:349:0x0973, B:495:0x0c85, B:497:0x0c8c, B:316:0x08c8, B:312:0x08a9, B:308:0x088a, B:304:0x086b, B:300:0x084e, B:296:0x0831, B:292:0x0814, B:175:0x054d, B:171:0x052e, B:167:0x050f, B:163:0x04f0, B:159:0x04d1, B:155:0x04b4, B:151:0x0497, B:125:0x0426, B:121:0x0409, B:117:0x03ec, B:113:0x03cf, B:85:0x02ec, B:87:0x02ff, B:88:0x0324, B:90:0x033a, B:92:0x0340, B:94:0x034b, B:95:0x0357, B:97:0x036d, B:99:0x0379, B:100:0x037d, B:102:0x0389, B:105:0x0399, B:107:0x03a5, B:109:0x03ab, B:104:0x0395, B:18:0x009f, B:14:0x0076, B:10:0x0047, B:6:0x0036), top: B:510:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0cea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0cec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0689 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x07d6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m69(java.lang.String r35, java.lang.String r36, boolean r37, java.util.HashMap<java.lang.String, java.lang.String> r38) {
        /*
            Method dump skipped, instruction units count: 3348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static String m70(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b1 A[Catch: Exception -> 0x03af, TRY_LEAVE, TryCatch #0 {Exception -> 0x03af, blocks: (B:202:0x038a, B:204:0x0390, B:206:0x039b, B:208:0x03a3, B:211:0x03b1), top: B:261:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046a A[Catch: Exception -> 0x04a8, TRY_LEAVE, TryCatch #14 {Exception -> 0x04a8, blocks: (B:3:0x0016, B:5:0x002f, B:7:0x005a, B:246:0x0463, B:248:0x046a), top: B:289:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #17 {Exception -> 0x0164, blocks: (B:26:0x00bb, B:28:0x00c4, B:30:0x00cc, B:43:0x0108, B:45:0x010e, B:47:0x011a, B:50:0x0121, B:53:0x0133, B:55:0x0139, B:57:0x0146, B:59:0x014e, B:60:0x015a, B:33:0x00dc), top: B:295:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9 A[Catch: Exception -> 0x01d3, TRY_LEAVE, TryCatch #21 {Exception -> 0x01d3, blocks: (B:83:0x01b0, B:85:0x01b3, B:87:0x01bb, B:90:0x01c9), top: B:303:0x01b0 }] */
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m71(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static String m72() {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m73(com.github.catvod.spider.merge.C0011 r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String[] r6 = r6.split(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r6.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L5f
            r2 = r6[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "5D"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L25
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L37
        L25:
            java.lang.String r3 = "58"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L55
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L55
        L37:
            int r3 = r2.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r4, r3)
            java.lang.String r3 = "263C"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            java.lang.String r4 = "70"
            java.lang.String r4 = com.github.catvod.spider.merge.SOY.d(r4)
            java.lang.String r2 = r2.replace(r3, r4)
            r7.add(r2)
            goto L5c
        L55:
            java.lang.String r2 = m74(r5, r2)
            r7.add(r2)
        L5c:
            int r1 = r1 + 1
            goto Lb
        L5f:
            java.lang.String r5 = ""
            java.lang.String r5 = listToString(r7, r5)
            return r5
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static String m74(C0011 c0011, String str) {
        String[] strArrSplit = str.split("&&");
        if (strArrSplit.length != 1) {
            c0011 = getTrueElement(strArrSplit[0], c0011);
        }
        for (int i = 1; i < strArrSplit.length - 1; i++) {
            c0011 = getTrueElement(strArrSplit[i], c0011);
        }
        return getText(c0011, strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private JSONObject m75(String str, String str2, String str3, String str4) {
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
            if (!this.f92) {
                return null;
            }
            Init.show("筛选getRType部分出错：" + StringUtils.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private String m76(String str) {
        return m77(str, "");
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private String m77(String str, String str2) {
        String strOptString = this.f90.optString(str);
        return (strOptString.isEmpty() || strOptString.equals("空") || strOptString.equals("&&")) ? str2 : strOptString;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static String m78(C0011 c0011, String str) {
        try {
            String[] strArrSplit = str.split("\\.js:");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
            }
            String[] strArrSplit2 = str.split("!");
            int length = strArrSplit2.length;
            String strD = " ";
            String strD2 = "\n";
            String strD3 = "B64Dec";
            String strD4 = "Text";
            String strD5 = "Attr";
            String strD6 = "Html";
            if (length <= 1) {
                String strM204 = str.equals(strD4) ? c0011.m204() : strD3.equals(str) ? new String(Base64.decode(c0011.m204(), 0)) : strD6.equals(str) ? c0011.m189() : str.contains(strD5) ? c0011.mo117(str.replace(strD5, "")) : c0011.mo117(str);
                return !strD6.equals(str) ? strM204.replaceAll(strD2, strD) : strM204;
            }
            String strM2042 = strArrSplit2[0].equals(strD4) ? c0011.m204() : strD3.equals(strArrSplit2[0]) ? new String(Base64.decode(c0011.m204(), 0)) : strD6.equals(strArrSplit2[0]) ? c0011.m189() : strArrSplit2[0].contains(strD5) ? c0011.mo117(strArrSplit2[0].replace(strD5, "")) : c0011.mo117(strArrSplit2[0]);
            if (!strD6.equals(str)) {
                strM2042 = strM2042.replaceAll(strD2, strD);
            }
            for (int i = 1; i < strArrSplit2.length; i++) {
                strM2042 = strM2042.replace(strArrSplit2[i], "");
            }
            return strM2042;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private String m79(String str, String str2, String str3) {
        HashMap<String, String> mapM89 = str3.equals("show") ? m89(str) : m90(str);
        for (int i = 0; i < 3; i++) {
            boolean zContains = str2.contains("/huadong_");
            String strD = "\r|\n";
            String strD2 = "验证</title>";
            String strD3 = "/renji_";
            if (zContains || str2.contains(strD3)) {
                String strM85 = m85(C0287.m1054(str, getTextByRule(C0243.m884(str2), "body&&script&&src")), this.f84, mapM89);
                String strD4 = "key=\"";
                String strD5 = "\"";
                String str4 = C0287.m1069(strM85, strD4, strD5).get(0);
                String str5 = C0287.m1069(strM85, "value=\"", strD5).get(0);
                String str6 = C0287.m1069(strM85, "FilterValue.get(\"/a20be899", strD5).get(0);
                StringBuilder sb = new StringBuilder();
                sb.append("/a20be899");
                sb.append(str6);
                sb.append(str4);
                sb.append("&value=");
                sb.append(C0284.m1040(string2Hex(str5, str2.contains(strD3) ? "djs" : "hd"), C0284.f712));
                String strM1054 = C0287.m1054(str, sb.toString());
                HashMap map = new HashMap();
                C0295.m1090(strM1054, mapM89, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f83 = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                str2 = m85(str, this.f84, mapM89);
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

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private String m80(String str, String str2, String str3) {
        StringBuilder sb;
        String strD;
        HashMap<String, String> mapM89 = str3.equals("show") ? m89(str) : m90(str);
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
                String strM1090 = C0295.m1090(string, mapM89, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f83 = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                if (!strM1090.contains(strD3)) {
                    return strM1090.replaceAll(strD2, "");
                }
                str2 = m85(str, this.f84, mapM89);
            }
            if (!str2.contains(strD3)) {
                return str2.replaceAll(strD2, "");
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dc A[LOOP:0: B:103:0x003a->B:100:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f A[Catch: Exception -> 0x02a7, TRY_LEAVE, TryCatch #4 {Exception -> 0x02a7, blocks: (B:36:0x012c, B:38:0x0170, B:39:0x019f, B:31:0x010e, B:33:0x011f, B:35:0x0128, B:34:0x0124), top: B:109:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023c A[Catch: Exception -> 0x02a5, TRY_ENTER, TryCatch #5 {Exception -> 0x02a5, blocks: (B:48:0x0202, B:50:0x0208, B:53:0x0216, B:54:0x021d, B:63:0x023c, B:65:0x0257, B:67:0x025c, B:68:0x0263, B:44:0x01c4, B:47:0x01d5), top: B:111:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ba  */
    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m81(java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:(6:459|290|(3:483|292|293)(9:296|485|297|298|299|300|475|301|302)|303|(3:503|305|(1:307))|311)|(2:529|312)|(5:481|314|(1:316)(6:317|(1:319)(5:320|321|505|322|323)|513|324|(4:326|(5:328|329|491|330|(1:332))(1:333)|334|335)(0)|447)|(4:337|499|338|339)(1:342)|354)(1:358)|457|359|(20:507|361|(2:363|364)(6:366|509|367|368|511|369)|365|371|479|385|(1:387)(6:388|389|515|390|391|392)|393|(2:501|395)|396|397|527|398|(1:400)|401|519|402|(8:404|405|463|406|407|465|408|540)(2:414|538)|447)(1:383)|384|479|385|(0)(0)|393|(0)|396|397|527|398|(0)|401|519|402|(0)(0)|447|288) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:459|290|(3:483|292|293)(9:296|485|297|298|299|300|475|301|302)|303|(3:503|305|(1:307))|311|(2:529|312)|(5:481|314|(1:316)(6:317|(1:319)(5:320|321|505|322|323)|513|324|(4:326|(5:328|329|491|330|(1:332))(1:333)|334|335)(0)|447)|(4:337|499|338|339)(1:342)|354)(1:358)|457|359|(20:507|361|(2:363|364)(6:366|509|367|368|511|369)|365|371|479|385|(1:387)(6:388|389|515|390|391|392)|393|(2:501|395)|396|397|527|398|(1:400)|401|519|402|(8:404|405|463|406|407|465|408|540)(2:414|538)|447)(1:383)|384|479|385|(0)(0)|393|(0)|396|397|527|398|(0)|401|519|402|(0)(0)|447|288) */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a7f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a81, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0a84, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a9c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a9d, code lost:
    
        r25 = r5;
        r21 = r14;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0aab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0aac, code lost:
    
        r25 = r5;
        r24 = r6;
        r28 = r10;
        r29 = r13;
        r6 = r21;
        r15 = r23;
        r23 = r4;
        r21 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0694 A[Catch: Exception -> 0x06e9, TRY_LEAVE, TryCatch #3 {Exception -> 0x06e9, blocks: (B:237:0x068e, B:239:0x0694), top: B:461:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0728 A[Catch: Exception -> 0x0b51, TryCatch #31 {Exception -> 0x0b51, blocks: (B:3:0x003c, B:7:0x0050, B:11:0x0061, B:15:0x0072, B:19:0x0083, B:21:0x00a2, B:23:0x00be, B:27:0x00cb, B:29:0x00d2, B:31:0x00d8, B:34:0x00e3, B:36:0x00e9, B:39:0x00f4, B:41:0x0101, B:44:0x010d, B:46:0x0113, B:47:0x0126, B:49:0x012c, B:51:0x0132, B:52:0x0145, B:53:0x014b, B:56:0x019f, B:57:0x01c5, B:60:0x01d7, B:62:0x0213, B:64:0x021f, B:66:0x022b, B:103:0x0354, B:105:0x0368, B:107:0x0375, B:109:0x0385, B:111:0x0392, B:113:0x03a2, B:115:0x03af, B:117:0x03bf, B:119:0x03cc, B:121:0x03d6, B:126:0x03ea, B:129:0x03fa, B:134:0x0408, B:136:0x0412, B:141:0x0420, B:143:0x0430, B:145:0x043d, B:147:0x044d, B:149:0x045a, B:151:0x046a, B:153:0x0477, B:155:0x0487, B:157:0x0494, B:159:0x04a4, B:161:0x04b1, B:163:0x04c1, B:165:0x04ce, B:167:0x04e0, B:169:0x04ed, B:172:0x050d, B:174:0x0513, B:179:0x053f, B:181:0x055c, B:194:0x05b5, B:271:0x0744, B:268:0x0721, B:270:0x0728, B:448:0x0b41, B:183:0x0565, B:185:0x0569, B:186:0x0578, B:188:0x057c, B:189:0x0591, B:191:0x0595, B:273:0x0758, B:276:0x0776, B:277:0x077e, B:279:0x0784, B:280:0x0792, B:282:0x079c, B:283:0x07a0, B:284:0x07b0, B:286:0x07b5, B:287:0x07be, B:288:0x07ca, B:447:0x0b29, B:444:0x0b06, B:446:0x0b0d, B:168:0x04e7, B:164:0x04c8, B:160:0x04ab, B:156:0x048e, B:152:0x0471, B:148:0x0454, B:144:0x0437, B:118:0x03c6, B:114:0x03a9, B:110:0x038c, B:106:0x036f, B:67:0x0240, B:69:0x0253, B:70:0x0270, B:72:0x0286, B:77:0x02a0, B:79:0x02ac, B:74:0x0292, B:76:0x0298, B:80:0x02be, B:82:0x02cc, B:84:0x02e2, B:86:0x02ee, B:87:0x02f2, B:89:0x02fe, B:92:0x030e, B:94:0x031a, B:100:0x0337, B:102:0x0343, B:96:0x0326, B:98:0x032c, B:91:0x030a, B:22:0x00ac, B:18:0x007d, B:14:0x006c, B:10:0x005b, B:6:0x004a), top: B:517:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09c3 A[Catch: Exception -> 0x0a9c, TryCatch #12 {Exception -> 0x0a9c, blocks: (B:385:0x09b0, B:387:0x09c3, B:388:0x09cd), top: B:479:0x09b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09cd A[Catch: Exception -> 0x0a9c, TRY_LEAVE, TryCatch #12 {Exception -> 0x0a9c, blocks: (B:385:0x09b0, B:387:0x09c3, B:388:0x09cd), top: B:479:0x09b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a1e A[Catch: Exception -> 0x0a81, TRY_LEAVE, TryCatch #36 {Exception -> 0x0a81, blocks: (B:398:0x0a18, B:400:0x0a1e), top: B:527:0x0a18 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a2a A[Catch: Exception -> 0x0a7f, TRY_LEAVE, TryCatch #32 {Exception -> 0x0a7f, blocks: (B:402:0x0a24, B:404:0x0a2a), top: B:519:0x0a24 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b0d A[Catch: Exception -> 0x0b51, TryCatch #31 {Exception -> 0x0b51, blocks: (B:3:0x003c, B:7:0x0050, B:11:0x0061, B:15:0x0072, B:19:0x0083, B:21:0x00a2, B:23:0x00be, B:27:0x00cb, B:29:0x00d2, B:31:0x00d8, B:34:0x00e3, B:36:0x00e9, B:39:0x00f4, B:41:0x0101, B:44:0x010d, B:46:0x0113, B:47:0x0126, B:49:0x012c, B:51:0x0132, B:52:0x0145, B:53:0x014b, B:56:0x019f, B:57:0x01c5, B:60:0x01d7, B:62:0x0213, B:64:0x021f, B:66:0x022b, B:103:0x0354, B:105:0x0368, B:107:0x0375, B:109:0x0385, B:111:0x0392, B:113:0x03a2, B:115:0x03af, B:117:0x03bf, B:119:0x03cc, B:121:0x03d6, B:126:0x03ea, B:129:0x03fa, B:134:0x0408, B:136:0x0412, B:141:0x0420, B:143:0x0430, B:145:0x043d, B:147:0x044d, B:149:0x045a, B:151:0x046a, B:153:0x0477, B:155:0x0487, B:157:0x0494, B:159:0x04a4, B:161:0x04b1, B:163:0x04c1, B:165:0x04ce, B:167:0x04e0, B:169:0x04ed, B:172:0x050d, B:174:0x0513, B:179:0x053f, B:181:0x055c, B:194:0x05b5, B:271:0x0744, B:268:0x0721, B:270:0x0728, B:448:0x0b41, B:183:0x0565, B:185:0x0569, B:186:0x0578, B:188:0x057c, B:189:0x0591, B:191:0x0595, B:273:0x0758, B:276:0x0776, B:277:0x077e, B:279:0x0784, B:280:0x0792, B:282:0x079c, B:283:0x07a0, B:284:0x07b0, B:286:0x07b5, B:287:0x07be, B:288:0x07ca, B:447:0x0b29, B:444:0x0b06, B:446:0x0b0d, B:168:0x04e7, B:164:0x04c8, B:160:0x04ab, B:156:0x048e, B:152:0x0471, B:148:0x0454, B:144:0x0437, B:118:0x03c6, B:114:0x03a9, B:110:0x038c, B:106:0x036f, B:67:0x0240, B:69:0x0253, B:70:0x0270, B:72:0x0286, B:77:0x02a0, B:79:0x02ac, B:74:0x0292, B:76:0x0298, B:80:0x02be, B:82:0x02cc, B:84:0x02e2, B:86:0x02ee, B:87:0x02f2, B:89:0x02fe, B:92:0x030e, B:94:0x031a, B:100:0x0337, B:102:0x0343, B:96:0x0326, B:98:0x032c, B:91:0x030a, B:22:0x00ac, B:18:0x007d, B:14:0x006c, B:10:0x005b, B:6:0x004a), top: B:517:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0629 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x09fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0956 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0b29 A[SYNTHETIC] */
    /* JADX WARN: Type update failed for variable: r3v44 ??, new type: org.json.JSONArray
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29341. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
     */
    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m82(java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 2934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    private static C0455 m83(C0011 c0011, String str) {
        int i;
        int size;
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length <= 1) {
            return c0011.m199(str);
        }
        String[] strArrSplit2 = strArrSplit[1].split(":", -1);
        if (TextUtils.isEmpty(strArrSplit2[0])) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strArrSplit2[0]);
            } catch (NumberFormatException e) {
                StringUtils.printStackTrace();
                i = 0;
            }
        }
        if (TextUtils.isEmpty(strArrSplit2[1])) {
            size = 0;
        } else {
            try {
                size = Integer.parseInt(strArrSplit2[1]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                size = 0;
            }
        }
        C0455 c0455M199 = c0011.m199(strArrSplit[0]);
        if (size > c0455M199.size()) {
            size = c0455M199.size();
        }
        if (size <= 0) {
            size += c0455M199.size();
        }
        C0455 c0455 = new C0455();
        while (i < size) {
            c0455.add(c0455M199.get(i));
            i++;
        }
        return c0455;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectM69 = m69(str, str2, z, map);
        return jSONObjectM69 != null ? jSONObjectM69.toString() : "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:550|131|(4:133|(2:136|134)|599|137)(1:138)|139|(21:142|(1:148)(1:147)|149|(1:151)(3:152|153|154)|155|(3:534|157|(1:159))(2:160|(2:162|(1:164)))|165|(2:167|(1:171))|172|(1:174)(1:175)|176|(1:178)|179|(2:181|(1:185))|186|(1:188)(1:189)|190|(1:192)|193|194|140)|600|197|538|198|199|567|200|(4:(11:548|202|203|552|204|(0)|214|215|583|216|217)(1:212)|583|216|217)|574|213|214|215) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(5:593|396|(4:398|563|399|400)(6:403|589|404|405|591|406)|523|407)|(9:409|410|569|411|412|579|413|414|(9:585|416|(1:418)|429|532|430|431|448|(6:541|450|(1:452)(1:453)|540|459|(6:577|461|(1:463)(1:464)|576|470|(6:561|472|(1:474)(1:475)|560|481|(6:528|483|(1:485)(1:486)|527|492|(5:546|494|(1:496)(1:497)|545|503)(2:502|503))(3:491|492|(0)(0)))(3:480|481|(0)(0)))(3:469|470|(0)(0)))(3:458|459|(0)(0))))(1:427)|428|429|532|430|431|448|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0654, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0667, code lost:
    
        r5 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0b2c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0b2d, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0671 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #23 {Exception -> 0x00d5, blocks: (B:10:0x00a1, B:12:0x00bb, B:35:0x0145, B:43:0x015c, B:47:0x0193, B:49:0x01e1, B:51:0x01ed, B:53:0x01f9, B:79:0x02fd, B:84:0x031a, B:89:0x0337, B:94:0x0354, B:99:0x0371, B:105:0x0390, B:108:0x039e, B:125:0x03e4, B:230:0x066a, B:232:0x0671, B:238:0x0699, B:240:0x069f, B:242:0x06b0, B:247:0x06ee, B:252:0x070b, B:257:0x0722, B:259:0x072c, B:260:0x073e, B:262:0x0743, B:263:0x074c, B:264:0x0756, B:54:0x0214, B:56:0x0229, B:57:0x0256, B:58:0x0266, B:64:0x029e, B:66:0x02aa, B:69:0x02ba, B:74:0x02d6, B:76:0x02dc), top: B:573:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0699 A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #23 {Exception -> 0x00d5, blocks: (B:10:0x00a1, B:12:0x00bb, B:35:0x0145, B:43:0x015c, B:47:0x0193, B:49:0x01e1, B:51:0x01ed, B:53:0x01f9, B:79:0x02fd, B:84:0x031a, B:89:0x0337, B:94:0x0354, B:99:0x0371, B:105:0x0390, B:108:0x039e, B:125:0x03e4, B:230:0x066a, B:232:0x0671, B:238:0x0699, B:240:0x069f, B:242:0x06b0, B:247:0x06ee, B:252:0x070b, B:257:0x0722, B:259:0x072c, B:260:0x073e, B:262:0x0743, B:263:0x074c, B:264:0x0756, B:54:0x0214, B:56:0x0229, B:57:0x0256, B:58:0x0266, B:64:0x029e, B:66:0x02aa, B:69:0x02ba, B:74:0x02d6, B:76:0x02dc), top: B:573:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06c0 A[Catch: Exception -> 0x0d5d, TRY_ENTER, TryCatch #6 {Exception -> 0x0d5d, blocks: (B:16:0x00db, B:20:0x00f2, B:24:0x0103, B:28:0x0114, B:32:0x0125, B:45:0x0187, B:77:0x02e5, B:82:0x030a, B:87:0x0327, B:92:0x0344, B:97:0x0361, B:102:0x037e, B:106:0x0398, B:121:0x03d4, B:122:0x03dd, B:127:0x03ed, B:128:0x03f7, B:235:0x0692, B:245:0x06de, B:250:0x06fb, B:255:0x0718, B:254:0x0712, B:249:0x06f5, B:244:0x06c0, B:101:0x0378, B:96:0x035b, B:91:0x033e, B:86:0x0321, B:81:0x0304, B:61:0x0282, B:67:0x02ae, B:72:0x02ca, B:71:0x02c6, B:31:0x011f, B:27:0x010e, B:23:0x00fd, B:19:0x00ec), top: B:536:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06ee A[Catch: Exception -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x00d5, blocks: (B:10:0x00a1, B:12:0x00bb, B:35:0x0145, B:43:0x015c, B:47:0x0193, B:49:0x01e1, B:51:0x01ed, B:53:0x01f9, B:79:0x02fd, B:84:0x031a, B:89:0x0337, B:94:0x0354, B:99:0x0371, B:105:0x0390, B:108:0x039e, B:125:0x03e4, B:230:0x066a, B:232:0x0671, B:238:0x0699, B:240:0x069f, B:242:0x06b0, B:247:0x06ee, B:252:0x070b, B:257:0x0722, B:259:0x072c, B:260:0x073e, B:262:0x0743, B:263:0x074c, B:264:0x0756, B:54:0x0214, B:56:0x0229, B:57:0x0256, B:58:0x0266, B:64:0x029e, B:66:0x02aa, B:69:0x02ba, B:74:0x02d6, B:76:0x02dc), top: B:573:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06f5 A[Catch: Exception -> 0x0d5d, TRY_ENTER, TryCatch #6 {Exception -> 0x0d5d, blocks: (B:16:0x00db, B:20:0x00f2, B:24:0x0103, B:28:0x0114, B:32:0x0125, B:45:0x0187, B:77:0x02e5, B:82:0x030a, B:87:0x0327, B:92:0x0344, B:97:0x0361, B:102:0x037e, B:106:0x0398, B:121:0x03d4, B:122:0x03dd, B:127:0x03ed, B:128:0x03f7, B:235:0x0692, B:245:0x06de, B:250:0x06fb, B:255:0x0718, B:254:0x0712, B:249:0x06f5, B:244:0x06c0, B:101:0x0378, B:96:0x035b, B:91:0x033e, B:86:0x0321, B:81:0x0304, B:61:0x0282, B:67:0x02ae, B:72:0x02ca, B:71:0x02c6, B:31:0x011f, B:27:0x010e, B:23:0x00fd, B:19:0x00ec), top: B:536:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x070b A[Catch: Exception -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x00d5, blocks: (B:10:0x00a1, B:12:0x00bb, B:35:0x0145, B:43:0x015c, B:47:0x0193, B:49:0x01e1, B:51:0x01ed, B:53:0x01f9, B:79:0x02fd, B:84:0x031a, B:89:0x0337, B:94:0x0354, B:99:0x0371, B:105:0x0390, B:108:0x039e, B:125:0x03e4, B:230:0x066a, B:232:0x0671, B:238:0x0699, B:240:0x069f, B:242:0x06b0, B:247:0x06ee, B:252:0x070b, B:257:0x0722, B:259:0x072c, B:260:0x073e, B:262:0x0743, B:263:0x074c, B:264:0x0756, B:54:0x0214, B:56:0x0229, B:57:0x0256, B:58:0x0266, B:64:0x029e, B:66:0x02aa, B:69:0x02ba, B:74:0x02d6, B:76:0x02dc), top: B:573:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0712 A[Catch: Exception -> 0x0d5d, TRY_ENTER, TryCatch #6 {Exception -> 0x0d5d, blocks: (B:16:0x00db, B:20:0x00f2, B:24:0x0103, B:28:0x0114, B:32:0x0125, B:45:0x0187, B:77:0x02e5, B:82:0x030a, B:87:0x0327, B:92:0x0344, B:97:0x0361, B:102:0x037e, B:106:0x0398, B:121:0x03d4, B:122:0x03dd, B:127:0x03ed, B:128:0x03f7, B:235:0x0692, B:245:0x06de, B:250:0x06fb, B:255:0x0718, B:254:0x0712, B:249:0x06f5, B:244:0x06c0, B:101:0x0378, B:96:0x035b, B:91:0x033e, B:86:0x0321, B:81:0x0304, B:61:0x0282, B:67:0x02ae, B:72:0x02ca, B:71:0x02c6, B:31:0x011f, B:27:0x010e, B:23:0x00fd, B:19:0x00ec), top: B:536:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07f2 A[Catch: Exception -> 0x080d, LOOP:13: B:565:0x07ec->B:294:0x07f2, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x080d, blocks: (B:286:0x07b5, B:288:0x07bc, B:302:0x0821, B:304:0x082f, B:306:0x0835, B:307:0x0862, B:294:0x07f2), top: B:558:0x0720 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0821 A[Catch: Exception -> 0x080d, TRY_ENTER, TryCatch #16 {Exception -> 0x080d, blocks: (B:286:0x07b5, B:288:0x07bc, B:302:0x0821, B:304:0x082f, B:306:0x0835, B:307:0x0862, B:294:0x07f2), top: B:558:0x0720 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x098e A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x099b A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09b1 A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x09b8 A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09ce A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09d5 A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x09eb A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09f2 A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0a08 A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0a0f A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a25 A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a2c A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a42 A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a49 A[Catch: Exception -> 0x0d53, TRY_ENTER, TryCatch #27 {Exception -> 0x0d53, blocks: (B:348:0x097e, B:355:0x09a1, B:360:0x09be, B:365:0x09db, B:370:0x09f8, B:375:0x0a15, B:380:0x0a32, B:385:0x0a4f, B:392:0x0a67, B:394:0x0a71, B:384:0x0a49, B:379:0x0a2c, B:374:0x0a0f, B:369:0x09f2, B:364:0x09d5, B:359:0x09b8, B:354:0x099b), top: B:581:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a59 A[Catch: Exception -> 0x0995, TRY_ENTER, TRY_LEAVE, TryCatch #22 {Exception -> 0x0995, blocks: (B:310:0x0868, B:312:0x086e, B:314:0x087e, B:316:0x0885, B:317:0x088b, B:318:0x0890, B:320:0x089b, B:322:0x08ab, B:324:0x08b1, B:325:0x08e6, B:328:0x08ec, B:330:0x08f2, B:332:0x0902, B:333:0x091a, B:334:0x091f, B:335:0x0926, B:337:0x0938, B:339:0x0944, B:342:0x094b, B:344:0x0951, B:350:0x098e, B:357:0x09b1, B:362:0x09ce, B:367:0x09eb, B:372:0x0a08, B:377:0x0a25, B:382:0x0a42, B:387:0x0a59), top: B:571:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0cab  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0d6b  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0c1c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0b74 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c7e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0be4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0bac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r43) {
        /*
            Method dump skipped, instruction units count: 3464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3 A[Catch: Exception -> 0x0314, TryCatch #5 {Exception -> 0x0314, blocks: (B:114:0x030f, B:111:0x02ec, B:113:0x02f3), top: B:136:0x02ec }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r30) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0798 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0808 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x081d A[Catch: Exception -> 0x0936, TRY_ENTER, TryCatch #6 {Exception -> 0x0936, blocks: (B:205:0x05c4, B:207:0x05d4, B:208:0x05e5, B:210:0x05ec, B:211:0x05f5, B:214:0x060a, B:216:0x0610, B:219:0x0627, B:221:0x062d, B:223:0x065f, B:225:0x066b, B:227:0x0677, B:228:0x0691, B:231:0x06a0, B:233:0x06a9, B:282:0x0788, B:285:0x079a, B:287:0x07a7, B:306:0x07fe, B:309:0x080a, B:314:0x081d, B:316:0x085e, B:318:0x086a, B:319:0x086e, B:321:0x088c, B:322:0x0896, B:315:0x0831, B:303:0x07f0, B:279:0x0778, B:222:0x0638, B:212:0x05ff), top: B:360:0x05c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0831 A[Catch: Exception -> 0x0936, TryCatch #6 {Exception -> 0x0936, blocks: (B:205:0x05c4, B:207:0x05d4, B:208:0x05e5, B:210:0x05ec, B:211:0x05f5, B:214:0x060a, B:216:0x0610, B:219:0x0627, B:221:0x062d, B:223:0x065f, B:225:0x066b, B:227:0x0677, B:228:0x0691, B:231:0x06a0, B:233:0x06a9, B:282:0x0788, B:285:0x079a, B:287:0x07a7, B:306:0x07fe, B:309:0x080a, B:314:0x081d, B:316:0x085e, B:318:0x086a, B:319:0x086e, B:321:0x088c, B:322:0x0896, B:315:0x0831, B:303:0x07f0, B:279:0x0778, B:222:0x0638, B:212:0x05ff), top: B:360:0x05c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x086a A[Catch: Exception -> 0x0936, TryCatch #6 {Exception -> 0x0936, blocks: (B:205:0x05c4, B:207:0x05d4, B:208:0x05e5, B:210:0x05ec, B:211:0x05f5, B:214:0x060a, B:216:0x0610, B:219:0x0627, B:221:0x062d, B:223:0x065f, B:225:0x066b, B:227:0x0677, B:228:0x0691, B:231:0x06a0, B:233:0x06a9, B:282:0x0788, B:285:0x079a, B:287:0x07a7, B:306:0x07fe, B:309:0x080a, B:314:0x081d, B:316:0x085e, B:318:0x086a, B:319:0x086e, B:321:0x088c, B:322:0x0896, B:315:0x0831, B:303:0x07f0, B:279:0x0778, B:222:0x0638, B:212:0x05ff), top: B:360:0x05c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x088c A[Catch: Exception -> 0x0936, TryCatch #6 {Exception -> 0x0936, blocks: (B:205:0x05c4, B:207:0x05d4, B:208:0x05e5, B:210:0x05ec, B:211:0x05f5, B:214:0x060a, B:216:0x0610, B:219:0x0627, B:221:0x062d, B:223:0x065f, B:225:0x066b, B:227:0x0677, B:228:0x0691, B:231:0x06a0, B:233:0x06a9, B:282:0x0788, B:285:0x079a, B:287:0x07a7, B:306:0x07fe, B:309:0x080a, B:314:0x081d, B:316:0x085e, B:318:0x086a, B:319:0x086e, B:321:0x088c, B:322:0x0896, B:315:0x0831, B:303:0x07f0, B:279:0x0778, B:222:0x0638, B:212:0x05ff), top: B:360:0x05c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instruction units count: 2455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
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
            r4.f89 = r6
            com.github.catvod.spider.merge.xc r6 = new com.github.catvod.spider.merge.xc
            r6.<init>()
            r4.f82 = r6
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
            com.github.catvod.spider.XYQHiker.f73 = r6
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
            com.github.catvod.spider.merge.xc r6 = r4.f82
            r6.init(r5, r1)
            return
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
    }

    public boolean isVideoFormat(String str) {
        m87();
        String strD = "手动嗅探视频链接关键词";
        if (m76(strD).isEmpty()) {
            strD = "VideoFormat";
        }
        String strD2 = "手动嗅探视频链接过滤词";
        if (m76(strD2).isEmpty()) {
            strD2 = "VideoFilter";
        }
        String lowerCase = m77(strD, ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a").toLowerCase();
        String strD3 = "#";
        String[] strArrSplit = lowerCase.split(strD3);
        String[] strArrSplit2 = m77(strD2, "=http#.html").toLowerCase().split(strD3);
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
        m87();
        String strD = "是否开启手动嗅探";
        if (m76(strD).isEmpty()) {
            strD = "ManualSniffer";
        }
        return m76(strD).equals("1") || m76(strD).equals("是");
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x054e, code lost:
    
        r9 = new org.json.JSONObject(r10.substring(r10.indexOf(123), r10.lastIndexOf(125) + 1));
        r5 = r9.getString(r15);
        r10 = r9.getString(com.github.catvod.spider.merge."from");
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0577, code lost:
    
        r20 = r9.getString(com.github.catvod.spider.merge."link_next");
        r21 = r9.has(com.github.catvod.spider.merge."key");
        r22 = r9.has(com.github.catvod.spider.merge."tm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x05a5, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."id") == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05b5, code lost:
    
        r23 = java.lang.Integer.valueOf(r9.getInt(com.github.catvod.spider.merge."id"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05b8, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05c4, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."vod_pic_thumb") == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05d0, code lost:
    
        r24 = r9.getString(com.github.catvod.spider.merge."vod_pic_thumb");
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05d3, code lost:
    
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05df, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."vod_title") == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05eb, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."vod_title_name") == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05ed, code lost:
    
        r10 = r9.getString(com.github.catvod.spider.merge."vod_title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0603, code lost:
    
        r26 = r10;
        r25 = r9.getString(com.github.catvod.spider.merge."vod_title_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0608, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0609, code lost:
    
        r9 = r0;
        r10 = r10;
        r26 = r10;
        r5 = null;
        r20 = null;
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0615, code lost:
    
        r25 = null;
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0623, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."nid") == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0633, code lost:
    
        r27 = java.lang.Integer.valueOf(r9.getInt(com.github.catvod.spider.merge."nid"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0636, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0642, code lost:
    
        if (r9.has(com.github.catvod.spider.merge."encrypt") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0644, code lost:
    
        r9 = r9.getInt(com.github.catvod.spider.merge."encrypt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x064f, code lost:
    
        if (r9 != 1) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0651, code lost:
    
        r5 = java.net.URLDecoder.decode(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0657, code lost:
    
        if (r9 != 2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0659, code lost:
    
        r5 = java.net.URLDecoder.decode(new java.lang.String(android.util.Base64.decode(r5, 0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0667, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x066a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x066b, code lost:
    
        r9 = r0;
        r10 = r10;
        r5 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0673, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0674, code lost:
    
        r9 = r0;
        r10 = r10;
        r5 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x067c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x067d, code lost:
    
        r9 = r0;
        r10 = r10;
        r5 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0685, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0686, code lost:
    
        r9 = r0;
        r10 = r10;
        r5 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x068e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x068f, code lost:
    
        r9 = r0;
        r10 = r10;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x078c, code lost:
    
        r5 = new java.lang.StringBuilder();
        r21 = r10;
        r5.append(com.github.catvod.spider.merge."分析var plays部分出错：");
        r5.append(r9.toString());
        com.github.catvod.spider.Init.show(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07ab, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06e1 A[Catch: Exception -> 0x0764, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x0764, blocks: (B:278:0x06ad, B:292:0x06f1, B:294:0x06f5, B:289:0x06e1), top: B:553:0x06ad }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x078c A[Catch: Exception -> 0x01e0, TRY_LEAVE, TryCatch #11 {Exception -> 0x01e0, blocks: (B:25:0x00b9, B:26:0x00be, B:29:0x00c7, B:31:0x00e3, B:34:0x00ea, B:36:0x00f6, B:39:0x0103, B:41:0x010f, B:44:0x011c, B:46:0x0128, B:52:0x013f, B:54:0x0145, B:57:0x0152, B:59:0x015a, B:61:0x0166, B:62:0x0180, B:48:0x0134, B:49:0x0137, B:50:0x013a, B:51:0x013d, B:63:0x018b, B:65:0x0197, B:67:0x01a1, B:68:0x01aa, B:70:0x01b2, B:72:0x01bb, B:74:0x01c7, B:76:0x01d3, B:120:0x029e, B:125:0x02bb, B:130:0x02d8, B:135:0x02f5, B:140:0x0311, B:147:0x033b, B:149:0x035f, B:151:0x0367, B:157:0x03c6, B:160:0x03d8, B:162:0x03e4, B:164:0x03f0, B:169:0x0410, B:171:0x0416, B:174:0x041d, B:176:0x0423, B:178:0x0438, B:183:0x0451, B:179:0x0440, B:181:0x0446, B:182:0x044a, B:166:0x03fc, B:168:0x0408, B:152:0x036f, B:154:0x0382, B:155:0x03b7, B:156:0x03bf, B:187:0x0463, B:189:0x046f, B:324:0x0783, B:326:0x078c, B:83:0x01ed, B:111:0x025e, B:113:0x0267, B:116:0x027c, B:87:0x01fa, B:90:0x0201, B:92:0x020d, B:95:0x021a, B:97:0x0226, B:100:0x0233, B:102:0x023f, B:104:0x024b, B:105:0x024e, B:106:0x0251), top: B:542:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09a4 A[Catch: Exception -> 0x09d3, TRY_LEAVE, TryCatch #26 {Exception -> 0x09d3, blocks: (B:399:0x099d, B:401:0x09a4), top: B:568:0x099d }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09ef A[Catch: Exception -> 0x0a52, TRY_LEAVE, TryCatch #28 {Exception -> 0x0a52, blocks: (B:428:0x0a23, B:430:0x0a2d, B:432:0x0a3d, B:418:0x09e8, B:420:0x09ef), top: B:572:0x09e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a91 A[Catch: Exception -> 0x0a85, TryCatch #36 {Exception -> 0x0a85, blocks: (B:446:0x0a7e, B:452:0x0a91, B:455:0x0aea, B:457:0x0aff, B:462:0x0b38), top: B:589:0x0a7e }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0b8c A[Catch: Exception -> 0x0ce4, TRY_LEAVE, TryCatch #17 {Exception -> 0x0ce4, blocks: (B:476:0x0b85, B:478:0x0b8c, B:508:0x0cc3, B:502:0x0c94, B:504:0x0c9b, B:510:0x0cd9), top: B:552:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a1b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:402:0x09c0 -> B:582:0x09c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r33, java.lang.String r34, java.util.List<java.lang.String> r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String searchContent(String str, boolean z) {
        return m82(str, "1");
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected String m84(String str, String str2, String str3, Map<String, String> map) {
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQHiker.3
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
    protected String m85(String str, String str2, Map<String, String> map) {
        String strD = "clan://";
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQHiker.1
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
    protected String m86(String str, Map<String, String> map, String str2, Map<String, String> map2) {
        try {
            SpiderDebug.log(str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.XYQHiker.2
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
    protected void m87() {
        String str;
        String strD = "0";
        String strD2 = "DEBUG";
        if (this.f90 != null || (str = this.f89) == null) {
            return;
        }
        try {
            if (str.startsWith("http")) {
                this.f90 = new JSONObject(C0295.m1089(this.f89, null));
            } else {
                this.f90 = new JSONObject(this.f89);
            }
            this.f91 = m77("OCR_API", "https://api.nn.ci/ocr/b64/text");
            this.f92 = m77(strD2, strD).equals("是") || m77(strD2, strD).equals("1");
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected String m88(String str, String str2, boolean z) {
        try {
            this.f87.put("referer", str2);
            return str + "@Headers=" + this.f87.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected HashMap<String, String> m89(String str) throws JSONException {
        String str2;
        String string;
        String str3;
        String string2;
        String str4;
        String string3;
        String str5;
        HashMap<String, String> map = new HashMap<>();
        String strD = "请求头参数";
        if (m76(strD).isEmpty()) {
            strD = "Headers";
        }
        String strTrim = m77(strD, "").trim();
        boolean zContains = strTrim.contains("$");
        String strD2 = "苹果电脑";
        String strD3 = "MAC_UA";
        String strD4 = "苹果手机";
        String strD5 = "IOS_UA";
        String strD6 = "Cookie";
        String strD7 = "手机";
        String strD8 = "MOBILE_UA";
        String strD9 = "电脑";
        String strD10 = "PC_UA";
        String strD11 = "user-agent";
        String strD12 = ";";
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string4 = strArrSplit2[1];
                if (string4.equals(strD10) || string4.equals(strD9)) {
                    string4 = f76;
                } else if (string4.equals(strD8) || string4.equals(strD7)) {
                    string4 = f77;
                } else if (string4.equals(strD5) || string4.equals(strD4)) {
                    string4 = f78;
                } else if (string4.equals(strD3) || string4.equals(strD2)) {
                    string4 = f79;
                }
                String str7 = strD2;
                if (!(this.f83.isEmpty() && this.f85.isEmpty()) && str6.equalsIgnoreCase("cookie")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string4);
                    if (this.f83.isEmpty()) {
                        str4 = strD3;
                        string3 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strD12);
                        str4 = strD3;
                        sb2.append(this.f83);
                        string3 = sb2.toString();
                    }
                    sb.append(string3);
                    if (this.f85.isEmpty()) {
                        str5 = "";
                    } else {
                        str5 = strD12 + this.f85;
                    }
                    sb.append(str5);
                    string4 = sb.toString();
                } else {
                    str4 = strD3;
                }
                if (str6.equalsIgnoreCase(strD11)) {
                    this.f87.put(strD11, string4);
                }
                boolean zEqualsIgnoreCase = str6.equalsIgnoreCase("referer");
                String strD13 = "WebView";
                if (!zEqualsIgnoreCase && !string4.equalsIgnoreCase(strD13)) {
                    map.put(str6, string4);
                } else if (!string4.equalsIgnoreCase(strD13)) {
                    map.put(str6, string4);
                }
                i++;
                strArrSplit = strArr;
                strD2 = str7;
                strD3 = str4;
            }
            if ((!this.f83.isEmpty() || !this.f85.isEmpty()) && ((this.f83.length() > 1 || this.f85.length() > 1) && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$"))) {
                if (this.f83.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f83);
                    if (this.f85.isEmpty()) {
                        str3 = this.f85;
                    } else {
                        str3 = strD12 + this.f85;
                    }
                    sb3.append(str3);
                    string2 = sb3.toString();
                } else {
                    string2 = this.f85;
                }
                map.put(strD6, string2);
            }
        } else {
            if (strTrim.isEmpty()) {
                strTrim = "okhttp/3.12.11";
            } else if (strTrim.equals(strD10) || strTrim.equals(strD9)) {
                strTrim = f76;
            } else if (strTrim.equals(strD8) || strTrim.equals(strD7)) {
                strTrim = f77;
            } else if (strTrim.equals(strD5) || strTrim.equals(strD4)) {
                strTrim = f78;
            } else if (strTrim.equals(strD3) || strTrim.equals(strD2)) {
                strTrim = f79;
            }
            if ((!this.f83.isEmpty() || !this.f85.isEmpty()) && (this.f83.length() > 1 || this.f85.length() > 1)) {
                if (this.f83.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f83);
                    if (this.f85.isEmpty()) {
                        str2 = this.f85;
                    } else {
                        str2 = strD12 + this.f85;
                    }
                    sb4.append(str2);
                    string = sb4.toString();
                } else {
                    string = this.f85;
                }
                map.put(strD6, string);
            }
            map.put("User-Agent", strTrim);
            this.f87.put(strD11, strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected HashMap<String, String> m90(String str) throws JSONException {
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        HashMap<String, String> map = new HashMap<>();
        String strD = "搜索请求头参数";
        if (m76(strD).isEmpty()) {
            strD = "SHeaders";
        }
        String strTrim = m77(strD, "").trim();
        boolean zContains = strTrim.contains("$");
        String strD2 = "苹果电脑";
        String strD3 = "MAC_UA";
        String strD4 = "苹果手机";
        String strD5 = "IOS_UA";
        String strD6 = "Cookie";
        String strD7 = "手机";
        String strD8 = "MOBILE_UA";
        String strD9 = "电脑";
        String strD10 = "PC_UA";
        String strD11 = "user-agent";
        String strD12 = ";";
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string2 = strArrSplit2[1];
                if (string2.equals(strD10) || string2.equals(strD9)) {
                    string2 = f76;
                } else if (string2.equals(strD8) || string2.equals(strD7)) {
                    string2 = f77;
                } else if (string2.equals(strD5) || string2.equals(strD4)) {
                    string2 = f78;
                } else if (string2.equals(strD3) || string2.equals(strD2)) {
                    string2 = f79;
                }
                String str7 = strD2;
                if (!(this.f83.isEmpty() && this.f86.isEmpty()) && str6.equalsIgnoreCase("cookie")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string2);
                    if (this.f83.isEmpty()) {
                        str4 = strD3;
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strD12);
                        str4 = strD3;
                        sb2.append(this.f83);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    if (this.f86.isEmpty()) {
                        str5 = "";
                    } else {
                        str5 = strD12 + this.f86;
                    }
                    sb.append(str5);
                    string2 = sb.toString();
                } else {
                    str4 = strD3;
                }
                if (str6.equalsIgnoreCase(strD11)) {
                    this.f87.put(strD11, string2);
                }
                boolean zEqualsIgnoreCase = str6.equalsIgnoreCase("referer");
                String strD13 = "WebView";
                if (!zEqualsIgnoreCase && !string2.equalsIgnoreCase(strD13)) {
                    map.put(str6, string2);
                } else if (!string2.equalsIgnoreCase(strD13)) {
                    map.put(str6, string2);
                }
                i++;
                strArrSplit = strArr;
                strD2 = str7;
                strD3 = str4;
            }
            if ((!this.f83.isEmpty() || !this.f86.isEmpty()) && ((this.f83.length() > 1 || this.f86.length() > 1) && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$"))) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(!this.f83.isEmpty() ? this.f86 : this.f83);
                if (this.f86.isEmpty()) {
                    str3 = this.f86;
                } else {
                    str3 = strD12 + this.f86;
                }
                sb3.append(str3);
                map.put(strD6, sb3.toString());
            }
        } else {
            if (strTrim.isEmpty()) {
                return m89(str);
            }
            if (strTrim.equals(strD10) || strTrim.equals(strD9)) {
                strTrim = f76;
            } else if (strTrim.equals(strD8) || strTrim.equals(strD7)) {
                strTrim = f77;
            } else if (strTrim.equals(strD5) || strTrim.equals(strD4)) {
                strTrim = f78;
            } else if (strTrim.equals(strD3) || strTrim.equals(strD2)) {
                strTrim = f79;
            }
            if ((!this.f83.isEmpty() || !this.f86.isEmpty()) && (this.f83.length() > 1 || this.f86.length() > 1)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(!this.f83.isEmpty() ? this.f86 : this.f83);
                if (this.f86.isEmpty()) {
                    str2 = this.f86;
                } else {
                    str2 = strD12 + this.f86;
                }
                sb4.append(str2);
                map.put(strD6, sb4.toString());
            }
            map.put("User-Agent", strTrim);
            this.f87.put(strD11, strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    String m91(String str) {
        return str.replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "").replaceAll("\\s{2,}", "");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m82(str, str2);
    }
}
