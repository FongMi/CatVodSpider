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
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.oZP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class YGP extends Spider {
    private static final String b = C0098a.a(new byte[]{-59, 38, -73, -77, -79, -10, 16, -114, -38, 37, -76, -19, -12, -92, 74, -50, -125, 49, -84, -82, -19}, new byte[]{-83, 82, -61, -61, -62, -52, 63, -95});
    private static final String c = C0098a.a(new byte[]{-16, 16, -118, -35, -16, -11, 110, 85, -120, 81, -64, -108, -76, -50, 102, 20, -39, 16, -121, -57, -68, -41, 91, 90, -116, 79, -34, -124, -89, -71, 88, 53, -22, 73, -60, -99, -68, -40, 127, 10, -47, 26, -89, -47, -2, -46, 102, 14, -110, 74, -61, -125, -78, -86, 57, 90, -107, 52, -72, -32, -47, -43, 35, 90, -47, 22, -101, -47, -68, -34, 106, 25, -42, 16, -39, -108, -33, -15, 125, 21, -48, 26, -33, -116, -86, -73, 63, 84, -119, 77, -60, -124, -78, -88, 54, 66, -99, 44, -111, -46, -3, -21, 102, 85, -120, 76, -57, -102, -81, -81}, new byte[]{-67, 127, -16, -76, -100, -103, 15, 122});
    private JSONObject a;

    private static String b(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    protected final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{127, -53, -99, 123, -97, 94}, new byte[]{18, -82, -23, 19, -16, 58, -66, -60}), C0098a.a(new byte[]{3, -67, -46}, new byte[]{68, -8, -122, -37, -91, 83, -58, -97}));
        map.put(C0098a.a(new byte[]{-85, 67, -127, -57, 56, 73, 104, -120, -112, 68}, new byte[]{-2, 48, -28, -75, 21, 8, 15, -19}), c);
        map.put(C0098a.a(new byte[]{-15, -120, -76, 55, -50, -127}, new byte[]{-80, -21, -41, 82, -66, -11, -115, 126}), C0098a.a(new byte[]{61, -6, 102, 119, -86, 34, -44, -113, 37, -77, 127, 115, -11, 38, -55, -127, 40, -21, 119, 108, -21, 101, -40, -118, 61, -14, 114, 40, -3, 39, -52, -50, 40, -17, 110, 111, -20, 41, -63, -106, 32, -16, 112, 44, -3, 39, -52, -39, 56, -94, 46, 45, -68, 102, -55, -113, 40, -8, 123, 44, -28, 60, -55, -124, 101, -10, 115, 98, -30, 47, -113, -107, 44, -3, 110, 47, -20, 39, -63, -123, 44, -80, 127, 115, -21, 45, -116, -56, 102, -75, 37, 114, -72, 122, -114, -38, 101, -2, 110, 115, -23, 35, -61, -125, 61, -10, 113, 109, -86, 57, -55, -123, 39, -6, 122, 46, -32, 50, -61, -118, 40, -15, 121, 102, -66, 60, -99, -128, 122, -92, 111, 62, -75, 100, -103}, new byte[]{73, -97, 30, 3, -123, 74, -96, -30}));
        map.put(C0098a.a(new byte[]{46, -113, 94, -122, 50, 46, 81, -15, 14, -126, 90, -106, 35, 61, 25}, new byte[]{111, -20, 61, -29, 66, 90, 124, -67}), C0098a.a(new byte[]{-17, 58, 109, 90, -51, 117, 117, 15, -82, 35, 125, 41, -83, 96}, new byte[]{-107, 82, 64, 25, -125, 89, 15, 103}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        try {
            char c2 = 0;
            byte b2 = 1;
            char c3 = 2;
            char c4 = 3;
            int i3 = 4;
            String[] strArr = {"", "", "", "", ""};
            String str3 = b + str;
            strArr[4] = str2;
            if (map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    strArr[Integer.parseInt(str4)] = URLEncoder.encode(map.get(str4));
                }
            }
            String strL = C0197c.l(str3 + TextUtils.join(C0098a.a(new byte[]{0}, new byte[]{95, -59, -42, 21, -1, 38, 99, -71}), strArr), a());
            h hVarE = l.e(strL);
            JSONObject jSONObject = new JSONObject();
            C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-70, -26, -34, 43, -41, -42, 100, 47, -85, -66, -114, 43}, new byte[]{-54, -56, -82, 74, -80, -77, 73, 65}));
            if (c0074gO0.size() == 0) {
                i2 = Integer.parseInt(str2);
                i = i2;
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < c0074gO0.size(); i5++) {
                    m mVar = c0074gO0.get(i5);
                    if (isNumeric(mVar.v0()) && i4 < Integer.parseInt(mVar.v0())) {
                        i4 = Integer.parseInt(mVar.v0());
                    }
                }
                i = Integer.parseInt(hVarE.o0(C0098a.a(new byte[]{-125, 111, -91, -64, -13, 13, -117, -111, -110, 55, -11, -64, -70, 11, -45, -115, -127, 36, -69, -43}, new byte[]{-13, 65, -43, -95, -108, 104, -90, -1})).h());
                i2 = i4;
            }
            JSONArray jSONArray = new JSONArray();
            if (!strL.contains(C0098a.a(new byte[]{119, 44, 13, 44, -54, -9, 103, -57, 47, 123, 36, 122, -80, -4, 41, -88, 18, 45, 68, 108, -41, -103, 27, -54, 118, 37, 63, 44, -56, -30, 100, -35, 55}, new byte[]{-111, -98, -84, -54, 86, 126, -127, 78}))) {
                C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{-106, 101, -94, 74, -59, 86, 27, 73, -128, 33, -26, 7, -61, 84, 88, 65, -109, 101, -70, 68, -56, 81, 3, 2, -97, 99, -94, 8, -59, 75, 1, 12, -52, 44, -95, 8, -116, 84, 28, 12, -52, 44, -75}, new byte[]{-14, 12, -44, 100, -84, 56, 117, 44}));
                int i6 = 0;
                while (i6 < c0074gO02.size()) {
                    m mVar2 = c0074gO02.get(i6);
                    byte[] bArr = new byte[i3];
                    bArr[c2] = -54;
                    bArr[b2] = 46;
                    bArr[c3] = 100;
                    bArr[c4] = -15;
                    byte[] bArr2 = new byte[8];
                    bArr2[c2] = -94;
                    bArr2[b2] = 92;
                    bArr2[c3] = b2;
                    bArr2[c4] = -105;
                    bArr2[4] = 114;
                    bArr2[5] = 98;
                    bArr2[6] = -28;
                    bArr2[7] = -103;
                    String strC = mVar2.c(C0098a.a(bArr, bArr2));
                    byte[] bArr3 = new byte[4];
                    bArr3[c2] = 99;
                    bArr3[b2] = -21;
                    bArr3[c3] = -119;
                    bArr3[c4] = 19;
                    byte[] bArr4 = new byte[8];
                    bArr4[c2] = 16;
                    bArr4[b2] = -101;
                    bArr4[c3] = -24;
                    bArr4[3] = 125;
                    bArr4[4] = 12;
                    bArr4[5] = -36;
                    bArr4[6] = -70;
                    bArr4[7] = -126;
                    m mVarP0 = mVar2.p0(C0098a.a(bArr3, bArr4));
                    byte[] bArr5 = new byte[5];
                    bArr5[c2] = -108;
                    bArr5[b2] = 87;
                    bArr5[c3] = -121;
                    bArr5[3] = -10;
                    bArr5[4] = 91;
                    byte[] bArr6 = new byte[8];
                    bArr6[c2] = -32;
                    bArr6[b2] = 62;
                    bArr6[2] = -13;
                    bArr6[3] = -102;
                    bArr6[4] = 62;
                    bArr6[5] = -99;
                    bArr6[6] = -95;
                    bArr6[7] = -7;
                    String strC2 = mVarP0.c(C0098a.a(bArr5, bArr6));
                    byte[] bArr7 = new byte[3];
                    bArr7[c2] = -48;
                    bArr7[b2] = -102;
                    bArr7[2] = 110;
                    byte[] bArr8 = new byte[8];
                    bArr8[c2] = -71;
                    bArr8[b2] = -9;
                    bArr8[2] = 9;
                    bArr8[3] = -85;
                    bArr8[4] = 2;
                    bArr8[5] = -39;
                    bArr8[6] = -22;
                    bArr8[7] = -1;
                    m mVarP02 = mVar2.p0(C0098a.a(bArr7, bArr8));
                    byte[] bArr9 = new byte[3];
                    bArr9[c2] = -123;
                    bArr9[b2] = 30;
                    bArr9[2] = 30;
                    byte[] bArr10 = new byte[8];
                    bArr10[c2] = -10;
                    bArr10[1] = 108;
                    bArr10[2] = 125;
                    bArr10[3] = -74;
                    bArr10[4] = 111;
                    bArr10[5] = 65;
                    bArr10[6] = 117;
                    bArr10[7] = -58;
                    String strC3 = mVarP02.c(C0098a.a(bArr9, bArr10));
                    byte[] bArr11 = new byte[4];
                    bArr11[c2] = -5;
                    bArr11[1] = 103;
                    bArr11[2] = -112;
                    bArr11[3] = -97;
                    byte[] bArr12 = new byte[8];
                    bArr12[c2] = -109;
                    bArr12[1] = 19;
                    bArr12[2] = -28;
                    bArr12[3] = -17;
                    bArr12[4] = 49;
                    bArr12[5] = 80;
                    bArr12[6] = 96;
                    bArr12[7] = 36;
                    if (!strC3.contains(C0098a.a(bArr11, bArr12))) {
                        strC3 = b + strC3;
                    }
                    byte[] bArr13 = new byte[4];
                    bArr13[c2] = -32;
                    bArr13[1] = -122;
                    bArr13[2] = -98;
                    bArr13[3] = 42;
                    byte[] bArr14 = new byte[8];
                    bArr14[c2] = -109;
                    bArr14[1] = -10;
                    bArr14[2] = -1;
                    bArr14[3] = 68;
                    bArr14[4] = -51;
                    bArr14[5] = 106;
                    bArr14[6] = -12;
                    bArr14[7] = 103;
                    String strV0 = mVar2.o0(C0098a.a(bArr13, bArr14)).f().v0();
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] bArr15 = new byte[6];
                    bArr15[c2] = -93;
                    bArr15[1] = -104;
                    bArr15[2] = 92;
                    bArr15[3] = 54;
                    bArr15[4] = -125;
                    bArr15[5] = 123;
                    jSONObject2.put(C0098a.a(bArr15, new byte[]{-43, -9, 56, 105, -22, 31, 69, 7}), strC);
                    jSONObject2.put(C0098a.a(new byte[]{115, 14, 97, 70, -102, -42, -126, 18}, new byte[]{5, 97, 5, 25, -12, -73, -17, 119}), strC2);
                    jSONObject2.put(C0098a.a(new byte[]{114, 52, -98, 126, -81, 46, 33}, new byte[]{4, 91, -6, 33, -33, 71, 66, 20}), strC3);
                    jSONObject2.put(C0098a.a(new byte[]{-63, 80, 74, 19, -60, -64, -38, -42, -59, 84, 93}, new byte[]{-73, 63, 46, 76, -74, -91, -73, -73}), strV0);
                    jSONArray.put(jSONObject2);
                    i6++;
                    c2 = 0;
                    b2 = 1;
                    c3 = 2;
                    c4 = 3;
                    i3 = 4;
                }
            }
            jSONObject.put(C0098a.a(new byte[]{127, -68, -38, 65}, new byte[]{15, -35, -67, 36, -67, -37, 38, 117}), i);
            jSONObject.put(C0098a.a(new byte[]{-128, -27, 95, 121, -56, -67, 58, 98, -124}, new byte[]{-16, -124, 56, 28, -85, -46, 79, 12}), i2);
            jSONObject.put(C0098a.a(new byte[]{121, 122, -83, -69, -56}, new byte[]{21, 19, -64, -46, -68, 84, -114, 64}), 30);
            jSONObject.put(C0098a.a(new byte[]{-41, 26, 126, -12, 121}, new byte[]{-93, 117, 10, -107, 21, 116, -116, 53}), i2 <= 1 ? jSONArray.length() : i2 * 30);
            jSONObject.put(C0098a.a(new byte[]{-25, 75, -44, -61}, new byte[]{-117, 34, -89, -73, -108, -27, 83, 119}), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strA;
        try {
            StringBuilder sb = new StringBuilder();
            String str = b;
            sb.append(str);
            char c2 = 0;
            sb.append(list.get(0));
            h hVarE = l.e(C0197c.l(sb.toString(), a()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            hVarE.o0(C0098a.a(new byte[]{31, -97, -73, -28, 73, -120, 39, -125, 9, -37, -74, -72, 65, -106, 57, -125, 9}, new byte[]{123, -10, -63, -54, 32, -26, 73, -26})).get(0);
            String strA2 = hVarE.o0(C0098a.a(new byte[]{-91, -40, -123, 37, 58, -109, -45, -115, -92, -100, -121, 98, 35, -112, -64, -55, -84, -63, -102, 104, 119, -62, -123, -123, -31, -113, -102, 102, 48}, new byte[]{-63, -79, -13, 11, 87, -4, -91, -28})).a(C0098a.a(new byte[]{78, 113, -3}, new byte[]{61, 3, -98, 73, 7, -79, 69, -101}));
            if (!strA2.contains(C0098a.a(new byte[]{100, 71, -29, 117}, new byte[]{12, 51, -105, 5, -76, 73, 42, -42}))) {
                strA2 = str + strA2;
            }
            String strH = hVarE.o0(C0098a.a(new byte[]{48, -64, -88, 53, -109, 97, -24, 34, 117, -97, -25, 53, -103}, new byte[]{88, -15, -122, 88, -4, 23, -127, 71})).h();
            String str2 = "";
            String strV0 = "";
            String str3 = "";
            C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{34, -95, -44, -115, 65, -16, -7, -10, 35, -27, -42, -54, 88, -13, -22, -78, 34, -83, -42, -62, 69, -13, -81, -2}, new byte[]{70, -56, -94, -93, 44, -97, -113, -97}));
            int i = 0;
            while (i < c0074gO0.size()) {
                m mVar = c0074gO0.get(i);
                byte[] bArr = new byte[4];
                bArr[c2] = 22;
                bArr[1] = 18;
                bArr[2] = 19;
                bArr[3] = -123;
                JSONObject jSONObject3 = jSONObject;
                if (mVar.c(C0098a.a(bArr, new byte[]{126, 96, 118, -29, 55, -99, 109, -61})).contains(C0098a.a(new byte[]{98, -120, -44, -43, -62, -113, 90}, new byte[]{1, -25, -95, -69, -74, -3, 35, 17}))) {
                    strV0 = c0074gO0.get(i).v0();
                }
                if (c0074gO0.get(i).c(C0098a.a(new byte[]{-38, -46, 64, -55}, new byte[]{-78, -96, 37, -81, 9, -21, 12, -126})).contains(C0098a.a(new byte[]{-112, 125, 87, -69, 46, 91, -102, 114, -104}, new byte[]{-3, 18, 33, -46, 75, 47, -29, 2}))) {
                    str2 = str2 + c0074gO0.get(i).v0() + C0098a.a(new byte[]{26}, new byte[]{53, 83, -108, -116, -16, 73, 103, 11});
                }
                i++;
                jSONObject = jSONObject3;
                c2 = 0;
            }
            JSONObject jSONObject4 = jSONObject;
            String strB = b(Pattern.compile(C0098a.a(new byte[]{120, 2, -7, 81, -10, -107, -55, 126, 7, -123, 107, -100, 99, -27, -98, 121, 123, 17, -47}, new byte[]{-99, -83, 69, -73, 74, 1, 38, -62})), hVarE.o0(C0098a.a(new byte[]{-120, 89, -56, -98, 103, -122, 67, 52, -119, 29, -54, -39, 126, -123, 80, 112, -120, 85, -54, -47, 99, -123, 21, 45}, new byte[]{-20, 48, -66, -80, 10, -23, 53, 93})).h());
            String strB2 = b(Pattern.compile(C0098a.a(new byte[]{-60, -86, -118, -3, -3, -11, 118, -113, -70, 58, 92, 108, 78, 124}, new byte[]{32, 18, 0, 27, 101, 85, -103, 51})), hVarE.o0(C0098a.a(new byte[]{9, -55, -84, -35, 13, -66, -56, 90, 8, -115, -82, -102, 20, -67, -37, 30, 9, -59, -82, -110, 9, -67, -98, 67}, new byte[]{109, -96, -38, -13, 96, -47, -66, 51})).h());
            String strB3 = b(Pattern.compile(C0098a.a(new byte[]{-52, 30, -105, 40, -81, -89, 17, -80, -78, -114, 2, -27, 58, -42, 119, -85, -50, 37, -87}, new byte[]{40, -90, 44, -50, 19, 51, -2, 12})), hVarE.o0(C0098a.a(new byte[]{21, 95, -87, -96, 0, 7, -97, 77, 20, 27, -85, -25, 25, 4, -116, 9, 21, 83, -85, -17, 4, 4, -55, 84}, new byte[]{113, 54, -33, -114, 109, 104, -23, 36})).h());
            String strB4 = b(Pattern.compile(C0098a.a(new byte[]{16, -50, -55, 91, 82, 66, 68, 57, 111, 111, 64, -106, -8, -101, -125, 109, 90, -31, -119, 6, 87, -101, -126}, new byte[]{-11, 71, 110, -67, -47, -57, -85, -123})), hVarE.o0(C0098a.a(new byte[]{-83, 10, 105, -13, 119, 21, 85, -73, -84, 78, 107, -76, 110, 22, 70, -13, -83, 6, 107, -68, 115, 22, 3, -82}, new byte[]{-55, 99, 31, -35, 26, 122, 35, -34})).h());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{-35, -118, -70, 62, 89, -85, 108, 14, -114, -101, -87, 113, 79, -75, 97, 94, -64, -34, -11, 40, 66, -80, 126, 10}, new byte[]{-2, -2, -37, 92, 46, -39, 13, 126}));
            String strA3 = "";
            String str4 = "";
            int i2 = 0;
            while (i2 < c0074gO02.size()) {
                ArrayList arrayList3 = new ArrayList();
                String str5 = strB3;
                String str6 = str3;
                arrayList.add(c0074gO02.g(C0098a.a(new byte[]{126, -80}, new byte[]{10, -40, 62, -101, -50, -25, -119, -72})).e().v0());
                C0074g c0074g = c0074gO02;
                C0074g c0074gO03 = c0074gO02.get(i2).o0(C0098a.a(new byte[]{12, 70, 92, -99, 102, -26, -27, 112, 11, 86, 81, -98, 42, -31, -92, 109, 28, 86, 21, -120, 36, -9}, new byte[]{120, 34, 124, -4, 72, -110, -119, 25}));
                int i3 = 0;
                while (i3 < c0074gO03.size()) {
                    arrayList3.add(c0074gO03.get(i3).v0() + C0098a.a(new byte[]{-117}, new byte[]{-81, 54, 11, 14, 66, -34, 15, 53}) + c0074gO03.get(i3).c(C0098a.a(new byte[]{-128, -97, -14, -114}, new byte[]{-24, -19, -105, -24, -16, 90, 91, -12})));
                    i3++;
                    c0074gO03 = c0074gO03;
                    strV0 = strV0;
                    strB2 = strB2;
                }
                String str7 = strB2;
                String str8 = strV0;
                String strJoin = arrayList3.size() > 1 ? TextUtils.join(C0098a.a(new byte[]{29}, new byte[]{62, -82, 124, 28, -41, -67, -39, -110}), arrayList3) : (String) arrayList3.get(0);
                arrayList2.add(strJoin);
                if (arrayList2.size() > 1) {
                    String strJoin2 = TextUtils.join(C0098a.a(new byte[]{55, -36, -99}, new byte[]{19, -8, -71, -37, 62, -93, 0, 19}), arrayList2);
                    strA3 = TextUtils.join(C0098a.a(new byte[]{64, -108, 21}, new byte[]{100, -80, 49, 113, -79, 126, -17, -69}), arrayList);
                    str4 = strJoin2;
                } else {
                    str4 = strJoin;
                    strA3 = (String) arrayList.get(0);
                }
                i2++;
                strB3 = str5;
                str3 = str6;
                c0074gO02 = c0074g;
                strV0 = str8;
                strB2 = str7;
            }
            String str9 = strB2;
            String str10 = str3;
            String str11 = strB3;
            String str12 = strV0;
            if (strA3.equals("")) {
                strA = C0098a.a(new byte[]{107, -56, -83, 87, 96, -116, 97, -95, 9, -73, -66, 59, -45, 91, -1, 116}, new byte[]{-115, 82, 47, -79, -9, 44, -120, 3});
                strA3 = C0098a.a(new byte[]{-62, -69, -115, -125, -3, 91, -67, 122, -96, -60, -98, -17}, new byte[]{36, 33, 15, 101, 106, -5, 84, -40});
            } else {
                strA = str4;
            }
            jSONObject2.put(C0098a.a(new byte[]{-89, 29, 17, -127, -88, 12}, new byte[]{-47, 114, 117, -34, -63, 104, 115, -114}), list.get(0));
            jSONObject2.put(C0098a.a(new byte[]{-106, -111, 62, 105, 34, 17, -80, -86}, new byte[]{-32, -2, 90, 54, 76, 112, -35, -49}), strH);
            jSONObject2.put(C0098a.a(new byte[]{0, -12, -89, 2, -84, -9, -72}, new byte[]{118, -101, -61, 93, -36, -98, -37, 2}), strA2);
            jSONObject2.put(C0098a.a(new byte[]{-90, 110, -101, 9, -9, -16, 77, -28, -73}, new byte[]{-46, 23, -21, 108, -88, -98, 44, -119}), str2);
            jSONObject2.put(C0098a.a(new byte[]{-100, -45, -117, -120, -122, -11, 113, 67}, new byte[]{-22, -68, -17, -41, -1, -112, 16, 49}), str9);
            jSONObject2.put(C0098a.a(new byte[]{121, 39, 11, -30, 119, 53, 17, 70}, new byte[]{15, 72, 111, -67, 22, 71, 116, 39}), str12);
            jSONObject2.put(C0098a.a(new byte[]{-84, 118, -39, -71, 20, 108, -85, 85, -88, 114, -50}, new byte[]{-38, 25, -67, -26, 102, 9, -58, 52}), str10);
            jSONObject2.put(C0098a.a(new byte[]{-31, -66, -83, 23, 62, -8, 47, -54, -27}, new byte[]{-105, -47, -55, 72, 95, -101, 91, -91}), str11);
            jSONObject2.put(C0098a.a(new byte[]{115, 6, 48, -105, 55, -49, -70, 58, 102, 29, 59, -70}, new byte[]{5, 105, 84, -56, 83, -90, -56, 95}), strB);
            jSONObject2.put(C0098a.a(new byte[]{86, 125, -126, -74, 39, 36, 54, -55, 69, 124, -110}, new byte[]{32, 18, -26, -23, 68, 75, 88, -67}), strB4);
            jSONObject2.put(C0098a.a(new byte[]{-11, 96, 120, -25, -119, -5, -66, -27, -36, 105, 110, -41, -108}, new byte[]{-125, 15, 28, -72, -7, -105, -33, -100}), strA3);
            jSONObject2.put(C0098a.a(new byte[]{47, 79, 93, -104, 44, -61, 57, 48, 6, 85, 75, -85}, new byte[]{89, 32, 57, -57, 92, -81, 88, 73}), strA);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject4.put(C0098a.a(new byte[]{8, 55, -74, -40}, new byte[]{100, 94, -59, -84, 26, -21, -26, -24}), jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            int i = 3;
            int i2 = 4;
            int i3 = 5;
            char c2 = 6;
            int i4 = 8;
            jSONObject2.put(C0098a.a(new byte[]{-79, 78, -1, -94, -48, 56, 124}, new byte[]{-59, 55, -113, -57, -113, 81, 24, 39}), C0098a.a(new byte[]{64, 103, -74, 106, -82, 28, 96, -104}, new byte[]{45, 8, -64, 6, -57, 111, 20, -73}));
            jSONObject2.put(C0098a.a(new byte[]{57, 65, -103, 52, 111, 32, -126, -47, 40}, new byte[]{77, 56, -23, 81, 48, 78, -29, -68}), C0098a.a(new byte[]{59, 121, 103, 127, 68, 0, 98, 73, 85, 63, 91, 12, 50, 31, 9}, new byte[]{-46, -37, -29, -102, -43, -118, -123, -64}));
            jSONArray.put(jSONObject2);
            jSONObject.put(C0098a.a(new byte[]{79, -56, 11, -42, 72}, new byte[]{44, -92, 106, -91, 59, 53, -30, 60}), jSONArray);
            if (z) {
                try {
                    jSONObject.put(C0098a.a(new byte[]{-16, -76, -107, 120, 2, -123, -126}, new byte[]{-106, -35, -7, 12, 103, -9, -15, 100}), this.a);
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                    return "";
                }
            }
            C0074g c0074gO0 = l.e(C0197c.l(b, a())).o0(C0098a.a(new byte[]{-86, 72, 56, 113, -1, -73, -111, 31, -68, 12, 124, 60, -7, -75, -46, 23, -81, 72, 32, 127, -14, -80, -119, 84, -93, 78, 56, 51, -1, -86, -117, 90, -16, 1, 59, 51, -74, -75, -106, 90, -16, 1, 47}, new byte[]{-50, 33, 78, 95, -106, -39, -1, 122}));
            JSONArray jSONArray2 = new JSONArray();
            int i5 = 0;
            while (i5 < 30) {
                m mVar = c0074gO0.get(i5);
                byte[] bArr = new byte[i2];
                bArr[0] = 65;
                bArr[1] = 12;
                bArr[2] = -96;
                bArr[i] = -33;
                byte[] bArr2 = new byte[i4];
                bArr2[0] = 41;
                bArr2[1] = 126;
                bArr2[2] = -59;
                bArr2[i] = -71;
                bArr2[i2] = -79;
                bArr2[i3] = 52;
                bArr2[c2] = -50;
                bArr2[7] = -91;
                String strC = mVar.c(C0098a.a(bArr, bArr2));
                byte[] bArr3 = new byte[i2];
                bArr3[0] = -104;
                bArr3[1] = -95;
                bArr3[2] = 59;
                bArr3[i] = -1;
                byte[] bArr4 = new byte[i4];
                bArr4[0] = -21;
                bArr4[1] = -47;
                bArr4[2] = 90;
                bArr4[i] = -111;
                bArr4[i2] = -112;
                bArr4[i3] = 112;
                bArr4[6] = 88;
                bArr4[7] = -5;
                m mVarP0 = mVar.p0(C0098a.a(bArr3, bArr4));
                byte[] bArr5 = new byte[i3];
                bArr5[0] = 34;
                bArr5[1] = -81;
                bArr5[2] = 102;
                bArr5[i] = 113;
                bArr5[i2] = -45;
                byte[] bArr6 = new byte[i4];
                bArr6[0] = 86;
                bArr6[1] = -58;
                bArr6[2] = 18;
                bArr6[i] = 29;
                bArr6[i2] = -74;
                bArr6[5] = -18;
                bArr6[6] = -1;
                bArr6[7] = -65;
                String strC2 = mVarP0.c(C0098a.a(bArr5, bArr6));
                byte[] bArr7 = new byte[i];
                bArr7[0] = 126;
                bArr7[1] = -79;
                bArr7[2] = 27;
                byte[] bArr8 = new byte[i4];
                bArr8[0] = 23;
                bArr8[1] = -36;
                bArr8[2] = 124;
                bArr8[i] = 115;
                bArr8[i2] = -61;
                bArr8[5] = 65;
                bArr8[6] = -87;
                bArr8[7] = -10;
                m mVarP02 = mVar.p0(C0098a.a(bArr7, bArr8));
                byte[] bArr9 = new byte[i];
                bArr9[0] = 126;
                bArr9[1] = 70;
                bArr9[2] = 125;
                byte[] bArr10 = new byte[i4];
                bArr10[0] = 13;
                bArr10[1] = 52;
                bArr10[2] = 30;
                bArr10[i] = -56;
                bArr10[4] = 69;
                bArr10[5] = -113;
                bArr10[6] = -96;
                bArr10[7] = 56;
                String strC3 = mVarP02.c(C0098a.a(bArr9, bArr10));
                byte[] bArr11 = new byte[4];
                bArr11[0] = 114;
                bArr11[1] = -115;
                bArr11[2] = -84;
                bArr11[i] = -99;
                byte[] bArr12 = new byte[i4];
                bArr12[0] = 26;
                bArr12[1] = -7;
                bArr12[2] = -40;
                bArr12[i] = -19;
                bArr12[4] = -13;
                bArr12[5] = -54;
                bArr12[6] = 62;
                bArr12[7] = -7;
                if (!strC3.contains(C0098a.a(bArr11, bArr12))) {
                    strC3 = b + strC3;
                }
                byte[] bArr13 = new byte[4];
                bArr13[0] = 102;
                bArr13[1] = -95;
                bArr13[2] = 71;
                bArr13[i] = -36;
                byte[] bArr14 = new byte[i4];
                bArr14[0] = 21;
                bArr14[1] = -47;
                bArr14[2] = 38;
                bArr14[i] = -78;
                bArr14[4] = 105;
                bArr14[5] = -70;
                bArr14[6] = -83;
                bArr14[7] = 22;
                String strV0 = mVar.o0(C0098a.a(bArr13, bArr14)).f().v0();
                JSONObject jSONObject3 = new JSONObject();
                byte[] bArr15 = new byte[6];
                bArr15[0] = -36;
                bArr15[1] = -112;
                bArr15[2] = 9;
                bArr15[i] = 32;
                bArr15[4] = -126;
                bArr15[5] = -43;
                jSONObject3.put(C0098a.a(bArr15, new byte[]{-86, -1, 109, 127, -21, -79, -66, -84}), strC);
                jSONObject3.put(C0098a.a(new byte[]{-37, -116, 97, -55, 102, -47, 56, -54}, new byte[]{-83, -29, 5, -106, 8, -80, 85, -81}), strC2);
                jSONObject3.put(C0098a.a(new byte[]{105, -74, 66, -111, 0, 116, 74}, new byte[]{31, -39, 38, -50, 112, 29, 41, -96}), strC3);
                jSONObject3.put(C0098a.a(new byte[]{-50, -100, -33, -84, 120, 103, -89, 53, -54, -104, -56}, new byte[]{-72, -13, -69, -13, 10, 2, -54, 84}), strV0);
                jSONArray2.put(jSONObject3);
                i5++;
                c2 = 6;
                i = 3;
                i2 = 4;
                i3 = 5;
                i4 = 8;
            }
            jSONObject.put(C0098a.a(new byte[]{120, 28, 24, 38}, new byte[]{20, 117, 107, 82, -80, -75, -16, -51}), jSONArray2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void init(Context context) {
        super.init(context);
        try {
            this.a = new JSONObject(oZP.d("0E4D1A2E1A391C1C036E4E6F2E14552A092C575555704E795701162C09774F4D90F0D7B0EBE4556D4E23140302244E6F2E14552F4E6F578AF2E985D6DD4D5B631A774F4D553C402E5701557B4EB0E3F392C8CB77594D0163567790F9EBA4E5F257125B3A4E3B575555A6E4E493ECF2634077034D4D638BDDC489F4C44E285914552F4E6F5789F6D18AD5E34D5B631A774F4D91C0FCB3F5F9553C402E5701557B4EB0FFC793FCF077594D0163567790E5DFA5D1C957125B3A4E3B575555A6CBC490D6CC634077034D4D638BF2E48ACEFA4E285914552F4E6F578AFEE68AD6F04D5B631A774F4D92C8CBB3F6EA553C402E5701557B4EB3FDF793FBE577594D0163567793E7EFA5D6DC57125B3A4E3B575555A6E6FA92D2DD634077034D4D638BDFDA88CAEB4E285914552F4E6F5788F6FF85CFCB4D5B631A774F4D90C0D2BCEFD1553C402E5701557B4EB0D0E892F8D777594D0163567790CAF0A4D5EE57125B3A4E3B575555A7EEF992F9E6634077034D4D638AD7D988E1D04E285914552F4E6F5789F4CB8AD7EF4D5B631A774F4D91C2E6B3F7F5553C402E5701557B4EB0F3FD9ED8C577594D0163567790E9E5A8F5FC57122A3C402E570412384E6F575F556D4E3B14021263567790F3C7A4E0EF574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555A4C8F29CF6F1634077034D4D6389F1D286EEC74E285914552F4E6F5786D1D88AEDDA4D5B631A774F4D9EE7F5B3CDC0553C402E5701557B4EB0FADF91F8D277594D0163567790E0C7A7D5EB57125B3A4E3B575555A6D2DB90F4CA634077034D4D638BEBFB8AECFC4E285914552F4E6F5789C4D489CEC84D5B631A774F4D91F2F9B0EED2553C402E5701557B4EBDFEDE92DAD177594D016356779DE4C6A4F7E857125B3A4E3B575555A7FBF093F3DB634077034D4D638AC2D089EBED4E285914552F4E6F5786E8E889CEC84D5B631A774F4D9EDEC5B0EED2553C402E5701557B4EB0CBD892DAD177594D0163567790D1C0A4F7E857125B3A4E3B575555A7DFE590F4CA634077034D4D638AE6C58AECFC4E285914552F4E6F578AFAF189EFD34D5B631A774F4D92CCDCB0CFC9553C402E5701557B4EB0F0D993FAFA77594D0163567790EAC1A5D7C357122A3C402E570412384E6F575D556D4E3B14021263567790D6C3A5D7E8574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575555735C67414D5B631A774F4D45715E6157125B3A4E3B575555735C67464D5B631A774F4D45715E6657125B3A4E3B575555735C67474D5B631A774F4D45715E6757125B3A4E3B575555735C67444D5B631A774F4D45715E6457125B3A4E3B575555735C67454D5B631A774F4D45715E6557125B3A4E3B575555735C644C4D5B631A774F4D45715D6C57125B3A4E3B575555735C644D4D5B631A774F4D45715D6D57125B3A4E3B575555735C64424D5B631A774F4D45715D6257125B3A4E3B575555735C64434D5B631A774F4D45715D6357125B3A4E3B575555735C64404D5B631A774F4D45715D6057125B3A4E3B575555735C64414D5B631A774F4D45715D6157125B3A4E3B575555735C64464D5B631A774F4D45715D6657125B3A4E3B575555735C64474D5B631A774F4D45715D6757125B3A4E3B575555735C64444D5B631A774F4D45715D6457125B3A4E3B575555735C64454D5B631A774F4D45715D6557125B3A4E3B575555735C654C4D5B631A774F4D45715C6C57125B3A4E3B575555735C654D4D5B631A774F4D45715C6D57125B3A4E3B575555735C65424D5B631A774F4D45715C6257125B3A4E3B575555735C65434D5B631A774F4D45715C6357125B3A4E3B575555735C65404D5B631A774F4D45715C6057125B3A4E3B575555735C65414D5B631A774F4D45715C6157125B3A4E3B575555735C65464D5B631A774F4D45715C6657125B3A4E3B575555735C65474D5B631A774F4D45715C6757125B3A4E3B575555735C65444D5B631A774F4D45715C6457125B3A4E3B575555735C65454D5B631A774F4D45715C6557125B3A4E3B57555570556C4C4D5B631A774F4D4678556C57125B3A4E3B57555570556C4D4D5B631A774F4D4678556D57125B3A4E3B57555570556D454D5B631A774F4D4678546557122A3C402E570412384E6F575C556D4E3B14021263567793E1E5A4D6DA574355370D39000A557B372E5701557B4EB3E9EF9FFEFDB3EEDB91D7DC77594D0163567757125B3A4E3B575555A6EFF89CF8DF634077034D4D63043A014D0A6D17771B4D4D6388EDFF89EFE18AC2C386E0F54E795719557B4E25000D0328013057122A3C3128"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = b + str2;
            jSONObject.put(C0098a.a(new byte[]{111, -19, 7, -1, -92}, new byte[]{31, -116, 117, -116, -63, 44, 106, 124}), 1);
            jSONObject.put(C0098a.a(new byte[]{-67, 46, 72}, new byte[]{-56, 92, 36, 69, -74, -25, -40, 19}), str3);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            int i = 4;
            int i2 = 5;
            char c2 = 6;
            char c3 = 7;
            int i3 = 8;
            sb.append(C0098a.a(new byte[]{107, 115, -21, 23, 32, 109, -89, -94, 116, 112, -24, 73, 101, 63, -3, -30, 45, 100, -16, 10, 124, 104, -29, -24, 122, 112, -16, 21, 55, 106}, new byte[]{3, 7, -97, 103, 83, 87, -120, -115}));
            sb.append(URLEncoder.encode(str));
            sb.append(C0098a.a(new byte[]{-106, -36, 14, 76, -68, 13, 83, 49, -47, -40, 4, 65}, new byte[]{-80, -86, 103, 41, -53, 48, 32, 84}));
            C0074g c0074gO0 = l.e(C0197c.l(sb.toString(), a())).o0(C0098a.a(new byte[]{82, 84, 40, -95, -116, -106, 59, -6, 68, 16, 108, -20, -118, -108, 120, -14, 87, 84, 48, -81, -127, -111, 35, -79, 91, 82, 40, -29, -116, -117, 33, -65, 8, 29, 43, -29, -59, -108, 60, -65, 8, 29, 63}, new byte[]{54, 61, 94, -113, -27, -8, 85, -97}));
            JSONArray jSONArray = new JSONArray();
            int i4 = 0;
            while (i4 < c0074gO0.size()) {
                m mVar = c0074gO0.get(i4);
                byte[] bArr = new byte[i];
                bArr[0] = 22;
                bArr[1] = 92;
                bArr[2] = 63;
                bArr[3] = -117;
                byte[] bArr2 = new byte[i3];
                bArr2[0] = 126;
                bArr2[1] = 46;
                bArr2[2] = 90;
                bArr2[3] = -19;
                bArr2[i] = -58;
                bArr2[i2] = -116;
                bArr2[c2] = 76;
                bArr2[c3] = -122;
                String strC = mVar.c(C0098a.a(bArr, bArr2));
                byte[] bArr3 = new byte[i];
                bArr3[0] = -89;
                bArr3[1] = -73;
                bArr3[2] = 104;
                bArr3[3] = i;
                byte[] bArr4 = new byte[i3];
                bArr4[0] = -44;
                bArr4[1] = -57;
                bArr4[2] = 9;
                bArr4[3] = 106;
                bArr4[i] = 77;
                bArr4[i2] = i;
                bArr4[c2] = -6;
                bArr4[7] = 73;
                m mVarP0 = mVar.p0(C0098a.a(bArr3, bArr4));
                byte[] bArr5 = new byte[i2];
                bArr5[0] = -64;
                bArr5[1] = 81;
                bArr5[2] = -50;
                bArr5[3] = -46;
                bArr5[i] = -99;
                byte[] bArr6 = new byte[i3];
                bArr6[0] = -76;
                bArr6[1] = 56;
                bArr6[2] = -70;
                bArr6[3] = -66;
                bArr6[i] = -8;
                bArr6[i2] = -58;
                bArr6[6] = 74;
                bArr6[7] = -54;
                String strC2 = mVarP0.c(C0098a.a(bArr5, bArr6));
                byte[] bArr7 = new byte[i3];
                bArr7[0] = -83;
                bArr7[1] = -78;
                bArr7[2] = 12;
                bArr7[3] = -115;
                bArr7[i] = -22;
                bArr7[i2] = -19;
                bArr7[6] = -82;
                bArr7[7] = -96;
                byte[] bArr8 = new byte[i3];
                bArr8[0] = 58;
                bArr8[1] = -4;
                bArr8[2] = -21;
                bArr8[3] = -39;
                bArr8[i] = 45;
                bArr8[5] = -88;
                bArr8[6] = 44;
                bArr8[7] = 86;
                String strC3 = mVar.p0(C0098a.a(new byte[]{-60, -33, 107}, bArr7)).c(C0098a.a(new byte[]{73, -114, -120}, bArr8));
                byte[] bArr9 = new byte[i];
                bArr9[0] = 17;
                bArr9[1] = -81;
                bArr9[2] = -119;
                bArr9[3] = -27;
                byte[] bArr10 = new byte[i3];
                bArr10[0] = 121;
                bArr10[1] = -37;
                bArr10[2] = -3;
                bArr10[3] = -107;
                bArr10[i] = 84;
                bArr10[5] = -34;
                bArr10[6] = 100;
                bArr10[7] = -103;
                if (!strC3.contains(C0098a.a(bArr9, bArr10))) {
                    strC3 = b + strC3;
                }
                byte[] bArr11 = new byte[i];
                bArr11[0] = 27;
                bArr11[1] = -8;
                bArr11[2] = -98;
                bArr11[3] = -92;
                byte[] bArr12 = new byte[i3];
                bArr12[0] = 104;
                bArr12[1] = -120;
                bArr12[2] = -1;
                bArr12[3] = -54;
                bArr12[i] = -118;
                bArr12[5] = 110;
                bArr12[6] = 63;
                bArr12[7] = -43;
                String strV0 = mVar.o0(C0098a.a(bArr11, bArr12)).f().v0();
                JSONObject jSONObject2 = new JSONObject();
                byte[] bArr13 = new byte[6];
                bArr13[0] = -52;
                bArr13[1] = 59;
                bArr13[2] = 43;
                bArr13[3] = 100;
                bArr13[i] = 19;
                bArr13[5] = 66;
                jSONObject2.put(C0098a.a(bArr13, new byte[]{-70, 84, 79, 59, 122, 38, 71, -94}), strC);
                jSONObject2.put(C0098a.a(new byte[]{25, 58, -1, 109, -6, -53, 49, 96}, new byte[]{111, 85, -101, 50, -108, -86, 92, 5}), strC2);
                jSONObject2.put(C0098a.a(new byte[]{-54, -109, -90, 106, -38, -53, -117}, new byte[]{-68, -4, -62, 53, -86, -94, -24, 19}), strC3);
                jSONObject2.put(C0098a.a(new byte[]{-122, -11, -70, 66, 74, -92, 121, 19, -126, -15, -83}, new byte[]{-16, -102, -34, 29, 56, -63, 20, 114}), strV0);
                jSONArray.put(jSONObject2);
                i4++;
                i = 4;
                i2 = 5;
                c2 = 6;
                c3 = 7;
                i3 = 8;
            }
            jSONObject.put(C0098a.a(new byte[]{20, -7, 70, 54}, new byte[]{120, -112, 53, 66, 9, 95, 66, 31}), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
