package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Jiaozi extends Spider {
    private static String a = C0098a.a(new byte[]{94, 81, -103, 37, -23, 66, -16, -29, 65, 82, -102, 123, -16, 17, -66, -93, 76, 76, -61, 56, -1}, new byte[]{54, 37, -19, 85, -102, 120, -33, -52});

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{56, 16, 126, 86, 16, 27, -95, -128, 3, 23}, new byte[]{109, 99, 27, 36, 61, 90, -58, -27}), C0098a.a(new byte[]{97, 48, -10, 97, 78, 16, 102, 80, 25, 113, -68, 40, 10, 43, 110, 17, 72, 48, -5, 123, 2, 50, 83, 95, 29, 111, -94, 56, 25, 92, 80, 22, 66, 105, -72, 51, 2, 4, 49, 75, 5, 127, -51, 120, 82, 16, 98, 40, 73, 61, -57, 97, 86, 83, 50, 76, 27, 113, -65, 62, 2, 84, 76, 55, 120, 18, -64, 36, 2, 16, 110, 20, 73, 127, -53, 109, 65, 23, 104, 86, 12, 28, -28, 122, 77, 17, 98, 80, 29, 110, -69, 38, 18, 82, 55, 81, 28, 127, -33, 105, 68, 29, 117, 22, 3, 106, -65, 63, 12, 79, 49}, new byte[]{44, 95, -116, 8, 34, 124, 7, 127}));
        map.put(C0098a.a(new byte[]{105, 61, 93, 19, -25, -41, 105}, new byte[]{59, 88, 59, 118, -107, -78, 27, 122}), a);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get(C0098a.a(new byte[]{-15, 24, -2, 73, 57, -50}, new byte[]{-110, 121, -118, 44, 112, -86, 1, 96})) != null) {
            str = map.get(C0098a.a(new byte[]{81, -94, 86, 41, 9, 105}, new byte[]{50, -61, 34, 76, 64, 13, 82, -96}));
        }
        h hVarE = l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-77, 116, -84, -9, 25, 118, -87, 115, -14, 125, -91, -26, 79, 113, -85, 63, -17, 55, -88, -22, 7, 110}, new byte[]{-100, 25, -64, -98, 106, 2, -122, 26}), str, str2), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-107, -109, -53, -122, -77, 123, 50, 94, -33, -110, -37, -128, -82, 9, 27, 83, -44, -122}, new byte[]{-69, -2, -78, -13, -38, 86, 68, 49}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(a + mVar.o0(C0098a.a(new byte[]{-62}, new byte[]{-93, -116, -126, -25, -117, 85, 41, -13})).a(C0098a.a(new byte[]{-3, 82, 23, -73}, new byte[]{-107, 32, 114, -47, 111, -20, -117, -6})), mVar.o0(C0098a.a(new byte[]{105}, new byte[]{8, 14, 113, -17, -64, 94, -77, 81})).a(C0098a.a(new byte[]{126, 114, 80, 30, 11}, new byte[]{10, 27, 36, 114, 110, -10, 25, -84})), mVar.o0(C0098a.a(new byte[]{-104}, new byte[]{-7, -80, -30, 92, 92, -33, 47, -126})).a(C0098a.a(new byte[]{53, -72, -64, 30, -14, 10, -71, 73, 54, -80, -38, 30, -77}, new byte[]{81, -39, -76, 127, -33, 101, -53, 32})), y.b(new byte[]{-15, 97, -39, 68, 104, 122, 14, -60, -85}, new byte[]{-33, 17, -80, 39, 69, 14, 107, -68}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-125, 65, -93, -53, -23, -23, -115, 104, -61, 73, -74, -31, -30, -96, -35, 39, -64, 85, -81, -41, -83, -89, -110, 103, -39, 73, -76, -54, -33, -101, -111, 96, -34, 88}, new byte[]{-83, 44, -38, -66, -128, -60, -3, 9}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{-115, 88, 107, -8, 124, -15, 87, 98, -51, 80, 126, -46, 74, -76, 66, 98, -57, 21, 44, -83, 96, -80, 7, 61, -125, 89, 123}, new byte[]{-93, 53, 18, -115, 21, -36, 39, 3}));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < c0074gO0.size(); i++) {
            sb2.append(c0074gO02.get(i).v0());
            sb2.append(C0098a.a(new byte[]{98, 8, 65}, new byte[]{70, 44, 101, -41, -56, 15, 90, 68}));
            C0074g c0074gO03 = c0074gO0.get(i).o0(C0098a.a(new byte[]{-67}, new byte[]{-36, 22, -8, 103, 75, -107, 101, 61}));
            int i2 = 0;
            while (i2 < c0074gO03.size()) {
                m mVar = c0074gO03.get(i2);
                String strC = mVar.c(C0098a.a(new byte[]{73, -91, -15, 111}, new byte[]{33, -41, -108, 9, 0, 85, 18, -98}));
                sb.append(mVar.v0());
                sb.append(C0098a.a(new byte[]{-62}, new byte[]{-26, -21, 101, 0, 76, -113, 17, 68}));
                sb.append(strC);
                sb.append(i2 < c0074gO03.size() - 1 ? C0098a.a(new byte[]{-53}, new byte[]{-24, -43, -55, 127, 44, -10, -3, 68}) : C0098a.a(new byte[]{36, -20, -83}, new byte[]{0, -56, -119, -36, -15, 46, -91, 70}));
                i2++;
            }
        }
        String strA = hVarE.o0(C0098a.a(new byte[]{16, -8, 38, -36, 97, -52, -80, 69, 80, -31, 58, -57, 124, -66, -116, 94, 86, -32, 50, -53, 40, -128}, new byte[]{62, -107, 95, -87, 8, -31, -45, 42})).a(C0098a.a(new byte[]{14, 38, -23, -75, -29}, new byte[]{122, 79, -99, -39, -122, 45, 43, 99}));
        String strA2 = hVarE.o0(C0098a.a(new byte[]{25, -81, 120, -26, -2, 82, 104, -41, 89, -74, 100, -3, -29, 32, 84, -52, 95, -73, 108, -15, -73, 30, 43, -122, 23, -85, 108, -12}, new byte[]{55, -62, 1, -109, -105, 127, 11, -72})).a(C0098a.a(new byte[]{27, 11, -14, -55, -54, 107, -50, 46, 24, 3, -24, -55, -117}, new byte[]{127, 106, -122, -88, -25, 4, -68, 71}));
        String strReplace = i.a(new byte[]{79, -63, 80, -25, 127, 44, 90, -121, 6, -53, 73, -89, 102, 48, 65, -102, 116, -9, 66, -84, 102, 52, 70, -126, 11, -106, 6, -71, 40, 59, 91, -122, 6, -53, 78, -96, 126, 49, 7, -40, 2}, new byte[]{43, -88, 38, -55, 18, 85, 47, -18}, hVarE).replace(C0098a.a(new byte[]{72, 68, -86, 20, -75, 113, -98, -89, 55}, new byte[]{-83, -21, 22, -14, 9, -27, 113, 27}), "");
        String strReplace2 = i.a(new byte[]{104, -15, -8, -95, -89, -40, -110, -92, 33, -5, -31, -31, -66, -60, -119, -71, 83, -57, -22, -22, -66, -64, -114, -95, 44, -90, -82, -1, -16, -49, -109, -91, 33, -5, -26, -26, -90, -59, -49, -8, 37}, new byte[]{12, -104, -114, -113, -54, -95, -25, -51}, hVarE).replace(C0098a.a(new byte[]{109, -75, 52, 69, -7, 103, -92, 104, 17}, new byte[]{-117, 9, -96, -96, 104, -1, 75, -44}), "");
        String strA3 = i.a(new byte[]{-30, 121, 88, 84, -5, -53, 124, 105, -94, 113, 77, 12, -16, -119, 116, 40, -30, 96, 68, 89, -26, -53, 97, 125, -72, 113, 69, 27, -4, -110, 100, 37, -81, 124, 72, 77, -10, -50, 61, 33}, new byte[]{-52, 20, 33, 33, -110, -26, 12, 8}, hVarE);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(strA);
        kVar.i(strA2);
        kVar.f(strReplace);
        kVar.c(strReplace2);
        kVar.e(strA3);
        kVar.j(sb2.toString());
        kVar.k(sb.toString());
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-81}, new byte[]{-98, -93, -74, 67, -6, -109, -121, 79}), C0098a.a(new byte[]{-109}, new byte[]{-95, -58, 32, 83, 111, 13, 68, 49}), C0098a.a(new byte[]{117, 65}, new byte[]{65, 112, 72, -60, 9, 6, -47, 44}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{77, 22, 5, -120, 39, -52}, new byte[]{-86, -126, -80, 109, -102, 125, 75, -74}), C0098a.a(new byte[]{-91, 19, -59, 48, -77, 125}, new byte[]{64, -102, 98, -39, 40, -5, -94, -71}), C0098a.a(new byte[]{104, 115, 112, -98, -108, 117}, new byte[]{-115, -7, -40, 120, 40, -34, 95, -124}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D466356752E14552A092C575557630F34010A3E254E79554D19200130575557638BE4CE8AE9CA4E79554D01200020104D4D61372E5701557B4C7790EADFA8EFFD574357631A774F4F55704E28594F0C6302774F4F55A4E6FD91D2EBA6E5D2574357631A774F4F55744E28594F0C6302774F4F55A6E4E493ECF2A6E5D2574357631A774F4F55774E28594F573A4E3B575557638BF2E48ACEFA8BDCF24D5B614E23575557635B770843573A4E3B575557638AD4E589F7D78BDCF24D5B614E235755576354770843573A4E3B575557638ADDED8BCDC88BDCF24D5B614E235755576355770843573A4E3B5755576389C3E98AFEE68BDCF24D5B614E23575557635D6557125B6117771B4D4D614EB2CFC592FCF9B2FCE8556D4C77034D4D614E64444D0A6D4C2E5701557B4C7790E6D0A7EFD092E6F06340755719557B4C77445D553C40750E4D196356755788FDEE8BE8DF88FEC64E79554D01635675575C476311795514552F4E6F554D92CBC4B2E1D490C8EB77594F55374E6F554D44734E2828122A6D4C77474D4D61372E570412384E6F554D142018303C0B556D4C771B0E1A244E6F554D90F0D7B0EBE4556D4C77030E1B3409774F4F2C3A4E3B5755576389D0DD86F4E94E79554D01635675575D553C40750E4D196356755788C9CF89DCD24D5B614E23575557635D6057125B6117771B4D4D614EBCEAC692C8CB77594F55374E6F554D46774E28594F0C6302774F4F55A7FBF090E6D06340755719557B4C77445C553C40750E4D196356755787FCF089DCD24D5B614E23575557635F6157125B6117771B4D4D614EB0D1F992C8CB77594F55374E6F554D46754E28594F0C6302774F4F55A7DFE590E6D06340755719557B4C774756553C40750E4D19635675578AF2F788EEE38AFEE64E79554D01635675575C4F63110808320A"));
        h hVarE = l.e(C0197c.l(a, a()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{111, 67, 109, 0, 12, -96, 118, 43, 37, 66, 125, 6, 17, -46, 95, 38, 46, 86}, new byte[]{65, 46, 20, 117, 101, -115, 0, 68}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList2.size() > 11) {
                break;
            }
            j.a(a + mVar.o0(C0098a.a(new byte[]{28}, new byte[]{125, 100, -113, -74, 58, 23, -86, -47})).a(C0098a.a(new byte[]{-103, -100, -79, -71}, new byte[]{-15, -18, -44, -33, 103, -64, -80, -117})), mVar.o0(C0098a.a(new byte[]{-78}, new byte[]{-45, -106, -25, -100, -76, 63, -82, 57})).a(C0098a.a(new byte[]{4, -25, 119, 5, -100}, new byte[]{112, -114, 3, 105, -7, 46, 123, -9})), mVar.o0(C0098a.a(new byte[]{-77}, new byte[]{-46, 5, 56, 85, 69, 2, 18, 38})).a(C0098a.a(new byte[]{82, -73, -16, 46, -91, -68, -55, 88, 81, -65, -22, 46, -28}, new byte[]{54, -42, -124, 79, -120, -45, -69, 49})), y.b(new byte[]{-90, 120, 103, 105, -53, 38, 117, 72, -4}, new byte[]{-120, 8, 14, 10, -26, 82, 16, 48}, mVar), arrayList2);
        }
        return com.github.catvod.spider.merge.c.h.v(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(a + str2);
        hVar.l();
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        C0074g c0074gO0 = l.e(C0197c.l(a + C0098a.a(new byte[]{-79, 77, -94, -43, 75, -65, 44, 61, -18, 86, -73, -117, 74, -71, 37, 97, -3, 86, -80, -37, 75, -72, 121}, new byte[]{-98, 62, -57, -76, 57, -36, 68, 19}) + URLEncoder.encode(str), a())).o0(C0098a.a(new byte[]{-83, -60, 40, -97, 69, 98, 42, 46, -25, -59, 56, -103, 88, 16, 3, 44, -26, -51, 56, -117, 12, 113, 124, 45, -22}, new byte[]{-125, -87, 81, -22, 44, 79, 92, 65}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gO0) {
            j.a(a + mVar.o0(C0098a.a(new byte[]{100}, new byte[]{5, 84, -100, 71, 9, 123, 112, -35})).a(C0098a.a(new byte[]{96, 68, -73, -4}, new byte[]{8, 54, -46, -102, -30, -98, -105, 28})), mVar.o0(C0098a.a(new byte[]{25}, new byte[]{120, 104, -3, 58, 51, 9, -102, -115})).a(C0098a.a(new byte[]{68, 2, 59, -97, -99}, new byte[]{48, 107, 79, -13, -8, 95, 56, -16})), mVar.o0(C0098a.a(new byte[]{2}, new byte[]{99, -31, -50, -49, -83, 55, -111, -71})).a(C0098a.a(new byte[]{121, 30, 52, 121, -52, 57, 28, -77, 122, 22, 46, 121, -115}, new byte[]{29, 127, 64, 24, -31, 86, 110, -38})), y.b(new byte[]{88, 117, 91, 48, 115, 122, 94, -91, 2}, new byte[]{118, 5, 50, 83, 94, 14, 59, -35}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
