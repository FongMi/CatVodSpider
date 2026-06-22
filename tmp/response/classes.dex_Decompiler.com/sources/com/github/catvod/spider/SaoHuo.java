package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
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
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class SaoHuo extends Spider {
    private String a;
    String b = "";

    public SaoHuo() {
        C0098a.a(new byte[]{109, -99, 67, -9, 125, 61, 76, -35, 50, -122, 86, -87, 124, 61, 76, -106, 33, -123, 103, -43, 50, 61, 76, -106, 33, -123, 0, -26, 110, 57, 65, -50, 100, -99, 67, -9, 125, 61, 76, -121, 59, -98, 67, -85, 41, 49, 86, -105, 39, -100, 27, -80, 123, 55, 64, -50, 100, -113, 84, -13, 110, 99, 2, -118, 39, -113, 84, -85, 41, 50, 65, -121, 54, -117, 84, -85, 41, 39, 81, -118, 35, -128, 27, -80, 124, 42, 69, -121, 39, -45, 0, -5, 96, 48, 65, -118, 127, -56, 80, -13, 125, 99, 2, -103, 51, -45}, new byte[]{66, -18, 38, -106, 15, 94, 36, -13});
    }

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{124, -116, 76, -84, -84, 89, 66, -72, 71, -117}, new byte[]{41, -1, 41, -34, -127, 24, 37, -35}), C0098a.a(new byte[]{-125, 4, 26, 91, 20, -125, 44, 112, -5, 69, 80, 18, 80, -93, 36, 49, -69, 19, 91, 18, 57, -127, 41, 45, -95, 2, 4, 18, 65, -44, 109, 30, -126, 37, 77, 115, 52, -33, 125, 127, -116, 30, 9, 94, 28, -64, 29, 14, -3, 41, 78, 3, 65, -33, 117, 111, -1, 69, 80, 7, 74, -41, 124, 107, -2, 93, 91, 18, 15, -103, 100, 127, -113, 27, 16, 94, 29, -72, 40, 61, -123, 2, 20, 29, 77, -36, 122, 113, -3, 93, 64, 26, 51, -89, 25, 18, -126, 71, 64, 94, 17, -124, 40, 127, -119, 14, 3, 89, 23, -58, 109, 9, -85, 25, 19, 91, 23, -127, 98, 107, -32, 91, 64, 113, 16, -99, 34, 50, -85, 68, 89, 3, 86, -33, 99, 107, -6, 92, 82, 28, 73, -34, 121, 127, -99, 10, 6, 83, 10, -122, 98, 106, -3, 92, 78, 1, 78}, new byte[]{-50, 107, 96, 50, 120, -17, 77, 95}));
        map.put(C0098a.a(new byte[]{55, 8, -52, 105, -101, -106, 123, -117, 55, 5, -56, 121, -118, -123, 51}, new byte[]{86, 107, -81, 12, -21, -30, 86, -25}), C0098a.a(new byte[]{-31, -108, -21, 111, 120, 87, 62, 33, -96, -115, -5, 28, 24, 66, 104, 44, -11, -47, -109, 127, 13, 10, 121, 121, -75, -60, -22, 73, 88, 64, 53, 116, -85, -46, -15}, new byte[]{-101, -4, -58, 44, 54, 123, 68, 73}));
        if (!TextUtils.isEmpty(this.b)) {
            map.put(C0098a.a(new byte[]{-111, 121, -63, -13, 40, -37}, new byte[]{-46, 22, -82, -104, 65, -66, 46, -68}), this.b);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        h hVarE = l.e(C0197c.l(this.a + String.format(C0098a.a(new byte[]{50, -31, 68, -42, 119, -16, -113, -123, 48, -88, 94, -117, 107, -85, -57, -102}, new byte[]{29, -115, 45, -91, 3, -33, -86, -10}), str, str2), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-88, -48, -92, -15, -31, 93, -61, 78, -88, -48, -92, -12, -27, 73}, new byte[]{-122, -90, -5, -99, -120, 46, -73, 110}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(this.a + mVar.o0(C0098a.a(new byte[]{-54}, new byte[]{-85, -27, 49, -14, -63, -2, -6, -13})).a(C0098a.a(new byte[]{-123, -31, -109, -32}, new byte[]{-19, -109, -10, -122, 1, -22, -34, 107})), mVar.o0(C0098a.a(new byte[]{-103}, new byte[]{-8, -126, 63, 70, -47, 98, -83, 91})).a(C0098a.a(new byte[]{-70, 100, -94, 43, 46}, new byte[]{-50, 13, -42, 71, 75, 85, -44, -123})), mVar.o0(C0098a.a(new byte[]{124, 49, -10}, new byte[]{21, 92, -111, 91, -50, 41, 80, -7})).a(C0098a.a(new byte[]{79, -85, 87, 93, -109, -62, -39, -48, 76, -93, 77, 93, -46}, new byte[]{43, -54, 35, 60, -66, -83, -85, -71})), y.b(new byte[]{-70, 6, 58, 18, -118, 0, -54}, new byte[]{-108, 112, 101, 124, -27, 116, -81, -59}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        char c = 0;
        h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{49, 69, 51, 126, -128, -37, 35, 125, 124, 94, 127, 115, -112}, new byte[]{18, 53, 95, 31, -7, -124, 79, 20}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{113, -84, 64, -41, -43, 101, -108, -125, 48, -79, 12, -61, -64, 20, -108, -125, 48, -79, 115, -38, -59, 73, -122, -47, 51, -75}, new byte[]{95, -36, 44, -74, -84, 58, -14, -15}));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < c0074gO0.size()) {
            String strV0 = c0074gO02.get(i).v0();
            ArrayList arrayList = new ArrayList();
            m mVar = c0074gO0.get(i);
            byte[] bArr = new byte[1];
            bArr[c] = 111;
            C0074g c0074gO03 = mVar.o0(C0098a.a(bArr, new byte[]{14, 106, 106, -98, 105, 119, -93, 59}));
            int size = c0074gO03.size() - 1;
            while (size >= 0) {
                String strC = c0074gO03.get(size).c(C0098a.a(new byte[]{21, -78, -80, 63}, new byte[]{125, -64, -43, 89, 59, -65, 93, -44}));
                StringBuilder sbC = C0133t.c(c0074gO03.get(size).v0());
                byte[] bArr2 = new byte[1];
                bArr2[c] = 70;
                sbC.append(C0098a.a(bArr2, new byte[]{98, 85, 98, 8, 104, 21, 79, 67}));
                sbC.append(strC);
                arrayList.add(sbC.toString());
                size--;
                c = 0;
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strV0, TextUtils.join(C0098a.a(new byte[]{-24}, new byte[]{-53, 79, -91, 3, 44, 62, 18, 85}), arrayList));
            }
            i++;
            c = 0;
        }
        String strA = i.a(new byte[]{51, -41, 71, 70, 125, -55, 3, -24, 55, -125}, new byte[]{91, -26, 105, 48, 34, -67, 106, -100}, hVarE);
        StringBuilder sbC2 = C0133t.c(URLDecoder.decode(new String(Base64.getDecoder().decode(C0098a.a(new byte[]{-55, 70, 104, -96, 88, 22, 31, 126, -54, 59, 90, -66, 88, 82, 98, 34, -54, 96, 8, -99, 90, 123, 49, 26, -54, 96, 104, -93, 35, 87, 57, 63, -117, 36, 116, -128, 26, 9, 53, 43, -118, 64, 112, -29, 3, 71, 57, 39, -105, 122, 78, -91, 7, 71, 7, 124, -119, 36, 116, -98, 5, 87, 31, 8, -106, 36, 108, -115, 5, 9, 53, 60, -104, 64, 112, -5, 5, 9, 123, 113, -110, 104, 30, -15}, new byte[]{-1, 15, 35, -52, 108, 34, 80, 73}))), C0098a.a(new byte[]{46, 13, 23, -38, 89}, new byte[]{123, 89, 81, -9, 97, 52, -109, 42})));
        sbC2.append(hVarE.o0(C0098a.a(new byte[]{-27, -63, -58, -73, -39, 55, -95}, new byte[]{-107, -17, -74, -24, -83, 79, -43, -64})).h());
        String string = sbC2.toString();
        String[] strArrSplit = i.a(new byte[]{91, -40, -61, -9, -34, -114, -8, -76, 23, -63, -28, -66, -64}, new byte[]{117, -82, -100, -98, -80, -24, -105, -21}, hVarE).split(C0098a.a(new byte[]{40, 22, -24, 24, 21, -56, -47, -75, -100, 3, -76, -35, -107, 84, -45, -79, -77, -33, 116, 105, -128}, new byte[]{8, 57, -56, -3, -70, 116, 55, 9}));
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        String str3 = strArrSplit[2];
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(strA);
        kVar.b(str);
        kVar.c(str3);
        kVar.e(string);
        kVar.f(str2);
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-14, -80, 75}, new byte[]{-42, -108, 111, 70, 108, -9, 24, 37}), linkedHashMap.keySet()));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{-41, 83, 22}, new byte[]{-13, 119, 50, -120, -91, 111, -122, 104}), linkedHashMap.values()));
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{-25, -56, 114, -77, 113, -105, -83, 95, -36, -49}, new byte[]{-78, -69, 23, -63, 92, -42, -54, 58}), C0098a.a(new byte[]{-116, 83, -18, -8, 97, -103, -43, 22, -12, 18, -92, -79, 37, -71, -35, 87, -76, 68, -81, -79, 76, -101, -48, 75, -82, 85, -16, -79, 52, -50, -108, 120, -115, 114, -71, -48, 65, -59, -124, 25, -125, 73, -3, -3, 105, -38, -28, 104, -14, 126, -70, -96, 52, -59, -116, 9, -16, 18, -92, -92, 63, -51, -123, 13, -15, 10, -81, -79, 122, -125, -99, 25, -128, 76, -28, -3, 104, -94, -47, 91, -118, 85, -32, -66, 56, -58, -125, 23, -14, 10, -76, -71, 70, -67, -32, 116, -115, 16, -76, -3, 100, -98, -47, 25, -122, 89, -9, -6, 98, -36, -108, 111, -92, 78, -25, -8, 98, -101, -101, 13, -17, 12, -76, -46, 101, -121, -37, 84, -92, 19, -83, -96, 35, -59, -102, 13, -11, 11, -90, -65, 60, -60, -128, 25, -110, 93, -14, -16, 127, -100, -101, 12, -14, 11, -70, -94, 59}, new byte[]{-63, 60, -108, -111, 13, -11, -76, 57}));
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-113}, new byte[]{-66, -108, 80, -117, -40, -81, 41, 90}), C0098a.a(new byte[]{-1}, new byte[]{-51, -126, 89, 120, 102, 53, -41, 55}), C0098a.a(new byte[]{71, 26}, new byte[]{117, 42, -127, 54, 47, -81, -93, 109}), C0098a.a(new byte[]{20}, new byte[]{32, -86, 108, 108, 120, 108, 99, -56}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{-67, -24, -52, -76, 105, 98}, new byte[]{90, 124, 121, 81, -44, -45, -25, 12}), C0098a.a(new byte[]{-23, 34, -61, 71, 73, -14, 83, -84, -87}, new byte[]{14, -74, 118, -81, -18, 116, -74, 37}), C0098a.a(new byte[]{28, 76, 123, 69, -121, 57, 47, -13, 94}, new byte[]{-7, -41, -58, -95, 61, -98, -54, 122}), C0098a.a(new byte[]{73, -44, 116, 64, -41, 70}, new byte[]{-84, 94, -36, -90, 107, -19, -22, 32}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D466356752E14552A092C575557630F34010A3E254E79554D19200130575557638BE4CE8AE9CA4E79554D01200020104D4D61372E5701557B4C7790EADFA8EFFD574357631A774F4F55704E28594F0C6302774F4F55A4FAC990E6D06340755719557B4C77434D0A6D4C2E5701557B4C7792E7C6A7EFD0574357631A774F4F55764E28594F0C6302774F4F55A7EDC593EFE16340755719557B4C774D4D0A6D4C2E5701557B4C7790E5DFA5D1C9574357631A774F4F55784E28594F0C6302774F4F55A6CBC490D6CC6340755719557B4C77445F553C40750E4D196356755789FFD988EFFC4D5B614E23575557635D6457125B6117771B4D4D614EB2FFC090FCC677594F55374E6F554D46734E28594F0C6302774F4F55A4E6FD92FBCC6340755719557B4C77445C553C40750E4D19635675578AD2C689ECCE4D5B614E23575557635D6157125B6117771B4D4D614EB0FCC891C2E977594F55374E6F554D46744E28594F0C6302774F4F55A4EAC79CF6DE6340755719557B4C774459553C40750E4D196356755789F5ED8BC3E44D5B614E23575557635D6257125B6117771B4D4D614EB3F6E591C3F677594F55374E6F554D46794E28594F0C6302774F4F55A4E9E391D4E16340755719557B4C77475F553C3128284355734E6F55340C6307300C4D4D614E36141B12080877594F552F0D38104D4D614EB2C4D492DFE777594F55370D39000A557B4C0E0E4D19635675578AF2E985D6DD4D5B614E23575557635E770843573A4E3B5755576389CEC88BCDE689DCD24D5B614E23575557635E6557125B6117771B4D4D614E01232D556D4C77034D4D614E67444D0A6D4C2E5701557B4C779CF0DEA4E5F2574357631A774F4F55735E770843573A4E3B575557638BEBFB8AFEE64E79554D01635675575D446311795514552F4E6F554D91D6C9B0FCC8556D4C77034D4D614E67414D0A6D4C2E5701557B4C779DE4C6A4E5F2574357631A774F4F557359770843573A4E3B5755576389DAC58AFEE64E79554D01635675575D416311795514552F4E6F554D92C4DAB1CEF9556D4C77034D4D614E67424D0A1C1108594D446356752E14552A092C575557630F34010A3E254E79554D19200130575557638BE4CE8AE9CA4E79554D01200020104D4D61372E5701557B4C7790EADFA8EFFD574357631A774F4F55754E28594F0C6302774F4F55A7FCCB92C3E66340755719557B4C774657553C40750E4D196356755789F6CA8BDDC44D5B614E23575557635F6C57125B6117771B4D4D614EB2F6C29FE0EC77594F55374E6F554D43714E28594F0C6302774F4F55A7CCE993F9E06340755719557B4C77415E553C40750E4D196356755788C9CF89E5E48AD2F24E79554D01635675575B456311795514552F4E6F554D9EECF8B3C6FA556D4C77034D4D614E61464D0A6D4C2E5701557B4C7793F3CDA7E4CD574357631A774F4F557558770843573A4E3B575557638AF5D48AECEC4E79554D01635675575B426311795514552F4E6F554D93FBDEB0D8FF556D4C77034D4D614E61434D0A6D4C2E5701557B4C7792C4D2A9C3C8574357631A774F4F55755B770843573A4E3B5755576389D3E786EEE84E79554D01635675575B4F6311795514552F4E6F554D90DDF3B1CFD5556D4C77034D4D614E614C4D0A6D4C2E5701557B4C7739203B084E79554D01635675575A476311795514552F4E6F554D92C4DAB1CEF9556D4C77034D4D614E60444D0A1C110808"));
        C0199e c0199eB = C0197c.b(this.a, mapA);
        List<String> list = c0199eB.c().get(C0098a.a(new byte[]{10, 30, -32, -27, 99, 77, -16, 62, 16, 30}, new byte[]{121, 123, -108, -56, 0, 34, -97, 85}));
        if (!(list == null) && !list.isEmpty()) {
            this.b = list.get(0);
        }
        h hVarE = l.e(c0199eB.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-78, 18, 69, 8, 118, -78, 28, -44, -78, 18, 69, 13, 114, -90}, new byte[]{-100, 100, 26, 100, 31, -63, 104, -12}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList2.size() > 5) {
                break;
            }
            j.a(this.a + mVar.o0(C0098a.a(new byte[]{89}, new byte[]{56, -17, 78, 36, 60, -104, -125, -33})).a(C0098a.a(new byte[]{22, 18, 16, 83}, new byte[]{126, 96, 117, 53, 21, 65, 23, 108})), mVar.o0(C0098a.a(new byte[]{-30}, new byte[]{-125, 126, 45, 3, -119, -50, 95, 92})).a(C0098a.a(new byte[]{-86, 33, -31, 89, -119}, new byte[]{-34, 72, -107, 53, -20, 124, -19, -8})), mVar.o0(C0098a.a(new byte[]{4, 21, -67}, new byte[]{109, 120, -38, -92, 69, -37, -100, -83})).a(C0098a.a(new byte[]{39, -75, 95, 61, -32, 96, 71, -111, 36, -67, 69, 61, -95}, new byte[]{67, -44, 43, 92, -51, 15, 53, -8})), y.b(new byte[]{-72, -53, 14, 105, -45, 17, 103}, new byte[]{-106, -67, 81, 7, -68, 101, 2, 45}, mVar), arrayList2);
        }
        return com.github.catvod.spider.merge.c.h.v(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{58, 70, -45, -14, 41, 53, 30, -122, 1, 65}, new byte[]{111, 53, -74, -128, 4, 116, 121, -29}), C0098a.a(new byte[]{-70, -72, -121, -87, -64, 81, 71, -58, -62, -7, -51, -32, -124, 106, 79, -121, -109, -72, -118, -77, -116, 115, 114, -55, -58, -25, -45, -16, -105, 29, 113, -128, -103, -31, -55, -5, -116, 69, 16, -35, -34, -9, -68, -80, -36, 81, 67, -66, -110, -75, -74, -87, -40, 18, 19, -38, -64, -7, -50, -10, -116, 21, 109, -95, -93, -102, -79, -20, -116, 81, 79, -126, -110, -9, -70, -91, -49, 86, 73, -64, -41, -108, -107, -78, -61, 80, 67, -58, -58, -26, -54, -18, -100, 19, 22, -57, -57, -9, -82, -95, -54, 92, 84, -128, -40, -30, -50, -9, -126, 14, 16}, new byte[]{-9, -41, -3, -64, -84, 61, 38, -23}));
        super.init(context, str);
        C0074g c0074gO0 = l.e(C0197c.l(C0098a.a(new byte[]{-78, -23, 53, -89, 100, -98, -70, -56, -78, -4, 49, -89, 112, -60, -26, -108}, new byte[]{-38, -99, 65, -41, 94, -79, -107, -69}), mapA)).o0(C0098a.a(new byte[]{6, -104, 24, -72, -22, 5, 42, -115, 5, -113, 24, -90, -66, 1}, new byte[]{40, -5, 119, -42, -98, 96, 68, -7}));
        String strC = c0074gO0.isEmpty() ? "" : c0074gO0.get(0).c(C0098a.a(new byte[]{107, 67, -76, 85}, new byte[]{3, 49, -47, 51, -21, 78, -40, -55}));
        if (!strC.isEmpty()) {
            str = strC;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strA = l.e(C0197c.l(this.a.concat(str2), a())).o0(C0098a.a(new byte[]{-11, -67, 68, 61, -3, 86}, new byte[]{-100, -37, 54, 92, -112, 51, -52, -124})).a(C0098a.a(new byte[]{98, 112, -53}, new byte[]{17, 2, -88, 33, -123, -25, 32, -4}));
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(strA);
        hVar.l();
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        h hVarE = l.e(C0197c.l(this.a + C0098a.a(new byte[]{41, -47, 37, -60, -65, -52, -72, -85, 43, -113, 37, -60, -68, -119, -31, -21, 106, -99, 127, -115, -81}, new byte[]{6, -94, 8, -23, -110, -31, -107, -122}) + URLEncoder.encode(str), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{46, 123, 125, -70, 95, 89, -3, 46, 46, 123, 125, -65, 91, 77}, new byte[]{0, 13, 34, -42, 54, 42, -119, 14}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(this.a + mVar.o0(C0098a.a(new byte[]{123}, new byte[]{26, 13, -22, -6, 89, 16, -28, -84})).a(C0098a.a(new byte[]{-51, 3, -55, 81}, new byte[]{-91, 113, -84, 55, 17, -118, 16, 59})), mVar.o0(C0098a.a(new byte[]{1}, new byte[]{96, 95, 118, 44, 95, 61, -13, 58})).a(C0098a.a(new byte[]{33, 53, -75, 117, -64}, new byte[]{85, 92, -63, 25, -91, -111, -74, 83})), mVar.o0(C0098a.a(new byte[]{66, 96, -45}, new byte[]{43, 13, -76, 3, -111, 30, 64, -43})).a(C0098a.a(new byte[]{-44, -125, -13, 24, 20, 94, 71, 124, -41, -117, -23, 24, 85}, new byte[]{-80, -30, -121, 121, 57, 49, 53, 21})), y.b(new byte[]{111, 59, -51, -66, -57, -78, 32}, new byte[]{65, 77, -110, -48, -88, -58, 69, 120}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
