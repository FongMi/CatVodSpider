package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class AppXY extends Spider {
    private String a;

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-32, 37, -37, -64, -39, 36, -34, -20, -37, 34}, new byte[]{-75, 86, -66, -78, -12, 101, -71, -119}), C0098a.a(new byte[]{-18, 69, 12, 17, 56, 82, 68, -95, -81, 31, 84, 75, 124}, new byte[]{-127, 46, 100, 101, 76, 34, 107, -107}));
        if (!TextUtils.isEmpty(this.a)) {
            map.put(C0098a.a(new byte[]{-32, 25, 70, -64, 4, -54, 102, 37, -64, 24, 91, -57, 5}, new byte[]{-95, 108, 50, -88, 107, -72, 15, 95}), this.a);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String strA = map.get(C0098a.a(new byte[]{112, -126, 111, -52, 80, -80, 84, 19, 119}, new byte[]{19, -18, 14, -65, 35, -126, 11, 122}));
        if (strA == null) {
            strA = C0098a.a(new byte[]{-14}, new byte[]{-62, 56, -62, -108, -86, 100, -118, -80});
        }
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-1, 7, -1, 125, 95, 33, -62, -23, -17, 5, -22, 125, 92, 53, -107, -81, -7, 20, -14, 108, 2, 120, -126, -85, -71, 16, -27, 34, 79, 119, -126, -77, -13, 92, -3, 63, 3, 111, -123, -93, -10, 7, -18, 127, 3, 115, -126, -85, -14, 44, -5, 108, 75, 126, -46, -78, -1, 22, -22, 121, 73, 105, -78, -91, -5, 18, -8, 126, 115, 114, -119, -5}, new byte[]{-105, 115, -117, 13, 44, 27, -19, -58}, sb, str);
        v.a(new byte[]{91, -12, -51, 11, 11, -113, -112, 52, 20, -13, -46, 87}, new byte[]{125, -105, -95, 106, 120, -4, -94, 107}, sb, strA);
        v.a(new byte[]{-27, -37, -76, 94, 62, -8, -104, 58, -77, -50, -86, 75, 4, -85, -36, 113, -2}, new byte[]{-61, -81, -51, 46, 91, -59, -87, 28}, sb, str2);
        JSONArray jSONArrayOptJSONArray = new JSONObject(C0197c.l(C0133t.b(new byte[]{110, -33, 117, 37, 57, 122, 113, 70, 50, -54, 41, 112, 104}, new byte[]{72, -81, 20, 66, 92, 37, 2, 47}, sb), a())).optJSONObject(C0098a.a(new byte[]{-74, 109, -2, 63}, new byte[]{-46, 12, -118, 94, -117, -34, -55, 51})).optJSONArray(C0098a.a(new byte[]{-69, -70, -63, 38}, new byte[]{-41, -45, -78, 82, -77, 53, -105, -61}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i).optJSONObject(C0098a.a(new byte[]{74, 103, 49, -78, -83, 91, -105}, new byte[]{62, 15, 84, -45, -39, 62, -27, 54}));
            String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{98, -102}, new byte[]{11, -2, -20, 3, -23, -80, -106, 56}));
            String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{71, -99, -83, 73, 101}, new byte[]{51, -12, -39, 37, 0, 62, 45, 25}));
            String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{105, 105, 8, -38, -18, -59, 69, -86, 102}, new byte[]{10, 6, 126, -65, -100, -102, 48, -40}));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-102, 28, -29, -86, 90}, new byte[]{-18, 115, -105, -53, 54, -103, -115, 63})));
            arrayList.add(new k(strOptString, strOptString2, strOptString3, C0133t.b(new byte[]{47, -91, 39}, new byte[]{-58, 62, -95, -109, 123, -92, -35, -14}, sb2)));
        }
        return h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        k kVar = new k();
        JSONObject jSONObjectOptJSONObject = new JSONObject(C0197c.l(C0098a.a(new byte[]{65, 41, -5, 33, -17, 10, 58, -118, 81, 43, -18, 33, -20, 30, 109, -52, 71, 58, -10, 48, -78, 83, 122, -56, 7, 62, -31, 126, -22, 2, 58, -47, 65, 56, -18, 37, -7, 66, 74, -43, 72, 47, -22, 63, -24, 31, 113, -64, 93, 60, -26, 61, -93, 68, 125, -64, 72, 41, -22, 35, -61, 64, 116, -41, 76, 51, -5, 14, -11, 84, 40}, new byte[]{41, 93, -113, 81, -100, 48, 21, -91}) + list.get(0), a())).optJSONObject(C0098a.a(new byte[]{41, 114, -110, 72}, new byte[]{77, 19, -26, 41, -94, 126, -17, 62}));
        kVar.g(list.get(0));
        kVar.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{61, -76, 102, -41, 7}, new byte[]{73, -35, 18, -69, 98, 36, -3, -104})));
        kVar.i(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{2, -62, 69, -76, 100, -49, -93, -51, 13}, new byte[]{97, -83, 51, -47, 22, -112, -42, -65})));
        kVar.b(jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{-95, -119, 1, -17, -97, 68, 107, 23, -74}, new byte[]{-59, -20, 114, -116, -64, 48, 10, 112})).toString());
        kVar.e(C0098a.a(new byte[]{66, 81, 111, -120, -63, -50, -94, 55, 20, 3, 95, -48, -89, -26, -17, 95, 56, 68, 58, -28, -46, -100, -52, 47, 67, 98, 116, 81, -86, -38, -3, 88, 46, 95, 59, -16, -6, -111, -11, 28, 77, 71, 90, -126, -32, -28, -81, 4, 26, 5, 77, -31, 124, 75, 116, 90, 11, 96, 56, -48, -55, 79}, new byte[]{-91, -32, -36, 107, 66, 117, 74, -67}) + jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{74, -70, -110, 43, 32, 8, 66, 31, 87, -67, -119, 55}, new byte[]{35, -44, -26, 89, 79, 108, 55, 124})));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C0098a.a(new byte[]{-112, -64, 111, -47, 31, 62, -12, -83, -16, -79, 82, -88}, new byte[]{118, 88, -16, 57, -107, -125, 28, 10}));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0098a.a(new byte[]{-20, -26, 120, 88, -13, -72, 18, -41}, new byte[]{-104, -114, 29, 57, -121, -35, 96, -92}));
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList3.add(jSONObjectOptJSONObject2.optString(C0098a.a(new byte[]{-81, 16, 11}, new byte[]{-63, 101, 102, -40, -95, -8, -48, 23})) + C0098a.a(new byte[]{6}, new byte[]{34, 68, -82, -123, -49, -62, -65, -90}) + jSONObjectOptJSONObject2.optString(C0098a.a(new byte[]{-95, 74, 65, -109, -1, -60, -94, -30, -67, 122, 90, -66, -27}, new byte[]{-46, 37, 47, -52, -119, -83, -58, -121})));
        }
        arrayList.add(TextUtils.join(C0098a.a(new byte[]{73}, new byte[]{106, -20, -84, 37, -89, -63, -104, 48}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-46, -8, 1}, new byte[]{-10, -36, 37, -105, 64, -73, -124, 60}), arrayList2));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{-7, 107, -118}, new byte[]{-35, 79, -82, -22, -48, 98, 60, 53}), arrayList));
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(C0197c.l(C0098a.a(new byte[]{122, -13, -95, -101, -117, -87, -69, 123, 106, -15, -76, -101, -120, -67, -20, 61, 124, -32, -84, -118, -42, -16, -5, 57, 60, -28, -69, -60, -101, -1, -5, 33, 118, -88, -93, -39, -41, -25, -4, 49, 115, -13, -80, -103, -41, -16, -8, 53, 97, -12, -80, -104}, new byte[]{18, -121, -43, -21, -8, -109, -108, 84}), a())).optJSONObject(C0098a.a(new byte[]{-34, -106, 95, -11}, new byte[]{-70, -9, 43, -108, -102, -30, 8, -14})).optJSONArray(C0098a.a(new byte[]{-66, 90, 54, -58}, new byte[]{-46, 51, 69, -78, 36, 37, -111, 11}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (!jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{103, 12, 21, 78, -88, -100, -44, 43, 113}, new byte[]{20, 100, 122, 57, -9, -24, -83, 91})).contains(C0098a.a(new byte[]{17, -51, 89, -48, -74, 17, 9, 106, 54}, new byte[]{83, -94, 54, -69, -59, 101, 102, 24}))) {
                arrayList.add(new C0135a(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{50, -95}, new byte[]{91, -59, -115, -16, -6, 30, 13, -16})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{108, 27, -39, 10, -112, 111, -69, -57, 98, 18}, new byte[]{15, 119, -72, 121, -29, 48, -43, -90}))));
            }
        }
        return h.t(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
        String str2 = System.currentTimeMillis() + "";
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{29, 118, -110, 80, -22, 29}, new byte[]{121, 19, -28, 57, -119, 120, -46, 107}), C0207D.a(str2));
        map.put(C0098a.a(new byte[]{-75, -60, 106, 126, -89, 14, -102, -10, -70, -61, 107, 121, -78, 61, -103, -39, -71, -60}, new byte[]{-36, -86, 25, 10, -58, 98, -10, -87}), C0098a.a(new byte[]{-101, 77, 121, -36}, new byte[]{-17, 63, 12, -71, 77, 85, -78, -26}));
        map.put(C0098a.a(new byte[]{-27, 77, -76, -86, -46, 113, 85, 70, -16, 80, -89, -75, -54, 113, 72, 65, -18, 65}, new byte[]{-125, 36, -58, -39, -90, 46, 60, 40}), str2);
        map.put(C0098a.a(new byte[]{-127, -128, -30, -103, 17, -37, 14, -13, -116, -107, -12, -78, 58, -57, 19, -14}, new byte[]{-19, -31, -111, -19, 78, -82, 126, -105}), str2);
        this.a = new JSONObject(C0197c.h(C0098a.a(new byte[]{57, -91, 97, -51, 98, -17, 108, -67, 41, -89, 116, -51, 97, -5, 59, -5, 63, -74, 108, -36, 63, -74, 44, -1, 127, -78, 123, -110, 103, -28, 108, -13, 50, -78, 122, -56, 127, -95, 108, -2, 62, -74, 124, -45}, new byte[]{81, -47, 21, -67, 17, -43, 67, -110}), map, a()).a()).optJSONObject(C0098a.a(new byte[]{71, -91, -54, -115}, new byte[]{35, -60, -66, -20, -34, -66, -124, -24})).optString(C0098a.a(new byte[]{70, -112, -79, -4, -53}, new byte[]{50, -1, -38, -103, -91, -80, -115, 81}));
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVar = new h();
        hVar.y(str2);
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(C0197c.g(C0098a.a(new byte[]{17, 103, -34, 93, -8, 2, -45, -63, 1, 101, -53, 93, -5, 22, -124, -121, 23, 116, -45, 76, -91, 91, -109, -125, 87, 112, -60, 2, -3, 11, -45, -99, 28, 114, -40, 78, -29}, new byte[]{121, 19, -86, 45, -117, 56, -4, -18}), new JSONObject().put(C0098a.a(new byte[]{-95, 100, -33, -87}, new byte[]{-43, 1, -89, -35, -28, -50, -39, 87}), str).toString(), a()).a()).optJSONObject(C0098a.a(new byte[]{-30, -94, -63, 120}, new byte[]{-122, -61, -75, 25, 24, -10, -106, -58})).optJSONObject(C0098a.a(new byte[]{91, -5, 44, -95, 111, -127, 46}, new byte[]{47, -109, 73, -64, 27, -28, 92, 121})).optJSONArray(C0098a.a(new byte[]{93, 74, -66, -95, 80, 86, 58, -11, 79, 91, -66}, new byte[]{46, 47, -33, -45, 51, 62, 101, -111}));
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList.add(new k(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-29, -55}, new byte[]{-118, -83, -22, 29, 126, 93, -33, 68})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-65, 6, -27, 109, 16}, new byte[]{-53, 111, -111, 1, 117, 4, 78, 104})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-88, -90, -23, 89, -97, -41, 69, -49, -89}, new byte[]{-53, -55, -97, 60, -19, -120, 48, -67})), jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-80, -96, 12, -82, -40, -125, 26, 112, -79}, new byte[]{-61, -61, 99, -36, -67, -36, 105, 4}))));
        }
        return h.q(arrayList);
    }
}
