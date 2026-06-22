package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0221n;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Jpys extends Spider {
    private static Map<String, Boolean> d = new HashMap();
    private String a = C0098a.a(new byte[]{-45, 69, 16, -11, 42, 91, -113, -87, -52, 70, 19, -85, 49, 10, -39, -28, -54, 68, 2, -30, 49, 79, -61, -23, -42}, new byte[]{-69, 49, 100, -123, 89, 97, -96, -122});
    private String b = "";
    private String c;

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String sha1(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C0098a.a(new byte[]{-71, 34, -114, 91, 58}, new byte[]{-22, 106, -49, 118, 11, -30, 26, -19})).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (map.get(C0098a.a(new byte[]{97, 50}, new byte[]{3, 75, 30, 26, -40, -89, 103, 113})) == null || map.get(C0098a.a(new byte[]{19, 94}, new byte[]{113, 39, -89, -60, -106, -99, -104, -49})).equals(C0098a.a(new byte[]{-45, 109, 100, -43, -65, -103}, new byte[]{54, -24, -52, 60, 60, 49, -24, -91}))) {
            map.put(C0098a.a(new byte[]{-14, 26}, new byte[]{-112, 99, -120, 48, -77, -82, -14, -73}), "");
        }
        if (map.get(C0098a.a(new byte[]{44, -90, -80, 17}, new byte[]{85, -61, -47, 99, 23, 46, 15, 32})) == null || map.get(C0098a.a(new byte[]{-2, -101, -1, 71}, new byte[]{-121, -2, -98, 53, -29, 10, -82, -68})).equals(C0098a.a(new byte[]{-38, -54, -67, 88, -6, 9}, new byte[]{63, 79, 21, -79, 121, -95, 95, 97}))) {
            map.put(C0098a.a(new byte[]{82, 62, -31, 23}, new byte[]{43, 91, -128, 101, -61, 69, 16, -48}), "");
        }
        if (map.get(C0098a.a(new byte[]{78, -52, -49, -89}, new byte[]{47, -66, -86, -58, 113, -61, -98, 9})) == null || map.get(C0098a.a(new byte[]{69, -61, 95, -14}, new byte[]{36, -79, 58, -109, -103, -38, 36, -58})).equals(C0098a.a(new byte[]{69, 47, -128, -54, 46, 109}, new byte[]{-96, -86, 40, 35, -83, -59, 31, -121}))) {
            map.put(C0098a.a(new byte[]{-37, -19, -33, 52}, new byte[]{-70, -97, -70, 85, 43, 117, 127, 77}), "");
        }
        map.get(C0098a.a(new byte[]{15, 25}, new byte[]{109, 96, 122, 70, -84, -112, -19, 106}));
        String str3 = map.get(C0098a.a(new byte[]{-101, -24, -86, -101}, new byte[]{-30, -115, -53, -23, 58, -83, -82, -9}));
        String str4 = map.get(C0098a.a(new byte[]{-68, 116, 23, -118}, new byte[]{-35, 6, 114, -21, 9, 45, -32, -81}));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-37, -80, -55, 115, 101}, new byte[]{-70, -62, -84, 18, 88, -102, -99, 116}, sb, str4);
        v.a(new byte[]{-119, 20, -45, -31, 104, 117, 92, 41, -110}, new byte[]{-81, 100, -78, -122, 13, 59, 41, 68}, sb, str2);
        v.a(new byte[]{-21, -119, -96, 55, -12, -101, -14}, new byte[]{-51, -3, -39, 71, -111, -86, -49, 39}, sb, str);
        v.a(new byte[]{30, -107, 11, -5, 33, 46}, new byte[]{56, -20, 110, -102, 83, 19, 118, -7}, sb, str3);
        sb.append(C0098a.a(new byte[]{116, -121, -53, 102, -116}, new byte[]{82, -20, -82, 31, -79, 104, 51, 69}));
        sb.append(this.c);
        sb.append(C0098a.a(new byte[]{-51, 125, 24}, new byte[]{-21, 9, 37, -120, -6, -57, -23, -51}));
        sb.append(strValueOf);
        String strSha1 = sha1(C0207D.a(sb.toString()));
        HashMap map2 = new HashMap();
        map2.put(C0098a.a(new byte[]{-66, 35, -46, -104}, new byte[]{-51, 74, -75, -10, 120, -44, 88, -54}), strSha1);
        map2.put(C0098a.a(new byte[]{-91}, new byte[]{-15, 92, -24, 85, -105, -26, 121, 65}), strValueOf);
        map2.put(C0098a.a(new byte[]{105, -64, -101, -10, 68, 10, 40, -23}, new byte[]{45, -91, -19, -97, 39, 111, 65, -115}), C0098a.a(new byte[]{-120, 44, 59, -7, -91, 29, 103, 115}, new byte[]{-52, 73, 77, -112, -58, 120, 14, 23}));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        String strL = C0197c.l(String.format(C0133t.b(new byte[]{-52, 7, -80, 113, -32, -75, -46, 64, -114, 9, -74, 113, -86, -9, -60, 3, -116, 8, -71, 117, -96, -83, -42, 66, -107, 15, -92, 125, -96, -9, -55, 4, -112, 18, -1, 108, -74, -88, -64, 92, -34, 67, -77, 62, -65, -71, -62, 8, -83, 19, -83, 37, -22, -85, -125, 12, -111, 3, -95, 37, -22, -85, -125, 20, -122, 7, -78, 37, -22, -85}, new byte[]{-29, 102, -64, 24, -49, -40, -91, 109}, sb2), str, str2, str4, str3), map2);
        System.out.println(C0098a.a(new byte[]{62, -90, 10, -114}, new byte[]{90, -62, 115, -9, -49, -106, -26, 99}) + strL);
        JSONArray jSONArray = new JSONObject(strL).getJSONObject(C0098a.a(new byte[]{46, -96, -48, -37}, new byte[]{74, -63, -92, -70, 111, -48, -8, 74})).getJSONArray(C0098a.a(new byte[]{-89, 108, -76, -124}, new byte[]{-53, 5, -57, -16, 7, 19, 102, 28}));
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString(C0098a.a(new byte[]{61, 98, -113, -65, -80, -12}, new byte[]{75, 13, -21, -17, -39, -105, 95, 51}));
            String string2 = jSONObject.getString(C0098a.a(new byte[]{25, 0, -93, 10, 61, -48, 121}, new byte[]{111, 111, -57, 68, 92, -67, 28, -33}));
            String string3 = jSONObject.getString(C0098a.a(new byte[]{-106, 54, 74, -39, 93, 39, -27, 17, -113, 55}, new byte[]{-32, 89, 46, -113, 56, 85, -106, 120}));
            String string4 = jSONObject.getString(C0098a.a(new byte[]{-2, 114, 11, 29, -21}, new byte[]{-120, 29, 111, 84, -113, 118, -92, -91}));
            if (d.isEmpty() || !d.containsKey(string2)) {
                j.a(string4, string2, string, string3, arrayList);
            }
        }
        return h.q(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0338 A[LOOP:0: B:11:0x0332->B:13:0x0338, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Jpys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        arrayList2.add(new C0135a(C0098a.a(new byte[]{123}, new byte[]{74, 48, -117, 10, 97, 3, -19, 39}), C0098a.a(new byte[]{-15, -106, -11, 47, -34, -89}, new byte[]{22, 2, 64, -54, 99, 22, 47, 121})));
        arrayList2.add(new C0135a(C0098a.a(new byte[]{127}, new byte[]{77, 123, 101, -12, -23, -38, 74, 107}), C0098a.a(new byte[]{53, -127, -108, -1, 94, -54, 86, 38, 117}, new byte[]{-46, 21, 33, 23, -7, 76, -77, -81})));
        arrayList2.add(new C0135a(C0098a.a(new byte[]{90}, new byte[]{110, 94, 69, 65, -55, 71, -85, -76}), C0098a.a(new byte[]{16, -106, -58, 101, -89, 102}, new byte[]{-11, 28, 110, -125, 27, -51, -92, -123})));
        arrayList2.add(new C0135a(C0098a.a(new byte[]{-68}, new byte[]{-113, 68, -41, -84, -39, 112, -28, 95}), C0098a.a(new byte[]{62, -30, 18, -56, -102, -41}, new byte[]{-39, 89, -82, 32, 19, 109, -69, 80})));
        JSONObject jSONObject = new JSONObject(oZP.d("0E4D4663560E0E4D19200130575555A4F0E590E3CD6340771E0A0E635677141D12204E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E285914552F4E6F578BCFEC89CEC88AD3E685CCF34D5B631A774F4D93F9C1B0EED292E5CBBCECE9553C402E5701557B4EB1CDC292DAD1BCD3F691F9C377594D0163567791D7DAA4F7E89CC9EEA7D4FA57125B3A4E3B575555A5D4F890F4CAA4E3E593D6C9634077034D4D6388EDD88AECFC89DAC589CEFF4E285914552F4E6F5788C9CF89CEC84D5B631A774F4D90FFE2B0EED2553C402E5701557B4EB3E2CA91DDC077594D0163567793F8D2A7F0F957125B3A4E3B575555A8F3FC90F4CA634077034D4D6385CADC8AECFC4E285914552F4E6F5789C4F189CEC84D5B631A774F4D91F2DCB0EED2553C402E5701557B4EB0F8DF92FBCA77594D0163567790E2C7A4D6F357125B3A4E3B575555A4E9E391D4E1634077034D4D6389D0C38BCCD74E2828125B3A4E3B14021263567790D6C3A5D7E85743552A092C575555380934074D5B631A34191A1263560E0E4D1963567790EADFA8EFFD574355374E6F574D0A6D17771B4D4D614E67455D426340755719557B4C77475F45744E285914552F4E6F575D47735877594D01635677475F45754E285914552F4E6F575D47735F77594D01635677475F45724E285914552F4E6F575D47735E77594D01635677475F45734E285914552F4E6F575D47735D77594D01635677475F45704E285914552F4E6F575D47735C77594D01635677475F45714E285914552F4E6F575D47705577594D01635677475F46784E285914552F4E6F575D47705477594D01635677475F46794E285914552F4E6F575D47705B77594D01635677475F46764E285914552F4E6F575D47705A77594D01635677475F46774E285914552F4E6F575D47705977594D01635677475F46744E285914552F4E6F575D47705877594D01635677475F46754E285914552F4E6F575D47705F77594D01635677475F46724E285914552F4E6F575D47705E77594D01635677475F46734E285914552F4E6F575D47705D77594D01635677475F46704E285914552F4E6F575D47705C77594D01635677475F46714E285914552F4E6F575D4771552B475F47714E795719557B4E67455F4E3F5E65455F553C402E5701557B4E6C458ACEF588EED64D5B631A774F4D4E7189ECC18BCCE24E285914552F4E6F575747A4D5E191D4D4634077034D4D63546590D6C3A5D7F657122A3C3179575D557B372E5701162C09774F4D92DDDCB0F9D5556D4E3E1016557B4E34070A16634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E235755556311790E4D1963567791D7DAA4F7E890CBD0A8F5D3574355374E6F578BCFEC89CEC88AD3E685CCF34D0A6D17771B4D4D6388EDD88AECFC85F3EC89CFEE4E795719557B4EB1CDC292DAD1BCD3F691F9C37708430C6302774F4D93F9C1B0EED292CEDCB3CCD1556D4E23575555A5D4F890F4CAA4E3E593D6C96311790E4D1963567792D1F9A4F7E8574355374E6F5788C9CF89CEC84D0A6D17771B4D4D638AC2D089EBED4E795719557B4EB3E2CA91DDC07708430C6302774F4D9EDEC5B0EED2556D4E23575555A8F3FC90F4CA6311790E4D1963567793DCC7A4F7E8574355374E6F5789C4F189CEC84D0A6D17771B4D4D6389D8C58ACDE74E795719557B4EB0F8DF92FBCA7708430C6302774F4D92C4DAB1CEF9556D4E23575555A4E9E391D4E163110808430C630234180A557B4EB0CCDB93FAD177594D1C2415774F4D0E240D27574355370D39000A557B372E5701557B4EB0F0C79EC2C477594D0163567757125B3A4E3B575557635E65475A556D4C77034D4D614E67455D426311790E4D19635677475F45754E795719557B4E67455D436311790E4D19635677475F45724E795719557B4E67455D446311790E4D19635677475F45734E795719557B4E67455D456311790E4D19635677475F45704E795719557B4E67455D466311790E4D19635677475F45714E795719557B4E67455D476311790E4D19635677475F46784E795719557B4E67455E4E6311790E4D19635677475F46794E795719557B4E67455E4F6311790E4D19635677475F46764E795719557B4E67455E406311790E4D19635677475F46774E795719557B4E67455E416311790E4D19635677475F46744E795719557B4E67455E426311790E4D19635677475F46754E795719557B4E67455E436311790E4D19635677475F46724E795719557B4E67455E446311790E4D19635677475F46734E795719557B4E67455E456311790E4D19635677475F46704E795719557B4E67455E466311790E4D19635677475F46714E795719557B4E67455E476311790E4D19635677475F47781267455F47634077034D4D635E65455609735C65454D0A6D17771B4D4D63556590D6C3A5D7F6574355374E6F575647A4D5E191D4D46311790E4D196356774D5F92F8D8B1CECC556D4E23575555795CB0CCDB93FACF7708320A1C4077464D4D1A17771B0E1A244E6F578AEBF189D9CF4D5B6307300C4D4D630D27100E556D4E23140302244E6F2E14552F4E6F578AF2E985D6DD4D5B631A774F4D553C402E5701557B4EB1CDC292DAD1B0D1C89ED8EA77594D0163567791D7DAA4F7E890CBD0A8F5D357125B3A4E3B575555A5D4F890F4CAA8CACC93D7D8634077034D4D6388EDD88AECFC85F3EC89CFEE4E285914552F4E6F578BCFEC89CEC88AF8F18AECCB4D5B631A774F4D93F9C1B0EED292CEDCB3CCD1553C402E5701557B4EB2CBE192DAD177594D0163567792D1F9A4F7E857125B3A4E3B575555A7FBF093F3DB634077034D4D638AC2D089EBED4E285914552F4E6F5786E8E889CEC84D5B631A774F4D9EDEC5B0EED2553C402E5701557B4EB3C6DF92DAD177594D0163567793DCC7A4F7E857125B3A4E3B575555A4E1E590D5D1634077034D4D6389D8C58ACDE74E285914552F4E6F578AF2F788EEE34D5B631A774F4D92C4DAB1CEF9553C31285914552F0D38104D4D6389ECC18BCCFC4E79570412384E6F571612201E77594D01200020104D4D1A17771B4D4D6389D0DD86F4E94E795719557B4E7708430C6302774F4F55735C67404D5B614E23575557635E65475A553C402E5701557B4E67455D43634077034D4D635E65475B553C402E5701557B4E67455D44634077034D4D635E65475C553C402E5701557B4E67455D45634077034D4D635E65475D553C402E5701557B4E67455D46634077034D4D635E65475E553C402E5701557B4E67455D47634077034D4D635E65475F553C402E5701557B4EB3EEDB91D6C577594D0163567793F4C3A7FBFC57122A3C3179575B557B372E5701162C09774F4D92DDDCB0F9D5556D4E3E1016557B4E34070A16634077030E1B3409774F340C6302774F4D92C4C4BCF6C7556D4E235755556311790E4D1963567791D7DAA4F7E890CBD0A8F5D3574355374E6F578BCFEC89CEC88AD3E685CCF34D0A6D17771B4D4D638BEBFB8AECFC4E795719557B4EB2CBE192DAD17708430C6302774F4D91D6C9B3E9C3556D4E23575555A7FBF093F3DB6311790E4D1963567790EAC1A5D7C3574355374E6F578AF2F788EEE34D0A1C11790E4D19200130575555A4D5E191D4CA6340771E0A0E6356770C0A16334E795719162D193057552C3A4E3B575555A4E9FD9CECDF634077034D4D634E285914552F4E6F554D45715E60574357631A774F4F55735C67404D0A6D17771B4D4D635E65475B556D4E23575555735C67414D0A6D17771B4D4D635E65475C556D4E23575555735C67464D0A6D17771B4D4D635E65475D556D4E23575555735C67474D0A6D17771B4D4D635E65475E556D4E23575555735C67444D0A6D17771B4D4D635E65475F556D4E23575555735C67454D0A6D17771B4D4D635E654456556D4E23575555735C644C4D0A6D17771B4D4D635E654457556D4E23575555735C644D4D0A6D17771B4D4D635E654458556D4E23575555735C64424D0A6D17771B4D4D635E654459556D4E23575555735C64434D0A6D17771B4D4D635E65445A556D4E23575555735C64404D0A6D17771B4D4D635E65445B556D4E23575555735C64414D0A6D17771B4D4D635E65445C556D4E23575555735C64464D0A6D17771B4D4D635E65445D556D4E23575555735C64474D0A6D17771B4D4D635E65445E556D4E23575555735C64444D0A6D17771B4D4D635E65445F556D4E23575555735C64454D0A6D17771B4D4D635E65455609735C65454D5B631A774F4D45715C6C0B5D47715C7708430C6302774F4D4E7189ECC18BCCE24E795719557B4E6C458ACEF588EED64D0A6D17771B4D4D63546590D6C3A5D7F6574355374E6F575747A4D5E191D4D46311790E4D1963567793F4C3A7FBFC574355374E6F5789ECF58AC2DC4D0A1C110808"));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(C0207D.a(String.format(C0098a.a(new byte[]{54, -39, -91, -59, 76, 96, -42, 10, 96, -103, -81}, new byte[]{93, -68, -36, -8, 105, 19, -16, 126}), this.c, strValueOf)));
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-79, -59, -23, -50}, new byte[]{-62, -84, -114, -96, 92, 32, 70, -11}), strSha1);
        map.put(C0098a.a(new byte[]{21}, new byte[]{65, 68, 126, 102, -121, 95, 30, 16}), strValueOf);
        map.put(C0098a.a(new byte[]{42, -52, 65, -40, -90, 103, 3, 1}, new byte[]{110, -87, 55, -79, -59, 2, 106, 101}), C0098a.a(new byte[]{-127, -65, -116, 55, 98, 54, -42, -65}, new byte[]{-59, -38, -6, 94, 1, 83, -65, -37}));
        JSONArray jSONArray = new JSONObject(C0197c.l(this.a + C0098a.a(new byte[]{25, 18, -83, 85, 107, -38, -117, -10, 91, 28, -85, 85, 33, -104, -99, -75, 89, 29, -92, 81, 43, -62, -113, -12, 94, 28, -80, 89, 107, -33, -109, -81, 101, 22, -68, 78, 39, -33}, new byte[]{54, 115, -35, 60, 68, -73, -4, -37}), map)).getJSONArray(C0098a.a(new byte[]{-15, -86, 67, -91}, new byte[]{-107, -53, 55, -60, 64, -124, -7, -89}));
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new k(jSONObject2.getString(C0098a.a(new byte[]{-20, 41, 34, -14, -42}, new byte[]{-102, 70, 70, -69, -78, -66, -36, -79})), jSONObject2.getString(C0098a.a(new byte[]{-71, -77, -49, -92, -31, 112, -19}, new byte[]{-49, -36, -85, -22, -128, 29, -120, -105})), jSONObject2.getString(C0098a.a(new byte[]{32, 60, -3, 21, -28, -117}, new byte[]{86, 83, -103, 69, -115, -24, 73, -52})), jSONObject2.getString(C0098a.a(new byte[]{-122, -82, 109, 78, 58, -119, -67, -44, -97, -81}, new byte[]{-16, -63, 9, 24, 95, -5, -50, -67}))));
        }
        return h.v(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
        }
        try {
            if (C0221n.b().booleanValue()) {
                this.c = C0221n.a(C0098a.a(new byte[]{73, -47, 45, 30, 120, 82, -98, -67, 98, -37, 107, 14, 28, 76, -120, -96, 98, -24, 106, 48, 92, 111, -86, -66, 98, -29, 34, 37, 26, 79, -22, -5, 100, -13, 45, 6, 96, 122, -73, -96, 91, -32, 89, 16, 66, 57, -72, -65, 117, -2, 83, 15, 93, 49, -23, -95, 105, -35, 43, 8, 3, 73, -18, -108}, new byte[]{17, -117, 26, 68, 44, 0, -37, -52}));
            }
            this.b = getUUID();
            System.out.println(C0098a.a(new byte[]{-68, -118, -120, -94}, new byte[]{-55, -1, -3, -41, 127, 4, -74, -26}) + this.b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split(C0098a.a(new byte[]{25}, new byte[]{89, 97, 96, -44, -24, 96, 69, -23}));
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = this.a + C0098a.a(new byte[]{-114, 121, 85, -21, -44, -46, -38, 12, -52, 119, 83, -21, -98, -112, -52, 79, -50, 118, 92, -17, -108, -54, -34, 14, -41, 42, 10, -12, -110, -37, -56, 78, -114, 125, 85, -21, -120, -48, -55, 68, -114, 109, 87, -18, -60, -42, -55, 28}, new byte[]{-95, 24, 37, -126, -5, -65, -83, 33}) + str3 + C0098a.a(new byte[]{-14, -83, 115, 52, 99}, new byte[]{-44, -61, 26, 80, 94, 125, 70, -4}) + str4;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strSha1 = sha1(C0207D.a(C0098a.a(new byte[]{106, -19, 17}, new byte[]{3, -119, 44, -84, -89, 85, 115, 66}) + str3 + C0098a.a(new byte[]{-69, -50, -9, -113, 64}, new byte[]{-99, -96, -98, -21, 125, -90, -37, 76}) + str4 + String.format(C0098a.a(new byte[]{-53, 117, 53, -26, -98, -16, 91, -125, -103, 35, 117, -20}, new byte[]{-19, 30, 80, -97, -93, -43, 40, -91}), this.c, strValueOf)));
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{47, 20, 115, -36}, new byte[]{92, 125, 20, -78, -1, 102, -79, 29}), strSha1);
            map.put(C0098a.a(new byte[]{-41}, new byte[]{-125, 93, 109, -24, -118, 90, -42, 106}), strValueOf);
            map.put(C0098a.a(new byte[]{122, 14, -68, 79, -45, 22, 81, -2}, new byte[]{62, 107, -54, 38, -80, 115, 56, -102}), C0098a.a(new byte[]{-77, -21, 115, 73, -127, 95, -17, -1}, new byte[]{-9, -114, 5, 32, -30, 58, -122, -101}));
            String strL = C0197c.l(str5, map);
            JSONObject jSONObject = new JSONObject();
            String string = new JSONObject(strL).getJSONObject(C0098a.a(new byte[]{109, 116, -105, -115}, new byte[]{9, 21, -29, -20, 123, 115, -81, 72})).getJSONArray(C0098a.a(new byte[]{20, 94, -96, -88}, new byte[]{120, 55, -45, -36, -72, -126, -51, -52})).getJSONObject(0).getString(C0098a.a(new byte[]{88, -92, -87}, new byte[]{45, -42, -59, -42, 122, 121, 42, 48}));
            System.out.println(C0098a.a(new byte[]{-125, 109, 29, -20}, new byte[]{-16, 30, 110, -97, -120, -127, -98, -46}) + string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0098a.a(new byte[]{40, -23, 49, -22, -104, -70, -66, 88, 19, -18}, new byte[]{125, -102, 84, -104, -75, -5, -39, 61}), C0098a.a(new byte[]{-65, 111, 56, 84, -100, -83, 21, 103, -57, 46, 114, 29, -40, -106, 29, 38, -106, 111, 53, 78, -48, -113, 32, 104, -61, 48, 108, 13, -53, -31, 35, 33, -100, 54, 118, 6, -48, -71, 66, 124, -37, 32, 3, 77, -128, -83, 17, 31, -105, 98, 9, 84, -124, -18, 65, 123, -59, 46, 113, 11, -48, -23, 63, 0, -90, 77, 14, 17, -48, -83, 29, 35, -105, 32, 5, 88, -109, -86, 27, 97, -46, 67, 42, 79, -97, -84, 17, 103, -61, 49, 117, 19, -64, -17, 68, 102, -62, 32, 17, 92, -106, -96, 6, 33, -35, 53, 113, 10, -34, -14, 66}, new byte[]{-14, 0, 66, 61, -16, -63, 116, 72}));
            jSONObject2.put(C0098a.a(new byte[]{116, -86, 4, -5, 43, -44}, new byte[]{59, -40, 109, -100, 66, -70, -43, 85}), C0098a.a(new byte[]{-45, 101, 63, -75, 63, -12, -31, 116, -52, 102, 60, -21, 43, -90, -71, 98, -63, 102, 59, -16, 98, -83, -95, 54}, new byte[]{-69, 17, 75, -59, 76, -50, -50, 91}));
            jSONObject2.put(C0098a.a(new byte[]{99, -29, 113, 41, 50, -111, 88}, new byte[]{49, -122, 23, 76, 64, -12, 42, -35}), C0098a.a(new byte[]{52, -70, 84, 29, -3, 47, -77, -59, 43, -71, 87, 67, -23, 125, -21, -45, 38, -71, 80, 88, -96, 118, -13, -121}, new byte[]{92, -50, 32, 109, -114, 21, -100, -22}));
            jSONObject.put(C0098a.a(new byte[]{72, 100, -23}, new byte[]{61, 22, -123, 1, 75, 59, -40, 98}), string);
            jSONObject.put(C0098a.a(new byte[]{-5, -87, 63, 55, -87}, new byte[]{-117, -56, 77, 68, -52, -22, -90, -14}), C0098a.a(new byte[]{-14}, new byte[]{-62, 69, 49, 94, 11, -70, -10, -36}));
            jSONObject.put(C0098a.a(new byte[]{35, 22, 55, 67, 50, -2, 120}, new byte[]{83, 122, 86, 58, 103, -116, 20, 84}), "");
            jSONObject.put(C0098a.a(new byte[]{11, -88, -84, -1, -119, -114}, new byte[]{99, -51, -51, -101, -20, -4, -92, 3}), jSONObject2.toString());
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(C0098a.a(new byte[]{121, -84, 55, 36, 74, 72, 66, 33, 59, -94, 49, 36, 0, 10, 84, 98, 57, -93, 62, 32, 10, 80, 70, 35, 32, -92, 35, 40, 10, 10, 70, 105, 55, -65, 36, 37, 39, 92, 98, 99, 36, -87, 120, 38, 0, 92, 66, 99, 36, -87, 122}, new byte[]{86, -51, 71, 77, 101, 37, 53, 12}));
        sb.append(URLEncoder.encode(str));
        String strB = C0133t.b(new byte[]{120, -90, -91, 70, 75, -123, 106, -24, 99, -25, -30, 81, 79, -84, 122, -42, 55, -84, -95, 28, 22}, new byte[]{94, -42, -60, 33, 46, -53, 31, -123}, sb);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sb2 = new StringBuilder();
        v.a(new byte[]{39, -2, 37, -127, -21, 58, 119, 34}, new byte[]{76, -101, 92, -10, -124, 72, 19, 31}, sb2, str);
        sb2.append(C0098a.a(new byte[]{101, 32, 50, -38, 2, 53, 98, -120, 126, 97, 117, -51, 6, 28, 114, -74, 42, 42, 54, -128, 95}, new byte[]{67, 80, 83, -67, 103, 123, 23, -27}));
        sb2.append(String.format(C0098a.a(new byte[]{-105, 48, -52, -55, -58, 115, 120, -92, -59, 102, -116, -61}, new byte[]{-79, 91, -87, -80, -5, 86, 11, -126}), this.c, strValueOf));
        String strSha1 = sha1(C0207D.a(sb2.toString()));
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{106, 37, -121, 41}, new byte[]{25, 76, -32, 71, -4, 107, -113, -59}), strSha1);
        map.put(C0098a.a(new byte[]{49}, new byte[]{101, 110, -37, -52, -120, -53, 68, -3}), strValueOf);
        map.put(C0098a.a(new byte[]{93, 76, -87, -30, -63, 15, -66, 7}, new byte[]{25, 41, -33, -117, -94, 106, -41, 99}), C0098a.a(new byte[]{21, -36, -49, -112, 40, 114, -46, 23}, new byte[]{81, -71, -71, -7, 75, 23, -69, 115}));
        JSONArray jSONArray = new JSONObject(C0197c.l(strB, map)).getJSONObject(C0098a.a(new byte[]{-51, -85, 58, 98}, new byte[]{-87, -54, 78, 3, 124, -114, 59, -128})).getJSONObject(C0098a.a(new byte[]{-32, 17, 116, 64, -3, 14}, new byte[]{-110, 116, 7, 53, -111, 122, -124, 37})).getJSONArray(C0098a.a(new byte[]{70, -76, 100, 56}, new byte[]{42, -35, 23, 76, 100, -100, -21, -102}));
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!jSONObject.getString(C0098a.a(new byte[]{33, 104, 3, -90, -13, 36, 78, 11}, new byte[]{87, 7, 103, -27, -97, 69, 61, 120})).equals(C0098a.a(new byte[]{66, 19, -99, -25, 82, -83}, new byte[]{-90, -81, 59, 0, -62, 43, 122, 72}))) {
                j.a(jSONObject.getString(C0098a.a(new byte[]{87, 110, -25, 54, 73}, new byte[]{33, 1, -125, 127, 45, -42, -121, 8})), jSONObject.getString(C0098a.a(new byte[]{112, -15, 59, -67, -8, 65, 36}, new byte[]{6, -98, 95, -13, -103, 44, 65, 40})), jSONObject.getString(C0098a.a(new byte[]{-18, -31, 40, -4, -86, -105}, new byte[]{-104, -114, 76, -84, -61, -12, -21, 99})), jSONObject.getString(C0098a.a(new byte[]{43, -62, 112, 2, -121, 10, -34, 51, 54, -34}, new byte[]{93, -83, 20, 80, -30, 103, -65, 65})), arrayList);
            }
        }
        return h.q(arrayList);
    }
}
