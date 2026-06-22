package com.github.catvod.spider.merge.bY;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class U {
    private static final String i = com.github.catvod.spider.merge.XI.f.a(new byte[]{-100, -124, 38, 65, 86, -7, 14, -9, -28, -59, 108, 8, 18, -62, 6, -74, -75, -124, 43, 91, 26, -37, 59, -8, -32, -37, 114, 24, 1, -75, 56, -79, -65, -35, 104, 19, 26, -19, 89, -20, -8, -53, 29, 88, 74, -7, 10, -113, -76, -119, 23, 65, 78, -70, 90, -21, -26, -59, 111, 30, 26, -67, 36, -112, -123, -90, 16, 4, 26, -7, 6, -77, -76, -53, 27, 77, 89, -2, 0, -15, -15, -98, 63, 5, 89, -7, 0, -83, -75, -58, 56, 90, 83, -29, 10, -9, -32, -59, 100, 6, 15, -75, 44, -80, -93, -124, 49, 77, 21, -92, 95, -24, -1, -37, 114, 28, 2, -84, 89, -10, -32, -35, 108, 8, 127, -7, 10, -69, -91, -103, 51, 70, 21, -92, 87, -10, -30, -59, 105, 6, 11, -93, 66, -70, -25, -39, 63, 78, 3, -10, 90, -24, -75, -53, 15, 73, 92, -12, 29, -79, -2, -34, 111, 31, 20, -90, 89, -8, -110, -125, 61, 70, 84, -16, 3, -9, -92, -120, 44, 73, 84, -54, 0, -84, -71, -114, 46, 119, 89, -3}, new byte[]{-47, -21, 92, 40, 58, -107, 111, -40});
    private static Map<String, com.github.catvod.spider.merge.lJ.e> j;
    private String a;
    private JSONObject b;
    private ScheduledExecutorService c;
    private String d;
    private com.github.catvod.spider.merge.lJ.e e;
    private AlertDialog f;
    private final Map<String, String> g;
    String h;

    U() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.g = map;
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-62, -79}, new byte[]{-10, -38, -38, -1, 89, -27, -109, -49}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, 85}, new byte[]{-117, 30, 107, 9, 57, -72, 46, -65}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{125, -42}, new byte[]{79, -67, 46, -28, 39, -115, 42, -15}), com.github.catvod.spider.merge.XI.f.a(new byte[]{22, -89}, new byte[]{36, -20, 107, -55, -109, 34, 44, 125}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-127, -94, 125, 118, -23}, new byte[]{-14, -41, 13, 19, -101, -56, -40, 76}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -78, -67, -70, 110, -124}, new byte[]{50, 4, 56, 92, -42, 1, 83, -29}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-111, -110, -102, -111}, new byte[]{-7, -5, -3, -7, -26, -82, -113, 116}), com.github.catvod.spider.merge.XI.f.a(new byte[]{103, -94, 113, 8, -57, 15}, new byte[]{-114, 9, -23, -18, 127, -118, 42, 1}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-71, 67, -105}, new byte[]{-43, 44, -32, -11, 43, -57, 100, -18}), com.github.catvod.spider.merge.XI.f.a(new byte[]{14, 114, -84, -14, 49, 56}, new byte[]{-24, -57, 45, 21, -92, -67, 97, 104}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-68, 60, 60, 95, 37, -72}, new byte[]{-46, 83, 78, 50, 68, -44, -93, 79}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-9, 2, -45, -94, -18, 58}, new byte[]{19, -70, 83, 74, 102, -106, 114, 94}));
        j = new HashMap();
        E();
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73, -19, 34, -120, -119, -78, 81, 57, -117, -6}, new byte[]{-30, -114, 123, -3, -25, -110, 24, 87}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            this.h = System.currentTimeMillis() + "";
            String str = com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, -63, -87, -20, 11, 66, 1, 29, -73, -59, -76, -78, 23, 8, 75, 92, -8, -64, -66, -78, 27, 22, 1, 81, -73, -58, -14, -3, 18, 25, 86, 29, -79, -48, -87, -56, 23, 19, 75, 92, -112, -38, -81, -51, 10, 27, 65, 86, -77, -7, -78, -5, 17, 22, 17, 109, -119, -47, -87, -95, 78, 76, 31, 0, -29, -127, -5, -61, 39, 12, 19}, new byte[]{-42, -75, -35, -100, 120, 120, 46, 50}) + this.h;
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{31, 37, 27, 2, -57, -40}, new byte[]{94, 70, 120, 103, -73, -84, -81, 113}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-39, 88, 87, -79, 124, 107, -102, 75, -47, 71, 73, -14, 127, 123, -108, 81, -108, 8, 83, -72, 109, 124, -44, 79, -44, 73, 78, -77, 57, 40, -47, 16, -110}, new byte[]{-72, 40, 39, -35, 21, 8, -5, 63}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-31, 115, 17, 126, 39, -47, 104, -59, -10, 101, 15, 111}, new byte[]{-94, 28, 127, 10, 66, -65, 28, -24}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-95, -46, 74, 37, 33, -73, 118, 76, -87, -51, 84, 102, 48, -7, 96, 79, -73, -113, 92, 38, 58, -71, 58, 77, -78, -50, 95, 39, 43, -69, 115, 93, -92}, new byte[]{-64, -94, 58, 73, 72, -44, 23, 56}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{11, 4, 10, 77, -52, -126, 66, -13, 48, 3}, new byte[]{94, 119, 111, 63, -31, -61, 37, -106}), i);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{27, -116, -22, 7, -71, 31, -87}, new byte[]{73, -23, -116, 98, -53, 122, -37, 92}), com.github.catvod.spider.merge.XI.f.a(new byte[]{92, 10, 84, -113, -50, 83, -8, 46, 86, 12, 79, -100, -34, 6, -69, 104, 26, 11, 67, -47, -34, 7, -8}, new byte[]{52, 126, 32, -1, -67, 105, -41, 1}));
            HashMap map2 = new HashMap();
            map2.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{100, -41, 86, -91, 78, -101, -100, 117, 99}, new byte[]{7, -69, 63, -64, 32, -17, -61, 28}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-28, -13, 81}, new byte[]{-41, -53, 96, -22, 96, -35, 111, 103}));
            map2.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-107}, new byte[]{-29, -2, -78, -13, 104, 81, -103, 102}), com.github.catvod.spider.merge.XI.f.a(new byte[]{19, -121, 70}, new byte[]{34, -87, 116, 38, -114, 42, 59, 70}));
            map2.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{108, 9, -19, 127, 110, 48, 59, -31, 119, 8}, new byte[]{30, 108, -100, 10, 11, 67, 79, -66}), this.h);
            String strOptString = new JSONObject(com.github.catvod.spider.merge.nU.c.h(str, map2, map).a()).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-3, 58, -77, 29}, new byte[]{-103, 91, -57, 124, -14, -126, -26, 52})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{12, 48, 65, 48, 38, 66, 55}, new byte[]{97, 85, 44, 82, 67, 48, 68, -4})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-117, -102, -111, 108, -84}, new byte[]{-1, -11, -6, 9, -62, -2, 4, -82}));
            String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{41, -111, 100, 101, 16, -10, 82, -23, 50, -112, 62, 96, 0, -30, 30, -88, 110, -44, 79, 123, 83, -106, 62, -80, 126, -112, 115, 74, 19, -83, 15, -89, 44, -70, 99, 97, 17, -15, 25, -75, 37, -117, 118, 103, 19, -86, 31, -81, 55, -128, 99, 102, 0, -68, 26, -81, 44, -116, 114, 97, 1, -95, 19, -81, 43, -121, 124, 116, 22, -68, 8, -78, 46, -126, 96, 124, 13, -72, 19, -79, 42, -111, 96, 103, 0, -92, 16, -78, 103, -111, 127, 126, 6, -94, 64}, new byte[]{65, -27, 16, 21, 99, -52, 125, -58}) + strOptString + com.github.catvod.spider.merge.XI.f.a(new byte[]{69, 31, 100, -113, 49, 124, 41, 54, 10, 24, 53, -43, 108, 35, 123, 28, 0, 35, 106, -113, 46, 77, 46, 29, 17, 65, 91, -61, 103, 83, 62, 28, 16, 8, 103, -117, 113, 37, 30, 42, 70, 79, 73, -110, 61, 102, 49, 12, 1, 29, 122, -71, 50, 123, 37}, new byte[]{99, 124, 8, -26, 84, 18, 93, 105});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-64, -113, -81}, new byte[]{-75, -3, -61, -57, 122, -64, 93, -113}), str2);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-88, -33, -65, 89, 80}, new byte[]{-36, -80, -44, 60, 62, 22, -40, 37}), strOptString);
            Init.run(new J(this, jSONObject, 1));
        } catch (Exception e) {
            y.b(new byte[]{-16, 57, 2, -114, 64, -34, -25, 8, -14, 124, 19, -27, 50}, new byte[]{-105, 92, 118, -33, 18, -99, -120, 108}, new StringBuilder(), e);
        }
    }

    private String E() {
        return com.github.catvod.spider.merge.nU.c.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{56, -46, 41, 123, -128, -94, -76, 5, 32, -59, 112, 106, -125, -15, -75, 95, 51, -120, 62, 101, -36, -87, -76, 73, 60, -55, 40, 111, -105, -22, -14, 92, 53, -119, 59, 98, -97, -3}, new byte[]{80, -90, 93, 11, -13, -104, -101, 42}), y()).a();
    }

    private void G(String str, String str2, String str3) {
        String strA;
        JSONObject jSONObject;
        String strA2;
        String strOptString;
        try {
            strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{33, -4, -35, -118, -14, -88, 5, -5, 57, -31, -121, -97, -80, -13, 89, -7, 59, -19, -52, -108, -26, -28, 69, -9, 102, -3, -54, -98, -70, -18, 92, -1, 102, -4, -58, -111, -83, -23}, new byte[]{73, -120, -87, -6, -56, -121, 42, -102});
            jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, 16, -11, 123, -16, 120}, new byte[]{-72, 117, -124, 36, -103, 28, 28, 71}), str);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{89, 98, -87, -33, 4, -102, -18}, new byte[]{56, 18, -39, -128, 114, -1, -100, -57}), com.github.catvod.spider.merge.XI.f.a(new byte[]{114, -120, -49, 86, -52}, new byte[]{67, -90, -7, 120, -12, 113, 33, 2}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{121, -40, 9, 30, 14, 3, 5, 117, 121}, new byte[]{29, -67, 127, 119, 109, 102, 90, 28}), str2);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{79, 113, -66, 36, -55, 12, -89, -114, 89, 117, -90, 41}, new byte[]{43, 20, -56, 77, -86, 105, -8, -20}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-84, -100, -41, -59}, new byte[]{-38, -11, -95, -86, -88, 28, -96, -51}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{118, 68, 9, 123, 107, -47, 117, -74}, new byte[]{6, 40, 104, 15, 13, -66, 7, -37}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-3, -4}, new byte[]{-119, -118, -69, 6, -108, -94, 95, 39}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, 42, -111, 61, -61, -34, -95, -75, 64, 34, -126}, new byte[]{33, 79, -25, 84, -96, -69, -2, -37}), com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 96, -128, -40, -7, -127}, new byte[]{63, 82, -78, -21, -63, -64, -33, 103}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{85, -124, -53, 37, 110, -33, -119, -52, 94, -123, -40, 32}, new byte[]{49, -31, -67, 76, 13, -70, -42, -95}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, 107, -78, -43, -123, 99}, new byte[]{-103, 89, -128, -26, -67, 34, -112, 114}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-46, -119, -12, -38, 116, -31, 50, -128, -58, -107, -2, -45}, new byte[]{-80, -4, -99, -74, 16, -66, 86, -27}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-78, -81, 88, 110, -33, 114}, new byte[]{-28, -99, 106, 93, -25, 51, -56, -48}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-90, -96, -1, 6, 46, -122, 47, 114, -85, -79, -29, 9, 62}, new byte[]{-60, -43, -106, 106, 74, -39, 95, 0}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-71, 3, 25, -87, -23, 59}, new byte[]{-17, 49, 43, -102, -47, 122, -45, -77}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{26, -3, 100, -63, -98, 9, -50, -61, 14, -19}, new byte[]{126, -104, 18, -88, -3, 108, -111, -92}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-5, -69, 9, -122, 43, 52, -32, -67, -18, -110, 82, -61, 115, 111, -16}, new byte[]{-70, -33, 123, -29, 69, 91, -64, -107}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-52, 12, -63, 57, 110, 22, -113, -19, -14, 29, -48, 51, 108}, new byte[]{-83, 111, -75, 80, 24, 127, -5, -108}), com.github.catvod.spider.merge.XI.f.a(new byte[]{33, 32}, new byte[]{90, 93, 54, 127, 17, 49, -79, -50}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-87, -113, 114, -64, 112, -117, -128}, new byte[]{-54, -25, 19, -82, 30, -18, -20, 78}), com.github.catvod.spider.merge.XI.f.a(new byte[]{66, -102, 11, 57, 115, 125, -108, 125, 84, -112, 30, 35, 107, 126, -112}, new byte[]{23, -39, 95, 111, 60, 59, -46, 52}));
        } catch (Exception e) {
            e = e;
        }
        try {
            if (TextUtils.isEmpty(str3)) {
                strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{18, -46, -121, -122, -27, -91, 75, 119, 20, -40, -118, -111, -18}, new byte[]{96, -73, -31, -12, -128, -42, 35, 40});
                strOptString = this.b.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, 53, -52, -31, 68, -95, -1, -97, -38, 63, -63, -10, 79}, new byte[]{-82, 80, -86, -109, 33, -46, -105, -64}));
            } else {
                strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-25, -5, 90, -85}, new byte[]{-124, -108, 62, -50, 44, 34, 14, 59});
                strOptString = str3;
            }
            jSONObject.put(strA2, strOptString);
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{29, -10, -47, 58, -57, 49, -106, 42, 38, -15}, new byte[]{72, -123, -76, 72, -22, 112, -15, 79}), com.github.catvod.spider.merge.XI.f.a(new byte[]{43, 35, -94, -74, 1, 78, -48, -16, 83, 98, -24, -1, 69, 110, -40, -79, 19, 52, -29, -1, 56, 25, -111, -98, 8, 40, -86, -80, 4, 70, -111, -18, 84, 119, -8, -91, 5, 15, -46, -79, 93, 108, -114, -19, 95, 17, -119, -98, 70, 14, -83, -74, 1, 70, -98, -119, 82, 125, -17, -106, 63, 11, -111, -98, 22, 60, -76, -70, 58, 71, -45, -108, 15, 56, -9, -22, 94, 17, -97, -18, 70, 100, -109, -105, 57, 111, -3, -13, 70, 32, -79, -76, 8, 2, -10, -70, 5, 39, -73, -10, 77, 111, -34, -67, 15, 32, -67, -1, 62, 67, -41, -66, 20, 37, -9, -22, 94, 17, -97, -18}, new byte[]{102, 76, -40, -33, 109, 34, -79, -33}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, 15, 58, -3, -92, -68, -2, 37, -124, 25, 36, -20}, new byte[]{-48, 96, 84, -119, -63, -46, -118, 8}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-29, 126, 126, -22, 113, -62, -4, -47, -21, 97, 96, -87, 114, -46, -14, -53, -71, 46, 109, -18, 121, -45, -18, -64, -10, 51, 123, -14, 126, -116, -91}, new byte[]{-126, 14, 14, -122, 24, -95, -99, -91}));
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.nU.c.g(strA, jSONObject.toString(), map).a());
            if (jSONObject2.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{13, -68, -128, -45}, new byte[]{110, -45, -28, -74, 12, -23, -16, 110})) == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{50, -41, 4, 41}, new byte[]{86, -74, 112, 72, 54, 5, 11, 36}));
                jSONObjectOptJSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-84, -39, -110, 33, -69, 86, 65, -60, -78, -56}, new byte[]{-33, -83, -13, 83, -49, 9, 53, -83}), System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, -40, -28, -36, 57, 67, 95, -12, -6}, new byte[]{-98, -67, -110, -75, 90, 38, 0, -99}), str2);
                com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -15, 77, 12, 47}, new byte[]{23, -124, 46, 120, 89, -2, -62, -39}), jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e2) {
            e = e2;
            y.b(new byte[]{55, 120, -44, -33, -122, -34, 110, -95, 35, 117, -12, -30, -120, -35, 114, -122, 41, 73, -10, -83, -122, -126}, new byte[]{80, 29, -96, -115, -29, -72, 28, -60}, new StringBuilder(), e);
        }
    }

    private JSONObject H(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{16, 117, 78, 31}, new byte[]{115, 26, 42, 122, -90, -63, 10, 126})) == 32003) {
                com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{37, 83, -116, -86, 58, 56, -27, -40, 121, 30, -77, -64, 90, 4, -78, -111, 123, 120, -45, -37, 23, 86, -82, -6, -20, -41, -36, -32, 8, 85, -119, -3, 37, 125, -100, -86, 55, 19, -23, -17, 100}, new byte[]{-64, -9, 52, 79, -65, -77, 0, 118}));
                return null;
            }
            j = new HashMap();
            if (TextUtils.isEmpty(N(str))) {
                return null;
            }
            O(str);
            String strF = "";
            Iterator it = this.e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.github.catvod.spider.merge.lJ.a aVar = (com.github.catvod.spider.merge.lJ.a) it.next();
                String strB = aVar.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = aVar.f();
                    break;
                }
            }
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-41, 90, -11, 87, 81, -112}, new byte[]{-92, 46, -102, 60, 52, -2, 20, 65}), this.e.b().a());
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{48, -98, -109, 35, 110, 94, -52, -4, 56, -88, -101, 21, 105, 69}, new byte[]{86, -9, -9, 124, 26, 49, -89, -103}), Collections.singletonList(strF));
            return new JSONObject(L(com.github.catvod.spider.merge.XI.f.a(new byte[]{27, -7, 98, -1, 70, 95, 2, 50, 3, -18, 59, -18, 69, 12, 3, 104, 16, -93, 117, -31, 26, 84, 2, 126, 31, -30, 99, -21, 81, 23, 68, 107, 22, -94, 101, -25, 84, 23, 72, 50, 0, -27, 119, -3, 80, 21, 76, 122, 22, -94, 101, -18, 67, 0, 18, 109, 1, -80, 99, -20, 69, 23, 66, 59, 21, -1, 43, -1, 86, 67, 88, 126, 44, -3, 119, -3, 84, 8, 114, 110, 7, -1, 43, -87, 106, 58, 89, 32}, new byte[]{115, -115, 22, -113, 53, 101, 45, 29}) + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean I() {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-28, -12, 101, 35, 42, 0, -80, -120, -4, -29, 60, 50, 41, 83, -79, -46, -17, -82, 114, 61, 118, 11, -80, -60, -32, -17, 100, 55, 61, 72, -10, -47, -23, -81, 124, 54, 52, 88, -6, -43, -77, -16, 99, 110, 12, 121, -35, -43, -29, -9, 98, 54, 43, 28, -7, -43, -79, -16, 114, 117, 63, 95, -21, -60, -28, -33, 98, 38, 59, 73, -4, -43, -27, -30, 116, 110, 45, 72, -22, -62, -86, -33, 114, 59, 100, 82, -16, -54, -23}, new byte[]{-116, -128, 17, 83, 89, 58, -97, -89}), y()));
            try {
                if (!com.github.catvod.spider.merge.XI.f.a(new byte[]{5, 5, 110}, new byte[]{55, 53, 94, -23, -121, -50, -117, 53}).equals(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, 68, -106, -44, 27, -127}, new byte[]{-102, 48, -9, -96, 110, -14, 14, -47})))) {
                    throw new Exception();
                }
                jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-22, -110, -123, -121}, new byte[]{-114, -13, -15, -26, -7, -43, -59, 101})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, 109, 109, -118, 115, -84, 64, -102, -48, 120, 101}, new byte[]{-87, 8, 0, -24, 22, -34, 31, -18}));
                if (TextUtils.isEmpty(com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{88, -49, -6}, new byte[]{118, -70, -103, -121, -91, 65, -23, 72})))) {
                    com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{11, -57, -27}, new byte[]{37, -78, -122, 25, 76, -52, 81, 72}), this.a);
                }
                return true;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    private void J(String str, com.github.catvod.spider.merge.lJ.a aVar, List<com.github.catvod.spider.merge.lJ.a> list) {
        if (this.e.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.c(new byte[]{57, 61, -60, -6, 84, -34, 32, 59, 33, 42, -99, -21, 87, -115, 33, 97, 50, 103, -45, -28, 8, -43, 32, 119, 61, 38, -59, -18, 67, -106, 102, 98, 52, 102, -61, -30, 70, -106, 106, 59, 34, 33, -47, -8, 66, -108, 110, 115, 52, 102, -44, -17, 83, -123, 102, 120, 110, 57, -62, -73, 114, -89, 77, 102, 62, 62, -61, -17, 85, -62, 105, 102, 108, 57, -45, -84, 87, -109, 107, 75, 56, 45, -115}, new byte[]{81, 73, -80, -118, 39, -28, 15, 20}, sb, str);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-105, 114, 98, 34, -14, 40, 79, 26}, new byte[]{-79, 1, 22, 77, -103, 77, 33, 39}));
            sb.append(URLEncoder.encode(this.e.b().a()));
            v.c(new byte[]{119, -14, 101, -80, 61, -90, -12, -42, 53, -65}, new byte[]{81, -126, 1, -39, 79, -7, -110, -65}, sb, strB);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{96, 26, -90, 78, 75, 38, 122, -92, 96, 35, -71, 93, 79, 38, 122}, new byte[]{70, 124, -55, 60, 40, 67, 71, -108}));
            sb.append(i2);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{51, -38, -14, -46, 36, -88, 27}, new byte[]{21, -123, -127, -69, 94, -51, 38, 127}));
            sb.append(100);
            String strU = u(C0925t.a(new byte[]{-89, -75, 96, -41, -68, 1, 7, 31, -29, -117, 104, -36, -83, 16, 82, 112, -89, -75, 96, -41, -68, 1, 7, 31, -14, -126, 103, -64, -83, 95, 95, 102, -34, -116, 99, -58, -85, 10, 48, 52, -18, -98, 103, -34, -11, 83, 73, 31, -14, -123, 116, -58, -11, 4, 6, 44, -28, -75, 114, -53, -72, 7, 85, 33, -14, -119, 42, -44, -95, 14, 10, 31, -17, -117, 107, -41, -14, 3, 28, 35}, new byte[]{-127, -22, 6, -78, -56, 98, 111, 64}, sb));
            for (com.github.catvod.spider.merge.lJ.a aVar2 : ((com.github.catvod.spider.merge.lJ.c) C0924s.a(strU, com.github.catvod.spider.merge.lJ.c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && com.github.catvod.spider.merge.pT.C.k().contains(aVar2.d()))) {
                    if (!this.e.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strU).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-50, -18, 41, -46, -103, 10, 62, -24}, new byte[]{-93, -117, 93, -77, -3, 107, 74, -119}));
                int i3 = jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, 89, -121, 110, 99, 64}, new byte[]{-107, 45, -24, 26, 2, 44, -91, 22}));
                int i4 = jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-114, -75, -14, -32, -36, 78}, new byte[]{-47, -42, -99, -107, -78, 58, -52, -18}));
                if (i3 <= 100 || i2 * 100 == i3 || i4 != 100) {
                    break;
                } else {
                    i2++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J(str, (com.github.catvod.spider.merge.lJ.a) it.next(), list);
        }
    }

    private String L(String str, Map<String, Object> map) {
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(str, new JSONObject(map).toString(), y());
        List<String> list = eVarG.c().get(com.github.catvod.spider.merge.XI.f.a(new byte[]{96, -48, 16, -127, 37, 113, -32, -28, 122, -48}, new byte[]{19, -75, 100, -84, 70, 30, -113, -113}));
        this.d = this.a;
        if (!(list == null) && list.size() > 0) {
            String str2 = this.d;
            String str3 = "";
            try {
                String str4 = list.get(0).split(com.github.catvod.spider.merge.XI.f.a(new byte[]{92}, new byte[]{103, -84, -94, -44, -4, 44, 76, -54}))[0];
                String str5 = str4.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{119}, new byte[]{74, 30, -96, 118, 60, -85, 20, -68}))[0];
                String str6 = str4.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-36}, new byte[]{-31, 88, 33, 25, -6, -114, -12, 12}))[1];
                String string = "";
                for (String str7 : str2.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-19}, new byte[]{-42, -8, 29, 91, -118, 62, 122, -73}))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-111}, new byte[]{-86, -110, -46, 109, 43, 111, -117, 47}));
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.d = str3;
        }
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{125, 109, -51, 21, 116, -88, -77, -18, 100, 100, -99, 86, 23}, new byte[]{13, 1, -84, 108, 55, -57, -36, -123}) + this.d);
        return eVarG.a();
    }

    private void O(String str) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.lJ.a aVar = new com.github.catvod.spider.merge.lJ.a();
        aVar.j("");
        J(str, aVar, arrayList);
        this.e.d(arrayList);
    }

    private void P(String str) {
        this.a = str;
        com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, -74, -64}, new byte[]{-73, -61, -93, 119, 99, -68, -3, -126}), this.a);
        I();
        S();
    }

    private void S() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0912f(this, 3));
    }

    public static void a(U u) {
        u.S();
    }

    public static /* synthetic */ void b(U u, JSONObject jSONObject) {
        u.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-40, -74, 38, 73, 24, 45, 94, 100, -33}, new byte[]{-69, -38, 79, 44, 118, 89, 1, 13}));
        String strOptString2 = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, 54, -14, -53, 113}, new byte[]{-54, 89, -103, -82, 31, 72, -80, 50}));
        String strOptString3 = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-35, -57, -33, 80, -32, -52, 56, 109, -35}, new byte[]{-71, -94, -87, 57, -125, -87, 103, 4}));
        String strA = com.github.catvod.spider.merge.pT.C.a(strOptString3 + str);
        StringBuilder sb = new StringBuilder();
        v.c(new byte[]{70, 94, -102, 115, 84, 93, -87, -57, 65, 90, -117, 109, 10, 6, -10, -127, 3, 78, -100, 106, 81, 2, -88, -99, 77, 4, -115, 109, 8, 8, -25, -99, 90, 66, -63, 96, 72, 3, -29, -41, 92, 79, -97, 92, 78, 3, -69}, new byte[]{46, 42, -18, 3, 39, 103, -122, -24}, sb, strA);
        v.c(new byte[]{-47, 119, 49, 33, -30, 90, 4, 17, -125, 121, 57, 39, -23, 20, 81, 47, -121, 102, 13, 52, -30, 91, 74, 127, -39, 32, 124, 122, -95, 77, 18, 56, -98, 117, 55, 29, -18, 77, 74}, new byte[]{-9, 22, 82, 66, -121, 41, 119, 78}, sb, strOptString3);
        v.c(new byte[]{-97, 66, -119, -32, 22, 53, -47, 110, -37, 84, -115, -8, 27, 107, -62, 88, -49, 73, -54, -26, 19, 55, -64, 87, -42, 84, -127, -85, 11, 32, -110, 85, -36, 80, -123, -11, 26, 9, -38, 80, -44, 67, -47, -64, 77, 100, -121, 9, -8, 0, -120, -13, 9, 63, -41, 84, -26, 75, -125, -14, 26, 58, -119, 103, -117, 20, -33, -82, 62, 112, -42, 68, -48, 74, -120, -55, 27, 51, -62, 88, -38, 67, -47, -64, 77, 100, -121, 9, -8, 0, -114, -29, 22, 58, -48, 110, -55, 84, -125, -14, 10, 53, -64, 12, -17, 20, -34, -91, 71, 23, -110, 85, -36, 80, -123, -11, 26, 9, -45, 65, -52, 27, -83, -14, 13, 51, -38, 94, -100, 20, -36, -66, 43, 27, -99, 20, -117, 22, -38, -94, 79, 112, -43, 82, -51, 79, -102, -1, 11, 47, -21, 67, -36, 69, -104, -85, 90, 97, -10, 20, -114, 98, -54, -11, 23, 55, -38, 95, -36, 74, -47, -61, 60, 2, -30, 126, -1, 96, -91, -43, 54, 23, -8, 102, -4, 100, -54, -11, 19, 63, -47, 95, -51, 121, -123, -14, 66}, new byte[]{-71, 38, -20, -106, 127, 86, -76, 49}, sb, strOptString);
        String strA2 = C0926u.a(new byte[]{118, -17, -3, -88, 45, 92, -42, -16, 53, -24, -6, -82, 46, 82, -51, -17, 37, -7, -20, -66, 2, 77, -124, -11, 53, -14, -93}, new byte[]{80, -100, -98, -57, 93, 57, -21, -98}, sb, strOptString2);
        String strB = com.github.catvod.spider.merge.pT.C.b(String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{75, 25, 88, -24, 79, -126, 125, 42, 120, 52, 35, -83, 15, -119, 121, 121, 41, 47, 42, -94, 83, -98, 110, 41, 120, 56, 59, -66, 84, -33, 112, 111, 104, 108, 116, -1, 21, -43, 120, 104, 117, 63, 52, -73, 5, -44, 119, 52, 101, 104, 104}, new byte[]{12, 92, 12, -50, 96, -19, 28, 95}), str));
        HashMap map = new HashMap();
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-112, -36, -43, -48, -36, 85, 35, 47, -85, -37}, new byte[]{-59, -81, -80, -94, -15, 20, 68, 74}), com.github.catvod.spider.merge.XI.f.a(new byte[]{2, -75, -77, -58, -76, 71, -126, -112, 122, -12, -7, -113, -16, 103, -118, -47, 58, -94, -14, -113, -115, 16, -61, -2, 33, -66, -69, -64, -79, 79, -61, -114, 125, -31, -23, -43, -80, 6, -128, -47, 116, -6, -97, -99, -22, 24, -37, -2, 111, -104, -68, -58, -76, 79, -52, -23, 123, -21, -2, -26, -118, 2, -61, -2, 63, -86, -91, -54, -113, 78, -127, -12, 38, -82, -26, -102, -21, 24, -51, -114, 111, -14, -126, -25, -116, 102, -81, -109, 111, -74, -96, -60, -67, 11, -92, -38, 44, -79, -90, -122, -8, 102, -116, -35, 38, -74, -84, -113, -117, 74, -123, -34, 61, -77, -26, -102, -21, 24, -51, -114}, new byte[]{79, -38, -55, -81, -40, 43, -29, -65}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-108, 101, -4, -56, 40, -41, 89, 61}, new byte[]{-20, 72, -116, -87, 70, -6, 45, 80}), str);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{88, 2, 94, 47}, new byte[]{48, 109, 45, 91, 74, 97, -111, 50}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-32, -17, -62, -86, -19, 58, 17, 19, -94, -5, -43, -83, -74, 62, 79, 15, -20, -79, -60, -86}, new byte[]{-113, -97, -89, -60, -64, 91, 97, 122}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-19, -11, -108, -120, -59, -110, -117, 102, -2, -67, -118}, new byte[]{-107, -40, -28, -23, -85, -65, -1, 9}), strB);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-18, -77, 99, -66, 61, 108, -19, 90, -1, -5, 125, -85, 126, 40, -22}, new byte[]{-106, -98, 19, -33, 83, 65, -114, 54}), strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.nU.c.l(strA2, map));
            if (jSONObject2.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-127, -65, -105, -103, -44, -116}, new byte[]{-14, -53, -10, -19, -95, -1, -12, 73})) == 0) {
                u.G(strA, strOptString3, jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-46, -128, -104, -70}, new byte[]{-79, -17, -4, -33, 29, 104, -113, -94})));
                u.S();
            }
        } catch (Exception e) {
            y.b(new byte[]{-5, 103, -99, -66}, new byte[]{-98, 86, -89, -98, 37, 37, 78, -44}, new StringBuilder(), e);
        }
    }

    public static void d(U u, String str) {
        u.getClass();
        if (str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -5, -32, 18}, new byte[]{-78, -113, -108, 98, 68, 36, 13, -11}))) {
            str = com.github.catvod.spider.merge.nU.c.l(str, null);
        }
        u.P(str);
    }

    public static void e(final U u, EditText editText) {
        u.getClass();
        final String string = editText.getText().toString();
        u.s();
        final int i2 = 0;
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.bY.Q
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        U.d((U) u, (String) string);
                        break;
                    case 1:
                        com.github.catvod.spider.merge.pT.B.d((com.github.catvod.spider.merge.pT.B) u, (Map) string);
                        break;
                    default:
                        com.github.catvod.spider.merge.pT.B.k((com.github.catvod.spider.merge.pT.B) u, (EditText) string);
                        break;
                }
            }
        });
    }

    public static void f(U u) {
        u.s();
        Init.execute(new RunnableC0909c(u, 2));
    }

    public static void g(U u) {
        u.S();
    }

    public static void i(U u, JSONObject jSONObject) {
        u.getClass();
        String strOptString = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{54, -113, -54, 88, 39}, new byte[]{66, -32, -95, 61, 73, -54, -62, 89}));
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        u.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0915i(u, strOptString, 3), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(final U u, JSONObject jSONObject) {
        u.getClass();
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.XI.f.d(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{1, 116, -44}, new byte[]{116, 6, -72, -79, -13, 23, 97, 56})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.bY.M
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    U.g(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.bY.O
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    U.a(this.a);
                }
            }).show();
            u.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new S(u, jSONObject, 0));
            com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-55, 120, -61, -47, 75, -21, -39, 13, -119, -126, 55, 21, -73, 36, 78, -71, -57, 94, -33, -45, 121, -37, -38, 35, -83, 48, -49, -127, 17, -12, -65}, new byte[]{33, -41, 116, 53, -10, 84, 62, -103}));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void k(U u, String str) {
        u.getClass();
        HashMap map = new HashMap();
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{78, 53, 20, 22, 72, -64, -75, -75, 73}, new byte[]{45, 89, 125, 115, 38, -76, -22, -36}), com.github.catvod.spider.merge.XI.f.a(new byte[]{112, -40, 98}, new byte[]{67, -32, 83, -95, -121, -40, 100, 84}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20}, new byte[]{-102, -54, 9, -10, 39, 10, -33, 79}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 27, -128}, new byte[]{-123, 53, -78, -33, 92, -109, -69, 44}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-90, 66, -112, 3, 104, -93, 122, -101, -67, 67}, new byte[]{-44, 39, -31, 118, 13, -48, 14, -60}), u.h);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{76, 15, 104, 58, -81}, new byte[]{56, 96, 3, 95, -63, -6, 48, -6}), str);
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.h(com.github.catvod.spider.merge.XI.f.a(new byte[]{-24, -108, -14, 88, -126, 8, -81, 64, -31, -112, -17, 6, -98, 66, -27, 1, -82, -107, -27, 6, -110, 92, -81, 12, -31, -109, -87, 73, -101, 83, -8, 64, -25, -123, -14, 123, -108, 64, -10, 6, -29, -123, -46, 65, -110, 89, -27, 27, -62, -103, -41, 90, -110, 93, -28, 10, -44, -113, -19, 77, -97, 13, -33, 48, -28, -108, -69, 17, -58, 3, -78, 92, -90, -65, -14, 21}, new byte[]{-128, -32, -122, 40, -15, 50, -128, 111}) + u.h, map, u.y()).a());
            if (com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, 24}, new byte[]{-24, 115, 54, -54, -109, 2, 72, 63}).equals(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, 87, 12, -123, 26, 5, 117}, new byte[]{-99, 50, 127, -10, 123, 98, 16, 63})))) {
                String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-42, -102, 111, -87}, new byte[]{-78, -5, 27, -56, -83, 72, 75, 43})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{19, -124, 63, 70, -67, 74, -17}, new byte[]{126, -31, 82, 36, -40, 56, -100, -33})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{106, 62, 4, -1, -82, -16, 19, 12, 109, 50, 21, -30, -94, -25}, new byte[]{25, 91, 118, -119, -57, -109, 118, 83}));
                HashMap map2 = new HashMap();
                map2.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, -84, -70, 30, -111, 51}, new byte[]{-86, -49, -39, 123, -31, 71, 39, -38}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-67, -35, 60, -35, 55, 123, -103, -8, -75, -62, 34, -98, 52, 107, -105, -30, -16, -115, 56, -44, 38, 108, -41, -4, -80, -52, 37, -33, 114, 56, -46, -93, -10}, new byte[]{-36, -83, 76, -79, 94, 24, -8, -116}));
                map2.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, -55, -55, -4, 37, 30, -16}, new byte[]{-94, -84, -81, -103, 87, 123, -126, -63}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, -82, -37, -126, 97, 127, 53, -114, -117, -88, -58, -124, 119, 107, 111, -62, -63, -71, -63, -35}, new byte[]{-17, -38, -81, -14, 18, 69, 26, -95}));
                String str2 = "";
                Iterator it = com.github.catvod.spider.merge.nU.c.e(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, 117, -37, 106, -96, -57, 59, 96, 73, 115, -58, 108, -74, -45, 97, 44, 3, 98, -63, 53, -78, -98, 119, 32, 88, 111, -37, 53, -70, -109, 114, 32, 18, 114, -37, 39}, new byte[]{45, 1, -81, 26, -45, -3, 20, 79}) + strOptString, map2).headers(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, -96, 42, -30, 114, -95, -12, -112, -10, -96}, new byte[]{-97, -59, 94, -49, 17, -50, -101, -5})).iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(com.github.catvod.spider.merge.XI.f.a(new byte[]{34}, new byte[]{25, 37, 50, -85, 67, -29, -99, -128}))[0] + com.github.catvod.spider.merge.XI.f.a(new byte[]{119}, new byte[]{76, 7, 78, 82, 111, -108, -47, 32});
                }
                u.P(str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void l(U u, JSONObject jSONObject) {
        u.getClass();
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.XI.f.d(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{17, -53, 36}, new byte[]{100, -71, 72, -102, 31, 62, 90, 96})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new G(u, 1)).setOnDismissListener(new I(u, 1)).show();
            u.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new P(u, jSONObject, 1));
            com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-122, 86, 123, 55, -3, -108, 24, 83, -58, -84, -113, -13, 1, 91, -113, -25, -120, 112, 103, 53, -49, -92, 27, 125, -30, 30, 119, 103, -89, -117, 126}, new byte[]{110, -7, -52, -45, 64, 43, -1, -57}));
        } catch (Exception unused) {
        }
    }

    public static void m(U u, JSONObject jSONObject) {
        u.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        u.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0916j(u, jSONObject, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean n(List list) {
        Exception e;
        String strA;
        HashMap map;
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-13, 92, -75, -127, 125, 41, -47, 25, -21, 75, -20, -112, 126, 122, -48, 67, -8, 6, -94, -97, 33, 34, -47, 85, -9, 71, -76, -107, 106, 97, -105, 64, -2, 7, -89, -104, 98, 118, -47, 82, -2, 68, -92, -123, 107, 44, -114, 68, -90, 125, -126, -77, 124, 124, -119, 69, -2, 90, -25, -105, 124, 46, -114, 85}, new byte[]{-101, 40, -63, -15, 14, 19, -2, 54});
                map = new HashMap();
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{32, 0, 60, 91, 35, 19, 35, -38}, new byte[]{70, 105, 80, 62, 79, 122, 80, -82}), list);
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, 115, 96, 87, -75, -61, 28, -105, 58, 98, 103, 72}, new byte[]{92, 11, 3, 59, -64, -89, 121, -56}), new ArrayList());
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{86, -58, -94, -4, -58, -46, -123, 98, 78, -43, -77}, new byte[]{55, -91, -42, -107, -87, -68, -38, 22}), 2);
            } catch (Exception e2) {
                e = e2;
                y.b(new byte[]{58, -126, 27, -27, 96, 21, 67}, new byte[]{94, -25, 119, -128, 20, 112, 121, 12}, new StringBuilder(), e);
                return true;
            }
            try {
                String strL = L(strA, map);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-118, 109, -122, -98, -44, 111, 67, -97, -99, 125, -122, -113, -102}, new byte[]{-18, 8, -22, -5, -96, 10, 17, -6}) + strL);
                strOptString = new JSONObject(strL).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-11, 103, 116, 9}, new byte[]{-111, 6, 0, 104, -96, -39, -73, 47})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{72, 14, -88, -23, -76, -121, 120}, new byte[]{60, 111, -37, -126, -21, -18, 28, 99}));
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                y.b(new byte[]{58, -126, 27, -27, 96, 21, 67}, new byte[]{94, -25, 119, -128, 20, 112, 121, 12}, new StringBuilder(), e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            return n(list);
        }
        return true;
    }

    private String q(String str, String str2, String str3, Boolean bool) {
        try {
            List listC = this.e.c();
            String strF = "";
            if (listC == null || listC.size() == 0) {
                N(str);
                O(str);
                listC = this.e.c();
            }
            if (listC != null && listC.size() > 0) {
                Iterator it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.github.catvod.spider.merge.lJ.a aVar = (com.github.catvod.spider.merge.lJ.a) it.next();
                    if (C0926u.c(aVar.b(), str2)) {
                        strF = aVar.f();
                        break;
                    }
                }
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strV = v();
            char c = 3;
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{89, 81, -34, 104, 5, 36, 61, -13, 65, 70, -121, 121, 6, 119, 60, -87, 82, 11, -55, 118, 89, 47, 61, -65, 93, 74, -33, 124, 18, 108, 123, -86, 84, 10, -39, 112, 23, 108, 119, -13, 66, 77, -53, 106, 19, 110, 115, -69, 84, 10, -39, 121, 0, 123, 45, -84, 67, 24, -1, 91, 52, 108, 125, -85, 66, 64, -40, 62, 16, 108, 47, -84, 82, 3, -39, 97, 5, 35, 101, -75, 95, 22, -104, 62, 0, 123, 47, -19, 31, 16, -124, 42}, new byte[]{49, 37, -86, 24, 118, 30, 18, -36});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-119, 51, -92, -22, 71}, new byte[]{-6, 80, -63, -124, 34, -34, -114, 90}), com.github.catvod.spider.merge.XI.f.a(new byte[]{123, -73, -45, 9}, new byte[]{23, -34, -67, 98, 22, 119, -38, 77}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, 122, 76, -60, -24, -95, -90, 125}, new byte[]{-50, 30, 37, -74, -73, -57, -49, 25}), com.github.catvod.spider.merge.XI.f.a(new byte[]{124}, new byte[]{76, 51, 6, -110, -76, -62, 5, 96}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-53, 54, 0, 27, -108, 11}, new byte[]{-69, 65, 100, 68, -3, 111, 102, 6}), str);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, -40, 77, -7, -49, -2}, new byte[]{-97, -84, 34, -110, -86, -112, 64, -31}), this.e.b().a());
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, -73, -1, 119, 0, -118, -118, 108, 24, -79, -60}, new byte[]{126, -40, -96, 7, 100, -29, -8, 51}), strV);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{31, -12, 49, -117, -89, -34, -28, 60}, new byte[]{121, -99, 85, -44, -53, -73, -105, 72}), Collections.singletonList(str2));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -106, -30, -41, 8, -112, 48, 97, 49, -96, -22, -31, 15, -117}, new byte[]{95, -1, -122, -120, 124, -1, 91, 4}), Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(L(strA, map));
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-14, -106, -12, 78}, new byte[]{-111, -7, -112, 43, 64, -103, -116, 55})) == 41017) {
                return str2;
            }
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{81, -13, -44, -103, -126, 38}, new byte[]{34, -121, -75, -19, -9, 85, -1, -128})) != 200 || jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-44, 58, 41, -96}, new byte[]{-73, 85, 77, -59, 46, 114, 55, 24})) != 0) {
                jSONObject = H(jSONObject, str, str2, map);
                if (jSONObject == null) {
                    return "";
                }
                if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 47, -35, -91}, new byte[]{6, 64, -71, -64, 91, 52, 83, 67})) == 41017) {
                    return str2;
                }
                jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{1, -19, 61, 24, -2, -89}, new byte[]{114, -103, 92, 108, -117, -44, -82, -114}));
            }
            String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{95, 106, -12, 43}, new byte[]{59, 11, -128, 74, 36, -13, -10, -89})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -28, 74, 119, 28, 44, -57}, new byte[]{-82, -123, 57, 28, 67, 69, -93, 8}));
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (i2 < 5) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[76];
                bArr[0] = -4;
                bArr[1] = 14;
                bArr[2] = 99;
                bArr[c] = 28;
                bArr[4] = 14;
                bArr[5] = 103;
                bArr[6] = 21;
                bArr[7] = 10;
                bArr[8] = -28;
                bArr[9] = 25;
                bArr[10] = 58;
                bArr[11] = 13;
                bArr[12] = 13;
                bArr[13] = 52;
                bArr[14] = 20;
                bArr[15] = 80;
                bArr[16] = -9;
                bArr[17] = 84;
                bArr[18] = 116;
                bArr[19] = 2;
                bArr[20] = 82;
                bArr[21] = 108;
                bArr[22] = 21;
                bArr[23] = 70;
                bArr[24] = -8;
                bArr[25] = 21;
                bArr[26] = 98;
                bArr[27] = 8;
                bArr[28] = 25;
                bArr[29] = 47;
                bArr[30] = 83;
                bArr[31] = 83;
                bArr[32] = -15;
                bArr[33] = 85;
                bArr[34] = 99;
                bArr[35] = 13;
                bArr[36] = 14;
                bArr[37] = 54;
                bArr[38] = 5;
                bArr[39] = 85;
                bArr[40] = -26;
                bArr[41] = 71;
                bArr[42] = 66;
                bArr[43] = 47;
                bArr[44] = 63;
                bArr[45] = 47;
                bArr[46] = 85;
                bArr[47] = 82;
                bArr[48] = -25;
                bArr[49] = 31;
                bArr[50] = 101;
                bArr[51] = 74;
                bArr[52] = 27;
                bArr[53] = 47;
                bArr[54] = 7;
                bArr[55] = 85;
                bArr[56] = -9;
                bArr[57] = 92;
                bArr[58] = 100;
                bArr[59] = 21;
                bArr[60] = 14;
                bArr[61] = 96;
                bArr[62] = 77;
                bArr[63] = 76;
                bArr[64] = -6;
                bArr[65] = 73;
                bArr[66] = 37;
                bArr[67] = 74;
                bArr[68] = 9;
                bArr[69] = 60;
                bArr[70] = 73;
                bArr[71] = 78;
                bArr[72] = -53;
                bArr[73] = 19;
                bArr[74] = 115;
                bArr[75] = 81;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -108;
                bArr2[1] = 122;
                bArr2[2] = 23;
                bArr2[c] = 108;
                bArr2[4] = 125;
                bArr2[5] = 93;
                bArr2[6] = 58;
                bArr2[7] = 37;
                sb.append(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
                sb.append(strOptString);
                byte[] bArr3 = new byte[13];
                bArr3[0] = 83;
                bArr3[1] = -55;
                bArr3[2] = -127;
                bArr3[c] = -99;
                bArr3[4] = -54;
                bArr3[5] = -38;
                bArr3[6] = 13;
                bArr3[7] = -109;
                bArr3[8] = 27;
                bArr3[9] = -33;
                bArr3[10] = -127;
                bArr3[11] = -111;
                bArr3[12] = -123;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 117;
                bArr4[1] = -69;
                bArr4[2] = -28;
                bArr4[c] = -23;
                bArr4[4] = -72;
                bArr4[5] = -93;
                bArr4[6] = 82;
                bArr4[7] = -6;
                sb.append(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                sb.append(i2);
                sb.append(1);
                byte[] bArr5 = new byte[5];
                bArr5[0] = 114;
                bArr5[1] = 18;
                bArr5[2] = 41;
                bArr5[c] = -66;
                bArr5[4] = -69;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 84;
                bArr6[1] = 77;
                bArr6[2] = 118;
                bArr6[c] = -54;
                bArr6[4] = -122;
                bArr6[5] = 26;
                bArr6[6] = 48;
                bArr6[7] = -41;
                sb.append(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                sb.append(System.currentTimeMillis());
                JSONObject jSONObject2 = new JSONObject(u(sb.toString()));
                byte[] bArr7 = new byte[4];
                bArr7[0] = -68;
                bArr7[1] = -121;
                bArr7[2] = 118;
                bArr7[c] = -60;
                byte[] bArr8 = new byte[8];
                bArr8[0] = -40;
                bArr8[1] = -26;
                bArr8[2] = 2;
                bArr8[c] = -91;
                bArr8[4] = -125;
                bArr8[5] = -61;
                bArr8[6] = 102;
                bArr8[7] = -52;
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.github.catvod.spider.merge.XI.f.a(bArr7, bArr8));
                byte[] bArr9 = new byte[7];
                bArr9[0] = -51;
                bArr9[1] = -45;
                bArr9[2] = -22;
                bArr9[c] = -45;
                bArr9[4] = 40;
                bArr9[5] = -18;
                bArr9[6] = 121;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -66;
                bArr10[1] = -78;
                bArr10[2] = -100;
                bArr10[c] = -74;
                bArr10[4] = 119;
                bArr10[5] = -113;
                bArr10[6] = 10;
                bArr10[7] = -9;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10));
                byte[] bArr11 = new byte[16];
                bArr11[0] = 88;
                bArr11[1] = 69;
                bArr11[2] = -11;
                bArr11[c] = -50;
                bArr11[4] = -90;
                bArr11[5] = 2;
                bArr11[6] = 120;
                bArr11[7] = 57;
                bArr11[8] = 95;
                bArr11[9] = 75;
                bArr11[10] = -13;
                bArr11[11] = -12;
                bArr11[12] = -97;
                bArr11[13] = 10;
                bArr11[14] = 111;
                bArr11[15] = 21;
                byte[] bArr12 = new byte[8];
                bArr12[0] = 43;
                bArr12[1] = 36;
                bArr12[2] = -125;
                bArr12[c] = -85;
                bArr12[4] = -7;
                bArr12[5] = 99;
                bArr12[6] = 11;
                bArr12[7] = 102;
                jSONArray = jSONObjectOptJSONObject2.optJSONArray(com.github.catvod.spider.merge.XI.f.a(bArr11, bArr12));
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
                i2++;
                c = 3;
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? q(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            y.b(new byte[]{101, 88, -59, -111, 16, 121, 96, -100, 117}, new byte[]{16, 59, -27, -14, 127, 9, 25, -68}, new StringBuilder(), e);
            return "";
        }
    }

    private void r(String str) {
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strV = v();
            byte b = 65;
            byte b2 = 4;
            byte b3 = 5;
            char c = 6;
            byte b4 = 86;
            if (strV.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-81}, new byte[]{-97, -8, -56, 65, -120, -100, -124, 86}))) {
                return;
            }
            C();
            int i2 = 1;
            while (true) {
                byte[] bArr = new byte[161];
                bArr[0] = -52;
                bArr[1] = -68;
                bArr[2] = 85;
                bArr[3] = -13;
                bArr[b2] = 31;
                bArr[b3] = 80;
                bArr[c] = b;
                bArr[7] = -116;
                bArr[8] = -44;
                bArr[9] = -85;
                bArr[10] = 12;
                bArr[11] = -30;
                bArr[12] = 28;
                bArr[13] = 3;
                bArr[14] = 64;
                bArr[15] = -42;
                bArr[16] = -57;
                bArr[17] = -26;
                bArr[18] = 66;
                bArr[19] = -19;
                bArr[20] = 67;
                bArr[21] = 91;
                bArr[22] = b;
                bArr[23] = -64;
                bArr[24] = -56;
                bArr[25] = -89;
                bArr[26] = 84;
                bArr[27] = -25;
                bArr[28] = 8;
                bArr[29] = 24;
                bArr[30] = 7;
                bArr[31] = -43;
                bArr[32] = -63;
                bArr[33] = -25;
                bArr[34] = 71;
                bArr[35] = -22;
                bArr[36] = 0;
                bArr[37] = 15;
                bArr[38] = b;
                bArr[39] = -48;
                bArr[40] = -53;
                bArr[41] = -70;
                bArr[42] = 85;
                bArr[43] = -68;
                bArr[44] = 28;
                bArr[45] = 24;
                bArr[46] = 83;
                bArr[47] = -10;
                bArr[48] = -25;
                bArr[49] = -118;
                bArr[50] = 83;
                bArr[51] = -20;
                bArr[52] = 27;
                bArr[53] = 25;
                bArr[54] = 11;
                bArr[55] = -47;
                bArr[56] = -126;
                bArr[57] = -82;
                bArr[58] = 83;
                bArr[59] = -66;
                bArr[60] = 28;
                bArr[61] = 9;
                bArr[62] = 72;
                bArr[63] = -45;
                bArr[64] = -64;
                bArr[b] = -95;
                bArr[66] = 83;
                bArr[67] = -36;
                bArr[68] = 10;
                bArr[69] = 3;
                bArr[70] = 10;
                bArr[71] = -98;
                bArr[72] = -127;
                bArr[73] = -69;
                bArr[74] = 7;
                bArr[75] = -36;
                bArr[76] = 28;
                bArr[77] = 11;
                bArr[78] = 9;
                bArr[79] = -58;
                bArr[80] = -103;
                bArr[81] = -19;
                bArr[82] = 82;
                bArr[83] = -91;
                bArr[84] = 51;
                bArr[85] = 25;
                bArr[b4] = 7;
                bArr[87] = -39;
                bArr[88] = -63;
                bArr[89] = -11;
                bArr[90] = b2;
                bArr[91] = -16;
                bArr[92] = 74;
                bArr[93] = 53;
                bArr[94] = 8;
                bArr[95] = -58;
                bArr[96] = -48;
                bArr[97] = -85;
                bArr[98] = 73;
                bArr[99] = -36;
                bArr[100] = 24;
                bArr[101] = b3;
                bArr[102] = 26;
                bArr[103] = -62;
                bArr[104] = -56;
                bArr[105] = -11;
                bArr[106] = 16;
                bArr[107] = -91;
                bArr[108] = 51;
                bArr[109] = 12;
                bArr[110] = 11;
                bArr[111] = -41;
                bArr[112] = -57;
                bArr[113] = -96;
                bArr[114] = 126;
                bArr[115] = -16;
                bArr[116] = 25;
                bArr[117] = 8;
                bArr[118] = 49;
                bArr[119] = -57;
                bArr[120] = -51;
                bArr[121] = -70;
                bArr[122] = 82;
                bArr[123] = -66;
                bArr[124] = 92;
                bArr[125] = 76;
                bArr[126] = 49;
                bArr[127] = -48;
                bArr[128] = -53;
                bArr[129] = -70;
                bArr[130] = 85;
                bArr[131] = -66;
                bArr[132] = 10;
                bArr[133] = 3;
                bArr[134] = 2;
                bArr[135] = -58;
                bArr[136] = -5;
                bArr[137] = -68;
                bArr[138] = 88;
                bArr[139] = -13;
                bArr[140] = 9;
                bArr[141] = 80;
                bArr[142] = 15;
                bArr[143] = -48;
                bArr[144] = -57;
                bArr[145] = -28;
                bArr[146] = 84;
                bArr[147] = -13;
                bArr[148] = 8;
                bArr[149] = 11;
                bArr[150] = 26;
                bArr[151] = -58;
                bArr[152] = -64;
                bArr[153] = -105;
                bArr[154] = 64;
                bArr[155] = -9;
                bArr[156] = b4;
                bArr[157] = 14;
                bArr[158] = 11;
                bArr[159] = -48;
                bArr[160] = -57;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -92;
                bArr2[1] = -56;
                bArr2[2] = 33;
                bArr2[3] = -125;
                bArr2[b2] = 108;
                bArr2[b3] = 106;
                bArr2[6] = 110;
                bArr2[7] = -93;
                JSONObject jSONObject = new JSONObject(u(String.format(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2), strV, Integer.valueOf(i2), 100)));
                byte[] bArr3 = new byte[b2];
                bArr3[0] = 60;
                bArr3[1] = -64;
                bArr3[2] = 116;
                bArr3[3] = 20;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 88;
                bArr4[1] = -95;
                bArr4[2] = 0;
                bArr4[3] = 117;
                bArr4[b2] = -85;
                bArr4[b3] = -87;
                bArr4[6] = 74;
                bArr4[7] = 10;
                JSONObject jSONObject2 = jSONObject.getJSONObject(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                byte[] bArr5 = new byte[b2];
                bArr5[0] = -89;
                bArr5[1] = 69;
                bArr5[2] = -48;
                bArr5[3] = -94;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -53;
                bArr6[1] = 44;
                bArr6[2] = -93;
                bArr6[3] = -42;
                bArr6[b2] = -8;
                bArr6[b3] = -14;
                bArr6[6] = 119;
                bArr6[7] = -100;
                JSONArray jSONArray = jSONObject2.getJSONArray(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(jSONArray.getJSONObject(i3).getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{43, -36, -96}, new byte[]{77, -75, -60, -25, -50, -126, -12, -40})));
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-123, -114, -89, 53, 84, 32, -51, 44}, new byte[]{-24, -21, -45, 84, 48, 65, -71, 77}));
                if (jSONObject3.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{35, 40, 32, 104, 112}, new byte[]{124, 91, 73, 18, 21, 23, -10, 20})) != jSONObject3.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, 93, 70, -98, -63, -18}, new byte[]{8, 62, 41, -21, -81, -102, 20, 78})) || jSONObject3.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{9, 56, 52, 94, 105, -96}, new byte[]{86, 91, 91, 43, 7, -44, 35, -9})) == 0) {
                    break;
                }
                i2++;
                b = 65;
                b4 = 86;
                b2 = 4;
                b3 = 5;
                c = 6;
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C0926u.c(str2, (String) it.next())) {
                    it.remove();
                }
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (int i4 = 0; i4 < iCeil; i4++) {
                int i5 = i4 * 50;
                n(new ArrayList(arrayList.subList(i5, Math.min(i5 + 50, size))));
            }
        } catch (Exception e) {
            y.b(new byte[]{-51, 86, 3, -126, -44, 35, 49, 16, -51, 90, 29, -57, -52, 47, 98, 20, -119, 86, 29, -107, -102}, new byte[]{-87, 51, 111, -25, -96, 70, 17, 96}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static U t() {
        return T.a;
    }

    private String u(String str) {
        return com.github.catvod.spider.merge.nU.c.l(str, y());
    }

    private String v() {
        String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{56, 22, 114, -64, -34, -13}, new byte[]{76, 96, 6, -91, -77, -125, 44, -19});
        try {
            JSONArray jSONArray = new JSONObject(u(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, -110, -93, -33, 8, -1, 124, -108, -46, -123, -6, -50, 11, -84, 125, -50, -63, -56, -76, -63, 84, -12, 124, -40, -50, -119, -94, -53, 31, -73, 58, -51, -57, -55, -79, -58, 23, -96, 124, -56, -51, -108, -93, -112, 11, -73, 110, -18, -31, -92, -91, -64, 12, -74, 54, -55, -124, -128, -91, -110, 11, -90, 117, -53, -58, -113, -91, -16, 29, -84, 55, -122, -110, -64, -120, -33, 26, -94, 54, -122, -109, -64, -120, -36, 18, -65, 54, -122, -105, -42, -15, -16, 29, -96, 39, -40, -54, -71, -93, -64, 15, -92, 63, -122, -109, -64, -120, -55, 30, -79, 48, -45, -3, -107, -94, -51, 36, -95, 58, -55, -47, -37, -25, -119, 36, -74, 60, -55, -42, -37, -79, -58, 23, -96, 12, -49, -37, -106, -78, -107, 26, -74, 48, -105, -41, -106, -77, -50, 15, -96, 55, -28, -61, -110, -19, -53, 30, -74, 48}, new byte[]{-94, -26, -41, -81, 123, -59, 83, -69}))).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{123, 11, 105, 18}, new byte[]{31, 106, 29, 115, 20, -12, -51, -78})).getJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{123, -29, -9, 112}, new byte[]{23, -118, -124, 4, 95, -53, -59, -55}));
            String string = "";
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                if (jSONObject.getBoolean(com.github.catvod.spider.merge.XI.f.a(new byte[]{117, -26, 79}, new byte[]{17, -113, 61, -12, -35, -84, 102, 37})) && jSONObject.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{44, -113, 63, 44, 62, -72, -79, -31, 47}, new byte[]{74, -26, 83, 73, 97, -42, -48, -116})).equals(strA)) {
                    string = jSONObject.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-34, 100, 76}, new byte[]{-72, 13, 40, 5, 38, 39, -46, 97}));
                    break;
                }
                i2++;
            }
            if (!string.equals("")) {
                return string;
            }
            String strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, -95, -116, -20, -34, 119, -123, 78, -85, -74, -43, -3, -35, 36, -124, 20, -72, -5, -101, -14, -126, 124, -123, 2, -73, -70, -115, -8, -55, 63, -61, 23, -66, -6, -98, -11, -63, 40, -107, 17, -87, -24, -83, -33, -17, 63, -59, 22, -88, -80, -118, -70, -53, 63, -105, 17, -72}, new byte[]{-37, -43, -8, -100, -83, 77, -86, 97});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-35, -35, 49, 85, 47, 96, -121, 114}, new byte[]{-83, -71, 88, 39, 112, 6, -18, 22}), com.github.catvod.spider.merge.XI.f.a(new byte[]{92}, new byte[]{108, -103, 13, -52, 3, -107, -23, 1}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, -6, 20, 58, -38, -96, -126, 56, -80}, new byte[]{-43, -109, 120, 95, -123, -50, -29, 85}), strA);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{82, 91, 17, 71, -30, 66, -113, 110}, new byte[]{54, 50, 99, 24, -110, 35, -5, 6}), "");
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, -33, 121, -94, 13, -35, 7, 76, 49, -38, 100, -98, 15}, new byte[]{110, -74, 11, -3, 100, -77, 110, 56}), Boolean.FALSE);
            return new JSONObject(L(strA2, map)).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{77, 117, 18, -23}, new byte[]{41, 20, 102, -120, -25, -91, 24, -88})).getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-118, -35, 73}, new byte[]{-20, -76, 45, -126, -58, 123, 57, 115}));
        } catch (Exception e) {
            y.b(new byte[]{-86, 111, 47, 14, -57, 18, -8, 61, -87, 99, 41, 109, -51, 26, -69, 77}, new byte[]{-51, 10, 91, 77, -88, 98, -127, 109}, new StringBuilder(), e);
            return com.github.catvod.spider.merge.XI.f.a(new byte[]{15}, new byte[]{63, -73, 57, 12, -24, 23, -99, -50});
        }
    }

    private Map<String, String> y() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, -127, 83, 35, 92, 6}, new byte[]{-97, -18, 60, 72, 53, 99, 8, 62}), this.a);
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-110, 18, 40, 62, -102, -100, -76}, new byte[]{-64, 119, 78, 91, -24, -7, -58, -93}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-101, -116, 94, 41, 50, -13, 17, -92, -105, -118, 67, 47, 36, -25, 75, -24, -35, -101, 68}, new byte[]{-13, -8, 42, 89, 65, -55, 62, -117}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-123, -71, -125, -95, -113, 39, -128, -102, -66, -66}, new byte[]{-48, -54, -26, -45, -94, 102, -25, -1}), i);
        return map;
    }

    private Map<String, String> z() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.d)) {
            str = this.a;
        } else {
            str = this.a + com.github.catvod.spider.merge.XI.f.a(new byte[]{-22}, new byte[]{-47, 122, 9, 14, -66, 59, -43, -10}) + this.d;
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, -39, 63, -56, 23, -66}, new byte[]{-71, -74, 80, -93, 126, -37, 69, 52}), str);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-27, 112, -106, 78, 62, -11, -20}, new byte[]{-73, 21, -16, 43, 76, -112, -98, 95}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -13, -36, -23, -35, -108, -40, 124, -27, -11, -63, -17, -53, -128, -126, 48, -81, -28, -58, -74}, new byte[]{-127, -121, -88, -103, -82, -82, -9, 83}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{89, -62, -37, 117, 64, 70, 81, -54, 98, -59}, new byte[]{12, -79, -66, 7, 109, 7, 54, -81}), i);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> A(java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.Boolean r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.bY.U.A(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):java.util.List");
    }

    public final long C() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final void D() {
        JSONObject jSONObject;
        try {
            Init.checkPermission();
            String str = System.currentTimeMillis() + "";
            String strA = com.github.catvod.spider.merge.pT.C.a(str);
            String strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{75, -127, -21, 23, -111, 80, 3, 24, 76, -41, -22, 70, -99, 93, 1, 78, 28, -41, -72, 69, -103, 10, 1, 31, 72, -43, -67, 64, -112, 9, 80, 75}, new byte[]{126, -32, -120, 113, -87, 104, 49, 124});
            String str2 = String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{23, -20, 102, -115, 31, 94, -97, 59, 16, -24, 119, -109, 65, 5, -64, 125, 82, -4, 96, -108, 26, 1, -98, 97, 28, -74, 113, -109, 67, 11, -47, 97, 11, -16, 61, -100, 25, 16, -40, 123, 13, -15, 104, -104, 83, 22, -43, 101, 32, -15, 118, -64, 73, 23, -106, 117, 28, -5, 119, -114, 31, 59, -60, 123, 20, -3, 124, -64, 74, 5, -64, 100, 32, -18, 119, -113, 81, 85, -98, 34, 81, -96, 52, -103, 9, 18, -39, 119, 26, -57, 123, -103, 81, 65, -61, 50, 27, -3, 100, -108, 15, 1, -17, 118, 13, -7, 124, -103, 81, 18, -39, 98, 16, -66, 98, -111, 13, 16, -42, 123, 13, -11, 47, -119, 26, 66, -44, 113, 9, -15, 113, -104, 51, 10, -47, 121, 26, -91, 68, -49, 94, 87, -120, 85, 89, -4, 119, -117, 5, 7, -43, 75, 18, -9, 118, -104, 0, 89, -26, 38, 77, -85, 42, -68, 74, 6, -59, 125, 19, -4, 77, -103, 9, 18, -39, 119, 26, -91, 68, -49, 94, 87, -120, 85, 89, -6, 103, -108, 0, 0, -17, 100, 13, -9, 118, -120, 15, 16, -115, 66, 77, -86, 33, -59, 45, 66, -44, 113, 9, -15, 113, -104, 51, 3, -64, 97, 66, -39, 118, -113, 9, 10, -33, 60, 43, -43, 59, -53, 88, 84, -106, 117, 28, -20, 123, -117, 5, 16, -55, 75, 13, -3, 113, -119, 81, 83, -12, 50, 28, -16, 115, -109, 2, 1, -36, 41, 42, -37, 70, -85, 35, 34, -10, 93, 60, -47, 83, -79, 59, 33, -14, 50, 30, -19, 102, -107, 51, 16, -55, 100, 26, -91, 113, -110, 8, 1, -106, 119, 19, -15, 119, -109, 24, 59, -39, 112, 66, -67, 97, -54, 74, 23, -45, 123, 15, -3, 47, -109, 9, 16, -44, 125, 12, -13, 52, -116, 30, 7, -33, 112, 26, -91, 35, -37, 29, 22, -17, 99, 22, -4, 102, -107, 81, 80, -122, 36, 89, -23, 96, -94, 4, 1, -39, 115, 23, -20, 47, -55, 90, 84}, new byte[]{127, -104, 18, -3, 108, 100, -80, 20}), com.github.catvod.spider.merge.pT.C.a(strA + str), strA, strA2);
            String strB = com.github.catvod.spider.merge.pT.C.b(String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{116, -27, 66, -41, -36, -83, 80, 13, 71, -56, 57, -112, -122, -74, 89, 23, 65, -55, 108, -108, -43, -25, 66, 94, 95, -109, 101, -125, -123, -74, 85, 79, 67, -108, 36, -99, -61, -90, 1, 0, 2, -43, 46, -107, -60, -69, 82, 64, 74, -59, 47, -102, -104, -85, 5, 28}, new byte[]{51, -96, 22, -15, -13, -62, 49, 120}), str));
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{13, -77, -30, -109, -128, -30, -115, 80, 54, -76}, new byte[]{88, -64, -121, -31, -83, -93, -22, 53}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-9, -8, -54, 32, 45, -57, 1, 4, -113, -71, -128, 105, 105, -25, 9, 69, -49, -17, -117, 105, 20, -112, 64, 106, -44, -13, -62, 38, 40, -49, 64, 26, -120, -84, -112, 51, 41, -122, 3, 69, -127, -73, -26, 123, 115, -104, 88, 106, -102, -43, -59, 32, 45, -49, 79, 125, -114, -90, -121, 0, 19, -126, 64, 106, -54, -25, -36, 44, 22, -50, 2, 96, -45, -29, -97, 124, 114, -104, 78, 26, -102, -65, -5, 1, 21, -26, 44, 7, -102, -5, -39, 34, 36, -117, 39, 78, -39, -4, -33, 96, 97, -26, 15, 73, -45, -5, -43, 105, 18, -54, 6, 74, -56, -2, -97, 124, 114, -104, 78, 26}, new byte[]{-70, -105, -80, 73, 65, -85, 96, 43}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-127, 21, -43, -94, -13, -48, -64, -24}, new byte[]{-7, 56, -91, -61, -99, -3, -76, -123}), str);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-90, 93, -9, -60, 97, -7, -83, -18, -75, 21, -23}, new byte[]{-34, 112, -121, -91, 15, -44, -39, -127}), strB);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-67, 33, 94, 49, 6, -32, 88, 51, -86, 55, 64, 32}, new byte[]{-34, 78, 48, 69, 99, -114, 44, 30}), com.github.catvod.spider.merge.XI.f.a(new byte[]{38, -81, 46, -33, 60, -81, -53, 104, 59, -92, 109, -56, 123, -66, -43, 122, 55, -66, 107, -2, 71, -103, -118, 49}, new byte[]{82, -54, 86, -85, 19, -33, -89, 9}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-69, 13, -128, -79, 114, -75, 72, -12, -86, 69, -98, -92, 49, -15, 79}, new byte[]{-61, 32, -16, -48, 28, -104, 43, -104}), strA2);
            String string = new JSONObject(com.github.catvod.spider.merge.nU.c.l(str2, map)).getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, 92, -121, 70, 75, -4, -2, 31, 16, 76, -116}, new byte[]{123, 41, -30, 52, 50, -93, -118, 112}));
            String str3 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, -112, -94, 118, -117, 105, -96, -104, -120, -111, -8, 115, -101, 125, -20, -39, -44, -35, -119, 111, -69, 26, -68, -33, -60, -111, -75, 89, -120, 50, -3, -42, -106, -69, -91, 114, -118, 110, -87, -61, -108, -113, -77, 104, -59}, new byte[]{-5, -28, -42, 6, -8, 83, -113, -73}) + string + com.github.catvod.spider.merge.XI.f.a(new byte[]{-15, 125, 88, 77, -123, -77, 52, -35, -92, 124, 73, 47, -76, -1, 125, -61, -76, 125, 72, 102, -120, -73, 107, -75, -108, 75, 30, 33, -90, -82, 39, -10, -69, 109, 89, 115, -107, -123, 40, -21, -81}, new byte[]{-41, 8, 59, 18, -25, -38, 78, -126});
            jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73, 8, -95}, new byte[]{-62, 122, -51, 31, -13, 23, 118, 56}), str3);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-10, 104, 34, -15, -61}, new byte[]{-126, 7, 73, -108, -83, 114, -31, -34}), string);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{21, -57, -25, -7, 31, 83, -3, -111, 21}, new byte[]{113, -94, -111, -112, 124, 54, -94, -8}), strA);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-83, 39, 82, -39, -10, 52, -73, 66, -86}, new byte[]{-50, 75, 59, -68, -104, 64, -24, 43}), strA2);
        } catch (Exception e) {
            e = e;
        }
        try {
            Init.run(new P(this, jSONObject, 0));
        } catch (Exception e2) {
            e = e2;
            y.b(new byte[]{-45, -24, 69, 15, -43, -70, 111, 67, -47, -83, 84, 100, -89}, new byte[]{-76, -115, 49, 94, -121, -7, 0, 39}, new StringBuilder(), e);
        }
    }

    public final com.github.catvod.spider.merge.KI.k F(String str, String str2, String str3) {
        if (TextUtils.isEmpty(N(str))) {
            return com.github.catvod.spider.merge.pT.C.e();
        }
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.lJ.a aVar = new com.github.catvod.spider.merge.lJ.a();
        aVar.j(str2);
        J(str, aVar, arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.pT.C.e();
        }
        this.e.d(arrayList);
        List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, -61, -73, 4, -53, 101, -102, 68}, new byte[]{-71, -128, 82, -118, 84, -126, 14, -1}), com.github.catvod.spider.merge.XI.f.a(new byte[]{93, 3, 6, 43, -43, 8, -51, 119}, new byte[]{8, 64, -17, -119, 81, -32, 106, -1}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.lJ.a aVar2 = (com.github.catvod.spider.merge.lJ.a) it.next();
            if (aVar2.e() != null && !aVar2.e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-80}, new byte[]{-21, -92, 99, 75, 93, 15, 69, 15}));
                sb.append(aVar2.e().trim());
                strA = C0925t.a(new byte[]{25}, new byte[]{68, -118, 105, -6, 20, -47, -101, 68}, sb);
            }
            StringBuilder sbB = C0925t.b(strA);
            sbB.append(aVar2.c());
            sbB.append(aVar2.g());
            v.c(new byte[]{-78}, new byte[]{-106, -10, -18, -99, 4, -13, -64, -118}, sbB, str);
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{24}, new byte[]{51, -5, 43, 46, 61, 97, 101, -42}));
            sbB.append(aVar2.b());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{55}, new byte[]{28, -71, 66, 99, -124, -25, 100, -86}));
            sbB.append(aVar2.f());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{58, -105, -117, -118}, new byte[]{82, -29, -1, -6, 56, -19, 92, -75}))) {
                StringBuilder sbB2 = C0925t.b(string);
                v.c(new byte[]{-36}, new byte[]{-9, 37, 0, -101, 26, 51, -112, 0}, sbB2, str3);
                sbB2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-62}, new byte[]{-23, 28, 27, -76, -54, 7, 104, -53}));
                sbB2.append(aVar2.c());
                string = sbB2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{79}, new byte[]{108, 41, 43, 114, 67, -2, -22, -105}), arrayList2));
        }
        com.github.catvod.spider.merge.KI.k kVar = new com.github.catvod.spider.merge.KI.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(this.e.b() == null ? com.github.catvod.spider.merge.XI.f.a(new byte[]{-13, -86, -57, 89, 122, -70, -80, -69, -99, -51, -46, 45, 16, -68, -43, -5, -68, -108, -107, 24, 68, -60, -20, -71}, new byte[]{27, 36, 112, -68, -11, 44, 88, 28}) : this.e.b().b());
        kVar.k(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, -45, 77}, new byte[]{-20, -9, 105, -126, 124, -17, -2, -123}), arrayList3));
        kVar.j(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{15, -21, 28}, new byte[]{43, -49, 56, -78, -17, 68, -83, -114}), listAsList));
        kVar.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{68, -44, -68, 82, 94, -110, -31, -66}, new byte[]{17, -105, 91, -17, -49, 117, 122, 38}));
        return kVar;
    }

    public final String K(String[] strArr, String str) throws Throwable {
        List<String> listA;
        if (TextUtils.isEmpty(this.a)) {
            o();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-69, -11, -98, 20, -126, -111}, new byte[]{-8, -102, -15, 127, -21, -12, -49, 87}), this.d);
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-2, 58, 108, 102, -108, 85, 87}, new byte[]{-84, 95, 10, 3, -26, 48, 37, -77}), com.github.catvod.spider.merge.XI.f.a(new byte[]{98, 104, -50, -104, 55, -121, -30, 93, 110, 110, -45, -98, 33, -109, -72, 17, 36, 127, -44}, new byte[]{10, 28, -70, -24, 68, -67, -51, 114}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, -15, 4, 18, -68, 35, -116, 77, -124, -10}, new byte[]{-22, -126, 97, 96, -111, 98, -21, 40}), i);
        if (str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{87}, new byte[]{116, -84, -60, 73, -102, 13, -43, -105}))[0].contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{49, 72, -37, 64, 27, -40}, new byte[]{-44, -58, 68, -89, -113, 99, 15, 24}))) {
            if (com.github.catvod.spider.merge.pT.m.b().booleanValue()) {
                String strD = com.github.catvod.spider.merge.pT.m.d(w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 55, 100);
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.KI.h hVar = new com.github.catvod.spider.merge.KI.h();
                    hVar.y(strD);
                    hVar.j();
                    hVar.f(z());
                    return hVar.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, -20, 124, 35, 105, 115, 51, 26, -28, -82, 101, 113, 105, 92, 60, 26, -12, -75}, new byte[]{-111, -120, 19, 30, 13, 18, 93, 119}));
                sb.append(strArr[3]);
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{71, 24, -109, 61, -66, 74, -21, 125, 25, 83}, new byte[]{97, 110, -4, 89, -9, 36, -113, 24}));
                sb.append(strArr[4]);
                String strA = C0925t.a(new byte[]{-92, -122, -84, 21, -80, 12, -39, 104}, new byte[]{-126, -16, -61, 113, -27, 126, -75, 85}, sb);
                com.github.catvod.spider.merge.KI.h hVar2 = new com.github.catvod.spider.merge.KI.h();
                hVar2.y(strD);
                hVar2.a(strA);
                hVar2.j();
                hVar2.f(z());
                return hVar2.toString();
            }
            if (!TextUtils.isEmpty(com.github.catvod.spider.merge.pT.m.g())) {
                String strW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.KI.h hVar3 = new com.github.catvod.spider.merge.KI.h();
                    hVar3.y(com.github.catvod.spider.merge.pT.m.e(strW));
                    hVar3.j();
                    hVar3.f(z());
                    return hVar3.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-51, 98, 8, 85, 41, -87, 49, 112, -121, 32, 17, 7, 41, -122, 62, 112, -105, 59}, new byte[]{-14, 6, 103, 104, 77, -56, 95, 29}));
                sb2.append(strArr[3]);
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{124, 25, 53, -35, -96, 100, 21, 4, 34, 82}, new byte[]{90, 111, 90, -71, -23, 10, 113, 97}));
                sb2.append(strArr[4]);
                String strA2 = C0925t.a(new byte[]{-64, -89, -113, -111, 108, 11, 96, 46}, new byte[]{-26, -47, -32, -11, 57, 121, 12, 19}, sb2);
                com.github.catvod.spider.merge.KI.h hVar4 = new com.github.catvod.spider.merge.KI.h();
                hVar4.y(com.github.catvod.spider.merge.pT.m.e(strW));
                hVar4.a(strA2);
                hVar4.j();
                hVar4.f(z());
                return hVar4.toString();
            }
        }
        if (Q()) {
            listA = x(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            map.remove(com.github.catvod.spider.merge.XI.f.a(new byte[]{-83, -102, 76, -45, -46, 54}, new byte[]{-18, -11, 35, -72, -69, 83, 83, -71}));
            map.remove(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, 77, -40, 100, 66, -67, -5}, new byte[]{-24, 40, -66, 1, 48, -40, -119, -89}));
        } else {
            listA = A(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
        }
        if (!com.github.catvod.spider.merge.pT.m.b().booleanValue() || strArr.length <= 4) {
            com.github.catvod.spider.merge.KI.h hVar5 = new com.github.catvod.spider.merge.KI.h();
            hVar5.z(listA);
            hVar5.j();
            hVar5.f(map);
            return hVar5.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Proxy.getUrl());
        sb3.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93, -19, 108, 80, 34, 39, 127, 59, -23, -81, 117, 2, 34, 8, 112, 59, -7, -76}, new byte[]{-100, -119, 3, 109, 70, 70, 17, 86}));
        sb3.append(strArr[3]);
        sb3.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -72, -32, -81, 76, 78, 108, -22, -73, -13}, new byte[]{-49, -50, -113, -53, 5, 32, 8, -113}));
        sb3.append(strArr[4]);
        String strA3 = C0925t.a(new byte[]{-5, 76, -43, -54, 77, 57, 89, -78}, new byte[]{-35, 58, -70, -82, 24, 75, 53, -113}, sb3);
        com.github.catvod.spider.merge.KI.h hVar6 = new com.github.catvod.spider.merge.KI.h();
        hVar6.z(listA);
        hVar6.a(strA3);
        hVar6.j();
        hVar6.f(map);
        return hVar6.toString();
    }

    public final Object[] M(Map<String, String> map) {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null && alertDialog.isShowing()) {
                return null;
            }
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{27, 38, -60, -23, 121, 73, -29, -111, 38, 39}, new byte[]{111, 67, -87, -103, 21, 40, -105, -12}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-33, -82, 19, 80, -109, -31, 28}, new byte[]{-84, -58, 114, 34, -10, -88, 120, -22}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{72, -114, -5, 66, -72, 1, -23}, new byte[]{37, -21, -97, 43, -39, 72, -115, -23}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 28, -113, 84, -33, -40}, new byte[]{15, 117, -29, 49, -106, -68, 88, 47}));
            String str = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, 65, 7, -106}, new byte[]{52, 32, 115, -13, -67, -9, -57, -125}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -47, -20, 24, -104, 115, 19}, new byte[]{77, -66, -121, 125, -10, 58, 119, 117}));
            String str2 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, -8, -87}, new byte[]{-63, -118, -59, 22, 55, -63, 26, -22}));
            if (!com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, -3, -84, -74}, new byte[]{-72, -110, -37, -40, 7, 48, 115, -46}).equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, -73, -122, -16, 101, 14, -27}, new byte[]{-42, -46, -32, -107, 23, 107, -105, 100}), com.github.catvod.spider.merge.XI.f.a(new byte[]{68, 79, 106, -75, 25, -5, -102, 72, 73, 77, 103, -7}, new byte[]{45, 44, 19, -104, 116, -98, -18, 41}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -7, 76, 43, 83}, new byte[]{-56, -104, 34, 76, 54, 45, 10, 23}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 14, 95, 79, 25, -99, -1, 1, -72, 15}, new byte[]{-41, 97, 49, 33, 124, -2, -117, 104}), com.github.catvod.spider.merge.XI.f.a(new byte[]{113, 61, -60, 107, 91, 39, -67, -4, 126, 61, -56, 106, 66, 61, -9}, new byte[]{16, 94, -89, 14, 43, 83, -112, -103}), com.github.catvod.spider.merge.XI.f.a(new byte[]{20, -1, -78, 2, 48, -60, 108, 42, 15, -8}, new byte[]{97, -116, -41, 112, 29, -91, 11, 79}), com.github.catvod.spider.merge.XI.f.a(new byte[]{93, -90, 102, -37, -29, 16}, new byte[]{62, -55, 9, -80, -118, 117, 80, 117}));
            for (String str3 : map.keySet()) {
                if (listAsList.contains(str3)) {
                    treeMap.put(str3, map.get(str3));
                }
            }
            return com.github.catvod.spider.merge.pT.m.h(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.lJ.e>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.lJ.e>] */
    public final String N(String str) {
        com.github.catvod.spider.merge.lJ.e eVar = (com.github.catvod.spider.merge.lJ.e) j.get(str);
        this.e = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{28, 77, 109, 101, 75, -50, 20, -122, 61, 65, 38, 115, 77, -107}, new byte[]{105, 46, 77, 22, 35, -81, 102, -29}) + this.e.toString());
        }
        com.github.catvod.spider.merge.lJ.e eVar2 = this.e;
        if (eVar2 != null && eVar2.a(str)) {
            return this.e.b().a();
        }
        String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 92, 37, 43, -126, 75, 60, -83, 5, 75, 124, 58, -127, 24, 61, -9, 22, 6, 50, 53, -34, 64, 60, -31, 25, 71, 36, 63, -107, 3, 122, -12, 16, 7, 34, 51, -112, 3, 118, -83, 6, 64, 48, 41, -108, 1, 114, -27, 16, 7, 37, 52, -102, 20, 125, -67, 5, 90, 108, 14, -78, 51, 97, -19, 2, 91, 52, 41, -41, 23, 97, -65, 5, 75}, new byte[]{117, 40, 81, 91, -15, 113, 19, -126});
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -72, 127, 53, 50, 125}, new byte[]{-103, -49, 27, 106, 91, 25, 97, 69}), str);
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{8, -119, -19, 36, 53, -23, -79, 105}, new byte[]{120, -24, -98, 87, 86, -122, -43, 12}), "");
        String strA2 = com.github.catvod.spider.merge.nU.c.g(strA, jsonObject.toString(), y()).a();
        StringBuilder sb = new StringBuilder();
        v.c(new byte[]{79, 44, 67, -67, -68, -64, -69, -3, 105, 7, 48, -89, -72, -44, -84, -52, 117, 4, 6, -95, -126}, new byte[]{26, 111, 99, -49, -39, -90, -55, -104}, sb, str);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-10, -91, 103, 31}, new byte[]{-85, -117, 73, 49, -31, -92, 38, 11}));
        sb.append(strA2);
        SpiderDebug.log(sb.toString());
        try {
            com.github.catvod.spider.merge.lJ.e eVar3 = (com.github.catvod.spider.merge.lJ.e) new Gson().fromJson(strA2, com.github.catvod.spider.merge.lJ.e.class);
            this.e = eVar3;
            eVar3.e(str);
            eVar3.f();
            j.put(str, this.e);
            if (this.e.b() == null) {
                return "";
            }
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{102, 96, 45, 71, -2, -12, 122, -3, 118, 109, 55}, new byte[]{19, 3, 13, 52, -118, -96, 21, -106}) + this.e.b().a());
            return this.e.b().a();
        } catch (Exception e) {
            y.b(new byte[]{8, 95, 105, 44, -116, -14, 125, 32, 18, 91, 125, 59, -67, -18, 126, 22, 20, 26, 90, 61, -45}, new byte[]{122, 58, 15, 94, -23, -127, 21, 115}, new StringBuilder(), e);
            return "";
        }
    }

    public final boolean Q() {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{11, -41, 39, 46, -24, 86}, new byte[]{120, -93, 70, 90, -99, 37, -23, 51})) == 0) {
                return true;
            }
            String strQ = com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{-126, -21, 51, -115, 98}, new byte[]{-84, -98, 80, -7, 20, -29, -64, 51}));
            if (TextUtils.isEmpty(strQ)) {
                throw new Exception(com.github.catvod.spider.merge.XI.f.a(new byte[]{85, -21, -68, -6, 33, 15, -127, 64, 69, -27}, new byte[]{48, -122, -52, -114, 88, 47, -11, 54}));
            }
            JSONObject jSONObject2 = new JSONObject(strQ);
            this.b = jSONObject2;
            if ((jSONObject2.optLong(com.github.catvod.spider.merge.XI.f.a(new byte[]{-87, 127, -105, 125, 97, 80, -50, 125, -73, 110}, new byte[]{-38, 11, -10, 15, 21, 15, -70, 20})) + this.b.optLong(com.github.catvod.spider.merge.XI.f.a(new byte[]{34, -92, 65, 63, -116, 99, 100, 114, 46, -78}, new byte[]{71, -36, 49, 86, -2, 6, 23, 45}))) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.b.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{39, -125, 59, 50, -40, -55, 96, -35, 39}, new byte[]{67, -26, 77, 91, -69, -84, 63, -76}));
                G(com.github.catvod.spider.merge.pT.C.a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e) {
            y.b(new byte[]{-12, -57, -72, -37, 7, 42, 26, -118, -30, -63, -72, -81, 20, 95}, new byte[]{-121, -94, -52, -113, 113, 101, 120, -32}, new StringBuilder(), e);
            return false;
        }
    }

    public final void R() {
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            final int i2 = 0;
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle(com.github.catvod.spider.merge.XI.f.a(new byte[]{46, -18, -8, 40, 37, 82, 29, -101, 99, 20, 12, -32, -40, -82, -105, 117, -81, 36, -84, 64, 11, 39, 108, -79, 32, -51, -50, 37, 54, 86, 31, -78, 96, -91, -9, 114, 126, 83, 116, 86, -78, 53, 63, 35, 27, 80}, new byte[]{-58, 65, 79, -64, -101, -63, -8, 30})).setView(frameLayout).setNeutralButton(com.github.catvod.spider.merge.XI.f.a(new byte[]{107, 111, -118, -96, -114, -24, -105, 65, 0, 9, -114, -7, -31, -19, -48, -88, -49, -51, 114, 22, 86, -97, -15, 86, 107, 77, -78}, new byte[]{-116, -19, 51, 70, 6, 121, 120, -3}), new B(this, 1)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.bY.N
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            U.e((U) this, (EditText) editText);
                            break;
                        default:
                            com.github.catvod.spider.merge.pT.B b = (com.github.catvod.spider.merge.pT.B) this;
                            Map map = (Map) editText;
                            b.getClass();
                            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{20, 71, -100, 126, 70}, new byte[]{121, 40, -8, 27, 42, 127, -94, -46}), com.github.catvod.spider.merge.XI.f.a(new byte[]{106}, new byte[]{91, 79, 78, 22, 113, -103, -93, 8}));
                            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-7, -112, -91, 89}, new byte[]{-97, -4, -60, 62, 117, -83, 115, 10}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-30, -94, -82, -74, 6, -98, -112, 90, -94, -24, -89, -4, 95, -98, -42, 40, -126, -101, -15, -46, 62, -57, -62, 65, -30, -86, -111, -73, 34, -119, -111, 71, -95, -22, -71, -45, 95, -103, -4, 40, -100, -76, -3, -24, 55, -58, -52, 122, -19, -83, -104, -70, 4, -67, -112, 102, -127, -27, -89, -63, 94, -92, -46}, new byte[]{10, 13, 25, 82, -69, 33, 119, -50}));
                            Init.execute(new S(b, map, 1));
                            break;
                    }
                }
            }).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-58, 2, -16, -33, -100, 21, -117, -43, -63, 88, -65, -51, -83, 65, -37}, new byte[]{-75, 106, -97, -88, -43, 123, -5, -96}) + e.getMessage());
        }
    }

    public final void o() {
        try {
            try {
                String strQ = TextUtils.isEmpty(this.a) ? com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{62, 75, -73}, new byte[]{16, 62, -44, 4, 35, -72, -80, 43})) : this.a;
                this.a = strQ;
                if (TextUtils.isEmpty(strQ)) {
                    throw new Exception(com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -114, -84, -22, -50, 106, -17, 8, -48, -120, -75, -5}, new byte[]{-65, -29, -36, -98, -73, 74, -116, 103}));
                }
                if (!I()) {
                    throw new Exception(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, -75, 77, 115, 79, -29, 92, -11, 79, -76, 84, 121, 74, -17}, new byte[]{44, -37, 59, 18, 35, -118, 56, -43}));
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                this.a = "";
                com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, 109, -82}, new byte[]{-44, 24, -51, 42, -29, -38, -3, 96}), this.a);
                SystemClock.sleep(400L);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{67, -104, 57, 22, 72, 75, 84, -113, 75, -103, 57, 79, 3}, new byte[]{32, -16, 92, 117, 35, 8, 59, -32}) + e.getMessage());
                S();
                Init.run(new RunnableC0908b(this, 2));
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (this.a.isEmpty()) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    public final void p() {
        this.a = "";
        this.b = null;
        com.github.catvod.spider.merge.pT.C.d(com.github.catvod.spider.merge.XI.f.a(new byte[]{123, 27, 108}, new byte[]{85, 110, 15, 83, -14, 92, 121, -28}));
        com.github.catvod.spider.merge.pT.C.d(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -70, -75, 34, -49}, new byte[]{-108, -49, -42, 86, -71, -2, -10, 89}));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.bY.U.w(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> x(String str, String str2, String str3) {
        try {
            N(str);
            String strQ = q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strQ)) {
                return new ArrayList();
            }
            String str4 = System.currentTimeMillis() + "";
            String strOptString = this.b.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{14, -25, 29, -58, 116, -118, -127, -103, 14}, new byte[]{106, -126, 107, -81, 23, -17, -34, -16}));
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{80, -113, -114, 28, -70, 91, -66, 73, 87, -39, -113, 77, -74, 86, -68, 31, 7, -39, -35, 78, -78, 1, -68, 78, 83, -37, -40, 75, -69, 2, -19, 26}, new byte[]{101, -18, -19, 122, -126, 99, -116, 45});
            String strA2 = com.github.catvod.spider.merge.pT.C.a(strOptString + str4);
            String strOptString2 = this.b.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -77, 24, -6, 31, -28, 121, -16, 55, -69, 30, -15}, new byte[]{88, -48, 123, -97, 108, -105, 38, -124}));
            String strB = com.github.catvod.spider.merge.pT.C.b(String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{89, 99, -26, -28, 4, -61, 106, -125, 123, 0, -105, -79, 13, -55, 48, -100, 108, 80, -58, -90, 28, -43, 55, -35, 114, 22, -42, -14, 83, -108, 118, -41, 122, 17, -53, -95, 19, -36, 102, -42, 117, 77, -37, -10, 79}, new byte[]{30, 38, -78, -62, 43, -91, 3, -17}), str4));
            String str5 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, 41, -113, 123, -10, -111, -12, 109, -37, 45, -98, 101, -88, -54, -85, 43, -103, 57, -119, 98, -13, -50, -11, 55, -41, 115, -104, 101, -86, -51, -78, 46, -47, 98, -119, 110, -12, -12, -78, 38, -119}, new byte[]{-76, 93, -5, 11, -123, -85, -37, 66}) + strA2 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-62, -40, 97, -68, 117, 109, -12, -41, -112, -42, 105, -70, 126, 35}, new byte[]{-28, -71, 2, -33, 16, 30, -121, -120}) + strOptString2 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-48, -20, 44, -86, -114, 92, -22, -126, -53, -68, 114, -20, -1, 18, -87, -108, -109, -5, 53, -71, -76, 117, -26, -108, -53}, new byte[]{-10, -115, 92, -38, -47, 42, -113, -16}) + strOptString + com.github.catvod.spider.merge.XI.f.a(new byte[]{94, -36, 66, -97, -23, 65, 69, 85, 26, -54, 70, -121, -28, 31, 86, 99, 14, -41, 1, -103, -20, 67, 84, 108, 23, -54, 74, -44, -12, 84, 6, 110, 29, -50, 78, -118, -27, 125, 78, 107, 21, -35, 26, -65, -78, 16, 19, 50, 57, -98, 67, -116, -10, 75, 67, 111, 39, -43, 72, -115, -27, 78, 29, 92, 74, -118, 20, -47, -63, 4, 66, 127, 17, -44, 67, -74, -28, 71, 86, 99, 27, -35, 26, -65, -78, 16, 19, 50, 57, -98, 69, -100, -23, 78, 68, 85, 8, -54, 72, -115, -11, 65, 84, 55, 46, -118, 21, -38, -72, 99, 6, 110, 29, -50, 78, -118, -27, 125, 71, 122, 13, -123, 102, -115, -14, 71, 78, 101, 93, -118, 23, -63, -44, 111, 9, 47, 74, -120, 17, -35, -80, 4, 65, 105, 12, -47, 81, -128, -12, 91, 127, 120, 29, -37, 83, -44, -91, 21, 98, 47, 79, -4, 1, -118, -24, 67, 78, 100, 29, -44, 26, -68, -61, 118, 118, 69, 62, -2, 110, -86, -55, 99, 108, 93, 61, -6, 1, -124, -27, 86, 72, 101, 28, -123, 84, -99, -14, 71, 65, 103, 17, -42, 64, -49, -25, 80, 79, 127, 8, -25, 69, -112, -67, 81, 79, 127, 10, -37, 66, -49, -26, 75, 68, 55}, new byte[]{120, -72, 39, -23, -128, 34, 32, 10}) + strQ + com.github.catvod.spider.merge.XI.f.a(new byte[]{65, -71, -86, 113, 82, 85, -118, 55, 14, -92, -95, 63, 81, 86, -120, 111, 9, -92, -67, 111, 92, 85, -45, 43, 14, -84, -89, 46, 78, 76, -113, 38, 21, -25, -3, 105, 17, 13, -108, 101, 20, -66, -65, 114, 82, 75, -117, 126, 3, -92, -93, 96, 68, 102, -119, 42, 20, -94, -96, 108}, new byte[]{103, -53, -49, 2, 61, 57, -1, 67});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-62, 90, -127, -109, 34, 85, -4, -123, -7, 93}, new byte[]{-105, 41, -28, -31, 15, 20, -101, -32}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, 79, 53, -125, 73, -10, -22, 125, -42, 14, 127, -54, 13, -42, -30, 60, -106, 88, 116, -54, 112, -95, -85, 19, -115, 68, 61, -123, 76, -2, -85, 99, -47, 27, 111, -112, 77, -73, -24, 60, -40, 0, 25, -40, 23, -87, -77, 19, -61, 98, 58, -125, 73, -2, -92, 4, -41, 17, 120, -93, 119, -77, -85, 19, -109, 80, 35, -113, 114, -1, -23, 25, -118, 84, 96, -33, 22, -87, -91, 99, -61, 8, 4, -94, 113, -41, -57, 126, -61, 76, 38, -127, 64, -70, -52, 55, -128, 75, 32, -61, 5, -41, -28, 48, -118, 76, 42, -54, 118, -5, -19, 51, -111, 73, 96, -33, 22, -87, -91, 99}, new byte[]{-29, 32, 79, -22, 37, -102, -117, 82}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{44, 100, -43, -12, 6, 78, 68, 117}, new byte[]{84, 73, -91, -107, 104, 99, 48, 24}), str4);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-126, 98, 84, 66, -103, -1, -48, 84, -111, 42, 74}, new byte[]{-6, 79, 36, 35, -9, -46, -92, 59}), strB);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93, 97, 16, -72, 20, 30, -11, -26, -76, 119, 14, -87}, new byte[]{-64, 14, 126, -52, 113, 112, -127, -53}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, -52, -53, -26, -83, -100, 102, 74, -77, -57, -120, -15, -22, -115, 120, 88, -65, -35, -114, -57, -42, -86, 39, 19}, new byte[]{-38, -87, -77, -110, -126, -20, 10, 43}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -50, -101, 119, -104, -37, 85, 62, -85, -122, -123, 98, -37, -97, 82}, new byte[]{-62, -29, -21, 22, -10, -10, 54, 82}), strA);
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(str5, map));
            if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{116, -33, -67, -41, -29, -46}, new byte[]{7, -85, -36, -93, -106, -95, 103, -6})) != 0) {
                return new ArrayList();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, -40, 98, 48}, new byte[]{-41, -71, 22, 81, 72, 47, 41, 29})).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-71, 9, 59, 35, 21, -115, 9, 15, -87, 15}, new byte[]{-49, 96, 95, 70, 122, -46, 96, 97}));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{86, -30, 5, -40, 109, -34, -58, -104, 91, -28}, new byte[]{55, -127, 102, -67, 30, -83, -89, -6})) == 1) {
                    arrayList.add((String) this.g.get(jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-118, -33, 54, -77, -117, -126, 36, -110, -105, -44}, new byte[]{-8, -70, 69, -36, -25, -9, 80, -5}))));
                    arrayList.add(jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{116, 108, -101}, new byte[]{1, 30, -9, -36, -66, -90, -78, 48})));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
