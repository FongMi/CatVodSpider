package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
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
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class KmeiJu extends Spider {
    private static String a = C0098a.a(new byte[]{-128, 8, 122, 8, 55, 108, 58, 113, -97, 11, 121, 86, 61, 55, 121, 55, -101, 20, 103, 86, 39, 57, 120}, new byte[]{-24, 124, 14, 120, 68, 86, 21, 94});

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{5, 29, -12, 28, -15, -87, -72, -68, 62, 26}, new byte[]{80, 110, -111, 110, -36, -24, -33, -39}), C0098a.a(new byte[]{115, -123, 62, -73, 84, 73, 22, -62, 11, -60, 116, -2, 16, 114, 30, -125, 90, -123, 51, -83, 24, 107, 35, -51, 15, -38, 106, -18, 3, 5, 32, -124, 80, -36, 112, -27, 24, 93, 65, -39, 23, -54, 5, -82, 72, 73, 18, -70, 91, -120, 15, -73, 76, 10, 66, -34, 9, -60, 119, -24, 24, 13, 60, -91, 106, -89, 8, -14, 24, 73, 30, -122, 91, -54, 3, -69, 91, 78, 24, -60, 30, -87, 44, -84, 87, 72, 18, -62, 15, -37, 115, -16, 8, 11, 71, -61, 14, -54, 23, -65, 94, 68, 5, -124, 17, -33, 119, -23, 22, 22, 65}, new byte[]{62, -22, 68, -34, 56, 37, 119, -19}));
        return map;
    }

    public static String decrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{29, -18, -49, 43}, new byte[]{47, -42, -10, 27, -43, 111, 22, 57}, sb, str2);
        String strB = C0133t.b(new byte[]{112, -9, -79, 88, 93, 45}, new byte[]{4, -75, -120, 109, 100, 110, -48, -122}, sb);
        String strA = C0098a.a(new byte[]{-124, 64, -40, 48, -111, -111, -59, -67, -121, 52, -35, 52, -104, -27, -74, -63}, new byte[]{-74, 6, -23, 3, -96, -45, -128, -124});
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bytes = strB.getBytes();
        byte[] bytes2 = strA.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, C0098a.a(new byte[]{-109, -8, -79}, new byte[]{-46, -67, -30, -69, 47, 60, 120, -49}));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
        Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{114, -50, -63, 50, -38, -122, 69, -88, 99, -64, -47, 78, -84, -108, 103, -29, 87, -30, -4, 122}, new byte[]{51, -117, -110, 29, -103, -60, 6, -121}));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get(C0098a.a(new byte[]{45, -83, 71, 43, 41, 113}, new byte[]{78, -52, 51, 78, 96, 21, 34, -30})) != null) {
            str = map.get(C0098a.a(new byte[]{102, 19, 107, 86, 28, -57}, new byte[]{5, 114, 31, 51, 85, -93, -122, 122}));
        }
        return h.q(parseVodList(l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-109, 56, -62, 88, -73, -1, 102, -99, -111, 70, -121, 26, -19, -3, 110, -61, -103, 24, -121, 26, -19, -1}, new byte[]{-68, 107, -86, 55, -64, -48, 67, -18}), str, str2), a())).o0(C0098a.a(new byte[]{-14, -56, 98, 48, -64, 23, -93, 100, -77, -48, 127, 49, -53, 12, -93, 110, -88, -37, 102}, new byte[]{-36, -66, 11, 84, -91, 120, -114, 7}))));
    }

    public String detailContent(List<String> list) {
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-97, 84, -122, -91, 32, 93, 72, -41, -35, 80, -120, -88, 63, 75, 17, -118, -46, 94, -97, -80, 51, 86, 17}, new byte[]{-79, 49, -15, -60, 86, 56, 101, -89}));
        byte b = 33;
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{13, 80, 127, 83, -31, -55, -17, -49, 79, 84, 113, 94, -2, -33, -74, -110, 87, 84, 106, 18, -87, -116, -73, -45, 3, 11, 40, 94, -2, -116, -4, -97, 66}, new byte[]{35, 53, 8, 50, -105, -84, -62, -65}));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < c0074gO0.size()) {
            sb2.append(c0074gO02.get(i).v0());
            sb2.append(C0098a.a(new byte[]{-101, 84, -78}, new byte[]{-65, 112, -106, -23, -29, 96, 12, 89}));
            C0074g c0074gO03 = c0074gO0.get(i).o0(C0098a.a(new byte[]{b}, new byte[]{64, 4, -64, 9, -25, 18, 47, 70}));
            int i2 = 0;
            while (i2 < c0074gO03.size()) {
                m mVar = c0074gO03.get(i2);
                String strC = mVar.c(C0098a.a(new byte[]{29, -21, 58, -120}, new byte[]{117, -103, 95, -18, 41, 44, -72, -124}));
                sb.append(mVar.v0());
                sb.append(C0098a.a(new byte[]{-23}, new byte[]{-51, 10, -57, -96, 36, 0, 43, 53}));
                sb.append(strC);
                sb.append(i2 < c0074gO03.size() - 1 ? C0098a.a(new byte[]{8}, new byte[]{43, -7, -53, 111, -86, -60, 50, 52}) : C0098a.a(new byte[]{-12, -84, -88}, new byte[]{-48, -120, -116, 122, 93, -95, 20, -21}));
                i2++;
            }
            i++;
            b = 33;
        }
        String strA = i.a(new byte[]{-2, -93, -49, -39, 98, -88, 116, -13, -71, -87, -52, -62, 46, -75, 113, -86, -68, -94, -118, -52}, new byte[]{-48, -57, -86, -83, 3, -63, 24, -34}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{72, 7, 17, 92, 97, -74, 32, -104, 11, 4, 26, 86, 34, -71, 100, -121}, new byte[]{102, 101, 125, 51, 2, -35, 13, -15})).a(C0098a.a(new byte[]{52, -11, 115, 4, 41, -66, 68, 111, 55, -3, 105, 4, 104}, new byte[]{80, -108, 7, 101, 4, -47, 54, 6}));
        String str = C0098a.a(new byte[]{11, -84, -33, 18, -6, 46, -80, 22, 93, -2, -17, 74, -100, 6, -3, 126, 113, -71, -118, 126, -23, 124, -34, 14, 10, -97, -60, -53, -111, 58, -17, 121, 103, -94, -117, 106, -63, 113, -25, 61, 4, -70, -22, 24, -37, 4, -67, 37, 83, -8, -3, 123, 71, -85, 102, 123, 66, -99, -120, 74, -14, -81}, new byte[]{-20, 29, 108, -15, 121, -107, 88, -100}) + i.a(new byte[]{41, 29, -37, 22, 32, 3, 109, -125, 104, 22, -63, 7, 60, 14}, new byte[]{7, 120, -75, 98, 82, 122, 64, -32}, hVarE).replace(C0098a.a(new byte[]{74, 109, 47, -70, -109, -42, -2, -34, 55}, new byte[]{-83, -61, -81, 94, 40, 93, 17, 98}), "");
        String strA3 = i.a(new byte[]{-1, 82, 117, -3, -111, 105, 49, 96, -72, 88, 118, -26, -35, 116, 56, 53, -91, 22, 46, -87, -34, 101, 42, 44, -89, 83, 61, -22, -97, 108, 49, 44, -95, 69, 117, -92, -103, 116, 56, 32, -15, 8, 48, -7, -54, 110, 41, 37, -4, 85, 120, -32, -100, 100, 117, 124, -8, 22, 113}, new byte[]{-47, 54, 16, -119, -16, 0, 93, 77}, hVarE);
        String strA4 = i.a(new byte[]{39, -88, -13, -122, 55, -36, -69, 105, 96, -94, -16, -99, 123, -63, -78, 60, 125, -20, -88, -46, 38, -107, -74}, new byte[]{9, -52, -106, -14, 86, -75, -41, 68}, hVarE);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA2);
        kVar.h(strA);
        kVar.c(strA4);
        kVar.e(str);
        kVar.f(strA3);
        kVar.j(sb2.toString());
        kVar.k(sb.toString());
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(a, a()));
        Iterator itD = C0133t.d(new byte[]{5, -91, 125, 110, 20, -95, -94, -126, 2, -28, 36, 111, 2, -72, -94, -126, 2, -23, 109, 61, 15, -95, -14, -39, 80, -88}, new byte[]{112, -55, 83, 29, 99, -56, -46, -25}, hVarE);
        int i = 0;
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList.size() > 6) {
                break;
            }
            if (i == 0) {
                i++;
            } else {
                String[] strArrSplit = mVar.c(C0098a.a(new byte[]{56, -77, 54, -98}, new byte[]{80, -63, 83, -8, 109, 97, -115, 44})).split(C0098a.a(new byte[]{101}, new byte[]{74, 57, -89, -73, 101, -80, -11, 89}));
                arrayList.add(new C0135a(strArrSplit[strArrSplit.length - 1], mVar.v0()));
            }
        }
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{69, 55, 38, 57, 121, 113, -4, -97, 4, 47, 59, 56, 114, 106, -4, -107, 31, 36, 34}, new byte[]{107, 65, 79, 93, 28, 30, -47, -4}));
        return h.t(arrayList, parseVodList(new C0074g(c0074gO0.subList(0, Math.min(c0074gO0.size(), 5)))));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public List<k> parseVodList(C0074g c0074g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074g) {
            j.a(a + mVar.o0(C0098a.a(new byte[]{-3, 99, 28, 30, 39, -60, -41, -110, -78, 120, 16, 90, 124, -117, -101}, new byte[]{-45, 21, 117, 122, 66, -85, -6, -4})).a(C0098a.a(new byte[]{-110, 96, -125, -16}, new byte[]{-6, 18, -26, -106, -34, 28, 33, 75})), mVar.o0(C0098a.a(new byte[]{-30, -101, -19, 96, -106, 51, -89, 114, -83, -128, -31, 36, -51, 124, -21}, new byte[]{-52, -19, -124, 4, -13, 92, -118, 28})).a(C0098a.a(new byte[]{-92, 23, -99, 90, -29}, new byte[]{-48, 126, -23, 54, -122, -94, 84, -90})), mVar.o0(C0098a.a(new byte[]{-67, 22, 75, 26, -90, -43, -59, 66, -32, 18, 4, 8}, new byte[]{-109, 102, 36, 105, -46, -8, -87, 43})).a(C0098a.a(new byte[]{-16, 23, -76, -95, -55, -44, -21, -45, -13, 31, -82, -95, -120}, new byte[]{-108, 118, -64, -64, -28, -69, -103, -70})), y.b(new byte[]{31, 32, -41, -4, 115, 18, -60, -35, 88, 34, -46, -3}, new byte[]{49, 86, -66, -104, 22, 125, -23, -87}, mVar), arrayList);
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-87, 46, 67, 104, 86, 51, 50, 20, -72, 35, 67, 44, 27, 111, 71, 74, -16, 126, 13, 98, 80, 51, 4, 5, -83, 124}, new byte[]{-39, 66, 34, 17, 51, 65, 109, 117})).matcher(C0197c.l(C0133t.a(new StringBuilder(), a, str2), a()));
        JSONObject jSONObject = new JSONObject(matcher.find() ? matcher.group(1) : "");
        String strDecode = URLDecoder.decode(jSONObject.getString(C0098a.a(new byte[]{-12, 47, 74}, new byte[]{-127, 93, 38, -119, -45, 73, 98, 59})), C0098a.a(new byte[]{-116, -34, 28, 24, 30}, new byte[]{-39, -118, 90, 53, 38, -76, -73, 24}));
        if (strDecode.contains(C0098a.a(new byte[]{-92, -127, -21, -50, 106}, new byte[]{-118, -20, -40, -69, 82, 70, 116, 124})) || strDecode.contains(C0098a.a(new byte[]{38, -91, 84, 113}, new byte[]{8, -56, 36, 69, -99, -6, -19, 125}))) {
            h hVar = new h();
            hVar.y(strDecode);
            hVar.f(a());
            return hVar.toString();
        }
        String string = jSONObject.getString(C0098a.a(new byte[]{-107, 27, 111, 54}, new byte[]{-13, 105, 0, 91, 96, -92, -14, 43}));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        v.a(new byte[]{-116, -94, -70, 85, 21, -28, 127, 120, -45, -67, -81, 77, 4, -1, 51}, new byte[]{-93, -47, -50, 52, 97, -115, 28, 87}, sb, string);
        Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{65, -65, -98, 86, 123, 61, -84, -109, 13, -28, -38}, new byte[]{50, -51, -3, 107, 89, 21, -126, -71})).matcher(C0197c.l(C0133t.b(new byte[]{102, 27, -70}, new byte[]{72, 113, -55, -37, 10, -61, -99, -105}, sb), a()));
        Matcher matcher3 = Pattern.compile(C0098a.a(new byte[]{-88, -16, -108, 39, -102, 85, -79, 65, -83, -14, -64, 58, -7, 18, -124, 89, -8, -56, -53, 46, -27, 21, -84, 100, -74, -4, -112, 115, -25}, new byte[]{-60, -107, -32, 7, -39, 58, -33, 7})).matcher(C0197c.l(y.a(matcher2.find() ? matcher2.group(1) : "", strDecode), a()));
        if (!matcher3.find()) {
            return h.c(C0098a.a(new byte[]{-120, 66, -84, 75, 30, -94, -91, -39, -118, 109, -101, 71, 26, -75, 108, 127, -32, 45, -71, 55}, new byte[]{109, -59, 22, -94, -118, 59, -119, -7}));
        }
        JSONObject jSONObject2 = new JSONObject(matcher3.group(1).replace(C0098a.a(new byte[]{-60, 14, 42, 121, 40, 9, 23, 30, -64, 78, 102, 113, 100, 85, 78, 95, -102, 78, 108, 45}, new byte[]{-24, 108, 69, 1, 8, 52, 55, 58}), ""));
        String strDecrypt = decrypt(jSONObject2.getString(C0098a.a(new byte[]{-34, -51, -58}, new byte[]{-85, -65, -86, 122, -85, 53, 16, -24})), jSONObject2.getJSONObject(C0098a.a(new byte[]{-102, 11, -60, -54, -124, -49}, new byte[]{-7, 100, -86, -84, -19, -88, -27, 45})).getString(C0098a.a(new byte[]{69, -88, -13}, new byte[]{48, -63, -105, -112, -81, 87, 55, 65})));
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{-11, -75, 10, -66, -71, 49}, new byte[]{-70, -57, 99, -39, -48, 95, -22, -15}), C0098a.a(new byte[]{41, -70, 123, -113, -23, -128, -86, 77, 49, -94, 110, -47, -23, -37, -21, 8, 40, -70, 121, -47, -7, -43, -24}, new byte[]{65, -50, 15, -1, -102, -70, -123, 98}));
        mapA.put(C0098a.a(new byte[]{-102, -66, 5, -105, -28, -16, -61, 28, -70, -77, 1, -121, -11, -29, -117}, new byte[]{-37, -35, 102, -14, -108, -124, -18, 80}), C0098a.a(new byte[]{104, 97, -39, -53, 123, 53, -105, 80, 41, 120, -55, -72, 27, 32}, new byte[]{18, 9, -12, -120, 53, 25, -19, 56}));
        h hVar2 = new h();
        hVar2.y(strDecrypt);
        hVar2.f(mapA);
        return hVar2.toString();
    }

    public String searchContent(String str, boolean z) throws JSONException {
        JSONArray jSONArray = new JSONObject(C0197c.l(a + C0098a.a(new byte[]{-94, -126, -21, -109, -26, -58, 34, 17, -27, -101, -86, -106, -23, -33, 116, 78, -2, -98, -30, -112, -26, -51, 120, 79, -27, -97, -24, -101, -68, -45, 101, 5, -80, -38, -93, -128, -25, -125}, new byte[]{-115, -21, -123, -9, -125, -66, 12, 97}) + URLEncoder.encode(str), a())).getJSONArray(C0098a.a(new byte[]{-35, -69, 24, -3}, new byte[]{-79, -46, 107, -119, -39, 114, -41, -55}));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new k(a + C0098a.a(new byte[]{-8, -107, -111, 70, 57, 100, 113, 123}, new byte[]{-41, -47, -12, 50, 88, 13, 29, 84}) + jSONObject.getInt(C0098a.a(new byte[]{98, 112}, new byte[]{11, 20, -64, 116, -72, -20, 93, 110})), jSONObject.getString(C0098a.a(new byte[]{62, -2, -105, -68}, new byte[]{80, -97, -6, -39, 42, -103, 54, 126})), jSONObject.getString(C0098a.a(new byte[]{86, 45, -78}, new byte[]{38, 68, -47, 89, -62, 21, 122, -24}))));
        }
        return h.q(arrayList);
    }
}
