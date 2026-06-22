package com.github.catvod.spider.merge.I0;

import android.R;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.l.C1290c;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class GeneralUtils {
    public static final List<String> a;
    private static final Pattern b;
    private static final Pattern c;

    static {
        Charset.forName("UTF-8");
        Charset.forName("iso-8859-1");
        a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        b = Pattern.compile("^(.+)[sS]\\d{1,2}[eE]?\\d?$");
        c = Pattern.compile("^(.+EP)\\d?$");
    }

    public static String A(Map<String, List<String>> map, String str) {
        int iIndexOf;
        int iIndexOf2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && !str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty() && (iIndexOf2 = strTrim.indexOf(61)) > 0) {
                    linkedHashMap.put(strTrim.substring(0, iIndexOf2), iIndexOf2 < strTrim.length() + (-1) ? strTrim.substring(iIndexOf2 + 1) : "");
                }
            }
        }
        if (map.containsKey("Set-Cookie") || map.containsKey("set-cookie")) {
            List<String> list = map.get("Set-Cookie");
            if (list == null) {
                list = map.get("set-cookie");
            }
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String strTrim2 = it.next().split(";")[0].trim();
                    if (!strTrim2.isEmpty() && (iIndexOf = strTrim2.indexOf(61)) > 0) {
                        linkedHashMap.put(strTrim2.substring(0, iIndexOf), iIndexOf < strTrim2.length() + (-1) ? strTrim2.substring(iIndexOf + 1) : "");
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    public static String B(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    public static void a(WebViewClient webViewClient, HashMap map, String str) {
        WebView webView = new WebView(Init.context());
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36 Edg/120.0.0.0");
        e(webView, new ViewGroup.LayoutParams(0, 0));
        webView.setWebViewClient(webViewClient);
        if (map.containsKey("cookie")) {
            String str2 = (String) map.get("cookie");
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.removeAllCookies(null);
            }
            for (String str3 : str2.split(";\\s*")) {
                if (!str3.trim().isEmpty()) {
                    cookieManager.setCookie(str, str3.trim());
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.setAcceptThirdPartyCookies(webView, true);
                cookieManager.flush();
            }
        }
        webView.loadUrl(str);
    }

    public static String c(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(String str, Charset charset) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
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

    public static void e(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            ((ViewGroup) Init.getActivity().getWindow().getDecorView().findViewById(R.id.content)).addView(view, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int f(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static String g(String str) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = "PVGDwmcvfs1uV3d1".getBytes();
        byte[] bArr = new byte[16];
        com.github.catvod.spider.merge.V0.a aVar = new com.github.catvod.spider.merge.V0.a(new com.github.catvod.spider.merge.U0.a(new com.github.catvod.spider.merge.T0.a()));
        aVar.e(true, new com.github.catvod.spider.merge.W0.b(new com.github.catvod.spider.merge.W0.a(bytes2), bArr));
        byte[] bArr2 = new byte[aVar.d(bytes.length)];
        int iF = aVar.f(bytes, 0, bytes.length, bArr2, 0);
        try {
            int iC = iF + aVar.c(bArr2, iF);
            byte[] bArr3 = new byte[iC + 16];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, iC);
            return new String(com.github.catvod.spider.merge.X0.a.b(bArr3));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String h(List<String> list) {
        int size = list.size();
        if (size > 1) {
            String strSubstring = list.get(0);
            for (int i = 1; i < size; i++) {
                int i2 = 0;
                while (i2 < strSubstring.length() && i2 < list.get(i).length() && strSubstring.charAt(i2) == list.get(i).charAt(i2)) {
                    i2++;
                }
                strSubstring = list.get(i).substring(0, i2);
            }
            Matcher matcher = b.matcher(strSubstring);
            if (!matcher.matches()) {
                matcher = c.matcher(strSubstring);
                if (!matcher.matches()) {
                    if (!"《".equals(strSubstring)) {
                        return strSubstring;
                    }
                }
            }
            return matcher.group(1);
        }
        return "";
    }

    public static String i(String str) {
        HashMap map = new HashMap();
        if (str != null && !str.trim().isEmpty()) {
            Matcher matcher = Pattern.compile("([^=;]+)=([^;]*)").matcher(str);
            while (matcher.find()) {
                String strTrim = matcher.group(1).trim();
                String strTrim2 = matcher.group(2).trim();
                if (!strTrim.isEmpty()) {
                    map.put(strTrim, strTrim2);
                }
            }
        }
        return (String) map.get("__pus");
    }

    public static String j(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InputStream k(String str) {
        InputStream inputStream = null;
        inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Referer", str);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                inputStream = inputStream2;
                str = inputStream2;
            } else {
                SpiderDebug.log("Failed to download file. ServerStart returned HTTP response code: " + responseCode);
                str = str;
            }
        } catch (Exception e) {
            e.printStackTrace();
            w("Failed to download " + str + ": " + e.getMessage());
        }
        return inputStream;
    }

    public static String l() {
        try {
            int ipAddress = ((WifiManager) Init.context().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            if (ipAddress != 0) {
                return Formatter.formatIpAddress(ipAddress);
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(String str) {
        if (str.endsWith(".mp4")) {
            return "video/mp4";
        }
        if (str.endsWith(".webm")) {
            return "video/webm";
        }
        if (str.endsWith(".avi")) {
            return "video/x-msvideo";
        }
        if (str.endsWith(".wmv")) {
            return "video/x-ms-wmv";
        }
        if (str.endsWith(".flv")) {
            return "video/x-flv";
        }
        if (str.endsWith(".mov")) {
            return "video/quicktime";
        }
        if (str.endsWith(".mkv")) {
            return "video/x-matroska";
        }
        if (str.endsWith(".mpeg")) {
            return "video/mpeg";
        }
        if (str.endsWith(".3gp")) {
            return "video/3gpp";
        }
        if (str.endsWith(".ts")) {
            return "video/MP2T";
        }
        if (str.endsWith(".mp3")) {
            return "audio/mp3";
        }
        if (str.endsWith(".wav")) {
            return "audio/wav";
        }
        if (str.endsWith(".aac")) {
            return "audio/aac";
        }
        if (str.endsWith(".iso")) {
            return "video/iso";
        }
        if (str.endsWith(".m2ts")) {
            return "video/m2ts";
        }
        if (str.endsWith(".mpg")) {
            return "video/mpg";
        }
        return null;
    }

    public static String n(double d) {
        return d == 0.0d ? "" : d > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB") : d > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB") : d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (!TextUtils.isEmpty(cookie)) {
            return cookie;
        }
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (TextUtils.isEmpty(host)) {
                return "";
            }
            String cookie2 = cookieManager.getCookie(uri.getScheme() + "://" + host + "/");
            return cookie2 == null ? "" : cookie2;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static HashMap<String, String> p(final String str, final HashMap<String, String> map) {
        HashMap<String, String> map2 = new HashMap<>();
        final k kVar = new k(map2);
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.i0.i
            @Override // java.lang.Runnable
            public final void run() {
                m.a(kVar, map, str);
            }
        });
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 30000;
        while (!map2.containsKey("_done") && SystemClock.elapsedRealtime() < jElapsedRealtime) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        map2.remove("_done");
        if (!map2.containsKey("cookies")) {
            map2.put("cookies", o(str));
        }
        if (!map2.containsKey("html")) {
            map2.put("html", "");
        }
        return map2;
    }

    public static boolean q() {
        MediaCodecInfo[] codecInfos = new MediaCodecInfo[0];
        if (Build.VERSION.SDK_INT >= 21) {
            codecInfos = new MediaCodecList(1).getCodecInfos();
        }
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    arrayList.add(str + "\n");
                    if (str.equalsIgnoreCase("video/x-vnd.on2.vp8") || str.equalsIgnoreCase("video/x-vnd.on2.vp9") || str.equalsIgnoreCase("video/av01")) {
                        return true;
                    }
                }
            }
        }
        com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("codecs.txt"), arrayList.toString());
        return false;
    }

    public static boolean r(String str) {
        return str.equals("srt") || str.equals("ass") || str.equals("ssa");
    }

    public static boolean s(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return f.a.matcher(str).find();
    }

    public static boolean t(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject u(String str, String str2) throws JSONException {
        String str3;
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("url");
        if (string.startsWith("//")) {
            string = C1290c.a("https:", string);
        }
        if (!string.startsWith("http")) {
            return null;
        }
        if (string.equals(str) && (t(string) || !s(string))) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString("user-agent", "");
        if (strOptString.trim().length() > 0) {
            jSONObject2.put("User-Agent", strOptString);
        }
        String strOptString2 = jSONObject.optString("referer", "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put("Referer", strOptString2);
        }
        if (!str.contains("www.mgtv.com") && !string.contains("titan.mgtv")) {
            if (str.contains("bilibili")) {
                jSONObject2.put("Referer", "https://www.bilibili.com/");
                str3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", jSONObject2);
            jSONObject3.put("url", string);
            return jSONObject3;
        }
        jSONObject2.put("Referer", "");
        str3 = "Mozilla/5.0";
        jSONObject2.put("User-Agent", str3);
        JSONObject jSONObject32 = new JSONObject();
        jSONObject32.put("header", jSONObject2);
        jSONObject32.put("url", string);
        return jSONObject32;
    }

    public static String v(String str) {
        Matcher matcher = Pattern.compile("(E|EP)0*([1-9]\\d*).*").matcher(str);
        if (matcher.find()) {
            return matcher.group(2);
        }
        Matcher matcher2 = Pattern.compile(".*?([1-9]\\d*).*").matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        System.out.println("未找到匹配项。");
        return "";
    }

    public static void w(String str) {
        SpiderDebug.log(str);
        Init.run(new O0(str, 4));
    }

    public static String x(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String y(String str) {
        return com.github.catvod.spider.merge.P0.e.b(str) ? "" : str.replaceAll("#", "").replaceAll("\\+", "").replaceAll("\\$", "");
    }

    public static String z(long j) {
        long j2 = j / 3600;
        long j3 = (j - (3600 * j2)) / 60;
        return j2 > 0 ? String.format("%d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j % 60)) : String.format("%d:%02d", Long.valueOf(j3), Long.valueOf(j % 60));
    }
}
