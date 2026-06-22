package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class AppRJ extends Spider {
    private String a;

    private String a(String str, Map<String, String> map) {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
        } catch (Exception e) {
            e = e;
        }
        try {
            sb.append(this.a);
            sb.append(str);
            String string = sb.toString();
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue());
            }
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(string).post(type.build()).addHeader(C0098a.a(new byte[]{-28, 124, -23, 0, 4, -50, -45, -81, -33, 123}, new byte[]{-79, 15, -116, 114, 41, -113, -76, -54}), C0098a.a(new byte[]{-38, -92, -35, -95, 112, 114, 47, 120, -34, -88, -38, -6, 110, 103, 99, 100, -38, -95, -39, -81, 125}, new byte[]{-75, -49, -75, -43, 4, 2, 2, 23})).build()).execute();
            if (!responseExecute.isSuccessful()) {
                return "";
            }
            String strString = responseExecute.body().string();
            SpiderDebug.log(C0098a.a(new byte[]{110, 6, -5, 33, 69, -112, -49, 10}, new byte[]{28, 99, -120, 84, 41, -28, -62, 0}) + strString);
            return strString;
        } catch (Exception e2) {
            e = e2;
            SpiderDebug.log(e.toString());
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strA = C0098a.a(new byte[]{-103, 110, -93, -61, 37, 68, -75, 81, -103, 108, -23, -100, 40, 116, -85, 81, -41, 106, -13, -124}, new byte[]{-74, 24, -112, -20, 77, 43, -40, 52});
        String str3 = (System.currentTimeMillis() / 1000) + "";
        String strA2 = C0207D.a(C0098a.a(new byte[]{4, 25, 58, -7, 25, 98, -79, 100, 64, 12, 114, -4, 2, 104, -68, 63, 1, 20, 121, -5, 11, 111, -84, 38, 64, 29, 37, -86, 79, 123, -29, 53, 4, 25, 127, -70, 11, 96}, new byte[]{51, 126, 74, -55, 123, 12, -43, 86}) + str3);
        HashMap map2 = new HashMap();
        map2.put(C0098a.a(new byte[]{-119, 56, 113, -48, -121, 0, -69, 2, -115}, new byte[]{-3, 81, 28, -75, -12, 116, -38, 111}), str3);
        map2.put(C0098a.a(new byte[]{-7, -77, 3, -71}, new byte[]{-118, -38, 100, -41, -123, 59, 50, 114}), strA2);
        map2.put(C0098a.a(new byte[]{19, -24, 124, 13, 21, -26, 3}, new byte[]{103, -111, 12, 104, 74, -113, 103, -67}), str);
        map2.put(C0098a.a(new byte[]{-9, 51, -72, -71, 119}, new byte[]{-101, 90, -43, -48, 3, -17, 23, -45}), C0098a.a(new byte[]{-127, -93}, new byte[]{-80, -111, 124, 16, 53, -19, 62, 38}));
        map2.put(C0098a.a(new byte[]{91, 5, 104, -88}, new byte[]{43, 100, 15, -51, 36, 120, -46, -74}), str2);
        if (map != null && map.containsKey(C0098a.a(new byte[]{4, -109, 27, 116}, new byte[]{101, -31, 126, 21, 51, -79, -62, 122}))) {
            map2.put(C0098a.a(new byte[]{116, -92, -118, -53}, new byte[]{21, -42, -17, -86, -101, -79, -66, -62}), map.get(C0098a.a(new byte[]{27, -126, -67, 25}, new byte[]{122, -16, -40, 120, -55, -116, 31, -116})));
        }
        if (map != null && map.containsKey(C0098a.a(new byte[]{-115, -121, -125, -68, 58}, new byte[]{-18, -21, -30, -49, 73, -21, 102, -93}))) {
            map2.put(C0098a.a(new byte[]{22, -107, 46, 15, 94}, new byte[]{117, -7, 79, 124, 45, -113, -97, -99}), map.get(C0098a.a(new byte[]{-84, 90, 61, 115, -112}, new byte[]{-49, 54, 92, 0, -29, 117, -13, 41})));
        }
        if (map != null && map.containsKey(C0098a.a(new byte[]{47, -39, -61, 96}, new byte[]{67, -72, -83, 7, 59, 10, 8, 98}))) {
            map2.put(C0098a.a(new byte[]{75, 114, -32, 77}, new byte[]{39, 19, -114, 42, 99, 114, -63, 59}), map.get(C0098a.a(new byte[]{5, -52, 47, 52}, new byte[]{105, -83, 65, 83, -61, 90, 68, 116})));
        }
        if (map != null && map.containsKey(C0098a.a(new byte[]{69, -77, 75, 77}, new byte[]{60, -42, 42, 63, 54, 116, 5, -49}))) {
            map2.put(C0098a.a(new byte[]{-1, 46, -109, 10}, new byte[]{-122, 75, -14, 120, 113, -93, 88, -62}), map.get(C0098a.a(new byte[]{-37, 108, -9, 102}, new byte[]{-94, 9, -106, 20, 120, 7, -59, 89})));
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(a(strA, map2)).optJSONObject(C0098a.a(new byte[]{64, 7, -81, -103}, new byte[]{36, 102, -37, -8, 114, -121, 46, -25})).optJSONArray(C0098a.a(new byte[]{1, 8, 4, 67}, new byte[]{109, 97, 119, 55, 119, 108, -54, -112}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{122, -77, -55, 58, 39, -60, -11}, new byte[]{12, -36, -83, 101, 87, -83, -106, 105}));
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-50, -106, 51, 6, 109, -81, -86, -124, -52, -111, 34, 52, 127}, new byte[]{-72, -7, 87, 89, 29, -58, -55, -37}));
            }
            arrayList.add(new k(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-111, 28, 72, -80, 116, -53}, new byte[]{-25, 115, 44, -17, 29, -81, -51, -32})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-127, 22, 40, -5, -71, -19, -98, 57}, new byte[]{-9, 121, 76, -92, -41, -116, -13, 92})), strOptString, jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-34, -65, 108, 43, 28, -31, 89, -51, -38, -69, 123}, new byte[]{-88, -48, 8, 116, 110, -124, 52, -84}))));
        }
        h hVar = new h();
        hVar.k(Integer.valueOf(str2).intValue(), 0, 0, 0);
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        String str;
        int i = 8;
        String strA = C0098a.a(new byte[]{-16, 57, -69, -15, 112, 80, -18, -36, -16, 57, -25, -70, 71, 91, -26, -51, -66, 38, -28, -83}, new byte[]{-33, 79, -120, -34, 24, 63, -125, -71});
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() / 1000);
        String str2 = "";
        sb.append("");
        String string = sb.toString();
        String strA2 = C0207D.a(C0098a.a(new byte[]{44, 53, 101, -120, 13, 59, -106, 99, 104, 32, 45, -115, 22, 49, -101, 56, 41, 56, 38, -118, 31, 54, -117, 33, 104, 49, 122, -37, 91, 34, -60, 50, 44, 53, 32, -53, 31, 57}, new byte[]{27, 82, 21, -72, 111, 85, -14, 81}) + string);
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-127, -26, 127, 116, 7, -19, -68, -93, -123}, new byte[]{-11, -113, 18, 17, 116, -103, -35, -50}), string);
        int i2 = 4;
        map.put(C0098a.a(new byte[]{33, -29, 76, -81}, new byte[]{82, -118, 43, -63, -26, 122, 85, -13}), strA2);
        map.put(C0098a.a(new byte[]{7, -66, 20, 118, 44, 22}, new byte[]{113, -47, 112, 41, 69, 114, 5, -32}), list.get(0));
        JSONObject jSONObjectOptJSONObject = new JSONObject(a(strA, map)).optJSONObject(C0098a.a(new byte[]{-72, -116, -42, 90}, new byte[]{-36, -19, -94, 59, -97, -93, 88, 110}));
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-1, -15, -85, -83, 96, -84, -108, -63}, new byte[]{-119, -98, -49, -14, 14, -51, -7, -92})));
        String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{25, -102, 60, -125, 90, -70, -33}, new byte[]{111, -11, 88, -36, 42, -45, -68, -82}));
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{90, -100, -80, 32, -15, -64, -112, 103, 88, -101, -95, 18, -29}, new byte[]{44, -13, -44, 127, -127, -87, -13, 56}));
        }
        kVar.i(strOptString);
        kVar.l(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-38, -70, -33, 0, -12, 113, 122, 96, -34, -66, -56}, new byte[]{-84, -43, -69, 95, -122, 20, 23, 1})));
        kVar.e(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{85, 30, 16, 32, -50, -96, 54, -108, 70, 31, 0}, new byte[]{35, 113, 116, 127, -83, -49, 88, -32})));
        kVar.n(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{114, 47, 23, 62, -46, 124, 98, -63}, new byte[]{4, 64, 115, 97, -85, 25, 3, -77})));
        kVar.c(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{108, 9, 103, 118, -84, 95, -72, 44, 104}, new byte[]{26, 102, 3, 41, -51, 60, -52, 67})));
        kVar.f(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{47, -114, 79, 125, 13, -41, 35, -33, 58, -107, 68, 80}, new byte[]{89, -31, 43, 34, 105, -66, 81, -70})));
        kVar.m(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-77, 90, -110, 29, -86, 70, 84, 113, -74}, new byte[]{-59, 53, -10, 66, -55, 42, 53, 2})));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{-24, -113, -103, -35, -5, 36, -63, 48, -63, -116, -108, -15, -1}, new byte[]{-98, -32, -3, -126, -117, 72, -96, 73}));
        int i3 = 0;
        while (i3 < jSONArrayOptJSONArray.length()) {
            ArrayList arrayList3 = new ArrayList();
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
            byte[] bArr = new byte[i2];
            // fill-array-data instruction
            bArr[0] = 127;
            bArr[1] = -102;
            bArr[2] = 35;
            bArr[3] = -65;
            byte[] bArr2 = new byte[i];
            // fill-array-data instruction
            bArr2[0] = 17;
            bArr2[1] = -5;
            bArr2[2] = 78;
            bArr2[3] = -38;
            bArr2[4] = 86;
            bArr2[5] = -85;
            bArr2[6] = 33;
            bArr2[7] = -90;
            String string2 = jSONObjectOptJSONObject2.getString(C0098a.a(bArr, bArr2));
            byte[] bArr3 = new byte[i];
            // fill-array-data instruction
            bArr3[0] = -13;
            bArr3[1] = -76;
            bArr3[2] = -62;
            bArr3[3] = 69;
            bArr3[4] = -99;
            bArr3[5] = -78;
            bArr3[6] = -110;
            bArr3[7] = 106;
            String strOptString2 = jSONObjectOptJSONObject2.optString(C0098a.a(new byte[]{-122, -43}, bArr3));
            byte[] bArr4 = new byte[i2];
            // fill-array-data instruction
            bArr4[0] = -73;
            bArr4[1] = -35;
            bArr4[2] = 116;
            bArr4[3] = -76;
            byte[] bArr5 = new byte[i];
            // fill-array-data instruction
            bArr5[0] = -62;
            bArr5[1] = -81;
            bArr5[2] = 24;
            bArr5[3] = -57;
            bArr5[4] = -122;
            bArr5[5] = -8;
            bArr5[6] = 4;
            bArr5[7] = -86;
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0098a.a(bArr4, bArr5));
            byte[] bArr6 = new byte[i];
            // fill-array-data instruction
            bArr6[0] = -121;
            bArr6[1] = -78;
            bArr6[2] = 99;
            bArr6[3] = 13;
            bArr6[4] = 36;
            bArr6[5] = -92;
            bArr6[6] = 54;
            bArr6[7] = 5;
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(C0098a.a(new byte[]{-9, -45, 17, 126, 65, -5, 67, 119, -21, -63}, bArr6));
            int i4 = 0;
            String strB = str2;
            while (true) {
                str = str2;
                if (i4 >= jSONArrayOptJSONArray3.length()) {
                    break;
                }
                StringBuilder sbC = C0133t.c(strB);
                sbC.append(jSONArrayOptJSONArray3.optString(i4));
                strB = C0133t.b(new byte[]{39}, new byte[]{103, 0, 83, 122, -71, 43, 24, -62}, sbC);
                i4++;
                str2 = str;
            }
            int i5 = 0;
            while (i5 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i5);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObjectOptJSONObject3.optString(C0098a.a(new byte[]{71, -28, -102, -25}, new byte[]{41, -123, -9, -126, -40, 6, -110, -82})));
                v.a(new byte[]{-45}, new byte[]{-9, -36, 94, 77, 27, -94, 46, -94}, sb2, strB);
                sb2.append(C0098a.a(new byte[]{99}, new byte[]{31, -40, -21, -82, 30, 68, -101, 86}));
                sb2.append(jSONObjectOptJSONObject3.optString(C0098a.a(new byte[]{32, 33, -23}, new byte[]{85, 83, -123, -84, 53, 11, -71, 120})));
                v.a(new byte[]{-107}, new byte[]{-23, 9, -74, -4, 103, 83, 16, -124}, sb2, strOptString2);
                sb2.append(C0098a.a(new byte[]{54}, new byte[]{74, 80, -6, 56, 49, -65, -34, 63}));
                sb2.append(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{119, -96, 127, 69, 104, -94, -41, -51}, new byte[]{1, -49, 27, 26, 6, -61, -70, -88})));
                sb2.append(C0098a.a(new byte[]{-1}, new byte[]{-125, 84, 69, -25, 84, 88, -38, -87}));
                sb2.append(jSONObjectOptJSONObject3.optString(C0098a.a(new byte[]{-96, 43, -37}, new byte[]{-50, 66, -65, 34, -15, -97, -121, 95})));
                arrayList3.add(sb2.toString());
                i5++;
                jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
            arrayList2.add(string2);
            arrayList.add(TextUtils.join(C0098a.a(new byte[]{-96}, new byte[]{-125, -16, -62, 12, 103, 77, -41, -50}), arrayList3));
            i3++;
            i = 8;
            i2 = 4;
            str2 = str;
        }
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-119, 101, -72}, new byte[]{-83, 65, -100, -8, 126, -36, 1, -44}), arrayList2));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{11, 8, 104}, new byte[]{47, 44, 76, 60, -53, 54, -71, 114}), arrayList));
        return h.p(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x05e0 A[Catch: Exception -> 0x0732, TryCatch #1 {Exception -> 0x0732, blocks: (B:4:0x0234, B:5:0x02b3, B:7:0x02b9, B:8:0x0373, B:10:0x0379, B:12:0x03d6, B:23:0x05d3, B:26:0x05e0, B:27:0x05ea, B:29:0x05f0, B:31:0x05fa, B:32:0x060a, B:33:0x060f, B:35:0x0616, B:14:0x0420, B:16:0x0468, B:17:0x04ad, B:19:0x04f6, B:20:0x0540, B:22:0x058a, B:37:0x06c1, B:38:0x0728), top: B:48:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x05d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r38) {
        /*
            Method dump skipped, instruction units count: 1857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppRJ.homeContent(boolean):java.lang.String");
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            char c = 1;
            char c2 = 3;
            char c3 = 4;
            String[] strArrSplit = str2.split(C0098a.a(new byte[]{58, 31}, new byte[]{102, 99, 51, 118, -49, 25, 40, -9}));
            String str3 = strArrSplit[0];
            String strOptString = strArrSplit[1];
            String strOptString2 = strArrSplit[2];
            String str4 = strArrSplit[3];
            String str5 = strArrSplit[4];
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit2 = str3.split(C0098a.a(new byte[]{63}, new byte[]{127, 35, 6, -76, 116, -79, -115, 107}));
                int i = 0;
                while (i < strArrSplit2.length) {
                    String str6 = strArrSplit2[i];
                    if (!TextUtils.isEmpty(str6)) {
                        HashMap map = new HashMap();
                        byte[] bArr = new byte[7];
                        bArr[0] = -89;
                        bArr[c] = 48;
                        bArr[2] = 53;
                        bArr[c2] = -50;
                        bArr[c3] = 67;
                        bArr[5] = -87;
                        bArr[6] = 60;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = -11;
                        bArr2[c] = 85;
                        bArr2[2] = 83;
                        bArr2[c2] = -85;
                        bArr2[4] = 49;
                        bArr2[5] = -52;
                        bArr2[6] = 78;
                        bArr2[7] = 49;
                        map.put(C0098a.a(bArr, bArr2), "");
                        String str7 = (System.currentTimeMillis() / 1000) + "";
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr3 = new byte[38];
                        bArr3[0] = 2;
                        bArr3[1] = 82;
                        bArr3[2] = -1;
                        bArr3[c2] = 77;
                        bArr3[4] = 22;
                        bArr3[5] = -92;
                        bArr3[6] = 10;
                        bArr3[7] = -2;
                        bArr3[8] = 70;
                        bArr3[9] = 71;
                        bArr3[10] = -73;
                        bArr3[11] = 72;
                        bArr3[12] = 13;
                        bArr3[13] = -82;
                        bArr3[14] = 7;
                        bArr3[15] = -91;
                        bArr3[16] = 7;
                        bArr3[17] = 95;
                        bArr3[18] = -68;
                        bArr3[19] = 79;
                        bArr3[20] = 4;
                        bArr3[21] = -87;
                        bArr3[22] = 23;
                        bArr3[23] = -68;
                        bArr3[24] = 70;
                        bArr3[25] = 86;
                        bArr3[26] = -32;
                        bArr3[27] = 30;
                        bArr3[28] = 64;
                        bArr3[29] = -67;
                        bArr3[30] = 88;
                        bArr3[31] = -81;
                        bArr3[32] = 2;
                        bArr3[33] = 82;
                        bArr3[34] = -70;
                        bArr3[35] = 14;
                        bArr3[36] = 4;
                        bArr3[37] = -90;
                        sb.append(C0098a.a(bArr3, new byte[]{53, 53, -113, 125, 116, -54, 110, -52}));
                        sb.append(str7);
                        JSONObject jSONObject = new JSONObject(C0197c.l(str6 + strOptString + C0098a.a(new byte[]{13, -44, 112, 19, 122, 121}, new byte[]{43, -89, 25, 116, 20, 68, 108, 43}) + C0207D.a(sb.toString()) + C0098a.a(new byte[]{99, -106, -16, -33, 127, 17, -127, -59, 40, -110, -92}, new byte[]{69, -30, -103, -78, 26, 98, -11, -92}) + str7, map));
                        strOptString = jSONObject.optString(C0098a.a(new byte[]{-98, 66, 94}, new byte[]{-21, 48, 50, -7, -127, 19, -62, -99}));
                        strOptString2 = jSONObject.optString(C0098a.a(new byte[]{-62, -37}, new byte[]{-105, -102, 60, -33, 103, 48, -68, -117}), strOptString2);
                        if (C0207D.o(strOptString)) {
                            break;
                        }
                    }
                    i++;
                    c = 1;
                    c2 = 3;
                    c3 = 4;
                }
            }
            if (!strOptString.startsWith(C0098a.a(new byte[]{78, 103, 6, 105}, new byte[]{38, 19, 114, 25, -23, -58, 16, -20}))) {
                return "";
            }
            String str8 = Proxy.getUrl() + C0098a.a(new byte[]{30, 65, 27, -79, -86, 111, 112, 11, 84, 3, 2, -29, -86, 64, 127, 11, 68, 24}, new byte[]{33, 37, 116, -116, -50, 14, 30, 102}) + str4 + C0098a.a(new byte[]{-31, 31, 87, -41, 106, -111, -70, 13, -65, 84}, new byte[]{-57, 105, 56, -77, 35, -1, -34, 104}) + str5 + C0098a.a(new byte[]{4, 98, -91, 88, -64, -24, 83, 19}, new byte[]{34, 20, -54, 60, -107, -102, 63, 46});
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(strOptString2)) {
                map2.put(C0098a.a(new byte[]{-62, 75, 7, -124, 52, 123, 57, -12, -7, 76}, new byte[]{-105, 56, 98, -10, 25, 58, 94, -111}), strOptString2);
            }
            h hVar = new h();
            hVar.m(0);
            hVar.y(strOptString);
            hVar.a(str8);
            return hVar.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String strA = C0098a.a(new byte[]{-32, 49, -119, 91, -92, -8, 12, 3, -32, 52, -33, 21, -66, -12, 9}, new byte[]{-49, 71, -70, 116, -52, -105, 97, 102});
        String str2 = (System.currentTimeMillis() / 1000) + "";
        String strA2 = C0207D.a(C0098a.a(new byte[]{69, 40, 101, 39, 90, 85, 39, -58, 1, 61, 45, 34, 65, 95, 42, -99, 64, 37, 38, 37, 72, 88, 58, -124, 1, 44, 122, 116, 12, 76, 117, -105, 69, 40, 32, 100, 72, 87}, new byte[]{114, 79, 21, 23, 56, 59, 67, -12}) + str2);
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{116, -123, 22, -16, 32, 8, 89, -38, 112}, new byte[]{0, -20, 123, -107, 83, 124, 56, -73}), str2);
        map.put(C0098a.a(new byte[]{-116, -34, 62, -35}, new byte[]{-1, -73, 89, -77, 62, -38, -15, -79}), strA2);
        map.put(C0098a.a(new byte[]{15, 24, -17, -58, -126, -4, -20}, new byte[]{100, 125, -106, -79, -19, -114, -120, -45}), str);
        map.put(C0098a.a(new byte[]{23, -47, 46, 110, -63}, new byte[]{123, -72, 67, 7, -75, 69, -32, 127}), C0098a.a(new byte[]{-109, -69}, new byte[]{-94, -119, -17, 20, -91, -62, -29, 124}));
        map.put(C0098a.a(new byte[]{-34, 58, 118, 123}, new byte[]{-82, 91, 17, 30, 120, 23, -112, 109}), C0098a.a(new byte[]{49}, new byte[]{0, 108, -49, -34, 61, -104, 86, 14}));
        JSONArray jSONArrayOptJSONArray = new JSONObject(a(strA, map)).optJSONObject(C0098a.a(new byte[]{52, 80, -20, -44}, new byte[]{80, 49, -104, -75, 87, -26, 25, 31})).optJSONArray(C0098a.a(new byte[]{-119, 2, 12, -91}, new byte[]{-27, 107, 127, -47, -102, 7, -51, 120}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-58, -107, 73, 112, -91, -68, -88}, new byte[]{-80, -6, 45, 47, -43, -43, -53, -96}));
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-111, -87, 21, -68, -46, -102, 91, -55, -109, -82, 4, -114, -64}, new byte[]{-25, -58, 113, -29, -94, -13, 56, -106}));
            }
            arrayList.add(new k(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-73, 46, 113, -35, -43, -117}, new byte[]{-63, 65, 21, -126, -68, -17, -25, -122})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-79, 4, 76, 95, -4, -109, -74, 90}, new byte[]{-57, 107, 40, 0, -110, -14, -37, 63})), strOptString, jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{17, 121, -77, -116, 36, -52, -4, -50, 21, 125, -92}, new byte[]{103, 22, -41, -45, 86, -87, -111, -81}))));
        }
        return h.q(arrayList);
    }
}
