package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.K.VodResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;

public class GuaZi extends NetPan {
    public static /* synthetic */ int compareDesc(GuaZi guaZi, String a, String b) {
        return guaZi.getQualityScore(b) - guaZi.getQualityScore(a);
    }

    public static /* synthetic */ int compareDesc2(GuaZi guaZi, String a, String b) {
        return guaZi.getQualityScore(b) - guaZi.getQualityScore(a);
    }

    private String decryptAes(String hexCipher, String key, String iv) {
        try {
            // Hex 字符串转字节数组
            int length = hexCipher.length() / 2;
            byte[] cipherBytes = new byte[length];
            for (int i = 0; i < length; i++) {
                int offset = i * 2;
                cipherBytes[i] = (byte) Integer.parseInt(hexCipher.substring(offset, offset + 2), 16);
            }

            // AES/CBC 解密
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key.getBytes(), "AES"),
                    new IvParameterSpec(iv.getBytes()));

            return new String(cipher.doFinal(cipherBytes), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    private String encryptAes(String plaintext) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec("mvXBSW7ekreItNsT".getBytes(), "AES"), new IvParameterSpec("2U3IrJL8szAKp0Fj".getBytes()));
            byte[] bArrDoFinal = cipher.doFinal(plaintext.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private JSONObject apiRequest(JSONObject requestData, String apiPath) {
        try {
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            String encryptedData = encryptAes(requestData.toString());
            String signature = m("token_id=,token=1be86e8e18a9fa18b2b8d5432699dad0.ac008ed650fd087bfbecf2fda9d82e9835253ef24843e6b18fcd128b10763497bcf9d53e959f5377cde038c20ccf9d17f604c9b8bb6e61041def86729b2fc7408bd241e23c213ac57f0226ee656e2bb0a583ae0e4f3bf6c6ab6c490c9a6f0d8cdfd366aacf5d83193671a8f77cd1af1ff2e9145de92ec43ec87cf4bdc563f6e919fe32861b0e93b118ec37d8035fbb3c.59dd05c5d9a8ae726528783128218f15fe6f2c0c8145eddab112b374fcfe3d79,phone_type=1,request_key=" + encryptedData + ",app_id=1,time=" + timestamp + ",keys=Qmxi5ciWXbQzkr7o+SUNiUuQxQEf8/AVyUWY4T/BGhcXBIUz4nOyHBGf9A4KbM0iKF3yp9M7WAY0rrs5PzdTAOB45plcS2zZ0wUibcXuGJ29VVGRWKGwE9zu2vLwhfgjTaaDpXo4rby+7GxXTktzJmxvneOUdYeHi+PZsThlvPI=*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br");
            HashMap<String, String> params = new HashMap<>();
            params.put("token", "1be86e8e18a9fa18b2b8d5432699dad0.ac008ed650fd087bfbecf2fda9d82e9835253ef24843e6b18fcd128b10763497bcf9d53e959f5377cde038c20ccf9d17f604c9b8bb6e61041def86729b2fc7408bd241e23c213ac57f0226ee656e2bb0a583ae0e4f3bf6c6ab6c490c9a6f0d8cdfd366aacf5d83193671a8f77cd1af1ff2e9145de92ec43ec87cf4bdc563f6e919fe32861b0e93b118ec37d8035fbb3c.59dd05c5d9a8ae726528783128218f15fe6f2c0c8145eddab112b374fcfe3d79");
            params.put("token_id", "");
            params.put("phone_type", "1");
            params.put("time", timestamp);
            params.put("phone_model", "xiaomi-22021211rc");
            params.put("keys", "Qmxi5ciWXbQzkr7o+SUNiUuQxQEf8/AVyUWY4T/BGhcXBIUz4nOyHBGf9A4KbM0iKF3yp9M7WAY0rrs5PzdTAOB45plcS2zZ0wUibcXuGJ29VVGRWKGwE9zu2vLwhfgjTaaDpXo4rby+7GxXTktzJmxvneOUdYeHi+PZsThlvPI=");
            params.put("request_key", encryptedData);
            params.put("signature", signature);
            params.put("app_id", "1");
            params.put("ad_version", "1");
            String response = com.github.catvod.spider.merge.f0.HttpClient.g("https://api.w32z7vtd.com" + apiPath, params, buildCommonHeaders());
            if (TextUtils.isEmpty(response)) {
                return null;
            }
            JSONObject responseJson = new JSONObject(response);
            if (responseJson.getInt("code") != 200) {
                return null;
            }
            JSONObject data = responseJson.getJSONObject("data");
            JSONObject keys = new JSONObject(n(data.getString("keys")));
            return new JSONObject(decryptAes(data.getString("response_key"), keys.getString("key"), keys.getString("iv")));
        } catch (Exception unused) {
            return null;
        }
    }

    private Map<String, String> buildCommonHeaders() {
        HashMap mapB = com.github.catvod.spider.merge.B.MapBuilder.b("Version", "2406025", "PackageName", "com.uf076bf0c246.qe439f0d5e.m8aaf56b725a.ifeb647346f");
        mapB.put("Ver", "1.9.2");
        mapB.put("Referer", "https://api.w32z7vtd.com");
        mapB.put("Content-Type", "application/x-www-form-urlencoded");
        mapB.put("User-Agent", "okhttp/3.12.0");
        return mapB;
    }

    private int getQualityScore(String quality) {
        String normalized = quality.toLowerCase().replace("p", "");
        if (normalized.equals("8k")) {
            return 100;
        }
        if (normalized.equals("4k") || normalized.equals("2160")) {
            return 90;
        }
        if (normalized.equals("1440")) {
            return 80;
        }
        if (normalized.equals("1080")) {
            return 70;
        }
        if (normalized.equals("720")) {
            return 60;
        }
        if (normalized.contains("超清")) {
            return 50;
        }
        if (normalized.contains("高清")) {
            return 40;
        }
        return normalized.contains("标清") ? 30 : 10;
    }

    private String md5Hash(String input) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(input.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private String rsaDecrypt(String base64Cipher) {
        try {
            byte[] bArrDecode = Base64.decode(base64Cipher, 0);
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode("MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==", 0));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(2, keyFactory.generatePrivate(pKCS8EncodedKeySpec));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < bArrDecode.length) {
                int i2 = i + 256;
                byte[] bArrDoFinal = cipher.doFinal(Arrays.copyOfRange(bArrDecode, i, Math.min(i2, bArrDecode.length)));
                int i3 = 0;
                while (i3 < bArrDoFinal.length && bArrDoFinal[i3] == 0) {
                    i3++;
                }
                int i4 = 2;
                while (true) {
                    if (i4 >= bArrDoFinal.length) {
                        i4 = -1;
                        break;
                    }
                    if (bArrDoFinal[i4] == 0) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1) {
                    while (true) {
                        i4++;
                        if (i4 < bArrDoFinal.length) {
                            arrayList.add(Byte.valueOf(bArrDoFinal[i4]));
                        }
                    }
                } else {
                    while (i3 < bArrDoFinal.length) {
                        arrayList.add(Byte.valueOf(bArrDoFinal[i3]));
                        i3++;
                    }
                }
                i = i2;
            }
            byte[] bArr = new byte[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                bArr[i5] = ((Byte) arrayList.get(i5)).byteValue();
            }
            return new String(bArr, "UTF-8").trim();
        } catch (Exception unused) {
            return null;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        VodResult gVar;
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("area", map.containsKey("area") ? map.get("area") : "0");
        jSONObject.put("year", map.containsKey("year") ? map.get("year") : "0");
        jSONObject.put("pageSize", "20");
        jSONObject.put("sort", map.containsKey("sort") ? map.get("sort") : "d_id");
        jSONObject.put("page", str2);
        jSONObject.put("tid", str);
        JSONObject jSONObjectJ = apiRequest(jSONObject, "/App/IndexList/indexList");
        if (jSONObjectJ == null || !jSONObjectJ.has("list")) {
            gVar = new VodResult();
        } else {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObjectJ.getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                VodItem iVar = new VodItem();
                iVar.l(jSONObject2.getString("vod_id") + "/" + jSONObject2.optInt("vod_continu", 0));
                iVar.m(jSONObject2.getString("vod_name"));
                iVar.n(jSONObject2.getString("vod_pic"));
                if (jSONObject2.optInt("vod_continu", 0) == 0) {
                    string = "电影";
                } else {
                    StringBuilder sbB = BuilderUtils.b("更新至");
                    sbB.append(jSONObject2.optInt("vod_continu", 0));
                    sbB.append("集");
                    string = sbB.toString();
                }
                iVar.q(string);
                arrayList.add(iVar);
            }
            jSONObjectJ.optInt("totalPage", 999);
            gVar = new VodResult();
            gVar.y(arrayList);
            gVar.j(-1, -1, -1, -1);
        }
        return gVar.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0).split("/")[0];
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_id", "1649412");
        jSONObject.put("vod_id", str);
        jSONObject.put("mobile_time", String.valueOf(System.currentTimeMillis() / 1000));
        jSONObject.put("token", "1be86e8e18a9fa18b2b8d5432699dad0.ac008ed650fd087bfbecf2fda9d82e9835253ef24843e6b18fcd128b10763497bcf9d53e959f5377cde038c20ccf9d17f604c9b8bb6e61041def86729b2fc7408bd241e23c213ac57f0226ee656e2bb0a583ae0e4f3bf6c6ab6c490c9a6f0d8cdfd366aacf5d83193671a8f77cd1af1ff2e9145de92ec43ec87cf4bdc563f6e919fe32861b0e93b118ec37d8035fbb3c.59dd05c5d9a8ae726528783128218f15fe6f2c0c8145eddab112b374fcfe3d79");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vurl_cloud_id", "2");
        jSONObject2.put("vod_d_id", str);
        JSONObject jSONObjectJ = apiRequest(jSONObject, "/App/IndexPlay/playInfo");
        JSONObject jSONObjectJ2 = apiRequest(jSONObject2, "/App/Resource/Vurl/show");
        if (jSONObjectJ == null || !jSONObjectJ.has("vodInfo")) {
            return "";
        }
        JSONObject jSONObject3 = jSONObjectJ.getJSONObject("vodInfo");
        VodItem iVar = new VodItem();
        iVar.l(str);
        iVar.m(jSONObject3.getString("vod_name"));
        iVar.n(jSONObject3.getString("vod_pic"));
        iVar.s(jSONObject3.optString("vod_year", ""));
        iVar.i(jSONObject3.optString("vod_area", ""));
        iVar.h(jSONObject3.optString("vod_actor", ""));
        iVar.j(jSONObject3.optString("vod_use_content", "").trim());
        iVar.o("瓜子专线");
        ArrayList arrayList = new ArrayList();
        if (jSONObjectJ2 != null && jSONObjectJ2.has("list")) {
            JSONArray jSONArray = jSONObjectJ2.getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4.has("play")) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("play");
                    ArrayList arrayList2 = new ArrayList();
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObject5.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject6 = jSONObject5.getJSONObject(next);
                        if (jSONObject6.has("param")) {
                            arrayList2.add(next);
                            map.put(next, jSONObject6.getString("param"));
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Collections.sort(arrayList2, new Comparator() { // from class: com.github.catvod.spider.merge.g0.k
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                return GuaZi.f(this.b, (String) obj, (String) obj2);
                            }
                        });
                        String strOptString = jSONArray.length() == 1 ? "正片" : jSONObject4.optString("name", String.valueOf(i + 1));
                        arrayList.add(strOptString + "$" + (((String) map.get(arrayList2.get(0))) + "||" + TextUtils.join("@", arrayList2)));
                    }
                }
            }
        }
        iVar.p(TextUtils.join("#", arrayList));
        return VodResult.m(iVar);
    }

    public String homeContent(boolean z) {
        ArrayList<com.github.catvod.spider.merge.K.VodCategory> arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("1", "电影"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("2", "电视剧"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("4", "动漫"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("3", "综艺"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("64", "短剧"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.github.catvod.spider.merge.K.VodCategory bVar : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new com.github.catvod.spider.merge.K.FilterValue("全部", "0"));
            for (int i = 2025; i >= 2005; i--) {
                arrayList3.add(new com.github.catvod.spider.merge.K.FilterValue(String.valueOf(i), String.valueOf(i)));
            }
            arrayList3.add(new com.github.catvod.spider.merge.K.FilterValue("更早", "2004"));
            arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("year", "年份", arrayList3));
            if (!bVar.b().equals("64")) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new com.github.catvod.spider.merge.K.FilterValue("全部", "0"));
                String[] strArr = {"大陆", "香港", "台湾", "美国", "韩国", "日本", "英国", "法国", "泰国", "印度", "其他"};
                for (int i2 = 0; i2 < 11; i2++) {
                    String str = strArr[i2];
                    arrayList4.add(new com.github.catvod.spider.merge.K.FilterValue(str, str));
                }
                arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("area", "地区", arrayList4));
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new com.github.catvod.spider.merge.K.FilterValue("最新", "d_id"));
            arrayList5.add(new com.github.catvod.spider.merge.K.FilterValue("最热", "d_hits"));
            arrayList5.add(new com.github.catvod.spider.merge.K.FilterValue("推荐", "d_score"));
            arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("sort", "排序", arrayList5));
            linkedHashMap.put(bVar.b(), arrayList2);
        }
        return VodResult.p(arrayList, linkedHashMap);
    }

    @Override // com.github.catvod.en.NetPan
    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\|\\|");
        if (strArrSplit.length < 2) {
            VodResult gVar = new VodResult();
            gVar.w("");
            return gVar.toString();
        }
        String str3 = strArrSplit[0];
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit[1].split("@")));
        HashMap map = new HashMap();
        for (String str4 : str3.split("&")) {
            String[] strArrSplit2 = str4.split("=");
            if (strArrSplit2.length > 0) {
                map.put(strArrSplit2[0], strArrSplit2.length > 1 ? strArrSplit2[1] : "");
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator() { // from class: com.github.catvod.spider.merge.g0.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return GuaZi.g(this.b, (String) obj, (String) obj2);
                }
            });
            map.put("resolution", (String) arrayList.get(0));
        }
        JSONObject jSONObjectJ = apiRequest(new JSONObject(map), "/App/Resource/VurlDetail/showOne");
        String strOptString = jSONObjectJ != null ? jSONObjectJ.optString("url", "") : "";
        VodResult gVar2 = new VodResult();
        gVar2.w(strOptString);
        gVar2.g(k());
        return gVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) throws JSONException {
        VodResult gVar;
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keywords", str);
        jSONObject.put("order_val", "1");
        jSONObject.put("page", str2);
        JSONObject jSONObjectJ = apiRequest(jSONObject, "/App/Index/findMoreVod");
        if (jSONObjectJ == null || !jSONObjectJ.has("list")) {
            gVar = new VodResult();
        } else {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObjectJ.getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string2 = jSONObject2.getString("vod_name");
                if (string2.toLowerCase().contains(str.toLowerCase())) {
                    VodItem iVar = new VodItem();
                    iVar.l(jSONObject2.getString("vod_id") + "/" + jSONObject2.optInt("vod_continu", 0));
                    iVar.m(string2);
                    iVar.n(jSONObject2.getString("vod_pic"));
                    if (jSONObject2.optInt("vod_continu", 0) == 0) {
                        string = "电影";
                    } else {
                        StringBuilder sbB = BuilderUtils.b("更新至");
                        sbB.append(jSONObject2.optInt("vod_continu", 0));
                        sbB.append("集");
                        string = sbB.toString();
                    }
                    iVar.q(string);
                    arrayList.add(iVar);
                }
            }
            jSONObjectJ.optInt("totalPage", 1);
            gVar = new VodResult();
            gVar.y(arrayList);
        }
        gVar.j(1, 1, 0, 1);
        return gVar.toString();
    }
}
