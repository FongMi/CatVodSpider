package com.github.catvod.spider;

import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class MiSou extends WangPan {
    private final String f = C0098a.a(new byte[]{-72, -75, 35, 56, 28, 99, 51, -47, -89, -74, 32, 102, 2, 48, 111, -111, -93, -82, 121, 43, 12}, new byte[]{-48, -63, 87, 72, 111, 89, 28, -2});

    private Map<String, String> d() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-86, -87, -115, -83, -77, 33, -117, -23, -111, -82}, new byte[]{-1, -38, -24, -33, -98, 96, -20, -116}), C0098a.a(new byte[]{-94, -75, -79, -63, -124, -105, 83, 8, -38, -12, -5, -120, -64, -84, 91, 73, -117, -75, -68, -37, -56, -75, 102, 7, -34, -22, -27, -104, -45, -37, 101, 78, -127, -20, -1, -109, -56, -125, 4, 19, -58, -6, -118, -40, -104, -105, 87, 112, -118, -72, -128, -63, -100, -44, 7, 20, -40, -12, -8, -98, -56, -45, 121, 111, -69, -105, -121, -124, -56, -105, 91, 76, -118, -6, -116, -51, -117, -112, 93, 14, -49, -103, -93, -38, -121, -106, 87, 8, -34, -21, -4, -122, -40, -43, 2, 9, -33, -6, -104, -55, -114, -102, 64, 78, -64, -17, -8, -97, -58, -56, 4}, new byte[]{-17, -38, -53, -88, -24, -5, 50, 39}));
        map.put(C0098a.a(new byte[]{118, 87, 45, -24, -90, 69, -83}, new byte[]{36, 50, 75, -115, -44, 32, -33, 20}), this.f);
        return map;
    }

    private List<k> e(String str, String str2, String str3) {
        String strA;
        String str4;
        ArrayList arrayList = new ArrayList();
        try {
            int i = 4;
            char c = 5;
            int i2 = 8;
            String strA2 = C0098a.a(new byte[]{-20, -14, -105, 53, 61, 15, -125, -21, -13, -15, -108, 107, 35, 92, -33, -85, -9, -23, -51, 38, 45, 26, -38, -11, -85, -11, -122, 36, 60, 86, -60, -21, -32, -17, -112, 46}, new byte[]{-124, -122, -29, 69, 78, 53, -84, -60});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-32, -121, 91, -47}, new byte[]{-112, -26, 60, -76, 5, -122, 21, -120}), Integer.parseInt(str2));
            jSONObject.put(C0098a.a(new byte[]{-12}, new byte[]{-123, -6, 96, 71, 11, -40, 108, 77}), str);
            jSONObject.put(C0098a.a(new byte[]{4, 24, -117, 117}, new byte[]{113, 107, -18, 7, 25, -100, -105, -38}), str3);
            jSONObject.put(C0098a.a(new byte[]{-42, -78, 61, 46, -102}, new byte[]{-77, -54, 92, 77, -18, -124, 83, -95}), true);
            new ArrayList();
            jSONObject.put(C0098a.a(new byte[]{82, -55, 35, 24, -42, 107, -102, 2, 76, -60}, new byte[]{33, -95, 66, 106, -77, 52, -18, 107}), "");
            jSONObject.put(C0098a.a(new byte[]{-110, -95, -59, -33}, new byte[]{-31, -56, -65, -70, 127, 97, 44, -35}), 15);
            jSONObject.put(C0098a.a(new byte[]{-18, -6, -93, -16}, new byte[]{-102, -125, -45, -107, 79, 111, 67, 51}), "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0098a.a(new byte[]{-11, -112, 124, 39, -7, 35, -99, -96, -11, -111}, new byte[]{-126, -11, 31, 79, -104, 87, -62, -48}), "");
            byte b = -74;
            jSONObject.put(C0098a.a(new byte[]{-86, 75, -74, 58, -120, 50, 96, 15, -90, 92}, new byte[]{-53, 47, -64, 101, -8, 83, 18, 110}), jSONObject2);
            JSONArray jSONArray = new JSONObject(C0197c.g(strA2, jSONObject.toString(), d()).a()).getJSONObject(C0098a.a(new byte[]{-88, 20, -46, -28}, new byte[]{-52, 117, -90, -123, 46, 54, -50, 18})).getJSONArray(C0098a.a(new byte[]{116, 15, -123, 13}, new byte[]{24, 102, -10, 121, -46, -74, -72, 53}));
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                k kVar = new k();
                byte[] bArr = new byte[i];
                bArr[0] = 124;
                bArr[1] = -33;
                bArr[2] = 71;
                bArr[3] = -49;
                byte[] bArr2 = new byte[i2];
                bArr2[0] = 16;
                bArr2[1] = b;
                bArr2[2] = 41;
                bArr2[3] = -92;
                bArr2[i] = 87;
                bArr2[c] = 115;
                bArr2[6] = -27;
                bArr2[7] = -113;
                kVar.g(jSONObject3.getString(C0098a.a(bArr, bArr2)));
                byte[] bArr3 = new byte[i];
                bArr3[0] = 68;
                bArr3[1] = -87;
                bArr3[2] = -89;
                bArr3[3] = 86;
                byte[] bArr4 = new byte[i2];
                bArr4[0] = 2;
                bArr4[1] = -5;
                bArr4[2] = -24;
                bArr4[3] = 27;
                bArr4[i] = -106;
                bArr4[c] = -23;
                bArr4[6] = -97;
                bArr4[7] = -128;
                String strA3 = C0098a.a(bArr3, bArr4);
                byte[] bArr5 = new byte[50];
                bArr5[0] = -83;
                bArr5[1] = -10;
                bArr5[2] = -90;
                bArr5[3] = -76;
                bArr5[i] = -58;
                bArr5[c] = 7;
                bArr5[6] = -10;
                bArr5[7] = -97;
                bArr5[i2] = b;
                bArr5[9] = -25;
                bArr5[10] = -77;
                bArr5[11] = -93;
                bArr5[12] = -40;
                bArr5[13] = 16;
                bArr5[14] = -76;
                bArr5[15] = -43;
                bArr5[16] = -95;
                bArr5[17] = -21;
                bArr5[18] = -77;
                bArr5[19] = -22;
                bArr5[20] = -58;
                bArr5[21] = 88;
                bArr5[22] = -72;
                bArr5[23] = -41;
                bArr5[24] = -88;
                bArr5[25] = -31;
                bArr5[26] = b;
                bArr5[27] = -86;
                bArr5[28] = -101;
                bArr5[29] = 94;
                bArr5[30] = b;
                bArr5[31] = -35;
                bArr5[32] = -22;
                bArr5[33] = -17;
                bArr5[34] = -77;
                bArr5[35] = -80;
                bArr5[36] = -48;
                bArr5[37] = 79;
                bArr5[38] = -80;
                bArr5[39] = -47;
                bArr5[40] = -87;
                bArr5[41] = -83;
                bArr5[42] = -29;
                bArr5[43] = -13;
                bArr5[44] = -127;
                bArr5[45] = 10;
                bArr5[46] = -9;
                bArr5[47] = -38;
                bArr5[48] = -75;
                bArr5[49] = -27;
                byte[] bArr6 = new byte[i2];
                bArr6[0] = -59;
                bArr6[1] = -126;
                bArr6[2] = -46;
                bArr6[3] = -60;
                bArr6[i] = -75;
                bArr6[c] = 61;
                bArr6[6] = -39;
                bArr6[7] = -80;
                String strA4 = C0098a.a(bArr5, bArr6);
                byte[] bArr7 = new byte[i];
                bArr7[0] = 59;
                bArr7[1] = -106;
                bArr7[2] = -26;
                bArr7[3] = 80;
                byte[] bArr8 = new byte[i2];
                bArr8[0] = 87;
                bArr8[1] = -1;
                bArr8[2] = -120;
                bArr8[3] = 59;
                bArr8[i] = -73;
                bArr8[5] = -18;
                bArr8[6] = 25;
                bArr8[7] = -99;
                String string = jSONObject3.getString(C0098a.a(bArr7, bArr8));
                byte[] bArr9 = new byte[19];
                bArr9[0] = -72;
                bArr9[1] = -25;
                bArr9[2] = 59;
                bArr9[3] = -106;
                bArr9[i] = 19;
                bArr9[5] = 102;
                bArr9[6] = -20;
                bArr9[7] = 51;
                bArr9[8] = -76;
                bArr9[9] = -31;
                bArr9[10] = 38;
                bArr9[11] = -112;
                bArr9[12] = 5;
                bArr9[13] = 114;
                bArr9[14] = -74;
                bArr9[15] = 127;
                bArr9[16] = -2;
                bArr9[17] = -16;
                bArr9[18] = 33;
                if (string.contains(C0098a.a(bArr9, new byte[]{-48, -109, 79, -26, 96, 92, -61, 28}))) {
                    str4 = strA3 + C0098a.a(new byte[]{-35, -97, 16, 65, 70, -73, -60, 10, 101}, new byte[]{-3, -54, 83, -90, -5, 38, 35, -111});
                    strA = C0098a.a(new byte[]{100, 69, 92, 104, 111, -116, 86, -65, 106, 66, 5, 113, 113, -101, 18, -11, 106, 68, 6, 47, 113, -39, 22, -30, 33, 87, 91, 41, 50, -43, 22, -3, 35, 93, 81, 55, 40, -46, 75, -13, 63, 87, 24, 40, 49, -127, 29, -92, 111, 28, 25, 41, 121, -125, 84, -15, 106, 0, 29, 53, 40, -121, 27, -10, 58, 2, 73, 125, 40, -45, 24, -96, 35, 0, 31, 42, 42, -122, 74, -89, 63, 0, 24, 44, 42, -113, 86, -94, 53, 0, 24, 45, 42, -123, 65, -8, 53, 86, 27, 54, 108, -40, 30}, new byte[]{12, 49, 40, 24, 28, -74, 121, -112});
                } else if (jSONObject3.getString(C0098a.a(new byte[]{96, -84, 124, 102}, new byte[]{12, -59, 18, 13, 74, -27, -48, 78})).contains(C0098a.a(new byte[]{36, 101, -66, 48, -81, 35, 49, 89, 60, 112, -92, 110, -66, 120, 119, 18, 57, 63, -87, 47, -79}, new byte[]{76, 17, -54, 64, -36, 25, 30, 118}))) {
                    str4 = strA3 + C0098a.a(new byte[]{54, 120, 6, -51, 80, -33, -57, 104, -85, 14, 120, -24, 45}, new byte[]{22, -97, -97, 115, -75, 101, 97, -113});
                    strA = C0098a.a(new byte[]{-89, 42, 1, -78, 9, -21, -3, -107, -72, 41, 2, -20, 28, -72, -96, -33, -65, 38, 91, -95, 21, -68, -3, -51, -65, 115, 22, -83, 20, -91, -73, -44, -69, 113, 0, -78, 22, -66, -77, -34, -68, 113, 71, -14, 72, -31, -3, -118, -6, 113, 23, -93, 19, -75, -89, -105, -95, 59, 1, -90, 19, -94, -71, -105, -2, 112, 31, -78, 29}, new byte[]{-49, 94, 117, -62, 122, -47, -46, -70});
                } else {
                    strA = strA4;
                    str4 = strA3 + C0098a.a(new byte[]{58, -1, -98, 60, 54, 122, -22, 40, -89, -117, -35, 31, 75}, new byte[]{26, 26, 58, -124, -45, -1, 97, -49});
                    kVar.l(str4);
                    kVar.i(strA);
                    kVar.h(jSONObject3.getString(C0098a.a(new byte[]{-54, -42, -86, -26, 55, -105, 69, -120, -53}, new byte[]{-82, -65, -39, -115, 104, -7, 36, -27})).replace(C0098a.a(new byte[]{20, -17, 9, -75}, new byte[]{40, -118, 100, -117, -107, 20, 18, -26}), "").replace(C0098a.a(new byte[]{-53, -91, -11, -12, 61}, new byte[]{-9, -118, -112, -103, 3, 77, -82, 79}), ""));
                    arrayList.add(kVar);
                    i3++;
                    b = -74;
                    i = 4;
                    c = 5;
                    i2 = 8;
                }
                kVar.l(str4);
                kVar.i(strA);
                kVar.h(jSONObject3.getString(C0098a.a(new byte[]{-54, -42, -86, -26, 55, -105, 69, -120, -53}, new byte[]{-82, -65, -39, -115, 104, -7, 36, -27})).replace(C0098a.a(new byte[]{20, -17, 9, -75}, new byte[]{40, -118, 100, -117, -107, 20, 18, -26}), "").replace(C0098a.a(new byte[]{-53, -91, -11, -12, 61}, new byte[]{-9, -118, -112, -103, 3, 77, -82, 79}), ""));
                arrayList.add(kVar);
                i3++;
                b = -74;
                i = 4;
                c = 5;
                i2 = 8;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private String f(String str) {
        return h.q(e(str, C0098a.a(new byte[]{13}, new byte[]{60, -88, 83, 43, 12, -28, 77, -4}), ""));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return h.q(e("", str2, C0098a.a(new byte[]{-35, 98, -51, -98, 52, -100, 61, 40, -101, 110, -69, -28, 35}, new byte[]{56, -10, 93, 123, -73, 59, 23, -63})));
    }

    @Override // com.github.catvod.spider.WangPan
    public String detailContent(List<String> list) {
        return super.detailContent(Collections.singletonList(list.get(0)));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listSingletonList = Collections.singletonList(C0098a.a(new byte[]{-6}, new byte[]{-53, 5, 26, 24, -120, -98, 33, -119}));
        List listSingletonList2 = Collections.singletonList(C0098a.a(new byte[]{75, -84, 119, -58, 14, 83}, new byte[]{-93, 43, -35, 33, -102, -5, 5, 106}));
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList.add(new C0135a((String) listSingletonList.get(i), (String) listSingletonList2.get(i)));
        }
        return h.t(arrayList, e("", C0098a.a(new byte[]{-4}, new byte[]{-51, 96, 7, 43, 40, 71, -112, 4}), C0098a.a(new byte[]{-42, 32, -34, 2, 101, -5, 9, -117, -112, 44, -88, 120, 114}, new byte[]{51, -76, 78, -25, -26, 92, 35, 98})));
    }

    public String searchContent(String str, boolean z) {
        C0098a.a(new byte[]{23}, new byte[]{38, -88, 31, 22, 105, -71, 43, -24});
        return f(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return f(str);
    }
}
