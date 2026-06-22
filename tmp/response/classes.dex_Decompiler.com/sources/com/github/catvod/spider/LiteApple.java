package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0208a;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class LiteApple extends Spider {
    private static String a;
    private static String b;

    static {
        C0098a.a(new byte[]{64, 22, -93, -10, 0, -31, 97, 51, 92, 7, -70, -88, 66, -66, 41, 46, 94, 76, -76, -23, 87}, new byte[]{40, 98, -41, -122, 58, -50, 78, 90});
        a = "";
        b = null;
    }

    static byte[] a(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[333];
        for (int i = 0; i < 333; i++) {
            bArr2[i] = (byte) i;
        }
        if (bytes.length == 0) {
            bArr2 = null;
        } else {
            int length = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 333; i3++) {
                i2 = (((bytes[length] & 255) + (bArr2[i3] & 255)) + i2) % 333;
                byte b2 = bArr2[i3];
                bArr2[i3] = bArr2[i2];
                bArr2[i2] = b2;
                length = (length + 1) % bytes.length;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < bArr.length; i6++) {
            i4 = (i4 + 1) % 333;
            i5 = ((bArr2[i4] & 255) + i5) % 333;
            byte b3 = bArr2[i4];
            bArr2[i4] = bArr2[i5];
            bArr2[i5] = b3;
            bArr3[i6] = (byte) (bArr2[((bArr2[i4] & 255) + (bArr2[i5] & 255)) % 333] ^ bArr[i6]);
        }
        return bArr3;
    }

    private Map<String, String> d() {
        String strEncodeToString;
        HashMap map = new HashMap();
        try {
            strEncodeToString = Base64.encodeToString(a(b.getBytes(StandardCharsets.UTF_8), C0098a.a(new byte[]{-44, 82, 96, -115, 98, 101, 12, -46}, new byte[]{-116, 2, 41, -61, 37, 34, 89, -99})), 2);
        } catch (Exception e) {
            e.printStackTrace();
            strEncodeToString = "";
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String strA = C0098a.a(new byte[]{-14, -48, -11, 106, -85, -121, -24, -113, -59, -19, -100, 88, -116, -80, -83, -126, -61, -8, -100, 92, -110, -18, -26, -39, -124, -75}, new byte[]{-86, -128, -78, 40, -28, -33, -56, -20});
        String string = b + strA + iCurrentTimeMillis;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0098a.a(new byte[]{80, -86, -56}, new byte[]{29, -18, -3, 103, -31, -84, -28, 23}));
            messageDigest.update(string.getBytes());
            string = new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String strSubstring = string.substring(8, 12);
        map.put(C0098a.a(new byte[]{37, -116, -51, -20, -71}, new byte[]{81, -29, -90, -119, -41, 82, -24, -106}), strEncodeToString);
        map.put(C0098a.a(new byte[]{-82, -8, 18, -4, 17, 11}, new byte[]{-38, -105, 121, -103, 127, 57, 102, -59}), C0098a.a(new byte[]{109, -48, 73, 73, -55, 118, -85, -103, 71, -8, 86, 97, -40, 83, -124, -1, 97, -43, 75, 101, -23, 122, -86, -82, 80, -12, 101, 88, -115, 43, -112, -89, 26, -16, 69, 67, -54, 92, -118, -101, 80, -33, 4, 116, -14, 41, -97, -28, 89, -1, 107, 53, -56, 66, -13, -82, 1, -30, 9, 61}, new byte[]{53, -106, 49, 0, -68, 27, -58, -53}));
        map.put(C0098a.a(new byte[]{-45, -1, 90, 45, -99, -61, -101}, new byte[]{-90, -116, 63, 95, -62, -86, -1, -9}), C0098a.a(new byte[]{117, 104, -64, 40, -29, -88}, new byte[]{45, 56, -121, 106, -84, -16, -89, 11}));
        map.put(C0098a.a(new byte[]{62, 122, -101, 62, -121, 14, -56}, new byte[]{72, 31, -23, 77, -18, 97, -90, 42}), strA);
        map.put(C0098a.a(new byte[]{-50, -106, -108, -111, -54, 111, 111, 84, -54}, new byte[]{-70, -1, -7, -12, -71, 27, 14, 57}), iCurrentTimeMillis + "");
        map.put(C0098a.a(new byte[]{-5, -19, 97, -25}, new byte[]{-109, -116, 18, -113, 37, 74, 116, -21}), strSubstring);
        map.put(C0098a.a(new byte[]{-45, 55, 8, 49, 87, 65, 68}, new byte[]{-96, 84, 122, 84, 50, 47, 60, 97}), C0098a.a(new byte[]{-51, 44, -100, 86}, new byte[]{-1, 31, -81, 103, 116, -75, -45, 6}));
        map.put(C0098a.a(new byte[]{-125, 53, 70, 117, 39, 48, -66}, new byte[]{-16, 86, 52, 16, 66, 94, -57, 91}), C0098a.a(new byte[]{-79, 19, -101, 75}, new byte[]{-128, 34, -87, 122, -113, -78, 85, 22}));
        map.put(C0098a.a(new byte[]{-111, 20, -128, -26, 25, -17, -69, -88, -86, 19}, new byte[]{-60, 103, -27, -108, 52, -82, -36, -51}), C0098a.a(new byte[]{96, 76, 73, 57, -65, 126, 32, -43, 33, 22, 19, 99, -6, 63}, new byte[]{15, 39, 33, 77, -53, 14, 15, -26}));
        return map;
    }

    final String b() {
        String strE = e();
        String strE2 = e();
        String strA = C0098a.a(new byte[]{-117, 124, -53}, new byte[]{-59, 83, -118, 16, 37, -49, 22, -125});
        try {
            strA = Build.class.getField(C0098a.a(new byte[]{-50, 119, 75, 35, 53, 53}, new byte[]{-99, 50, 25, 106, 116, 121, -41, 1})).get(null).toString();
        } catch (Exception unused) {
        }
        try {
            String str = (String) Class.forName(C0098a.a(new byte[]{-89, 94, -96, -89, 16, -101, 63, 64, -87, 67, -22, -122, 6, -127, 47, 11, -85, 96, -74, -70, 15, -105, 41, 26, -81, 85, -73}, new byte[]{-58, 48, -60, -43, 127, -14, 91, 110})).getDeclaredMethod(C0098a.a(new byte[]{-124, 114, 91}, new byte[]{-29, 23, 47, 110, 82, 100, 96, 10}), String.class).invoke(null, C0098a.a(new byte[]{-64, 82, -23, 27, 27, -64, 13, -1, -100, 91, -82, 23, 9, -52, 19, -21, -64, 84, -87, 13}, new byte[]{-78, 61, -57, 121, 110, -87, 97, -101}));
            StringBuilder sbC = C0133t.c(strE);
            v.a(new byte[]{-121, -109}, new byte[]{-5, -17, 85, 122, 83, 4, -44, 47}, sbC, strE2);
            sbC.append(C0098a.a(new byte[]{-96, 105}, new byte[]{-36, 21, 48, 40, -27, 79, 115, 44}));
            byte[] bArr = new byte[6];
            new Random().nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & (-2));
            StringBuilder sb = new StringBuilder(18);
            for (int i = 0; i < 6; i++) {
                sb.append(String.format(C0098a.a(new byte[]{45, -46, 109, 44}, new byte[]{8, -30, 95, 116, 2, -93, 110, -4}), Byte.valueOf(bArr[i])));
            }
            sbC.append(sb.toString());
            sbC.append(C0098a.a(new byte[]{51, -115}, new byte[]{79, -15, 68, -30, -22, -100, 87, -33}));
            sbC.append(e());
            v.a(new byte[]{59, -47}, new byte[]{71, -83, -111, 89, 72, -5, -98, -70}, sbC, strA);
            return C0134u.b(new byte[]{3, 101}, new byte[]{127, 25, 8, -10, 103, -99, 54, -71}, sbC, str);
        } catch (Exception unused2) {
            return "";
        }
    }

    final void c() {
        try {
            URI uri = new URI(new JSONObject(new String(C0208a.e(Base64.decode(new JSONObject(C0197c.h(C0098a.a(new byte[]{-52, -23, 10, 73, 66, -20, -31, 36, -48, -8, 19, 23, 0, -77, -87, 57, -46, -77, 29, 86, 21, -20, -81, 61, -51, -77, 14, 81, 8, -20, -72, 126, -118, -24, 13, 92, 10, -20, -70, 34, -49, -8, 16, 85, 23, -92, -89, 35, -101, -21, 27, 75, 11, -86, -95, 35, -103, -84, 80, 12, 86, -10, -24, 34, -41, -96, 74}, new byte[]{-92, -99, 126, 57, 120, -61, -50, 77}), null, d()).a()).getString(C0098a.a(new byte[]{2, -59, 12, 27}, new byte[]{102, -92, 120, 122, 8, 80, -59, -107})), 0), C0098a.a(new byte[]{-90, 119, -114, -57, 3, 53, 108, 71, -90, 119, -114, -57, 3, 53, 108, 71}, new byte[]{-2, 39, -57, -119, 68, 114, 57, 8}).getBytes(), null, C0098a.a(new byte[]{54, -39, 65, -92, -50, 90, -2, 124, 39, -41, 81, -40, -66, 73, -35, 55, 19, -11, 124, -20}, new byte[]{119, -100, 18, -117, -117, 25, -68, 83}))).substring(8)).getString(C0098a.a(new byte[]{88, -95, -4, -127, -127, 15}, new byte[]{57, -47, -107, -12, -13, 99, 122, -74})));
            a = uri.getScheme() + C0098a.a(new byte[]{-78, -64, 85}, new byte[]{-120, -17, 122, 119, 66, 80, 73, -43}) + uri.getHost() + C0098a.a(new byte[]{5, 117, 83, -26, 111, 70, 31, 16}, new byte[]{42, 20, 35, -113, 65, 54, 119, 96});
        } catch (Exception unused) {
            System.out.print(C0098a.a(new byte[]{-51, -92}, new byte[]{-88, -36, -14, 43, -122, -100, 120, -38}));
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            int i = 8;
            char c = 7;
            if (map.containsKey(C0098a.a(new byte[]{109, 91, -8, -61}, new byte[]{12, 41, -99, -94, 59, -40, -114, 11}))) {
                map.get(C0098a.a(new byte[]{-78, 121, 28, -54}, new byte[]{-45, 11, 121, -85, 22, -39, 89, -8}));
            }
            if (map.containsKey(C0098a.a(new byte[]{1, 30, 36, -42}, new byte[]{120, 123, 69, -92, 92, -79, 47, 116}))) {
                map.get(C0098a.a(new byte[]{-72, -32, -49, -48}, new byte[]{-63, -123, -82, -94, 123, -67, -64, -46}));
            }
            StringBuilder sb = new StringBuilder(C0098a.a(new byte[]{-34, -1, -123, -4, 77, -60, -23, -25, -62, -18, -100, -94, 15, -101, -95, -6, -64, -91, -110, -29, 26, -60, -89, -2, -33, -91, -127, -28, 7, -60, -80, -68, -104, -3, -98, -24, 88, -118, -88, -22, -60, -28, -104, -24, 17, -126, -86, -6, -45, -7, -50, -4, 22, -116, -93, -77}, new byte[]{-74, -117, -15, -116, 119, -21, -58, -114}) + str2 + C0098a.a(new byte[]{113, -73, 64, 62, -128, -11}, new byte[]{87, -61, 57, 78, -27, -56, -48, 59}) + str);
            for (String str3 : map.keySet()) {
                String strTrim = map.get(str3).trim();
                if (!strTrim.isEmpty()) {
                    sb.append(C0098a.a(new byte[]{-33}, new byte[]{-7, -51, 92, -17, -23, -124, 57, 11}));
                    sb.append(str3);
                    sb.append(C0098a.a(new byte[]{-108}, new byte[]{-87, 49, 14, 4, 92, -29, -48, 85}));
                    sb.append(URLEncoder.encode(strTrim));
                }
            }
            JSONArray jSONArray = new JSONObject(C0197c.l(sb.toString(), d())).getJSONArray(C0098a.a(new byte[]{112, -27, -73, 0}, new byte[]{20, -124, -61, 97, 56, -19, -100, 105}));
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                JSONObject jSONObject2 = new JSONObject();
                byte[] bArr = new byte[i];
                bArr[0] = -24;
                bArr[1] = -31;
                bArr[2] = 61;
                bArr[3] = 119;
                bArr[4] = 11;
                bArr[5] = 88;
                bArr[6] = 41;
                bArr[c] = -2;
                byte[] bArr2 = new byte[i];
                bArr2[0] = 95;
                bArr2[1] = -57;
                bArr2[2] = -115;
                bArr2[3] = 20;
                bArr2[4] = -46;
                bArr2[5] = -74;
                bArr2[6] = 73;
                bArr2[7] = 38;
                jSONObject2.put(C0098a.a(new byte[]{-98, -114, 89, 40, 98, 60}, bArr), jSONObject.getString(C0098a.a(new byte[]{54, -93}, bArr2)));
                byte[] bArr3 = new byte[i];
                bArr3[0] = -107;
                bArr3[1] = -83;
                bArr3[2] = -54;
                bArr3[3] = -37;
                bArr3[4] = -47;
                bArr3[5] = -87;
                bArr3[6] = -119;
                bArr3[7] = 43;
                byte[] bArr4 = new byte[i];
                bArr4[0] = -29;
                bArr4[1] = -62;
                bArr4[2] = -82;
                bArr4[3] = -124;
                bArr4[4] = -65;
                bArr4[5] = -56;
                bArr4[6] = -28;
                bArr4[7] = 78;
                byte[] bArr5 = new byte[i];
                bArr5[0] = -12;
                bArr5[1] = 20;
                bArr5[2] = -14;
                bArr5[3] = 82;
                bArr5[4] = -56;
                bArr5[5] = -64;
                bArr5[6] = -10;
                bArr5[7] = -65;
                jSONObject2.put(C0098a.a(bArr3, bArr4), jSONObject.getString(C0098a.a(new byte[]{-102, 117, -97, 55}, bArr5)));
                jSONObject2.put(C0098a.a(new byte[]{40, 101, -119, 12, 41, -68, -120}, new byte[]{94, 10, -19, 83, 89, -43, -21, -35}), jSONObject.getString(C0098a.a(new byte[]{-79, 60, 24}, new byte[]{-63, 85, 123, -56, -54, -17, 71, 22})));
                jSONObject2.put(C0098a.a(new byte[]{102, -44, -60, -95, -112, 123, 5, 32, 98, -48, -45}, new byte[]{16, -69, -96, -2, -30, 30, 104, 65}), jSONObject.getString(C0098a.a(new byte[]{14, 27, -103, -106, 93, 87, -110, 107, 29, 4}, new byte[]{123, 107, -3, -9, 41, 50, -37, 5})));
                jSONArray2.put(jSONObject2);
                i2++;
                i = 8;
                c = 7;
            }
            JSONObject jSONObject3 = new JSONObject();
            int i3 = Integer.parseInt(str2);
            jSONObject3.put(C0098a.a(new byte[]{41, -125, -88, 89}, new byte[]{89, -30, -49, 60, -43, 80, -23, 56}), i3);
            if (jSONArray2.length() == 20) {
                i3++;
            }
            jSONObject3.put(C0098a.a(new byte[]{-12, 6, 85, -12, -123, -31, -54, 120, -16}, new byte[]{-124, 103, 50, -111, -26, -114, -65, 22}), i3);
            jSONObject3.put(C0098a.a(new byte[]{-34, 7, -66, -110, 90}, new byte[]{-78, 110, -45, -5, 46, -35, 109, -87}), 20);
            jSONObject3.put(C0098a.a(new byte[]{37, 52, -79, 83, -25}, new byte[]{81, 91, -59, 50, -117, 97, 106, 33}), Integer.MAX_VALUE);
            jSONObject3.put(C0098a.a(new byte[]{-32, -101, 92, -27}, new byte[]{-116, -14, 47, -111, -108, -4, -68, 106}), jSONArray2);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject(C0197c.l(C0098a.a(new byte[]{112, 115, -7, 58, 38, 37, 122, 95, 108, 98, -32, 100, 100, 122, 50, 66, 110, 41, -18, 37, 113, 37, 52, 70, 113, 41, -3, 34, 108, 37, 35, 5, 54, 113, -30, 46, 51, 107, 59, 82, 106, 104, -28, 46, 120, 111, 33, 87, 113, 107, -65, 117, 106, 101, 49, 105, 113, 99, -80}, new byte[]{24, 7, -115, 74, 28, 10, 85, 54}) + list.get(0), d())).getJSONObject(C0098a.a(new byte[]{-30, -33, -60, 119}, new byte[]{-122, -66, -80, 22, 5, -22, -11, 97}));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0098a.a(new byte[]{102, 88, -123, -113, 105, 100}, new byte[]{16, 55, -31, -48, 0, 0, 45, -102}), jSONObject.getString(C0098a.a(new byte[]{109, -119}, new byte[]{4, -19, 33, -15, 22, 47, 82, -91})));
            jSONObject3.put(C0098a.a(new byte[]{-107, 42, -68, -93, -67, 85, -119, -28}, new byte[]{-29, 69, -40, -4, -45, 52, -28, -127}), jSONObject.getString(C0098a.a(new byte[]{-76, 105, -118, -118}, new byte[]{-38, 8, -25, -17, -21, 35, 32, 21})));
            jSONObject3.put(C0098a.a(new byte[]{-31, -128, 53, -47, 28, -84, 81}, new byte[]{-105, -17, 81, -114, 108, -59, 50, 46}), jSONObject.getString(C0098a.a(new byte[]{-40, -4, 111}, new byte[]{-88, -107, 12, 77, -78, -119, 120, -67})));
            jSONObject3.put(C0098a.a(new byte[]{-120, -106, -115, 94, -57, 119, 104, -11, -103}, new byte[]{-4, -17, -3, 59, -104, 25, 9, -104}), jSONObject.getString(C0098a.a(new byte[]{-124, 5, 30, 85, -111, -40, -43, 28, -126}, new byte[]{-25, 105, 127, 38, -30, -106, -76, 113})));
            jSONObject3.put(C0098a.a(new byte[]{-66, 116, 124, -65, -60, -14, -59, 125}, new byte[]{-56, 27, 24, -32, -67, -105, -92, 15}), jSONObject.getString(C0098a.a(new byte[]{-35, -107, -78, 125}, new byte[]{-92, -16, -45, 15, -98, -21, -106, 66})));
            jSONObject3.put(C0098a.a(new byte[]{48, -89, -78, -92, -7, 33, 110, -17}, new byte[]{70, -56, -42, -5, -104, 83, 11, -114}), jSONObject.getString(C0098a.a(new byte[]{45, -127, 44, -70}, new byte[]{76, -13, 73, -37, 71, 70, 58, -23})));
            jSONObject3.put(C0098a.a(new byte[]{-68, 51, -68, -82, 75, 34, -26, 114, -72, 55, -85}, new byte[]{-54, 92, -40, -15, 57, 71, -117, 19}), jSONObject.getString(C0098a.a(new byte[]{36, -108, -116, -53, -75, -87, -79, 95, 55, -117}, new byte[]{81, -28, -24, -86, -63, -52, -8, 49})));
            jSONObject3.put(C0098a.a(new byte[]{32, -25, 123, 19, 26, 28, -75, 50, 36}, new byte[]{86, -120, 31, 76, 123, 127, -63, 93}), jSONObject.getString(C0098a.a(new byte[]{-61, -99, -62, 10, 59}, new byte[]{-94, -2, -74, 101, 73, 14, 64, 101})));
            jSONObject3.put(C0098a.a(new byte[]{52, 125, -126, 68, -14, 7, 13, 64, 39, 124, -110}, new byte[]{66, 18, -26, 27, -111, 104, 99, 52}), C0098a.a(new byte[]{39, 55, 31, -42, 61, -80, 104, 28, 80, 82, 50, -95, 125, -117, 38, -87, 40, 20, 3, -42, 16, -74, 105, 8, 120, 95, 11, -110, 115, -82, 8, 122, 98, 42, 81, -118, 36, -20, 31, 25, -2, -123, -118, -44, 53, -119, 106, 40, 75, -127}, new byte[]{-64, -69, -76, 51, -101, 9, -114, -109}) + jSONObject.getString(C0098a.a(new byte[]{35, -7, 25, 55, -63, 94, 18}, new byte[]{64, -106, 119, 67, -92, 48, 102, 27})).trim().replaceAll(C0098a.a(new byte[]{59, 69, -26}, new byte[]{103, 54, -51, -77, 127, -75, -124, 61}), ""));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.getJSONArray(C0098a.a(new byte[]{85, -35, 107, 91}, new byte[]{32, -81, 7, 40, -70, 99, -114, -18}));
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                arrayList.add(jSONObject4.getString(C0098a.a(new byte[]{8, -127, 95}, new byte[]{99, -28, 38, -110, 1, 111, -40, 120})) + C0098a.a(new byte[]{36}, new byte[]{0, -2, 107, -104, -20, -35, -89, -126}) + jSONObject4.getString(C0098a.a(new byte[]{-27, -12, -6}, new byte[]{-112, -122, -106, 108, 80, 71, -2, -89})));
            }
            jSONObject3.put(C0098a.a(new byte[]{-1, 114, -19, -36, 127, 93, 126, -97, -42, 123, -5, -20, 98}, new byte[]{-119, 29, -119, -125, 15, 49, 31, -26}), C0098a.a(new byte[]{0, -43, -28, 99, 10, 64, 16, -12, 41}, new byte[]{76, -68, -112, 6, 75, 48, 96, -104}));
            jSONObject3.put(C0098a.a(new byte[]{65, 101, -65, 75, 56, 29, 25, 12, 104, 127, -87, 120}, new byte[]{55, 10, -37, 20, 72, 113, 120, 117}), TextUtils.join(C0098a.a(new byte[]{65}, new byte[]{98, 99, 2, -81, -120, -75, 83, 0}), arrayList));
            jSONArray.put(jSONObject3);
            jSONObject2.put(C0098a.a(new byte[]{-96, 50, 39, -115}, new byte[]{-52, 91, 84, -7, -96, 10, -64, 69}), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    final String e() {
        String strA = C0098a.a(new byte[]{-48, 127, 61, 96, 112, -53, -12, -18, -40, 119, 53, 104, 120, -61, -4, -10, -64, 111, 45, 112, 96, -37, -28, -2, -56, 103, 31, 70, 86, -23, -42, -64, -10, 85, 23, 78, 94, -31, -34, -56, -2, 77, 15, 86, 70, -7, -58, -48, -26, 69, 7, 94, 37, -100, -95, -75, -123, 40, 104}, new byte[]{-79, 29, 94, 4, 21, -83, -109, -122});
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(strA.charAt(random.nextInt(strA.length())));
        }
        return sb.toString();
    }

    public String homeContent(boolean z) {
        try {
            byte b2 = 0;
            char c = 1;
            byte b3 = 2;
            char c2 = 3;
            char c3 = 4;
            char c4 = 5;
            char c5 = 6;
            char c6 = 7;
            int i = 9;
            JSONArray jSONArray = new JSONObject(C0197c.l(C0098a.a(new byte[]{-33, 113, -46, 17, 28, 79, -88, -52, -61, 96, -53, 79, 94, 16, -32, -47, -63, 43, -59, 14, 75, 79, -26, -43, -34, 43, -42, 9, 86, 79, -15, -105, -103, 115, -55, 5, 9, 1, -23, -63, -59, 106, -49, 5, 82, 25, -9, -64, -60}, new byte[]{-73, 5, -90, 97, 38, 96, -121, -91}), d())).getJSONArray(C0098a.a(new byte[]{5, 69, 29, -53}, new byte[]{97, 36, 105, -86, -74, -40, -58, -126}));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                byte[] bArr = new byte[i];
                bArr[b2] = b3;
                bArr[c] = -52;
                bArr[b3] = -95;
                bArr[c2] = 19;
                bArr[c3] = 63;
                bArr[c4] = 122;
                bArr[c5] = 59;
                bArr[c6] = 75;
                bArr[8] = 19;
                byte[] bArr2 = new byte[8];
                bArr2[b2] = 118;
                bArr2[c] = -75;
                bArr2[b3] = -47;
                bArr2[c2] = 118;
                bArr2[c3] = 96;
                bArr2[c4] = 20;
                bArr2[c5] = 90;
                bArr2[7] = 38;
                String string = jSONObject2.getString(C0098a.a(bArr, bArr2));
                byte[] bArr3 = new byte[7];
                bArr3[b2] = -40;
                bArr3[c] = -126;
                bArr3[b3] = 106;
                bArr3[c2] = -72;
                bArr3[c3] = 72;
                bArr3[c4] = -24;
                bArr3[c5] = -72;
                byte[] bArr4 = new byte[8];
                bArr4[b2] = -84;
                bArr4[c] = -5;
                bArr4[b3] = 26;
                bArr4[c2] = -35;
                bArr4[c3] = 23;
                bArr4[c4] = -127;
                bArr4[6] = -36;
                bArr4[7] = -114;
                String string2 = jSONObject2.getString(C0098a.a(bArr3, bArr4));
                JSONObject jSONObject3 = new JSONObject();
                byte[] bArr5 = new byte[7];
                bArr5[b2] = -114;
                bArr5[c] = 43;
                bArr5[b3] = 97;
                bArr5[c2] = -50;
                bArr5[c3] = 104;
                bArr5[5] = 45;
                bArr5[6] = 13;
                byte[] bArr6 = new byte[8];
                bArr6[b2] = -6;
                bArr6[c] = 82;
                bArr6[b3] = 17;
                bArr6[c2] = -85;
                bArr6[4] = 55;
                bArr6[5] = 68;
                bArr6[6] = 105;
                bArr6[7] = 43;
                jSONObject3.put(C0098a.a(bArr5, bArr6), string2);
                byte[] bArr7 = new byte[9];
                bArr7[b2] = -36;
                bArr7[c] = 105;
                bArr7[b3] = -41;
                bArr7[c2] = 104;
                bArr7[4] = 96;
                bArr7[5] = 72;
                bArr7[6] = 44;
                bArr7[7] = -110;
                bArr7[8] = -51;
                byte[] bArr8 = new byte[8];
                bArr8[b2] = -88;
                bArr8[c] = 16;
                bArr8[b3] = -89;
                bArr8[c2] = 13;
                bArr8[4] = 63;
                bArr8[5] = 38;
                bArr8[6] = 77;
                bArr8[7] = -1;
                jSONObject3.put(C0098a.a(bArr7, bArr8), string);
                jSONArray2.put(jSONObject3);
                byte[] bArr9 = new byte[7];
                bArr9[b2] = 65;
                bArr9[c] = 21;
                bArr9[b3] = 37;
                bArr9[3] = 11;
                bArr9[4] = -18;
                bArr9[5] = 42;
                bArr9[6] = -15;
                byte[] bArr10 = new byte[8];
                bArr10[b2] = 34;
                bArr10[c] = 121;
                bArr10[b3] = 68;
                bArr10[3] = 120;
                bArr10[4] = -99;
                bArr10[5] = 79;
                bArr10[6] = -126;
                bArr10[7] = -40;
                byte[] bArr11 = new byte[5];
                bArr11[b2] = 10;
                bArr11[c] = 16;
                bArr11[b3] = -56;
                bArr11[3] = -95;
                bArr11[4] = 126;
                byte[] bArr12 = new byte[8];
                bArr12[b2] = 107;
                bArr12[c] = 98;
                bArr12[b3] = -83;
                bArr12[3] = -64;
                bArr12[4] = 13;
                bArr12[5] = -65;
                bArr12[6] = -112;
                bArr12[7] = 50;
                byte[] bArr13 = new byte[5];
                bArr13[b2] = -11;
                bArr13[c] = -3;
                bArr13[b3] = 93;
                bArr13[3] = 56;
                bArr13[4] = 34;
                byte[] bArr14 = new byte[8];
                bArr14[b2] = -116;
                bArr14[c] = -104;
                bArr14[b3] = 60;
                bArr14[3] = 74;
                bArr14[4] = 81;
                bArr14[5] = -120;
                bArr14[6] = 88;
                bArr14[7] = 88;
                JSONArray jSONArray3 = jSONObject2.getJSONArray(C0098a.a(bArr13, bArr14));
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                byte[] bArr15 = new byte[3];
                bArr15[b2] = -91;
                bArr15[c] = 39;
                bArr15[b3] = 116;
                byte[] bArr16 = new byte[8];
                bArr16[b2] = -50;
                bArr16[c] = 66;
                bArr16[2] = 13;
                bArr16[3] = -63;
                bArr16[4] = -32;
                bArr16[5] = -123;
                bArr16[6] = 15;
                bArr16[7] = -35;
                String strA = C0098a.a(bArr15, bArr16);
                byte[] bArr17 = new byte[5];
                bArr17[b2] = 126;
                bArr17[1] = 114;
                bArr17[2] = -112;
                bArr17[3] = -65;
                bArr17[4] = 103;
                byte[] bArr18 = new byte[8];
                bArr18[b2] = 29;
                bArr18[1] = 30;
                bArr18[2] = -15;
                bArr18[3] = -52;
                bArr18[4] = 20;
                bArr18[5] = -28;
                bArr18[6] = 66;
                bArr18[7] = -70;
                jSONObject4.put(strA, C0098a.a(bArr17, bArr18));
                byte[] bArr19 = new byte[4];
                bArr19[b2] = 42;
                bArr19[1] = -46;
                bArr19[2] = -27;
                bArr19[3] = 31;
                byte[] bArr20 = new byte[8];
                bArr20[b2] = 68;
                bArr20[1] = -77;
                bArr20[2] = -120;
                bArr20[3] = 122;
                bArr20[4] = b2;
                bArr20[5] = -82;
                bArr20[6] = -96;
                bArr20[7] = 67;
                String strA2 = C0098a.a(bArr19, bArr20);
                byte[] bArr21 = new byte[6];
                bArr21[b2] = 39;
                bArr21[1] = -123;
                bArr21[2] = 78;
                bArr21[3] = -108;
                bArr21[4] = -77;
                bArr21[5] = 10;
                byte[] bArr22 = new byte[8];
                bArr22[b2] = -64;
                bArr22[1] = 52;
                bArr22[2] = -11;
                bArr22[3] = 113;
                bArr22[4] = 45;
                bArr22[5] = -127;
                bArr22[6] = -109;
                bArr22[7] = -40;
                jSONObject4.put(strA2, C0098a.a(bArr21, bArr22));
                JSONArray jSONArray5 = new JSONArray();
                int i3 = 0;
                for (JSONArray jSONArray6 = jSONObject2.getJSONArray(C0098a.a(bArr9, bArr10)); i3 < jSONArray6.length(); jSONArray6 = jSONArray6) {
                    String string3 = jSONArray6.getString(i3);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(C0098a.a(new byte[]{126}, new byte[]{16, -102, -90, 36, -92, 11, -40, 76}), string3);
                    jSONObject5.put(C0098a.a(new byte[]{118}, new byte[]{0, 88, -72, 25, -14, -4, 57, 30}), string3);
                    jSONArray5.put(jSONObject5);
                    i3++;
                    jSONArray = jSONArray;
                }
                JSONArray jSONArray7 = jSONArray;
                jSONObject4.put(C0098a.a(new byte[]{-8, -1, -46, 89, 77}, new byte[]{-114, -98, -66, 44, 40, 109, -123, 71}), jSONArray5);
                jSONArray4.put(jSONObject4);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(C0098a.a(new byte[]{125, 73, 72}, new byte[]{22, 44, 49, -125, 91, -31, -105, -15}), C0098a.a(new byte[]{33, -9, 81, -115}, new byte[]{64, -123, 52, -20, -30, 88, 67, 121}));
                jSONObject6.put(C0098a.a(new byte[]{-109, -18, 22, 21}, new byte[]{-3, -113, 123, 112, 101, 98, -98, 56}), C0098a.a(new byte[]{11, 123, 67, -53, 67, -4}, new byte[]{-18, -25, -13, 46, -49, 70, -74, 57}));
                JSONArray jSONArray8 = new JSONArray();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(C0098a.a(new byte[]{-112}, new byte[]{-2, -44, 95, 36, 23, 90, -48, 1}), C0098a.a(new byte[]{-94, 87, 0, 111, -43, 68}, new byte[]{71, -46, -88, -122, 86, -20, 15, -67}));
                jSONObject7.put(C0098a.a(new byte[]{-50}, new byte[]{-72, 90, -26, 44, -110, -85, 114, 42}), "");
                jSONArray8.put(jSONObject7);
                int i4 = 0;
                for (JSONArray jSONArray9 = jSONObject2.getJSONArray(C0098a.a(bArr11, bArr12)); i4 < jSONArray9.length(); jSONArray9 = jSONArray9) {
                    String string4 = jSONArray9.getString(i4);
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put(C0098a.a(new byte[]{-13}, new byte[]{-99, -62, 119, -62, 61, -17, 21, -80}), string4);
                    jSONObject8.put(C0098a.a(new byte[]{119}, new byte[]{1, -102, -41, 24, 45, 86, -90, -118}), string4);
                    jSONArray8.put(jSONObject8);
                    i4++;
                }
                jSONObject6.put(C0098a.a(new byte[]{-103, -17, 104, 60, -83}, new byte[]{-17, -114, 4, 73, -56, -41, -58, -45}), jSONArray8);
                jSONArray4.put(jSONObject6);
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put(C0098a.a(new byte[]{-120, -128, 104}, new byte[]{-29, -27, 17, 127, -128, -61, 68, 114}), C0098a.a(new byte[]{8, 91, -116, -117}, new byte[]{113, 62, -19, -7, -119, -27, -109, -66}));
                jSONObject9.put(C0098a.a(new byte[]{77, -18, -28, 38}, new byte[]{35, -113, -119, 67, -31, 17, 40, -17}), C0098a.a(new byte[]{35, -81, 59, 74, -6, 114}, new byte[]{-58, 22, -113, -82, 65, -49, 94, -103}));
                JSONArray jSONArray10 = new JSONArray();
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(C0098a.a(new byte[]{-9}, new byte[]{-103, 62, 2, 125, -46, 97, -45, -24}), C0098a.a(new byte[]{121, 121, -21, 32, 71, 26}, new byte[]{-100, -4, 67, -55, -60, -78, 90, 34}));
                jSONObject10.put(C0098a.a(new byte[]{107}, new byte[]{29, -128, -2, 106, -3, 59, -12, 63}), "");
                jSONArray10.put(jSONObject10);
                for (int i5 = 0; i5 < jSONArray3.length(); i5++) {
                    String string5 = jSONArray3.getString(i5);
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put(C0098a.a(new byte[]{-14}, new byte[]{-100, -35, 17, 61, 43, 12, -42, 7}), string5);
                    jSONObject11.put(C0098a.a(new byte[]{116}, new byte[]{2, 48, -55, -66, -80, 32, -35, -122}), string5);
                    jSONArray10.put(jSONObject11);
                }
                jSONObject9.put(C0098a.a(new byte[]{100, 80, -18, 112, -66}, new byte[]{18, 49, -126, 5, -37, -43, 70, 14}), jSONArray10);
                jSONArray4.put(jSONObject9);
                jSONObject.put(string2, jSONArray4);
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put(C0098a.a(new byte[]{1, 91, 38}, new byte[]{106, 62, 95, 72, 17, -127, -113, -41}), C0098a.a(new byte[]{-31, 70, 107, 120, 97, -14}, new byte[]{-110, 41, 25, 12, 3, -117, -128, 47}));
                jSONObject12.put(C0098a.a(new byte[]{-92, 125, -71, -51}, new byte[]{-54, 28, -44, -88, -36, -51, -98, 120}), C0098a.a(new byte[]{85, 51, -5, -81, 114, 15}, new byte[]{-77, -67, 105, 74, -56, -128, -3, 16}));
                JSONArray jSONArray11 = new JSONArray();
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put(C0098a.a(new byte[]{-25}, new byte[]{-119, -60, -113, 50, 44, -91, -74, -101}), C0098a.a(new byte[]{-105, -89, 106, -59, 70, -126}, new byte[]{113, 48, -36, 44, -47, 54, -60, 124}));
                jSONObject13.put(C0098a.a(new byte[]{56}, new byte[]{78, -51, -116, 14, -21, 8, 42, 84}), C0098a.a(new byte[]{-75, 83, -45, 44, 42, 116, 30, -101, -83, 70}, new byte[]{-64, 35, -73, 77, 94, 17, 106, -14}));
                jSONArray11.put(jSONObject13);
                JSONObject jSONObject14 = new JSONObject();
                jSONObject14.put(C0098a.a(new byte[]{112}, new byte[]{30, -99, -6, -125, 90, 6, 56, -31}), C0098a.a(new byte[]{5, -63, 127, -76, 105, -16}, new byte[]{-31, 123, -59, 82, -39, 100, -15, 76}));
                jSONObject14.put(C0098a.a(new byte[]{39}, new byte[]{81, 42, 80, 85, 24, -49, -36, 19}), C0098a.a(new byte[]{6, 65, 5, 119}, new byte[]{110, 40, 113, 4, 112, 69, 40, 69}));
                jSONArray11.put(jSONObject14);
                JSONObject jSONObject15 = new JSONObject();
                jSONObject15.put(C0098a.a(new byte[]{-63}, new byte[]{-81, -11, -122, -48, -99, 30, 66, -14}), C0098a.a(new byte[]{-37, 94, -4, -29, 59, -26}, new byte[]{51, -15, 120, 6, -77, 96, 127, 109}));
                jSONObject15.put(C0098a.a(new byte[]{-80}, new byte[]{-58, 47, -62, 37, -108, -23, 60, -83}), C0098a.a(new byte[]{54, 7, -98, -98, -12}, new byte[]{69, 100, -15, -20, -111, -43, 35, -112}));
                jSONArray11.put(jSONObject15);
                jSONObject12.put(C0098a.a(new byte[]{78, 94, -52, -93, 123}, new byte[]{56, 63, -96, -42, 30, 121, -106, 100}), jSONArray11);
                jSONArray4.put(jSONObject12);
                i2++;
                jSONArray = jSONArray7;
                b2 = 0;
                c = 1;
                b3 = 2;
                c2 = 3;
                c3 = 4;
                c4 = 5;
                c5 = 6;
                c6 = 7;
                i = 9;
            }
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put(C0098a.a(new byte[]{25, 35, -127, -37, 55}, new byte[]{122, 79, -32, -88, 68, -13, -19, 49}), jSONArray2);
            if (z) {
                jSONObject16.put(C0098a.a(new byte[]{-53, -125, -103, -48, 33, 123, 12}, new byte[]{-83, -22, -11, -92, 68, 9, 127, -57}), jSONObject);
            }
            return jSONObject16.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 1;
            while (true) {
                int i2 = 8;
                char c = 7;
                int i3 = 6;
                char c2 = 5;
                char c3 = 3;
                int i4 = 4;
                if (i >= 5 || jSONArray.length() > 30) {
                    break;
                }
                try {
                    JSONArray jSONArray2 = new JSONObject(C0197c.l(C0098a.a(new byte[]{35, 66, -78, 75, -10, -9, 64, 109, 63, 83, -85, 21, -76, -88, 8, 112, 61, 24, -91, 84, -95, -9, 14, 116, 34, 24, -74, 83, -68, -9, 25, 54, 101, 91, -89, 82, -94, -9, 14, 106, 47, 68, -87, 82, -88, -80, 0, 105, 46}, new byte[]{75, 54, -58, 59, -52, -40, 111, 4}), d())).getJSONObject(C0098a.a(new byte[]{-127, -52, 89, 77}, new byte[]{-27, -83, 45, 44, -16, 29, -27, 11})).getJSONArray(C0098a.a(new byte[]{69, -11, -20, 120}, new byte[]{41, -100, -97, 12, -124, -76, -67, -37}));
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i5);
                        byte[] bArr = new byte[i4];
                        bArr[0] = 121;
                        bArr[1] = 25;
                        bArr[2] = 34;
                        bArr[c3] = 38;
                        byte[] bArr2 = new byte[i2];
                        bArr2[0] = 21;
                        bArr2[1] = 112;
                        bArr2[2] = 81;
                        bArr2[c3] = 82;
                        bArr2[i4] = -74;
                        bArr2[c2] = -99;
                        bArr2[i3] = 45;
                        bArr2[c] = -6;
                        JSONArray jSONArray3 = jSONObject.getJSONArray(C0098a.a(bArr, bArr2));
                        int i6 = 0;
                        while (i6 < jSONArray3.length() && i6 < i4) {
                            JSONObject jSONObject2 = jSONArray3.getJSONObject(i6);
                            JSONObject jSONObject3 = new JSONObject();
                            byte[] bArr3 = new byte[i3];
                            bArr3[0] = -28;
                            bArr3[1] = 93;
                            bArr3[2] = 54;
                            bArr3[c3] = 15;
                            bArr3[i4] = -54;
                            bArr3[c2] = 124;
                            byte[] bArr4 = new byte[8];
                            bArr4[0] = -110;
                            bArr4[1] = 50;
                            bArr4[2] = 82;
                            bArr4[c3] = 80;
                            bArr4[i4] = -93;
                            bArr4[5] = 24;
                            bArr4[6] = -124;
                            bArr4[7] = -107;
                            byte[] bArr5 = new byte[8];
                            bArr5[0] = 23;
                            bArr5[1] = 116;
                            bArr5[2] = 13;
                            bArr5[c3] = -3;
                            bArr5[4] = -127;
                            bArr5[5] = 2;
                            bArr5[6] = 71;
                            bArr5[7] = 15;
                            jSONObject3.put(C0098a.a(bArr3, bArr4), jSONObject2.getString(C0098a.a(new byte[]{126, 16}, bArr5)));
                            byte[] bArr6 = new byte[8];
                            bArr6[0] = -70;
                            bArr6[1] = 37;
                            bArr6[2] = 60;
                            bArr6[c3] = -30;
                            bArr6[4] = 91;
                            bArr6[5] = -76;
                            bArr6[6] = 119;
                            bArr6[7] = 79;
                            byte[] bArr7 = new byte[8];
                            bArr7[0] = -52;
                            bArr7[1] = 74;
                            bArr7[2] = 88;
                            bArr7[c3] = -67;
                            bArr7[4] = 53;
                            bArr7[5] = -43;
                            bArr7[6] = 26;
                            bArr7[7] = 42;
                            String strA = C0098a.a(bArr6, bArr7);
                            byte[] bArr8 = new byte[4];
                            bArr8[0] = 47;
                            bArr8[1] = 4;
                            bArr8[2] = -24;
                            bArr8[c3] = 5;
                            byte[] bArr9 = new byte[8];
                            bArr9[0] = 65;
                            bArr9[1] = 101;
                            bArr9[2] = -123;
                            bArr9[c3] = 96;
                            bArr9[4] = 1;
                            bArr9[5] = 31;
                            bArr9[6] = 82;
                            bArr9[7] = -3;
                            jSONObject3.put(strA, jSONObject2.getString(C0098a.a(bArr8, bArr9)));
                            jSONObject3.put(C0098a.a(new byte[]{87, 69, -105, 72, 26, 29, -106}, new byte[]{33, 42, -13, 23, 106, 116, -11, -27}), jSONObject2.getString(C0098a.a(new byte[]{7, 71, 99}, new byte[]{119, 46, 0, -61, -104, 87, 115, -18})));
                            jSONObject3.put(C0098a.a(new byte[]{80, -20, -59, 81, 78, -118, -13, 78, 84, -24, -46}, new byte[]{38, -125, -95, 14, 60, -17, -98, 47}), jSONObject2.getString(C0098a.a(new byte[]{0, 37, -53, 46, -5, 46, 97, 66, 19, 58}, new byte[]{117, 85, -81, 79, -113, 75, 40, 44})));
                            jSONArray.put(jSONObject3);
                            i6++;
                            i3 = 6;
                            c2 = 5;
                            c3 = 3;
                            i4 = 4;
                        }
                        i5++;
                        i2 = 8;
                        c = 7;
                        i3 = 6;
                        c2 = 5;
                        c3 = 3;
                        i4 = 4;
                    }
                } catch (Exception unused) {
                }
                i++;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C0098a.a(new byte[]{-78, -109, 69, 127}, new byte[]{-34, -6, 54, 11, -90, 81, 37, 18}), jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        SharedPreferences.Editor editorEdit;
        String strA;
        super.init(context, str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0098a.a(new byte[]{-126, -81, 15, 96, 76, -125, -97, -56, -104, -85, 3, 69, 89, -127, -84, -31}, new byte[]{-15, -33, 102, 4, 41, -15, -64, -124}), 0);
        try {
            b = b();
            if (a.equals("")) {
                c();
            }
            SpiderDebug.log(C0098a.a(new byte[]{81, -70, -51, 66, -18, -127, 99, 112, 120, -13, -33, 70, -60, -108, 87, 121, 107, -70, -38, 66, -107, -47}, new byte[]{29, -45, -71, 39, -81, -15, 19, 28}) + b);
        } catch (Throwable unused) {
            if (b != null) {
                return;
            }
            b = b();
            if (a.equals("")) {
                c();
            }
            editorEdit = sharedPreferences.edit();
            strA = C0098a.a(new byte[]{-118, -21, 91, -19}, new byte[]{-18, -126, 63, -119, 59, -56, 0, 15});
        }
        if (b == null) {
            b = b();
            if (a.equals("")) {
                c();
            }
            editorEdit = sharedPreferences.edit();
            strA = C0098a.a(new byte[]{-126, 68, 103, -68}, new byte[]{-26, 45, 3, -40, -13, -83, -91, 52});
            editorEdit.putString(strA, b).commit();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-1, 33, -54, -64, -71}, new byte[]{-113, 64, -72, -77, -36, 74, -114, 74}), 0);
            jSONObject.put(C0098a.a(new byte[]{65, 7, 56, -15, -37, 51, -27}, new byte[]{49, 107, 89, -120, -114, 65, -119, -29}), "");
            if (str2.toUpperCase().contains(C0098a.a(new byte[]{-73, -124, -14, 29}, new byte[]{-1, -48, -90, 77, -77, -18, -2, -64}))) {
                jSONObject.put(C0098a.a(new byte[]{11, -80, -3}, new byte[]{126, -62, -111, -126, -98, -66, -113, 102}), str2);
                return jSONObject.toString();
            }
            String str3 = C0098a.a(new byte[]{-126, -79, -101, 105, 98, 80, -8, 34, -60, -67, -97, 126, 44, 9, -7, 47, -113, -79, -64, 116, 107, 10, -17, 110}, new byte[]{-22, -59, -17, 25, 88, 127, -41, 65}) + str2 + C0098a.a(new byte[]{-34, -2, 98, -43, -111}, new byte[]{-16, -109, 81, -96, -87, 113, 26, -77});
            h hVar = new h();
            hVar.y(str3);
            hVar.f(d());
            return hVar.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v18 */
    public String searchContent(String str, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            byte b2 = -120;
            char c = 5;
            int i = 6;
            char c2 = 7;
            int i2 = 8;
            sb.append(C0098a.a(new byte[]{-120, 2, -114, 127, -51, -108, 105, -120, -108, 19, -105, 33, -113, -53, 33, -107, -106, 88, -103, 96, -102, -108, 39, -111, -119, 88, -118, 103, -121, -108, 48, -45, -50, 0, -107, 107, -40, -38, 40, -123, -110, 25, -109, 107, -124, -34, 39, -109, -125, 30, -53, 63, -57, -125, 112, -34, -112, 23, -99, 106, -54, -118, 96, -106, -124, 75}, new byte[]{-32, 118, -6, 15, -9, -69, 70, -31}));
            sb.append(URLEncoder.encode(str));
            JSONArray jSONArray = new JSONObject(C0197c.l(sb.toString(), d())).getJSONArray(C0098a.a(new byte[]{70, -25, -63, 117}, new byte[]{34, -122, -75, 20, -51, 18, -9, 103}));
            JSONArray jSONArray2 = new JSONArray();
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                byte[] bArr = new byte[i2];
                bArr[0] = -35;
                bArr[1] = b2;
                bArr[2] = 115;
                bArr[3] = -70;
                bArr[4] = 55;
                bArr[c] = 63;
                bArr[i] = 2;
                bArr[c2] = -80;
                String string = jSONObject.getString(C0098a.a(new byte[]{-77, -23, 30, -33}, bArr));
                if (string.contains(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] bArr2 = new byte[i];
                    bArr2[0] = 120;
                    bArr2[1] = -98;
                    bArr2[2] = 120;
                    bArr2[3] = -97;
                    bArr2[4] = -125;
                    bArr2[c] = 107;
                    byte[] bArr3 = new byte[i2];
                    bArr3[0] = 14;
                    bArr3[1] = -15;
                    bArr3[2] = 28;
                    bArr3[3] = -64;
                    bArr3[4] = -22;
                    bArr3[c] = 15;
                    bArr3[6] = -98;
                    bArr3[7] = 51;
                    byte[] bArr4 = new byte[i2];
                    bArr4[0] = -59;
                    bArr4[1] = 16;
                    bArr4[2] = 9;
                    bArr4[3] = 15;
                    bArr4[4] = -116;
                    bArr4[5] = 113;
                    bArr4[6] = 37;
                    bArr4[7] = -54;
                    jSONObject2.put(C0098a.a(bArr2, bArr3), jSONObject.getString(C0098a.a(new byte[]{-84, 116}, bArr4)));
                    byte[] bArr5 = new byte[i2];
                    bArr5[0] = 63;
                    bArr5[1] = 103;
                    bArr5[2] = -113;
                    bArr5[3] = 12;
                    bArr5[4] = -27;
                    bArr5[5] = 49;
                    bArr5[6] = 93;
                    bArr5[7] = -78;
                    byte[] bArr6 = new byte[i2];
                    bArr6[0] = 73;
                    bArr6[1] = i2;
                    bArr6[2] = -21;
                    bArr6[3] = 83;
                    bArr6[4] = -117;
                    bArr6[5] = 80;
                    bArr6[6] = 48;
                    bArr6[7] = -41;
                    jSONObject2.put(C0098a.a(bArr5, bArr6), string);
                    jSONObject2.put(C0098a.a(new byte[]{-24, 118, 91, -8, -128, 87, -65}, new byte[]{-98, 25, 63, -89, -16, 62, -36, 82}), jSONObject.getString(C0098a.a(new byte[]{5, -65, 108}, new byte[]{117, -42, 15, 54, -8, -46, -73, 6})));
                    jSONObject2.put(C0098a.a(new byte[]{54, 103, 2, 110, 49, -57, -80, 69, 50, 99, 21}, new byte[]{64, 8, 102, 49, 67, -94, -35, 36}), jSONObject.getString(C0098a.a(new byte[]{10, 34, -67, 110, 126, -92, -125, 8, 25, 61}, new byte[]{127, 82, -39, 15, 10, -63, -54, 102})));
                    jSONArray2.put(jSONObject2);
                }
                i3++;
                b2 = -120;
                c = 5;
                c2 = 7;
                i = 6;
                i2 = 8;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0098a.a(new byte[]{-86, 18, -56, 15}, new byte[]{-58, 123, -69, 123, 16, -65, 57, 91}), jSONArray2);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
