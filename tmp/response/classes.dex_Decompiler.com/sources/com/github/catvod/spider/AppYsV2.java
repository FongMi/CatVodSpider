package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class AppYsV2 extends Spider {
    private static final Pattern c = Pattern.compile(C0098a.a(new byte[]{101, -108, -6, -83, 123, -61, -83, 124, 43, -54, -71, -50, 122, -59, -86, 104}, new byte[]{4, -28, -109, -15, 85, -77, -59, 12}));
    private static final Pattern d;
    private static final Pattern e;
    protected static final Pattern[] f;
    protected final HashMap<String, ArrayList<String>> a = new HashMap<>();
    private String[] b = null;

    static {
        Pattern.compile(C0098a.a(new byte[]{90, 104, 49, 102, -118, -60, 103, 34, 20, 54, 115, 5, -8, -102, 121, 61, 95}, new byte[]{59, 24, 88, 58, -92, -76, 15, 82}));
        Pattern.compile(C0098a.a(new byte[]{-128, 118, 13, -77, 38, -57, -36, -116}, new byte[]{-81, 88, 38, -17, 25, -23, -9, -79}));
        d = Pattern.compile(C0098a.a(new byte[]{89, -1, 113, -86, -111, -75, 69, 71, 11, -93, 48, -69, -97, -87, 81, 65, 43, -22, 48, -69, -54, -28}, new byte[]{119, -43, 89, -33, -29, -39, 57, 49}));
        e = Pattern.compile(C0098a.a(new byte[]{12, -66, 37, -6, -102, 1, -127, -79, 75, -111, 15, -91, -76, 20}, new byte[]{100, -54, 81, -118, -23, 62, -69, -98}));
        f = new Pattern[]{Pattern.compile(C0098a.a(new byte[]{123, 98, 41, 25, -65, -101, -24, 67, 110, 121}, new byte[]{11, 14, 72, 96, -38, -23, -43, 45})), Pattern.compile(C0098a.a(new byte[]{-80, -116, -103, -118, 24, -120, 16, 32, -82, -98, -103, -104, 93, -114, 86}, new byte[]{-116, -24, -16, -4, 56, -31, 116, 29})), Pattern.compile(C0098a.a(new byte[]{84, 9, -88, -88, -31, -59, 85, 125, 74, 54, -97, -4, -100, -122, 14, 48, 4, 12, -72, -69, -77, -114}, new byte[]{104, 109, -63, -34, -63, -84, 49, 64})), Pattern.compile(C0098a.a(new byte[]{79, -4, 22, 61, -31, 91, -90, -65, -119, 64, 64, 124, -23, 23}, new byte[]{96, -45, -2, -102, 103, -78, 4, 46})), Pattern.compile(C0098a.a(new byte[]{-88, -96, 55, 27, -64, 20, -29, -37, -103, -87, 54, 13, -101}, new byte[]{-32, -52, 68, 81, -77, 68, -113, -70})), Pattern.compile(C0098a.a(new byte[]{7, 123, 70, -60, 127, 87, 99, -39, 103, 97, 124, -27, 67, 16, 57, -15, 73, 113, 29, -108, 69, 100, 36, -33, 16, 45, 2}, new byte[]{59, 18, 32, -74, 30, 58, 6, -126})), Pattern.compile(C0098a.a(new byte[]{38, 49, -60, 110, -101, -26, -82, -18, 105, 27, -2, 87, -44, -74, -122, -64, 121, 122, -113, 81, -96, -85, -88, -103, 37, 101}, new byte[]{26, 71, -83, 10, -2, -119, -11, -78}))};
    }

    private void a(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    a((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        a(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e2) {
                SpiderDebug.log(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0992 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r26, org.json.JSONObject r27, org.json.JSONObject r28, java.lang.String r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 5164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.b(java.lang.String, org.json.JSONObject, org.json.JSONObject, java.lang.String):void");
    }

    private String c() {
        String[] strArr = this.b;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    public static JSONObject fixJsonVodHeader(JSONObject jSONObject, String str, String str2) throws JSONException {
        String strA;
        String strA2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        boolean zContains = str.contains(C0098a.a(new byte[]{-91, 107, 1, 33, -88, -85, -80, 79, -4, 127, 25, 98}, new byte[]{-46, 28, 118, 15, -59, -52, -60, 57}));
        String strD = oZP.d("55");
        if (zContains) {
            jSONObject.put(C0098a.a(new byte[]{-5, -26, 51, -18, -89, 16, 95}, new byte[]{-87, -125, 85, -117, -43, 117, 45, 75}), strD);
            strA = C0098a.a(new byte[]{11, 113, 9, 126, -76, -116, 11, -111, 48, 118}, new byte[]{94, 2, 108, 12, -103, -51, 108, -12});
            strA2 = C0098a.a(new byte[]{-89, 99, -52, 86, -49, -117, -87, 86, -88, 27, -115, 28}, new byte[]{-121, 46, -93, 44, -90, -25, -59, 55});
        } else {
            if (!str2.contains(C0098a.a(new byte[]{-15, -68, 71, -38, -27, 54, 15, 10, -15, -93}, new byte[]{-123, -43, 51, -69, -117, 24, 98, 109}))) {
                if (str.contains(C0098a.a(new byte[]{58, -91, 83, -106, 26, 106, -89, -9}, new byte[]{88, -52, 63, -1, 120, 3, -53, -98}))) {
                    jSONObject.put(C0098a.a(new byte[]{-81, 13, 16, -43, -17, -112, 6}, new byte[]{-3, 104, 118, -80, -99, -11, 116, -75}), C0098a.a(new byte[]{-102, -9, -12, 21, 98, 66, -11, -95, -107, -24, -9, 22, 60, 83, -90, -30, -45, -3, -23, 13, 123, 31, -84, -31, -41, -80}, new byte[]{-70, -97, -128, 97, 18, 49, -49, -114}));
                    strA = C0098a.a(new byte[]{70, 31, 28, 123, -41, -18, -117, 31, 125, 24}, new byte[]{19, 108, 121, 9, -6, -81, -20, 122});
                    strA2 = C0098a.a(new byte[]{100, -91, 104, -117, 84, -21, -42, -124, 107, -35, 41, -63, 29, -81, -19, -116, 42, -116, 104, -122, 78, -89, -12, -79, 100, -39, 55, -33, 13, -68, -102, -78, 45, -122, 49, -59, 6, -89, -62, -45, 112, -63, 39, -80, 77, -9, -42, -128, 19, -115, 101, -70, 84, -13, -107, -48, 119, -33, 41, -62, 11, -89, -110, -82, 12, -68, 74, -67, 17, -89, -42, -116, 47, -115, 39, -74, 88, -28, -47, -118, 109, -56, 68, -103, 79, -24, -41, -128, 107, -39, 54, -58, 19, -73, -108, -43, 106, -40, 39, -94, 92, -31, -37, -105, 45, -57, 50, -62, 10, -87, -119, -45}, new byte[]{68, -24, 7, -15, 61, -121, -70, -27});
                }
                return jSONObject;
            }
            jSONObject.put(C0098a.a(new byte[]{-79, -15, -78, -120, -107, -101, -107}, new byte[]{-29, -108, -44, -19, -25, -2, -25, -98}), strD);
            strA = C0098a.a(new byte[]{20, -19, -3, -3, -101, -31, -54, 10, 47, -22}, new byte[]{65, -98, -104, -113, -74, -96, -83, 111});
            strA2 = C0098a.a(new byte[]{-97, 16, 127, -41, 48, -15, 20, -101, -112, 104, 62, -99}, new byte[]{-65, 93, 16, -83, 89, -99, 120, -6});
        }
        jSONObject.put(strA, strA2);
        return jSONObject;
    }

    private HashMap<String, String> h(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{122, 109, 122, -48, -71, 76, 123, 81, 65, 106}, new byte[]{47, 30, 31, -94, -108, 13, 28, 52}), str.contains(C0098a.a(new byte[]{0, 121, 76, 2, -13, 91, 90, -25, 88, 117, 71, 65}, new byte[]{118, 22, 40, 44, -54, 62, 106, -44})) ? C0098a.a(new byte[]{104, -11, 54, 80, 19, 45, -98, -101, 16, -76, 124, 25, 87, 13, -106, -38, 80, -30, 119, 25, 62, 47, -101, -58, 74, -13, 40, 25, 73, 111, -49, -113, 5, -44, 41, 65, 10, 50, -33, -127, 5, -40, 57, 80, 19, 37, -48, -7, 119, -37, 121, 1, 49, 104, -33, -11, 85, -22, 32, 92, 40, 36, -99, -1, 76, -18, 99, 12, 76, 118, -47, -121, 19, -70, 100, 114, 55, 21, -78, -8, 9, -70, 32, 80, 20, 36, -33, -13, 64, -7, 39, 86, 86, 97, -68, -36, 87, -11, 33, 92, 80, 112, -49, -121, 11, -86, 98, 9, 81, 113, -33, -7, 74, -8, 37, 85, 26, 97, -84, -43, 67, -5, 62, 80, 80, 116, -52, -125, 11, -87, 122}, new byte[]{37, -102, 76, 57, 127, 65, -1, -76}) : (str.contains(C0098a.a(new byte[]{33, 28, -17, -22, -4, -94, -115, -28, 33, 28, -10}, new byte[]{64, 108, -122, -60, -116, -54, -3, -53})) || str.contains(C0098a.a(new byte[]{108, -92, -116, -121, -62}, new byte[]{20, -61, -19, -9, -78, 72, -18, 71})) || str.contains(C0098a.a(new byte[]{126, -12, 19, -19, 118, 40, -117}, new byte[]{24, -122, 118, -120, 29, 73, -27, 13}))) ? C0098a.a(new byte[]{-126, 118, -85, -124, 55, -55, -3, 83, -14, 55, -15, -108, 121, -119, -89, 88, -81, 120, -16}, new byte[]{-58, 23, -39, -16, 24, -5, -45, 98}) : (str.contains(C0098a.a(new byte[]{14, -25, -66}, new byte[]{116, -108, -36, 63, -120, 123, 124, -71})) || str.contains(C0098a.a(new byte[]{-69, -18, 53, -78}, new byte[]{-35, -123, 77, -63, -73, 116, -108, 46})) || str.contains(C0098a.a(new byte[]{59, -16, 49, -85}, new byte[]{67, -111, 72, -40, 96, 74, 83, -120})) || str.contains(C0098a.a(new byte[]{-110, -50, 109, 87}, new byte[]{-22, -83, 20, 36, -32, -126, 15, -127})) || str.contains(C0098a.a(new byte[]{73, -16, 44, 97}, new byte[]{58, -118, 85, 18, 0, 49, 68, -55})) || str.contains(C0098a.a(new byte[]{100, -52, -63, -25}, new byte[]{0, -76, -72, -108, -124, 10, 45, -106})) || str.contains(C0098a.a(new byte[]{-62, 14, -32, -77}, new byte[]{-69, 122, -103, -64, -15, 113, 112, 127})) || str.contains(C0098a.a(new byte[]{89, -119, -109, 35}, new byte[]{40, -25, -22, 80, 115, -62, 85, 77}))) ? C0098a.a(new byte[]{-21, -102, -89, 69, -94, 71, 51, 18, -102, -37, -3, 85, -20, 7, 105, 25, -58, -108, -4}, new byte[]{-81, -5, -43, 49, -115, 117, 29, 35}) : str.contains(C0098a.a(new byte[]{80, -70, 46, 104}, new byte[]{126, -52, 65, 12, 90, 46, -2, 82})) ? C0098a.a(new byte[]{69, 34, -65, 114, 39, 38, 124, 91, 4, 120, -7, 54}, new byte[]{42, 73, -41, 6, 83, 86, 83, 111}) : C0098a.a(new byte[]{75, -43, -33, 89, -70, -67, -2, -66, 33, -123, -99, 31}, new byte[]{15, -76, -77, 47, -45, -42, -47, -116}));
        return map;
    }

    private String i(String str, String str2) {
        if (str.contains(C0098a.a(new byte[]{7, -44, 83, -82}, new byte[]{41, -94, 60, -54, 34, 101, 31, -117}))) {
            if (str.contains(C0098a.a(new byte[]{-95, 118, -75, -98, 31, 78, -43, 115, -26, 122, -86, -106}, new byte[]{-56, 25, -59, -5, 113, 55, -96, 29}))) {
                StringBuilder sbC = C0133t.c(str);
                v.a(new byte[]{-83, -15, 98, -102, -114, -68, -112, -10, -65}, new byte[]{-126, -99, 11, -23, -6, -125, -25, -110}, sbC, str2);
                return C0133t.b(new byte[]{-93, -121, -55, -76, 97, -38}, new byte[]{-123, -9, -88, -45, 4, -25, -103, -79}, sbC);
            }
            StringBuilder sbC2 = C0133t.c(str);
            v.a(new byte[]{-43, -30, 111, -124}, new byte[]{-22, -107, 11, -71, 9, -124, 88, -72}, sbC2, str2);
            return C0133t.b(new byte[]{56, 116, 5, -79, -6, 49}, new byte[]{30, 4, 100, -42, -97, 12, -93, -103}, sbC2);
        }
        if (str.contains(C0098a.a(new byte[]{88, -40, 28, -75, 105, 8, -102, -26, 88, -40, 5}, new byte[]{57, -88, 117, -101, 25, 96, -22, -55})) || str.contains(C0098a.a(new byte[]{109, -90, -123, -80, 7}, new byte[]{21, -63, -28, -64, 119, -10, 95, -17}))) {
            StringBuilder sbC3 = C0133t.c(str);
            v.a(new byte[]{106, -17, 94, 44, -112, -93, -25, -49, 124, -14, 75, 99}, new byte[]{25, -118, 63, 94, -13, -53, -40, -69}, sbC3, str2);
            return C0133t.b(new byte[]{-6, -52, -91, -82}, new byte[]{-36, -68, -62, -109, 61, -82, 83, -38}, sbC3);
        }
        if (!c.matcher(str).find()) {
            return "";
        }
        if (str.contains(C0098a.a(new byte[]{24, 65, -83, 54, 9, -126, -68, -125, 18}, new byte[]{125, 50, -56, 90, 101, -29, -55, -9})) || str.contains(C0098a.a(new byte[]{-118, 124, -26, 91, 87, -17, 123, 103, -118, 98, -26}, new byte[]{-69, 82, -41, 111, 121, -39, 72, 73})) || str.contains(C0098a.a(new byte[]{-94, 33, -53, -68}, new byte[]{-40, 75, -78, -49, -20, -82, 15, -118})) || str.contains(C0098a.a(new byte[]{-110, -56, 31}, new byte[]{-10, -85, 123, 72, 0, -114, -1, -76})) || str.contains(C0098a.a(new byte[]{19, 86, -58, 21}, new byte[]{127, 46, -77, 112, -115, 7, 63, -118})) || str.contains(C0098a.a(new byte[]{43, -34, -50, 36, 47, 52, 89, 28, 50}, new byte[]{92, -69, -85, 80, 78, 93, 119, 127})) || str.contains(C0098a.a(new byte[]{17, -78, -44, -19, 34, -92, -111, 95, 72}, new byte[]{121, -45, -69, -122, 67, -54, -5, 42})) || str.contains(C0098a.a(new byte[]{-106, -57, 82, -114, -91}, new byte[]{-16, -82, 38, -76, -99, -116, 127, -10})) || str.contains(C0098a.a(new byte[]{109, -117, 30, -15, -124, 74, 63, 86}, new byte[]{23, -31, 116, -33, -24, 35, 89, 51})) || str.contains(C0098a.a(new byte[]{-92, -65, 16, 42, 17, -1, -18, 76}, new byte[]{-56, -48, 102, 79, 40, -58, -42, 117})) || str.contains(C0098a.a(new byte[]{97, 97, -37, 64}, new byte[]{89, 5, -29, 49, 73, -85, 8, 111})) || str.contains(C0098a.a(new byte[]{119, -48, 37, -8, 62, 40, -80}, new byte[]{27, -69, 11, -120, 70, 93, -34, 97})) || str.contains(C0098a.a(new byte[]{52, -33, -97, 15}, new byte[]{92, -72, -26, 119, -81, 15, -81, -44})) || str.contains(C0098a.a(new byte[]{-64, -14, -115, 76, 116}, new byte[]{-11, -64, -68, 52, 65, 58, -52, 1})) || str.contains(C0098a.a(new byte[]{104, -42, -103, -17, 19}, new byte[]{4, -82, -32, -106, 106, -102, -127, -79})) || str.contains(C0098a.a(new byte[]{-96, 34, 47, -31, 20, 74}, new byte[]{-112, 26, 30, -39, 96, 60, -92, 112})) || str.contains(C0098a.a(new byte[]{25, -90, 1, -72, 87, -51}, new byte[]{125, -49, 120, -41, 34, -92, 28, 88})) || str.contains(C0098a.a(new byte[]{-114, 95, 124, -32, -115, -3, 69}, new byte[]{-22, 54, 16, -119, -26, -119, 51, 12})) || str.contains(C0098a.a(new byte[]{4, 52, -85, 14, -79}, new byte[]{116, 68, -47, 102, -60, -87, 72, -49})) || str.contains(C0098a.a(new byte[]{-79, 109, -61, -9, 73, -77, 10, 27, -71}, new byte[]{-48, 4, -73, -110, 58, -58, 105, 122})) || str.contains(C0098a.a(new byte[]{120, -112, 41, 64, -43}, new byte[]{2, -22, 7, 35, -68, -97, -87, 0})) || str.contains(C0098a.a(new byte[]{-37, -13, -46, 63, -56, 27}, new byte[]{-72, -101, -86, 85, -89, 117, 36, 118})) || str.contains(C0098a.a(new byte[]{41, 61, -95, 46, 13, -127, 77}, new byte[]{94, 92, -43, 77, 101, -20, 36, 102})) || str.contains(C0098a.a(new byte[]{118, -40, -16, 5, 57}, new byte[]{0, -79, -128, 103, 73, 109, -117, -123})) || str.contains(C0098a.a(new byte[]{34, -20, 124, 35}, new byte[]{64, -124, 8, 85, -39, -95, 56, 100})) || str.contains(C0098a.a(new byte[]{-84, 88, 6, 45, -107}, new byte[]{-44, 62, 127, 70, -7, -78, 87, 95}))) {
            StringBuilder sbC4 = C0133t.c(str);
            v.a(new byte[]{125, -9, 106, 124, -56, -20, 77, -111, 100, -31, 109, 124}, new byte[]{66, -106, 9, 65, -92, -123, 62, -27}, sbC4, str2);
            return C0133t.b(new byte[]{-81, -26, -96, -99, 97, -120}, new byte[]{-119, -106, -63, -6, 4, -75, 115, 78}, sbC4);
        }
        StringBuilder sbC5 = C0133t.c(str);
        v.a(new byte[]{-35, -114, 104, -33, 85, -37, -72, 34, -60, -107, 102, -33}, new byte[]{-30, -17, 11, -30, 57, -78, -53, 86}, sbC5, str2);
        return C0133t.b(new byte[]{67, -40, -25, 121, -63, 67}, new byte[]{101, -88, -122, 30, -92, 126, 9, 55}, sbC5);
    }

    private String j(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(C0098a.a(new byte[]{9}, new byte[]{37, 55, -2, -25, -106, 119, 110, -57}), arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject jsonParse(java.lang.String r11, java.lang.String r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.jsonParse(java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07d6 A[LOOP:0: B:86:0x07d6->B:92:0x08eb, LOOP_START, PHI: r11
      0x07d6: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:85:0x07d4, B:92:0x08eb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap<java.lang.String, java.lang.String> r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    final String d(String str) {
        if (str.contains(C0098a.a(new byte[]{-73, 14, -36, -75, 52, 23, -40, -109, -73, 14, -59}, new byte[]{-42, 126, -75, -101, 68, 127, -88, -68})) || str.contains(C0098a.a(new byte[]{94, 114, -69, 115, -97}, new byte[]{38, 21, -38, 3, -17, -36, -71, 4}))) {
            if (str.contains(C0098a.a(new byte[]{-26, -64, -91, -2, -16, 80, 91, -16}, new byte[]{-126, -87, -49, -105, -111, 40, 50, -111}))) {
                return C0133t.b(new byte[]{45, 61, -105, -106, -19, 74, -86, -125, 63, 105}, new byte[]{91, 84, -13, -13, -126, 117, -34, -22}, C0133t.c(C0098a.a(new byte[]{-57, -106, -77, 109, -91, 21, 82, 16, -40, -107, -23, 121, -10, 80, 20, 6, -41, -117, -90, 51, -4, 85, 16, 72, -50, -110, -82, 51, -17, 82, 13, 72, -50, -110, -73, 50}, new byte[]{-81, -30, -57, 29, -97, 58, 125, 103})));
            }
            return C0133t.b(new byte[]{-19, -89, 50, 126, 46, -128, -2, 56, -1, -13}, new byte[]{-101, -50, 86, 27, 65, -65, -118, 81}, C0133t.c(str));
        }
        if (!str.contains(C0098a.a(new byte[]{17, -58, -111, 123}, new byte[]{63, -80, -2, 31, -118, -50, -75, 79}))) {
            return C0133t.b(new byte[]{-126, 36, 51, -118, 30, 6, -80, -17, -101, 38, 60, -42, 1, 28, -2}, new byte[]{-67, 69, 80, -73, 114, 111, -61, -101}, C0133t.c(str));
        }
        if (str.contains(C0098a.a(new byte[]{30, 75, -46, -29, -94, -22, -124, -102, 68, 94, -97}, new byte[]{106, 61, -4, -127, -41, -122, -31, -13}))) {
            return C0098a.a(new byte[]{-113, 84, 104, -78, -115, -118, -12, -58, -109, 86, 50, -96, -117, -36, -66, -128, -55, 67, 127, -19, -97, -64, -78, -37, -55, 80, 116, -78, -47, -58, -22, -57, -111, 79, 120, -3, -118, -55, -85, -116, -38}, new byte[]{-25, 32, 28, -62, -2, -80, -37, -23});
        }
        if (str.contains(C0098a.a(new byte[]{64, 76, 76, 94, 75, 126, 68, 60}, new byte[]{41, 35, 60, 59, 37, 7, 49, 82}))) {
            return C0133t.b(new byte[]{-41, 60, 76, 15, -102, 82, 98, -29, -120, 53, 24}, new byte[]{-8, 80, 37, 124, -18, 109, 22, -102}, C0133t.c(str));
        }
        return C0133t.b(new byte[]{15, 36, 100, -2, -36, -54}, new byte[]{48, 80, 29, -114, -71, -9, 36, 67}, C0133t.c(str));
    }

    public String detailContent(List<String> list) throws JSONException {
        StringBuilder sbC;
        String strA;
        String string;
        String strC = c();
        StringBuilder sb = new StringBuilder();
        if (strC.contains(C0098a.a(new byte[]{18, -66, -117, 27, 8, -35, -109, -37, 18, -66, -110}, new byte[]{115, -50, -30, 53, 120, -75, -29, -12})) || strC.contains(C0098a.a(new byte[]{66, -112, 58, -42, -43}, new byte[]{58, -9, 91, -90, -91, 122, 8, -63}))) {
            if (strC.contains(C0098a.a(new byte[]{-11, -52, -66, -100, 25, -58, 46, 66}, new byte[]{-111, -91, -44, -11, 120, -66, 71, 35}))) {
                sbC = C0133t.c(C0098a.a(new byte[]{-61, 111, 6, 83, 48, 12, -98, 21, -36, 108, 5, 13, 39, 95, -37, 83, -54, 99, 27, 66, 109, 85, -34, 87, -124, 122, 2, 74, 109, 70, -39, 74, -124, 122, 2, 83, 108}, new byte[]{-85, 27, 114, 35, 67, 54, -79, 58}));
                strA = C0098a.a(new byte[]{104, -86, -87, -72, -10, -86, 29, 73, 106, -94, -92, -79, -90, -100, 29, 17}, new byte[]{30, -61, -51, -35, -103, -11, 121, 44});
            } else if (strC.contains(C0098a.a(new byte[]{-123, 22, 36, 102, 116, 125}, new byte[]{-76, 38, 21, 86, 16, 4, -76, -56}))) {
                sbC = C0133t.c(C0098a.a(new byte[]{34, -100, 81, -117, -124, -118, 10, 6, 61, -97, 11, -54, -114, -108, 21, 21, 51, -58, 70, -104, -111, -60, 85, 24, 100, -104, 77, -117, -111, -60, 85, 1, 101}, new byte[]{74, -24, 37, -5, -66, -91, 37, 113}));
                strA = C0098a.a(new byte[]{-58, -8, -13, 48, -92, -89, -111, -49, -60, -16, -2, 57, -12, -111, -111, -105}, new byte[]{-80, -111, -105, 85, -53, -8, -11, -86});
            } else {
                sbC = C0133t.c(strC);
                strA = C0098a.a(new byte[]{-11, 86, 84, -59, -78, 115, -24, -75, -9, 94, 89, -52, -30, 69, -24, -19}, new byte[]{-125, 63, 48, -96, -35, 44, -116, -48});
            }
        } else {
            if (!strC.contains(C0098a.a(new byte[]{108, 88, 109, -43}, new byte[]{66, 46, 2, -79, 111, 85, 58, 2}))) {
                string = "";
                sb.append(string);
                sb.append(list.get(0));
                String string2 = sb.toString();
                SpiderDebug.log(string2);
                JSONObject jSONObject = new JSONObject(C0197c.l(string2, h(string2)));
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                b(strC, jSONObject, jSONObject3, list.get(0));
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
                jSONObject2.put(C0098a.a(new byte[]{-113, -119, -51, -105}, new byte[]{-29, -32, -66, -29, -120, -106, -90, 118}), jSONArray);
                return jSONObject2.toString();
            }
            if (strC.contains(C0098a.a(new byte[]{-64, -29, 30, 72, -42, 11, 60, 100}, new byte[]{-87, -116, 110, 45, -72, 114, 73, 10}))) {
                sbC = C0133t.c(strC);
                strA = C0098a.a(new byte[]{81, 18, -62, -24, 41, -112, 26, 29, 58, 73, -47, -13, 44, -90, 31, 48, 67}, new byte[]{126, 118, -89, -100, 72, -7, 118, 84});
            } else {
                sbC = C0133t.c(strC);
                strA = C0098a.a(new byte[]{6, -38, -32, -94, 69, 68, 58, -101, 95, -47, -31, -119, 77, 73, 107}, new byte[]{41, -66, -123, -42, 36, 45, 86, -92});
            }
        }
        sbC.append(strA);
        string = sbC.toString();
        sb.append(string);
        sb.append(list.get(0));
        String string22 = sb.toString();
        SpiderDebug.log(string22);
        JSONObject jSONObject4 = new JSONObject(C0197c.l(string22, h(string22)));
        JSONObject jSONObject22 = new JSONObject();
        JSONObject jSONObject32 = new JSONObject();
        b(strC, jSONObject4, jSONObject32, list.get(0));
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject32);
        jSONObject22.put(C0098a.a(new byte[]{-113, -119, -51, -105}, new byte[]{-29, -32, -66, -29, -120, -106, -90, 118}), jSONArray2);
        return jSONObject22.toString();
    }

    final String e(String str) {
        return (str.contains(C0098a.a(new byte[]{-99, -97, 81, 86, -108, 59, 116, 20, -99, -97, 72}, new byte[]{-4, -17, 56, 120, -28, 83, 4, 59})) || str.contains(C0098a.a(new byte[]{48, 37, -82, 85, 37}, new byte[]{72, 66, -49, 37, 85, -1, -9, -50}))) ? C0098a.a(new byte[]{61, -119, 112, 47, -9, -40, 65, -5, -74, 113, -11, -50, 13, -56, 16, 125, 104, -103, 58, 47, -10, -50, 29, 33, -4, 71, -121, -89, 4, 34, 29, 110, 126, -117, 58, 34, -27, -59, 27, 33, -4, 71, -121, -89, 4, 34, 16, 125, 117, -115, 58, 55, -31, -54, 14, 33, -4, 71, -121, -89, 4, 34, 5, 121, 122, -104, 58, 34, -19, -58, 21, 104, 38, -37, 36, 104, -12, -52, 65, 63, 75, -92, 63}, new byte[]{27, -22, 28, 78, -124, -85, 124, 28}) : str.contains(C0098a.a(new byte[]{15, -126, 85, -40}, new byte[]{33, -12, 58, -68, 117, 3, -56, -120})) ? C0098a.a(new byte[]{93, -29, -66, 47, 78, 32, 68, -125, -42, 27, 59, -50, -76, 48, 21, 5, 8, -13, -12, 47, 79, 54, 24, 89, -100, 45, 73, -89, -67, -38, 24, 22, 30, -31, -12, 34, 92, 61, 30, 89, -100, 45, 73, -89, -67, -38, 21, 5, 21, -25, -12, 55, 88, 50, 11, 89, -100, 45, 73, -89, -67, -38, 0, 1, 26, -14, -12, 44, 68, 110, -97, -22, -23, 101, 104, -63, 27, 63, 16, 9, 18, -12, -17, 127, 5, 117, 9, 5, 28, -27, -17, 109, 109, 29, 90}, new byte[]{123, -128, -46, 78, 61, 83, 121, 100}) : C0098a.a(new byte[]{-86, -92, -103, 49, 124, -19, -58, -50, -62, -9, -34, 55, 107, -75, -124, -93, 107, 121, 99, -65, -103, 89, -124, -20, -23, -75, -34, 34, 96, -96, -128, -93, 107, 121, 99, -65, -103, 89, -122, -14, -19, -89, -117, 112, 106, -92, -124, -20, -8, -23, 31, -5, -126, 57, 101, 23, -11, -79, -103, 36}, new byte[]{-116, -44, -8, 86, 25, -48, -27, -98});
    }

    final String f(String str) {
        StringBuilder sbC;
        String strA;
        if (str.contains(C0098a.a(new byte[]{114, 96, 37, 50, 75, 44, 93, -103, 114, 96, 60}, new byte[]{19, 16, 76, 28, 59, 68, 45, -74})) || str.contains(C0098a.a(new byte[]{21, 38, 63, 117, -91}, new byte[]{109, 65, 94, 5, -43, 30, 78, -123}))) {
            sbC = C0133t.c(str);
            strA = C0098a.a(new byte[]{104, -80, -36, 78, -88, -39, -46, -47, 104, -20}, new byte[]{6, -47, -86, 113, -36, -74, -71, -76});
        } else {
            if (!str.contains(C0098a.a(new byte[]{75, -102, 8, 78}, new byte[]{101, -20, 103, 42, -37, -18, -101, 61}))) {
                return "";
            }
            if (str.contains(C0098a.a(new byte[]{-83, 104, -85, -49, 7, 60, -60, 113, -22, 100, -76, -57}, new byte[]{-60, 7, -37, -86, 105, 69, -79, 31}))) {
                sbC = C0133t.c(str);
                strA = C0098a.a(new byte[]{126, -61, -82, -96, -88, -53, 66, -104, 33, -54}, new byte[]{81, -81, -57, -45, -36, -12, 54, -31});
            } else {
                sbC = C0133t.c(str);
                strA = C0098a.a(new byte[]{-110, 17, 126, 60, -22, 118}, new byte[]{-67, 101, 7, 76, -113, 5, -85, 91});
            }
        }
        sbC.append(strA);
        return sbC.toString();
    }

    final String g(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals(C0098a.a(new byte[]{-12, -37, -117, 98, 52}, new byte[]{-105, -73, -22, 17, 71, -74, 110, -38})) || next.equals(C0098a.a(new byte[]{84, -1, -102, -83}, new byte[]{53, -115, -1, -52, -40, -113, 125, -111})) || next.equals(C0098a.a(new byte[]{-100, -112, -9, 22}, new byte[]{-16, -15, -103, 113, -70, 101, 17, -10})) || next.equals(C0098a.a(new byte[]{27, -122, -58, 94}, new byte[]{98, -29, -89, 44, 125, -17, 40, -57}))) {
                    try {
                        str2 = str2 + C0098a.a(new byte[]{-58, 57, -120, 26, -86, 80}, new byte[]{33, -108, 19, -13, 42, -39, 98, -53}) + next + C0098a.a(new byte[]{127, -113, -73, -112, -98, -10, -79, -4, 127}, new byte[]{84, 106, 50, 56, 119, 117, 25, -63}) + jSONObject.getString(next).replace(C0098a.a(new byte[]{-98}, new byte[]{-78, 115, -116, 77, -84, -68, 123, -92}), C0098a.a(new byte[]{28}, new byte[]{55, 11, -51, 15, -125, -108, 52, -83})) + oZP.d("7F");
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return str.contains(C0098a.a(new byte[]{43, -56, 15, -47}, new byte[]{5, -66, 96, -75, -1, 113, -75, -36})) ? C0133t.b(new byte[]{-72, -75, 100, 34, -28, 5, -1, 116, 87, -42, 66, 89, -126, 23, 77, 116, 84, -49, 106, 86, -105, 15, 77, 43, -37, 62, -113, -101, -25, 35, -16, -72, 49, -2, -41, -40, 104, -53, 3, 116, 90, -4, 110, 85, -119, 57, 77, 44, -47, 60, -104, -43}, new byte[]{-78, 83, -22, -80, 1, -65, 112, 95}, C0133t.c(str2)) : (str.contains(C0098a.a(new byte[]{-117, -109, 47, -39, 120, 28, 26, -36, -117, -109, 54}, new byte[]{-22, -29, 70, -9, 8, 116, 106, -13})) || str.contains(C0098a.a(new byte[]{31, -118, -57, -120, -7}, new byte[]{103, -19, -90, -8, -119, -11, 7, -32}))) ? str2 : C0098a.a(new byte[]{127, 39, -6, -13, 83, 81, 11, -85, 31, 7, -107, -105, 74, -41, 11, -87, 14, 26, -103, -87, 83, -41, 77, 33, -20, -58, 25, 63, 10, 85, -66, -87, 33, 2, -103, -99, 69, -41, 84, 56, -22, -61, 29, 109, -55, 13, -101, -14, 114, 38, -58, 41, -106, -100, 83, 38, -11, -40, 87, -15, 104, 66, -58, -14, 49, -110, 31, 123, -113, -125, 67, 101, -82, -28, 65, 121, -115, -100, 73, 43, -59, -101, 23, 63, 6, 87, -77, -90, 24, 29, 65, 96, -117, -109, 85, 68, 125, 2, -25, -3, 98, 99, 67, 34, -5, -36, 15, 63, 7, 111, -120, -89, 25, 7, 65, 63, 7, 124, -68, -85, 19, 8, 87, -13, 106, 91, -58, -51, 31, -124, -102, -107, 114, 12, -96, -40, -79, 74, -10, -68, 6, 87, -68, 101, 125, 8, -19, -15, 91, 81, 11, -85, 19, 8, -102, -105, 103, -63, -58, -58, 2, 75, -58, -99, -55, 2, -115, -24, 127, 35, -42, 63, 5, 96, -113, -87, 39, 5, 87, -15, 104, 66, -57, -38, 33, -124, -103, -79, 101, 15, -103, -11, -79, 73, -47, -78, 6, 84, -128, 101, 127, 41, -18, -3, 123, 67, 11, -88, 4, 5, -102, -100, 122, -63, -58, -49, 10, 73, -4, -126, -55, 12, -94, -30, 125, 57, -19, 63, 4, 105, -86, -88, 24, 53, 87, -13, 89, 101, -59, -53, 34, -124, -107, -119, 112, 12, -72, -21, -79, 73, -22, -109, 10, 99, -102, 101, 127, 17, -46, -13, 118, 95, -59, -13, 43, -124, -103, -101, 70, 2, -125, -53, -79, 74, -14, -110, 7, 101, -110, 101, 114, 16, -20, -15, 104, 66, 11, -85, 28, 51, -102, -119, 115, -63, -58, -51, 16, 73, -2, -114, -55, 12, -93, -60, 124, 45, -26, 63, 6, 86, -122, -87, 10, 41, 87, -14, 97, 111, -56, -57, 40, -124, -101, -78, 109, 15, -88, -25, -79, 75, -60, -99, 5, 80, -121, 101, 127, 43, -61, -13, 73, 79, 11, -87, 39, 62, -101, -81, 126, 13, -76, -5, 127, 18, -51, 30, 5, 71, -69, -89, 26, 38, 29, 102, -121, -117, 11, -85, 31, 7, -107, -105, 74, -41, 11, -85, 62, 8, -107, -115, 100, -63, -55, -24, 3, 73, -60, -69, -55, 15, -81, -2, 124, 22, -62, 63, 5, 84, -82, -85, 1, 18, 87, -4, 105, 91, -59, -43, 39, -124, -102, -89, 119, 15, -69, -13, -79, 73, -21, -79, 4, 118, -116, 101, 115, 48, -43, -15, 121, 87, 11, -85, 36, 24, -103, -113, 95, -63, -58, -3, 42, 74, -25, -87, -55, 15, -83, -2, 127, 21, -38, 63, 10, 79, -97, -87, 21, 2, -101, -99, 123, -63, -59, -60, 58, 73, -9, -85, 7, 78, -121, 101, 127, 42, -54, -16, 89, 124, 42, -87, 55, 52, -107, -108, 107, -109, 69, 47, -24, -124, -103, -111, 74, 3, -93, -26, -89, -124, 78, 36, -48, -39, 11, 124, -86, -99, 78, 63, -48, -38, 18, 127, -79, -99, 76, 38, -46, -63, 18, 126, -85, -106, 87, 38, -46, -37, 24, 101, -88, -97, 77, 35, -55, -40, 16, 127, -84, -124, 78, 36, -45, -33, 11, 124, -86, -98, 72, 63, -48, -38, 17, 125, -79, -99, 76, 37, -48, -63, 18, 126, -85, -98, 87, 38, -46, -37, 16, 101, -88, -97, 76, 45, -55, -40, 16, 126, -94, -124, 78, 36, -46, -35, 11, 124, -86, -97, 74, 63, -48, -38, 16, 123, -79, -99, 76, 36, -42, -63, 18, 126, -86, -100, 87, 38, -46, -38, 18, 101, -88, -97, 76, 37, -55, -40, 16, 126, -86}, new byte[]{-102, -81, 124, 20, -30, -22, 32, 78});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0311  */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.homeContent(boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeVideoContent() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.homeVideoContent():java.lang.String");
    }

    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.b = str.split(C0098a.a(new byte[]{-113, -49, 45}, new byte[]{-84, -20, 14, 2, 22, -4, -67, 9}));
        } catch (Exception unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return C0207D.o(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        JSONObject jSONObject;
        String strA;
        JSONObject jSONObject2;
        boolean z;
        int i = 6;
        if (str.contains(C0098a.a(new byte[]{-58, -17, -28, 59, 102, 40}, new byte[]{-96, -114, -118, 74, 15, 77, -104, 34})) && C0207D.o(str2)) {
            jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-58, 118, 118, 83, -75}, new byte[]{-74, 23, 4, 32, -48, 2, 83, 114}), 0);
            jSONObject.put(C0098a.a(new byte[]{113, 126, 111, 60, -46, -8, -13}, new byte[]{1, 18, 14, 69, -121, -118, -97, 50}), "");
            strA = C0098a.a(new byte[]{-22, 98, 55}, new byte[]{-97, 16, 91, -30, -108, 112, 30, 61});
        } else {
            ArrayList<String> arrayList = this.a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.isEmpty()) {
                Iterator<String> it = arrayList.iterator();
                String str3 = "";
                while (true) {
                    jSONObject2 = null;
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!next.isEmpty() && !next.equals(C0098a.a(new byte[]{-59, -43, 97, -89}, new byte[]{-85, -96, 13, -53, -32, 79, -54, 126}))) {
                            String strL = C0197c.l(next + str2, null);
                            try {
                                jSONObject2 = jsonParse(str2, strL);
                            } catch (Throwable unused) {
                            }
                            if (jSONObject2 != null && jSONObject2.has(C0098a.a(new byte[]{-110, 8, 10}, new byte[]{-25, 122, 102, 29, 14, 43, -100, 81}))) {
                                byte[] bArr = new byte[i];
                                // fill-array-data instruction
                                bArr[0] = -4;
                                bArr[1] = 117;
                                bArr[2] = 46;
                                bArr[3] = 12;
                                bArr[4] = -51;
                                bArr[5] = -118;
                                if (jSONObject2.has(C0098a.a(bArr, new byte[]{-108, 16, 79, 104, -88, -8, -10, 54}))) {
                                    byte[] bArr2 = new byte[i];
                                    // fill-array-data instruction
                                    bArr2[0] = -48;
                                    bArr2[1] = 53;
                                    bArr2[2] = -75;
                                    bArr2[3] = -41;
                                    bArr2[4] = -116;
                                    bArr2[5] = -80;
                                    byte[] bArr3 = new byte[i];
                                    // fill-array-data instruction
                                    bArr3[0] = 65;
                                    bArr3[1] = -121;
                                    bArr3[2] = -37;
                                    bArr3[3] = 86;
                                    bArr3[4] = 40;
                                    bArr3[5] = -91;
                                    jSONObject2.put(C0098a.a(bArr2, new byte[]{-72, 80, -44, -77, -23, -62, -70, -40}), jSONObject2.getJSONObject(C0098a.a(bArr3, new byte[]{41, -30, -70, 50, 77, -41, 107, 52})).toString());
                                    break;
                                }
                            }
                            if (strL.contains(C0098a.a(new byte[]{20, 98, 78, -123, -98}, new byte[]{40, 10, 58, -24, -14, 39, -128, -123}))) {
                                Pattern[] patternArr = f;
                                int length = patternArr.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        z = false;
                                        break;
                                    }
                                    if (patternArr[i2].matcher(strL).find()) {
                                        z = true;
                                        break;
                                    }
                                    i2++;
                                }
                                if (z) {
                                    str3 = next;
                                }
                            }
                        }
                        i = 6;
                    } else if (!str3.isEmpty()) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(C0098a.a(new byte[]{-127, 4, -87, -112, 7}, new byte[]{-15, 101, -37, -29, 98, 48, -18, 36}), 1);
                        jSONObject2.put(C0098a.a(new byte[]{-12, 71, -50, -85, -108, -58, -80}, new byte[]{-124, 43, -81, -46, -63, -76, -36, 0}), str3);
                        jSONObject2.put(C0098a.a(new byte[]{85, -96, 56}, new byte[]{32, -46, 84, 34, -91, -85, 59, 22}), str2);
                    }
                }
                if (jSONObject2 != null) {
                    return jSONObject2.toString();
                }
            }
            if (C0207D.o(str2)) {
                jSONObject = new JSONObject();
                jSONObject.put(C0098a.a(new byte[]{56, -53, 119, -76, -104}, new byte[]{72, -86, 5, -57, -3, -93, -75, 10}), 0);
                jSONObject.put(C0098a.a(new byte[]{71, -100, 95, 25, -88, 73, -24}, new byte[]{55, -16, 62, 96, -3, 59, -124, -5}), "");
                strA = C0098a.a(new byte[]{-29, 56, -57}, new byte[]{-106, 74, -85, -120, 124, 71, 93, 2});
            } else {
                jSONObject = new JSONObject();
                jSONObject.put(C0098a.a(new byte[]{77, 73, 88, 20, -35}, new byte[]{61, 40, 42, 103, -72, -121, 10, 104}), 1);
                jSONObject.put(C0098a.a(new byte[]{-79, 45}, new byte[]{-37, 85, 4, -125, 16, 31, -91, 20}), C0098a.a(new byte[]{-82}, new byte[]{-97, -52, -31, -113, -6, -32, -56, 17}));
                strA = C0098a.a(new byte[]{100, 50, -26}, new byte[]{17, 64, -118, -33, -38, 105, 80, 106});
            }
        }
        jSONObject.put(strA, str2);
        return jSONObject.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String searchContent(java.lang.String r12, boolean r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.searchContent(java.lang.String, boolean):java.lang.String");
    }
}
