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
import com.github.catvod.spider.merge.c.C0139e;
import com.github.catvod.spider.merge.k.C0182a;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0217j;
import com.github.catvod.spider.merge.p.C0219l;
import com.github.catvod.spider.merge.p.C0221n;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0110L {
    private static final String i = C0098a.a(new byte[]{55, -110, 124, 29, 103, 95, -87, -127, 79, -45, 54, 84, 35, 126, -87, -51, 19, -109, 114, 27, 120, 91, -13, -114, 51, -109, 114, 17, 103, 19, -123, -49, 25, -35, 73, 39, 43, 107, -24, -97, 74, -94, 55, 65, 84, 4, -31, -114, 59, -115, 118, 24, 110, 100, -83, -52, 49, -108, 114, 91, 62, 0, -1, -128, 73, -53, 38, 92, 64, 123, -100, -29, 54, -47, 38, 24, 98, 88, -83, -114, 61, -104, 101, 31, 100, 26, -24, -33, 15, -100, 116, 31, 38, 80, -92, -63, 15, -103, 43, 16, 121, 90, -66, -53, 85, -50, 40, 68, 37, 2, -24, -19, 18, -113, 105, 25, 110, 28, -7, -98, 74, -45, 54, 90, 63, 11, -15, -104, 84, -52, 48, 68, 43, 118, -92, -53, 25, -119, 116, 27, 101, 28, -7, -106, 84, -50, 40, 65, 37, 2, -6, -125, 27, -51, 53, 76, 109, 4, -86, -103, 67, -59, 38, 39, 106, 85, -87, -36, 19, -46, 51, 71, 60, 29, -5, -104, 90, -66, 110, 21, 101, 93, -83, -62, 85, -115, 101, 31, 96, 108, -89, -38, 18, -104, 116, 43, 104, 91}, new byte[]{122, -3, 6, 116, 11, 51, -56, -82});
    private static Map<String, com.github.catvod.spider.merge.k.e> j;
    public static final /* synthetic */ int k = 0;
    private String a;
    private ScheduledExecutorService b;
    private String c;
    private com.github.catvod.spider.merge.k.e d;
    private String e;
    private AlertDialog f;
    private final Map<String, String> g;
    private C0217j h;

    C0110L() {
        Init.checkPermission();
        this.e = C0197c.b(C0098a.a(new byte[]{124, 107, -100, -51, 57, 31, -72, 14, 112, 109, -127, -53, 47, 8, -25, 66, 58, 110, -99, -36, 56, 78, -71, 66, 122, 48, -39, -110, 41, 73, -8, 84, 112, 123, -102, -44, 60, 64, -72, 71, 125, 115, -115}, new byte[]{20, 31, -24, -67, 74, 37, -105, 33}), u()).a();
        new ArrayList();
        HashMap map = new HashMap();
        this.g = map;
        map.put(C0098a.a(new byte[]{-76, 36}, new byte[]{-128, 79, 26, 119, 112, 127, 41, 79}), C0098a.a(new byte[]{-18, -106}, new byte[]{-38, -35, -27, -61, -26, 81, -49, 12}));
        map.put(C0098a.a(new byte[]{73, 100}, new byte[]{123, 15, -41, -37, -14, 12, 97, 122}), C0098a.a(new byte[]{-56, -102}, new byte[]{-6, -47, -100, -88, -105, 56, -89, 127}));
        map.put(C0098a.a(new byte[]{-126, -99, 4, 18, 38}, new byte[]{-15, -24, 116, 119, 84, 124, -78, -113}), C0098a.a(new byte[]{-70, -98, 71, -123, 109, -80}, new byte[]{82, 40, -62, 99, -43, 53, 82, 24}));
        map.put(C0098a.a(new byte[]{11, -46, 56, -13}, new byte[]{99, -69, 95, -101, -80, 27, -82, -8}), C0098a.a(new byte[]{-122, -34, -77, 38, 25, 111}, new byte[]{111, 117, 43, -64, -95, -22, -44, 120}));
        map.put(C0098a.a(new byte[]{-70, 99, -33}, new byte[]{-42, 12, -88, 83, 9, 29, -89, -25}), C0098a.a(new byte[]{-23, -14, 122, -112, -66, -74}, new byte[]{15, 71, -5, 119, 43, 51, -72, 39}));
        map.put(C0098a.a(new byte[]{-56, -74, 116, -99, 103, -10}, new byte[]{-90, -39, 6, -16, 6, -102, 67, 85}), C0098a.a(new byte[]{-92, -110, -127, 1, 14, 61}, new byte[]{64, 42, 1, -23, -122, -111, -42, -112}));
        j = new HashMap();
        SpiderDebug.log(C0098a.a(new byte[]{78, 117, -67, 7, 124, 89, 50, -88, 63, 73, -78, 28, 99}, new byte[]{31, 0, -36, 117, 23, 0, 71, -58}));
    }

    private void A() {
        int iIndexOf = this.a.indexOf(C0098a.a(new byte[]{-57, 19, -124, 5, 55}, new byte[]{-104, 76, -12, 112, 68, -14, -56, 60}));
        if (iIndexOf != -1) {
            int iIndexOf2 = this.a.indexOf(C0098a.a(new byte[]{17}, new byte[]{42, -22, -45, -35, -62, -70, 51, -63}), iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = this.a.length();
            }
            this.a = this.a.substring(iIndexOf, iIndexOf2).trim();
        }
    }

    private JSONObject B(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt(C0098a.a(new byte[]{-48, -110, 2, -92}, new byte[]{-77, -3, 102, -63, -9, 22, 69, -101})) == 32003) {
                C0219l.b(C0098a.a(new byte[]{67, -123, -104, 44, 57, -100, -16, 86, 31, -56, -89, 70, 89, -96, -89, 31, 29, -82, -57, 93, 20, -14, -69, 116, -118, 1, -56, 102, 11, -15, -100, 115, 67, -85, -120, 44, 52, -73, -4, 97, 2}, new byte[]{-90, 33, 32, -55, -68, 23, 21, -8}));
                return null;
            }
            j = new HashMap();
            if (TextUtils.isEmpty(J(str))) {
                return null;
            }
            K(str);
            String strF = "";
            Iterator<C0182a> it = this.d.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0182a next = it.next();
                String strB = next.b();
                if (strB == str2 || (strB != null && strB.equals(str2))) {
                    strF = next.f();
                    break;
                }
            }
            map.put(C0098a.a(new byte[]{-27, -68, 120, -83, 59, 116}, new byte[]{-106, -56, 23, -58, 94, 26, -111, 12}), this.d.b().a());
            map.put(C0098a.a(new byte[]{6, 114, -45, 125, -12, -91, -51, 78, 14, 68, -37, 75, -13, -66}, new byte[]{96, 27, -73, 34, -128, -54, -90, 43}), Collections.singletonList(strF));
            return new JSONObject(G(C0098a.a(new byte[]{-94, 24, -2, 111, 117, 82, -44, 67, -82, 30, -29, 105, 99, 69, -117, 15, -28, 29, -1, 126, 116, 3, -43, 15, -92, 67, -69, 48, 101, 4, -108, 25, -82, 8, -8, 118, 112, 13, -44, 31, -94, 13, -8, 122, 41, 27, -109, 13, -72, 9, -6, 126, 97, 13, -44, 31, -85, 26, -17, 32, 118, 26, -58, 25, -87, 28, -8, 112, 32, 14, -119, 81, -70, 15, -84, 106, 101, 55, -117, 13, -72, 13, -25, 64, 117, 28, -119, 81, -20, 51, -43, 107, 59}, new byte[]{-54, 108, -118, 31, 6, 104, -5, 108}) + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private boolean C() {
        try {
            JSONObject jSONObject = new JSONObject(C0197c.l(C0098a.a(new byte[]{-114, -65, -1, 127, 21, -115, 57, 105, -126, -71, -30, 121, 3, -102, 102, 37, -56, -70, -2, 110, 20, -36, 56, 37, -120, -28, -70, 32, 5, -37, 121, 51, -126, -81, -7, 102, 16, -46, 57, 43, -125, -90, -23, 106, 20, -120, 102, 52, -37, -66, -24, 127, 20, -40, 48, 32, -108, -10, -5, 108, 64, -62, 117, 25, -106, -86, -7, 110, 11, -24, 101, 50, -108, -10, -83, 105, 3, -61, 117, 46, -71, -72, -2, 109, 21, -44, 100, 47, -124, -82, -74, 123, 20, -62, 115, 96, -71, -88, -29, 50, 14, -40, 123, 35, -64, -83, -18, 123, 5, -33, 73, 47, -126, -82, -27, 123, 15, -61, 111, 123, -110, -71, -2, 106}, new byte[]{-26, -53, -117, 15, 102, -73, 22, 70}), u()));
            if (!C0098a.a(new byte[]{69, -57, 117}, new byte[]{119, -9, 69, -30, -17, -49, -70, -24}).equals(jSONObject.optString(C0098a.a(new byte[]{-20, -115, -73, -52, 123, -51}, new byte[]{-97, -7, -42, -72, 14, -66, -14, -40})))) {
                throw new Exception();
            }
            this.c = jSONObject.optJSONObject(C0098a.a(new byte[]{119, 61, 45, 93}, new byte[]{19, 92, 89, 60, -22, 6, -23, -83})).optString(C0098a.a(new byte[]{-6, -18, -14, -3, -57, 97, 114, -58, -18, -5, -6}, new byte[]{-105, -117, -97, -97, -94, 19, 45, -78}));
            if (TextUtils.isEmpty(C0207D.q(C0098a.a(new byte[]{122, 8, -42, 89, -72, -27}, new byte[]{84, 121, -93, 56, -54, -114, -70, -117})))) {
                A();
                C0207D.u(C0098a.a(new byte[]{-99, 103, 56, 48, -18, 86}, new byte[]{-77, 22, 77, 81, -100, 61, 58, -88}), this.a);
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
            JSONObject jSONObject = new JSONObject(C0197c.k(C0098a.a(new byte[]{45, -94, 9, -107, 126, -112, -58, 90, 48, -71, 13, -53, 124, -33, -120, 7, 46, -8, 30, -117, 34, -55, -120, 6, 106, -73, 23, -124, 117, -123, -114, 16, 49, -123, 24, -105, 123, -61, -118, 16, 17, -65, 30, -114, 104, -34, -85, 12, 20, -92, 30, -118, 105, -49, -67, 26, 46, -77, 19, -38, 110, -58, -128, 16, 43, -94, 34, -116, 105, -105, -36, 70, 119, -16, 11, -40, 60, -124, -37, 83, 49, -71, 22, -128, 99, -105}, new byte[]{69, -42, 125, -27, 13, -86, -23, 117}) + str));
            if (C0098a.a(new byte[]{-94, 14}, new byte[]{-51, 101, -73, -44, -51, 44, 17, -78}).equals(jSONObject.optString(C0098a.a(new byte[]{-39, 91, 39, 119, -41, 42, -64}, new byte[]{-76, 62, 84, 4, -74, 77, -91, 24})))) {
                String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{-107, 84, -94, 25}, new byte[]{-15, 53, -42, 120, 82, 74, -93, 60})).optJSONObject(C0098a.a(new byte[]{98, 88, -127, -11, -92, 76, -55}, new byte[]{15, 61, -20, -105, -63, 62, -70, -74})).optString(C0098a.a(new byte[]{-52, 48, -81, 77, 74, 80, 52, -88, -53, 60, -66, 80, 70, 71}, new byte[]{-65, 85, -35, 59, 35, 51, 81, -9}));
                HashMap map = new HashMap();
                map.put(C0098a.a(new byte[]{81, 76, 98, -67, -62, -32, -66, 64, 106, 75}, new byte[]{4, 63, 7, -49, -17, -95, -39, 37}), C0098a.a(new byte[]{-3, -65, -7, 81, -99, 58, 4, 108, -123, -2, -77, 24, -39, 1, 12, 45, -44, -65, -12, 75, -47, 24, 49, 99, -122, -2, -78, 3, -47, 1, 42, 20, -122, -28, -86, 24, -80, 38, 21, 47, -43, -121, -26, 90, -70, 63, 17, 108, -123, -29, -76, 22, -62, 96, 69, 107, -5, -104, -41, 117, -67, 122, 69, 47, -39, -69, -26, 24, -74, 51, 6, 40, -33, -7, -93, 123, -103, 36, 10, 46, -43, -1, -80, 0, -33, 102, 75, 113, -127, -30, -74, 22, -64, 100, 87, 99, -29, -79, -27, 89, -125, 63, 74, 118, -125, -25, -83, 11, -57, 118, 54, 6, -112, -30, -83, 96, -47, 27, 0, 55, -47, -125, -15, 24, -64, 120, 85}, new byte[]{-80, -48, -125, 56, -15, 86, 101, 67}));
                map.put(C0098a.a(new byte[]{100, -5, 102, 123, 37, -30}, new byte[]{37, -104, 5, 30, 85, -106, 74, -62}), C0098a.a(new byte[]{-120, -34, -43, 6, -1, 56, 26, 81, -128, -63, -53, 69, -4, 40, 20, 75, -59, -114, -47, 15, -18, 47, 84, 85, -123, -49, -52, 4, -70, 123, 81, 10, -61}, new byte[]{-23, -82, -91, 106, -106, 91, 123, 37}));
                map.put(C0098a.a(new byte[]{-85, 35, -41, -13, 102, -76, 126}, new byte[]{-7, 70, -79, -106, 20, -47, 12, -64}), C0098a.a(new byte[]{-108, 81, -92, -31, 33, 24, -104, 41, -116, 68, -66, -65, 35, 87, -42, 116, -105, 11, -77, -1, 125}, new byte[]{-4, 37, -48, -111, 82, 34, -73, 6}));
                List listHeaders = C0197c.e(C0098a.a(new byte[]{61, -87, 23, 72, 60, -14, 81, -26, 37, -68, 13, 22, 62, -67, 31, -69, 62, -13, 0, 86, 96, -87, 29, -86, 58, -88, 13, 76, 96, -95, 16, -81, 58, -30, 16, 76, 114}, new byte[]{85, -35, 99, 56, 79, -56, 126, -55}) + strOptString + C0098a.a(new byte[]{-96, 40, -52, 98, 96, 2, -103, 20}, new byte[]{-122, 68, -69, 95, 19, 97, -8, 122}), map).headers(C0098a.a(new byte[]{-42, -10, 39, -34, -33, 18, -120, 110, -52, -10}, new byte[]{-91, -109, 83, -13, -68, 125, -25, 5}));
                String str2 = "";
                Iterator it = listHeaders.iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(C0098a.a(new byte[]{111}, new byte[]{84, -20, -102, -83, -99, 109, 23, 78}))[0] + C0098a.a(new byte[]{-52}, new byte[]{-9, -2, -35, 117, 47, 24, -116, -23});
                }
                try {
                    L(str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void E(String str, C0182a c0182a, List<C0182a> list) {
        if (this.d.b() == null) {
            return;
        }
        String strB = c0182a.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{66, 31, 123, -14, -21, 30, -71, -80, 78, 25, 102, -12, -3, 9, -26, -4, 4, 26, 122, -29, -22, 79, -72, -4, 68, 68, 62, -83, -5, 72, -7, -22, 78, 15, 125, -21, -18, 65, -71, -20, 66, 10, 125, -25, -73, 87, -2, -2, 88, 14, 127, -29, -1, 65, -71, -5, 79, 31, 110, -21, -12, 27, -26, -19, 23, 30, 108, -14, -22, 75, -80, -7, 88, 86, 127, -31, -66, 81, -11, -64, 90, 10, 125, -29, -11, 123, -27, -21, 88, 86, 41, -14, -17, 64, -55, -10, 78, 86}, new byte[]{42, 107, 15, -126, -104, 36, -106, -97}, sb, str);
            sb.append(C0098a.a(new byte[]{44, -39, 6, -51, -68, -29, 47, -82}, new byte[]{10, -86, 114, -94, -41, -122, 65, -109}));
            sb.append(URLEncoder.encode(this.d.b().a()));
            v.a(new byte[]{30, -80, -105, -14, 17, -41, -11, -41, 92, -3}, new byte[]{56, -64, -13, -101, 99, -120, -109, -66}, sb, strB);
            sb.append(C0098a.a(new byte[]{16, -56, 69, 17, -29, -96, 109, -3, 16, -15, 90, 2, -25, -96, 109}, new byte[]{54, -82, 42, 99, -128, -59, 80, -51}));
            sb.append(i2);
            sb.append(C0098a.a(new byte[]{6, -119, -40, -68, -16, -65, -69}, new byte[]{32, -42, -85, -43, -118, -38, -122, -37}));
            sb.append(100);
            String strQ = q(C0133t.b(new byte[]{-125, -20, 40, 23, 5, -112, 26, -87, -52, -33, 62, 39, 3, -99, 87, -86, -97, -46, 40, 27, 91, -126, 78, -93, -64, -20, 53, 25, 26, -127, 29, -82, -42, -48}, new byte[]{-91, -77, 91, 120, 119, -28, 39, -49}, sb));
            for (C0182a c0182a2 : ((com.github.catvod.spider.merge.k.c) C0132s.a(strQ, com.github.catvod.spider.merge.k.c.class)).a().a()) {
                if (c0182a2.h()) {
                    arrayList.add(c0182a2);
                } else if ((c0182a2.i() && c0182a2.a() == 1) || (c0182a2.i() && C0207D.k().contains(c0182a2.d()))) {
                    if (!this.d.b().b().equals(c0182a.c())) {
                        c0182a2.k(c0182a.c());
                    }
                    arrayList2.add(c0182a2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strQ).getJSONObject(C0098a.a(new byte[]{47, -75, -121, -10, 114, 116, 52, -87}, new byte[]{66, -48, -13, -105, 22, 21, 64, -56}));
                int i3 = jSONObject.getInt(C0098a.a(new byte[]{-57, -40, 108, 117, 78, 70}, new byte[]{-104, -84, 3, 1, 47, 42, 72, 89}));
                int i4 = jSONObject.getInt(C0098a.a(new byte[]{-99, -67, 89, -18, -7, 116}, new byte[]{-62, -34, 54, -101, -105, 0, 94, -106}));
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
            E(str, (C0182a) it.next(), list);
        }
    }

    private String G(String str, Map<String, Object> map) {
        C0199e c0199eG = C0197c.g(str, new JSONObject(map).toString(), u());
        List<String> list = c0199eG.c().get(C0098a.a(new byte[]{-6, 90, 18, 65, 8, 46, 65, 118, -32, 90}, new byte[]{-119, 63, 102, 108, 107, 65, 46, 29}));
        if (!(list == null) && list.size() > 0) {
            String str2 = this.a;
            String str3 = "";
            try {
                String str4 = list.get(0).split(C0098a.a(new byte[]{124}, new byte[]{71, -43, -41, -8, -48, -97, -73, -19}))[0];
                String str5 = str4.split(C0098a.a(new byte[]{61}, new byte[]{0, 113, -99, 46, 48, -8, -120, 88}))[0];
                String str6 = str4.split(C0098a.a(new byte[]{-32}, new byte[]{-35, 125, 118, -54, -2, -112, 7, 69}))[1];
                String string = "";
                for (String str7 : str2.split(C0098a.a(new byte[]{73}, new byte[]{114, -97, -48, -6, -37, -73, 71, 112}))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + C0098a.a(new byte[]{97}, new byte[]{90, -58, 23, 19, 64, 115, 44, -6}));
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.a = str3;
        }
        return c0199eG.a();
    }

    private String I(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = C0098a.a(new byte[]{26, -8, 125, 15, -68, 106}, new byte[]{84, -73, 47, 66, -3, 38, 80, -50});
            }
            HashMap<String, Integer> mapX = x();
            int iIntValue = mapX.get(C0098a.a(new byte[]{89, -112, -57, 98, -99, -102, 27}, new byte[]{45, -8, -75, 7, -4, -2, 104, 32})).intValue();
            int iIntValue2 = mapX.get(C0098a.a(new byte[]{115, -38, 41, 78, -52, 113, 123, 20, 117}, new byte[]{16, -78, 92, 32, -89, 2, 18, 110})).intValue();
            SpiderDebug.log(C0098a.a(new byte[]{87, 10, -97, 46, 25, 88, -23, 81, 66, 23, -48, 59, 5, 99, -30, 80, 85, 11, -104, 63, 16, 46, -18, 84, 74, 29, -54, 118}, new byte[]{39, 120, -16, 86, 96, 14, -128, 53}) + this.c + C0098a.a(new byte[]{50, -70, -72, -5, 41, -88, 72, -89, 40, -18}, new byte[]{18, -50, -48, -119, 76, -55, 44, -44}) + iIntValue + C0098a.a(new byte[]{-72, -54, 75, -120, 0, -89, -98, -56, -30, -52, 25, -35}, new byte[]{-104, -87, 35, -3, 110, -52, -19, -95}) + iIntValue2);
            return String.format(Proxy.getUrl() + C0098a.a(new byte[]{-111, -127, 26, 103, -28, 14, 115, -11, -38, -100, 5, 63, -72, 20, 115, -73, -53, -118, 83, 41, -20, 22, 127, -18, -33, -112, 20, 40, -18, 68, 121, -78, -38, -128, 72, 127, -10, 68, 105, -69, -49, -105, 16, 19, -31, 95, 63, -96, -120, -125, 28, 54, -32, 43, 126, -18, -117, -106, 83, 46, -22, 9, 127, -67, -25, -127, 72, 127, -10, 68, 110, -69, -36, -128, 20, 62, -72, 71, 126, -11, -51, -115, 0, 52, -18, 17, 115, -87, -53, -40, 80, 62, -93, 23, 104, -65, -109, -64, 6}, new byte[]{-82, -27, 117, 90, -123, 98, 26, -45}), str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log(C0098a.a(new byte[]{-64, -55, -93, -55, 94, -74, -62, -29, -43, -44, -103, -61, 75, -64, -50, -1, -118}, new byte[]{-80, -69, -52, -79, 39, -32, -85, -121}) + e.getMessage());
            return "";
        }
    }

    private void K(String str) {
        ArrayList arrayList = new ArrayList();
        C0182a c0182a = new C0182a();
        c0182a.j("");
        E(str, c0182a, arrayList);
        this.d.d(arrayList);
    }

    private void N() {
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0119e(this, 1));
    }

    public static void a(C0110L c0110l, JSONObject jSONObject) {
        c0110l.getClass();
        try {
            int iA = C0212e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0213f.c(jSONObject.optString(C0098a.a(new byte[]{121, -52, -70}, new byte[]{12, -66, -42, -62, -25, 19, -125, 49})), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0105G(c0110l, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0107I(c0110l, 0)).show();
            c0110l.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0122h(c0110l, jSONObject, 1));
            C0219l.b(C0098a.a(new byte[]{-71, -25, 53, 78, 32, 22, -83, 112, -7, -83, 38, 18, 120, 44, -63, -60, 16, 56, -14, -118, 123, 32, -31, 2, -34, -57, 102, 16, 17, 78, -15, 80, -74, -24, 3}, new byte[]{81, 72, -126, -86, -99, -87, 74, -28}));
        } catch (Exception unused) {
        }
    }

    public static void b(C0110L c0110l) {
        c0110l.N();
    }

    public static void d(C0110L c0110l) {
        c0110l.o();
        Init.execute(new RunnableC0120f(c0110l, 2));
    }

    public static void e(C0110L c0110l, EditText editText) {
        c0110l.getClass();
        String string = editText.getText().toString();
        c0110l.o();
        Init.execute(new RunnableC0108J(c0110l, string, 0));
    }

    public static void f(C0110L c0110l) {
        c0110l.N();
    }

    public static void g(C0110L c0110l, JSONObject jSONObject) {
        c0110l.getClass();
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{64, -8, -124, 20, 57}, new byte[]{52, -105, -17, 113, 87, -48, -7, 118}));
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0110l.b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0123i(c0110l, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    private boolean i(List list) {
        Exception e;
        String strA;
        HashMap map;
        String strOptString = "";
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                strA = C0098a.a(new byte[]{26, -114, -116, 64, -16, 116, 124, 29, 22, -120, -111, 70, -26, 99, 35, 81, 92, -117, -115, 81, -15, 37, 125, 81, 28, -43, -55, 31, -32, 34, 60, 71, 22, -98, -118, 89, -11, 43, 124, 84, 27, -106, -99, 31, -25, 43, 63, 87, 6, -97, -57, 64, -15, 115, 38, 81, 2, -120, -105, 22, -27, 60, 110, 66, 17, -36, -115, 83, -36, 62, 50, 64, 19, -105, -89, 67, -9, 60, 110}, new byte[]{114, -6, -8, 48, -125, 78, 83, 50});
                map = new HashMap();
                map.put(C0098a.a(new byte[]{9, 51, -55, 86, -111, 98, -51, -32}, new byte[]{111, 90, -91, 51, -3, 11, -66, -108}), list);
                map.put(C0098a.a(new byte[]{114, 0, 72, 25, 122, 49, -23, -120, 113, 17, 79, 6}, new byte[]{23, 120, 43, 117, 15, 85, -116, -41}), new ArrayList());
                map.put(C0098a.a(new byte[]{36, -56, -115, 66, 38, 24, 72, 77, 60, -37, -100}, new byte[]{69, -85, -7, 43, 73, 118, 23, 57}), 2);
            } catch (Exception e2) {
                e = e2;
                y.c(new byte[]{-1, -41, -82, 4, 6, 30, 90}, new byte[]{-101, -78, -62, 97, 114, 123, 96, -84}, new StringBuilder(), e);
                return true;
            }
            try {
                String strG = G(strA, map);
                SpiderDebug.log(C0098a.a(new byte[]{116, 1, -123, -104, -85, -50, 116, 65, 99, 17, -123, -119, -27}, new byte[]{16, 100, -23, -3, -33, -85, 38, 36}) + strG);
                strOptString = new JSONObject(strG).optJSONObject(C0098a.a(new byte[]{-34, 110, -28, -106}, new byte[]{-70, 15, -112, -9, 34, -81, -28, 71})).optString(C0098a.a(new byte[]{73, -36, -121, 106, -105, -74, -77}, new byte[]{61, -67, -12, 1, -56, -33, -41, -93}));
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e3) {
                e = e3;
                y.c(new byte[]{-1, -41, -82, 4, 6, 30, 90}, new byte[]{-101, -78, -62, 97, 114, 123, 96, -84}, new StringBuilder(), e);
                return true;
            }
        }
        if (TextUtils.isEmpty(strOptString)) {
            return i(list);
        }
        return true;
    }

    private C0139e<String> l(String str, String str2, String str3, Boolean bool) {
        try {
            List<C0182a> listC = this.d.c();
            String strF = "";
            if (listC == null || listC.isEmpty()) {
                J(str);
                K(str);
                listC = this.d.c();
            }
            if (listC != null && !listC.isEmpty()) {
                Iterator<C0182a> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0182a next = it.next();
                    if (C0134u.d(next.b(), str2)) {
                        strF = next.f();
                        break;
                    }
                }
            }
            if (strF.isEmpty()) {
                return C0139e.a(C0098a.a(new byte[]{54, 73, -70, -15, -109, -119, 14, 27, 62, 0, -77, -7, -73, -110, 28}, new byte[]{80, 32, -42, -108, -57, -26, 101, 126}));
            }
            String strR = r();
            String str4 = C0098a.a(new byte[]{-101, 43, 66, 38, 127, -29, 1, 56, -105, 45, 95, 32, 105, -12, 94, 116, -35, 46, 67, 55, 126, -78, 0, 116, -99, 112, 7, 121, 111, -75, 65, 98, -105, 59, 68, 63, 122, -68, 1, 100, -101, 62, 68, 51, 35, -86, 70, 118, -127, 58, 70, 55, 107, -68, 1, 100, -110, 41, 83, 105, 124, -85, 19, 98, -112, 47, 68, 57, 42, -65, 92, 42, -125, 60, 16, 35, 111, -122, 94, 118, -127, 62, 91, 9, 127, -83, 92, 42, -43, 0, 105, 34, 49}, new byte[]{-13, 95, 54, 86, 12, -39, 46, 23}) + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{13, 124, 88, 121, -74, 127, 117, 118}, new byte[]{125, 24, 49, 11, -23, 25, 28, 18}), C0098a.a(new byte[]{-108}, new byte[]{-92, -38, -48, -35, 63, -43, 79, -72}));
            map.put(C0098a.a(new byte[]{-103, 86, 51, 79, -92, 58}, new byte[]{-23, 33, 87, 16, -51, 94, -97, -75}), str);
            map.put(C0098a.a(new byte[]{98, 31, 34, -9, -77}, new byte[]{17, 124, 71, -103, -42, 93, 47, -107}), C0098a.a(new byte[]{-21, 70, -112, 60}, new byte[]{-121, 47, -2, 87, -85, 29, 23, 68}));
            map.put(C0098a.a(new byte[]{-17, -83, 120, -17, 114, 69}, new byte[]{-100, -39, 23, -124, 23, 43, -108, -102}), this.d.b().a());
            map.put(C0098a.a(new byte[]{92, 3, 73, 70, 123, -67, 31, 40, 78, 5, 114}, new byte[]{40, 108, 22, 54, 31, -44, 109, 119}), strR);
            map.put(C0098a.a(new byte[]{121, -93, 119, 41, -54, -22, 77, -105}, new byte[]{31, -54, 19, 118, -90, -125, 62, -29}), Collections.singletonList(str2));
            map.put(C0098a.a(new byte[]{41, -63, -51, 29, 54, 1, 119, 39, 33, -9, -59, 43, 49, 26}, new byte[]{79, -88, -87, 66, 66, 110, 28, 66}), Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(G(str4, map));
            if (jSONObject.getInt(C0098a.a(new byte[]{-42, 61, -110, 43}, new byte[]{-75, 82, -10, 78, 42, 102, -64, 89})) == 41017) {
                return C0139e.h(str2);
            }
            if (jSONObject.getInt(C0098a.a(new byte[]{81, -123, 101, -107, -54, 57}, new byte[]{34, -15, 4, -31, -65, 74, -30, -40})) == 200 && jSONObject.getInt(C0098a.a(new byte[]{43, 8, -117, -95}, new byte[]{72, 103, -17, -60, 110, -44, -78, -100})) == 0) {
                String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{-16, 125, -33, 33}, new byte[]{-108, 28, -85, 64, 20, 14, 46, -119})).optString(C0098a.a(new byte[]{-62, 43, -12, -105, 7, -35, -88}, new byte[]{-74, 74, -121, -4, 88, -76, -52, 99}));
                JSONArray jSONArray = new JSONArray();
                int i2 = 0;
                while (i2 < 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0098a.a(new byte[]{-57, -21, -30, -46, -47, 123, -96, -3, -53, -19, -1, -44, -57, 108, -1, -79, -127, -18, -29, -61, -48, 42, -95, -79, -63, -80, -89, -115, -63, 45, -32, -89, -53, -5, -28, -53, -44, 36, -96, -90, -50, -20, -3, -99, -46, 51, -78, -89, -52, -17, -28, -51, -124, 39, -3, -17, -33, -4, -80, -41, -63, 30, -1, -77, -35, -2, -5, -3, -47, 53, -3, -17, -119, -21, -9, -47, -55, 30, -26, -74, -110}, new byte[]{-81, -97, -106, -94, -94, 65, -113, -46}));
                    sb.append(strOptString);
                    sb.append(C0098a.a(new byte[]{-55, 9, 84, -52, -32, -5, -27, 35, -127, 31, 84, -64, -81}, new byte[]{-17, 123, 49, -72, -110, -126, -70, 74}));
                    i2++;
                    sb.append(i2);
                    sb.append(C0098a.a(new byte[]{109, 114, 29, -52, 127}, new byte[]{75, 45, 66, -72, 66, 124, -118, 81}));
                    sb.append(System.currentTimeMillis());
                    String strQ = q(sb.toString());
                    if (new JSONObject(strQ).optInt(C0098a.a(new byte[]{115, -28, 75, -125}, new byte[]{16, -117, 47, -26, -98, -124, -68, 86})) == 32003) {
                        return C0139e.a(C0098a.a(new byte[]{-46, -15, 112, -126, -36, 11, 81, 45, -123, -71, 114, -54, 119, -92, 81, 33, -115, -73, 103, -59, -77, 48, 25, 126, -114, -17, 45, -41, -63, 97, 37, 2}, new byte[]{55, 95, -55, 107, 91, -124, -76, -102}));
                    }
                    jSONArray = new JSONObject(strQ).optJSONObject(C0098a.a(new byte[]{-58, -56, -25, -36}, new byte[]{-94, -87, -109, -67, 31, 2, 64, 31})).optJSONObject(C0098a.a(new byte[]{-124, -62, 56, -41, -22, -23, -61}, new byte[]{-9, -93, 78, -78, -75, -120, -80, -85})).optJSONArray(C0098a.a(new byte[]{-84, 92, 15, -96, 13, 57, 35, 104, -85, 82, 9, -102, 52, 49, 52, 68}, new byte[]{-33, 61, 121, -59, 82, 88, 80, 55}));
                    if (jSONArray.length() > 0) {
                        break;
                    }
                    TimeUnit.SECONDS.sleep(1L);
                }
                return (bool.booleanValue() && jSONArray.length() == 0) ? l(str, str2, str3, Boolean.FALSE) : C0139e.h(jSONArray.optString(0));
            }
            JSONObject jSONObjectB = B(jSONObject, str, str2, map);
            return jSONObjectB == null ? C0139e.a(C0098a.a(new byte[]{-37, 103, -109, 3, 71, -123, 73, 121}, new byte[]{-76, 5, -7, 35, 41, -16, 37, 21})) : jSONObjectB.getInt(C0098a.a(new byte[]{122, -67, -85, -56}, new byte[]{25, -46, -49, -83, -80, -95, 89, 22})) == 41017 ? C0139e.h(str2) : C0139e.a(jSONObjectB.getString(C0098a.a(new byte[]{78, 94, -65, 65, 104, 127, -22}, new byte[]{35, 59, -52, 50, 9, 24, -113, 97})));
        } catch (Exception e) {
            return C0139e.a(e.getMessage());
        }
    }

    private boolean m() {
        String strA;
        ArrayList arrayList = new ArrayList();
        byte b = 8;
        try {
            String strR = r();
            char c = 1;
            byte b2 = 3;
            byte b3 = 4;
            byte b4 = 5;
            byte b5 = 6;
            byte b6 = 7;
            if (strR.equals(C0098a.a(new byte[]{66}, new byte[]{114, 63, 43, -2, -32, -110, 67, 122}))) {
                return false;
            }
            long j2 = C0207D.j();
            int i2 = 1;
            while (true) {
                byte[] bArr = new byte[176];
                bArr[0] = -48;
                bArr[c] = 2;
                bArr[2] = -57;
                bArr[b2] = 82;
                bArr[b3] = 120;
                bArr[b4] = 31;
                bArr[b5] = 89;
                bArr[b6] = 37;
                bArr[b] = -36;
                bArr[9] = b3;
                bArr[10] = -38;
                bArr[11] = 84;
                bArr[12] = 110;
                bArr[13] = b;
                bArr[14] = b5;
                bArr[15] = 105;
                bArr[16] = -106;
                bArr[17] = b6;
                bArr[18] = -58;
                bArr[19] = 67;
                bArr[20] = 121;
                bArr[21] = 78;
                bArr[22] = 88;
                bArr[23] = 105;
                bArr[24] = -42;
                bArr[25] = 89;
                bArr[26] = -126;
                bArr[27] = 13;
                bArr[28] = 104;
                bArr[29] = 73;
                bArr[30] = 25;
                bArr[31] = 127;
                bArr[32] = -36;
                bArr[33] = 18;
                bArr[34] = -63;
                bArr[35] = 75;
                bArr[36] = 125;
                bArr[37] = 64;
                bArr[38] = 89;
                bArr[39] = 108;
                bArr[40] = -47;
                bArr[41] = 26;
                bArr[42] = -42;
                bArr[43] = 13;
                bArr[44] = 120;
                bArr[45] = 74;
                bArr[46] = b3;
                bArr[47] = 126;
                bArr[48] = -121;
                bArr[49] = b5;
                bArr[50] = -63;
                bArr[51] = 31;
                bArr[52] = 126;
                bArr[53] = 70;
                bArr[54] = b5;
                bArr[55] = 120;
                bArr[56] = -41;
                bArr[57] = 80;
                bArr[58] = -43;
                bArr[59] = 80;
                bArr[60] = 54;
                bArr[61] = 85;
                bArr[62] = 21;
                bArr[63] = 44;
                bArr[64] = -51;
                bArr[65] = 21;
                bArr[66] = -20;
                bArr[67] = 82;
                bArr[68] = 106;
                bArr[69] = 87;
                bArr[70] = 23;
                bArr[71] = 103;
                bArr[72] = -25;
                bArr[73] = b4;
                bArr[74] = -57;
                bArr[75] = 80;
                bArr[76] = 54;
                bArr[77] = b2;
                bArr[78] = b5;
                bArr[79] = 110;
                bArr[80] = -47;
                bArr[81] = b3;
                bArr[82] = -20;
                bArr[83] = 68;
                bArr[84] = 98;
                bArr[85] = 65;
                bArr[86] = 75;
                bArr[87] = 47;
                bArr[88] = -53;
                bArr[89] = 80;
                bArr[90] = -20;
                bArr[91] = 82;
                bArr[92] = 106;
                bArr[93] = 66;
                bArr[94] = 19;
                bArr[95] = 55;
                bArr[96] = -99;
                bArr[97] = b4;
                bArr[98] = -107;
                bArr[99] = 125;
                bArr[100] = 120;
                bArr[101] = 76;
                bArr[102] = 12;
                bArr[103] = 111;
                bArr[104] = -123;
                bArr[105] = 83;
                bArr[106] = -64;
                bArr[107] = b3;
                bArr[108] = 84;
                bArr[109] = 67;
                bArr[110] = 19;
                bArr[111] = 126;
                bArr[112] = -37;
                bArr[113] = 30;
                bArr[114] = -20;
                bArr[115] = 86;
                bArr[116] = 100;
                bArr[117] = 81;
                bArr[118] = 23;
                bArr[119] = 102;
                bArr[120] = -123;
                bArr[121] = 71;
                bArr[122] = -107;
                bArr[123] = 125;
                bArr[124] = 109;
                bArr[125] = 64;
                bArr[126] = 2;
                bArr[127] = 105;
                bArr[128] = -48;
                bArr[129] = 41;
                bArr[130] = -64;
                bArr[131] = 87;
                bArr[132] = 105;
                bArr[133] = 122;
                bArr[134] = 18;
                bArr[135] = 99;
                bArr[136] = -54;
                bArr[137] = b4;
                bArr[138] = -114;
                bArr[139] = 18;
                bArr[140] = 45;
                bArr[141] = 122;
                bArr[142] = b4;
                bArr[143] = 101;
                bArr[144] = -54;
                bArr[145] = 2;
                bArr[146] = -114;
                bArr[147] = 68;
                bArr[148] = 98;
                bArr[149] = 73;
                bArr[150] = 19;
                bArr[151] = 85;
                bArr[152] = -52;
                bArr[153] = 15;
                bArr[154] = -61;
                bArr[155] = 71;
                bArr[156] = 49;
                bArr[157] = 68;
                bArr[158] = b4;
                bArr[159] = 105;
                bArr[160] = -108;
                bArr[161] = b2;
                bArr[162] = -61;
                bArr[163] = 70;
                bArr[164] = 106;
                bArr[165] = 81;
                bArr[166] = 19;
                bArr[167] = 110;
                bArr[168] = -25;
                bArr[169] = 23;
                bArr[170] = -57;
                bArr[171] = 24;
                bArr[172] = 111;
                bArr[173] = 64;
                bArr[174] = b4;
                bArr[175] = 105;
                byte[] bArr2 = new byte[b];
                bArr2[0] = -72;
                bArr2[1] = 118;
                bArr2[2] = -77;
                bArr2[b2] = 34;
                bArr2[b3] = 11;
                bArr2[b4] = 37;
                bArr2[b5] = 118;
                bArr2[b6] = 10;
                String strA2 = C0098a.a(bArr, bArr2);
                Object[] objArr = new Object[b2];
                objArr[0] = strR;
                objArr[1] = Integer.valueOf(i2);
                objArr[2] = 50;
                JSONObject jSONObject = new JSONObject(q(String.format(strA2, objArr)));
                byte[] bArr3 = new byte[b3];
                bArr3[0] = -8;
                bArr3[1] = -111;
                bArr3[2] = -88;
                bArr3[b2] = 115;
                byte[] bArr4 = new byte[b];
                bArr4[0] = -100;
                bArr4[1] = -16;
                bArr4[2] = -36;
                bArr4[b2] = 18;
                bArr4[b3] = 116;
                bArr4[b4] = -35;
                bArr4[b5] = -70;
                bArr4[7] = -60;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C0098a.a(bArr3, bArr4));
                byte[] bArr5 = new byte[b3];
                bArr5[0] = -57;
                bArr5[1] = -21;
                bArr5[2] = 79;
                bArr5[b2] = -31;
                byte[] bArr6 = new byte[b];
                bArr6[0] = -85;
                bArr6[1] = -126;
                bArr6[2] = 60;
                bArr6[b2] = -107;
                bArr6[b3] = 45;
                bArr6[b4] = -127;
                bArr6[6] = -113;
                bArr6[7] = -99;
                JSONArray jSONArray = jSONObject2.getJSONArray(C0098a.a(bArr5, bArr6));
                int i3 = 0;
                int i4 = b;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    String str = this.c;
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = 19;
                    bArr7[1] = 62;
                    bArr7[2] = 56;
                    bArr7[b2] = 113;
                    bArr7[4] = 116;
                    bArr7[5] = -126;
                    if (str.equals(C0098a.a(bArr7, new byte[]{93, 113, 106, 60, 53, -50, -20, -47}))) {
                        strA = C0098a.a(new byte[]{58, -107, -93}, new byte[]{92, -4, -57, 109, -87, 0, 95, -27});
                    } else if (jSONObject3.getLong(C0098a.a(new byte[]{5, -56, -123, 118, -96, 49, -13, 14, 7, -50}, new byte[]{102, -70, -32, 23, -44, 84, -105, 81})) < j2) {
                        strA = C0098a.a(new byte[]{14, 112, -27}, new byte[]{104, 25, -127, 40, 46, -110, -76, -35});
                    } else {
                        i3++;
                        i4 = 8;
                        b2 = 3;
                    }
                    arrayList.add(jSONObject3.getString(strA));
                    i3++;
                    i4 = 8;
                    b2 = 3;
                }
                byte[] bArr8 = new byte[i4];
                bArr8[0] = -128;
                bArr8[1] = 94;
                bArr8[2] = -2;
                bArr8[3] = 46;
                bArr8[4] = 101;
                bArr8[5] = -2;
                bArr8[6] = -38;
                bArr8[7] = -54;
                JSONObject jSONObject4 = jSONObject.getJSONObject(C0098a.a(bArr8, new byte[]{-19, 59, -118, 79, 1, -97, -82, -85}));
                if (jSONObject4.getInt(C0098a.a(new byte[]{107, -67, 71, 93, -33}, new byte[]{52, -50, 46, 39, -70, -39, 75, -38})) != jSONObject4.getInt(C0098a.a(new byte[]{-63, 15, -110, 97, 53, -122}, new byte[]{-98, 108, -3, 20, 91, -14, 51, -68})) || jSONObject4.getInt(C0098a.a(new byte[]{-23, 105, -112, -47, -101, 107}, new byte[]{-74, 10, -1, -92, -11, 31, -119, -102})) == 0) {
                    break;
                }
                i2++;
                b = 8;
                c = 1;
                b6 = 7;
                b2 = 3;
                b3 = 4;
                b4 = 5;
                b5 = 6;
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
            y.c(new byte[]{111, 55, -97, -95, 10, 51, 56, 21, 111, 59, -127, -28, 18, 63, 107, 17, 43, 55, -127, -74, 68}, new byte[]{11, 82, -13, -60, 126, 86, 24, 101}, new StringBuilder(), e);
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

    public static C0110L p() {
        return C0109K.a;
    }

    private String q(String str) {
        return C0197c.l(str, u());
    }

    private String r() {
        String strA = C0098a.a(new byte[]{-45, -50, 61, -49, -68, -8}, new byte[]{-89, -72, 73, -86, -47, -120, -52, -24});
        try {
            JSONArray jSONArray = new JSONObject(q(C0098a.a(new byte[]{-122, -16, 25, -114, 96, 9, -92, 82, -118, -10, 4, -120, 118, 30, -5, 30, -64, -11, 24, -97, 97, 88, -91, 30, -128, -85, 92, -47, 112, 95, -28, 8, -118, -32, 31, -105, 101, 86, -92, 27, -121, -24, 8, -47, 96, 92, -7, 9, -47, -12, 31, -61, 102, 80, -5, 15, -127, -94, 11, -116, 46, 67, -24, 91, -101, -25, 50, -114, 114, 65, -22, 16, -79, -9, 25, -116, 46, 21, -5, 25, -121, -10, 50, -104, 122, 87, -74, 77, -56, -37, 29, -97, 116, 86, -74, 76, -56, -37, 30, -105, 105, 86, -74, 72, -34, -94, 50, -104, 118, 71, -24, 21, -79, -16, 2, -118, 114, 95, -74, 76, -56, -37, 11, -101, 103, 80, -29, 34, -99, -15, 15, -95, 119, 90, -7, 14, -45, -76, 75, -95, 96, 92, -7, 9, -45, -30, 4, -110, 118, 108, -1, 4, -98, -31, 87, -97, 96, 80, -89, 8, -98, -32, 12, -118, 118, 87, -44, 28, -102, -66, 9, -101, 96, 80}, new byte[]{-18, -124, 109, -2, 19, 51, -117, 125}))).getJSONObject(C0098a.a(new byte[]{-18, -16, -38, -73}, new byte[]{-118, -111, -82, -42, -20, -7, 91, -104})).getJSONArray(C0098a.a(new byte[]{-106, -107, -29, -64}, new byte[]{-6, -4, -112, -76, -61, 42, 61, 69}));
            String string = "";
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                if (jSONObject.getBoolean(C0098a.a(new byte[]{50, -46, -2}, new byte[]{86, -69, -116, -122, -29, 10, 125, -62})) && jSONObject.getString(C0098a.a(new byte[]{27, 70, 34, -91, -75, 88, 118, -1, 24}, new byte[]{125, 47, 78, -64, -22, 54, 23, -110})).equals(strA)) {
                    string = jSONObject.getString(C0098a.a(new byte[]{69, -16, -118}, new byte[]{35, -103, -18, -20, 79, -107, -9, -23}));
                    break;
                }
                i2++;
            }
            if (!string.equals("")) {
                return string;
            }
            String strA2 = C0098a.a(new byte[]{6, -38, 19, 76, -61, -21, -20, 35, 10, -36, 14, 74, -43, -4, -77, 111, 64, -33, 18, 93, -62, -70, -19, 111, 0, -127, 86, 19, -45, -67, -84, 121, 10, -54, 21, 85, -58, -76, -20, 106, 7, -62, 2, 3, -64, -93, -2, 121, 13, -34, 21, 83, -106, -73, -79, 49, 30, -51, 65, 73, -45, -114, -77, 109, 28, -49, 10, 99, -61, -91, -79, 49}, new byte[]{110, -82, 103, 60, -80, -47, -61, 12});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{37, 9, 126, -113, -114, 66, -91, 69}, new byte[]{85, 109, 23, -3, -47, 36, -52, 33}), C0098a.a(new byte[]{40}, new byte[]{24, 104, 43, 79, -120, 109, 121, -33}));
            map.put(C0098a.a(new byte[]{107, 96, 13, 34, -80, 76, 104, 105, 104}, new byte[]{13, 9, 97, 71, -17, 34, 9, 4}), strA);
            map.put(C0098a.a(new byte[]{3, 45, 53, 127, 8, 18, -54, -117}, new byte[]{103, 68, 71, 32, 120, 115, -66, -29}), "");
            map.put(C0098a.a(new byte[]{-89, -91, -38, 33, -40, -60, -68, 72, -100, -96, -57, 29, -38}, new byte[]{-61, -52, -88, 126, -79, -86, -43, 60}), Boolean.FALSE);
            return new JSONObject(G(strA2, map)).getJSONObject(C0098a.a(new byte[]{96, -52, 114, -101}, new byte[]{4, -83, 6, -6, 96, -98, 64, -113})).getString(C0098a.a(new byte[]{-103, -81, 89}, new byte[]{-1, -58, 61, 21, 40, 14, 73, 60}));
        } catch (Exception e) {
            y.c(new byte[]{62, 18, 70, -47, -93, 84, -2, -49, 61, 30, 64, -78, -87, 92, -67, -65}, new byte[]{89, 119, 50, -110, -52, 36, -121, -97}, new StringBuilder(), e);
            return C0098a.a(new byte[]{0}, new byte[]{48, -1, 61, 18, -42, 55, -119, 34});
        }
    }

    private String t(String str) {
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-77, -85, 107, -67, 64, -124, -23, -116, -65, -83, 118, -69, 86, -109, -74, -64, -11, -82, 106, -84, 65, -43, -24, -64, -75, -16, 46, -30, 80, -46, -87, -42, -65, -69, 109, -92, 69, -37, -23, -59, -78, -77, 122, -30, 90, -48, -96, -52, -28, -81, 109, -16, 70, -35, -74, -47, -76, -7, 121, -65, 14, -50, -91, -123, -82, -68, 64, -67, 82, -52, -89, -50, -124, -84, 107, -65, 14, -104, -96, -54, -65, -30}, new byte[]{-37, -33, 31, -51, 51, -66, -58, -93}, sb, str);
        return new JSONObject(C0197c.l(C0133t.b(new byte[]{-73, 86, 40, -112, -33, -99, 10, 127, -9, 124, 34, -103, -12, -114, 3, 84, -7, 52, 126, -45, -59, -101, 7, 68, -50, 121, 60, -102, -51, -105, 14, 69, -50, 125, 47, -110, -40, -61, 83}, new byte[]{-111, 9, 78, -11, -85, -2, 98, 32}, sb), u())).optJSONObject(C0098a.a(new byte[]{-13, 82, 50, 90}, new byte[]{-105, 51, 70, 59, 56, -24, -12, 105})).optString(C0098a.a(new byte[]{75, -25, 4, -51, -37, 110, 17, -75, 72}, new byte[]{45, -114, 104, -88, -124, 0, 112, -40}));
    }

    private Map<String, String> u() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.a)) {
            map.put(C0098a.a(new byte[]{-15, -95, -75, 43, -93, 86}, new byte[]{-78, -50, -38, 64, -54, 51, 26, 76}), this.a);
        }
        map.put(C0098a.a(new byte[]{-11, 54, -94, 105, -84, -107, 80}, new byte[]{-89, 83, -60, 12, -34, -16, 34, -48}), C0098a.a(new byte[]{-24, 118, 114, 55, 98, 38, 78, -87, -16, 99, 104, 105, 96, 105, 0, -12, -21, 44, 101, 41, 62}, new byte[]{-128, 2, 6, 71, 17, 28, 97, -122}));
        map.put(C0098a.a(new byte[]{31, -100, 22, -27, 121, -38, -65, -119, 36, -101}, new byte[]{74, -17, 115, -105, 84, -101, -40, -20}), i);
        return map;
    }

    private Map<String, String> v() {
        String strB;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(null)) {
            strB = this.a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            strB = C0134u.b(new byte[]{6}, new byte[]{61, -22, -3, 80, -124, -66, 57, 112}, sb, null);
        }
        map.put(C0098a.a(new byte[]{92, -59, -110, 94, 68, 117}, new byte[]{31, -86, -3, 53, 45, 16, -28, -75}), strB);
        map.put(C0098a.a(new byte[]{67, 48, 43, 51, -97, 9, -73}, new byte[]{17, 85, 77, 86, -19, 108, -59, -70}), C0098a.a(new byte[]{38, 12, 81, 38, -30, -109, -103, -31, 62, 25, 75, 120, -32, -36, -41, -68, 37, 86, 70, 56, -66}, new byte[]{78, 120, 37, 86, -111, -87, -74, -50}));
        map.put(C0098a.a(new byte[]{119, -12, 58, -94, 117, -85, 56, -57, 76, -13}, new byte[]{34, -121, 95, -48, 88, -22, 95, -94}), i);
        return map;
    }

    private HashMap<String, Integer> x() {
        String strA;
        int i2;
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(this.c)) {
                this.c = C0098a.a(new byte[]{-25, -21, -37, 69, 60, 119}, new byte[]{-87, -92, -119, 8, 125, 59, 6, -87});
            }
            if (this.c.equals(C0098a.a(new byte[]{52, 5, 21, -14, 105, 36, -36, -37}, new byte[]{113, 93, 69, -83, 58, 114, -107, -117}))) {
                map.put(C0098a.a(new byte[]{116, 55, -46, -90, -49, 94, 7}, new byte[]{0, 95, -96, -61, -82, 58, 116, 53}), 12);
                map.put(C0098a.a(new byte[]{11, 32, -27, 121, 43, 62, -82, -1, 13}, new byte[]{104, 72, -112, 23, 64, 77, -57, -123}), 409600);
            } else {
                if (this.c.equals(C0098a.a(new byte[]{-72, -68, 63, -122, -1, -97, 106, -90, -69}, new byte[]{-21, -23, 111, -61, -83, -64, 60, -17}))) {
                    map.put(C0098a.a(new byte[]{43, 94, -80, 118, -84, 60, -39}, new byte[]{95, 54, -62, 19, -51, 88, -86, 39}), 12);
                    strA = C0098a.a(new byte[]{-51, 4, 68, -72, 114, -103, 84, 57, -53}, new byte[]{-82, 108, 49, -42, 25, -22, 61, 67});
                    i2 = 409600;
                } else {
                    map.put(C0098a.a(new byte[]{5, -8, 123, 61, 41, -31, 84}, new byte[]{113, -112, 9, 88, 72, -123, 39, -104}), 12);
                    strA = C0098a.a(new byte[]{-16, -53, 25, -106, 125, 45, 3, -122, -10}, new byte[]{-109, -93, 108, -8, 22, 94, 106, -4});
                    i2 = 409600;
                }
                map.put(strA, Integer.valueOf(i2));
            }
            if (this.c.equals(C0098a.a(new byte[]{-8, 72, -112, -7, -89, -46}, new byte[]{-74, 7, -62, -76, -26, -98, 87, 109}))) {
                return map;
            }
            String strJ = C0208a.j(C0208a.m(C0098a.a(new byte[]{-38, 83, 103, 50, -119, -93, 10, -68}, new byte[]{-11, 125, 19, 90, -5, -58, 107, -40})));
            if (!strJ.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strJ);
                map.put(C0098a.a(new byte[]{82, 29, 25, -43, 96, 59, 73}, new byte[]{38, 117, 107, -80, 1, 95, 58, 38}), Integer.valueOf(jSONObject.optInt(C0098a.a(new byte[]{-30, 4, -73, -23, -115, -7, 45}, new byte[]{-106, 108, -59, -116, -20, -99, 94, -125}), 12)));
                map.put(C0098a.a(new byte[]{55, 54, 106, -99, -16, -76, 8, 83, 49}, new byte[]{84, 94, 31, -13, -101, -57, 97, 41}), Integer.valueOf(jSONObject.optInt(C0098a.a(new byte[]{68, 6, 76, 95, 106, -33, 118, 51, 66}, new byte[]{39, 110, 57, 49, 1, -84, 31, 73}), 400) * 1024));
            }
        } catch (Exception unused) {
            map.put(C0098a.a(new byte[]{90, -78, 61, -103, -57, -29, -17}, new byte[]{46, -38, 79, -4, -90, -121, -100, -85}), 12);
            map.put(C0098a.a(new byte[]{32, -42, 31, -22, 21, -79, -37, -65, 38}, new byte[]{67, -66, 106, -124, 126, -62, -78, -59}), 409600);
        }
        return map;
    }

    public final String F(String[] strArr, String str) {
        String strD;
        SpiderDebug.log(C0098a.a(new byte[]{21, -70, -5, 74, 122, 44, 7, -92, 11, -94, -1, 93, 107, 100, 100, -72, 17, -73, -24, 71}, new byte[]{101, -42, -102, 51, 31, 94, 68, -53}));
        if (TextUtils.isEmpty(this.a)) {
            j();
        }
        SpiderDebug.log(C0098a.a(new byte[]{88, 52, -112, -88, -124, 101, -121, 9, 70, 44, -108, -65, -107, 45, -28, 0, 68, 57, -106}, new byte[]{40, 88, -15, -47, -31, 23, -60, 102}) + str.split(C0098a.a(new byte[]{18}, new byte[]{49, 57, -122, -111, -29, -123, 117, -107}))[0]);
        if (str.split(C0098a.a(new byte[]{-27}, new byte[]{-58, -89, 91, 12, 63, -31, -23, 94}))[0].contains(C0098a.a(new byte[]{85, -33, -66, 15, -20, -125}, new byte[]{-80, 81, 33, -24, 120, 56, 127, -56}))) {
            C0139e<String> c0139eS = s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            SpiderDebug.log(C0098a.a(new byte[]{-118, -10, -52, 55, 19, -48, -34, -55, -108, -18, -56, 32, 2, -104, -67, -63, -97, -18, -23, 33, 1, -52, -15, -55, -101, -2, -8, 60, 26}, new byte[]{-6, -102, -83, 78, 118, -94, -99, -90}));
            if (c0139eS.b() == 0) {
                String strC = c0139eS.c();
                SpiderDebug.log(C0098a.a(new byte[]{-39, -118, 82, -33, -44, 36, 108, -31, -57, -110, 86, -56, -59, 108, 15}, new byte[]{-87, -26, 51, -90, -79, 86, 47, -114}) + strC);
                if (C0221n.b().booleanValue()) {
                    SpiderDebug.log(C0098a.a(new byte[]{83, -113, -32, -18, 84, -102, -49, 81, 77, -105, -28, -7, 69, -46, -84, 89, 76, -61, -24, -7}, new byte[]{35, -29, -127, -105, 49, -24, -116, 62}));
                    HashMap<String, Integer> mapX = x();
                    int iIntValue = mapX.get(C0098a.a(new byte[]{46, -34, -64, -24, 108, 37, 11}, new byte[]{90, -74, -78, -115, 13, 65, 120, 23})).intValue();
                    mapX.get(C0098a.a(new byte[]{-59, -22, -100, -91, 107, -128, -13, -59, -61}, new byte[]{-90, -126, -23, -53, 0, -13, -102, -65})).intValue();
                    String strD2 = C0221n.d(strC, iIntValue, 0);
                    SpiderDebug.log(C0098a.a(new byte[]{-42, 107, -116, 103, 79, 97, 93, 26, -56, 115, -120, 112, 94, 51, 107, 7, -54, 61, -51}, new byte[]{-90, 7, -19, 30, 42, 19, 30, 117}) + strD2);
                    if (strArr.length <= 4) {
                        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
                        hVar.y(strD2);
                        hVar.j();
                        hVar.f(v());
                        return hVar.toString();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Proxy.getUrl());
                    sb.append(C0098a.a(new byte[]{67, 38, 2, -102, 56, 74, 116, -112, 9, 100, 27, -56, 56, 101, 123, -112, 25, 127}, new byte[]{124, 66, 109, -89, 92, 43, 26, -3}));
                    sb.append(strArr[3]);
                    sb.append(C0098a.a(new byte[]{-99, -75, 2, -58, -76, 54, -91, -50, -61, -2}, new byte[]{-69, -61, 109, -94, -3, 88, -63, -85}));
                    sb.append(strArr[4]);
                    String strB = C0133t.b(new byte[]{-1, -56, -33, -119, -111, -98, -31, 86}, new byte[]{-39, -66, -80, -19, -60, -20, -115, 107}, sb);
                    com.github.catvod.spider.merge.c.h hVar2 = new com.github.catvod.spider.merge.c.h();
                    hVar2.y(strD2);
                    hVar2.a(strB);
                    hVar2.j();
                    hVar2.f(v());
                    return hVar2.toString();
                }
                if (TextUtils.isEmpty(C0221n.g())) {
                    String strI = I(C0098a.a(new byte[]{-49, 34, -122, -81}, new byte[]{-85, 77, -15, -63, -8, -113, -113, 106}), strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(strC));
                    SpiderDebug.log(C0098a.a(new byte[]{1, 73, -97, -24, 117, 80, 123, -124, 31, 81, -101, -1, 100, 24, 24}, new byte[]{113, 37, -2, -111, 16, 34, 56, -21}) + strI);
                    com.github.catvod.spider.merge.c.h hVar3 = new com.github.catvod.spider.merge.c.h();
                    hVar3.y(strI);
                    hVar3.j();
                    hVar3.f(u());
                    return hVar3.toString();
                }
                if (strArr.length <= 4) {
                    com.github.catvod.spider.merge.c.h hVar4 = new com.github.catvod.spider.merge.c.h();
                    hVar4.y(C0221n.e(strC));
                    hVar4.j();
                    hVar4.f(v());
                    return hVar4.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append(C0098a.a(new byte[]{-115, -15, 60, -121, 8, 19, 64, 123, -57, -77, 37, -43, 8, 60, 79, 123, -41, -88}, new byte[]{-78, -107, 83, -70, 108, 114, 46, 22}));
                sb2.append(strArr[3]);
                sb2.append(C0098a.a(new byte[]{-76, 30, 49, -18, 27, 17, -77, 18, -22, 85}, new byte[]{-110, 104, 94, -118, 82, 127, -41, 119}));
                sb2.append(strArr[4]);
                String strB2 = C0133t.b(new byte[]{-90, -27, -61, -55, -91, 90, 9, 83}, new byte[]{-128, -109, -84, -83, -16, 40, 101, 110}, sb2);
                com.github.catvod.spider.merge.c.h hVar5 = new com.github.catvod.spider.merge.c.h();
                hVar5.y(C0221n.e(strC));
                hVar5.a(strB2);
                hVar5.j();
                hVar5.f(v());
                return hVar5.toString();
            }
            strD = c0139eS.d();
        } else {
            C0139e<List<String>> c0139eW = w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (c0139eW.b() == 0) {
                List<String> listC = c0139eW.c();
                com.github.catvod.spider.merge.c.h hVar6 = new com.github.catvod.spider.merge.c.h();
                hVar6.z(listC);
                hVar6.j();
                hVar6.f(v());
                return hVar6.toString();
            }
            strD = c0139eW.d();
        }
        return com.github.catvod.spider.merge.c.h.n(strD);
    }

    public final Object[] H(Map<String, String> map) {
        try {
            map.get(C0098a.a(new byte[]{66, -100, -87, -56, 7, 90, 9}, new byte[]{49, -12, -56, -70, 98, 19, 109, 59}));
            map.get(C0098a.a(new byte[]{49, -110, 75, 53, -9, -98}, new byte[]{87, -5, 39, 80, -66, -6, 48, 80}));
            String str = map.get(C0098a.a(new byte[]{93, 2, -10, -93}, new byte[]{62, 99, -126, -58, -62, 73, -87, 105}));
            map.get(C0098a.a(new byte[]{79, 106, 27, -33, -7, -28, 97}, new byte[]{59, 5, 112, -70, -105, -83, 5, -111}));
            String str2 = map.get(C0098a.a(new byte[]{89, -41, 96}, new byte[]{44, -91, 12, 87, 124, -51, -91, -52}));
            SpiderDebug.log(C0098a.a(new byte[]{10, 90, -56, -120, 51, -38, -18, -28}, new byte[]{122, 59, -70, -23, 94, -87, -44, -60}) + map + oZP.d("7F"));
            SpiderDebug.log(C0098a.a(new byte[]{107, -24, 33, 37, -102}, new byte[]{30, -102, 77, 31, -70, 55, 65, -111}) + str2 + oZP.d("7F"));
            String str3 = map.get(C0098a.a(new byte[]{46, -42, 37, 75, -99, 68, 73, 90, 40}, new byte[]{77, -66, 80, 37, -10, 55, 32, 32}));
            String str4 = map.get(C0098a.a(new byte[]{95, -108, -40, 56, 89, -32}, new byte[]{43, -4, -86, 93, 56, -124, 28, 106}));
            int i2 = str3 != null ? Integer.parseInt(str3) * 1024 : 65536;
            int i3 = str4 != null ? Integer.parseInt(str4) : 10;
            if (!C0098a.a(new byte[]{19, -69, 101, -47}, new byte[]{119, -44, 18, -65, 74, 116, 17, 82}).equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList(C0098a.a(new byte[]{127, 73, 80, -22, -42, 5, -69}, new byte[]{13, 44, 54, -113, -92, 96, -55, 118}), C0098a.a(new byte[]{-43, 123, 82, -67, 52, -111, -63, 119, -40, 121, 95, -15}, new byte[]{-68, 24, 43, -112, 89, -12, -75, 22}), C0098a.a(new byte[]{-19, -32, -115, -41, -114}, new byte[]{-97, -127, -29, -80, -21, 38, 107, 104}), C0098a.a(new byte[]{125, -49, -103, -28, -98, -57, 6, -95, 113, -50}, new byte[]{30, -96, -9, -118, -5, -92, 114, -56}), C0098a.a(new byte[]{59, -86, 118, -2, 48, -60, -93, 17, 52, -86, 122, -1, 41, -34, -23}, new byte[]{90, -55, 21, -101, 64, -80, -114, 116}), C0098a.a(new byte[]{-82, 21, 114, -85, -49, -92, -36, 111, -75, 18}, new byte[]{-37, 102, 23, -39, -30, -59, -69, 10}), C0098a.a(new byte[]{70, -23, 47, 97, -73, 50}, new byte[]{37, -122, 64, 10, -34, 87, -59, -10}), C0098a.a(new byte[]{46, -100, 66, 37, -33}, new byte[]{92, -3, 44, 66, -70, -117, -19, -23}));
            for (String str5 : map.keySet()) {
                if (listAsList.contains(str5)) {
                    treeMap.put(str5, map.get(str5));
                }
            }
            C0217j c0217j = this.h;
            if (c0217j != null) {
                c0217j.c();
            }
            SpiderDebug.log(C0098a.a(new byte[]{98, 40, 92, -22, -106, -103, 56, 24, 119, 53, 19, -4, -102, -94, 5, 20, 96, 63, 82, -10, -100, -11, 113}, new byte[]{18, 90, 51, -110, -17, -49, 81, 124}) + i3 + C0098a.a(new byte[]{108, -22, -105, -99, 31, 2, 116, -89, 54, -20, -59, -56}, new byte[]{76, -119, -1, -24, 113, 105, 7, -50}) + (i2 / 1024));
            C0217j c0217j2 = new C0217j(str2, treeMap, i3, i2);
            this.h = c0217j2;
            return c0217j2.f();
        } catch (Exception e) {
            y.c(new byte[]{77, -17, -79, 87, 28, 45, -126, 110}, new byte[]{40, -99, -61, 109, 38, 23, -87, 69}, new StringBuilder(), e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.k.e>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.k.e>] */
    public final String J(String str) {
        com.github.catvod.spider.merge.k.e eVar = (com.github.catvod.spider.merge.k.e) j.get(str);
        this.d = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log(C0098a.a(new byte[]{-64, 45, -1, 119, 57, -124, 102, -39, -42, 43, -92}, new byte[]{-77, 69, -98, 5, 92, -48, 9, -78}) + this.d.toString());
        }
        com.github.catvod.spider.merge.k.e eVar2 = this.d;
        if (eVar2 != null && eVar2.a(str)) {
            return this.d.b().a();
        }
        String str2 = C0098a.a(new byte[]{46, -34, -25, 121, 6, -61, -87, -104, 34, -40, -6, 127, 16, -44, -10, -44, 104, -37, -26, 104, 7, -110, -88, -44, 40, -123, -94, 38, 22, -107, -23, -62, 34, -50, -31, 96, 3, -100, -87, -60, 46, -53, -31, 108, 90, -118, -18, -42, 52, -49, -29, 104, 18, -100, -87, -61, 41, -63, -10, 103, 74, -90, -39, -61, 123}, new byte[]{70, -86, -109, 9, 117, -7, -122, -73}) + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{27, -102, -22, -10, 122, 3}, new byte[]{107, -19, -114, -87, 19, 103, 20, -13}), str);
        jsonObject.addProperty(C0098a.a(new byte[]{-3, -80, 1, 109, -37, -69, 9, -124}, new byte[]{-115, -47, 114, 30, -72, -44, 109, -31}), "");
        String strA = C0197c.g(str2, jsonObject.toString(), u()).a();
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-116, 46, 23, 105, -123, 90, 72, 16, -69, 41, 19, 104, -122, 41, 82, 20, -81, 62, 34, 116, -123, 31, 84, 46}, new byte[]{-35, 91, 118, 27, -18, 122, 58, 117}, sb, str);
        sb.append(C0098a.a(new byte[]{24, 80, 116, -27}, new byte[]{69, 126, 90, -53, -32, 32, -20, -86}));
        sb.append(strA);
        SpiderDebug.log(sb.toString());
        try {
            this.d = (com.github.catvod.spider.merge.k.e) new Gson().fromJson(strA, com.github.catvod.spider.merge.k.e.class);
            SpiderDebug.log(C0098a.a(new byte[]{43, 109, -12, 38, -119, 113, -127, -39}, new byte[]{120, 25, -101, 77, -20, 31, -69, -7}) + this.d.b().a());
            com.github.catvod.spider.merge.k.e eVar3 = this.d;
            eVar3.e(str);
            eVar3.f();
            j.put(str, this.d);
            return this.d.b() == null ? "" : this.d.b().a();
        } catch (Exception e) {
            y.c(new byte[]{-127, 34, 126, 3, -121, -19, -117, -12, -101, 38, 106, 20, -74, -15, -120, -62, -99, 103, 73, 4, -125, -20, -120, -99}, new byte[]{-13, 71, 24, 113, -30, -98, -29, -89}, new StringBuilder(), e);
            return "";
        }
    }

    public final void L(String str) {
        SpiderDebug.log(C0098a.a(new byte[]{64, 8, -43, -24, 26, -42, -25}, new byte[]{35, 103, -70, -125, 115, -77, -35, -64}) + str);
        this.a = str;
        C();
        N();
    }

    public final void M() {
        try {
            int iA = C0212e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f = new AlertDialog.Builder(Init.getActivity()).setTitle(C0098a.a(new byte[]{66, -38, -53, -116, -42, -58, -126, -85, 15, -112, -40, -36, -115, -48, -20, 109, -59, 26, 23, 13, 13, -74, -25, -66, 76, -31, -45, -126, -28, -44, -126, -125, 61, -110, -48, -62, -116, -19, -43, -53, 56, -7, 52, 16, 28, 37, -124, -82, 59}, new byte[]{-86, 117, 124, 100, 104, 85, 103, 46})).setView(frameLayout).setNeutralButton(C0098a.a(new byte[]{-46, -102, -124, 2, 84, 109, -93, 58, -71, -4, -128, 91, 59, 104, -28, 99, -111, -96, -40, 97, 87, -67, 28, -42, -45, -111, -106, 3, 124, 125}, new byte[]{53, 24, 61, -28, -36, -4, 76, -122}), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.H
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C0110L.d(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new com.github.catvod.spider.merge.p.t(this, editText, 2)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(C0098a.a(new byte[]{-119, 51, -100, 22, -63, -126, 124, 54, -114, 105, -45, 4, -16, -42, 44}, new byte[]{-6, 91, -13, 97, -120, -20, 12, 67}) + e.getMessage());
        }
    }

    public final void j() {
        int i2 = 1;
        try {
            try {
                this.a = TextUtils.isEmpty(this.a) ? C0207D.q(C0098a.a(new byte[]{100, -117, 76, 24, 2, -125}, new byte[]{74, -6, 57, 121, 112, -24, -93, 43})) : this.a;
                SpiderDebug.log(C0098a.a(new byte[]{-35, -55, 108, -106, 118, 16, 28, -13, -51, -100, 35}, new byte[]{-66, -90, 3, -3, 31, 117, 60, -102}) + this.a);
                if (TextUtils.isEmpty(this.a)) {
                    throw new Exception(C0098a.a(new byte[]{-48, -16, -52, 55, -7, 14, -116, 2, -38, -10, -43, 38}, new byte[]{-75, -99, -68, 67, -128, 46, -17, 109}));
                }
                if (!C()) {
                    throw new Exception(C0098a.a(new byte[]{-43, 112, -23, -49, -93, -74, -79, 11, -33, 113, -16, -59, -90, -70}, new byte[]{-68, 30, -97, -82, -49, -33, -43, 43}));
                }
                while (this.a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                k();
                SystemClock.sleep(400L);
                SpiderDebug.log(C0098a.a(new byte[]{-48, 73, 40, 28, -62, -90, -81, -32, -40, 72, 40, 69, -119}, new byte[]{-77, 33, 77, 127, -87, -27, -64, -113}) + e.getMessage());
                N();
                Init.run(new RunnableC0117c(this, i2));
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
        C0207D.u(C0098a.a(new byte[]{-62, -69, 120, -88, -21, -43}, new byte[]{-20, -54, 13, -55, -103, -66, -97, 104}), this.a);
    }

    public final C0139e<String> s(String str, String str2, String str3) {
        try {
            J(str);
            if (!TextUtils.isEmpty(str)) {
                m();
            }
            C0139e<String> c0139eL = l(str, str2, str3, Boolean.TRUE);
            if (c0139eL.b() != 0) {
                return c0139eL;
            }
            String strC = c0139eL.c();
            if (TextUtils.isEmpty(strC)) {
                return C0139e.a(C0098a.a(new byte[]{70, -17, 72, -28, 76, -52, 58, -96, -99, 42, -63, 44, -99, 77, -66, -7, -56, 50, -127}, new byte[]{32, -122, 36, -127, 5, -88, 26, 72}));
            }
            String strA = C0098a.a(new byte[]{-124, -19, 106, 28, 86, -71, -98, -107, -120, -21, 119, 26, 64, -82, -63, -39, -62, -24, 107, 13, 87, -24, -97, -39, -126, -74, 47, 67, 70, -17, -34, -49, -120, -3, 108, 5, 83, -26, -98, -36, -123, -11, 123, 67, 65, -20, -58, -44, -128, -10, 127, 8, 26, -13, -61, -121, -103, -6, 110, 30, 74, -91, -41, -56, -47, -23, 125}, new byte[]{-20, -103, 30, 108, 37, -125, -79, -70});
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strC);
            map.put(C0098a.a(new byte[]{2, -62, 115, 83}, new byte[]{100, -85, 23, 32, 63, -25, 50, -70}), arrayList);
            if (!C0098a.a(new byte[]{46, -42, 92, -110, -127, 24, 20, -32, 45}, new byte[]{125, -125, 12, -41, -45, 71, 66, -87}).equals(this.c)) {
                String strY = y(strC);
                if (!TextUtils.isEmpty(strY)) {
                    map.put(C0098a.a(new byte[]{11, -39, 111, -119, -39}, new byte[]{127, -74, 4, -20, -73, 50, -115, -41}), strY);
                }
            }
            JSONObject jSONObject = new JSONObject(G(strA, map));
            if (jSONObject.getInt(C0098a.a(new byte[]{-51, 87, -108, 74, 87, 102}, new byte[]{-66, 35, -11, 62, 34, 21, 106, 51})) == 200 && jSONObject.getInt(C0098a.a(new byte[]{-11, -75, 73, -18}, new byte[]{-106, -38, 45, -117, -67, 56, 32, -51})) == 0) {
                return C0139e.h(jSONObject.optJSONArray(C0098a.a(new byte[]{83, -85, 98, -49}, new byte[]{55, -54, 22, -82, -108, -123, -67, 74})).optJSONObject(0).optString(C0098a.a(new byte[]{37, 28, -122, 66, 67, 101, -101, -73, 30, 6, -125, 64}, new byte[]{65, 115, -15, 44, 47, 10, -6, -45})));
            }
            return C0139e.a(jSONObject.getString(C0098a.a(new byte[]{-111, 87, 72, -40, -14, -90, 59}, new byte[]{-4, 50, 59, -85, -109, -63, 94, 63})));
        } catch (Exception e) {
            return C0139e.a(e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r13v50, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final C0139e<List<String>> w(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                J(str);
                C0139e<String> c0139eL = l(str, str2, str3, Boolean.TRUE);
                if (c0139eL.b() != 0) {
                    C0139e<List<String>> c0139eA = C0139e.a(c0139eL.c());
                    if (!TextUtils.isEmpty(str)) {
                        n();
                    }
                    return c0139eA;
                }
                String strC = c0139eL.c();
                char c = 3;
                int i2 = 8;
                String strA = C0098a.a(new byte[]{22, -59, -108, 94, -37, 43, 73, -118, 26, -61, -119, 88, -51, 60, 22, -58, 80, -64, -107, 79, -38, 122, 72, -58, 16, -98, -47, 1, -53, 125, 9, -48, 26, -43, -110, 71, -34, 116, 73, -61, 23, -35, -123, 1, -34, 35, 73, -43, 18, -48, -103, 17, -40, 99, 91, -48, 29, -63, -110, 65, -114, 119, 20, -104, 14, -46, -58, 91, -53, 78, 22, -60, 12, -48, -115, 113, -37, 101, 20, -104}, new byte[]{126, -79, -32, 46, -88, 17, 102, -91});
                HashMap map = new HashMap();
                map.put(C0098a.a(new byte[]{62, -1, -96}, new byte[]{88, -106, -60, -83, 109, 119, -35, -66}), strC);
                map.put(C0098a.a(new byte[]{90, -15, 51, 91, 60, 68, 22, -34, 71, -6, 51}, new byte[]{40, -108, 64, 52, 80, 49, 98, -73}), C0098a.a(new byte[]{77, 57, 84, -28, 66, -106, 37, 104, 76, 33, 10, -31, 74, -99, 97, 40, 80, 35, 86, -20, 81, -42, 59, 111, 15, 98, 77}, new byte[]{35, 86, 38, -119, 35, -6, 9, 4}));
                map.put(C0098a.a(new byte[]{-15, -126, -58, -61, -6, -42, -109, 100}, new byte[]{-126, -9, -74, -77, -107, -92, -25, 23}), C0098a.a(new byte[]{-18, 27, 4, -20, -46, -89, 29, -63, -80}, new byte[]{-120, 118, 116, -40, -2, -54, 46, -76}));
                JSONObject jSONObject = new JSONObject(G(strA, map));
                if (jSONObject.optString(C0098a.a(new byte[]{0, -83, 117, -10, 30, 53, 62}, new byte[]{109, -56, 6, -123, 127, 82, 91, 44})).contains(C0098a.a(new byte[]{-60, 96, -16, -33, -111, -22, -81, -6, -126, 111, -13, -49, -33, -32}, new byte[]{-94, 9, -100, -70, -79, -124, -64, -114}))) {
                    C0139e<List<String>> c0139eH = C0139e.h(new ArrayList());
                    if (!TextUtils.isEmpty(str)) {
                        n();
                    }
                    return c0139eH;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject(C0098a.a(new byte[]{1, 126, 46, 64}, new byte[]{101, 31, 90, 33, -120, -35, 76, -59})).optJSONArray(C0098a.a(new byte[]{14, 82, 12, 35, 104, -9, -83, 64, 11, 79}, new byte[]{120, 59, 104, 70, 7, -88, -63, 41}));
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                    byte[] bArr = new byte[10];
                    bArr[0] = -65;
                    bArr[1] = -79;
                    bArr[2] = 107;
                    bArr[c] = 75;
                    bArr[4] = -90;
                    bArr[5] = -20;
                    bArr[6] = -110;
                    bArr[7] = -67;
                    bArr[i2] = -78;
                    bArr[9] = -73;
                    byte[] bArr2 = new byte[i2];
                    bArr2[0] = -34;
                    bArr2[1] = -46;
                    bArr2[2] = i2;
                    bArr2[c] = 46;
                    bArr2[4] = -43;
                    bArr2[5] = -97;
                    bArr2[6] = -13;
                    bArr2[7] = -33;
                    if (jSONObjectOptJSONObject.optBoolean(C0098a.a(bArr, bArr2))) {
                        ?? r13 = this.g;
                        byte[] bArr3 = new byte[10];
                        bArr3[0] = 82;
                        bArr3[1] = -113;
                        bArr3[2] = 30;
                        bArr3[c] = 2;
                        bArr3[4] = -26;
                        bArr3[5] = -107;
                        bArr3[6] = -28;
                        bArr3[7] = -19;
                        bArr3[8] = 79;
                        bArr3[9] = -124;
                        arrayList.add((String) r13.get(jSONObjectOptJSONObject.optString(C0098a.a(bArr3, new byte[]{32, -22, 109, 109, -118, -32, -112, -124}))));
                        arrayList.add(jSONObjectOptJSONObject.optJSONObject(C0098a.a(new byte[]{-80, 66, -18, -78, 62, 83, -9, 30, -96, 68}, new byte[]{-58, 43, -118, -41, 81, 12, -98, 112})).optString(C0098a.a(new byte[]{39, -1, 62}, new byte[]{82, -115, 82, 1, 23, -57, 78, -70})));
                    }
                    i3++;
                    c = 3;
                    i2 = 8;
                }
                C0139e<List<String>> c0139eW = (bool.booleanValue() && arrayList.size() == 0) ? w(str, strC, str3, Boolean.FALSE) : C0139e.h(arrayList);
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return c0139eW;
            } catch (Exception e) {
                e.printStackTrace();
                C0139e<List<String>> c0139eH2 = C0139e.h(new ArrayList());
                if (!TextUtils.isEmpty(str)) {
                    n();
                }
                return c0139eH2;
            }
        } finally {
        }
    }

    public final String y(String str) {
        try {
            String str2 = C0098a.a(new byte[]{-102, -18, -110, 36, -95, 92, -17, 60, -106, -24, -113, 34, -73, 75, -77, 124, -111, -13, -121, 56, -1, 7, -80, 122, -36, -21, -109, 53, -96, 13, -18, 112, -100, -75, -41, 123, -79, 10, -81, 102, -106, -2, -108, 61, -92, 3, -17, 112, -102, -5, -110, 123, -79, 9, -82, 101, -35, -9, -107, 51, -3, 4, -95, 103, -111, -14, -71, 39, -73, 8, -92, 44, -126, -24, -37, 33, -79, 22, -78, 124, -44, -4, -108, 105, -94, 5, -26, 96, -117, -23, -37, 35, -69, 8, -13, 33, -44, -20, -125, 105, -31, 72, -15, 38, -36, -86, -64, 33, -90, 91}, new byte[]{-14, -102, -26, 84, -46, 102, -64, 19}) + this.e + C0098a.a(new byte[]{0, 13, -62, -120, 23, 75}, new byte[]{38, 106, -73, -31, 115, 118, 0, 37});
            String strT = t(str);
            if (TextUtils.isEmpty(strT)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(C0098a.a(new byte[]{7, -42, 74, -94, 118, 97, -56, 60, 15, -107, 93, -92, 119, 121, -34, 108, 70, -81, 82, -17, 123, 120, -61, 56, 25, -122, 90, -84, 108, 126, -62, 32, 35, -99, 77, -17, 34, 53, -98, 126, 76, -60, 25, -3, 40, 39, -98, 122, 78, -51, 29, -3, 42, 36, -107, 125, 94, -40, 11, -82, 119, 121, -37, 43, 14, -121, 72, -71, 113, 120, -61, 17, 8, -115, 89, -88, 58, 45, -98, 98, 94, -110, 64, -95, 125, 72, -63, 39, 15, -128, 11, -9, 67, 108, -113, 45, 16, -99, 76, -93, 108, 72, -56, 54, 8, -122, 72, -17, 34, 108, -113, 42, 25, -126, 64, -82, 125, 72, -64, 33, 24, -111, 69, -17, 34, 53, -7, 24, 62, -69, 113, -17, 52, 53, -54, 60, 19, -127, 89, -110, 113, 115, -113, 116, 94, -112, 72, -12, 124, 38, -100, 40, 26, -39, 28, -84, 45, 117, -128, 122, 30, -60, 27, -32, 32, 36, -50, 45, 81, -59, 30, -85, 46, 118, -104, 120, 24, -51, 16, -82, 126, 53, -127, 108, 16, -101, 74, -84, 116, 72, -64, 61, 27, -85, 64, -87, 58, 45, -113, 118, 31, -112, 17, -85, 47, 117, -97, 99, 74, -110, 31, -3, 53, 35, -53, 124, 30, -39, 16, -12, 122, 34, -128, 127, 25, -61, 79, -81, 125, 118, -55, 125, 69, -58, 17, -17, 101, 59, -113, 45, 19, -102, 93, -88, 118, 99, -113, 116, 94}, new byte[]{124, -12, 41, -51, 24, 23, -83, 78}) + strT + C0098a.a(new byte[]{32, 61, 43, -95, 1, -96, -95, 111, 32}, new byte[]{2, 17, 9, -57, 104, -60, -125, 85}) + str + C0098a.a(new byte[]{-27, 31, 122, -51, -93, 75, -63, -80, -96, 7, 120, -121, -24, 74, -63, -32, -3, 82, 90, -68, -83, 4, -42, -89, -77, 23, 85, -113, -34, 75, -41, -91, -104, 3, 84, -66, -19, 79, -41, -74, -27, 88, 22, -100}, new byte[]{-57, 98, 39, -31, -127, 38, -92, -62}));
            Map<String, String> mapU = u();
            ((HashMap) mapU).put(C0098a.a(new byte[]{117, -54, 94, -97, -8, 87, -51, -98, 98, -36, 64, -114}, new byte[]{54, -91, 48, -21, -99, 57, -71, -77}), C0098a.a(new byte[]{-59, -80, 61, -94, -47, -95, 43, 67, -51, -81, 35, -31, -46, -79, 37, 89}, new byte[]{-92, -64, 77, -50, -72, -62, 74, 55}));
            String strOptString = new JSONObject(C0197c.g(str2, jSONObject.toString(), mapU).a()).optJSONObject(C0098a.a(new byte[]{36, 124, -73, -98}, new byte[]{64, 29, -61, -1, 108, 73, -78, -44})).optJSONArray(C0098a.a(new byte[]{-60, 113, -22, -46, 122, -111, 68, 29, -45, 119, -21, -54, 108}, new byte[]{-89, 30, -124, -92, 31, -29, 55, 124})).optJSONObject(0).optJSONArray(C0098a.a(new byte[]{49, 31, -12, 59, -60, 57, 5, -124, 35}, new byte[]{87, 118, -104, 94, -101, 85, 108, -9})).optJSONObject(0).optJSONObject(C0098a.a(new byte[]{-58, -61, -92, 112, 41, -73, -122, 53, -64, -54, -66}, new byte[]{-75, -90, -54, 20, 118, -59, -29, 70})).optString(C0098a.a(new byte[]{-96, -32, -73, -79, -84, -87, 45, -55, -76, -53, -79, -89}, new byte[]{-45, -108, -40, -61, -55, -10, 64, -70}));
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return new JSONObject(C0197c.g(C0098a.a(new byte[]{113, 80, -48, -124, -104, 4, -98, -5, 125, 86, -51, -126, -114, 19, -62, -69, 122, 77, -59, -104, -58, 95, -63, -67, 55, 85, -47, -107, -103, 85, -97, -73, 119, 11, -107, -37, -120, 82, -34, -95, 125, 64, -42, -99, -99, 91, -98, -73, 113, 69, -48, -37, -120, 81, -33, -94, 54, 66, -51, -104, -114, 17, -48, -73, 104, 81, -51, -122, -114, 97, -43, -72, 70, 80, -53, -97, -114, 80, -114, -92, 107, 25, -47, -105, -101, 76, -34, -14, 127, 86, -103, -124, -120, 24, -62, -83, 106, 25, -45, -99, -123, 13, -125, -14, 111, 65, -103, -57, -59, 15, -124, -6, 41, 2, -47, -128, -42}, new byte[]{25, 36, -92, -12, -21, 62, -79, -44}) + this.e + C0098a.a(new byte[]{58, -18, 118, -2, 51, 112}, new byte[]{28, -119, 3, -105, 87, 77, -48, -94}), new JSONObject(C0098a.a(new byte[]{-5, 8, -17, 18, 8, 26, 94, 30, -13, 75, -8, 20, 9, 2, 100, 5, -28, 8, -74, 95, 85, 92, 11, 92, -80, 26, -68, 77, 85, 88, 9, 85, -76, 26, -66, 78, 94, 95, 25, 64, -94, 73, -29, 19, 16, 9, 73, 31, -31, 94, -27, 18, 8, 51, 79, 21, -16, 79, -82, 71, 85, 64, 25, 1, -13, 77, -45, 20, 2, 78, 1, 78}, new byte[]{-128, 42, -116, 125, 102, 108, 59, 108}) + strOptString + C0098a.a(new byte[]{42, -51}, new byte[]{8, -80, 64, 62, 91, -33, -12, -31})).toString(), mapU).a()).optJSONObject(C0098a.a(new byte[]{126, -103, 35, 56}, new byte[]{26, -8, 87, 89, 116, -55, -55, 85})).optString(C0098a.a(new byte[]{-27, -5, -65, -39, -84}, new byte[]{-111, -108, -44, -68, -62, 52, 43, 28}));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final com.github.catvod.spider.merge.c.k z(String str, String str2, String str3) {
        if (TextUtils.isEmpty(J(str))) {
            return C0207D.e();
        }
        ArrayList arrayList = new ArrayList();
        C0182a c0182a = new C0182a();
        c0182a.j(str2);
        E(str, c0182a, arrayList);
        if (arrayList.size() < 1) {
            return C0207D.e();
        }
        this.d.d(arrayList);
        List listAsList = Arrays.asList(C0098a.a(new byte[]{32, -24, 82, -115, 109, -19, -77, -56, 90, -85, 126, -45}, new byte[]{-59, 76, -22, 104, -24, 102, 86, 70}), C0098a.a(new byte[]{111, 98, -11, -31, -16, 23, 38, 46, 14, 46, -22, -116}, new byte[]{-118, -58, 77, 4, 117, -100, -49, -116}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strB = "";
            if (!it.hasNext()) {
                break;
            }
            C0182a c0182a2 = (C0182a) it.next();
            if (!TextUtils.isEmpty(c0182a2.e())) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0098a.a(new byte[]{34}, new byte[]{121, -98, -20, -62, -71, -122, 40, 39}));
                sb.append(c0182a2.e().trim());
                strB = C0133t.b(new byte[]{-29}, new byte[]{-66, 40, 116, -11, 3, 31, -10, 88}, sb);
            }
            StringBuilder sbC = C0133t.c(strB);
            sbC.append(c0182a2.c());
            sbC.append(c0182a2.g());
            v.a(new byte[]{55}, new byte[]{19, 69, -23, -62, 81, -11, -73, -76}, sbC, str);
            sbC.append(C0098a.a(new byte[]{-71}, new byte[]{-110, 68, -112, 6, -96, 46, -101, 22}));
            sbC.append(c0182a2.b());
            sbC.append(C0098a.a(new byte[]{-76}, new byte[]{-97, 6, -117, -30, -50, -112, -99, 78}));
            sbC.append(c0182a2.f());
            String string = sbC.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(C0098a.a(new byte[]{36, -49, 89, 107}, new byte[]{76, -69, 45, 27, 30, -38, 9, 26}))) {
                StringBuilder sbC2 = C0133t.c(string);
                v.a(new byte[]{84}, new byte[]{127, 127, -23, 56, 125, 9, -94, 22}, sbC2, str3);
                sbC2.append(C0098a.a(new byte[]{-112}, new byte[]{-69, -105, 2, -90, 87, -70, 71, -30}));
                sbC2.append(c0182a2.c());
                string = sbC2.toString();
            }
            arrayList2.add(string);
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList3.add(TextUtils.join(C0098a.a(new byte[]{21}, new byte[]{54, -127, 34, 33, 97, -43, 125, 90}), arrayList2));
        }
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(this.d.b() == null ? C0098a.a(new byte[]{-49, 91, -18, -10, -78, -68, -41, -74, -95, 60, -5, -126, -40, -70, -78, -10, -128, 101, -68, -73, -116, -62, -117, -76}, new byte[]{39, -43, 89, 19, 61, 42, 63, 17}) : this.d.b().b());
        kVar.k(TextUtils.join(C0098a.a(new byte[]{119, 69, 21}, new byte[]{83, 97, 49, 125, 123, -78, -98, -42}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{71, 72, 5}, new byte[]{99, 108, 33, 43, -44, 62, 66, 85}), listAsList));
        kVar.b(C0098a.a(new byte[]{-84, -26, -16, 16, 107, 24, 39, -64, -40, -91, -45, 109}, new byte[]{73, 66, 72, -11, -18, -109, -64, 125}));
        return kVar;
    }
}
