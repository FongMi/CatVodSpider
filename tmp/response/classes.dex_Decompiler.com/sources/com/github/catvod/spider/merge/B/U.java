package com.github.catvod.spider.merge.b;

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
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.l.C0184a;
import com.github.catvod.spider.merge.l.C0186c;
import com.github.catvod.spider.merge.l.C0188e;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0219l;
import com.github.catvod.spider.merge.p.C0221n;
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

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class U {
    private static final String i = C0098a.a(new byte[]{-7, -19, -63, 72, 56, 36, -81, -29, -127, -84, -117, 1, 124, 31, -89, -94, -48, -19, -52, 82, 116, 6, -102, -20, -123, -78, -107, 17, 111, 104, -103, -91, -38, -76, -113, 26, 116, 48, -8, -8, -99, -94, -6, 81, 36, 36, -85, -101, -47, -32, -16, 72, 32, 103, -5, -1, -125, -84, -120, 23, 116, 96, -123, -124, -32, -49, -9, 13, 116, 36, -89, -89, -47, -94, -4, 68, 55, 35, -95, -27, -108, -9, -40, 12, 55, 36, -95, -71, -48, -81, -33, 83, 61, 62, -85, -29, -123, -84, -125, 15, 97, 104, -115, -92, -58, -19, -42, 68, 123, 121, -2, -4, -102, -78, -107, 21, 108, 113, -8, -30, -123, -76, -117, 1, 17, 36, -85, -81, -64, -16, -44, 79, 123, 121, -10, -30, -121, -84, -114, 15, 101, 126, -29, -82, -126, -80, -40, 71, 109, 43, -5, -4, -48, -94, -24, 64, 50, 41, -68, -91, -101, -73, -120, 22, 122, 123, -8, -20, -9, -22, -38, 79, 58, 45, -94, -29, -63, -31, -53, 64, 58, 23, -95, -72, -36, -25, -55, 126, 55, 32}, new byte[]{-76, -126, -69, 33, 84, 72, -50, -52});
    private static Map<String, C0188e> j;
    private String a;
    private JSONObject b;
    private ScheduledExecutorService c;
    private String d;
    private C0188e e;
    private AlertDialog f;
    private final Map<String, String> g;
    String h;

    U() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.g = map;
        map.put(C0098a.a(new byte[]{1, -109}, new byte[]{53, -8, -107, 9, -100, 81, -50, 80}), C0098a.a(new byte[]{54, 11}, new byte[]{2, 64, -82, -76, -124, -26, -94, 95}));
        map.put(C0098a.a(new byte[]{-61, 125}, new byte[]{-15, 22, -79, 62, -78, 113, -84, -60}), C0098a.a(new byte[]{104, 123}, new byte[]{90, 48, 105, -69, 112, 62, 35, 35}));
        map.put(C0098a.a(new byte[]{15, 110, 97, 55, 5}, new byte[]{124, 27, 17, 82, 119, -67, 88, -77}), C0098a.a(new byte[]{8, -93, -75, 73, 103, -100}, new byte[]{-32, 21, 48, -81, -33, 25, -116, 125}));
        map.put(C0098a.a(new byte[]{24, 3, 31, -72}, new byte[]{112, 106, 120, -48, 39, -17, 50, 99}), C0098a.a(new byte[]{-78, -124, -114, -53, 5, 31}, new byte[]{91, 47, 22, 45, -67, -102, -68, -64}));
        map.put(C0098a.a(new byte[]{-54, -84, 57}, new byte[]{-90, -61, 78, -89, 44, -59, 83, -16}), C0098a.a(new byte[]{-25, 17, 53, 28, 31, -36}, new byte[]{1, -92, -76, -5, -118, 89, 78, -73}));
        map.put(C0098a.a(new byte[]{-78, 97, 88, 13, 42, 20}, new byte[]{-36, 14, 42, 96, 75, 120, -21, -36}), C0098a.a(new byte[]{-54, -11, 67, 76, -94, -64}, new byte[]{46, 77, -61, -92, 42, 108, 124, -60}));
        j = new HashMap();
        E();
        SpiderDebug.log(C0098a.a(new byte[]{-53, 97, 105, -60, -127, 117, -103, -111, -9, 118}, new byte[]{-98, 2, 48, -79, -17, 85, -48, -1}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            this.h = System.currentTimeMillis() + "";
            String str = C0098a.a(new byte[]{38, -20, -25, 22, 26, -115, -105, -108, 47, -24, -6, 72, 6, -57, -35, -43, 96, -19, -16, 72, 10, -39, -105, -40, 47, -21, -68, 7, 3, -42, -64, -108, 41, -3, -25, 50, 6, -36, -35, -43, 8, -9, -31, 55, 27, -44, -41, -33, 43, -44, -4, 1, 0, -39, -121, -28, 17, -4, -25, 91, 95, -125, -119, -119, 123, -84, -75, 57, 54, -61, -123}, new byte[]{78, -104, -109, 102, 105, -73, -72, -69}) + this.h;
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{-118, 28, -22, 116, -46, -122}, new byte[]{-53, 127, -119, 17, -94, -14, 67, -26}), C0098a.a(new byte[]{52, 77, -60, 23, 72, 83, -50, 39, 60, 82, -38, 84, 75, 67, -64, 61, 121, 29, -64, 30, 89, 68, -128, 35, 57, 92, -35, 21, 13, 16, -123, 124, 127}, new byte[]{85, 61, -76, 123, 33, 48, -81, 83}));
            map.put(C0098a.a(new byte[]{-75, 61, -87, -18, -87, 56, 109, -113, -94, 43, -73, -1}, new byte[]{-10, 82, -57, -102, -52, 86, 25, -94}), C0098a.a(new byte[]{124, -56, 78, 97, -91, 16, 51, 93, 116, -41, 80, 34, -76, 94, 37, 94, 106, -107, 88, 98, -66, 30, 127, 92, 111, -44, 91, 99, -81, 28, 54, 76, 121}, new byte[]{29, -72, 62, 13, -52, 115, 82, 41}));
            map.put(C0098a.a(new byte[]{100, -43, -75, -23, 125, -102, -120, 50, 95, -46}, new byte[]{49, -90, -48, -101, 80, -37, -17, 87}), i);
            map.put(C0098a.a(new byte[]{4, 123, -40, -18, -17, -72, -80}, new byte[]{86, 30, -66, -117, -99, -35, -62, 31}), C0098a.a(new byte[]{119, 114, -127, 89, 41, 109, -49, 94, 125, 116, -102, 74, 57, 56, -116, 24, 49, 115, -106, 7, 57, 57, -49}, new byte[]{31, 6, -11, 41, 90, 87, -32, 113}));
            HashMap map2 = new HashMap();
            map2.put(C0098a.a(new byte[]{87, 76, -55, -114, -52, -63, 40, -20, 80}, new byte[]{52, 32, -96, -21, -94, -75, 119, -123}), C0098a.a(new byte[]{-122, -32, 109}, new byte[]{-75, -40, 92, -38, -45, -34, 47, 41}));
            map2.put(C0098a.a(new byte[]{-7}, new byte[]{-113, -125, 125, 88, 101, -35, -106, -94}), C0098a.a(new byte[]{127, -64, 57}, new byte[]{78, -18, 11, 91, -111, -20, 27, 62}));
            map2.put(C0098a.a(new byte[]{-9, -23, -68, 22, 35, -124, 99, 4, -20, -24}, new byte[]{-123, -116, -51, 99, 70, -9, 23, 91}), this.h);
            String strOptString = new JSONObject(C0197c.h(str, map2, map).a()).optJSONObject(C0098a.a(new byte[]{-105, 86, -50, 36}, new byte[]{-13, 55, -70, 69, -66, 61, -5, 81})).optJSONObject(C0098a.a(new byte[]{-114, 6, -36, 117, -81, -62, 90}, new byte[]{-29, 99, -79, 23, -54, -80, 41, 118})).optString(C0098a.a(new byte[]{60, 13, -57, 74, 72}, new byte[]{72, 98, -84, 47, 38, 6, -18, -84}));
            String str2 = C0098a.a(new byte[]{32, 96, -72, -118, -98, 6, -72, -34, 59, 97, -30, -113, -114, 18, -12, -97, 103, 37, -109, -108, -35, 102, -44, -121, 119, 97, -81, -91, -99, 93, -27, -112, 37, 75, -65, -114, -97, 1, -13, -126, 44, 122, -86, -120, -99, 90, -11, -104, 62, 113, -65, -119, -114, 76, -16, -104, 37, 125, -82, -114, -113, 81, -7, -104, 34, 118, -96, -101, -104, 76, -30, -123, 39, 115, -68, -109, -125, 72, -7, -122, 35, 96, -68, -120, -114, 84, -6, -123, 110, 96, -93, -111, -120, 82, -86}, new byte[]{72, 20, -52, -6, -19, 60, -105, -15}) + strOptString + C0098a.a(new byte[]{-22, 11, -84, 110, 65, -9, 13, -123, -91, 12, -3, 52, 28, -88, 95, -81, -81, 55, -94, 110, 94, -58, 10, -82, -66, 85, -109, 34, 23, -40, 26, -81, -65, 28, -81, 106, 1, -82, 58, -103, -23, 91, -127, 115, 77, -19, 21, -65, -82, 9, -78, 88, 66, -16, 1}, new byte[]{-52, 104, -64, 7, 36, -103, 121, -38});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-83, -11, 65}, new byte[]{-40, -121, 45, 59, -104, 3, -84, 42}), str2);
            jSONObject.put(C0098a.a(new byte[]{-33, 44, -16, -64, 95}, new byte[]{-85, 67, -101, -91, 49, 126, 121, 114}), strOptString);
            Init.run(new RunnableC0108J(this, jSONObject, 1));
        } catch (Exception e) {
            y.c(new byte[]{70, 10, 73, 95, 30, -5, -127, 109, 68, 79, 88, 52, 108}, new byte[]{33, 111, 61, 14, 76, -72, -18, 9}, new StringBuilder(), e);
        }
    }

    private String E() {
        return C0197c.b(C0098a.a(new byte[]{113, -124, -60, -29, -29, -127, 79, -111, 105, -109, -99, -14, -32, -46, 78, -53, 122, -34, -45, -3, -65, -118, 79, -35, 117, -97, -59, -9, -12, -55, 9, -56, 124, -33, -42, -6, -4, -34}, new byte[]{25, -16, -80, -109, -112, -69, 96, -66}), y()).a();
    }

    private void G(String str, String str2, String str3) {
        String strA;
        String strOptString;
        try {
            String strA2 = C0098a.a(new byte[]{103, 37, 41, 92, -111, -22, -13, -48, 127, 56, 115, 73, -45, -79, -81, -46, 125, 52, 56, 66, -123, -90, -77, -36, 32, 36, 62, 72, -39, -84, -86, -44, 32, 37, 50, 71, -50, -85}, new byte[]{15, 81, 93, 44, -85, -59, -36, -79});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{119, 31, -17, 31, -97, -45}, new byte[]{5, 122, -98, 64, -10, -73, -4, 3}), str);
            jSONObject.put(C0098a.a(new byte[]{115, 91, -16, 45, -64, -100, -26}, new byte[]{18, 43, -128, 114, -74, -7, -108, -68}), C0098a.a(new byte[]{122, 33, -93, 122, -11}, new byte[]{75, 15, -107, 84, -51, -46, 75, 24}));
            jSONObject.put(C0098a.a(new byte[]{-105, -39, -115, -43, 115, 120, 117, 25, -105}, new byte[]{-13, -68, -5, -68, 16, 29, 42, 112}), str2);
            jSONObject.put(C0098a.a(new byte[]{74, 61, -72, -80, -16, -122, 39, 104, 92, 57, -96, -67}, new byte[]{46, 88, -50, -39, -109, -29, 120, 10}), C0098a.a(new byte[]{3, 57, 27, 82}, new byte[]{117, 80, 109, 61, 65, -49, -86, -125}));
            jSONObject.put(C0098a.a(new byte[]{127, -92, 62, -91, 126, -77, 122, 19}, new byte[]{15, -56, 95, -47, 24, -36, 8, 126}), C0098a.a(new byte[]{-116, -107}, new byte[]{-8, -29, 27, 94, -103, 90, -81, 37}));
            jSONObject.put(C0098a.a(new byte[]{64, -28, -37, 13, -29, -34, -80, 114, 69, -20, -56}, new byte[]{36, -127, -83, 100, -128, -69, -17, 28}), C0098a.a(new byte[]{37, 85, -68, 94, -47, -124}, new byte[]{115, 103, -114, 109, -23, -59, 50, 10}));
            jSONObject.put(C0098a.a(new byte[]{-38, -63, 86, 36, -99, 10, 59, -56, -47, -64, 69, 33}, new byte[]{-66, -92, 32, 77, -2, 111, 100, -91}), C0098a.a(new byte[]{24, 90, -42, -61, 59, -122}, new byte[]{78, 104, -28, -16, 3, -57, -100, 51}));
            jSONObject.put(C0098a.a(new byte[]{75, -38, -84, -37, 97, -23, -62, 89, 95, -58, -90, -46}, new byte[]{41, -81, -59, -73, 5, -74, -90, 60}), C0098a.a(new byte[]{69, 52, 95, 74, 12, -55}, new byte[]{19, 6, 109, 121, 52, -120, -12, 24}));
            jSONObject.put(C0098a.a(new byte[]{-76, -35, 114, -29, -62, 97, 106, 88, -71, -52, 110, -20, -46}, new byte[]{-42, -88, 27, -113, -90, 62, 26, 42}), C0098a.a(new byte[]{-78, -96, -58, 99, 43, 0}, new byte[]{-28, -110, -12, 80, 19, 65, 17, 27}));
            jSONObject.put(C0098a.a(new byte[]{90, -91, -16, 111, -24, 10, -84, -32, 78, -75}, new byte[]{62, -64, -122, 6, -117, 111, -13, -121}), C0098a.a(new byte[]{-8, 99, 117, -17, 36, 82, -17, -66, -19, 74, 46, -86, 124, 9, -1}, new byte[]{-71, 7, 7, -118, 74, 61, -49, -106}));
            jSONObject.put(C0098a.a(new byte[]{47, -127, 41, -94, 104, 124, 64, -6, 17, -112, 56, -88, 106}, new byte[]{78, -30, 93, -53, 30, 21, 52, -125}), C0098a.a(new byte[]{-49, -46}, new byte[]{-76, -81, 2, 88, 47, 16, 19, 14}));
            jSONObject.put(C0098a.a(new byte[]{-63, -121, 25, -62, -64, -97, 10}, new byte[]{-94, -17, 120, -84, -82, -6, 102, 24}), C0098a.a(new byte[]{61, -75, -4, -31, -38, 15, -53, -81, 43, -65, -23, -5, -62, 12, -49}, new byte[]{104, -10, -88, -73, -107, 73, -115, -26}));
            try {
                if (TextUtils.isEmpty(str3)) {
                    strA = C0098a.a(new byte[]{-99, 0, 11, 68, 104, 58, -33, 64, -101, 10, 6, 83, 99}, new byte[]{-17, 101, 109, 54, 13, 73, -73, 31});
                    strOptString = this.b.optString(C0098a.a(new byte[]{104, -94, -86, 76, -107, 9, -106, -94, 110, -88, -89, 91, -98}, new byte[]{26, -57, -52, 62, -16, 122, -2, -3}));
                } else {
                    strA = C0098a.a(new byte[]{-96, -97, 91, -32}, new byte[]{-61, -16, 63, -123, -6, 101, 102, -23});
                    strOptString = str3;
                }
                jSONObject.put(strA, strOptString);
                HashMap map = new HashMap();
                map.put(C0098a.a(new byte[]{-3, -119, -74, 56, -50, -43, -115, 112, -58, -114}, new byte[]{-88, -6, -45, 74, -29, -108, -22, 21}), C0098a.a(new byte[]{26, 119, -111, -46, -95, -96, -21, 27, 98, 54, -37, -101, -27, -128, -29, 90, 34, 96, -48, -101, -104, -9, -86, 117, 57, 124, -103, -44, -92, -88, -86, 5, 101, 35, -53, -63, -91, -31, -23, 90, 108, 56, -67, -119, -1, -1, -78, 117, 119, 90, -98, -46, -95, -88, -91, 98, 99, 41, -36, -14, -97, -27, -86, 117, 39, 104, -121, -34, -102, -87, -24, 127, 62, 108, -60, -114, -2, -1, -92, 5, 119, 48, -96, -13, -103, -127, -58, 24, 119, 116, -126, -48, -88, -20, -51, 81, 52, 115, -124, -110, -19, -127, -27, 86, 62, 116, -114, -101, -98, -83, -20, 85, 37, 113, -60, -114, -2, -1, -92, 5}, new byte[]{87, 24, -21, -69, -51, -52, -118, 52}));
                map.put(C0098a.a(new byte[]{68, 103, -64, -10, 16, 68, 71, 40, 83, 113, -34, -25}, new byte[]{7, 8, -82, -126, 117, 42, 51, 5}), C0098a.a(new byte[]{53, 114, -83, 53, -78, -111, 3, -77, 61, 109, -77, 118, -79, -127, 13, -87, 111, 34, -66, 49, -70, -128, 17, -94, 32, 63, -88, 45, -67, -33, 90}, new byte[]{84, 2, -35, 89, -37, -14, 98, -57}));
                JSONObject jSONObject2 = new JSONObject(C0197c.g(strA2, jSONObject.toString(), map).a());
                if (jSONObject2.optInt(C0098a.a(new byte[]{39, -117, -33, -1}, new byte[]{68, -28, -69, -102, 5, 29, -79, -35})) == 200) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0098a.a(new byte[]{100, -59, -28, -94}, new byte[]{0, -92, -112, -61, 122, 122, -68, -73}));
                    jSONObjectOptJSONObject.put(C0098a.a(new byte[]{81, 75, -6, -54, 26, -6, -76, 102, 79, 90}, new byte[]{34, 63, -101, -72, 110, -91, -64, 15}), System.currentTimeMillis() / 1000);
                    jSONObjectOptJSONObject.put(C0098a.a(new byte[]{73, -4, 127, 115, 14, 103, -28, -67, 73}, new byte[]{45, -103, 9, 26, 109, 2, -69, -44}), str2);
                    C0207D.u(C0098a.a(new byte[]{13, 16, -125, 120, -89}, new byte[]{35, 101, -32, 12, -47, 47, 31, 71}), jSONObjectOptJSONObject.toString());
                }
            } catch (Exception e) {
                e = e;
                y.c(new byte[]{-32, 72, 94, -46, 110, -96, -78, 127, -12, 69, 126, -17, 96, -93, -82, 88, -2, 121, 124, -96, 110, -4}, new byte[]{-121, 45, 42, -128, 11, -58, -64, 26}, new StringBuilder(), e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private JSONObject H(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt(C0098a.a(new byte[]{-1, 116, -92, 114}, new byte[]{-100, 27, -64, 23, 99, 108, 85, 121})) == 32003) {
                C0219l.b(C0098a.a(new byte[]{53, 89, -76, -27, -54, -2, -75, 19, 105, 20, -117, -113, -86, -62, -30, 90, 107, 114, -21, -108, -25, -112, -2, 49, -4, -35, -28, -81, -8, -109, -39, 54, 53, 119, -92, -27, -57, -43, -71, 36, 116}, new byte[]{-48, -3, 12, 0, 79, 117, 80, -67}));
                return null;
            }
            j = new HashMap();
            if (TextUtils.isEmpty(N(str))) {
                return null;
            }
            O(str);
            String strF = "";
            Iterator<C0184a> it = this.e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0184a next = it.next();
                String strB = next.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = next.f();
                    break;
                }
            }
            map.put(C0098a.a(new byte[]{13, 98, 118, -32, -127, -12}, new byte[]{126, 22, 25, -117, -28, -102, 6, 85}), this.e.b().a());
            map.put(C0098a.a(new byte[]{-121, -24, -60, -12, -19, 59, 6, 46, -113, -34, -52, -62, -22, 32}, new byte[]{-31, -127, -96, -85, -103, 84, 109, 75}), Collections.singletonList(strF));
            return new JSONObject(L(C0098a.a(new byte[]{43, 59, 86, 100, -18, -120, -58, -102, 51, 44, 15, 117, -19, -37, -57, -64, 32, 97, 65, 122, -78, -125, -58, -42, 47, 32, 87, 112, -7, -64, -128, -61, 38, 96, 81, 124, -4, -64, -116, -102, 48, 39, 67, 102, -8, -62, -120, -46, 38, 96, 81, 117, -21, -41, -42, -59, 49, 114, 87, 119, -19, -64, -122, -109, 37, 61, 31, 100, -2, -108, -100, -42, 28, 63, 67, 102, -4, -33, -74, -58, 55, 61, 31, 50, -62, -19, -99, -120}, new byte[]{67, 79, 34, 20, -99, -78, -23, -75}) + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean I() {
        try {
            JSONObject jSONObject = new JSONObject(C0197c.l(C0098a.a(new byte[]{66, 73, 106, -6, -99, 42, 88, -2, 90, 94, 51, -21, -98, 121, 89, -92, 73, 19, 125, -28, -63, 33, 88, -78, 70, 82, 107, -18, -118, 98, 30, -89, 79, 18, 115, -17, -125, 114, 18, -93, 21, 77, 108, -73, -69, 83, 53, -93, 69, 74, 109, -17, -100, 54, 17, -93, 23, 77, 125, -84, -120, 117, 3, -78, 66, 98, 109, -1, -116, 99, 20, -93, 67, 95, 123, -73, -102, 98, 2, -76, 12, 98, 125, -30, -45, 120, 24, -68, 79}, new byte[]{42, 61, 30, -118, -18, 16, 119, -47}), y()));
            try {
                if (!C0098a.a(new byte[]{30, 25, -72}, new byte[]{44, 41, -120, -110, 18, 89, 81, -115}).equals(jSONObject.optString(C0098a.a(new byte[]{40, -32, -120, 27, 9, 80}, new byte[]{91, -108, -23, 111, 124, 35, -124, 114})))) {
                    throw new Exception();
                }
                jSONObject.optJSONObject(C0098a.a(new byte[]{89, 31, 67, 95}, new byte[]{61, 126, 55, 62, -23, 106, -9, -91})).optString(C0098a.a(new byte[]{-31, -46, -110, -18, -102, -58, 117, 34, -11, -57, -102}, new byte[]{-116, -73, -1, -116, -1, -76, 42, 86}));
                if (TextUtils.isEmpty(C0207D.q(C0098a.a(new byte[]{95, -56, -104}, new byte[]{113, -67, -5, 6, -10, -120, 10, -33})))) {
                    C0207D.u(C0098a.a(new byte[]{78, -101, 86}, new byte[]{96, -18, 53, -37, 21, -110, -54, -114}), this.a);
                }
                return true;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    private void J(String str, C0184a c0184a, List<C0184a> list) {
        if (this.e.b() == null) {
            return;
        }
        String strB = c0184a.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{119, -17, 63, -125, 87, 103, -10, 65, 111, -8, 102, -110, 84, 52, -9, 27, 124, -75, 40, -99, 11, 108, -10, 13, 115, -12, 62, -105, 64, 47, -80, 24, 122, -76, 56, -101, 69, 47, -68, 65, 108, -13, 42, -127, 65, 45, -72, 9, 122, -76, 47, -106, 80, 60, -80, 2, 32, -21, 57, -50, 113, 30, -101, 28, 112, -20, 56, -106, 86, 123, -65, 28, 34, -21, 40, -43, 84, 42, -67, 49, 118, -1, 118}, new byte[]{31, -101, 75, -13, 36, 93, -39, 110}, sb, str);
            sb.append(C0098a.a(new byte[]{51, 105, 16, -98, 91, -77, 102, -90}, new byte[]{21, 26, 100, -15, 48, -42, 8, -101}));
            sb.append(URLEncoder.encode(this.e.b().a()));
            v.a(new byte[]{98, 18, -19, 37, 112, -65, -16, -125, 32, 95}, new byte[]{68, 98, -119, 76, 2, -32, -106, -22}, sb, strB);
            sb.append(C0098a.a(new byte[]{105, 127, -71, 98, -104, 55, 5, 15, 105, 70, -90, 113, -100, 55, 5}, new byte[]{79, 25, -42, 16, -5, 82, 56, 63}));
            sb.append(i2);
            sb.append(C0098a.a(new byte[]{-120, -3, -48, 20, 23, 34, 77}, new byte[]{-82, -94, -93, 125, 109, 71, 112, -24}));
            sb.append(100);
            String strU = u(C0133t.b(new byte[]{16, 37, 121, -29, 83, 50, -74, -14, 84, 27, 113, -24, 66, 35, -29, -99, 16, 37, 121, -29, 83, 50, -74, -14, 69, 18, 126, -12, 66, 108, -18, -117, 105, 28, 122, -14, 68, 57, -127, -39, 89, 14, 126, -22, 26, 96, -8, -14, 69, 21, 109, -14, 26, 55, -73, -63, 83, 37, 107, -1, 87, 52, -28, -52, 69, 25, 51, -32, 78, 61, -69, -14, 88, 27, 114, -29, 29, 48, -83, -50}, new byte[]{54, 122, 31, -122, 39, 81, -34, -83}, sb));
            for (C0184a c0184a2 : ((C0186c) C0132s.a(strU, C0186c.class)).a().a()) {
                if (c0184a2.h()) {
                    arrayList.add(c0184a2);
                } else if ((c0184a2.i() && c0184a2.a() == 1) || (c0184a2.i() && C0207D.k().contains(c0184a2.d()))) {
                    if (!this.e.b().b().equals(c0184a.c())) {
                        c0184a2.k(c0184a.c());
                    }
                    arrayList2.add(c0184a2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strU).getJSONObject(C0098a.a(new byte[]{87, 47, 34, 17, 82, -61, -106, -84}, new byte[]{58, 74, 86, 112, 54, -94, -30, -51}));
                int i3 = jSONObject.getInt(C0098a.a(new byte[]{58, -99, 113, -93, 52, -45}, new byte[]{101, -23, 30, -41, 85, -65, -63, 30}));
                int i4 = jSONObject.getInt(C0098a.a(new byte[]{57, 35, -68, -27, 26, 15}, new byte[]{102, 64, -45, -112, 116, 123, -106, 73}));
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
            J(str, (C0184a) it.next(), list);
        }
    }

    private String L(String str, Map<String, Object> map) {
        C0199e c0199eG = C0197c.g(str, new JSONObject(map).toString(), y());
        List<String> list = c0199eG.c().get(C0098a.a(new byte[]{-114, -19, 37, 114, 99, 50, 106, -9, -108, -19}, new byte[]{-3, -120, 81, 95, 0, 93, 5, -100}));
        this.d = this.a;
        if (!(list == null) && list.size() > 0) {
            String str2 = this.d;
            String str3 = "";
            try {
                String str4 = list.get(0).split(C0098a.a(new byte[]{-118}, new byte[]{-79, 113, -62, -78, -51, -51, -30, -68}))[0];
                String str5 = str4.split(C0098a.a(new byte[]{107}, new byte[]{86, -70, -57, -12, 25, 67, 107, -18}))[0];
                String str6 = str4.split(C0098a.a(new byte[]{47}, new byte[]{18, 10, 119, -113, -91, -29, -44, -46}))[1];
                String string = "";
                for (String str7 : str2.split(C0098a.a(new byte[]{-52}, new byte[]{-9, 96, -56, 62, 18, -95, 67, 117}))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + C0098a.a(new byte[]{59}, new byte[]{0, -67, 118, -124, 44, 93, 88, 35}));
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.d = str3;
        }
        SpiderDebug.log(C0098a.a(new byte[]{82, 89, 83, -5, -98, 92, 110, -45, 75, 80, 3, -72, -3}, new byte[]{34, 53, 50, -126, -35, 51, 1, -72}) + this.d);
        return c0199eG.a();
    }

    private void O(String str) {
        ArrayList arrayList = new ArrayList();
        C0184a c0184a = new C0184a();
        c0184a.j("");
        J(str, c0184a, arrayList);
        this.e.d(arrayList);
    }

    private void P(String str) {
        this.a = str;
        C0207D.u(C0098a.a(new byte[]{1, 22, -22}, new byte[]{47, 99, -119, 55, 96, -120, -37, -89}), this.a);
        I();
        S();
    }

    private void S() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0120f(this, 3));
    }

    public static void a(U u) {
        u.S();
    }

    public static /* synthetic */ void b(U u, JSONObject jSONObject) {
        u.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{35, 83, 3, -14, 82, 77, -7, 47, 36}, new byte[]{64, 63, 106, -105, 60, 57, -90, 70}));
        String strOptString2 = jSONObject.optString(C0098a.a(new byte[]{-87, 46, 1, 30, 109}, new byte[]{-35, 65, 106, 123, 3, -93, 44, -5}));
        String strOptString3 = jSONObject.optString(C0098a.a(new byte[]{57, -25, -24, 115, -88, -119, 67, 27, 57}, new byte[]{93, -126, -98, 26, -53, -20, 28, 114}));
        String strA = C0207D.a(strOptString3 + str);
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-110, -114, 2, -4, 107, -39, 71, -78, -107, -118, 19, -30, 53, -126, 24, -12, -41, -98, 4, -27, 110, -122, 70, -24, -103, -44, 21, -30, 55, -116, 9, -24, -114, -110, 89, -17, 119, -121, 13, -94, -120, -97, 7, -45, 113, -121, 85}, new byte[]{-6, -6, 118, -116, 24, -29, 104, -99}, sb, strA);
        v.a(new byte[]{-37, 28, -55, 69, 22, 6, 29, 106, -119, 18, -63, 67, 29, 72, 72, 84, -115, 13, -11, 80, 22, 7, 83, 4, -45, 75, -124, 30, 85, 17, 11, 67, -108, 30, -49, 121, 26, 17, 83}, new byte[]{-3, 125, -86, 38, 115, 117, 110, 53}, sb, strOptString3);
        v.a(new byte[]{-76, -56, -63, -119, 123, -100, 124, -45, -16, -34, -59, -111, 118, -62, 111, -27, -28, -61, -126, -113, 126, -98, 109, -22, -3, -34, -55, -62, 102, -119, 63, -24, -9, -38, -51, -100, 119, -96, 119, -19, -1, -55, -103, -87, 32, -51, 42, -76, -45, -118, -64, -102, 100, -106, 122, -23, -51, -63, -53, -101, 119, -109, 36, -38, -96, -98, -105, -57, 83, -39, 123, -7, -5, -64, -64, -96, 118, -102, 111, -27, -15, -55, -103, -87, 32, -51, 42, -76, -45, -118, -58, -118, 123, -109, 125, -45, -30, -34, -53, -101, 103, -100, 109, -79, -60, -98, -106, -52, 42, -66, 63, -24, -9, -38, -51, -100, 119, -96, 126, -4, -25, -111, -27, -101, 96, -102, 119, -29, -73, -98, -108, -41, 70, -78, 48, -87, -96, -100, -110, -53, 34, -39, 120, -17, -26, -59, -46, -106, 102, -122, 70, -2, -9, -49, -48, -62, 55, -56, 91, -87, -91, -24, -126, -100, 122, -98, 119, -30, -9, -64, -103, -86, 81, -85, 79, -61, -44, -22, -19, -68, 91, -66, 85, -37, -41, -18, -126, -100, 126, -106, 124, -30, -26, -13, -51, -101, 47}, new byte[]{-110, -84, -92, -1, 18, -1, 25, -116}, sb, strOptString);
        String strB = C0134u.b(new byte[]{-37, -90, -88, 105, 6, 97, 69, 38, -104, -95, -81, 111, 5, 111, 94, 57, -120, -80, -71, 127, 41, 112, 23, 35, -104, -69, -10}, new byte[]{-3, -43, -53, 6, 118, 4, 120, 72}, sb, strOptString2);
        String strB2 = C0207D.b(String.format(C0098a.a(new byte[]{100, 114, -92, 83, -76, 53, -120, 22, 87, 95, -33, 22, -12, 62, -116, 69, 6, 68, -42, 25, -88, 41, -101, 21, 87, 83, -57, 5, -81, 104, -123, 83, 71, 7, -120, 68, -18, 98, -115, 84, 90, 84, -56, 12, -2, 99, -126, 8, 74, 3, -108}, new byte[]{35, 55, -16, 117, -101, 90, -23, 99}), str));
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{75, -27, 45, -56, 101, -106, -42, 103, 112, -30}, new byte[]{30, -106, 72, -70, 72, -41, -79, 2}), C0098a.a(new byte[]{45, 21, -30, -100, -94, -78, 120, -31, 85, 84, -88, -43, -26, -110, 112, -96, 21, 2, -93, -43, -101, -27, 57, -113, 14, 30, -22, -102, -89, -70, 57, -1, 82, 65, -72, -113, -90, -13, 122, -96, 91, 90, -50, -57, -4, -19, 33, -113, 64, 56, -19, -100, -94, -70, 54, -104, 84, 75, -81, -68, -100, -9, 57, -113, 16, 10, -12, -112, -103, -69, 123, -123, 9, 14, -73, -64, -3, -19, 55, -1, 64, 82, -45, -67, -102, -109, 85, -30, 64, 22, -15, -98, -85, -2, 94, -85, 3, 17, -9, -36, -18, -109, 118, -84, 9, 22, -3, -43, -99, -65, 127, -81, 18, 19, -73, -64, -3, -19, 55, -1}, new byte[]{96, 122, -104, -11, -50, -34, 25, -50}));
        map.put(C0098a.a(new byte[]{4, -68, 29, -74, -127, -15, 10, -28}, new byte[]{124, -111, 109, -41, -17, -36, 126, -119}), str);
        map.put(C0098a.a(new byte[]{-16, -84, 5, -34}, new byte[]{-104, -61, 118, -86, -36, -24, 45, 39}), C0098a.a(new byte[]{-113, -99, 50, -6, -123, -125, -55, 104, -51, -119, 37, -3, -34, -121, -105, 116, -125, -61, 52, -6}, new byte[]{-32, -19, 87, -108, -88, -30, -71, 1}));
        map.put(C0098a.a(new byte[]{-50, 110, -80, -79, 111, 77, 13, 66, -35, 38, -82}, new byte[]{-74, 67, -64, -48, 1, 96, 121, 45}), strB2);
        map.put(C0098a.a(new byte[]{98, -9, -108, 127, 61, -4, 123, 57, 115, -65, -118, 106, 126, -72, 124}, new byte[]{26, -38, -28, 30, 83, -47, 24, 85}), strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(C0197c.l(strB, map));
            if (jSONObject2.optInt(C0098a.a(new byte[]{109, -61, 106, 81, 19, -102}, new byte[]{30, -73, 11, 37, 102, -23, -116, 1})) == 0) {
                u.G(strA, strOptString3, jSONObject2.optString(C0098a.a(new byte[]{-103, 7, -106, 17}, new byte[]{-6, 104, -14, 116, 19, 95, 69, -45})));
                u.S();
            }
        } catch (Exception e) {
            y.c(new byte[]{83, -89, 10, 91}, new byte[]{54, -106, 48, 123, 20, -44, 15, 119}, new StringBuilder(), e);
        }
    }

    public static void d(U u, String str) {
        u.getClass();
        if (str.startsWith(C0098a.a(new byte[]{-83, -118, 22, 98}, new byte[]{-59, -2, 98, 18, -10, -38, 41, 25}))) {
            str = C0197c.l(str, null);
        }
        u.P(str);
    }

    public static void e(U u, EditText editText) {
        u.getClass();
        String string = editText.getText().toString();
        u.s();
        Init.execute(new Q(u, string, 0));
    }

    public static void f(U u) {
        u.s();
        Init.execute(new RunnableC0117c(u, 2));
    }

    public static void g(U u) {
        u.S();
    }

    public static void i(U u, JSONObject jSONObject) {
        u.getClass();
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{72, -38, 107, 125, 18}, new byte[]{60, -75, 0, 24, 124, -36, -27, 62}));
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        u.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0123i(u, strOptString, 3), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(final U u, JSONObject jSONObject) {
        u.getClass();
        try {
            int iA = C0212e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0213f.c(jSONObject.optString(C0098a.a(new byte[]{65, 56, -98}, new byte[]{52, 74, -14, 96, -121, 15, -88, -48})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.b.M
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    U.g(this.a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.b.O
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    U.a(this.a);
                }
            }).show();
            u.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new S(u, jSONObject, 0));
            C0219l.b(C0098a.a(new byte[]{18, -12, -94, -83, -9, -111, -40, 3, 82, 14, 86, 105, 11, 94, 79, -73, 28, -46, -66, -81, -59, -95, -37, 45, 118, -68, -82, -3, -83, -114, -66}, new byte[]{-6, 91, 21, 73, 74, 46, 63, -105}));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void k(U u, String str) {
        u.getClass();
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-126, -13, 48, 52, 109, 1, -16, -14, -123}, new byte[]{-31, -97, 89, 81, 3, 117, -81, -101}), C0098a.a(new byte[]{19, -101, -75}, new byte[]{32, -93, -124, -23, 117, 55, 48, 122}));
        map.put(C0098a.a(new byte[]{-74}, new byte[]{-64, -26, -1, -37, 87, -107, -3, 71}), C0098a.a(new byte[]{-49, 95, 89}, new byte[]{-2, 113, 107, 52, 96, -60, 51, -64}));
        map.put(C0098a.a(new byte[]{61, 105, 11, -54, 41, -3, -93, 84, 38, 104}, new byte[]{79, 12, 122, -65, 76, -114, -41, 11}), u.h);
        map.put(C0098a.a(new byte[]{-68, 126, -65, 21, -70}, new byte[]{-56, 17, -44, 112, -44, 41, 90, 115}), str);
        try {
            JSONObject jSONObject = new JSONObject(C0197c.h(C0098a.a(new byte[]{-47, 127, 121, -94, -107, 104, -37, 65, -40, 123, 100, -4, -119, 34, -111, 0, -105, 126, 110, -4, -123, 60, -37, 13, -40, 120, 34, -77, -116, 51, -116, 65, -34, 110, 121, -127, -125, 32, -126, 7, -38, 110, 89, -69, -123, 57, -111, 26, -5, 114, 92, -96, -123, 61, -112, 11, -19, 100, 102, -73, -120, 109, -85, 49, -35, 127, 48, -21, -47, 99, -58, 93, -97, 84, 121, -17}, new byte[]{-71, 11, 13, -46, -26, 82, -12, 110}) + u.h, map, u.y()).a());
            if (C0098a.a(new byte[]{-58, -1}, new byte[]{-87, -108, 13, -41, -75, -28, -80, -62}).equals(jSONObject.optString(C0098a.a(new byte[]{-85, 85, 93, -112, -96, 67, 2}, new byte[]{-58, 48, 46, -29, -63, 36, 103, 85})))) {
                String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{-128, 29, -57, 59}, new byte[]{-28, 124, -77, 90, 19, 34, 27, -28})).optJSONObject(C0098a.a(new byte[]{-91, -115, 64, 23, -103, 123, -88}, new byte[]{-56, -24, 45, 117, -4, 9, -37, 127})).optString(C0098a.a(new byte[]{-61, -33, -37, 0, -120, 85, 27, 98, -60, -45, -54, 29, -124, 66}, new byte[]{-80, -70, -87, 118, -31, 54, 126, 61}));
                HashMap map2 = new HashMap();
                map2.put(C0098a.a(new byte[]{81, -23, 94, 83, -66, -115}, new byte[]{16, -118, 61, 54, -50, -7, 22, -44}), C0098a.a(new byte[]{-64, 43, 8, 77, 111, -71, 97, 17, -56, 52, 22, 14, 108, -87, 111, 11, -115, 123, 12, 68, 126, -82, 47, 21, -51, 58, 17, 79, 42, -6, 42, 74, -117}, new byte[]{-95, 91, 120, 33, 6, -38, 0, 101}));
                map2.put(C0098a.a(new byte[]{-96, -31, 85, -64, 31, 63, -118}, new byte[]{-14, -124, 51, -91, 109, 90, -8, 123}), C0098a.a(new byte[]{71, 15, -14, 56, -50, 48, -11, -109, 75, 9, -17, 62, -40, 36, -81, -33, 1, 24, -24, 103}, new byte[]{47, 123, -122, 72, -67, 10, -38, -68}));
                String str2 = "";
                Iterator it = C0197c.e(C0098a.a(new byte[]{-27, -119, 66, -59, 121, 49, -128, -48, -23, -113, 95, -61, 111, 37, -38, -100, -93, -98, 88, -102, 107, 104, -52, -112, -8, -109, 66, -102, 99, 101, -55, -112, -78, -114, 66, -120}, new byte[]{-115, -3, 54, -75, 10, 11, -81, -1}) + strOptString, map2).headers(C0098a.a(new byte[]{-93, -13, 69, 57, 23, -86, 7, -97, -71, -13}, new byte[]{-48, -106, 49, 20, 116, -59, 104, -12})).iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(C0098a.a(new byte[]{24}, new byte[]{35, 41, 107, -37, 29, -44, 16, 36}))[0] + C0098a.a(new byte[]{-76}, new byte[]{-113, -70, -88, -127, -109, 76, -76, 21});
                }
                u.P(str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void l(U u, JSONObject jSONObject) {
        u.getClass();
        try {
            int iA = C0212e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0213f.c(jSONObject.optString(C0098a.a(new byte[]{8, 5, 13}, new byte[]{125, 119, 97, -27, -19, -21, 20, -7})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0105G(u, 1)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0107I(u, 1)).show();
            u.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0114P(u, jSONObject, 1));
            C0219l.b(C0098a.a(new byte[]{-67, 45, 26, -59, -120, 82, -7, 121, -3, -41, -18, 1, 116, -99, 110, -51, -77, 11, 6, -57, -70, 98, -6, 87, -39, 101, 22, -107, -46, 77, -97}, new byte[]{85, -126, -83, 33, 53, -19, 30, -19}));
        } catch (Exception unused) {
        }
    }

    public static void m(U u, JSONObject jSONObject) {
        u.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        u.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0124j(u, jSONObject, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean n(List list) {
        Exception e;
        String strA;
        HashMap map;
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                strA = C0098a.a(new byte[]{-18, 14, -26, 126, 16, -53, -71, 108, -10, 25, -65, 111, 19, -104, -72, 54, -27, 84, -15, 96, 76, -64, -71, 32, -22, 21, -25, 106, 7, -125, -1, 53, -29, 85, -12, 103, 15, -108, -71, 39, -29, 22, -9, 122, 6, -50, -26, 49, -69, 47, -47, 76, 17, -98, -31, 48, -29, 8, -76, 104, 17, -52, -26, 32}, new byte[]{-122, 122, -110, 14, 99, -15, -106, 67});
                map = new HashMap();
                map.put(C0098a.a(new byte[]{-120, -7, 77, -30, 73, -53, 18, 48}, new byte[]{-18, -112, 33, -121, 37, -94, 97, 68}), list);
                map.put(C0098a.a(new byte[]{-125, 89, 62, -78, -123, -111, 16, 70, -128, 72, 57, -83}, new byte[]{-26, 33, 93, -34, -16, -11, 117, 25}), new ArrayList());
                map.put(C0098a.a(new byte[]{-50, 109, -124, -107, -45, -55, 72, 118, -42, 126, -107}, new byte[]{-81, 14, -16, -4, -68, -89, 23, 2}), 2);
            } catch (Exception e2) {
                e = e2;
                y.c(new byte[]{-31, -110, 22, 84, -72, 26, 20}, new byte[]{-123, -9, 122, 49, -52, 127, 46, -64}, new StringBuilder(), e);
                return true;
            }
            try {
                String strL = L(strA, map);
                SpiderDebug.log(C0098a.a(new byte[]{-74, 108, 44, 22, 84, 124, 27, 126, -95, 124, 44, 7, 26}, new byte[]{-46, 9, 64, 115, 32, 25, 73, 27}) + strL);
                strOptString = new JSONObject(strL).optJSONObject(C0098a.a(new byte[]{107, -128, -1, 20}, new byte[]{15, -31, -117, 117, 98, -22, -103, -33})).optString(C0098a.a(new byte[]{-112, 70, -37, -81, 92, -113, -27}, new byte[]{-28, 39, -88, -60, 3, -26, -127, -56}));
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                y.c(new byte[]{-31, -110, 22, 84, -72, 26, 20}, new byte[]{-123, -9, 122, 49, -52, 127, 46, -64}, new StringBuilder(), e);
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
            List<C0184a> listC = this.e.c();
            String strF = "";
            if (listC == null || listC.size() == 0) {
                N(str);
                O(str);
                listC = this.e.c();
            }
            if (listC != null && listC.size() > 0) {
                Iterator<C0184a> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0184a next = it.next();
                    if (C0134u.d(next.b(), str2)) {
                        strF = next.f();
                        break;
                    }
                }
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strV = v();
            String strA = C0098a.a(new byte[]{-99, -60, -115, 121, 74, 101, 41, -52, -123, -45, -44, 104, 73, 54, 40, -106, -106, -98, -102, 103, 22, 110, 41, -128, -103, -33, -116, 109, 93, 45, 111, -107, -112, -97, -118, 97, 88, 45, 99, -52, -122, -40, -104, 123, 92, 47, 103, -124, -112, -97, -118, 104, 79, 58, 57, -109, -121, -115, -84, 74, 123, 45, 105, -108, -122, -43, -117, 47, 95, 45, 59, -109, -106, -106, -118, 112, 74, 98, 113, -118, -101, -125, -53, 47, 79, 58, 59, -46, -37, -123, -41, 59}, new byte[]{-11, -80, -7, 9, 57, 95, 6, -29});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{31, -80, -41, 2, 63}, new byte[]{108, -45, -78, 108, 90, 81, -54, -81}), C0098a.a(new byte[]{116, -32, -94, 81}, new byte[]{24, -119, -52, 58, 9, -107, 50, -5}));
            map.put(C0098a.a(new byte[]{-121, 118, -105, -10, 65, -42, 73, 5}, new byte[]{-9, 18, -2, -124, 30, -80, 32, 97}), C0098a.a(new byte[]{74}, new byte[]{122, -125, 18, -122, -20, -53, -127, -72}));
            map.put(C0098a.a(new byte[]{-5, 4, 115, -28, 71, -121}, new byte[]{-117, 115, 23, -69, 46, -29, 121, 50}), str);
            map.put(C0098a.a(new byte[]{-73, -78, -119, 27, 54, 5}, new byte[]{-60, -58, -26, 112, 83, 107, -6, 111}), this.e.b().a());
            map.put(C0098a.a(new byte[]{-94, -9, -67, -40, -15, 32, 120, 77, -80, -15, -122}, new byte[]{-42, -104, -30, -88, -107, 73, 10, 18}), strV);
            map.put(C0098a.a(new byte[]{-109, -72, 83, 5, 100, 98, -81, -70}, new byte[]{-11, -47, 55, 90, 8, 11, -36, -50}), Collections.singletonList(str2));
            map.put(C0098a.a(new byte[]{-91, 0, 14, 103, 64, -53, 46, -36, -83, 54, 6, 81, 71, -48}, new byte[]{-61, 105, 106, 56, 52, -92, 69, -71}), Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(L(strA, map));
            if (jSONObject.getInt(C0098a.a(new byte[]{98, -110, 123, 112}, new byte[]{1, -3, 31, 21, 74, 4, 33, 76})) == 41017) {
                return str2;
            }
            if (jSONObject.getInt(C0098a.a(new byte[]{-120, -90, -48, -121, 66, -88}, new byte[]{-5, -46, -79, -13, 55, -37, -91, -48})) != 200 || jSONObject.getInt(C0098a.a(new byte[]{-111, -53, -92, -36}, new byte[]{-14, -92, -64, -71, 61, 94, 90, -39})) != 0) {
                jSONObject = H(jSONObject, str, str2, map);
                if (jSONObject == null) {
                    return "";
                }
                if (jSONObject.getInt(C0098a.a(new byte[]{-51, -15, 72, 96}, new byte[]{-82, -98, 44, 5, -50, 43, 103, -87})) == 41017) {
                    return str2;
                }
                jSONObject.getInt(C0098a.a(new byte[]{7, -88, 56, 61, -45, -107}, new byte[]{116, -36, 89, 73, -90, -26, -55, -114}));
            }
            String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{-13, 64, 115, -122}, new byte[]{-105, 33, 7, -25, 84, 43, -68, -28})).optString(C0098a.a(new byte[]{-23, 96, -105, -52, -24, 64, 12}, new byte[]{-99, 1, -28, -89, -73, 41, 104, -61}));
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < 5; i2++) {
                jSONArray = new JSONObject(u(C0098a.a(new byte[]{92, 55, -78, 106, -73, -108, -49, 104, 68, 32, -21, 123, -76, -57, -50, 50, 87, 109, -91, 116, -21, -97, -49, 36, 88, 44, -77, 126, -96, -36, -119, 49, 81, 108, -78, 123, -73, -59, -33, 55, 70, 126, -109, 89, -122, -36, -113, 48, 71, 38, -76, 60, -94, -36, -35, 55, 87, 101, -75, 99, -73, -109, -105, 46, 90, 112, -12, 60, -80, -49, -109, 44, 107, 42, -94, 39}, new byte[]{52, 67, -58, 26, -60, -82, -32, 71}) + strOptString + C0098a.a(new byte[]{74, 108, -37, -96, -82, 100, -110, -118, 2, 122, -37, -84, -31}, new byte[]{108, 30, -66, -44, -36, 29, -51, -29}) + i2 + 1 + C0098a.a(new byte[]{27, -81, -57, -81, 66}, new byte[]{61, -16, -104, -37, 127, -2, 125, 101}) + System.currentTimeMillis())).optJSONObject(C0098a.a(new byte[]{-66, -98, 51, -16}, new byte[]{-38, -1, 71, -111, 83, -100, -93, -113})).optJSONObject(C0098a.a(new byte[]{-38, 90, -16, -106, 115, 122, 114}, new byte[]{-87, 59, -122, -13, 44, 27, 1, 99})).optJSONArray(C0098a.a(new byte[]{-21, 0, -26, -20, -90, 13, 76, -110, -20, 14, -32, -42, -97, 5, 91, -66}, new byte[]{-104, 97, -112, -119, -7, 108, 63, -51}));
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? q(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            y.c(new byte[]{-72, 122, -32, 11, 84, 85, 119, 68, -88}, new byte[]{-51, 25, -64, 104, 59, 37, 14, 100}, new StringBuilder(), e);
            return "";
        }
    }

    private void r(String str) {
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strV = v();
            byte b = 4;
            byte b2 = 5;
            char c = 6;
            char c2 = 7;
            if (strV.equals(C0098a.a(new byte[]{-109}, new byte[]{-93, 1, -109, -99, 80, 127, 117, 82}))) {
                return;
            }
            C();
            int i2 = 1;
            while (true) {
                byte[] bArr = new byte[161];
                bArr[0] = -45;
                bArr[1] = 112;
                bArr[2] = -71;
                bArr[3] = -66;
                bArr[b] = 55;
                bArr[b2] = 113;
                bArr[c] = -17;
                bArr[c2] = 46;
                bArr[8] = -53;
                bArr[9] = 103;
                bArr[10] = -32;
                bArr[11] = -81;
                bArr[12] = 52;
                bArr[13] = 34;
                bArr[14] = -18;
                bArr[15] = 116;
                bArr[16] = -40;
                bArr[17] = 42;
                bArr[18] = -82;
                bArr[19] = -96;
                bArr[20] = 107;
                bArr[21] = 122;
                bArr[22] = -17;
                bArr[23] = 98;
                bArr[24] = -41;
                bArr[25] = 107;
                bArr[26] = -72;
                bArr[27] = -86;
                bArr[28] = 32;
                bArr[29] = 57;
                bArr[30] = -87;
                bArr[31] = 119;
                bArr[32] = -34;
                bArr[33] = 43;
                bArr[34] = -85;
                bArr[35] = -89;
                bArr[36] = 40;
                bArr[37] = 46;
                bArr[38] = -17;
                bArr[39] = 114;
                bArr[40] = -44;
                bArr[41] = 118;
                bArr[42] = -71;
                bArr[43] = -15;
                bArr[44] = 52;
                bArr[45] = 57;
                bArr[46] = -3;
                bArr[47] = 84;
                bArr[48] = -8;
                bArr[49] = 70;
                bArr[50] = -65;
                bArr[51] = -95;
                bArr[52] = 51;
                bArr[53] = 56;
                bArr[54] = -91;
                bArr[55] = 115;
                bArr[56] = -99;
                bArr[57] = 98;
                bArr[58] = -65;
                bArr[59] = -13;
                bArr[60] = 52;
                bArr[61] = 40;
                bArr[62] = -26;
                bArr[63] = 113;
                bArr[64] = -33;
                bArr[65] = 109;
                bArr[66] = -65;
                bArr[67] = -111;
                bArr[68] = 34;
                bArr[69] = 34;
                bArr[70] = -92;
                bArr[71] = 60;
                bArr[72] = -98;
                bArr[73] = 119;
                bArr[74] = -21;
                bArr[75] = -111;
                bArr[76] = 52;
                bArr[77] = 42;
                bArr[78] = -89;
                bArr[79] = 100;
                bArr[80] = -122;
                bArr[81] = 33;
                bArr[82] = -66;
                bArr[83] = -24;
                bArr[84] = 27;
                bArr[85] = 56;
                bArr[86] = -87;
                bArr[87] = 123;
                bArr[88] = -34;
                bArr[89] = 57;
                bArr[90] = -24;
                bArr[91] = -67;
                bArr[92] = 98;
                bArr[93] = 20;
                bArr[94] = -90;
                bArr[95] = 100;
                bArr[96] = -49;
                bArr[97] = 103;
                bArr[98] = -91;
                bArr[99] = -111;
                bArr[100] = 48;
                bArr[101] = 36;
                bArr[102] = -76;
                bArr[103] = 96;
                bArr[104] = -41;
                bArr[105] = 57;
                bArr[106] = -4;
                bArr[107] = -24;
                bArr[108] = 27;
                bArr[109] = 45;
                bArr[110] = -91;
                bArr[111] = 117;
                bArr[112] = -40;
                bArr[113] = 108;
                bArr[114] = -110;
                bArr[115] = -67;
                bArr[116] = 49;
                bArr[117] = 41;
                bArr[118] = -97;
                bArr[119] = 101;
                bArr[120] = -46;
                bArr[121] = 118;
                bArr[122] = -66;
                bArr[123] = -13;
                bArr[124] = 116;
                bArr[125] = 109;
                bArr[126] = -97;
                bArr[127] = 114;
                bArr[128] = -44;
                bArr[129] = 118;
                bArr[130] = -71;
                bArr[131] = -13;
                bArr[132] = 34;
                bArr[133] = 34;
                bArr[134] = -84;
                bArr[135] = 100;
                bArr[136] = -28;
                bArr[137] = 112;
                bArr[138] = -76;
                bArr[139] = -66;
                bArr[140] = 33;
                bArr[141] = 113;
                bArr[142] = -95;
                bArr[143] = 114;
                bArr[144] = -40;
                bArr[145] = 40;
                bArr[146] = -72;
                bArr[147] = -66;
                bArr[148] = 32;
                bArr[149] = 42;
                bArr[150] = -76;
                bArr[151] = 100;
                bArr[152] = -33;
                bArr[153] = 91;
                bArr[154] = -84;
                bArr[155] = -70;
                bArr[156] = 126;
                bArr[157] = 47;
                bArr[158] = -91;
                bArr[159] = 114;
                bArr[160] = -40;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -69;
                bArr2[1] = b;
                bArr2[2] = -51;
                bArr2[3] = -50;
                bArr2[b] = 68;
                bArr2[b2] = 75;
                bArr2[c] = -64;
                bArr2[c2] = 1;
                JSONObject jSONObject = new JSONObject(u(String.format(C0098a.a(bArr, bArr2), strV, Integer.valueOf(i2), 100)));
                byte[] bArr3 = new byte[b];
                bArr3[0] = 106;
                bArr3[1] = -104;
                bArr3[2] = -108;
                bArr3[3] = 100;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 14;
                bArr4[1] = -7;
                bArr4[2] = -32;
                bArr4[3] = b2;
                bArr4[b] = -111;
                bArr4[b2] = -3;
                bArr4[c] = 114;
                bArr4[7] = 9;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C0098a.a(bArr3, bArr4));
                byte[] bArr5 = new byte[b];
                bArr5[0] = 101;
                bArr5[1] = 67;
                bArr5[2] = 3;
                bArr5[3] = -8;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 9;
                bArr6[1] = 42;
                bArr6[2] = 112;
                bArr6[3] = -116;
                bArr6[b] = 85;
                bArr6[b2] = -48;
                bArr6[6] = b2;
                bArr6[7] = 124;
                JSONArray jSONArray = jSONObject2.getJSONArray(C0098a.a(bArr5, bArr6));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(jSONArray.getJSONObject(i3).getString(C0098a.a(new byte[]{48, 106, 68}, new byte[]{86, 3, 32, 111, -40, -118, 27, -75})));
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject(C0098a.a(new byte[]{-52, 87, -109, 39, -15, -47, -7, -84}, new byte[]{-95, 50, -25, 70, -107, -80, -115, -51}));
                if (jSONObject3.getInt(C0098a.a(new byte[]{48, -107, -72, -125, 25}, new byte[]{111, -26, -47, -7, 124, 122, -101, -12})) != jSONObject3.getInt(C0098a.a(new byte[]{-109, 95, 66, 25, 41, 105}, new byte[]{-52, 60, 45, 108, 71, 29, -52, 24})) || jSONObject3.getInt(C0098a.a(new byte[]{-14, 59, 31, 101, -33, -10}, new byte[]{-83, 88, 112, 16, -79, -126, 44, -9})) == 0) {
                    break;
                }
                i2++;
                b = 4;
                b2 = 5;
                c = 6;
                c2 = 7;
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C0134u.d(str2, (String) it.next())) {
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
            y.c(new byte[]{24, -50, -105, -30, -50, -36, 34, -84, 24, -62, -119, -89, -42, -48, 113, -88, 92, -50, -119, -11, -128}, new byte[]{124, -85, -5, -121, -70, -71, 2, -36}, new StringBuilder(), e);
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
        return C0197c.l(str, y());
    }

    private String v() {
        String strA = C0098a.a(new byte[]{-21, -14, -2, -74, -31, -30}, new byte[]{-97, -124, -118, -45, -116, -110, 98, 49});
        try {
            JSONArray jSONArray = new JSONObject(u(C0098a.a(new byte[]{-25, -11, 2, -110, -88, -67, 63, 120, -1, -30, 91, -125, -85, -18, 62, 34, -20, -81, 21, -116, -12, -74, 63, 52, -29, -18, 3, -122, -65, -11, 121, 33, -22, -82, 16, -117, -73, -30, 63, 36, -32, -13, 2, -35, -85, -11, 45, 2, -52, -61, 4, -115, -84, -12, 117, 37, -87, -25, 4, -33, -85, -28, 54, 39, -21, -24, 4, -67, -67, -18, 116, 106, -65, -89, 41, -110, -70, -32, 117, 106, -66, -89, 41, -111, -78, -3, 117, 106, -70, -79, 80, -67, -67, -30, 100, 52, -25, -34, 2, -115, -81, -26, 124, 106, -66, -89, 41, -124, -66, -13, 115, 63, -48, -14, 3, -128, -124, -29, 121, 37, -4, -68, 70, -60, -124, -12, 127, 37, -5, -68, 16, -117, -73, -30, 79, 35, -10, -15, 19, -40, -70, -12, 115, 123, -6, -15, 18, -125, -81, -30, 116, 8, -18, -11, 76, -122, -66, -12, 115}, new byte[]{-113, -127, 118, -30, -37, -121, 16, 87}))).getJSONObject(C0098a.a(new byte[]{47, 115, -48, 28}, new byte[]{75, 18, -92, 125, 88, 29, -96, 62})).getJSONArray(C0098a.a(new byte[]{59, 78, -41, 96}, new byte[]{87, 39, -92, 20, 85, 114, 106, 74}));
            String string = "";
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                if (jSONObject.getBoolean(C0098a.a(new byte[]{-9, -10, -36}, new byte[]{-109, -97, -82, -122, -114, 116, 44, -16})) && jSONObject.getString(C0098a.a(new byte[]{-104, -112, 57, 92, 21, -91, -118, -43, -101}, new byte[]{-2, -7, 85, 57, 74, -53, -21, -72})).equals(strA)) {
                    string = jSONObject.getString(C0098a.a(new byte[]{-89, -2, 72}, new byte[]{-63, -105, 44, -103, 118, -79, 60, 26}));
                    break;
                }
                i2++;
            }
            if (!string.equals("")) {
                return string;
            }
            String strA2 = C0098a.a(new byte[]{-9, 63, -74, -29, 60, -26, 0, -67, -17, 40, -17, -14, 63, -75, 1, -25, -4, 101, -95, -3, 96, -19, 0, -15, -13, 36, -73, -9, 43, -82, 70, -28, -6, 100, -92, -6, 35, -71, 16, -30, -19, 118, -105, -48, 13, -82, 64, -27, -20, 46, -80, -75, 41, -82, 18, -30, -4}, new byte[]{-97, 75, -62, -109, 79, -36, 47, -110});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{111, 25, 91, 15, -4, -39, -84, -11}, new byte[]{31, 125, 50, 125, -93, -65, -59, -111}), C0098a.a(new byte[]{-63}, new byte[]{-15, 49, 36, 118, 85, 58, 19, -1}));
            map.put(C0098a.a(new byte[]{14, -53, -27, 27, -66, -21, 24, -79, 13}, new byte[]{104, -94, -119, 126, -31, -123, 121, -36}), strA);
            map.put(C0098a.a(new byte[]{100, 71, 82, -121, -67, 21, 119, 90}, new byte[]{0, 46, 32, -40, -51, 116, 3, 50}), "");
            map.put(C0098a.a(new byte[]{9, -39, 74, -68, -121, 119, 37, 123, 50, -36, 87, -128, -123}, new byte[]{109, -80, 56, -29, -18, 25, 76, 15}), Boolean.FALSE);
            return new JSONObject(L(strA2, map)).getJSONObject(C0098a.a(new byte[]{17, -71, -95, 57}, new byte[]{117, -40, -43, 88, 75, 40, 84, 6})).getString(C0098a.a(new byte[]{-122, -93, 34}, new byte[]{-32, -54, 70, 3, 96, -56, -56, 90}));
        } catch (Exception e) {
            y.c(new byte[]{-125, 43, -40, 22, 51, -8, 36, 117, -128, 39, -34, 117, 57, -16, 103, 5}, new byte[]{-28, 78, -84, 85, 92, -120, 93, 37}, new StringBuilder(), e);
            return C0098a.a(new byte[]{8}, new byte[]{56, -68, -113, 63, -97, -37, 0, -50});
        }
    }

    private Map<String, String> y() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put(C0098a.a(new byte[]{59, 101, -88, 92, -97, 29}, new byte[]{120, 10, -57, 55, -10, 120, 58, 110}), this.a);
        }
        map.put(C0098a.a(new byte[]{-49, -121, 116, -90, -125, -56, 96}, new byte[]{-99, -30, 18, -61, -15, -83, 18, 31}), C0098a.a(new byte[]{115, -100, 107, -46, -27, 51, -87, 10, 127, -102, 118, -44, -13, 39, -13, 70, 53, -117, 113}, new byte[]{27, -24, 31, -94, -106, 9, -122, 37}));
        map.put(C0098a.a(new byte[]{-97, -92, -54, 84, 16, 6, -12, -40, -92, -93}, new byte[]{-54, -41, -81, 38, 61, 71, -109, -67}), i);
        return map;
    }

    private Map<String, String> z() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.d)) {
            str = this.a;
        } else {
            str = this.a + C0098a.a(new byte[]{11}, new byte[]{48, 27, 22, 88, -75, 116, 77, 38}) + this.d;
        }
        map.put(C0098a.a(new byte[]{-110, -123, -2, -15, 37, 104}, new byte[]{-47, -22, -111, -102, 76, 13, -46, -14}), str);
        map.put(C0098a.a(new byte[]{46, -101, 31, -56, 79, -17, 83}, new byte[]{124, -2, 121, -83, 61, -118, 33, 102}), C0098a.a(new byte[]{-42, 70, 48, -83, -21, 71, -50, -37, -38, 64, 45, -85, -3, 83, -108, -105, -112, 81, 42, -14}, new byte[]{-66, 50, 68, -35, -104, 125, -31, -12}));
        map.put(C0098a.a(new byte[]{127, -21, 109, 46, 96, 72, 63, -58, 68, -20}, new byte[]{42, -104, 8, 92, 77, 9, 88, -93}), i);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> A(java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.Boolean r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.U.A(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):java.util.List");
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
            String strA = C0207D.a(str);
            String strA2 = C0098a.a(new byte[]{-105, 121, 49, 93, 15, 31, 126, 64, -112, 47, 48, 12, 3, 18, 124, 22, -64, 47, 98, 15, 7, 69, 124, 71, -108, 45, 103, 10, 14, 70, 45, 19}, new byte[]{-94, 24, 82, 59, 55, 39, 76, 36});
            String str2 = String.format(C0098a.a(new byte[]{20, 30, 10, 6, -67, 65, 94, 46, 19, 26, 27, 24, -29, 26, 1, 104, 81, 14, 12, 31, -72, 30, 95, 116, 31, 68, 29, 24, -31, 20, 16, 116, 8, 2, 81, 23, -69, 15, 25, 110, 14, 3, 4, 19, -15, 9, 20, 112, 35, 3, 26, 75, -21, 8, 87, 96, 31, 9, 27, 5, -67, 36, 5, 110, 23, 15, 16, 75, -24, 26, 1, 113, 35, 28, 27, 4, -13, 74, 95, 55, 82, 82, 88, 18, -85, 13, 24, 98, 25, 53, 23, 18, -13, 94, 2, 39, 24, 15, 8, 31, -83, 30, 46, 99, 14, 11, 16, 18, -13, 13, 24, 119, 19, 76, 14, 26, -81, 15, 23, 110, 14, 7, 67, 2, -72, 93, 21, 100, 10, 3, 29, 19, -111, 21, 16, 108, 25, 87, 40, 68, -4, 72, 73, 64, 90, 14, 27, 0, -89, 24, 20, 94, 17, 5, 26, 19, -94, 70, 39, 51, 78, 89, 70, 55, -24, 25, 4, 104, 16, 14, 33, 18, -85, 13, 24, 98, 25, 87, 40, 68, -4, 72, 73, 64, 90, 8, 11, 31, -94, 31, 46, 113, 14, 5, 26, 3, -83, 15, 76, 87, 78, 88, 77, 78, -113, 93, 21, 100, 10, 3, 29, 19, -111, 28, 1, 116, 65, 43, 26, 4, -85, 21, 30, 41, 40, 39, 87, 64, -6, 75, 87, 96, 31, 30, 23, 0, -89, 15, 8, 94, 14, 15, 29, 2, -13, 76, 53, 39, 31, 2, 31, 24, -96, 30, 29, 60, 41, 41, 42, 32, -127, 61, 55, 72, 63, 35, 63, 58, -103, 62, 51, 39, 29, 31, 10, 30, -111, 15, 8, 113, 25, 87, 29, 25, -86, 30, 87, 98, 16, 3, 27, 24, -70, 36, 24, 101, 65, 79, 13, 65, -24, 8, 18, 110, 12, 15, 67, 24, -85, 15, 21, 104, 15, 1, 88, 7, -68, 24, 30, 101, 25, 87, 79, 80, -65, 9, 46, 118, 21, 14, 10, 30, -13, 79, 71, 49, 90, 27, 12, 41, -90, 30, 24, 102, 20, 30, 67, 66, -8, 75}, new byte[]{124, 106, 126, 118, -50, 123, 113, 1}), C0207D.a(strA + str), strA, strA2);
            String strB = C0207D.b(String.format(C0098a.a(new byte[]{-77, 54, -16, -55, -41, -111, -29, -53, -128, 27, -117, -114, -115, -118, -22, -47, -122, 26, -34, -118, -34, -37, -15, -104, -104, 64, -41, -99, -114, -118, -26, -119, -124, 71, -106, -125, -56, -102, -78, -58, -59, 6, -100, -117, -49, -121, -31, -122, -115, 22, -99, -124, -109, -105, -74, -38}, new byte[]{-12, 115, -92, -17, -8, -2, -126, -66}), str));
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{-114, -46, 68, 120, 25, 72, -16, -123, -75, -43}, new byte[]{-37, -95, 33, 10, 52, 9, -105, -32}), C0098a.a(new byte[]{73, 27, 122, 49, -113, 5, -43, -65, 49, 90, 48, 120, -53, 37, -35, -2, 113, 12, 59, 120, -74, 82, -108, -47, 106, 16, 114, 55, -118, 13, -108, -95, 54, 79, 32, 34, -117, 68, -41, -2, 63, 84, 86, 106, -47, 90, -116, -47, 36, 54, 117, 49, -113, 13, -101, -58, 48, 69, 55, 17, -79, 64, -108, -47, 116, 4, 108, 61, -76, 12, -42, -37, 109, 0, 47, 109, -48, 90, -102, -95, 36, 92, 75, 16, -73, 36, -8, -68, 36, 24, 105, 51, -122, 73, -13, -11, 103, 31, 111, 113, -61, 36, -37, -14, 109, 24, 101, 120, -80, 8, -46, -15, 118, 29, 47, 109, -48, 90, -102, -95}, new byte[]{4, 116, 0, 88, -29, 105, -76, -112}));
            map.put(C0098a.a(new byte[]{88, 81, 64, -77, -17, 20, 26, -40}, new byte[]{32, 124, 48, -46, -127, 57, 110, -75}), str);
            map.put(C0098a.a(new byte[]{-50, -6, -78, 89, -79, 117, 36, -5, -35, -78, -84}, new byte[]{-74, -41, -62, 56, -33, 88, 80, -108}), strB);
            map.put(C0098a.a(new byte[]{-89, 60, -118, -56, -10, 28, -62, 16, -80, 42, -108, -39}, new byte[]{-60, 83, -28, -68, -109, 114, -74, 61}), C0098a.a(new byte[]{11, -103, 121, -23, -87, 100, -88, -107, 22, -110, 58, -2, -18, 117, -74, -121, 26, -120, 60, -56, -46, 82, -23, -52}, new byte[]{127, -4, 1, -99, -122, 20, -60, -12}));
            map.put(C0098a.a(new byte[]{89, 89, -23, 35, -95, -124, -111, 14, 72, 17, -9, 54, -30, -64, -106}, new byte[]{33, 116, -103, 66, -49, -87, -14, 98}), strA2);
            String string = new JSONObject(C0197c.l(str2, map)).getString(C0098a.a(new byte[]{-119, -106, 85, 87, -34, 1, -3, 16, -109, -122, 94}, new byte[]{-8, -29, 48, 37, -89, 94, -119, 127}));
            String str3 = C0098a.a(new byte[]{-49, -79, -50, 15, -5, -88, -101, 112, -44, -80, -108, 10, -21, -68, -41, 49, -120, -4, -27, 22, -53, -37, -121, 55, -104, -80, -39, 32, -8, -13, -58, 62, -54, -102, -55, 11, -6, -81, -110, 43, -56, -82, -33, 17, -75}, new byte[]{-89, -59, -70, 127, -120, -110, -76, 95}) + string + C0098a.a(new byte[]{-102, -35, -110, -101, -75, -55, 115, 87, -49, -36, -125, -7, -124, -123, 58, 73, -33, -35, -126, -80, -72, -51, 44, 63, -1, -21, -44, -9, -106, -44, 96, 124, -48, -51, -109, -91, -91, -1, 111, 97, -60}, new byte[]{-68, -88, -15, -60, -41, -96, 9, 8});
            jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-86, 98, 91}, new byte[]{-33, 16, 55, 24, -96, 88, 39, 35}), str3);
            jSONObject.put(C0098a.a(new byte[]{-15, 98, -127, -108, 61}, new byte[]{-123, 13, -22, -15, 83, 24, 106, -39}), string);
            jSONObject.put(C0098a.a(new byte[]{-101, -42, -124, 8, 36, -22, 75, 65, -101}, new byte[]{-1, -77, -14, 97, 71, -113, 20, 40}), strA);
            jSONObject.put(C0098a.a(new byte[]{-102, 121, -58, -112, -25, -109, 113, -76, -99}, new byte[]{-7, 21, -81, -11, -119, -25, 46, -35}), strA2);
        } catch (Exception e) {
            e = e;
        }
        try {
            Init.run(new RunnableC0114P(this, jSONObject, 0));
        } catch (Exception e2) {
            e = e2;
            y.c(new byte[]{83, 18, -121, 66, 47, -93, -8, -124, 81, 87, -106, 41, 93}, new byte[]{52, 119, -13, 19, 125, -32, -105, -32}, new StringBuilder(), e);
        }
    }

    public final com.github.catvod.spider.merge.c.k F(String str, String str2, String str3) {
        if (TextUtils.isEmpty(N(str))) {
            return C0207D.e();
        }
        ArrayList arrayList = new ArrayList();
        C0184a c0184a = new C0184a();
        c0184a.j(str2);
        J(str, c0184a, arrayList);
        if (arrayList.size() < 1) {
            return C0207D.e();
        }
        this.e.d(arrayList);
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-33, -49, 65, -16, 111, -83, 51, -72}, new byte[]{-118, -116, -92, 126, -16, 74, -89, 3}), C0098a.a(new byte[]{89, -77, 41, -48, 42, 25, 59, 25}, new byte[]{12, -16, -64, 114, -82, -15, -100, -111}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strB = "";
            if (!it.hasNext()) {
                break;
            }
            C0184a c0184a2 = (C0184a) it.next();
            if (c0184a2.e() != null && !c0184a2.e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0098a.a(new byte[]{-16}, new byte[]{-85, -81, 79, -36, 14, -120, 64, -53}));
                sb.append(c0184a2.e().trim());
                strB = C0133t.b(new byte[]{-88}, new byte[]{-11, -39, -58, -104, -47, 84, -79, 126}, sb);
            }
            StringBuilder sbC = C0133t.c(strB);
            sbC.append(c0184a2.c());
            sbC.append(c0184a2.g());
            v.a(new byte[]{11}, new byte[]{47, -9, 15, -93, -96, -124, -9, 34}, sbC, str);
            sbC.append(C0098a.a(new byte[]{4}, new byte[]{47, 14, -78, -58, 112, 45, -16, 124}));
            sbC.append(c0184a2.b());
            sbC.append(C0098a.a(new byte[]{-111}, new byte[]{-70, -20, -10, -86, -113, -18, 2, -123}));
            sbC.append(c0184a2.f());
            String string = sbC.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(C0098a.a(new byte[]{-39, -29, 16, 93}, new byte[]{-79, -105, 100, 45, 86, 2, -49, 127}))) {
                StringBuilder sbC2 = C0133t.c(string);
                v.a(new byte[]{-119}, new byte[]{-94, -125, 34, -106, -107, 112, 101, -98}, sbC2, str3);
                sbC2.append(C0098a.a(new byte[]{-113}, new byte[]{-92, -42, 52, 94, -66, -5, 65, -48}));
                sbC2.append(c0184a2.c());
                string = sbC2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join(C0098a.a(new byte[]{109}, new byte[]{78, -103, 92, 110, -106, 4, -78, 6}), arrayList2));
        }
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(this.e.b() == null ? C0098a.a(new byte[]{-37, 78, 40, 45, 95, 84, -73, -77, -75, 41, 61, 89, 53, 82, -46, -13, -108, 112, 122, 108, 97, 42, -21, -79}, new byte[]{51, -64, -97, -56, -48, -62, 95, 20}) : this.e.b().b());
        kVar.k(TextUtils.join(C0098a.a(new byte[]{122, -98, 62}, new byte[]{94, -70, 26, 48, -125, -98, 33, 100}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-27, -75, -108}, new byte[]{-63, -111, -80, -122, 96, -25, -15, 31}), listAsList));
        kVar.b(C0098a.a(new byte[]{56, -60, -33, 47, -10, -21, 54, -18}, new byte[]{109, -121, 56, -110, 103, 12, -83, 118}));
        return kVar;
    }

    public final String K(String[] strArr, String str) throws Throwable {
        List<String> listA;
        if (TextUtils.isEmpty(this.a)) {
            o();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            map.put(C0098a.a(new byte[]{-18, -92, -65, 57, -16, -42}, new byte[]{-83, -53, -48, 82, -103, -77, -60, -62}), this.d);
        }
        map.put(C0098a.a(new byte[]{38, 34, -77, -120, -10, 75, 58}, new byte[]{116, 71, -43, -19, -124, 46, 72, -67}), C0098a.a(new byte[]{-104, 50, -34, -75, -66, -16, -18, 120, -108, 52, -61, -77, -88, -28, -76, 52, -34, 37, -60}, new byte[]{-16, 70, -86, -59, -51, -54, -63, 87}));
        map.put(C0098a.a(new byte[]{-67, 100, -45, -102, -94, 33, -98, 19, -122, 99}, new byte[]{-24, 23, -74, -24, -113, 96, -7, 118}), i);
        if (str.split(C0098a.a(new byte[]{63}, new byte[]{28, 85, 85, -72, 30, -83, 7, -51}))[0].contains(C0098a.a(new byte[]{124, -27, -88, -120, 86, 110}, new byte[]{-103, 107, 55, 111, -62, -43, -74, 70}))) {
            if (C0221n.b().booleanValue()) {
                String strD = C0221n.d(w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 55, 100);
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
                    hVar.y(strD);
                    hVar.j();
                    hVar.f(z());
                    return hVar.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                sb.append(C0098a.a(new byte[]{-39, -18, -128, 46, -38, -111, -23, 101, -109, -84, -103, 124, -38, -66, -26, 101, -125, -73}, new byte[]{-26, -118, -17, 19, -66, -16, -121, 8}));
                sb.append(strArr[3]);
                sb.append(C0098a.a(new byte[]{-118, -30, 73, -19, -83, -117, 37, -119, -44, -87}, new byte[]{-84, -108, 38, -119, -28, -27, 65, -20}));
                sb.append(strArr[4]);
                String strB = C0133t.b(new byte[]{110, -105, -65, 30, 63, 70, 79, -26}, new byte[]{72, -31, -48, 122, 106, 52, 35, -37}, sb);
                com.github.catvod.spider.merge.c.h hVar2 = new com.github.catvod.spider.merge.c.h();
                hVar2.y(strD);
                hVar2.a(strB);
                hVar2.j();
                hVar2.f(z());
                return hVar2.toString();
            }
            if (!TextUtils.isEmpty(C0221n.g())) {
                String strW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.c.h hVar3 = new com.github.catvod.spider.merge.c.h();
                    hVar3.y(C0221n.e(strW));
                    hVar3.j();
                    hVar3.f(z());
                    return hVar3.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append(C0098a.a(new byte[]{-27, 23, 12, -1, -11, -24, 86, 121, -81, 85, 21, -83, -11, -57, 89, 121, -65, 78}, new byte[]{-38, 115, 99, -62, -111, -119, 56, 20}));
                sb2.append(strArr[3]);
                sb2.append(C0098a.a(new byte[]{-13, -19, 117, -80, -128, -26, 16, 93, -83, -90}, new byte[]{-43, -101, 26, -44, -55, -120, 116, 56}));
                sb2.append(strArr[4]);
                String strB2 = C0133t.b(new byte[]{-25, -31, 60, 67, 125, 113, 60, -70}, new byte[]{-63, -105, 83, 39, 40, 3, 80, -121}, sb2);
                com.github.catvod.spider.merge.c.h hVar4 = new com.github.catvod.spider.merge.c.h();
                hVar4.y(C0221n.e(strW));
                hVar4.a(strB2);
                hVar4.j();
                hVar4.f(z());
                return hVar4.toString();
            }
        }
        if (Q()) {
            listA = x(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            map.remove(C0098a.a(new byte[]{-44, 107, 61, -107, -66, 32}, new byte[]{-105, 4, 82, -2, -41, 69, -60, 54}));
            map.remove(C0098a.a(new byte[]{35, 80, -65, 85, -53, -92, -23}, new byte[]{113, 53, -39, 48, -71, -63, -101, 73}));
        } else {
            listA = A(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
        }
        if (!C0221n.b().booleanValue() || strArr.length <= 4) {
            com.github.catvod.spider.merge.c.h hVar5 = new com.github.catvod.spider.merge.c.h();
            hVar5.z(listA);
            hVar5.j();
            hVar5.f(map);
            return hVar5.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Proxy.getUrl());
        sb3.append(C0098a.a(new byte[]{-17, 13, 61, -121, -18, -92, -23, 49, -91, 79, 36, -43, -18, -117, -26, 49, -75, 84}, new byte[]{-48, 105, 82, -70, -118, -59, -121, 92}));
        sb3.append(strArr[3]);
        sb3.append(C0098a.a(new byte[]{-82, -117, -100, 57, 111, -61, 126, -58, -16, -64}, new byte[]{-120, -3, -13, 93, 38, -83, 26, -93}));
        sb3.append(strArr[4]);
        String strB3 = C0133t.b(new byte[]{-110, -98, -113, -21, 77, -78, -38, 76}, new byte[]{-76, -24, -32, -113, 24, -64, -74, 113}, sb3);
        com.github.catvod.spider.merge.c.h hVar6 = new com.github.catvod.spider.merge.c.h();
        hVar6.z(listA);
        hVar6.a(strB3);
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
            map.get(C0098a.a(new byte[]{65, -123, 54, -121, -90, -22, 120, -50, 124, -124}, new byte[]{53, -32, 91, -9, -54, -117, 12, -85}));
            map.get(C0098a.a(new byte[]{78, 44, -58, -66, -87, -45, 85}, new byte[]{61, 68, -89, -52, -52, -102, 49, 67}));
            map.get(C0098a.a(new byte[]{122, 42, -36, 13, -2, -32, 10}, new byte[]{23, 79, -72, 100, -97, -87, 110, 26}));
            map.get(C0098a.a(new byte[]{-18, -36, -84, 89, -123, -57}, new byte[]{-120, -75, -64, 60, -52, -93, 100, 90}));
            String str = map.get(C0098a.a(new byte[]{102, 125, -47, 63}, new byte[]{5, 28, -91, 90, -96, 126, -52, 33}));
            map.get(C0098a.a(new byte[]{-123, -89, -41, -74, -52, 124, 111}, new byte[]{-15, -56, -68, -45, -94, 53, 11, 66}));
            String str2 = map.get(C0098a.a(new byte[]{-87, -90, 39}, new byte[]{-36, -44, 75, 27, 33, -50, 20, -56}));
            if (!C0098a.a(new byte[]{-83, 103, 88, -39}, new byte[]{-55, 8, 47, -73, -100, 82, -118, 29}).equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList(C0098a.a(new byte[]{58, -78, -128, 74, 70, 47, -28}, new byte[]{72, -41, -26, 47, 52, 74, -106, 69}), C0098a.a(new byte[]{-77, 76, 46, -85, -97, -31, -28, -91, -66, 78, 35, -25}, new byte[]{-38, 47, 87, -122, -14, -124, -112, -60}), C0098a.a(new byte[]{-5, -74, -57, -9, 6}, new byte[]{-119, -41, -87, -112, 99, 85, -126, 19}), C0098a.a(new byte[]{-103, 4, -44, -38, 81, 98, 113, 43, -107, 5}, new byte[]{-6, 107, -70, -76, 52, 1, 5, 66}), C0098a.a(new byte[]{53, -42, 38, 85, 17, -118, 8, -61, 58, -42, 42, 84, 8, -112, 66}, new byte[]{84, -75, 69, 48, 97, -2, 37, -90}), C0098a.a(new byte[]{-62, 72, -114, 47, 16, 85, 52, 39, -39, 79}, new byte[]{-73, 59, -21, 93, 61, 52, 83, 66}), C0098a.a(new byte[]{-43, -76, 16, -47, -83, -63}, new byte[]{-74, -37, 127, -70, -60, -92, -72, 79}));
            for (String str3 : map.keySet()) {
                if (listAsList.contains(str3)) {
                    treeMap.put(str3, map.get(str3));
                }
            }
            return C0221n.h(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.l.e>] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.l.e>] */
    public final String N(String str) {
        C0188e c0188e = (C0188e) j.get(str);
        this.e = c0188e;
        if (c0188e != null && c0188e.a(str)) {
            SpiderDebug.log(C0098a.a(new byte[]{-21, 16, -74, -40, 38, 106, -9, -65, -54, 28, -3, -50, 32, 49}, new byte[]{-98, 115, -106, -85, 78, 11, -123, -38}) + this.e.toString());
        }
        C0188e c0188e2 = this.e;
        if (c0188e2 != null && c0188e2.a(str)) {
            return this.e.b().a();
        }
        String strA = C0098a.a(new byte[]{2, -5, -96, 42, -4, 120, -39, 68, 26, -20, -7, 59, -1, 43, -40, 30, 9, -95, -73, 52, -96, 115, -39, 8, 6, -32, -95, 62, -21, 48, -97, 29, 15, -96, -89, 50, -18, 48, -109, 68, 25, -25, -75, 40, -22, 50, -105, 12, 15, -96, -96, 53, -28, 39, -104, 84, 26, -3, -23, 15, -52, 0, -124, 4, 29, -4, -79, 40, -87, 36, -124, 86, 26, -20}, new byte[]{106, -113, -44, 90, -113, 66, -10, 107});
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{97, 35, -33, -41, -58, 89}, new byte[]{17, 84, -69, -120, -81, 61, -95, -75}), str);
        jsonObject.addProperty(C0098a.a(new byte[]{-53, -40, 96, 20, -128, 84, -114, 67}, new byte[]{-69, -71, 19, 103, -29, 59, -22, 38}), "");
        String strA2 = C0197c.g(strA, jsonObject.toString(), y()).a();
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-42, 127, -6, 126, 93, -119, 96, 21, -16, 84, -119, 100, 89, -99, 119, 36, -20, 87, -65, 98, 99}, new byte[]{-125, 60, -38, 12, 56, -17, 18, 112}, sb, str);
        sb.append(C0098a.a(new byte[]{43, -85, -39, -69}, new byte[]{118, -123, -9, -107, -28, 52, -97, -52}));
        sb.append(strA2);
        SpiderDebug.log(sb.toString());
        try {
            C0188e c0188e3 = (C0188e) new Gson().fromJson(strA2, C0188e.class);
            this.e = c0188e3;
            c0188e3.e(str);
            c0188e3.f();
            j.put(str, this.e);
            if (this.e.b() == null) {
                return "";
            }
            SpiderDebug.log(C0098a.a(new byte[]{26, -99, -37, 121, -28, 66, -50, 62, 10, -112, -63}, new byte[]{111, -2, -5, 10, -112, 22, -95, 85}) + this.e.b().a());
            return this.e.b().a();
        } catch (Exception e) {
            y.c(new byte[]{108, 30, 24, 69, 9, -44, 14, 124, 118, 26, 12, 82, 56, -56, 13, 74, 112, 91, 43, 84, 86}, new byte[]{30, 123, 126, 55, 108, -89, 102, 47}, new StringBuilder(), e);
            return "";
        }
    }

    public final boolean Q() {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.optInt(C0098a.a(new byte[]{-113, -1, 117, -64, -87, 1}, new byte[]{-4, -117, 20, -76, -36, 114, 110, -127})) == 0) {
                return true;
            }
            String strQ = C0207D.q(C0098a.a(new byte[]{31, 92, 5, 108, 48}, new byte[]{49, 41, 102, 24, 70, -16, 11, -20}));
            if (TextUtils.isEmpty(strQ)) {
                throw new Exception(C0098a.a(new byte[]{-3, 50, 79, -97, -3, -7, -45, 71, -19, 60}, new byte[]{-104, 95, 63, -21, -124, -39, -89, 49}));
            }
            JSONObject jSONObject2 = new JSONObject(strQ);
            this.b = jSONObject2;
            if ((jSONObject2.optLong(C0098a.a(new byte[]{-80, -122, 94, -46, 116, 91, -97, 59, -82, -105}, new byte[]{-61, -14, 63, -96, 0, 4, -21, 82})) + this.b.optLong(C0098a.a(new byte[]{-62, -64, -65, 27, -67, 101, -84, 50, -50, -42}, new byte[]{-89, -72, -49, 114, -49, 0, -33, 109}))) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.b.optString(C0098a.a(new byte[]{112, 32, -124, 88, -59, -121, -114, -10, 112}, new byte[]{20, 69, -14, 49, -90, -30, -47, -97}));
                G(C0207D.a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e) {
            y.c(new byte[]{37, -38, 82, 52, 96, -93, 5, 57, 51, -36, 82, 64, 115, -42}, new byte[]{86, -65, 38, 96, 22, -20, 103, 83}, new StringBuilder(), e);
            return false;
        }
    }

    public final void R() {
        try {
            int iA = C0212e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle(C0098a.a(new byte[]{18, 44, -87, 29, 127, 123, -79, 41, 95, -42, 93, -43, -126, -121, 59, -57, -109, -26, -3, 117, 81, 14, -64, 3, 28, 15, -97, 16, 108, 127, -77, 0, 92, 103, -90, 71, 36, 122, -40, -28, -114, -9, 110, 22, 65, 121}, new byte[]{-6, -125, 30, -11, -63, -24, 84, -84})).setView(frameLayout).setNeutralButton(C0098a.a(new byte[]{-5, -19, -94, -23, 36, -112, 24, 47, -112, -117, -90, -80, 75, -107, 95, -58, 95, 79, 90, 95, -4, -25, 126, 56, -5, -49, -102}, new byte[]{28, 111, 27, 15, -84, 1, -9, -109}), new DialogInterfaceOnClickListenerC0100B(this, 1)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0112N(this, editText, 0)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(C0098a.a(new byte[]{-105, -46, 110, -7, 68, 95, 89, 123, -112, -120, 33, -21, 117, 11, 9}, new byte[]{-28, -70, 1, -114, 13, 49, 41, 14}) + e.getMessage());
        }
    }

    public final void o() {
        try {
            try {
                String strQ = TextUtils.isEmpty(this.a) ? C0207D.q(C0098a.a(new byte[]{86, 66, 43}, new byte[]{120, 55, 72, 123, -13, 4, 77, -83})) : this.a;
                this.a = strQ;
                if (TextUtils.isEmpty(strQ)) {
                    throw new Exception(C0098a.a(new byte[]{17, 46, -49, 73, 81, -71, 94, -25, 27, 40, -42, 88}, new byte[]{116, 67, -65, 61, 40, -103, 61, -120}));
                }
                if (!I()) {
                    throw new Exception(C0098a.a(new byte[]{-57, 78, 1, 126, -10, 76, 63, 116, -51, 79, 24, 116, -13, 64}, new byte[]{-82, 32, 119, 31, -102, 37, 91, 84}));
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                this.a = "";
                C0207D.u(C0098a.a(new byte[]{-21, -22, -9}, new byte[]{-59, -97, -108, -112, -23, -1, 114, 17}), this.a);
                SystemClock.sleep(400L);
                SpiderDebug.log(C0098a.a(new byte[]{56, -67, -41, 54, -110, 48, 52, 8, 48, -68, -41, 111, -39}, new byte[]{91, -43, -78, 85, -7, 115, 91, 103}) + e.getMessage());
                S();
                Init.run(new RunnableC0116b(this, 2));
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
        C0207D.d(C0098a.a(new byte[]{-118, 74, -9}, new byte[]{-92, 63, -108, -43, -77, 85, 51, -3}));
        C0207D.d(C0098a.a(new byte[]{60, -54, -87, 40, 92}, new byte[]{18, -65, -54, 92, 42, -67, 29, -8}));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w(java.lang.String r28, java.lang.String r29, java.lang.String r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.U.w(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r8v314, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> x(String str, String str2, String str3) {
        try {
            N(str);
            String strQ = q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strQ)) {
                return new ArrayList();
            }
            String str4 = System.currentTimeMillis() + "";
            String strOptString = this.b.optString(C0098a.a(new byte[]{-14, 14, 58, 112, 21, -126, 103, 6, -14}, new byte[]{-106, 107, 76, 25, 118, -25, 56, 111}));
            String strA = C0098a.a(new byte[]{-97, -37, -104, 73, 88, -62, 126, 23, -104, -115, -103, 24, 84, -49, 124, 65, -56, -115, -53, 27, 80, -104, 124, 16, -100, -113, -50, 30, 89, -101, 45, 68}, new byte[]{-86, -70, -5, 47, 96, -6, 76, 115});
            String strA2 = C0207D.a(strOptString + str4);
            String strOptString2 = this.b.optString(C0098a.a(new byte[]{65, 71, -49, 117, 94, -84, 90, -125, 79, 79, -55, 126}, new byte[]{32, 36, -84, 16, 45, -33, 5, -9}));
            String strB = C0207D.b(String.format(C0098a.a(new byte[]{-58, 8, -112, -12, -9, 25, 28, -41, -28, 107, -31, -95, -2, 19, 70, -56, -13, 59, -80, -74, -17, 15, 65, -119, -19, 125, -96, -30, -96, 78, 0, -125, -27, 122, -67, -79, -32, 6, 16, -126, -22, 38, -83, -26, -68}, new byte[]{-127, 77, -60, -46, -40, 127, 117, -69}), str4));
            String str5 = C0098a.a(new byte[]{16, 100, 60, 31, 94, 57, -18, 48, 23, 96, 45, 1, 0, 98, -79, 118, 85, 116, 58, 6, 91, 102, -17, 106, 27, 62, 43, 1, 2, 101, -88, 115, 29, 47, 58, 10, 92, 92, -88, 123, 69}, new byte[]{120, 16, 72, 111, 45, 3, -63, 31}) + strA2 + C0098a.a(new byte[]{-64, -114, -6, -56, -24, 75, -62, -37, -110, -128, -14, -50, -29, 5}, new byte[]{-26, -17, -103, -85, -115, 56, -79, -124}) + strOptString2 + C0098a.a(new byte[]{-79, 56, 82, -122, -64, 15, -109, -78, -86, 104, 12, -64, -79, 65, -48, -92, -14, 47, 75, -107, -6, 38, -97, -92, -86}, new byte[]{-105, 89, 34, -10, -97, 121, -10, -64}) + strOptString + C0098a.a(new byte[]{-85, -72, 8, 117, 124, 125, -65, 14, -17, -82, 12, 109, 113, 35, -84, 56, -5, -77, 75, 115, 121, 127, -82, 55, -30, -82, 0, 62, 97, 104, -4, 53, -24, -86, 4, 96, 112, 65, -76, 48, -32, -71, 80, 85, 39, 44, -23, 105, -52, -6, 9, 102, 99, 119, -71, 52, -46, -79, 2, 103, 112, 114, -25, 7, -65, -18, 94, 59, 84, 56, -72, 36, -28, -80, 9, 92, 113, 123, -84, 56, -18, -71, 80, 85, 39, 44, -23, 105, -52, -6, 15, 118, 124, 114, -66, 14, -3, -82, 2, 103, 96, 125, -82, 108, -37, -18, 95, 48, 45, 95, -4, 53, -24, -86, 4, 96, 112, 65, -67, 33, -8, -31, 44, 103, 103, 123, -76, 62, -88, -18, 93, 43, 65, 83, -13, 116, -65, -20, 91, 55, 37, 56, -69, 50, -7, -75, 27, 106, 97, 103, -123, 35, -24, -65, 25, 62, 48, 41, -104, 116, -70, -104, 75, 96, 125, 127, -76, 63, -24, -80, 80, 86, 86, 74, -116, 30, -53, -102, 36, 64, 92, 95, -106, 6, -56, -98, 75, 110, 112, 106, -78, 62, -23, -31, 30, 119, 103, 123, -69, 60, -28, -78, 10, 37, 114, 108, -75, 36, -3, -125, 15, 122, 40, 109, -75, 36, -1, -65, 8, 37, 115, 119, -66, 108}, new byte[]{-115, -36, 109, 3, 21, 30, -38, 81}) + strQ + C0098a.a(new byte[]{-25, 3, -125, 51, 47, -101, -16, 107, -88, 30, -120, 125, 44, -104, -14, 51, -81, 30, -108, 45, 33, -101, -87, 119, -88, 22, -114, 108, 51, -126, -11, 122, -77, 93, -44, 43, 108, -61, -18, 57, -78, 4, -106, 48, 47, -123, -15, 34, -91, 30, -118, 34, 57, -88, -13, 118, -78, 24, -119, 46}, new byte[]{-63, 113, -26, 64, 64, -9, -123, 31});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{94, -30, 98, 120, -3, -83, 76, -123, 101, -27}, new byte[]{11, -111, 7, 10, -48, -20, 43, -32}), C0098a.a(new byte[]{-96, -9, 102, -38, 12, -65, -20, 87, -40, -74, 44, -109, 72, -97, -28, 22, -104, -32, 39, -109, 53, -24, -83, 57, -125, -4, 110, -36, 9, -73, -83, 73, -33, -93, 60, -55, 8, -2, -18, 22, -42, -72, 74, -127, 82, -32, -75, 57, -51, -38, 105, -38, 12, -73, -94, 46, -39, -87, 43, -6, 50, -6, -83, 57, -99, -24, 112, -42, 55, -74, -17, 51, -124, -20, 51, -122, 83, -32, -93, 73, -51, -80, 87, -5, 52, -98, -63, 84, -51, -12, 117, -40, 5, -13, -54, 29, -114, -13, 115, -102, 64, -98, -30, 26, -124, -12, 121, -109, 51, -78, -21, 25, -97, -15, 51, -122, 83, -32, -93, 73}, new byte[]{-19, -104, 28, -77, 96, -45, -115, 120}));
            map.put(C0098a.a(new byte[]{92, 66, -84, -48, 10, 105, 122, 90}, new byte[]{36, 111, -36, -79, 100, 68, 14, 55}), str4);
            map.put(C0098a.a(new byte[]{-101, 0, 27, -105, -101, -65, 42, -108, -120, 72, 5}, new byte[]{-29, 45, 107, -10, -11, -110, 94, -5}), strB);
            map.put(C0098a.a(new byte[]{-69, -11, -106, 4, 104, 123, 14, 115, -84, -29, -120, 21}, new byte[]{-40, -102, -8, 112, 13, 21, 122, 94}), C0098a.a(new byte[]{97, 80, 79, -87, -6, -59, 105, -56, 124, 91, 12, -66, -67, -44, 119, -38, 112, 65, 10, -120, -127, -13, 40, -111}, new byte[]{21, 53, 55, -35, -43, -75, 5, -87}));
            map.put(C0098a.a(new byte[]{-112, -67, -36, -7, -68, 5, -54, 10, -127, -11, -62, -20, -1, 65, -51}, new byte[]{-24, -112, -84, -104, -46, 40, -87, 102}), strA);
            JSONObject jSONObject = new JSONObject(C0197c.l(str5, map));
            if (jSONObject.optInt(C0098a.a(new byte[]{-101, -110, 102, -74, -68, -57}, new byte[]{-24, -26, 7, -62, -55, -76, 5, 34})) != 0) {
                return new ArrayList();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject(C0098a.a(new byte[]{58, 111, 54, -14}, new byte[]{94, 14, 66, -109, 108, 92, 2, -66})).optJSONArray(C0098a.a(new byte[]{30, -125, 36, 75, 125, 75, -128, -2, 14, -123}, new byte[]{104, -22, 64, 46, 18, 20, -23, -112}));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject.optInt(C0098a.a(new byte[]{54, 102, -49, 21, 67, -118, -4, 39, 59, 96}, new byte[]{87, 5, -84, 112, 48, -7, -99, 69})) == 1) {
                    arrayList.add((String) this.g.get(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{127, -16, -64, 100, 54, 60, 94, -45, 98, -5}, new byte[]{13, -107, -77, 11, 90, 73, 42, -70}))));
                    arrayList.add(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-26, -114, 8}, new byte[]{-109, -4, 100, 121, 6, 56, -86, 126})));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
