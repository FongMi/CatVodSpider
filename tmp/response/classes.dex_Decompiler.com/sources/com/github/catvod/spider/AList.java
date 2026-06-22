package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0132s;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.C0136b;
import com.github.catvod.spider.merge.c.C0137c;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.i;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.e.C0152a;
import com.github.catvod.spider.merge.e.C0154c;
import com.github.catvod.spider.merge.e.C0157f;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class AList extends Spider {
    private List<C0152a> a;
    private String b;
    private String c;

    class Job implements Callable<List<k>> {
        private final C0152a a;
        private final String b;

        public Job(C0152a c0152a, String str) {
            this.a = c0152a;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
        @Override // java.util.concurrent.Callable
        public List<k> call() {
            ArrayList arrayListEmptyList;
            try {
                arrayListEmptyList = new ArrayList();
                AList aList = AList.this;
                C0152a c0152a = this.a;
                for (C0154c c0154c : C0154c.a(AList.c(AList.this, this.a.l(), AList.b(aList, c0152a, c0152a.p(), this.a.n(this.b))))) {
                    if (!c0154c.j(this.a.l())) {
                        arrayListEmptyList.add(c0154c.g(this.a, AList.this.b));
                    }
                }
            } catch (Exception unused) {
                arrayListEmptyList = Collections.emptyList();
            }
            if (arrayListEmptyList.size() <= 0) {
                arrayListEmptyList = new ArrayList();
                C0152a c0152a2 = this.a;
                String str = this.b;
                StringBuilder sb = new StringBuilder();
                sb.append(c0152a2.f());
                v.a(new byte[]{-57, -106, -123, 35, 107, -65, -63, 5, -118, -118, -104, 127}, new byte[]{-24, -27, -32, 66, 25, -36, -87, 58}, sb, str);
                sb.append(C0098a.a(new byte[]{5, -26, 106, 52, -69, 35, -19, 46, 83, -10, 37, 46, -17, 97, -4, 56}, new byte[]{35, -109, 24, 88, -122, 5, -103, 87}));
                Iterator itD = C0133t.d(new byte[]{-77, 93, -24, -128, -26, -54}, new byte[]{-58, 49, -56, -66, -58, -85, -87, -61}, l.e(C0197c.l(sb.toString(), null)));
                while (itD.hasNext()) {
                    String[] strArrSplit = ((m) itD.next()).v0().split(C0098a.a(new byte[]{-16}, new byte[]{-45, -46, -64, -106, -8, 57, -108, 118}));
                    if (strArrSplit[0].contains(C0098a.a(new byte[]{51}, new byte[]{28, -22, -30, 76, 113, 91, -92, 9}))) {
                        int iLastIndexOf = strArrSplit[0].lastIndexOf(C0098a.a(new byte[]{-72}, new byte[]{-105, -81, -90, -54, 57, -86, -107, 71}));
                        boolean zContains = C0207D.b.contains(C0207D.f(strArrSplit[0]));
                        C0154c c0154c2 = new C0154c();
                        c0154c2.p(!zContains ? 1 : 0);
                        c0154c2.o(strArrSplit.length > 3 ? strArrSplit[4] : "");
                        c0154c2.n(C0098a.a(new byte[]{25}, new byte[]{54, -21, -19, 36, 2, 81, -6, -95}) + strArrSplit[0].substring(0, iLastIndexOf));
                        c0154c2.m(strArrSplit[0].substring(iLastIndexOf + 1));
                        arrayListEmptyList.add(c0154c2.g(this.a, AList.this.b));
                    }
                }
            }
            return arrayListEmptyList;
        }
    }

    static String b(AList aList, C0152a c0152a, String str, String str2) {
        return aList.j(c0152a, str, str2, true);
    }

    static String c(AList aList, boolean z, String str) throws JSONException {
        String strA;
        JSONObject jSONObject;
        aList.getClass();
        if (z) {
            jSONObject = new JSONObject(str).getJSONObject(C0098a.a(new byte[]{41, 51, 48, 24}, new byte[]{77, 82, 68, 121, -30, -102, -93, 37}));
            strA = C0098a.a(new byte[]{93, 108, 38, -17, 100, -77, 29}, new byte[]{62, 3, 72, -101, 1, -35, 105, 78});
        } else {
            JSONObject jSONObject2 = new JSONObject(str);
            strA = C0098a.a(new byte[]{-83, 103, -42, 116}, new byte[]{-55, 6, -94, 21, -3, 1, 1, -52});
            jSONObject = jSONObject2;
        }
        return jSONObject.getJSONArray(strA).toString();
    }

    private void d() {
        List<C0152a> list = this.a;
        if (list == null || list.isEmpty()) {
            if (this.c.startsWith(C0098a.a(new byte[]{-120, 98, -4, 26}, new byte[]{-32, 22, -120, 106, -110, 107, 63, 87}))) {
                this.c = C0197c.l(this.c, null);
            }
            C0152a c0152a = (C0152a) C0132s.a(this.c, C0152a.class);
            this.a = c0152a.d();
            this.b = c0152a.j();
        }
    }

    private C0154c e(String str) {
        try {
            String strSubstring = str.contains(C0098a.a(new byte[]{-73}, new byte[]{-104, 110, -109, 29, -107, 91, -2, 17})) ? str.substring(0, str.indexOf(C0098a.a(new byte[]{-97}, new byte[]{-80, 83, 61, -45, 59, -89, 113, -99}))) : str;
            String strSubstring2 = str.contains(C0098a.a(new byte[]{-63}, new byte[]{-18, 50, 37, -79, 31, -86, -49, 81})) ? str.substring(str.indexOf(C0098a.a(new byte[]{121}, new byte[]{86, -75, -12, 45, -112, -66, 8, -92}))) : "";
            C0152a c0152aG = g(strSubstring);
            if (!strSubstring2.startsWith(c0152aG.i())) {
                strSubstring2 = c0152aG.i() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-126, -53, 114, 95}, new byte[]{-14, -86, 6, 55, 2, -46, 31, -88}), strSubstring2);
            jSONObject.put(C0098a.a(new byte[]{-99, -59, -9, -38, -106, 21, 9, 14}, new byte[]{-19, -92, -124, -87, -31, 122, 123, 106}), c0152aG.b(strSubstring2));
            return (C0154c) new Gson().fromJson(f(c0152aG.l(), j(c0152aG, c0152aG.c(), jSONObject.toString(), true)), C0154c.class);
        } catch (Exception unused) {
            return new C0154c();
        }
    }

    private String f(boolean z, String str) {
        return (z ? new JSONObject(str).getJSONObject(C0098a.a(new byte[]{-16, -104, -15, 93}, new byte[]{-108, -7, -123, 60, -26, -64, 80, 105})) : new JSONObject(str).getJSONObject(C0098a.a(new byte[]{59, 41, -126, -112}, new byte[]{95, 72, -10, -15, -68, 83, -50, -72})).getJSONArray(C0098a.a(new byte[]{37, -2, 99, -59, 3}, new byte[]{67, -105, 15, -96, 112, 5, 92, 69})).getJSONObject(0)).toString();
    }

    private C0152a g(String str) {
        List<C0152a> list = this.a;
        C0152a c0152a = list.get(list.indexOf(new C0152a(str)));
        c0152a.a();
        return c0152a;
    }

    private List<C0154c> h(String str, boolean z) {
        try {
            String strSubstring = str.contains(C0098a.a(new byte[]{101}, new byte[]{74, -111, -117, -114, 23, 8, 57, 84})) ? str.substring(0, str.indexOf(C0098a.a(new byte[]{37}, new byte[]{10, -126, -126, -43, -114, 115, -59, 111}))) : str;
            String strSubstring2 = str.contains(C0098a.a(new byte[]{70}, new byte[]{105, 97, 90, -74, -89, 71, 34, 30})) ? str.substring(str.indexOf(C0098a.a(new byte[]{-100}, new byte[]{-77, 41, 25, -76, -70, -39, -88, 110}))) : "";
            C0152a c0152aG = g(strSubstring);
            if (!strSubstring2.startsWith(c0152aG.i())) {
                strSubstring2 = c0152aG.i() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-10, -41, -125, 122}, new byte[]{-122, -74, -9, 18, -23, -59, 16, 35}), strSubstring2);
            jSONObject.put(C0098a.a(new byte[]{75, -95, -27, -31, 28, -102, -79, 2}, new byte[]{59, -64, -106, -110, 107, -11, -61, 102}), c0152aG.b(strSubstring2));
            List<C0154c> listA = C0154c.a(i(c0152aG.l(), j(c0152aG, c0152aG.m(), jSONObject.toString(), true)));
            Iterator<C0154c> it = listA.iterator();
            if (z) {
                while (it.hasNext()) {
                    if (it.next().j(c0152aG.l())) {
                        it.remove();
                    }
                }
            }
            return listA;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    private String i(boolean z, String str) throws JSONException {
        JSONObject jSONObject;
        String strA;
        if (z) {
            jSONObject = new JSONObject(str).getJSONObject(C0098a.a(new byte[]{-51, -37, 117, -77}, new byte[]{-87, -70, 1, -46, 35, -10, 34, 33}));
            strA = C0098a.a(new byte[]{-119, 55, -89, -97, -23, 112, -31}, new byte[]{-22, 88, -55, -21, -116, 30, -107, 57});
        } else {
            jSONObject = new JSONObject(str).getJSONObject(C0098a.a(new byte[]{22, -85, -95, -58}, new byte[]{114, -54, -43, -89, -26, -120, 92, 95}));
            strA = C0098a.a(new byte[]{59, -48, 72, -112, -49}, new byte[]{93, -71, 36, -11, -68, -102, 4, 28});
        }
        return jSONObject.getJSONArray(strA).toString();
    }

    private String j(C0152a c0152a, String str, String str2, boolean z) {
        boolean z2;
        String strA = C0197c.g(str, str2, c0152a.e()).a();
        SpiderDebug.log(strA);
        if (z && strA.contains(C0098a.a(new byte[]{7, -36, -83, -69, -69, -22, 24, 95, 37, -37, -24, -95, -68, -22, 9, 69, 51, -56, -86, -92, -86, -82}, new byte[]{64, -87, -56, -56, -49, -54, 109, 44}))) {
            try {
                JSONObject jSONObject = new JSONObject();
                z2 = true;
                jSONObject.put(C0098a.a(new byte[]{17, 56, -112, -114, 115, 16, 23, -85}, new byte[]{100, 75, -11, -4, 29, 113, 122, -50}), c0152a.g().b());
                jSONObject.put(C0098a.a(new byte[]{-9, 80, -116, -20, -39, 95, -57, -116}, new byte[]{-121, 49, -1, -97, -82, 48, -75, -24}), c0152a.g().a());
                c0152a.q(new JSONObject(C0197c.g(c0152a.f() + C0098a.a(new byte[]{-105, 70, 104, -65, 38, -64, -37, -2, -48, 8, 116, -71, 110, -56, -64}, new byte[]{-72, 39, 24, -42, 9, -95, -82, -118}), jSONObject.toString(), null).a()).getJSONObject(C0098a.a(new byte[]{35, 46, 13, 84}, new byte[]{71, 79, 121, 53, -90, 17, 16, -36})).getString(C0098a.a(new byte[]{-11, 57, 32, -83, -94}, new byte[]{-127, 86, 75, -56, -52, -64, 6, -91})));
            } catch (Exception e) {
                e.printStackTrace();
                z2 = false;
            }
            if (z2) {
                return j(c0152a, str, str2, false);
            }
        }
        return strA;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        d();
        String str3 = map.containsKey(C0098a.a(new byte[]{-41, 11, -12, -33}, new byte[]{-93, 114, -124, -70, -96, -71, -119, -98})) ? map.get(C0098a.a(new byte[]{-71, 79, 86, 39}, new byte[]{-51, 54, 38, 66, 86, -127, 19, -96})) : "";
        String str4 = map.containsKey(C0098a.a(new byte[]{65, -83, 9, 62, -45}, new byte[]{46, -33, 109, 91, -95, 33, -58, -45})) ? map.get(C0098a.a(new byte[]{77, -79, 18, -86, -65}, new byte[]{34, -61, 118, -49, -51, 126, -86, -73})) : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C0154c c0154c : h(str, true)) {
            if (c0154c.k()) {
                arrayList.add(c0154c);
            } else {
                arrayList2.add(c0154c);
            }
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            C0157f.a(str3, str4, arrayList);
            C0157f.a(str3, str4, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C0154c) it.next()).h(str, this.b));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0154c) it2.next()).h(str, this.b));
        }
        h hVar = new h();
        hVar.A(arrayList3);
        hVar.k(1, 1, 0, 1);
        return hVar.toString();
    }

    public String detailContent(List<String> list) {
        d();
        char c = 0;
        String str = list.get(0);
        String strSubstring = str.contains(C0098a.a(new byte[]{-4}, new byte[]{-45, -21, 121, 104, 27, 81, -24, -49})) ? str.substring(0, str.indexOf(C0098a.a(new byte[]{38}, new byte[]{9, -123, -27, -97, -37, 51, 71, 16}))) : str;
        String strSubstring2 = str.substring(0, str.lastIndexOf(C0098a.a(new byte[]{-4}, new byte[]{-45, 96, -21, 125, 92, 59, -49, 96})));
        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(C0098a.a(new byte[]{24}, new byte[]{55, -128, 63, -36, 70, -81, 47, -99})) + 1);
        C0152a c0152aG = g(strSubstring);
        List<C0154c> listH = h(strSubstring2, false);
        C0157f.a(C0098a.a(new byte[]{29, 0, -111, -49}, new byte[]{115, 97, -4, -86, 17, 66, -59, 61}), C0098a.a(new byte[]{-79, -111, 45}, new byte[]{-48, -30, 78, 110, -88, 31, 15, 70}), listH);
        k kVar = new k();
        kVar.j(strSubstring);
        kVar.g(str);
        kVar.h(strSubstring3);
        kVar.i(this.b);
        ArrayList arrayList = new ArrayList();
        for (C0154c c0154c : listH) {
            if (c0154c.l(c0152aG.l())) {
                StringBuilder sb = new StringBuilder();
                sb.append(c0154c.c());
                byte[] bArr = new byte[1];
                bArr[c] = -105;
                sb.append(C0098a.a(bArr, new byte[]{-77, -71, -55, 112, 122, -126, 37, 65}));
                sb.append(c0154c.i(strSubstring2));
                StringBuilder sb2 = new StringBuilder();
                for (C0154c c0154c2 : listH) {
                    if (C0207D.n(C0207D.f(c0154c2.c()))) {
                        sb2.append(C0098a.a(new byte[]{37, 68, -70}, new byte[]{91, 58, -60, -51, 87, -98, -128, 90}));
                        sb2.append(c0154c2.c());
                        sb2.append(C0098a.a(new byte[]{-32, 42, -90}, new byte[]{-96, 106, -26, -21, -118, 67, 62, -60}));
                        sb2.append(C0207D.f(c0154c2.c()));
                        sb2.append(C0098a.a(new byte[]{122, -121, 77}, new byte[]{58, -57, 13, -30, -76, -56, 54, -121}));
                        sb2.append(c0154c2.i(strSubstring2));
                    }
                }
                sb.append(sb2.toString());
                arrayList.add(sb.toString());
            }
            c = 0;
        }
        kVar.k(TextUtils.join(C0098a.a(new byte[]{99}, new byte[]{64, 112, -39, -38, -40, 55, 20, -94}), arrayList));
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        char c;
        d();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C0152a> it = this.a.iterator();
        while (true) {
            c = 0;
            if (!it.hasNext()) {
                break;
            }
            C0152a next = it.next();
            if (!next.k().booleanValue()) {
                arrayList.add(new C0135a(next.h(), next.h(), C0098a.a(new byte[]{-56}, new byte[]{-7, -43, 94, -64, -39, -108, -72, -60})));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strA = ((C0135a) it2.next()).a();
            ArrayList arrayList2 = new ArrayList();
            String strA2 = C0098a.a(new byte[]{-7, -97, -64, 35}, new byte[]{-115, -26, -80, 70, 52, -62, 7, -41});
            String strA3 = C0098a.a(new byte[]{-107, -21, 94, -79, -14, -84, 96, -51, -19, -128, 82, -33}, new byte[]{115, 101, -52, 84, 72, 35, -119, 108});
            C0136b[] c0136bArr = new C0136b[4];
            c0136bArr[c] = new C0136b(C0098a.a(new byte[]{78, 12, -31, 66, -128, 11}, new byte[]{-89, -84, 113, -86, 40, -90, 47, -110}), "");
            c0136bArr[1] = new C0136b(C0098a.a(new byte[]{-100, 89, 114, 50, 22, 15}, new byte[]{121, -55, -1, -43, -66, -66, -65, -72}), C0098a.a(new byte[]{124, -43, 102, -66}, new byte[]{18, -76, 11, -37, 113, -36, 8, -77}));
            c0136bArr[2] = new C0136b(C0098a.a(new byte[]{-21, 2, 83, -49, 89, -82}, new byte[]{14, -90, -12, 42, -23, 33, 78, 98}), C0098a.a(new byte[]{67, -95, 91, -112}, new byte[]{48, -56, 33, -11, 69, -69, 8, 116}));
            c0136bArr[3] = new C0136b(C0098a.a(new byte[]{-125, -53, 91, 107, -30, 65, -87, 39, -27, -99, 99, 30}, new byte[]{103, 116, -11, -115, 118, -8, 79, -66}), C0098a.a(new byte[]{-61, -95, -77, 51}, new byte[]{-89, -64, -57, 86, -26, -34, -2, -86}));
            arrayList2.add(new C0137c(strA2, strA3, Arrays.asList(c0136bArr)));
            arrayList2.add(new C0137c(C0098a.a(new byte[]{19, -13, -24, -1, -30}, new byte[]{124, -127, -116, -102, -112, -12, 52, 2}), C0098a.a(new byte[]{79, -113, -64, 76, -102, 43, 55, -15, 16, -28, -18, 38}, new byte[]{-87, 1, 82, -87, 32, -92, -47, 103}), Arrays.asList(new C0136b(C0098a.a(new byte[]{124, -66, 76, -57, 86, -40}, new byte[]{-107, 30, -36, 47, -2, 117, -5, 92}), ""), new C0136b(C0098a.a(new byte[]{37, -108, 69}, new byte[]{-57, 56, -61, -98, -1, 21, -93, -10}), C0098a.a(new byte[]{-96, 55, 75}, new byte[]{-63, 68, 40, -17, 6, -76, 17, -36})), new C0136b(C0098a.a(new byte[]{-39, 38, -90}, new byte[]{59, -118, 33, 17, 46, 94, -48, 107}), C0098a.a(new byte[]{114, -17, 6, -25}, new byte[]{22, -118, 117, -124, -87, 49, 45, 110})))));
            linkedHashMap.put(strA, arrayList2);
            c = 0;
        }
        return h.s(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            this.c = str;
            d();
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split(C0098a.a(new byte[]{5, 119, 79}, new byte[]{123, 9, 49, -81, 81, 72, -47, 47}));
        h hVar = new h();
        hVar.y(e(strArrSplit[0]).f());
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            if (str3.contains(C0098a.a(new byte[]{120, 2, -30}, new byte[]{56, 66, -94, 119, 43, -50, -105, -103}))) {
                String[] strArrSplit2 = str3.split(C0098a.a(new byte[]{-54, -124, 82}, new byte[]{-118, -60, 18, 68, 100, -27, 63, -86}));
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2[1];
                String strF = e(strArrSplit2[2]).f();
                i iVar = new i();
                iVar.c(str4);
                i iVarA = iVar.a(str5);
                iVarA.d(strF);
                arrayList.add(iVarA);
            }
        }
        hVar.x(arrayList);
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        for (C0152a c0152a : this.a) {
            if (c0152a.o().booleanValue()) {
                c0152a.a();
                arrayList2.add(new Job(c0152a, str));
            }
        }
        Iterator it = executorServiceNewCachedThreadPool.invokeAll(arrayList2, 15L, TimeUnit.SECONDS).iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((Future) it.next()).get());
        }
        return h.q(arrayList);
    }
}
