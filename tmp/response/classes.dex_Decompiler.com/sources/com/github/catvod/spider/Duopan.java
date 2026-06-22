package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Duopan;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.N.S;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0208a;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Duopan extends WangPan {
    private List<String> g;
    private Context i;
    private String f = C0098a.a(new byte[]{-45, -9, 108, -22, -55, -9, 87, 13, -35, -26, 113, -9, -37, -94, 78, 20, -115, -83, 126, -17, -44}, new byte[]{-69, -125, 24, -102, -70, -51, 120, 34});
    private String h = C0098a.a(new byte[]{-116, 102, -20, 106, 82, -1}, new byte[]{-56, 19, -125, 26, 51, -111, 107, -31});
    private Boolean j = Boolean.FALSE;
    private final String k = C0098a.a(new byte[]{-113, -110, -69, 116, -72, -40, -126, -25, -56, -117, -6, 96, -76, -50, -53, -72, -48, -110, -69, 119, -13, -56, -40, -6, -52}, new byte[]{-96, -5, -43, 16, -35, -96, -84, -105});

    static {
        new OkHttpClient();
    }

    public static void d(Duopan duopan, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        duopan.getClass();
        try {
            if (C0197c.l(str + duopan.k, null).equals(C0098a.a(new byte[]{96, -52}, new byte[]{15, -89, -116, 21, 55, 126, 78, -96})) && atomicReference.compareAndSet(null, str)) {
                countDownLatch.countDown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e() {
        try {
            File file = new File(this.i.getFilesDir(), C0098a.a(new byte[]{111, 51, 119, -38, -126, 17, 58}, new byte[]{65, 64, 31, -69, -16, 116, 94, 61}));
            String strJ = C0208a.j(file);
            if (strJ.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strJ);
            jSONObject.remove(this.h);
            C0208a.n(file, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private Map<String, String> f() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-78, 88, 59, 75, -28, -53, 49, -101, -119, 95}, new byte[]{-25, 43, 94, 57, -55, -118, 86, -2}), C0098a.a(new byte[]{67, 30, 72, -23, -26, 99, -109, -68, 59, 95, 2, -96, -94, 88, -101, -3, 106, 30, 69, -13, -86, 65, -90, -77, 63, 65, 28, -80, -79, 47, -91, -6, 96, 71, 6, -69, -86, 119, -60, -89, 39, 81, 115, -16, -6, 99, -105, -60, 107, 19, 121, -23, -2, 32, -57, -96, 57, 95, 1, -74, -86, 39, -71, -37, 90, 60, 126, -84, -86, 99, -101, -8, 107, 81, 117, -27, -23, 100, -99, -70, 46, 50, 90, -14, -27, 98, -105, -68, 63, 64, 5, -82, -70, 33, -62, -67, 62, 81, 97, -31, -20, 110, -128, -6, 33, 68, 1, -73, -92, 60, -60}, new byte[]{14, 113, 50, -128, -118, 15, -14, -109}));
        map.put(C0098a.a(new byte[]{108, 67, 108, -16, -106, 50, 31}, new byte[]{62, 38, 10, -107, -28, 87, 109, -16}), this.f + C0098a.a(new byte[]{57}, new byte[]{22, -118, -13, -7, 74, 74, 52, -77}));
        return map;
    }

    private String g(h hVar, String str) {
        Iterator itD = C0133t.d(new byte[]{120, 17, -90, -90, -70, 54, 46, -46, 56, 1, -96, -17, -74, 45, 102, -42}, new byte[]{86, 103, -49, -62, -33, 89, 3, -69}, hVar);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (mVar.n0().v0().contains(str)) {
                String strA = C0098a.a(new byte[]{117}, new byte[]{89, 48, -27, -47, -33, 49, -74, -79});
                List<String> listC = mVar.o0(C0098a.a(new byte[]{102}, new byte[]{7, 52, -127, 17, -65, 34, -51, 82})).c();
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) listC).iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) strA);
                    }
                }
                return sb.toString();
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private void h(String str) {
        String str2;
        try {
            File file = new File(this.i.getFilesDir(), C0098a.a(new byte[]{-114}, new byte[]{-96, -93, -16, 81, -54, -70, -39, -19}) + this.h);
            String strJ = C0208a.j(file);
            if (!strJ.isEmpty()) {
                try {
                    if (C0197c.l(strJ + this.k, null).equals(C0098a.a(new byte[]{21, 110}, new byte[]{122, 5, -42, 89, -93, -126, -21, -83}))) {
                        this.f = strJ;
                        return;
                    }
                    e();
                } catch (Exception unused) {
                    e();
                }
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(C0098a.a(new byte[]{-7, -41, -53, 106, -49, 91, -73, 37, -7}, new byte[]{-118, -66, -65, 15, -112, 46, -59, 73}));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
                this.g = arrayList;
                if (arrayList.size() == 1) {
                    str2 = (String) arrayList.get(0);
                    if (!C0197c.l(str2 + this.k, null).equals(C0098a.a(new byte[]{52, 95}, new byte[]{91, 52, 77, -55, 102, -117, -1, -8}))) {
                        return;
                    }
                } else {
                    String fastestUrl = getFastestUrl(arrayList);
                    this.f = fastestUrl;
                    if (fastestUrl != null) {
                        C0208a.n(file, fastestUrl);
                        return;
                    }
                    str2 = (String) this.g.get(0);
                }
                this.f = str2;
            }
        } catch (Exception e) {
            this.f = (String) this.g.get(0);
            System.err.println(C0098a.a(new byte[]{5, 72, -77, 31, -108, 41, -101}, new byte[]{64, 58, -63, 112, -26, 19, -69, 0}) + e.getMessage());
        }
    }

    private String i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(C0098a.a(new byte[]{123, 42, 94, -29, 73, 4, 26, -113, 60, 51, 31, -15, 67, 24, 27, -116, 49, 34, 66, -28, 68, 83, 67, -101, 123}, new byte[]{84, 67, 48, -121, 44, 124, 52, -1}));
        sb.append(URLEncoder.encode(str));
        C0074g c0074gO0 = F.d(C0197c.l(C0133t.b(new byte[]{-50, 26, -38, -76, -28}, new byte[]{-32, 114, -82, -39, -120, -34, -91, 74}, sb), f())).o0(C0098a.a(new byte[]{-24, 77, -74, -28, 105, -53, -26, -120, -75, 69, -72, -14, 127, -49, -82, -52, -78, 69, -76}, new byte[]{-58, 32, -39, -128, 28, -89, -125, -91}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gO0) {
            String strA = mVar.o0(C0098a.a(new byte[]{-16, 49, 52, 75, -98, 85, 67, -97, -80, 33, 50, 2, -109, 95, 15, -110, -69, 53, 125, 78}, new byte[]{-34, 71, 93, 47, -5, 58, 110, -10})).a(C0098a.a(new byte[]{88, 8, 118, 51}, new byte[]{48, 122, 19, 85, -103, -104, -99, -52}));
            String strA2 = mVar.o0(C0098a.a(new byte[]{-65, -110, 114, -79, -100, -62, 20, 87, -1, -126, 116, -8, -111, -56, 88, 90, -12, -106, 59, -76}, new byte[]{-111, -28, 27, -43, -7, -83, 57, 62})).a(C0098a.a(new byte[]{-36, -121, -106, -98, 20}, new byte[]{-88, -18, -30, -14, 113, -110, 77, -54}));
            String strA3 = mVar.o0(C0098a.a(new byte[]{63, 111, 23, 73, -8, -5, 37, 44, 120, 118, 29, 64, -96, -25, 41, 98, 49, 107, 21, 74}, new byte[]{17, 2, 120, 45, -115, -105, 64, 1})).a(C0098a.a(new byte[]{-77, -73, -38, -99, -52, 86, 64, -1}, new byte[]{-41, -42, -82, -4, -31, 37, 50, -100}));
            C0074g c0074gO02 = mVar.o0(C0098a.a(new byte[]{79, 57, -102, -64, -115, 51, -13, -15, 15, 41, -100, -119, -128, 57, -65, -4, 4, 61, -45, -59, -58, 42, -73, -4, 4, 32, -34, -41, -115, 46, -73, -7, 13}, new byte[]{97, 79, -13, -92, -24, 92, -34, -104}));
            j.a(strA, strA2, strA3, !c0074gO02.isEmpty() ? c0074gO02.e().v0() : "", arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (map.get(C0098a.a(new byte[]{-52, 49, 0, 63, -86, -62}, new byte[]{-81, 80, 116, 90, -29, -90, 26, 23})) != null) {
            str = map.get(C0098a.a(new byte[]{-10, -77, 5, 24, 89, 117}, new byte[]{-107, -46, 113, 125, 16, 17, 90, -13}));
        }
        String str7 = "";
        if (map.get(C0098a.a(new byte[]{-103, 97, -15, -62}, new byte[]{-8, 19, -108, -93, 7, 58, 36, -67})) != null) {
            str3 = C0098a.a(new byte[]{-6, 79, -47, -5, -65, -14}, new byte[]{-43, 46, -93, -98, -34, -35, -78, -8}) + map.get(C0098a.a(new byte[]{-99, 87, 56, -68}, new byte[]{-4, 37, 93, -35, -71, 34, -44, -34}));
        } else {
            str3 = "";
        }
        if (map.get(C0098a.a(new byte[]{37, 75}, new byte[]{71, 50, 17, -73, -55, -101, -122, 57})) != null) {
            str4 = C0098a.a(new byte[]{-21, -85, 20, -88}, new byte[]{-60, -55, 109, -121, -117, 85, -73, -67}) + map.get(C0098a.a(new byte[]{-116, 109}, new byte[]{-18, 20, 3, 33, -40, 67, -108, 23}));
        } else {
            str4 = "";
        }
        if (map.get(C0098a.a(new byte[]{126, 21, 75, 46}, new byte[]{7, 112, 42, 92, 11, -118, -118, -103})) != null) {
            str5 = C0098a.a(new byte[]{6, 35, 36, 14, 102, -66}, new byte[]{41, 90, 65, 111, 20, -111, -35, -56}) + map.get(C0098a.a(new byte[]{31, 66, 87, -8}, new byte[]{102, 39, 54, -118, -15, -62, 34, -122}));
        } else {
            str5 = "";
        }
        if (map.get(C0098a.a(new byte[]{63, -31, 18, -121, -51}, new byte[]{92, -115, 115, -12, -66, 14, 63, 9})) != null) {
            str6 = C0098a.a(new byte[]{115, -75, 49, 103, 7, 105, -8}, new byte[]{92, -42, 93, 6, 116, 26, -41, 25}) + map.get(C0098a.a(new byte[]{-24, -10, -76, 104, 94}, new byte[]{-117, -102, -43, 27, 45, -10, 11, -29}));
        } else {
            str6 = "";
        }
        if (map.get(C0098a.a(new byte[]{-4, -3, 86, 26}, new byte[]{-112, -100, 56, 125, 1, -37, 6, -100})) != null) {
            str7 = C0098a.a(new byte[]{8, 90, 15, 49, 73, 24}, new byte[]{39, 54, 110, 95, 46, 55, 7, 99}) + map.get(C0098a.a(new byte[]{-12, -99, -124, -15}, new byte[]{-104, -4, -22, -106, 4, -22, 39, -26}));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        v.a(new byte[]{-12, 107, 76, -77, -100, -116, 118, -4, -77, 114, 13, -95, -106, -112, 119, -1, -77, 109, 85, -8, -112, -112, 119}, new byte[]{-37, 2, 34, -41, -7, -12, 88, -116}, sb, str);
        sb.append(C0098a.a(new byte[]{127, -83, 12, 97, -104, 38}, new byte[]{80, -35, 109, 6, -3, 9, 112, 5}));
        sb.append(str2);
        sb.append(str6);
        sb.append(str3);
        sb.append(str7);
        sb.append(str5);
        sb.append(str4);
        String strB = C0133t.b(new byte[]{12, -20, 116, -21, -38}, new byte[]{34, -124, 0, -122, -74, -6, -40, 34}, sb);
        SpiderDebug.log(C0098a.a(new byte[]{11, 54, -89, 33, -69, 85, 48, 80, 43, 56, -67, 48, -71, 84, 54, 9, 11, 54, -89, 33, -119, 72, 46, 19, 72}, new byte[]{104, 87, -45, 68, -36, 58, 66, 41}) + strB);
        List<k> vodList = parseVodList(l.e(C0197c.l(strB, f())).o0(C0098a.a(new byte[]{-69, 97, 90, -93, -67, -119, 43, 39, -4, 120, 80, -86}, new byte[]{-107, 12, 53, -57, -56, -27, 78, 10})));
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.A(vodList);
        return hVar.toString();
    }

    @Override // com.github.catvod.spider.WangPan
    public String detailContent(List<String> list) {
        String str;
        if (list.get(0).startsWith(C0098a.a(new byte[]{-95, 35, -91, -19}, new byte[]{-55, 87, -47, -99, 104, -27, -31, -110}))) {
            str = list.get(0);
        } else {
            str = this.f + list.get(0);
        }
        h hVarE = l.e(C0197c.l(str, f()));
        k kVar = new k();
        List<String> listB = hVarE.o0(C0098a.a(new byte[]{-96, -113, -113, -69, -46, -3, -116, -38, -4, -115, -105, -14, -45, -12, -111, -125}, new byte[]{-114, -30, -32, -33, -89, -111, -23, -9})).b(C0098a.a(new byte[]{-43, 63, 104, 25, -13, 3, -128, 12, -63, 60, 115, 25, -84, 4, -63, 17, -44, 38, 104}, new byte[]{-79, 94, 28, 120, -34, 96, -20, 101}));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String strV0 = S.a(C0098a.a(new byte[]{-128, 100, 94, -45, -125, -25, -72, 74, -64, 116, 88, -102, -114, -19, -12, 71, -53, 96, 23, -119, -58, -90, -27, 66, -55, 119, 26, -61, -113, -4, -7, 70}, new byte[]{-82, 18, 55, -73, -26, -120, -107, 35}), hVarE).v0();
        int i = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) listB;
            if (i >= arrayList5.size()) {
                break;
            }
            if (WangPan.c.matcher((CharSequence) arrayList5.get(i)).find() && arrayList.size() < 2) {
                arrayList.add((String) arrayList5.get(i));
            }
            if (WangPan.b.matcher((CharSequence) arrayList5.get(i)).find() && arrayList2.size() < 2) {
                arrayList2.add((String) arrayList5.get(i));
            }
            if (WangPan.e.matcher((CharSequence) arrayList5.get(i)).find() && arrayList3.size() < 2) {
                arrayList3.add((String) arrayList5.get(i));
            }
            i++;
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList2);
        arrayList6.addAll(arrayList);
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList4);
        kVar.j(detailContentVodPlayFrom(arrayList6));
        kVar.k(detailContentVodPlayUrlWithVodName(arrayList6, strV0));
        String strC = S.a(C0098a.a(new byte[]{70, -16, -72, -97, -127, -11, -24, -61, 1, -23, -78, -106, -39, -23, -28, -115, 72, -12, -70, -100}, new byte[]{104, -99, -41, -5, -12, -103, -115, -18}), hVarE).c(C0098a.a(new byte[]{91, -7, -37, -10, 55, 68, 126, 45}, new byte[]{63, -104, -81, -105, 26, 55, 12, 78}));
        String strV02 = hVarE.o0(C0098a.a(new byte[]{-32, -58, 4, 106, 119, -2, -36, -99, -96, -42, 2, 35, 122, -12, -112, -112, -85, -62, 77, 111, 60, -27, -112, -109, -29, -36, 4, 96, 121}, new byte[]{-50, -80, 109, 14, 18, -111, -15, -12})).f().v0();
        String strA = C0098a.a(new byte[]{117}, new byte[]{89, 92, 73, -76, -113, 117, 67, 104});
        List<String> listC = hVarE.o0(C0098a.a(new byte[]{-3, 57, -35, 12, -83, 14, -40, -29, -67, 41, -37, 69, -96, 4, -108, -18, -74, 61, -108, 12, -95, 23, -37, -2, -78, 40, -103, 4, -95, 15, -98, -86, -78}, new byte[]{-45, 79, -76, 104, -56, 97, -11, -118})).c();
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) listC).iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) strA);
            }
        }
        String string = sb.toString();
        String strA2 = i.a(new byte[]{-98, 26, 106, 86, 39, 93, -56, -111}, new byte[]{-18, 52, 25, 39, 77, 55, -105, -16}, hVarE);
        String strG = g(hVarE, C0098a.a(new byte[]{-48, 60, -44, -76, -88, 45}, new byte[]{53, -109, 104, 82, 20, -71, -9, 12}));
        String strG2 = g(hVarE, C0098a.a(new byte[]{-101, -77, 72, 48, -74, -99}, new byte[]{127, 11, -13, -42, 10, 9, -75, 44}));
        String strG3 = g(hVarE, C0098a.a(new byte[]{-47, -20, -29, 3, -106, 31}, new byte[]{52, 85, 87, -25, 45, -68, -35, 93}));
        String strG4 = g(hVarE, C0098a.a(new byte[]{-31, -64, -93, -35, 47, 115}, new byte[]{4, 100, 36, 59, -100, -37, 63, 64}));
        kVar.g(list.get(0));
        kVar.i(strC);
        kVar.n(strG3);
        kVar.h(strV0);
        kVar.d(strV02);
        kVar.c(strG2);
        kVar.l(strG4);
        kVar.e(strA2);
        kVar.f(strG);
        kVar.b(string);
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public Boolean getDanmu() {
        return this.j;
    }

    public String getFastestUrl(List<String> list) {
        final AtomicReference atomicReference = new AtomicReference(null);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        for (final String str : list) {
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.o.k
                @Override // java.lang.Runnable
                public final void run() {
                    Duopan.d(this.a, str, atomicReference, countDownLatch);
                }
            }).start();
        }
        try {
            countDownLatch.await();
            String str2 = (String) atomicReference.get();
            SpiderDebug.log(C0098a.a(new byte[]{-74, -113, 69, 103, -71, 50, 13, -97, -91, -68, 122, 41, -4}, new byte[]{-16, -18, 54, 19, -36, 65, 121, -65}) + ((String) atomicReference.get()));
            return str2;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVarE = l.e(C0197c.l(this.f, f()));
        Iterator itD = C0133t.d(new byte[]{2, -91, -57, -11, -5, 83, -35, -88, 30, -67, -116, -1, -6, 26, -121, -91, 27, -96, -55, -84, -87, 91}, new byte[]{119, -55, -23, -110, -119, 58, -71, -123}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (mVar.c(C0098a.a(new byte[]{100, -98, -8, 108}, new byte[]{12, -20, -99, 10, 29, -52, 0, 6})).startsWith(C0098a.a(new byte[]{55, -103, 31, -92, 127, 14, 15, 87, 112, -128, 94, -74, 117, 18}, new byte[]{24, -16, 113, -64, 26, 118, 33, 39}))) {
                if (arrayList.size() >= 7) {
                    break;
                }
                arrayList.add(new C0135a(mVar.c(C0098a.a(new byte[]{-94, -75, 26, -8}, new byte[]{-54, -57, 127, -98, 57, 73, 47, 42})).replaceAll(C0098a.a(new byte[]{-66, -28, -82}, new byte[]{-30, -96, -123, 13, 20, -67, -56, -5}), ""), mVar.c(C0098a.a(new byte[]{19, -16, -16, -40, 61}, new byte[]{103, -103, -124, -76, 88, 95, -81, -51}))));
            }
        }
        return com.github.catvod.spider.merge.c.h.v(arrayList, parseVodList(hVarE.o0(C0098a.a(new byte[]{84, 4, -13, 42, 16, 97, -104, 63, 19, 29, -7, 35}, new byte[]{122, 105, -100, 78, 101, 13, -3, 18}))), new JSONObject(oZP.d("0E4D4663560E0E4D1C2415774F4D142018303C0B556D4E3B14021263567792DECCA4F2DE574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D01635677444D0A6D17771B4D4D638BF2E48ACEFA8BDCF24D5B631A774F4D416311790E4D1963567792E7C6A7EFD092E6F0634077034D4D635B7708430C6302774F4D91C9F4B1CFE690C8EB77594D016356774D4D0A6D17771B4D4D638AD4E589F7D78BDCF24D5B631A774F4D4E6311790E4D196356779CC4EFA6CCD492E6F0634077034D4D635D6557125B3A4E3B575555A4E6FD92FBCCA6E5D2574355374E6F575E466311790E4D1963567790E5DFA5D1C992E6F0634077034D4D635D6757122A3C402E570412384E6F570C1B201F265743552F0D38104D4D6389DCD289F4C44E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E285914552F4E6F578AE1DD89DCD24D5B631A774F4D92D7F0B0FCC8553C402E5701557B4EB2FDDE91C2E977594D0163567792E7C6A7EFD057125B3A4E3B575555A7EDC593EFE1634077034D4D638AD4E589F7D74E285914552F4E6F578AFDE988E8E94D5B631A774F4D92CBC4B1C8F3553C402E5701557B4EB2D2FE92F8D777594D0163567792C8E6A4D5EE57125B3A4E3B575555A4E5F293ECF2634077034D4D6389DCD289F4C44E285914552F4E6F5789FFD988EFFC4D5B631A774F4D91C9F4B1CFE6553C402E5701557B4EBDD8C992CDC677594D016356779DC2D1A4E0FF57125B3A4E3B575555A6E6FA92D2DD634077034D4D638BDFDA88CAEB4E285914552F4E6F578AFDE98BC1CE4D5B631A774F4D92CBC4B2E1D4553C402E5701557B4EB0D0E892F8D777594D0163567790CAF0A4D5EE57125B3A4E3B575555A7C1F391D1D7634077034D4D638AF8D38BC9E14E285914552F4E6F578AF1D385CCDC4D5B631A774F4D92C7FEBCECC6553C402E5701557B4EB3EBC591C9F477594D0163567793F1DDA7E4CD57125B3A4E3B575555A7EEF992F9E6634077034D4D638AD7D988E1D04E285914552F4E6F5789F4CB8AD7EF4D5B631A774F4D91C2E6B3F7F5553C402E5701557B4EB2CEE092C4D477594D0163567792D4F8A4E9ED57122A3C402E570412384E6F570E05240D77594D19200130575555A4F0E590E3CD634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E235755556311790E4D1963567790CBD0A8F5D3574355374E6F578AD3E685CCF34D0A6D17771B4D4D6385F3EC89CFEE4E795719557B4EBCD3F691F9C37708430C6302774F4D92CEDCB3CCD1556D4E23575555A4E3E593D6C96311790E4D1963567792D1F9A4F7E8574355374E6F5788C9CF89CEC84D0A6D17771B4D4D638AE6E08AECFC4E795719557B4EB3C6FA92DAD17708430C6302774F4D9FCADDB0EED2556D4E23575555A9E7E490F4CA6311790E4D1963567793F8D2A7F0F9574355374E6F5789E0E48AC9D94D0A6D17771B4D4D6385CADC8AECFC4E795719557B4EBCEAC692DAD17708430C6302774F4D92FFDBB0EED2556D4E23575555A4D2E290F4CA6311790E4D1963567793DCC7A4F7E8574355374E6F5789C4F189CEC84D0A6D17771B4D4D6389D8C58ACDE74E795719557B4EB0F8DF92FBCA7708430C6302774F4D91C5E3B0D1C892C9C577594D0163567793EBF8A4C8F290E7DE6311790E4D196356779DCAC8A6E3F892E6EE634077034D4D6384F0CA88F8EC8BDCEC4D0A6D17771B4D4D6389DFD589FCFE89F1D24D5B631A774F4D92CBCCB3FED092E5CB7708430C6302774F4D92C4DAB1CEF9556D4E23575555A4E9E391D4E163110808430C6307300C4D4D631530141D556D4E3B14021263567790D6C3A5D7E8574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555735C67404D5B631A774F4D45715E6057125B3A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F8C1A8FBE1574355374E6F571B1E2C097708430C6302774F4D93FBD6B3C5FB556D4E23575555290521064D0A6D17771B4D4D6384FAF18AFFC74E795719557B4E26160005244E2828122A6D4E6757552C3A4E3E1016557B4E36141B12080877594D19200130575555A6DDEE90F1FC634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E23575555734E285914552F4E6F578AECFC88EFD28AFEE64E795719557B4E64464D0A6D17771B4D4D638AC2D086E8E889DCD24D5B631A774F4D46754E285914552F4E6F5789DBE68BEBFB8AFEE64E795719557B4E64404D0A6D17771B4D4D638AEDDA8AF8F189DCD24D5B631A774F4D46774E2828125B3A4E3E1016557B4E36190E04324E795701162C09774F4D92C8CBB3F6EA556D4E23140302244E6F2E14552F4E6F578AF2E985D6DD4D5B631A774F4D553C402E5701557B4EB0FACB9FE2E977594D0163567790E0D3A9CFD057125B3A4E3B575555A7E4CD91D5FE634077034D4D638ADDED8BCDC84E285914552F4E6F5786EAD38ACDD08AF6F789D6FA4D5B631A774F4D9EDCFEB3EDCA92C0DAB0F6E0553C402E5701557B4EB0E3F392C8CB77594D0163567790F9EBA4E5F257125B3A4E3B575555A4C2E390D5DA634077034D4D6389FBC38ACDEC4E285914552F4E6F5788FDEE8BE8DF4D5B631A774F4D90CBC3B2C8C5553C402E5701557B4EB0FFC793FCF077594D0163567790E5DFA5D1C957125B3A4E3B575555A4C9D290D6CC634077034D4D6389F0F28ACEFA4E285914552F4E6F578AFEE68AD6F04D5B631A774F4D92C8CBB3F6EA553C402E5701557B4EB0FBE992CEDE77594D0163567790E1F1A4E3E757125B3A4E3B575555A6D7DA90EACF634077034D4D638BEEFA8AF2F94E285914552F4E6F578BCEE08AC8E44D5B631A774F4D93F8CDB3E8FE553C402E5701557B4EB3F6EA91D8C377594D0163567793ECF2A7F5FA57125B3A4E3B575555A4F9D393E7EF634077034D4D6389C0F389FFD94E285914552F4E6F5788CAD089DCD24D5B631A774F4D90FCFDB0FCC8553C402E5701557B4EB0F0D993FAFA77594D0163567790EAC1A5D7C357122A3C402E570412384E6F570E05240D77594D19200130575555A4F0E590E3CD634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E235755556311790E4D1963567790CBD0A8F5D3574355374E6F578AD3E685CCF34D0A6D17771B4D4D6385F3EC89CFEE4E795719557B4EBCD3F691F9C37708430C6302774F4D92CEDCB3CCD1556D4E23575555A4E3E593D6C96311790E4D1963567792D1F9A4F7E8574355374E6F5788C9CF89CEC84D0A6D17771B4D4D638AC2D089EBED4E795719557B4EB3E2CA91DDC07708430C6302774F4D9EDEC5B0EED2556D4E23575555A8F3FC90F4CA6311790E4D1963567793DCC7A4F7E8574355374E6F5789C4F189CEC84D0A6D17771B4D4D6384DEC48AECFC4E795719557B4EBDFEDE92DAD17708430C6302774F4D91D7DCB0FFCF92DCCD77594D0163567793F9C7A4E6F590F2D66311790E4D1963567790EAC1A5D7C3574355374E6F578AF2F788EEE34D0A1C11790E4D1C2415774F4D0E240D275743552F0D38104D4D6389ECC18BCCFC4E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E285914552F4E6F575D47735977594D01635677475F45744E285914552F4E6F575D47735877594D01635677475F45754E285914552F4E6F575D47735F77594D01635677475F45724E285914552F4E6F575D47735E77594D01635677475F45734E285914552F4E6F575D47735D77594D01635677475F45704E285914552F4E6F575D47735C77594D01635677475F45714E285914552F4E6F575D47705577594D01635677475F46784E285914552F4E6F575D47705477594D01635677475F46794E285914552F4E6F575D47705B77594D01635677475F46764E285914552F4E6F575D47705A77594D01635677475F46774E285914552F4E6F575D47705977594D01635677475F46744E285914552F4E6F575D47705877594D01635677475F46754E285914552F4E6F575D47705F77594D01635677475F46724E285914552F4E6F575D47705E77594D01635677475F46734E285914552F4E6F575D47705D77594D01635677475F46704E285914552F4E6F575D47705C77594D01635677475F46714E2828125B3A4E3E1016557B4E370C4D5B630234180A557B4EB3FBFD92FBE377594D01200020104D4D1A17771B4D4D638AC2C386E0F54E795719557B4E211C02126311790E4D1963567791D5CDA7DCC1574355374E6F57071E351F7708430C6302774F4D9FEEE8B0FDE9556D4E23575555320F3A070A553C3128284355724E6F2E14552A092C575555220D211026136340771B0E1A244E6F5788C6FA89CBFE4D5B631A34191A1263560E0E4D1963567790EADFA8EFFD574355374E6F575C553C402E5701557B4EB3E2CA9EDEC577594D01635677475D553C402E5701557B4EB0EED293FBCB77594D01635677475F553C402E5701557B4EB3D9C890FFE277594D01635677475E553C31285914552A092C575555380934074D5B630234180A557B4EB0CCDB93FAD177594D01200020104D4D1A17771B4D4D6389D0DD86F4E94E795719557B4E7708430C6302774F4D45715E60574355374E6F575D4773597708430C6302774F4D45715E61574355374E6F575D4773587708430C6302774F4D45715E66574355374E6F575D47735F7708430C6302774F4D45715E67574355374E6F575D47735E7708430C6302774F4D45715E64574355374E6F575D47735D7708430C6302774F4D45715E65574355374E6F575D47735C7708430C6302774F4D45715D6C574355374E6F575D4770557708430C6302774F4D45715D6D574355374E6F575D4770547708430C6302774F4D45715D62574355374E6F575D47705B7708430C6302774F4D45715D63574355374E6F575D47705A7708430C6302774F4D45715D60574355374E6F575D4770597708430C6302774F4D45715D61574355374E6F575D4770587708430C6302774F4D45715D66574355374E6F575D47705F7708430C6302774F4D45715D67574355374E6F575D47705E7708430C6302774F4D45715D64574355374E6F575D47705D7708430C6302774F4D45715D65574355374E6F575D47705C7708430C6302774F4D45715C6C574355374E6F575D4771557708430C6302774F4D45715C6D574355374E6F575D4771547708430C6302774F4D45715C62574355374E6F575D47715B7708430C6302774F4D45715C63574355374E6F575D47715A7708430C6302774F4D45715C60574355374E6F575D4771597708430C6302774F4D45715C61574355374E6F575D4771587708320A6D17771E0A0E6356771716556D4E3B14021263567793E1E5A4D6DA574355370D39000A557B372E5701557B4EB3E2D99ED6D877594D0163567701061A244E285914552F4E6F578BCDFB8AE5E14D5B631A774F4D1F28182657125B3A4E3B575555A9C3D190E7F1634077034D4D631F361A1D1263110808325B6358774F340C6307300C4D4D630D27100E556D4E3B14021263567790F3C7A4E0EF574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555A4C8F29CF6F1634077034D4D6389F1D286EEC74E285914552F4E6F5789E0E48AC9D94D5B631A774F4D91D6C9B3E9C3553C402E5701557B4EB3D9C890FFE277594D0163567793C3D0A6D2DB57125B3A4E3B575555A4E9E391D4E1634077034D4D6389D0C38BCCD74E2828125B3A4E3E1016557B4E2C100E056340771B0E1A244E6F578ACEF588EEC84D5B631A34191A1263560E0E4D1963567790EADFA8EFFD574355374E6F574D0A6D17771B4D4D635E65475A556D4E23575555735C67404D0A6D17771B4D4D635E65475B556D4E23575555735C67414D0A6D17771B4D4D635E65475C556D4E23575555735C67464D0A6D17771B4D4D635E65475D556D4E23575555735C67474D0A6D17771B4D4D635E65475E556D4E23575555735C67444D0A6D17771B4D4D635E65475F556D4E23575555735C67454D0A6D17771B4D4D635E654456556D4E23575555735C644C4D0A6D17771B4D4D635E654457556D4E23575555735C644D4D0A6D17771B4D4D635E654458556D4E23575555735C64424D0A6D17771B4D4D635E654459556D4E23575555735C64434D0A6D17771B4D4D635E65445A556D4E23575555735C64404D0A6D17771B4D4D635E65445B556D4E23575555735C64414D0A6D17771B4D4D635E65445C556D4E23575555735C64464D0A6D17771B4D4D635E65445D556D4E23575555735C64474D0A6D17771B4D4D635E65445E556D4E23575555735C64444D0A6D17771B4D4D635E65445F556D4E23575555735C64454D0A6D17771B4D4D635E654556556D4E23575555735C654C4D0A6D17771B4D4D635E654557556D4E23575555735C654D4D0A6D17771B4D4D635E654558556D4E23575555735C65424D0A6D17771B4D4D635E654559556D4E23575555735C65434D0A6D17771B4D4D635E65455A556D4E23575555735C65404D0A6D17771B4D4D635E65455B556D4E23575555735C65414D0A1C11790E4D1C2415774F4D15384E795701162C09774F4D91CFFEB0CFE0556D4E23140302244E6F2E14552F4E6F5789E0F785C2C14D5B631A774F4D0328013057125B3A4E3B575555A5D6EF93DFE3634077034D4D63043C011C553C402E5701557B4EBDDAEB92C9EA77594D01635677060C1833097708320A1C4077404D4D1A17771E0A0E6356770C0A16334E795701162C09774F4D92F8D8B1CED2556D4E23140302244E6F2E14552F4E6F578AF2E985D6DD4D5B631A774F4D553C402E5701557B4E67455D42634077034D4D635E65475A553C402E5701557B4E67455D43634077034D4D635E65475B553C402E5701557B4E67455D44634077034D4D635E65475C553C402E5701557B4E67455D45634077034D4D635E65475D553C402E5701557B4E67455D46634077034D4D635E65475E553C402E5701557B4E67455D47634077034D4D635E65475F553C402E5701557B4E67455E4E634077034D4D635E654456553C402E5701557B4E67455E4F634077034D4D635E654457553C402E5701557B4E67455E40634077034D4D635E654458553C402E5701557B4E67455E41634077034D4D635E654459553C402E5701557B4E67455E42634077034D4D635E65445A553C402E5701557B4E67455E43634077034D4D635E65445B553C402E5701557B4E67455E44634077034D4D635E65445C553C402E5701557B4E67455E45634077034D4D635E65445D553C402E5701557B4E67455E46634077034D4D635E65445E553C402E5701557B4E67455E47634077034D4D635E65445F553C31285914552A092C575555231577594D19200130575555A7E2C790D5F8634077030E1B3409774F340C6302774F4D91D6DABCE2DB556D4E23575555350538104D0A6D17771B4D4D6388EFCF89C7D54E795719557B4E3D1C1B046311790E4D196356779DC0F3A4E4D3574355374E6F571C142E1E3057122A3C3179575D4163560E0E4D1C2415774F4D142018303C0B556D4E3B14021263567792DECCA4F2DE574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D016356774759553C402E5701557B4EBCDEF792C9EAB2E1DA92FCDD77594D016356774756553C402E5701557B4EBCDEF792C9EAB0FCC89EDAEA77594D016356774758553C402E5701557B4EBCDEF792C9EAB0D1F992C8CB77594D01635677465F553C402E5701557B4EB0EED291FDC7B1CCE492C4E577594D016356774757553C31285914552A092C575555380934074D5B630234180A557B4EB0CCDB93FAD177594D01200020104D4D1A17771B4D4D6389D0DD86F4E94E795719557B4E7708430C6302774F4D45715E60574355374E6F575D4773597708430C6302774F4D45715E61574355374E6F575D4773587708430C6302774F4D45715E66574355374E6F575D47735F7708430C6302774F4D45715E67574355374E6F575D47735E7708430C6302774F4D45715E64574355374E6F575D47735D7708430C6302774F4D45715E65574355374E6F575D47735C7708430C6302774F4D45715D6C574355374E6F575D4770557708430C6302774F4D45715D6D574355374E6F575D4770547708430C6302774F4D45715D62574355374E6F575D47705B7708430C6302774F4D45715D63574355374E6F575D47705A7708430C6302774F4D45715D60574355374E6F575D4770597708430C6302774F4D45715D61574355374E6F575D4770587708430C6302774F4D45715D66574355374E6F575D47705F7708430C6302774F4D45715D67574355374E6F575D47705E7708430C6302774F4D45715D64574355374E6F575D47705D7708430C6302774F4D45715D65574355374E6F575D47705C7708430C6302774F4D45715C6C574355374E6F575D4771557708430C6302774F4D45715C6D574355374E6F575D4771547708430C6302774F4D45715C62574355374E6F575D47715B7708430C6302774F4D45715C63574355374E6F575D47715A7708430C6302774F4D45715C60574355374E6F575D4771597708430C6302774F4D45715C61574355374E6F575D4771587708320A6D17771E0A0E6356771716556D4E3B14021263567793E1E5A4D6DA574355370D39000A557B372E5701557B4EB3E2D99ED6D877594D0163567701061A244E285914552F4E6F578BCDFB8AE5E14D5B631A774F4D1F28182657125B3A4E3B575555A9C3D190E7F1634077034D4D631F361A1D1263110808320A")));
    }

    @Override // com.github.catvod.spider.WangPan
    public void init(Context context, String str) {
        this.i = context;
        try {
            if (!str.isEmpty()) {
                if (str.startsWith(C0098a.a(new byte[]{43, -87, 70, 7}, new byte[]{67, -35, 50, 119, -31, 112, 40, 75}))) {
                    if (C0197c.l(str + this.k, null).equals(C0098a.a(new byte[]{20, -109}, new byte[]{123, -8, 101, 7, -119, 0, 113, -83}))) {
                        this.f = str;
                    }
                }
                if (str.startsWith(C0098a.a(new byte[]{-1}, new byte[]{-124, 35, 112, -104, 107, -125, 28, -124}))) {
                    context.getFilesDir();
                    JSONObject jSONObjectW = C0207D.w(str);
                    if (jSONObjectW.has(C0098a.a(new byte[]{-91, -91, 79, -72}, new byte[]{-42, -52, 59, -35, -87, -74, -115, 100}))) {
                        String string = jSONObjectW.getString(C0098a.a(new byte[]{8, 2, -23, -11}, new byte[]{123, 107, -99, -112, 16, 102, 35, -126}));
                        if (C0197c.l(string + this.k, null).equals(C0098a.a(new byte[]{28, 12}, new byte[]{115, 103, 86, -7, -47, 67, -68, -16}))) {
                            this.f = string;
                        }
                    }
                    if (jSONObjectW.has(C0098a.a(new byte[]{-123, 123, -29, 7, -31}, new byte[]{-31, 26, -115, 106, -108, -82, -21, 54}))) {
                        this.j = Boolean.valueOf(jSONObjectW.getBoolean(C0098a.a(new byte[]{-64, -110, 114, -41, 81}, new byte[]{-92, -13, 28, -70, 36, -54, -112, -31})));
                    }
                    if (jSONObjectW.has(C0098a.a(new byte[]{83, -97, -74, -76, 70, -46, -96}, new byte[]{38, -19, -38, -21, 45, -73, -39, 5}))) {
                        this.h = jSONObjectW.getString(C0098a.a(new byte[]{110, 88, 28, 117, 1, 18, 0}, new byte[]{27, 42, 112, 42, 106, 119, 121, 111}));
                    }
                    if (jSONObjectW.has(C0098a.a(new byte[]{-101, 86, -39, -66, -26, 68, -81, 24, -101}, new byte[]{-24, 63, -83, -37, -71, 49, -35, 116}))) {
                        h(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        SpiderDebug.log(C0098a.a(new byte[]{-8, -92, 23, -55, 110, -82, -124}, new byte[]{-68, -47, 120, -71, 15, -64, -92, -99}) + this.h + C0098a.a(new byte[]{80, 45}, new byte[]{106, 13, -101, -111, -120, 90, 126, -2}) + this.f);
    }

    public List<k> parseVodList(C0074g c0074g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074g) {
            j.a(mVar.o0(C0098a.a(new byte[]{-102, -45, 121, 11, 29, 30, 20, 17, -35, -54, 115, 2, 69, 6, 24, 72, -40, -37, 116, 0, 16, 82, 79, 93}, new byte[]{-76, -66, 22, 111, 104, 114, 113, 60})).a(C0098a.a(new byte[]{-8, -35, 19, 24}, new byte[]{-112, -81, 118, 126, -89, -60, -2, -84})), mVar.o0(C0098a.a(new byte[]{-10, 39, 103, 62, -100, 101, -72, 4, -79, 62, 109, 55, -60, 125, -76, 93, -76, 47, 106, 53, -111, 41, -29, 72}, new byte[]{-40, 74, 8, 90, -23, 9, -35, 41})).a(C0098a.a(new byte[]{108, -17, 94, -3, -91}, new byte[]{24, -122, 42, -111, -64, -47, 37, 12})), mVar.o0(C0098a.a(new byte[]{101, 41, 14, -51, 31, -38, 70, -123, 34, 48, 4, -60, 71, -58, 74, -53, 107, 45, 12, -50}, new byte[]{75, 68, 97, -87, 106, -74, 35, -88})).a(C0098a.a(new byte[]{91, -19, -113, -44, 11, 12, -25, 121}, new byte[]{63, -116, -5, -75, 38, 127, -107, 26})), y.b(new byte[]{49, 51, 106, -98, 1, 48, 114, 124, 118, 42, 96, -105, 89, 40, 114, 41, 107}, new byte[]{31, 94, 5, -6, 116, 92, 23, 81}, mVar), arrayList);
        }
        return arrayList;
    }

    public String searchContent(String str, boolean z) {
        C0098a.a(new byte[]{77}, new byte[]{124, -48, 47, -49, -2, 93, 25, 116});
        return i(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return i(str);
    }

    public void setDanmu(Boolean bool) {
        this.j = bool;
    }
}
