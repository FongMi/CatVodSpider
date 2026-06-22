package com.github.catvod.spider;

import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.j;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class PanSearch extends Ali {
    private final String b = C0098a.a(new byte[]{89, 75, 52, -3, -12, 125, -78, -42, 70, 72, 55, -93, -9, 38, -13, -118, 84, 94, 50, -18, -17, 105, -16, -100, 30}, new byte[]{49, 63, 64, -115, -121, 71, -99, -7});

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{66, -73, -83, -72, -63, 46, -49, -103, 121, -80}, new byte[]{23, -60, -56, -54, -20, 111, -88, -4}), C0098a.a(new byte[]{48, 75, 76, -1, -57, 7, 80, -57, 72, 10, 6, -74, -125, 60, 88, -122, 25, 75, 65, -27, -117, 37, 101, -56, 76, 20, 24, -90, -112, 75, 102, -127, 19, 18, 2, -83, -117, 19, 7, -36, 84, 4, 119, -26, -37, 7, 84, -65, 24, 70, 125, -1, -33, 68, 4, -37, 74, 10, 5, -96, -117, 67, 122, -96, 41, 105, 122, -70, -117, 7, 88, -125, 24, 4, 113, -13, -56, 0, 94, -63, 93, 103, 94, -28, -60, 6, 84, -57, 76, 21, 1, -72, -101, 69, 1, -58, 77, 4, 101, -9, -51, 10, 67, -127, 82, 17, 5, -95, -123, 88, 7}, new byte[]{125, 36, 54, -106, -85, 107, 49, -24}));
        return map;
    }

    public String searchContent(String str, boolean z) throws JSONException {
        String string = new JSONObject(l.e(C0197c.l(this.b, b())).o0(C0098a.a(new byte[]{-16, -63, -23, 91, -39, 77, -10, -27, -25, -97, -60, 109, -25, 124, -11, -40, -36, -26, -38, 102, -24, 102, -14, -47}, new byte[]{-125, -94, -101, 50, -87, 57, -83, -116})).get(0).X()).getString(C0098a.a(new byte[]{-66, -68, 20, 101, -26, -89, 39}, new byte[]{-36, -55, 125, 9, -126, -18, 67, 113}));
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{66, 127, -58, -17, -103, -102, 32, -47, 93, 124, -59, -79, -102, -63, 97, -115, 79, 106, -64, -4, -126, -114, 98, -101, 5, 84, -36, -6, -110, -44, 32, -102, 75, 127, -45, -80}, new byte[]{42, 11, -78, -97, -22, -96, 15, -2}, sb, string);
        sb.append(C0098a.a(new byte[]{117, 42, 120, 14, -5, -36, -66, -39, 48, 42, 114, 1, -74, -44, -77, -114, 45, 54, 111, 11, -76}, new byte[]{90, 89, 29, 111, -119, -65, -42, -9}));
        sb.append(URLEncoder.encode(str));
        String strB = C0133t.b(new byte[]{-117, 51, -27, -67, 17, -105, 40, -81, -44, 54, -22, -73, 94, -97, 50, -93}, new byte[]{-83, 67, -124, -45, 44, -10, 68, -58}, sb);
        Map<String, String> mapB = b();
        HashMap map = (HashMap) mapB;
        map.put(C0098a.a(new byte[]{81, 16, 108, 2, 110, -89, -71, -88, 4, 89, 99, 19, 119}, new byte[]{41, 61, 2, 103, 22, -45, -45, -37}), C0098a.a(new byte[]{64}, new byte[]{113, -39, -20, -29, 52, -96, 115, -87}));
        map.put(C0098a.a(new byte[]{89, -63, -127, 126, 40, -124, 76}, new byte[]{43, -92, -25, 27, 90, -31, 62, -47}), this.b);
        JSONArray jSONArray = new JSONObject(C0197c.l(strB, mapB)).getJSONObject(C0098a.a(new byte[]{-41, 110, 17, 60, -24, 105, 65, 104, -44}, new byte[]{-89, 15, 118, 89, -72, 27, 46, 24})).getJSONObject(C0098a.a(new byte[]{-12, 20, 91, 95}, new byte[]{-112, 117, 47, 62, 33, 52, 104, -53})).getJSONArray(C0098a.a(new byte[]{83, 113, -103, 96}, new byte[]{55, 16, -19, 1, 106, -107, -116, -116}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString(C0098a.a(new byte[]{39, 88, 91, 83, -93, -5, -72}, new byte[]{68, 55, 53, 39, -58, -107, -52, -115}));
            String[] strArrSplit = strOptString.split(C0098a.a(new byte[]{50, -62}, new byte[]{110, -84, 34, 88, 88, -108, 72, 124}));
            if (strArrSplit.length != 0) {
                j.a(l.e(strOptString).o0(C0098a.a(new byte[]{-93}, new byte[]{-62, 74, -96, 114, 21, 70, 28, 31})).a(C0098a.a(new byte[]{114, -121, 127, 66}, new byte[]{26, -11, 26, 36, 67, 26, 40, 7})), strArrSplit[0].replaceAll(C0098a.a(new byte[]{-55, -28, 10, 49, -40, 54, -35, -116, -53}, new byte[]{-11, -53, 53, 106, -122, 8, -128, -89}), ""), jSONObject.optString(C0098a.a(new byte[]{-128, -37, -82, -102, -52}, new byte[]{-23, -74, -49, -3, -87, -59, 79, -28})), jSONObject.optString(C0098a.a(new byte[]{-43, -85, 48, 30}, new byte[]{-95, -62, 93, 123, 103, 17, 61, -3})), arrayList);
            }
        }
        return h.q(arrayList);
    }
}
