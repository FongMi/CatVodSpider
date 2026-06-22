package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Xlys extends Spider {
    private static String a = C0098a.a(new byte[]{-33, -113, -94, 88, 24, 25, 19, 97, -64, -116, -95, 6, 19, 79, 69, 61, -121, -54, -8, 75, 4, 78}, new byte[]{-73, -5, -42, 40, 107, 35, 60, 78});

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-24, 105, -92, 97, -94, 21, 82, -59, -45, 110}, new byte[]{-67, 26, -63, 19, -113, 84, 53, -96}), C0098a.a(new byte[]{96, -115, 29, -22, -37, -119, 56, -103, 24, -52, 87, -93, -97, -78, 48, -40, 73, -115, 16, -16, -105, -85, 13, -106, 28, -46, 73, -77, -116, -59, 14, -33, 67, -44, 83, -72, -105, -99, 111, -126, 4, -62, 38, -13, -57, -119, 60, -31, 72, -128, 44, -22, -61, -54, 108, -123, 26, -52, 84, -75, -105, -51, 18, -2, 121, -81, 43, -81, -105, -119, 48, -35, 72, -62, 32, -26, -44, -114, 54, -97, 13, -95, 15, -15, -40, -120, 60, -103, 28, -45, 80, -83, -121, -53, 105, -104, 29, -62, 52, -30, -47, -124, 43, -33, 2, -41, 84, -76, -103, -42, 111}, new byte[]{45, -30, 103, -125, -73, -27, 89, -74}));
        map.put(C0098a.a(new byte[]{123, -5, -9, -48, 27, 88, 7, -19, 91, -10, -13, -64, 10, 75, 79}, new byte[]{58, -104, -108, -75, 107, 44, 42, -95}), C0098a.a(new byte[]{-112, -14, -92, 42, -30, -2, -89, -13, -47, -21, -76, 89, -126, -21}, new byte[]{-22, -102, -119, 105, -84, -46, -35, -101}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = map.get(C0098a.a(new byte[]{-89, -121, 110, 2, 35, 86}, new byte[]{-60, -26, 26, 103, 106, 50, 40, 73})) == null ? str : map.get(C0098a.a(new byte[]{-57, 12, 55, 6, -23, 104}, new byte[]{-92, 109, 67, 99, -96, 12, 82, 45}));
        h hVarE = l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-15, 1, -122, 15, 42, 28, 19, -85, -31, 6, -48, 90, 60, 14, 19, -85, -8, 19, -37, 79, 56, 14, 19, -85, -8, 11, -52, 75, 43, 14, 19, -85, -8, 29, -37, 78, 60, 65, 11, -3, -83}, new byte[]{-34, 114, -87, 42, 89, 51, 54, -40}), map.get(C0098a.a(new byte[]{-80, 11, 16, -28, 81}, new byte[]{-45, 103, 113, -105, 34, -112, 39, -120})) == null ? C0098a.a(new byte[]{-47, 59, 65}, new byte[]{-80, 87, 45, 9, 24, 12, -2, -67}) : map.get(C0098a.a(new byte[]{-126, 117, 28, -85, 54}, new byte[]{-31, 25, 125, -40, 69, -44, -45, 37})), str2, str3, map.get(C0098a.a(new byte[]{17, -20, 44, 105}, new byte[]{112, -98, 73, 8, -23, -99, 21, 7})) == null ? C0098a.a(new byte[]{36, 54, 62, -17, -21, 98, 11, 68, 103, 103, 10, -116}, new byte[]{-64, -114, -109, 10, 112, -33, -18, -32}) : map.get(C0098a.a(new byte[]{-17, -11, 63, 80}, new byte[]{-114, -121, 90, 49, 93, 30, 109, -114})), map.get(C0098a.a(new byte[]{-121, -85, -3, -110}, new byte[]{-2, -50, -100, -32, -83, -83, -98, 77})) == null ? "" : map.get(C0098a.a(new byte[]{-16, 50, -3, -118}, new byte[]{-119, 87, -100, -8, 56, -96, -26, -6})), map.get(C0098a.a(new byte[]{-62, 32}, new byte[]{-96, 89, 112, 99, -46, -15, 84, 52})) != null ? map.get(C0098a.a(new byte[]{102, -52}, new byte[]{4, -75, 68, 16, 115, -80, 21, 88})) : ""), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{101, -114, -97, 91, 25, 81}, new byte[]{75, -19, -16, 55, 52, 101, -68, 78}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(a + mVar.o0(C0098a.a(new byte[]{56, 80, -127, 56, -5, -20, -12, 97, 50}, new byte[]{89, 126, -27, 21, -103, -128, -101, 2})).a(C0098a.a(new byte[]{-25, -16, -74, 97}, new byte[]{-113, -126, -45, 7, -89, -46, 47, -112})), y.b(new byte[]{-65, 126, 95, 111, 4, -58, 70, 25, -93, 36, 5, 96, 0}, new byte[]{-41, 77, 113, 12, 101, -76, 34, 52}, mVar), mVar.o0(C0098a.a(new byte[]{-83, 98, 89}, new byte[]{-60, 15, 62, -29, 34, -59, -128, -45})).a(C0098a.a(new byte[]{52, -59, 7}, new byte[]{71, -73, 100, 75, -118, 42, 51, -52})), y.b(new byte[]{99, -64, -19, 15, -28, 15, -86, 20, 41, -103, -18, 16}, new byte[]{77, -76, -120, 119, -112, 34, -40, 113}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) throws JSONException {
        JSONObject jSONObject;
        int i;
        String strJoin;
        char c;
        h hVarE = l.e(C0197c.l(list.get(0), a()));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String strC = hVarE.p0(C0098a.a(new byte[]{5, -73, -77, -125, -61, 50, 35, -95, 12, -70, -24, -52, -43, 41, 32, -84, 8, -77, -94}, new byte[]{97, -34, -59, -83, -96, 93, 79, -116})).c(C0098a.a(new byte[]{-120, 104, 11}, new byte[]{-5, 26, 104, 42, 14, -11, -119, -72}));
        String strV0 = hVarE.p0(C0098a.a(new byte[]{-35, -10, 88, -88, 67, -31, 99, -25, -41, -88, 25, -81, 5}, new byte[]{-75, -60, 118, -52, 110, -110, 14, -54})).v0();
        String strReplaceAll = i.a(new byte[]{-5, 111, 78, 24, -33, 26, -34, 119, -85, 60, 25, 21, -47, 24, -55, 51, -70, 115, 83, 15}, new byte[]{-40, 28, 55, 118, -80, 106, -83, 30}, hVarE).replaceAll(C0098a.a(new byte[]{42, -3, 122}, new byte[]{118, -114, 81, -41, 90, 117, -69, 59}), "");
        String str = i.a(new byte[]{21, 50, -110, 53, 44, 123, 33, -94, 1, 39, -35, 57, 101, 52, 48, -77, 20, 50, -97, 62, 47, 117, 52}, new byte[]{102, 66, -13, 91, 2, 25, 64, -58}, hVarE).replace(C0098a.a(new byte[]{-13, -121, -80, -48, 55, -68, -78, -29, -93, -11, -109, -126, 78, -80, -50}, new byte[]{21, 28, 4, 54, -95, 12, 84, 116}), "").split(C0098a.a(new byte[]{127}, new byte[]{82, 30, 125, -32, 102, 30, -124, 24}))[0];
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-88, 82, -36, 73, -6, 109, 90, -84, -95, 89, -121, 85}, new byte[]{-52, 59, -86, 103, -103, 2, 54, -126})).get(0).o0(C0098a.a(new byte[]{8}, new byte[]{120, -51, -33, -72, 0, 44, -62, 72}));
        int i2 = 0;
        String str2 = "";
        String strSubstring = str2;
        String str3 = strSubstring;
        String strJoin2 = str3;
        String strV02 = strJoin2;
        while (true) {
            jSONObject = jSONObject2;
            if (i2 >= c0074gO0.size()) {
                break;
            }
            m mVar = c0074gO0.get(i2);
            C0074g c0074g = c0074gO0;
            h hVar = hVarE;
            String strV03 = mVar.p0(C0098a.a(new byte[]{-44, -78, 39, -47, 1, 41}, new byte[]{-89, -58, 85, -66, 111, 78, -120, -92})).v0();
            String str4 = strReplaceAll;
            if (strV03.equals(C0098a.a(new byte[]{-72, 113, 92, -94, -49, -53, -40, 35, -59}, new byte[]{95, -64, -25, 71, 81, 64, 55, -97}))) {
                ArrayList arrayList = new ArrayList();
                C0074g c0074gO02 = mVar.o0(C0098a.a(new byte[]{17}, new byte[]{112, -52, -3, -22, -92, 33, 58, 112}));
                for (int i3 = 0; i3 < c0074gO02.size(); i3++) {
                    arrayList.add(c0074gO02.get(i3).v0());
                }
                str2 = C0098a.a(new byte[]{-20, 117, 85, -97, -7, -77, -1, -68, -111}, new byte[]{11, -60, -18, 122, 103, 56, 16, 0}) + TextUtils.join(C0098a.a(new byte[]{-126}, new byte[]{-82, 104, -124, 76, -40, 103, -39, -97}), arrayList);
            } else if (strV03.contains(C0098a.a(new byte[]{-11, -74, 32, -46, 55, 115}, new byte[]{16, 42, -112, 55, -69, -55, 41, 44}))) {
                strSubstring = mVar.v0().substring(mVar.v0().indexOf(C0098a.a(new byte[]{-2}, new byte[]{-91, 70, 106, 14, 112, -49, 115, -93})) + 1, mVar.v0().indexOf(C0098a.a(new byte[]{37}, new byte[]{120, -53, -116, -58, 50, -114, 30, -79})));
            } else if (strV03.contains(C0098a.a(new byte[]{-125, 53, -48, 121, -108, 56}, new byte[]{107, -124, 86, -98, 7, -101, 101, -105}))) {
                str3 = C0098a.a(new byte[]{-104, 37, 127, 94, -14, -72, 126}, new byte[]{112, -108, -7, -71, 97, 27, 68, -40}) + mVar.v0();
            } else if (strV03.contains(C0098a.a(new byte[]{-100, 120, -41, 10, -113, 40, 31, 73, -29}, new byte[]{121, -41, 107, -20, 51, -68, -16, -11}))) {
                strV02 = mVar.p0(C0098a.a(new byte[]{21}, new byte[]{116, -54, -54, 106, 125, -77, 56, -55})).v0();
            } else if (strV03.contains(C0098a.a(new byte[]{-50, 9, -66, 54, 31, -14, -100, 11, -80}, new byte[]{42, -79, 5, -48, -93, 102, 115, -73}))) {
                ArrayList arrayList2 = new ArrayList();
                C0074g c0074gO03 = mVar.o0(C0098a.a(new byte[]{-94}, new byte[]{-61, -68, -33, -16, 107, -67, -32, 73}));
                for (int i4 = 0; i4 < c0074gO03.size(); i4++) {
                    arrayList2.add(c0074gO03.get(i4).v0());
                }
                strJoin2 = TextUtils.join(C0098a.a(new byte[]{-39}, new byte[]{-11, -11, -52, 9, 34, 60, 76, 43}), arrayList2);
            }
            i2++;
            jSONObject2 = jSONObject;
            c0074gO0 = c0074g;
            hVarE = hVar;
            strReplaceAll = str4;
        }
        jSONObject3.put(C0098a.a(new byte[]{-115, 53, 100, -14, 93, -76}, new byte[]{-5, 90, 0, -83, 52, -48, 67, -8}), list.get(0));
        jSONObject3.put(C0098a.a(new byte[]{-111, -55, -52, 121, -24, 55, 93, 8}, new byte[]{-25, -90, -88, 38, -122, 86, 48, 109}), strV0);
        jSONObject3.put(C0098a.a(new byte[]{113, 100, -26, 58, -64, -38, 35}, new byte[]{7, 11, -126, 101, -80, -77, 64, -84}), strC);
        jSONObject3.put(C0098a.a(new byte[]{-61, 103, -55, 116, -54, -34, -114, 58, -46}, new byte[]{-73, 30, -71, 17, -107, -80, -17, 87}), str2);
        jSONObject3.put(C0098a.a(new byte[]{-49, -32, -18, 118, 124, -82, -56, 18}, new byte[]{-71, -113, -118, 41, 5, -53, -87, 96}), str);
        jSONObject3.put(C0098a.a(new byte[]{86, -5, 40, 100, -22, 92, -7, -84}, new byte[]{32, -108, 76, 59, -117, 46, -100, -51}), strSubstring);
        jSONObject3.put(C0098a.a(new byte[]{18, 97, -44, -17, 92, 9, -57, 89, 22, 101, -61}, new byte[]{100, 14, -80, -80, 46, 108, -86, 56}), str3);
        jSONObject3.put(C0098a.a(new byte[]{-6, -76, -85, -112, -102, -35, 65, 111, -2}, new byte[]{-116, -37, -49, -49, -5, -66, 53, 0}), strJoin2);
        jSONObject3.put(C0098a.a(new byte[]{-76, -82, -67, -42, -80, 118, 10, 83, -95, -75, -74, -5}, new byte[]{-62, -63, -39, -119, -44, 31, 120, 54}), strV02);
        jSONObject3.put(C0098a.a(new byte[]{-88, -60, 80, 126, 89, -101, -77, -50, -69, -59, 64}, new byte[]{-34, -85, 52, 33, 58, -12, -35, -70}), strReplaceAll);
        TreeMap treeMap = new TreeMap();
        C0074g c0074gO04 = hVarE.o0(C0098a.a(new byte[]{7, -123, -25, 46, 40, 77, -81, 68, 8, -122, -10, 43, 51, 2, -65, 85}, new byte[]{102, -85, -123, 90, 70, 99, -51, 48}));
        String strA = C0098a.a(new byte[]{-36, 43, 4, 111, -84, 59, 33, -40, -106, 110, 17, 52}, new byte[]{59, -120, -123, -118, 38, -96, -57, 74});
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < c0074gO04.size(); i5++) {
            m mVar2 = c0074gO04.get(i5);
            String strC2 = mVar2.c(C0098a.a(new byte[]{-8, -4, -63, 54}, new byte[]{-112, -114, -92, 80, 69, 65, -1, -37}));
            if (strC2.contains(C0098a.a(new byte[]{-30, 82, 21, 54, 58, 49, -16, -40, -31, 69}, new byte[]{-88, 1, 80, 101, 105, 120, -65, -106}))) {
                c = 0;
                strC2 = strC2.substring(0, strC2.indexOf(C0098a.a(new byte[]{45}, new byte[]{22, 64, -11, -125, 108, 13, -69, 35})));
            } else {
                c = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(mVar2.v0());
            byte[] bArr = new byte[1];
            bArr[c] = 94;
            sb.append(C0098a.a(bArr, new byte[]{122, -64, -123, 80, -81, -126, -128, 25}));
            sb.append(strC2);
            arrayList3.add(sb.toString());
        }
        if (arrayList3.size() > 0) {
            i = 8;
            strJoin = TextUtils.join(C0098a.a(new byte[]{-104}, new byte[]{-69, 27, -25, 68, -40, -77, 99, -106}), arrayList3);
        } else {
            i = 8;
            strJoin = strV02;
        }
        treeMap.put(strA, strJoin);
        if (treeMap.size() > 0) {
            byte[] bArr2 = new byte[i];
            // fill-array-data instruction
            bArr2[0] = -10;
            bArr2[1] = -127;
            bArr2[2] = -64;
            bArr2[3] = -94;
            bArr2[4] = 112;
            bArr2[5] = -52;
            bArr2[6] = 67;
            bArr2[7] = -125;
            String strJoin3 = TextUtils.join(C0098a.a(new byte[]{-46, -91, -28}, bArr2), treeMap.keySet());
            byte[] bArr3 = new byte[i];
            // fill-array-data instruction
            bArr3[0] = -115;
            bArr3[1] = 106;
            bArr3[2] = 74;
            bArr3[3] = 75;
            bArr3[4] = -36;
            bArr3[5] = 124;
            bArr3[6] = -89;
            bArr3[7] = -40;
            String strJoin4 = TextUtils.join(C0098a.a(new byte[]{-87, 78, 110}, bArr3), treeMap.values());
            byte[] bArr4 = new byte[i];
            // fill-array-data instruction
            bArr4[0] = -2;
            bArr4[1] = -83;
            bArr4[2] = 69;
            bArr4[3] = 75;
            bArr4[4] = -62;
            bArr4[5] = 48;
            bArr4[6] = 110;
            bArr4[7] = 27;
            jSONObject3.put(C0098a.a(new byte[]{-120, -62, 33, 20, -78, 92, 15, 98, -95, -53, 55, 36, -81}, bArr4), strJoin3);
            byte[] bArr5 = new byte[i];
            // fill-array-data instruction
            bArr5[0] = -48;
            bArr5[1] = 59;
            bArr5[2] = -42;
            bArr5[3] = 37;
            bArr5[4] = 123;
            bArr5[5] = 73;
            bArr5[6] = -10;
            bArr5[7] = -82;
            jSONObject3.put(C0098a.a(new byte[]{-90, 84, -78, 122, 11, 37, -105, -41, -113, 78, -92, 73}, bArr5), strJoin4);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        byte[] bArr6 = new byte[i];
        // fill-array-data instruction
        bArr6[0] = -127;
        bArr6[1] = -113;
        bArr6[2] = -103;
        bArr6[3] = -124;
        bArr6[4] = -128;
        bArr6[5] = 75;
        bArr6[6] = -91;
        bArr6[7] = -76;
        jSONObject.put(C0098a.a(new byte[]{-19, -26, -22, -16}, bArr6), jSONArray);
        return jSONObject.toString();
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{11}, new byte[]{59, 11, -105, 41, 103, -51, 101, 95}), C0098a.a(new byte[]{-102}, new byte[]{-85, -6, 44, 110, -116, 126, 116, 46}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{-29, 104, 73, -110, 53, -9}, new byte[]{4, -4, -4, 119, -120, 70, 67, -90}), C0098a.a(new byte[]{-16, -9, 49, -95, -2, -42, 27, 28, -80}, new byte[]{23, 99, -124, 73, 89, 80, -2, -107}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D4763560E0E4D1C2415774F4D142D0D26064D5B630234180A557B4EB2C4D492DFE777594D01200020104D4D1A17771B4D4D6389D0DD86F4E94E795719557B4E341903553C402E5701557B4EB0FFC793FCF077594D016356771100192616201A4D0A6D17771B4D4D638BDDC489F4C44E795719557B4E341C1E1E2F0B7708430C6302774F4D92D7F0B0FCC8556D4E2357555539053F004D0A6D17771B4D4D638BF2E48ACEFA4E795719557B4E3E10070220027708430C6302774F4D91C0FCB3F5F9556D4E235755552A033B120D026311790E4D1963567793E7EFA5D6DC574355374E6F57151F20022F1D0A19264E285914552F4E6F5789DAE788EBD54D5B631A774F4D0034143C144D0A6D17771B4D4D6385F8E18ACEFA4E795719557B4E381A070220027708430C6302774F4D92C8CBB3F6EA556D4E235755552B19241C01106311790E4D1963567790E5DFA6F8EE574355374E6F570B182F0B3D000E553C402E5701557B4EB3F6E591C3F677594D016356771F0619261F3A1B08553C402E5701557B4E66314D5B631A774F4D44054E285914552F4E6F5788F6FF85CFCB4D5B631A774F4D0D20053B1401553C402E5701557B4EB3F7C390D7FD77594D016356770D1A162F153C57125B3A4E3B575555A9C1F390E3DD634077034D4D63063C1B081124057708430C6302774F4D91D7EBBDFCD5556D4E2357555536093B0C06553C402E5701557B4EBCE8FD91D9C977594D01635677040619260F3D0001553C402E5701557B4EB0F3FD9ED8C577594D01635677180E183905341B4D0A6D17771B4D4D638BDFDA88CAEB4E795719557B4E3314010D34057708430C6302774F4D90FBC6B0C8FA556D4E235755552B0539004D0A6D17771B4D4D6389DAD187D4C44E795719557B4E3200151F340D3B124D0A6D17771B4D4D6389F0F28ACEFA4E795719557B4E241C070220027708430C6302774F4D92DAD1BDDAC2556D4E2357555526193A0C1A553C402E5701557B4EB2CED39FC8D677594D016356770F001926153C57125B3A4E3B575555A4E2D390E0C5634077034D4D63003C06071E6311790E4D196356779DD0E7A4E6FD574355374E6F5716022F083A1B08553C402E5701557B4EB0FBF092C9F7B0FBE492C9DA77594D016356770C1A162F0F3D000E19264E285914552F4E6F5788C9CF89DCD24D5B631A774F4D1A24053F004D0A6D17771B4D4D6385CADC8AFEE64E795719557B4E3D14011D344E285914552F4E6F578AECFC88EFD288E3F484F2F38AFEE64E795719557B4E3200001D344E285914552F4E6F5789E0E489DCD24D5B631A774F4D0528062057125B3A4E3B575555A9E7E490E6D0634077034D4D63153C1B081D344E285914552F4E6F578AC9F689DCD24D5B631A774F4D1324062057125B3A4E3B575555A5D3D190E6D0634077034D4D63093F004D0A6D17771B4D4D6389E2C18AFEE64E795719557B4E371405026311790E4D1963567790E5D7A4E5F2574355374E6F57051E20062057125B3A4E3B575555A9C9EA90E6D0634077034D4D630D3B1C1C1F6311790E4D1963567793EBF8A4C8F290E7DEA4E5F2574355374E6F57161E250D391C05026311790E4D1963567793DCC7A4E5F2574355374E6F571B1628062057125B3A4E3B575555A7D4FA90E0C7A4E5F2574355374E6F5708162F0B2114061D344E285914552F4E6F5789C4D489DCD24D5B631A774F4D1120062057125B3A4E3B575555A7D2E690E6D0634077034D4D630D3A1F1A553C31285914552A092C575555201E30144D5B630234180A557B4EB0E9DF92CDD677594D01200020104D4D1A17771B4D4D6388EDF886EED14E795719557B4E7708430C6302774F4D93F9C1B0EED292E5CBBCECE9556D4E23575555A5D4F890F4CAA4C8F29CF6F16311790E4D1963567791D7DAA4F7E89CC9EEA7D4FA574355374E6F578BCFEC89CEC886D1D88AEDDA4D0A6D17771B4D4D6388EDD88AECFC89DAC589CEFF4E795719557B4EB1CDC292DAD1B0FADF91F8D27708430C6302774F4D90FFE2B0EED2556D4E23575555A6D2DB90F4CA6311790E4D196356779DE4C6A4F7E8574355374E6F5787FCF089CEC84D0A6D17771B4D4D638AC2D089EBED4E795719557B4EB3E2CA91DDC07708430C6302774F4D9EDEC5B0EED2556D4E23575555A8F3FC90F4CA6311790E4D1963567793DCE2A4F7E8574355374E6F5789C4D489CEC84D0A6D17771B4D4D6389D8C58ACDE74E795719557B4EB0F8DF92FBCA7708430C6302774F4D92FFDBB0EED2556D4E23575555A4D2E290F4CA6311790E4D196356779DCAC8A6E3F892E6EE634077034D4D6384F0CA88F8EC8BDCEC4D0A6D17771B4D4D638AD1FA8AD3E689DDDC4D5B631A774F4D91C5E3B0D1C892C9C57708430C6302774F4D91FFDFB0D1C892C9C5B1CFF5556D4E23575555A7D2E690CBD0A4E4FC91D5ED6311790E4D1963567793C0E3A4E4FC93F8C1634077034D4D638AFAE18AFFE88AC2C34D0A6D17771B4D4D638BC4EB8AF2F94E795719557B4EB2E4F192C4D47708430C6302774F4D9FCCDBB0F0DF556D4E23575555A9E1E290EAC76311790E4D1963567791D7CEA8D6F3574355374E6F578BCFF885EFD34D0A6D17771B4D4D6389DFD589FCFE89F1D24D5B631A774F4D92CBCCB3FED092E5CB7708430C6302774F4D93FEE8B2C8F891D7C377594D0163567791D0F3A6D1C293F9D863110808430C6307300C4D4D631530141D556D4E3B14021263567790D6C3A5D7E8574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555735C67404D5B631A774F4D45715E6057125B3A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557125B3A4E3B575555735C654C4D5B631A774F4D45715C6C57125B3A4E3B575555735C654D4D5B631A774F4D45715C6D57125B3A4E3B575555735C65424D5B631A774F4D45715C6257125B3A4E3B575555735C65434D5B631A774F4D45715C6357125B3A4E3B575555735C65404D5B631A774F4D45715C6057122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F4C3A7FAE593F8C1A8FBE1574355374E6F575F553C402E5701557B4EBDC4E990D2CFBDDAEB92C9EA77594D01635677444D0A1C1108594D4663560E0E4D1C2415774F4D142D0D26064D5B630234180A557B4EB2C4D492DFE777594D01200020104D4D1A17771B4D4D6389D0DD86F4E94E795719557B4E341903553C402E5701557B4EB0FFC793FCF077594D016356771100192616201A4D0A6D17771B4D4D638BDDC489F4C44E795719557B4E341C1E1E2F0B7708430C6302774F4D92D7F0B0FCC8556D4E2357555539053F004D0A6D17771B4D4D638BF2E48ACEFA4E795719557B4E3E10070220027708430C6302774F4D91C0FCB3F5F9556D4E235755552A033B120D026311790E4D1963567793E7EFA5D6DC574355374E6F57151F20022F1D0A19264E285914552F4E6F5789DAE788EBD54D5B631A774F4D0034143C144D0A6D17771B4D4D6385F8E18ACEFA4E795719557B4E381A070220027708430C6302774F4D92C8CBB3F6EA556D4E235755552B19241C01106311790E4D1963567790E5DFA6F8EE574355374E6F570B182F0B3D000E553C402E5701557B4EB3F6E591C3F677594D016356771F0619261F3A1B08553C402E5701557B4E66314D5B631A774F4D44054E285914552F4E6F5788F6FF85CFCB4D5B631A774F4D0D20053B1401553C402E5701557B4EB3F7C390D7FD77594D016356770D1A162F153C57125B3A4E3B575555A9C1F390E3DD634077034D4D63063C1B081124057708430C6302774F4D91D7EBBDFCD5556D4E2357555536093B0C06553C402E5701557B4EBCE8FD91D9C977594D01635677040619260F3D0001553C402E5701557B4EB0F3FD9ED8C577594D01635677180E183905341B4D0A6D17771B4D4D638BDFDA88CAEB4E795719557B4E3314010D34057708430C6302774F4D90FBC6B0C8FA556D4E235755552B0539004D0A6D17771B4D4D6389DAD187D4C44E795719557B4E3200151F340D3B124D0A6D17771B4D4D6389F0F28ACEFA4E795719557B4E241C070220027708430C6302774F4D92DAD1BDDAC2556D4E2357555526193A0C1A553C402E5701557B4EB2CED39FC8D677594D016356770F001926153C57125B3A4E3B575555A4E2D390E0C5634077034D4D63003C06071E6311790E4D196356779DD0E7A4E6FD574355374E6F5716022F083A1B08553C402E5701557B4EB0FBF092C9F7B0FBE492C9DA77594D016356770C1A162F0F3D000E19264E285914552F4E6F5788C9CF89DCD24D5B631A774F4D1A24053F004D0A6D17771B4D4D6385CADC8AFEE64E795719557B4E3D14011D344E285914552F4E6F578AECFC88EFD288E3F484F2F38AFEE64E795719557B4E3200001D344E285914552F4E6F5789E0E489DCD24D5B631A774F4D0528062057125B3A4E3B575555A9E7E490E6D0634077034D4D63153C1B081D344E285914552F4E6F578AC9F689DCD24D5B631A774F4D1324062057125B3A4E3B575555A5D3D190E6D0634077034D4D63093F004D0A6D17771B4D4D6389E2C18AFEE64E795719557B4E371405026311790E4D1963567790E5D7A4E5F2574355374E6F57051E20062057125B3A4E3B575555A9C9EA90E6D0634077034D4D630D3B1C1C1F6311790E4D1963567793EBF8A4C8F290E7DEA4E5F2574355374E6F57161E250D391C05026311790E4D1963567793DCC7A4E5F2574355374E6F571B1628062057125B3A4E3B575555A7D4FA90E0C7A4E5F2574355374E6F5708162F0B2114061D344E285914552F4E6F5789C4D489DCD24D5B631A774F4D1120062057125B3A4E3B575555A7D2E690E6D0634077034D4D630D3A1F1A553C31285914552A092C575555201E30144D5B630234180A557B4EB0E9DF92CDD677594D01200020104D4D1A17771B4D4D6388EDF886EED14E795719557B4E7708430C6302774F4D93F9C1B0EED292E5CBBCECE9556D4E23575555A5D4F890F4CAA4C8F29CF6F16311790E4D1963567791D7DAA4F7E89CC9EEA7D4FA574355374E6F578BCFEC89CEC886D1D88AEDDA4D0A6D17771B4D4D6388EDD88AECFC89DAC589CEFF4E795719557B4EB1CDC292DAD1B0FADF91F8D27708430C6302774F4D90FFE2B0EED2556D4E23575555A6D2DB90F4CA6311790E4D196356779DE4C6A4F7E8574355374E6F5787FCF089CEC84D0A6D17771B4D4D638AC2D089EBED4E795719557B4EB3E2CA91DDC07708430C6302774F4D9EDEC5B0EED2556D4E23575555A8F3FC90F4CA6311790E4D1963567793DCE2A4F7E8574355374E6F5789C4D489CEC84D0A6D17771B4D4D6389D8C58ACDE74E795719557B4EB0F8DF92FBCA7708430C6302774F4D92FFDBB0EED2556D4E23575555A4D2E290F4CA6311790E4D196356779DCAC8A6E3F892E6EE634077034D4D6384F0CA88F8EC8BDCEC4D0A6D17771B4D4D638AD1FA8AD3E689DDDC4D5B631A774F4D91C5E3B0D1C892C9C57708430C6302774F4D91FFDFB0D1C892C9C5B1CFF5556D4E23575555A7D2E690CBD0A4E4FC91D5ED6311790E4D1963567793C0E3A4E4FC93F8C1634077034D4D638AFAE18AFFE88AC2C34D0A6D17771B4D4D638BC4EB8AF2F94E795719557B4EB2E4F192C4D47708430C6302774F4D9FCCDBB0F0DF556D4E23575555A9E1E290EAC76311790E4D1963567791D7CEA8D6F3574355374E6F578BCFF885EFD34D0A6D17771B4D4D6389DFD589FCFE89F1D24D5B631A774F4D92CBCCB3FED092E5CB7708430C6302774F4D93FEE8B2C8F891D7C377594D0163567791D0F3A6D1C293F9D863110808430C6307300C4D4D631530141D556D4E3B14021263567790D6C3A5D7E8574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555735C67404D5B631A774F4D45715E6057125B3A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557125B3A4E3B575555735C654C4D5B631A774F4D45715C6C57125B3A4E3B575555735C654D4D5B631A774F4D45715C6D57125B3A4E3B575555735C65424D5B631A774F4D45715C6257125B3A4E3B575555735C65434D5B631A774F4D45715C6357125B3A4E3B575555735C65404D5B631A774F4D45715C6057122A3C402E570412384E6F570D0E6340771B0E1A244E6F5789F9D389EFFA4D5B631A34191A1263560E0E4D1963567793F4C3A7FAE593F8C1A8FBE1574355374E6F575F553C402E5701557B4EBDC4E990D2CFBDDAEB92C9EA77594D01635677444D0A1C110808"));
        h hVarE = l.e(C0197c.l(a, a()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{126, -45, -2, 84, 76, -59}, new byte[]{80, -80, -111, 56, 97, -15, 45, 72}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(a + mVar.o0(C0098a.a(new byte[]{117, -57, 116, -75, -67, -113, -23, 48, 127}, new byte[]{20, -23, 16, -104, -33, -29, -122, 83})).a(C0098a.a(new byte[]{-115, 108, -46, -74}, new byte[]{-27, 30, -73, -48, -87, -6, -48, 31})), y.b(new byte[]{100, -39, 82, 98, 42, -25, -82, 126, 120, -125, 8, 109, 46}, new byte[]{12, -22, 124, 1, 75, -107, -54, 83}, mVar), mVar.o0(C0098a.a(new byte[]{-48, -5, -49}, new byte[]{-71, -106, -88, 95, 68, -89, -4, -45})).a(C0098a.a(new byte[]{-55, 24, 62, -50, 1, 112, -123, -32}, new byte[]{-83, 121, 74, -81, 44, 3, -9, -125})), y.b(new byte[]{58, 31, -77, 5, -19, -39, -103, 95, 112, 70, -80, 26}, new byte[]{20, 107, -42, 125, -103, -12, -21, 58}, mVar), arrayList2);
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
        String strSubstring;
        String upperCase;
        C0074g c0074gO0 = l.e(C0197c.l(C0133t.a(new StringBuilder(), a, str2), a())).o0(C0098a.a(new byte[]{88, -6, 77, 3, 30, 18}, new byte[]{43, -103, 63, 106, 110, 102, 102, -52}));
        new JSONObject();
        int i = 0;
        while (true) {
            if (i >= c0074gO0.size()) {
                strSubstring = "";
                break;
            }
            String strT = c0074gO0.get(i).t();
            if (strT.contains(C0098a.a(new byte[]{71, -62, 71, -114, -113, 69, -28, -37, 12}, new byte[]{49, -93, 53, -82, -1, 44, -128, -5}))) {
                String strSubstring2 = strT.substring(strT.indexOf(C0098a.a(new byte[]{86, -42, 79, -107, -2, 31, -91, -48, 29}, new byte[]{32, -73, 61, -75, -114, 118, -63, -16})), strT.lastIndexOf(C0098a.a(new byte[]{-40, -57, -43, 27, -9, -99, 121, 34}, new byte[]{-82, -90, -89, 59, -125, -12, 20, 71})) + 1);
                strSubstring = strSubstring2.substring(strSubstring2.indexOf(C0098a.a(new byte[]{-17}, new byte[]{-46, -59, -47, -17, 112, 103, 10, 124})) + 2, strSubstring2.lastIndexOf(C0098a.a(new byte[]{57}, new byte[]{2, 36, -118, -102, -54, -40, -125, 21})));
                break;
            }
            i++;
        }
        String str3 = strSubstring;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbC = C0133t.c(str3);
        sbC.append(C0098a.a(new byte[]{51}, new byte[]{30, -74, 84, -24, 124, 90, 45, -28}));
        sbC.append(jCurrentTimeMillis);
        String strSubstring3 = C0207D.a(sbC.toString()).substring(0, 16);
        StringBuilder sbC2 = C0133t.c(str3);
        sbC2.append(C0098a.a(new byte[]{-16}, new byte[]{-35, 113, 61, -76, 59, 73, 19, 80}));
        sbC2.append(jCurrentTimeMillis);
        String string = sbC2.toString();
        try {
            Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{70, 80, -43, 30, -126, 125, 3, -67, 87, 94, -59, 98, -16, 110, 32, -10, 99, 124, -24, 86}, new byte[]{7, 21, -122, 49, -57, 62, 65, -110}));
            cipher.init(1, new SecretKeySpec(strSubstring3.getBytes(), C0098a.a(new byte[]{-114, -31, -64}, new byte[]{-49, -92, -109, 121, -6, 19, -99, -76})));
            byte[] bArrDoFinal = cipher.doFinal(string.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
            upperCase = sb.toString().toUpperCase();
        } catch (Exception e) {
            SpiderDebug.log(e);
            upperCase = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(C0098a.a(new byte[]{-22, -44, -38, -86, -36, 118, 69, 74, -8}, new byte[]{-59, -72, -77, -60, -71, 5, 122, 62}));
        sb2.append(jCurrentTimeMillis);
        v.a(new byte[]{123, -13, 82, -59}, new byte[]{93, -128, 53, -8, -7, 63, 54, 49}, sb2, upperCase);
        String strTrim = new JSONObject(C0197c.l(C0134u.b(new byte[]{66, 14, 21, 37, -10}, new byte[]{100, 126, 124, 65, -53, 74, -48, -58}, sb2, str3), a())).getJSONObject(C0098a.a(new byte[]{-86, -101, 22, 54}, new byte[]{-50, -6, 98, 87, -88, 119, 71, 5})).getString(C0098a.a(new byte[]{31, -74, -117, 7}, new byte[]{106, -60, -25, 52, -21, -46, 90, -22})).split(C0098a.a(new byte[]{-30}, new byte[]{-50, 101, -2, 126, -1, -55, -112, -92}))[0].trim();
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(strTrim);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) throws JSONException {
        JSONArray jSONArray = new JSONObject(C0197c.l(C0098a.a(new byte[]{-104, 15, -13, 19, 95, 58, 58, 13, -125, 20, -87, 27, 66, 45, 56, 79, -57, 9, -77, 82, 30, 97, 113, 84, -110, 66, -75, 9, 30, 49, 102, 86, -58, 78, -26, 77, 88, 107, 58, 65, -126, 26, -16, 15, 3, 98, 124, 70, -103, 68, -20, 6, 85, 119, 122, 80, -108, 8, -70}, new byte[]{-16, 123, -121, 99, 44, 0, 21, 34}) + str, null)).getJSONArray(C0098a.a(new byte[]{-50, 65, 76, 97, 17, 47}, new byte[]{-68, 36, 63, 20, 125, 91, 124, 107}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new k(a + jSONObject.getString(C0098a.a(new byte[]{82, -117}, new byte[]{59, -17, -8, 18, 17, 3, 79, 10})), jSONObject.getString(C0098a.a(new byte[]{-114, -5, 37, 50}, new byte[]{-32, -102, 72, 87, -88, 79, 68, 5})), jSONObject.getString(C0098a.a(new byte[]{13, 127, 29}, new byte[]{100, 18, 122, -60, -114, -40, 25, -122}))));
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
