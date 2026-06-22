package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.q.f;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class SP360 extends Spider {
    private final String a = C0098a.a(new byte[]{65, 46, 114, 116, -10, 126, 114, 30, 57, 111, 56, 61, -78, 69, 122, 95, 104, 46, 127, 110, -70, 92, 71, 17, 58, 111, 57, 38, -70, 69, 92, 102, 58, 117, 33, 61, -37, 98, 99, 93, 105, 22, 109, 127, -47, 123, 103, 30, 57, 114, 63, 51, -87, 36, 51, 25, 71, 9, 92, 80, -42, 62, 51, 93, 101, 42, 109, 61, -35, 119, 112, 90, 99, 104, 40, 94, -14, 96, 124, 92, 105, 110, 59, 36, -76, 34, 61, 3, 61, 118, 57, 51, -83, 35, 51, 98, 109, 39, 105, 111, -13, 61, 38, 2, 59, 111, 59, 43}, new byte[]{12, 65, 8, 29, -102, 18, 19, 49});
    private String b = "";

    private String a(JSONArray jSONArray) {
        return jSONArray == null ? "" : jSONArray.toString().replace(C0098a.a(new byte[]{-21}, new byte[]{-55, -7, 82, -117, 69, -78, 7, -68}), "").replace(C0098a.a(new byte[]{-55}, new byte[]{-110, -34, -128, 13, -83, -103, -45, -101}), "").replace(C0098a.a(new byte[]{-123}, new byte[]{-40, -121, 42, -46, -15, 98, -48, -13}), "");
    }

    private String b(String str, String str2) {
        Response responseExecute = f.b().newCall(new Request.Builder().url(str).get().addHeader(C0098a.a(new byte[]{104, 2, -41, 44, -82, -25, 49, -68, 83, 5}, new byte[]{61, 113, -78, 94, -125, -90, 86, -39}), this.a).addHeader(C0098a.a(new byte[]{-11, -95, 63, -98, -49, 118, -82}, new byte[]{-89, -60, 89, -5, -67, 19, -36, -2}), str2).build()).execute();
        if (responseExecute.body() == null) {
            return "";
        }
        String strString = responseExecute.body().string();
        responseExecute.close();
        return strString;
    }

    private String c(String str, String str2) throws InterruptedException {
        String strB = "";
        for (int i = 0; i < 8; i++) {
            strB = b(str, C0098a.a(new byte[]{16, 98, -57, 13, 35, -48, -9, -64, 25, 102, -38, 83, 39, -113, -70, -63, 75, 32, -125, 22, 49, -124, -10, -116, 23, 123}, new byte[]{120, 22, -77, 125, 80, -22, -40, -17}));
            if (strB.contains(str2)) {
                break;
            }
            Thread.sleep(500L);
        }
        return strB;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String strA;
        String strB;
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            map2.putAll(map);
        }
        int i = 10;
        String strA2 = map2.get(C0098a.a(new byte[]{-119, 5}, new byte[]{-21, 124, 72, 58, 45, -58, -103, 107})) == null ? C0098a.a(new byte[]{9, 72, -113, 36, 6, -74, -24, -29, 8, 93}, new byte[]{123, 41, -31, 79, 106, -41, -100, -122}) : (String) map2.get(C0098a.a(new byte[]{-71, -92}, new byte[]{-37, -35, -2, 119, 94, -51, 72, 66}));
        String str3 = map2.get(C0098a.a(new byte[]{-49, -20, -54, 124, -7}, new byte[]{-84, -128, -85, 15, -118, 105, 67, 90})) == null ? "" : (String) map2.get(C0098a.a(new byte[]{-90, -93, -83, -31, -15}, new byte[]{-59, -49, -52, -110, -126, -30, -82, 89}));
        int i2 = 4;
        String str4 = map2.get(C0098a.a(new byte[]{-116, 83, -36, 23}, new byte[]{-11, 54, -67, 101, 49, -41, 67, -21})) == null ? "" : (String) map2.get(C0098a.a(new byte[]{-54, -64, -55, -34}, new byte[]{-77, -91, -88, -84, 120, -61, -119, 82}));
        String str5 = map2.get(C0098a.a(new byte[]{-8, -48, -4, 25}, new byte[]{-103, -94, -103, 120, 61, -127, -42, 38})) == null ? "" : (String) map2.get(C0098a.a(new byte[]{14, 26, 65, -80}, new byte[]{111, 104, 36, -47, 45, -24, 118, -98}));
        String str6 = map2.get(C0098a.a(new byte[]{-5, 14, 104, 122, 108}, new byte[]{-102, 109, 28, 21, 30, 123, -107, 30})) == null ? "" : (String) map2.get(C0098a.a(new byte[]{127, 110, -10, 20, 62}, new byte[]{30, 13, -126, 123, 76, -50, -120, -2}));
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-119, -5, 98, -4, -49}, new byte[]{-5, -102, 12, -105, -14, 117, 97, 55}, sb, strA2);
        sb.append(C0098a.a(new byte[]{-55, -36, -26, -67, -21}, new byte[]{-17, -65, -121, -55, -42, -63, 60, -61}));
        sb.append(URLEncoder.encode(str3));
        v.a(new byte[]{39, -22, -60, 47, -80, -110}, new byte[]{1, -109, -95, 78, -62, -81, -100, -53}, sb, str4);
        sb.append(C0098a.a(new byte[]{-50, -24, -25, 114, 73, -4}, new byte[]{-24, -119, -107, 23, 40, -63, 78, -93}));
        sb.append(URLEncoder.encode(str5));
        sb.append(C0098a.a(new byte[]{104, 115, -36, 72, 41}, new byte[]{78, 18, -65, 60, 20, -23, -66, -50}));
        sb.append(URLEncoder.encode(str6));
        byte b = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(C0098a.a(new byte[]{70}, new byte[]{119, 57, -8, -26, 94, -34, 83, 103}))) {
                    b = 0;
                }
                break;
            case 50:
                if (str.equals(C0098a.a(new byte[]{62}, new byte[]{12, -118, -69, -62, -16, 78, -113, 108}))) {
                    b = 1;
                }
                break;
            case 51:
                if (str.equals(C0098a.a(new byte[]{52}, new byte[]{7, 104, -97, -78, 28, 44, -55, 24}))) {
                    b = 2;
                }
                break;
            case 52:
                if (str.equals(C0098a.a(new byte[]{92}, new byte[]{104, 121, -94, -45, 110, -2, -128, 83}))) {
                    b = 3;
                }
                break;
        }
        if (b == 0) {
            C0098a.a(new byte[]{68, 63, 63, 45, -69, -56, -1, 28}, new byte[]{32, 86, 94, 67, -62, -95, -111, 123});
            strA = C0098a.a(new byte[]{124}, new byte[]{17, 93, 69, -42, -35, 10, 118, -52});
        } else if (b == 1) {
            C0098a.a(new byte[]{126, -76, 103, 10, 94, -51, 88}, new byte[]{26, -35, 6, 100, 45, -91, 49, -7});
            strA = C0098a.a(new byte[]{115, -37}, new byte[]{7, -83, -13, 67, 42, 50, 82, -31});
        } else if (b == 2) {
            C0098a.a(new byte[]{76, 1, 73, 10, -6, -25}, new byte[]{54, 110, 39, 109, -125, -114, -87, -110});
            strA = C0098a.a(new byte[]{-107, -120}, new byte[]{-29, -23, 33, 53, -30, 53, -17, 86});
        } else if (b != 3) {
            strA = "";
        } else {
            C0098a.a(new byte[]{-24, -85, -17, -16, 27, -89, 85}, new byte[]{-116, -60, -127, -105, 118, -58, 59, 49});
            strA = C0098a.a(new byte[]{-6, -95}, new byte[]{-103, -43, 70, -8, 17, 8, 112, -128});
        }
        StringBuilder sb2 = new StringBuilder();
        v.a(new byte[]{-97, 9, -25, 0, 0, 44, -26, 91, -106, 13, -6, 94, 4, 115, -85, 90, -60, 75, -93, 27, 18, 120, -25, 23, -104, 16, -68, 6, 66, 57, -81, 29, -101, 9, -10, 2, 92, 122, -96, 7, -125, 66, -16, 17, 7, 127, -83, 73}, new byte[]{-9, 125, -109, 112, 115, 22, -55, 116}, sb2, str);
        sb2.append(C0098a.a(new byte[]{-118}, new byte[]{-84, -119, 1, 99, -115, -48, -50, -114}));
        sb2.append((Object) sb);
        String strB2 = C0133t.b(new byte[]{-121, 85, -63, -5, -27, 48, -30, 78, -121, 69, -55, -19, -20, 111, -80, 24, -54, 27}, new byte[]{-95, 38, -88, -127, -128, 13, -47, 123}, sb2);
        int i3 = 23;
        C0098a.a(new byte[]{-110, 23, -13, -89, 112, 123, -91, 12, -115, 20, -16, -7, 48, 119, -70, 72, -101, 13, -87, -76, 108, 44, -91}, new byte[]{-6, 99, -121, -41, 3, 65, -118, 35});
        C0098a.a(new byte[]{-28, 85, 67, 76, 33, -38}, new byte[]{-53, 57, 42, 63, 85, -27, 1, 96});
        if (!str2.equals(C0098a.a(new byte[]{97}, new byte[]{80, 76, 17, 49, 124, 72, 74, -36}))) {
            StringBuilder sb3 = new StringBuilder();
            v.a(new byte[]{110, -86, 59, 16, 122, 102, -27, 17, 103, -82, 38, 78, 126, 57, -88, 16, 53, -24, 127, 11, 104, 50, -28, 93, 105, -77, 96, 22, 56, 115, -84, 87, 106, -86, 42, 18, 38, 48, -93, 77, 114, -31, 44, 1, 125, 53, -82, 3}, new byte[]{6, -34, 79, 96, 9, 92, -54, 62}, sb3, str);
            sb3.append(C0098a.a(new byte[]{-104}, new byte[]{-66, -68, -72, -26, -85, -47, 63, 100}));
            sb3.append((Object) sb);
            v.a(new byte[]{-113, -44, 52, -52, -59, -36, 42, 14, -113, -41, 60, -47, -59, -113, 118, 6}, new byte[]{-87, -89, 93, -74, -96, -31, 25, 59}, sb3, str2);
            strB2 = C0133t.b(new byte[]{93, 44, -114, 40, -118, -91, -59, -38, 16, 114}, new byte[]{123, 79, -17, 68, -26, -57, -92, -71}, sb3);
            C0098a.a(new byte[]{-67, 20, 118, 3, 26, -41, -108, 61, -94, 23, 117, 93, 90, -37, -117, 121, -76, 14, 44, 16, 6, -128, -108}, new byte[]{-43, 96, 2, 115, 105, -19, -69, 18});
            C0098a.a(new byte[]{-67, 39, -56, 90, -17, 34}, new byte[]{-110, 75, -95, 41, -101, 29, -63, 47});
            C0098a.a(new byte[]{94, 12, -13, 19, 51, 85, -124, 96}, new byte[]{120, 124, -110, 116, 86, 59, -21, 93});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = new JSONObject(c(strB2, C0098a.a(new byte[]{-35, 36, 34, -13, -103, 49, 62, -109, -108, 107}, new byte[]{-1, 73, 81, -108, -69, 11, 28, -4}))).optJSONObject(C0098a.a(new byte[]{-107, 22, -51, -105}, new byte[]{-15, 119, -71, -10, -30, -84, -76, 21})).optJSONArray(C0098a.a(new byte[]{5, -111, -75, -52, -30, 13}, new byte[]{104, -2, -61, -91, -121, 126, 113, -124}));
        int i4 = 0;
        while (i4 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-56, 118}, new byte[]{-95, 18, -93, 112, 118, -72, 66, 2}));
            StringBuilder sb4 = new StringBuilder();
            v.a(new byte[]{65, -63, -118, -8, 98, -100, 6, 9, 72, -59, -105, -90, 102, -61, 75, 8, 26, -125, -50, -29, 112, -56, 7, 69, 70, -40, -47, -2, 32, -119, 77, 67, 93, -44, -105, -28, 46, -59, 72, 82, 20}, new byte[]{41, -75, -2, -120, 17, -90, 41, 38}, sb4, str);
            byte[] bArr = new byte[i2];
            // fill-array-data instruction
            bArr[0] = 37;
            bArr[1] = 105;
            bArr[2] = -126;
            bArr[3] = -59;
            v.a(bArr, new byte[]{3, 0, -26, -8, -85, 37, 124, 127}, sb4, strOptString);
            byte[] bArr2 = new byte[i];
            // fill-array-data instruction
            bArr2[0] = 116;
            bArr2[1] = 3;
            bArr2[2] = -73;
            bArr2[3] = -5;
            bArr2[4] = -90;
            bArr2[5] = -88;
            bArr2[6] = 87;
            bArr2[7] = -38;
            bArr2[8] = 57;
            bArr2[9] = 93;
            String strB3 = C0133t.b(bArr2, new byte[]{82, 96, -42, -105, -54, -54, 54, -71}, sb4);
            StringBuilder sb5 = new StringBuilder();
            byte[] bArr3 = new byte[i3];
            // fill-array-data instruction
            bArr3[0] = 53;
            bArr3[1] = 69;
            bArr3[2] = 28;
            bArr3[3] = 59;
            bArr3[4] = -97;
            bArr3[5] = 105;
            bArr3[6] = -97;
            bArr3[7] = 35;
            bArr3[8] = 42;
            bArr3[9] = 70;
            bArr3[10] = 31;
            bArr3[11] = 101;
            bArr3[12] = -33;
            bArr3[13] = 101;
            bArr3[14] = -128;
            bArr3[15] = 103;
            bArr3[16] = 60;
            bArr3[17] = 95;
            bArr3[18] = 70;
            bArr3[19] = 40;
            bArr3[20] = -125;
            bArr3[21] = 62;
            bArr3[22] = -97;
            v.a(bArr3, new byte[]{93, 49, 104, 75, -20, 83, -80, 12}, sb5, strA);
            v.a(new byte[]{77}, new byte[]{98, 42, -84, 23, -28, 93, -8, -113}, sb5, strOptString);
            JSONObject jSONObjectPut = new JSONObject().put(C0098a.a(new byte[]{73, 16, 104, 104, 113, -83, -94, -4, 65}, new byte[]{45, 117, 28, 9, 24, -63, -9, -114}), strB3).put(C0098a.a(new byte[]{-126, 101, -127, 82, 66, 1, -33, 62, -128, 101, -121, 86, 89}, new byte[]{-26, 0, -11, 51, 43, 109, -115, 91}), C0133t.b(new byte[]{-12, 40, -122, 25, -86}, new byte[]{-38, 64, -14, 116, -58, 36, -9, -15}, sb5));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{102, -43, -123, 47, 30}, new byte[]{18, -68, -15, 67, 123, -75, -18, -28}));
            if (!strOptString2.contains(C0098a.a(new byte[]{-81, 34, 68, -47, 35, 116, 116, 5, -6, 126, 108, -95}, new byte[]{74, -101, -47, 52, -77, -6, -100, -85})) && !strOptString2.contains(C0098a.a(new byte[]{-88, -61, -48, 64, 19, 10, 38, 85, -50}, new byte[]{65, 84, 125, -91, -86, -97, -61, -23})) && !strOptString2.contains(C0098a.a(new byte[]{91, 89, -105, -18, 57, -62}, new byte[]{-77, -20, 24, 8, -89, 82, 112, 113}))) {
                String str7 = C0098a.a(new byte[]{119, -88, -55, -63, -126, 67}, new byte[]{31, -36, -67, -79, -15, 121, -80, -12}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{120, 77, 87, -75, -92, 123, 112, 9}, new byte[]{27, 41, 57, -42, -53, 13, 21, 123}));
                if (str.equals(C0098a.a(new byte[]{72}, new byte[]{122, 45, 15, 81, -34, 45, 78, -111})) || str.equals(C0098a.a(new byte[]{-38}, new byte[]{-18, 22, 89, 56, 21, 55, -63, -50}))) {
                    String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-119, -59, 115, 19, -30, -73}, new byte[]{-4, -75, 26, 125, -124, -40, -76, -53}));
                    if (strOptString3.equals(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{98, -54, 20, 76, -105}, new byte[]{22, -91, 96, 45, -5, 20, -101, 116})))) {
                        strB = C0098a.a(new byte[]{69, -121, -111, -19, -103, 120, 44, 44, 51}, new byte[]{-96, 48, 35, 8, 55, -12, -53, -105});
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        v.a(new byte[]{-107, 74, 49, -23, 16, 51, 5, 21, -64}, new byte[]{115, -47, -123, 15, -122, -125, -19, -110}, sb6, strOptString3);
                        strB = C0133t.b(new byte[]{69, -69, 62}, new byte[]{-84, 32, -72, -91, 107, 73, -121, -100}, sb6);
                    }
                } else {
                    strB = "";
                }
                if (str.equals(C0098a.a(new byte[]{87}, new byte[]{100, 99, 59, -58, 91, 33, -60, -23}))) {
                    strB = C0098a.a(new byte[]{20, 68, 80, 8, -103, 69, -102, -90, 65}, new byte[]{-14, -33, -28, -18, 15, -11, 114, 33}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{11, -18, 66}, new byte[]{127, -113, 37, -40, 123, 41, -121, -125}));
                }
                String string = jSONObjectPut.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0098a.a(new byte[]{90, 54, 14, -93, 88, 124}, new byte[]{44, 89, 106, -4, 49, 24, 85, -94}), string);
                jSONObject.put(C0098a.a(new byte[]{-7, 13, 13, 57, 7, -55, -70, 67}, new byte[]{-113, 98, 105, 102, 105, -88, -41, 38}), strOptString2);
                jSONObject.put(C0098a.a(new byte[]{16, 123, 120, -11, -85, -122, 84}, new byte[]{102, 20, 28, -86, -37, -17, 55, 86}), str7);
                jSONObject.put(C0098a.a(new byte[]{114, -127, -60, -72, 0, 97, 67, 77, 118, -123, -45}, new byte[]{4, -18, -96, -25, 114, 4, 46, 44}), strB);
                jSONArray.put(jSONObject);
            }
            i4++;
            i = 10;
            i2 = 4;
            i3 = 23;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0098a.a(new byte[]{121, 86, 106, 40, 112, 122, 19, 2, 125}, new byte[]{9, 55, 13, 77, 19, 21, 102, 108}), 999);
        jSONObject2.put(C0098a.a(new byte[]{70, -105, -54, -100}, new byte[]{42, -2, -71, -24, -84, -86, -8, -97}), jSONArray);
        return jSONObject2.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject(list.get(0));
        int i = 8;
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{-60, 12, -58, 25, 47, -48, -35, 82, -52}, new byte[]{-96, 105, -78, 120, 70, -68, -120, 32}));
        jSONObject.optString(C0098a.a(new byte[]{-103, 47, 29, 5, -62, -118, 89, -41, -101, 47, 27, 1, -39}, new byte[]{-3, 74, 105, 100, -85, -26, 11, -78}));
        int i2 = 15;
        JSONObject jSONObjectOptJSONObject = new JSONObject(c(strOptString, C0098a.a(new byte[]{-72, -120, -67, -41, 10, 116, 20, 60, -17, -122, -83, -43, 91, 61, 20}, new byte[]{-102, -27, -50, -80, 40, 78, 54, 111}))).optJSONObject(C0098a.a(new byte[]{-50, 82, 57, -43}, new byte[]{-86, 51, 77, -76, -5, -107, -10, -91}));
        String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{93, 99, 58, 104, 119}, new byte[]{41, 10, 78, 4, 18, -101, 6, -125}));
        boolean zHas = jSONObjectOptJSONObject.has(C0098a.a(new byte[]{-104, 112, -76, 16, 84, -4, 21, 65, -115, 125, -79, 25}, new byte[]{-7, 28, -40, 117, 36, -107, 113, 36}));
        boolean zHas2 = jSONObjectOptJSONObject.has(C0098a.a(new byte[]{30, 20, 38, 112, 66, 49, 36, -30, 10, 24, 51, 126, 83, 56}, new byte[]{122, 113, 64, 17, 55, 93, 80, -121}));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0098a.a(new byte[]{35, 67, -79, -86, 120, -1, 67, -20, 32, 75, -75, -89, 117, -1, 65}, new byte[]{83, 47, -48, -45, 20, -106, 45, -121}));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{-116, -67, 68, -15, -27, -29, 57, -40, -93, -94, 76, -4, -20, -7}, new byte[]{-4, -47, 37, -120, -119, -118, 87, -77}));
        int i3 = 10;
        String strSubstring = strOptString.substring(0, strOptString.indexOf(C0098a.a(new byte[]{-123, 24, -41, -38, -1, 110, -113, 85, -56, 70}, new byte[]{-93, 123, -74, -74, -109, 12, -18, 54})));
        int i4 = 7;
        int i5 = 6;
        if (zHas) {
            int i6 = 0;
            while (i6 < jSONArrayOptJSONArray.length()) {
                String strValueOf = String.valueOf(jSONArrayOptJSONArray.get(i6));
                if (!this.b.contains(strValueOf)) {
                    StringBuilder sbC = C0133t.c(strSubstring);
                    byte[] bArr = new byte[i5];
                    // fill-array-data instruction
                    bArr[0] = -96;
                    bArr[1] = 26;
                    bArr[2] = 57;
                    bArr[3] = -35;
                    bArr[4] = 106;
                    bArr[5] = 58;
                    byte[] bArr2 = new byte[i];
                    // fill-array-data instruction
                    bArr2[0] = -122;
                    bArr2[1] = 105;
                    bArr2[2] = 80;
                    bArr2[3] = -87;
                    bArr2[4] = 15;
                    bArr2[5] = 7;
                    bArr2[6] = 92;
                    bArr2[7] = -12;
                    v.a(bArr, bArr2, sbC, strValueOf);
                    byte[] bArr3 = new byte[i3];
                    // fill-array-data instruction
                    bArr3[0] = -34;
                    bArr3[1] = 69;
                    bArr3[2] = 78;
                    bArr3[3] = -68;
                    bArr3[4] = 44;
                    bArr3[5] = -20;
                    bArr3[6] = -33;
                    bArr3[7] = -44;
                    bArr3[8] = -109;
                    bArr3[9] = 27;
                    byte[] bArr4 = new byte[i];
                    // fill-array-data instruction
                    bArr4[0] = -8;
                    bArr4[1] = 38;
                    bArr4[2] = 47;
                    bArr4[3] = -48;
                    bArr4[4] = 64;
                    bArr4[5] = -114;
                    bArr4[6] = -66;
                    bArr4[7] = -73;
                    String strB = C0133t.b(bArr3, bArr4, sbC);
                    byte[] bArr5 = new byte[i2];
                    // fill-array-data instruction
                    bArr5[0] = 122;
                    bArr5[1] = -41;
                    bArr5[2] = -85;
                    bArr5[3] = 87;
                    bArr5[4] = 75;
                    bArr5[5] = -41;
                    bArr5[6] = 54;
                    bArr5[7] = 53;
                    bArr5[8] = 45;
                    bArr5[9] = -39;
                    bArr5[10] = -69;
                    bArr5[11] = 85;
                    bArr5[12] = 26;
                    bArr5[13] = -98;
                    bArr5[14] = 54;
                    byte[] bArr6 = new byte[i];
                    // fill-array-data instruction
                    bArr6[0] = 88;
                    bArr6[1] = -70;
                    bArr6[2] = -40;
                    bArr6[3] = 48;
                    bArr6[4] = 105;
                    bArr6[5] = -19;
                    bArr6[6] = 20;
                    bArr6[7] = 102;
                    JSONObject jSONObject2 = new JSONObject(c(strB, C0098a.a(bArr5, bArr6)));
                    byte[] bArr7 = new byte[i];
                    // fill-array-data instruction
                    bArr7[0] = 40;
                    bArr7[1] = -65;
                    bArr7[2] = 26;
                    bArr7[3] = 28;
                    bArr7[4] = -109;
                    bArr7[5] = 94;
                    bArr7[6] = 65;
                    bArr7[7] = -88;
                    byte[] bArr8 = new byte[i];
                    // fill-array-data instruction
                    bArr8[0] = -94;
                    bArr8[1] = 43;
                    bArr8[2] = -11;
                    bArr8[3] = 20;
                    bArr8[4] = -55;
                    bArr8[5] = -102;
                    bArr8[6] = -30;
                    bArr8[7] = 7;
                    JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject(C0098a.a(new byte[]{76, -34, 110, 125}, bArr7)).optJSONObject(C0098a.a(new byte[]{-61, 71, -103, 97, -71, -13, -116, 97, -51}, bArr8));
                    int i7 = jSONObjectOptJSONObject3.has(strValueOf) ? Integer.parseInt(String.valueOf(jSONObjectOptJSONObject3.get(strValueOf))) : 0;
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 200;
                        int i10 = i9 > i7 ? i7 : i9;
                        StringBuilder sbC2 = C0133t.c(strSubstring);
                        byte[] bArr9 = new byte[i4];
                        // fill-array-data instruction
                        bArr9[0] = 47;
                        bArr9[1] = 54;
                        bArr9[2] = 87;
                        bArr9[3] = 124;
                        bArr9[4] = -99;
                        bArr9[5] = -74;
                        bArr9[6] = -110;
                        int i11 = i7;
                        sbC2.append(C0098a.a(bArr9, new byte[]{9, 69, 35, 29, -17, -62, -81, -51}));
                        sbC2.append(i8 + 1);
                        sbC2.append(C0098a.a(new byte[]{38, 31, 82, 58, -119}, new byte[]{0, 122, 60, 94, -76, 37, 50, 22}));
                        sbC2.append(i10);
                        v.a(new byte[]{104, -86, 57, -128, -21, 123}, new byte[]{78, -39, 80, -12, -114, 70, -50, -69}, sbC2, strValueOf);
                        JSONArray jSONArrayOptJSONArray2 = new JSONObject(c(C0133t.b(new byte[]{-88, -63, 77, 82, -120, -70, 51, 8, -27, -97}, new byte[]{-114, -94, 44, 62, -28, -40, 82, 107}, sbC2), C0098a.a(new byte[]{81, 47, 75, 54, -114, 96, 115, 107, 6, 33, 91, 52, -33, 41, 115}, new byte[]{115, 66, 56, 81, -84, 90, 81, 56}))).optJSONObject(C0098a.a(new byte[]{66, -7, 74, 48}, new byte[]{38, -104, 62, 81, 88, -122, -15, -40})).optJSONObject(C0098a.a(new byte[]{104, 43, -63, 114, 9, -112, 89, 102, 125, 38, -60, 123}, new byte[]{9, 71, -83, 23, 121, -7, 61, 3})).optJSONArray(strValueOf);
                        if (jSONArrayOptJSONArray2 != null) {
                            int i12 = 0;
                            while (i12 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i12);
                                StringBuilder sb = new StringBuilder();
                                JSONArray jSONArray = jSONArrayOptJSONArray2;
                                sb.append(C0098a.a(new byte[]{29, -82, -105}, new byte[]{-6, 2, 59, 104, 80, 44, -53, -68}));
                                sb.append(jSONObjectOptJSONObject4.optString(C0098a.a(new byte[]{27, 75, 13, -75, 101, -95, 96, 8, 52, 73, 25, -95}, new byte[]{107, 39, 108, -52, 9, -56, 14, 99})));
                                String strB2 = C0133t.b(new byte[]{-43, -100, 2}, new byte[]{60, 7, -124, -58, -127, 110, -104, 80}, sb);
                                String strOptString3 = jSONObjectOptJSONObject4.optString(C0098a.a(new byte[]{-51, 111, 65}, new byte[]{-72, 29, 45, 57, 106, 10, -26, 38}));
                                StringBuilder sbC3 = C0133t.c(strB2);
                                sbC3.append(C0098a.a(new byte[]{93}, new byte[]{121, -32, 122, 88, -36, -62, -3, -117}));
                                sbC3.append(strOptString3);
                                arrayList.add(sbC3.toString());
                                i12++;
                                jSONArrayOptJSONArray2 = jSONArray;
                            }
                        }
                        i4 = 7;
                        i7 = i11;
                        i8 = i9;
                    }
                    if (arrayList.size() > 0) {
                        linkedHashMap.put(strValueOf, TextUtils.join(C0098a.a(new byte[]{99}, new byte[]{64, -85, -106, -68, 102, -24, 103, -114}), arrayList));
                    }
                }
                i6++;
                i2 = 15;
                i5 = 6;
                i = 8;
                i4 = 7;
                i3 = 10;
            }
        } else {
            int i13 = 0;
            if (zHas2) {
                while (i13 < jSONArrayOptJSONArray.length()) {
                    String strValueOf2 = String.valueOf(jSONArrayOptJSONArray.get(i13));
                    if (!this.b.contains(strValueOf2) && jSONObjectOptJSONObject.has(C0098a.a(new byte[]{56, 104, 107}, new byte[]{76, 9, 12, -40, -116, -119, -77, 49}))) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.optJSONObject(C0098a.a(new byte[]{15, 62, -67}, new byte[]{123, 95, -38, -75, 90, 61, 27, -107})).keys();
                        ArrayList arrayList2 = new ArrayList();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            StringBuilder sbC4 = C0133t.c(strSubstring);
                            v.a(new byte[]{-94, -40, -92, -91, 30, -47}, new byte[]{-124, -85, -51, -47, 123, -20, 110, 3}, sbC4, strValueOf2);
                            v.a(new byte[]{-32, 62, -95, -2, -115, 94}, new byte[]{-58, 71, -60, -97, -1, 99, 8, -11}, sbC4, next);
                            JSONArray jSONArrayOptJSONArray3 = new JSONObject(c(C0133t.b(new byte[]{-38, 30, -25, -25, -58, -85, 21, 44, -105, 64}, new byte[]{-4, 125, -122, -117, -86, -55, 116, 79}, sbC4), C0098a.a(new byte[]{36, 125, 9, 38, -13, -102, -13, -2, 115, 115, 25, 36, -94, -45, -13}, new byte[]{6, 16, 122, 65, -47, -96, -47, -83}))).optJSONObject(C0098a.a(new byte[]{-65, -111, -45, 56}, new byte[]{-37, -16, -89, 89, 38, -77, -86, -101})).optJSONArray(C0098a.a(new byte[]{3, 72, 5, -78, 47, 21, -20, 89, 23, 68, 16, -68, 62, 28}, new byte[]{103, 45, 99, -45, 90, 121, -104, 60}));
                            if (jSONArrayOptJSONArray3 != null) {
                                int i14 = 0;
                                while (i14 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i14);
                                    StringBuilder sb2 = new StringBuilder();
                                    Iterator<String> it = itKeys;
                                    sb2.append(jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{95, 50, -29, 31, -108, 26}, new byte[]{47, 87, -111, 118, -5, 126, -37, 58})));
                                    sb2.append(oZP.d("55"));
                                    sb2.append(jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{-78, 84, 99, -42}, new byte[]{-36, 53, 14, -77, -112, -22, -72, -103})));
                                    String string = sb2.toString();
                                    String strOptString4 = jSONObjectOptJSONObject5.optString(C0098a.a(new byte[]{-67, 105, 123}, new byte[]{-56, 27, 23, -23, 105, -52, 37, -41}));
                                    StringBuilder sbC5 = C0133t.c(string);
                                    sbC5.append(C0098a.a(new byte[]{77}, new byte[]{105, 76, -102, -85, -88, -92, -3, -37}));
                                    sbC5.append(strOptString4);
                                    arrayList2.add(sbC5.toString());
                                    i14++;
                                    strSubstring = strSubstring;
                                    itKeys = it;
                                }
                            }
                        }
                        str = strSubstring;
                        if (arrayList2.size() > 0) {
                            linkedHashMap.put(strValueOf2, TextUtils.join(C0098a.a(new byte[]{-120}, new byte[]{-85, -70, -58, 60, 120, -128, 41, 7}), arrayList2));
                        }
                    } else {
                        str = strSubstring;
                    }
                    i13++;
                    strSubstring = str;
                }
            } else {
                while (i13 < jSONArrayOptJSONArray.length()) {
                    String strValueOf3 = String.valueOf(jSONArrayOptJSONArray.get(i13));
                    if (!this.b.contains(strValueOf3)) {
                        String strOptString5 = jSONObjectOptJSONObject2.optJSONObject(strValueOf3).optString(C0098a.a(new byte[]{36, 27, -91, 105, -87, -34, 16, -76, 53, 12, -81}, new byte[]{64, 126, -61, 8, -36, -78, 100, -21}));
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(C0098a.a(new byte[]{-6, -125, 8, -27, -64, -4, -59}, new byte[]{28, 46, -85, 2, 73, 123, -31, 87}) + strOptString5);
                        linkedHashMap.put(strValueOf3, TextUtils.join(C0098a.a(new byte[]{-4}, new byte[]{-33, -35, 103, -54, -46, -71, -60, -12}), arrayList3));
                    }
                    i13++;
                }
            }
        }
        String strOptString6 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{67, -31, -61, -10, -17, 64, 106, -78}, new byte[]{32, -123, -83, -107, -128, 54, 15, -64}));
        String strA = a(jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{39, -83, -44, -8, 78, -73, 90, 18, 47, -91, -51, -29, 82}, new byte[]{74, -62, -94, -111, 43, -44, 59, 102})));
        String strOptString7 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-55, -50, -89, 96, -39, 12, 95}, new byte[]{-71, -69, -59, 4, -72, 120, 58, 51}));
        String strA2 = a(jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{-9, 41, 110, -65}, new byte[]{-106, 91, 11, -34, -21, -84, -62, -86})));
        String strA3 = a(jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{106, 13, -39, 72, -1}, new byte[]{11, 110, -83, 39, -115, -50, 63, 41})));
        String strA4 = a(jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{42, 121, -61, -113, -36, 103, -110, -102}, new byte[]{78, 16, -79, -22, -65, 19, -3, -24})));
        String strOptString8 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{41, 118, -66, -95, 123, 104, 60, -4, 36, 124, -93}, new byte[]{77, 19, -51, -62, 9, 1, 76, -120}));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0098a.a(new byte[]{97, 51, -96, 82, -117, -7}, new byte[]{23, 92, -60, 13, -30, -99, -29, 86}), list.get(0));
        jSONObject3.put(C0098a.a(new byte[]{-22, 0, -96, -76, 102, -39, -88, -44}, new byte[]{-100, 111, -60, -21, 8, -72, -59, -79}), strOptString2);
        jSONObject3.put(C0098a.a(new byte[]{119, -27, 10, 59, 96, 28, -126}, new byte[]{1, -118, 110, 100, 16, 117, -31, -116}), strOptString6);
        jSONObject3.put(C0098a.a(new byte[]{113, -2, -54, -47, -99, -43, -32, -96, 96}, new byte[]{5, -121, -70, -76, -62, -69, -127, -51}), strA);
        jSONObject3.put(C0098a.a(new byte[]{-5, -60, -23, -74, -63, 47, -79, 122}, new byte[]{-115, -85, -115, -23, -72, 74, -48, 8}), strOptString7);
        jSONObject3.put(C0098a.a(new byte[]{-124, 83, -37, -27, -21, 11, -71, -79}, new byte[]{-14, 60, -65, -70, -118, 121, -36, -48}), strA2);
        jSONObject3.put(C0098a.a(new byte[]{-90, 53, 30, 20, -55, -67, -33, -89, -94, 49, 9}, new byte[]{-48, 90, 122, 75, -69, -40, -78, -58}), "");
        jSONObject3.put(C0098a.a(new byte[]{92, -91, -97, -86, -78, 100, -83, 57, 88}, new byte[]{42, -54, -5, -11, -45, 7, -39, 86}), strA3);
        jSONObject3.put(C0098a.a(new byte[]{46, 32, -43, -122, 12, -31, -5, -14, 59, 59, -34, -85}, new byte[]{88, 79, -79, -39, 104, -120, -119, -105}), strA4);
        jSONObject3.put(C0098a.a(new byte[]{86, 125, 14, 87, -17, -106, 22, 21, 69, 124, 30}, new byte[]{32, 18, 106, 8, -116, -7, 120, 97}), strOptString8);
        if (linkedHashMap.size() > 0) {
            jSONObject3.put(C0098a.a(new byte[]{2, 94, -6, -18, -92, 123, -8, -16, 43, 87, -20, -34, -71}, new byte[]{116, 49, -98, -79, -44, 23, -103, -119}), TextUtils.join(C0098a.a(new byte[]{-46, -128, 125}, new byte[]{-10, -92, 89, -50, 112, -27, 19, -34}), linkedHashMap.keySet()));
            jSONObject3.put(C0098a.a(new byte[]{-96, 115, -110, 11, -19, 82, 66, -109, -119, 105, -124, 56}, new byte[]{-42, 28, -10, 84, -99, 62, 35, -22}), TextUtils.join(C0098a.a(new byte[]{57, 60, -45}, new byte[]{29, 24, -9, 91, 58, 100, 52, 37}), linkedHashMap.values()));
        }
        return new JSONObject().put(C0098a.a(new byte[]{-117, -62, 85, 26}, new byte[]{-25, -85, 38, 110, -26, 96, -95, -77}), new JSONArray().put(jSONObject3)).toString();
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{43}, new byte[]{26, -27, 114, 91, -15, 89, -77, -58}), C0098a.a(new byte[]{-52}, new byte[]{-2, 69, 82, 79, -7, -104, -96, -62}), C0098a.a(new byte[]{-12}, new byte[]{-57, -18, 79, -13, 62, -88, 45, 79}), C0098a.a(new byte[]{-19}, new byte[]{-39, -82, 119, 15, -128, -21, 119, -25}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{68, -45, 31, 1, 118, -91}, new byte[]{-93, 71, -86, -28, -53, 20, 54, 127}), C0098a.a(new byte[]{52, 67, 95, 66, -108, -20, -74, -121, 116}, new byte[]{-45, -41, -22, -86, 51, 106, 83, 14}), C0098a.a(new byte[]{111, -38, 38, 101, -47, 95}, new byte[]{-120, 97, -102, -115, 88, -27, -100, -82}), C0098a.a(new byte[]{90, -39, 85, 116, 24, 9}, new byte[]{-65, 83, -3, -110, -92, -94, 19, 5}));
        for (int i = 0; i < listAsList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{118, 15, -116, -57, 4, -119, -45}, new byte[]{2, 118, -4, -94, 91, -32, -73, 1}), listAsList.get(i));
            jSONObject.put(C0098a.a(new byte[]{119, 116, -20, 112, 120, 6, -85, -103, 102}, new byte[]{3, 13, -100, 21, 39, 104, -54, -12}), listAsList2.get(i));
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject(oZP.d("0E4D466356752E14552A092C575557630F39141C046340755701162C09774F4F55A6DDEE90F1FC6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B2C4D492DFE777594F55374E6F554D553C40750E4D19635675578AE1DD89DCD24D5B614E235755576389C3E98AFEE64E28594F0C6302774F4F55A6E4E493ECF26340755719557B4C7792E7C6A7EFD057125B6117771B4D4D614EB0FFC793FCF077594F55374E6F554D92CBC4B1C8F3553C40750E4D196356755789F6D18AD5E34D5B614E23575557638AD4E589F7D74E28594F0C6302774F4F55A6CBC490D6CC6340755719557B4C7792C8E6A4D5EE57125B6117771B4D4D614EB0FCC891C2E977594F55374E6F554D92C8CBB3F6EA553C40750E4D196356755788FDEE8BE8DF4D5B614E23575557638BDFDA88CAEB4E28594F0C6302774F4F55A4C9D290D6CC6340755719557B4C7790CAF0A4D5EE57125B6117771B4D4D614EB3FDF793FBE577594F55374E6F554D91C9F4B1CFE6553C40750E4D196356755789F5ED8BC3E44D5B614E23575557638AD7D988E1D04E28594F0C6302774F4F55A4E6FD92FBCC6340755719557B4C7790E5DFA6F8EE57125B6117771B4D4D614EB3E3E89FC8D677594F55374E6F554D91D7EBBDFCD5553C40750E4D196356755787D9F189E8E04D5B614E235755576384FBC58ACAD44E28594F0C6302774F4F55A5D0F59DC1C76340755719557B4C7791D3D7A9C2E557125B6117771B4D4D614EB3D8E39FC9F277594F55374E6F554D91ECE0BDFDF1553C40750E4D19635675578AF8E584F6F04D5B614E235755576389DAD187D4C44E28594F0C6302774F4F55A4E2D390E0C56340755719557B4C7790E1F1A4E3E757125B6117771B4D4D614EB3F6E591C3F677594F55374E6F554D91C2E6B3F7F5553C40750E4D19635675578BCBE78BC5F34D5B614E235755576388E9D388E7C74E28594F0C6302774F4F55A4E9E391D4E16340755719557B4C7790EAC1A5D7C357122A3C40750E4D1C2415774F4F55380934074D5B614E3B140212635675578ACEF588EED64D5B614E23140302244E6F55340C6302774F4F55A4E9FD9CECDFA4D5E191D4D46340755719557B4C7757125B6117771B4D4D614E67455D436340755719557B4C77475F45754E28594F0C6302774F4F55735C67464D5B614E23575557635E65475C553C40750E4D19635675575D47735E77594F55374E6F554D45715E6757125B6117771B4D4D614E67455D466340755719557B4C77475F45704E28594F0C6302774F4F55735C67454D5B614E23575557635E65475F553C40750E4D19635675575D47705577594F55374E6F554D45715D6C57125B6117771B4D4D614E67455E4F6340755719557B4C77475F46794E28594F0C6302774F4F55735C64424D5B614E23575557635E654458553C40750E4D19635675575D47705A77594F55374E6F554D45715D6357125B6117771B4D4D614E67455E426340755719557B4C77475F46744E28594F0C6302774F4F55735C64414D5B614E23575557635E65445B553C40750E4D19635675575D47705F77594F55374E6F554D45715D6657125B6117771B4D4D614E67455E456340755719557B4C77475F46734E28594F0C6302774F4F55735C64444D5B614E23575557635E65445E553C40750E4D19635675575D47705C77594F55374E6F554D45715D6557125B6117771B4D4D614E67455F4E6340755719557B4C77475F47784E28594F0C6302774F4F55735C654D4D5B614E23575557635E654557553C40750E4D19635675575D47715B77594F55374E6F554D45715C6257125B6117771B4D4D614EB3EEDB91D6C577594F55374E6F554D91DAD8B3E2C6553C3128594F0C6307300C4D4D614E34070A166340755701162C09774F4F55A4F0E590E3CD6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B0E9DF92CDD677594F55374E6F554D553C40750E4D19635675578AF1C489C9C54D5B614E235755576389F1D286EEC74E28594F0C6302774F4F55A5D4F890F4CAA8CACC93D7D86340755719557B4C779CC9EEA7D4FA57125B6117771B4D4D614EB1CDC292DAD1B0FADF91F8D277594F55374E6F554D92CEDCB3CCD1553C40750E4D196356755789C4F189CEC84D5B614E23575557638AE6C58AECFC4E28594F0C6302774F4F55A6D2DB90F4CA6340755719557B4C7792D1F9A4F7E857125B6117771B4D4D614EBCEAC692DAD177594F55374E6F554D9EDEC5B0EED2553C40750E4D196356755789E0E48AC9D94D5B614E23575557638AC2D089EBED4E28594F0C6302774F4F55A7DFC090F4CA6340755719557B4C7793DCE2A4F7E857125B6117771B4D4D614EBDFEDE92DAD177594F55374E6F554D9FCADDB0EED2553C40750E4D19635675578AC9F689CEC84D5B614E235755576389EBC28AECFC4E28594F0C6302774F4F55A4E1E590D5D16340755719557B4C7790E2C7A4D6F357125B6117771B4D4D614EB0F0D993FAFA77594F55374E6F554D92C4DAB1CEF9553C3128594F0C6307300C4D4D614E34161B18334E79554D19200130575557638ACDFB89EFDE4E79554D01200020104D4D61372E5701557B4C7790EADFA8EFFD93F7F9A7F4CA574357631A774F4F556311795514552F4E6F554D91C9FCBCCBF6556D4C77034D4D614EB3FDFF9EFFF5770843573A4E3B5755576389C4DD89EFDE85FCC54D5B614E235755576389C4DD89EFDE85FCC54D0A6D4C2E5701557B4C7793F2F9A9D3CB93F2C76340755719557B4C7793F2F9A9D3CB93F2C76311795514552F4E6F554D91DFFBB3D8CC9FCADD77594F55374E6F554D91DFFBB3D8CC9FCADD770843573A4E3B5755576389C5C18BCDED4E79554D01635675578AE7F588EFD94D0A6D4C2E5701557B4C7790D1E7A4DFF0574357631A774F4F55A4D2C590DCD26311795514552F4E6F554D9EFAE8B3CDCB556D4C77034D4D614EBCCEEB91F9C8770843573A4E3B575557638BDBFE8AD9DC89E9CF4D5B614E23575557638BDBFE8AD9DC89E9CF4D0A6D4C2E5701557B4C7793F2F9A4DCDA9CD1EE6340755719557B4C7793F2F9A4DCDA9CD1EE6311795514552F4E6F554D92FDCCB0EED29FCCCF77594F55374E6F554D92FDCCB0EED29FCCCF770843573A4E3B575557638AE1DF86F0D089FBE84D5B614E23575557638AE1DF86F0D089FBE84D0A6D4C2E5701557B4C7790C8EBA7FAD2574357631A774F4F55A4CBC993F9F06311795514552F4E6F554D91F3E4BDF0D1556D4C77034D4D614EB3C7E79FC4D2770843573A4E3B5755576385D7E687C1C44E79554D016356755786F5D284E3F04D0A6D4C2E5701557B4C7790D8DEA5D3C5574357631A774F4F55A4DBFC91D0E76311795514552F4E6F554D9EE8C0B1CDD2556D4C77034D4D614EBCDCC393F9D1770843573A4E3B5755576385C2DE8AD1EF4E79554D016356755786E0EA89F3DB4D0A6D4C2E5701557B4C7790FEDFA4EAF99CF4DF6340755719557B4C7790FEDFA4EAF99CF4DF6311795514552F4E6F554D92C9F4B3EDE590C5DA77594F55374E6F554D92C9F4B3EDE590C5DA770843573A4E3B575557638AE4D18AE3EE4E79554D016356755789C6E589C1DA4D0A6D4C2E5701557B4C779DE7E5A7DBD2574357631A774F4F55A9E4C793D8F06311795514552F4E6F554D90D8D1B2ECD193FCF977594F55374E6F554D90D8D1B2ECD193FCF97708320A6D4C2E570412384E6F554D15384E79554D19200130575557638ADBE78ACDCE4E79554D01200020104D4D61372E5701557B4C7793F3F7A9D3C492ECDAA7F4F5574357631A774F4F55330D3B1E0718354E28594F0C6302774F4F55A7F0D59DD0E6A5D4DF93F7D76340755719557B4C77070E192A0034010A04354E28594F0C6302774F4F55A7F0D590E0E0A4C9E89DC0F36340755719557B4C77070E192A1C3A1C010363110808325B614E675755571A17771E0A0E635675570C1B201F26574357630234180A557B4C7792DECCA4F2DE574357631A34191A126356752E14552F4E6F554D92C4C4BCF6C790F0D7B0EBE4556D4C77034D4D614E770843573A4E3B5755576384FDF589F4C44E79554D016356755787DFC18AD6F04D0A6D4C2E5701557B4C7790E6D0A7EFD0574357631A774F4F55A4E5F293ECF26311795514552F4E6F554D93FDCAB2E5E9556D4C77034D4D614EB1C9C990D1EA770843573A4E3B5755576389C3E98AFEE64E79554D01635675578AE1DD89DCD24D0A6D4C2E5701557B4C7793EDDBA6FAC4574357631A774F4F55A7EEF992F9E66311795514552F4E6F554D9EC2D1B0CDED556D4C77034D4D614EBCF6D292F9EE770843573A4E3B5755576389D4C38AF4CE4E79554D01635675578AF6F789D6FA4D0A6D4C2E5701557B4C7790E0D3A9CFD0574357631A774F4F55A4E3F19DCCF26311795514552F4E6F554D92C7F7B1CFE4556D4C77034D4D614EB0F3F493FBE7770843573A4E3B5755576384F8D38AFBEB4E79554D016356755787DAE789D9DF4D0A6D4C2E5701557B4C7790E1F1A4E3E7574357631A774F4F55A4E2D390E0C56311795514552F4E6F554D92CBDDB0CAF8556D4C77034D4D614EB0FFDE92FEFB770843573A4E3B575557638BF0EB87D8DC4E79554D016356755788D2DF84FAE84D0A6D4C2E5701557B4C779DDFFAA7E4CD574357631A774F4F55A9DCD893E7EF6311795514552F4E6F554D9EDCFEB3EDCA556D4C77034D4D614EBCE8FD91D9C9770843573A4E3B5755576389FBC38ACDEC4E79554D01635675578AD9F789EFD84D0A6D4C2E5701557B4C7790E5DFA5D1C9574357631A774F4F55A4E6FD91D2EB6311795514552F4E6F554D91C2E9B3ECC0556D4C77034D4D614EB3F6EA91D8C3770843573A4E3B575557638AF8D38BC9E14E79554D016356755789DAE788EBD54D0A6D4C2E5701557B4C7792C8E6A4D5EE574357631A774F4F55A6CBC490D6CC6311795514552F4E6F554D92C4DAB1CEF9556D4C77034D4D614EB0F0D993FAFA7708320A6D4C2E570412384E6F554D0E240D27574357630234180A557B4C7790D6C3A5D7F6574357631A34191A126356752E14552F4E6F554D92C4C4BCF6C792F8D8B1CECC556D4C77034D4D614E770843573A4E3B575557635E65475B556D4C77034D4D614E67455D436311795514552F4E6F554D45715E66574357631A774F4F55735C67464D0A6D4C2E5701557B4C77475F45734E79554D01635675575D47735E770843573A4E3B575557635E65475E556D4C77034D4D614E67455D466311795514552F4E6F554D45715E65574357631A774F4F55735C67454D0A6D4C2E5701557B4C77475F46784E79554D01635675575D477055770843573A4E3B575557635E654457556D4C77034D4D614E67455E4F6311795514552F4E6F554D45715D62574357631A774F4F55735C64424D0A6D4C2E5701557B4C77475F46774E79554D01635675575D47705A770843573A4E3B575557635E65445A556D4C77034D4D614E67455E426311795514552F4E6F554D45715D61574357631A774F4F55735C64414D0A6D4C2E5701557B4C77475F46724E79554D01635675575D47705F770843573A4E3B575557635E65445D556D4C77034D4D614E67455E456311795514552F4E6F554D45715D64574357631A774F4F55735C64444D0A6D4C2E5701557B4C77475F46714E79554D01635675575D47705C770843573A4E3B575557635E654556556D4C77034D4D614E67455F4E6311795514552F4E6F554D45715C6D574357631A774F4F55735C654D4D0A6D4C2E5701557B4C77475F47764E79554D01635675575D47715B770843573A4E3B575557638ACEC189E0E84E79554D016356755789ECF58AC2DC4D0A1C11795514552A092C575557630D27100E556D4C771B0E1A244E6F554D92DDDCB0F9D5556D4C77030E1B3409774F4F2C3A4E3B5755576389D0DD86F4E989C9C58AFBFB4E79554D01635675574D0A6D4C2E5701557B4C7790E9F2A4F0E5574357631A774F4F55A4EAD090F3C76311795514552F4E6F554D93F9C1B0EED29EE7F5B3CDC0556D4C77034D4D614EBCD3F691F9C3770843573A4E3B5755576388EDD88AECFC89DAC589CEFF4E79554D01635675578AF8F18AECCB4D0A6D4C2E5701557B4C7793DCC7A4F7E8574357631A774F4F55A7DFE590F4CA6311795514552F4E6F554D91D6C9B3E9C3556D4C77034D4D614EB3E2CA91DDC0770843573A4E3B5755576385CADC8AECFC4E79554D016356755786E8E889CEC84D0A6D4C2E5701557B4C7792D1F9A4F7E8574357631A774F4F55A6D2DB90F4CA6311795514552F4E6F554D9FCADDB0EED2556D4C77034D4D614EBDFEDE92DAD1770843573A4E3B575557638AC3C58AFDE189C8D44D5B614E23575557638AC3C58AFDE189C8D44D0A1C11795514552A092C575557630D360100056340755701162C09774F4F55A7F4DB93F7E86340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B3EDE191D9F377594F55374E6F554D553C40750E4D196356755789EAE989ECF74D5B614E23575557638AC8DD8ACEC34E28594F0C6302774F4F55A6EFF890D8C36340755719557B4C779DD0DDA5D4E892ECDAA4DBE157125B6117771B4D4D614EB0C9CF92D9E5BDDAFE556D4C77034D4D614EB0C9CF92D9E5BDDAFE553C40750E4D196356755787C2F488EDC886D5D74E79554D016356755787C2F488EDC886D5D74E28594F0C6302774F4F55A9D9E090E0FFA4D7E2574357631A774F4F55A9D9E090E0FFA4D7E257125B6117771B4D4D614EBDF6CE91ECE077594F55374E6F554D9FC2CDB3D8E3553C40750E4D19635675578ADAD888EADF4D5B614E235755576389F8EC8BC8EB4E28594F0C6302774F4F55A8F3FC91D7EBA4FCCE574357631A774F4F55A8F3FC91D7EBA4FCCE57125B6117771B4D4D614EB0E4C79FFEE977594F55374E6F554D92D0C4BDCAEA553C40750E4D19635675578ACBE188EDF58AC6F04E79554D01635675578ACBE188EDF58AC6F04E28594F0C6302774F4F55A7F1DB90DFF8A6FEC5574357631A774F4F55A7F1DB90DFF8A6FEC557125B6117771B4D4D614EB3E8E191F3ED77594F55374E6F554D91DCE2B3C7EE553C40750E4D196356755786EEC989C8D14D5B614E235755576385CCFD8AEAE54E28594F0C6302774F4F55A4E4CD91D5D1A9E3E7574357631A774F4F55A4E4CD91D5D1A9E3E757125B6117771B4D4D614EB0E1FF92EACF77594F55374E6F554D92D5FCB0DECC553C40750E4D196356755789EACF89E5FA8AF1C84E79554D016356755789EACF89E5FA8AF1C84E28594F0C6302774F4F55A4FDFD90E9DBA8F7FD574357631A774F4F55A4FDFD90E9DBA8F7FD57125B6117771B4D4D614EB1CFE192D3E0B1C9F0556D4C77034D4D614EB1CFE192D3E0B1C9F0553C40750E4D196356755789EACF8ACDE68AC4F14E79554D016356755789EACF8ACDE68AC4F14E28594F0C6302774F4F55A8F7E291D2C4A8F3E6574357631A774F4F55A8F7E291D2C4A8F3E657125B6117771B4D4D614EB1C8FA92C7DC77594F55374E6F554D93FCF9B0F3DF553C40750E4D196356755786EFEF8BEEFA8AD3E84E79554D016356755786EFEF8BEEFA8AD3E84E28594F0C6302774F4F55A7CED090C6C06340755719557B4C7793CDF2A4C5E257125B6117771B4D4D614EB0CBFF92F2C977594F55374E6F554D92FFFCB0C6CA553C40750E4D196356755788D2D789E6C54D5B614E23575557638BF0E38AC4F14E28594F0C6302774F4F55A6CBF393DAC0A6FEC5574357631A774F4F55A6CBF393DAC0A6FEC557125B6117771B4D4D614EB3E8C790F5C777594F55374E6F554D91DCC4B2C1C4553C40750E4D19635675578BCCFA89CDFC8BCBE74E79554D01635675578BCCFA89CDFC8BCBE74E28594F0C6302774F4F55A9D8EB91D6F4A5D6FB574357631A774F4F55A9D8EB91D6F4A5D6FB57125B6117771B4D4D614EB2C8F891D8E777594F55374E6F554D90FCFBB3ECE4553C3128594F0C6307300C4D4D614E370C4D5B614E3B1402126356755789F9D389EFFA4D5B614E23140302244E6F55340C6302774F4F55A7F0D59DD0E6A6EFF893F7D76340755719557B4C77070E192A043A014D0A6D4C2E5701557B4C7793F3F7A9D3C491D7FDA7F4F5574357631A774F4F55330D3B1E0316350926014D0A6D4C2E5701557B4C7793F3F7A4E3C290CACAA9C3D1574357631A774F4F55330D3B1E1F1828022157122A3C3179554D446356752E14552A092C575557630F39141C046340755701162C09774F4F55A6DDEE90F1FC6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B2C4D492DFE777594F55374E6F554D553C40750E4D196356755787F3F089DAD688D0C14E79554D016356755787F3F089DAD688D0C14E28594F0C6302774F4F55A6F0CA91D5CDA6CBD5574357631A774F4F55A6F0CA91D5CDA6CBD557125B6117771B4D4D614EB3E5F190EDFD77594F55374E6F554D91D1F2B2D9FE553C40750E4D196356755786F7C88BF2F54D5B614E235755576385D5FC88D0C14E28594F0C6302774F4F55A4E9FE90E2D16340755719557B4C7790EADCA4E1F357125B6117771B4D4D614EBDDBD09FF1E477594F55374E6F554D9FEFD3BDC5E7553C40750E4D196356755789F4C48AD1EA4D5B614E23575557638AD6F089F3DE4E28594F0C6302774F4F55A6F8CA93DBCC6340755719557B4C7792FBE8A7D8EE57125B6117771B4D4D614EB3ECF593FDF677594F55374E6F554D91D8F6B1C9F5553C40750E4D196356755786E8F288ECE54D5B614E235755576385CAC68BCED14E28594F0C6302774F4F55A9EDD990F3CD6340755719557B4C779DEEFBA4F0EF57125B6117771B4D4D614EB2CBE19EE2F377594F55374E6F554D90FFE2BCD6F0553C40750E4D196356755789E0F789E5EF4D5B614E23575557638AC2C38AC7DB4E28594F0C6302774F4F55A7D4ED93E7F86340755719557B4C7793D7CFA7E4DA57125B6117771B4D4D614EB0C5FE92C5D377594F55374E6F554D92F1FDB0F1D0553C40750E4D19635675578BCAD284D7C74D5B614E235755576388E8E687F5F34E28594F0C6302774F4F55A6D6FF90C1E96340755719557B4C7792D5DDA4C2CB57125B6117771B4D4D614EB2D2FE91D4F577594F55374E6F554D90E6FDB3E0F6553C40750E4D196356755789ECF384DCCF4D5B614E23575557638ACEC787FEFB4E28594F0C6302774F4F55A7C1D99DE7E96340755719557B4C7793C2FBA9E4CB57125B6117771B4D4D614EBDC1CD90FAE377594F55374E6F554D9FF5CEB2CEE0553C40750E4D196356755789C6FC84E8D34D5B614E23575557638AE4C887CAE74E28594F0C6302774F4F55A7FEF893E5D26340755719557B4C7793FDDAA7E6F057125B6117771B4D4D614EB0F0D993FAFA77594F55374E6F554D92C4DAB1CEF9553C3128594F0C6307300C4D4D614E34070A166340755701162C09774F4F55A4F0E590E3CD6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B0E9DF92CDD677594F55374E6F554D553C40750E4D19635675578BCFEC89CEC88AD3E685CCF34D5B614E235755576388EDD88AECFC89F1D286EEC74E28594F0C6302774F4F55A6D2DB90F4CA6340755719557B4C7792D1F9A4F7E857125B6117771B4D4D614EB3E2CA91DDC077594F55374E6F554D91D6C9B3E9C3553C40750E4D19635675578BCFEC89CEC886D1D88AEDDA4D5B614E235755576388EDD88AECFC85F3EC89CFEE4E28594F0C6302774F4F55A5D4F890F4CAA4E3E593D6C96340755719557B4C7791D7DAA4F7E890E0C7A7D5EB57125B6117771B4D4D614EBCEAC692DAD177594F55374E6F554D9EDEC5B0EED2553C40750E4D196356755789DBE68AE1C74D5B614E23575557638AF9D289C3F34E28594F0C6302774F4F55A4E9E391D4E16340755719557B4C7793DCC7A4F7E857122A3C40750E4D1C2415774F4F55200F211A1D556D4C771B0E1A244E6F554D91D9E2B3EDF0556D4C77030E1B3409774F4F2C3A4E3B5755576389D0DD86F4E98ACDFB89EFDE4E79554D01635675574D0A6D4C2E5701557B4C779CEDE4A9DAD0574357631A774F4F55A8EEC69DD9F26311795514552F4E6F554D9ED8E4BDC0C4556D4C77034D4D614EBCECE79FF4C7770843573A4E3B5755576388E8E088F5C44E79554D01635675578BCAD48BD7F04D0A6D4C2E5701557B4C7793DEDDA7DAE0574357631A774F4F55A7DDFF93D9C26311795514552F4E6F554D90CFE7B1CAE592C6C377594F55374E6F554D90CFE7B1CAE592C6C3770843573A4E3B5755576385EEF188D4CB4E79554D016356755786CCC58BF6FF4D0A6D4C2E5701557B4C779DDFD5A4C4C9574357631A774F4F55A9DCF790C7EB6311795514552F4E6F554D9EFAE8B3CDCB556D4C77034D4D614EBCCEEB91F9C8770843573A4E3B5755576389C4DD89EAF188E9D34D5B614E235755576389C4DD89EAF188E9D34D0A6D4C2E5701557B4C779DF9ECA5D5DE9DDFD16340755719557B4C779DF9ECA5D5DE9DDFD16311795514552F4E6F554D362F0B30190E15200E2C574357631A774F4F55000232100316230D370C4D0A6D4C2E5701557B4C7793F7E4A6EFDF90E2F4A6E2EF574357631A774F4F55A7F4C692ECFDA4E1D692E1CD6311795514552F4E6F554D92F3DFB1CFFE9EF8E377594F55374E6F554D92F3DFB1CFFE9EF8E3770843573A4E3B575557638BDBFE8AEFC889E5E14D5B614E23575557638BDBFE8AEFC889E5E14D0A6D4C2E5701557B4C779CD6C8A7F5C2574357631A774F4F55A8D5EA93F6E06311795514552F4E6F554D91DCC4B0CCED556D4C77034D4D614EB3E8C792F8EE770843573A4E3B575557638AE7FD87F2FF4E79554D016356755789C5C984D0CB4D0A6D4C2E5701557B4C7790D3D7A9E5EF90EAC36340755719557B4C7790D3D7A9E5EF90EAC36311795514552F4E6F554D91FCF4B2FBC191DEE377594F55374E6F554D91FCF4B2FBC191DEE3770843573A4E3B5755576389D8FB89EEE989FBF24D5B614E235755576389D8FB89EEE989FBF24D0A6D4C2E5701557B4C7793F2F9A6D7E190F7FE6340755719557B4C7793F2F9A6D7E190F7FE6311795514552F4E6F554D92EFE7B0C5E092EFF177594F55374E6F554D92EFE7B0C5E092EFF1770843573A4E3B5755576384E1CB88F9F34E79554D016356755787C3FF8BDBC74D0A6D4C2E5701557B4C7793DDEEA7D6F7574357631A774F4F55A7DECC93D5D56311795514552F4E6F554D91D3FEBDC1F292EFED77594F55374E6F554D91D3FEBDC1F292EFED770843573A4E3B575557638AE3F788D4CB4E79554D016356755789C1C38BF6FF4D0A1C11795514552A092C575557630E2C574357630234180A557B4C7793E1E5A4D6DA574357631A34191A126356752E14552F4E6F554D91DDECBDCAFE90C2C1B3EDCF556D4C77034D4D614E2714011C29032157125B6117771B4D4D614EB3E9EF9FFEFDB1CDE591D9CC77594F55374E6F554D0520023E190E03241F2157122A3C3179554D436356752E14552A092C575557630F39141C046340755701162C09774F4F55A6DDEE90F1FC6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B2C4D492DFE777594F55374E6F554D553C40750E4D196356755788F4EC84F4F54D5B614E23575557638BD6D887D6C14E28594F0C6302774F4F55A6CBC490D6CC6340755719557B4C7792C8E6A4D5EE57125B6117771B4D4D614EB2CBE192F1FDB0D0DC556D4C77034D4D614EB2CBE192F1FDB0D0DC553C40750E4D196356755786DAD589ECCE4D5B614E235755576385F8E18ACEFA4E28594F0C6302774F4F55A6D7DA90EACF6340755719557B4C7792D4F8A4E9ED57125B6117771B4D4D614EB0FFDE92FEFB77594F55374E6F554D92CBDDB0CAF8553C40750E4D19635675578AC7D089D1CA4D5B614E235755576389E5E48AF3FE4E28594F0C6302774F4F55A4EAC79CF6DE6340755719557B4C7790E9E5A8F5FC57125B6117771B4D4D614EB3E5F190EDFD77594F55374E6F554D91D1F2B2D9FE553C40750E4D196356755789F9E98BC5F34D5B614E23575557638ADBDD88E7C74E28594F0C6302774F4F55A7EDDE92E7C66340755719557B4C7793EEFCA6E4E457125B6117771B4D4D614EB3C7D491C5E477594F55374E6F554D91F3D7B3F1E7553C40750E4D19635675578ACEFA8AD6C64D5B614E235755576389ECCE89F4F24E28594F0C6302774F4F55A7CCF490F4DA6340755719557B4C7793CFD6A4F7F857125B6117771B4D4D614EB0FFC790C8C577594F55374E6F554D92CBC4B2FCC6553C40750E4D196356755789EBFB8ADDED4D5B614E23575557638AC9CF89FFD94E28594F0C6302774F4F55A5D6E790C2E76340755719557B4C7791D5C5A4C1C557125B6117771B4D4D614EB0F1D091ECE077594F55374E6F554D92C5D3B3D8E3553C40750E4D196356755787C8D189DFDD4D5B614E235755576384EAE58AFDE94E28594F0C6302774F4F55A7EEF992F9E66340755719557B4C7793EDDBA6FAC457125B6117771B4D4D614EB3F5C590C8C577594F55374E6F554D91C1C6B2FCC6553C40750E4D196356755789FFD988EFFC4D5B614E23575557638ADDED8BCDC84E28594F0C6302774F4F55A6F7DF93F6CD6340755719557B4C7792F4FDA7F5EF57125B6117771B4D4D614EBCE8FD91D9C977594F55374E6F554D9EDCFEB3EDCA553C40750E4D196356755788DCE484FAE84D5B614E23575557638BFED087D8DC4E28594F0C6302774F4F55A6C7CB93E5F76340755719557B4C7792C4E9A7E6D557125B6117771B4D4D614EB0FFC793FCF077594F55374E6F554D92CBC4B1C8F3553C40750E4D196356755788D3FF88E9EF4D5B614E23575557638BF1CB8BCBDB4E28594F0C6302774F4F55A4E3DE93ECF26340755719557B4C7790E0FCA7EFD057125B6117771B4D4D614EB2E9F093FBD6B2FCE7556D4C77034D4D614EB2E9F093FBD6B2FCE7553C40750E4D196356755788E3F489E8C488FEC94E79554D016356755788E3F489E8C488FEC94E28594F0C6302774F4F550E3A1492E6FF6340755719557B4C773A3936A6E5DD57122A3C40750E4D1C2415774F4F55380934074D5B614E3B140212635675578ACEF588EED64D5B614E23140302244E6F55340C6302774F4F55A4E9FD9CECDFA4D5E191D4D46340755719557B4C7757125B6117771B4D4D614E67455D436340755719557B4C77475F45754E28594F0C6302774F4F55735C67464D5B614E23575557635E65475C553C40750E4D19635675575D47735E77594F55374E6F554D45715E6757125B6117771B4D4D614E67455D466340755719557B4C77475F45704E28594F0C6302774F4F55735C67454D5B614E23575557635E65475F553C40750E4D19635675575D47705577594F55374E6F554D45715D6C57125B6117771B4D4D614E67455E4F6340755719557B4C77475F46794E28594F0C6302774F4F55735C64424D5B614E23575557635E654458553C40750E4D19635675575D47705A77594F55374E6F554D45715D6357125B6117771B4D4D614E67455E426340755719557B4C77475F46744E28594F0C6302774F4F55735C64414D5B614E23575557635E65445B553C40750E4D19635675575D47705F77594F55374E6F554D45715D6657125B6117771B4D4D614E67455E456340755719557B4C77475F46734E28594F0C6302774F4F55735C64444D5B614E23575557635E65445E553C40750E4D19635675575D47705C77594F55374E6F554D45715D6557125B6117771B4D4D614E67455F4E6340755719557B4C77475F47784E28594F0C6302774F4F55735C654D4D5B614E23575557635E654557553C40750E4D19635675575D47715B77594F55374E6F554D45715C6257125B6117771B4D4D614E67455F416340755719557B4C77475F47774E28594F0C6302774F4F55735C65404D5B614E23575557635E65455A553C40750E4D19635675575D47715877594F55374E6F554D45715C6157125B6117771B4D4D614EB3EEDB91D6C577594F55374E6F554D91DAD8B3E2C6553C3128594F0C6307300C4D4D614E34070A166340755701162C09774F4F55A4F0E590E3CD6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C4B0E9DF92CDD677594F55374E6F554D553C40750E4D19635675578AF1C489C9C54D5B614E235755576389F1D286EEC74E28594F0C6302774F4F55A6D2DB90F4CA6340755719557B4C7792D1F9A4F7E857125B6117771B4D4D614EB3E2CA91DDC077594F55374E6F554D91D6C9B3E9C3553C3128594F0C6307300C4D4D614E370C4D5B614E3B1402126356755789F9D389EFFA4D5B614E23140302244E6F55340C6302774F4F55A7F0D59DD0E6A6EFF893F7D76340755719557B4C77070E192A043A014D0A6D4C2E5701557B4C7793F3F7A9D3C491D7FDA7F4F5574357631A774F4F55330D3B1E0316350926014D0A1C110808"));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0098a.a(new byte[]{-101, -31, -96, 11, -96}, new byte[]{-8, -115, -63, 120, -45, 45, -8, -102}), jSONArray);
        jSONObject3.put(C0098a.a(new byte[]{20, -100, -13, 24, -17, 93, 83}, new byte[]{114, -11, -97, 108, -118, 47, 32, 61}), jSONObject2);
        return jSONObject3.toString();
    }

    public String homeVideoContent() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = new JSONObject(b(C0098a.a(new byte[]{-113, 69, -124, 55, 88, -103, 107, -42, -122, 65, -103, 105, 92, -58, 38, -41, -44, 7, -64, 44, 74, -51, 106, -102, -120, 92, -33, 49, 26, -116, 54, -104, -119, 90, -49, 36, 74, -41, 121, -53, -63, 82, -111, 43, 71, -63, 37, -102, -116, 12}, new byte[]{-25, 49, -16, 71, 43, -93, 68, -7}), C0098a.a(new byte[]{75, -114, 35, -7, -22, 114, 89, 124, 84, -115, 32, -89, -86, 126, 70, 56, 66, -108, 121, -22, -10, 37, 89, 33, 66, -108, 60, -90, -3, 33, 23, 61, 90, -109, 57, -18}, new byte[]{35, -6, 87, -119, -103, 72, 118, 83}))).optJSONArray(C0098a.a(new byte[]{59, -40, -81, -96}, new byte[]{95, -71, -37, -63, -64, 77, 122, 105}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString(C0098a.a(new byte[]{28, 55, 7, 48, -3, -20}, new byte[]{121, 89, 115, 111, -108, -120, -7, 24}));
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{122, 113, -89, 20, -52, 79, -77, -95, 115, 117, -70, 74, -56, 16, -2, -96, 33, 51, -29, 15, -34, 27, -78, -19, 125, 104, -4, 18, -114, 90, -8, -21, 102, 100, -70, 8, -128, 22, -3, -6, 47, 52, -11, 13, -37, 72}, new byte[]{18, 5, -45, 100, -65, 117, -100, -114}, sb, strOptString);
            String strB = C0133t.b(new byte[]{111, -54, -52, -88, -5, 116, 76, -1, 34, -108}, new byte[]{73, -87, -83, -60, -105, 22, 45, -100}, sb);
            StringBuilder sb2 = new StringBuilder();
            v.a(new byte[]{39, -29, -41, 84, 23, 16, 78, -74, 56, -32, -44, 10, 87, 28, 81, -14, 46, -7, -115, 71, 11, 71, 78, -12, 96}, new byte[]{79, -105, -93, 36, 100, 42, 97, -103}, sb2, strOptString);
            JSONObject jSONObjectPut = new JSONObject().put(C0098a.a(new byte[]{-113, -96, 41, -89, 89, -40, 99, -39, -121}, new byte[]{-21, -59, 93, -58, 48, -76, 54, -85}), strB).put(C0098a.a(new byte[]{55, 111, 64, 71, 85, -80, 45, 0, 53, 111, 70, 67, 78}, new byte[]{83, 10, 52, 38, 60, -36, 127, 101}), C0133t.b(new byte[]{43, -104, 37, -45, -35}, new byte[]{5, -16, 81, -66, -79, -22, -40, -125}, sb2));
            String strOptString2 = jSONObject.optString(C0098a.a(new byte[]{-108, 35, -36, -41, -26}, new byte[]{-32, 74, -88, -69, -125, 113, 117, -39}));
            String strOptString3 = jSONObject.optString(C0098a.a(new byte[]{73, -45, 56, 66, -124}, new byte[]{42, -68, 78, 39, -10, 68, 26, 76}));
            String strA = a(jSONObject.optJSONArray(C0098a.a(new byte[]{93, -38, -18, -109, 42, -47, -108, 6}, new byte[]{48, -75, -104, -6, 79, -78, -11, 114})));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0098a.a(new byte[]{-115, 76, 25, -2, -3, 93}, new byte[]{-5, 35, 125, -95, -108, 57, -52, -125}), jSONObjectPut.toString());
            jSONObject2.put(C0098a.a(new byte[]{-61, 37, -114, -1, -11, 87, -96, 18}, new byte[]{-75, 74, -22, -96, -101, 54, -51, 119}), strOptString2);
            jSONObject2.put(C0098a.a(new byte[]{-121, -11, -115, -97, -67, -2, -32}, new byte[]{-15, -102, -23, -64, -51, -105, -125, -103}), strOptString3);
            jSONObject2.put(C0098a.a(new byte[]{-6, -16, -125, 27, -116, -46, -35, 70, -2, -12, -108}, new byte[]{-116, -97, -25, 68, -2, -73, -80, 39}), strA);
            jSONArray.put(jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0098a.a(new byte[]{-73, -101, -33, -23}, new byte[]{-37, -14, -84, -99, -112, -61, 13, 11}), jSONArray);
        return jSONObject3.toString();
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{79, 0, -18, 45, -21, -58, 15, -86, 116, 7}, new byte[]{26, 115, -117, 95, -58, -121, 104, -49}), this.a);
        h hVar = new h();
        hVar.y(str2);
        hVar.m(1);
        hVar.g();
        hVar.f(map);
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) throws JSONException {
        String strEncode = URLEncoder.encode(str);
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-112, -116, -107, 85, -42, 58, -108, -8, -103, -120, -120, 11, -42, 111, -107, -28, -50, -56, -118, 68, -53, 46, -40, -72, -107, -41, -120, 75, -63, 101, -61, -24, -98, -105, -109, 70, -64, 95, -51, -22, -55, -34, -118, 82, -104}, new byte[]{-8, -8, -31, 37, -91, 0, -69, -41}, sb, strEncode);
        String strB = b(C0133t.b(new byte[]{33, -5, 19, -85, -111, -89, -128, -92, 102, -6, 4, -86, -109, -89, -105, -14, 113, -62, 0, -76, -63, -85, -128, -96, 102, -1, 92, -91, -112, -10}, new byte[]{7, -99, 97, -60, -4, -102, -90, -44}, sb), C0134u.b(new byte[]{-81, 101, 102, -43, -43, -87, 68, -62, -76, 126, 60, -106, -112, -93, 0, -116, -87, 63, 113, -54, -53, -68, 84, -122, -80, 44}, new byte[]{-57, 17, 18, -91, -90, -109, 107, -19}, new StringBuilder(), strEncode));
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strB).optJSONObject(C0098a.a(new byte[]{-42, -59, -41, 33}, new byte[]{-78, -92, -93, 64, 68, 69, -114, -93})).optJSONObject(C0098a.a(new byte[]{-99, -114, 99, -14, 51, -86, 124, -127}, new byte[]{-15, -31, 13, -107, 119, -53, 8, -32})).optJSONArray(C0098a.a(new byte[]{-123, 48, -127, -49}, new byte[]{-9, 95, -10, -68, 102, 62, -96, -89}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-76, 39, -10, -110, -60}, new byte[]{-47, 73, -87, -5, -96, -106, 110, 44}));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-55, 25, -52, 101, 2, 11}, new byte[]{-86, 120, -72, 58, 107, 111, -27, 33}));
            StringBuilder sb2 = new StringBuilder();
            v.a(new byte[]{56, -82, -112, 98, -51, -86, -20, 63, 49, -86, -115, 60, -55, -11, -95, 62, 99, -20, -44, 121, -33, -2, -19, 115, 63, -73, -53, 100, -113, -65, -89, 117, 36, -69, -115, 126, -127, -13, -94, 100, 109}, new byte[]{80, -38, -28, 18, -66, -112, -61, 16}, sb2, strOptString2);
            v.a(new byte[]{-53, 21, 1, 11}, new byte[]{-19, 124, 101, 54, 99, 103, 3, -35}, sb2, strOptString);
            String strB2 = C0133t.b(new byte[]{67, 41, 109, 98, -96, -119, 59, -72, 14, 119}, new byte[]{101, 74, 12, 14, -52, -21, 90, -37}, sb2);
            JSONObject jSONObjectPut = new JSONObject().put(C0098a.a(new byte[]{75, 120, -117, -123, 97, 124, -94, -70, 67}, new byte[]{47, 29, -1, -28, 8, 16, -9, -56}), strB2).put(C0098a.a(new byte[]{97, 57, 71, 60, -41, 105, -71, -83, 99, 57, 65, 56, -52}, new byte[]{5, 92, 51, 93, -66, 5, -21, -56}), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-122, -29, -90}, new byte[]{-13, -111, -54, 54, 78, -53, -103, 125})));
            String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-28, -116, -75, -83, -109, -67, -50, 76}, new byte[]{-112, -27, -63, -63, -10, -23, -74, 56}));
            String strOptString4 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{96, 13, -23, -64, -70}, new byte[]{3, 98, -97, -91, -56, 55, -28, 121}));
            String strOptString5 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-16, -7, 120, 5, -50, 38, -104, -50}, new byte[]{-109, -104, 12, 90, -96, 71, -11, -85}));
            String string = jSONObjectPut.toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{50, 22, 41, -20, -55, 66}, new byte[]{68, 121, 77, -77, -96, 38, -28, 127}), string);
            jSONObject.put(C0098a.a(new byte[]{-15, 66, -73, 70, -97, -50, -78, -52}, new byte[]{-121, 45, -45, 25, -15, -81, -33, -87}), strOptString3);
            jSONObject.put(C0098a.a(new byte[]{86, 45, -52, 30, -56, 113, 52}, new byte[]{32, 66, -88, 65, -72, 24, 87, -127}), strOptString4);
            jSONObject.put(C0098a.a(new byte[]{-26, -98, -70, -12, 7, 5, -43, -127, -30, -102, -83}, new byte[]{-112, -15, -34, -85, 117, 96, -72, -32}), strOptString5);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0098a.a(new byte[]{-34, 100, -56, -5}, new byte[]{-78, 13, -69, -113, -20, 37, -75, 55}), jSONArray);
        return jSONObject2.toString();
    }
}
