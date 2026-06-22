package com.github.catvod.spider.merge;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.UrlQuerySanitizer;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AbstractC0291;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class xc extends Spider {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static long f108 = 0;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static SharedPreferences f109 = null;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static String f110 = "";

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static String f111 = "";

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static boolean f112 = false;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static String f113 = "";

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static String f114 = "";

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static String f115 = "";

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static String f116 = "";

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static String f117 = "";

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static String f118 = "";

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private static String f119 = "";

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static String f120 = "";

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static String f121 = "";

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private static String f122 = "";

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private static String f123 = "";

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static String f124 = "";

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private static String f125 = "";

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private static String f126 = "";

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private static String f127 = "";

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    private static boolean f128 = true;

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    private static boolean f129 = true;

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    private static String f130 = "false";

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    private static String f131 = "";

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    private static String f132 = "";

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    private static String f133 = ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a#.wma";

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    private static String f134 = "=http#.html#?http";

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    private static String f135 = Environment.getExternalStorageDirectory().getAbsolutePath();

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    private static Map<String, String> f136 = new HashMap();

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    private static Map<String, Long> f137 = new HashMap();

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    private static Map<String, String> f138 = new HashMap();

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    private static final Map<String, Map<String, String>> f139 = new HashMap();

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    private static final ReentrantLock f140 = new ReentrantLock();

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    public static Pattern f141 = Pattern.compile(SOY.d("523A25020404407D7E010300547A301A1D071B3C2D17181E03273F12061E0C3778581718177D22592F29580F7A5F"));

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    public static Pattern f142 = Pattern.compile(SOY.d("0D2526585C16163B21171A0B1B3E380F01191E203800115E54313E1B5B04557A0A285B2A517B79591218163634045B5F210C7E2B5F5E536D"));

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    private static boolean f143 = true;

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    private static boolean f144 = true;

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    private static boolean f145 = true;

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    private static boolean f146;

    public static Object[] File(Map<String, String> map) {
        try {
            String str = map.get(SOY.d("093A300411281336"));
            return new Object[]{200, SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418"), new ByteArrayInputStream(m109(str, m106(str, ""), map.get(SOY.d("1C3B3D132B1E1E"))).getBytes())};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Object[] ProxyMedia(Map<String, String> map) {
        try {
            String str = map.get(SOY.d("093A300411281336"));
            String str2 = map.get(SOY.d("1C3B3D132B1E1E"));
            String str3 = map.get(SOY.d("1737351F15281336"));
            String strM106 = m106(str, "");
            ReentrantLock reentrantLock = f140;
            reentrantLock.lock();
            Map<String, Map<String, String>> map2 = f139;
            String str4 = map2.get(str2).get(str3);
            if (new Long(new UrlQuerySanitizer(str4).getValue(SOY.d("027F3E05075A1F2A211F061209"))).longValue() - m108() <= 60) {
                m109(str, strM106, str2);
                str4 = map2.get(str2).get(str3);
            }
            reentrantLock.unlock();
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.merge.xc.2
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1083(C0295.m1082(), str4, null, m102(), abstractC0292);
            return new Object[]{200, SOY.d("0C3B35131B5837026322"), abstractC0292.getResult().body().byteStream()};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Object[] ProxyopenMedia(Map<String, String> map) {
        try {
            String str = map.get(SOY.d("1C3B3D132B1E1E"));
            String str2 = map.get(SOY.d("1737351F15281336"));
            String str3 = map.get(SOY.d("1E20380011281336"));
            boolean zEquals = map.get(SOY.d("1E373D13121E1637")).equals(SOY.d("0E202413"));
            ReentrantLock reentrantLock = f140;
            reentrantLock.lock();
            String strD = SOY.d("0C3B35131B5837026322");
            String strD2 = SOY.d("027F3E05075A1F2A211F061209");
            if (!zEquals) {
                Map<String, Map<String, String>> map2 = f139;
                String str4 = map2.get(str).get(str2);
                if (new Long(new UrlQuerySanitizer(str4).getValue(strD2)).longValue() - m108() <= 60) {
                    getPreviewUrl(str, str3, zEquals);
                    str4 = map2.get(str).get(str2);
                }
                reentrantLock.unlock();
                AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.merge.xc.4
                    @Override // com.github.catvod.spider.merge.AbstractC0291
                    public void onFailure(Call call, Exception exc) {
                    }

                    @Override // com.github.catvod.spider.merge.AbstractC0291
                    public void onResponse(Response response) {
                    }
                };
                C0295.m1083(C0295.m1082(), str4, null, m102(), abstractC0292);
                return new Object[]{200, strD, abstractC0292.getResult().body().byteStream()};
            }
            String str5 = map.get(SOY.d("093A300411281336"));
            f118 = m106(str5, "");
            String str6 = map.get(SOY.d("1520361F1A11133E34291D13"));
            Map<String, Map<String, String>> map3 = f139;
            String str7 = map3.get(str6).get(str2);
            if (new Long(new UrlQuerySanitizer(str7).getValue(strD2)).longValue() - m108() <= 60) {
                getOpenPreview(str6, str5, str3);
                str7 = map3.get(str6).get(str2);
            }
            reentrantLock.unlock();
            AbstractC0291.AbstractC0292 abstractC02922 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.merge.xc.3
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1083(C0295.m1082(), str7, null, m102(), abstractC02922);
            return new Object[]{200, strD, abstractC02922.getResult().body().byteStream()};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static boolean checkstring(String str) {
        String[] strArr = {SOY.d("1761244E5A070D7D1217171F1F"), SOY.d("1C203E1B491F0E2621054E58553030180D0214357F0603"), SOY.d("1D37251B4702426D2404184A12262506")};
        for (int i = 0; i < 3; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static String getOpenPreview(String str, String str2, String str3) {
        try {
            f146 = true;
            String strM98 = m98(str, str2, str3);
            String previewUrl = getPreviewUrl(strM98, str3, str, str2, f146);
            if (strM98 != null && !strM98.isEmpty()) {
                m99(strM98, str3);
            }
            return previewUrl;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getPreviewUrl(String str, String str2, boolean z) {
        return getPreviewUrl(str, str2, "", "", z);
    }

    public static String getSize(double d) {
        if (d == 0.0d) {
            return "";
        }
        String strD = SOY.d("5F7C63105104");
        return d > 1.099511627776E12d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1.099511627776E12d), SOY.d("2E10")) : d > 1.073741824E9d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1.073741824E9d), SOY.d("3D10")) : d > 1048576.0d ? String.format(Locale.getDefault(), strD, Double.valueOf(d / 1048576.0d), SOY.d("3710")) : String.format(Locale.getDefault(), strD, Double.valueOf(d / 1024.0d), SOY.d("3110"));
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get(SOY.d("093B2513"));
            String str2 = map.get(SOY.d("0A3B32"));
            HashMap map2 = new HashMap();
            map2.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741"));
            map2.put(SOY.d("08373713061208"), str);
            AbstractC0291.AbstractC0292 abstractC0292 = new AbstractC0291.AbstractC0292() { // from class: com.github.catvod.spider.merge.xc.5
                @Override // com.github.catvod.spider.merge.AbstractC0291
                protected void onFailure(Call call, Exception exc) {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.AbstractC0291
                public void onResponse(Response response) {
                }
            };
            C0295.m1083(C0295.m1082(), str2, null, map2, abstractC0292);
            if (abstractC0292.getResult().code() == 200) {
                String strD = abstractC0292.getResult().headers().get(SOY.d("393D3F0211190E7F050F0412"));
                if (strD == null) {
                    strD = SOY.d("1B22211A1D141B2638191A5815312513005A09262313151A");
                }
                System.out.println(str2);
                System.out.println(strD);
                return new Object[]{200, strD, abstractC0292.getResult().body().byteStream()};
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static Object[] openFile(Map<String, String> map) {
        try {
            return new Object[]{200, SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418"), new ByteArrayInputStream(getOpenPreview(map.get(SOY.d("1C3B3D132B1E1E")), map.get(SOY.d("093A300411281336")), map.get(SOY.d("1E20380011281336"))).getBytes())};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Object[] openselfFile(Map<String, String> map) {
        try {
            return new Object[]{200, SOY.d("1B22211A1D141B2638191A580C3C355815070A3E345819071F35240418"), new ByteArrayInputStream(getPreviewUrl(map.get(SOY.d("1C3B3D132B1E1E")), map.get(SOY.d("1E20380011281336")), map.get(SOY.d("1E373D13121E1637")).equals(SOY.d("0E202413"))).getBytes())};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static String repl(String str) {
        String[] strArr = {SOY.d("593B36181B051F1B3C11490308273455"), SOY.d("593B36181B051F0438121118472623031154"), SOY.d("593B36181B051F1F24051D14472623031154"), SOY.d("593B22201D131F3D6C0206021F71"), SOY.d("593B223B010413316C0206021F71"), SOY.d("593B36181B051F1F62234C54"), SOY.d("593B223B47024271"), SOY.d("0C3B35131B4D557D")};
        if (!str.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                str = str.replace(strArr[i], "");
            }
        }
        return str.replaceAll(SOY.d("95EECA99C8EC"), SOY.d("41"));
    }

    public static Object[] vod(Map<String, String> map) {
        String str = map.get(SOY.d("0E2B2113"));
        if (str.equals(SOY.d("1761244E"))) {
            return File(map);
        }
        if (str.equals(SOY.d("1737351F15"))) {
            return ProxyMedia(map);
        }
        if (str.equals(SOY.d("152234180402183F62034C"))) {
            return openFile(map);
        }
        if (str.equals(SOY.d("15223418071216343C45014F"))) {
            return openselfFile(map);
        }
        if (str.equals(SOY.d("1522341819121E3B30"))) {
            return ProxyopenMedia(map);
        }
        if (str.equals(SOY.d("0A3B32060618022B"))) {
            return loadPic(map);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m92(String str, String str2) {
        if (!str.startsWith(SOY.d("1226250607"))) {
            str = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C59") + str;
        }
        String strM114 = m114(str, str2, m100());
        return m96(strM114) ? m92(str, str2) : strM114;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static String m93(String str, JSONObject jSONObject) {
        return m92(str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static String m94(String str, String str2) {
        if (!str.startsWith(SOY.d("1226250607"))) {
            str = SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B") + str;
        }
        String strM114 = m114(str, str2, m101());
        return m97(strM114) ? m94(str, str2) : strM114;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static String m95(String str, JSONObject jSONObject) {
        return m94(str, jSONObject.toString());
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static boolean m96(String str) {
        if (!str.contains(SOY.d("3B31321307042E3D3A131A3E1424301A1D13")) && !str.contains(SOY.d("3B31321307042E3D3A131A32022238041113"))) {
            return false;
        }
        if (f128) {
            f114 = "";
        } else {
            f119 = "";
        }
        m105();
        return f129;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static boolean m97(String str) {
        if (!str.contains(SOY.d("3B31321307042E3D3A131A3E1424301A1D13")) && !str.contains(SOY.d("3B31321307042E3D3A131A32022238041113"))) {
            return false;
        }
        if (f128) {
            f114 = "";
            f116 = "";
            f109.edit().remove(SOY.d("2A27331A1D14283737041104121D21131A")).apply();
            f117 = "";
            f109.edit().remove(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F")).apply();
        } else {
            f119 = "";
            f120 = "";
            f109.edit().remove(SOY.d("2A20380015031F0034100612093A1E061119")).apply();
            f121 = "";
            f109.edit().remove(SOY.d("2A20380015031F133215110409063E1D111935223418")).apply();
        }
        m105();
        if (f145) {
            m113();
        }
        return f129;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static String m98(String str, String str2, String str3) {
        String strM92 = m92(SOY.d("1B36231F02125524635916160E3139"), String.format(SOY.d("0170231305021F212505564D212973141B1303706B0D5611133E34291D135868735307555670221E15051F0D3812564D5877225458551B2725192B051F3C301B115540262303115B58263E29041608373F022B11133E34291D13586873041B180E707D5400182536231F0212253B35544E555F21730B585512373012110509706B0D5634153C25131A0357062806115540703006041B133130021D18147D3B051B19582F7D541D1358687346565B583F34021C181E706B5424382906735A5602083E734C56581C3B3D135B1415222854092A5670231307180F203213564D5834381A115507"), str, str2, str3));
        if (strM92.contains(SOY.d("1F2A321311131F3671021C125A3E381B1D03"))) {
            if (f128) {
                f109.edit().remove(SOY.d("2A27331A1D1428373704110412063E1D1119")).apply();
                f109.edit().remove(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F")).apply();
            } else {
                f109.edit().remove(SOY.d("2A20380015031F0034100612093A05191F1214")).apply();
                f109.edit().remove(SOY.d("2A20380015031F133215110409063E1D111935223418")).apply();
            }
            Init.show(SOY.d("9FEFC293FDFA92E6F793FBC09FDDFE91E0DF9DFBEB9FE3C39FE5E390CFD695EEDD9EDBC09FE2CC9EDBE29CEAD491E4F19DEFC091EFEF9FC2DF9FF3FA92FDC495F4F5"));
        }
        return new JSONObject(strM92).getJSONArray(SOY.d("083722061B19093722")).getJSONObject(0).getJSONObject(SOY.d("183D350F")).getString(SOY.d("1C3B3D132B1E1E"));
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static void m99(String str, String str2) {
        try {
            m92(SOY.d("1B36231F02125524635916160E3139"), String.format(SOY.d("0170231305021F212505564D212973141B1303706B0D5613083B27132B1E1E706B545104587E73101D1B1F0D3812564D58772254095B583A341710120821734C0F55393D3F0211190E7F050F0412586873170407163B3217001E153C7E1C071814702C5A561E1E706B545104587E731B1103123D35544E552A1D0222565B5827231A564D587D371F18125536341A11031F702C2B58550837221901051937734C5611133E345409"), str2, str, str));
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private static HashMap<String, String> m100() {
        HashMap<String, String> mapM102 = m102();
        boolean z = f128;
        String strD = SOY.d("1B27251E1B05132830021D1814");
        if (z) {
            mapM102.put(strD, f114);
        } else {
            mapM102.put(strD, f119);
        }
        mapM102.put(SOY.d("027F32171A16082B"), SOY.d("193E38131A034725341458160A226C051C1608377D001105093B3E184901487C625845"));
        if (f146) {
            mapM102.put(SOY.d("027F221E15051F7F25191F1214"), f118);
        }
        return mapM102;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private static HashMap<String, String> m101() {
        HashMap<String, String> mapM102 = m102();
        boolean z = f128;
        String strD = SOY.d("1B27251E1B05132830021D1814");
        if (z) {
            mapM102.put(strD, f109.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), f117));
        } else {
            mapM102.put(strD, f109.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121));
        }
        return mapM102;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static HashMap<String, String> m102() {
        HashMap<String, String> map = new HashMap<>();
        map.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F345945464A7C615844594A7202171216083B7E434740546167"));
        map.put(SOY.d("28373713061208"), SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C59"));
        return map;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private static HashMap<String, String> m103() {
        HashMap<String, String> map = new HashMap<>();
        map.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F345945464A7C615844594A7202171216083B7E434740546167"));
        return map;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private static String m104(JSONArray jSONArray) throws JSONException {
        String[] strArr = {SOY.d("2F1A15"), SOY.d("2B1A15"), SOY.d("3C1A15"), SOY.d("3216"), SOY.d("2916"), SOY.d("3616")};
        int i = 0;
        while (true) {
            String strD = SOY.d("0F203D");
            if (i >= 6) {
                return jSONArray.getJSONObject(0).getString(strD);
            }
            String str = strArr[i];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.getString(SOY.d("0E373C0618160E370E1F10")).equals(str)) {
                    return jSONObject.getString(strD);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private static void m105() {
        String strD = SOY.d("0F2134042B1E1E");
        long jM108 = m108();
        if (f128) {
            if (!f114.isEmpty()) {
                return;
            }
        } else if (!f119.isEmpty() && f108 - jM108 > 3600) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = f128;
            String strD2 = SOY.d("772E5B");
            String strD3 = SOY.d("2A27331A1D1428373704110412063E1D1119");
            String strD4 = SOY.d("2A20380015031F0034100612093A05191F1214");
            String strD5 = SOY.d("083737041104120D25191F1214");
            if (z) {
                jSONObject.put(strD5, f109.getString(strD3, f115).replaceAll(strD2, "").trim());
            } else {
                jSONObject.put(strD5, f109.getString(strD4, f115).replaceAll(strD2, "").trim());
            }
            jSONObject.put(SOY.d("1D20301800280E2B2113"), strD5);
            if (f129) {
                JSONObject jSONObject2 = new JSONObject(m114(SOY.d("12262506074D557D3003001F54333D1F0D021436231F021254313E1B5B01487D301517180F3C2559001811373F"), jSONObject.toString(), m102()));
                if (!jSONObject2.has(strD5)) {
                    f115 = "";
                    f129 = false;
                    if (f128) {
                        f109.edit().remove(strD3).apply();
                        Init.show(SOY.d("2E3D3A131A92DEE3B7E3FC98C6DEB9D9C393C7EDB6E2DC91CFE5B8EEE09FDDD4B6E3F8571B3E38021B1C1F3CB8DCF89FD5D37193C4F89DFADA93CEF89CDCF99FF4F692FCEF91C9D92E3D3A131A92EADCB4F0F993C7EDB6E2DC94FAD0"));
                        return;
                    } else {
                        f109.edit().remove(strD4).apply();
                        Init.show(SOY.d("2E3D3A131A92DEE3B7E3FC98C6DEB9D9C392CACFB9D9E19EFDDFB7E0C493C7EDB6E2DC91CFE5B8EEE09FDDD4B6E3F891F4FAB8F6F594FAD0"));
                        return;
                    }
                }
                boolean z2 = f128;
                String strD6 = SOY.d("1B313213070425263E1D1119");
                String strD7 = SOY.d("5A");
                String strD8 = SOY.d("0E3D3A131A280E2B2113");
                if (z2) {
                    f114 = jSONObject2.getString(strD8) + strD7 + jSONObject2.getString(strD6);
                } else {
                    f119 = jSONObject2.getString(strD8) + strD7 + jSONObject2.getString(strD6);
                }
                try {
                    f108 = jSONObject2.getLong(SOY.d("1F2A211F0612090D3818")) + jM108;
                    f122 = jSONObject2.getString(SOY.d("1E37271F1712253B35"));
                    f123 = jSONObject2.getString(strD);
                    f124 = jSONObject2.getString(SOY.d("1B2430021505"));
                    f125 = jSONObject2.getString(SOY.d("1E373717011B0E0D35041D011F0D3812"));
                    String string = jSONObject2.getString(strD5);
                    f115 = string;
                    if (f128) {
                        f109.edit().putString(strD3, f115).apply();
                        f109.edit().putString(SOY.d("2A27331A1D143E373717101E1E"), f125).apply();
                    } else {
                        f109.edit().putString(strD4, f115).apply();
                        f109.edit().putString(SOY.d("2A20380015031F16341015131336"), f125).apply();
                        f109.edit().putString(strD, f123).apply();
                    }
                    if (f128) {
                        File file = new File(f135 + SOY.d("550A08272021383D2959"));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        FileWriter fileWriter = new FileWriter(new File(file, SOY.d("1B3E38021B1C1F3C7F020C03")));
                        fileWriter.write(string);
                        fileWriter.flush();
                        fileWriter.close();
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
                f129 = true;
            }
        } catch (JSONException e2) {
            SpiderDebug.log(e2);
        }
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private static synchronized String m106(String str, String str2) {
        synchronized (xc.class) {
            try {
                long jM108 = m108();
                String str3 = f136.get(str);
                Long l = f137.get(str);
                if (!TextUtils.isEmpty(str3) && l.longValue() - jM108 > 600) {
                    return str3;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("093A300411281336"), str);
                jSONObject.put(SOY.d("093A300411280A2535"), str2);
                JSONObject jSONObject2 = new JSONObject(m114(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C590245552139170612253E38181F581D372529071F1B203429001811373F"), jSONObject.toString(), m102()));
                String string = jSONObject2.getString(SOY.d("093A300411280E3D3A131A"));
                f137.put(str, Long.valueOf(jM108 + jSONObject2.getLong(SOY.d("1F2A211F0612090D3818"))));
                f136.put(str, string);
                return string;
            } catch (JSONException e) {
                SpiderDebug.log(e);
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private static void m107() {
        C0305 c0305 = new C0305();
        f110 = SOY.d("4A66") + C0308.m1186(c0305.m1181().m1182().m1190());
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("4F36351340124B3035104D124E6B6740164442653317414F1C663345121319616B"));
        sb.append(f122);
        String strD = SOY.d("40");
        sb.append(strD);
        sb.append(f123);
        sb.append(strD);
        sb.append(0);
        f111 = C0308.m1186(C0302.m1172(sb.toString(), c0305).m1184().m1190()).substring(r0.length() - 128) + SOY.d("4A63");
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected static long m108() {
        return System.currentTimeMillis() / 1000;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private static String m109(String str, String str2, String str3) {
        String str4;
        String strD;
        String strD2;
        String strD3 = SOY.d("70");
        String strD4 = SOY.d("55");
        String strD5 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E001D131F3D0E0606120C3B34012B07163328291D191C3D");
        String strD6 = SOY.d("0E373C0618160E370E1F10");
        String strD7 = SOY.d("3B31321307042E3D3A131A3E1424301A1D13");
        String strD8 = SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5901041F2022590246552722130604553634001D141F7D320411160E370E051104093B3E18");
        try {
            m107();
            HashMap<String, String> mapM102 = m102();
            int i = 0;
            int i2 = 0;
            while (true) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("1E37271F171234333C13"), SOY.d("393A231919129CE7DE9ED3FF9FCBF9"));
                jSONObject.put(SOY.d("173D351318391B3F34"), SOY.d("2D3B3F121B0009B5ECE79DD6CFB5D8FE"));
                jSONObject.put(SOY.d("143D3F1511"), i);
                jSONObject.put(SOY.d("0A27333D110E"), f110);
                boolean z = f128;
                String strD9 = SOY.d("1B27251E1B05132830021D1814");
                String strD10 = SOY.d("083737041104120D25191F1214");
                if (z) {
                    str4 = strD3;
                    jSONObject.put(strD10, f109.getString(SOY.d("2A27331A1D1428373704110412063E1D1119"), f115));
                    mapM102.put(strD9, f114);
                } else {
                    str4 = strD3;
                    jSONObject.put(strD10, f109.getString(SOY.d("2A20380015031F0034100612093A05191F1214"), f115));
                    mapM102.put(strD9, f119);
                }
                mapM102.put(SOY.d("027F221E15051F7F25191F1214"), str2);
                mapM102.put(SOY.d("027F3513021E19377C1F10"), f122);
                mapM102.put(SOY.d("027F221F13191B26240411"), f111);
                String strM114 = m114(strD8, jSONObject.toString(), mapM102);
                boolean zContains = strM114.contains(strD7);
                strD = SOY.d("3B31321307042E3D3A131A32022238041113");
                if (zContains || strM114.contains(strD)) {
                    if (f128) {
                        f114 = "";
                    } else {
                        f119 = "";
                    }
                    m105();
                    strM114 = m114(strD8, jSONObject.toString(), mapM102);
                }
                if (strM114.contains(SOY.d("083722031803586825040112"))) {
                    break;
                }
                m107();
                i2++;
                if (i2 > 3) {
                    break;
                }
                strD3 = str4;
                i = 0;
            }
            mapM102.put(SOY.d("027F32171A16082B"), SOY.d("193E38131A034725341458160A226C1710051324345A0212082138191A4A0C667F475A46"));
            mapM102.put(SOY.d("152038111D19"), SOY.d("12262506074D557D260103591B3E380F01191E2038001159193D3C"));
            mapM102.put(SOY.d("1C3B3D131D13"), f123);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SOY.d("193325131318082B"), SOY.d("163B27132B0308333F0517181E3B3F11"));
            jSONObject2.put(SOY.d("1C3B3D132B1E1E"), str3);
            jSONObject2.put(SOY.d("1D37252904051F24381303280F203D"), true);
            jSONObject2.put(SOY.d("1D3725290702182638021812253B3F101B"), true);
            jSONObject2.put(SOY.d("093A300411281336"), str);
            jSONObject2.put(strD6, "");
            String strM1142 = m114(strD5, jSONObject2.toString(), mapM102);
            if (strM1142.contains(strD7) || strM1142.contains(strD)) {
                if (f128) {
                    f114 = "";
                } else {
                    f119 = "";
                }
                m105();
                strM1142 = m114(strD5, jSONObject2.toString(), mapM102);
            }
            JSONArray jSONArray = new JSONObject(strM1142).getJSONObject(SOY.d("0C3B35131B280A2034001D120D0D211A150E253B3F101B")).getJSONArray(SOY.d("163B27132B0308333F0517181E3B3F112B031B213A29181E0926"));
            String[] strArr = {SOY.d("2F1A15"), SOY.d("2B1A15"), SOY.d("3C1A15"), SOY.d("3216"), SOY.d("2916"), SOY.d("3616")};
            String string = "";
            int i3 = 0;
            while (true) {
                strD2 = SOY.d("0F203D");
                if (i3 >= 6) {
                    break;
                }
                String str5 = strArr[i3];
                int i4 = 0;
                while (true) {
                    if (i4 >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                    if (jSONObject3.optString(strD6).equals(str5) && jSONObject3.optString(strD2).startsWith(SOY.d("12262506"))) {
                        string = jSONObject3.getString(strD2);
                        break;
                    }
                    i4++;
                }
                if (!string.isEmpty()) {
                    break;
                }
                i3++;
            }
            if (string.isEmpty() && jSONArray.length() > 0) {
                string = jSONArray.getJSONObject(0).getString(strD2);
            }
            String strM1089 = C0295.m1089(string, m102());
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            sb.append(string.substring(0, string.lastIndexOf(strD4)));
            sb.append(strD4);
            String string2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            String str6 = str4;
            for (String str7 : strM1089.split(str6)) {
                if (str7.contains(SOY.d("027F3E05075A1F2A211F061209"))) {
                    map.put("" + i5, string2 + str7);
                    str7 = Proxy.AnonymousClass3.localProxyUrl() + SOY.d("45363E4B0402093A77020D071F6F3C13101E1B74221E15051F0D381249") + str + SOY.d("5C34381A112813366C") + str3 + SOY.d("5C3F34121D16253B354B") + i5;
                    i5++;
                }
                arrayList.add(str7);
            }
            f139.put(str3, map);
            return TextUtils.join(str6, arrayList);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private String m110(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strD = SOY.d("083737041104120D25191F1214");
        jSONObject.put(strD, str);
        jSONObject.put(SOY.d("1D20301800280E2B2113"), strD);
        return new JSONObject(m114(SOY.d("12262506074D557D3003001F54333D1F0D021436231F021254313E1B5B01487D301517180F3C2559001811373F"), jSONObject.toString(), m102())).getString(SOY.d("0F2134042B1E1E"));
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private String m111(String str, String str2) {
        String strM95;
        try {
            if (f128) {
                if (f109.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), f117).isEmpty()) {
                    m113();
                }
            } else if (f109.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121).isEmpty()) {
                m113();
            }
            int i = 0;
            do {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("1C3B3D132B1E1E"), str);
                jSONObject.put(SOY.d("1E20380011281336"), str2);
                strM95 = m95(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3613003315253F1A1B161E07231A"), jSONObject);
                if (strM95.contains(SOY.d("5827231A564D583A250204"))) {
                    break;
                }
                i++;
            } while (i <= 3);
            return new JSONObject(strM95).getString(SOY.d("0F203D"));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    private static void m112(String str) {
        try {
            SpiderDebug.log(SOY.d("351324021C572837351F061219267F585A"));
            String strM114 = "";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("193D3513"), str);
            jSONObject.put(SOY.d("1D20301800280E2B2113"), SOY.d("1B27251E1B05132830021D18140D32191012"));
            if (f143) {
                strM114 = m114(SOY.d("12262506074D557D30061D59143C7F151D581B3E380500581B3E38291B071F3C7E021B1C1F3C"), jSONObject.toString(), m102());
                if (strM114.isEmpty()) {
                    strM114 = m114(SOY.d("12262506074D557D30061D5A19347F181A59193B7E17181E09267E17181E253D21131A58193D3513"), jSONObject.toString(), m102());
                }
            }
            if (strM114.contains(SOY.d("2E3D3E563916142B712411060F37220207"))) {
                f143 = false;
                Init.show(SOY.d("92FDE690C5F59FF6FB9FD6E69DEBD099C8FB92F5F793FBE693CBC193FCC19EE8D7"));
            } else {
                f143 = true;
            }
            JSONObject jSONObject2 = new JSONObject(strM114);
            f145 = false;
            boolean z = f128;
            String strD = SOY.d("1B313213070425263E1D1119");
            String strD2 = SOY.d("5A");
            String strD3 = SOY.d("0E3D3A131A280E2B2113");
            String strD4 = SOY.d("083737041104120D25191F1214");
            if (z) {
                f116 = jSONObject2.optString(strD4);
                f117 = jSONObject2.optString(strD3) + strD2 + jSONObject2.optString(strD);
                f109.edit().putString(SOY.d("2A27331A1D14283737041104121D21131A"), f116).apply();
                f109.edit().putString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), f117).apply();
                return;
            }
            f120 = jSONObject2.optString(strD4);
            f121 = jSONObject2.optString(strD3) + strD2 + jSONObject2.optString(strD);
            f109.edit().putString(SOY.d("2A20380015031F0034100612093A1E061119"), f120).apply();
            f109.edit().putString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121).apply();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    private static void m113() {
        try {
            SpiderDebug.log(SOY.d("351324021C572837200311040E7C7F58"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("1B27251E1B05132834"), 1);
            jSONObject.put(SOY.d("09313E0611"), SOY.d("0F2134044E151B21345A121E16376B17181B40203417105B1C3B3D134E16163E6B01061E0E37"));
            m112(new JSONObject(m93(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B181B27251E5B02093723055B160F263919061E00376E15181E1F3C25291D134765674F45401931321510434E666015474E4E67661744431C64614E40111860375006121E3B231317032527231F491F0E2621054E5855333D1F0703543C3F58171E55263E1918581B3E380F01191E203800115819333D1A16161939770517180A376C0307120868331707125634381A114D1B3E3D4C06121B367D101D1B1F68301A184D0D203802115109263002114A"), jSONObject)).getString(SOY.d("0837351F0612192604041D")).split(SOY.d("193D351349"))[1]);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    private static String m114(String str, String str2, Map<String, String> map) {
        AbstractC0291.AbstractC0293 abstractC0293 = new AbstractC0291.AbstractC0293() { // from class: com.github.catvod.spider.merge.xc.1
            @Override // com.github.catvod.spider.merge.AbstractC0291
            public void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.AbstractC0291
            public void onResponse(String str3) {
            }
        };
        C0295.m1087(C0295.m1082(), str, str2, map, abstractC0293);
        return abstractC0293.getResult();
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    private static void m115() {
        String strD = SOY.d("08372219010519370E12061E0C370E1F10");
        try {
            HashMap<String, String> mapM102 = m102();
            mapM102.put(SOY.d("1B27251E1B05132830021D1814"), f128 ? f114 : f119);
            JSONObject jSONObject = new JSONObject(m114(SOY.d("12262506074D557D2405110554333D1F0D021436231F021254313E1B5B01487D2405110555353402"), SOY.d("012F"), mapM102));
            if (TextUtils.isEmpty(jSONObject.optString(strD)) || jSONObject.optString(strD).equals(SOY.d("14273D1A"))) {
                return;
            }
            f127 = jSONObject.optString(strD);
            if (f128) {
                f109.edit().putString(SOY.d("2A27331A1D14283722121D13"), f127).apply();
            } else {
                f109.edit().putString(SOY.d("2A20380015031F003405101E1E"), f127).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 30, insn: 0x0688: MOVE (r3 I:??[OBJECT, ARRAY]) = (r30 I:??[OBJECT, ARRAY]), block:B:131:0x0688 */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07db  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r35) {
        /*
            Method dump skipped, instruction units count: 2102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xc.detailContent(java.util.List):java.lang.String");
    }

    public String downalisub(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("093A300411281336"), str2);
            jSONObject.put(SOY.d("1C3B3D132B1E1E"), str);
            HashMap<String, String> mapM102 = m102();
            boolean z = f128;
            String strD = SOY.d("1B27251E1B05132830021D1814");
            if (z) {
                mapM102.put(strD, f114);
            } else {
                mapM102.put(strD, f119);
            }
            mapM102.put(SOY.d("027F221E15051F7F25191F1214"), m106(str2, ""));
            return new JSONObject(m114(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E121B00143E3E1710280F203D"), jSONObject.toString(), mapM102)).getString(SOY.d("1E3D261818181B360E03061B"));
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    public String getAliContent(List<String> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String strD = SOY.d("59");
        String strD2 = SOY.d("0E2B2113");
        String strD3 = SOY.d("0F203D");
        String strD4 = SOY.d("1C3B3D132B1E14343E05");
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.startsWith(SOY.d("01")) && strTrim.endsWith(SOY.d("07")) && strTrim.contains(SOY.d("5827231A"))) {
                JSONObject jSONObject3 = new JSONObject(strTrim);
                if (jSONObject3.has(strD3)) {
                    strTrim = repl(jSONObject3.getString(strD3));
                } else if (jSONObject3.has(SOY.d("0F203D05"))) {
                    strTrim = repl(strTrim);
                }
            }
            Matcher matcher = f142.matcher(strTrim);
            if (!matcher.find()) {
                return "";
            }
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.groupCount() == 4 ? matcher.group(4) : "";
            HashMap<String, String> mapM102 = m102();
            mapM102.put(SOY.d("027F32171A16082B"), SOY.d("193E38131A034725341458160A226C051C1608377D001105093B3E184901487C625845"));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(SOY.d("093A300411281336"), strGroup);
            String strM114 = m114(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C591513083B27135B01497D221E15051F0D3D1F1A1C553534022B04123323132B15030D30181B19033F3E0307"), jSONObject4.toString(), mapM102);
            if (strM114.contains(SOY.d("093A30041128163B3F1D541E097237190615133635131A"))) {
                Init.show(SOY.d("9CC4D692CFC192EDCC9ED3F395EEDD90D4CE9CDFFF91EFCF9FD7E290C7E29FECDA90C7E292F5D59ED2F69CE3D399C8FB92FDF490E2F09EE9E793C3C59DF4D090D9D592FCEE9FE3D999D2D3"));
            }
            if (strM114.contains(SOY.d("093A30041128163B3F1D541E097232171A141F3E3D1310")) || strM114.contains(SOY.d("093A30041128163B3F1D541E0972340E041E083735"))) {
                Init.show(SOY.d("9CCFF490EDED9FC7F799C8FB92FDF493FCF19EE8FA93C3C59FF6E090E1FF99D2D3"));
            }
            JSONObject jSONObject5 = new JSONObject(strM114);
            JSONArray jSONArray = jSONObject5.getJSONArray(strD4);
            if (jSONArray.length() == 0) {
                return "";
            }
            boolean zIsEmpty = TextUtils.isEmpty(strGroup2);
            String strD5 = SOY.d("1C3B3D132B1E1E");
            if (!zIsEmpty) {
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        jSONObject = null;
                        break;
                    }
                    JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                    if (jSONObject6.getString(strD5).equals(jSONObject6.getString(strD5))) {
                        jSONObject = jSONObject6;
                        break;
                    }
                    i++;
                }
            } else {
                jSONObject = jSONArray.getJSONObject(0);
                strGroup2 = jSONObject.getString(strD5);
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(SOY.d("0C3D35291D13"), list.get(0));
            jSONObject7.put(SOY.d("0C3D35291A161737"), jSONObject5.getString(SOY.d("093A3004112814333C13")));
            jSONObject7.put(SOY.d("0C3D3529041E19"), jSONObject5.getString(SOY.d("1B2430021505")));
            jSONObject7.put(SOY.d("0C3D352917181426341800"), strTrim);
            jSONObject7.put(SOY.d("0E2B21132B191B3F34"), SOY.d("93CAEE9FF3FB9EE8C091EFEF"));
            ArrayList arrayList = new ArrayList();
            if (jSONObject.getString(strD2).equals(SOY.d("1C3B3D13"))) {
                strGroup2 = SOY.d("083D3E02");
            }
            String strM106 = m106(strGroup, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<String> arrayList2 = new ArrayList<>();
            Map<String, String> map = linkedHashMap;
            listFiles(linkedHashMap, arrayList2, strGroup, strM106, strGroup2);
            if (jSONArray.length() > 1) {
                for (int i2 = 1; i2 < jSONObject5.getJSONArray(strD4).length(); i2++) {
                    if (jSONObject5.getJSONArray(strD4).getJSONObject(i2).getString(strD2).equals(SOY.d("1C3D3D121105"))) {
                        listFiles(map, arrayList2, strGroup, strM106, jSONObject5.getJSONArray(strD4).getJSONObject(i2).getString(strD5));
                    }
                }
            }
            for (String str : map.keySet()) {
                Map<String, String> map2 = map;
                String str2 = map2.get(str);
                if (arrayList2.size() > 0) {
                    for (String str3 : arrayList2) {
                        String str4 = str3.split(SOY.d("3A1211"))[0];
                        String strSubstring = str.substring(0, str.lastIndexOf(91));
                        String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf(46));
                        if (str.contains(str4) || str4.contains(strSubstring2)) {
                            str2 = str2 + SOY.d("51") + str3;
                            break;
                        }
                    }
                }
                arrayList.add(str + SOY.d("5E") + str2);
                map = map2;
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(TextUtils.join(strD, arrayList));
                arrayList3.add(TextUtils.join(strD, arrayList));
                String strD6 = SOY.d("0C3D3529041B1B2B0E03061B");
                String strJoin = TextUtils.join(SOY.d("5E7675"), arrayList3);
                jSONObject2 = jSONObject7;
                jSONObject2.put(strD6, strJoin);
                jSONObject2.put(SOY.d("0C3D3529041B1B2B0E10061817"), SOY.d("3522341891F9E5B5C5CD50535E1D21131A9FC7FEB6D6F5"));
            } else {
                jSONObject2 = jSONObject7;
            }
            JSONObject jSONObject8 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            jSONObject8.put(SOY.d("163B2202"), jSONArray2);
            return jSONObject8.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String getDownloadUrl(String str, String str2, String str3) {
        try {
            f146 = true;
            String strM98 = m98(str, str2, str3);
            String strM111 = m111(strM98, str3);
            if (strM98 != null && !strM98.isEmpty()) {
                m99(strM98, str3);
            }
            return strM111;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getSelfContent(List<String> list) {
        String strD = SOY.d("59");
        String strD2 = SOY.d("14333C13");
        String strD3 = SOY.d("0F203D");
        String strD4 = SOY.d("1E373717011B0E0D35041D011F0D3812");
        try {
            String strTrim = list.get(0).trim();
            String strD5 = SOY.d("370BB8EECB9EFDDEB5CCE590E1CA");
            JSONObject jSONObject = new JSONObject();
            if (strTrim.startsWith(SOY.d("01")) && strTrim.endsWith(SOY.d("07")) && strTrim.contains(SOY.d("5827231A"))) {
                jSONObject = new JSONObject(strTrim);
                if (jSONObject.has(strD3)) {
                    strTrim = repl(jSONObject.getString(strD3));
                } else if (jSONObject.has(SOY.d("0F203D05"))) {
                    strTrim = repl(strTrim);
                }
                if (jSONObject.has(strD2)) {
                    strD5 = jSONObject.getString(strD2);
                }
            }
            f112 = false;
            f128 = false;
            m105();
            String strD6 = SOY.d("083D3E02");
            if (strTrim.contains(SOY.d("5536231F021255343E1A1012087D"))) {
                strD6 = strTrim.split(SOY.d("55343E1A1012087D"))[1];
            }
            if (jSONObject.has(strD4)) {
                f126 = jSONObject.getString(strD4);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SOY.d("0C3D35291D13"), list.get(0));
            jSONObject2.put(SOY.d("0C3D35291A161737"), strD5);
            jSONObject2.put(SOY.d("0C3D3529041E19"), f124);
            jSONObject2.put(SOY.d("0C3D352917181426341800"), strTrim);
            jSONObject2.put(SOY.d("0E2B21132B191B3F34"), SOY.d("93CAEE9FF3FB9EE8C091EFEF"));
            ArrayList arrayList = new ArrayList();
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            if (f109.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121).isEmpty()) {
                m113();
            }
            listSelfFiles(linkedHashMap, arrayList2, f126, strD6);
            for (String str : linkedHashMap.keySet()) {
                String str2 = linkedHashMap.get(str);
                if (arrayList2.size() > 0) {
                    for (String str3 : arrayList2) {
                        String str4 = str3.split(SOY.d("3A1211"))[0];
                        String strSubstring = str.substring(0, str.lastIndexOf(91));
                        String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf(46));
                        if (str.contains(str4) || str4.contains(strSubstring2)) {
                            str2 = str2 + SOY.d("06") + str3;
                            break;
                        }
                    }
                }
                arrayList.add(str + SOY.d("5E") + str2);
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(TextUtils.join(strD, arrayList));
                arrayList3.add(TextUtils.join(strD, arrayList));
                jSONObject2.put(SOY.d("0C3D3529041B1B2B0E03061B"), TextUtils.join(SOY.d("5E7675"), arrayList3));
                jSONObject2.put(SOY.d("0C3D3529041B1B2B0E10061817"), SOY.d("93CAEE9FF3FB9FDCCE91E0CC5E76759FECC893D5DD9EC9DB9DF2D0"));
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject3.put(SOY.d("163B2202"), jSONArray);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String getselfDownloadUrl(String str, String str2) {
        String strM95;
        int i = 0;
        try {
            f146 = false;
            if (f109.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121).isEmpty()) {
                m113();
            }
            do {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("1C3B3D132B1E1E"), str);
                jSONObject.put(SOY.d("1E20380011281336"), str2);
                strM95 = m95(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3613003315253F1A1B161E07231A"), jSONObject);
                if (strM95.contains(SOY.d("5827231A564D583A250204"))) {
                    break;
                }
                i++;
            } while (i <= 3);
            return new JSONObject(strM95).getString(SOY.d("0F203D"));
        } catch (Exception unused) {
            return "";
        }
    }

    public String getshareAudioUrl(String str, String str2) {
        try {
            HashMap<String, String> mapM102 = m102();
            mapM102.put(SOY.d("027F221E15051F7F25191F1214"), m106(str2, ""));
            boolean z = f128;
            String strD = SOY.d("1B27251E1B05132830021D1814");
            if (z) {
                mapM102.put(strD, f114);
            } else {
                mapM102.put(strD, f119);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("1C3B3D132B1E1E"), str);
            jSONObject.put(SOY.d("1D37252915021E3B3E29041B1B2B0E1F1A1115"), true);
            jSONObject.put(SOY.d("093A300411281336"), str2);
            return new JSONObject(m114(SOY.d("12262506074D557D30061D591B3E380F01191E2038001159193D3C5902455534381A11581D372529071F1B203429181E14390E121B00143E3E1710280F203D"), jSONObject.toString(), mapM102)).getString(SOY.d("1E3D261818181B360E03061B"));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String hikernetpush(List<String> list) {
        String strD = SOY.d("0F203D");
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.startsWith(SOY.d("01")) && strTrim.endsWith(SOY.d("07")) && strTrim.contains(SOY.d("5827231A"))) {
                JSONObject jSONObject = new JSONObject(strTrim);
                if (jSONObject.has(strD)) {
                    strTrim = repl(jSONObject.getString(strD));
                } else if (jSONObject.has(SOY.d("0F203D05"))) {
                    strTrim = repl(strTrim);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(SOY.d("0C3D35291D13"), list.get(0));
            jSONObject3.put(SOY.d("0C3D35291A161737"), strTrim.contains(SOY.d("552034121D051F31252618160307231A")) ? SOY.d("9CE7E69FECE39CD8C493C5F89DC9E59FE7C9") : SOY.d("9CE7E69FECE39DEFC09FD5C29CD8C493C5F8"));
            jSONObject3.put(SOY.d("0C3D3529041E19"), SOY.d("12262506074D557D361F001F0F307F1B1B12032B7F0E0D0D553A25020404407D7E041500543538021C02182722130614153C25131A0354313E1B5B0F0323634340454E677E3E1D1C1F2003031812553F301F1A580A27221E17180C37235804191D"));
            jSONObject3.put(SOY.d("0E2B21132B191B3F34"), SOY.d("9CE7E69FECE392F5D791E1FB9CD8C493C5F892F5F290EAE7182BB8D0ED9EE1D7B7F5F1"));
            jSONObject3.put(SOY.d("0C3D352917181426341800"), SOY.d("9EEFEE91E0DF92FDE590ECF995EEDD90FEE29FE3DE90E2C793C1EF90FAD29FC2DF9EDBC09CDED890E6DA9CC6EF91E1FB93CFF391EEF393D5DC90E6DA9CDED89FE6D99FDAE690E2C792F5D79FD6E699D2D3"));
            jSONObject3.put(SOY.d("0C3D3529041B1B2B0E10061817"), SOY.d("9CE7E69FECE39CD8C493C5F8"));
            jSONObject3.put(SOY.d("0C3D3529041B1B2B0E03061B"), strTrim);
            jSONArray.put(jSONObject3);
            jSONObject2.put(SOY.d("163B2202"), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0283 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a2 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0308 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x050b A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x056e A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x057a A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x066c A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x068b A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0718 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0204 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0251 A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026a A[Catch: Exception -> 0x073b, TryCatch #0 {Exception -> 0x073b, blocks: (B:3:0x003b, B:6:0x0062, B:12:0x0079, B:14:0x0081, B:16:0x008f, B:18:0x0096, B:20:0x00b2, B:24:0x00f4, B:26:0x0100, B:30:0x0115, B:32:0x011d, B:34:0x0129, B:36:0x0138, B:38:0x013e, B:40:0x014a, B:42:0x014f, B:44:0x0155, B:46:0x0161, B:48:0x0166, B:50:0x0172, B:52:0x017e, B:54:0x0183, B:56:0x0189, B:64:0x01aa, B:66:0x01b6, B:68:0x01c3, B:70:0x01cf, B:72:0x01db, B:74:0x01e7, B:76:0x01f8, B:78:0x0204, B:80:0x0210, B:84:0x0220, B:86:0x024b, B:88:0x0251, B:90:0x025b, B:92:0x0262, B:91:0x0260, B:93:0x0264, B:95:0x026a, B:97:0x0274, B:99:0x027b, B:98:0x0279, B:100:0x027d, B:102:0x0283, B:104:0x028d, B:106:0x0294, B:105:0x0292, B:107:0x0296, B:109:0x02a2, B:111:0x02b0, B:113:0x02b8, B:114:0x02e7, B:115:0x02ea, B:117:0x02f6, B:119:0x0302, B:121:0x0308, B:122:0x030e, B:125:0x0346, B:127:0x0352, B:129:0x035d, B:130:0x0365, B:132:0x036b, B:134:0x0375, B:136:0x0385, B:138:0x038d, B:141:0x0396, B:144:0x039f, B:146:0x03a5, B:148:0x03ae, B:151:0x03c2, B:153:0x0400, B:155:0x0406, B:157:0x0410, B:161:0x042e, B:164:0x0467, B:163:0x0448, B:152:0x03e7, B:147:0x03aa, B:142:0x0399, B:189:0x04fb, B:191:0x0503, B:240:0x0650, B:242:0x0658, B:251:0x06ac, B:253:0x0718, B:254:0x071e, B:244:0x0660, B:246:0x0668, B:248:0x066c, B:249:0x068b, B:166:0x0477, B:168:0x0485, B:170:0x0493, B:172:0x04a0, B:174:0x04a8, B:177:0x04b1, B:178:0x04b4, B:179:0x04b7, B:181:0x04bd, B:183:0x04c8, B:185:0x04d0, B:187:0x04d6, B:188:0x04ec, B:182:0x04c4, B:192:0x050b, B:194:0x051a, B:196:0x0526, B:198:0x0532, B:200:0x0538, B:202:0x0545, B:204:0x054d, B:207:0x0556, B:209:0x055c, B:211:0x0562, B:212:0x0567, B:208:0x0559, B:214:0x056e, B:216:0x057a, B:218:0x05b0, B:220:0x05bc, B:222:0x05c4, B:225:0x05cd, B:226:0x05d0, B:227:0x05d3, B:229:0x05d9, B:232:0x05e4, B:234:0x05e7, B:238:0x0638, B:237:0x0626, B:239:0x063b, B:230:0x05de, B:60:0x0198, B:62:0x019e, B:63:0x01a3, B:35:0x0136, B:31:0x0118, B:22:0x00c4, B:17:0x0094, B:8:0x006d, B:10:0x0073), top: B:259:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String hikerpush(java.util.List<java.lang.String> r29) {
        /*
            Method dump skipped, instruction units count: 1856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xc.hikerpush(java.util.List):java.lang.String");
    }

    public void init(Context context, String str) {
        super.init(context, str);
        f109 = context.getSharedPreferences(Init.context().getPackageName() + SOY.d("25222313121208373F151104"), 0);
        if (str.startsWith(SOY.d("12262506"))) {
            f115 = C0295.m1089(str, m102());
        } else {
            f115 = str;
        }
    }

    public boolean isVideoFormat(String str) {
        String str2 = f133;
        String strD = SOY.d("95EED799C8F1");
        String strD2 = SOY.d("5C");
        String strReplaceAll = str2.replaceAll(strD, strD2);
        String strReplaceAll2 = f134.replaceAll(strD, strD2);
        String lowerCase = strReplaceAll.toLowerCase();
        String strD3 = SOY.d("59");
        String[] strArrSplit = lowerCase.split(strD3);
        String[] strArrSplit2 = strReplaceAll2.toLowerCase().split(strD3);
        String lowerCase2 = str.toLowerCase();
        if ((lowerCase2.contains(SOY.d("473A250204")) || lowerCase2.contains(SOY.d("543A251B18"))) && !checkstring(lowerCase2)) {
            return false;
        }
        for (String str3 : strArrSplit) {
            if (lowerCase2.contains(str3)) {
                for (String str4 : strArrSplit2) {
                    if (lowerCase2.contains(str4) && !checkstring(lowerCase2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0216 A[Catch: Exception -> 0x02c4, TryCatch #1 {Exception -> 0x02c4, blocks: (B:3:0x0022, B:7:0x00bc, B:10:0x00c4, B:13:0x00dd, B:14:0x00ed, B:16:0x00f3, B:18:0x0111, B:41:0x025e, B:19:0x0127, B:22:0x014d, B:27:0x0165, B:28:0x01cb, B:30:0x01df, B:32:0x01eb, B:34:0x01f7, B:36:0x0203, B:40:0x0216, B:42:0x0270, B:43:0x0299, B:44:0x02a3, B:46:0x02a9, B:52:0x02c0, B:48:0x02ba), top: B:59:0x0022, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void listFiles(java.util.Map<java.lang.String, java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.xc.listFiles(java.util.Map, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void listSelfFiles(Map<String, String> map, ArrayList<String> arrayList, String str, String str2) {
        String str3;
        String strD = SOY.d("3A1211");
        String strD2 = SOY.d("193325131318082B");
        String strD3 = SOY.d("1C3B3D132B1E1E");
        String strD4 = SOY.d("14333C13");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("1E20380011281336"), str);
            jSONObject.put(SOY.d("0A3323131A032534381A11281336"), str2);
            jSONObject.put(SOY.d("163B3C1F00"), 100);
            int i = 1;
            jSONObject.put(SOY.d("1B3E3D"), true);
            jSONObject.put(SOY.d("0F203D29110F0A3B23132B041F31"), 14400);
            jSONObject.put(SOY.d("133F301111280E3A241B16191B3B3D2904051531340507"), SOY.d("133F301111580837221F0E1256250E47424755343E0419160E7E3B061110"));
            jSONObject.put(SOY.d("133F301111280F203D2904051531340507"), SOY.d("133F301111580837221F0E1256250E474D454A7D3719061A1B267D1C04121D"));
            jSONObject.put(SOY.d("0C3B35131B280E3A241B16191B3B3D2904051531340507"), SOY.d("0C3B35131B58093C3006071F15267D022B464A62615A12281022365A1505253324021B5B0D0D624644"));
            jSONObject.put(SOY.d("1C3B341A1004"), SOY.d("50"));
            jSONObject.put(SOY.d("152035130628182B"), strD4);
            jSONObject.put(SOY.d("1520351306281E3B23131703133D3F"), SOY.d("3B0112"));
            String string = "";
            int i2 = 1;
            while (i2 <= 50) {
                if (i2 > i) {
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                }
                jSONObject.put(SOY.d("1733231D1105"), string);
                String strM95 = m95(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D3D1F0703"), jSONObject);
                if (!strM95.contains(strD3)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(strM95);
                JSONArray jSONArray = jSONObject2.getJSONArray(SOY.d("1326341B07"));
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    if (!jSONObject3.getString(SOY.d("0E2B2113")).equals(SOY.d("1C3D3D121105"))) {
                        boolean zEquals = jSONObject3.getString(strD2).equals(SOY.d("0C3B35131B"));
                        String strD5 = SOY.d("5E");
                        String strD6 = SOY.d("59");
                        String strD7 = SOY.d("25");
                        if (zEquals || jSONObject3.getString(strD2).equals(SOY.d("1B27351F1B"))) {
                            map.put(jSONObject3.getString(strD4).replace(strD6, strD7).replace(strD5, strD7) + SOY.d("5A09") + getSize(jSONObject3.getDouble(SOY.d("093B2B13"))) + SOY.d("27"), jSONObject3.getString(strD2) + SOY.d("06") + jSONObject3.getString(strD3));
                        }
                        String lowerCase = jSONObject3.getString(strD4).toLowerCase();
                        if (lowerCase.endsWith(SOY.d("54212302")) || lowerCase.endsWith(SOY.d("54332205")) || lowerCase.endsWith(SOY.d("5421251A")) || lowerCase.endsWith(SOY.d("5426251B18")) || lowerCase.endsWith(SOY.d("54213215"))) {
                            String string2 = jSONObject3.getString(strD4);
                            str3 = strD2;
                            arrayList.add(string2.substring(0, string2.lastIndexOf(SOY.d("54"))).replace(strD6, strD7).replace(strD5, strD7) + strD + jSONObject3.getString(SOY.d("1C3B3D132B1202263418071E153C")) + strD + jSONObject3.getString(strD3));
                        }
                        i3++;
                        strD2 = str3;
                    }
                    str3 = strD2;
                    i3++;
                    strD2 = str3;
                }
                String str4 = strD2;
                string = jSONObject2.getString(SOY.d("143729022B1A1B203A1306"));
                i2++;
                strD2 = str4;
                i = 1;
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public boolean manualVideoCheck() {
        String str = f130;
        return str.equals(SOY.d("4B")) || str.equals(SOY.d("9CCAFE")) || str.equalsIgnoreCase(SOY.d("0E202413"));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4;
        String str5;
        SharedPreferences sharedPreferences;
        String strD;
        String downloadUrl;
        String str6;
        SharedPreferences sharedPreferences2;
        String strD2;
        String string;
        String str7;
        String str8;
        String str9;
        String str10 = str2;
        String strD3 = SOY.d("092733021D031637");
        String strD4 = SOY.d("102A");
        try {
            boolean zStartsWith = str10.startsWith(SOY.d("1C26214C5B58"));
            String strD5 = SOY.d("0A3E300F210516");
            String strD6 = SOY.d("0F203D");
            String strD7 = SOY.d("0A33230511");
            if (zStartsWith && str10.contains(SOY.d("1D303D5845464E21"))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(strD7, 0);
                jSONObject.put(strD5, "");
                jSONObject.put(strD6, SOY.d("0E2433190C5A02356B") + str10);
                return jSONObject.toString();
            }
            if (!str.equals(strD4) && !str.equals(SOY.d("92F5F290EAE7"))) {
                boolean zEquals = str.equals(SOY.d("9FC5D490FAD5"));
                String strD8 = SOY.d("552034121D051F31252618160307231A");
                if (zEquals) {
                    String strM1068 = ((str10.contains(SOY.d("0C3B21581211002B")) || str10.contains(SOY.d("0C3B2158180D")) || str10.contains(SOY.d("12367F1A0E")) || str10.contains(SOY.d("09273E181D0D03"))) && str10.contains(SOY.d("55213917061255")) && !str10.contains(strD8)) ? C0287.m1068(str2) : str10;
                    JSONObject jSONObject2 = new JSONObject();
                    if (strM1068.contains(strD8) || strM1068.contains(SOY.d("133C35130C591761244E"))) {
                        jSONObject2.put(strD7, 0);
                    } else {
                        jSONObject2.put(strD7, 1);
                    }
                    jSONObject2.put(strD5, "");
                    jSONObject2.put(strD6, strM1068);
                    return jSONObject2.toString();
                }
                boolean zEquals2 = str.equals(SOY.d("9CE7E69FECE39CD8C493C5F8"));
                String strD9 = SOY.d("410E2A");
                String strD10 = SOY.d("09273302");
                String strD11 = SOY.d("123730121105");
                if (zEquals2) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (str10.contains(strD8)) {
                        HashMap map = new HashMap();
                        C0295.m1092(str10, null, map);
                        jSONObject3.put(strD6, C0295.m1084(map));
                    } else {
                        JSONObject jSONObject4 = new JSONObject(C0295.m1089(str10 + SOY.d("55223D170D22083E6E131A1F1B3C32134903082734"), null));
                        if (jSONObject4.has(SOY.d("12373012110509"))) {
                            jSONObject3.put(strD11, jSONObject4.getJSONObject(SOY.d("12373012110509")).toString());
                        }
                        if (jSONObject4.has(strD3) && jSONObject4.getString(strD3).startsWith(SOY.d("12262506"))) {
                            jSONObject3.put(strD10, jSONObject4.getString(strD3).split(strD9)[0]);
                        }
                        jSONObject3.put(strD6, jSONObject4.getString(strD6));
                    }
                    jSONObject3.put(strD7, 0);
                    jSONObject3.put(strD5, "");
                    return jSONObject3.toString();
                }
                if (!str.equals(SOY.d("173336181103")) && !str.equals(SOY.d("303B3018241E1B3C")) && !str.equals(SOY.d("92F5D79FD6E6"))) {
                    boolean zContains = str.contains(SOY.d("93CAEE9FF3FB9FDCCE91E0CC"));
                    String strD12 = SOY.d("4A");
                    String strD13 = SOY.d("5A3A25020404407D7E01030054333D1F0D021436231F021254313E1B5B");
                    String strD14 = SOY.d("28373713061208");
                    String strD15 = SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594D4354627F4242474C7C644254241B3430041D584F6166584741");
                    String strD16 = SOY.d("2F21340459361D373F02");
                    String strD17 = SOY.d("262E");
                    String strD18 = SOY.d("3A1211");
                    if (zContains) {
                        m105();
                        JSONObject jSONObject5 = new JSONObject();
                        String str11 = getselfDownloadUrl(str10.split(strD17)[1], f126);
                        if (str10.contains(strD18)) {
                            String str12 = getselfDownloadUrl(str10.split(strD18)[2], f126);
                            if (!TextUtils.isEmpty(str12)) {
                                jSONObject5.put(strD10, str12);
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put(strD16, strD15);
                        jSONObject6.put(strD14, strD13);
                        jSONObject5.put(strD7, strD12);
                        jSONObject5.put(strD5, "");
                        jSONObject5.put(strD6, str11);
                        jSONObject5.put(strD11, jSONObject6.toString());
                        return jSONObject5.toString();
                    }
                    boolean zContains2 = str.contains(SOY.d("93CAEE9FF3FB92EFFD91D4F6"));
                    String strD19 = SOY.d("1B27351F1B");
                    if (zContains2) {
                        m105();
                        JSONObject jSONObject7 = new JSONObject();
                        String[] strArrSplit = str10.split(strD17);
                        if (strArrSplit[0].equals(strD19)) {
                            str9 = getselfDownloadUrl(strArrSplit[1], f126);
                        } else {
                            str9 = Proxy.AnonymousClass3.localProxyUrl() + SOY.d("45363E4B0402093A77020D071F6F3E06111909373D1019440F6A77101D1B1F0D381249") + strArrSplit[1] + SOY.d("5C36231F0212253B354B") + f126 + SOY.d("5C36341A1111133E344B12161637");
                            if (str10.contains(strD18)) {
                                String str13 = getselfDownloadUrl(str10.split(strD18)[2], f126);
                                if (!TextUtils.isEmpty(str13)) {
                                    jSONObject7.put(strD10, str13);
                                }
                            }
                        }
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put(strD16, strD15);
                        jSONObject8.put(strD14, strD13);
                        jSONObject7.put(strD7, strD12);
                        jSONObject7.put(strD5, "");
                        jSONObject7.put(strD6, str9);
                        jSONObject7.put(strD11, jSONObject8.toString());
                        return jSONObject7.toString();
                    }
                    boolean zContains3 = str.contains(SOY.d("3522341891F9E5B5C5CD"));
                    String strD20 = SOY.d("5C34381A112813366C");
                    if (!zContains3 && !str.contains(SOY.d("352234189CCAD6B5F1F7"))) {
                        if (str.contains(SOY.d("3B3E389EC9DB9DF2D0"))) {
                            m105();
                            JSONObject jSONObject9 = new JSONObject();
                            if (f112) {
                                String[] strArrSplit2 = str10.split(strD17);
                                if (strArrSplit2[0].equals(strD19)) {
                                    str8 = getshareAudioUrl(strArrSplit2[1], f113);
                                } else {
                                    String str14 = Proxy.AnonymousClass3.localProxyUrl() + SOY.d("45363E4B0402093A77020D071F6F3C45014F5C2139170612253B354B") + f113 + strD20 + strArrSplit2[1];
                                    if (str10.contains(strD18)) {
                                        String strDownalisub = downalisub(str10.split(strD18)[2], f113);
                                        if (!TextUtils.isEmpty(strDownalisub)) {
                                            jSONObject9.put(strD10, strDownalisub);
                                        }
                                    }
                                    str8 = str14;
                                }
                            } else {
                                String[] strArrSplit3 = str10.split(SOY.d("2679"));
                                if (!strArrSplit3[3].equals(strD19)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(Proxy.AnonymousClass3.localProxyUrl());
                                    sb.append(SOY.d("45363E4B0402093A77020D071F6F3C45014F5C2139170612253B354B"));
                                    str7 = strD16;
                                    sb.append(strArrSplit3[0]);
                                    sb.append(strD20);
                                    sb.append(strArrSplit3[2]);
                                    String string2 = sb.toString();
                                    if (str10.contains(strD18)) {
                                        String strDownalisub2 = downalisub(str10.split(strD18)[2], strArrSplit3[0]);
                                        if (!TextUtils.isEmpty(strDownalisub2)) {
                                            jSONObject9.put(strD10, strDownalisub2);
                                        }
                                    }
                                    str8 = string2;
                                    jSONObject9.put(strD7, strD12);
                                    jSONObject9.put(strD5, "");
                                    jSONObject9.put(strD6, str8);
                                    JSONObject jSONObject10 = new JSONObject();
                                    jSONObject10.put(str7, strD15);
                                    jSONObject10.put(strD14, strD13);
                                    jSONObject9.put(strD11, jSONObject10.toString());
                                    return jSONObject9.toString();
                                }
                                str8 = getshareAudioUrl(strArrSplit3[2], strArrSplit3[0]);
                            }
                            str7 = strD16;
                            jSONObject9.put(strD7, strD12);
                            jSONObject9.put(strD5, "");
                            jSONObject9.put(strD6, str8);
                            JSONObject jSONObject102 = new JSONObject();
                            jSONObject102.put(str7, strD15);
                            jSONObject102.put(strD14, strD13);
                            jSONObject9.put(strD11, jSONObject102.toString());
                            return jSONObject9.toString();
                        }
                        JSONObject jSONObject11 = new JSONObject();
                        if (!str2.trim().startsWith(SOY.d("06"))) {
                            str10 = SOY.d("06") + str2.trim();
                        }
                        String[] strArrSplit4 = str10.trim().split(strD17);
                        String strM10682 = strArrSplit4[1].split(strD9)[0];
                        if (strArrSplit4[1].contains(SOY.d("4129")) && strArrSplit4[1].contains(SOY.d("3A")) && strArrSplit4.length == 2) {
                            JSONObject jSONObject12 = new JSONObject();
                            String[] strArrSplit5 = strArrSplit4[1].split(strD9)[1].split(SOY.d("262F"))[0].split(SOY.d("5C74"));
                            for (int i = 0; i < strArrSplit5.length; i++) {
                                jSONObject12.put(strArrSplit5[i].split(SOY.d("3A"))[0], strArrSplit5[i].split(SOY.d("3A"))[1]);
                            }
                            jSONObject11.put(strD11, jSONObject12.toString());
                        } else if (strArrSplit4.length == 3) {
                            JSONObject jSONObject13 = new JSONObject();
                            if (strArrSplit4[2].startsWith(SOY.d("01")) && strArrSplit4[2].endsWith(SOY.d("07"))) {
                                jSONObject11.put(strD11, new JSONObject(strArrSplit4[2]).toString());
                            } else {
                                String str15 = strArrSplit4[2];
                                String[] strArrSplit6 = str15.split(SOY.d("5C"));
                                if (strArrSplit6.length > 0) {
                                    int length = strArrSplit6.length;
                                    int i2 = 0;
                                    while (i2 < length) {
                                        String[] strArr = strArrSplit6;
                                        String[] strArrSplit7 = strArrSplit6[i2].split(SOY.d("47"));
                                        int i3 = length;
                                        if (strArrSplit7.length == 2) {
                                            jSONObject13.put(strArrSplit7[0], URLDecoder.decode(strArrSplit7[1], SOY.d("2F06175B4C")));
                                        }
                                        i2++;
                                        strArrSplit6 = strArr;
                                        length = i3;
                                    }
                                }
                                if (!TextUtils.isEmpty(str15)) {
                                    jSONObject11.put(strD11, jSONObject13.toString());
                                }
                            }
                        } else if (f131.startsWith(SOY.d("01")) && f131.endsWith(SOY.d("07"))) {
                            jSONObject11.put(strD11, new JSONObject(f131).toString());
                        }
                        if ((strM10682.contains(SOY.d("0C3B21581211002B")) || strM10682.contains(SOY.d("0C3B2158180D")) || strM10682.contains(SOY.d("12367F1A0E")) || strM10682.contains(SOY.d("09273E181D0D03"))) && strM10682.contains(SOY.d("55213917061255"))) {
                            strM10682 = C0287.m1068(strM10682);
                        }
                        if (strM10682.startsWith(SOY.d("1C26214C5B58")) && strM10682.contains(SOY.d("1D303D5845464E21"))) {
                            strM10682 = SOY.d("0E2433190C5A02356B") + strM10682;
                        }
                        if (C0284.m1044(strM10682) || (strM10682.contains(SOY.d("0A362258011454313F")) && strM10682.contains(SOY.d("1521225B00051B34371F17")))) {
                            if (!TextUtils.isEmpty(f132) && f132.startsWith(SOY.d("12262506"))) {
                                jSONObject11.put(strD10, f132.split(strD9)[0]);
                            }
                            jSONObject11.put(strD7, 0);
                        } else if (!C0284.m1045(strM10682) || strM10682.contains(SOY.d("473A250204"))) {
                            jSONObject11.put(strD7, 1);
                        } else {
                            jSONObject11.put(strD7, 1);
                            jSONObject11.put(strD4, SOY.d("4B"));
                        }
                        jSONObject11.put(strD5, "");
                        jSONObject11.put(strD6, strM10682);
                        return jSONObject11.toString();
                    }
                    m105();
                    if (f125.isEmpty()) {
                        if (f128) {
                            str4 = strD5;
                            str3 = strD12;
                            str5 = strD7;
                            string = f109.getString(SOY.d("2A27331A1D143E373717101E1E"), f125);
                        } else {
                            str3 = strD12;
                            str4 = strD5;
                            str5 = strD7;
                            string = f109.getString(SOY.d("2A20380015031F16341015131336"), f125);
                        }
                        f125 = string;
                    } else {
                        str3 = strD12;
                        str4 = strD5;
                        str5 = strD7;
                    }
                    m115();
                    if (TextUtils.isEmpty(f127) || f127.equals(SOY.d("14273D1A"))) {
                        if (f128) {
                            sharedPreferences = f109;
                            strD = SOY.d("2A27331A1D143E373717101E1E");
                        } else {
                            sharedPreferences = f109;
                            strD = SOY.d("2A20380015031F16341015131336");
                        }
                        f125 = sharedPreferences.getString(strD, f125);
                    } else {
                        if (f128) {
                            sharedPreferences2 = f109;
                            strD2 = SOY.d("2A27331A1D14283722121D13");
                        } else {
                            sharedPreferences2 = f109;
                            strD2 = SOY.d("2A20380015031F003405101E1E");
                        }
                        f125 = sharedPreferences2.getString(strD2, f127);
                    }
                    JSONObject jSONObject14 = new JSONObject();
                    if (f112) {
                        String[] strArrSplit8 = str10.split(strD17);
                        if (strArrSplit8[0].equals(strD19)) {
                            str6 = getshareAudioUrl(strArrSplit8[1], f113);
                        } else {
                            f118 = m106(f113, "");
                            downloadUrl = str.contains(SOY.d("352234189CCAD6B5F1F7")) ? Proxy.AnonymousClass3.localProxyUrl() + SOY.d("45363E4B0402093A77020D071F6F3E0611190A27331B47024274221E15051F0D381249") + f113 + strD20 + strArrSplit8[1] + SOY.d("5C36231F0212253B354B") + f125 : getDownloadUrl(strArrSplit8[1], f113, f125);
                            if (str10.contains(strD18)) {
                                String strDownalisub3 = downalisub(str10.split(strD18)[2], f113);
                                if (!TextUtils.isEmpty(strDownalisub3)) {
                                    jSONObject14.put(strD10, strDownalisub3);
                                }
                            }
                            str6 = downloadUrl;
                        }
                    } else {
                        String[] strArrSplit9 = str10.split(SOY.d("2679"));
                        f118 = m106(strArrSplit9[0], "");
                        if (strArrSplit9[3].equals(strD19)) {
                            str6 = getshareAudioUrl(strArrSplit9[2], strArrSplit9[0]);
                        } else {
                            downloadUrl = str.contains(SOY.d("352234189CCAD6B5F1F7")) ? Proxy.AnonymousClass3.localProxyUrl() + SOY.d("45363E4B0402093A77020D071F6F3E0611190A27331B47024274221E15051F0D381249") + strArrSplit9[0] + strD20 + strArrSplit9[2] + SOY.d("5C36231F0212253B354B") + f125 : getDownloadUrl(strArrSplit9[2], strArrSplit9[0], f125);
                            if (str10.contains(strD18)) {
                                String strDownalisub4 = downalisub(str10.split(strD18)[2], strArrSplit9[0]);
                                if (!TextUtils.isEmpty(strDownalisub4)) {
                                    jSONObject14.put(strD10, strDownalisub4);
                                }
                            }
                            str6 = downloadUrl;
                        }
                    }
                    JSONObject jSONObject15 = new JSONObject();
                    jSONObject15.put(strD16, strD15);
                    jSONObject15.put(strD14, strD13);
                    jSONObject14.put(str5, str3);
                    jSONObject14.put(str4, "");
                    jSONObject14.put(strD6, str6);
                    jSONObject14.put(strD11, jSONObject15.toString());
                    return jSONObject14.toString();
                }
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put(strD7, 0);
                jSONObject16.put(strD5, "");
                jSONObject16.put(strD6, str10);
                return jSONObject16.toString();
            }
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put(strD7, 1);
            jSONObject17.put(strD4, SOY.d("4B"));
            jSONObject17.put(strD6, str10);
            return jSONObject17.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String strTrim = str.trim();
            if (!f141.matcher(strTrim).find()) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SOY.d("0C3D35291D13"), strTrim);
            jSONObject.put(SOY.d("0C3D35291A161737"), strTrim);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SOY.d("163B2202"), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static String getPreviewUrl(String str, String str2, String str3, String str4, boolean z) {
        String strM95;
        String str5;
        String strD = SOY.d("70");
        String strD2 = SOY.d("55");
        try {
            f146 = z;
            if (f128) {
                if (f109.getString(SOY.d("2A27331A1D143B31321307042E3D3A131A380A373F"), f117).isEmpty()) {
                    m113();
                }
            } else if (f109.getString(SOY.d("2A20380015031F133215110409063E1D111935223418"), f121).isEmpty()) {
                m113();
            }
            int i = 0;
            int i2 = 0;
            do {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SOY.d("1C3B3D132B1E1E"), str);
                jSONObject.put(SOY.d("1E20380011281336"), str2);
                jSONObject.put(SOY.d("193325131318082B"), SOY.d("163B27132B0308333F0517181E3B3F11"));
                jSONObject.put(SOY.d("0F203D29110F0A3B23132B041F31"), SOY.d("4B66654644"));
                strM95 = m95(SOY.d("12262506074D557D3E06111954333D1F0D021436231F021254313E1B5B161E20380011580C637F465B180A373F301D1B1F7D361300211336341924051F24381303271633283F1A1115"), jSONObject);
                if (strM95.contains(SOY.d("5827231A564D583A250204"))) {
                    break;
                }
                i2++;
            } while (i2 <= 3);
            String strM104 = m104(new JSONObject(strM95).getJSONObject(SOY.d("0C3B35131B280A2034001D120D0D211A150E253B3F101B")).getJSONArray(SOY.d("163B27132B0308333F0517181E3B3F112B031B213A29181E0926")));
            String strM1089 = C0295.m1089(strM104, m102());
            String str6 = strM104.substring(0, strM104.lastIndexOf(strD2)) + strD2;
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            String[] strArrSplit = strM1089.split(strD);
            int i3 = 0;
            while (i < strArrSplit.length) {
                String string = strArrSplit[i];
                if (string.contains(SOY.d("027F3E05075A1F2A211F061209"))) {
                    map.put("" + i3, str6 + string);
                    boolean z2 = f146;
                    String strD3 = SOY.d("5C3F34121D16253B354B");
                    String strD4 = SOY.d("5C34381A112813366C");
                    String strD5 = SOY.d("45363E4B0402093A77020D071F6F3E0611191737351F15511E203800112813366C");
                    if (z2) {
                        string = Proxy.AnonymousClass3.localProxyUrl() + strD5 + str2 + strD4 + str + SOY.d("5C2139170612253B354B") + str4 + SOY.d("5C3D23111D191C3B3D132B1E1E6F") + str3 + strD3 + i3 + SOY.d("5C36341A1111133E344B00050F37");
                        str5 = str6;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        str5 = str6;
                        sb.append(Proxy.AnonymousClass3.localProxyUrl());
                        sb.append(strD5);
                        sb.append(str2);
                        sb.append(strD4);
                        sb.append(str);
                        sb.append(strD3);
                        sb.append(i3);
                        sb.append(SOY.d("5C36341A1111133E344B1216162134"));
                        string = sb.toString();
                    }
                    i3++;
                } else {
                    str5 = str6;
                }
                arrayList.add(string);
                i++;
                str6 = str5;
            }
            if (f146) {
                f139.put(str3, map);
            } else {
                f139.put(str, map);
            }
            return TextUtils.join(strD, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
