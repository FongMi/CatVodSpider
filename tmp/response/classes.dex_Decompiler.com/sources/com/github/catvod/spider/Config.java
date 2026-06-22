package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.RunnableC0119e;
import com.github.catvod.spider.merge.b.RunnableC0123i;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.j;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.o.RunnableC0202a;
import com.github.catvod.spider.merge.o.RunnableC0203b;
import com.github.catvod.spider.merge.o.c;
import com.github.catvod.spider.merge.o.d;
import com.github.catvod.spider.merge.o.e;
import com.github.catvod.spider.merge.o.f;
import com.github.catvod.spider.merge.o.g;
import com.github.catvod.spider.merge.o.h;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0219l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Config extends Spider {
    private Context a;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] PushInfo(java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Config.PushInfo(java.util.Map):java.lang.Object[]");
    }

    public static void a(Config config, JSONObject jSONObject) {
        String strA;
        config.getClass();
        try {
            int iA = C0212e.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            String strOptString = jSONObject.optString(C0098a.a(new byte[]{-34, -124, -106}, new byte[]{-85, -10, -6, -12, 51, -127, 92, -4}));
            if (strOptString == null || strOptString.isEmpty()) {
                strA = C0098a.a(new byte[]{-22, 74, -118, 102, 35, 116, -112, -78, 22, -94, 41, -6, 75, 42, -67, -11, 89, -85, 83, -95, 83, 83, -52, -35, 47, -4, 124, -54, 32, 119, -98, -78, 31, -103}, new byte[]{-65, 24, -58, 70, -57, -52, 42, 85});
            } else {
                imageView.setImageBitmap(C0213f.c(strOptString, iA));
                FrameLayout frameLayout = new FrameLayout(Init.context());
                layoutParams.gravity = 17;
                frameLayout.addView(imageView, layoutParams);
                new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).show().getWindow().setBackgroundDrawable(new ColorDrawable(0));
                strA = C0098a.a(new byte[]{33, -34, -19, -76, 85, -59, 8, 66, 97, -108, -28, -2, 12, -59, 78, 48, 64, -38, -68, -33, 103, -98, 85, 90, 46, -54, -18, -73, 72, -5}, new byte[]{-55, 113, 90, 80, -24, 122, -17, -42});
            }
            C0219l.b(strA);
        } catch (Exception e) {
            e.printStackTrace();
            C0219l.b(C0098a.a(new byte[]{66, -18, -118, -52, -81, 18, 78, -6, 41, -99, -82, -98, -64, 34, 43, -90, 50, -52, -16, -83, -99, 107, 62, -39}, new byte[]{-91, 122, 21, 42, 39, -126, -86, 64}) + e.getMessage());
        }
    }

    public static /* synthetic */ void b(Config config) {
        config.getClass();
        try {
            String str = String.format(C0098a.a(new byte[]{-24, -103, 124, -97, 103, 0, 66, 33, -13, -41, 49, -42, 106, 23, 66, 116, -14, -126, 112, -106, 98, 75, 2, 57, -16, -104, 123, -121, 52, 65, 11, 107}, new byte[]{-128, -19, 8, -17, 93, 47, 109, 4}), C0207D.g(config.a));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-93, 31, 2}, new byte[]{-42, 109, 110, -64, 94, 38, -114, 18}), str);
            Init.run(new RunnableC0123i(config, jSONObject, 5));
        } catch (JSONException unused) {
        }
    }

    private List<k> c() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C0098a.a(new byte[]{34, 123, -85, 124, 77, -101, -10, -27}, new byte[]{70, 30, -57, 45, 56, -6, -124, -114}), C0098a.a(new byte[]{-84, 2, 89, 10, 114, -116, -43, 105, -14, 95, 89, 104, -88, 71, 95, -90, 35, -33}, new byte[]{74, -70, -36, -29, -21, 40, 48, -51}));
        linkedHashMap.put(C0098a.a(new byte[]{-39, 117, -70, 84, -47, -97, 122, -18}, new byte[]{-72, 17, -34, 5, -92, -2, 8, -123}), C0098a.a(new byte[]{-33, -114, -30, 107, -47, -93, 85, -107, -113, -59, -39, 7, 47, 98, -33, 90, 94, 69}, new byte[]{55, 32, 92, -116, 108, 13, -80, 49}));
        linkedHashMap.put(C0098a.a(new byte[]{-96, 43, -107, -5, 99}, new byte[]{-60, 78, -7, -82, 0, 6, -79, 34}), C0098a.a(new byte[]{59, 35, 13, 113, 75, -70, 102, 21, 58, 0, 16, -37, -67, 113, 88, 63, -72}, new byte[]{-35, -101, -120, -104, -46, 30, 51, 86}));
        linkedHashMap.put(C0098a.a(new byte[]{-118, -75, 13, -61, -86}, new byte[]{-21, -47, 105, -106, -55, -71, 0, -74}), C0098a.a(new byte[]{-57, -69, -108, -90, 24, -1, -90, -92, -56, -114, -78, 2, -54, 62, -104, -114, 74}, new byte[]{47, 21, 42, 65, -91, 81, -13, -25}));
        linkedHashMap.put(C0098a.a(new byte[]{-69, 50, 119, -25, 77, -70, 95}, new byte[]{-38, 86, 19, -78, 46, -18, 41, -122}), C0098a.a(new byte[]{-120, 46, -110, -60, 111, 113, -126, 16, 82, 103, -73, -69, -122, -119, -108, 60, 15, -21, 69, 70}, new byte[]{96, -128, 44, 35, -46, -33, -41, 83}));
        linkedHashMap.put(C0098a.a(new byte[]{-116, -29, -99, 65, 27, 79}, new byte[]{-24, -122, -15, 0, 119, 38, -116, 105}), C0098a.a(new byte[]{-56, -93, -121, -115, 54, -53, -21, -111, -110, -62, -96, -24, -5, 0, 105, 108, 67}, new byte[]{45, 43, 39, 100, -81, 111, 2, 9}));
        linkedHashMap.put(C0098a.a(new byte[]{39, 29, -12, 94, -28, -42}, new byte[]{70, 121, -112, 31, -120, -65, 46, -3}), C0098a.a(new byte[]{-65, 105, 10, -45, 99, 90, 99, 56, -24, 46, 51, -72, -118, -101, -31, -59, 57}, new byte[]{87, -57, -76, 52, -34, -12, -118, -96}));
        linkedHashMap.put(C0098a.a(new byte[]{-105, 52, 101, -127, -93, 125, -49, -54}, new byte[]{-13, 81, 9, -61, -62, 20, -85, -65}), C0098a.a(new byte[]{115, 93, -73, -4, -74, -40, -51, 43, 40, 48, -83, -77, 108, 19, 69, -39, -1, -80}, new byte[]{-106, -43, 23, 21, 47, 124, 42, -78}));
        linkedHashMap.put(C0098a.a(new byte[]{49, -52, 10, 9, 21, -72, -72, 122}, new byte[]{80, -88, 110, 75, 116, -47, -36, 15}), C0098a.a(new byte[]{-42, 59, 27, -100, 57, -115, 65, -128, -128, 112, 31, -35, -57, 76, -55, 114, 87, -16}, new byte[]{62, -107, -91, 123, -124, 35, -90, 25}));
        linkedHashMap.put(C0098a.a(new byte[]{-105, -122, -72, -49, -76, -119, 62, 65, -122, -105, -88}, new byte[]{-10, -30, -36, -97, -43, -25, 119, 47}), C0098a.a(new byte[]{33, -80, 125, 110, 2, 96, 117, 119, 86, -39, 78, 31, 100, 111, 26, 44, 90, -67}, new byte[]{-57, 62, -43, -121, -126, -31, -110, -54}));
        linkedHashMap.put(C0098a.a(new byte[]{-89, 110, -81, -54, -46, -109, -97}, new byte[]{-61, 11, -61, -120, -69, -1, -10, 16}), C0098a.a(new byte[]{-42, 73, 27, 114, 24, 76, -63, -64, -104, 88, -8, -12, -18, -125, -22, 66}, new byte[]{51, -63, -69, -101, -127, -24, -125, 39}));
        linkedHashMap.put(C0098a.a(new byte[]{-35, -35, 11, 127, 98, 103, 54}, new byte[]{-68, -71, 111, 61, 11, 11, 95, 93}), C0098a.a(new byte[]{-85, -43, 98, -75, -10, -34, 75, 74, -24, -30, -97, 61, 36, 27, 96, -56}, new byte[]{67, 123, -36, 82, 75, 112, 9, -83}));
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String strA = C0098a.a(new byte[]{60, 40, -124, -101, -53, -101, -82, -21, 50, 47, -35, -126, -43, -116, -22, -95, 50, 41, -34, -36, -43, -50, -18, -74, 121, 58, -125, -38, -106, -62, -18, -87, 123, 48, -119, -60, -116, -59, -77, -89, 103, 58, -64, -37, -107, -106, -27, -16, 55, 113, -63, -38, -35, -108, -84, -91, 50, 109, -59, -58, -116, -112, -29, -94, 98, 111, -111, -114, -116, -60, -32, -12, 123, 109, -57, -39, -119, -106, -77, -10, 99, 106, -59, -45, -115, -103, -82, -96, 109, 57, -63, -40, -117, -103, -30, -94, 109, 107, -107, -36, -37, -61, -79, -13, 50, 57, -55, -120, -36, -111, -73, -94, 48, 62, -109, -113, -114, -112, -30, -22, 36, 50, -105}, new byte[]{84, 92, -16, -21, -72, -95, -127, -60});
            if (str.contains(C0098a.a(new byte[]{44, 125, 15}, new byte[]{109, 17, 102, 22, 7, -118, 63, -77}))) {
                strA = C0098a.a(new byte[]{4, 14, -58, 20, -121, -59, 114, 17, 2, 27, -60, 74, -127, -119, 50, 81, 15, 84, -47, 11, -103, -48, 42, 78, 65, 25, -35, 10, -128, -102, 51, 74, 67, 15, -62, 8, -101, -98, 57, 77, 67, 72, -126, 86, -58, -48, 109, 15, 67, 95, -9, 81, -47, -67, 108, 27, 84, 60, -105, 33, -63, -38, 31, 7, 73, 67, -121, 65, -79, -55, 120, 6, 84, 95, -13, 37, -47, -70, 104, 27, 85, 56, -105, 38, -79, -46, 111, 14, 94, 72, -97, 84, -59, -46, 108, 15, 65, 72, -126, 84, -64, -53, 107, 16, 28, 20, -43}, new byte[]{108, 122, -78, 100, -12, -1, 93, 62});
            } else if (str.contains(C0098a.a(new byte[]{1, -13, -88, 94, -112}, new byte[]{67, -110, -63, 58, -27, -17, 51, 71}))) {
                strA = C0098a.a(new byte[]{57, 21, 51, -92, -113, -108, -116, -18, 55, 18, 106, -67, -111, -125, -56, -92, 55, 20, 105, -29, -111, -63, -52, -77, 124, 7, 52, -27, -46, -51, -52, -84, 126, 13, 62, -5, -56, -54, -111, -94, 98, 7, 119, -28, -47, -103, -57, -11, 50, 76, 118, -27, -103, -101, -114, -96, 55, 80, 114, -7, -56, -97, -63, -89, 103, 82, 38, -79, -56, -53, -62, -15, 126, 80, 112, -32, -49, -97, -105, -8, 101, 84, 113, -27, -54, -98, -116, -93, 48, 8, 35, -95, -46, -34, -51, -90}, new byte[]{81, 97, 71, -44, -4, -82, -93, -63});
            } else if (str.contains(C0098a.a(new byte[]{-82, -27, 61, -4, 50}, new byte[]{-1, -112, 92, -114, 89, -93, 24, -48}))) {
                strA = C0098a.a(new byte[]{-59, 56, -49, -124, -65, 59, 115, -86, -34, 41, -38, -109, -95, 44, 49, -32, -55, 37, -38, -38, -65, 100, 61, -30, -64, 47, -33, -102, -30, 98, 51, -24, -126, 33, -38, -128, -87, 115, 53, -28, -63, 99, -118, -61, -8, 54, 114, -17, -35, 43, -124, -116, -31, 110, 47, -10, -128, 60, -55, -101, -81, 100, 47, -10, -112, 37, -42, -107, -85, 100, 115, -9, -56, 63, -46, -114, -87, 45, 43, -38, -103, 116, -117}, new byte[]{-83, 76, -69, -12, -52, 1, 92, -123});
            } else if (str.contains(C0098a.a(new byte[]{102, 34, -9, -74}, new byte[]{36, 75, -101, -33, -36, 100, -58, 60}))) {
                strA = C0098a.a(new byte[]{-12, -55, 106, -38, 26, -25, -18, -61, -6, -50, 51, -61, 4, -16, -86, -119, -6, -56, 48, -99, 4, -78, -82, -98, -79, -37, 109, -101, 71, -66, -82, -127, -77, -47, 103, -123, 93, -71, -13, -113, -81, -37, 46, -102, 68, -22, -91, -40, -1, -112, 47, -101, 12, -24, -20, -115, -6, -116, 43, -121, 93, -20, -93, -118, -86, -114, 127, -49, 93, -72, -96, -36, -77, -116, 41, -103, 88, -24, -12, -37, -84, -116, 42, -103, 81, -24, -18, -114, -11, -47, 119, -124, 25, -77, -90}, new byte[]{-100, -67, 30, -86, 105, -35, -63, -20});
            } else if (str.contains(C0098a.a(new byte[]{114, -2, -21, 103, -80, 108, -60, 41, 99, -17, -5}, new byte[]{19, -102, -113, 55, -47, 2, -115, 71}))) {
                strA = C0098a.a(new byte[]{29, -80, -82, 11, 79, 109, 13, -125, 19, -73, -9, 18, 81, 122, 73, -55, 19, -79, -12, 76, 81, 56, 77, -34, 88, -94, -87, 74, 18, 52, 77, -63, 90, -88, -93, 84, 8, 51, 16, -49, 70, -94, -22, 75, 17, 96, 70, -104, 22, -23, -21, 74, 89, 98, 15, -51, 19, -11, -17, 86, 8, 102, 64, -54, 67, -9, -69, 30, 8, 50, 67, -100, 90, -11, -19, 73, 5, 102, 23, -97, 66, -13, -21, 67, 14, 101, 13, -44, 28, -91, -75, 24, 91, 50, 12, -58, 5, -93}, new byte[]{117, -60, -38, 123, 60, 87, 34, -84});
            }
            arrayList.add(new k(str, str2, strA, "", j.a(0.75f), str));
        }
        return arrayList;
    }

    private void d(String str) {
        HashMap map;
        int i;
        try {
            map = new HashMap();
            i = 3;
            map.put(C0098a.a(new byte[]{52, 8, 76, 124, 114, -119}, new byte[]{80, 109, 32, 61, 30, -32, -74, 92}), h.b);
            map.put(C0098a.a(new byte[]{119, -85, -78, 93, -41, -14, -67, 10}, new byte[]{19, -50, -34, 12, -94, -109, -49, 97}), e.b);
            map.put(C0098a.a(new byte[]{105, 59, -19, -87, 110}, new byte[]{13, 94, -127, -4, 13, 65, 42, -19}), RunnableC0203b.b);
            map.put(C0098a.a(new byte[]{-110, 29, 1, 85, -21, -63, -97}, new byte[]{-10, 120, 109, 23, -126, -83, -10, 68}), g.b);
            map.put(C0098a.a(new byte[]{93, -93, -96, -127, -14, -28, -26, 34}, new byte[]{60, -57, -60, -48, -121, -123, -108, 73}), RunnableC0202a.b);
            map.put(C0098a.a(new byte[]{68, 13, 37, -29, -97}, new byte[]{37, 105, 65, -74, -4, 119, 21, 33}), d.b);
            map.put(C0098a.a(new byte[]{105, 62, 69, 49, -83, 118, -100}, new byte[]{8, 90, 33, 100, -50, 34, -22, -41}), c.b);
            map.put(C0098a.a(new byte[]{77, 79, 13, -69, -27, 7, 113, 126}, new byte[]{44, 43, 105, -7, -124, 110, 21, 11}), h.c);
            map.put(C0098a.a(new byte[]{-52, 62, 88, 117, 100, 3}, new byte[]{-83, 90, 60, 52, 8, 106, -63, 85}), f.b);
            map.put(C0098a.a(new byte[]{90, 95, -17, 94, 55, -125, 96}, new byte[]{59, 59, -117, 28, 94, -17, 9, -80}), e.c);
        } catch (Exception e) {
            e = e;
        }
        try {
            map.put(C0098a.a(new byte[]{-58, -104, -67, -72, -74, -79, -50, -114, -41, -119, -83}, new byte[]{-89, -4, -39, -24, -41, -33, -121, -32}), new RunnableC0119e(this, i));
            if (map.containsKey(str)) {
                Runnable runnable = (Runnable) map.get(str);
                runnable.getClass();
                runnable.run();
            } else {
                SpiderDebug.log(C0098a.a(new byte[]{-102, 8, -71, -18, -90, 108, -4, 14, -92, 3, -85, -70, -23}, new byte[]{-49, 102, -46, -128, -55, 27, -110, 46}) + str);
            }
        } catch (Exception e2) {
            e = e2;
            SpiderDebug.log(C0098a.a(new byte[]{30, 115, 55, -19, -103, 125, 18, 47, 15, 40, 121}, new byte[]{118, 18, 89, -119, -11, 24, 89, 74}) + e.getMessage());
        }
    }

    public String action(String str) {
        SpiderDebug.log(C0098a.a(new byte[]{-57, -92, 122, 7, 82, 83, -120, -34}, new byte[]{-90, -57, 14, 110, 61, 61, -78, -2}) + str);
        d(str);
        C0219l.b(C0098a.a(new byte[]{-3, -105, 34, 94, 47, -65, -93, -92, -105, -8, 42, 35}, new byte[]{27, 30, -123, -74, -114, 51, 70, 10}));
        return "";
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        List<k> arrayList = new ArrayList<>();
        if (str2.equals(C0098a.a(new byte[]{-97}, new byte[]{-82, -83, -32, 14, 97, -48, -93, -113}))) {
            arrayList = c();
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        d(str);
        if (str.contains(C0098a.a(new byte[]{-101, 46, -4}, new byte[]{-1, 75, -112, 12, 90, -113, 5, -67})) || str.contains(C0098a.a(new byte[]{-6, 45, 77, -122, -59, 7, -97, -24, -21, 60, 93}, new byte[]{-101, 73, 41, -42, -92, 105, -42, -122}))) {
            try {
                C0219l.b(C0098a.a(new byte[]{107, -21, 17, -94, 46, -126, 114, 107, 1, -124, 25, -33}, new byte[]{-115, 98, -74, 74, -113, 14, -105, -59}));
                Init.getActivity().finish();
            } catch (Exception unused) {
            }
        }
        k kVar = new k(str, C0098a.a(new byte[]{103, 19, 66, 37, -96, -106, -23, -103, 44}, new byte[]{-127, -128, -49, -63, 29, 10, 13, 33}), "", C0098a.a(new byte[]{-110, -14, 44, -3, 47, -122, 5, 113, -59, -112, 28, -76}, new byte[]{123, 119, -95, 26, -110, 40, -19, -33}));
        kVar.j(C0098a.a(new byte[]{76, -91, 70, 100, 8, -67, 18, -2, 8, -59, 116, 0}, new byte[]{-91, 32, -53, -125, -75, 19, -10, 70}));
        kVar.k(C0098a.a(new byte[]{-94, -100, 26, -23, 11, 124, -95}, new byte[]{75, 25, -105, 14, -74, -46, -123, 118}) + str);
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listSingletonList = Collections.singletonList(C0098a.a(new byte[]{55, -39, 73, -82, -24, -68}, new byte[]{84, -74, 39, -56, -127, -37, 90, 81}));
        List listSingletonList2 = Collections.singletonList(C0098a.a(new byte[]{-128, -40, 89, 108, 26, -84, 7, 104, -51, -65, 115, 40, -84, 39, 7, 104, -51, -65, 115, 40, 127, -126, 108, 1, -43, -12, 24, 51, 59, -30, 94, 101}, new byte[]{104, 90, -4, -117, -106, 7, -31, -26}));
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList.add(new C0135a((String) listSingletonList.get(i), (String) listSingletonList2.get(i)));
        }
        return com.github.catvod.spider.merge.c.h.t(arrayList, c());
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.a = context;
    }

    public String playerContent(String str, String str2, List<String> list) {
        return com.github.catvod.spider.merge.c.h.n(C0098a.a(new byte[]{118, -40, 108, 13, -12, 36, 17, 53, 48, -110, 84, 102, -105, 60, 70}, new byte[]{-98, 119, -37, -28, 113, -87, -10, -120}));
    }

    public String searchContent(String str, boolean z) {
        return com.github.catvod.spider.merge.c.h.q(new ArrayList());
    }
}
