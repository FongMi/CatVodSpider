package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AbstractC0291;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ވ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0287 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String[] f716 = {SOY.d("12203410"), SOY.d("092032"), SOY.d("193E300507"), SOY.d("0E3B251A11"), SOY.d("1B3E25")};

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ވ$Ϳ, reason: contains not printable characters */
    class C0288 extends AbstractC0291.AbstractC0292 {
        C0288() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        protected void onFailure(Call call, Exception exc) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onResponse(Response response) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ވ$Ԩ, reason: contains not printable characters */
    class C0289 extends AbstractC0291.AbstractC0292 {
        C0289() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        protected void onFailure(Call call, Exception exc) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onResponse(Response response) {
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m1051(String str) {
        if (!str.isEmpty()) {
            String[] strArr = {SOY.d("55"), SOY.d("57"), SOY.d("5E"), SOY.d("52"), SOY.d("53"), SOY.d("50"), SOY.d("51"), SOY.d("54"), SOY.d("21"), SOY.d("27"), SOY.d("45"), SOY.d("24"), SOY.d("01"), SOY.d("07"), SOY.d("06")};
            for (int i = 0; i < 15; i++) {
                String str2 = strArr[i];
                if (str.contains(str2)) {
                    str = str.replace(str2, SOY.d("26") + str2);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m1052(String str, String str2, Map<String, String> map) {
        try {
            C0288 c0288 = new C0288();
            C0295.m1083(C0295.m1082(), str, null, map, c0288);
            return new String(c0288.getResult().body().bytes(), str2).replaceAll(SOY.d("772E5B"), "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String m1053(String str, Map<String, String> map, String str2, Map<String, String> map2) {
        try {
            C0289 c0289 = new C0289();
            C0295.m1086(C0295.m1082(), str, map, map2, c0289);
            return new String(c0289.getResult().body().bytes(), str2).replaceAll(SOY.d("772E5B"), "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static String m1054(String str, String str2) {
        String str3;
        String string;
        String strD = SOY.d("1733324C5B58");
        String strD2 = SOY.d("55");
        try {
            if (str2.startsWith(SOY.d("557D"))) {
                string = Uri.parse(str).getScheme() + SOY.d("40") + str2;
            } else {
                boolean zStartsWith = str2.startsWith(strD2);
                String strD3 = SOY.d("407D7E");
                if (zStartsWith && str2.contains(SOY.d("473A250204"))) {
                    Uri uri = Uri.parse(str);
                    string = uri.getScheme() + strD3 + uri.getHost() + str2;
                } else if (str2.startsWith(strD)) {
                    string = str2.replace(strD, Uri.parse(str).getScheme() + strD3);
                } else {
                    if (str2.contains(strD3)) {
                        return str2;
                    }
                    Uri uri2 = Uri.parse(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(uri2.getScheme());
                    sb.append(strD3);
                    sb.append(uri2.getHost());
                    if (str2.startsWith(strD2)) {
                        str3 = str2;
                    } else {
                        str3 = strD2 + str2;
                    }
                    sb.append(str3);
                    string = sb.toString();
                }
            }
            return string;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m1055(com.github.catvod.spider.merge.C0011 r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String[] r6 = r6.split(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r6.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L5f
            r2 = r6[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "5D"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L25
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L37
        L25:
            java.lang.String r3 = "58"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L55
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L55
        L37:
            int r3 = r2.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r4, r3)
            java.lang.String r3 = "263C"
            java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
            java.lang.String r4 = "70"
            java.lang.String r4 = com.github.catvod.spider.merge.SOY.d(r4)
            java.lang.String r2 = r2.replace(r3, r4)
            r7.add(r2)
            goto L5c
        L55:
            java.lang.String r2 = m1056(r5, r2)
            r7.add(r2)
        L5c:
            int r1 = r1 + 1
            goto Lb
        L5f:
            java.lang.String r5 = ""
            java.lang.String r5 = m1063(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0287.m1055(com.github.catvod.spider.merge.ĺ, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static String m1056(C0011 c0011, String str) {
        String[] strArrSplit = str.split(SOY.d("5C74"));
        if (strArrSplit.length != 1) {
            c0011 = m1061(strArrSplit[0], c0011);
        }
        for (int i = 1; i < strArrSplit.length - 1; i++) {
            c0011 = m1061(strArrSplit[i], c0011);
        }
        return m1058(c0011, strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static HashMap<String, String> m1057() {
        HashMap<String, String> map = new HashMap<>();
        map.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
        return map;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static String m1058(C0011 c0011, String str) {
        if (SOY.d("50").equals(str)) {
            return SOY.d("14273D1A");
        }
        String[] strArrSplit = str.split(SOY.d("262E0D0A"));
        if (strArrSplit.length > 1) {
            for (String str2 : strArrSplit) {
                String strM1060 = null;
                try {
                    strM1060 = m1060(c0011, str2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!TextUtils.isEmpty(strM1060)) {
                    return strM1060;
                }
            }
        }
        return m1060(c0011, str);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static String m1059(C0011 c0011, String str) {
        if (str == null || str.length() == 0 || SOY.d("50").equals(str)) {
            return "";
        }
        boolean zContains = str.contains(SOY.d("5438224C"));
        String strD = SOY.d("95EEDA");
        return zContains ? m1055(c0011, str, strD) : str.contains(strD) ? m1055(c0011, str, strD) : m1055(c0011, str, SOY.d("2679"));
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private static String m1060(C0011 c0011, String str) {
        try {
            String[] strArrSplit = str.split(SOY.d("267C3B054E"));
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
            }
            String[] strArrSplit2 = str.split(SOY.d("5B"));
            int length = strArrSplit2.length;
            String strD = SOY.d("5A");
            String strD2 = SOY.d("70");
            String strD3 = SOY.d("386465321114");
            String strD4 = SOY.d("2E372902");
            String strD5 = SOY.d("3B262504");
            String strD6 = SOY.d("32263C1A");
            if (length <= 1) {
                String strM204 = str.equals(strD4) ? c0011.m204() : strD3.equals(str) ? new String(Base64.decode(c0011.m204(), 0)) : strD6.equals(str) ? c0011.m189() : str.contains(strD5) ? c0011.mo117(str.replace(strD5, "")) : c0011.mo117(str);
                return !strD6.equals(str) ? strM204.replaceAll(strD2, strD) : strM204;
            }
            String strM2042 = strArrSplit2[0].equals(strD4) ? c0011.m204() : strD3.equals(strArrSplit2[0]) ? new String(Base64.decode(c0011.m204(), 0)) : strD6.equals(strArrSplit2[0]) ? c0011.m189() : strArrSplit2[0].contains(strD5) ? c0011.mo117(strArrSplit2[0].replace(strD5, "")) : c0011.mo117(strArrSplit2[0]);
            if (!strD6.equals(str)) {
                strM2042 = strM2042.replaceAll(strD2, strD);
            }
            for (int i = 1; i < strArrSplit2.length; i++) {
                strM2042 = strM2042.replace(strArrSplit2[i], "");
            }
            return strM2042;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static C0011 m1061(String str, C0011 c0011) {
        if (str.startsWith(SOY.d("2E372902")) || str.startsWith(SOY.d("3B262504"))) {
            return c0011;
        }
        for (String str2 : f716) {
            if (str2.equals(str)) {
                return c0011;
            }
        }
        String[] strArrSplit = str.split(SOY.d("577F"));
        if (strArrSplit.length > 1) {
            C0011 c0011M1061 = m1061(strArrSplit[0], c0011);
            String strMo287 = c0011M1061.mo287();
            for (int i = 1; i < strArrSplit.length; i++) {
                strMo287 = strMo287.replace(m1061(strArrSplit[i], c0011M1061).mo287(), "");
                c0011M1061 = C0243.m884(strMo287);
            }
            return c0011M1061;
        }
        String[] strArrSplit2 = str.split(SOY.d("262E0D0A"));
        if (strArrSplit2.length > 1) {
            for (String str3 : strArrSplit2) {
                C0011 c0011M10612 = null;
                try {
                    c0011M10612 = m1061(str3, c0011);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (c0011M10612 != null) {
                    return c0011M10612;
                }
            }
        }
        String[] strArrSplit3 = str.split(SOY.d("56"));
        if (strArrSplit3.length <= 1) {
            return c0011.m199(str).m1688();
        }
        int i2 = Integer.parseInt(strArrSplit3[1]);
        C0455 c0455M199 = c0011.m199(strArrSplit3[0]);
        return i2 < 0 ? c0455M199.get(c0455M199.size() + i2) : c0011.m199(strArrSplit3[0]).get(i2);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static boolean m1062(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith(SOY.d("17333618110340")) || lowerCase.startsWith(SOY.d("1F36631D4E")) || lowerCase.startsWith(SOY.d("0E3A241810120868"))) {
            return true;
        }
        return (lowerCase.startsWith(SOY.d("12262506")) && lowerCase.split(SOY.d("41"))[0].endsWith(SOY.d("54263E0406121426"))) || lowerCase.startsWith(SOY.d("1C26214C5B58")) || lowerCase.startsWith(SOY.d("0E2433190C5A02356B")) || lowerCase.startsWith(SOY.d("02356B595B")) || lowerCase.startsWith(SOY.d("0235211A150E407D7E"));
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static String m1063(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() <= 0) {
            return "";
        }
        if (list.size() <= 1) {
            return list.get(0);
        }
        sb.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(str);
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static String m1064(String str) {
        String[] strArr = {SOY.d("21B4DFE491CDF5"), SOY.d("21B4CAC992FAD8"), SOY.d("21B6E9FB91FBFFB7C1DD")};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                str = str.substring(0, str.indexOf(str2));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static String m1065(String str, String str2) {
        if (!str.isEmpty()) {
            for (String str3 : m1069(str2, SOY.d("21B4CAC992FAD868"), SOY.d("27")).get(0).split(SOY.d("262E0D0A"))) {
                String strD = SOY.d("476C");
                if (str3.contains(strD)) {
                    str = str3.split(strD).length < 2 ? str.replace(str3.split(strD)[0], "") : str.replace(str3.split(strD)[0], str3.split(strD)[1]);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public static C0455 m1066(C0011 c0011, String str) {
        String[] strArrSplit = str.split(SOY.d("262E0D0A"));
        C0455 c0455 = new C0455();
        for (String str2 : strArrSplit) {
            try {
                c0455.addAll(m1067(c0011, str2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c0455;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static C0455 m1067(C0011 c0011, String str) {
        int i;
        int size;
        String[] strArrSplit = str.split(SOY.d("56"));
        if (strArrSplit.length <= 1) {
            return c0011.m199(str);
        }
        String[] strArrSplit2 = strArrSplit[1].split(SOY.d("40"), -1);
        if (TextUtils.isEmpty(strArrSplit2[0])) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strArrSplit2[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = 0;
            }
        }
        if (TextUtils.isEmpty(strArrSplit2[1])) {
            size = 0;
        } else {
            try {
                size = Integer.parseInt(strArrSplit2[1]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                size = 0;
            }
        }
        C0455 c0455M199 = c0011.m199(strArrSplit[0]);
        if (size > c0455M199.size()) {
            size = c0455M199.size();
        }
        if (size <= 0) {
            size += c0455M199.size();
        }
        C0455 c0455 = new C0455();
        while (i < size) {
            c0455.add(c0455M199.get(i));
            i++;
        }
        return c0455;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public static String m1068(String str) {
        String strTrim;
        try {
            String str2 = str.split(SOY.d("552139170612"))[0];
            String strReplace = C0295.m1089(str, m1057()).replace(SOY.d("0C3323560402083E"), SOY.d("0C3323561916133C"));
            String str3 = null;
            int iIndexOf = strReplace.indexOf(SOY.d("17333818"));
            String strD = SOY.d("12262506");
            if (iIndexOf != -1) {
                Matcher matcher = Pattern.compile(SOY.d("0C3323561916133C714B542C5D700C5E5A5D457B0A51562A")).matcher(strReplace);
                if (matcher.find()) {
                    strTrim = matcher.group(1).trim();
                    if (strTrim.indexOf(strD) == -1) {
                        strTrim = str2 + strTrim;
                    }
                    str3 = strTrim;
                }
            } else {
                Matcher matcher2 = Pattern.compile(SOY.d("0F203D4C5A5D45097654295F54786E5F2F50580F")).matcher(strReplace);
                if (matcher2.find()) {
                    strTrim = matcher2.group(1).trim();
                    if (strTrim.indexOf(strD) != -1) {
                        str3 = strTrim;
                    } else {
                        str3 = str2 + strTrim;
                    }
                }
            }
            return str3 != null ? str3 : str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public static ArrayList<String> m1069(String str, String str2, String str3) {
        String strD = SOY.d("5C");
        String strD2 = SOY.d("95EED799C8F1");
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.isEmpty() && str3.isEmpty()) {
            arrayList.add(str);
            return arrayList;
        }
        try {
            Matcher matcher = Pattern.compile(m1051(str2.replaceAll(strD2, strD)) + SOY.d("527C7B495D") + m1051(str3.replaceAll(strD2, strD))).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).trim());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public static String m1070(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArrSplit = str.split(SOY.d("260E24"));
        for (int i = 1; i < strArrSplit.length; i++) {
            stringBuffer.append((char) Integer.parseInt(strArrSplit[i], 16));
        }
        return stringBuffer.toString();
    }
}
