package com.github.catvod.spider.merge.bY;

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
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.ZrJ;
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

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class x {
    private final Map<String, Map<String, String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final List<String> d;
    private final ReentrantLock e;
    private final com.github.catvod.spider.merge.dO.c f;
    private ScheduledExecutorService g;
    private String h;
    private AlertDialog i;
    private com.github.catvod.spider.merge.dO.o j;

    x() {
        Init.checkPermission();
        this.e = new ReentrantLock();
        this.d = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        com.github.catvod.spider.merge.dO.c cVar = (com.github.catvod.spider.merge.dO.c) C0924s.a(com.github.catvod.spider.merge.pT.a.k(q()), com.github.catvod.spider.merge.dO.c.class);
        this.f = cVar == null ? new com.github.catvod.spider.merge.dO.c() : cVar;
    }

    private static boolean A(String str) {
        String value = new UrlQuerySanitizer(str).getValue(com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, 21, -103, -57, -119, -36, 36, -84, -64, 81, -124, -47, -119}, new byte[]{-80, 56, -10, -76, -6, -15, 65, -44}));
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    private void B(String str, com.github.catvod.spider.merge.dO.h hVar, List<com.github.catvod.spider.merge.dO.h> list, List<com.github.catvod.spider.merge.dO.h> list2) {
        C(str, hVar, list, list2, "");
    }

    private void C(String str, com.github.catvod.spider.merge.dO.h hVar, List<com.github.catvod.spider.merge.dO.h> list, List<com.github.catvod.spider.merge.dO.h> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{9, -56, 123, -55, -55}, new byte[]{101, -95, 22, -96, -67, 39, -38, -65}), 200);
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-75, 106, 60, 110, 85, 30, -60, 52}, new byte[]{-58, 2, 93, 28, 48, 65, -83, 80}), str);
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-88, 92, 117, -128, -75, -116, 127, 6, -79, 81, 98, -70, -78, -100}, new byte[]{-40, 61, 7, -27, -37, -8, 32, 96}), hVar.d());
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 10, -32, 91, -124, 44, 77, -113}, new byte[]{6, 120, -124, 62, -10, 115, 47, -10}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 1, -15, -6}, new byte[]{-38, 96, -100, -97, -49, -32, 91, 54}));
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, 36, 37, -87, 95, 64, -55, -4, -82, 51, 34, -72, 68, 112, -61}, new byte[]{-36, 86, 65, -52, 45, 31, -83, -107}), com.github.catvod.spider.merge.XI.f.a(new byte[]{127, -90, -22}, new byte[]{62, -11, -87, -12, -110, -1, -25, 127}));
        if (str2.length() > 0) {
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{22, -30, -59, -86, -11, -52}, new byte[]{123, -125, -73, -63, -112, -66, -92, -107}), str2);
        }
        com.github.catvod.spider.merge.dO.h hVar2 = (com.github.catvod.spider.merge.dO.h) C0924s.a(m(com.github.catvod.spider.merge.XI.f.a(new byte[]{127, -54, -40, -11, 18, -34, 29, -112, 45, -127, -52, -11, 8, -34, 29, -118, 119, -35, -34}, new byte[]{30, -82, -86, -100, 100, -69, 50, -26}), jsonObject.toString(), true), com.github.catvod.spider.merge.dO.h.class);
        for (com.github.catvod.spider.merge.dO.h hVar3 : hVar2.e()) {
            if (hVar3.j().equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{14, -98, 20, -8, -106, -13}, new byte[]{104, -15, 120, -100, -13, -127, 36, 106}))) {
                arrayList.add(hVar3);
            } else if (hVar3.a().equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{115, 40, 58, -128, -44}, new byte[]{5, 65, 94, -27, -69, 47, 51, 13})) || hVar3.a().equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, 61, 82, 29, -72}, new byte[]{-37, 72, 54, 116, -41, -3, 15, 126}))) {
                hVar3.k(hVar.f());
                list.add(hVar3);
            } else if (com.github.catvod.spider.merge.pT.C.n(hVar3.c())) {
                list2.add(hVar3);
            }
        }
        if (hVar2.g().length() > 0) {
            C(str, hVar, list, list2, hVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B(str, (com.github.catvod.spider.merge.dO.h) it.next(), list, list2);
        }
    }

    private String D(String str, String str2, boolean z) {
        boolean zL;
        if (!str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 29, -118, 19, 92}, new byte[]{13, 105, -2, 99, 47, 90, -5, -5}))) {
            str = C0926u.a(new byte[]{-101, 49, 67, 61, 103, -64, -71, 13, -100, 53, 82, 35, 58, -101, -6, 75, -118, 48, 89, 41, 102, -109, -32, 71, -35, 38, 88, 32, 59, -101, -14, 80, -102, 51, 82, 98, 98, -53, -72, 18, -36}, new byte[]{-13, 69, 55, 77, 20, -6, -106, 34}, new StringBuilder(), str);
        }
        HashMap<String, String> mapS = s();
        mapS.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{36, 117, 69, -92, 59, -72, -99, -87, 36, 116, 88, -93, 58}, new byte[]{69, 0, 49, -52, 84, -54, -12, -45}), this.f.b().b());
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(str, str2, mapS);
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.c(new byte[]{-42}, new byte[]{-6, -107, -26, 10, -9, -105, -24, -91}, sb, str);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{80}, new byte[]{124, 73, 66, -10, 38, 43, 56, -18}));
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        if (z && (eVarG.b() == 400 || eVarG.b() == 401)) {
            if (this.f.b().c().isEmpty()) {
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{7, 125, -100, -104, -30, 27, -39, 2, 57, 73, -116, -97, -2, 21, -91, 73}, new byte[]{72, 60, -23, -20, -118, 59, -117, 103}));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-7, 109, 65, 45, -35, 40, -41, -90, -3}, new byte[]{-104, 24, 53, 69, -78, 90, -66, -36}), 1);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{103, -55, 3, -83, -48}, new byte[]{20, -86, 108, -35, -75, 78, -19, 6}), com.github.catvod.spider.merge.XI.f.a(new byte[]{95, 80, -2, -12, 20, 56, 21, 33, 79, 15, -3, -17, 66, 63, 78, 51, 70, 79, -95, -12, 75, 59, 16, 126, 76, 74, -9, -29, 20, 59, 24, 62, 16, 84, -23, -17, 90, 63}, new byte[]{42, 35, -101, -122, 46, 90, 116, 82}));
                String strA = ((com.github.catvod.spider.merge.dO.d) C0924s.a(m(com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, 84, -74, 24, -4, -104, -93, -117, -56, 80, -89, 6, -95, -61, -32, -51, -34, 85, -84, 12, -3, -53, -6, -63, -119, 67, -83, 5, -96, -51, -19, -47, -45, 72, -19, 29, -4, -57, -2, -41, -120, 65, -73, 28, -25, -51, -2, -51, -35, 69, -3, 11, -29, -53, -23, -54, -45, 127, -85, 12, -78, -107, -70, -99, -106, 23, -95, 11, -20, -63, -24, -112, -109, 20, -13, 11, -68, -101, -72, -111, -112, 65, -14, 92, -23, -108, -68, -100, -109, 70, -96, 90, -23, -124, -2, -63, -61, 73, -80, 13, -20, -42, -45, -47, -43, 73, -1, 0, -5, -42, -4, -41, -99, 15, -19, 9, -29, -53, -1, -48, -119, 78, -84, 70, -20, -53, -93, -48, -56, 79, -82, 71, -18, -50, -27, -35, -46, 78, -90, 26, -26, -44, -23, -117, -60, 65, -82, 4, -19, -61, -17, -49, -127, 83, -95, 7, -1, -57, -79, -47, -44, 69, -80, 82, -19, -61, -1, -63, -117, 70, -85, 4, -22, -104, -19, -56, -53, 26, -80, 13, -18, -58, -96, -62, -50, 76, -89, 82, -18, -50, -32, -98, -48, 82, -85, 28, -22, -124, -1, -48, -58, 84, -89, 85}, new byte[]{-89, 32, -62, 104, -113, -94, -116, -92}), jsonObject.toString(), true), com.github.catvod.spider.merge.dO.d.class)).a();
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{115, 121, 51, 2, -61, 43, -35, -22, 88, 81, 52, 19, -56, 127, -95, -95, 18}, new byte[]{60, 56, 70, 118, -85, 11, -113, -113}));
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, -115, -27, 8}, new byte[]{-85, -30, -127, 109, 44, -91, 71, 30}), strA);
                jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{126, -71, 123, 60, -111, 0, -46, -14, 105, -82}, new byte[]{25, -53, 26, 82, -27, 95, -90, -117}), com.github.catvod.spider.merge.XI.f.a(new byte[]{3, -101, 21, 126, 114, 16, 16, 36, 3, -102, 8, 121, 115, 61, 26, 49, 6, -117}, new byte[]{98, -18, 97, 22, 29, 98, 121, 94}));
                zL = l(com.github.catvod.spider.merge.XI.f.a(new byte[]{102, -1, 90, -46}, new byte[]{5, -112, 62, -73, 74, -67, 5, 9}), jsonObject2);
            } else {
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, 3, 55, 7, 115, 57, 38, 95, -99, 3, 63, 33, 121, 33, 43, 126, -61, 72, 127}, new byte[]{-19, 102, 81, 117, 22, 74, 78, 16}));
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{42, 84, -45, -9, 104, -58, -99, -96, 61, 67}, new byte[]{77, 38, -78, -103, 28, -103, -23, -39}), com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 28, 63, -84, 74, 6, 56, -33, 27, 22, 50, -69, 65}, new byte[]{111, 121, 89, -34, 47, 117, 80, -128}));
                jsonObject3.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, 112, -97, -122, -98, 122, 116, 125, -127, 122, -110, -111, -107}, new byte[]{-11, 21, -7, -12, -5, 9, 28, 34}), this.f.b().c());
                zL = l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-69, 93, -121, 105, -89}, new byte[]{-49, 50, -20, 12, -55, 23, -83, 102}), jsonObject3);
            }
            if (zL) {
                return D(str, str2, false);
            }
        }
        return eVarG.a();
    }

    private String F(String str, JsonObject jsonObject) {
        if (!str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{91, -100, 84, -87, -44}, new byte[]{51, -24, 32, -39, -89, 83, -63, 88}))) {
            str = C0926u.a(new byte[]{10, 124, -122, -42, 21, -76, -85, 27, 3, 120, -101, -120, 7, -30, -19, 77, 23, 102, -106, -44, 15, -8, -31, 26, 1, 103, -97, -119}, new byte[]{98, 8, -14, -90, 102, -114, -124, 52}, new StringBuilder(), str);
        }
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(str, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.c(new byte[]{-43}, new byte[]{-7, 119, 62, 101, 70, 91, -31, 43}, sb, str);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{36}, new byte[]{8, -1, 79, -120, -49, 59, 83, -49}));
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        return eVarG.a();
    }

    private boolean I() {
        int i = 0;
        try {
            try {
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{106, 78, 87, 108, -109, 14, -49, -30, 123, 72, 84, 109, -123, 41, -56, -56, 125, 69, 31, 48, -40}, new byte[]{24, 43, 49, 30, -10, 125, -89, -93}));
                JsonObject jsonObject = new JsonObject();
                String strD = this.f.c().d();
                if (strD.isEmpty()) {
                    strD = this.h;
                }
                if (strD != null && strD.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{72, -120, 77, 116}, new byte[]{32, -4, 57, 4, 1, 74, 120, -6}))) {
                    strD = com.github.catvod.spider.merge.nU.c.l(strD, null).trim();
                }
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-98, 91, 107, 7, 114, -9, -1, -82, -104, 81, 102, 16, 121}, new byte[]{-20, 62, 13, 117, 23, -124, -105, -15}), strD);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, 83, -38, 47, -119, -118, 7, -16, -51, 68}, new byte[]{-67, 33, -69, 65, -3, -43, 115, -119}), com.github.catvod.spider.merge.XI.f.a(new byte[]{115, 55, -44, -80, -3, 57, 74, 54, 117, 61, -39, -89, -10}, new byte[]{1, 82, -78, -62, -104, 74, 34, 105}));
                String strF = F(com.github.catvod.spider.merge.XI.f.a(new byte[]{-86, 98, 29, -118, -12, -96, -25, -99, -93, 99, 29, -110, -87, -5, -92, -37, -69, 99, 7, -98, -11, -13, -66, -41, -20, 117, 6, -105, -88, -20, -6, -99, -93, 117, 10, -107, -14, -12, -68, -99, -74, 121, 2, -97, -23}, new byte[]{-62, 22, 105, -6, -121, -102, -56, -78}), jsonObject);
                com.github.catvod.spider.merge.dO.c cVar = this.f;
                com.github.catvod.spider.merge.dO.p pVar = (com.github.catvod.spider.merge.dO.p) new Gson().fromJson(strF, com.github.catvod.spider.merge.dO.p.class);
                if (pVar == null) {
                    pVar = new com.github.catvod.spider.merge.dO.p();
                }
                cVar.g(pVar);
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
                Init.run(new RunnableC0911e(this, i));
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
        com.github.catvod.spider.merge.dO.o oVar = this.j;
        if (oVar == null || !oVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-15, 55, 85, 71, -71, 25, 68, 10}, new byte[]{-126, 95, 52, 53, -36, 70, 45, 110}), str);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-72, -40, -99, -116, 91, 80, 34, -85, -81}, new byte[]{-53, -80, -4, -2, 62, 15, 82, -36}), "");
            com.github.catvod.spider.merge.dO.o oVar2 = (com.github.catvod.spider.merge.dO.o) C0924s.a(F(com.github.catvod.spider.merge.XI.f.a(new byte[]{18, 105, 62, -69, 31, -51, -124, -5, 59, 55, 120, -90, 28, -125, -111, -5, 16, 4, 98, -96, 22, -34, -109, -63, 16, 52, 122, -83, 25}, new byte[]{100, 91, 17, -56, 119, -84, -10, -98}), jsonObject), com.github.catvod.spider.merge.dO.o.class);
            oVar2.f(str);
            oVar2.g();
            this.j = oVar2;
            if (oVar2.e().isEmpty()) {
                com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{64, -72, -57, -81, -115, -54, -90, -124, 0, -54, -34, -59, -4, -1, -26, -12, 46, -93, -122, -13, -65, -75, -12, -93, 67, -127, -45, -81, -127, -40, -84, -83, 39}, new byte[]{-90, 37, 98, 73, 20, 80, 67, 17}));
            }
        }
    }

    private void M(String str) {
        this.f.c().f(str);
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-125, 94, 110, 107, 77, 78}, new byte[]{-41, 49, 5, 14, 35, 116, 88, 106}) + str);
        com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{53, -82, 2, -86, 66, -98}, new byte[]{97, -63, 105, -49, 44, -92, -98, 113}) + str);
        I();
        O();
    }

    private void N(com.github.catvod.spider.merge.dO.e eVar) {
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.XI.f.d(eVar.a(), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            final int i = 0;
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.bY.m
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    switch (i) {
                        case 0:
                            x.c((x) this);
                            break;
                        default:
                            Bili.c((Bili) this);
                            break;
                    }
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.bY.p
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i) {
                        case 0:
                            x.g((x) this);
                            break;
                        default:
                            Bili.f((Bili) this);
                            break;
                    }
                }
            }).show();
            this.i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-120, 68, 30, 10, 120, 80, -81, 78, -56, 2, 49, 81, 44, 104, -60, 62, -38, 122, 78, 117, 93, -49, 9, -86, 16, -53, 79, 103, 110, 9, -57, 85, -124, 81, 37, 9, 126, 91, -81, 122, -31}, new byte[]{96, -21, -87, -18, -59, -17, 72, -38}));
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
        if (str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{79, -25, -109, -11}, new byte[]{39, -109, -25, -123, 117, 32, -29, -44}))) {
            str = com.github.catvod.spider.merge.nU.c.l(str, null);
        }
        xVar.M(str);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static void b(x xVar) {
        xVar.getClass();
        for (String str : new ArrayList(xVar.d)) {
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-88, 67, -99, -107, 41, 29, -84, -32, -62}, new byte[]{-20, 38, -15, -16, 93, 120, -126, -50}) + str);
            if (((com.github.catvod.spider.merge.dO.n) C0924s.a(xVar.m(com.github.catvod.spider.merge.XI.f.a(new byte[]{70, -56, -114, -52, 19, -128, -124, 24, 21, -125, -98, -60, 17, -122, -61}, new byte[]{39, -84, -4, -91, 101, -27, -85, 110}), String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{-32, 44, -110, 76, 80, 32, 31, 14, -17, 125, -62, 19, 122, 46, 88, 31, -12, 106, -103, 11, 27, 46, 88, 25, -23, 103, -106, 76, 126, 60, 30, 95, -95, 44, -59, 90, 3, 121, 88, 27, -14, 98, -123, 118, 72, 49, 88, 71, -71, 43, -109, 11, 92, 121, 88, 21, -2, 111, -124, 76, 83, 38, 88, 71, -32, 44, -93, 70, 79, 33, 31, 19, -17, 35, -76, 80, 81, 48, 88, 71, -71, 111, -112, 89, 77, 60, 25, 28, -17, 103, -113, 71, 14, 63, 9, 18, -11, 44, -99, 5, 3, 60, 30, 95, -95, 44, -59, 90, 3, 121, 88, 16, -2, 122, -120, 70, 69, 119, 64, 95, -53, 65, -77, 125, 3, 121, 88, 8, -23, 98, -62, 19, 3, 122, 28, 20, -9, 107, -49, 77, 68, 57, 31, 9, -2, 44, -99, 116, 13, 119, 8, 24, -24, 97, -107, 91, 66, 48, 88, 71, -71, 104, -119, 69, 68, 119, 7}, new byte[]{-101, 14, -32, 41, 33, 85, 122, 125}), xVar.f.a().a(), str, str), true), com.github.catvod.spider.merge.dO.n.class)).b().c() == 404) {
                xVar.d.remove(str);
            }
        }
    }

    public static void c(x xVar) {
        xVar.O();
    }

    public static /* synthetic */ void d(x xVar, Map map) {
        xVar.getClass();
        com.github.catvod.spider.merge.dO.e eVarC = com.github.catvod.spider.merge.dO.e.g(com.github.catvod.spider.merge.nU.c.i(com.github.catvod.spider.merge.XI.f.a(new byte[]{33, 46, -84, -101, 0, -59, 112, 16, 57, 59, -85, -104, 3, -112, 45, 75, 103, 59, -76, -126, 10, -118, 49, 91, 59, 51, -82, -114, 93, -100, 48, 82, 102, 52, -67, -100, 31, -112, 56, 86, 39, 117, -87, -103, 16, -112, 59, 90, 102, 43, -83, -114, 1, -122, 113, 91, 38, 101, -71, -101, 3, -79, 62, 82, 44, 103, -71, -121, 26, -122, 42, 81, 22, 62, -86, -126, 5, -102, 121, 89, 59, 53, -75, -72, 26, -117, 58, 2, 124, 104, -2, -76, 17, -121, 114, 73, 116, 104, -10, -39, 93, -52}, new byte[]{73, 90, -40, -21, 115, -1, 95, 63}), map)).b().c();
        if (eVarC.f()) {
            xVar.M(eVarC.e());
        }
    }

    public static void f(x xVar) {
        xVar.o();
        Init.execute(new RunnableC0923q(xVar, 1));
    }

    public static void g(x xVar) {
        xVar.O();
    }

    public static void h(x xVar, EditText editText) {
        xVar.getClass();
        String string = editText.getText().toString();
        xVar.o();
        Init.execute(new RunnableC0916j(xVar, string, 0));
    }

    public static void i(final x xVar, com.github.catvod.spider.merge.dO.e eVar) {
        xVar.getClass();
        final Map mapD = eVar.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        xVar.g = scheduledExecutorServiceNewScheduledThreadPool;
        final int i = 0;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.github.catvod.spider.merge.bY.k
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        x.d((x) xVar, (Map) mapD);
                        break;
                    default:
                        Bili.d((Bili) xVar, (com.github.catvod.spider.merge.CE.b) mapD);
                        break;
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public static void j(final x xVar, String str, final com.github.catvod.spider.merge.dO.e eVar) {
        Runnable runnableC0914h;
        xVar.getClass();
        final int i = 0;
        try {
            try {
                Intent intent = new Intent(com.github.catvod.spider.merge.XI.f.a(new byte[]{82, -72, 19, 83, -79, -104, 113, 51, 90, -72, 3, 68, -80, -123, 59, 124, 80, -94, 30, 78, -80, -33, 67, 84, 118, -127}, new byte[]{51, -42, 119, 33, -34, -15, 21, 29}));
                intent.setClassName(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93, 53, -24, 29, -76, -72, 44, 21, -84, 53, -16, 87, -5, -80, 36, 2, -95, 56, -22, 75}, new byte[]{-64, 90, -123, 51, -43, -44, 69, 118}), com.github.catvod.spider.merge.XI.f.a(new byte[]{79, 26, 20, -95, -88, -108, 58, 103, 77, 26, 87, -29, -77, -110, 60, 107, 24, 20, 23, -21, -82, -102, 60, 97, 2, 6, 26, -18, -78, -37, 4, 119, 127, 22, 24, -31, -99, -106, 33, 108, 90, 28, 13, -10}, new byte[]{44, 117, 121, -113, -36, -11, 85, 5}));
                intent.putExtra(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, -13, 26, 87, -71, -92, 8, -57, -53, -9, 17, 105, -89}, new byte[]{-101, -106, 99, 8, -54, -57, 105, -87}), str);
                Init.getActivity().startActivity(intent);
                runnableC0914h = new Runnable() { // from class: com.github.catvod.spider.merge.bY.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                x.i((x) xVar, (com.github.catvod.spider.merge.dO.e) eVar);
                                break;
                            default:
                                Bili.a((Bili) xVar, (com.github.catvod.spider.merge.CE.b) eVar);
                                break;
                        }
                    }
                };
            } catch (Exception unused) {
                xVar.N(eVar);
                runnableC0914h = new RunnableC0914h(xVar, eVar, i);
            }
            Init.execute(runnableC0914h);
        } catch (Throwable th) {
            Init.execute(new RunnableC0915i(xVar, eVar, i));
            throw th;
        }
    }

    public static void k(final x xVar) {
        xVar.getClass();
        try {
            int iA = com.github.catvod.spider.merge.pT.e.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            xVar.i = new AlertDialog.Builder(Init.getActivity()).setTitle(com.github.catvod.spider.merge.XI.f.a(new byte[]{58, -104, -87, -71, -87, -96, -96, 94, 119, 99, 113, 58, 114, 93, -90, 91, 66, -47, -118, -2, -15, -65, -60, -24, -32, -45, -93, -36, -14, -95, -55, -109, -90, 67, 110, -78, -105, -94}, new byte[]{-46, 55, 30, 81, 23, 51, 69, -37})).setView(frameLayout).setNeutralButton(com.github.catvod.spider.merge.XI.f.a(new byte[]{72, -109, 12, 40, 33, -67, 33, -18, -36, -49, 19, 71, 92, -72, -29}, new byte[]{-84, 41, -99, -49, -70, 37, 96, -98}), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.bY.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    x.f(this.a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.bY.o
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
        String strA = C0926u.a(new byte[]{39, -40, -76, 34, -90, -86, 70, 61, 46, -36, -87, 124, -83, -8, 6, 116, 42, -126, -76, 61, -91, -65, 8, 126, 38, -33, -76, 125, -76, -4, 0, 77, 32, -36, -91, 60, -6}, new byte[]{79, -84, -64, 82, -43, -112, 105, 18}, new StringBuilder(), str);
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(strA, jsonObject.toString(), s());
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.c(new byte[]{81}, new byte[]{125, -80, -50, -106, -98, -32, -15, -32}, sb, strA);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{77}, new byte[]{97, -114, 87, -8, 92, -78, -2, 126}));
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        if (eVarG.a().contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{-96, -54, -7, 42, 82, 64, -107, 21, -44, -9, -13, 123, 106, 68, -120, 24, -121}, new byte[]{-12, -91, -106, 10, 31, 33, -5, 108}))) {
            com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-52, -19, -32, 7, -47, -89, 9, -86, -117, -68, -25, 70, -118, -116, 98, -47, -120, -1, -98, 102, -23, -43, 123, -110, -61, -38, -54, 7, -7, -71, 1, -117, -85}, new byte[]{42, 89, 119, -31, 101, 48, -18, 55}));
            this.f.b().a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        com.github.catvod.spider.merge.dO.c cVar = this.f;
        com.github.catvod.spider.merge.dO.i iVar = (com.github.catvod.spider.merge.dO.i) C0924s.a(eVarG.a(), com.github.catvod.spider.merge.dO.i.class);
        if (iVar == null) {
            iVar = new com.github.catvod.spider.merge.dO.i();
        }
        cVar.f(iVar);
        return true;
    }

    private String m(String str, String str2, boolean z) {
        HashMap<String, String> mapT;
        if (!str.startsWith(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, -36, 0, -114, 31}, new byte[]{-37, -88, 116, -2, 108, 75, -66, -76}))) {
            str = C0926u.a(new byte[]{-93, -108, -3, -94, -31, -32, 113, -40, -86, -112, -32, -4, -13, -74, 55, -114, -66, -114, -19, -96, -5, -84, 59, -39, -88, -113, -28, -3}, new byte[]{-53, -32, -119, -46, -110, -38, 94, -9}, new StringBuilder(), str);
        }
        if (str.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{0, 86, -23, -105, 48, -93, 52, -115, 18}, new byte[]{102, 63, -123, -14, 31, -49, 93, -2}))) {
            mapT = s();
            mapT.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{17, 115, -86, -104, -108, 102, -115, 98, 29, 49, -78, -107, -101}, new byte[]{105, 94, -39, -16, -11, 20, -24, 79}), this.j.e());
            mapT.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{81, -35, 57, 26, 102, 110, 50, 47}, new byte[]{9, -16, 122, 123, 8, 15, 64, 86}), com.github.catvod.spider.merge.XI.f.a(new byte[]{112, -92, -68, -117, 38, -128, 40, 36, 125, -84, -89, -127, 33, -112, 57, 4, 99, -72, -24, -113, 44, -122, 124, 19, 118, -28, -93, -117, 58, -121, 124, 10, 125, -11, -93, -38, 102, -57, 59, 84}, new byte[]{19, -56, -43, -18, 72, -12, 21, 101}));
        } else {
            mapT = t();
        }
        com.github.catvod.spider.merge.nU.e eVarG = com.github.catvod.spider.merge.nU.c.g(str, str2, mapT);
        StringBuilder sb = new StringBuilder();
        sb.append(eVarG.b());
        v.c(new byte[]{118}, new byte[]{90, 50, -40, -11, -123, 56, 9, 111}, sb, str);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{96}, new byte[]{76, -100, 99, -81, 123, 19, -57, 106}));
        sb.append(eVarG.a());
        SpiderDebug.log(sb.toString());
        return (z && eVarG.b() == 401 && I()) ? m(str, str2, false) : (z && eVarG.b() == 429) ? m(str, str2, false) : eVarG.a();
    }

    private String n(String str, String str2) {
        if (this.f.a().a().isEmpty()) {
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, 92, -100, -27, -125, 67, -110, -42, 40, 25, -95, -95, -23, 31, -43}, new byte[]{77, 57, -24, -59, -57, 49, -5, -96}));
            String strM = m(com.github.catvod.spider.merge.XI.f.a(new byte[]{-108, 54, 125, 78, 0, 94, 38, -24, -119, 49, 108, 76, 93, 5, 101, -82, -123, 55, 103, 90, 1, 13, 127, -94, -46, 33, 102, 83, 92, 18, 59, -24, -119, 49, 108, 76, 92, 3, 108, -77}, new byte[]{-4, 66, 9, 62, 115, 100, 9, -57}), com.github.catvod.spider.merge.XI.f.a(new byte[]{105, -40}, new byte[]{18, -91, 46, 10, 69, 100, -98, 34}), true);
            com.github.catvod.spider.merge.dO.c cVar = this.f;
            com.github.catvod.spider.merge.dO.g gVar = (com.github.catvod.spider.merge.dO.g) C0924s.a(strM, com.github.catvod.spider.merge.dO.g.class);
            if (gVar == null) {
                gVar = new com.github.catvod.spider.merge.dO.g();
            }
            cVar.e(gVar);
        }
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{19, -102, 27, -94, 69, -23, 64}, new byte[]{80, -11, 107, -37, 107, -57, 110, -27}) + str2);
        return ((com.github.catvod.spider.merge.dO.n) C0924s.a(m(com.github.catvod.spider.merge.XI.f.a(new byte[]{-80, -101, 101, 34, -97, 37, 87, -9, -29, -48, 117, 42, -99, 35, 16}, new byte[]{-47, -1, 23, 75, -23, 64, 120, -127}), String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{51, -70, -29, -11, -52, 44, 61, 23, 60, -21, -77, -86, -26, 34, 122, 6, 39, -4, -24, -78, -121, 34, 122, 2, 33, -12, -12, -49, -44, 61, 122, 94, 106, -67, -30, -78, -111, 123, 43, 12, 41, -22, -12, -49, -44, 61, 122, 94, 106, -67, -30, -78, -111, 123, 57, 17, 60, -9, -50, -30, -40, 55, 57, 9, 45, -70, -85, -28, -49, 44, 61, 72, 106, -20, -2, -49, -51, 56, 42, 1, 38, -20, -50, -10, -44, 53, 61, 59, 33, -4, -77, -86, -97, 43, 55, 11, 60, -70, -67, -78, -55, 54, 7, 0, 58, -15, -25, -11, -30, 48, 60, 70, 114, -70, -76, -29, -97, 36, 116, 70, 32, -3, -16, -12, -40, 43, 43, 70, 114, -29, -77, -45, -46, 55, 44, 1, 38, -20, -68, -60, -60, 41, 61, 70, 114, -70, -16, -32, -51, 53, 49, 7, 41, -20, -8, -1, -45, 118, 50, 23, 39, -10, -77, -19, -111, 123, 49, 0, 106, -94, -77, -96, -97, 117, 122, 9, 45, -20, -7, -1, -39, 123, 98, 70, 24, -41, -62, -60, -97, 117, 122, 17, 58, -12, -77, -86, -97, 118, 62, 13, 36, -3, -66, -13, -46, 41, 33, 70, 53, -59, -67, -78, -49, 60, 43, 11, 61, -22, -14, -11, -97, 99, 122, 2, 33, -12, -12, -78, -64}, new byte[]{72, -104, -111, -112, -67, 89, 88, 100}), str2, str, this.f.a().a()), true), com.github.catvod.spider.merge.dO.n.class)).b().a().a();
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
        mapS.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-81, -19, -65, 19, 0, 122, -117, 79, -93, -81, -89, 30, 15}, new byte[]{-41, -64, -52, 123, 97, 8, -18, 98}), this.j.e());
        mapS.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-17, -125, 126, -24, 42, -45, 40, -64}, new byte[]{-73, -82, 61, -119, 68, -78, 90, -71}), com.github.catvod.spider.merge.XI.f.a(new byte[]{63, -58, -6, -60, 61, -62, 88, 96, 50, -50, -31, -50, 58, -46, 73, 64, 44, -38, -82, -64, 55, -60, 12, 87, 57, -122, -27, -60, 33, -59, 12, 78, 50, -105, -27, -107, 125, -123, 75, 16}, new byte[]{92, -86, -109, -95, 83, -74, 101, 33}));
        if (this.f.c().e()) {
            mapS.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-22, -41, 87, -52, -21, 6, -101, -27, -22, -42, 74, -53, -22}, new byte[]{-117, -94, 35, -92, -124, 116, -14, -97}), this.f.c().c());
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
        String strL = com.github.catvod.spider.merge.nU.c.l(str5, s());
        String strD = ZrJ.d("73");
        String[] strArrSplit = strL.split(strD);
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        int i2 = 8;
        sb.append(str5.substring(0, str5.lastIndexOf(com.github.catvod.spider.merge.XI.f.a(new byte[]{-18}, new byte[]{-63, 122, 94, 79, -59, 1, 113, 100}))));
        String strA = C0925t.a(new byte[]{-67}, new byte[]{-110, -71, 111, -12, -33, -44, 65, 119}, sb);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str6 = strArrSplit[i3];
            byte[] bArr = new byte[i2];
            // fill-array-data instruction
            bArr[0] = 47;
            bArr[1] = -112;
            bArr[2] = 48;
            bArr[3] = -19;
            bArr[4] = 52;
            bArr[5] = 98;
            bArr[6] = 127;
            bArr[7] = 115;
            if (str6.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, -67, 95, -98, 71, 79, 26, 11, 95, -7, 66, -120, 71}, bArr))) {
                map2.put(String.valueOf(i4), strA + str6);
                byte[] bArr2 = new byte[i2];
                // fill-array-data instruction
                bArr2[0] = -120;
                bArr2[1] = 57;
                bArr2[2] = -111;
                bArr2[3] = -91;
                bArr2[4] = -128;
                bArr2[5] = 28;
                bArr2[6] = 114;
                bArr2[7] = -115;
                String strA2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-27, 10, -28, -99}, bArr2);
                String strValueOf = String.valueOf(i4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str4 = strA;
                str6 = String.format(C0925t.a(new byte[]{83, 22, -3, 27, -43, -33, -54, 103, 24, 11, -30, 67, -119, -59, -54, 37, 9, 29, -76, 69, -43, -57, -58, 124, 73, 1, -76, 85, -36, -46, -47, 36, 37, 22, -81, 3, -57, -107, -59, 40, 0, 23, -37, 66, -119, -106, -48, 103, 24, 23, -1, 86, -40, -46, -41, 36, 37, 22, -81, 3, -57, -107, -50, 36, 8, 27, -13, 111, -48, -114, -122, 50}, new byte[]{108, 114, -110, 38, -76, -77, -93, 65}, sb2), strA2, str, str2, str3, strValueOf);
                i4++;
            } else {
                str4 = strA;
            }
            arrayList2.add(str6);
            i3++;
            i2 = 8;
            strA = str4;
        }
        this.a.put(str2, map2);
        return TextUtils.join(strD, arrayList2);
    }

    private List<String> v(com.github.catvod.spider.merge.dO.j jVar, String str, String str2, boolean z) {
        String strC;
        List listB = jVar.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(((com.github.catvod.spider.merge.dO.k) listB.get(size)).b());
            if (z) {
                String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-116, 80, -101, -39, -32, 49, -65}, new byte[]{-4, 34, -2, -81, -119, 84, -56, 69});
                String strB = ((com.github.catvod.spider.merge.dO.k) listB.get(size)).b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strC = String.format(C0925t.a(new byte[]{98, -46, -107, 6, 57, -66, 27, -95, 41, -49, -118, 94, 101, -92, 27, -29, 56, -39, -36, 88, 57, -90, 23, -70, 120, -59, -36, 72, 48, -77, 0, -30, 20, -46, -57, 30, 43, -12, 20, -18, 49, -45, -77, 95, 101, -9, 1, -95, 41, -45, -105, 75, 52, -77, 6, -30, 20, -46, -57, 30, 43}, new byte[]{93, -74, -6, 59, 88, -46, 114, -121}, sb), strA, str, str2, strB);
            } else {
                strC = ((com.github.catvod.spider.merge.dO.k) listB.get(size)).c();
            }
            arrayList.add(strC);
        }
        return arrayList;
    }

    public final String E(String[] strArr, String str) {
        if (!str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-75}, new byte[]{-106, 17, -48, -26, -76, 3, -53, 16}))[0].equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, 13, 122, -79, 2, -15, 53, 36, -125, 114, 81, -29}, new byte[]{45, -107, -59, 88, -123, 125, -45, -67}))) {
            if (!str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{104}, new byte[]{75, -91, 16, 114, 112, -105, 46, 60}))[0].contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{-62, 43, -21, -72, 40, 119, 28, 119, -76, 84, -64, -22}, new byte[]{43, -77, 84, 81, -81, -5, -7, -7}))) {
                return "";
            }
            com.github.catvod.spider.merge.KI.h hVar = new com.github.catvod.spider.merge.KI.h();
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-99, 12, -123, 118}, new byte[]{-14, 124, -32, 24, 35, 28, -107, 83});
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            hVar.y(String.format(C0925t.a(new byte[]{-109, 105, -119, 91, -128, -22, 65, -35, -40, 116, -106, 3, -36, -16, 65, -97, -55, 98, -64, 5, -128, -14, 77, -58, -119, 126, -64, 21, -119, -25, 90, -98, -27, 105, -37, 67, -110, -96, 78, -110, -64, 104, -81, 2, -36, -93, 91}, new byte[]{-84, 13, -26, 102, -31, -122, 40, -5}, sb), strA, str2, str3));
            hVar.j();
            hVar.x(x(strArr));
            hVar.f(s());
            return hVar.toString();
        }
        com.github.catvod.spider.merge.dO.j jVarY = y(strArr[0], strArr[1]);
        List<String> listV = v(jVarY, strArr[0], strArr[1], true);
        List<com.github.catvod.spider.merge.KI.i> listX = x(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = jVarY.a().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.github.catvod.spider.merge.dO.k) it.next()).a());
        }
        ((ArrayList) listX).addAll(arrayList);
        com.github.catvod.spider.merge.KI.h hVar2 = new com.github.catvod.spider.merge.KI.h();
        hVar2.z(listV);
        hVar2.h();
        hVar2.x(listX);
        hVar2.f(s());
        return hVar2.toString();
    }

    public final Object[] G(Map<String, String> map) {
        return new Object[]{200, com.github.catvod.spider.merge.XI.f.a(new byte[]{110, -69, -89, -55, 43, 126, -116, -44, 102, -92, -71, -118, 45, 126, -103, -59, 123, -26, -92, -47, 48, 120, -116, -51}, new byte[]{15, -53, -41, -91, 66, 29, -19, -96}), new ByteArrayInputStream(com.github.catvod.spider.merge.pT.C.t(com.github.catvod.spider.merge.nU.c.e(r(map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, -21, 47, 1, 113, 88, 127}, new byte[]{-57, -125, 78, 115, 20, 17, 27, 52})), map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{106, -2, -54, 59, 111, 34}, new byte[]{12, -105, -90, 94, 38, 70, 108, -67}))), t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    public final Object[] H(Map<String, String> map) {
        String strW;
        AlertDialog alertDialog = this.i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-32, -61, 17, 77, -98, -36, -78, -111, -35, -62}, new byte[]{-108, -90, 124, 61, -14, -67, -58, -12}));
        String str2 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-106, -31, 9, 22, -15, 32, -102}, new byte[]{-27, -119, 104, 100, -108, 105, -2, -18}));
        String str3 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{108, 59, 52, -72, 47, 103, -41}, new byte[]{1, 94, 80, -47, 78, 46, -77, -51}));
        String str4 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-50, -3, 117, 116, 7, -90}, new byte[]{-88, -108, 25, 17, 78, -62, 73, -89}));
        String str5 = map.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-107, -118, -112, 14}, new byte[]{-10, -21, -28, 107, -4, -66, 107, -75}));
        if (com.github.catvod.spider.merge.XI.f.a(new byte[]{101, -88, -8, 110, 101, -65, 22}, new byte[]{21, -38, -99, 24, 12, -38, 97, -26}).equals(str5)) {
            return new Object[]{200, com.github.catvod.spider.merge.XI.f.a(new byte[]{-28, 117, 126, -81, 46, -83, -13, -14, -20, 106, 96, -20, 49, -96, -10, -88, -28, 117, 126, -81, 34, -32, -1, -10, -32, 98, 123, -79, 43}, new byte[]{-123, 5, 14, -61, 71, -50, -110, -122}), new ByteArrayInputStream(u(str2, str4, str).getBytes())};
        }
        if (com.github.catvod.spider.merge.XI.f.a(new byte[]{30, -80, -51, 52}, new byte[]{113, -64, -88, 90, -47, 119, 111, -21}).equals(str5)) {
            strW = r(str2, str4);
        } else if (com.github.catvod.spider.merge.XI.f.a(new byte[]{-110, -50, -37, 4, 69}, new byte[]{-31, -90, -70, 118, 32, 42, 84, 76}).equals(str5)) {
            strW = w(str2, str4);
        } else if (com.github.catvod.spider.merge.XI.f.a(new byte[]{54, -126, -46, -26}, new byte[]{91, -79, -89, -34, -55, -111, -2, 124}).equals(str5)) {
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
        List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-57, -89, 30, 60, 84, 127, 108}, new byte[]{-75, -62, 120, 89, 38, 26, 30, 61}), com.github.catvod.spider.merge.XI.f.a(new byte[]{102, 10, 83, -45, -4, 4, 39, 69, 107, 8, 94, -97}, new byte[]{15, 105, 42, -2, -111, 97, 83, 36}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-40, -113, -85, 59, 76}, new byte[]{-86, -18, -59, 92, 41, -88, 7, -108}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-63, 77, -125, 32, -69, -39, 22, 48, -51, 76}, new byte[]{-94, 34, -19, 78, -34, -70, 98, 89}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, -104, 106, -107, -58, -62, -53, 88, -69, -104, 102, -108, -33, -40, -127}, new byte[]{-43, -5, 9, -16, -74, -74, -26, 61}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 107, 113, -96, -123, 109, 31, -121, -81, 108}, new byte[]{-63, 24, 20, -46, -88, 12, 120, -30}));
        for (String str7 : map.keySet()) {
            if (listAsList.contains(str7)) {
                treeMap.put(str7, map.get(str7));
            }
        }
        return com.github.catvod.spider.merge.pT.m.h(strW, treeMap);
    }

    public final void K() {
        Init.checkPermission();
        I();
    }

    public final void L(String str) {
        this.h = str;
    }

    public final File q() {
        return com.github.catvod.spider.merge.pT.a.n(com.github.catvod.spider.merge.XI.f.a(new byte[]{-101, 95, -53, 92, -97, 101}, new byte[]{-6, 51, -94, 37, -22, 11, 62, 101}));
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String r(String str, String str2) {
        String str3;
        Runnable runnableC0912f;
        int i = 0;
        try {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                str3 = "";
                runnableC0912f = new RunnableC0912f(this, i);
            }
            if (this.c.containsKey(str2) && this.c.get(str2) != null && !A((String) this.c.get(str2))) {
                str3 = (String) this.c.get(str2);
                runnableC0912f = new r(this, i);
                Init.execute(runnableC0912f);
                return str3;
            }
            J(str);
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{113, 105, -36, -102, -98, -126, 31, -96, 121, 109, -52, -117, -125, -103, 95, -30, 56}, new byte[]{22, 12, -88, -34, -15, -11, 113, -52}) + str2);
            this.d.add(0, n(str, str2));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, -72, -7, 76, -102, 75, 16}, new byte[]{-7, -47, -107, 41, -59, 34, 116, 1}), (String) this.d.get(0));
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{80, 123, -68, 61, -56, 52, -28, -96}, new byte[]{52, 9, -43, 75, -83, 107, -115, -60}), this.f.a().a());
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{38, 62, 78, -56, -12, -109, -87, -110, 38, 37}, new byte[]{67, 70, 62, -95, -122, -10, -10, -31}), 900);
            String strA = ((com.github.catvod.spider.merge.dO.f) new Gson().fromJson(D(com.github.catvod.spider.merge.XI.f.a(new byte[]{23, 67, 12, 109, -52, 67, 96, 54, 87, 84, 12, 119, -50, 69, 123, 61, 20, 92, 8, 103, -33, 88, 96}, new byte[]{120, 51, 105, 3, -118, 42, 12, 83}), jsonObject.toString(), true), com.github.catvod.spider.merge.dO.f.class)).a();
            this.c.put(str2, strA);
            Init.execute(new RunnableC0908b(this, i));
            return strA;
        } catch (Throwable th) {
            Init.execute(new RunnableC0923q(this, i));
            throw th;
        }
    }

    public final HashMap<String, String> s() {
        HashMap<String, String> map = new HashMap<>();
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{38, -31, 44, 116, 51, 93, -91, -12, 29, -26}, new byte[]{115, -110, 73, 6, 30, 28, -62, -111}), com.github.catvod.spider.merge.XI.f.a(new byte[]{61, 101, -17, 34, -55, 22, 107, -15, 69, 36, -91, 107, -115, 45, 99, -80, 20, 101, -30, 56, -123, 52, 94, -2, 65, 58, -69, 123, -98, 90, 93, -73, 30, 60, -95, 112, -123, 2, 60, -22, 89, 42, -44, 59, -43, 22, 111, -119, 21, 104, -34, 34, -47, 85, 63, -19, 71, 36, -90, 125, -123, 82, 65, -106, 36, 71, -39, 103, -123, 22, 99, -75, 21, 42, -46, 46, -58, 17, 101, -9, 80, 73, -3, 57, -54, 23, 111, -15, 65, 59, -94, 101, -107, 84, 58, -16, 64, 42, -58, 42, -61, 27, 120, -73, 95, 63, -90, 124, -117, 73, 60}, new byte[]{112, 10, -107, 75, -91, 122, 10, -34}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-44, 93, 85, 84, -28, -62, 38}, new byte[]{-122, 56, 51, 49, -106, -89, 84, -113}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-43, -71, 28, -51, 55, 71, -117, -11, -54, -70, 31, -109, 37, 17, -51, -93, -56, -93, 12, -49, 45, 11, -63, -12, -34, -94, 5, -110}, new byte[]{-67, -51, 104, -67, 68, 125, -92, -38}));
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String w(String str, String str2) {
        JsonElement string;
        try {
            if (this.b.containsKey(str2) && this.b.get(str2) != null && !A((String) this.b.get(str2))) {
                return (String) this.b.get(str2);
            }
            J(str);
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{50, 84, 117, 56, -119, 28, -9, -54, 17, 94, 118, 5, -115, 18, -28, -53, 0, 67, 109, 69, -49, 83}, new byte[]{85, 49, 1, 107, -31, 125, -123, -81}) + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-70, -93, -6, 78, 85, -79, -20}, new byte[]{-36, -54, -106, 43, 10, -40, -120, -17}), str2);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-68, -26, 89, 49, 111, 46, 13, -80}, new byte[]{-49, -114, 56, 67, 10, 113, 100, -44}), str);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-116, -114, -105, -118, 79, -37, 95, 125, -116, -107}, new byte[]{-23, -10, -25, -29, 61, -66, 0, 14}), 600);
            String strM = m(com.github.catvod.spider.merge.XI.f.a(new byte[]{40, -53, -7, 44, -2, -43, 19, 83, 57, -100, -94, 21, -28, -47, 23, 14, 59, -90, -70, 35, -7, -46, 41, 24, 49, -114, -72, 38, -8, -40, 18, 35, 43, -117, -70}, new byte[]{94, -7, -42, 74, -105, -71, 118, 124}), jsonObject.toString(), false);
            try {
                string = JsonParser.parseString(strM);
            } catch (Throwable unused) {
                string = new JsonParser().parse(strM);
            }
            String asString = string.getAsJsonObject().get(com.github.catvod.spider.merge.XI.f.a(new byte[]{127, 38, -9, 98, 12, 3, 113, 18, 68, 60, -14, 96}, new byte[]{27, 73, -128, 12, 96, 108, 16, 118})).getAsString();
            this.b.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final List<com.github.catvod.spider.merge.KI.i> x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{38, -70, 89}, new byte[]{102, -6, 25, 35, -25, -80, 60, 41}))) {
                String[] strArrSplit = str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{54, -59, -125}, new byte[]{118, -123, -61, -51, 49, -30, 93, 86}));
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + com.github.catvod.spider.merge.XI.f.a(new byte[]{96, 72, -85, -25, 47, 14, 39, -54, 43, 85, -76, -65, 115, 17, 59, -114, 121, 95, -84, -69, 60, 7, 7, -120, 98}, new byte[]{95, 44, -60, -38, 78, 98, 78, -20}) + strArr[0] + com.github.catvod.spider.merge.XI.f.a(new byte[]{-52, -97, 105, -6, 28, 92, 80, 100}, new byte[]{-22, -7, 0, -106, 121, 21, 52, 89}) + strArrSplit[2];
                com.github.catvod.spider.merge.KI.i iVar = new com.github.catvod.spider.merge.KI.i();
                iVar.c(str2);
                com.github.catvod.spider.merge.KI.i iVarA = iVar.a(str3);
                iVarA.d(str4);
                arrayList.add(iVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final com.github.catvod.spider.merge.dO.j y(String str, String str2) {
        com.github.catvod.spider.merge.dO.j jVar;
        Runnable runnableC0907a;
        final int i = 0;
        try {
            try {
                J(str);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, 46, 55, -92, -30, 18, -116, 3, -119, 57, 38, -124, -30, 19, -98, 60, -75, 42, 58, -69, -27, 16, -122, 66, -9, 101}, new byte[]{-39, 75, 67, -14, -117, 118, -23, 108}) + str2);
                this.d.add(0, n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-1, 100, -122, -2, -76, 55, 81}, new byte[]{-103, 13, -22, -101, -21, 94, 53, 127}), (String) this.d.get(0));
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-86, 44, -34, 125, -3, -35, 54, 94}, new byte[]{-50, 94, -73, 11, -104, -126, 95, 58}), this.f.a().a());
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, -115, 102, -10, -107, 31, -36, 1}, new byte[]{-48, -20, 18, -109, -14, 112, -82, 120}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-85, -92, 105, 40, -125, -47, 53, 58, -87, -66, 124, 34, -72, -52, 41, 60}, new byte[]{-57, -51, 31, 77, -36, -91, 71, 91}));
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-81, 105, -12, 81, 25, 91, 75, -112, -88, 126, -57, 125, 25, 64}, new byte[]{-38, 27, -104, 14, 124, 35, 59, -7}), 900);
                jVar = ((com.github.catvod.spider.merge.dO.l) new Gson().fromJson(D(com.github.catvod.spider.merge.XI.f.a(new byte[]{-9, 46, 75, -66, 3, -49, -57, -120, -73, 57, 75, -92, 19, -49, -49, -120, -9, 14, 92, -75, 51, -49, -50, -102, -56, 50, 79, -87, 12, -56, -51, -126}, new byte[]{-104, 94, 46, -48, 69, -90, -85, -19}), jsonObject.toString(), true), com.github.catvod.spider.merge.dO.l.class)).a();
                runnableC0907a = new Runnable() { // from class: com.github.catvod.spider.merge.bY.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                x.b((x) this);
                                break;
                            case 1:
                                ((MainActivity) this).k();
                                break;
                            default:
                                Market market = (Market) this;
                                market.getClass();
                                Init.run(new RunnableC0909c(market, 4));
                                break;
                        }
                    }
                };
            } catch (Exception e) {
                e.printStackTrace();
                jVar = new com.github.catvod.spider.merge.dO.j();
                runnableC0907a = new RunnableC0907a(this, i);
            }
            Init.execute(runnableC0907a);
            return jVar;
        } catch (Throwable th) {
            Init.execute(new RunnableC0909c(this, i));
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.KI.k z(String str, String str2, String str3) {
        String strD;
        J(str2);
        JsonObject jsonObject = new JsonObject();
        int i = 8;
        jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{52, -34, 56, 81, 104, -34, 14, -22}, new byte[]{71, -74, 89, 35, 13, -127, 103, -114}), str2);
        com.github.catvod.spider.merge.dO.o oVar = (com.github.catvod.spider.merge.dO.o) C0924s.a(F(com.github.catvod.spider.merge.XI.f.a(new byte[]{-27, 31, 96, -57, -43, 7, -66, 45, -73, 84, 97, -58, -62, 16, -12, 4, -24, 18, 124, -59, -116, 5, -12, 47, -37, 8, 122, -49, -47, 7, -50, 57, -3, 36, 115, -64, -52, 12, -24, 54, -21, 14, 97}, new byte[]{-124, 123, 18, -82, -93, 98, -111, 91}), jsonObject), com.github.catvod.spider.merge.dO.o.class);
        ArrayList<com.github.catvod.spider.merge.dO.h> arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.dO.h> arrayList2 = new ArrayList();
        char c = 0;
        if (!TextUtils.isEmpty(str3)) {
            strD = str3;
        } else if (oVar.c().isEmpty()) {
            strD = "";
        } else {
            com.github.catvod.spider.merge.dO.h hVar = (com.github.catvod.spider.merge.dO.h) oVar.c().get(0);
            strD = hVar.j().equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, -75, -54, -77, 25, -43}, new byte[]{-87, -38, -90, -41, 124, -89, -84, 54})) ? hVar.d() : com.github.catvod.spider.merge.XI.f.a(new byte[]{110, 47, 63, -70}, new byte[]{28, 64, 80, -50, -53, -28, 74, 70});
        }
        C(str2, new com.github.catvod.spider.merge.dO.h(strD), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        int i2 = 1;
        List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-31, -18, -36, -113, -30, 28, -63, -92, -105, -111, -9, -35}, new byte[]{8, 118, 99, 102, 101, -112, 36, 42}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-108, 105, 44, -80, 32, 105, 35, 25, -45, 22, 7, -30}, new byte[]{125, -15, -109, 89, -89, -27, -59, -128}));
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (com.github.catvod.spider.merge.dO.h hVar2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(hVar2.b());
            byte[] bArr = new byte[i2];
            bArr[c] = -25;
            byte[] bArr2 = new byte[i];
            // fill-array-data instruction
            bArr2[0] = -61;
            bArr2[1] = 37;
            bArr2[2] = -89;
            bArr2[3] = -30;
            bArr2[4] = 19;
            bArr2[5] = 26;
            bArr2[6] = -70;
            bArr2[7] = -59;
            v.c(bArr, bArr2, sb, str2);
            byte[] bArr3 = new byte[i2];
            bArr3[c] = 84;
            byte[] bArr4 = new byte[i];
            // fill-array-data instruction
            bArr4[0] = 127;
            bArr4[1] = 50;
            bArr4[2] = 71;
            bArr4[3] = 107;
            bArr4[4] = 30;
            bArr4[5] = -49;
            bArr4[6] = 44;
            bArr4[7] = 79;
            sb.append(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
            sb.append(hVar2.d());
            String strF = hVar2.f();
            ArrayList<com.github.catvod.spider.merge.dO.h> arrayList5 = new ArrayList();
            String lowerCase = com.github.catvod.spider.merge.pT.C.r(strF).toLowerCase();
            for (com.github.catvod.spider.merge.dO.h hVar3 : arrayList2) {
                String lowerCase2 = com.github.catvod.spider.merge.pT.C.r(hVar3.f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(hVar3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (com.github.catvod.spider.merge.dO.h hVar4 : arrayList5) {
                byte[] bArr5 = new byte[i2];
                bArr5[0] = 73;
                sb2.append(com.github.catvod.spider.merge.XI.f.a(bArr5, new byte[]{98, -3, -38, 116, 102, 94, 117, -2}));
                sb2.append(com.github.catvod.spider.merge.pT.C.r(hVar4.f()));
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-12, 16, 47}, new byte[]{-76, 80, 111, -35, -51, -77, 99, 51}));
                sb2.append(hVar4.c());
                sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-126, 75, -23}, new byte[]{-62, 11, -87, -101, -80, 112, 87, 76}));
                sb2.append(hVar4.d());
                i2 = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
            i2 = 1;
            i = 8;
            c = 0;
        }
        for (int i3 = 0; i3 < listAsList.size(); i3++) {
            arrayList4.add(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-37}, new byte[]{-8, 102, -107, 117, 41, 25, 34, 43}), arrayList3));
        }
        com.github.catvod.spider.merge.KI.k kVar = new com.github.catvod.spider.merge.KI.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i(oVar.b());
        kVar.h(oVar.d());
        kVar.k(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-10, -9, -64}, new byte[]{-46, -45, -28, -20, -51, 8, -107, 34}), arrayList4));
        kVar.j(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-69, -118, 64}, new byte[]{-97, -82, 100, 91, -52, -13, 16, -96}), listAsList));
        kVar.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{44, 56, 100, 4, 8, -12, 75, -41, 84, 71, 64, 117}, new byte[]{-59, -96, -37, -19, -113, 120, -81, 109}));
        return kVar;
    }
}
