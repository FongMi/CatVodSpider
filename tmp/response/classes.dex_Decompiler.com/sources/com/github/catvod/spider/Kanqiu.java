package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Kanqiu extends Spider {
    private static String a = C0098a.a(new byte[]{8, -20, -68, 24, -7, 60, -56, 83, 23, -17, -26, 80, -5, 120, -122, 74, 17, -15, -67, 70, -84, 125, -126}, new byte[]{96, -104, -56, 104, -61, 19, -25, 36});

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-8, -48, 84, 29, -128, 9, -31, 64, -61, -41}, new byte[]{-83, -93, 49, 111, -83, 72, -122, 37}), C0098a.a(new byte[]{-19, 81, 96, -16, 102, 51, -97, -34, -107, 16, 42, -71, 34, 8, -105, -97, -60, 81, 109, -22, 42, 17, -86, -47, -111, 14, 52, -87, 49, 127, -87, -104, -50, 8, 46, -94, 42, 39, -56, -59, -119, 30, 91, -23, 122, 51, -101, -90, -59, 92, 81, -16, 126, 112, -53, -62, -105, 16, 41, -81, 42, 119, -75, -71, -12, 115, 86, -75, 42, 51, -105, -102, -59, 30, 93, -4, 105, 52, -111, -40, -128, 125, 114, -21, 101, 50, -101, -34, -111, 15, 45, -73, 58, 113, -50, -33, -112, 30, 73, -8, 108, 62, -116, -104, -113, 11, 41, -82, 36, 108, -56}, new byte[]{-96, 62, 26, -103, 10, 95, -2, -15}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get(C0098a.a(new byte[]{110, 109, 95, -21, 43, -69}, new byte[]{13, 12, 43, -114, 98, -33, -19, -82})) != null) {
            str = map.get(C0098a.a(new byte[]{55, 91, 126, 89, 46, 7}, new byte[]{84, 58, 10, 60, 103, 99, 2, 10}));
        }
        C0074g c0074gO0 = l.e(C0197c.l(C0133t.a(new StringBuilder(), a, (str == null || str.isEmpty()) ? "" : String.format(C0098a.a(new byte[]{-59, 27, -3, 53, 92, 24, 10, 89, -103, 89, -16, 40, 73, 21}, new byte[]{-22, 118, -100, 65, 63, 112, 37, 124}), str)), a())).o0(C0098a.a(new byte[]{-99, -45, 26, 118, -80, -20, -101, 1, -36, -54, 3, 40, -83, -75, -103, 30}, new byte[]{-77, -65, 115, 5, -60, -63, -4, 115}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gO0) {
            String str3 = a + mVar.o0(C0098a.a(new byte[]{87, -121, -123, 114, -125, -77, 53, -89, 84, -107, -125, 117, -64, -80, 51, -80}, new byte[]{121, -27, -15, 28, -83, -47, 65, -55})).a(C0098a.a(new byte[]{-62, 32, -18, 6}, new byte[]{-86, 82, -117, 96, -46, 81, -25, 80}));
            String strB = y.b(new byte[]{77, 126, 32, 88, 67, -86, -73, 113, 12, 98, 42}, new byte[]{99, 12, 79, 47, 109, -50, -102, 31}, mVar);
            if (strB.isEmpty()) {
                strB = mVar.v0();
            }
            String strA = mVar.o0(C0098a.a(new byte[]{-87, 75, -77, 118, -79, 18, 119, 51, -74}, new byte[]{-121, 40, -36, 26, -100, 106, 4, 30})).d(0).g(C0098a.a(new byte[]{27, -78, -62}, new byte[]{114, -33, -91, 16, 2, 114, 125, -57})).a(C0098a.a(new byte[]{85, 14, 119}, new byte[]{38, 124, 20, 66, -32, 115, 52, 5}));
            if (strA.isEmpty()) {
                strA = C0098a.a(new byte[]{-126, -102, -58, 16, -36, 74, 53, -112, -102, -121, -47, 78, -58, 29, 125, -37, -120, -64, -47, 14, -128, 25, 110, -38, -121, -63, -124, 85, -104, 70, 45, -116, -114, -40, -47, 84, -102, 72, 34, -118, -39, -113, -41, 6, -55, 73, 46, -34, -120, -41, -100, 10, -33, 23}, new byte[]{-22, -18, -78, 96, -81, 112, 26, -65});
            }
            if (!strA.startsWith(C0098a.a(new byte[]{-77, -47, -70, 126}, new byte[]{-37, -91, -50, 14, 84, 127, -21, -75}))) {
                strA = C0133t.a(new StringBuilder(), a, strA);
            }
            j.a(str3, strB, strA, y.b(new byte[]{-77, 90, -61, -96, -64, -122, -17, 4, -80, 72, -59, -89, -125, -123, -23, 19}, new byte[]{-99, 56, -73, -50, -18, -28, -101, 106}, mVar), arrayList);
        }
        h hVar = new h();
        hVar.k(1, 1, 0, c0074gO0.size());
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        if (list.get(0).equals(a)) {
            return h.c(C0098a.a(new byte[]{52, 52, -66, -94, 4, -86, 31, -81, 72, 125, -74, -32, 84, -115, 122, -6, 117, 16}, new byte[]{-46, -101, 42, 74, -79, 49, -6, 31}));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        JSONArray jSONArray = new JSONObject(new String(Base64.decode(new JSONObject(C0197c.l(C0133t.b(new byte[]{-63, 98, -73, 24}, new byte[]{-20, 23, -59, 116, -114, -68, -85, -46}, sb), a())).optString(C0098a.a(new byte[]{45, 16, -21, -105}, new byte[]{73, 113, -97, -10, -12, 56, -16, 92})).substring(6).substring(0, r1.length() - 2), 0))).getJSONArray(C0098a.a(new byte[]{-91, 127, -102, 88, 69}, new byte[]{-55, 22, -12, 51, 54, 98, -69, -26}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString(C0098a.a(new byte[]{-26, -19, -84, 105}, new byte[]{-120, -116, -63, 12, -64, -57, -117, -13}));
            String strReplace = jSONObject.optString(C0098a.a(new byte[]{-35, -128, 67}, new byte[]{-88, -14, 47, -29, -22, 85, -6, -41})).replace(C0098a.a(new byte[]{-34}, new byte[]{-3, -26, -70, -112, 46, 31, -48, 62}), C0098a.a(new byte[]{-113, 6, 18}, new byte[]{-91, 44, 56, -38, -98, 43, -77, -5}));
            StringBuilder sbC = C0133t.c(strOptString);
            sbC.append(C0098a.a(new byte[]{106}, new byte[]{78, -19, 93, 0, -89, 71, 45, 25}));
            sbC.append(strReplace);
            arrayList.add(sbC.toString());
        }
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.j(C0098a.a(new byte[]{100, 74, 51, 38}, new byte[]{53, 35, 95, 67, -34, -64, -96, 62}));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{-59}, new byte[]{-26, 29, -88, 69, -31, -127, 30, -86}), arrayList));
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("", C0098a.a(new byte[]{-105}, new byte[]{-90, 106, -41, -20, 40, 108, 52, 24}), C0098a.a(new byte[]{4}, new byte[]{60, -23, -112, 62, -73, 16, 58, 3}), C0098a.a(new byte[]{-45, 7}, new byte[]{-31, 54, -96, 8, -5, -38, 77, 66}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{100, 100, -94, 9, -123, -75, 23, 45, 53, 7, -104, 77}, new byte[]{-127, -31, 10, -32, 6, 29, -16, -74}), C0098a.a(new byte[]{8, 2, 98, -128, -128, -2, -111, 69, 91, 75, 94, -54}, new byte[]{-17, -83, -52, 103, 16, 125, 118, -34}), C0098a.a(new byte[]{-114, -68, 125, 103, 47, 99, -69, 66, -46, -20, 92, 45}, new byte[]{102, 10, -50, -128, -65, -32, 92, -39}), C0098a.a(new byte[]{-20, 17, -37, -24, -41, 27, -15, 66, -67, 114, -1, -95}, new byte[]{9, -108, 109, 12, 108, -115, 22, -39}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return h.w(arrayList, new JSONObject(oZP.d("0E4D466356752E14552A092C575557630F34010A3E254E79554D19200130575557638BE4CE8AE9CA4E79554D01200020104D4D61372E5701557B4C773B2D366340755719557B4C77444D0A6D4C2E5701557B4C77362D366340755719557B4C77474D0A6D4C2E5701557B4C7792C0D9A6FCD692D4CBA4FCDD574357631A774F4F55754E28594F0C6302774F4F55A6D6F993F2D2A5D1C69DEDC56340755719557B4C77475E553C3128284355794E6F55340C6307300C4D4D614E36141B12080877594F552F0D38104D4D614EB2C4D492DFE777594F55370D39000A557B4C0E0E4D196356755787FCF084E3F04D5B614E235755576354770843573A4E3B5755576384F0CA88E3F34E79554D016356755756553C40750E4D196356755789F3CE8BC1C74D5B614E23575557635D6557125B6117771B4D4D614EB3D9C892C7CC77594F55374E6F554D46734E28594F0C6302774F4F55A7C0F29DEEE36340755719557B4C77445C553C40750E4D19635675578AC9F68BC1C74D5B614E23575557635D6157125B6117771B4D4D614EB3C6FA90D5DE77594F55374E6F554D46744E28594F0C6302774F4F55A7C0F290F4CAA9EDC1574357631A774F4F55705A770843573A4E3B5755576384E3C689F7FA8AC8DA4D5B614E23575557635E6257125B6117771B4D4D614EB0EED290CFE7B3E8C0556D4C77034D4D614E66464D0A6D4C2E5701557B4C7791D7DAA9DAD0574357631A774F4F55764E28594F0C6302774F4F55A5D6CF90E9D76340755719557B4C77445E553C40750E4D196356755787C1F28BC5F688CCFD89C5FD4D5B614E23575557635E6657125B6117771B4D4D614EB3D9C892CCE3BDF4FB556D4C77034D4D614E674D4D0A6D4C2E5701557B4C7792D1F9A9EDD99DEEE36340755719557B4C774759553C3128284357635E6C5755571A17771E0A0E635675570C1635091C114D5B614E3B1402126356755788C6FA89CBFE4D5B614E23140302244E6F55340C6302774F4F55A6D1C492FFF46340755719557B4C774756553C40750E4D196356755789E1EE8AE1EE8AF2CA4E79554D01635675575C476311795514552F4E6F554D3A0D2E77594F55374E6F554D44794E28594F0C6302774F4F55142A16574357631A774F4F55725E770843573A4E3B575557632213394D5B614E23575557635E6057125B6117771B4D4D614E16363B21744E79554D01635675575E4F63110808320A")));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVar = new h();
        hVar.y(str2.replace(C0098a.a(new byte[]{5, -48, -53}, new byte[]{47, -6, -31, 71, 10, 37, 5, -40}), C0098a.a(new byte[]{120}, new byte[]{91, -21, -17, 58, 103, -73, 72, -40})));
        hVar.l();
        hVar.f(a());
        return hVar.toString();
    }
}
