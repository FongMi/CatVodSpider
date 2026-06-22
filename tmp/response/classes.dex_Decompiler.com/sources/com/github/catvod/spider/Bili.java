package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.DialogInterfaceOnCancelListenerC0127m;
import com.github.catvod.spider.merge.b.DialogInterfaceOnDismissListenerC0130p;
import com.github.catvod.spider.merge.b.RunnableC0115a;
import com.github.catvod.spider.merge.b.RunnableC0121g;
import com.github.catvod.spider.merge.b.RunnableC0122h;
import com.github.catvod.spider.merge.b.RunnableC0123i;
import com.github.catvod.spider.merge.b.RunnableC0124j;
import com.github.catvod.spider.merge.b.RunnableC0125k;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.C0136b;
import com.github.catvod.spider.merge.c.C0137c;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.g.C0159a;
import com.github.catvod.spider.merge.g.C0160b;
import com.github.catvod.spider.merge.g.C0161c;
import com.github.catvod.spider.merge.g.C0163e;
import com.github.catvod.spider.merge.g.C0165g;
import com.github.catvod.spider.merge.g.C0166h;
import com.github.catvod.spider.merge.g.C0168j;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0219l;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Bili extends Spider {
    private static final String g = C0098a.a(new byte[]{124, 105, -34, 34, -109, 85, -26, 20, 42, 94, -104, 120, -50, 83, -97, 1, 93, 37, -18, 121, -38, 37, -17, 21, 46, 49, -19, 114, -59, 35, -10, 109, 46, 37, -23, 9, -61, 94, -99, 105, 44, 42, -19, 124, -58, 80, -24, 26, 119, 114, -50, 36, -108}, new byte[]{30, 28, -88, 75, -9, 102, -37, 44});
    private static String h;
    private JsonObject a;
    private boolean b;
    private boolean c;
    private C0168j d;
    private ScheduledExecutorService e;
    private AlertDialog f;

    class Loader {
        static volatile Bili a = new Bili();

        private Loader() {
        }
    }

    public static void a(Bili bili, C0160b c0160b) {
        Runnable runnableC0123i;
        bili.getClass();
        try {
            try {
                bili.k(c0160b);
                runnableC0123i = new RunnableC0122h(bili, c0160b, 2);
            } catch (Exception unused) {
                bili.k(c0160b);
                runnableC0123i = new RunnableC0123i(bili, c0160b, 4);
            }
            Init.execute(runnableC0123i);
        } catch (Throwable th) {
            Init.execute(new RunnableC0125k(bili, c0160b, 1));
            throw th;
        }
    }

    public static void b(Bili bili) {
        bili.getClass();
        try {
            AlertDialog alertDialog = bili.f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static void c(Bili bili) {
        bili.getClass();
        File fileM = C0208a.m(C0098a.a(new byte[]{29, -17, 90, 57, 49, -23}, new byte[]{50, -63, 56, 80, 93, -128, 71, -40}));
        h = "";
        C0208a.n(fileM, "");
        bili.l();
    }

    public static void d(Bili bili, C0160b c0160b) {
        bili.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        bili.e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0124j(bili, c0160b, 3), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void e(Bili bili, C0160b c0160b) {
        bili.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(C0098a.a(new byte[]{-72, 68, 55, 5, -31, -105, -83, -128, -96, 81, 48, 6, -30, -62, -16, -37, -2, 82, 42, 25, -5, -49, -21, -61, -71, 30, 32, 26, -1, -126, -6, -128, -96, 81, 48, 6, -30, -62, -16, -37, -3, 92, 44, 18, -5, -61, -83, -40, -75, 82, 108, 4, -32, -50, -19, -53, -75, 31, 51, 26, -2, -63, -67, -34, -94, 83, 44, 17, -9, -14, -23, -54, -87, 13}, new byte[]{-48, 48, 67, 117, -110, -83, -126, -81}));
        sb.append(c0160b.k());
        String strO = C0166h.b(C0197c.l(C0133t.b(new byte[]{32, 122, -8, -29, -104, 108, -93, 83, 107, 104, -2, -8, -75, 98, -81, 0, 111}, new byte[]{6, 9, -105, -106, -22, 15, -58, 110}, sb), i())).a().o();
        if (strO.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : Uri.parse(strO).getQuery().split(C0098a.a(new byte[]{-27}, new byte[]{-61, -46, -65, 0, -100, 111, -117, -72}))) {
                sb2.append(str);
                sb2.append(C0098a.a(new byte[]{-121}, new byte[]{-68, -33, 74, -123, 115, 99, 99, -63}));
            }
            File fileM = C0208a.m(C0098a.a(new byte[]{17, 120, -85, 101, -78, 80}, new byte[]{62, 86, -55, 12, -34, 57, 97, 113}));
            String string = sb2.toString();
            h = string;
            C0208a.n(fileM, string);
            C0219l.b(C0098a.a(new byte[]{84, -13, 67, -124, 56, 10, -61, 10, 12, -76, 75, -10, 90, 2, -128, 122, 46, -15, 18, -7, 1, 110, -124, 41}, new byte[]{-68, 92, -12, 109, -65, -121, 37, -100}));
            bili.l();
        }
    }

    public static void f(Bili bili) {
        bili.l();
    }

    private static String g(C0161c c0161c, String str) {
        return String.format(Locale.getDefault(), C0098a.a(new byte[]{30, -18, -81, -121, 107, -44, 41, 35, 75, -64, -91, -75, 126, -44, 118, 93, 30, -20, -92, -120, 111, -59, 38, 35, 97, -64, -90, -106, 116, -50, 45, 57, 86, -113, -88, -119, 117, -44, 45, 57, 86, -5, -78, -106, 126, -99, 106, 114, 81, -115, -28, -40, 17, -100, 26, 50, 82, -35, -82, -107, 126, -50, 60, 54, 86, -58, -92, -120, 59, -55, 44, 106, 0, -118, -72, -60, 59, -62, 41, 57, 70, -40, -94, -126, 111, -56, 117, 117, 7, -36, -23, -58, 120, -49, 44, 50, 65, -36, -10, -60, 62, -45, 106, 119, 79, -58, -90, -125, 79, -39, 56, 50, 31, -115, -18, -107, 57, -128, 109, 36, 2, -36, -65, -121, 105, -44, 31, 62, 86, -57, -104, -89, 75, -99, 106, 114, 81, -115, -11, -20, 39, -30, 41, 36, 71, -6, -103, -86, 37, -123, 59, 107, 13, -19, -86, -107, 126, -11, 26, 27, 28, -91, -9, -75, 126, -57, 37, 50, 76, -37, -119, -121, 104, -59, 104, 62, 76, -53, -82, -98, 73, -63, 38, 48, 71, -110, -23, -61, 104, -126, 118, 93, 30, -26, -91, -113, 111, -55, 41, 59, 75, -43, -86, -110, 114, -49, 38, 119, 80, -50, -91, -127, 126, -99, 106, 114, 81, -115, -28, -40, 17, -100, 103, 4, 71, -56, -90, -125, 117, -44, 10, 54, 81, -54, -11, -20, 39, -113, 26, 50, 82, -35, -82, -107, 126, -50, 60, 54, 86, -58, -92, -120, 37, -86, 116, 120, 99, -53, -86, -106, 111, -63, 60, 62, 77, -63, -104, -125, 111, -98}, new byte[]{34, -81, -53, -26, 27, -96, 72, 87}), c0161c.h().split(C0098a.a(new byte[]{-51}, new byte[]{-30, -63, -23, 55, 68, -102, -103, -100}))[0], c0161c.g() + C0098a.a(new byte[]{-126}, new byte[]{-35, 51, 109, -13, -49, -16, 92, 84}) + c0161c.c(), c0161c.a(), c0161c.d(), c0161c.h(), str, c0161c.k(), c0161c.b().replace(C0098a.a(new byte[]{-94}, new byte[]{-124, 54, -49, -118, 39, -127, -60, -107}), C0098a.a(new byte[]{28, 32, 76, 17, 55}, new byte[]{58, 65, 33, 97, 12, 109, -122, -92})), c0161c.j().a(), c0161c.j().b());
    }

    public static Bili get() {
        return Loader.a;
    }

    private static HashMap<String, String> h() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{83, 93, -115, 94, -127}, new byte[]{96, 109, -65, 102, -79, -47, -78, 101}), C0098a.a(new byte[]{-112, -47, 66, -36, 35, 120}, new byte[]{-95, -24, 112, -20, 19, 72, 69, -4}));
        map.put(C0098a.a(new byte[]{-86, -31, -81, 84, 77}, new byte[]{-103, -47, -99, 103, 127, 87, -80, 86}), C0098a.a(new byte[]{70, 49, -73, 20, -18, 84}, new byte[]{119, 2, -123, 36, -34, 100, 15, 24}));
        map.put(C0098a.a(new byte[]{105, 62, 12, 41, 125}, new byte[]{90, 14, 62, 24, 75, -83, 59, -116}), C0098a.a(new byte[]{-50, 13, 53, -57, 106}, new byte[]{-8, 57, 5, -9, 90, 119, 125, -35}));
        return map;
    }

    private static Map<String, String> i() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{32, -122, -112, 13, -117, -101, 50, -31, 27, -127}, new byte[]{117, -11, -11, 127, -90, -38, 85, -124}), C0098a.a(new byte[]{-114, 41, -75, 81, 91, -109, 122, -73, -10, 104, -1, 24, 31, -88, 114, -10, -89, 41, -72, 75, 23, -79, 79, -72, -14, 118, -31, 8, 12, -33, 76, -15, -83, 112, -5, 3, 23, -121, 45, -84, -22, 102, -114, 72, 71, -109, 126, -49, -90, 36, -124, 81, 67, -48, 46, -85, -12, 104, -4, 14, 23, -41, 80, -48, -105, 11, -125, 20, 23, -109, 114, -13, -90, 102, -120, 93, 84, -108, 116, -79, -29, 5, -89, 74, 88, -110, 126, -73, -14, 119, -8, 22, 7, -47, 43, -74, -13, 102, -100, 89, 81, -98, 105, -15, -20, 115, -4, 15, 25, -52, 45}, new byte[]{-61, 70, -49, 56, 55, -1, 27, -104}));
        map.put(C0098a.a(new byte[]{-122, 31, 12, -96, 119, -63, -122}, new byte[]{-44, 122, 106, -59, 5, -92, -12, -69}), C0098a.a(new byte[]{-48, 70, 112, 9, -33, -11, 64, 54, -49, 69, 115, 87, -50, -90, 3, 112, -38, 91, 104, 16, -126, -84, 0, 116}, new byte[]{-72, 50, 4, 121, -84, -49, 111, 25}));
        if (h != null) {
            map.put(C0098a.a(new byte[]{11, -85, 8, -90, 67, -119}, new byte[]{104, -60, 103, -51, 42, -20, 114, 116}), h);
        }
        return map;
    }

    private static String j(C0161c c0161c) {
        String str;
        if (c0161c.h().startsWith(C0098a.a(new byte[]{111, -100, -73, 5, -42}, new byte[]{25, -11, -45, 96, -71, 62, -61, -12}))) {
            str = String.format(Locale.getDefault(), C0098a.a(new byte[]{-67, -105, 7, 43, -94, -90, 83, -8, -16, -127, 73, 108, -67, -69, 10, -85, -67, -49, 73, 105, -71, -11, 78, -71, -89, -109, 3, 41, -104, -77, 26, -70, -24, -43, 75, 63, -19, -14, 29, -66, -89, -49, 73, 105, -71, -11}, new byte[]{-43, -14, 110, 76, -54, -46, 110, -33}), c0161c.f(), c0161c.l(), c0161c.e(), c0161c.i());
        } else {
            if (!c0161c.h().startsWith(C0098a.a(new byte[]{-47, -45, 98, 56, 42}, new byte[]{-80, -90, 6, 81, 69, 13, -84, -55}))) {
                return "";
            }
            str = String.format(C0098a.a(new byte[]{37, 36, -115, -47, -41, -42, -76, 16, 46, 61, -109, -81, -104, -123, -3, 94, 56, 48, -115, -30, -45, -46, -120, 31, 63, 52, -35, -75, -102, -60, -3}, new byte[]{75, 81, -32, -110, -65, -73, -38, 126}), h().get(c0161c.g()));
        }
        return g(c0161c, str);
    }

    private void k(C0160b c0160b) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0212e.a(240), C0212e.a(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0213f.c(c0160b.o(), 240));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0127m(this, 1)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0130p(this, 1)).show();
            this.f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C0219l.b(C0098a.a(new byte[]{-68, 20, 59, -9, 31, 2, -71, 1, -4, -101, -50, 122, -50, -44, 28, -4, 56, -46, -84, 82, -46, -51, 126, 115, -35, 16, 106, -100, 45, 89, -28, 25, -77, 0, 56, -12, 2, 60}, new byte[]{84, -69, -116, 19, -94, -67, 94, -107}));
        } catch (Exception unused) {
        }
    }

    private void l() {
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0115a(this, 3));
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get(C0098a.a(new byte[]{-41, 94, 85}, new byte[]{-74, 55, 49, -68, 51, -104, -46, 24}));
        String str2 = map.get(C0098a.a(new byte[]{110, 123, -127}, new byte[]{13, 18, -27, 39, -95, 50, -108, 72}));
        Map<String, String> mapI = i();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{84, 110, 93, 108, -43, -58, -82}, new byte[]{38, 11, 59, 9, -89, -93, -36, 10}), C0098a.a(new byte[]{-49, 77, -95, 52, 88, -119, -118, -67, -62, 79, -84, 120}, new byte[]{-90, 46, -40, 25, 53, -20, -2, -36}), C0098a.a(new byte[]{-116, 94, -122, -36, -26}, new byte[]{-2, 63, -24, -69, -125, -107, -18, -36}), C0098a.a(new byte[]{-62, -25, 21, 18, 123, 80, -93, 122, -50, -26}, new byte[]{-95, -120, 123, 124, 30, 51, -41, 19}), C0098a.a(new byte[]{96, 77, -8, 87, -31, 89, 45, -118, 111, 77, -12, 86, -8, 67, 103}, new byte[]{1, 46, -101, 50, -111, 45, 0, -17}), C0098a.a(new byte[]{-80, -12, -112, -45, -63, 126, 96, 78, -85, -13}, new byte[]{-59, -121, -11, -95, -20, 31, 7, 43}), C0098a.a(new byte[]{32, -87, 53, -76, 76, 29}, new byte[]{67, -58, 90, -33, 37, 120, -50, -56}), C0098a.a(new byte[]{-52, -33, 112, -115, 106}, new byte[]{-66, -66, 30, -22, 15, -51, -52, -68}));
        for (String str3 : map.keySet()) {
            if (listAsList.contains(str3)) {
                ((HashMap) mapI).put(str3, map.get(str3));
            }
        }
        String str4 = map.get(C0098a.a(new byte[]{-10, 86}, new byte[]{-121, 56, 30, -4, 44, 114, -47, 45}));
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-62, -47, 117, 90, 26, 84, -112, 72, -53, -43, 104, 4, 11, 7, -45, 14, -56, -52, 109, 67, 71, 13, -48, 10, -123, -35, 46, 90, 5, 15, -58, 2, -40, -118, 113, 70, 8, 23, -54, 21, -58, -102, 96, 92, 0, 10, -126}, new byte[]{-86, -91, 1, 42, 105, 110, -65, 103}, sb, str);
        v.a(new byte[]{-91, -58, 60, -59, -77}, new byte[]{-125, -91, 85, -95, -114, -24, -39, 88}, sb, str2);
        v.a(new byte[]{96, -91, 110, -88}, new byte[]{70, -44, 0, -107, -124, 104, -16, 114}, sb, str4);
        C0159a c0159aD = C0166h.b(C0197c.l(C0133t.b(new byte[]{-81, -94, -120, -115, -119, 115, -104, 71, -71, -16, -34, -35, -114, 112, -48, 1, -30, -7, -41}, new byte[]{-119, -60, -26, -5, -24, 31, -91, 115}, sb), i())).a().d();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (C0161c c0161c : c0159aD.a()) {
            Iterator<String> it = h().keySet().iterator();
            while (it.hasNext()) {
                if (c0161c.g().equals(it.next())) {
                    sb3.append(j(c0161c));
                }
            }
        }
        for (C0161c c0161c2 : c0159aD.d()) {
            if (c0161c2.g().equals(str4)) {
                sb2.append(j(c0161c2));
            }
        }
        return new Object[]{200, C0098a.a(new byte[]{-115, -1, -33, 113, 111, -84, -120, -29, -123, -32, -63, 50, 98, -82, -102, -1, -57, -9, -62, 113}, new byte[]{-20, -113, -81, 29, 6, -49, -23, -105}), new ByteArrayInputStream(String.format(Locale.getDefault(), C0098a.a(new byte[]{95, 46, -49, 30, 102, 119, 88, -96, 13, 16, -91, 34, 53, 102, 8, -18, 11, 23, -21, 42, 124, 32, 26, -69, 20, 20, -79, 45, 117, 33, 90, -66, 4, 76, -83, 106, 118, 62, 26, -108, 46, 47, -52, 57, 46, 106, 88, -83, 78, 10, -15, 41, 50, 110, 91, -81, 6, 65, -65, 34, 43, 99, 91, -65, 94, 65, -22, 40, 40, 53, 88, -68, 6, 4, -91, 62, 39, 124, 93, -10, 16, 0, -9, 63, 43, 110, 15, -95, 19, 7, -91, 104, 118, 62, 4, -18, 67, 27, -20, 51, 124, 124, 86, -92, 6, 14, -2, 22, 41, 108, 84, -72, 10, 12, -15, 103, 100, 122, 71, -94, 89, 14, -17, 63, 33, 53, 81, -83, 16, 11, -91, 41, 37, 103, 80, -95, 2, 89, -14, 42, 34, 53, 7, -4, 82, 82, -65, 30, 7, 92, 125, -31, 46, 51, -37, 116, 62, 124, 81, -18, 67, 23, -26, 42, 35, 50, 23, -65, 23, 2, -21, 51, 37, 45, 21, -95, 6, 7, -10, 59, 22, 125, 80, -65, 6, 13, -21, 59, 50, 102, 90, -94, 39, 22, -19, 59, 50, 102, 90, -94, 94, 65, -49, 14, 99, 124, 102, -18, 67, 14, -10, 52, 4, 122, 83, -86, 6, 17, -53, 51, 43, 106, 8, -18, 51, 55, -70, 41, 21, 45, 21, -68, 17, 12, -7, 51, 42, 106, 70, -15, 65, 22, -19, 52, 124, 98, 69, -87, 4, 89, -5, 59, 53, 103, 15, -68, 17, 12, -7, 51, 42, 106, 15, -91, 16, 12, -7, 60, 107, 96, 91, -31, 7, 6, -14, 59, 40, 107, 15, -2, 83, 82, -82, 120, 120, 5, 9, -100, 6, 17, -10, 53, 34, 47, 81, -71, 17, 2, -21, 51, 41, 97, 8, -18, 51, 55, -70, 41, 21, 45, 21, -65, 23, 2, -19, 46, 123, 45, 101, -104, 83, 48, -67, 100, 76, 42, 70, -58, 70, 16, -107, 102, 105, 95, 80, -66, 10, 12, -5, 100, 76, 51, 26, -127, 51, 39, -95}, new byte[]{99, 99, -97, 90, 70, 15, 53, -52}), c0159aD.b(), c0159aD.c(), c0159aD.b(), sb2.toString(), sb3.toString()).getBytes())};
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (str.endsWith(C0098a.a(new byte[]{-104, 106, 1, -24, -102}, new byte[]{-73, 17, 113, -113, -25, 80, -122, 92}))) {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(C0098a.a(new byte[]{-17, 27, -49}, new byte[]{-126, 114, -85, 1, 69, -17, 40, 3}), str.split(C0098a.a(new byte[]{-47}, new byte[]{-2, 36, -89, -34, -46, 115, 100, -91}))[0]);
            linkedHashMap.put(C0098a.a(new byte[]{-27, -68}, new byte[]{-107, -46, -40, -70, 42, -64, 81, 87}), str2);
            ArrayList arrayList = new ArrayList();
            Iterator<C0165g> it = C0165g.a(C0166h.b(C0197c.l(C0098a.a(new byte[]{37, 43, 33, -76, -46, -54, 6, -94, 44, 47, 60, -22, -61, -103, 69, -28, 47, 54, 57, -83, -113, -109, 70, -32, 98, 39, 122, -73, -47, -111, 74, -24, 98, 40, 55, -83, -114, -111, 91, -18, 98, 44, 48, -91, -45, -109, 65, -78}, new byte[]{77, 95, 85, -60, -95, -16, 41, -115}) + this.d.a(linkedHashMap), i())).a().g().getAsJsonObject().get(C0098a.a(new byte[]{122, 80, 99, 25, 37}, new byte[]{12, 60, 10, 106, 81, -31, -11, -16}))).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c());
            }
            return h.q(arrayList);
        }
        String strA = map.containsKey(C0098a.a(new byte[]{109, 23, 55, 29, 45}, new byte[]{2, 101, 83, 120, 95, 99, -26, 103})) ? map.get(C0098a.a(new byte[]{53, -1, -64, 118, -15}, new byte[]{90, -115, -92, 19, -125, 113, -73, -81})) : C0098a.a(new byte[]{107, -94, 99, -15, -24, 27, -73, 68, 116}, new byte[]{31, -51, 23, -112, -124, 105, -42, 42});
        String strA2 = map.containsKey(C0098a.a(new byte[]{-85, 89, 59, 27, -27, -34, -7, 118}, new byte[]{-49, 44, 73, 122, -111, -73, -106, 24})) ? map.get(C0098a.a(new byte[]{20, 122, -26, 30, -120, 71, -2, 80}, new byte[]{112, 15, -108, 127, -4, 46, -111, 62})) : C0098a.a(new byte[]{4}, new byte[]{52, -55, -74, -12, -44, -26, 19, -82});
        if (map.containsKey(C0098a.a(new byte[]{47, -13, 38}, new byte[]{91, -102, 66, 60, -107, 121, 31, -85}))) {
            str = str + oZP.d("55") + map.get(C0098a.a(new byte[]{116, -26, -127}, new byte[]{0, -113, -27, -53, 8, 69, 9, -118}));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0098a.a(new byte[]{-56, 104, -128, -113, -41, 30, 86, -53, -63, 108, -99, -47, -58, 77, 21, -115, -62, 117, -104, -106, -118, 71, 22, -119, -113, 100, -37, -120, -63, 70, 84, -115, -50, 104, -111, -115, -62, 69, 26, -127, -113, 111, -111, -98, -42, 71, 17, -53, -44, 101, -124, -102, -101, 87, 28, -123, -46, 127, -100, -96, -48, 93, 9, -127, -99, 106, -99, -101, -63, 75, 95, -113, -59, 101, -125, -112, -42, 64, 68}, new byte[]{-96, 28, -12, -1, -92, 36, 121, -28}));
        sb.append(URLEncoder.encode(str));
        v.a(new byte[]{-32, 101, -80, -8, -65, -47, 125}, new byte[]{-58, 10, -62, -100, -38, -93, 64, 35}, sb, strA);
        v.a(new byte[]{-111, -20, -77, 65, -22, 126, -18, 29, -39, -75}, new byte[]{-73, -120, -58, 51, -117, 10, -121, 114}, sb, strA2);
        C0166h c0166hB = C0166h.b(C0197c.l(C0134u.b(new byte[]{-17, -122, 89, -39, 35, 0}, new byte[]{-55, -10, 56, -66, 70, 61, 22, -111}, sb, str2), i()));
        ArrayList arrayList2 = new ArrayList();
        Iterator<C0165g> it2 = C0165g.a(c0166hB.a().l()).iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().c());
        }
        return h.q(arrayList2);
    }

    public void clearCookie() {
        h = "";
        File fileM = C0208a.m(C0098a.a(new byte[]{-39, -93, 48, -68, -121, 50}, new byte[]{-10, -115, 82, -43, -21, 91, -99, -49}));
        try {
            if (fileM.exists()) {
                fileM.delete();
            }
        } catch (Exception unused) {
        }
    }

    public String detailContent(List<String> list) {
        if (!this.b) {
            h = TextUtils.isEmpty(h) ? C0208a.j(C0208a.m(C0098a.a(new byte[]{39, -21, 63, -74, -41, 22}, new byte[]{8, -59, 93, -33, -69, 127, -65, 87}))) : h;
            C0160b c0160bA = C0166h.b(C0197c.l(C0098a.a(new byte[]{87, 125, 37, 4, -34, 74, 123, 103, 94, 121, 56, 90, -49, 25, 56, 33, 93, 96, 61, 29, -125, 19, 59, 37, 16, 113, 126, 3, -56, 18, 121, 33, 81, 125, 52, 6, -53, 17, 55, 45, 16, 103, 48, 2}, new byte[]{63, 9, 81, 116, -83, 112, 84, 72}), i())).a();
            this.b = c0160bA.q();
            this.c = c0160bA.r();
            this.d = c0160bA.p();
        }
        SpiderDebug.log(C0098a.a(new byte[]{-51, 86, 100, 89, 15, -30, -4, -75, -18, 86, 100, 115, 64, -24, -19, -92, -31, 75, 40, 89, 75, -68, -71}, new byte[]{-113, 63, 8, 48, 47, -122, -103, -63}) + list.get(0));
        String[] strArrSplit = list.get(0).split(C0098a.a(new byte[]{-78}, new byte[]{-14, -126, 64, -37, 99, -40, 16, 17}));
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        C0160b c0160bA2 = C0166h.b(C0197c.l(C0134u.b(new byte[]{-122, -88, 87, -119, 96, -16, -85, 12, -113, -84, 74, -41, 113, -93, -24, 74, -116, -75, 79, -112, 61, -87, -21, 78, -63, -92, 12, -114, 118, -88, -87, 74, -128, -88, 70, -117, 117, -85, -25, 70, -63, -86, 74, -100, 100, -11, -27, 74, -118, -31}, new byte[]{-18, -36, 35, -7, 19, -54, -124, 35}, new StringBuilder(), str2), i())).a();
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(c0160bA2.j());
        kVar.h(c0160bA2.m());
        kVar.b(c0160bA2.n());
        kVar.e(c0160bA2.e());
        kVar.f(c0160bA2.h().a());
        kVar.l((c0160bA2.f().longValue() / 60) + C0098a.a(new byte[]{-5, -106, -79, -20, -51, 78}, new byte[]{30, 30, 55, 5, 93, -42, 23, 9}));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-98, 58, -123, 34, -94, -81, 37, -55, -105, 62, -104, 124, -77, -4, 102, -113, -108, 39, -99, 59, -1, -10, 101, -117, -39, 54, -34, 34, -67, -12, 115, -125, -124, 97, -127, 62, -80, -20, 127, -108, -102, 113, -112, 36, -72, -15, 55}, new byte[]{-10, 78, -15, 82, -47, -107, 10, -26}, sb, str2);
        sb.append(C0098a.a(new byte[]{-101, 2, -76, 18, 1}, new byte[]{-67, 97, -35, 118, 60, 55, -78, -81}));
        sb.append(c0160bA2.c());
        C0160b c0160bA3 = C0166h.b(C0197c.l(C0133t.b(new byte[]{92, 70, -32, -127, -95, 22, 100, -60, 28, 89, -8, -35, -4, 25, 103, -46, 78, 15, -88, -38, -1, 81, 33, -119, 71, 6}, new byte[]{122, 55, -114, -68, -112, 36, 83, -30}, sb), i())).a();
        for (int i = 0; i < c0160bA3.b().size(); i++) {
            int iIntValue = c0160bA3.b().get(i).intValue();
            if ((this.b || iIntValue <= 32) && (this.c || iIntValue <= 80)) {
                arrayList2.add(c0160bA3.b().get(i));
                arrayList.add(c0160bA3.a().get(i));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0163e c0163e : c0160bA2.i()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0163e.b());
            v.a(new byte[]{-80}, new byte[]{-108, -103, -106, -86, 3, 73, -79, 55}, sb2, str2);
            sb2.append(C0098a.a(new byte[]{115}, new byte[]{88, -68, -25, 16, 93, 80, 49, 119}));
            sb2.append(c0163e.a());
            sb2.append(C0098a.a(new byte[]{-94}, new byte[]{-119, -1, -122, -105, 9, -55, 74, 41}));
            sb2.append(TextUtils.join(C0098a.a(new byte[]{-49}, new byte[]{-11, 44, 107, -65, -105, 97, 31, -128}), arrayList2));
            sb2.append(C0098a.a(new byte[]{-84}, new byte[]{-121, -28, 16, 13, -117, 34, 79, 3}));
            sb2.append(TextUtils.join(C0098a.a(new byte[]{-6}, new byte[]{-64, 105, -98, -32, -33, 2, -72, -28}), arrayList));
            arrayList3.add(sb2.toString());
        }
        linkedHashMap.put(C0098a.a(new byte[]{-64, 115, 126, 122}, new byte[]{-126, -108, -43, -29, 107, -116, -91, 39}), TextUtils.join(C0098a.a(new byte[]{84}, new byte[]{119, -73, -86, 105, -42, -119, 70, -82}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{105, 43, 71}, new byte[]{77, 15, 99, 4, 18, 98, -109, 73}), linkedHashMap.keySet()));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{122, -125, 39}, new byte[]{94, -89, 3, -98, 102, 36, -37, 3}), linkedHashMap.values()));
        return h.p(kVar);
    }

    public void getQRCode() {
        Init.run(new RunnableC0121g(this, C0166h.b(C0197c.l(C0098a.a(new byte[]{-25, 91, 53, 13, -39, -9, 13, -58, -1, 78, 50, 14, -38, -94, 80, -99, -95, 77, 40, 17, -61, -81, 75, -123, -26, 1, 34, 18, -57, -30, 90, -58, -1, 78, 50, 14, -38, -94, 80, -99, -94, 67, 46, 26, -61, -93, 13, -98, -22, 77, 110, 12, -40, -82, 77, -115, -22, 0, 38, 24, -60, -88, 80, -120, -5, 74, 126, 14, -59, -72, 80, -118, -22, 18, 44, 28, -61, -93, 15, -124, -26, 65, 40}, new byte[]{-113, 47, 65, 125, -86, -51, 34, -23}), null)).a(), 1));
    }

    public String homeContent(boolean z) {
        if (this.a.has(C0098a.a(new byte[]{123, -24, -38, -99}, new byte[]{17, -101, -75, -13, -59, 31, -106, 103}))) {
            return C0197c.l(this.a.get(C0098a.a(new byte[]{98, 76, 77, -12}, new byte[]{8, 63, 34, -102, -22, -80, 89, -77})).getAsString(), null);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.a.get(C0098a.a(new byte[]{111, 49, -113, -47}, new byte[]{27, 72, -1, -76, 120, 84, -19, 30})).getAsString().split(C0098a.a(new byte[]{122}, new byte[]{89, 90, 85, -35, 95, -128, -2, -77}))) {
            arrayList.add(new C0135a(str, str));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C0137c(C0098a.a(new byte[]{106, -31, 77, -58, -98}, new byte[]{5, -109, 41, -93, -20, -73, 41, -1}), C0098a.a(new byte[]{59, 27, -17, 123, 42, 5}, new byte[]{-35, -107, 125, -98, -112, -118, 81, 9}), Arrays.asList(new C0136b(C0098a.a(new byte[]{123, -18, 60, 16, -4, -43}, new byte[]{-110, 78, -84, -8, 84, 120, -54, 29}), C0098a.a(new byte[]{16, -70, 70, 95, 86, -120, 29, -4, 15}, new byte[]{100, -43, 50, 62, 58, -6, 124, -110})), new C0136b(C0098a.a(new byte[]{-32, -40, -124, -49, 101, -36, -68, -110, -104, -94, -105, -96}, new byte[]{6, 68, 4, 42, -63, 70, 85, 41}), C0098a.a(new byte[]{29, -16, -41, -74, 100}, new byte[]{126, -100, -66, -43, 15, 48, 40, -36})), new C0136b(C0098a.a(new byte[]{39, -87, -82, 71, 83, 77, 113, 37, 125, -48, -106, 34}, new byte[]{-63, 53, 46, -95, -59, -3, -106, -68}), C0098a.a(new byte[]{-14, 95, -125, 45, 7, -44, -128}, new byte[]{-126, 42, -31, 73, 102, -96, -27, 85})), new C0136b(C0098a.a(new byte[]{26, -18, 18, -93, 83, -108, -21, 114, 116, -105, 43, -45}, new byte[]{-4, 114, -110, 70, -9, 14, 14, -49}), C0098a.a(new byte[]{18, -66}, new byte[]{118, -45, 50, 93, -72, -22, 66, -18})), new C0136b(C0098a.a(new byte[]{26, -20, 1, -41, -48, 59, 119, -26, 74, -104, 22, -67}, new byte[]{-4, 112, -127, 50, 116, -95, -111, 114}), C0098a.a(new byte[]{-54, -44, -87, 15}, new byte[]{-71, -96, -58, 120, 14, -117, 115, 88})))));
            arrayList2.add(new C0137c(C0098a.a(new byte[]{16, 93, 29, -37, 106, -20, 87, -38}, new byte[]{116, 40, 111, -70, 30, -123, 56, -76}), C0098a.a(new byte[]{114, 88, -79, 26, -63, -92}, new byte[]{-108, -63, 51, -13, 84, 19, 95, 4}), Arrays.asList(new C0136b(C0098a.a(new byte[]{-81, 75, 84, 115, 49, 70, 57, 13, -56, 39, 105, 45}, new byte[]{74, -50, -4, -102, -78, -18, -33, -108}), C0098a.a(new byte[]{48}, new byte[]{0, -17, 71, -66, 33, -52, -9, -64})), new C0136b(C0098a.a(new byte[]{2, 22, 1, -126, -115, 58, -82, 73, -48, -99, 65, -18, -77, 89}, new byte[]{52, 38, -28, 10, 11, -45, 62, -47}), C0098a.a(new byte[]{-52}, new byte[]{-8, -93, 109, -84, 31, 27, -90, 94})), new C0136b(C0098a.a(new byte[]{51, -27, -91, -47, 52, -79, 41, -94, -23, 69, 67}, new byte[]{0, -43, -37, -25, 4, 84, -95, 36}), C0098a.a(new byte[]{57}, new byte[]{10, -24, -57, -116, -17, 10, -47, 121})), new C0136b(C0098a.a(new byte[]{-93, -90, 16, 0, 114, 108, -26, -11, 123, 6, -10}, new byte[]{-110, -106, 110, 51, 66, -119, 110, 115}), C0098a.a(new byte[]{-102}, new byte[]{-88, 24, -49, 109, 65, -81, -105, 16})), new C0136b(C0098a.a(new byte[]{-6, 23, -25, -12, 28, -43, 57, -89, 47, -100, -89, -104, 34, -73}, new byte[]{-53, 39, 2, 124, -102, 60, -87, 63}), C0098a.a(new byte[]{17}, new byte[]{32, 16, -126, 72, 47, 60, 28, -101})))));
            linkedHashMap.put(str, arrayList2);
        }
        return h.s(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        C0166h c0166hB = C0166h.b(C0197c.l(C0098a.a(new byte[]{126, -98, 20, -4, 109, -63, -108, -48, 119, -102, 9, -94, 124, -110, -41, -106, 116, -125, 12, -27, 48, -104, -44, -110, 57, -110, 79, -5, 123, -103, -106, -106, 120, -98, 5, -2, 120, -102, -40, -102, 57, -102, 15, -4, 107, -105, -38, -115, 41, -102, 19, -79, 44, -53}, new byte[]{22, -22, 96, -116, 30, -5, -69, -1}), i()));
        ArrayList arrayList = new ArrayList();
        Iterator<C0165g> it = C0165g.a(c0166hB.a().g()).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return h.q(arrayList);
    }

    public void init(Context context, String str) {
        JsonObject jsonObject;
        JsonElement string;
        Init.checkPermission();
        try {
            try {
                string = JsonParser.parseString(str);
            } catch (Throwable unused) {
                string = new JsonParser().parse(str);
            }
            jsonObject = string.getAsJsonObject();
            if (jsonObject == null) {
                jsonObject = new JsonObject();
            }
        } catch (Throwable unused2) {
            jsonObject = new JsonObject();
        }
        this.a = jsonObject;
        String asString = jsonObject.get(C0098a.a(new byte[]{-48, 100, 120, -68, -25, 43}, new byte[]{-77, 11, 23, -41, -114, 78, -73, -121})).getAsString();
        h = asString;
        if (asString.startsWith(C0098a.a(new byte[]{100, 109, -96, -109}, new byte[]{12, 25, -44, -29, -19, -32, -17, -9}))) {
            h = C0197c.l(h, null).trim();
        }
        if (TextUtils.isEmpty(h)) {
            h = C0208a.j(C0208a.m(C0098a.a(new byte[]{-22, 93, -19, -9, 29, 92}, new byte[]{-59, 115, -113, -98, 113, 53, 109, 11})));
        }
        if (TextUtils.isEmpty(h)) {
            h = g;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split(C0098a.a(new byte[]{115, 80}, new byte[]{47, 123, -60, -39, 53, 63, -89, 73}));
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String[] strArrSplit2 = strArrSplit[3].split(C0098a.a(new byte[]{30}, new byte[]{36, 45, 88, 22, 24, 15, 11, -53}));
        String[] strArrSplit3 = strArrSplit[2].split(C0098a.a(new byte[]{-65}, new byte[]{-123, -63, -81, -49, -38, -18, 43, 121}));
        ArrayList arrayList = new ArrayList();
        String strConcat = C0098a.a(new byte[]{-29, -103, 4, -45, 93, -121, 77, -26, -22, -99, 25, -115, 76, -44, 14, -96, -23, -124, 28, -54, 0, -34, 13, -92, -92, -107, 95, -43, 31, -110, 6, -92, -92, -127, 25, -48, 90, -109, 17, -90, -76, -126, 25, -57, 19}, new byte[]{-117, -19, 112, -93, 46, -67, 98, -55}).concat(str4);
        for (int i = 0; i < strArrSplit2.length; i++) {
            arrayList.add(strArrSplit2[i]);
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            v.a(new byte[]{-19, 52, -120, -112, 42, -78, 104, -10, -12, 49, -114, -55, 117}, new byte[]{-46, 80, -25, -83, 72, -37, 4, -97}, sb, str3);
            v.a(new byte[]{-114, -32, -72, -4, -44}, new byte[]{-88, -125, -47, -104, -23, -126, -94, 43}, sb, str4);
            sb.append(C0098a.a(new byte[]{94, -34, 7, -88}, new byte[]{120, -81, 105, -107, 108, 36, -127, 73}));
            sb.append(strArrSplit3[i]);
            sb.append(C0098a.a(new byte[]{32, -22, -107, 120, -63, 14, 7, -114, 98}, new byte[]{6, -98, -20, 8, -92, 51, 106, -2}));
            arrayList.add(sb.toString());
        }
        h hVar = new h();
        hVar.z(arrayList);
        hVar.a(strConcat);
        hVar.b();
        hVar.f(i());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        return categoryContent(str, C0098a.a(new byte[]{114}, new byte[]{67, 59, -17, -84, -97, -37, 0, 51}), true, new HashMap<>());
    }

    public String searchContent(String str, boolean z, String str2) {
        return categoryContent(str, str2, true, new HashMap<>());
    }
}
