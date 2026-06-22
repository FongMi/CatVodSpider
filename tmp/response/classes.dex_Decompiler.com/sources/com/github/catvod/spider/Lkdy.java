package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.M.F;
import com.github.catvod.spider.merge.M.l1;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Lkdy extends Spider {
    private static String b = C0098a.a(new byte[]{-77, -14, 104, 24, -43, -107, -27, -54, -73, -19, 106, 7, -62, -127, -89, -128}, new byte[]{-37, -122, 28, 104, -90, -81, -54, -27});
    private JSONObject a;

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{26, -80, -99, -104, -121, -84, -18, -124, 33, -73}, new byte[]{79, -61, -8, -22, -86, -19, -119, -31}), C0098a.a(new byte[]{120, 64, -67, -39, 29, -93, 8, -47, 0, 1, -9, -112, 89, -104, 0, -112, 81, 64, -80, -61, 81, -127, 61, -34, 4, 31, -23, -128, 74, -17, 62, -105, 91, 25, -13, -117, 81, -73, 95, -54, 28, 15, -122, -64, 1, -93, 12, -87, 80, 77, -116, -39, 5, -32, 92, -51, 2, 1, -12, -122, 81, -25, 34, -74, 97, 98, -117, -100, 81, -93, 0, -107, 80, 15, -128, -43, 18, -92, 6, -41, 21, 108, -81, -62, 30, -94, 12, -47, 4, 30, -16, -98, 65, -31, 89, -48, 5, 15, -108, -47, 23, -82, 27, -105, 26, 26, -12, -121, 95, -4, 95}, new byte[]{53, 47, -57, -80, 113, -49, 105, -2}));
        map.put(C0098a.a(new byte[]{-38, 69, 56, -102, 106, 66, 107}, new byte[]{-120, 32, 94, -1, 24, 39, 25, 122}), b);
        map.put(C0098a.a(new byte[]{-27, -88, 63, 4, 22, -99, 108, -18, -59, -91, 59, 20, 7, -114, 36}, new byte[]{-92, -53, 92, 97, 102, -23, 65, -94}), C0098a.a(new byte[]{15, -81, -71, 91, -39, -30, -3, 125, 78, -74, -87, 40, -71, -9}, new byte[]{117, -57, -108, 24, -105, -50, -121, 21}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get(C0098a.a(new byte[]{35, 69, 52, -85, -55, -10}, new byte[]{64, 36, 64, -50, -128, -110, 106, 75})) != null) {
            str = map.get(C0098a.a(new byte[]{104, -56, -31, 45, -109, -5}, new byte[]{11, -87, -107, 72, -38, -97, 104, -100}));
        }
        String str3 = map.get(C0098a.a(new byte[]{62, 123, 44, 61}, new byte[]{71, 30, 77, 79, -17, -105, -102, 26})) == null ? "" : map.get(C0098a.a(new byte[]{107, -21, -71, -60}, new byte[]{18, -114, -40, -74, 12, -111, 67, 15}));
        return h.q(parseVodList(l.e(C0197c.l(b + String.format(C0098a.a(new byte[]{-3, -20, 0, 70, 59, -95, -68, -22, -1, -78, 77, 90, 97, -93, -76, -76, -1, -78, 77, 90, 97, -93, -76, -68, -95, -79, 0, 93, 33, -30}, new byte[]{-46, -97, 104, 41, 76, -114, -103, -103}), str, map.get(C0098a.a(new byte[]{78, 82}, new byte[]{44, 43, 28, -13, -16, 16, -89, 64})) != null ? map.get(C0098a.a(new byte[]{-28, 75}, new byte[]{-122, 50, 126, 10, -121, -115, 1, -79})) : "", str2, str3), a())).o0(C0098a.a(new byte[]{-40, -90, -11, 43, 35, 46, -73, -125, -102, -65, -13, 61, 98, 37, -69, -42}, new byte[]{-10, -42, -128, 73, 79, 71, -44, -82}))));
    }

    public String detailContent(List<String> list) {
        int i;
        String str;
        String strB;
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{61, -5, 83, 22, 104, -5, -94, -110, 116, -29, 16, 14, 105, -25, -70, -48, 99, -10, 92, 27}, new byte[]{19, -102, 61, 98, 0, -108, -50, -3}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{-65, -18, 46, 58, -124, 21, -84, -94, -66, -11, 117, 99, -123, 3, -75, -94, -66, -11, 120, 117, -39, 17, -78, -69, -85, -30, 42, 57, -124, 14, -84, -74, -66}, new byte[]{-37, -121, 88, 20, -9, 98, -59, -46}));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < c0074gO0.size(); i2++) {
            sb2.append(c0074gO02.get(i2).v0());
            sb2.append(C0098a.a(new byte[]{-112, 111, 102}, new byte[]{-76, 75, 66, -43, -70, -53, 107, -62}));
            C0074g c0074gO03 = c0074gO0.get(i2).o0(C0098a.a(new byte[]{-82}, new byte[]{-49, 86, 4, -24, 11, -19, -118, 61}));
            int i3 = 0;
            while (i3 < c0074gO03.size()) {
                m mVar = c0074gO03.get(i3);
                String strC = mVar.c(C0098a.a(new byte[]{118, -122, 70, -72}, new byte[]{30, -12, 35, -34, -1, -99, 114, 45}));
                sb.append(mVar.v0());
                sb.append(C0098a.a(new byte[]{-28}, new byte[]{-64, 1, -108, -81, 57, 18, 64, -79}));
                sb.append(strC);
                sb.append(i3 < c0074gO03.size() - 1 ? C0098a.a(new byte[]{-82}, new byte[]{-115, 29, 74, -76, 12, 125, 33, -1}) : C0098a.a(new byte[]{-88, 56, 80}, new byte[]{-116, 28, 116, -67, 73, 29, -118, -48}));
                i3++;
            }
        }
        String strA = i.a(new byte[]{65, -90, -11, -90, 64, 72, 71, -29, 4, -4, -75, -77, 67, 12, 87, -17, 93, -7, -66}, new byte[]{41, -107, -37, -43, 44, 33, 35, -122}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{-108, -72, 109, -21, 40, -11, 114, -117, -54, -75, 107}, new byte[]{-70, -36, 8, -97, 73, -100, 30, -90})).a(C0098a.a(new byte[]{-81, -23, 88, -5, -88, 26, 122, -78}, new byte[]{-53, -120, 44, -102, -123, 105, 8, -47}));
        String strA3 = i.a(new byte[]{-68, -80, -122, -116, -91, -99, -100, 58, -13, -79, -114, -116, -74}, new byte[]{-97, -40, -29, -27, -62, -11, -24, 101}, hVarE);
        String strA4 = i.a(new byte[]{89, -25, -70, 123, -51, 16, 115, -26, 30, -19, -71, 96, -116, 71, 63, -81, 30, -11, -15, 124, -64, 16, 123, -82, 90, -22, -79, 105, -61, 67, 124, -92, 25, -9, -66, 102, -62, 10, 55, 46, -40, 63, 57, -77, 56, 89, 37, -30, 87, -67, -1, 110}, new byte[]{119, -125, -33, 15, -84, 121, 31, -53}, hVarE);
        String strA5 = i.a(new byte[]{42, -22, -65, 5, 70, 6, -88, 56, 109, -32, -68, 30, 7, 81, -28, 113, 109, -8, -12, 2, 75, 6, -96, 112, 41, -25, -76, 23, 72, 85, -89, 122, 106, -6, -69, 24, 73, 28, -20, -13, -72, 26, 63, -32, -65, 79, -2, 60, 36, -80, -6, 16}, new byte[]{4, -114, -38, 113, 39, 111, -60, 21}, hVarE);
        String strA6 = i.a(new byte[]{-70, -60, 12, 102, -102, -79, -36, 46, -3, -50, 15, 125, -37, -26, -112, 103, -3, -42, 71, 97, -105, -79, -44, 102, -71, -55, 7, 116, -108, -30, -45, 108, -6, -44, 8, 123, -107, -85, -104, -26, 48, 39, -113, -95, 83, -8, -118, 42}, new byte[]{-108, -96, 105, 18, -5, -40, -80, 3}, hVarE);
        C0074g c0074gG = hVarE.o0(C0098a.a(new byte[]{-82, 20, 82, 103, -32, -10, -5, -88, -23, 30, 81, 124}, new byte[]{-128, 112, 55, 19, -127, -97, -105, -123})).g(C0098a.a(new byte[]{120, 7, 10, -128, 69, -37, -1, -5, 56, 18, 9, -55, 15, -51, -66, -5, 50, 17, 75, -128, 79, -40, -67, -65, 36, 17, 11, -120, 83, -43, -95}, new byte[]{86, 116, 102, -23, 33, -66, -46, -110}));
        String str2 = "";
        if (c0074gG.size() >= 3) {
            String strB2 = y.b(new byte[]{106}, new byte[]{11, 126, -8, -110, 94, -78, 62, -75}, c0074gG.get(2));
            String strB3 = y.b(new byte[]{47}, new byte[]{78, 16, -28, 28, 114, 40, 84, -45}, c0074gG.get(0));
            i = 0;
            strB = y.b(new byte[]{52}, new byte[]{85, 12, 36, -59, 112, 87, 114, 43}, c0074gG.get(1));
            str2 = strB3;
            str = strB2;
        } else {
            i = 0;
            str = "";
            strB = str;
        }
        k kVar = new k();
        kVar.g(list.get(i));
        kVar.i(strA2);
        kVar.n(str2);
        kVar.h(strA);
        kVar.d(strB);
        kVar.c(strA5);
        kVar.l(strA6);
        kVar.e(strA3);
        kVar.f(strA4);
        kVar.b(str);
        kVar.j(sb2.toString());
        kVar.k(sb.toString());
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(b, a()));
        Iterator itD = C0133t.d(new byte[]{16, -52, 94, 121, 90, 115, -107, 56, 23, -115, 7, 120, 76, 106, -107, 56, 23, -128, 78, 42, 65, 115, -59, 99, 69, -63}, new byte[]{101, -96, 112, 10, 45, 26, -27, 93}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (mVar.c(C0098a.a(new byte[]{-64, 104, -79, -94}, new byte[]{-88, 26, -44, -60, 28, 1, -84, -28})).startsWith(C0098a.a(new byte[]{40, 64, 36, -126, -1, -127}, new byte[]{7, 51, 76, -19, -120, -82, 7, -74}))) {
                arrayList.add(new C0135a(mVar.c(C0098a.a(new byte[]{-52, -113, -47, -67}, new byte[]{-92, -3, -76, -37, -80, -44, 92, -63})).replaceAll(C0098a.a(new byte[]{30, -43, -21}, new byte[]{66, -111, -64, -16, 17, -81, -98, 114}), ""), mVar.v0()));
            }
        }
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D4663560E0E4D1C2415774F4D0E240D275743552F0D38104D4D6389ECC18BCCFC4E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E28594F0C6302774F4D45715E60574355374E6F575D477359770843573A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F8C1A8FBE1574355374E6F571B1E2C097708430C6302774F4D93FBD6B3C5FB556D4E23575555290521064D0A6D17771B4D4D6384FAF18AFFC74E795719557B4E26160005244E2828122A6D4E6757552C3A4E3E1016557B4E36141B12080877594D19200130575555A6DDEE90F1FC634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E23575555734E285914552F4E6F578AECFC88EFD28AFEE64E795719557B4E64464D0A6D17771B4D4D638AEDDA8AF8F189DCD24D5B631A774F4D46754E285914552F4E6F5789E0E485CADC8AFEE64E795719557B4E64404D0A6D17771B4D4D638AF9D288C9CF89DCD24D5B631A774F4D46774E285914552F4E6F578AF2F788EEE38AFEE64E795719557B4E67454D0A1C11790E4D1C2415774F4D0E240D275743552F0D38104D4D6389ECC18BCCFC4E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E28594F0C6302774F4D45715E60574355374E6F575D477359770843573A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F8C1A8FBE1574355374E6F571B1E2C097708430C6302774F4D93FBD6B3C5FB556D4E23575555290521064D0A6D17771B4D4D6384FAF18AFFC74E795719557B4E26160005244E2828122A6D4E6657552C3A4E3E1016557B4E2C100E056340771B0E1A244E6F578ACEF588EEC84D5B631A34191A1263560E0E4D1963567790EADFA8EFFD574355374E6F574D0A6D4C2E5701557B4E67455D42634077034D4D635E65475A553C40750E4D19635677475F45754E795719557B4E67455D436311790E4D19635677475F45724E795719557B4E67455D446311790E4D19635677475F45734E795719557B4E67455D456311790E4D19635677475F45704E795719557B4E67455D466311790E4D19635677475F45714E795719557B4E67455D476311790E4D19635677475F46784E795719557B4E67455E4E6311790E4D19635677475F46794E795719557B4E67455E4F6311790E4D19635677475F46764E795719557B4E67455E406311790E4D19635677475F46774E795719557B4E67455E416311790E4D19635677475F46744E795719557B4E67455E426311790E4D19635677475F46754E795719557B4E67455E436311790E4D19635677475F46724E795719557B4E67455E446311790E4D19635677475F46734E795719557B4E67455E456311790E4D19635677475F46704E795719557B4E67455E466311790E4D19635677475F46714E795719557B4E67455E4763110808430C6307300C4D4D630E2C5743552F0D38104D4D638ADBE78ACDCE4E795719162D193057552C3A4E3B575555A7FBE39CF8C3634077034D4D63183C180A553C402E5701557B4EB1CFD591F1F877594D016356771D0603324E285914552F4E6F5787D8C589DDF34D5B631A774F4D04220327104D0A1C1108594D4363560E0E4D1C2415774F4D0E240D275743552F0D38104D4D6389ECC18BCCFC4E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E28594F0C6302774F4D45715E60574355374E6F575D477359770843573A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F8C1A8FBE1574355374E6F571B1E2C097708430C6302774F4D93FBD6B3C5FB556D4E23575555290521064D0A6D17771B4D4D6384FAF18AFFC74E795719557B4E26160005244E2828122A3C"));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-89, -60, -34, 44, -95, -63, 43, 8, -27, -35, -40, 58, -32, -54, 39, 93}, new byte[]{-119, -76, -85, 78, -51, -88, 72, 37}));
        return h.v(arrayList, parseVodList(new C0074g(c0074gO0.subList(0, Math.min(c0074gO0.size(), 12)))), jSONObject);
    }

    public void init(Context context, String str) {
        if (!str.isEmpty()) {
            b = str;
        }
        try {
            this.a = C0207D.h(b, a());
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public List<k> parseVodList(C0074g c0074g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074g) {
            j.a(b + mVar.o0(C0098a.a(new byte[]{78, -6, -115, -44, -68, 29, 97, -66, 12, -29, -117, -62, -3, 16, 107, -27, 64, -76, -40, -41}, new byte[]{96, -118, -8, -74, -48, 116, 2, -109})).a(C0098a.a(new byte[]{124, -77, -56, -101}, new byte[]{20, -63, -83, -3, -20, 116, -58, 77})), mVar.o0(C0098a.a(new byte[]{-92, -115, -89, -8, -56, -40, 24, 7, -26, -108, -95, -18, -119, -43, 18, 92, -86, -61, -14, -5}, new byte[]{-118, -3, -46, -102, -92, -79, 123, 42})).a(C0098a.a(new byte[]{22, 42, 17, 87, 103}, new byte[]{98, 67, 101, 59, 2, -18, 65, 66})), mVar.o0(C0098a.a(new byte[]{-67, -14, 0}, new byte[]{-44, -97, 103, 2, -23, -125, 0, -66})).a(C0098a.a(new byte[]{-47, -29, -102, -72, 66, 69, 17, 0}, new byte[]{-75, -126, -18, -39, 111, 54, 99, 99})), y.b(new byte[]{-69, 109, 43, 126, 8, -20, 78, -54, -7, 116, 45, 104, 73, -10, 88, -123, -31, 116, 42, 112, 1}, new byte[]{-107, 29, 94, 28, 100, -123, 45, -25}, mVar), arrayList);
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-108, -6, 28, -8, -28, -102, 3, 73, -123, -9, 28, -68, -87, -58, 118, 23, -51, -86, 82, -14, -30, -102, 53, 88, -112, -88}, new byte[]{-28, -106, 125, -127, -127, -24, 92, 40})).matcher(C0197c.l(C0133t.a(new StringBuilder(), b, str2), a()));
        JSONObject jSONObject = new JSONObject(matcher.find() ? matcher.group(1) : "");
        String strReplace = jSONObject.getString(C0098a.a(new byte[]{-37, 40, 68}, new byte[]{-82, 90, 40, -102, 5, -77, -58, -60})).replace(C0098a.a(new byte[]{-92}, new byte[]{-8, 119, -106, 72, -41, -55, 112, -37}), "");
        if (strReplace.contains(C0098a.a(new byte[]{105, 19, -121, -32, 111}, new byte[]{71, 126, -76, -107, 87, 78, 4, 6})) || strReplace.contains(C0098a.a(new byte[]{-36, 53, 71, -94}, new byte[]{-14, 88, 55, -106, -125, -85, 23, -23}))) {
            h hVar = new h();
            hVar.y(strReplace);
            hVar.f(a());
            return hVar.toString();
        }
        String string = this.a.getJSONObject(jSONObject.getString(C0098a.a(new byte[]{43, -56, -107, 96}, new byte[]{77, -70, -6, 13, -89, 51, -124, -10}))).getString(C0098a.a(new byte[]{9, -87, 91, -39, -32}, new byte[]{121, -56, 41, -86, -123, 83, 117, 49}));
        h hVar2 = new h();
        hVar2.y(string + strReplace);
        hVar2.l();
        hVar2.f(a());
        return hVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        C0074g c0074gO0 = new F(new l1()).e(C0197c.l(b + C0098a.a(new byte[]{-55, 58, 86, -109, 68, 105, -9, -73, -114, 35, 23, -123, 82, 98, -10, -82, -120, 55, 93, -113, 15, 105, -76, -85, -39, 36, 92, -54}, new byte[]{-26, 83, 56, -9, 33, 17, -39, -57}) + URLEncoder.encode(str), a()), "").o0(C0098a.a(new byte[]{-73, 98, 56, 113}, new byte[]{-34, 22, 93, 28, -30, -67, 110, 62}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gO0) {
            String strH = mVar.o0(C0098a.a(new byte[]{-76, -47, 63, -52, -13}, new byte[]{-64, -72, 75, -96, -106, -66, 99, 13})).h();
            String strD = oZP.d("55");
            String str2 = strH.split(strD)[0];
            String strB = y.b(new byte[]{-22, -116, 43, -30}, new byte[]{-122, -27, 69, -119, 6, 51, -97, -99}, mVar);
            String[] strArrSplit = mVar.o0(C0098a.a(new byte[]{29, 124, -30, -85, -42}, new byte[]{105, 21, -106, -57, -77, -94, 85, 40})).h().split(strD, 2);
            j.a(strB, str2, C0098a.a(new byte[]{121, 74, -104, 88, -128, -8, 42, -119, 120, 83, -117, 6, -98, -89, 108, -52, 100, 68, -122, 6, -123, -85, 117, -119, 69, 87, -127, 79, -122, -80, 105, -43, 62, 12, -36, 26, -57, -19, 53, -97, 62, 6, -114, 30, -112, -11, 50, -59, 115, 14, -39, 73, -64, -9, 48, -98, 33, 16, -123, 75, -100}, new byte[]{17, 62, -20, 40, -13, -62, 5, -90}), strArrSplit.length > 1 ? strArrSplit[1] : "", arrayList);
        }
        return h.q(arrayList);
    }
}
