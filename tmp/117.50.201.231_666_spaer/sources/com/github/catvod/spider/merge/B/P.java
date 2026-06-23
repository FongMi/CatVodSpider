package com.github.catvod.spider.merge.b;

import android.util.Base64;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0603l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class P {
    private static String vodname;

    private static final class a {
        static volatile P a = new P();
    }

    P() {
    }

    public static P a() {
        return a.a;
    }

    public static String addDanmaku(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("danmaku", Proxy.getUrl() + "?do=danmu&site=wangpan");
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    private static Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        map.put("Content-Type", "application/json;charset=UTF-8");
        map.put("Referer", "https://yun.139.com/");
        map.put("x-deviceinfo", "||3|12.27.0|chrome|131.0.0.0|1||windows 10|546X902|zh-CN|||");
        map.put("hcy-cool-flag", "1");
        map.put("authorization", "");
        return map;
    }

    public static List<String[]> fetchJsonData(String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        j(str, str2, "", 0, "", arrayList);
        return arrayList;
    }

    private static String g(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal;
        SecretKeySpec secretKeySpec = new SecretKeySpec("PVGDwmcvfs1uV3d1".getBytes(StandardCharsets.UTF_8), "AES");
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (obj instanceof String) {
            bArrDoFinal = cipher.doFinal(((String) obj).getBytes(StandardCharsets.UTF_8));
        } else {
            if (!(obj instanceof Object)) {
                throw new IllegalArgumentException("Unsupported data type");
            }
            bArrDoFinal = cipher.doFinal(new String(Base64.encode(obj.toString().getBytes(StandardCharsets.UTF_8), 0)).getBytes(StandardCharsets.UTF_8));
        }
        byte[] bArr2 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
        return Base64.encodeToString(bArr2, 0);
    }

    private static Map<String, String> i() {
        return C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36  115Browser/26.0.7.2", "Referer", "https://yun.139.com/");
    }

    private static void j(String str, String str2, String str3, int i, String str4, List<String[]> list) throws JSONException {
        String str5;
        StringBuilder sbA = C0547k.a("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"", str2);
        if (i == 0) {
            sbA.append("\",\"passwd\":\"\",\"caSrt\":1,\"coSrt\":1,\"srtDr\":0,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}");
        } else {
            sbA.append("\",\"passwd\":\"\",\"caSrt\":1,\"coSrt\":1,\"srtDr\":0,\"bNum\":1,\"pCaID\":\"");
            sbA.append(str4);
            sbA.append("\",\"eNum\":200}}");
        }
        String strA = C0575b.f(str, g(sbA.toString()).replaceAll("[\\r\\n]", ""), f()).a();
        if (strA == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(k(strA, "PVGDwmcvfs1uV3d1"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2.has("coLst") && !jSONObject2.isNull("coLst")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("coLst");
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                String string = jSONObject3.getString("path");
                String string2 = jSONObject3.getString("coName");
                String string3 = jSONObject3.getString("coID");
                long j = jSONObject3.getLong("coSize");
                if (C0590I.m126i(string2)) {
                    String strA2 = C0544h.a(str2, Marker.ANY_NON_NULL_MARKER, string, Marker.ANY_NON_NULL_MARKER, string3);
                    if (j >= 1073741824) {
                        double d = 1073741824L;
                        double d2 = j;
                        Double.isNaN(d2);
                        Double.isNaN(d);
                        str5 = String.format("%.2f GB", Double.valueOf(d2 / d));
                    } else {
                        double d3 = 1048576L;
                        double d4 = j;
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        str5 = String.format("%.2f MB", Double.valueOf(d4 / d3));
                    }
                    StringBuilder sbA2 = C0529a.a("");
                    if (!str3.isEmpty()) {
                        sbA2.append("[");
                        sbA2.append(str3);
                        sbA2.append("]");
                    }
                    sbA2.append(string2);
                    sbA2.append("[");
                    sbA2.append(str5);
                    sbA2.append("]");
                    list.add(new String[]{strA2, sbA2.toString()});
                }
                i2 = i3 + 1;
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (!jSONObject4.has("caLst") || jSONObject4.isNull("caLst")) {
            return;
        }
        JSONArray jSONArray2 = jSONObject4.getJSONArray("caLst");
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= jSONArray2.length()) {
                return;
            }
            JSONObject jSONObject5 = jSONArray2.getJSONObject(i5);
            j(str, str2, jSONObject5.getString("caName"), 1, jSONObject5.getString("path"), list);
            i4 = i5 + 1;
        }
    }

    private static String k(String str, String str2) throws Exception {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length - 16;
        byte[] bArr = new byte[16];
        System.arraycopy(bArrDecode, 0, bArr, 0, 16);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 16, bArr2, 0, length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr2), charset);
    }

    private static JSONObject makeApiRequest(String str, String str2) throws Exception {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = new JSONObject(C0575b.f(str, str2, i()).a());
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("contentInfo")) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("contentName");
            int iLastIndexOf = strOptString.lastIndexOf(".");
            if (iLastIndexOf > -1) {
                strOptString = strOptString.substring(0, iLastIndexOf);
            }
            C0603l.a("danmuvodindex", strOptString);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.github.catvod.spider.merge.c.C0554e a(java.lang.String r10, java.lang.String r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.P.a(java.lang.String, java.lang.String):com.github.catvod.spider.merge.c.e");
    }

    public String q(String[] strArr) throws JSONException {
        if (strArr == null || strArr.length < 3) {
            return "";
        }
        String str = strArr[0];
        String str2 = strArr[1];
        C0552c c0552cU = new C0552c().u(makeApiRequest("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getContentInfoFromOutLink", "{\"getContentInfoFromOutLinkReq\":{\"contentId\":\"" + strArr[2] + "\",\"linkID\":\"" + str + "\",\"account\":\"\"},\"commonAccountInfo\":{\"account\":\"\",\"accountType\":1}}").getJSONObject("data").getJSONObject("contentInfo").getString("presentURL"));
        c0552cU.e(i());
        return addDanmaku(c0552cU.toString());
    }
}
