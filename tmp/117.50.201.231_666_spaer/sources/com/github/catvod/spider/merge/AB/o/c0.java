package com.github.catvod.spider.merge.AB.o;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import java.io.File;
import java.io.FileInputStream;
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
public final class c0 {
    public static final Pattern a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
    public static final List<String> b = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
    public static final List<String> c = Arrays.asList("srt", "ass", "ssa", "vtt");

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

    public static String c(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                StringBuilder sb = new StringBuilder();
                for (byte b2 : messageDigest.digest()) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                String string = sb.toString();
                fileInputStream.close();
                return string;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void d(String str) {
        File file = new File(Init.context().getFilesDir(), str);
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static com.github.catvod.spider.merge.AB.c.j e() {
        com.github.catvod.spider.merge.AB.c.j jVar = new com.github.catvod.spider.merge.AB.c.j();
        jVar.g("10086");
        jVar.e("fileId");
        jVar.i("fileId");
        jVar.h("已失效");
        jVar.k("分享已失效或其他原因不可用$https://baidu.com$$$分享已失效或其他原因不可用$https://baidu.com");
        jVar.j("未获取到资源");
        jVar.b("123云盘");
        return jVar;
    }

    public static String f(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    public static String g(Context context) {
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

    public static JSONObject h(String str, Map<String, String> map) {
        return new JSONObject(com.github.catvod.spider.merge.AB.C.h.k(com.github.catvod.spider.merge.AB.m.c.l(String.format("%s/static/js/playerconfig.js?t=%s", str, new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())), map), "MacPlayerConfig.player_list=", ",MacPlayerConfig"));
    }

    public static String i(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String j(double d) {
        return d <= 0.0d ? "" : d > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB") : d > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB") : d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    public static long k() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static ArrayList<String> l() {
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

    public static boolean m(String str) {
        Iterator it = Arrays.asList("973973.xyz", ".fit:").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(String str) {
        return c.contains(str);
    }

    public static boolean o(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return a.matcher(str).find();
    }

    public static boolean p(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String q(String str) {
        return F.c(new File(Init.context().getFilesDir(), str));
    }

    public static String r(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String s(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    public static byte[] t(byte[] bArr) {
        try {
            com.github.catvod.spider.merge.AB.N.b bVar = new com.github.catvod.spider.merge.AB.N.b();
            bVar.c(bArr, bArr.length);
            bVar.a();
            return new String(bArr, bVar.b()).getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void u(String str, String str2) {
        F.g(new File(Init.context().getFilesDir(), str), str2);
    }

    public static void v(String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        F.g(F.f(str), str2);
    }

    public static JSONObject w(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.startsWith("http")) {
                jSONObject = new JSONObject(com.github.catvod.spider.merge.AB.m.c.k(str));
            }
            if (str.startsWith("file")) {
                jSONObject = new JSONObject(F.e(str));
            }
            if (str.startsWith("{")) {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has("threadinfo")) {
                F.g(F.f("/.thread"), jSONObject.getString("threadinfo"));
            }
            if (jSONObject.has("token")) {
                String string = jSONObject.getString("token");
                if (string.contains("http")) {
                    string = com.github.catvod.spider.merge.AB.m.c.k(string);
                }
                com.github.catvod.spider.merge.AB.b.x.p().L(string);
            }
            if (jSONObject.has("quarkCookie")) {
                String string2 = jSONObject.getString("quarkCookie");
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.contains("http")) {
                        string2 = com.github.catvod.spider.merge.AB.m.c.k(string2);
                    }
                    u(".quark", string2);
                }
            }
            if (jSONObject.has("ucCookie")) {
                String string3 = jSONObject.getString("ucCookie");
                if (!TextUtils.isEmpty(string3)) {
                    if (string3.contains("http")) {
                        string3 = com.github.catvod.spider.merge.AB.m.c.k(string3);
                    }
                    u(".uc", string3);
                }
            }
            if (jSONObject.has("bauiduCookie")) {
                String string4 = jSONObject.getString("bauiduCookie");
                if (!TextUtils.isEmpty(string4)) {
                    if (string4.contains("http")) {
                        string4 = com.github.catvod.spider.merge.AB.m.c.k(string4);
                    }
                    u(".baidu", string4);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            throw new Exception(e);
        }
    }
}
