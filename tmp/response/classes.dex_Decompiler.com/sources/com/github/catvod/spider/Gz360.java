package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.o;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Gz360 extends Spider {
    private static final String a = C0098a.a(new byte[]{72, -10, -1, 64, -101, 123, 66, 30, 73, -12, -83, 74, -51, 46, 20, 78, 66, -8, -81, 17, -100, 42, 78, 72, 18, -96, -15, 75, -102, 120, 17, 74, 95, -11, -86, 16, -56, 123, 67, 64, 21, -94, -6, 71, -101, 123, 18, 64, 19, -91, -84, 23, -104, 36, 20, 30, 20, -11, -84, 21, -110, 124, 20, 74, 16, -91, -85, 65, -100, 41, 69, 77, 16, -8, -7, 69, -110, 120, 65, 27, 21, -16, -5, 66, -103, 44, 71, 30, 18, -10, -85, 18, -98, 44, 79, 29, 16, -7, -86, 66, -56, 126, 66, 78, 67, -8, -5, 69, -102, 120, 78, 76, 19, -93, -1, 16, -56, 127, 65, 78, 21, -7, -4, 71, -109, 41, 67, 65, 18, -10, -5, 67, -100, 43, 20, 65, 68, -9, -88, 65, -51, 127, 67, 78, 18, -13, -4, 64, -101, 45, 79, 65, 65, -8, -88, 69, -56, 43, 65, 75, 69, -10, -84, 17, -97, 40, 79, 30, 20, -14, -86, 67, -99, 121, 70, 30, 18, -94, -16, 74, -104, 126, 22, 72, 66, -96, -5, 74, -109, 46, 69, 64, 23, -8, -5, 65, -110, 123, 70, 65, 72, -11, -88, 69, -101, 37, 69, 77, 65, -94, -2, 23, -102, 124, 18, 73, 67, -11, -86, 71, -98, 47, 71, 29, 71, -92, -8, 71, -56, 120, 79, 26, 23, -8, -81, 71, -97, 45, 67, 73, 64, -8, -88, 69, -55, 127, 17, 77, 66, -94, -81, 70, -110, 47, 22, 64, 21, -89, -5, 22, -110, 44, 67, 77, 21, -92, -16, 65, -50, 126, 67, 75, 20, -94, -15, 68, -56, 123, 67, 26, 21, -94, -4, 69, -104, 123, 65, 29, 72, -16, -16, 21, -50, 46, 69, 64, 71, -16, -85, 67, -50, 36, 68, 26, 64, -16, -15, 22, -56, 46, 64, 28, 73, -15, -6, 70, -51, 127, 21, 75, 18, -17, -3, 68, -104, 41, 68, 75, 72, -10, -16, 68, -98, 40, 20, 27, 21, -12, -84, 16, -102, 127, 67, 77, 73, -16, -86, 16, -50, 123, 64, 78, 20, -7, -5, 67, -110, 127, 78, 29, 65, -94, -1, 21, -51, 37, 70, 65, 72, -16, -2, 21, -102, 47, 19, 30, 23, -96, -83, 71, -100, 121, 71, 28, 68, -92}, new byte[]{113, -63, -55, 115, -85, 29, 119, 120});
    private static final String b = C0098a.a(new byte[]{70, -11, 97, 4, -26, -27, 87, 5, 79, -15, 124, 90, -84, -20, 76, 79, 88, -25, 59, 23, -6, -78}, new byte[]{46, -127, 21, 116, -107, -33, 120, 42});
    private static final Map<String, String> c = new HashMap();
    private static Map<String, Boolean> d = new HashMap();

    private String a(String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{-13, 105, 45, -109, 104, 6, 112}, new byte[]{-91, 12, 95, -32, 1, 105, 30, 8}), C0098a.a(new byte[]{-126, -6, -72, -80, 94, -4, 75}, new byte[]{-80, -50, -120, -122, 110, -50, 126, 13}));
            map.put(C0098a.a(new byte[]{-28, 40, -46, -72, 30, 110, 39, 76, -43, 36, -44}, new byte[]{-76, 73, -79, -45, 127, 9, 66, 2}), C0098a.a(new byte[]{-10, -99, 80, 46, -72, -117, -107, 7, -95, -112, 15, 49, -30, -118, -109, 79, -3, -109, 11, 57, -28, -124, -104, 89, -94, -53, 19, 100, -76, -40, -64, 81, -12, -53, 5, 50, -28, -33, -64, 79, -4, -112, 91, 53, -30, -34, -104, 3, -92, -106}, new byte[]{-107, -14, 61, 0, -46, -67, -95, 97}));
            map.put(C0098a.a(new byte[]{-102, -36, -55}, new byte[]{-52, -71, -69, 26, 32, -80, 71, 38}), C0098a.a(new byte[]{-90, 93, 94, -37, 93}, new byte[]{-105, 115, 103, -11, 111, -127, -51, -1}));
            String strA = C0098a.a(new byte[]{-125, 98, 125, -6, -87, -6, -17}, new byte[]{-47, 7, 27, -97, -37, -97, -99, 77});
            String str3 = b;
            map.put(strA, str3);
            map.put(C0098a.a(new byte[]{45, 70, -38, 34, 101, -2, 1, -99, 58, 80, -60, 51}, new byte[]{110, 41, -76, 86, 0, -112, 117, -80}), C0098a.a(new byte[]{94, -34, -37, 121, -38, 14, 124, 33, 86, -63, -59, 58, -53, 64, 106, 34, 72, -125, -51, 122, -63, 0, 48, 32, 77, -62, -50, 123, -48, 2, 121, 48, 91}, new byte[]{63, -82, -85, 21, -77, 109, 29, 85}));
            map.put(C0098a.a(new byte[]{-83, 0, -33, -89, -21, 115, -94, -23, -106, 7}, new byte[]{-8, 115, -70, -43, -58, 50, -59, -116}), C0098a.a(new byte[]{-123, -114, -55, -67, 5, 69, 75, -60, -60, -44, -109, -25, 65}, new byte[]{-22, -27, -95, -55, 113, 53, 100, -9}));
            String str4 = (System.currentTimeMillis() / 1000) + "";
            String strA2 = C0098a.a(new byte[]{72, 92, 120, 8, 5, 60, -121, -104, 104, 98, 78, 8, 117, 61, -69, -91, 95, 119, 95, 40, 57, 42, -89, -69, 67, 88, 85, 31, 61, 32, -99, -104, 107, 70, 121, 1, 124, 15, -69, -39, 112, 68, 73, 64, 8, 37, -97, -83, 126, 124, 102, 61, 26, 50, -85, -88, 66, 37, 25, 56, 22, 93, -99, -99, 65, 82, 31, 64, 21, 88, -107, -68, 30, 68, 74, 8, 33, 71, -24, -114, 70, 120, 101, 51, 45, 2, -26, -118, 99, 62, 72, 17, 33, 7, -100, -36, 76, 120, 78, 76, 4, 11, -94, -123, 80, 104, 107, 54, 2, 45, -90, -77, 115, 36, 74, 49, 14, 30, -66, -126, 104, 99, 73, 62, 45, 60, -23, -117, 122, 126, 77, 1, 33, 6, -122, -115, 126, 67, 70, 43, 42, 34, -85, -80, 112, 71, 26, 45, 124, 94, -98, -34, 109, 98, 117, 47, 45, 94, -107, -100, 97, 69, 122, 56, 62, 10, -31, -114, 30, 41, 125, 68}, new byte[]{42, 17, 44, 121, 76, 104, -47, -23});
            String strC = C0208a.c(str2, C0098a.a(new byte[]{-39, 6, -29, -84, -44, -102, 55, 0, -30, 127, -112, -3, -19, -19, 20, 31}, new byte[]{-116, 62, -47, -97, -70, -94, 71, 75}).getBytes(), C0098a.a(new byte[]{27, 11, 31, 103, 44, 111, -104, -118, 31, 91, 89, 109, 84, 46, -68, -8}, new byte[]{108, 108, 109, 95, 98, 89, -38, -55}).getBytes());
            String upperCase = C0207D.a(C0098a.a(new byte[]{93, 46, 87, 92, -89, 115, 51, -21, 20, 109, 72, 86, -94, 73, 52, -78, 16, 118, 10, 10, -7, 74, 111, -23, 17, 116, 88, 0, -81, 31, 57, -71, 26, 120, 90, 91, -2, 27, 99, -65, 74, 32, 4, 1, -8, 73, 60, -67, 7, 117, 95, 90, -86, 74, 110, -73, 77, 34, 15, 13, -7, 74, 63, -73, 75, 37, 89, 93, -6, 21, 57, -23, 76, 117, 89, 95, -16, 77, 57, -67, 72, 37, 94, 11, -2, 24, 104, -70, 72, 120, 12, 15, -16, 73, 108, -20, 77, 112, 14, 8, -5, 29, 106, -23, 74, 118, 94, 88, -4, 29, 98, -22, 72, 121, 95, 8, -86, 79, 111, -71, 27, 120, 14, 15, -8, 73, 99, -69, 75, 35, 10, 90, -86, 78, 108, -71, 77, 121, 9, 13, -15, 24, 110, -74, 74, 118, 14, 9, -2, 26, 57, -74, 28, 119, 93, 11, -81, 78, 110, -71, 74, 115, 9, 10, -7, 28, 98, -74, 25, 120, 93, 15, -86, 26, 108, -68, 29, 118, 89, 91, -3, 25, 98, -23, 76, 114, 95, 9, -1, 72, 107, -23, 74, 34, 5, 0, -6, 79, 59, -65, 26, 32, 14, 0, -15, 31, 104, -73, 79, 120, 14, 11, -16, 74, 107, -74, 16, 117, 93, 15, -7, 20, 104, -70, 25, 34, 11, 93, -8, 77, 63, -66, 27, 117, 95, 13, -4, 30, 106, -22, 31, 36, 13, 13, -86, 73, 98, -19, 79, 120, 90, 13, -3, 28, 110, -66, 24, 120, 93, 15, -85, 78, 60, -70, 26, 34, 90, 12, -16, 30, 59, -73, 77, 39, 14, 92, -16, 29, 110, -70, 77, 36, 5, 11, -84, 79, 110, -68, 76, 34, 4, 14, -86, 74, 110, -19, 77, 34, 9, 15, -6, 74, 108, -22, 16, 112, 5, 95, -84, 31, 104, -73, 31, 112, 94, 9, -84, 21, 105, -19, 24, 112, 4, 92, -86, 31, 109, -21, 17, 113, 15, 12, -81, 78, 56, -68, 74, 111, 8, 14, -6, 24, 105, -68, 16, 118, 5, 14, -4, 25, 57, -20, 77, 116, 89, 90, -8, 78, 110, -70, 17, 112, 95, 90, -84, 74, 109, -71, 76, 121, 14, 9, -16, 78, 99, -22, 25, 34, 10, 95, -81, 20, 107, -74, 16, 112, 11, 95, -8, 30, 62, -23, 79, 32, 88, 13, -2, 72, 106, -21, 28, 36, 16, 73, -95, 67, 52, -22, 118, 53, 69, 73, -84, 17, 107, -93, 91, 36, 77, 76, -84, 95, 46, -48, 66, 36, 69, 4}, new byte[]{41, 65, 60, 57, -55, 44, 90, -113}) + strC + C0098a.a(new byte[]{1, -120, 18, -15, -124, -26, 79, -64, 28, -59, 22, -24, -74, -22, 22}, new byte[]{45, -23, 98, -127, -37, -113, 43, -3}) + str4 + C0098a.a(new byte[]{-1, 118, 115, -7, 99, -111}, new byte[]{-45, 29, 22, -128, 16, -84, 21, -7}) + strA2 + C0098a.a(new byte[]{-81, 45, 68, 85, -39, 66, 63, -83, -31, 111, 92, 69, -44, 95, 48, -80, -16, 102, 74, 78, -39, 67, 42, -85, -11, 123, 1, 95, -119, 109, 122, -88, -92, 57, 92, 81}, new byte[]{-123, 11, 62, 35, -67, 52, 91, -37})).toUpperCase();
            C0098a.a(new byte[]{74, -89, -63, -90, 91, -119, 113, -22, 8, -5, -102, -91, 0, -46, 112, -24, 90, -15, -52, -16, 86, -126, 123, -28, 88, -86, -99, -12, 12, -124, 43, -68, 6, -16, -101, -90, 83, -122, 102, -23, 93, -85, -55, -91, 1, -116, 44, -66, 13, -4, -102, -91, 80, -116, 42, -71, 91, -84, -103, -6, 86, -46, 45, -23, 91, -82, -109, -94, 86, -122, 41, -71, 92, -6, -99, -9, 7, -127, 41, -28, 14, -2, -109, -90, 3, -41, 44, -20, 12, -7, -104, -14, 5, -46, 43, -22, 92, -87, -97, -14, 13, -47, 41, -27, 93, -7, -55, -96, 0, -126, 122, -28, 12, -2, -101, -90, 12, -128, 42, -65, 8, -85, -55, -95, 3, -126, 44, -27, 11, -4, -110, -9, 1, -115, 43, -22, 12, -8, -99, -11, 86, -115, 125, -21, 95, -6, -52, -95, 1, -126, 43, -17, 11, -5, -102, -13, 13, -115, 120, -28, 95, -2, -55, -11, 3, -121, 124, -22, 91, -86, -98, -10, 13, -46, 45, -18, 93, -8, -100, -89, 4, -46, 43, -66, 7, -15, -103, -96, 84, -124, 123, -68, 12, -15, -110, -16, 7, -116, 46, -28, 12, -6, -109, -91, 4, -115, 113, -23, 95, -2, -102, -5, 7, -127, 120, -66, 9, -84, -101, -94, 80, -123, 122, -23, 93, -4, -97, -15, 5, -47, 126, -72, 15, -4, -55, -90, 13, -42, 46, -28, 88, -4, -98, -13, 1, -123, 121, -28, 95, -2, -56, -95, 83, -127, 123, -66, 88, -3, -109, -15, 84, -116, 44, -69, 12, -83, -109, -14, 1, -127, 44, -72, 7, -6, -49, -96, 1, -121, 45, -66, 6, -1, -55, -91, 1, -42, 44, -66, 11, -2, -103, -91, 3, -47, 113, -20, 7, -82, -49, -16, 7, -116, 126, -20, 92, -8, -49, -6, 6, -42, 121, -20, 6, -83, -55, -16, 2, -48, 112, -19, 13, -3, -52, -95, 87, -121, 43, -13, 10, -1, -103, -9, 6, -121, 113, -22, 7, -1, -97, -10, 86, -41, 44, -24, 91, -85, -101, -95, 1, -127, 112, -20, 93, -85, -49, -91, 2, -126, 45, -27, 12, -8, -109, -95, 12, -47, 120, -66, 8, -82, -52, -5, 4, -115, 113, -20, 9, -82, -101, -15, 81, -46, 46, -68, 90, -4, -99, -89, 5, -48, 125, -72, 24, -68, -59, -88, 80, -38, 23, -76, 90, -11, -116, -77, 93, -37, 38, -72, 97, -68, -45, -77, 80, -119, 121, -5, 74, -95, -57, -90, 8}, new byte[]{62, -56, -86, -61, 53, -76, 72, -35});
            C0098a.a(new byte[]{20, -18, 16, -103, 39, 30, -1, -16, 93, -6, 29, -102, 116, 3, -55, -4, 93, -13, 17, -37, 123, 73, -112, -85, 3, -84, 75, -123, 42, 93, -53, -8, 75, -19, 69}, new byte[]{50, -98, 120, -10, 73, 123, -96, -99});
            URLEncoder.encode(strA2);
            C0098a.a(new byte[]{-53, 23, 68, -52, 60, 23, 80, 6, -78, 14, 68, -60, 116}, new byte[]{-19, 101, 33, -67, 73, 114, 35, 114});
            C0098a.a(new byte[]{49, -70, -33, -78, 65, -65, 22, 40, 101, -84, -117}, new byte[]{23, -55, -74, -43, 47, -34, 98, 93});
            C0098a.a(new byte[]{-13, -113, -97, 12, 118, -64, -58, 27, -28, -56, -114, 24, 118, -33, -57, 84, -90, -121, -128, 18, 20, -104}, new byte[]{-43, -18, -17, 124, 41, -87, -94, 38});
            HashMap map2 = new HashMap();
            map2.put(C0098a.a(new byte[]{25, -112, 51, 1, 82}, new byte[]{109, -1, 88, 100, 60, -22, 127, 49}), a);
            map2.put(C0098a.a(new byte[]{79, 100, -4, 13, -68, -110, -95, 10}, new byte[]{59, 11, -105, 104, -46, -51, -56, 110}), "");
            map2.put(C0098a.a(new byte[]{-60, 90, 33, 30, 24, 34, -104, -125, -60, 87}, new byte[]{-76, 50, 78, 112, 125, 125, -20, -6}), C0098a.a(new byte[]{-57}, new byte[]{-10, -122, 116, -105, -93, -93, -107, -80}));
            map2.put(C0098a.a(new byte[]{-75, -69, 16, -81}, new byte[]{-63, -46, 125, -54, -113, -51, 89, -56}), str4);
            map2.put(C0098a.a(new byte[]{-120, 111, 68, -37, -37, 84, -37, 55, -100, 98, 71}, new byte[]{-8, 7, 43, -75, -66, 11, -74, 88}), C0098a.a(new byte[]{95, 28, -59, -74, 6, 25, 33, 53, 21, 69, -110, -24, 89, 67, 127, 100}, new byte[]{39, 117, -92, -39, 107, 112, 12, 7}));
            map2.put(C0098a.a(new byte[]{124, 112, -4, 121}, new byte[]{23, 21, -123, 10, 0, 53, 73, 98}), strA2);
            map2.put(C0098a.a(new byte[]{48, 77, -117, -15, -50, 120, -110, -112, 41, 77, -125}, new byte[]{66, 40, -6, -124, -85, 11, -26, -49}), strC);
            map2.put(C0098a.a(new byte[]{-10, -14, -33, -77, -119, 74, 123, 62, -32}, new byte[]{-123, -101, -72, -35, -24, 62, 14, 76}), upperCase);
            map2.put(C0098a.a(new byte[]{70, -54, -40, -22, -2, -70}, new byte[]{39, -70, -88, -75, -105, -34, -8, 18}), C0098a.a(new byte[]{32}, new byte[]{17, 90, 8, -101, -45, -105, 112, -110}));
            map2.put(C0098a.a(new byte[]{4, -23, -76, 36, -123, 34, -73, 60, 10, -29}, new byte[]{101, -115, -21, 82, -32, 80, -60, 85}), C0098a.a(new byte[]{-32}, new byte[]{-47, -52, -85, 46, 6, 87, -68, -86}));
            String strA3 = C0197c.h(str3 + str, map2, map).a();
            SpiderDebug.log(C0098a.a(new byte[]{-115, -22, 43, -119, -69, 15, -32}, new byte[]{-1, -113, 88, -4, -41, 123, -38, -83}) + strA3);
            JSONObject jSONObjectOptJSONObject = new JSONObject(strA3).optJSONObject(C0098a.a(new byte[]{-118, 14, 121, -55}, new byte[]{-18, 111, 13, -88, 58, -26, 34, 0}));
            SpiderDebug.log(jSONObjectOptJSONObject.toString());
            JSONObject jSONObject = new JSONObject(o.a(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-64, 23, 60, 84}, new byte[]{-85, 114, 69, 39, 23, 78, 8, 103})), C0098a.a(new byte[]{-68, -36, -50, 67, 49, 111, -14, 46, -63, -33, -60, 47, 44, 49, -52, 42, -118, -21, -26, 2, 24}, new byte[]{-18, -113, -113, 108, 127, 0, -100, 75})));
            SpiderDebug.log(jSONObject.toString());
            return C0208a.a(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{113, 124, -42, 65, 103, -67, -85, 65, 92, 114, -64, 72}, new byte[]{3, 25, -91, 49, 8, -45, -40, 36})), jSONObject.optString(C0098a.a(new byte[]{4, 122, 119}, new byte[]{111, 31, 14, 96, -79, 38, -62, 112})), jSONObject.optString(C0098a.a(new byte[]{-95, 7}, new byte[]{-56, 113, 24, 47, 53, -7, -110, -81})));
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{95, -96, -63}, new byte[]{43, -55, -91, -56, 80, 76, -110, -79}), str);
        jsonObject.addProperty(C0098a.a(new byte[]{28, 103, 126, 18}, new byte[]{108, 6, 25, 119, 63, 97, -108, -102}), str2);
        jsonObject.addProperty(C0098a.a(new byte[]{38, 20, 103, -93}, new byte[]{85, 123, 21, -41, -77, 92, -59, 109}), (map == null || !map.containsKey(C0098a.a(new byte[]{-104, 90, 25, -35}, new byte[]{-21, 53, 107, -87, 2, 68, 26, -33}))) ? C0098a.a(new byte[]{-32, 66, -89, -70}, new byte[]{-124, 29, -50, -34, 23, 57, -24, 23}) : map.get(C0098a.a(new byte[]{105, -107, -119, -66}, new byte[]{26, -6, -5, -54, 25, -15, -11, -18})));
        jsonObject.addProperty(C0098a.a(new byte[]{127, -32, -19, -38}, new byte[]{30, -110, -120, -69, -62, -6, -22, -3}), (map == null || !map.containsKey(C0098a.a(new byte[]{88, -100, 13, 39}, new byte[]{57, -18, 104, 70, 102, -1, -47, 27}))) ? C0098a.a(new byte[]{111}, new byte[]{95, -43, -127, -95, -18, -43, 99, -74}) : map.get(C0098a.a(new byte[]{1, 3, 20, -21}, new byte[]{96, 113, 113, -118, 46, 97, -76, 65})));
        jsonObject.addProperty(C0098a.a(new byte[]{101, -103, -109}, new byte[]{22, -20, -15, 17, -30, -121, -107, 61}), (String) ((map == null || !map.containsKey(C0098a.a(new byte[]{-123, 30, -1}, new byte[]{-10, 107, -99, -68, 76, 101, -96, -44}))) ? c.get(str) : map.get(C0098a.a(new byte[]{120, 76, 18}, new byte[]{11, 57, 112, -127, 111, -94, -64, 52}))));
        jsonObject.addProperty(C0098a.a(new byte[]{-58, -75, -73, -78}, new byte[]{-65, -48, -42, -64, 125, -58, -10, 127}), (map == null || !map.containsKey(C0098a.a(new byte[]{-95, 60, 89, -91}, new byte[]{-40, 89, 56, -41, 59, 115, 106, -24}))) ? C0098a.a(new byte[]{71}, new byte[]{119, 68, -33, -128, -106, 47, -39, 124}) : map.get(C0098a.a(new byte[]{-107, -98, -88, -126}, new byte[]{-20, -5, -55, -16, 20, 101, -38, 100})));
        jsonObject.addProperty(C0098a.a(new byte[]{24, 15, 15, -28, -74, -45, -109, 64}, new byte[]{104, 110, 104, -127, -27, -70, -23, 37}), C0098a.a(new byte[]{-119, 71}, new byte[]{-70, 119, 60, 34, 28, 36, -64, -44}));
        String strA = a(C0098a.a(new byte[]{-46, 38, 103, 108, 40, 55, 115, -83, -104, 31, 91, 117, 116, 10, 50, -96, -109, 3, 114, 100, 75, 23, 110, -67}, new byte[]{-3, 103, 23, 28, 7, 126, 29, -55}), jsonObject.toString());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray(C0098a.a(new byte[]{-19, 16, 89, -33}, new byte[]{-127, 121, 42, -85, 39, 0, -100, 116}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-2, -91, 64, 39, 105, -7}, new byte[]{-120, -54, 36, 120, 0, -99, -58, 121}));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-80, 83, -102, 94, 89, -73, -10, -46}, new byte[]{-58, 60, -2, 1, 55, -42, -101, -73}));
            String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{91, 0, -116, 29, 80, 19, 27}, new byte[]{45, 111, -24, 66, 32, 122, 120, 126}));
            String strOptString4 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{41, -26, -104, 83, -15, 50, 99, 48, 58}, new byte[]{95, -119, -4, 12, -126, 81, 17, 95}));
            if (d.isEmpty() || !d.containsKey(strOptString2)) {
                j.a(strOptString, strOptString2, strOptString3, strOptString4, arrayList);
            }
        }
        h hVar = new h();
        hVar.k(Integer.valueOf(str2).intValue(), 0, 0, 0);
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{-57, -61, -103, -46, -29, 62, 35, -89}, new byte[]{-77, -84, -14, -73, -115, 97, 74, -61}), C0098a.a(new byte[]{23, -127, -21, 40, 9, -97, -122}, new byte[]{38, -79, -37, 17, 61, -87, -78, 88}));
        char c2 = 0;
        jsonObject.addProperty(C0098a.a(new byte[]{51, 60, -3, -72, -50, 111}, new byte[]{69, 83, -103, -25, -89, 11, -65, -88}), list.get(0));
        jsonObject.addProperty(C0098a.a(new byte[]{60, -94, -26, -30, 19, -3, -124, 111, 56, -96, -31}, new byte[]{81, -51, -124, -117, 127, -104, -37, 27}), (System.currentTimeMillis() / 1000) + "");
        byte b2 = 5;
        jsonObject.addProperty(C0098a.a(new byte[]{48, -82, 106, 66, 82}, new byte[]{68, -63, 1, 39, 60, -26, -26, -50}), a);
        String strA = a(C0098a.a(new byte[]{-74, 3, -87, 5, -18, 42, 37, 91, -4, 58, -119, 25, -96, 26, 100, 79, -11, 35, -96, 60, -81, 5, 36}, new byte[]{-103, 66, -39, 117, -63, 99, 75, 63}), jsonObject.toString());
        k kVar = new k();
        JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject(C0098a.a(new byte[]{-104, -45, 52, 98, 31, 27, -15}, new byte[]{-18, -68, 80, 43, 113, 125, -98, 26}));
        kVar.g(list.get(0));
        kVar.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{119, -118, 82, -117, 98, -65, 36, 20}, new byte[]{1, -27, 54, -44, 12, -34, 73, 113})));
        kVar.i(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-52, -41, -24, 64, -20, 71, -122}, new byte[]{-70, -72, -116, 31, -100, 46, -27, -28})));
        kVar.e(C0098a.a(new byte[]{-31, -45, 98, -5, -48, -120, -88, 112, -73, -127, 82, -93, -74, -96, -27, 24, -101, -58, 55, -105, -61, -38, -58, 104, -32, -32, 121, 34, -69, -100, -9, 31, -115, -35, 54, -125, -21, -41, -1, 91, -18, -59, 87, -15, -15, -94, -91, 67, -71, -121, 64, -110, 109, 13, 126, 29, -88, -30, 53, -93, -40, 9}, new byte[]{6, 98, -47, 24, 83, 51, 64, -6}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-86, -65, -11, 26, -88, 124, 127, -79, -65, -65, -1, 49, -72, 97, 110}, new byte[]{-36, -48, -111, 69, -35, 15, 26, -18})));
        kVar.c(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-40, 96, 63, -54, -41, 13, 5, -36, -36}, new byte[]{-82, 15, 91, -107, -74, 110, 113, -77})));
        kVar.f(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-102, -102, -31, -113, 115, 32, 71, 110, -113, -127, -22, -94}, new byte[]{-20, -11, -123, -48, 23, 73, 53, 11})));
        kVar.d(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{23, 54, 115, 38, -69, 8, -83, 106}, new byte[]{97, 89, 23, 121, -38, 122, -56, 11})));
        kVar.n(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-12, 52, -41, -118, -15, 26, 12, -38}, new byte[]{-126, 91, -77, -43, -120, 127, 109, -88})));
        JsonObject jsonObject2 = new JsonObject();
        int i = 1;
        jsonObject2.addProperty(C0098a.a(new byte[]{53, 80, 8, 67, 108, 12, -78, -70, 54, 65, 37, 70, 87}, new byte[]{67, 37, 122, 47, 51, 111, -34, -43}), C0098a.a(new byte[]{67}, new byte[]{113, 124, -74, -65, -119, -76, -61, 122}));
        jsonObject2.addProperty(C0098a.a(new byte[]{-40, -122, -21, 4, -63, -90, -89, -14}, new byte[]{-82, -23, -113, 91, -91, -7, -50, -106}), list.get(0));
        String strA2 = a(C0098a.a(new byte[]{-20, 15, -46, 26, 98, 82, 40, 33, -84, 59, -48, 9, 40, 47, 27, 39, -79, 34, -115, 25, 37, 111, 58}, new byte[]{-61, 78, -94, 106, 77, 0, 77, 82}), jsonObject2.toString());
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject(strA2);
        int i2 = 4;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0098a.a(new byte[]{122, 61, -60, 17}, new byte[]{22, 84, -73, 101, 32, -12, 107, -92}));
        int i3 = 0;
        while (i3 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
            byte[] bArr = new byte[i2];
            // fill-array-data instruction
            bArr[0] = -112;
            bArr[1] = -22;
            bArr[2] = 51;
            bArr[3] = 87;
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0098a.a(bArr, new byte[]{-32, -122, 82, 46, 110, 121, 10, -65}));
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                byte[] bArr2 = new byte[i];
                bArr2[c2] = b2;
                if (!C0098a.a(bArr2, new byte[]{55, 31, -34, 85, -92, -72, 88, 96}).equals(jSONObjectOptJSONObject3.optJSONObject(next).optString(C0098a.a(new byte[]{71, 6, -45, 77, -116, -24, -79, -98, 81}, new byte[]{52, 110, -68, 58, -45, -100, -56, -18})))) {
                    List arrayList3 = map.containsKey(next) ? (List) map.get(next) : new ArrayList();
                    arrayList3.add(jSONObjectOptJSONObject2.optString(C0098a.a(new byte[]{-87, -27, 86, 68, -19}, new byte[]{-35, -116, 34, 40, -120, -83, 84, 117})) + C0098a.a(new byte[]{36}, new byte[]{0, -26, -69, 93, 80, 74, 104, -30}) + jSONObjectOptJSONObject3.optJSONObject(next).optString(C0098a.a(new byte[]{78, 3, -26, 117, 117}, new byte[]{62, 98, -108, 20, 24, -121, 6, 53})));
                    map.put(next, arrayList3);
                }
                b2 = 5;
                c2 = 0;
                i = 1;
            }
            i3++;
            i2 = 4;
            b2 = 5;
            c2 = 0;
            i = 1;
        }
        for (String str : map.keySet()) {
            arrayList2.add(str);
            arrayList.add(TextUtils.join(C0098a.a(new byte[]{56}, new byte[]{27, -86, -87, -127, -115, -76, -107, 35}), (Iterable) map.get(str)));
        }
        kVar.j(TextUtils.join(C0098a.a(new byte[]{88, -100, -70}, new byte[]{124, -72, -98, 116, 62, 45, 34, -8}), arrayList2));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{-94, -46, 105}, new byte[]{-122, -10, 77, 109, -125, 127, -39, 98}), arrayList));
        return h.p(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0644 A[Catch: Exception -> 0x0771, TryCatch #0 {Exception -> 0x0771, blocks: (B:3:0x0013, B:4:0x01e1, B:6:0x01e7, B:9:0x0272, B:10:0x03c1, B:12:0x03c7, B:14:0x0415, B:25:0x0636, B:28:0x0644, B:29:0x064e, B:31:0x0654, B:32:0x071f, B:34:0x073a, B:16:0x046b, B:18:0x04b6, B:19:0x0500, B:21:0x054a, B:22:0x0598, B:24:0x05e7, B:36:0x074c), top: B:41:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x063c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r40) {
        /*
            Method dump skipped, instruction units count: 1910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Gz360.homeContent(boolean):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public void init(Context context, String str) {
        super.init(context, str);
        ?? r7 = c;
        r7.put(C0098a.a(new byte[]{-42}, new byte[]{-25, -99, -112, -79, -28, 55, -67, 77}), C0098a.a(new byte[]{63}, new byte[]{10, 26, -76, -54, -101, -10, 9, -117}));
        r7.put(C0098a.a(new byte[]{-71}, new byte[]{-117, -6, 30, -23, -105, -26, -107, 44}), C0098a.a(new byte[]{-11, -63}, new byte[]{-60, -13, -96, -84, 16, 74, -29, -106}));
        r7.put(C0098a.a(new byte[]{-67}, new byte[]{-114, 12, -64, -96, -121, 105, -45, -116}), C0098a.a(new byte[]{-19, -51}, new byte[]{-34, -3, -116, 65, -77, -69, 52, 10}));
        r7.put(C0098a.a(new byte[]{-119}, new byte[]{-67, 76, -31, 25, -2, -87, -97, -106}), C0098a.a(new byte[]{15, 85}, new byte[]{61, 103, -69, -127, -102, -48, -125, -103}));
        r7.put(C0098a.a(new byte[]{37, 67}, new byte[]{19, 119, 24, 65, 116, 96, 64, 33}), "");
        d = Init.getKeywordsMap();
    }

    public String playerContent(String str, String str2, List<String> list) {
        JsonObject jsonObject = new JsonObject();
        for (String str3 : str2.split(C0098a.a(new byte[]{-44}, new byte[]{-14, 0, 101, -119, -43, 115, 110, 62}))) {
            int iIndexOf = str3.indexOf(C0098a.a(new byte[]{117}, new byte[]{72, -90, -118, -78, -79, -89, 59, 106}));
            jsonObject.addProperty(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
        }
        String strOptString = new JSONObject(a(C0098a.a(new byte[]{-91, -59, -96, 56, 26, -6, 21, 41, -27, -15, -94, 43, 80, -121, 38, 47, -8, -24, -108, 45, 65, -55, 25, 54, -91, -9, -72, 39, 66, -25, 30, 63}, new byte[]{-118, -124, -48, 72, 53, -88, 112, 90}), jsonObject.toString())).optString(C0098a.a(new byte[]{19, -102, -108}, new byte[]{102, -24, -8, 77, -53, -15, 24, 19}));
        if (!C0207D.o(strOptString)) {
            return h.n(C0098a.a(new byte[]{-100, 106, -46, -85, -17, 16, -31, 23, -60, 30, -15, -24, -109, 9, -85, 98, -28, 104, -102, -23, -54, 70, -68, 33}, new byte[]{122, -8, 127, 77, 123, -82, 8, -124}));
        }
        h hVar = new h();
        hVar.m(0);
        hVar.y(strOptString);
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{121, -104, 75, -32, -22, -112, 68, -125}, new byte[]{18, -3, 50, -105, -123, -30, 32, -16}), str);
        jsonObject.addProperty(C0098a.a(new byte[]{-38, 9, 99, 77, 100, 3, -14, -95, -39}, new byte[]{-75, 123, 7, 40, 22, 92, -124, -64}), C0098a.a(new byte[]{14}, new byte[]{63, -40, 37, -22, -60, -127, 5, -118}));
        String strA = a(C0098a.a(new byte[]{9, -121, 22, -54, 118, -23, -23, 70, 67, -66, 73, -36, 48, -50, -29, 111, 73, -76, 3, -20, 54, -60}, new byte[]{38, -58, 102, -70, 89, -96, -121, 34}), jsonObject.toString());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray(C0098a.a(new byte[]{-63, -47, -34, -39}, new byte[]{-83, -72, -83, -83, -93, 59, -8, 120}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-97, -23, 22, -27, 119, -78}, new byte[]{-23, -122, 114, -70, 30, -42, 37, -86}));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-32, -101, 104, 83, -58, 6, 9, 91}, new byte[]{-106, -12, 12, 12, -88, 103, 100, 62}));
            String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-84, 80, -11, 117, 127, 24, 98}, new byte[]{-38, 63, -111, 42, 15, 113, 1, -106}));
            String strOptString4 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{79, 121, 75, -92, 44, 98, 15, 123, 92}, new byte[]{57, 22, 47, -5, 95, 1, 125, 20}));
            if (d.isEmpty() || !d.containsKey(strOptString2)) {
                j.a(strOptString, strOptString2, strOptString3, strOptString4, arrayList);
            }
        }
        return h.q(arrayList);
    }
}
