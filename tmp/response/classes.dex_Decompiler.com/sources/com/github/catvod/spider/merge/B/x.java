package com.github.catvod.spider.merge.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.d.C0144c;
import com.github.catvod.spider.merge.d.C0145d;
import com.github.catvod.spider.merge.d.C0146e;
import com.github.catvod.spider.merge.d.C0147f;
import com.github.catvod.spider.merge.d.C0148g;
import com.github.catvod.spider.merge.d.C0149h;
import com.github.catvod.spider.merge.d.C0150i;
import com.github.catvod.spider.merge.d.C0151j;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0219l;
import com.github.catvod.spider.merge.p.C0221n;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class x {
    private final Map<String, Map<String, String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final List<String> d;
    private final ReentrantLock e;
    private final C0144c f;
    private ScheduledExecutorService g;
    private String h;
    private AlertDialog i;
    private com.github.catvod.spider.merge.d.o j;

    x() {
        Init.checkPermission();
        this.e = new ReentrantLock();
        this.d = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        C0144c c0144c = (C0144c) C0132s.a(C0208a.j(q()), C0144c.class);
        this.f = c0144c == null ? new C0144c() : c0144c;
    }

    private static boolean A(String str) {
        String value = new UrlQuerySanitizer(str).getValue(C0098a.a(new byte[]{-56, -116, 64, 17, 90, 64, -124, 63, -64, -56, 93, 7, 90}, new byte[]{-80, -95, 47, 98, 41, 109, -31, 71}));
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    private void B(String str, C0149h c0149h, List<C0149h> list, List<C0149h> list2) {
        C(str, c0149h, list, list2, "");
    }

    private void C(String str, C0149h c0149h, List<C0149h> list, List<C0149h> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0098a.a(new byte[]{6, 32, 62, 86, -99}, new byte[]{106, 73, 83, 63, -23, -102, 44, 26}), 200);
        jsonObject.addProperty(C0098a.a(new byte[]{82, -107, 18, -73, -46, -78, 29, 93}, new byte[]{33, -3, 115, -59, -73, -19, 116, 57}), str);
        jsonObject.addProperty(C0098a.a(new byte[]{-21, -126, -46, 114, 3, 110, -125, 113, -14, -113, -59, 72, 4, 126}, new byte[]{-101, -29, -96, 23, 109, 26, -36, 23}), c0149h.d());
        jsonObject.addProperty(C0098a.a(new byte[]{-110, -26, -63, -18, -126, -5, -54, -5}, new byte[]{-3, -108, -91, -117, -16, -92, -88, -126}), C0098a.a(new byte[]{35, -44, 17, -71}, new byte[]{77, -75, 124, -36, 10, -56, 37, 101}));
        jsonObject.addProperty(C0098a.a(new byte[]{56, -116, 23, -60, 56, 94, 108, 72, 37, -101, 16, -43, 35, 110, 102}, new byte[]{87, -2, 115, -95, 74, 1, 8, 33}), C0098a.a(new byte[]{-51, 85, -64}, new byte[]{-116, 6, -125, 56, -42, -70, 102, -116}));
        if (str2.length() > 0) {
            jsonObject.addProperty(C0098a.a(new byte[]{-118, -17, 12, -86, -77, -4}, new byte[]{-25, -114, 126, -63, -42, -114, 54, 110}), str2);
        }
        C0149h c0149h2 = (C0149h) C0132s.a(m(C0098a.a(new byte[]{-79, 109, 0, -113, -82, 70, -127, 2, -29, 38, 20, -113, -76, 70, -127, 24, -71, 122, 6}, new byte[]{-48, 9, 114, -26, -40, 35, -82, 116}), jsonObject.toString(), true), C0149h.class);
        for (C0149h c0149h3 : c0149h2.e()) {
            if (c0149h3.j().equals(C0098a.a(new byte[]{100, -81, -37, -128, -19, -102}, new byte[]{2, -64, -73, -28, -120, -24, 101, -80}))) {
                arrayList.add(c0149h3);
            } else if (c0149h3.a().equals(C0098a.a(new byte[]{-89, 24, 121, -54, 77}, new byte[]{-47, 113, 29, -81, 34, -94, -62, 97})) || c0149h3.a().equals(C0098a.a(new byte[]{71, -107, -110, -71, -58}, new byte[]{38, -32, -10, -48, -87, -102, -67, 2}))) {
                c0149h3.k(c0149h.f());
                list.add(c0149h3);
            } else if (C0207D.n(c0149h3.c())) {
                list2.add(c0149h3);
            }
        }
        if (c0149h2.g().length() > 0) {
            C(str, c0149h, list, list2, c0149h2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B(str, (C0149h) it.next(), list, list2);
        }
    }

    private String D(String str, String str2, boolean z) {
        boolean zL;
        if (!str.startsWith(C0098a.a(new byte[]{69, 72, 82, 25, 38}, new byte[]{45, 60, 38, 105, 85, 124, 86, 24}))) {
            str = C0134u.b(new byte[]{29, 14, -41, -126, -117, 15, 54, -81, 26, 10, -58, -100, -42, 84, 117, -23, 12, 15, -51, -106, -118, 92, 111, -27, 91, 25, -52, -97, -41, 84, 125, -14, 28, 12, -58, -35, -114, 4, 55, -80, 90}, new byte[]{117, 122, -93, -14, -8, 53, 25, -128}, new StringBuilder(), str);
        }
        HashMap<String, String> mapS = s();
        mapS.put(C0098a.a(new byte[]{-99, 50, -44, -77, 28, 43, -85, -108, -99, 51, -55, -76, 29}, new byte[]{-4, 71, -96, -37, 115, 89, -62, -18}), this.f.b().b());
        C0199e c0199eG = C0197c.g(str, str2, mapS);
        StringBuilder sb = new StringBuilder();
        sb.append(c0199eG.b());
        v.a(new byte[]{-19}, new byte[]{-63, -24, -7, -70, -100, 122, 120, 44}, sb, str);
        sb.append(C0098a.a(new byte[]{39}, new byte[]{11, -71, -124, -27, -77, 30, 123, -84}));
        sb.append(c0199eG.a());
        SpiderDebug.log(sb.toString());
        if (z && (c0199eG.b() == 400 || c0199eG.b() == 401)) {
            if (this.f.b().c().isEmpty()) {
                SpiderDebug.log(C0098a.a(new byte[]{29, 0, -93, 24, 36, 108, -97, 10, 35, 52, -77, 31, 56, 98, -29, 65}, new byte[]{82, 65, -42, 108, 76, 76, -51, 111}));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(C0098a.a(new byte[]{76, 109, -6, -28, 24, 107, 95, 108, 72}, new byte[]{45, 24, -114, -116, 119, 25, 54, 22}), 1);
                jsonObject.addProperty(C0098a.a(new byte[]{-70, -45, -106, -23, -67}, new byte[]{-55, -80, -7, -103, -40, 78, -1, -10}), C0098a.a(new byte[]{-27, -33, 68, 60, -40, 75, -117, -114, -11, -128, 71, 39, -114, 76, -48, -100, -4, -64, 27, 60, -121, 72, -114, -47, -10, -59, 77, 43, -40, 72, -122, -111, -86, -37, 83, 39, -106, 76}, new byte[]{-112, -84, 33, 78, -30, 41, -22, -3}));
                String strA = ((C0145d) C0132s.a(m(C0098a.a(new byte[]{27, 117, -80, 81, 38, -37, -80, -43, 28, 113, -95, 79, 123, -128, -13, -109, 10, 116, -86, 69, 39, -120, -23, -97, 93, 98, -85, 76, 122, -114, -2, -113, 7, 105, -21, 84, 38, -124, -19, -119, 92, 96, -79, 85, 61, -114, -19, -109, 9, 100, -5, 66, 57, -120, -6, -108, 7, 94, -83, 69, 104, -42, -87, -61, 66, 54, -89, 66, 54, -126, -5, -50, 71, 53, -11, 66, 102, -40, -85, -49, 68, 96, -12, 21, 51, -41, -81, -62, 71, 103, -90, 19, 51, -57, -19, -97, 23, 104, -74, 68, 54, -107, -64, -113, 1, 104, -7, 73, 33, -107, -17, -119, 73, 46, -21, 64, 57, -120, -20, -114, 93, 111, -86, 15, 54, -120, -80, -114, 28, 110, -88, 14, 52, -115, -10, -125, 6, 111, -96, 83, 60, -105, -6, -43, 16, 96, -88, 77, 55, -128, -4, -111, 85, 114, -89, 78, 37, -124, -94, -113, 0, 100, -74, 27, 55, -128, -20, -97, 95, 103, -83, 77, 48, -37, -2, -106, 31, 59, -74, 68, 52, -123, -77, -100, 26, 109, -95, 27, 52, -115, -13, -64, 4, 115, -83, 85, 48, -57, -20, -114, 18, 117, -95, 28}, new byte[]{115, 1, -60, 33, 85, -31, -97, -6}), jsonObject.toString(), true), C0145d.class)).a();
                SpiderDebug.log(C0098a.a(new byte[]{-60, 122, 28, 46, 56, -88, 3, -69, -17, 82, 27, 63, 51, -4, 127, -16, -91}, new byte[]{-117, 59, 105, 90, 80, -120, 81, -34}));
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty(C0098a.a(new byte[]{-5, -12, 29, 52}, new byte[]{-104, -101, 121, 81, -123, -22, 12, 42}), strA);
                jsonObject2.addProperty(C0098a.a(new byte[]{14, 113, 18, 53, 126, -74, 27, -16, 25, 102}, new byte[]{105, 3, 115, 91, 10, -23, 111, -119}), C0098a.a(new byte[]{-122, -66, -16, 31, 29, -94, 79, -74, -122, -65, -19, 24, 28, -113, 69, -93, -125, -82}, new byte[]{-25, -53, -124, 119, 114, -48, 38, -52}));
                zL = l(C0098a.a(new byte[]{29, 69, 9, -107}, new byte[]{126, 42, 109, -16, 12, 90, 18, -76}), jsonObject2);
            } else {
                SpiderDebug.log(C0098a.a(new byte[]{-104, -117, -11, 94, -17, 87, -33, -115, -102, -117, -3, 120, -27, 79, -46, -84, -60, -64, -67}, new byte[]{-22, -18, -109, 44, -118, 36, -73, -62}));
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty(C0098a.a(new byte[]{74, 29, -67, 38, 0, -87, -107, -15, 93, 10}, new byte[]{45, 111, -36, 72, 116, -10, -31, -120}), C0098a.a(new byte[]{58, -27, 27, 62, -48, 8, -122, -69, 60, -17, 22, 41, -37}, new byte[]{72, -128, 125, 76, -75, 123, -18, -28}));
                jsonObject3.addProperty(C0098a.a(new byte[]{26, 106, 92, -42, 95, 59, -41, -41, 28, 96, 81, -63, 84}, new byte[]{104, 15, 58, -92, 58, 72, -65, -120}), this.f.b().c());
                zL = l(C0098a.a(new byte[]{87, -21, -56, -34, 4}, new byte[]{35, -124, -93, -69, 106, -105, 106, 12}), jsonObject3);
            }
            if (zL) {
                return D(str, str2, false);
            }
        }
        return c0199eG.a();
    }

    private String F(String str, JsonObject jsonObject) {
        if (!str.startsWith(C0098a.a(new byte[]{-37, 75, 9, -22, 18}, new byte[]{-77, 63, 125, -102, 97, 77, 93, -119}))) {
            str = C0134u.b(new byte[]{89, 8, -72, -22, 124, 91, 26, -72, 80, 12, -91, -76, 110, 13, 92, -18, 68, 18, -88, -24, 102, 23, 80, -71, 82, 19, -95, -75}, new byte[]{49, 124, -52, -102, 15, 97, 53, -105}, new StringBuilder(), str);
        }
        C0199e c0199eG = C0197c.g(str, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0199eG.b());
        v.a(new byte[]{-45}, new byte[]{-1, 40, -29, -88, 71, -17, -79, -53}, sb, str);
        sb.append(C0098a.a(new byte[]{103}, new byte[]{75, -82, -30, -92, 29, -70, 97, -89}));
        sb.append(c0199eG.a());
        SpiderDebug.log(sb.toString());
        return c0199eG.a();
    }

    private boolean I() {
        int i = 0;
        try {
            try {
                SpiderDebug.log(C0098a.a(new byte[]{57, 64, -83, -35, -18, -69, 43, 116, 40, 70, -82, -36, -8, -100, 44, 94, 46, 75, -27, -127, -91}, new byte[]{75, 37, -53, -81, -117, -56, 67, 53}));
                JsonObject jsonObject = new JsonObject();
                String strD = this.f.c().d();
                if (strD.isEmpty()) {
                    strD = this.h;
                }
                if (strD != null && strD.startsWith(C0098a.a(new byte[]{39, 93, -117, -73}, new byte[]{79, 41, -1, -57, -126, 112, 121, -23}))) {
                    strD = C0197c.l(strD, null).trim();
                }
                jsonObject.addProperty(C0098a.a(new byte[]{66, -79, -82, 98, -40, -111, -97, 60, 68, -69, -93, 117, -45}, new byte[]{48, -44, -56, 16, -67, -30, -9, 99}), strD);
                jsonObject.addProperty(C0098a.a(new byte[]{-1, -115, -83, 43, 51, -116, -23, -21, -24, -102}, new byte[]{-104, -1, -52, 69, 71, -45, -99, -110}), C0098a.a(new byte[]{-37, 43, -69, 50, -108, -43, -35, 47, -35, 33, -74, 37, -97}, new byte[]{-87, 78, -35, 64, -15, -90, -75, 112}));
                String strF = F(C0098a.a(new byte[]{112, 127, -41, -82, 87, 26, 37, -88, 121, 126, -41, -74, 10, 65, 102, -18, 97, 126, -51, -70, 86, 73, 124, -30, 54, 104, -52, -77, 11, 86, 56, -88, 121, 104, -64, -79, 81, 78, 126, -88, 108, 100, -56, -69, 74}, new byte[]{24, 11, -93, -34, 36, 32, 10, -121}), jsonObject);
                C0144c c0144c = this.f;
                com.github.catvod.spider.merge.d.p pVar = (com.github.catvod.spider.merge.d.p) new Gson().fromJson(strF, com.github.catvod.spider.merge.d.p.class);
                if (pVar == null) {
                    pVar = new com.github.catvod.spider.merge.d.p();
                }
                c0144c.g(pVar);
                if (this.f.c().b().isEmpty()) {
                    throw new Exception(strF);
                }
                while (this.f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    O();
                    while (this.f.c().b().isEmpty()) {
                        SystemClock.sleep(250L);
                    }
                    return false;
                }
                this.f.c().a();
                e.printStackTrace();
                O();
                Init.run(new RunnableC0119e(this, i));
                while (this.f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (this.f.c().b().isEmpty()) {
                SystemClock.sleep(250L);
            }
            throw th;
        }
    }

    private void J(String str) {
        com.github.catvod.spider.merge.d.o oVar = this.j;
        if (oVar == null || !oVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-117, -85, 89, -106, 11, 41, 63, 68}, new byte[]{-8, -61, 56, -28, 110, 118, 86, 32}), str);
            jsonObject.addProperty(C0098a.a(new byte[]{116, -80, 67, 99, 66, -72, -106, 47, 99}, new byte[]{7, -40, 34, 17, 39, -25, -26, 88}), "");
            com.github.catvod.spider.merge.d.o oVar2 = (com.github.catvod.spider.merge.d.o) C0132s.a(F(C0098a.a(new byte[]{-112, 32, -32, -67, -67, -36, 106, 83, -71, 126, -90, -96, -66, -110, 127, 83, -110, 77, -68, -90, -76, -49, 125, 105, -110, 125, -92, -85, -69}, new byte[]{-26, 18, -49, -50, -43, -67, 24, 54}), jsonObject), com.github.catvod.spider.merge.d.o.class);
            oVar2.f(str);
            oVar2.g();
            this.j = oVar2;
            if (oVar2.e().isEmpty()) {
                C0219l.b(C0098a.a(new byte[]{-76, 79, -5, 3, 49, 96, 88, -1, -12, 61, -30, 105, 64, 85, 24, -113, -38, 84, -70, 95, 3, 31, 10, -40, -73, 118, -17, 3, 61, 114, 82, -42, -45}, new byte[]{82, -46, 94, -27, -88, -6, -67, 106}));
            }
        }
    }

    private void M(String str) {
        this.f.c().f(str);
        SpiderDebug.log(C0098a.a(new byte[]{-78, 112, 99, -71, 76, -33}, new byte[]{-26, 31, 8, -36, 34, -27, -72, 61}) + str);
        C0219l.b(C0098a.a(new byte[]{32, 36, -24, 54, -16, 81}, new byte[]{116, 75, -125, 83, -98, 107, 36, -107}) + str);
        I();
        O();
    }

    private void N(C0146e c0146e) {
        try {
            int iA = C0212e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0213f.c(c0146e.a(), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            int i = 0;
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0127m(this, i)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0130p(this, i)).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C0219l.b(C0098a.a(new byte[]{-109, -70, 92, 108, -108, -122, -116, -80, -45, -4, 115, 55, -64, -66, -25, -64, -63, -124, 12, 19, -79, 25, 42, 84, 11, 53, 13, 1, -126, -33, -28, -85, -97, -81, 103, 111, -110, -115, -116, -124, -6}, new byte[]{123, 21, -21, -120, 41, 57, 107, 36}));
        } catch (Exception unused) {
        }
    }

    private void O() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new r(this, 1));
    }

    public static void a(x xVar, String str) {
        xVar.getClass();
        if (str.startsWith(C0098a.a(new byte[]{20, 101, 73, -63}, new byte[]{124, 17, 61, -79, -72, 57, -45, -29}))) {
            str = C0197c.l(str, null);
        }
        xVar.M(str);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void b(x xVar) {
        xVar.getClass();
        for (String str : new ArrayList(xVar.d)) {
            SpiderDebug.log(C0098a.a(new byte[]{-107, 83, 122, -7, -97, 87, -67, -64, -1}, new byte[]{-47, 54, 22, -100, -21, 50, -109, -18}) + str);
            if (((com.github.catvod.spider.merge.d.n) C0132s.a(xVar.m(C0098a.a(new byte[]{35, -62, -103, -79, 11, -60, 78, 126, 112, -119, -119, -71, 9, -62, 9}, new byte[]{66, -90, -21, -40, 125, -95, 97, 8}), String.format(C0098a.a(new byte[]{64, 25, -100, 80, 32, 69, 98, 43, 79, 72, -52, 15, 10, 75, 37, 58, 84, 95, -105, 23, 107, 75, 37, 60, 73, 82, -104, 80, 14, 89, 99, 122, 1, 25, -53, 70, 115, 28, 37, 62, 82, 87, -117, 106, 56, 84, 37, 98, 25, 30, -99, 23, 44, 28, 37, 48, 94, 90, -118, 80, 35, 67, 37, 98, 64, 25, -83, 90, 63, 68, 98, 54, 79, 22, -70, 76, 33, 85, 37, 98, 25, 90, -98, 69, 61, 89, 100, 57, 79, 82, -127, 91, 126, 90, 116, 55, 85, 25, -109, 25, 115, 89, 99, 122, 1, 25, -53, 70, 115, 28, 37, 53, 94, 79, -122, 90, 53, 18, 61, 122, 107, 116, -67, 97, 115, 28, 37, 45, 73, 87, -52, 15, 115, 31, 97, 49, 87, 94, -63, 81, 52, 92, 98, 44, 94, 25, -109, 104, 125, 18, 117, 61, 72, 84, -101, 71, 50, 85, 37, 98, 25, 93, -121, 89, 52, 18, 122}, new byte[]{59, 59, -18, 53, 81, 48, 7, 88}), xVar.f.a().a(), str, str), true), com.github.catvod.spider.merge.d.n.class)).b().c() == 404) {
                xVar.d.remove(str);
            }
        }
    }

    public static void c(x xVar) {
        xVar.O();
    }

    public static /* synthetic */ void d(x xVar, Map map) {
        xVar.getClass();
        C0146e c0146eC = C0146e.g(C0197c.i(C0098a.a(new byte[]{31, 43, -105, -94, -10, -78, -117, 95, 7, 62, -112, -95, -11, -25, -42, 4, 89, 62, -113, -69, -4, -3, -54, 20, 5, 54, -107, -73, -85, -21, -53, 29, 88, 49, -122, -91, -23, -25, -61, 25, 25, 112, -110, -96, -26, -25, -64, 21, 88, 46, -106, -73, -9, -15, -118, 20, 24, 96, -126, -94, -11, -58, -59, 29, 18, 98, -126, -66, -20, -15, -47, 30, 40, 59, -111, -69, -13, -19, -126, 22, 5, 48, -114, -127, -20, -4, -63, 77, 66, 109, -59, -115, -25, -16, -119, 6, 74, 109, -51, -32, -85, -69}, new byte[]{119, 95, -29, -46, -123, -120, -92, 112}), map)).b().c();
        if (c0146eC.f()) {
            xVar.M(c0146eC.e());
        }
    }

    public static void f(x xVar) {
        xVar.o();
        Init.execute(new RunnableC0131q(xVar, 1));
    }

    public static void g(x xVar) {
        xVar.O();
    }

    public static void h(x xVar, EditText editText) {
        xVar.getClass();
        String string = editText.getText().toString();
        xVar.o();
        Init.execute(new RunnableC0124j(xVar, string, 0));
    }

    public static void i(x xVar, C0146e c0146e) {
        xVar.getClass();
        Map<String, String> mapD = c0146e.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        xVar.g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0125k(xVar, mapD, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(x xVar, String str, C0146e c0146e) {
        Runnable runnableC0122h;
        xVar.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent(C0098a.a(new byte[]{-58, -96, 90, -19, -8, -89, -17, -96, -50, -96, 74, -6, -7, -70, -91, -17, -60, -70, 87, -16, -7, -32, -35, -57, -30, -103}, new byte[]{-89, -50, 62, -97, -105, -50, -117, -114}));
                intent.setClassName(C0098a.a(new byte[]{-46, -91, 82, -72, -103, -75, -125, 110, -35, -91, 74, -14, -42, -67, -117, 121, -48, -88, 80, -18}, new byte[]{-79, -54, 63, -106, -8, -39, -22, 13}), C0098a.a(new byte[]{60, -118, 70, -6, -55, 1, -8, -72, 62, -118, 5, -72, -46, 7, -2, -76, 107, -124, 69, -80, -49, 15, -2, -66, 113, -106, 72, -75, -45, 78, -58, -88, 12, -122, 74, -70, -4, 3, -29, -77, 41, -116, 95, -83}, new byte[]{95, -27, 43, -44, -67, 96, -105, -38}));
                intent.putExtra(C0098a.a(new byte[]{3, -17, 93, -113, -46, 126, 82, 109, 56, -21, 86, -79, -52}, new byte[]{104, -118, 36, -48, -95, 29, 51, 3}), str);
                Init.getActivity().startActivity(intent);
                runnableC0122h = new RunnableC0121g(xVar, c0146e, i);
            } catch (Exception unused) {
                xVar.N(c0146e);
                runnableC0122h = new RunnableC0122h(xVar, c0146e, i);
            }
            Init.execute(runnableC0122h);
        } catch (Throwable th) {
            Init.execute(new RunnableC0123i(xVar, c0146e, i));
            throw th;
        }
    }

    public static void k(final x xVar) {
        xVar.getClass();
        try {
            int iA = C0212e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            xVar.i = new AlertDialog.Builder(Init.getActivity()).setTitle(C0098a.a(new byte[]{-103, 4, 44, 54, -19, 114, 111, -85, -44, -1, -12, -75, 54, -113, 105, -82, -31, 77, 15, 113, -75, 109, 11, 29, 67, 79, 38, 83, -74, 115, 6, 102, 5, -33, -21, 61, -45, 112}, new byte[]{113, -85, -101, -34, 83, -31, -118, 46})).setView(frameLayout).setNeutralButton(C0098a.a(new byte[]{3, 43, -18, -45, 21, 74, -10, -10, -105, 119, -15, -68, 104, 79, 52}, new byte[]{-25, -111, 127, 52, -114, -46, -73, -122}), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    x.f(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    x.h(this.a, editText);
                }
            }).show();
        } catch (Exception unused) {
        }
    }

    private boolean l(String str, JsonObject jsonObject) {
        boolean z;
        String strB = C0134u.b(new byte[]{-36, -40, 77, 13, 91, -15, 42, 121, -43, -36, 80, 83, 80, -93, 106, 48, -47, -126, 77, 18, 88, -28, 100, 58, -35, -33, 77, 82, 73, -89, 108, 9, -37, -36, 92, 19, 7}, new byte[]{-76, -84, 57, 125, 40, -53, 5, 86}, new StringBuilder(), str);
        C0199e c0199eG = C0197c.g(strB, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0199eG.b());
        v.a(new byte[]{-71}, new byte[]{-107, 68, -92, 14, -97, 1, -7, 48}, sb, strB);
        sb.append(C0098a.a(new byte[]{70}, new byte[]{106, 120, 3, -12, -77, -7, -68, 120}));
        sb.append(c0199eG.a());
        SpiderDebug.log(sb.toString());
        if (c0199eG.a().contains(C0098a.a(new byte[]{120, 77, -82, -31, -105, -55, -89, 126, 12, 112, -92, -80, -81, -51, -70, 115, 95}, new byte[]{44, 34, -63, -63, -38, -88, -55, 7}))) {
            C0219l.b(C0098a.a(new byte[]{-15, 74, -15, -103, -27, -74, -32, 63, -74, 27, -10, -40, -66, -99, -117, 68, -75, 88, -113, -8, -35, -60, -110, 7, -2, 125, -37, -103, -51, -88, -24, 30, -106}, new byte[]{23, -2, 102, 127, 81, 33, 7, -94}));
            this.f.b().a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        C0144c c0144c = this.f;
        C0150i c0150i = (C0150i) C0132s.a(c0199eG.a(), C0150i.class);
        if (c0150i == null) {
            c0150i = new C0150i();
        }
        c0144c.f(c0150i);
        return true;
    }

    private String m(String str, String str2, boolean z) {
        HashMap<String, String> mapT;
        if (!str.startsWith(C0098a.a(new byte[]{7, -64, -25, -2, -76}, new byte[]{111, -76, -109, -114, -57, -51, 97, -81}))) {
            str = C0134u.b(new byte[]{52, -78, 101, -119, -52, -90, -53, -123, 61, -74, 120, -41, -34, -16, -115, -45, 41, -88, 117, -117, -42, -22, -127, -124, 63, -87, 124, -42}, new byte[]{92, -58, 17, -7, -65, -100, -28, -86}, new StringBuilder(), str);
        }
        if (str.contains(C0098a.a(new byte[]{120, 77, -38, -9, 77, 22, 21, 109, 106}, new byte[]{30, 36, -74, -110, 98, 122, 124, 30}))) {
            mapT = s();
            mapT.put(C0098a.a(new byte[]{120, -63, -34, -62, -79, 121, 36, -70, 116, -125, -58, -49, -66}, new byte[]{0, -20, -83, -86, -48, 11, 65, -105}), this.j.e());
            mapT.put(C0098a.a(new byte[]{6, 112, -48, 23, -15, -104, 83, -59}, new byte[]{94, 93, -109, 118, -97, -7, 33, -68}), C0098a.a(new byte[]{-1, -13, 53, 25, -39, -109, 43, 32, -14, -5, 46, 19, -34, -125, 58, 0, -20, -17, 97, 29, -45, -107, 127, 23, -7, -77, 42, 25, -59, -108, 127, 14, -14, -94, 42, 72, -103, -44, 56, 80}, new byte[]{-100, -97, 92, 124, -73, -25, 22, 97}));
        } else {
            mapT = t();
        }
        C0199e c0199eG = C0197c.g(str, str2, mapT);
        StringBuilder sb = new StringBuilder();
        sb.append(c0199eG.b());
        v.a(new byte[]{-27}, new byte[]{-55, -7, 88, 78, -112, -53, -79, -72}, sb, str);
        sb.append(C0098a.a(new byte[]{34}, new byte[]{14, -92, 82, 114, -55, 30, 8, 76}));
        sb.append(c0199eG.a());
        SpiderDebug.log(sb.toString());
        return (z && c0199eG.b() == 401 && I()) ? m(str, str2, false) : (z && c0199eG.b() == 429) ? m(str, str2, false) : c0199eG.a();
    }

    private String n(String str, String str2) {
        if (this.f.a().a().isEmpty()) {
            SpiderDebug.log(C0098a.a(new byte[]{105, -96, 127, -85, 118, 82, 116, 93, 75, -27, 66, -17, 28, 14, 51}, new byte[]{46, -59, 11, -117, 50, 32, 29, 43}));
            String strM = m(C0098a.a(new byte[]{39, -16, 88, -92, -102, -110, 1, -101, 58, -9, 73, -90, -57, -55, 66, -35, 54, -15, 66, -80, -101, -63, 88, -47, 97, -25, 67, -71, -58, -34, 28, -101, 58, -9, 73, -90, -58, -49, 75, -64}, new byte[]{79, -124, 44, -44, -23, -88, 46, -76}), C0098a.a(new byte[]{86, -55}, new byte[]{45, -76, -6, -126, -127, -41, -49, 72}), true);
            C0144c c0144c = this.f;
            C0148g c0148g = (C0148g) C0132s.a(strM, C0148g.class);
            if (c0148g == null) {
                c0148g = new C0148g();
            }
            c0144c.e(c0148g);
        }
        SpiderDebug.log(C0098a.a(new byte[]{51, -109, -46, -67, 3, -44, -92}, new byte[]{112, -4, -94, -60, 45, -6, -118, -112}) + str2);
        return ((com.github.catvod.spider.merge.d.n) C0132s.a(m(C0098a.a(new byte[]{95, 59, -86, -53, 24, -122, 40, -21, 12, 112, -70, -61, 26, -128, 111}, new byte[]{62, 95, -40, -94, 110, -29, 7, -99}), String.format(C0098a.a(new byte[]{65, 77, -75, 4, -89, -92, -90, -109, 78, 28, -27, 91, -115, -86, -31, -126, 85, 11, -66, 67, -20, -86, -31, -122, 83, 3, -94, 62, -65, -75, -31, -38, 24, 74, -76, 67, -6, -13, -80, -120, 91, 29, -94, 62, -65, -75, -31, -38, 24, 74, -76, 67, -6, -13, -94, -107, 78, 0, -104, 19, -77, -65, -94, -115, 95, 77, -3, 21, -92, -92, -90, -52, 24, 27, -88, 62, -90, -80, -79, -123, 84, 27, -104, 7, -65, -67, -90, -65, 83, 11, -27, 91, -12, -93, -84, -113, 78, 77, -21, 67, -94, -66, -100, -124, 72, 6, -79, 4, -119, -72, -89, -62, 0, 77, -30, 18, -12, -84, -17, -62, 82, 10, -90, 5, -77, -93, -80, -62, 0, 20, -27, 34, -71, -65, -73, -123, 84, 27, -22, 53, -81, -95, -90, -62, 0, 77, -90, 17, -90, -67, -86, -125, 91, 27, -82, 14, -72, -2, -87, -109, 85, 1, -27, 28, -6, -13, -86, -124, 24, 85, -27, 81, -12, -3, -31, -115, 95, 27, -81, 14, -78, -13, -7, -62, 106, 32, -108, 53, -12, -3, -31, -107, 72, 3, -27, 91, -12, -2, -91, -119, 86, 10, -24, 2, -71, -95, -70, -62, 71, 50, -21, 67, -92, -76, -80, -113, 79, 29, -92, 4, -12, -21, -31, -122, 83, 3, -94, 67, -85}, new byte[]{58, 111, -57, 97, -42, -47, -61, -32}), str2, str, this.f.a().a()), true), com.github.catvod.spider.merge.d.n.class)).b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static x p() {
        return w.a;
    }

    private HashMap<String, String> t() {
        HashMap<String, String> mapS = s();
        mapS.put(C0098a.a(new byte[]{37, 98, -4, -30, 55, -59, 95, 86, 41, 32, -28, -17, 56}, new byte[]{93, 79, -113, -118, 86, -73, 58, 123}), this.j.e());
        mapS.put(C0098a.a(new byte[]{-33, -22, 44, -44, 42, -113, -15, -43}, new byte[]{-121, -57, 111, -75, 68, -18, -125, -84}), C0098a.a(new byte[]{118, 126, -36, 56, -62, 25, 39, -27, 123, 118, -57, 50, -59, 9, 54, -59, 101, 98, -120, 60, -56, 31, 115, -46, 112, 62, -61, 56, -34, 30, 115, -53, 123, 47, -61, 105, -126, 94, 52, -107}, new byte[]{21, 18, -75, 93, -84, 109, 26, -92}));
        if (this.f.c().e()) {
            mapS.put(C0098a.a(new byte[]{84, -80, -27, -108, -10, 70, 2, -25, 84, -79, -8, -109, -9}, new byte[]{53, -59, -111, -4, -103, 52, 107, -99}), this.f.c().c());
        }
        return mapS;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private String u(String str, String str2, String str3) {
        String str4;
        List<String> listV = v(y(str, str2), str, str2, false);
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listV;
            if (i >= arrayList.size()) {
                break;
            }
            map.put((String) arrayList.get(i), (String) arrayList.get(i + 1));
            i += 2;
        }
        String str5 = (String) map.get(str3);
        String strL = C0197c.l(str5, s());
        String strD = oZP.d("7F");
        String[] strArrSplit = strL.split(strD);
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        int i2 = 8;
        sb.append(str5.substring(0, str5.lastIndexOf(C0098a.a(new byte[]{99}, new byte[]{76, 123, 93, -78, -46, 65, 126, 106}))));
        String strB = C0133t.b(new byte[]{-73}, new byte[]{-104, 39, 39, -40, 70, 15, -67, 33}, sb);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str6 = strArrSplit[i3];
            byte[] bArr = new byte[i2];
            // fill-array-data instruction
            bArr[0] = -112;
            bArr[1] = 9;
            bArr[2] = 105;
            bArr[3] = -10;
            bArr[4] = 53;
            bArr[5] = -18;
            bArr[6] = -83;
            bArr[7] = 32;
            if (str6.contains(C0098a.a(new byte[]{-24, 36, 6, -123, 70, -61, -56, 88, -32, 96, 27, -109, 70}, bArr))) {
                map2.put(String.valueOf(i4), strB + str6);
                byte[] bArr2 = new byte[i2];
                // fill-array-data instruction
                bArr2[0] = 27;
                bArr2[1] = 46;
                bArr2[2] = -79;
                bArr2[3] = -54;
                bArr2[4] = 114;
                bArr2[5] = -10;
                bArr2[6] = -4;
                bArr2[7] = 91;
                String strA = C0098a.a(new byte[]{118, 29, -60, -14}, bArr2);
                String strValueOf = String.valueOf(i4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str4 = strB;
                str6 = String.format(C0133t.b(new byte[]{-28, 8, 16, 105, 5, -34, 98, -10, -81, 21, 15, 49, 89, -60, 98, -76, -66, 3, 89, 55, 5, -58, 110, -19, -2, 31, 89, 39, 12, -45, 121, -75, -110, 8, 66, 113, 23, -108, 109, -71, -73, 9, 54, 48, 89, -105, 120, -10, -81, 9, 18, 36, 8, -45, 127, -75, -110, 8, 66, 113, 23, -108, 102, -75, -65, 5, 30, 29, 0, -113, 46, -93}, new byte[]{-37, 108, 127, 84, 100, -78, 11, -48}, sb2), strA, str, str2, str3, strValueOf);
                i4++;
            } else {
                str4 = strB;
            }
            arrayList2.add(str6);
            i3++;
            i2 = 8;
            strB = str4;
        }
        this.a.put(str2, map2);
        return TextUtils.join(strD, arrayList2);
    }

    private List<String> v(C0151j c0151j, String str, String str2, boolean z) {
        String strC;
        List<com.github.catvod.spider.merge.d.k> listB = c0151j.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(listB.get(size).b());
            if (z) {
                String strA = C0098a.a(new byte[]{-12, -119, -106, -15, 51, -84, 94}, new byte[]{-124, -5, -13, -121, 90, -55, 41, -110});
                String strB = listB.get(size).b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strC = String.format(C0133t.b(new byte[]{-61, -63, 35, 67, 7, 40, -12, -114, -120, -36, 60, 27, 91, 50, -12, -52, -103, -54, 106, 29, 7, 48, -8, -107, -39, -42, 106, 13, 14, 37, -17, -51, -75, -63, 113, 91, 21, 98, -5, -63, -112, -64, 5, 26, 91, 97, -18, -114, -120, -64, 33, 14, 10, 37, -23, -51, -75, -63, 113, 91, 21}, new byte[]{-4, -91, 76, 126, 102, 68, -99, -88}, sb), strA, str, str2, strB);
            } else {
                strC = listB.get(size).c();
            }
            arrayList.add(strC);
        }
        return arrayList;
    }

    public final String E(String[] strArr, String str) {
        if (!str.split(C0098a.a(new byte[]{-76}, new byte[]{-105, -46, -125, -104, 45, -41, -82, 75}))[0].equals(C0098a.a(new byte[]{113, 2, -25, 60, -65, 2, -81, 58, 54, 125, -52, 110}, new byte[]{-104, -102, 88, -43, 56, -114, 73, -93}))) {
            if (!str.split(C0098a.a(new byte[]{-125}, new byte[]{-96, -61, -124, 22, -122, 16, -43, 38}))[0].contains(C0098a.a(new byte[]{16, -36, 29, -106, 12, -47, -82, -37, 102, -93, 54, -60}, new byte[]{-7, 68, -94, 127, -117, 93, 75, 85}))) {
                return "";
            }
            com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
            String strA = C0098a.a(new byte[]{-112, 111, 88, 98}, new byte[]{-1, 31, 61, 12, 82, -111, -112, -33});
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            hVar.y(String.format(C0133t.b(new byte[]{-16, 125, 93, 73, 57, -42, 125, 50, -69, 96, 66, 17, 101, -52, 125, 112, -86, 118, 20, 23, 57, -50, 113, 41, -22, 106, 20, 7, 48, -37, 102, 113, -122, 125, 15, 81, 43, -100, 114, 125, -93, 124, 123, 16, 101, -97, 103}, new byte[]{-49, 25, 50, 116, 88, -70, 20, 20}, sb), strA, str2, str3));
            hVar.j();
            hVar.x(x(strArr));
            hVar.f(s());
            return hVar.toString();
        }
        C0151j c0151jY = y(strArr[0], strArr[1]);
        List<String> listV = v(c0151jY, strArr[0], strArr[1], true);
        List<com.github.catvod.spider.merge.c.i> listX = x(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator<com.github.catvod.spider.merge.d.k> it = c0151jY.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        ((ArrayList) listX).addAll(arrayList);
        com.github.catvod.spider.merge.c.h hVar2 = new com.github.catvod.spider.merge.c.h();
        hVar2.z(listV);
        hVar2.h();
        hVar2.x(listX);
        hVar2.f(s());
        return hVar2.toString();
    }

    public final Object[] G(Map<String, String> map) {
        return new Object[]{200, C0098a.a(new byte[]{33, 126, -64, -31, -71, 57, -26, -123, 41, 97, -34, -94, -65, 57, -13, -108, 52, 35, -61, -7, -94, 63, -26, -100}, new byte[]{64, 14, -80, -115, -48, 90, -121, -15}), new ByteArrayInputStream(C0207D.t(C0197c.e(r(map.get(C0098a.a(new byte[]{35, 98, -49, -73, 11, 35, 24}, new byte[]{80, 10, -82, -59, 110, 106, 124, 110})), map.get(C0098a.a(new byte[]{-8, 43, -54, -2, 117, -16}, new byte[]{-98, 66, -90, -101, 60, -108, 68, -92}))), t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    public final Object[] H(Map<String, String> map) {
        String strW;
        AlertDialog alertDialog = this.i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str = map.get(C0098a.a(new byte[]{-9, -104, 27, -77, 37, -50, -72, -3, -54, -103}, new byte[]{-125, -3, 118, -61, 73, -81, -52, -104}));
        String str2 = map.get(C0098a.a(new byte[]{-121, 1, -4, 34, -63, -15, -20}, new byte[]{-12, 105, -99, 80, -92, -72, -120, 27}));
        String str3 = map.get(C0098a.a(new byte[]{109, -29, 97, -61, -41, -64, -19}, new byte[]{0, -122, 5, -86, -74, -119, -119, 46}));
        String str4 = map.get(C0098a.a(new byte[]{11, -46, 2, 50, 56, -32}, new byte[]{109, -69, 110, 87, 113, -124, 93, 74}));
        String str5 = map.get(C0098a.a(new byte[]{69, 88, 81, -99}, new byte[]{38, 57, 37, -8, 91, 63, -78, 101}));
        if (C0098a.a(new byte[]{-16, -29, 68, 18, -92, -3, 26}, new byte[]{-128, -111, 33, 100, -51, -104, 109, 115}).equals(str5)) {
            return new Object[]{200, C0098a.a(new byte[]{-111, -2, 104, -78, -79, 100, -73, 90, -103, -31, 118, -15, -82, 105, -78, 0, -111, -2, 104, -78, -67, 41, -69, 94, -107, -23, 109, -84, -76}, new byte[]{-16, -114, 24, -34, -40, 7, -42, 46}), new ByteArrayInputStream(u(str2, str4, str).getBytes())};
        }
        if (C0098a.a(new byte[]{-48, -56, 98, -17}, new byte[]{-65, -72, 7, -127, -47, -19, -79, -76}).equals(str5)) {
            strW = r(str2, str4);
        } else if (C0098a.a(new byte[]{81, -120, -79, -119, 32}, new byte[]{34, -32, -48, -5, 69, -58, 8, -99}).equals(str5)) {
            strW = w(str2, str4);
        } else if (C0098a.a(new byte[]{-13, 100, 53, -47}, new byte[]{-98, 87, 64, -23, 52, 38, 105, 68}).equals(str5)) {
            this.e.lock();
            String str6 = (String) ((Map) this.a.get(str4)).get(str3);
            if (A(str6)) {
                u(str2, str4, str);
                str6 = (String) ((Map) this.a.get(str4)).get(str3);
            }
            strW = str6;
            this.e.unlock();
        } else {
            strW = "";
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-112, 13, -49, 91, 122, 7, -72}, new byte[]{-30, 104, -87, 62, 8, 98, -54, 59}), C0098a.a(new byte[]{-40, 6, -85, -22, -94, 38, -56, 16, -43, 4, -90, -90}, new byte[]{-79, 101, -46, -57, -49, 67, -68, 113}), C0098a.a(new byte[]{98, -20, -92, 119, -106}, new byte[]{16, -115, -54, 16, -13, 57, -88, -110}), C0098a.a(new byte[]{17, -71, 110, 14, -7, 45, -10, -103, 29, -72}, new byte[]{114, -42, 0, 96, -100, 78, -126, -16}), C0098a.a(new byte[]{1, -105, -70, -105, -103, 19, -85, 55, 14, -105, -74, -106, -128, 9, -31}, new byte[]{96, -12, -39, -14, -23, 103, -122, 82}), C0098a.a(new byte[]{84, 90, 53, 95, 95, -86, -68, -128, 79, 93}, new byte[]{33, 41, 80, 45, 114, -53, -37, -27}));
        for (String str7 : map.keySet()) {
            if (listAsList.contains(str7)) {
                treeMap.put(str7, map.get(str7));
            }
        }
        return C0221n.h(strW, treeMap);
    }

    public final void K() {
        Init.checkPermission();
        I();
    }

    public final void L(String str) {
        this.h = str;
    }

    public final File q() {
        return C0208a.m(C0098a.a(new byte[]{53, 97, 6, -95, 62, -18}, new byte[]{84, 13, 111, -40, 75, -128, 0, -21}));
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String r(String str, String str2) {
        String str3;
        Runnable runnableC0120f;
        int i = 0;
        try {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                str3 = "";
                runnableC0120f = new RunnableC0120f(this, i);
            }
            if (this.c.containsKey(str2) && this.c.get(str2) != null && !A((String) this.c.get(str2))) {
                str3 = (String) this.c.get(str2);
                runnableC0120f = new r(this, i);
                Init.execute(runnableC0120f);
                return str3;
            }
            J(str);
            SpiderDebug.log(C0098a.a(new byte[]{-61, -53, 31, 123, -49, -42, 11, 59, -53, -49, 15, 106, -46, -51, 75, 121, -118}, new byte[]{-92, -82, 107, 63, -96, -95, 101, 87}) + str2);
            this.d.add(0, n(str, str2));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-2, 116, 29, 69, 69, -52, 3}, new byte[]{-104, 29, 113, 32, 26, -91, 103, -21}), (String) this.d.get(0));
            jsonObject.addProperty(C0098a.a(new byte[]{-82, 70, -42, 7, -63, -44, 93, -99}, new byte[]{-54, 52, -65, 113, -92, -117, 52, -7}), this.f.a().a());
            jsonObject.addProperty(C0098a.a(new byte[]{-24, -72, 2, -38, -58, 80, 13, 67, -24, -93}, new byte[]{-115, -64, 114, -77, -76, 53, 82, 48}), 900);
            String strA = ((C0147f) new Gson().fromJson(D(C0098a.a(new byte[]{26, -40, 30, 98, 6, -123, 61, 4, 90, -49, 30, 120, 4, -125, 38, 15, 25, -57, 26, 104, 21, -98, 61}, new byte[]{117, -88, 123, 12, 64, -20, 81, 97}), jsonObject.toString(), true), C0147f.class)).a();
            this.c.put(str2, strA);
            Init.execute(new RunnableC0116b(this, i));
            return strA;
        } catch (Throwable th) {
            Init.execute(new RunnableC0131q(this, i));
            throw th;
        }
    }

    public final HashMap<String, String> s() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{75, 0, -15, -65, 66, -104, 20, 44, 112, 7}, new byte[]{30, 115, -108, -51, 111, -39, 115, 73}), C0098a.a(new byte[]{-20, -108, 69, 61, 93, 37, 6, 53, -108, -43, 15, 116, 25, 30, 14, 116, -59, -108, 72, 39, 17, 7, 51, 58, -112, -53, 17, 100, 10, 105, 48, 115, -49, -51, 11, 111, 17, 49, 81, 46, -120, -37, 126, 36, 65, 37, 2, 77, -60, -103, 116, 61, 69, 102, 82, 41, -106, -43, 12, 98, 17, 97, 44, 82, -11, -74, 115, 120, 17, 37, 14, 113, -60, -37, 120, 49, 82, 34, 8, 51, -127, -72, 87, 38, 94, 36, 2, 53, -112, -54, 8, 122, 1, 103, 87, 52, -111, -37, 108, 53, 87, 40, 21, 115, -114, -50, 12, 99, 31, 122, 81}, new byte[]{-95, -5, 63, 84, 49, 73, 103, 26}));
        map.put(C0098a.a(new byte[]{54, 1, -55, -11, -112, 57, 100}, new byte[]{100, 100, -81, -112, -30, 92, 22, -23}), C0098a.a(new byte[]{-119, 106, 91, 92, 2, 85, -24, 72, -106, 105, 88, 2, 16, 3, -82, 30, -108, 112, 75, 94, 24, 25, -94, 73, -126, 113, 66, 3}, new byte[]{-31, 30, 47, 44, 113, 111, -57, 103}));
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String w(String str, String str2) {
        JsonElement string;
        try {
            if (this.b.containsKey(str2) && this.b.get(str2) != null && !A((String) this.b.get(str2))) {
                return (String) this.b.get(str2);
            }
            J(str);
            SpiderDebug.log(C0098a.a(new byte[]{-111, 25, 36, 83, -99, -24, -49, -74, -78, 19, 39, 110, -103, -26, -36, -73, -93, 14, 60, 46, -37, -89}, new byte[]{-10, 124, 80, 0, -11, -119, -67, -45}) + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-108, -24, -71, -29, -82, 67, 18}, new byte[]{-14, -127, -43, -122, -15, 42, 118, -15}), str2);
            jsonObject.addProperty(C0098a.a(new byte[]{-119, 25, -70, 32, 11, 16, -5, 18}, new byte[]{-6, 113, -37, 82, 110, 79, -110, 118}), str);
            jsonObject.addProperty(C0098a.a(new byte[]{83, -118, 49, -101, -122, 51, -62, 106, 83, -111}, new byte[]{54, -14, 65, -14, -12, 86, -99, 25}), 600);
            String strM = m(C0098a.a(new byte[]{-3, -75, 89, 113, 113, -34, -87, -86, -20, -30, 2, 72, 107, -38, -83, -9, -18, -40, 26, 126, 118, -39, -109, -31, -28, -16, 24, 123, 119, -45, -88, -38, -2, -11, 26}, new byte[]{-117, -121, 118, 23, 24, -78, -52, -123}), jsonObject.toString(), false);
            try {
                string = JsonParser.parseString(strM);
            } catch (Throwable unused) {
                string = new JsonParser().parse(strM);
            }
            String asString = string.getAsJsonObject().get(C0098a.a(new byte[]{117, 113, -109, 59, 48, 116, 79, 25, 78, 107, -106, 57}, new byte[]{17, 30, -28, 85, 92, 27, 46, 125})).getAsString();
            this.b.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final List<com.github.catvod.spider.merge.c.i> x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains(C0098a.a(new byte[]{54, -25, 109}, new byte[]{118, -89, 45, -30, 114, -5, 19, 85}))) {
                String[] strArrSplit = str.split(C0098a.a(new byte[]{52, 72, -114}, new byte[]{116, 8, -50, 44, 48, 45, 69, 4}));
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + C0098a.a(new byte[]{7, -7, -61, -3, 71, 117, -7, -8, 76, -28, -36, -91, 27, 106, -27, -68, 30, -18, -60, -95, 84, 124, -39, -70, 5}, new byte[]{56, -99, -84, -64, 38, 25, -112, -34}) + strArr[0] + C0098a.a(new byte[]{58, 93, 89, 42, -64, 120, 23, -111}, new byte[]{28, 59, 48, 70, -91, 49, 115, -84}) + strArrSplit[2];
                com.github.catvod.spider.merge.c.i iVar = new com.github.catvod.spider.merge.c.i();
                iVar.c(str2);
                com.github.catvod.spider.merge.c.i iVarA = iVar.a(str3);
                iVarA.d(str4);
                arrayList.add(iVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final C0151j y(String str, String str2) {
        C0151j c0151j;
        Runnable runnableC0115a;
        int i = 0;
        try {
            try {
                J(str);
                SpiderDebug.log(C0098a.a(new byte[]{-28, 25, 6, -1, -39, -104, 0, -46, -45, 14, 23, -33, -39, -103, 18, -19, -17, 29, 11, -32, -34, -102, 10, -109, -83, 82}, new byte[]{-125, 124, 114, -87, -80, -4, 101, -67}) + str2);
                this.d.add(0, n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(C0098a.a(new byte[]{38, -82, 46, -33, -77, 98, 66}, new byte[]{64, -57, 66, -70, -20, 11, 38, -101}), (String) this.d.get(0));
                jsonObject.addProperty(C0098a.a(new byte[]{100, 100, 95, -23, 43, 112, -53, -83}, new byte[]{0, 22, 54, -97, 78, 47, -94, -55}), this.f.a().a());
                jsonObject.addProperty(C0098a.a(new byte[]{76, -63, -63, -53, -126, -52, -108, -81}, new byte[]{47, -96, -75, -82, -27, -93, -26, -42}), C0098a.a(new byte[]{65, -72, -88, -114, -3, 48, 127, -99, 67, -94, -67, -124, -58, 45, 99, -101}, new byte[]{45, -47, -34, -21, -94, 68, 13, -4}));
                jsonObject.addProperty(C0098a.a(new byte[]{-125, 14, 33, 126, 3, 14, 112, -109, -124, 25, 18, 82, 3, 21}, new byte[]{-10, 124, 77, 33, 102, 118, 0, -6}), 900);
                c0151j = ((com.github.catvod.spider.merge.d.l) new Gson().fromJson(D(C0098a.a(new byte[]{-63, -104, 5, -49, -36, -95, -127, 64, -127, -113, 5, -43, -52, -95, -119, 64, -63, -72, 18, -60, -20, -95, -120, 82, -2, -124, 1, -40, -45, -90, -117, 74}, new byte[]{-82, -24, 96, -95, -102, -56, -19, 37}), jsonObject.toString(), true), com.github.catvod.spider.merge.d.l.class)).a();
                runnableC0115a = new RunnableC0118d(this, i);
            } catch (Exception e) {
                e.printStackTrace();
                c0151j = new C0151j();
                runnableC0115a = new RunnableC0115a(this, i);
            }
            Init.execute(runnableC0115a);
            return c0151j;
        } catch (Throwable th) {
            Init.execute(new RunnableC0117c(this, i));
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.c.k z(String str, String str2, String str3) {
        String strD;
        J(str2);
        JsonObject jsonObject = new JsonObject();
        int i = 8;
        jsonObject.addProperty(C0098a.a(new byte[]{16, 80, 98, 9, 44, -15, -61, 87}, new byte[]{99, 56, 3, 123, 73, -82, -86, 51}), str2);
        com.github.catvod.spider.merge.d.o oVar = (com.github.catvod.spider.merge.d.o) C0132s.a(F(C0098a.a(new byte[]{99, -109, 81, 126, -109, 83, 92, 30, 49, -40, 80, 127, -124, 68, 22, 55, 110, -98, 77, 124, -54, 81, 22, 28, 93, -124, 75, 118, -105, 83, 44, 10, 123, -88, 66, 121, -118, 88, 10, 5, 109, -126, 80}, new byte[]{2, -9, 35, 23, -27, 54, 115, 104}), jsonObject), com.github.catvod.spider.merge.d.o.class);
        ArrayList<C0149h> arrayList = new ArrayList();
        ArrayList<C0149h> arrayList2 = new ArrayList();
        char c = 0;
        if (!TextUtils.isEmpty(str3)) {
            strD = str3;
        } else if (oVar.c().isEmpty()) {
            strD = "";
        } else {
            C0149h c0149h = oVar.c().get(0);
            strD = c0149h.j().equals(C0098a.a(new byte[]{-48, -128, 10, 34, 99, 18}, new byte[]{-74, -17, 102, 70, 6, 96, -119, -115})) ? c0149h.d() : C0098a.a(new byte[]{30, -5, 53, -94}, new byte[]{108, -108, 90, -42, -61, 119, 74, -118});
        }
        C(str2, new C0149h(strD), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        int i2 = 1;
        List listAsList = Arrays.asList(C0098a.a(new byte[]{36, -15, 69, -123, -40, 65, 104, 9, 82, -114, 110, -41}, new byte[]{-51, 105, -6, 108, 95, -51, -115, -121}), C0098a.a(new byte[]{-28, -11, -67, 81, -65, -45, -63, 26, -93, -118, -106, 3}, new byte[]{13, 109, 2, -72, 56, 95, 39, -125}));
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C0149h c0149h2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(c0149h2.b());
            byte[] bArr = new byte[i2];
            bArr[c] = 78;
            byte[] bArr2 = new byte[i];
            // fill-array-data instruction
            bArr2[0] = 106;
            bArr2[1] = -127;
            bArr2[2] = 90;
            bArr2[3] = -99;
            bArr2[4] = -90;
            bArr2[5] = -43;
            bArr2[6] = 74;
            bArr2[7] = -70;
            v.a(bArr, bArr2, sb, str2);
            byte[] bArr3 = new byte[i2];
            bArr3[c] = 93;
            byte[] bArr4 = new byte[i];
            // fill-array-data instruction
            bArr4[0] = 118;
            bArr4[1] = 102;
            bArr4[2] = 25;
            bArr4[3] = -124;
            bArr4[4] = 22;
            bArr4[5] = -31;
            bArr4[6] = -25;
            bArr4[7] = 123;
            sb.append(C0098a.a(bArr3, bArr4));
            sb.append(c0149h2.d());
            String strF = c0149h2.f();
            ArrayList<C0149h> arrayList5 = new ArrayList();
            String lowerCase = C0207D.r(strF).toLowerCase();
            for (C0149h c0149h3 : arrayList2) {
                String lowerCase2 = C0207D.r(c0149h3.f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(c0149h3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (C0149h c0149h4 : arrayList5) {
                byte[] bArr5 = new byte[i2];
                bArr5[0] = -23;
                sb2.append(C0098a.a(bArr5, new byte[]{-62, -115, 12, -124, -81, -29, -40, 82}));
                sb2.append(C0207D.r(c0149h4.f()));
                sb2.append(C0098a.a(new byte[]{60, 3, -98}, new byte[]{124, 67, -34, 55, -82, -91, -1, 87}));
                sb2.append(c0149h4.c());
                sb2.append(C0098a.a(new byte[]{-85, -66, -65}, new byte[]{-21, -2, -1, -13, -120, -42, -90, 50}));
                sb2.append(c0149h4.d());
                i2 = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
            i2 = 1;
            i = 8;
            c = 0;
        }
        for (int i3 = 0; i3 < listAsList.size(); i3++) {
            arrayList4.add(TextUtils.join(C0098a.a(new byte[]{46}, new byte[]{13, -13, -8, 92, -1, -23, -32, -66}), arrayList3));
        }
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i(oVar.b());
        kVar.h(oVar.d());
        kVar.k(TextUtils.join(C0098a.a(new byte[]{-27, -91, -36}, new byte[]{-63, -127, -8, 1, 50, 18, 55, -20}), arrayList4));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-57, 63, -83}, new byte[]{-29, 27, -119, -108, 72, 116, -42, 0}), listAsList));
        kVar.b(C0098a.a(new byte[]{34, 105, 1, 41, -40, -98, -49, -59, 90, 22, 37, 88}, new byte[]{-53, -15, -66, -64, 95, 18, 43, 127}));
        return kVar;
    }
}
