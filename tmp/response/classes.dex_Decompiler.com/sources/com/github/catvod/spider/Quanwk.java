package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Quanwk extends Spider {
    private String a;
    private String b;

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{-69, 12, -45, 18, 38, 71, -103, 31, -128, 11}, new byte[]{-18, 127, -74, 96, 11, 6, -2, 122}), C0098a.a(new byte[]{115, 61, 102, 103, 102, 68, -80, 3, 11, 124, 44, 46, 34, 100, -72, 66, 75, 42, 39, 46, 75, 70, -75, 94, 81, 59, 120, 46, 51, 19, -15, 104, 106, 99, 37, 62, 59, 105, -15, 110, 75, 59, 112, 106, 37, 120, -128, 31, 127, 124, 45, 55, 58, 31, -31, 25, 16, 98, 44, 61, 49, 8, -90, 90, 23, 114, 93, 126, 122, 68, -76, 123, 91, 48, 87, 103, 126, 7, -28, 31, 9, 124, 47, 56, 42, 0, -102, 100, 106, 31, 80, 34, 42, 68, -72, 71, 91, 114, 91, 107, 105, 67, -66, 5, 30, 4, 121, 124, 121, 65, -66, 66, 17, 102, 50, 62, 42, 107, -71, 94, 81, 63, 121, 33, 51, 25, -1, 28, 16, 102, 40, 57, 56, 6, -32, 29, 10, 114, 81, 97, 104, 65, -67, 73, 30, 1, 125, 104, 107, 90, -72, 3, 11, 97, 43, 32, 57, 30}, new byte[]{62, 82, 28, 14, 10, 40, -47, 44}));
        map.put(C0098a.a(new byte[]{10, 43, 19, -101, -91, -95, -127}, new byte[]{88, 78, 117, -2, -41, -60, -13, -30}), this.a);
        map.put(C0098a.a(new byte[]{-118, 13, -6, -97, -3, -98, 2, -118, -86, 0, -2, -113, -20, -115, 74}, new byte[]{-53, 110, -103, -6, -115, -22, 47, -58}), C0098a.a(new byte[]{31, -60, -93, -52, -60, 39, -87, -105, 94, -35, -77, -65, -92, 50}, new byte[]{101, -84, -114, -113, -118, 11, -45, -1}));
        if (!TextUtils.isEmpty(this.b)) {
            map.put(C0098a.a(new byte[]{-26, 13, 106, 10, 25, -15}, new byte[]{-91, 98, 5, 97, 112, -108, 36, -7}), this.b);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get(C0098a.a(new byte[]{-35, 44, -19, -16, 11, 120}, new byte[]{-66, 77, -103, -107, 66, 28, 23, 69})) != null) {
            str = map.get(C0098a.a(new byte[]{75, -81, 116, -29, -66, 122}, new byte[]{40, -50, 0, -122, -9, 30, -21, 124}));
        }
        return h.q(parseVodList(l.e(C0197c.l(this.a + String.format(C0098a.a(new byte[]{-40, -105, -37, 64, -109, -30, 53, 70, -38, -55, -98, 2, -55, -32, 61, 24, -46, -105, -98, 2, -55, -29, 120, 65, -102, -120}, new byte[]{-9, -28, -77, 47, -28, -51, 16, 53}), str, str2), a())).o0(C0098a.a(new byte[]{115, -2, -15, -38, 99, 112, -108, 7, 57, -31, -20, -36, 126, 2, -67, 1, 41, -24, -24}, new byte[]{93, -115, -123, -81, 10, 93, -30, 104}))));
    }

    public String detailContent(List<String> list) {
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-31, 92, 83, -86, 26, -63, -41, -110, -95, 91, 66, -79, 7, -77, -21, -115, -93, 78, 94, -77, 26, -97, -64}, new byte[]{-49, 47, 39, -33, 115, -20, -76, -3}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{-87, -77, -50, 119, -102, 96, -118, 102, -23, -82, -33, 110, -84, 18, -110, 98, -26, -92, -102, 60, -45, 37, -55}, new byte[]{-121, -64, -70, 2, -13, 77, -6, 7}));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < c0074gO0.size(); i++) {
            sb2.append(c0074gO02.get(i).v0());
            sb2.append(C0098a.a(new byte[]{-27, -4, 95}, new byte[]{-63, -40, 123, 51, -57, -103, 126, -42}));
            C0074g c0074gO03 = c0074gO0.get(i).o0(C0098a.a(new byte[]{-11}, new byte[]{-108, 21, 59, 125, 125, -29, -104, 120}));
            int i2 = 0;
            while (i2 < c0074gO03.size()) {
                m mVar = c0074gO03.get(i2);
                String strC = mVar.c(C0098a.a(new byte[]{105, 111, -128, 50}, new byte[]{1, 29, -27, 84, -118, -97, -97, -110}));
                sb.append(mVar.v0());
                sb.append(C0098a.a(new byte[]{35}, new byte[]{7, -80, -38, 87, 9, -41, 76, -114}));
                sb.append(strC);
                sb.append(i2 < c0074gO03.size() - 1 ? C0098a.a(new byte[]{-94}, new byte[]{-127, -61, -62, 55, -99, 40, -54, 13}) : C0098a.a(new byte[]{-121, 47, 91}, new byte[]{-93, 11, 127, -90, 44, -119, -78, -73}));
                i2++;
            }
        }
        String strA = hVarE.o0(C0098a.a(new byte[]{-128, -57, 5, -106, 38, 99, 60, 126, -64, -64, 20, -115, 59, 17, 0, 101, -58, -63, 28, -127, 111, 47}, new byte[]{-82, -76, 113, -29, 79, 78, 95, 17})).a(C0098a.a(new byte[]{-123, 104, -79, -111, 99}, new byte[]{-15, 1, -59, -3, 6, -92, 107, 1}));
        String strA2 = hVarE.o0(C0098a.a(new byte[]{21, 41, -6, -75, 70, 95, -33, 72, 85, 46, -21, -82, 91, 45, -29, 83, 83, 47, -29, -94, 15, 19, -100, 25, 27, 51, -29, -89}, new byte[]{59, 90, -114, -64, 47, 114, -68, 39})).a(C0098a.a(new byte[]{14, 72, -63, -18, -69, -9, 2, -113, 13, 64, -37, -18, -6}, new byte[]{106, 41, -75, -113, -106, -104, 112, -26}));
        String strA3 = i.a(new byte[]{123, -109, -43, 16, 78, -34, -9, 49, 59, -108, -60, 11, 83, -84, -53, 58, 48, -108, -64, 12, 75, -45, -28, 112, 49, -127, -43, 4, 29, -99, -32, 54, 120, -125, -55, 12, 75, -105, -68, 108, 124}, new byte[]{85, -32, -95, 101, 39, -13, -108, 94}, hVarE);
        String strReplace = i.a(new byte[]{8, -53, -38, 105, 107, 9, -80, -58, 72, -52, -53, 114, 118, 123, -116, -51, 67, -52, -49, 117, 110, 4, -93, -121, 66, -39, -38, 125, 56, 74, -89, -63, 11, -37, -58, 117, 110, 64, -5, -100, 15}, new byte[]{38, -72, -82, 28, 2, 36, -45, -87}, hVarE).replace(C0098a.a(new byte[]{-31, -27, -72, -100, -18, 3, -87, -58, -100}, new byte[]{6, 84, 3, 121, 112, -120, 70, 122}), "");
        String strReplace2 = i.a(new byte[]{-107, 56, -54, -43, -89, -82, -42, 65, -43, 63, -37, -50, -70, -36, -22, 74, -34, 63, -33, -55, -94, -93, -59, 0, -33, 42, -54, -63, -12, -19, -63, 70, -106, 40, -42, -55, -94, -25, -99, 29, -110}, new byte[]{-69, 75, -66, -96, -50, -125, -75, 46}, hVarE).replace(C0098a.a(new byte[]{101, -58, -114, -8, -43, 86, -62, 14, 27}, new byte[]{-127, 126, 53, 30, 105, -62, 45, -78}), "");
        String strReplace3 = i.a(new byte[]{-60, 22, 93, -100, 113, 70, 111, 75, -124, 17, 76, -121, 108, 52, 83, 64, -113, 17, 72, -128, 116, 75, 124, 10, -114, 4, 93, -120, 34, 5, 120, 76, -57, 6, 65, -128, 116, 15, 36, 16, -61}, new byte[]{-22, 101, 41, -23, 24, 107, 12, 36}, hVarE).replace(C0098a.a(new byte[]{46, 104, 124, 99, -123, 67, -48, -107, 81}, new byte[]{-53, -57, -64, -123, 57, -41, 63, 41}), "");
        String str = C0098a.a(new byte[]{-92, -114, 108, -96, 55, -104, -62, 114, -14, -36, 92, -8, 81, -80, -113, 26, -34, -101, 57, -52, 36, -54, -84, 106, -91, -67, 119, 121, 92, -116, -99, 29, -56, -128, 56, -40, 12, -57, -107, 89, -85, -104, 89, -86, 22, -78, -49, 65, -4, -38, 78, -55, 87, -93, -95, 27, -61, -76, 56, -19, 52, -57, -111, 115, 121}, new byte[]{67, 63, -33, 67, -76, 35, 42, -8}) + hVarE.o0(C0098a.a(new byte[]{79, 61, 124, 74, 65, -36, 124, 47, 15, 58, 109, 81, 92, -82, 64, 36, 4, 61, 107}, new byte[]{97, 78, 8, 63, 40, -15, 31, 64})).h();
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(strA);
        kVar.i(strA2);
        kVar.b(strReplace);
        kVar.c(strReplace2);
        kVar.e(str);
        kVar.l(strA3);
        kVar.f(strReplace3);
        kVar.j(sb2.toString());
        kVar.k(sb.toString());
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-72}, new byte[]{-119, -120, -118, 107, 105, 105, 74, -79}), C0098a.a(new byte[]{109}, new byte[]{95, 15, 56, -67, 64, 28, -3, 68}), C0098a.a(new byte[]{100}, new byte[]{87, -56, -32, -87, 119, 121, -76, 55}), C0098a.a(new byte[]{63}, new byte[]{11, -119, -54, 114, 68, 7, 112, 104}), C0098a.a(new byte[]{-104, -42}, new byte[]{-86, -18, -125, 83, 110, -36, -32, -116}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{33, -109, -80, -4, -45, 20}, new byte[]{-58, 7, 5, 25, 110, -91, 14, 111}), C0098a.a(new byte[]{57, 49, 3, -60, 127, -2, 11, 28, 118}, new byte[]{-47, -114, -99, 35, -60, 83, -18, -107}), C0098a.a(new byte[]{-8, 100, -91, -37, 86, -92}, new byte[]{31, -33, 25, 51, -33, 30, 112, -62}), C0098a.a(new byte[]{119, -42, -11, -89, 62, -99}, new byte[]{-110, 92, 93, 65, -126, 54, 110, -70}), C0098a.a(new byte[]{-107, -112, -49, 86, -7, 85}, new byte[]{114, 15, 98, -77, 112, -14, -81, 24}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D466356752E14552A092C575557630F34010A3E254E79554D19200130575557638BE4CE8AE9CA4E79554D01200020104D4D61372E5701557B4C7790EADFA8EFFD574357631A774F4F556311795514552F4E6F554D92CBC4B1C8F390C8EB77594F55374E6F554D416311795514552F4E6F554D92D7F0B0FCC890C8EB77594F55374E6F554D406311795514552F4E6F554D90C9DDB3F6EA90C8EB77594F55374E6F554D4F6311795514552F4E6F554D90E6FDB0CCD490C8EB77594F55374E6F554D4E6311795514552F4E6F554D91C0FCB3F5F990C8EB77594F55374E6F554D46714E28594F0C6302774F4F55A4E5F293ECF2A6E5D2574357631A774F4F55705D770843573A4E3B575557638ADDED8BCDC88BDCF24D5B614E23575557635D6757125B6117771B4D4D614EB0D0E892F8D7B2FCE8556D4C77034D4D614E67444D0A6D4C2E5701557B4C7792D5DDA4D1C092E6F06340755719557B4C77475D553C40750E4D196356755789F5ED8BC3E488FEC64E79554D01635675575D446311795514552F4E6F554D90CBC3B2C8C590C8EB77594F55374E6F554D45774E28594F0C6302774F4F55A7EFDF93EDEDA6E5D2574357631A774F4F55735B7708320A1C4075575D557B4C0E0E4D1C2415774F4F55220D211026136340755701162C09774F4F55A6DDEE90F1FC6340755719162D19305755571A17771B4D4D614EB0F0C79EC2C477594F55374E6F554D553C40750E4D19635675578AECFC88EFD28AFEE64E79554D01635675575E446311795514552F4E6F554D91F9C3B0FADF92C8CB77594F55374E6F554D46754E28594F0C6302774F4F55A7FBF09CF0DEA4E5F2574357631A774F4F557059770843573A4E3B575557638AF9D288C9CF89DCD24D5B614E23575557635D6357125B6117771B4D4D614EB3C0D892E5FAB0FCC8556D4C77034D4D614E67454D0A1C110808"));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        C0074g c0074gO0 = l.e(C0197c.l(C0133t.b(new byte[]{124}, new byte[]{83, 15, -63, -36, 67, 102, 0, -33}, sb), a())).o0(C0098a.a(new byte[]{44, 22, 84, 111, 97, 27, -23, 62, 102, 9, 73, 105, 124, 105, -64, 56, 118, 0, 77}, new byte[]{2, 101, 32, 26, 8, 54, -97, 81}));
        return h.v(arrayList, parseVodList(new C0074g(c0074gO0.subList(0, Math.min(c0074gO0.size(), 5)))), jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        this.a = str;
    }

    public List<k> parseVodList(C0074g c0074g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074g) {
            j.a(this.a + mVar.o0(C0098a.a(new byte[]{6}, new byte[]{103, 10, 95, 37, 10, -58, -67, -107})).a(C0098a.a(new byte[]{-29, 22, -14, 33}, new byte[]{-117, 100, -105, 71, 115, -45, -93, -108})), mVar.o0(C0098a.a(new byte[]{-123}, new byte[]{-28, -98, -100, 22, -83, -69, 28, 25})).a(C0098a.a(new byte[]{-80, 57, -95, 39, -98}, new byte[]{-60, 80, -43, 75, -5, 115, 117, -73})), mVar.o0(C0098a.a(new byte[]{-8}, new byte[]{-103, 117, 106, -92, 63, 124, -31, -15})).a(C0098a.a(new byte[]{127, -83, 30, -59, -4, -6, 2, 103, 124, -91, 4, -59, -67}, new byte[]{27, -52, 106, -92, -47, -107, 112, 14})), y.b(new byte[]{-63, 16, -102, 42, -73, 121, -19, 39, -101}, new byte[]{-17, 96, -13, 73, -102, 13, -120, 95}, mVar), arrayList);
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        C0199e c0199eB = C0197c.b(C0133t.a(new StringBuilder(), this.a, str2), a());
        List<String> list2 = c0199eB.c().get(C0098a.a(new byte[]{8, -111, -26, -48, -29, 126, -48, 83, 18, -111}, new byte[]{123, -12, -110, -3, -128, 17, -65, 56}));
        if (!(list2 == null) && !list2.isEmpty()) {
            this.b = list2.get(0);
        }
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{117, -32, 26, -63, -53, 71, 81, 50, 100, -19, 26, -123, -122, 27, 36, 108, 44, -80, 84, -53, -51, 71, 103, 35, 113, -78}, new byte[]{5, -116, 123, -72, -82, 53, 14, 83})).matcher(c0199eB.a());
        JSONObject jSONObject = new JSONObject(matcher.find() ? matcher.group(1) : "");
        String strReplace = jSONObject.getString(C0098a.a(new byte[]{-14, -120, 110}, new byte[]{-121, -6, 2, 27, -9, -115, -123, -22})).replace(C0098a.a(new byte[]{-78}, new byte[]{-18, -94, -7, -32, -75, -21, -125, -45}), "");
        if (strReplace.contains(C0098a.a(new byte[]{-111, 97, -86, 109, -75}, new byte[]{-65, 12, -103, 24, -115, 9, -108, 87})) || strReplace.contains(C0098a.a(new byte[]{-1, 34, -29, -47, -62}, new byte[]{-47, 74, -105, -68, -82, -111, -42, -58}))) {
            h hVar = new h();
            hVar.y(strReplace);
            hVar.f(a());
            return hVar.toString();
        }
        String string = jSONObject.getString(C0098a.a(new byte[]{-66, 60, 101, -77}, new byte[]{-40, 78, 10, -34, 56, -115, 82, 28}));
        String str3 = C0098a.a(new byte[]{-94, -108, 39, -74, 2, -32}, new byte[]{-124, -16, 70, -62, 99, -35, 76, -99}) + jSONObject.getString(C0098a.a(new byte[]{84, -36, 35, -2, -49, -52, 64, 90, 69}, new byte[]{36, -80, 66, -121, -112, -88, 33, 46}));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        v.a(new byte[]{94, -101, 31, -73, -121, -8, -14, 69, 1, -124, 10, -81, -106, -29, -66}, new byte[]{113, -24, 107, -42, -13, -111, -111, 106}, sb, string);
        Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{-121, 100, -120, -23, -110, 14, 60, -111, -53, 63, -52}, new byte[]{-12, 22, -21, -44, -80, 38, 18, -69})).matcher(C0197c.l(C0133t.b(new byte[]{97, -89, 80}, new byte[]{79, -51, 35, 118, 104, 76, 56, 93}, sb), a()));
        String strK = com.github.catvod.spider.merge.D.h.k(C0197c.l((matcher2.find() ? matcher2.group(1) : "") + strReplace + C0098a.a(new byte[]{12, -96, -119, -8, -4, -45}, new byte[]{42, -44, -16, -120, -103, -18, -31, -31}) + string + str3, a()), C0098a.a(new byte[]{-39, 31, 120, -59, -61, 41, 67, 93, -113, 67, 42, -62}, new byte[]{-81, 126, 10, -27, -74, 91, 47, 46}), C0098a.a(new byte[]{-87}, new byte[]{-114, 60, 78, -86, 28, -101, -120, 77}));
        h hVar2 = new h();
        hVar2.y(strK);
        hVar2.f(a());
        return hVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        return h.q(parseVodList(l.e(C0197c.l(this.a + C0098a.a(new byte[]{38, 16, 101, 103, -128, -74, 27, -49, 36, 78, 45, 43, -33, -8, 94, -51, 36, 78, 45, 43, -33, -5, 27, -108, 100, 15, 63, 113, -106, -24}, new byte[]{9, 99, 0, 6, -14, -43, 115, -32}) + URLEncoder.encode(str), a())).o0(C0098a.a(new byte[]{-57, 111, 15, 13, -10, -23, 73, -19, -115, 112, 18, 11, -21, -101, 96, -21, -99, 121, 22}, new byte[]{-23, 28, 123, 120, -97, -60, 63, -126}))));
    }
}
