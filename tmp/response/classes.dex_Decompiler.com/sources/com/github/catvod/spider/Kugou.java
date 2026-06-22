package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Kugou extends Spider {
    private String a(String str) {
        return C0197c.l(str, null);
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-97, 86, 24, -66, -78, -57, 95, -54, -92, 81}, new byte[]{-54, 37, 125, -52, -97, -122, 56, -81}), C0098a.a(new byte[]{23, -63, -125, 98, -33, -30, -111, 37, 111, -128, -55, 43, -101, -39, -103, 100, 62, -63, -114, 120, -109, -64, -92, 42, 107, -98, -41, 59, -120, -82, -89, 99, 52, -104, -51, 48, -109, -10, -58, 62, 115, -114, -72, 123, -61, -30, -107, 93, 63, -52, -78, 98, -57, -95, -59, 57, 109, -128, -54, 61, -109, -90, -69, 66, 14, -29, -75, 39, -109, -30, -103, 97, 63, -114, -66, 110, -48, -27, -97, 35, 122, -19, -111, 121, -36, -29, -107, 37, 107, -97, -50, 37, -125, -96, -64, 36, 106, -114, -86, 106, -43, -17, -126, 99, 117, -101, -54, 60, -99, -67, -58}, new byte[]{90, -82, -7, 11, -77, -114, -16, 10}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return !C0098a.a(new byte[]{-114}, new byte[]{-65, 41, -36, -60, 23, -81, -46, 21}).equals(str2) ? "" : getKuGouRank(str);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        return str.startsWith(C0098a.a(new byte[]{95, -121, -19, -75, -47}, new byte[]{52, -14, -118, -38, -92, 91, 52, -38})) ? getKuGouMusicList(str.split(C0098a.a(new byte[]{-88}, new byte[]{-9, -5, 39, -33, 51, 67, -99, -81}))[1]) : str.startsWith(C0098a.a(new byte[]{-81, 121, -77, -65, 88, -17}, new byte[]{-50, 16, -57, -42, 54, -120, -100, -59})) ? getAiTingMusicList(str.split(C0098a.a(new byte[]{2}, new byte[]{93, 87, -113, -102, -103, -46, 12, 34}))[1]) : "";
    }

    public String getAiTingMusicList(String str) {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0197c.l(C0098a.a(new byte[]{115, 106, -3, 96, 46, 108, -99, 7, 120, 127, -3, 114, 50, 46, -100, 70, 42, 45, -89, 115, 49, 35, -48, 7, 98, 103, -89, 96, 53, 38, -115, 73, 120, 35, -1, 121, 57, 51, -35, 68, 114, 109, -3, 54, 52, 50, -63, 21}, new byte[]{27, 30, -119, 16, 93, 86, -78, 40}) + str, null)).optJSONArray(C0098a.a(new byte[]{78, -7, 78, -44}, new byte[]{34, -112, 61, -96, 100, -53, 114, -11})).optJSONObject(0);
            k kVar = new k();
            kVar.g(str);
            kVar.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-11, 99, -33, -128, -15, 29, -70, -44}, new byte[]{-125, 12, -69, -33, -97, 124, -41, -79})));
            kVar.l(C0098a.a(new byte[]{-27, 79, 83, -19, -37, 126, -25, 124, -110, 32, 106, -75, -93, 89, -100, 35, -74, 124}, new byte[]{2, -57, -30, 4, 68, -51, 3, -59}));
            kVar.e(C0098a.a(new byte[]{-81, -85, 108, 10, 33, 126, 77, -116, -41, -56, 91, 112, 106, 110, 11, 57, -94, -121, 95, 4, 25, 115, 77, -80, -46, -57, 79, 79, 104, 71, 21, -21, -24, -106, 57, 95, 49, 52, 63, -85, -94, -100, 108, 10, 41, 85, -123, 45, 105}, new byte[]{71, 33, -35, -30, -114, -45, -85, 3}));
            kVar.j(C0098a.a(new byte[]{20, 26, -47, 49, -49, 123, 84, 47, 99, -88, -121, 80, -31, 47, 36, 9, 21, 38, -37}, new byte[]{-13, -110, 96, -40, 80, -56, -80, -106}));
            kVar.k(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-127, -62, 54, -66, -101, -14, 125, 122, -88, -40, 32, -115}, new byte[]{-9, -83, 82, -31, -21, -98, 28, 3})).replace(C0098a.a(new byte[]{34, -99, -104, -109, -57}, new byte[]{6, -11, -20, -25, -73, 65, -21, -76}), C0098a.a(new byte[]{-9, -45, -55, -34, 1, 103, -16, -47, -69, -58, -44, -38}, new byte[]{-45, -78, -96, -86, 104, 9, -105, -4})));
            return h.p(kVar);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAiTingMusicPlayUrl(String str) {
        h hVar = new h();
        hVar.y(str);
        hVar.l();
        return hVar.toString();
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v21 */
    public String getAiTingRank() {
        try {
            int i = 7;
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0197c.l(C0098a.a(new byte[]{-71, 44, 36, -97, 0, 19, 106, 64, -78, 57, 36, -115, 28, 81, 107, 1, -32, 107, 126, -116, 31, 92, 39, 64, -88, 33, 126, -97, 27, 89, 122, 14, -78, 101, 38, -122, 23, 76, 42, 3, -72, 43, 36, -55, 7, 20, 33, 5, -90, 45, 33, -102, 85, 89, 34, 82, -32}, new byte[]{-47, 88, 80, -17, 115, 41, 69, 111}), null)).optJSONArray(C0098a.a(new byte[]{-115, 53, 19, -72}, new byte[]{-31, 92, 96, -52, 88, 84, 59, 77}));
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                k kVar = new k();
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[i];
                bArr[0] = -79;
                bArr[1] = -35;
                bArr[2] = -113;
                bArr[3] = -63;
                bArr[4] = 4;
                bArr[5] = i;
                bArr[6] = -11;
                sb.append(C0098a.a(bArr, new byte[]{-48, -76, -5, -88, 106, 96, -86, -46}));
                sb.append(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{116, -69, 40, 52, -89, 53}, new byte[]{2, -44, 76, 107, -50, 81, -38, -37})));
                kVar.g(sb.toString());
                kVar.h(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{115, -37, 104, 116, -126, 58, 97, 104}, new byte[]{5, -76, 12, 43, -20, 91, 12, 13})));
                kVar.i(jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{45, -57, -111, -87, 32, -80, 48}, new byte[]{91, -88, -11, -10, 80, -39, 83, 102})));
                arrayList.add(kVar);
                i2++;
                i = 7;
            }
            return h.q(arrayList);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getKuGouMusicList(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            char c = 1;
            byte b = 2;
            char c2 = 3;
            char c3 = 4;
            char c4 = 5;
            char c5 = 6;
            int i = 8;
            sb.append(C0098a.a(new byte[]{-53, -84, 55, -72, -33, -78, -50, 66, -52, -70, 42, -92, -128, -2, -123, 65, -63, -78, 109, -93, -112, -6, -114, 90, -115, -69, 44, -91, -54, -4, -111, 70, -116, -82, 112, -25, -105, -4, -113, 68, -116, -85, 44, -90, -126, -94, -105, 74, -47, -85, 42, -89, -117, -96, -40, 30, -109, -32, 101, -70, -124, -13, -118, 91, -38, -88, 38, -11, -43, -69, -111, 67, -62, -84, 126, -8, -61, -19, -128, 72, -58, -85, 42, -78, -128, -96, -45, 31, -109, -2, 34, -70, -128, -4, -66, 76, -52, -68, 38, -11, -44, -69, -111, 78, -60, -67, 126, -7, -61, -21, -114, 67, -54, -68, 126, -5, -48, -83, -44, 31, -123, -86, 34, -90, -114, -12, -123, 18}, new byte[]{-93, -40, 67, -56, -27, -99, -31, 47}));
            sb.append(str);
            sb.append(C0098a.a(new byte[]{89, 86, 48, 37, -108, 79, 56, -15, 12, 126, 45, 48, -101, 45, 122}, new byte[]{127, 33, 89, 81, -4, 16, 74, -108}));
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(a(sb.toString())).optJSONObject(C0098a.a(new byte[]{79, -38, 96, -41}, new byte[]{43, -69, 20, -74, 116, 110, 10, 126})).optJSONArray(C0098a.a(new byte[]{-108, 9, -66, -94}, new byte[]{-3, 103, -40, -51, -107, 122, 101, 2}));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    byte[] bArr = new byte[i];
                    bArr[0] = -22;
                    bArr[c] = 56;
                    bArr[b] = 13;
                    bArr[c2] = -28;
                    bArr[c3] = 38;
                    bArr[c4] = -107;
                    bArr[c5] = 86;
                    bArr[7] = -13;
                    byte[] bArr2 = new byte[i];
                    bArr2[0] = -116;
                    bArr2[c] = 81;
                    bArr2[b] = 97;
                    bArr2[c2] = -127;
                    bArr2[c3] = 72;
                    bArr2[c4] = -12;
                    bArr2[6] = 59;
                    bArr2[7] = -106;
                    String strOptString = jSONObjectOptJSONObject.optString(C0098a.a(bArr, bArr2));
                    byte[] bArr3 = new byte[i];
                    bArr3[0] = 67;
                    bArr3[c] = -30;
                    bArr3[b] = 105;
                    bArr3[c2] = -48;
                    bArr3[c3] = 26;
                    bArr3[c4] = 7;
                    bArr3[6] = 98;
                    bArr3[7] = 30;
                    byte[] bArr4 = new byte[i];
                    bArr4[0] = 34;
                    bArr4[c] = -114;
                    bArr4[b] = 11;
                    bArr4[c2] = -91;
                    bArr4[c3] = 119;
                    bArr4[5] = 88;
                    bArr4[6] = 11;
                    bArr4[7] = 122;
                    String strOptString2 = jSONObjectOptJSONObject.optString(C0098a.a(bArr3, bArr4));
                    byte[] bArr5 = new byte[14];
                    bArr5[0] = -1;
                    bArr5[c] = -68;
                    bArr5[b] = -27;
                    bArr5[c2] = 35;
                    bArr5[c3] = -10;
                    bArr5[5] = 54;
                    bArr5[6] = 50;
                    bArr5[7] = -42;
                    bArr5[i] = -6;
                    bArr5[9] = -71;
                    bArr5[10] = -24;
                    bArr5[11] = 9;
                    bArr5[12] = -14;
                    bArr5[13] = 13;
                    byte[] bArr6 = new byte[i];
                    bArr6[0] = -98;
                    bArr6[c] = -48;
                    bArr6[b] = -121;
                    bArr6[c2] = 86;
                    bArr6[4] = -101;
                    bArr6[5] = 105;
                    bArr6[6] = 83;
                    bArr6[7] = -93;
                    String strOptString3 = jSONObjectOptJSONObject.optString(C0098a.a(bArr5, bArr6));
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = 93;
                    bArr7[c] = -17;
                    bArr7[b] = 21;
                    bArr7[c2] = -97;
                    bArr7[4] = 24;
                    bArr7[5] = -115;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 46;
                    bArr8[c] = -98;
                    bArr8[b] = 125;
                    bArr8[3] = -2;
                    bArr8[4] = 107;
                    bArr8[5] = -27;
                    bArr8[6] = 126;
                    bArr8[7] = 51;
                    String strOptString4 = jSONObjectOptJSONObject.optString(C0098a.a(bArr7, bArr8));
                    if (TextUtils.isEmpty(strOptString4)) {
                        byte[] bArr9 = new byte[4];
                        bArr9[0] = -46;
                        bArr9[c] = -35;
                        bArr9[b] = -126;
                        bArr9[3] = b;
                        byte[] bArr10 = new byte[8];
                        bArr10[0] = -70;
                        bArr10[c] = -68;
                        bArr10[b] = -15;
                        bArr10[3] = 106;
                        bArr10[4] = 124;
                        bArr10[5] = -91;
                        bArr10[6] = 48;
                        bArr10[7] = -76;
                        strOptString4 = jSONObjectOptJSONObject.optString(C0098a.a(bArr9, bArr10));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    byte[] bArr11 = new byte[11];
                    bArr11[0] = 52;
                    bArr11[c] = -16;
                    bArr11[2] = -56;
                    bArr11[3] = -94;
                    bArr11[4] = 107;
                    bArr11[5] = 120;
                    bArr11[6] = -84;
                    bArr11[7] = -66;
                    bArr11[8] = 96;
                    bArr11[9] = -88;
                    bArr11[10] = -30;
                    sb2.append(C0098a.a(bArr11, new byte[]{16, -101, -67, -59, 4, 13, -127, -45}));
                    sb2.append(strOptString4);
                    sb2.append(C0098a.a(new byte[]{-32}, new byte[]{-65, -94, -71, 61, 19, 38, 41, 126}));
                    sb2.append(strOptString2);
                    sb2.append(C0098a.a(new byte[]{-12}, new byte[]{-85, -121, 84, 10, -74, 9, -66, 108}));
                    sb2.append(strOptString3);
                    arrayList.add(sb2.toString());
                    String strOptString5 = jSONObjectOptJSONObject.optString(C0098a.a(new byte[]{-81, 69, -102, 32, -43, -60}, new byte[]{-62, 51, -14, 65, -90, -84, -75, 82}));
                    if (!TextUtils.isEmpty(strOptString5)) {
                        arrayList2.add(strOptString + C0098a.a(new byte[]{-121, -54, 6, -70, 69, 44, -11, -36, -43, -2}, new byte[]{-93, -95, 115, -35, 42, 89, -40, -79}) + strOptString5);
                    }
                    i2++;
                    c = 1;
                    b = 2;
                    c2 = 3;
                    c3 = 4;
                    c4 = 5;
                    c5 = 6;
                    i = 8;
                }
                k kVar = new k();
                kVar.g(str);
                kVar.h(C0098a.a(new byte[]{76, 96, 60, 17, -124, 98, 58, -108, 22, 1, 50, 102}, new byte[]{-91, -27, -117, -10, 15, -11, -45, 11}));
                kVar.l(C0098a.a(new byte[]{103, -75, 7, 58, 111, -110, -110, 83, 16, -38, 62, 98, 23, -75, -23, 12, 52, -122}, new byte[]{-128, 61, -74, -45, -16, 33, 118, -22}));
                kVar.e(C0098a.a(new byte[]{101, 16, -113, -60, 8, 2, 50, 116, 29, 115, -72, -66, 67, 18, 116, -63, 104, 60, -68, -54, 48, 15, 50, 72, 24, 124, -84, -127, 65, 59, 106, 19, 34, 45, -38, -111, 24, 72, 64, 83, 104, 39, -113, -60, 0, 41, -6, -43, -93}, new byte[]{-115, -102, 62, 44, -89, -81, -44, -5}));
                kVar.j(C0098a.a(new byte[]{117, -104, 60, 24, -78, -59, -121, 99}, new byte[]{56, -56, 15, 60, -106, -31, -54, 53}));
                kVar.k(TextUtils.join(C0098a.a(new byte[]{-120}, new byte[]{-85, 40, 92, -52, 13, -96, 10, 88}), arrayList) + C0098a.a(new byte[]{28, 26, -15}, new byte[]{56, 62, -43, 30, -110, -18, 100, 120}) + TextUtils.join(C0098a.a(new byte[]{-51}, new byte[]{-18, -18, -55, 124, -52, -87, 111, 40}), arrayList2));
                return h.p(kVar);
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x04de A[Catch: Exception -> 0x0d41, TryCatch #1 {Exception -> 0x0d41, blocks: (B:5:0x031e, B:6:0x039b, B:8:0x03a1, B:10:0x03db, B:12:0x045b, B:31:0x0d2e, B:14:0x04de, B:15:0x06af, B:17:0x06fc, B:19:0x0787, B:21:0x0811, B:22:0x09e4, B:24:0x0a31, B:26:0x0abe, B:28:0x0b43, B:32:0x0d3a), top: B:40:0x031e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getKuGouRank(java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 3396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Kugou.getKuGouRank(java.lang.String):java.lang.String");
    }

    public String getKugouMusicPlayUrl(String str) {
        String strC;
        String strOptString = "";
        if (!str.startsWith(C0098a.a(new byte[]{-12, -4, -43}, new byte[]{-103, -116, -26, -43, -16, 81, -20, -51}))) {
            String str2 = str.split(C0098a.a(new byte[]{-75}, new byte[]{-22, 74, 8, 45, 86, -27, -124, 70}))[1];
            StringBuilder sb = new StringBuilder();
            v.a(new byte[]{59, 72, 78, -122, 70, -38, -73, -79, 62, 18, 81, -125, 82, -113, -19, -80, 48, 83, 87, -39, 84, -112, -24, -79, 58, 19, 87, -128, 27, -112, -16, -18, 108, 95, 87, -110, 8, -47, -88, -82, 117, 84, 91, -123, 93, -35}, new byte[]{83, 60, 58, -10, 53, -32, -104, -98}, sb, str2);
            JSONObject jSONObjectOptJSONObject = new JSONObject(C0197c.l(C0133t.b(new byte[]{73, -10, 66, 36, 79, 98, 29, 80, 73, -6, 73, 61, 2, 60, 80, 85}, new byte[]{111, -97, 49, 73, 63, 81, 32, 97}, sb), null)).optJSONObject(C0098a.a(new byte[]{93, -1, 41, -54, -7, -43}, new byte[]{48, -119, 77, -85, -115, -76, 47, 19}));
            if (jSONObjectOptJSONObject.has(C0098a.a(new byte[]{-90, -24}, new byte[]{-43, -103, -24, -115, -10, -54, 34, 9}))) {
                h hVar = new h();
                hVar.y(jSONObjectOptJSONObject.optJSONObject(C0098a.a(new byte[]{22, 92}, new byte[]{101, 45, -121, -13, -115, -1, -1, 12})).optString(C0098a.a(new byte[]{-59, -47, -78, 79, 101, -30, 59}, new byte[]{-95, -66, -59, 33, 16, -112, 87, -31})));
                hVar.l();
                hVar.f(b());
                return hVar.toString();
            }
            if (!jSONObjectOptJSONObject.has(C0098a.a(new byte[]{-118, 91}, new byte[]{-26, 62, -37, 28, -124, -76, 65, -24}))) {
                return "";
            }
            h hVar2 = new h();
            hVar2.y(jSONObjectOptJSONObject.optJSONObject(C0098a.a(new byte[]{45, -54}, new byte[]{65, -81, -83, 120, 82, -84, -115, -34})).optString(C0098a.a(new byte[]{-110, -81, 45, 71, -122, -3, -114}, new byte[]{-10, -64, 90, 41, -13, -113, -30, -116})));
            hVar2.l();
            hVar2.f(b());
            return hVar2.toString();
        }
        JSONObject jSONObject = new JSONObject(C0197c.l(C0134u.b(new byte[]{27, -114, 105, -37, -75, 111, -84, 80, 30, -44, 118, -34, -95, 58, -10, 81, 16, -107, 112, -124, -89, 37, -13, 80, 26, -43, 122, -50, -78, 6, -20, 17, 20, -77, 115, -51, -87, 123, -13, 23, 3, -59, 126, -58, -94, 104, -13, 19, 18, -125, 84, -59, -96, 58, -91, 23, 18, -119, 117, -106}, new byte[]{115, -6, 29, -85, -58, 85, -125, 127}, new StringBuilder(), str.split(C0098a.a(new byte[]{97}, new byte[]{62, 85, 103, 115, 82, 23, 127, 85}))[1]), null));
        if (jSONObject.optString(C0098a.a(new byte[]{105, -66, 48, -99, -15}, new byte[]{12, -52, 66, -14, -125, 35, -99, 38})).contains(C0098a.a(new byte[]{-93, -22, 90, 16, -72, 28, 30, 66, -14}, new byte[]{75, 76, -37, -12, 3, -124, -10, -10}))) {
            String strOptString2 = jSONObject.optString(C0098a.a(new byte[]{-62, -106, 19, -4, 16, 50, 122, 117}, new byte[]{-79, -7, 125, -101, 94, 83, 23, 16}));
            String strOptString3 = jSONObject.optString(C0098a.a(new byte[]{17, 21, -117, 83, 124, 30, 72, -27, 17, 13, -102}, new byte[]{112, 96, -1, 59, 19, 108, 23, -117}));
            Iterator itD = C0133t.d(new byte[]{-82, 114, -9, 4, 14, 124, 1, 90, -5, 114, -80, 73, 69, 48, 64}, new byte[]{-37, 30, -39, 105, 123, 16, 33, 100}, l.e(C0197c.l(C0098a.a(new byte[]{21, 67, 49, -59, -46, 11, -19, 77, 10, 64, 50, -101, -46, 64, -14, 87, 79, 0, 107, -42, -49, 30, -79, 7, 28, 69, 38, -35, -98, 80, -95, 95}, new byte[]{125, 55, 69, -75, -95, 49, -62, 98}) + URLEncoder.encode(strOptString2), null)));
            while (true) {
                if (!itD.hasNext()) {
                    strC = "";
                    break;
                }
                m mVar = (m) itD.next();
                String strV0 = mVar.v0();
                if (strV0.contains(strOptString2) && strV0.contains(strOptString3)) {
                    strC = mVar.c(C0098a.a(new byte[]{36, -111, -118, -120}, new byte[]{76, -29, -17, -18, 112, -91, -25, 81}));
                    break;
                }
            }
            if (!TextUtils.isEmpty(strC)) {
                strOptString = l.e(C0197c.l(C0098a.a(new byte[]{50, 55, -48, -81, 86, 74, -53, 110, 45, 52, -45, -15, 86, 1, -44, 116, 104, 116, -118, -68, 75}, new byte[]{90, 67, -92, -33, 37, 112, -28, 65}) + strC, null)).o0(C0098a.a(new byte[]{-126, -123, 117, 106, 19, -114, 22, 57, -49, -117, 110, 101, 90, -57, 20, 62, -110}, new byte[]{-95, -25, 1, 4, 62, -22, 121, 78})).a(C0098a.a(new byte[]{-11, -116, -4, -109}, new byte[]{-99, -2, -103, -11, -112, 87, 36, 25}));
            }
        } else {
            strOptString = !TextUtils.isEmpty(jSONObject.optString(C0098a.a(new byte[]{122, 25, -102}, new byte[]{15, 107, -10, 72, 51, -72, -121, 68}))) ? jSONObject.optString(C0098a.a(new byte[]{80, 83, 43}, new byte[]{37, 33, 71, -89, -53, 16, -13, -8})) : jSONObject.optJSONArray(C0098a.a(new byte[]{-62, -40, 23, -108, -35, 34, -45, 90, -46, -43}, new byte[]{-96, -71, 116, -1, -88, 82, -116, 47})).optString(0);
        }
        h hVar3 = new h();
        hVar3.y(strOptString);
        hVar3.l();
        return hVar3.toString();
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(C0098a.a(new byte[]{38, -94, 33, -6, -110, -126, -91, 36, -69, 38, 90, 91, 5, 73, 90, -29, 41, -94, -22, 91, -40, -30, -117, 100, -44, 50, 32, -33, -93, 73, 8, -82, 46, -16, -93, 26, 86, 10, 94, -82, 113, -94, 35, -4, -105, -116, -94, 15, -69, 38, 90, 91, 5, 73, 85, -32, 50, -30, -89, 21, 29, 22}, new byte[]{93, -128, -58, 121, 63, 107, 50, -116}));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new C0135a(jSONObject.optString(next), next));
        }
        return h.t(arrayList, new ArrayList());
    }

    public String playerContent(String str, String str2, List<String> list) {
        return str2.startsWith(C0098a.a(new byte[]{110, -90, -60, -115, 121}, new byte[]{5, -45, -93, -30, 12, 37, 23, -40})) ? getKugouMusicPlayUrl(str2.split(C0098a.a(new byte[]{100}, new byte[]{73, 33, -19, -1, 21, -23, -61, -52}))[1]) : str2.startsWith(C0098a.a(new byte[]{71, -114, 124, 14, 75, -37}, new byte[]{38, -25, 8, 103, 37, -68, -95, -124})) ? getAiTingMusicPlayUrl(str2.split(C0098a.a(new byte[]{114}, new byte[]{95, -25, 3, -115, -15, -5, 72, 108}))[1]) : "";
    }
}
