package com.github.catvod.spider.merge.FM.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.p.C0614a;
import java.io.File;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class z {
    public static final Pattern a;
    public static final List<String> b;
    public static final List<String> c;

    static {
        C0298a.b(new byte[]{110, 77, 121, 60, 121, -19, -82, -98, 22, 12, 51, 117, 61, -42, -90, -33, 71, 77, 116, 38, 53, -49, -101, -111, 18, 18, 45, 101, 46, -95, -104, -40, 77, 20, 55, 110, 53, -7, -7, -123, 10, 2, 66, 37, 101, -19, -86, -26, 70, 64, 72, 60, 97, -82, -6, -126, 20, 12, 48, 99, 53, -87, -124, -7, 119, 111, 79, 121, 53, -19, -90, -38, 70, 2, 68, 48, 118, -22, -96, -104, 3, 97, 107, 39, 122, -20, -86, -98, 18, 19, 52, 123, 37, -81, -1, -97, 19, 2, 80, 52, 115, -32, -67, -40, 12, 23, 48, 98, 59, -78, -7}, new byte[]{35, 34, 3, 85, 21, -127, -49, -79});
        C0298a.b(new byte[]{-92, 69, -116, -117, 14, 103, -66, 84, -68, 12, -107, -113, 81, 99, -93, 90, -79, 84, -99, -112, 79, 32, -78, 81, -92, 77, -104, -44, 89, 98, -90, 21, -79, 80, -124, -109, 72, 108, -85, 77, -71, 79, -102, -48, 89, 98, -90, 2, -95, 29, -60, -47, 24, 35, -93, 84, -79, 71, -111, -48, 64, 121, -93, 95, -4, 73, -103, -98, 70, 106, -27, 78, -75, 66, -124, -45, 72, 98, -85, 94, -75, 15, -107, -113, 79, 104, -26, 19, -1, 10, -49, -114, 28, 63, -28, 1, -4, 65, -124, -113, 77, 102, -87, 88, -92, 73, -101, -111, 14, 124, -93, 94, -66, 69, -112, -46, 68, 119, -87, 81, -79, 78, -109, -102, 26, 121, -9, 91, -29, 27, -123, -62, 17, 33, -3}, new byte[]{-48, 32, -12, -1, 33, 15, -54, 57});
        a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
        b = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        c = Arrays.asList("srt", "ass", "ssa", "vtt");
    }

    public static String a(String str) {
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

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m25b(String str) {
        File file = new File(Init.context().getFilesDir(), str);
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static C0332j c() {
        C0332j c0332j = new C0332j();
        c0332j.g("10086");
        c0332j.e("fileId");
        c0332j.i("fileId");
        c0332j.h("已失效");
        c0332j.k("分享已失效或其他原因不可用$https://baidu.com$$$分享已失效或其他原因不可用$https://baidu.com");
        c0332j.j("未获取到资源");
        c0332j.b("未知");
        return c0332j;
    }

    public static String c(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return C0614a.k(new File(file, str));
    }

    public static String d(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    @SuppressLint({"DefaultLocale"})
    public static String e(Context context) {
        int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String displayName = networkInterfaceNextElement.getDisplayName();
                if (displayName.equals("eth0") || displayName.equals("wlan0")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            return inetAddressNextElement.getHostAddress();
                        }
                    }
                }
            }
            return "0.0.0.0";
        } catch (SocketException e) {
            e.printStackTrace();
            return "0.0.0.0";
        }
    }

    public static JSONObject f(String str, Map<String, String> map) {
        return new JSONObject(com.github.catvod.spider.merge.FM.C.h.k(C0378c.n(String.format("%s/static/js/playerconfig.js?t=%s", str, new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())), map), "MacPlayerConfig.player_list=", ",MacPlayerConfig"));
    }

    public static String g(double d) {
        return d <= 0.0d ? "" : d > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB") : d > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB") : d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    public static long h() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("video/mp4");
        arrayList.add("video/x-msvideo");
        arrayList.add("video/x-matroska");
        arrayList.add("video/quicktime");
        arrayList.add("video/x-ms-wmv");
        arrayList.add("video/x-flv");
        arrayList.add("video/webm");
        arrayList.add("video/mpeg");
        arrayList.add("video/3gpp");
        arrayList.add("video/ogg");
        arrayList.add("video/MP2T");
        arrayList.add("application/vnd.rn-realmedia");
        arrayList.add("application/x-matroska");
        arrayList.add("video/mp4v-es");
        arrayList.add("video/H264");
        arrayList.add("video/H265");
        arrayList.add("video/VP8");
        arrayList.add("video/VP9");
        arrayList.add("video/divx");
        arrayList.add("video/xvid");
        arrayList.add("video/AV1");
        return arrayList;
    }

    public static boolean j(String str) {
        Iterator it = Arrays.asList("973973.xyz", ".fit:").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(String str) {
        return str.contains("@") && str.contains(".");
    }

    public static boolean l(String str) {
        return c.contains(str);
    }

    public static boolean m(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return a.matcher(str).find();
    }

    public static boolean n(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String o(String str) {
        return C0385a.i(new File(new File("/storage/emulated/0/TVBox"), str));
    }

    public static String p(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String q(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    public static byte[] r(byte[] bArr) {
        try {
            com.github.catvod.spider.merge.FM.N.b bVar = new com.github.catvod.spider.merge.FM.N.b();
            bVar.c(bArr, bArr.length);
            bVar.a();
            return new String(bArr, bVar.b()).getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void s(String str, String str2) {
        C0385a.m(new File(Init.context().getFilesDir(), str), str2);
    }

    public static void t(String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        C0385a.m(C0385a.l(str), str2);
    }

    public static JSONObject u(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.startsWith("http")) {
                jSONObject = new JSONObject(C0378c.n(str, null));
            }
            if (str.startsWith("file")) {
                jSONObject = new JSONObject(C0385a.k(str));
            }
            if (str.startsWith("{")) {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has("threadinfo")) {
                C0385a.m(C0385a.l("/.thread"), jSONObject.getString("threadinfo"));
            }
            if (jSONObject.has("token")) {
                String string = jSONObject.getString("token");
                if (string.contains("http")) {
                    string = C0378c.n(string, null);
                }
                com.github.catvod.spider.merge.FM.b.u.p().L(string);
            }
            if (jSONObject.has("quarkCookie")) {
                String string2 = jSONObject.getString("quarkCookie");
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.contains("http")) {
                        string2 = C0378c.n(string2, null);
                    }
                    s(".quark", string2);
                }
            }
            if (jSONObject.has("ucCookie")) {
                String string3 = jSONObject.getString("ucCookie");
                if (!TextUtils.isEmpty(string3)) {
                    if (string3.contains("http")) {
                        string3 = C0378c.n(string3, null);
                    }
                    s(".uc", string3);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            throw new Exception(e);
        }
    }
}
