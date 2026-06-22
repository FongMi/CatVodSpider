package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.U.a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0214g;
import com.github.catvod.spider.merge.q.AbstractC0222a;
import com.github.catvod.spider.merge.q.AbstractC0223b;
import com.github.catvod.spider.merge.q.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class XBPQ extends Spider {
    private static String x;
    private static HashMap<String, String> y;
    private String b;
    private String c;
    private int e;
    private String f;
    private String l;
    private String m;
    private Push w;
    private boolean a = false;
    private boolean d = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private List<String> j = null;
    private boolean k = false;
    private int n = 0;
    protected JSONObject o = null;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private String s = "";
    private boolean t = false;
    private String u = "";
    private boolean v = false;

    private String A(String str) {
        String strD = oZP.d("91D5E2A4E3E2");
        return str.contains(strD) ? str.replace(strD, oZP.d("56")) : str;
    }

    private String B(String str, String str2) {
        if (!str2.contains(oZP.d("93CCF7A7D9DE91D7DA")) || !str2.contains(oZP.d("9DD8C4A9D1F991D7DA")) || !str2.contains(oZP.d("171B00200A"))) {
            return str2;
        }
        String str3 = G(str2, oZP.d("171B00200A68534955"), "").get(0);
        StringBuilder sbC = C0133t.c(str);
        String strD = oZP.d("4A");
        if (str.contains(strD)) {
            strD = oZP.d("53");
        }
        sbC.append(strD);
        sbC.append(oZP.d("171B00200A68"));
        sbC.append(str3);
        String strF = f(sbC.toString());
        this.t = true;
        return strF;
    }

    private String C(String str) {
        String strD = oZP.d("90D8D1A7E7F990E0C0");
        if (str.contains(strD)) {
            str = str.replace(strD, oZP.d("2E"));
        }
        String strD2 = oZP.d("90E0C4A7E7F990E0C0");
        return str.contains(strD2) ? str.replace(strD2, oZP.d("28")) : str;
    }

    private String D(String str, String str2) {
        if (str2.equals(oZP.d("5F")) || str2.isEmpty()) {
            str2 = str;
        }
        String strD = oZP.d("2949");
        String[] strArrSplit = str.split(strD);
        String[] strArrSplit2 = str2.split(strD);
        int i = 0;
        String strA = "";
        while (i < strArrSplit.length) {
            String strD2 = i < strArrSplit.length + (-1) ? oZP.d("56") : "";
            StringBuilder sbC = C0133t.c(strA);
            sbC.append(strArrSplit[i]);
            sbC.append(oZP.d("51"));
            strA = C0133t.a(sbC, strArrSplit2[i], strD2);
            i++;
        }
        return strA;
    }

    private static String F(String str) {
        Matcher matcher = Pattern.compile(oZP.d("5D332B3444090214433C457C")).matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str.replaceAll(oZP.d("2933"), "");
    }

    private ArrayList<String> G(String str, String str2, String str3) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.contains(oZP.d("370E04245A61"))) {
            String strReplaceAll = str2.replaceAll(oZP.d("5B4535201F30435B2B69447B5F505E1D457B5F"), oZP.d("515E"));
            if (strReplaceAll.isEmpty()) {
                arrayList.add(new String(Base64.decode(str, 0)));
                return arrayList;
            }
            arrayList.add(new String(Base64.decode(H(str, strReplaceAll, str3).get(0).trim(), 0)));
            return arrayList;
        }
        if (!str2.contains(oZP.d("5E"))) {
            return H(str, str2, str3);
        }
        String[] strArrSplit = str2.split(oZP.d("2944"));
        String strA = "";
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].isEmpty()) {
                String strTrim = H(str, strArrSplit[i], "").get(0).trim();
                if (!strTrim.isEmpty()) {
                    strA = y.a(strA, strTrim);
                }
            }
        }
        arrayList.add(strA);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026d A[EDGE_INSN: B:98:0x026d->B:99:0x026e BREAK  A[LOOP:1: B:92:0x0254->B:96:0x0267]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> H(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.H(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String I(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.I(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private String J(String str) {
        String strD = oZP.d("93F7E8A4E3E2");
        return str.contains(strD) ? str.replace(strD, oZP.d("5F")) : str;
    }

    private JSONObject a(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObjectQ = q(str, str2, z, map);
            if (jSONObjectQ.getJSONArray(oZP.d("19060435")).length() >= 1 || oZP.d("93FFEBA6D8F7").equals(this.r) || this.u.length() >= 1) {
                return jSONObjectQ;
            }
            this.u = oZP.d("490E5167507A1451");
            return q(str, str2, z, map);
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: Exception -> 0x016c, TRY_ENTER, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[Catch: Exception -> 0x016c, TRY_ENTER, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113 A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148 A[Catch: Exception -> 0x016c, TRY_ENTER, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150 A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x000c, B:6:0x002b, B:7:0x002f, B:11:0x004e, B:14:0x0060, B:15:0x0064, B:19:0x0083, B:22:0x0095, B:23:0x0099, B:27:0x00b8, B:29:0x00be, B:31:0x00ca, B:37:0x00ea, B:38:0x00f5, B:40:0x010a, B:39:0x00fb, B:41:0x010d, B:43:0x0113, B:44:0x0136, B:47:0x0148, B:48:0x014c, B:49:0x0150, B:51:0x0156, B:24:0x009d, B:26:0x00a3, B:16:0x0068, B:18:0x006e, B:8:0x0033, B:10:0x0039), top: B:57:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray c(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONArray");
    }

    private String d(String str) {
        AbstractC0222a abstractC0222a = new AbstractC0222a() { // from class: com.github.catvod.spider.XBPQ.1
            @Override // com.github.catvod.spider.merge.q.AbstractC0224c
            protected final void a(Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.q.AbstractC0224c
            protected final /* bridge */ /* synthetic */ void b(Response response) {
            }
        };
        if (str.contains(oZP.d("4E1F183218"))) {
            String strTrim = str.split(oZP.d("4E1F1832186E"))[1].trim();
            String str2 = str.split(oZP.d("4E"))[0];
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : strTrim.split(oZP.d("2949"))) {
                int iIndexOf = str3.indexOf(oZP.d("48"));
                linkedHashMap.put(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
            }
            if (strTrim.isEmpty()) {
                f.d(f.b(), str2, null, k(), abstractC0222a);
            } else {
                f.d(f.b(), str2, linkedHashMap, k(), abstractC0222a);
            }
        } else {
            f.c(f.b(), str, k(), abstractC0222a);
        }
        try {
            return new String(abstractC0222a.getResult().body().bytes(), x);
        } catch (IOException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0547 A[Catch: Exception -> 0x0597, PHI: r4
      0x0547: PHI (r4v62 java.lang.String) = (r4v46 java.lang.String), (r4v19 java.lang.String) binds: [B:159:0x0544, B:127:0x0453] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0597, blocks: (B:75:0x02f4, B:77:0x0303, B:78:0x031b, B:80:0x0323, B:82:0x0329, B:84:0x032f, B:86:0x0337, B:168:0x0572, B:90:0x0342, B:92:0x0350, B:94:0x035c, B:96:0x0368, B:99:0x0375, B:101:0x03ab, B:103:0x03b7, B:105:0x03c3, B:107:0x03e2, B:109:0x03ea, B:110:0x03f0, B:112:0x03f7, B:114:0x03ff, B:116:0x040b, B:118:0x0417, B:121:0x0425, B:123:0x0431, B:126:0x0449, B:161:0x0547, B:164:0x054c, B:128:0x0455, B:130:0x0461, B:131:0x047d, B:133:0x0489, B:134:0x0494, B:136:0x04a0, B:137:0x04ab, B:139:0x04b7, B:140:0x04c2, B:142:0x04ce, B:143:0x04d9, B:145:0x04e5, B:146:0x04f0, B:148:0x04fc, B:149:0x0507, B:151:0x050d, B:152:0x0517, B:154:0x0532, B:156:0x053a, B:158:0x0540, B:169:0x0581, B:172:0x058b), top: B:191:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x058b A[Catch: Exception -> 0x0597, TRY_LEAVE, TryCatch #3 {Exception -> 0x0597, blocks: (B:75:0x02f4, B:77:0x0303, B:78:0x031b, B:80:0x0323, B:82:0x0329, B:84:0x032f, B:86:0x0337, B:168:0x0572, B:90:0x0342, B:92:0x0350, B:94:0x035c, B:96:0x0368, B:99:0x0375, B:101:0x03ab, B:103:0x03b7, B:105:0x03c3, B:107:0x03e2, B:109:0x03ea, B:110:0x03f0, B:112:0x03f7, B:114:0x03ff, B:116:0x040b, B:118:0x0417, B:121:0x0425, B:123:0x0431, B:126:0x0449, B:161:0x0547, B:164:0x054c, B:128:0x0455, B:130:0x0461, B:131:0x047d, B:133:0x0489, B:134:0x0494, B:136:0x04a0, B:137:0x04ab, B:139:0x04b7, B:140:0x04c2, B:142:0x04ce, B:143:0x04d9, B:145:0x04e5, B:146:0x04f0, B:148:0x04fc, B:149:0x0507, B:151:0x050d, B:152:0x0517, B:154:0x0532, B:156:0x053a, B:158:0x0540, B:169:0x0581, B:172:0x058b), top: B:191:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0581 A[EDGE_INSN: B:194:0x0581->B:169:0x0581 BREAK  A[LOOP:1: B:71:0x02cb->B:168:0x0572], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa A[Catch: Exception -> 0x0599, TryCatch #2 {Exception -> 0x0599, blocks: (B:10:0x009a, B:12:0x00a4, B:14:0x00b4, B:16:0x00c5, B:20:0x00cd, B:21:0x00d7, B:23:0x00dd, B:36:0x019b, B:26:0x00eb, B:28:0x015e, B:30:0x0164, B:32:0x016a, B:34:0x016e, B:35:0x0183, B:37:0x019f, B:38:0x01aa, B:40:0x01b4, B:42:0x01bc, B:43:0x01c1, B:45:0x01c7, B:46:0x01f2, B:48:0x0200, B:50:0x020c, B:52:0x0216, B:53:0x021a, B:55:0x022c, B:66:0x0287, B:70:0x02c5, B:71:0x02cb, B:73:0x02d4, B:69:0x028f, B:56:0x0233, B:58:0x0239, B:60:0x023f, B:62:0x024c, B:64:0x027f, B:63:0x0276), top: B:190:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028f A[Catch: Exception -> 0x0599, TryCatch #2 {Exception -> 0x0599, blocks: (B:10:0x009a, B:12:0x00a4, B:14:0x00b4, B:16:0x00c5, B:20:0x00cd, B:21:0x00d7, B:23:0x00dd, B:36:0x019b, B:26:0x00eb, B:28:0x015e, B:30:0x0164, B:32:0x016a, B:34:0x016e, B:35:0x0183, B:37:0x019f, B:38:0x01aa, B:40:0x01b4, B:42:0x01bc, B:43:0x01c1, B:45:0x01c7, B:46:0x01f2, B:48:0x0200, B:50:0x020c, B:52:0x0216, B:53:0x021a, B:55:0x022c, B:66:0x0287, B:70:0x02c5, B:71:0x02cb, B:73:0x02d4, B:69:0x028f, B:56:0x0233, B:58:0x0239, B:60:0x023f, B:62:0x024c, B:64:0x027f, B:63:0x0276), top: B:190:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d4 A[Catch: Exception -> 0x0599, TRY_LEAVE, TryCatch #2 {Exception -> 0x0599, blocks: (B:10:0x009a, B:12:0x00a4, B:14:0x00b4, B:16:0x00c5, B:20:0x00cd, B:21:0x00d7, B:23:0x00dd, B:36:0x019b, B:26:0x00eb, B:28:0x015e, B:30:0x0164, B:32:0x016a, B:34:0x016e, B:35:0x0183, B:37:0x019f, B:38:0x01aa, B:40:0x01b4, B:42:0x01bc, B:43:0x01c1, B:45:0x01c7, B:46:0x01f2, B:48:0x0200, B:50:0x020c, B:52:0x0216, B:53:0x021a, B:55:0x022c, B:66:0x0287, B:70:0x02c5, B:71:0x02cb, B:73:0x02d4, B:69:0x028f, B:56:0x0233, B:58:0x0239, B:60:0x023f, B:62:0x024c, B:64:0x027f, B:63:0x0276), top: B:190:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String i() {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.i():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7 A[Catch: Exception -> 0x035d, TryCatch #0 {Exception -> 0x035d, blocks: (B:3:0x000e, B:7:0x0035, B:10:0x0062, B:27:0x00e2, B:11:0x006d, B:13:0x007b, B:14:0x0085, B:16:0x0092, B:17:0x009b, B:19:0x00a8, B:20:0x00b0, B:22:0x00bd, B:24:0x00c7, B:26:0x00da, B:28:0x00ea, B:31:0x014e, B:35:0x015a, B:37:0x0166, B:38:0x016a, B:40:0x0170, B:42:0x0184, B:43:0x01a5, B:47:0x01b8, B:49:0x01d4, B:53:0x01e0, B:55:0x01ec, B:56:0x01f0, B:58:0x01f6, B:60:0x0202, B:61:0x0219, B:64:0x0221, B:66:0x023d, B:68:0x0243, B:69:0x0268, B:71:0x0285, B:73:0x028b, B:74:0x0291, B:75:0x02a1, B:77:0x02a7, B:79:0x02c6, B:101:0x0332, B:82:0x02d8, B:84:0x02e6, B:91:0x0308, B:93:0x0314, B:95:0x0320, B:86:0x02ec, B:88:0x02f8, B:51:0x01da, B:33:0x0154), top: B:107:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject j() {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.j():org.json.JSONObject");
    }

    private String l(int i, String str, String str2) {
        StringBuilder sb;
        String str3;
        String string;
        StringBuilder sb2;
        String str4;
        String strD = oZP.d("56");
        String strReplaceAll = C0133t.a(C0133t.c(strD), this.c, strD).replaceAll(oZP.d("5B455469427F4A462B65") + str + oZP.d("56415D"), oZP.d("515E"));
        CharSequence charSequenceD = oZP.d("0913");
        boolean zContains = str2.contains(charSequenceD);
        String strD2 = oZP.d("5842");
        if (!zContains && !str2.contains(strD2)) {
            return str2;
        }
        boolean zContains2 = str2.contains(strD2);
        String strD3 = oZP.d("29132B3D");
        if (!zContains2) {
            return str + strD2 + str2.split(strD3)[i];
        }
        boolean zContains3 = str2.contains(charSequenceD);
        Object objD = oZP.d("45");
        if (zContains3) {
            for (String str5 : str2.split(strD3)) {
                if (strReplaceAll.equals(str5.split(strD2)[0])) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(strD2);
                    str3 = str5.split(strD2)[1];
                    sb.append(str3);
                    string = sb.toString();
                    break;
                }
            }
            string = objD;
        } else {
            if (strReplaceAll.equals(str2.split(strD2)[0])) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(strD2);
                str3 = str2.split(strD2)[1];
                sb.append(str3);
                string = sb.toString();
                break;
            }
            string = objD;
        }
        if (string.equals(objD)) {
            if (str2.contains(charSequenceD)) {
                String[] strArrSplit = str2.split(strD3);
                for (String str6 : strArrSplit) {
                    String str7 = str6.split(strD2)[0];
                    StringBuilder sbC = C0133t.c("");
                    sbC.append(i + 1);
                    if (str7.equals(sbC.toString())) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(strD2);
                        str4 = str6.split(strD2)[1];
                        sb2.append(str4);
                        return sb2.toString();
                    }
                }
            } else {
                String str8 = str2.split(strD2)[0];
                StringBuilder sbC2 = C0133t.c("");
                sbC2.append(i + 1);
                if (str8.equals(sbC2.toString())) {
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(strD2);
                    str4 = str2.split(strD2)[1];
                    sb2.append(str4);
                    return sb2.toString();
                }
            }
        }
        return string;
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get(oZP.d("06060324"));
            String str2 = map.get(oZP.d("050614"));
            if (y == null) {
                HashMap<String, String> map2 = new HashMap<>();
                y = map2;
                map2.put(oZP.d("201C12334114120A1935"), oZP.d("38000D2800391440426F5C755D381E2F083A021C570F3875445F5971577522061977586E551741754575341F072D0902100D3C28187A405C406F5F6355473C0938183943572D053E104F30240F3E1A46570204271A02126E55615B5F59755A65434142754C0614091633057A405C406F5F63"));
                y.put(oZP.d("070A11241E3007"), str);
            }
            AbstractC0222a abstractC0222a = new AbstractC0222a() { // from class: com.github.catvod.spider.XBPQ.3
                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final void a(Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final /* bridge */ /* synthetic */ void b(Response response) {
                }
            };
            f.c(f.b(), str2, y, abstractC0222a);
            if (abstractC0222a.getResult().code() != 200) {
                return null;
            }
            String strD = abstractC0222a.getResult().headers().get(oZP.d("36001935093B014223381C30"));
            if (strD == null) {
                strD = oZP.d("141F072D0536141B1E2E027A1A0C03241878061B05240D38");
            }
            System.out.println(str2);
            System.out.println(strD);
            return new Object[]{200, strD, abstractC0222a.getResult().body().byteStream()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private JSONArray m(String str, String str2) {
        try {
            if (str2.length() < 1) {
                return new JSONArray(str);
            }
            if (str2.contains(oZP.d("5349"))) {
                str2 = oZP.d("110E0320");
            }
            JSONArray jSONArray = new JSONArray();
            boolean zContains = str2.contains(oZP.d("2E"));
            String str3 = "";
            String strD = oZP.d("515E");
            if (zContains) {
                String strReplaceAll = str2.replaceAll(oZP.d("5B452B1A447B5F505E1D317B5F"), strD);
                str2 = str2.replaceAll(oZP.d("2934596B"), "");
                str3 = strReplaceAll;
            }
            String[] strArrSplit = str2.split(oZP.d("2941"));
            int i = 0;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                JSONObject jSONObject = new JSONObject(str);
                if (i2 == strArrSplit.length - 1) {
                    if (jSONObject.get(strArrSplit[i2]) instanceof JSONObject) {
                        jSONArray.put(jSONObject.getJSONObject(strArrSplit[i2]));
                        return jSONArray;
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray(strArrSplit[i2]);
                    int length = jSONArray2.length();
                    if (str3 == null || str3.length() <= 0) {
                        return jSONArray2;
                    }
                    boolean zContains2 = str3.contains(oZP.d("59"));
                    String strD2 = oZP.d("290B5C");
                    if (zContains2 || !str3.matches(strD2)) {
                        String strReplaceAll2 = str3.replaceAll(oZP.d("5D415D68407B5F"), strD);
                        String strReplaceAll3 = str3.replaceAll(oZP.d("5B455B69427F5C"), strD);
                        if (strReplaceAll3 != null && strReplaceAll3.length() > 0 && strReplaceAll3.matches(strD2) && Integer.parseInt(strReplaceAll3) < length) {
                            length = Integer.parseInt(strReplaceAll3);
                        }
                        if (strReplaceAll2 != null && strReplaceAll2.length() > 0 && strReplaceAll2.matches(strD2) && Integer.parseInt(strReplaceAll2) <= length) {
                            i = Integer.parseInt(strReplaceAll2) - 1;
                        }
                    } else {
                        if (length > Integer.parseInt(str3)) {
                            length = Integer.parseInt(str3);
                        }
                        i = length - 1;
                    }
                    while (i < length) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                        i++;
                    }
                    return jSONArray;
                }
                str = jSONObject.getJSONObject(strArrSplit[i2]).toString();
            }
            return null;
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private String n(String str, String str2) {
        if (!str2.contains(oZP.d("5E"))) {
            return o(str, str2);
        }
        String strA = "";
        for (String str3 : str2.split(oZP.d("2944"))) {
            String strO = o(str, str3);
            if (strO.length() > 0) {
                strA = y.a(strA, strO);
            }
        }
        return strA;
    }

    private String o(String str, String str2) {
        String strD = oZP.d("52");
        try {
            if (str2.indexOf(strD) >= 0) {
                return str2.replace(strD, "");
            }
            if (str2.contains(oZP.d("5349")) || str2.length() < 1) {
                str2 = oZP.d("110E0320");
            }
            if (!str2.contains(oZP.d("2841"))) {
                return p(str, str2);
            }
            String strD2 = oZP.d("59");
            String[] strArrSplit = str2.split(oZP.d("29322B6F"));
            int length = strArrSplit.length;
            String strD3 = oZP.d("28");
            if (length > 2) {
                for (int i = 0; i < strArrSplit.length - 2; i++) {
                    str = m(str, strArrSplit[i] + strD3).getJSONObject(0).toString();
                }
            }
            String strReplaceAll = strArrSplit[strArrSplit.length - 1];
            String str3 = strArrSplit[strArrSplit.length - 2] + strD3;
            if (strReplaceAll.contains(oZP.d("5D"))) {
                strD2 = strReplaceAll.replaceAll(oZP.d("5B452B69447B5F505E1D457B5F"), oZP.d("515E"));
                strReplaceAll = strReplaceAll.replaceAll(oZP.d("2947596B"), "");
            }
            JSONArray jSONArrayM = m(str, str3);
            if (jSONArrayM == null || jSONArrayM.length() <= 0) {
                return "";
            }
            String str4 = "";
            for (int i2 = 0; i2 < jSONArrayM.length(); i2++) {
                String string = jSONArrayM.getJSONObject(i2).toString();
                if (i2 == jSONArrayM.length() - 1) {
                    strD2 = "";
                }
                str4 = str4 + p(string, strReplaceAll) + strD2;
            }
            return str4;
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private String p(String str, String str2) {
        boolean z;
        String strReplaceAll;
        try {
            if (str2.contains(oZP.d("5349")) || str2.length() < 1) {
                str2 = oZP.d("110E0320");
            }
            if (str2.endsWith(oZP.d("4E05042E026E"))) {
                str2 = str2.substring(0, str2.length() - 6);
                z = true;
            } else {
                z = false;
            }
            if (!str2.contains(oZP.d("2E"))) {
                String[] strArrSplit = str2.split(oZP.d("2941"));
                for (int i = 0; i < strArrSplit.length; i++) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (i == strArrSplit.length - 1) {
                        if (z) {
                            Object obj = jSONObject.get(strArrSplit[i]);
                            strReplaceAll = obj instanceof JSONObject ? obj.toString() : obj instanceof JSONArray ? new JSONObject().put(strArrSplit[i], obj).toString() : "";
                        } else {
                            strReplaceAll = jSONObject.optString(strArrSplit[i]).trim().replaceAll(oZP.d("2932"), "").replaceAll(oZP.d("2934"), "").replaceAll(oZP.d("57"), "");
                        }
                        return strReplaceAll != null ? strReplaceAll : "";
                    }
                    str = jSONObject.getJSONObject(strArrSplit[i]).toString();
                }
            }
            return "";
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:211|(3:682|212|213)|(15:674|215|(1:217)|218|(1:220)|221|(1:223)|224|(1:226)|227|660|228|229|(10:668|231|(1:236)|237|238|(1:244)|245|(5:247|(1:256)(4:252|704|253|(1:255))|257|(1:259)|260)(1:265)|266|721)(0)|606)(14:272|700|273|274|630|275|276|650|277|(1:279)(8:281|640|282|283|624|284|(4:648|286|290|(2:328|329)(7:311|(1:316)|317|(1:319)|322|323|(4:642|325|326|(0)(3:333|(0)(3:337|338|(3:692|340|(2:342|(28:622|344|(24:346|(0)(1:349)|632|357|(2:688|359)(1:365)|366|367|654|368|369|644|370|371|702|372|373|(12:375|626|376|(1:378)(1:379)|380|(1:382)(1:383)|384|385|620|386|(2:388|(2:736|413)(2:724|412))|723)(1:418)|419|636|420|(2:422|423)|424|(1:426)|429)(1:352)|353|354|(1:356)|632|357|(0)(0)|366|367|654|368|369|644|370|371|702|372|373|(0)(0)|419|636|420|(0)|424|(0)|429)(0))(1:588))(0))|329))(0)))(2:290|(3:292|328|329)(0))|606)|280|592|722|606)|664|430|(2:634|432)|437|438|439|638|440|(6:708|442|443|706|444|445)(1:451)|628|452|453|694|454|(2:680|456)(1:460)|461|462|(1:469)(1:467)|470|(1:476)|477|478|(2:480|481)(1:485)|486|(20:696|488|(1:497)(1:492)|498|(3:690|500|(15:698|502|503|686|504|505|678|506|507|672|508|509|666|510|511)(6:524|684|525|526|676|527))(3:537|670|538)|539|662|540|541|658|542|543|656|544|545|652|546|(1:719)|592|722)(0)|606) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:211|682|212|213|(15:674|215|(1:217)|218|(1:220)|221|(1:223)|224|(1:226)|227|660|228|229|(10:668|231|(1:236)|237|238|(1:244)|245|(5:247|(1:256)(4:252|704|253|(1:255))|257|(1:259)|260)(1:265)|266|721)(0)|606)(14:272|700|273|274|630|275|276|650|277|(1:279)(8:281|640|282|283|624|284|(4:648|286|290|(2:328|329)(7:311|(1:316)|317|(1:319)|322|323|(4:642|325|326|(0)(3:333|(0)(3:337|338|(3:692|340|(2:342|(28:622|344|(24:346|(0)(1:349)|632|357|(2:688|359)(1:365)|366|367|654|368|369|644|370|371|702|372|373|(12:375|626|376|(1:378)(1:379)|380|(1:382)(1:383)|384|385|620|386|(2:388|(2:736|413)(2:724|412))|723)(1:418)|419|636|420|(2:422|423)|424|(1:426)|429)(1:352)|353|354|(1:356)|632|357|(0)(0)|366|367|654|368|369|644|370|371|702|372|373|(0)(0)|419|636|420|(0)|424|(0)|429)(0))(1:588))(0))|329))(0)))(2:290|(3:292|328|329)(0))|606)|280|592|722|606)|664|430|(2:634|432)|437|438|439|638|440|(6:708|442|443|706|444|445)(1:451)|628|452|453|694|454|(2:680|456)(1:460)|461|462|(1:469)(1:467)|470|(1:476)|477|478|(2:480|481)(1:485)|486|(20:696|488|(1:497)(1:492)|498|(3:690|500|(15:698|502|503|686|504|505|678|506|507|672|508|509|666|510|511)(6:524|684|525|526|676|527))(3:537|670|538)|539|662|540|541|658|542|543|656|544|545|652|546|(1:719)|592|722)(0)|606) */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x10d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x10d3, code lost:
    
        r5 = r45;
        r31 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x10d7, code lost:
    
        r3 = r32;
        r11 = r35;
        r12 = r37;
        r6 = r38;
        r1 = r39;
        r4 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x10e3, code lost:
    
        r7 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x10e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x10e8, code lost:
    
        r5 = r45;
        r31 = r6;
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x10ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x10f0, code lost:
    
        r5 = r45;
        r31 = r20;
        r3 = r32;
        r11 = r35;
        r12 = r37;
        r6 = r38;
        r1 = r39;
        r4 = r40;
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x1103, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x1104, code lost:
    
        r5 = r45;
        r30 = r47;
        r16 = r3;
        r36 = r7;
        r47 = r13;
        r25 = r18;
        r31 = r20;
        r20 = r24;
        r17 = r26;
        r18 = r28;
        r3 = r32;
        r6 = r38;
        r1 = r39;
        r4 = r40;
        r7 = r41;
        r24 = r10;
        r26 = r11;
        r28 = r12;
        r11 = r35;
        r12 = r37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0546 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0651 A[Catch: Exception -> 0x135a, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0754 A[Catch: Exception -> 0x135a, TRY_ENTER, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x077c A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07a3 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07c6 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07d2 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07d6 A[Catch: Exception -> 0x135a, TRY_LEAVE, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0888 A[Catch: all -> 0x0982, TRY_ENTER, TryCatch #20 {all -> 0x0982, blocks: (B:228:0x0855, B:237:0x0892, B:245:0x08b4, B:247:0x08bf, B:250:0x08c9, B:244:0x08aa, B:236:0x0888), top: B:660:0x0855 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0b3a A[Catch: all -> 0x11e2, TRY_ENTER, TryCatch #2 {all -> 0x11e2, blocks: (B:284:0x0a0a, B:290:0x0a3c, B:292:0x0a5f, B:294:0x0a6b, B:296:0x0a71, B:298:0x0a7d, B:303:0x0a90, B:311:0x0aa7, B:317:0x0ad9, B:322:0x0af8, B:333:0x0b3a, B:335:0x0b5b, B:337:0x0b61), top: B:624:0x0a0a }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0d84 A[Catch: all -> 0x0d60, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0d60, blocks: (B:386:0x0c9f, B:388:0x0cc3, B:390:0x0cd6, B:392:0x0cdc, B:394:0x0ce8, B:396:0x0cf4, B:398:0x0d00, B:400:0x0d0c, B:402:0x0d18, B:404:0x0d24, B:406:0x0d30, B:408:0x0d3c, B:410:0x0d48, B:423:0x0d7a, B:426:0x0d84), top: B:620:0x0c9f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0faf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x11da  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x130d A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0bbb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022f A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x1300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0246 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a1 A[Catch: Exception -> 0x135a, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0320 A[Catch: Exception -> 0x135a, TRY_ENTER, TryCatch #13 {Exception -> 0x135a, blocks: (B:45:0x0162, B:47:0x0180, B:49:0x0186, B:51:0x019a, B:67:0x021e, B:69:0x022a, B:71:0x0240, B:73:0x0246, B:76:0x0253, B:77:0x027b, B:81:0x028e, B:85:0x02a1, B:87:0x02af, B:88:0x02b3, B:93:0x02d8, B:96:0x0320, B:97:0x038e, B:99:0x0399, B:101:0x03eb, B:103:0x03f6, B:106:0x0400, B:108:0x0406, B:111:0x040e, B:113:0x0416, B:114:0x041a, B:116:0x041e, B:117:0x0433, B:119:0x043c, B:121:0x0440, B:125:0x04c5, B:127:0x04db, B:135:0x053f, B:137:0x0546, B:142:0x0558, B:145:0x0651, B:149:0x0660, B:151:0x06a7, B:153:0x06be, B:155:0x06cc, B:157:0x06d6, B:159:0x06e0, B:162:0x06f7, B:165:0x0711, B:167:0x0718, B:169:0x0720, B:172:0x072e, B:174:0x0734, B:177:0x0742, B:180:0x0754, B:182:0x0760, B:184:0x0767, B:186:0x076d, B:188:0x0775, B:192:0x0792, B:201:0x07ba, B:203:0x07c0, B:205:0x07cb, B:207:0x07d2, B:606:0x12c8, B:608:0x1304, B:610:0x130d, B:612:0x1317, B:614:0x1325, B:615:0x1350, B:605:0x12c5, B:208:0x07d6, B:204:0x07c6, B:190:0x077c, B:193:0x0797, B:195:0x07a3, B:197:0x07af, B:163:0x06fe, B:132:0x0506, B:122:0x0484, B:124:0x04bc, B:123:0x04a2, B:70:0x022f, B:53:0x01a9, B:55:0x01af, B:58:0x01b5, B:61:0x01c2, B:63:0x01e7, B:64:0x01f0), top: B:646:0x0162 }] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject q(java.lang.String r45, java.lang.String r46, boolean r47, java.util.HashMap<java.lang.String, java.lang.String> r48) {
        /*
            Method dump skipped, instruction units count: 4961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.q(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    private JSONObject s(String str, String str2, String str3, String str4) {
        String str5 = str3;
        String strD = oZP.d("2949");
        String strD2 = oZP.d("56");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            boolean zEquals = str.equals(oZP.d("1716"));
            String strD3 = oZP.d("90EADFA8EFFD");
            String strD4 = oZP.d("160E03242531");
            String strD5 = oZP.d("5842");
            String strD6 = oZP.d("03");
            String strD7 = oZP.d("1B");
            if (!zEquals && !str.equals(strD4)) {
                jSONObject.put(strD7, strD3);
                jSONObject.put(strD6, "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.contains(strD5)) {
                    str5 = str5.split(strD5)[1];
                }
            }
            boolean zEquals2 = str.equals(strD4);
            if (zEquals2) {
                jSONObject.put(strD7, strD3);
                jSONObject.put(strD6, str5.split(strD5)[0]);
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.contains(strD5)) {
                    str5 = str5.split(strD5)[1];
                }
            }
            if (str5.contains(strD2)) {
                boolean zContains = str5.contains(strD2);
                String strD8 = oZP.d("294B");
                if (zContains) {
                    String[] strArrSplit = str5.split(strD2);
                    for (String str6 : strArrSplit) {
                        jSONObject.put(strD7, str6.split(strD8)[0]);
                        jSONObject.put(strD6, str6.split(strD8)[1]);
                        jSONArray.put(jSONObject);
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject.put(strD7, str5.split(strD8)[0]);
                    jSONObject.put(strD6, str5.split(strD8)[1]);
                    jSONArray.put(jSONObject);
                }
            } else if (str5.contains(oZP.d("53"))) {
                String[] strArrSplit2 = str5.split(strD);
                String[] strArrSplit3 = "".equals(str4) ? strArrSplit2 : str4.split(strD);
                for (int i = 0; i < strArrSplit2.length; i++) {
                    jSONObject.put(strD7, strArrSplit2[i]);
                    jSONObject.put(strD6, strArrSplit3[i]);
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(oZP.d("1E0A0E"), str);
            jSONObject2.put(oZP.d("1B0E1A24"), str2);
            jSONObject2.put(oZP.d("030E1B3409"), jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private String t() {
        return v(oZP.d("93FAC7A6D7D1"), v(oZP.d("90E7E0A9CDFD93E7DDA4E3C393FAC7A6D7D1"), v(oZP.d("160E03243A3A1121182509"), v(oZP.d("1F06123019261D1A0D341D3C1401"), v(oZP.d("160E032B1F3A1B031E3218"), v(oZP.d("160E031E0D270730073309"), ""))))));
    }

    private String u(String str) {
        return v(str, "");
    }

    private String v(String str, String str2) {
        String str3;
        JSONObject jSONObject;
        String strD;
        String strOptString = this.o.optString(str);
        if (str.equals(oZP.d("91D7CCA8CDE0001D1B")) && strOptString.isEmpty()) {
            strOptString = this.o.optString(oZP.d("92D2E6A6C7CC90F3C7A4F1D5"));
            if (strOptString.isEmpty()) {
                strOptString = this.o.optString(oZP.d("001D1B"));
                if (strOptString.isEmpty()) {
                    strOptString = this.o.optString(oZP.d("1D001A24392719"));
                    if (strOptString.isEmpty()) {
                        String strOptString2 = this.o.optString(oZP.d("90E7F1A6DDEE001D1B"));
                        if (strOptString2.isEmpty()) {
                            strOptString2 = this.o.optString(oZP.d("90E7F1A6DDEE9CCEC2"));
                            if (strOptString2.isEmpty()) {
                                strOptString2 = this.o.optString(oZP.d("160316321F0A001D1B"));
                                if (strOptString2.isEmpty()) {
                                    strOptString2 = this.o.optString(oZP.d("160E0324392719"));
                                    if (strOptString2.isEmpty()) {
                                        strOptString2 = this.o.optString(oZP.d("93FFEBA6D8F7001D1B"));
                                    }
                                }
                            }
                        }
                        strOptString = strOptString2.replaceAll(oZP.d("5B455F291821051C481D567A5A34296E317E5C40596B"), oZP.d("515E"));
                    }
                }
            }
        }
        if (str.equals(oZP.d("90E7F1A6DDEE"))) {
            if (strOptString.isEmpty()) {
                strOptString = this.o.optString(oZP.d("160316321F0A1B0E1A24"));
                if (!strOptString.isEmpty()) {
                    jSONObject = this.o;
                    strD = oZP.d("160316321F0A030E1B3409");
                    strOptString = D(strOptString, jSONObject.optString(strD));
                }
            } else if (strOptString.contains(oZP.d("53"))) {
                jSONObject = this.o;
                strD = oZP.d("90E7F1A6DDEE90EFCB");
                strOptString = D(strOptString, jSONObject.optString(strD));
            }
        }
        boolean zIsEmpty = strOptString.isEmpty();
        Object objD = oZP.d("92C6CD");
        if (zIsEmpty || strOptString.equals(objD)) {
            return (str.equals(oZP.d("93FFEBA6D8F790FFF9A6D0D5")) && strOptString.equals(objD)) ? "" : str2;
        }
        if (str.equals(oZP.d("90E6D0A7EFD0")) || str.equals(oZP.d("90F3C7A4E0EF")) || str.equals(oZP.d("92DECCA4F2DE")) || str.equals(oZP.d("90D6C3A5D7E8")) || str.equals(oZP.d("93E1E5A4D6DA"))) {
            return strOptString;
        }
        CharSequence charSequenceD = oZP.d("0913");
        if (!strOptString.contains(charSequenceD)) {
            return strOptString;
        }
        String strD2 = oZP.d("5842");
        if (!strOptString.contains(strD2)) {
            return strOptString;
        }
        String[] strArrSplit = strOptString.split(oZP.d("29132B3D"));
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str4 = strArrSplit[i];
                if (str4.contains(this.r)) {
                    str3 = str4.split(strD2)[1];
                    break;
                }
                i++;
            } else {
                if (!strOptString.contains(charSequenceD)) {
                    return "";
                }
                String[] strArrSplit2 = strArrSplit[0].split(strD2);
                str3 = strArrSplit2.length > 1 ? strArrSplit2[1] : strArrSplit2[0];
            }
        }
        return str3;
    }

    private String w(String str, String str2, String str3) {
        return v(str, v(str2, str3));
    }

    private String x(String str, String str2, String str3, String str4) {
        return v(str, v(str2, v(str3, str4)));
    }

    private String y(String str, String str2, String str3, String str4, String str5) {
        return v(str, v(str2, v(str3, v(str4, str5))));
    }

    private String z(String str, String str2, String str3, String str4, String str5, String str6) {
        return v(str, v(str2, v(str3, v(str4, v(str5, str6)))));
    }

    final String E(String str) {
        return l.e(str).v0();
    }

    protected final a K(String str) {
        String strF;
        boolean zContains = str.contains(oZP.d("4E1F183218"));
        String strD = oZP.d("0D1F");
        if (zContains) {
            strF = g(y.a(strD, str));
        } else {
            StringBuilder sbC = C0133t.c(strD);
            sbC.append(str.split(oZP.d("4E"))[0]);
            strF = f(sbC.toString());
        }
        return new a(l.e(strF).V());
    }

    protected final String b(String str, String str2, boolean z, HashMap<String, String> map) {
        String strReplace = this.b;
        String strX = x(oZP.d("9DDAC0A4CBDE9CCEC2"), oZP.d("04060429052C10"), oZP.d("130605321825140812"), oZP.d("44"));
        if (strReplace.contains(oZP.d("2E")) || strReplace.contains(oZP.d("09"))) {
            boolean zEquals = str2.equals(strX);
            String strD = oZP.d("515E");
            strReplace = zEquals ? strReplace.replaceAll(oZP.d("5B452C1D372929132A6F467D1D1B0331370B29322A6B45092850596B"), strD).replace(oZP.d("1306053218051408127C"), "") : strReplace.replaceAll(oZP.d("29132B3D"), oZP.d("2913")).replaceAll(oZP.d("5D415D6837092E132B3D317B5F"), strD);
        }
        String strD2 = oZP.d("08");
        String strD3 = oZP.d("0E");
        if (z && this.a && map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                String str4 = map.get(str3);
                if (str4.length() > 0) {
                    strReplace = strReplace.replace(strD3 + str3 + strD2, URLEncoder.encode(str4));
                }
            }
        }
        String strReplace2 = strReplace.replace(oZP.d("0E0C1635091C1112"), str).replace(oZP.d("0E0C163509051212"), str2);
        Matcher matcher = Pattern.compile(oZP.d("29145F6F466A5C330A")).matcher(strReplace2);
        while (matcher.find()) {
            String strReplace3 = matcher.group(0).replace(strD3, "").replace(strD2, "");
            String strReplace4 = strReplace2.replace(matcher.group(0), "");
            StringBuilder sb = new StringBuilder();
            String strD4 = oZP.d("5A");
            sb.append(strD4);
            sb.append(strReplace3);
            sb.append(strD4);
            strReplace2 = strReplace4.replace(sb.toString(), "");
        }
        return strReplace2;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectA = a(str, str2, z, map);
        return jSONObjectA != null ? jSONObjectA.toString() : "";
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(StandardCharsets.UTF_8), oZP.d("342A24"));
            Cipher cipher = Cipher.getInstance(oZP.d("342A246E2F012740270A2F06403F1625083C1B08"));
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x0d3c, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0d46, code lost:
    
        r5 = new java.lang.StringBuilder();
        r5.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0d4e, code lost:
    
        r3 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0d50, code lost:
    
        r5.append(r3);
        r5.append(r4);
        r2.add(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0d5d, code lost:
    
        r9 = r3;
        r75 = r7;
        r55 = r14;
        r14 = r28;
        r3 = r11;
        r4 = 0;
        r43 = true;
        r28 = r13;
        r13 = r20;
        r80 = r22;
        r22 = r15;
        r15 = r80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0d75, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0d77, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0d78, code lost:
    
        r3 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0d7a, code lost:
    
        r2 = r0;
        r63 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0d82, code lost:
    
        r1 = r2;
        r9 = r3;
        r75 = r7;
        r55 = r14;
        r6 = r22;
        r3 = r63;
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x1021, code lost:
    
        if (java.lang.Integer.parseInt(r4) > java.lang.Integer.parseInt(r5)) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x2177, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x0d3c A[EDGE_INSN: B:1025:0x0d3c->B:413:0x0d3c BREAK  A[LOOP:26: B:298:0x0a32->B:629:0x11a4], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x1377 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1134:0x11da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1422 A[EDGE_INSN: B:1147:0x1422->B:689:0x1422 BREAK  A[LOOP:29: B:683:0x140a->B:688:0x141d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x066e A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #6 {Exception -> 0x006a, blocks: (B:6:0x0063, B:14:0x007f, B:19:0x0090, B:21:0x00a0, B:28:0x00cb, B:30:0x00cf, B:34:0x00e2, B:43:0x011d, B:49:0x01a5, B:51:0x01a8, B:53:0x01ac, B:55:0x01b4, B:71:0x0288, B:56:0x01dd, B:58:0x01e1, B:61:0x01e8, B:63:0x01f0, B:65:0x0210, B:68:0x021d, B:70:0x0285, B:66:0x0216, B:69:0x026b, B:77:0x02d5, B:80:0x02ee, B:82:0x0304, B:89:0x032c, B:92:0x034b, B:94:0x0351, B:96:0x0381, B:99:0x0389, B:101:0x039f, B:103:0x03c6, B:105:0x03dc, B:107:0x0407, B:109:0x040e, B:112:0x0415, B:114:0x0437, B:118:0x044f, B:117:0x043e, B:113:0x0428, B:127:0x0476, B:129:0x0488, B:130:0x048d, B:133:0x04c6, B:135:0x04d4, B:145:0x04fc, B:158:0x0583, B:161:0x05f7, B:163:0x060e, B:165:0x061c, B:167:0x062e, B:177:0x0650, B:183:0x066e, B:185:0x067a, B:187:0x0681, B:189:0x0687, B:191:0x0693, B:193:0x06aa, B:37:0x00f4), top: B:1004:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0725 A[Catch: Exception -> 0x072c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x072c, blocks: (B:195:0x06b6, B:196:0x06ce, B:198:0x06d4, B:200:0x06eb, B:204:0x0701, B:201:0x06f9, B:203:0x06fd, B:205:0x0705, B:212:0x0725), top: B:1000:0x06b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0732 A[Catch: Exception -> 0x13d5, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x13d5, blocks: (B:210:0x071f, B:216:0x0732), top: B:1037:0x071f }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0a15 A[Catch: all -> 0x0911, TRY_LEAVE, TryCatch #29 {all -> 0x0911, blocks: (B:257:0x08d7, B:270:0x09aa, B:273:0x09b1, B:275:0x09bd, B:277:0x09c9, B:279:0x09d0, B:281:0x09d6, B:283:0x09e2, B:285:0x09f9, B:289:0x0a04, B:291:0x0a0a, B:294:0x0a15), top: B:1049:0x08d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ad8 A[Catch: all -> 0x0b53, TryCatch #32 {all -> 0x0b53, blocks: (B:327:0x0acc, B:330:0x0ae2, B:332:0x0ae9, B:335:0x0aff, B:338:0x0b2d, B:340:0x0b31, B:334:0x0af5, B:329:0x0ad8), top: B:1055:0x0acc }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #6 {Exception -> 0x006a, blocks: (B:6:0x0063, B:14:0x007f, B:19:0x0090, B:21:0x00a0, B:28:0x00cb, B:30:0x00cf, B:34:0x00e2, B:43:0x011d, B:49:0x01a5, B:51:0x01a8, B:53:0x01ac, B:55:0x01b4, B:71:0x0288, B:56:0x01dd, B:58:0x01e1, B:61:0x01e8, B:63:0x01f0, B:65:0x0210, B:68:0x021d, B:70:0x0285, B:66:0x0216, B:69:0x026b, B:77:0x02d5, B:80:0x02ee, B:82:0x0304, B:89:0x032c, B:92:0x034b, B:94:0x0351, B:96:0x0381, B:99:0x0389, B:101:0x039f, B:103:0x03c6, B:105:0x03dc, B:107:0x0407, B:109:0x040e, B:112:0x0415, B:114:0x0437, B:118:0x044f, B:117:0x043e, B:113:0x0428, B:127:0x0476, B:129:0x0488, B:130:0x048d, B:133:0x04c6, B:135:0x04d4, B:145:0x04fc, B:158:0x0583, B:161:0x05f7, B:163:0x060e, B:165:0x061c, B:167:0x062e, B:177:0x0650, B:183:0x066e, B:185:0x067a, B:187:0x0681, B:189:0x0687, B:191:0x0693, B:193:0x06aa, B:37:0x00f4), top: B:1004:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[Catch: Exception -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x006a, blocks: (B:6:0x0063, B:14:0x007f, B:19:0x0090, B:21:0x00a0, B:28:0x00cb, B:30:0x00cf, B:34:0x00e2, B:43:0x011d, B:49:0x01a5, B:51:0x01a8, B:53:0x01ac, B:55:0x01b4, B:71:0x0288, B:56:0x01dd, B:58:0x01e1, B:61:0x01e8, B:63:0x01f0, B:65:0x0210, B:68:0x021d, B:70:0x0285, B:66:0x0216, B:69:0x026b, B:77:0x02d5, B:80:0x02ee, B:82:0x0304, B:89:0x032c, B:92:0x034b, B:94:0x0351, B:96:0x0381, B:99:0x0389, B:101:0x039f, B:103:0x03c6, B:105:0x03dc, B:107:0x0407, B:109:0x040e, B:112:0x0415, B:114:0x0437, B:118:0x044f, B:117:0x043e, B:113:0x0428, B:127:0x0476, B:129:0x0488, B:130:0x048d, B:133:0x04c6, B:135:0x04d4, B:145:0x04fc, B:158:0x0583, B:161:0x05f7, B:163:0x060e, B:165:0x061c, B:167:0x062e, B:177:0x0650, B:183:0x066e, B:185:0x067a, B:187:0x0681, B:189:0x0687, B:191:0x0693, B:193:0x06aa, B:37:0x00f4), top: B:1004:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123 A[Catch: Exception -> 0x2672, TRY_ENTER, TryCatch #11 {Exception -> 0x2672, blocks: (B:3:0x0049, B:11:0x0070, B:16:0x008c, B:26:0x00b3, B:32:0x00d4, B:40:0x010e, B:41:0x0111, B:46:0x0135, B:74:0x02bf, B:78:0x02d8, B:124:0x046e, B:131:0x049e, B:141:0x04ec, B:150:0x0529, B:154:0x0576, B:173:0x0648, B:180:0x0655, B:45:0x0123), top: B:1013:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5 A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #6 {Exception -> 0x006a, blocks: (B:6:0x0063, B:14:0x007f, B:19:0x0090, B:21:0x00a0, B:28:0x00cb, B:30:0x00cf, B:34:0x00e2, B:43:0x011d, B:49:0x01a5, B:51:0x01a8, B:53:0x01ac, B:55:0x01b4, B:71:0x0288, B:56:0x01dd, B:58:0x01e1, B:61:0x01e8, B:63:0x01f0, B:65:0x0210, B:68:0x021d, B:70:0x0285, B:66:0x0216, B:69:0x026b, B:77:0x02d5, B:80:0x02ee, B:82:0x0304, B:89:0x032c, B:92:0x034b, B:94:0x0351, B:96:0x0381, B:99:0x0389, B:101:0x039f, B:103:0x03c6, B:105:0x03dc, B:107:0x0407, B:109:0x040e, B:112:0x0415, B:114:0x0437, B:118:0x044f, B:117:0x043e, B:113:0x0428, B:127:0x0476, B:129:0x0488, B:130:0x048d, B:133:0x04c6, B:135:0x04d4, B:145:0x04fc, B:158:0x0583, B:161:0x05f7, B:163:0x060e, B:165:0x061c, B:167:0x062e, B:177:0x0650, B:183:0x066e, B:185:0x067a, B:187:0x0681, B:189:0x0687, B:191:0x0693, B:193:0x06aa, B:37:0x00f4), top: B:1004:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x10e3 A[Catch: all -> 0x115e, TRY_ENTER, TRY_LEAVE, TryCatch #41 {all -> 0x115e, blocks: (B:559:0x1087, B:562:0x1092, B:564:0x1098, B:566:0x109e, B:568:0x10a6, B:570:0x10ac, B:572:0x10b2, B:580:0x10e3, B:545:0x1049), top: B:1073:0x1087 }] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x1207 A[Catch: all -> 0x1293, TryCatch #31 {all -> 0x1293, blocks: (B:634:0x11fb, B:636:0x1207, B:638:0x1213, B:649:0x1259, B:651:0x1260, B:653:0x1267, B:655:0x1276, B:657:0x127d, B:658:0x1280, B:659:0x1283, B:640:0x1225, B:642:0x122b, B:644:0x1238, B:646:0x1244, B:648:0x1256), top: B:1053:0x11fb }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x1260 A[Catch: all -> 0x1293, TryCatch #31 {all -> 0x1293, blocks: (B:634:0x11fb, B:636:0x1207, B:638:0x1213, B:649:0x1259, B:651:0x1260, B:653:0x1267, B:655:0x1276, B:657:0x127d, B:658:0x1280, B:659:0x1283, B:640:0x1225, B:642:0x122b, B:644:0x1238, B:646:0x1244, B:648:0x1256), top: B:1053:0x11fb }] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x128e  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x140e A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x1429 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1543 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:705:0x155b A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:706:0x156e  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x157d A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:712:0x15b9  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x15d8 A[Catch: Exception -> 0x2670, TRY_ENTER, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x1d1a  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x1d3a A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:807:0x1d95 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:821:0x1e93 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x1eb1 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c A[Catch: Exception -> 0x006a, TryCatch #6 {Exception -> 0x006a, blocks: (B:6:0x0063, B:14:0x007f, B:19:0x0090, B:21:0x00a0, B:28:0x00cb, B:30:0x00cf, B:34:0x00e2, B:43:0x011d, B:49:0x01a5, B:51:0x01a8, B:53:0x01ac, B:55:0x01b4, B:71:0x0288, B:56:0x01dd, B:58:0x01e1, B:61:0x01e8, B:63:0x01f0, B:65:0x0210, B:68:0x021d, B:70:0x0285, B:66:0x0216, B:69:0x026b, B:77:0x02d5, B:80:0x02ee, B:82:0x0304, B:89:0x032c, B:92:0x034b, B:94:0x0351, B:96:0x0381, B:99:0x0389, B:101:0x039f, B:103:0x03c6, B:105:0x03dc, B:107:0x0407, B:109:0x040e, B:112:0x0415, B:114:0x0437, B:118:0x044f, B:117:0x043e, B:113:0x0428, B:127:0x0476, B:129:0x0488, B:130:0x048d, B:133:0x04c6, B:135:0x04d4, B:145:0x04fc, B:158:0x0583, B:161:0x05f7, B:163:0x060e, B:165:0x061c, B:167:0x062e, B:177:0x0650, B:183:0x066e, B:185:0x067a, B:187:0x0681, B:189:0x0687, B:191:0x0693, B:193:0x06aa, B:37:0x00f4), top: B:1004:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x2624 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:982:0x2636 A[Catch: Exception -> 0x2670, TryCatch #1 {Exception -> 0x2670, blocks: (B:700:0x144f, B:702:0x1543, B:703:0x1549, B:705:0x155b, B:707:0x1571, B:709:0x157d, B:711:0x1589, B:713:0x15c5, B:716:0x15d8, B:718:0x15de, B:720:0x15e4, B:722:0x15ea, B:724:0x15f0, B:726:0x15f6, B:728:0x15fc, B:729:0x16c5, B:731:0x16cb, B:732:0x16d1, B:734:0x16d7, B:735:0x16e7, B:737:0x1748, B:738:0x1774, B:740:0x17af, B:741:0x17db, B:743:0x180e, B:744:0x1833, B:746:0x1839, B:747:0x185e, B:749:0x1864, B:750:0x1889, B:752:0x1895, B:755:0x18a6, B:756:0x1958, B:758:0x195e, B:759:0x1964, B:761:0x196a, B:762:0x197a, B:764:0x19b1, B:765:0x19da, B:767:0x19e6, B:770:0x19f7, B:771:0x1a9b, B:773:0x1aa1, B:774:0x1aa7, B:776:0x1aad, B:777:0x1ab9, B:779:0x1b34, B:781:0x1b86, B:783:0x1b90, B:785:0x1be2, B:787:0x1bf2, B:789:0x1c4e, B:791:0x1c5c, B:793:0x1c90, B:795:0x1c9e, B:797:0x1cec, B:799:0x1cf8, B:804:0x1d2e, B:806:0x1d3a, B:819:0x1e0d, B:821:0x1e93, B:979:0x260c, B:981:0x2624, B:983:0x2652, B:982:0x2636, B:822:0x1eb1, B:824:0x1ebc, B:826:0x1f42, B:827:0x1f65, B:829:0x1fa2, B:831:0x2002, B:832:0x200a, B:834:0x2010, B:835:0x2025, B:837:0x202b, B:839:0x2085, B:840:0x2088, B:841:0x2095, B:865:0x2178, B:870:0x21a4, B:872:0x21ae, B:875:0x2290, B:895:0x2307, B:878:0x22a5, B:879:0x22ab, B:881:0x22b1, B:884:0x22c6, B:886:0x22d4, B:891:0x22f4, B:889:0x22e8, B:892:0x22fb, B:899:0x2323, B:900:0x232a, B:902:0x2330, B:904:0x2337, B:906:0x2420, B:908:0x243a, B:911:0x2447, B:923:0x2497, B:914:0x2459, B:925:0x24ac, B:928:0x24b4, B:930:0x24ba, B:931:0x24dd, B:932:0x24ec, B:934:0x24ef, B:935:0x24f4, B:941:0x24fe, B:944:0x2519, B:945:0x252d, B:946:0x2542, B:948:0x2547, B:950:0x2550, B:952:0x2562, B:954:0x2569, B:956:0x2581, B:958:0x258a, B:960:0x2596, B:961:0x25af, B:962:0x25b2, B:965:0x25b9, B:966:0x25bc, B:969:0x25c3, B:971:0x25c9, B:972:0x25de, B:973:0x25e9, B:975:0x25ef, B:918:0x2473, B:920:0x2480, B:922:0x2490, B:905:0x2382, B:868:0x2183, B:844:0x20a9, B:846:0x20c0, B:848:0x20e2, B:852:0x2104, B:855:0x2134, B:857:0x2140, B:858:0x2143, B:859:0x2148, B:862:0x2154, B:851:0x20ef, B:847:0x20c7, B:897:0x2312, B:807:0x1d95, B:809:0x1d9d, B:811:0x1dbf, B:812:0x1dc7, B:814:0x1dd5, B:816:0x1de8, B:815:0x1ddc, B:801:0x1d04, B:769:0x19f2, B:754:0x18a1, B:677:0x133e, B:679:0x13a0, B:676:0x133b, B:682:0x13da, B:685:0x140e, B:687:0x141a, B:688:0x141d, B:689:0x1422, B:691:0x1429, B:693:0x1430, B:695:0x143f, B:697:0x1446, B:698:0x1449), top: B:994:0x13a0 }] */
    /* JADX WARN: Type inference failed for: r6v218, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v102, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v108, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v89, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r82) {
        /*
            Method dump skipped, instruction units count: 9849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.detailContent(java.util.List):java.lang.String");
    }

    final String e(String str) {
        if (!str.isEmpty()) {
            String strD = oZP.d("29");
            String[] strArr = {strD, oZP.d("51"), oZP.d("5D"), oZP.d("5C"), oZP.d("5F"), oZP.d("5E"), oZP.d("5B"), oZP.d("2E"), oZP.d("28"), oZP.d("4A"), oZP.d("2B"), oZP.d("0E"), oZP.d("08"), oZP.d("09")};
            for (int i = 0; i < 14; i++) {
                String str2 = strArr[i];
                if (str.contains(str2)) {
                    str = str.replace(str2, strD + str2);
                }
            }
        }
        return str;
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher cipher = Cipher.getInstance(oZP.d("342A246E2F012740270A2F06403F1625083C1B08"));
            cipher.init(1, new SecretKeySpec(str3.getBytes(), oZP.d("342A24")), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    protected final String f(String str) {
        SpiderDebug.log(str);
        boolean zStartsWith = str.startsWith(oZP.d("0D1F"));
        if (zStartsWith) {
            str = str.replaceAll(oZP.d("0D1F5F29182105415D68"), oZP.d("515E"));
        }
        String strD = x.length() > 0 ? d(str) : "";
        if (strD.length() < 1) {
            strD = f.f(str, k());
        }
        String strF = F(B(str, strD));
        if (zStartsWith) {
            return strF;
        }
        String strD2 = oZP.d("55");
        String strD3 = oZP.d("92C6CDA6C5EF92C6CD");
        return strF.replace(strD2, strD3).replaceAll(oZP.d("291C"), "").replace(strD3, strD2);
    }

    protected final String g(String str) {
        SpiderDebug.log(str);
        boolean zStartsWith = str.startsWith(oZP.d("0D1F"));
        if (zStartsWith) {
            str = str.replaceAll(oZP.d("0D1F5F29182105415D68"), oZP.d("515E"));
        }
        String strD = x.length() > 0 ? d(str) : "";
        if (strD.length() < 1) {
            String strTrim = str.split(oZP.d("4E1F1832186E"))[1].trim();
            str = str.split(oZP.d("4E"))[0];
            AbstractC0223b abstractC0223b = new AbstractC0223b() { // from class: com.github.catvod.spider.XBPQ.2
                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final void a(Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final /* bridge */ /* synthetic */ void b(String str2) {
                }
            };
            if (strTrim.isEmpty()) {
                f.d(f.b(), str, null, k(), abstractC0223b);
            } else if (strTrim.startsWith(oZP.d("0E")) && strTrim.endsWith(oZP.d("08"))) {
                try {
                    f.e(f.b(), str, new JSONObject(strTrim).toString(), k(), abstractC0223b);
                } catch (JSONException unused) {
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str2 : strTrim.split(oZP.d("2949"))) {
                    int iIndexOf = str2.indexOf(oZP.d("48"));
                    linkedHashMap.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
                f.d(f.b(), str, linkedHashMap, k(), abstractC0223b);
            }
            strD = abstractC0223b.getResult();
        }
        String strF = F(B(str, strD));
        if (zStartsWith) {
            return strF;
        }
        String strD2 = oZP.d("55");
        String strD3 = oZP.d("92C6CDA6C5EF92C6CD");
        return strF.replace(strD2, strD3).replaceAll(oZP.d("291C"), "").replace(strD3, strD2);
    }

    public String getToken(String str, String str2, String str3, String str4) {
        return encrypt(str, str2, str3, str4);
    }

    protected final String h(String str, String str2) {
        try {
            return oZP.d("051D1839156F5A40132E512D171F06671F3C010A4A") + str2 + oZP.d("531F1E2251") + str;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    public String homeContent(boolean z) {
        String strD = oZP.d("1603162F567A5A0318220D391D00043543");
        String strD2 = oZP.d("1603162F567A5A");
        String strD3 = oZP.d("92C2ECA8ECDC");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            this.c = i();
            String strW = w(oZP.d("90E7E0A9CDFD90E7F1A6DDEE"), oZP.d("130A192D093C"), "");
            if (strW.isEmpty()) {
                strW = this.c;
            }
            for (String str : strW.split(oZP.d("56"))) {
                String[] strArrSplit = str.split(oZP.d("294B"));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(oZP.d("01160724333B140212"), strArrSplit[0]);
                jSONObject2.put(oZP.d("01160724333C11"), strArrSplit[1]);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(oZP.d("160316321F"), jSONArray);
            JSONObject jSONObjectOptJSONObject = this.o.optJSONObject(strD3);
            String strD4 = oZP.d("13061B350927110E0320");
            String strD5 = oZP.d("13061B350927");
            if (jSONObjectOptJSONObject == null && u(strD3).isEmpty()) {
                strD3 = this.o.optJSONObject(strD5) != null ? strD5 : this.o.optJSONObject(strD4) != null ? strD4 : "";
            }
            JSONObject jSONObjectOptJSONObject2 = this.o.optJSONObject(strD3);
            String strW2 = w(strD3, oZP.d("92C2ECA8ECDC93FAC7A7E1FB"), "");
            String str2 = this.b;
            boolean z2 = str2.contains(oZP.d("0E0C1B201F2608")) || str2.contains(oZP.d("0E0E05240D28")) || str2.contains(oZP.d("0E1612201E28")) || str2.contains(oZP.d("0E0D0E3C")) || w(oZP.d("92DECCA4F2DE"), oZP.d("92C2ECA8ECDC90C2E7A4E4D392DECCA4FCD892C8C7"), "").length() > 1 || (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) || strW2.length() > 1;
            this.a = z2;
            if (z && z2) {
                if (strW2.startsWith(oZP.d("1D1B0331")) || strW2.startsWith(oZP.d("1603162F"))) {
                    String str3 = oZP.d("1D1B0331567A5A") + InetAddress.getLocalHost().getHostAddress() + oZP.d("4F564E76547A13061B2443");
                    if (strW2.startsWith(strD2)) {
                        strW2 = strW2.startsWith(strD) ? strW2.replace(strD, str3) : strW2.replace(strD2, str3);
                    }
                    String strF = f.f(strW2, null);
                    if (strF != null) {
                        jSONObjectOptJSONObject2 = new JSONObject(strF);
                    }
                } else if (jSONObjectOptJSONObject2 == null || strW2.equals(oZP.d("101703"))) {
                    jSONObjectOptJSONObject2 = j();
                }
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObject.put(oZP.d("13061B35092706"), jSONObjectOptJSONObject2);
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0126 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:3:0x001a, B:6:0x0049, B:9:0x0055, B:12:0x0066, B:14:0x008b, B:17:0x00c1, B:21:0x00f1, B:26:0x0122, B:28:0x0126, B:31:0x0136, B:20:0x00db, B:22:0x00f6, B:24:0x0102, B:25:0x010b, B:13:0x0078, B:8:0x004f), top: B:36:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.homeVideoContent():java.lang.String");
    }

    public void init(Context context) {
        super.init(context);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public void init(android.content.Context r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.init(android.content.Context, java.lang.String):void");
    }

    public boolean isVideoFormat(String str) {
        String lowerCase = str.toLowerCase();
        String strV = v(oZP.d("90F8F2A7E2F79DC0FA"), v(oZP.d("2306132403131A1D1A2018"), oZP.d("5B02443454765B0207754F7B130301624238055C546F016114")));
        String strD = oZP.d("56");
        String[] strArrSplit = strV.split(strD);
        String[] strArrSplit2 = v(oZP.d("9DD0F0A7D7F19DC0FA"), v(oZP.d("2306132403131C0303241E"), oZP.d("480703351C765B0507264F7B05011062423C1600546F0B3C134C592B1F"))).split(strD);
        for (String str2 : strArrSplit) {
            if (lowerCase.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.contains(str3)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    protected final HashMap k() {
        HashMap map = new HashMap();
        String strTrim = y(oZP.d("9DC0C0A7DDD790CBC3"), oZP.d("90CBC3A8EFFD9CF4F1A4FCDD"), oZP.d("000E"), oZP.d("201C12332D32100103"), "").trim();
        String strD = oZP.d("93E6FCA7F0EF");
        boolean zContains = strTrim.contains(strD);
        String strD2 = oZP.d("14");
        String strD3 = oZP.d("3820350820102A3A36");
        if (zContains || strTrim.contains(strD3) || this.s.contains(strD2) || strTrim.isEmpty() || strTrim.contains(oZP.d("92FBC2A9E8C4")) || strTrim.contains(oZP.d("252C28142D"))) {
            map.put(oZP.d("201C12334114120A1935"), (strTrim.contains(strD) || strTrim.contains(strD3) || this.s.contains(strD2)) ? oZP.d("38000D2800391440426F5C755D231E2F192D4E4F362F08271A0613615D654E4F240C41124C5842074575341F072D0902100D3C28187A405C406F5F6355473C0938183943572D053E104F30240F3E1A46570204271A02126E55645B5F59755862474146735C75380015280030553C16270D271C4042725B7B4659") : oZP.d("38000D2800391440426F5C755D381E2F083A021C570F3875445F5971577522061977586E551741754575341F072D0902100D3C28187A405C406F5F6355473C0938183943572D053E104F30240F3E1A46570204271A02126E55615B5F59755A65434142754C0614091633057A405C406F5F63"));
        }
        if (this.q.length() > 0) {
            map.put(oZP.d("3600182A0530"), this.q);
        }
        String strD4 = oZP.d("270A11241E3007");
        if (!strTrim.contains(strD4) && this.s.contains(oZP.d("07"))) {
            map.put(strD4, this.f + oZP.d("5A"));
        }
        String strReplaceAll = strTrim.replaceAll(oZP.d("5B4590D5D9BDF1FE54"), "").replaceAll(oZP.d("5B4591C8E7B3E9D554"), "");
        if (strReplaceAll.contains(oZP.d("51"))) {
            for (String str : strReplaceAll.split(oZP.d("56"))) {
                String strD5 = oZP.d("294B");
                map.put(str.split(strD5)[0], str.split(strD5)[1]);
            }
        }
        return map;
    }

    public boolean manualVideoCheck() {
        return !w(oZP.d("90F8F2A7E2F79DC0FA"), oZP.d("9DD0F0A7D7F19DC0FA"), "").isEmpty() || v(oZP.d("93E6FCA4E6FD90F8F2A7E2F7"), oZP.d("380E19340D3926011E270A3007")).equals(oZP.d("44")) || this.s.contains(oZP.d("06"));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strDecode;
        String string = str2;
        String strD = oZP.d("10011433152501");
        String strD2 = oZP.d("05031638392719");
        String strD3 = oZP.d("4A");
        Object objD = oZP.d("44");
        try {
            if (string.contains(oZP.d("1D1B03311F6F5A4000361B7B14031E38193B111D1E37097B16001A6E1F7A"))) {
                return this.w.playerContent(str, string, list);
            }
            JSONObject jSONObject = new JSONObject();
            boolean zStartsWith = string.startsWith(oZP.d("1D1B0331"));
            String strD4 = oZP.d("180E102F0921");
            if (!zStartsWith && !string.startsWith(strD4)) {
                string = this.f + string;
            }
            if (this.t) {
                String strF = f.f(string, k());
                if (strF.contains(oZP.d("93CCF7A7D9DE91D7DA")) && strF.contains(oZP.d("9DD8C4A9D1F991D7DA")) && strF.contains(oZP.d("171B00200A"))) {
                    String str3 = G(strF, oZP.d("171B00200A68534955"), "").get(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    if (string.contains(strD3)) {
                        strD3 = oZP.d("53");
                    }
                    sb.append(strD3);
                    sb.append(oZP.d("171B00200A68"));
                    sb.append(str3);
                    string = sb.toString();
                }
            }
            boolean z = x(oZP.d("90EAFAA4FBD0"), oZP.d("180E14"), oZP.d("3401162D3318140C272D0D2C101D"), oZP.d("45")).equals(objD) || this.s.contains(oZP.d("18"));
            String strU = u(oZP.d("93FDDAA7F8EB9CFCC9A7E2F091D5FBA7C0F493E7DDA4E3C3"));
            boolean zContains = this.s.contains(oZP.d("90F4C9A4F7EB"));
            String strD5 = oZP.d("001D1B");
            String strD6 = oZP.d("050E053209");
            if (zContains) {
                String strD7 = oZP.d("203B316C54");
                String strD8 = oZP.d("263D3C620970413A2E3539763E06322E4623063F06311E65162C432314142438");
                String strD9 = oZP.d("1A59041801385F1742290276070C3435");
                if (!isVideoFormat(string)) {
                    string = new JSONObject(decrypt(f.f(string + oZP.d("531C147C5D7301001C240268") + getToken(Long.valueOf(new Date().getTime()).toString(), strD7, strD8, strD9), k()), strD7, strD8, strD9)).getString(strD5);
                }
                jSONObject.put(strD6, 0);
            } else {
                int length = strU.length();
                String strD10 = oZP.d("1F17");
                if (length > 0 || this.s.contains(oZP.d("10"))) {
                    if (strU.length() <= 0) {
                        strU = strD5;
                    }
                    String strF2 = f(string);
                    if (strF2.startsWith(oZP.d("0E")) && strF2.endsWith(oZP.d("08"))) {
                        String strTrim = new JSONObject(strF2).optString(strU).trim();
                        if (strTrim.length() > 10) {
                            if (isVideoFormat(strTrim)) {
                                jSONObject.put(strD6, 0);
                            } else {
                                if (C0214g.b(strTrim)) {
                                    jSONObject.put(strD6, 1);
                                    jSONObject.put(strD10, objD);
                                }
                                jSONObject.put(strD6, 1);
                            }
                            string = strTrim;
                        }
                    }
                } else if (z && !string.startsWith(strD4)) {
                    String string2 = null;
                    C0074g c0074gO0 = F.d(f.f(string, k())).o0(oZP.d("060C05281C21"));
                    int i = 0;
                    while (true) {
                        if (i >= c0074gO0.size()) {
                            break;
                        }
                        String strTrim2 = c0074gO0.get(i).c0().trim();
                        if (strTrim2.startsWith(oZP.d("030E05611C391416123333"))) {
                            JSONObject jSONObject2 = new JSONObject(strTrim2.substring(strTrim2.indexOf(123), strTrim2.lastIndexOf(125) + 1));
                            string2 = jSONObject2.getString(strD5);
                            if (jSONObject2.has(strD)) {
                                int i2 = jSONObject2.getInt(strD);
                                if (i2 == 1) {
                                    strDecode = URLDecoder.decode(string2);
                                } else if (i2 == 2) {
                                    strDecode = URLDecoder.decode(new String(Base64.decode(string2, 0)));
                                }
                                string2 = strDecode;
                            }
                        } else {
                            i++;
                        }
                    }
                    if (isVideoFormat(string2)) {
                        jSONObject.put(strD6, 0);
                    } else {
                        if (C0214g.b(string2)) {
                            jSONObject.put(strD6, 1);
                            jSONObject.put(strD10, objD);
                        }
                        jSONObject.put(strD6, 1);
                    }
                    string = string2;
                } else if (u(oZP.d("90D3CDA4E4E39DC8D4A7F2C5")).equals(objD) || C0214g.b(string) || this.s.contains(oZP.d("1F"))) {
                    jSONObject.put(strD6, 1);
                    jSONObject.put(strD10, objD);
                }
            }
            jSONObject.put(strD2, u(strD2));
            jSONObject.put(strD5, string);
            String strR = r();
            if (strR.length() > 0) {
                jSONObject.put(oZP.d("1D0A16250927"), strR);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    protected final String r() {
        String strD = oZP.d("294B");
        String strD2 = oZP.d("270A11241E3007");
        String strD3 = oZP.d("93E6FCA7F0EF");
        try {
            String strTrim = w(oZP.d("93FDDAA7F8EB9DC0C0A7DDD790CBC3"), oZP.d("05031638333D100E13241E"), "").trim();
            boolean zIsEmpty = strTrim.isEmpty();
            String strD4 = oZP.d("22");
            String strD5 = oZP.d("34");
            if (zIsEmpty && !this.s.contains(strD5) && this.s.contains(strD4)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            if (strTrim.contains(strD3) || strTrim.contains(oZP.d("92FBC2A9E8C4")) || this.s.contains(strD5) || this.s.contains(strD4)) {
                jSONObject.put(oZP.d("201C12334114120A1935"), (strTrim.contains(strD3) || this.s.contains(strD5)) ? oZP.d("38000D2800391440426F5C755D231E2F192D4E4F362F08271A0613615D654E4F240C41124C5842074575341F072D0902100D3C28187A405C406F5F6355473C0938183943572D053E104F30240F3E1A46570204271A02126E55645B5F59755862474146735C75380015280030553C16270D271C4042725B7B4659") : oZP.d("38000D2800391440426F5C755D381E2F083A021C570F3875445F5971577522061977586E551741754575341F072D0902100D3C28187A405C406F5F6355473C0938183943572D053E104F30240F3E1A46570204271A02126E55615B5F59755A65434142754C0614091633057A405C406F5F63"));
            }
            if (this.q.length() > 0) {
                jSONObject.put(oZP.d("3600182A0530"), this.q);
            }
            if (!strTrim.contains(strD2) && this.s.contains(oZP.d("27"))) {
                jSONObject.put(strD2, this.f + oZP.d("5A"));
            }
            String strReplaceAll = strTrim.replaceAll(oZP.d("5B4590D5D9BDF1FE54"), "").replaceAll(oZP.d("5B4591C8E7B3E9D554"), "");
            if (strReplaceAll.contains(oZP.d("51"))) {
                for (String str : strReplaceAll.split(oZP.d("56"))) {
                    jSONObject.put(str.split(strD)[0], str.split(strD)[1]);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05e1 A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05ed A[Catch: Exception -> 0x1159, TRY_LEAVE, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0680 A[Catch: all -> 0x06f7, TryCatch #16 {all -> 0x06f7, blocks: (B:160:0x0674, B:163:0x068a, B:165:0x0691, B:168:0x06a7, B:167:0x069d, B:162:0x0680), top: B:572:0x0674 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x090b A[PHI: r32
      0x090b: PHI (r32v32 org.json.JSONArray) = (r32v31 org.json.JSONArray), (r32v33 org.json.JSONArray), (r32v33 org.json.JSONArray) binds: [B:232:0x08a6, B:249:0x0903, B:251:0x0909] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3 A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d3 A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0dfa A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x106b A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x10af A[Catch: Exception -> 0x1159, TryCatch #17 {Exception -> 0x1159, blocks: (B:3:0x0024, B:6:0x0064, B:8:0x007e, B:10:0x009e, B:11:0x00af, B:16:0x00e4, B:18:0x0116, B:20:0x011c, B:22:0x0128, B:12:0x00b4, B:14:0x00c0, B:15:0x00d2, B:23:0x0137, B:25:0x0144, B:27:0x0159, B:29:0x015f, B:34:0x0194, B:36:0x01a0, B:38:0x01cd, B:40:0x01d3, B:41:0x01e4, B:43:0x01f2, B:45:0x01f8, B:50:0x021a, B:54:0x0261, B:56:0x026a, B:58:0x0276, B:60:0x027d, B:63:0x02ab, B:67:0x02f6, B:68:0x0313, B:70:0x032d, B:72:0x033b, B:87:0x03bc, B:89:0x03c6, B:91:0x03f2, B:92:0x03ff, B:438:0x0dda, B:443:0x0dfa, B:445:0x0e08, B:446:0x0e2b, B:448:0x0e37, B:450:0x0e4d, B:451:0x0e59, B:453:0x0e5f, B:455:0x0e87, B:533:0x1136, B:459:0x0e9c, B:462:0x0ec4, B:466:0x0ece, B:468:0x0ef6, B:469:0x0efa, B:472:0x0f10, B:477:0x0f49, B:479:0x0f52, B:481:0x0f90, B:482:0x0f96, B:486:0x0fac, B:488:0x0fb2, B:489:0x0fbf, B:491:0x0fc5, B:493:0x0fd3, B:495:0x0fe4, B:497:0x0fea, B:498:0x0ff0, B:500:0x1000, B:502:0x101b, B:504:0x1021, B:506:0x102d, B:508:0x1040, B:511:0x1048, B:513:0x1051, B:516:0x1058, B:518:0x107a, B:520:0x1080, B:522:0x108c, B:524:0x1092, B:525:0x10a1, B:527:0x10af, B:529:0x10b7, B:531:0x10db, B:517:0x106b, B:485:0x0f9d, B:473:0x0f24, B:475:0x0f3d, B:535:0x114c, B:449:0x0e3c, B:74:0x0347, B:76:0x036a, B:79:0x0377, B:82:0x03a0, B:84:0x03a6, B:85:0x03b0, B:69:0x0318, B:96:0x0425, B:98:0x0439, B:100:0x044e, B:103:0x045b, B:105:0x0499, B:111:0x04d5, B:114:0x05a9, B:116:0x05b5, B:118:0x05be, B:120:0x05c4, B:122:0x05d0, B:124:0x05d7, B:128:0x05e1, B:130:0x05e7, B:425:0x0d3c, B:424:0x0d39, B:426:0x0d6f, B:428:0x0d95, B:431:0x0da0, B:433:0x0daa, B:131:0x05ed, B:99:0x043e, B:61:0x028a, B:37:0x01c3, B:31:0x016e, B:33:0x017a), top: B:574:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x10d9  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x114a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b42 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b10 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0a2b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0b2d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String searchContent(java.lang.String r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 4447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.searchContent(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0330 A[Catch: Exception -> 0x0435, TryCatch #5 {Exception -> 0x0435, blocks: (B:3:0x0019, B:6:0x0038, B:9:0x0041, B:11:0x0057, B:13:0x0074, B:14:0x0078, B:42:0x0186, B:43:0x0204, B:46:0x0213, B:47:0x023b, B:48:0x0292, B:50:0x029b, B:51:0x02ab, B:53:0x02b4, B:55:0x02b8, B:57:0x02c3, B:59:0x02ed, B:62:0x02f8, B:64:0x0300, B:66:0x030c, B:68:0x0312, B:71:0x032c, B:73:0x0330, B:75:0x0348, B:81:0x0388, B:83:0x038e, B:85:0x0394, B:86:0x0397, B:89:0x03a7, B:79:0x0371, B:90:0x03b6, B:92:0x03be, B:94:0x03ca, B:95:0x03cd, B:96:0x03d0, B:98:0x03d8, B:100:0x03e4, B:101:0x03e7, B:102:0x03ea, B:104:0x03f2, B:106:0x03f8, B:107:0x03fb, B:108:0x03fe, B:41:0x0182, B:10:0x0055), top: B:123:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String xpDetailContent(java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.xpDetailContent(java.util.List):java.lang.String");
    }
}
