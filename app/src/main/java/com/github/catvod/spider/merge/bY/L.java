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
import com.github.catvod.spider.merge.ZrJ;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class L {
    private static final String i = com.github.catvod.spider.merge.XI.f.a(new byte[]{-37, -74, -3, -42, -90, -128, 24, -2, -93, -9, -73, -97, -30, -95, 24, -78, -1, -73, -13, -48, -71, -124, 66, -15, -33, -73, -13, -38, -90, -52, 52, -80, -11, -7, -56, -20, -22, -76, 89, -32, -90, -122, -74, -118, -107, -37, 80, -15, -41, -87, -9, -45, -81, -69, 28, -77, -35, -80, -13, -112, -1, -33, 78, -1, -91, -17, -89, -105, -127, -92, 45, -100, -38, -11, -89, -45, -93, -121, 28, -15, -47, -68, -28, -44, -91, -59, 89, -96, -29, -72, -11, -44, -25, -113, 21, -66, -29, -67, -86, -37, -72, -123, 15, -76, -71, -22, -87, -113, -28, -35, 89, -110, -2, -85, -24, -46, -81, -61, 72, -31, -90, -9, -73, -111, -2, -44, 64, -25, -72, -24, -79, -113, -22, -87, 21, -76, -11, -83, -11, -48, -92, -61, 72, -23, -72, -22, -87, -118, -28, -35, 75, -4, -9, -23, -76, -121, -84, -37, 27, -26, -81, -31, -89, -20, -85, -118, 24, -93, -1, -10, -78, -116, -3, -62, 74, -25, -74, -102, -17, -34, -92, -126, 28, -67, -71, -87, -28, -44, -95, -77, 22, -91, -2, -68, -11, -32, -87, -124}, new byte[]{-106, -39, -121, -65, -54, -20, 121, -47});
    private static Map<String, com.github.catvod.spider.merge.kT.e> j;
    public static final /* synthetic */ int k = 0;
    private String a;
    private ScheduledExecutorService b;
    private String c;
    private com.github.catvod.spider.merge.kT.e d;
    private String e;
    private AlertDialog f;
    private final Map<String, String> g;
    private com.github.catvod.spider.merge.pT.i h;

    L() {
        Init.checkPermission();
        this.e = com.github.catvod.spider.merge.nU.c.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-39, 62, 108, -49, 79, 40, -77, 113, -43, 56, 113, -55, 89, 63, -20, 61, -97, 59, 109, -34, 78, 121, -78, 61, -33, 101, 41, -112, 95, 126, -13, 43, -43, 46, 106, -42, 74, 119, -77, 56, -40, 38, 125}, new byte[]{-79, 74, 24, -65, 60, 18, -100, 94}), u()).a();
        new ArrayList();
        HashMap map = new HashMap();
        this.g = map;
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73, -83}, new byte[]{-125, -58, 111, -25, -128, -77, 83, 8}), com.github.catvod.spider.merge.XI.f.a(new byte[]{74, -62}, new byte[]{126, -119, 59, 94, -37, 43, -11, 17}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{53, 101}, new byte[]{7, 14, 85, 87, -31, -33, 73, -85}), com.github.catvod.spider.merge.XI.f.a(new byte[]{33, -5}, new byte[]{19, -80, -21, -120, 75, -52, 45, -24}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-46, 49, 24, 95, 20}, new byte[]{-95, 68, 104, 58, 102, 97, 11, -14}), com.github.catvod.spider.merge.XI.f.a(new byte[]{81, 89, 126, 78, 4, -13}, new byte[]{-71, -17, -5, -88, -68, 118, 36, 35}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-89, -25, 7, 14}, new byte[]{-49, -114, 96, 102, 6, 10, -67, -65}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-51, -90, -60, -67, 52, 108}, new byte[]{36, 13, 92, 91, -116, -23, -72, -88}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, 80, -23}, new byte[]{-46, 63, -98, 103, -31, -16, -44, -34}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-63, -92, 105, 3, 54, 41}, new byte[]{39, 17, -24, -28, -93, -84, -12, 114}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{14, 115, -121, 53, -42, -6}, new byte[]{96, 28, -11, 88, -73, -106, 9, -112}), com.github.catvod.spider.merge.XI.f.a(new byte[]{65, 76, 98, -92, -25, -68}, new byte[]{-91, -12, -30, 76, 111, 16, -2, -51}));
        j = new HashMap();
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-99, -99, 23, 100, 1, 125, -6, 2, -20, -95, 24, 127, 30}, new byte[]{-52, -24, 118, 22, 106, 36, -113, 108}));
    }

    private void A() {
        int iIndexOf = this.a.indexOf(com.github.catvod.spider.merge.XI.f.a(new byte[]{-94, -95, 17, -85, 93}, new byte[]{-3, -2, 97, -34, 46, -44, -111, 85}));
        if (iIndexOf != -1) {
            int iIndexOf2 = this.a.indexOf(com.github.catvod.spider.merge.XI.f.a(new byte[]{-15}, new byte[]{-54, -72, -55, 17, 97, 113, 37, 70}), iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = this.a.length();
            }
            this.a = this.a.substring(iIndexOf, iIndexOf2).trim();
        }
    }

    private JSONObject B(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{25, -16, 17, 41}, new byte[]{122, -97, 117, 76, 36, 107, -79, 39})) == 32003) {
                com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-32, 69, 11, 13, -86, -11, 27, 50, -68, 8, 52, 103, -54, -55, 76, 123, -66, 110, 84, 124, -121, -101, 80, 16, 41, -63, 91, 71, -104, -104, 119, 23, -32, 107, 27, 13, -89, -34, 23, 5, -95}, new byte[]{5, -31, -77, -24, 47, 126, -2, -100}));
                return null;
            }
            j = new HashMap();
            if (TextUtils.isEmpty(J(str))) {
                return null;
            }
            K(str);
            String strF = "";
            Iterator<com.github.catvod.spider.merge.kT.a> it = this.d.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.github.catvod.spider.merge.kT.a next = it.next();
                String strB = next.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = next.f();
                    break;
                }
            }
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, -61, 62, -38, -50, -80}, new byte[]{121, -73, 81, -79, -85, -34, -26, 32}), this.d.b().a());
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-11, 126, -5, -19, 78, 47, -29, -92, -3, 72, -13, -37, 73, 52}, new byte[]{-109, 23, -97, -78, 58, 64, -120, -63}), Collections.singletonList(strF));
            return new JSONObject(G(com.github.catvod.spider.merge.XI.f.a(new byte[]{118, -59, -15, -68, 101, 77, 22, -46, 122, -61, -20, -70, 115, 90, 73, -98, 48, -64, -16, -83, 100, 28, 23, -98, 112, -98, -76, -29, 117, 27, 86, -120, 122, -43, -9, -91, 96, 18, 22, -114, 118, -48, -9, -87, 57, 4, 81, -100, 108, -44, -11, -83, 113, 18, 22, -114, 127, -57, -32, -13, 102, 5, 4, -120, 125, -63, -9, -93, 48, 17, 75, -64, 110, -46, -93, -71, 117, 40, 73, -100, 108, -48, -24, -109, 101, 3, 75, -64, 56, -18, -38, -72, 43}, new byte[]{30, -79, -123, -52, 22, 119, 57, -3}) + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean C() {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-81, 15, -20, 77, -124, 53, -26, 76, -93, 9, -15, 75, -110, 34, -71, 0, -23, 10, -19, 92, -123, 100, -25, 0, -87, 84, -87, 18, -108, 99, -90, 22, -93, 31, -22, 84, -127, 106, -26, 14, -94, 22, -6, 88, -123, 48, -71, 17, -6, 14, -5, 77, -123, 96, -17, 5, -75, 70, -24, 94, -47, 122, -86, 60, -73, 26, -22, 92, -102, 80, -70, 23, -75, 70, -66, 91, -110, 123, -86, 11, -104, 8, -19, 95, -124, 108, -69, 10, -91, 30, -91, 73, -123, 122, -84, 69, -104, 24, -16, 0, -97, 96, -92, 6, -31, 29, -3, 73, -108, 103, -106, 10, -93, 30, -10, 73, -98, 123, -80, 94, -77, 9, -19, 88}, new byte[]{-57, 123, -104, 61, -9, 15, -55, 99}), u()));
            if (!com.github.catvod.spider.merge.XI.f.a(new byte[]{-113, -25, 97}, new byte[]{-67, -41, 81, -41, 61, 64, 85, 42}).equals(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{67, 88, 62, -88, 114, -51}, new byte[]{48, 44, 95, -36, 7, -66, 88, -46})))) {
                throw new Exception();
            }
            this.c = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{56, 61, -103, 12}, new byte[]{92, 92, -19, 109, 24, 8, -11, -120})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{8, -19, 112, 61, 105, 119, 42, 33, 28, -8, 120}, new byte[]{101, -120, 29, 95, 12, 5, 117, 85}));
            if (TextUtils.isEmpty(com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{-90, -109, -47, -48, 121, -80}, new byte[]{-120, -30, -92, -79, 11, -37, 86, -90})))) {
                A();
                com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{-57, 51, 8, 4, 85, 53}, new byte[]{-23, 66, 125, 101, 39, 94, -13, -88}), this.a);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.k(com.github.catvod.spider.merge.XI.f.a(new byte[]{30, -128, 99, -27, 65, 82, -38, 78, 3, -101, 103, -69, 67, 29, -108, 19, 29, -38, 116, -5, 29, 11, -108, 18, 89, -107, 125, -12, 74, 71, -110, 4, 2, -89, 114, -25, 68, 1, -106, 4, 34, -99, 116, -2, 87, 28, -73, 24, 39, -122, 116, -6, 86, 13, -95, 14, 29, -111, 121, -86, 81, 4, -100, 4, 24, -128, 72, -4, 86, 85, -64, 82, 68, -46, 97, -88, 3, 70, -57, 71, 2, -101, 124, -16, 92, 85}, new byte[]{118, -12, 23, -107, 50, 104, -11, 97}) + str));
            if (com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -51}, new byte[]{-75, -90, 109, -28, -81, -69, 110, 67}).equals(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -22, -9, 118, 15, 37, 38}, new byte[]{84, -113, -124, 5, 110, 66, 67, -7})))) {
                String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{23, -63, -68, 47}, new byte[]{115, -96, -56, 78, -62, -12, -49, -101})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{67, 34, 38, -58, 97, 48, 118}, new byte[]{46, 71, 75, -92, 4, 66, 5, 3})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{99, -61, -91, -45, 16, 21, 96, 48, 100, -49, -76, -50, 28, 2}, new byte[]{16, -90, -41, -91, 121, 118, 5, 111}));
                HashMap map = new HashMap();
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, 50, -105, -113, 119, -14, 4, -82, -63, 53}, new byte[]{-81, 65, -14, -3, 90, -77, 99, -53}), com.github.catvod.spider.merge.XI.f.a(new byte[]{3, -69, 20, -85, 23, -29, -40, -12, 123, -6, 94, -30, 83, -40, -48, -75, 42, -69, 25, -79, 91, -63, -19, -5, 120, -6, 95, -7, 91, -40, -10, -116, 120, -32, 71, -30, 58, -1, -55, -73, 43, -125, 11, -96, 48, -26, -51, -12, 123, -25, 89, -20, 72, -71, -103, -13, 5, -100, 58, -113, 55, -93, -103, -73, 39, -65, 11, -30, 60, -22, -38, -80, 33, -3, 78, -127, 19, -3, -42, -74, 43, -5, 93, -6, 85, -65, -105, -23, 127, -26, 91, -20, 74, -67, -117, -5, 29, -75, 8, -93, 9, -26, -106, -18, 125, -29, 64, -15, 77, -81, -22, -98, 110, -26, 64, -102, 91, -62, -36, -81, 47, -121, 28, -30, 74, -95, -119}, new byte[]{78, -44, 110, -62, 123, -113, -71, -37}));
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-40, 24, 91, 19, 58, 5}, new byte[]{-103, 123, 56, 118, 74, 113, -96, 34}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-57, 65, -42, 53, -75, 124, -19, 124, -49, 94, -56, 118, -74, 108, -29, 102, -118, 17, -46, 60, -92, 107, -93, 120, -54, 80, -49, 55, -16, 63, -90, 39, -116}, new byte[]{-90, 49, -90, 89, -36, 31, -116, 8}));
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-116, -86, -62, -57, -106, -78, -111}, new byte[]{-34, -49, -92, -94, -28, -41, -29, -82}), com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 109, -84, 14, 16, -1, 13, -56, 125, 120, -74, 80, 18, -80, 67, -107, 102, 55, -69, 16, 76}, new byte[]{13, 25, -40, 126, 99, -59, 34, -25}));
                String str2 = "";
                Iterator it = com.github.catvod.spider.merge.nU.c.e(com.github.catvod.spider.merge.XI.f.a(new byte[]{-68, -15, 8, 8, 35, 15, 99, 31, -92, -28, 18, 86, 33, 64, 45, 66, -65, -85, 31, 22, 127, 84, 47, 83, -69, -16, 18, 12, 127, 92, 34, 86, -69, -70, 15, 12, 109}, new byte[]{-44, -123, 124, 120, 80, 53, 76, 48}) + strOptString + com.github.catvod.spider.merge.XI.f.a(new byte[]{-108, -119, 4, 71, -4, -34, -104, 26}, new byte[]{-78, -27, 115, 122, -113, -67, -7, 116}), map).headers(com.github.catvod.spider.merge.XI.f.a(new byte[]{61, 23, 125, -67, -72, -70, -94, 28, 39, 23}, new byte[]{78, 114, 9, -112, -37, -43, -51, 119})).iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-56}, new byte[]{-13, 27, 17, 87, 1, -120, 63, 59}))[0] + com.github.catvod.spider.merge.XI.f.a(new byte[]{74}, new byte[]{113, -127, -86, -128, -71, 80, 31, -79});
                }
                try {
                    L(str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void E(String str, com.github.catvod.spider.merge.kT.a aVar, List<com.github.catvod.spider.merge.kT.a> list) {
        if (this.d.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.c(new byte[]{-92, -83, 104, 30, 12, -14, 92, 80, -88, -85, 117, 24, 26, -27, 3, 28, -30, -88, 105, 15, 13, -93, 93, 28, -94, -10, 45, 65, 28, -92, 28, 10, -88, -67, 110, 7, 9, -83, 92, 12, -92, -72, 110, 11, 80, -69, 27, 30, -66, -68, 108, 15, 24, -83, 92, 27, -87, -83, 125, 7, 19, -9, 3, 13, -15, -84, 127, 30, 13, -89, 85, 25, -66, -28, 108, 13, 89, -67, 16, 32, -68, -72, 110, 15, 18, -105, 0, 11, -66, -28, 58, 30, 8, -84, 44, 22, -88, -28}, new byte[]{-52, -39, 28, 110, 127, -56, 115, 127}, sb, str);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{53, -55, -88, 6, 89, 16, -59, 65}, new byte[]{19, -70, -36, 105, 50, 117, -85, 124}));
            sb.append(URLEncoder.encode(this.d.b().a()));
            v.c(new byte[]{-42, 127, -29, -88, 22, 109, -66, 9, -108, 50}, new byte[]{-16, 15, -121, -63, 100, 50, -40, 96}, sb, strB);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{39, -6, -42, -109, 60, -33, -19, -25, 39, -61, -55, -128, 56, -33, -19}, new byte[]{1, -100, -71, -31, 95, -70, -48, -41}));
            sb.append(i2);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{78, -4, -61, 17, -80, 48, -31}, new byte[]{104, -93, -80, 120, -54, 85, -36, 120}));
            sb.append(100);
            String strQ = q(C0925t.a(new byte[]{-58, 64, -70, 34, 106, 32, 35, -123, -119, 115, -84, 18, 108, 45, 110, -122, -38, 126, -70, 46, 52, 50, 119, -113, -123, 64, -89, 44, 117, 49, 36, -126, -109, 124}, new byte[]{-32, 31, -55, 77, 24, 84, 30, -29}, sb));
            for (com.github.catvod.spider.merge.kT.a aVar2 : ((com.github.catvod.spider.merge.kT.c) C0924s.a(strQ, com.github.catvod.spider.merge.kT.c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && com.github.catvod.spider.merge.pT.C.k().contains(aVar2.d()))) {
                    if (!this.d.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strQ).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, 59, 116, -128, 23, -69, -38, -42}, new byte[]{-14, 94, 0, -31, 115, -38, -82, -73}));
                int i3 = jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{104, 96, 20, 76, 42, -96}, new byte[]{55, 20, 123, 56, 75, -52, 68, -24}));
                int i4 = jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-39, -58, -33, 119, 49, 31}, new byte[]{-122, -91, -80, 2, 95, 107, -117, 75}));
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
            E(str, (com.github.catvod.spider.merge.kT.a) it.next(), list);
        }
    }

    private String G(String str, Map<String, Object> map) {
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(str, new JSONObject(map).toString(), u());
        List<String> list = eVarG.c().get(com.github.catvod.spider.merge.XI.f.a(new byte[]{62, -48, -46, 5, 122, 89, -19, 125, 36, -48}, new byte[]{77, -75, -90, 40, 25, 54, -126, 22}));
        if (!(list == null) && list.size() > 0) {
            String str2 = this.a;
            String str3 = "";
            try {
                String str4 = list.get(0).split(com.github.catvod.spider.merge.XI.f.a(new byte[]{70}, new byte[]{125, 87, 91, -116, -61, -87, -81, 73}))[0];
                String str5 = str4.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{54}, new byte[]{11, -30, 26, -52, 87, -52, 14, 61}))[0];
                String str6 = str4.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16}, new byte[]{-51, -67, -7, 51, 94, -120, 109, 38}))[1];
                String string = "";
                for (String str7 : str2.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-95}, new byte[]{-102, -45, -41, -17, -108, -120, -11, -74}))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-105}, new byte[]{-84, -106, 94, -107, 114, 63, 69, 87}));
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.a = str3;
        }
        return eVarG.a();
    }

    private String I(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = com.github.catvod.spider.merge.XI.f.a(new byte[]{-26, 81, 99, -39, -62, -101}, new byte[]{-88, 30, 49, -108, -125, -41, -76, 27});
            }
            HashMap<String, Integer> mapX = x();
            int iIntValue = mapX.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{121, 57, 84, 49, 30, -2, 124}, new byte[]{13, 81, 38, 84, 127, -102, 15, -84})).intValue();
            int iIntValue2 = mapX.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{40, -11, -35, 105, 112, -45, -69, -62, 46}, new byte[]{75, -99, -88, 7, 27, -96, -46, -72})).intValue();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-114, -26, -88, 124, 68, 59, -117, -30, -101, -5, -25, 105, 88, 0, -128, -29, -116, -25, -81, 109, 77, 77, -116, -25, -109, -15, -3, 36}, new byte[]{-2, -108, -57, 4, 61, 109, -30, -122}) + this.c + com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, -123, -113, 38, -114, -121, -104, -2, -46, -47}, new byte[]{-24, -15, -25, 84, -21, -26, -4, -115}) + iIntValue + com.github.catvod.spider.merge.XI.f.a(new byte[]{64, 66, -54, 109, 54, -126, -117, 86, 26, 68, -104, 56}, new byte[]{96, 33, -94, 24, 88, -23, -8, 63}) + iIntValue2);
            return String.format(Proxy.getUrl() + com.github.catvod.spider.merge.XI.f.a(new byte[]{104, 6, 6, -6, -91, 107, 16, 64, 35, 27, 25, -94, -7, 113, 16, 2, 50, 13, 79, -76, -83, 115, 28, 91, 38, 23, 8, -75, -81, 33, 26, 7, 35, 7, 84, -30, -73, 33, 10, 14, 54, 16, 12, -114, -96, 58, 92, 21, 113, 4, 0, -85, -95, 78, 29, 91, 114, 17, 79, -77, -85, 108, 28, 8, 30, 6, 84, -30, -73, 33, 13, 14, 37, 7, 8, -93, -7, 34, 29, 64, 52, 10, 28, -87, -81, 116, 16, 28, 50, 95, 76, -93, -30, 114, 11, 10, 106, 71, 26}, new byte[]{87, 98, 105, -57, -60, 7, 121, 102}), str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-55, 29, -122, -8, 96, -55, 19, 122, -36, 0, -68, -14, 117, -65, 31, 102, -125}, new byte[]{-71, 111, -23, -128, 25, -97, 122, 30}) + e.getMessage());
            return "";
        }
    }

    private void K(String str) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.kT.a aVar = new com.github.catvod.spider.merge.kT.a();
        aVar.j("");
        E(str, aVar, arrayList);
        this.d.d(arrayList);
    }

    private void N() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0911e(this, 1));
    }

    public static void a(L l, JSONObject jSONObject) {
        l.getClass();
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.XI.f.d(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{43, -103, 115}, new byte[]{94, -21, 31, 87, -70, -53, -81, -120})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new G(l, 0)).setOnDismissListener(new I(l, 0)).show();
            l.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0914h(l, jSONObject, 1));
            com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-105, -128, -22, -28, -28, 125, 8, -3, -41, -54, -7, -72, -68, 71, 100, 73, 62, 95, 45, 32, -65, 75, 68, -113, -16, -96, -71, -70, -43, 37, 84, -35, -104, -113, -36}, new byte[]{127, 47, 93, 0, 89, -62, -17, 105}));
        } catch (Exception unused) {
        }
    }

    public static void b(L l) {
        l.N();
    }

    public static void d(L l) {
        l.o();
        Init.execute(new RunnableC0912f(l, 2));
    }

    public static void e(L l, EditText editText) {
        l.getClass();
        String string = editText.getText().toString();
        l.o();
        Init.execute(new J(l, string, 0));
    }

    public static void f(L l) {
        l.N();
    }

    public static void g(L l, JSONObject jSONObject) {
        l.getClass();
        String strOptString = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-26, -116, -66, -94, -35}, new byte[]{-110, -29, -43, -57, -77, 108, 12, -123}));
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        l.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0915i(l, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean i(List list) {
        Exception e;
        String strA;
        HashMap map;
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-25, 2, 105, -40, 110, 20, -72, -67, -21, 4, 116, -34, 120, 3, -25, -15, -95, 7, 104, -55, 111, 69, -71, -15, -31, 89, 44, -121, 126, 66, -8, -25, -21, 18, 111, -63, 107, 75, -72, -12, -26, 26, 120, -121, 121, 75, -5, -9, -5, 19, 34, -40, 111, 19, -30, -15, -1, 4, 114, -114, 123, 92, -86, -30, -20, 80, 104, -53, 66, 94, -10, -32, -18, 27, 66, -37, 105, 92, -86}, new byte[]{-113, 118, 29, -88, 29, 46, -105, -110});
                map = new HashMap();
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{50, 10, 50, -61, 109, -34, -51, -8}, new byte[]{84, 99, 94, -90, 1, -73, -66, -116}), list);
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{19, 94, -126, 40, -54, 119, -102, 87, 16, 79, -123, 55}, new byte[]{118, 38, -31, 68, -65, 19, -1, 8}), new ArrayList());
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, 5, 6, -25, -55, -91, -86, 126, -46, 22, 23}, new byte[]{-85, 102, 114, -114, -90, -53, -11, 10}), 2);
            } catch (Exception e2) {
                e = e2;
                y.b(new byte[]{50, -117, -26, 2, -78, -123, -7}, new byte[]{86, -18, -118, 103, -58, -32, -61, -31}, new StringBuilder(), e);
                return true;
            }
            try {
                String strG = G(strA, map);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-68, 83, -127, -96, 27, -101, -62, 24, -85, 67, -127, -79, 85}, new byte[]{-40, 54, -19, -59, 111, -2, -112, 125}) + strG);
                strOptString = new JSONObject(strG).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-24, 99, 37, -39}, new byte[]{-116, 2, 81, -72, -62, -83, -96, 81})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -119, -116, 61, 0, -44, 111}, new byte[]{-50, -24, -1, 86, 95, -67, 11, -65}));
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                y.b(new byte[]{50, -117, -26, 2, -78, -123, -7}, new byte[]{86, -18, -118, 103, -58, -32, -61, -31}, new StringBuilder(), e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            return i(list);
        }
        return true;
    }

    private com.github.catvod.spider.merge.KI.e<String> l(String str, String str2, String str3, Boolean bool) {
        try {
            List<com.github.catvod.spider.merge.kT.a> listC = this.d.c();
            String strF = "";
            if (listC == null || listC.isEmpty()) {
                J(str);
                K(str);
                listC = this.d.c();
            }
            if (listC != null && !listC.isEmpty()) {
                Iterator<com.github.catvod.spider.merge.kT.a> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.github.catvod.spider.merge.kT.a next = it.next();
                    if (C0926u.c(next.b(), str2)) {
                        strF = next.f();
                        break;
                    }
                }
            }
            if (strF.isEmpty()) {
                return com.github.catvod.spider.merge.KI.e.a(com.github.catvod.spider.merge.XI.f.a(new byte[]{82, 44, 31, 112, 127, 95, -22, 111, 90, 101, 22, 120, 91, 68, -8}, new byte[]{52, 69, 115, 21, 43, 48, -127, 10}));
            }
            String strR = r();
            String str4 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-14, -78, -2, 58, -66, 32, -64, 19, -2, -76, -29, 60, -88, 55, -97, 95, -76, -73, -1, 43, -65, 113, -63, 95, -12, -23, -69, 101, -82, 118, -128, 73, -2, -94, -8, 35, -69, 127, -64, 79, -14, -89, -8, 47, -30, 105, -121, 93, -24, -93, -6, 43, -86, 127, -64, 79, -5, -80, -17, 117, -67, 104, -46, 73, -7, -74, -8, 37, -21, 124, -99, 1, -22, -91, -84, 63, -82, 69, -97, 93, -24, -89, -25, 21, -66, 110, -99, 1, -68, -103, -43, 62, -16}, new byte[]{-102, -58, -118, 74, -51, 26, -17, 60}) + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, 89, 61, 111, -21, -77, 114, -104}, new byte[]{-44, 61, 84, 29, -76, -43, 27, -4}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-47}, new byte[]{-31, 100, 118, -59, 44, 42, 79, -111}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, -36, -36, 77, -1, -97}, new byte[]{-44, -85, -72, 18, -106, -5, -10, 12}), str);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{68, -16, -79, 86, -84}, new byte[]{55, -109, -44, 56, -55, -91, 59, -71}), com.github.catvod.spider.merge.XI.f.a(new byte[]{78, 80, -15, -32}, new byte[]{34, 57, -97, -117, -14, -59, -128, -71}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{121, 72, 126, 28, -94, 5}, new byte[]{10, 60, 17, 119, -57, 107, 25, -17}), this.d.b().a());
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-50, -111, -94, 85, -36, 111, -14, 32, -36, -105, -103}, new byte[]{-70, -2, -3, 37, -72, 6, -128, 127}), strR);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 3, -53, -36, 108, -114, -23, 120}, new byte[]{-91, 106, -81, -125, 0, -25, -102, 12}), Collections.singletonList(str2));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-84, 104, -41, -20, 60, -36, 74, -2, -92, 94, -33, -38, 59, -57}, new byte[]{-54, 1, -77, -77, 72, -77, 33, -101}), Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(G(str4, map));
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{21, 108, -5, -85}, new byte[]{118, 3, -97, -50, 101, -121, -39, 46})) == 41017) {
                return com.github.catvod.spider.merge.KI.e.h(str2);
            }
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{26, 126, -101, 62, 16, 63}, new byte[]{105, 10, -6, 74, 101, 76, 23, 14})) == 200 && jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-122, 118, 11, 83}, new byte[]{-27, 25, 111, 54, -97, 96, 81, 118})) == 0) {
                String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{22, -94, -66, 118}, new byte[]{114, -61, -54, 23, 32, -117, 46, -16})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{98, -81, 44, -14, 89, -123, 118}, new byte[]{22, -50, 95, -103, 6, -20, 18, 38}));
                JSONArray jSONArray = new JSONArray();
                int i2 = 0;
                while (i2 < 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{62, 46, 10, -24, 23, -15, 35, 9, 50, 40, 23, -18, 1, -26, 124, 69, 120, 43, 11, -7, 22, -96, 34, 69, 56, 117, 79, -73, 7, -89, 99, 83, 50, 62, 12, -15, 18, -82, 35, 82, 55, 41, 21, -89, 20, -71, 49, 83, 53, 42, 12, -9, 66, -83, 126, 27, 38, 57, 88, -19, 7, -108, 124, 71, 36, 59, 19, -57, 23, -65, 126, 27, 112, 46, 31, -21, 15, -108, 101, 66, 107}, new byte[]{86, 90, 126, -104, 100, -53, 12, 38}));
                    sb.append(strOptString);
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-43, 38, 26, -55, -28, -105, 118, 6, -99, 48, 26, -59, -85}, new byte[]{-13, 84, 127, -67, -106, -18, 41, 111}));
                    i2++;
                    sb.append(i2);
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{35, -113, -113, -67, -51}, new byte[]{5, -48, -48, -55, -16, 40, 94, 36}));
                    sb.append(System.currentTimeMillis());
                    String strQ = q(sb.toString());
                    if (new JSONObject(strQ).optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73, 0, -95, 19}, new byte[]{-44, 111, -59, 118, 102, -77, 30, -122})) == 32003) {
                        return com.github.catvod.spider.merge.KI.e.a(com.github.catvod.spider.merge.XI.f.a(new byte[]{-118, 5, -16, 45, -8, 87, -69, 109, -35, 77, -14, 101, 83, -8, -69, 97, -43, 67, -25, 106, -105, 108, -13, 62, -42, 27, -83, 120, -27, 61, -49, 66}, new byte[]{111, -85, 73, -60, 127, -40, 94, -38}));
                    }
                    jSONArray = new JSONObject(strQ).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-113, 25, -67, -15}, new byte[]{-21, 120, -55, -112, -110, 121, 80, 87})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-89, 42, 107, -17, -69, 35, 79}, new byte[]{-44, 75, 29, -118, -28, 66, 60, 28})).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, 118, 126, -37, -76, 16, -117, -70, -93, 120, 120, -31, -115, 24, -100, -106}, new byte[]{-41, 23, 8, -66, -21, 113, -8, -27}));
                    if (jSONArray.length() > 0) {
                        break;
                    }
                    TimeUnit.SECONDS.sleep(1L);
                }
                return (bool.booleanValue() && jSONArray.length() == 0) ? l(str, str2, str3, Boolean.FALSE) : com.github.catvod.spider.merge.KI.e.h(jSONArray.optString(0));
            }
            JSONObject jSONObjectB = B(jSONObject, str, str2, map);
            return jSONObjectB == null ? com.github.catvod.spider.merge.KI.e.a(com.github.catvod.spider.merge.XI.f.a(new byte[]{-102, 3, 56, -25, 37, -26, 21, -85}, new byte[]{-11, 97, 82, -57, 75, -109, 121, -57})) : jSONObjectB.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, 113, -71, -86}, new byte[]{-103, 30, -35, -49, -52, -115, -107, 123})) == 41017 ? com.github.catvod.spider.merge.KI.e.h(str2) : com.github.catvod.spider.merge.KI.e.a(jSONObjectB.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-96, -14, -25, 114, 43, 89, 117}, new byte[]{-51, -105, -108, 1, 74, 62, 16, -24})));
        } catch (Exception e) {
            return com.github.catvod.spider.merge.KI.e.a(e.getMessage());
        }
    }

    private boolean m() {
        String strA;
        ArrayList arrayList = new ArrayList();
        int i2 = 8;
        try {
            String strR = r();
            byte b = 2;
            byte b2 = 3;
            byte b3 = 4;
            byte b4 = 5;
            byte b5 = 6;
            byte b6 = 7;
            if (strR.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82}, new byte[]{-98, -65, -15, 118, -83, -14, 24, -24}))) {
                return false;
            }
            long j2 = com.github.catvod.spider.merge.pT.C.j();
            int i3 = 1;
            while (true) {
                byte[] bArr = new byte[176];
                bArr[0] = -113;
                bArr[1] = 115;
                bArr[b] = b4;
                bArr[b2] = 89;
                bArr[b3] = -12;
                bArr[b4] = 43;
                bArr[b5] = -27;
                bArr[b6] = -58;
                bArr[i2] = -125;
                bArr[9] = 117;
                bArr[10] = 24;
                bArr[11] = 95;
                bArr[12] = -30;
                bArr[13] = 60;
                bArr[14] = -70;
                bArr[15] = -118;
                bArr[16] = -55;
                bArr[17] = 118;
                bArr[18] = b3;
                bArr[19] = 72;
                bArr[20] = -11;
                bArr[21] = 122;
                bArr[22] = -28;
                bArr[23] = -118;
                bArr[24] = -119;
                bArr[25] = 40;
                bArr[26] = 64;
                bArr[27] = b5;
                bArr[28] = -28;
                bArr[29] = 125;
                bArr[30] = -91;
                bArr[31] = -100;
                bArr[32] = -125;
                bArr[33] = 99;
                bArr[34] = b2;
                bArr[35] = 64;
                bArr[36] = -15;
                bArr[37] = 116;
                bArr[38] = -27;
                bArr[39] = -113;
                bArr[40] = -114;
                bArr[41] = 107;
                bArr[42] = 20;
                bArr[43] = b5;
                bArr[44] = -12;
                bArr[45] = 126;
                bArr[46] = -72;
                bArr[47] = -99;
                bArr[48] = -40;
                bArr[49] = 119;
                bArr[50] = b2;
                bArr[51] = 20;
                bArr[52] = -14;
                bArr[53] = 114;
                bArr[54] = -70;
                bArr[55] = -101;
                bArr[56] = -120;
                bArr[57] = 33;
                bArr[58] = 23;
                bArr[59] = 91;
                bArr[60] = -70;
                bArr[61] = 97;
                bArr[62] = -87;
                bArr[63] = -49;
                bArr[64] = -110;
                bArr[65] = 100;
                bArr[66] = 46;
                bArr[67] = 89;
                bArr[68] = -26;
                bArr[69] = 99;
                bArr[70] = -85;
                bArr[71] = -124;
                bArr[72] = -72;
                bArr[73] = 116;
                bArr[74] = b4;
                bArr[75] = 91;
                bArr[76] = -70;
                bArr[77] = 55;
                bArr[78] = -70;
                bArr[79] = -115;
                bArr[80] = -114;
                bArr[81] = 117;
                bArr[82] = 46;
                bArr[83] = 79;
                bArr[84] = -18;
                bArr[85] = 117;
                bArr[86] = -9;
                bArr[87] = -52;
                bArr[88] = -108;
                bArr[89] = 33;
                bArr[90] = 46;
                bArr[91] = 89;
                bArr[92] = -26;
                bArr[93] = 118;
                bArr[94] = -81;
                bArr[95] = -44;
                bArr[96] = -62;
                bArr[97] = 116;
                bArr[98] = 87;
                bArr[99] = 118;
                bArr[100] = -12;
                bArr[101] = 120;
                bArr[102] = -80;
                bArr[103] = -116;
                bArr[104] = -38;
                bArr[105] = 34;
                bArr[106] = b;
                bArr[107] = 15;
                bArr[108] = -40;
                bArr[109] = 119;
                bArr[110] = -81;
                bArr[111] = -99;
                bArr[112] = -124;
                bArr[113] = 111;
                bArr[114] = 46;
                bArr[115] = 93;
                bArr[116] = -24;
                bArr[117] = 101;
                bArr[118] = -85;
                bArr[119] = -123;
                bArr[120] = -38;
                bArr[121] = 54;
                bArr[122] = 87;
                bArr[123] = 118;
                bArr[124] = -31;
                bArr[125] = 116;
                bArr[126] = -66;
                bArr[127] = -118;
                bArr[128] = -113;
                bArr[129] = 88;
                bArr[130] = b;
                bArr[131] = 92;
                bArr[132] = -27;
                bArr[133] = 78;
                bArr[134] = -82;
                bArr[135] = -128;
                bArr[136] = -107;
                bArr[137] = 116;
                bArr[138] = 76;
                bArr[139] = 25;
                bArr[140] = -95;
                bArr[141] = 78;
                bArr[142] = -71;
                bArr[143] = -122;
                bArr[144] = -107;
                bArr[145] = 115;
                bArr[146] = 76;
                bArr[147] = 79;
                bArr[148] = -18;
                bArr[149] = 125;
                bArr[150] = -81;
                bArr[151] = -74;
                bArr[152] = -109;
                bArr[153] = 126;
                bArr[154] = 1;
                bArr[155] = 76;
                bArr[156] = -67;
                bArr[157] = 112;
                bArr[158] = -71;
                bArr[159] = -118;
                bArr[160] = -53;
                bArr[161] = 114;
                bArr[162] = 1;
                bArr[163] = 77;
                bArr[164] = -26;
                bArr[165] = 101;
                bArr[166] = -81;
                bArr[167] = -115;
                bArr[168] = -72;
                bArr[169] = 102;
                bArr[170] = b4;
                bArr[171] = 19;
                bArr[172] = -29;
                bArr[173] = 116;
                bArr[174] = -71;
                bArr[175] = -118;
                byte[] bArr2 = new byte[i2];
                bArr2[0] = -25;
                bArr2[1] = b6;
                bArr2[b] = 113;
                bArr2[b2] = 41;
                bArr2[b3] = -121;
                bArr2[b4] = 17;
                bArr2[6] = -54;
                bArr2[b6] = -23;
                String strA2 = com.github.catvod.spider.merge.XI.f.a(bArr, bArr2);
                Object[] objArr = new Object[b2];
                objArr[0] = strR;
                objArr[1] = Integer.valueOf(i3);
                objArr[b] = 50;
                JSONObject jSONObject = new JSONObject(q(String.format(strA2, objArr)));
                byte[] bArr3 = new byte[b3];
                bArr3[0] = 122;
                bArr3[1] = -95;
                bArr3[b] = 72;
                bArr3[b2] = -50;
                byte[] bArr4 = new byte[i2];
                bArr4[0] = 30;
                bArr4[1] = -64;
                bArr4[b] = 60;
                bArr4[b2] = -81;
                bArr4[b3] = 56;
                bArr4[b4] = -126;
                bArr4[6] = 55;
                bArr4[7] = 122;
                JSONObject jSONObject2 = jSONObject.getJSONObject(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                byte[] bArr5 = new byte[b3];
                bArr5[0] = -8;
                bArr5[1] = 119;
                bArr5[b] = -61;
                bArr5[b2] = 96;
                byte[] bArr6 = new byte[i2];
                bArr6[0] = -108;
                bArr6[1] = 30;
                bArr6[b] = -80;
                bArr6[b2] = 20;
                bArr6[b3] = -29;
                bArr6[5] = -34;
                bArr6[6] = 17;
                bArr6[7] = -92;
                JSONArray jSONArray = jSONObject2.getJSONArray(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                int i4 = 0;
                while (i4 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                    String str = this.c;
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = -60;
                    bArr7[1] = 101;
                    bArr7[b] = -19;
                    bArr7[3] = 27;
                    bArr7[4] = 39;
                    bArr7[5] = 59;
                    if (str.equals(com.github.catvod.spider.merge.XI.f.a(bArr7, new byte[]{-118, 42, -65, 86, 102, 119, 45, 39}))) {
                        strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{33, 115, 78}, new byte[]{71, 26, 42, 113, -116, -98, 9, 105});
                    } else if (jSONObject3.getLong(com.github.catvod.spider.merge.XI.f.a(new byte[]{95, -51, -78, 54, -108, -58, -23, 84, 93, -53}, new byte[]{60, -65, -41, 87, -32, -93, -115, 11})) < j2) {
                        strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 119, 108}, new byte[]{3, 30, 8, 23, 96, 11, -107, 102});
                    } else {
                        i4++;
                        i2 = 8;
                        b = 2;
                    }
                    arrayList.add(jSONObject3.getString(strA));
                    i4++;
                    i2 = 8;
                    b = 2;
                }
                byte[] bArr8 = new byte[i2];
                bArr8[0] = -44;
                bArr8[1] = 100;
                bArr8[2] = 12;
                bArr8[3] = 70;
                bArr8[4] = -117;
                bArr8[5] = 52;
                bArr8[6] = 99;
                bArr8[7] = -15;
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.github.catvod.spider.merge.XI.f.a(bArr8, new byte[]{-71, 1, 120, 39, -17, 85, 23, -112}));
                if (jSONObject4.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-33, -123, -47, -119, 69}, new byte[]{-128, -10, -72, -13, 32, 5, -57, 105})) != jSONObject4.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, 47, 2, 58, -11, -19}, new byte[]{-58, 76, 109, 79, -101, -103, 123, 30})) || jSONObject4.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-110, -56, -62, 23, 72, -11}, new byte[]{-51, -85, -83, 98, 38, -127, -121, 71})) == 0) {
                    break;
                }
                i3++;
                i2 = 8;
                b = 2;
                b2 = 3;
                b3 = 4;
                b4 = 5;
                b5 = 6;
                b6 = 7;
            }
            if (arrayList.size() == 0) {
                return true;
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (int i5 = 0; i5 < iCeil; i5++) {
                int i6 = i5 * 50;
                i(new ArrayList(arrayList.subList(i6, Math.min(i6 + 50, size))));
            }
            return true;
        } catch (Exception e) {
            y.b(new byte[]{30, 65, 12, 38, -64, 28, -54, -52, 30, 77, 18, 99, -40, 16, -103, -56, 90, 65, 18, 49, -114}, new byte[]{122, 36, 96, 67, -76, 121, -22, -68}, new StringBuilder(), e);
            return false;
        }
    }

    private void n() {
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            AlertDialog alertDialog = this.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static L p() {
        return K.a;
    }

    private String q(String str) {
        return com.github.catvod.spider.merge.nU.c.l(str, u());
    }

    private String r() {
        String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -117, -82, 1, 119, 58}, new byte[]{-50, -3, -38, 100, 26, 74, 1, -55});
        try {
            JSONArray jSONArray = new JSONObject(q(com.github.catvod.spider.merge.XI.f.a(new byte[]{66, 33, -123, 25, 44, 97, -62, -111, 78, 39, -104, 31, 58, 118, -99, -35, 4, 36, -124, 8, 45, 48, -61, -35, 68, 122, -64, 70, 60, 55, -126, -53, 78, 49, -125, 0, 41, 62, -62, -40, 67, 57, -108, 70, 44, 52, -97, -54, 21, 37, -125, 84, 42, 56, -99, -52, 69, 115, -105, 27, 98, 43, -114, -104, 95, 54, -82, 25, 62, 41, -116, -45, 117, 38, -123, 27, 98, 125, -99, -38, 67, 39, -82, 15, 54, 63, -48, -114, 12, 10, -127, 8, 56, 62, -48, -113, 12, 10, -126, 0, 37, 62, -48, -117, 26, 115, -82, 15, 58, 47, -114, -42, 117, 33, -98, 29, 62, 55, -48, -113, 12, 10, -105, 12, 43, 56, -123, -31, 89, 32, -109, 54, 59, 50, -97, -51, 23, 101, -41, 54, 44, 52, -97, -54, 23, 51, -104, 5, 58, 4, -103, -57, 90, 48, -53, 8, 44, 56, -63, -53, 90, 49, -112, 29, 58, 63, -78, -33, 94, 111, -107, 12, 44, 56}, new byte[]{42, 85, -15, 105, 95, 91, -19, -66}))).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-98, -92, -8, -125}, new byte[]{-6, -59, -116, -30, -69, 123, 20, 50})).getJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{114, 41, 116, -91}, new byte[]{30, 64, 7, -47, -21, -119, 4, -51}));
            String string = "";
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                if (jSONObject.getBoolean(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, 69, 115}, new byte[]{-113, 44, 1, 107, -119, -7, -77, 97})) && jSONObject.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-117, -111, 126, -71, 3, -40, 0, -114, -120}, new byte[]{-19, -8, 18, -36, 92, -74, 97, -29})).equals(strA)) {
                    string = jSONObject.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-41, -49, -31}, new byte[]{-79, -90, -123, 117, -99, 52, 73, 59}));
                    break;
                }
                i2++;
            }
            if (!string.equals("")) {
                return string;
            }
            String strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-35, -127, -25, 80, 101, 66, -41, -72, -47, -121, -6, 86, 115, 85, -120, -12, -101, -124, -26, 65, 100, 19, -42, -12, -37, -38, -94, 15, 117, 20, -105, -30, -47, -111, -31, 73, 96, 29, -41, -15, -36, -103, -10, 31, 102, 10, -59, -30, -42, -123, -31, 79, 48, 30, -118, -86, -59, -106, -75, 85, 117, 39, -120, -10, -57, -108, -2, 127, 101, 12, -118, -86}, new byte[]{-75, -11, -109, 32, 22, 120, -8, -105});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 43, -123, -98, 51, 12, -123, -105}, new byte[]{21, 79, -20, -20, 108, 106, -20, -13}), com.github.catvod.spider.merge.XI.f.a(new byte[]{40}, new byte[]{24, 109, 61, -79, -112, -54, 34, -56}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, 120, 70, 111, -53, 126, 109, -55, -17}, new byte[]{-118, 17, 42, 10, -108, 16, 12, -92}), strA);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-120, 43, 30, 121, -28, -69, -58, 66}, new byte[]{-20, 66, 108, 38, -108, -38, -78, 42}), "");
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-116, -110, -69, -85, -34, 11, 33, 96, -73, -105, -90, -105, -36}, new byte[]{-24, -5, -55, -12, -73, 101, 72, 20}), Boolean.FALSE);
            return new JSONObject(G(strA2, map)).getJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-104, 113, 58, 80}, new byte[]{-4, 16, 78, 49, 57, 14, 110, -97})).getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{61, -50, 125}, new byte[]{91, -89, 25, 61, -80, -70, 18, 90}));
        } catch (Exception e) {
            y.b(new byte[]{125, -51, 94, 19, 58, 116, 80, 13, 126, -63, 88, 112, 48, 124, 19, 125}, new byte[]{26, -88, 42, 80, 85, 4, 41, 93}, new StringBuilder(), e);
            return com.github.catvod.spider.merge.XI.f.a(new byte[]{93}, new byte[]{109, -14, -52, 30, 42, 24, 116, 6});
        }
    }

    private String t(String str) {
        StringBuilder sb = new StringBuilder();
        v.c(new byte[]{69, 55, -75, -51, 14, 97, -99, 15, 73, 49, -88, -53, 24, 118, -62, 67, 3, 50, -76, -36, 15, 48, -100, 67, 67, 108, -16, -110, 30, 55, -35, 85, 73, 39, -77, -44, 11, 62, -99, 70, 68, 47, -92, -110, 20, 53, -44, 79, 18, 51, -77, -128, 8, 56, -62, 82, 66, 101, -89, -49, 64, 43, -47, 6, 88, 32, -98, -51, 28, 41, -45, 77, 114, 48, -75, -49, 64, 125, -44, 73, 73, 126}, new byte[]{45, 67, -63, -67, 125, 91, -78, 32}, sb, str);
        return new JSONObject(com.github.catvod.spider.merge.nU.c.l(C0925t.a(new byte[]{-83, 18, 123, 77, -78, 25, -21, 108, -19, 56, 113, 68, -103, 10, -30, 71, -29, 112, 45, 14, -88, 31, -26, 87, -44, 61, 111, 71, -96, 19, -17, 86, -44, 57, 124, 79, -75, 71, -78}, new byte[]{-117, 77, 29, 40, -58, 122, -125, 51}, sb), u())).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{42, 93, -38, 27}, new byte[]{78, 60, -82, 122, -76, 64, 50, 57})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-105, 50, 125, -67, 112, 85, 69, -34, -108}, new byte[]{-15, 91, 17, -40, 47, 59, 36, -77}));
    }

    private Map<String, String> u() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, 116, 29, -48, 119, -94}, new byte[]{-36, 27, 114, -69, 30, -57, 79, -31}), this.a);
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{28, 81, -88, -57, -118, 17, 47}, new byte[]{78, 52, -50, -94, -8, 116, 93, -114}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, 80, 105, -106, -71, -100, -101, -96, -100, 69, 115, -56, -69, -45, -43, -3, -121, 10, 126, -120, -27}, new byte[]{-20, 36, 29, -26, -54, -90, -76, -113}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -25, 116, 0, -80, 126, 60, -108, -46, -32}, new byte[]{-68, -108, 17, 114, -99, 63, 91, -15}), i);
        return map;
    }

    private Map<String, String> v() {
        String strA;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(null)) {
            strA = this.a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            strA = C0926u.a(new byte[]{-23}, new byte[]{-46, -14, 111, -47, -99, 14, 49, 124}, sb, null);
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, 123, -79, -98, -122, -32}, new byte[]{-88, 20, -34, -11, -17, -123, -70, 7}), strA);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{66, -24, -63, 121, 84, 13, 17}, new byte[]{16, -115, -89, 28, 38, 104, 99, -126}), com.github.catvod.spider.merge.XI.f.a(new byte[]{1, -15, -19, -13, 112, -102, -70, 87, 25, -28, -9, -83, 114, -43, -12, 10, 2, -85, -6, -19, 44}, new byte[]{105, -123, -103, -125, 3, -96, -107, 120}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, 63, 20, -32, -118, 81, -102, 96, -48, 56}, new byte[]{-66, 76, 113, -110, -89, 16, -3, 5}), i);
        return map;
    }

    private HashMap<String, Integer> x() {
        String strA;
        int i2;
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = com.github.catvod.spider.merge.XI.f.a(new byte[]{-2, 91, -99, 1, 1, -45}, new byte[]{-80, 20, -49, 76, 64, -97, 25, 12});
            }
            if (this.c.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{4, 93, 67, -12, -120, 68, -66, 104}, new byte[]{65, 5, 19, -85, -37, 18, -9, 56}))) {
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, 53, -106, -22, 118, -83, -118}, new byte[]{-25, 93, -28, -113, 23, -55, -7, -33}), 12);
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-113, 4, -32, -77, 57, 44, -118, -36, -119}, new byte[]{-20, 108, -107, -35, 82, 95, -29, -90}), 409600);
            } else {
                if (this.c.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, -72, 25, -111, 5, 83, -111, -29, 70}, new byte[]{22, -19, 73, -44, 87, 12, -57, -86}))) {
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{111, -76, 18, 108, -82, 93, 12}, new byte[]{27, -36, 96, 9, -49, 57, 127, -36}), 12);
                    strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, 52, -128, -38, -7, 31, 30, 118, -62}, new byte[]{-89, 92, -11, -76, -110, 108, 119, 12});
                    i2 = 409600;
                } else {
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-79, -126, 103, 65, -23, 32, 50}, new byte[]{-59, -22, 21, 36, -120, 68, 65, -89}), 12);
                    strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, -94, 84, -85, -106, -51, -101, -46, -94}, new byte[]{-57, -54, 33, -59, -3, -66, -14, -88});
                    i2 = 409600;
                }
                map.put(strA, Integer.valueOf(i2));
            }
            if (this.c.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{117, 54, -91, 40, 78, -106}, new byte[]{59, 121, -9, 101, 15, -38, 81, 52}))) {
                return map;
            }
            String strK = com.github.catvod.spider.merge.pT.a.k(com.github.catvod.spider.merge.pT.a.n(com.github.catvod.spider.merge.XI.f.a(new byte[]{103, 115, -68, -9, 10, 11, 112, -12}, new byte[]{72, 93, -56, -97, 120, 110, 17, -112})));
            if (!strK.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strK);
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{14, -65, -35, -38, 108, 66, -36}, new byte[]{122, -41, -81, -65, 13, 38, -81, -50}), Integer.valueOf(jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{98, -42, 83, -27, -124, -54, -128}, new byte[]{22, -66, 33, -128, -27, -82, -13, 16}), 12)));
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{19, 56, -38, 12, 101, -42, -33, -48, 21}, new byte[]{112, 80, -81, 98, 14, -91, -74, -86}), Integer.valueOf(jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, -98, 6, -95, -3, -42, -90, -95, -10}, new byte[]{-109, -10, 115, -49, -106, -91, -49, -37}), 400) * 1024));
            }
        } catch (Exception unused) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{71, 70, -17, 112, -35, -7, 109}, new byte[]{51, 46, -99, 21, -68, -99, 30, 63}), 12);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{7, -88, 100, 4, -18, -125, 43, -59, 1}, new byte[]{100, -64, 17, 106, -123, -16, 66, -65}), 409600);
        }
        return map;
    }

    public final String F(String[] strArr, String str) {
        String strD;
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-31, -18, 57, 73, -99, 121, -125, 3, -1, -10, 61, 94, -116, 49, -32, 31, -27, -29, 42, 68}, new byte[]{-111, -126, 88, 48, -8, 11, -64, 108}));
        if (TextUtils.isEmpty(this.a)) {
            j();
        }
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{90, 102, 127, 77, 54, 25, 0, -74, 68, 126, 123, 90, 39, 81, 99, -65, 70, 107, 121}, new byte[]{42, 10, 30, 52, 83, 107, 67, -39}) + str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-8}, new byte[]{-37, 111, 58, -58, 99, -70, -15, 59}))[0]);
        if (str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92}, new byte[]{-121, 10, -87, -22, -92, 36, -32, -49}))[0].contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{37, 32, -73, -89, 29, -31}, new byte[]{-64, -82, 40, 64, -119, 90, -91, -32}))) {
            com.github.catvod.spider.merge.KI.e<String> eVarS = s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-1, -35, 26, -13, -54, 112, -111, 75, -31, -59, 30, -28, -37, 56, -14, 67, -22, -59, 63, -27, -40, 108, -66, 75, -18, -43, 46, -8, -61}, new byte[]{-113, -79, 123, -118, -81, 2, -46, 36}));
            if (eVarS.b() == 0) {
                String strC = eVarS.c();
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-106, 47, 56, 115, 25, -31, 65, -43, -120, 55, 60, 100, 8, -87, 34}, new byte[]{-26, 67, 89, 10, 124, -109, 2, -70}) + strC);
                if (com.github.catvod.spider.merge.pT.m.b().booleanValue()) {
                    SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{80, -104, 123, 83, 93, -41, 117, 60, 78, -128, 127, 68, 76, -97, 22, 52, 79, -44, 115, 68}, new byte[]{32, -12, 26, 42, 56, -91, 54, 83}));
                    HashMap<String, Integer> mapX = x();
                    int iIntValue = mapX.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{26, 12, -93, 28, -58, 40, -62}, new byte[]{110, 100, -47, 121, -89, 76, -79, 82})).intValue();
                    mapX.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-104, -3, 81, -99, -23, 22, 106, 109, -98}, new byte[]{-5, -107, 36, -13, -126, 101, 3, 23})).intValue();
                    String strD2 = com.github.catvod.spider.merge.pT.m.d(strC, iIntValue, 0);
                    SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-30, 60, 59, 106, -64, 93, -33, -117, -4, 36, 63, 125, -47, 15, -23, -106, -2, 106, 122}, new byte[]{-110, 80, 90, 19, -91, 47, -100, -28}) + strD2);
                    if (strArr.length <= 4) {
                        com.github.catvod.spider.merge.KI.h hVar = new com.github.catvod.spider.merge.KI.h();
                        hVar.y(strD2);
                        hVar.j();
                        hVar.f(v());
                        return hVar.toString();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Proxy.getUrl());
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-101, -73, -104, 58, 89, -2, 68, 6, -47, -11, -127, 104, 89, -47, 75, 6, -63, -18}, new byte[]{-92, -45, -9, 7, 61, -97, 42, 107}));
                    sb.append(strArr[3]);
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-118, 52, -37, 35, -103, 21, 91, 35, -44, 127}, new byte[]{-84, 66, -76, 71, -48, 123, 63, 70}));
                    sb.append(strArr[4]);
                    String strA = C0925t.a(new byte[]{46, 39, 17, 28, -70, 111, -30, 81}, new byte[]{8, 81, 126, 120, -17, 29, -114, 108}, sb);
                    com.github.catvod.spider.merge.KI.h hVar2 = new com.github.catvod.spider.merge.KI.h();
                    hVar2.y(strD2);
                    hVar2.a(strA);
                    hVar2.j();
                    hVar2.f(v());
                    return hVar2.toString();
                }
                if (TextUtils.isEmpty(com.github.catvod.spider.merge.pT.m.g())) {
                    String strI = I(com.github.catvod.spider.merge.XI.f.a(new byte[]{11, 10, 110, -74}, new byte[]{111, 101, 25, -40, -51, 119, 12, -69}), strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(strC));
                    SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{56, 18, 76, 70, 57, 65, -108, 4, 38, 10, 72, 81, 40, 9, -9}, new byte[]{72, 126, 45, 63, 92, 51, -41, 107}) + strI);
                    com.github.catvod.spider.merge.KI.h hVar3 = new com.github.catvod.spider.merge.KI.h();
                    hVar3.y(strI);
                    hVar3.j();
                    hVar3.f(u());
                    return hVar3.toString();
                }
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.KI.h hVar4 = new com.github.catvod.spider.merge.KI.h();
                    hVar4.y(com.github.catvod.spider.merge.pT.m.e(strC));
                    hVar4.j();
                    hVar4.f(v());
                    return hVar4.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{68, -45, 8, 25, 106, 13, 76, 52, 14, -111, 17, 75, 106, 34, 67, 52, 30, -118}, new byte[]{123, -73, 103, 36, 14, 108, 34, 89}));
                sb2.append(strArr[3]);
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, -23, 7, -14, 14, 76, 79, 22, -31, -94}, new byte[]{-103, -97, 104, -106, 71, 34, 43, 115}));
                sb2.append(strArr[4]);
                String strA2 = C0925t.a(new byte[]{-82, 97, 64, -32, 42, -30, -71, -68}, new byte[]{-120, 23, 47, -124, 127, -112, -43, -127}, sb2);
                com.github.catvod.spider.merge.KI.h hVar5 = new com.github.catvod.spider.merge.KI.h();
                hVar5.y(com.github.catvod.spider.merge.pT.m.e(strC));
                hVar5.a(strA2);
                hVar5.j();
                hVar5.f(v());
                return hVar5.toString();
            }
            strD = eVarS.d();
        } else {
            com.github.catvod.spider.merge.KI.e<List<String>> eVarW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (eVarW.b() == 0) {
                List<String> listC = eVarW.c();
                com.github.catvod.spider.merge.KI.h hVar6 = new com.github.catvod.spider.merge.KI.h();
                hVar6.z(listC);
                hVar6.j();
                hVar6.f(v());
                return hVar6.toString();
            }
            strD = eVarW.d();
        }
        return com.github.catvod.spider.merge.KI.h.n(strD);
    }

    public final Object[] H(Map<String, String> map) {
        try {
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{32, 7, -41, -40, -52, -96, -45}, new byte[]{83, 111, -74, -86, -87, -23, -73, -107}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, -127, -36, -76, -120, 106}, new byte[]{-56, -24, -80, -47, -63, 14, 90, -98}));
            String str = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, 21, -92, -127}, new byte[]{-51, 116, -48, -28, 92, -122, -1, 37}));
            map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, 117, -106, 27, 61, -38, -33}, new byte[]{49, 26, -3, 126, 83, -109, -69, -58}));
            String str2 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-59, 3, -32}, new byte[]{-80, 113, -116, -75, 47, -42, 121, 40}));
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, 49, -10, -123, 56, -103, 91, 37}, new byte[]{-49, 80, -124, -28, 85, -22, 97, 5}) + map + ZrJ.d("73"));
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{45, 99, -60, -84, -69}, new byte[]{88, 17, -88, -106, -101, -103, 59, 8}) + str2 + ZrJ.d("73"));
            String str3 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{100, 117, -14, 24, -79, 24, -25, 99, 98}, new byte[]{7, 29, -121, 118, -38, 107, -114, 25}));
            String str4 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{116, -96, -74, -34, -48, -10}, new byte[]{0, -56, -60, -69, -79, -110, -44, -54}));
            int i2 = str3 != null ? Integer.parseInt(str3) * 1024 : 65536;
            int i3 = str4 != null ? Integer.parseInt(str4) : 10;
            if (!com.github.catvod.spider.merge.XI.f.a(new byte[]{104, -82, -3, 97}, new byte[]{12, -63, -118, 15, -58, 108, -81, 79}).equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-119, -76, -128, -49, -32, -11, -60}, new byte[]{-5, -47, -26, -86, -110, -112, -74, -60}), com.github.catvod.spider.merge.XI.f.a(new byte[]{103, -128, -55, 5, 54, 39, -14, -117, 106, -126, -60, 73}, new byte[]{14, -29, -80, 40, 91, 66, -122, -22}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-47, -115, 19, -68, -64}, new byte[]{-93, -20, 125, -37, -91, -48, 110, 122}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-39, -86, 79, -108, -107, 113, -92, -28, -43, -85}, new byte[]{-70, -59, 33, -6, -16, 18, -48, -115}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-102, -70, -102, 63, 104, 33, 98, -91, -107, -70, -106, 62, 113, 59, 40}, new byte[]{-5, -39, -7, 90, 24, 85, 79, -64}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-44, 30, 80, -27, -73, 75, -55, 50, -49, 25}, new byte[]{-95, 109, 53, -105, -102, 42, -82, 87}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-104, -111, 109, -102, -123, 120}, new byte[]{-5, -2, 2, -15, -20, 29, -5, 43}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-95, -52, -68, -119, 98}, new byte[]{-45, -83, -46, -18, 7, 100, -7, -48}));
            for (String str5 : map.keySet()) {
                if (listAsList.contains(str5)) {
                    treeMap.put(str5, map.get(str5));
                }
            }
            com.github.catvod.spider.merge.pT.i iVar = this.h;
            if (iVar != null) {
                iVar.c();
            }
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 104, -84, -51, 86, -41, 18, 35, -42, 117, -29, -37, 90, -20, 47, 47, -63, 127, -94, -47, 92, -69, 91}, new byte[]{-77, 26, -61, -75, 47, -127, 123, 71}) + i3 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-106, -17, 28, 102, -58, -92, 122, -112, -52, -23, 78, 51}, new byte[]{-74, -116, 116, 19, -88, -49, 9, -7}) + (i2 / 1024));
            com.github.catvod.spider.merge.pT.i iVar2 = new com.github.catvod.spider.merge.pT.i(str2, treeMap, i3, i2);
            this.h = iVar2;
            return iVar2.f();
        } catch (Exception e) {
            y.b(new byte[]{59, -88, 29, -118, -104, -64, 83, -120}, new byte[]{94, -38, 111, -80, -94, -6, 120, -93}, new StringBuilder(), e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.kT.e>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.kT.e>] */
    public final String J(String str) {
        com.github.catvod.spider.merge.kT.e eVar = (com.github.catvod.spider.merge.kT.e) j.get(str);
        this.d = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-44, -85, 71, -98, 50, 74, -33, 78, -62, -83, 28}, new byte[]{-89, -61, 38, -20, 87, 30, -80, 37}) + this.d.toString());
        }
        com.github.catvod.spider.merge.kT.e eVar2 = this.d;
        if (eVar2 != null && eVar2.a(str)) {
            return this.d.b().a();
        }
        String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-91, -110, 13, -28, 121, 125, -44, 124, -87, -108, 16, -30, 111, 106, -117, 48, -29, -105, 12, -11, 120, 44, -43, 48, -93, -55, 72, -69, 105, 43, -108, 38, -87, -126, 11, -3, 124, 34, -44, 32, -91, -121, 11, -15, 37, 52, -109, 50, -65, -125, 9, -11, 109, 34, -44, 39, -94, -115, 28, -6, 53, 24, -92, 39, -16}, new byte[]{-51, -26, 121, -108, 10, 71, -5, 83}) + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-75, -64, 96, -17, 1, 91}, new byte[]{-59, -73, 4, -80, 104, 63, -65, -12}), str);
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-46, -30, -80, -56, 121, 119, 90, 16}, new byte[]{-94, -125, -61, -69, 26, 24, 62, 117}), "");
        String strA = com.github.catvod.spider.merge.nU.c.g(str2, jsonObject.toString(), u()).a();
        StringBuilder sb = new StringBuilder();
        v.c(new byte[]{-20, -115, 125, 69, 83, -73, 19, -82, -37, -118, 121, 68, 80, -60, 9, -86, -49, -99, 72, 88, 83, -14, 15, -112}, new byte[]{-67, -8, 28, 55, 56, -105, 97, -53}, sb, str);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{58, -119, -123, 101}, new byte[]{103, -89, -85, 75, 4, 65, -101, 35}));
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            this.d = (com.github.catvod.spider.merge.kT.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.kT.e.class);
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, -25, -78, 12, -86, -42, -85, 29}, new byte[]{-103, -109, -35, 103, -49, -72, -111, 61}) + this.d.b().a());
            com.github.catvod.spider.merge.kT.e eVar3 = this.d;
            eVar3.e(str);
            eVar3.f();
            j.put(str, this.d);
            return this.d.b() == null ? "" : this.d.b().a();
        } catch (Exception e) {
            y.b(new byte[]{50, 127, -64, 125, -29, -21, -88, 0, 40, 123, -44, 106, -46, -9, -85, 54, 46, 58, -9, 122, -25, -22, -85, 105}, new byte[]{64, 26, -90, 15, -122, -104, -64, 83}, new StringBuilder(), e);
            return "";
        }
    }

    public final void L(String str) {
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, -126, -32, 0, -97, 56, 33}, new byte[]{-65, -19, -113, 107, -10, 93, 27, 42}) + str);
        this.a = str;
        C();
        N();
    }

    public final void M() {
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle(com.github.catvod.spider.merge.XI.f.a(new byte[]{-104, -59, 77, -54, -54, 97, 113, 41, -43, -113, 94, -102, -111, 119, 31, -17, 31, 5, -111, 75, 17, 17, 20, 60, -106, -2, 85, -60, -8, 115, 113, 1, -25, -115, 86, -124, -112, 74, 38, 73, -30, -26, -78, 86, 0, -126, 119, 44, -31}, new byte[]{112, 106, -6, 34, 116, -14, -108, -84})).setView(frameLayout).setNeutralButton(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, -58, 108, -27, -93, -86, 101, -24, -88, -96, 104, -68, -52, -81, 34, -79, -128, -4, 48, -122, -96, 122, -38, 4, -62, -51, 126, -28, -117, -70}, new byte[]{36, 68, -43, 3, 43, 59, -118, 84}), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.bY.H
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    L.d(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) new com.github.catvod.spider.merge.pT.s(this, editText, 2)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-98, 100, 113, 123, 10, -23, 119, -6, -103, 62, 62, 105, 59, -67, 39}, new byte[]{-19, 12, 30, 12, 67, -121, 7, -113}) + e.getMessage());
        }
    }

    public final void j() {
        int i2 = 1;
        try {
            try {
                this.a = TextUtils.isEmpty(this.a) ? com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{74, 122, 65, 3, 77, -25}, new byte[]{100, 11, 52, 98, 63, -116, 47, 96})) : this.a;
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, 91, -32, 67, 68, 7, -50, 54, 26, 14, -81}, new byte[]{105, 52, -113, 40, 45, 98, -18, 95}) + this.a);
                if (TextUtils.isEmpty(this.a)) {
                    throw new Exception(com.github.catvod.spider.merge.XI.f.a(new byte[]{116, 66, 113, -5, -59, 56, -103, -117, 126, 68, 104, -22}, new byte[]{17, 47, 1, -113, -68, 24, -6, -28}));
                }
                if (!C()) {
                    throw new Exception(com.github.catvod.spider.merge.XI.f.a(new byte[]{37, -89, -59, -88, 31, -57, -8, -42, 47, -90, -36, -94, 26, -53}, new byte[]{76, -55, -77, -55, 115, -82, -100, -10}));
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                k();
                SystemClock.sleep(400L);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{12, -125, -115, -29, 49, -98, -38, 38, 4, -126, -115, -70, 122}, new byte[]{111, -21, -24, -128, 90, -35, -75, 73}) + e.getMessage());
                N();
                Init.run(new RunnableC0909c(this, i2));
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

    public final void k() {
        this.a = "";
        com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{24, -70, -7, 25, 69, -89}, new byte[]{54, -53, -116, 120, 55, -52, -120, -90}), this.a);
    }

    public final com.github.catvod.spider.merge.KI.e<String> s(String str, String str2, String str3) {
        try {
            J(str);
            if (!TextUtils.isEmpty(str)) {
                m();
            }
            com.github.catvod.spider.merge.KI.e<String> eVarL = l(str, str2, str3, Boolean.TRUE);
            if (eVarL.b() != 0) {
                return eVarL;
            }
            String strC = eVarL.c();
            if (TextUtils.isEmpty(strC)) {
                return com.github.catvod.spider.merge.KI.e.a(com.github.catvod.spider.merge.XI.f.a(new byte[]{47, -44, -55, -52, 121, -31, -12, -35, -12, 17, 64, 4, -88, 96, 112, -124, -95, 9, 0}, new byte[]{73, -67, -91, -87, 48, -123, -44, 53}));
            }
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-59, -57, -53, 123, -12, 105, 85, -29, -55, -63, -42, 125, -30, 126, 10, -81, -125, -62, -54, 106, -11, 56, 84, -81, -61, -100, -114, 36, -28, 63, 21, -71, -55, -41, -51, 98, -15, 54, 85, -86, -60, -33, -38, 36, -29, 60, 13, -94, -63, -36, -34, 111, -72, 35, 8, -15, -40, -48, -49, 121, -24, 117, 28, -66, -112, -61, -36}, new byte[]{-83, -77, -65, 11, -121, 83, 122, -52});
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strC);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{19, -60, -106, -46}, new byte[]{117, -83, -14, -95, -41, 110, 116, -108}), arrayList);
            if (!com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, 7, -47, -110, -98, 40, -55, 97, -112}, new byte[]{-64, 82, -127, -41, -52, 119, -97, 40}).equals(this.c)) {
                String strY = y(strC);
                if (!TextUtils.isEmpty(strY)) {
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-27, -13, -122, 78, 105}, new byte[]{-111, -100, -19, 43, 7, -115, 29, 94}), strY);
                }
            }
            JSONObject jSONObject = new JSONObject(G(strA, map));
            if (jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{102, 41, 126, 123, 118, 101}, new byte[]{21, 93, 31, 15, 3, 22, -24, 55})) == 200 && jSONObject.getInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-81, -87, -87, -57}, new byte[]{-52, -58, -51, -94, 65, -87, 115, -17})) == 0) {
                return com.github.catvod.spider.merge.KI.e.h(jSONObject.optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{7, 22, -114, -88}, new byte[]{99, 119, -6, -55, 64, -115, 91, 63})).optJSONObject(0).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-52, -118, 89, 119, -13, 35, -49, 108, -9, -112, 92, 117}, new byte[]{-88, -27, 46, 25, -97, 76, -82, 8})));
            }
            return com.github.catvod.spider.merge.KI.e.a(jSONObject.getString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-41, -14, 30, 26, 42, -23, -70}, new byte[]{-70, -105, 109, 105, 75, -114, -33, 126})));
        } catch (Exception e) {
            return com.github.catvod.spider.merge.KI.e.a(e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r12v49, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final com.github.catvod.spider.merge.KI.e<List<String>> w(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                J(str);
                com.github.catvod.spider.merge.KI.e<String> eVarL = l(str, str2, str3, Boolean.TRUE);
                if (eVarL.b() != 0) {
                    com.github.catvod.spider.merge.KI.e<List<String>> eVarA = com.github.catvod.spider.merge.KI.e.a(eVarL.c());
                    if (!TextUtils.isEmpty(str)) {
                        n();
                    }
                    return eVarA;
                }
                String strC = eVarL.c();
                String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{12, -80, -29, 24, 27, -11, 10, 32, 0, -74, -2, 30, 13, -30, 85, 108, 74, -75, -30, 9, 26, -92, 11, 108, 10, -21, -90, 71, 11, -93, 74, 122, 0, -96, -27, 1, 30, -86, 10, 105, 13, -88, -14, 71, 30, -3, 10, 127, 8, -91, -18, 87, 24, -67, 24, 122, 7, -76, -27, 7, 78, -87, 87, 50, 20, -89, -79, 29, 11, -112, 85, 110, 22, -91, -6, 55, 27, -69, 87, 50}, new byte[]{100, -60, -105, 104, 104, -49, 37, 15});
                HashMap map = new HashMap();
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-88, -113, 41}, new byte[]{-50, -26, 77, -115, 2, -49, 31, -94}), strC);
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-18, 4, -18, 18, 14, 103, 39, -93, -13, 15, -18}, new byte[]{-100, 97, -99, 125, 98, 18, 83, -54}), com.github.catvod.spider.merge.XI.f.a(new byte[]{113, -55, -117, -125, -102, 112, 27, -49, 112, -47, -43, -122, -110, 123, 95, -113, 108, -45, -119, -117, -119, 48, 5, -56, 51, -110, -110}, new byte[]{31, -90, -7, -18, -5, 28, 55, -93}));
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, -11, 62, 66, -85, -127, 106, 123}, new byte[]{-9, -128, 78, 50, -60, -13, 30, 8}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, 24, -79, 19, 0, 34, 92, 41, -111}, new byte[]{-87, 117, -63, 39, 44, 79, 111, 92}));
                JSONObject jSONObject = new JSONObject(G(strA, map));
                if (jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-94, -78, -29, -95, 122, 32, -122}, new byte[]{-49, -41, -112, -46, 27, 71, -29, -96})).contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{12, 84, 59, 122, 93, 36, -63, 42, 74, 91, 56, 106, 19, 46}, new byte[]{106, 61, 87, 31, 125, 74, -82, 94}))) {
                    com.github.catvod.spider.merge.KI.e<List<String>> eVarH = com.github.catvod.spider.merge.KI.e.h(new ArrayList());
                    if (!TextUtils.isEmpty(str)) {
                        n();
                    }
                    return eVarH;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{120, -30, 91, -86}, new byte[]{28, -125, 47, -53, -3, 71, 17, -121})).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-39, 85, 0, -70, 16, -64, 106, 108, -36, 72}, new byte[]{-81, 60, 100, -33, 127, -97, 6, 5}));
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject.optBoolean(com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 120, -106, -22, -97, -9, 89, -10, 100, 126}, new byte[]{8, 27, -11, -113, -20, -124, 56, -108}))) {
                        arrayList.add((String) this.g.get(jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-102, 76, 126, 22, 86, 71, -122, 1, -121, 71}, new byte[]{-24, 41, 13, 121, 58, 50, -14, 104}))));
                        arrayList.add(jSONObjectOptJSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{49, -16, 111, -59, -92, 122, 46, -126, 33, -10}, new byte[]{71, -103, 11, -96, -53, 37, 71, -20})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, -23, 47}, new byte[]{-20, -101, 67, 111, -75, 81, 82, -22})));
                    }
                }
                com.github.catvod.spider.merge.KI.e<List<String>> eVarW = (bool.booleanValue() && arrayList.size() == 0) ? w(str, strC, str3, Boolean.FALSE) : com.github.catvod.spider.merge.KI.e.h(arrayList);
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return eVarW;
            } catch (Exception e) {
                e.printStackTrace();
                com.github.catvod.spider.merge.KI.e<List<String>> eVarH2 = com.github.catvod.spider.merge.KI.e.h(new ArrayList());
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return eVarH2;
            }
        } finally {
        }
    }

    public final String y(String str) {
        try {
            String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{2, 90, 24, 53, -114, 53, 49, -80, 14, 92, 5, 51, -104, 34, 109, -16, 9, 71, 13, 41, -48, 110, 110, -10, 68, 95, 25, 36, -113, 100, 48, -4, 4, 1, 93, 106, -98, 99, 113, -22, 14, 74, 30, 44, -117, 106, 49, -4, 2, 79, 24, 106, -98, 96, 112, -23, 69, 67, 31, 34, -46, 109, 127, -21, 9, 70, 51, 54, -104, 97, 122, -96, 26, 92, 81, 48, -98, 127, 108, -16, 76, 72, 30, 120, -115, 108, 56, -20, 19, 93, 81, 50, -108, 97, 45, -83, 76, 88, 9, 120, -50, 33, 47, -86, 68, 30, 74, 48, -119, 50}, new byte[]{106, 46, 108, 69, -3, 15, 30, -97}) + this.e + com.github.catvod.spider.merge.XI.f.a(new byte[]{64, -59, 38, -50, -118, -51}, new byte[]{102, -94, 83, -89, -18, -16, -119, 13});
            String strT = t(str);
            if (TextUtils.isEmpty(strT)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, -111, 12, 21, 50, -127, -100, 43, -14, -46, 27, 19, 51, -103, -118, 123, -69, -24, 20, 88, 63, -104, -105, 47, -28, -63, 28, 27, 40, -98, -106, 55, -34, -38, 11, 88, 102, -43, -54, 105, -79, -125, 95, 74, 108, -57, -54, 109, -77, -118, 91, 74, 110, -60, -63, 106, -93, -97, 77, 25, 51, -103, -113, 60, -13, -64, 14, 14, 53, -104, -105, 6, -11, -54, 31, 31, 126, -51, -54, 117, -93, -43, 6, 22, 57, -88, -107, 48, -14, -57, 77, 64, 7, -116, -37, 58, -19, -38, 10, 20, 40, -88, -100, 33, -11, -63, 14, 88, 102, -116, -37, 61, -28, -59, 6, 25, 57, -88, -108, 54, -27, -42, 3, 88, 102, -43, -83, 15, -61, -4, 55, 88, 112, -43, -98, 43, -18, -58, 31, 37, 53, -109, -37, 99, -93, -41, 14, 67, 56, -58, -56, 63, -25, -98, 90, 27, 105, -107, -44, 109, -29, -125, 93, 87, 100, -60, -102, 58, -84, -126, 88, 28, 106, -106, -52, 111, -27, -118, 86, 25, 58, -43, -43, 123, -19, -36, 12, 27, 48, -88, -108, 42, -26, -20, 6, 30, 126, -51, -37, 97, -30, -41, 87, 28, 107, -107, -53, 116, -73, -43, 89, 74, 113, -61, -97, 107, -29, -98, 86, 67, 62, -62, -44, 104, -28, -124, 9, 24, 57, -106, -99, 106, -72, -127, 87, 88, 33, -37, -37, 58, -18, -35, 27, 31, 50, -125, -37, 99, -93}, new byte[]{-127, -77, 111, 122, 92, -9, -7, 89}) + strT + com.github.catvod.spider.merge.XI.f.a(new byte[]{80, 50, 90, 24, -107, -54, -123, -100, 80}, new byte[]{114, 30, 120, 126, -4, -82, -89, -90}) + str + com.github.catvod.spider.merge.XI.f.a(new byte[]{16, 82, -116, -92, -50, -20, 123, 118, 85, 74, -114, -18, -123, -19, 123, 38, 8, 31, -84, -43, -64, -93, 108, 97, 70, 90, -93, -26, -77, -20, 109, 99, 109, 78, -94, -41, -128, -24, 109, 112, 16, 21, -32, -11}, new byte[]{50, 47, -47, -120, -20, -127, 30, 4}));
            Map<String, String> mapU = u();
            ((HashMap) mapU).put(com.github.catvod.spider.merge.XI.f.a(new byte[]{81, -70, -7, 101, 103, 40, 74, -123, 70, -84, -25, 116}, new byte[]{18, -43, -105, 17, 2, 70, 62, -88}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, 39, -27, 68, -110, -20, 7, -79, -101, 56, -5, 7, -111, -4, 9, -85}, new byte[]{-14, 87, -107, 40, -5, -113, 102, -59}));
            String strOptString = new JSONObject(com.github.catvod.spider.merge.nU.c.g(str2, jSONObject.toString(), mapU).a()).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{62, -32, -118, 111}, new byte[]{90, -127, -2, 14, -91, 107, -53, 6})).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-98, 44, 64, -123, -118, -44, 106, 24, -119, 42, 65, -99, -100}, new byte[]{-3, 67, 46, -13, -17, -90, 25, 121})).optJSONObject(0).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-37, -111, -80, 57, 84, 118, 34, -10, -55}, new byte[]{-67, -8, -36, 92, 11, 26, 75, -123})).optJSONObject(0).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{94, -38, 13, 67, -95, 51, 59, -110, 88, -45, 23}, new byte[]{45, -65, 99, 39, -2, 65, 94, -31})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, 97, -28, -29, 17, -120, 95, -103, -115, 74, -30, -11}, new byte[]{-22, 21, -117, -111, 116, -41, 50, -22}));
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return new JSONObject(com.github.catvod.spider.merge.nU.c.g(com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, -96, 92, 36, 89, 23, 56, 11, -77, -90, 65, 34, 79, 0, 100, 75, -76, -67, 73, 56, 7, 76, 103, 77, -7, -91, 93, 53, 88, 70, 57, 71, -71, -5, 25, 123, 73, 65, 120, 81, -77, -80, 90, 61, 92, 72, 56, 71, -65, -75, 92, 123, 73, 66, 121, 82, -8, -78, 65, 56, 79, 2, 118, 71, -90, -95, 65, 38, 79, 114, 115, 72, -120, -96, 71, 63, 79, 67, 40, 84, -91, -23, 93, 55, 90, 95, 120, 2, -79, -90, 21, 36, 73, 11, 100, 93, -92, -23, 95, 61, 68, 30, 37, 2, -95, -79, 21, 103, 4, 28, 34, 10, -25, -14, 93, 32, 23}, new byte[]{-41, -44, 40, 84, 42, 45, 23, 36}) + this.e + com.github.catvod.spider.merge.XI.f.a(new byte[]{-106, -64, 29, -59, -116, 120}, new byte[]{-80, -89, 104, -84, -24, 69, 26, -111}), new JSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-119, -128, 37, -1, -5, 103, 95, 99, -127, -61, 50, -7, -6, 127, 101, 120, -106, -128, 124, -78, -90, 33, 10, 33, -62, -110, 118, -96, -90, 37, 8, 40, -58, -110, 116, -93, -83, 34, 24, 61, -48, -63, 41, -2, -29, 116, 72, 98, -109, -42, 47, -1, -5, 78, 78, 104, -126, -57, 100, -86, -90, 61, 24, 124, -127, -59, 25, -7, -15, 51, 0, 51}, new byte[]{-14, -94, 70, -112, -107, 17, 58, 17}) + strOptString + com.github.catvod.spider.merge.XI.f.a(new byte[]{40, -110}, new byte[]{10, -17, 60, -126, -3, 123, 106, -9})).toString(), mapU).a()).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 108, -6, -32}, new byte[]{121, 13, -114, -127, 100, 52, -64, -20})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-35, -17, 114, 126, -81}, new byte[]{-87, -128, 25, 27, -63, 13, -45, 118}));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final com.github.catvod.spider.merge.KI.k z(String str, String str2, String str3) {
        if (TextUtils.isEmpty(J(str))) {
            return com.github.catvod.spider.merge.pT.C.e();
        }
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.kT.a aVar = new com.github.catvod.spider.merge.kT.a();
        aVar.j(str2);
        E(str, aVar, arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.pT.C.e();
        }
        this.d.d(arrayList);
        List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, 62, 13, 2, 33, 93, 61, 52, 45, 125, 33, 92}, new byte[]{-78, -102, -75, -25, -92, -42, -40, -70}), com.github.catvod.spider.merge.XI.f.a(new byte[]{78, 70, -63, -7, 79, -108, 0, 101, 47, 10, -34, -108}, new byte[]{-85, -30, 121, 28, -54, 31, -23, -57}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.kT.a aVar2 = (com.github.catvod.spider.merge.kT.a) it.next();
            if (!TextUtils.isEmpty(aVar2.e())) {
                StringBuilder sb = new StringBuilder();
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-95}, new byte[]{-6, 86, -104, 45, -105, 35, 69, 33}));
                sb.append(aVar2.e().trim());
                strA = C0925t.a(new byte[]{63}, new byte[]{98, 20, 4, -87, 22, -20, -30, 126}, sb);
            }
            StringBuilder sbB = C0925t.b(strA);
            sbB.append(aVar2.c());
            sbB.append(aVar2.g());
            v.c(new byte[]{78}, new byte[]{106, -15, 46, 33, -12, -62, -16, -54}, sbB, str);
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{38}, new byte[]{13, 63, -123, 45, 50, -61, 23, 98}));
            sbB.append(aVar2.b());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{22}, new byte[]{61, -19, 102, -36, -4, 22, 96, 51}));
            sbB.append(aVar2.f());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{34, -46, -107, -96}, new byte[]{74, -90, -31, -48, -81, -105, 48, -57}))) {
                StringBuilder sbB2 = C0925t.b(string);
                v.c(new byte[]{0}, new byte[]{43, -22, 103, -86, 4, -109, 53, -106}, sbB2, str3);
                sbB2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{69}, new byte[]{110, 66, -10, 80, 90, 96, 42, 54}));
                sbB2.append(aVar2.c());
                string = sbB2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93}, new byte[]{-128, 8, -118, -53, 9, -23, 125, -19}), arrayList2));
        }
        com.github.catvod.spider.merge.KI.k kVar = new com.github.catvod.spider.merge.KI.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(this.d.b() == null ? com.github.catvod.spider.merge.XI.f.a(new byte[]{9, -67, -37, 23, 104, -57, 80, -47, 103, -38, -50, 99, 2, -63, 53, -111, 70, -125, -119, 86, 86, -71, 12, -45}, new byte[]{-31, 51, 108, -14, -25, 81, -72, 118}) : this.d.b().b());
        kVar.k(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-24, -13, 59}, new byte[]{-52, -41, 31, -53, 4, -83, 23, -114}), arrayList3));
        kVar.j(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{121, -80, -101}, new byte[]{93, -108, -65, 124, 62, -102, 95, -38}), listAsList));
        kVar.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-105, 17, 58, 95, -82, 79, 116, -2, -29, 82, 25, 34}, new byte[]{114, -75, -126, -70, 43, -60, -109, 67}));
        return kVar;
    }
}
