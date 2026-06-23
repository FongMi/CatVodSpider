package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import java.net.InetAddress;
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
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class XYQBiu extends Spider {
    public static final String[] a = {"ajax/verify_check", "ajax.php?ac=code_check", "/verify/index.html", "?scheckAC=check"};
    public final String b = "";
    public final String c = "";
    public String d = "";
    public String e = "";
    public final JSONObject f = new JSONObject();
    public final String g = "[\\W|\\S|.]*?MacPlayerConfig.player_list[\\W|\\S|.]*?=([\\W|\\S|.]*?),MacPlayerConfig.downer_list";
    public String h = null;
    public JSONObject i = null;
    public String j = null;

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$2, reason: invalid class name */
    class AnonymousClass2 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$3, reason: invalid class name */
    class AnonymousClass3 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$4, reason: invalid class name */
    class AnonymousClass4 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

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
        String[] strArr = a;
        for (int i = 0; i < 4; i++) {
            if (str.contains(strArr[i]) && !str.contains("myui-vodbox-content")) {
                return true;
            }
        }
        return false;
    }

    public static String k(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #11 {Exception -> 0x00a6, blocks: (B:28:0x008f, B:30:0x0092, B:32:0x009a, B:47:0x00df, B:49:0x00e5, B:51:0x00ed, B:54:0x00f4, B:57:0x00fe, B:59:0x0104, B:61:0x010f, B:63:0x0117, B:64:0x0123, B:40:0x00c5), top: B:257:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject l(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    public static String m() {
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

    public static JSONObject n(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!str.equals("by") && !str4.equals("空") && !str3.contains("全部")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            } else if (str.equals("by") && !str4.equals("空") && !str3.contains("默认")) {
                jSONObject.put("n", "默认");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            }
            if (str4.contains("&") && !str4.equals("空")) {
                String[] strArrSplit = str3.split("&");
                String[] strArrSplit2 = str4.split("&");
                for (int i = 0; i < strArrSplit.length; i++) {
                    jSONObject.put("n", strArrSplit[i]);
                    jSONObject.put("v", strArrSplit2[i].replaceAll("＆＆", "&"));
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            } else if (!str4.equals("空")) {
                jSONObject.put("n", str3);
                jSONObject.put("v", str4);
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
        String[] strArr = a;
        for (int i = 0; i < 4; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0250 A[LOOP:0: B:105:0x002a->B:100:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ff, blocks: (B:44:0x010b, B:46:0x013f, B:47:0x0166, B:36:0x00e9, B:38:0x00fa, B:43:0x0108, B:42:0x0104), top: B:103:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec A[Catch: Exception -> 0x018f, TRY_ENTER, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String aa(java.util.LinkedHashMap r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.aa(java.util.LinkedHashMap, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final String ab(String str) {
        return str.replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "").replaceAll("\\s{2,}", "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:(13:446|221|222|428|223|224|417|225|226|395|227|228|(6:452|229|377|230|231|232))|(8:458|233|234|235|442|236|426|237)|(42:419|239|(3:436|241|242)(5:249|250|407|251|252)|243|(3:460|254|255)|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(7:316|317|385|318|319|381|320)(1:328)|329|469|363)(1:271)|270|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(0)(0)|329|469|363|219) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:446|221|222|428|223|224|417|225|226|395|227|228|452|229|377|230|231|232|(8:458|233|234|235|442|236|426|237)|(42:419|239|(3:436|241|242)(5:249|250|407|251|252)|243|(3:460|254|255)|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(7:316|317|385|318|319|381|320)(1:328)|329|469|363)(1:271)|270|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(0)(0)|329|469|363|219) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:446|221|222|428|223|224|417|225|226|395|227|228|452|229|377|230|231|232|458|233|234|235|442|236|426|237|(42:419|239|(3:436|241|242)(5:249|250|407|251|252)|243|(3:460|254|255)|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(7:316|317|385|318|319|381|320)(1:328)|329|469|363)(1:271)|270|260|421|272|273|409|274|275|415|276|277|278|403|279|280|401|281|432|282|283|391|284|430|285|286|287|462|288|289|413|290|291|387|314|(0)(0)|329|469|363|219) */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x064d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x064e, code lost:
    
        r4 = r19;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0654, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0656, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0658, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x065a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x065c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x065e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0660, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0661, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0664, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0665, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0668, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0669, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x066c, code lost:
    
        com.github.catvod.crawler.SpiderDebug.log(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06b1, code lost:
    
        r4 = r19;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06bf, code lost:
    
        r7 = r16;
        r4 = r19;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06c5, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06ca, code lost:
    
        r30 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x06ce, code lost:
    
        r30 = r31;
        r7 = r16;
        r4 = r19;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06d8, code lost:
    
        r30 = r31;
        r28 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0421 A[Catch: Exception -> 0x0470, TRY_LEAVE, TryCatch #0 {Exception -> 0x0470, blocks: (B:166:0x041b, B:168:0x0421), top: B:369:0x041b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0676 A[Catch: all -> 0x06b0, TRY_LEAVE, TryCatch #9 {all -> 0x06b0, blocks: (B:314:0x0670, B:316:0x0676), top: B:387:0x0670 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String ac(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.ac(java.lang.String, java.lang.String):java.lang.String");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectP = p(str, str2, z, map);
        return jSONObjectP != null ? jSONObjectP.toString() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b8 A[Catch: all -> 0x0262, TryCatch #1 {all -> 0x0262, blocks: (B:59:0x0223, B:61:0x0248, B:63:0x025c, B:72:0x0287, B:76:0x02d6, B:75:0x02b8, B:67:0x0266, B:69:0x026e, B:71:0x0282, B:79:0x02f8, B:81:0x030a, B:82:0x030d), top: B:198:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0336 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r34) {
        /*
            Method dump skipped, instruction units count: 1595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        Object jSONObject;
        try {
            s();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strW = w("class_value", "");
            String strW2 = w("class_url", "");
            String strW3 = w("fclass_name", "");
            String strW4 = w("fclass_value", "");
            String strW5 = w("fcatelog_name", "");
            String strW6 = w("fcatelog_value", "");
            String strW7 = w("farea_name", "");
            String strW8 = w("farea_value", "");
            String strW9 = w("fyear_name", m());
            String strW10 = w("fyear_value", Marker.ANY_MARKER);
            String strW11 = w("flang_name", "");
            String strW12 = w("flang_value", "");
            String strW13 = w("fsort_name", "时间&人气&评分");
            String strW14 = w("fsort_value", "time&hits&score");
            String[] strArrSplit = w("class_name", "").split("&");
            String[] strArrSplit2 = strW.split("&");
            int i = 0;
            while (i < strArrSplit.length) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type_id", strArrSplit2[i].replaceAll("＆＆", "&"));
                jSONObject3.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject3);
                i++;
                strW7 = strW7;
                strW6 = strW6;
                strW5 = strW5;
            }
            String str = strW5;
            String str2 = strW6;
            String str3 = strW7;
            jSONObject2.put("class", jSONArray);
            try {
                String strW15 = w("filterdata", "");
                InetAddress.getLocalHost();
                if (strW15.startsWith("clan://") || strW15.startsWith("http") || strW15.startsWith("./")) {
                    jSONObject = null;
                    String strTrim = yi.k(strW15, null).trim();
                    if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                        jSONObject = new JSONObject(strTrim);
                    }
                } else {
                    jSONObject = strW15.equalsIgnoreCase("EXT") ? l(strW, strW2, strW3, strW4, str, str2, str3, strW8, strW9, strW10, strW11, strW12, strW13, strW14) : this.i.optJSONObject("filterdata");
                }
                if (z && jSONObject != null) {
                    jSONObject2.put("filters", jSONObject);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeVideoContent() {
        JSONArray jSONArrayOptJSONArray;
        try {
            s();
            if (w("homeContent", "").equals("1")) {
                JSONArray jSONArray = new JSONArray();
                for (String str : w("class_value", "").split("&")) {
                    JSONObject jSONObjectP = p(str.replaceAll("＆＆", "&"), "1", false, new HashMap());
                    if (jSONObjectP != null && (jSONArrayOptJSONArray = jSONObjectP.optJSONArray("list")) != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length() && i < 5; i++) {
                            jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i));
                        }
                    }
                    if (jSONArray.length() >= 20) {
                        break;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.h = str;
    }

    public boolean isVideoFormat(String str) {
        s();
        String[] strArrSplit = w("VideoFormat", ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a").toLowerCase().split("#");
        String[] strArrSplit2 = w("VideoFilter", "=http#.html").toLowerCase().split("#");
        String lowerCase = str.toLowerCase();
        if ((lowerCase.contains("=http") || lowerCase.contains(".html")) && !checkstring(lowerCase)) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (lowerCase.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.contains(str3) && !checkstring(lowerCase)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        s();
        return w("ManualSniffer", "").equals("1");
    }

    public final String o(String str, String str2, String str3, HashMap map) {
        try {
            SpiderDebug.log(str);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            yi.j(yi.f(), str, str2, map, anonymousClass4);
            return new String(((Response) anonymousClass4.getResult()).body().bytes(), str3).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject p(java.lang.String r31, java.lang.String r32, boolean r33, java.util.HashMap r34) {
        /*
            Method dump skipped, instruction units count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.p(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:169|516|170|171|474|172|529|173|174|(2:175|(7:545|177|(1:554)(1:236)|189|190|284|276)(2:553|237))|543|238|(2:240|(2:242|(4:244|(3:246|249|(1:251))|(3:256|536|(7:258|519|259|260|521|261|262)(4:271|496|272|273))(1:255)|276)(3:249|(0)|(5:254|256|536|(0)(0)|276)(0)))(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03d5, code lost:
    
        r5 = new org.json.JSONObject(r5.substring(r5.indexOf(123), r5.lastIndexOf(125) + 1));
        r1 = r5.getString("url");
        r15 = r5.getString("from");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03f8, code lost:
    
        r15 = r5.getString("link_next");
        r23 = r5.has("key");
        r15 = r5.has("tm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x040e, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0416, code lost:
    
        if (r5.has("id") == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0420, code lost:
    
        r19 = java.lang.Integer.valueOf(r5.getInt("id"));
        r4 = "nid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0427, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0428, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r4 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x043a, code lost:
    
        r4 = "nid";
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0442, code lost:
    
        if (r5.has(r4) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x044c, code lost:
    
        r18 = java.lang.Integer.valueOf(r5.getInt(r4));
        r4 = "vod_pic_thumb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0453, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0454, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r4 = null;
        r15 = null;
        r18 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0461, code lost:
    
        r4 = "vod_pic_thumb";
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0469, code lost:
    
        if (r5.has(r4) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x046f, code lost:
    
        r20 = r5.getString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0472, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0473, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r4 = null;
        r15 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x047e, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0486, code lost:
    
        if (r5.has("vod_title") == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x048e, code lost:
    
        if (r5.has("vod_title_name") == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0490, code lost:
    
        r4 = r5.getString("vod_title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x049e, code lost:
    
        r31 = r4;
        r30 = r5.getString("vod_title_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04a3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04a4, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r15 = null;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04ad, code lost:
    
        r30 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04b2, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r4 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04bb, code lost:
    
        r30 = null;
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04c5, code lost:
    
        if (r5.has("encrypt") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04c7, code lost:
    
        r4 = r5.getInt("encrypt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04ce, code lost:
    
        if (r4 != 1) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d0, code lost:
    
        r1 = java.net.URLDecoder.decode(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04d6, code lost:
    
        r8 = "header";
        r5 = r15;
        r1 = null;
        r15 = null;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04e2, code lost:
    
        if (r4 != 2) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04e4, code lost:
    
        r1 = java.net.URLDecoder.decode(new java.lang.String(android.util.Base64.decode(r1, 0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04f2, code lost:
    
        r5 = r15;
        r4 = r31;
        r21 = r15;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04fd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04fe, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0544, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0545, code lost:
    
        r8 = "header";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0549 A[Catch: Exception -> 0x0544, PHI: r8
      0x0549: PHI (r8v25 ??) = (r8v50 ??), (r8v51 ??), (r8v52 ??), (r8v53 ??) binds: [B:239:0x052f, B:241:0x0535, B:243:0x053b, B:246:0x0543] A[DONT_GENERATE, DONT_INLINE], TryCatch #43 {Exception -> 0x0544, blocks: (B:238:0x052b, B:240:0x0531, B:242:0x0537, B:244:0x053d, B:256:0x055b, B:249:0x0549, B:251:0x054f), top: B:543:0x052b }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054f A[Catch: Exception -> 0x0544, TryCatch #43 {Exception -> 0x0544, blocks: (B:238:0x052b, B:240:0x0531, B:242:0x0537, B:244:0x053d, B:256:0x055b, B:249:0x0549, B:251:0x054f), top: B:543:0x052b }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x055b A[Catch: Exception -> 0x0544, TRY_LEAVE, TryCatch #43 {Exception -> 0x0544, blocks: (B:238:0x052b, B:240:0x0531, B:242:0x0537, B:244:0x053d, B:256:0x055b, B:249:0x0549, B:251:0x054f), top: B:543:0x052b }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07df A[Catch: Exception -> 0x07c7, TryCatch #38 {Exception -> 0x07c7, blocks: (B:393:0x07df, B:395:0x07e5, B:401:0x0809, B:404:0x0818, B:406:0x081e, B:410:0x0830, B:388:0x07c3, B:398:0x07f4), top: B:535:0x07c3, inners: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0850 A[Catch: Exception -> 0x0845, TryCatch #41 {Exception -> 0x0845, blocks: (B:413:0x083e, B:430:0x08f1, B:420:0x0850, B:423:0x0899, B:425:0x08ae, B:426:0x08d7, B:429:0x08df), top: B:539:0x083e }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0786 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v28 */
    /* JADX WARN: Type inference failed for: r24v29 */
    /* JADX WARN: Type inference failed for: r24v30 */
    /* JADX WARN: Type inference failed for: r24v31 */
    /* JADX WARN: Type inference failed for: r24v32 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v36 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r26v5, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.github.catvod.spider.XYQBiu] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.github.catvod.spider.XYQBiu] */
    /* JADX WARN: Type inference failed for: r2v35, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v37 */
    /* JADX WARN: Type inference failed for: r32v38 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v43 */
    /* JADX WARN: Type inference failed for: r32v44 */
    /* JADX WARN: Type inference failed for: r32v45 */
    /* JADX WARN: Type inference failed for: r32v46 */
    /* JADX WARN: Type inference failed for: r32v47 */
    /* JADX WARN: Type inference failed for: r32v48 */
    /* JADX WARN: Type inference failed for: r32v49 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v133 */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v135 */
    /* JADX WARN: Type inference failed for: r4v136 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v139 */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v141 */
    /* JADX WARN: Type inference failed for: r4v142 */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v144 */
    /* JADX WARN: Type inference failed for: r4v145 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r35, java.lang.String r36, java.util.List<java.lang.String> r37) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public final String q(String str, String str2, HashMap map) {
        try {
            SpiderDebug.log(str);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            if (str.startsWith("clan://")) {
                return yi.k(str.replace("clan://", Proxy.localProxyUrl().replace("/proxy", "/file/")), null);
            }
            yi.g(yi.f(), str, map, anonymousClass2);
            return new String(((Response) anonymousClass2.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String r(String str, HashMap map, String str2, HashMap map2) {
        try {
            SpiderDebug.log(str);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            yi.i(yi.f(), str, map, map2, anonymousClass3);
            return new String(((Response) anonymousClass3.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void s() {
        String str;
        if (this.i != null || (str = this.h) == null) {
            return;
        }
        try {
            if (str.startsWith("http")) {
                this.i = new JSONObject(yi.k(this.h, null));
            } else {
                this.i = new JSONObject(this.h);
            }
            this.j = w("OCR_API", "https://api.nn.ci/ocr/b64/text");
        } catch (JSONException unused) {
        }
    }

    public String searchContent(String str, boolean z) {
        return ac(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return ac(str, str2);
    }

    public final String t(String str, String str2) {
        JSONObject jSONObject = this.f;
        try {
            jSONObject.put("referer", str2);
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    public final HashMap u(String str) throws JSONException {
        HashMap map;
        String str2;
        String str3;
        HashMap map2;
        String string;
        String str4;
        HashMap map3 = new HashMap();
        String strTrim = w("UserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f;
        String str5 = "苹果电脑";
        String str6 = "MAC_UA";
        String string2 = this.b;
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            HashMap map4 = map3;
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str7 = strArrSplit2[0];
                String string3 = strArrSplit2[1];
                if (string3.equals("PC_UA") || string3.equals("电脑")) {
                    str2 = str5;
                    string3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string3.equals("MOBILE_UA") || string3.equals("手机")) {
                    str2 = str5;
                    string3 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string3.equals("IOS_UA") || string3.equals("苹果手机")) {
                    str2 = str5;
                    string3 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string3.equals(str6) || string3.equals(str5)) {
                    str2 = str5;
                    string3 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                } else {
                    str2 = str5;
                }
                if (this.d.isEmpty() || !str7.equalsIgnoreCase("cookie")) {
                    str3 = str6;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string3);
                    if (this.d.isEmpty()) {
                        str3 = str6;
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(";");
                        str3 = str6;
                        sb2.append(this.d);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    if (string2.isEmpty()) {
                        str4 = "";
                    } else {
                        str4 = ";" + string2;
                    }
                    sb.append(str4);
                    string3 = sb.toString();
                }
                if (str7.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string3);
                }
                if (str7.equalsIgnoreCase("referer") || string3.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string3.equalsIgnoreCase("WebView")) {
                        map2.put(str7, string3);
                    }
                } else {
                    map2 = map4;
                    map2.put(str7, string3);
                }
                i++;
                map4 = map2;
                strArrSplit = strArr;
                str5 = str2;
                str6 = str3;
            }
            map = map4;
            if (!this.d.isEmpty() && this.d.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                if (this.d.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.d);
                    if (!string2.isEmpty()) {
                        string2 = ";" + string2;
                    }
                    sb3.append(string2);
                    string2 = sb3.toString();
                }
                map.put("Cookie", string2);
            }
        } else {
            map = map3;
            if (strTrim.isEmpty()) {
                strTrim = "okhttp/3.12.11";
            } else if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if (!this.d.isEmpty() && this.d.length() > 1) {
                if (this.d.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.d);
                    if (!string2.isEmpty()) {
                        string2 = ";" + string2;
                    }
                    sb4.append(string2);
                    string2 = sb4.toString();
                }
                map.put("Cookie", string2);
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    public final String v(String str) {
        return w(str, "");
    }

    public final String w(String str, String str2) {
        String strOptString = this.i.optString(str);
        return (strOptString.isEmpty() || strOptString.equals("空") || strOptString.equals("&&")) ? str2 : strOptString;
    }

    public final HashMap x(String str) throws JSONException {
        HashMap map;
        String str2;
        String str3;
        HashMap map2;
        String string;
        HashMap map3 = new HashMap();
        String strTrim = w("SUserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f;
        String strConcat = this.c;
        String str4 = "苹果电脑";
        String str5 = "MAC_UA";
        HashMap map4 = map3;
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string2 = strArrSplit2[1];
                if (string2.equals("PC_UA") || string2.equals("电脑")) {
                    str2 = str4;
                    string2 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string2.equals("MOBILE_UA") || string2.equals("手机")) {
                    str2 = str4;
                    string2 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string2.equals("IOS_UA") || string2.equals("苹果手机")) {
                    str2 = str4;
                    string2 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string2.equals(str5) || string2.equals(str4)) {
                    str2 = str4;
                    string2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                } else {
                    str2 = str4;
                }
                if (this.d.isEmpty() || !str6.equalsIgnoreCase("cookie")) {
                    str3 = str5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string2);
                    if (this.d.isEmpty()) {
                        str3 = str5;
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(";");
                        str3 = str5;
                        sb2.append(this.d);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append(!strConcat.isEmpty() ? ";".concat(strConcat) : "");
                    string2 = sb.toString();
                }
                if (str6.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string2);
                }
                if (str6.equalsIgnoreCase("referer") || string2.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string2.equalsIgnoreCase("WebView")) {
                        map2.put(str6, string2);
                    }
                } else {
                    map2 = map4;
                    map2.put(str6, string2);
                }
                i++;
                strArrSplit = strArr;
                map4 = map2;
                str4 = str2;
                str5 = str3;
            }
            map = map4;
            if (!this.d.isEmpty() && this.d.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(!this.d.isEmpty() ? strConcat : this.d);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb3.append(strConcat);
                map.put("Cookie", sb3.toString());
            }
        } else {
            map = map4;
            if (strTrim.isEmpty()) {
                return u(str);
            }
            if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if (!this.d.isEmpty() && this.d.length() > 1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(!this.d.isEmpty() ? strConcat : this.d);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb4.append(strConcat);
                map.put("Cookie", sb4.toString());
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    public final String y(String str, String str2, String str3) {
        HashMap mapU = str3.equals("show") ? u(str) : x(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("/huadong_") || str2.contains("/renji_")) {
                String strQ = q(wh.g(str, oj.a(str2).ah("body").e("script").a("src")), this.e, mapU);
                String str4 = (String) wh.q(strQ, "key=\"", "\"").get(0);
                String str5 = (String) wh.q(strQ, "value=\"", "\"").get(0);
                String str6 = (String) wh.q(strQ, "c.get(\"/a20be899", "\"").get(0);
                StringBuilder sb = new StringBuilder("/a20be899");
                sb.append(str6);
                sb.append(str4);
                sb.append("&value=");
                sb.append(ku.d(string2Hex(str5, str2.contains("/renji_") ? "djs" : "hd"), ku.c));
                String strG = wh.g(str, sb.toString());
                HashMap map = new HashMap();
                yi.l(strG, mapU, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.d = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                str2 = q(str, this.e, mapU);
                if (!str2.contains("验证</title>")) {
                    return str2.replaceAll("\r|\n", "");
                }
            }
            if (!str2.contains("验证</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }

    public final String z(String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        HashMap mapU = str3.equals("show") ? u(str) : x(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("检测中") && str2.contains("btwaf")) {
                String str5 = (String) wh.q(str2, "btwaf=", "\"").get(0);
                if (str.contains("?")) {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "&btwaf=";
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "?btwaf=";
                }
                sb.append(str4);
                sb.append(str5);
                String string = sb.toString();
                HashMap map = new HashMap();
                String strL = yi.l(string, mapU, map);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.d = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                if (!strL.contains("<title>检测中</title>")) {
                    return strL.replaceAll("\r|\n", "");
                }
                str2 = q(str, this.e, mapU);
            }
            if (!str2.contains("<title>检测中</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }
}
