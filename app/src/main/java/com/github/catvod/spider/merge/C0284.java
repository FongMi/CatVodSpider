package com.github.catvod.spider.merge;

import android.net.Uri;
import com.github.catvod.spider.merge.AbstractC0291;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import okhttp3.Call;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ކ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0284 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[] f710 = {SOY.d("543F62034C"), SOY.d("543F2142"), SOY.d("54343D00"), SOY.d("5433271F"), SOY.d("543F3A00"), SOY.d("54203C"), SOY.d("54253C00"), SOY.d("543F2111"), SOY.d("0C3B35131B580E3D22"), SOY.d("543F2145"), SOY.d("543F6517"), SOY.d("173B3C132B030322344B021E1E373E2919074E")};

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final String[] f711 = {SOY.d("473A250204"), SOY.d("543A251B18"), SOY.d("453A250204")};

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static Charset f712 = Charset.forName(SOY.d("2F06175B4C"));

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static Charset f713 = Charset.forName(SOY.d("13213E5B4C4F4F6B7C47"));

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ކ$Ϳ, reason: contains not printable characters */
    class C0285 extends AbstractC0291.AbstractC0293 {
        C0285() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onResponse(String str) {
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m1040(String str, Charset charset) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(SOY.d("371664")).digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static boolean m1041(String str) {
        String strD = SOY.d("193D3C590758");
        try {
            HashMap map = new HashMap();
            map.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
            map.put(SOY.d("28373713061208"), SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C59"));
            C0285 c0285 = new C0285();
            String strD2 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C591513083B27135B01497D221E15051F0D3D1F1A1C553534022B04123323132B15030D30181B19033F3E0307");
            String strSubstring = str.split(strD)[1].substring(0, 11);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("093A300411281336"), strSubstring);
            if (str.contains(strD) && !str.isEmpty()) {
                C0295.m1087(C0295.m1082(), strD2, jSONObject.toString(), map, c0285);
                String result = c0285.getResult();
                if (!result.contains(SOY.d("093A30041128163B3F1D541E09"))) {
                    if (result.contains(SOY.d("093A30041128163B3F1D54141B3C3F1900"))) {
                    }
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static JSONObject m1042(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        boolean zContains = str.contains(SOY.d("0D25265819100E247F151B1A"));
        String strD = SOY.d("5A1F3E0C1D1B16337E435A47");
        String strD2 = SOY.d("5A");
        String strD3 = SOY.d("2F21340459361D373F02");
        String strD4 = SOY.d("28373713061208");
        if (zContains || str2.contains(SOY.d("0E3B25171A5917352500"))) {
            jSONObject.put(strD4, strD2);
            jSONObject.put(strD3, strD);
        } else if (str.contains(SOY.d("183B3D1F161E163B"))) {
            jSONObject.put(strD4, SOY.d("5A3A25020404407D7E0103005430381A1D15133E38581718177D"));
            jSONObject.put(strD3, SOY.d("5A1F3E0C1D1B16337E435A475A7A061F1A13152522563A235A636158444C5A053818424341722940405E5A13210618122D37333D1D03556762415A444C72793D3C23371E7D56181E113771311114113D7856371F083D3C135B4649617F465A475462712515111B20385941444D7C6240"));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static boolean m1043(String str, String str2) {
        return str2.contains(SOY.d("4365624F4344542A280C")) || str2.contains(SOY.d("543438024E"));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static boolean m1044(String str) {
        String lowerCase = str.toLowerCase();
        boolean zContains = lowerCase.contains(SOY.d("473A250204"));
        String strD = SOY.d("1C203E1B491F0E2621054E58553030180D0214357F0603");
        String strD2 = SOY.d("1761244E5A070D7D1217171F1F");
        if ((!zContains && !lowerCase.contains(SOY.d("543A251B18"))) || (lowerCase.contains(strD2) && lowerCase.contains(strD))) {
            for (String str2 : f710) {
                if (lowerCase.contains(str2)) {
                    for (String str3 : f711) {
                        if (lowerCase.contains(str3) && (!lowerCase.contains(strD2) || !lowerCase.contains(strD) || !lowerCase.contains(SOY.d("1D37251B4702426D2404184A12262506")))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static boolean m1045(String str) {
        String strD = SOY.d("1323380F1D59193D3C");
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {strD, SOY.d("0C7C20075A14153F"), SOY.d("033D241D0159193D3C"), SOY.d("16377F151B1A"), SOY.d("0E2735190159193D3C"), SOY.d("173525005A14153F"), SOY.d("093D39035A14153F"), SOY.d("1B3137031A59193C"), SOY.d("183B3D1F161E163B7F151B1A"), SOY.d("18333E1011191D7C321919"), SOY.d("0A2225005A14153F"), SOY.d("0D252658191E1D27271F1012157C321919"), SOY.d("0D2526581D0F133524175A14153F"), SOY.d("0C3B2158454E4A677F151B1A"), SOY.d("0D2526581202147C2500"), SOY.d("177C37031A590E24")};
            for (int i = 0; i < 16; i++) {
                if (host.contains(strArr[i]) && (!strD.equals(strArr[i]) || str.contains(SOY.d("1323380F1D59193D3C591528")) || str.contains(SOY.d("1323380F1D59193D3C590328")) || str.contains(SOY.d("1323380F1D59193D3C590228")))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static JSONObject m1046(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String strD = SOY.d("1E332517");
        boolean zHas = jSONObject.has(strD);
        String strD2 = SOY.d("0F203D");
        String string = zHas ? jSONObject.getJSONObject(strD).getString(strD2) : jSONObject.getString(strD2);
        if (string.startsWith(SOY.d("557D"))) {
            string = SOY.d("12262506074D") + string;
        }
        if (!string.startsWith(SOY.d("12262506"))) {
            return null;
        }
        if ((string.equals(str) && (m1045(string) || !m1044(string))) || m1043(str, string)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString(SOY.d("0F21340459161D373F02"), "");
        int length = strOptString.trim().length();
        String strD3 = SOY.d("5A");
        if (length > 0) {
            jSONObject2.put(SOY.d("2F21340459361D373F02"), strD3 + strOptString);
        }
        String strOptString2 = jSONObject.optString(SOY.d("08373713061208"), "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put(SOY.d("28373713061208"), strD3 + strOptString2);
        }
        JSONObject jSONObjectM1042 = m1042(jSONObject2, str, string);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(SOY.d("123730121105"), jSONObjectM1042);
        jSONObject3.put(strD2, string);
        return jSONObject3;
    }
}
