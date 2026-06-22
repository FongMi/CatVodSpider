package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0208a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class AppGet extends Spider {
    private static Map<String, Boolean> f = new HashMap();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    private String a(String str, String str2) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            Map<String, String> mapB = b();
            HashMap map = (HashMap) mapB;
            map.put(C0098a.a(new byte[]{86, -100, -55, 30, -101, -39, -126, 0, 65, -118, -41, 15}, new byte[]{21, -13, -89, 106, -2, -73, -10, 45}), C0098a.a(new byte[]{-82, -55, 95, 6, -25, -127, 4, 35, -90, -42, 65, 69, -10, -49, 18, 32, -72, -108, 73, 5, -4, -113, 72, 34, -67, -43, 74, 4, -19, -115, 1, 50, -85}, new byte[]{-49, -71, 47, 106, -114, -30, 101, 87}));
            map.put(C0098a.a(new byte[]{-86, -113, 127, -94, -33, -36, 21, -117, -26, -101, 106, -7, -61, -52, 21, -44, -94, -101}, new byte[]{-53, -1, 15, -113, -86, -81, 112, -7}), C0098a.a(new byte[]{-9, 30, -69, -65, -111, -60, -99, -75, -92, 67, -69, -65, -64, -110, -53, -67, -12, 25, -69, -73, -110, -108, -53, -80, -3, 79, -66, -70, -111, -103, -63, -79, -11}, new byte[]{-59, 123, -116, -114, -91, -95, -7, -124}));
            map.put(C0098a.a(new byte[]{-28, -85, 2, 24, 50, -123, 70, 37, -20, -76, 28, 24, 39, -113, 80, 51}, new byte[]{-123, -37, 114, 53, 68, -32, 52, 86}), this.e);
            map.put(C0098a.a(new byte[]{19, 36, -103, -68, -80, -65, 100, -19, 4, 49, -101, -8, -73, -74, 32, -76, 27, 57, -116}, new byte[]{114, 84, -23, -111, -47, -49, 13, -64}), strValueOf);
            map.put(C0098a.a(new byte[]{4, -81, -4, 48, -14, -46, -77, 120, 10, -69, -23}, new byte[]{101, -33, -116, 29, -121, -69, -98, 21}), C0098a.a(new byte[]{3, -19, -47, -63, -3}, new byte[]{111, -124, -74, -87, -119, 21, 4, 84}));
            return C0208a.b(new JSONObject(C0197c.g(this.a + str, str2, mapB).a()).getString(C0098a.a(new byte[]{69, 44, 127, 27}, new byte[]{33, 77, 11, 122, -18, -95, 34, 54})), this.b, this.c);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-122, 95, 127, -113, 22, 36, -115, 33, -67, 88}, new byte[]{-45, 44, 26, -3, 59, 101, -22, 68}), C0098a.a(new byte[]{26, -66, 84, -16, 102, 14, -48, -107, 91, -28, 8, -86, 43}, new byte[]{117, -43, 60, -124, 18, 126, -1, -90}));
        return map;
    }

    private String c(String str) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            return new JSONObject((String) ((Map) new Gson().fromJson(C0208a.b(new JSONObject(C0197c.a().newCall(new Request.Builder().url(this.a + this.d + C0098a.a(new byte[]{-95, 70, -86, -80, -19, -45, 107, -23, -21}, new byte[]{-114, 48, -59, -44, -67, -78, 25, -102})).method(C0098a.a(new byte[]{13, -5, 0, 9}, new byte[]{93, -76, 83, 93, 64, 18, -43, 107}), RequestBody.create(MediaType.parse(C0098a.a(new byte[]{98, -93, -18, 99, 48, -50, 24, 124, 106, -68, -16, 32, 33, -128, 14, 127, 116, -2, -8, 96, 43, -64, 84, 125, 113, -65, -5, 97, 58, -62, 29, 109, 103}, new byte[]{3, -45, -98, 15, 89, -83, 121, 8})), str)).addHeader(C0098a.a(new byte[]{111, 25, -16, 100, -41, -71, 125, -107, 84, 30}, new byte[]{58, 106, -107, 22, -6, -8, 26, -16}), C0098a.a(new byte[]{-108, -58, -53, 0, -98, 120, 101, -125, -43, -100, -105, 90, -45}, new byte[]{-5, -83, -93, 116, -22, 8, 74, -80})).addHeader(C0098a.a(new byte[]{47, 96, 70, -106, 1, -51, 84, -109, 3, 97}, new byte[]{108, 15, 40, -8, 100, -82, 32, -6}), C0098a.a(new byte[]{108, 13, -60, -115, -17, 11, 63, 109, 81, 13}, new byte[]{39, 104, -95, -3, -62, 74, 83, 4})).addHeader(C0098a.a(new byte[]{102, 3, 95, -78, -35, 9, -30, -98, 113, 21, 65, -93}, new byte[]{37, 108, 49, -58, -72, 103, -106, -77}), C0098a.a(new byte[]{4, 39, 54, -116, -10, 102, -73, -94, 12, 56, 40, -49, -25, 40, -95, -95, 18, 122, 32, -113, -19, 104, -5, -93, 23, 59, 35, -114, -4, 106, -78, -77, 1}, new byte[]{101, 87, 70, -32, -97, 5, -42, -42})).addHeader(C0098a.a(new byte[]{56, -120, -20, -51, 39, -91, 29, -103, 48, -105, -14, -51, 50, -81, 11, -113}, new byte[]{89, -8, -100, -32, 81, -64, 111, -22}), this.e).addHeader(C0098a.a(new byte[]{-38, -74, 7, 56, -96, -103, 64, 20, -44, -94, 18}, new byte[]{-69, -58, 119, 21, -43, -16, 109, 121}), C0098a.a(new byte[]{-54, 90, -53, -67, -101}, new byte[]{-90, 51, -84, -43, -17, -40, 12, 38})).addHeader(C0098a.a(new byte[]{9, -25, 36, -81, 121, 93, 46, 26, 69, -13, 49, -12, 101, 77, 46, 69, 1, -13}, new byte[]{104, -105, 84, -126, 12, 46, 75, 104}), C0098a.a(new byte[]{-70, 8, -99, 15, 101, -68, 96, 106, -23, 85, -99, 15, 52, -22, 54, 98, -71, 15, -99, 7, 102, -20, 54, 111, -80, 89, -104, 10, 101, -31, 60, 110, -72}, new byte[]{-120, 109, -86, 62, 81, -39, 4, 91})).addHeader(C0098a.a(new byte[]{-94, -9, -65, 57, 14, -34, 12, 106, -75, -30, -67, 125, 9, -41, 72, 51, -86, -22, -86}, new byte[]{-61, -121, -49, 20, 111, -82, 101, 71}), strValueOf).addHeader(C0098a.a(new byte[]{47, 114, -127, 86, 98, -26, 126, 82, 56, 103, -125, 18, 101, -17, 58, 12, 39, 101, -97}, new byte[]{78, 2, -15, 123, 3, -106, 23, 127}), Base64.encodeToString(C0208a.g(strValueOf, this.b, this.c), 2)).build()).execute().body().string()).getString(C0098a.a(new byte[]{-102, -128, 114, -77}, new byte[]{-2, -31, 6, -46, -27, -112, 55, -94})), this.b, this.c), Map.class)).get(C0098a.a(new byte[]{122, 74, -96, -100}, new byte[]{16, 57, -49, -14, 116, 61, 97, -29}))).getString(C0098a.a(new byte[]{-67, 91, 74}, new byte[]{-56, 41, 38, -46, -123, -106, 79, -22}));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        List<k> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-70, 123, 38, 68, -6, -50, -73}, new byte[]{-50, 2, 86, 33, -91, -89, -45, -92}), str);
            arrayList = parseVodList(new JSONObject(a(this.d + C0098a.a(new byte[]{120, 17, -121, -127, 61, -61, 86, -81, 35, 0, -116, -89, 55, -31, 115, -86, 36, 17, -63, -127, 57, -30, 90, -2}, new byte[]{87, 101, -2, -15, 88, -123, 63, -61}) + str2, jsonObject.toString())).optJSONArray(C0098a.a(new byte[]{74, 5, 36, 127, 31, -27, 112, 10, 92, 63, 43, 121, 1, -4}, new byte[]{56, 96, 71, 16, 114, -120, 21, 100})));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        k kVar;
        Exception exc;
        ArrayList arrayList;
        ArrayList arrayList2;
        k kVar2 = new k();
        try {
            JsonObject jsonObject = new JsonObject();
            byte b = 0;
            char c = 1;
            char c2 = 2;
            char c3 = 3;
            char c4 = 4;
            jsonObject.addProperty(C0098a.a(new byte[]{53, 124, 25, 121, -4, -76}, new byte[]{67, 19, 125, 38, -107, -48, 66, 104}), list.get(0));
            JSONObject jSONObject = new JSONObject(a(this.d + C0098a.a(new byte[]{49, 52, -23, 23, 68, 125, 54, 23, 119, 46}, new byte[]{30, 66, -122, 115, 0, 24, 66, 118}), jsonObject.toString()));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0098a.a(new byte[]{99, -72, -8}, new byte[]{21, -41, -100, 59, -79, 114, -117, -85}));
            String strDecode = URLDecoder.decode(new String(Base64.decode(C0098a.a(new byte[]{39, -77, -28, -11, -75, 122, 2, -113, 36, -50, -42, -21, -75, 62, 127, -45, 36, -107, -124, -56, -73, 23, 44, -21, 36, -107, -28, -10, -50, 59, 36, -50, 101, -47, -8, -43, -9, 101, 40, -38, 100, -75, -4, -74, -18, 43, 36, -42, 121, -113, -62, -16, -22, 43, 26, -115, 103, -47, -8, -53, -24, 59, 2, -7, 120, -47, -32, -40, -24, 101, 40, -51, 118, -75, -4, -82, -24, 101, 102, -128, 124, -99, -110, -92}, new byte[]{17, -6, -81, -103, -127, 78, 77, -72}), 0)), C0098a.a(new byte[]{-53, -64, -115, 26, -3}, new byte[]{-98, -108, -53, 55, -59, 57, 60, 15}));
            kVar2.g(list.get(0));
            kVar2.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{22, 120, -21, 87, -116, 103, -63, 32}, new byte[]{96, 23, -113, 8, -30, 6, -84, 69})));
            kVar2.i(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-95, -79, -9, 37, 101, -55, -88}, new byte[]{-41, -34, -109, 122, 21, -96, -53, 118})));
            kVar2.l(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{82, 23, -61, -108, 11, 20, -16, -98, 86, 19, -44}, new byte[]{36, 120, -89, -53, 121, 113, -99, -1})));
            kVar2.e(strDecode + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-63, 94, 0, 107, -33, -7, 66, 84, -46, 95, 16}, new byte[]{-73, 49, 100, 52, -68, -106, 44, 32})));
            kVar2.c(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{78, 43, -88, 60, 110, -65, 116, 43, 74}, new byte[]{56, 68, -52, 99, 15, -36, 0, 68})));
            kVar2.f(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{57, -14, 46, -105, 108, -42, -128, -65, 44, -23, 37, -70}, new byte[]{79, -99, 74, -56, 8, -65, -14, -38})));
            kVar2.b(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{71, 54, -54, -109, -126, -61, -113, -9, 66}, new byte[]{49, 89, -82, -52, -31, -81, -18, -124})));
            ArrayList arrayList3 = new ArrayList();
            arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0098a.a(new byte[]{-52, 28, -35, 77, -42, -39, 125, 118, -27, 31, -48, 97, -46}, new byte[]{-70, 115, -71, 18, -90, -75, 28, 15}));
            jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                try {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    byte[] bArr = new byte[11];
                    bArr[b] = -76;
                    bArr[c] = -117;
                    bArr[c2] = 61;
                    bArr[c3] = -93;
                    bArr[c4] = 84;
                    bArr[5] = -65;
                    bArr[6] = -40;
                    bArr[7] = -1;
                    bArr[8] = -86;
                    bArr[9] = -127;
                    bArr[10] = 51;
                    byte[] bArr2 = new byte[8];
                    bArr2[b] = -60;
                    bArr2[c] = -25;
                    bArr2[c2] = 92;
                    bArr2[c3] = -38;
                    bArr2[4] = 49;
                    bArr2[5] = -51;
                    bArr2[6] = -121;
                    bArr2[7] = -106;
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0098a.a(bArr, bArr2));
                    byte[] bArr3 = new byte[4];
                    bArr3[b] = 18;
                    bArr3[c] = -119;
                    bArr3[c2] = 24;
                    bArr3[c3] = -16;
                    byte[] bArr4 = new byte[8];
                    bArr4[b] = 97;
                    bArr4[c] = -31;
                    bArr4[c2] = 119;
                    bArr4[3] = -121;
                    bArr4[4] = 91;
                    bArr4[5] = -113;
                    bArr4[6] = -15;
                    bArr4[7] = -66;
                    String strOptString = jSONObjectOptJSONObject3.optString(C0098a.a(bArr3, bArr4));
                    byte[] bArr5 = new byte[11];
                    bArr5[b] = -27;
                    bArr5[c] = b;
                    bArr5[c2] = -52;
                    bArr5[3] = -92;
                    bArr5[4] = 55;
                    bArr5[5] = 44;
                    bArr5[6] = -26;
                    bArr5[7] = 22;
                    bArr5[8] = -5;
                    bArr5[9] = 10;
                    bArr5[10] = -62;
                    byte[] bArr6 = new byte[8];
                    bArr6[b] = -107;
                    bArr6[c] = 108;
                    bArr6[c2] = -83;
                    bArr6[3] = -35;
                    bArr6[4] = 82;
                    bArr6[5] = 94;
                    bArr6[6] = -71;
                    bArr6[7] = 127;
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(C0098a.a(bArr5, bArr6));
                    byte[] bArr7 = new byte[5];
                    bArr7[b] = 18;
                    bArr7[c] = -70;
                    bArr7[c2] = 51;
                    bArr7[3] = -24;
                    bArr7[4] = 69;
                    byte[] bArr8 = new byte[8];
                    bArr8[b] = 98;
                    bArr8[c] = -37;
                    bArr8[2] = 65;
                    bArr8[3] = -101;
                    bArr8[4] = 32;
                    bArr8[5] = -97;
                    bArr8[6] = -53;
                    bArr8[7] = -77;
                    String strOptString2 = jSONObjectOptJSONObject4.optString(C0098a.a(bArr7, bArr8));
                    byte[] bArr9 = new byte[4];
                    bArr9[b] = 109;
                    bArr9[c] = 3;
                    bArr9[2] = -117;
                    bArr9[3] = -92;
                    byte[] bArr10 = new byte[8];
                    bArr10[b] = 24;
                    bArr10[c] = 113;
                    bArr10[2] = -25;
                    bArr10[3] = -41;
                    bArr10[4] = -52;
                    bArr10[5] = 84;
                    bArr10[6] = 112;
                    bArr10[7] = 119;
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0098a.a(bArr9, bArr10));
                    ArrayList arrayList4 = new ArrayList();
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray2.length()) {
                        JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        String strOptString3 = jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{40, -53, 31}, new byte[]{93, -71, 115, -119, -33, 40, -42, -49}));
                        JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                        String strOptString4 = jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{90, -73, -43, 43, 58, -31, -42, 118, 67, -119, -46, 42, 51}, new byte[]{42, -42, -89, 88, 95, -66, -73, 6}));
                        k kVar3 = kVar2;
                        try {
                            String strOptString5 = jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{-34, -67, -105, -24, -54}, new byte[]{-86, -46, -4, -115, -92, 21, 45, -6}));
                            int i3 = i;
                            String strOptString6 = jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{-107, 109, -20, 19}, new byte[]{-5, 12, -127, 118, 121, -31, 95, -39}));
                            ArrayList arrayList5 = arrayList3;
                            if (strOptString4.matches(C0098a.a(new byte[]{97, -97, 46, 26, -37, -99, 44, 7, 16, -40, 116, 68}, new byte[]{63, -9, 90, 110, -85, -18, 19, 61}))) {
                                arrayList4.add(strOptString6 + C0098a.a(new byte[]{70}, new byte[]{98, -88, -65, 91, -13, -79, 107, 65}) + strOptString4 + C0098a.a(new byte[]{120}, new byte[]{4, -14, 63, 120, -118, 48, -98, -99}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-18, 119, 61, 111, -22, 44, 23, -8}, new byte[]{-104, 24, 89, 48, -124, 77, 122, -99})) + C0098a.a(new byte[]{-9}, new byte[]{-117, -97, 59, -36, 51, -15, 100, 60}) + jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{-31, 100, -112}, new byte[]{-113, 13, -12, -13, -77, 44, -62, 54})));
                            } else {
                                arrayList4.add(strOptString6 + C0098a.a(new byte[]{-15, -17, 83, 92, -58, -113, -90, -73, -91, -10, 15}, new byte[]{-43, -97, 50, 46, -75, -22, -7, -42}) + strOptString2 + C0098a.a(new byte[]{-7, -90, 114, 40, -59}, new byte[]{-33, -45, 0, 68, -8, 85, 6, 57}) + Base64.encodeToString(C0208a.g(strOptString3, this.b, this.c), 2) + C0098a.a(new byte[]{-13, -120, 38, -65, -43, 28, -96}, new byte[]{-43, -4, 73, -44, -80, 114, -99, -45}) + strOptString5 + C0098a.a(new byte[]{-24}, new byte[]{-108, 47, 98, 122, 124, 32, -91, 32}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{17, 96, -6, -90, -24, 72, -6, -89}, new byte[]{103, 15, -98, -7, -122, 41, -105, -62})) + C0098a.a(new byte[]{68}, new byte[]{56, -9, 31, 39, -6, 56, 84, -19}) + jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{23, 70, -3}, new byte[]{121, 47, -103, 65, 106, 77, 49, 126})));
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray;
                            jSONArrayOptJSONArray2 = jSONArray2;
                            kVar2 = kVar3;
                            i = i3;
                            arrayList3 = arrayList5;
                        } catch (Exception e) {
                            exc = e;
                            kVar = kVar3;
                            exc.printStackTrace();
                            return h.p(kVar);
                        }
                    }
                    ArrayList arrayList6 = arrayList3;
                    k kVar4 = kVar2;
                    JSONArray jSONArray3 = jSONArrayOptJSONArray;
                    int i4 = i;
                    arrayList.add(strOptString);
                    arrayList6.add(TextUtils.join(C0098a.a(new byte[]{-108}, new byte[]{-73, 93, 21, -44, -56, 30, 45, 3}), arrayList4));
                    i = i4 + 1;
                    jSONArrayOptJSONArray = jSONArray3;
                    arrayList3 = arrayList6;
                    kVar2 = kVar4;
                    b = 0;
                    c = 1;
                    c2 = 2;
                    c3 = 3;
                    c4 = 4;
                } catch (Exception e2) {
                    exc = e2;
                    kVar = kVar2;
                }
            }
            k kVar5 = kVar2;
            arrayList2 = arrayList3;
            try {
                kVar = kVar5;
            } catch (Exception e3) {
                e = e3;
                kVar = kVar5;
            }
        } catch (Exception e4) {
            e = e4;
            kVar = kVar2;
        }
        try {
            kVar.j(TextUtils.join(C0098a.a(new byte[]{-5, -100, 122}, new byte[]{-33, -72, 94, 80, -82, 4, -127, -53}), arrayList));
            kVar.k(TextUtils.join(C0098a.a(new byte[]{-48, -98, 110}, new byte[]{-12, -70, 74, -88, -20, 20, 35, -55}), arrayList2));
        } catch (Exception e5) {
            e = e5;
            exc = e;
            exc.printStackTrace();
        }
        return h.p(kVar);
    }

    public String edu(String str) {
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-12, 84, 3, -109, 4, -19, 55, -21, -10, 30, 88, -41, 6, -7, 57, -79, -77, 74, 20, -111, 16, -20, 57, -79, -77, 74, 20, -111, 16}, new byte[]{-36, 33, 113, -1, 57, -60, 31, -59})).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + URLEncoder.encode(matcher.group(2), C0098a.a(new byte[]{105, -88, 34, 24, 97}, new byte[]{60, -4, 100, 53, 89, -48, 120, 23})) + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String eduAesDecode(String str) {
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-87, -116, -42, -118, 9, 33, 2, 84, -81, -128, -100, -47, 77, 35, 22, 90, -11, -59, -56, -99, 11, 53, 3, 90, -11, -59, -56, -99, 11, 53}, new byte[]{-127, -86, -93, -8, 101, 28, 43, 124})).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + C0208a.b(matcher.group(2), this.b, this.c) + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String homeContent(boolean z) {
        char c;
        int i;
        int i2;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i3;
        ArrayList arrayList = new ArrayList();
        List<k> arrayList2 = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            c = 5;
            i = 8;
            i2 = 7;
            sb.append(C0098a.a(new byte[]{110, -68, 20, -13, -2}, new byte[]{65, -43, 122, -102, -118, 64, -112, 17}));
            JSONObject jSONObject = new JSONObject(a(sb.toString(), jsonObject.toString()));
            jSONArrayOptJSONArray = jSONObject.optJSONArray(C0098a.a(new byte[]{-96, 93, 63, -89, -70, -108, 97, -15, -74, 103, 48, -95, -92, -115}, new byte[]{-46, 56, 92, -56, -41, -7, 4, -97}));
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C0098a.a(new byte[]{59, -7, 24, 26, -82, 18, 10, 13, 59}, new byte[]{79, -128, 104, 127, -15, 126, 99, 126}));
            i3 = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            jSONArrayOptJSONArray2.getClass();
            if (i3 >= jSONArrayOptJSONArray2.length()) {
                break;
            }
            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
            byte[] bArr = new byte[i2];
            bArr[0] = 82;
            bArr[1] = -78;
            bArr[2] = -63;
            bArr[3] = 119;
            bArr[4] = 9;
            bArr[c] = -20;
            bArr[6] = 113;
            byte[] bArr2 = new byte[i];
            bArr2[0] = 38;
            bArr2[1] = -53;
            bArr2[2] = -79;
            bArr2[3] = 18;
            bArr2[4] = 86;
            bArr2[c] = -123;
            bArr2[6] = 21;
            bArr2[7] = -94;
            String string = jSONObject2.getString(C0098a.a(bArr, bArr2));
            JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i3);
            byte[] bArr3 = new byte[9];
            bArr3[0] = 101;
            bArr3[1] = -16;
            bArr3[2] = 37;
            bArr3[3] = -17;
            bArr3[4] = 50;
            bArr3[c] = -67;
            bArr3[6] = -20;
            bArr3[7] = 37;
            bArr3[8] = 116;
            arrayList.add(new C0135a(string, jSONObject3.getString(C0098a.a(bArr3, new byte[]{17, -119, 85, -118, 109, -45, -115, 72}))));
            i3++;
            c = 5;
            i = 8;
            i2 = 7;
            return h.t(arrayList, arrayList2);
        }
        arrayList2 = parseVodList(jSONArrayOptJSONArray);
        return h.t(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        String str2;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(C0098a.a(new byte[]{116, 44, 102}, new byte[]{1, 94, 10, -81, 13, -91, -52, -100}));
                if (string.contains(C0098a.a(new byte[]{0, 70, -83, -118, -121}, new byte[]{46, 44, -34, -27, -23, -110, -111, 74})) || string.contains(C0098a.a(new byte[]{-54, -16, -30, 33}, new byte[]{-28, -124, -102, 85, -111, -8, -65, -68}))) {
                    str2 = C0197c.l(string, null) + C0098a.a(new byte[]{-75, -18, 108, 34, -38, -57, 123, 58, -75}, new byte[]{-102, -113, 28, 75, -12, -73, 19, 74});
                } else {
                    str2 = string + C0098a.a(new byte[]{-28, 84, 40, -58, 25, 58, 108, -41, -28}, new byte[]{-53, 53, 88, -81, 55, 74, 4, -89});
                }
                this.a = str2;
                this.b = jSONObject.getString(C0098a.a(new byte[]{-4, 99, 12, -17, 28, 50, 71}, new byte[]{-104, 2, 120, -114, 87, 87, 62, 31}));
                this.c = jSONObject.getString(C0098a.a(new byte[]{-82, -18, -63, 81, -124, 67, -44}, new byte[]{-54, -113, -75, 48, -49, 38, -83, 117}));
                this.d = jSONObject.getString(C0098a.a(new byte[]{36, -18, 46, 72, -109, -61, -41}, new byte[]{87, -121, 90, 45, -46, -77, -66, -120})) + C0098a.a(new byte[]{-104, -107, -39, -46, -124, 22, 63, -75, -105, -127, -52, -53}, new byte[]{-7, -27, -87, -77, -12, 127, 17, -36});
                this.e = jSONObject.getString(C0098a.a(new byte[]{-45, 112, 13, -81, 58, 117, 16}, new byte[]{-91, 21, 127, -36, 83, 26, 126, -18}));
            }
            f = Init.getKeywordsMap();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<k> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString(C0098a.a(new byte[]{-25, -45, 76, -34, -67, 12, -52, 122}, new byte[]{-111, -68, 40, -127, -45, 109, -95, 31}));
                if (f.isEmpty() || !f.containsKey(strOptString)) {
                    arrayList.add(new k(jSONObject.optString(C0098a.a(new byte[]{87, -21, 51, -125, -30, -119}, new byte[]{33, -124, 87, -36, -117, -19, -57, 77})), strOptString, jSONObject.optString(C0098a.a(new byte[]{126, 46, -12, -124, 50, -76, -95}, new byte[]{8, 65, -112, -37, 66, -35, -62, 58})), jSONObject.optString(C0098a.a(new byte[]{-57, 27, -53, -36, -33, 15, 25, 100, -61, 31, -36}, new byte[]{-79, 116, -81, -125, -83, 106, 116, 5}))));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split(C0098a.a(new byte[]{61, 102}, new byte[]{97, 26, -101, 113, -18, -114, -64, 82}));
            String strEduAesDecode = strArrSplit[0];
            String str3 = Proxy.getUrl() + C0098a.a(new byte[]{-112, 124, 14, 98, -14, -125, 58, -100, -38, 62, 23, 48, -14, -84, 53, -100, -54, 37}, new byte[]{-81, 24, 97, 95, -106, -30, 84, -15}) + strArrSplit[1] + C0098a.a(new byte[]{-105, 45, 87, 113, -107, -23, 109, -9, -55, 102}, new byte[]{-79, 91, 56, 21, -36, -121, 9, -110}) + strArrSplit[2] + C0098a.a(new byte[]{-45, 115, 57, 35, -83, -76, 126, 120}, new byte[]{-11, 5, 86, 71, -8, -58, 18, 69});
            Map<String, String> mapB = b();
            ((HashMap) mapB).put(C0098a.a(new byte[]{23, 4, 124, -45, 60, -102, 90, 44, 44, 3}, new byte[]{66, 119, 25, -95, 17, -37, 61, 73}), C0098a.a(new byte[]{-59, -47, -40, 75, -120, 39, 68, 12, -67, -112, -110, 2, -52, 28, 76, 77, -20, -47, -43, 81, -60, 5, 113, 3, -71, -114, -116, 18, -33, 107, 114, 74, -26, -120, -106, 25, -60, 51, 19, 23, -95, -98, -29, 82, -108, 39, 64, 116, -19, -36, -23, 75, -112, 100, 16, 16, -65, -112, -111, 20, -60, 99, 110, 107, -36, -13, -18, 14, -60, 39, 76, 72, -19, -98, -27, 71, -121, 32, 74, 10, -88, -3, -54, 80, -117, 38, 64, 12, -71, -113, -107, 12, -44, 101, 21, 13, -72, -98, -15, 67, -126, 42, 87, 74, -89, -117, -111, 21, -54, 120, 19}, new byte[]{-120, -66, -94, 34, -28, 75, 37, 35}));
            if (strEduAesDecode.matches(C0098a.a(new byte[]{55, 109, -76, -119, -67, 38, 28, -40, 70, 42, -18, -41}, new byte[]{105, 5, -64, -3, -51, 85, 35, -30})) && (strEduAesDecode.contains(C0098a.a(new byte[]{108, -1, -120, 126, 11}, new byte[]{83, -118, -6, 18, 54, 101, 81, -58})) || strEduAesDecode.contains(C0098a.a(new byte[]{19, -114, -36, -32, -123}, new byte[]{44, -27, -71, -103, -72, 27, -65, 102})))) {
                String strOptString = new JSONObject(C0197c.l(strEduAesDecode, b())).optString(C0098a.a(new byte[]{-113, 10, -110}, new byte[]{-6, 120, -2, 121, 59, -35, -76, 11}));
                h hVarE = h.e();
                hVarE.y(strOptString);
                hVarE.a(str3);
                hVarE.f(mapB);
                return hVarE.o();
            }
            if (strEduAesDecode.matches(C0098a.a(new byte[]{5, -80, -121, 123, -118, 22, 63, -47, 70, -22, -101, 106, -44, 8, 113, -124, 5, -80}, new byte[]{43, -102, -81, 22, -71, 99, 7, -83}))) {
                h hVarE2 = h.e();
                hVarE2.y(strEduAesDecode);
                hVarE2.a(str3);
                hVarE2.f(b());
                return hVarE2.o();
            }
            if (strEduAesDecode.contains(C0098a.a(new byte[]{59, 56, -115, -48, -125}, new byte[]{4, 77, -1, -68, -66, -31, -11, 90})) || strEduAesDecode.contains(C0098a.a(new byte[]{-3, -93, -48, 38, -4}, new byte[]{-62, -56, -75, 95, -63, 9, 124, -7})) || strEduAesDecode.contains(C0098a.a(new byte[]{18, -28, 74, -39}, new byte[]{122, -112, 39, -75, -107, 55, -79, -74}))) {
                strEduAesDecode = eduAesDecode(strEduAesDecode);
                Matcher matcher = Pattern.compile(C0098a.a(new byte[]{110, 13, 30, 2, -31, -128, -59, -35, 54, 20, 66, 89, -70, -53, -80, -125, 111, 85, 64, 77, -76, -111, -11, -41, 35, 19, 86, 88, -76, -111, -11, -41, 35, 19, 86}, new byte[]{70, 125, 127, 112, -110, -27, -102, -68})).matcher(strEduAesDecode);
                if (matcher.find()) {
                    String strOptString2 = new JSONObject(C0197c.k(matcher.group(2))).optJSONObject(C0098a.a(new byte[]{27, 71, -46, -26}, new byte[]{127, 38, -90, -121, -24, 29, -122, 42})).optString(C0098a.a(new byte[]{-20, -123, -41}, new byte[]{-103, -9, -69, 23, -121, 9, -14, 92}));
                    if (!strOptString2.isEmpty()) {
                        h hVarE3 = h.e();
                        hVarE3.y(strOptString2);
                        hVarE3.a(str3);
                        hVarE3.f(mapB);
                        return hVarE3.o();
                    }
                    String strC = C0197c.c(strOptString2, b());
                    h hVarE4 = h.e();
                    hVarE4.y(strC);
                    hVarE4.a(str3);
                    hVarE4.f(mapB);
                    return hVarE4.o();
                }
            }
            String strC2 = c(edu(strEduAesDecode));
            if (!strC2.isEmpty()) {
                h hVarE5 = h.e();
                hVarE5.y(strC2);
                hVarE5.a(str3);
                hVarE5.f(mapB);
                return hVarE5.o();
            }
            String strC3 = C0197c.c(strC2, b());
            h hVarE6 = h.e();
            hVarE6.y(strC3);
            hVarE6.a(str3);
            hVarE6.f(mapB);
            return hVarE6.o();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        List<k> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{111, 76, -1, -5, 2, -10, 112}, new byte[]{27, 53, -113, -98, 93, -97, 20, -50}), 0);
            jsonObject.addProperty(C0098a.a(new byte[]{36, 65, 7, 106, 60, -110, 102, -23}, new byte[]{79, 36, 126, 29, 83, -32, 2, -102}), str);
            jsonObject.addProperty(C0098a.a(new byte[]{-71, -63, 16, -95}, new byte[]{-55, -96, 119, -60, 9, 5, 114, 19}), 1);
            arrayList = parseVodList(new JSONObject(a(this.d + C0098a.a(new byte[]{-54, -23, -124, -32, -66, -106, 37, -48, -116, -23, -107}, new byte[]{-27, -102, -31, -127, -52, -11, 77, -100}), jsonObject.toString())).optJSONArray(C0098a.a(new byte[]{42, 118, 126, -64, -55, 86, 13, 125, 48, 96, 107}, new byte[]{89, 19, 31, -78, -86, 62, 82, 17})));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return h.q(arrayList);
    }
}
