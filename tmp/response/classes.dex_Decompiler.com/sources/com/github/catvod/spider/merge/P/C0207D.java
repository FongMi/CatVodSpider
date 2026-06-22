package com.github.catvod.spider.merge.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0207D {
    public static final Pattern a;
    public static final List<String> b;
    public static final List<String> c;

    static {
        C0098a.a(new byte[]{21, -12, -101, 95, -30, 52, -14, -58, 109, -75, -47, 22, -90, 15, -6, -121, 60, -12, -106, 69, -82, 22, -57, -55, 105, -85, -49, 6, -75, 120, -60, -128, 54, -83, -43, 13, -82, 32, -91, -35, 113, -69, -96, 70, -2, 52, -10, -66, 61, -7, -86, 95, -6, 119, -90, -38, 111, -75, -46, 0, -82, 112, -40, -95, 12, -42, -83, 26, -82, 52, -6, -126, 61, -69, -90, 83, -19, 51, -4, -64, 120, -40, -119, 68, -31, 53, -10, -58, 105, -86, -42, 24, -66, 118, -93, -57, 104, -69, -78, 87, -24, 57, -31, -128, 119, -82, -46, 1, -96, 107, -91}, new byte[]{88, -101, -31, 54, -114, 88, -109, -23});
        C0098a.a(new byte[]{46, -46, -60, -43, -24, 30, 118, -115, 54, -101, -35, -47, -73, 26, 107, -125, 59, -61, -43, -50, -87, 89, 122, -120, 46, -38, -48, -118, -65, 27, 110, -52, 59, -57, -52, -51, -82, 21, 99, -108, 51, -40, -46, -114, -65, 27, 110, -37, 43, -118, -116, -113, -2, 90, 107, -115, 59, -48, -39, -114, -90, 0, 107, -122, 118, -34, -47, -64, -96, 19, 45, -105, 63, -43, -52, -115, -82, 27, 99, -121, 63, -104, -35, -47, -87, 17, 46, -54, 117, -99, -121, -48, -6, 70, 44, -40, 118, -42, -52, -47, -85, 31, 97, -127, 46, -34, -45, -49, -24, 5, 107, -121, 52, -46, -40, -116, -94, 14, 97, -120, 59, -39, -37, -60, -4, 0, 63, -126, 105, -116, -51, -100, -9, 88, 53}, new byte[]{90, -73, -68, -95, -57, 118, 2, -32});
        a = Pattern.compile(C0098a.a(new byte[]{103, -36, -30, 35, 31, 119, 96, 98, 103, -36, -30, 35, 30, 113, 118, 56, 62, -102, -70, 46, 8, 3, 113, 107, 98, -101, -29, 107, 75, 50, 47, 119, 115, -59, -3, 37, 75, 57, 51, 53, 115, -59, -26, 96, 75, 50, 107, 34, 115, -55, -9, 48, 30, 3, 96, 109, 37, -44, -2, 39, 67, 47, 119, 107, 48, -119, -2, 39, 67, 47, 118, 109, 38, -45, -89, 97, 27, 34, 3, 109, 39, -59, -91, 38, 15, 35, 50, 51, 59, -44, -5, 56, 65, 35, 57, 47, 121, -44, -5, 35, 4, 35, 50, 119, 110, -44, -9, 50, 84, 118, 35, 43, 123, -36, -26, 123, 31, 96, 126, 43, 123, -36, -26, 122, 25, 118, 117, 124, 121, -63, -14, 54, 88, 112, 43, 44, 124, -126}, new byte[]{15, -88, -106, 83, 55, 95, 95, 67}));
        b = Arrays.asList(C0098a.a(new byte[]{-82, -9, -69}, new byte[]{-61, -121, -113, -109, 57, -103, -105, 12}), C0098a.a(new byte[]{16, -52, -68}, new byte[]{125, -89, -54, 125, 63, -103, -42, -82}), C0098a.a(new byte[]{11, 12, -39}, new byte[]{124, 97, -81, -9, 67, 71, -64, -108}), C0098a.a(new byte[]{-86, -35, 122}, new byte[]{-52, -79, 12, 124, 22, 19, 24, 121}), C0098a.a(new byte[]{-8, 33, 67}, new byte[]{-103, 87, 42, 104, 120, 91, 75, -64}), C0098a.a(new byte[]{87, -22, -57}, new byte[]{62, -103, -88, 57, -50, -105, 37, -82}), C0098a.a(new byte[]{87, 105, 89}, new byte[]{58, 25, 62, -33, -89, 94, -34, 58}), C0098a.a(new byte[]{-50, -106}, new byte[]{-70, -27, 5, 113, 77, 79, -1, -87}), C0098a.a(new byte[]{-120, -118, 0}, new byte[]{-27, -6, 51, 29, -51, -47, -10, 30}), C0098a.a(new byte[]{107, -88, 60}, new byte[]{10, -55, 95, -118, -101, 105, -33, -95}), C0098a.a(new byte[]{-55, -97, 44, 125}, new byte[]{-81, -13, 77, 30, -122, 24, -75, 48}), C0098a.a(new byte[]{-20, 91, 52}, new byte[]{-127, 111, 85, -63, -116, 126, -122, 83}), C0098a.a(new byte[]{-126, -69, 43}, new byte[]{-29, -53, 78, -38, -74, 49, 78, -106}), C0098a.a(new byte[]{40, -65, 102}, new byte[]{71, -40, 1, -1, 123, -114, 12, 120}));
        c = Arrays.asList(C0098a.a(new byte[]{2, 17, 112}, new byte[]{113, 99, 4, 35, -70, -64, -90, 110}), C0098a.a(new byte[]{-72, 31, 49}, new byte[]{-39, 108, 66, 52, 7, 34, 111, -91}), C0098a.a(new byte[]{108, -27, 20}, new byte[]{31, -106, 117, -116, -75, 63, -119, -98}), C0098a.a(new byte[]{5, 63, 119}, new byte[]{115, 75, 3, 20, -99, -85, -117, 75}));
    }

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance(C0098a.a(new byte[]{-111, 98, -10}, new byte[]{-36, 38, -61, -73, -30, 5, -76, -36})).digest(str.getBytes(C0098a.a(new byte[]{2, -82, 115, -53, -31}, new byte[]{87, -6, 53, -26, -39, 18, 23, 16})))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, C0098a.a(new byte[]{-78}, new byte[]{-126, 34, -41, -1, 126, -68, -121, 29}));
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C0098a.a(new byte[]{6, -38, 53, 21, -80, -84, -46}, new byte[]{85, -110, 116, 56, -126, -103, -28, 79})).digest(str.getBytes());
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
                MessageDigest messageDigest = MessageDigest.getInstance(C0098a.a(new byte[]{80, -73, 83}, new byte[]{29, -13, 102, -65, 89, 110, -18, 122}));
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
                    sb.append(String.format(C0098a.a(new byte[]{-70, 92, 0, 67}, new byte[]{-97, 108, 50, 59, -80, -68, -42, 127}), Byte.valueOf(b2)));
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

    public static com.github.catvod.spider.merge.c.k e() {
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        kVar.g(C0098a.a(new byte[]{-36, 52, 72, 1, -109}, new byte[]{-19, 4, 120, 57, -91, -78, -81, -17}));
        kVar.e(C0098a.a(new byte[]{56, 28, -86, -56, 43, -68}, new byte[]{94, 117, -58, -83, 98, -40, 23, -107}));
        kVar.i(C0098a.a(new byte[]{12, 120, 87, 122, 35, -100}, new byte[]{106, 17, 59, 31, 106, -8, -63, 120}));
        kVar.h(C0098a.a(new byte[]{-30, 5, 61, 21, 46, -26, 19, -27, -113}, new byte[]{7, -78, -113, -16, -118, 87, -11, 112}));
        kVar.k(C0098a.a(new byte[]{-101, 125, -13, -62, 38, -70, -6, -63, -52, 16, -47, -105, 122, -124, -105, -112, -10, 99, -112, -93, 42, -11, -92, -32, -101, 123, -22, -61, 7, -79, -5, -50, -13, 16, -6, -119, 123, -123, -73, 82, 22, -127, 1, 86, -17, 43, 48, 89, 28, -108, 28, 66, -23, 63, 124, 25, 19, -47, 81, 2, 121, -103, -103, -110, -60, 94, -112, -111, 46, -12, -69, -57, -104, 96, -3, -64, 20, -121, -6, -13, -56, 17, -50, -80, 121, -97, -128, -109, -27, 85, -111, -98, 17, -12, -112, -39, -103, 97, -35, 2, -12, 101, 107, 6, 13, -49, 90, 9, -2, 112, 118, 18, 11, -37, 22, 73, -15}, new byte[]{126, -11, 117, 38, -100, 17, 31, 118}));
        kVar.j(C0098a.a(new byte[]{-34, 19, 112, 86, 92, 108, 79, 87, -82, 106, 82, 14, 58, 110, 46, 62, -126, 31}, new byte[]{56, -113, -38, -66, -46, -37, -86, -40}));
        kVar.b(C0098a.a(new byte[]{-75, 37, -58, 46, -46, 75, 70, -84, 28}, new byte[]{-124, 23, -11, -54, 104, -38, -95, 55}));
        return kVar;
    }

    public static String f(String str) {
        return str.contains(C0098a.a(new byte[]{106}, new byte[]{68, 64, 86, -52, -34, 10, 117, 122})) ? str.substring(str.lastIndexOf(C0098a.a(new byte[]{-33}, new byte[]{-15, 14, 90, -50, -109, -25, -27, 43})) + 1) : str;
    }

    @SuppressLint({"DefaultLocale"})
    public static String g(Context context) {
        Enumeration<NetworkInterface> networkInterfaces;
        int ipAddress = ((WifiManager) context.getSystemService(C0098a.a(new byte[]{120, 25, -90, 33}, new byte[]{15, 112, -64, 72, -17, 48, 4, -86}))).getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            return String.format(C0098a.a(new byte[]{93, 19, 85, 69, -54, 111, -92, -33, 86, 82, 31}, new byte[]{120, 119, 123, 96, -82, 65, -127, -69}), Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            String displayName = networkInterfaceNextElement.getDisplayName();
            if (displayName.equals(C0098a.a(new byte[]{-109, -108, -68, 84}, new byte[]{-10, -32, -44, 100, 43, -24, -91, 22})) || displayName.equals(C0098a.a(new byte[]{-107, 119, 120, 71, 117}, new byte[]{-30, 27, 25, 41, 69, -76, 8, 13}))) {
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                    return C0098a.a(new byte[]{-18, -38, 107, -69, -55, 87, 12}, new byte[]{-34, -12, 91, -107, -7, 121, 60, 58});
                }
            }
        }
        return C0098a.a(new byte[]{-18, -38, 107, -69, -55, 87, 12}, new byte[]{-34, -12, 91, -107, -7, 121, 60, 58});
    }

    public static JSONObject h(String str, Map<String, String> map) {
        return new JSONObject(com.github.catvod.spider.merge.D.h.k(C0197c.l(String.format(C0098a.a(new byte[]{-119, 55, -65, 93, -118, -112, -107, 45, -49, 107, -6, 93, -47, -127, -115, 37, -43, 33, -30, 77, -111, -97, -121, 45, -53, 106, -6, 93, -63, -123, -36, 97, -33}, new byte[]{-84, 68, -112, 46, -2, -15, -31, 68}), str, new SimpleDateFormat(C0098a.a(new byte[]{39, 103, -122, 58, -109, -74, -21, -93}, new byte[]{94, 30, -1, 67, -34, -5, -113, -57})).format(Calendar.getInstance().getTime())), map), C0098a.a(new byte[]{98, 109, -21, -2, 105, -122, -101, 112, 93, 79, -25, -64, 99, -114, -123, 59, 95, 96, -23, -41, 96, -107, -67, 121, 70, 127, -4, -109}, new byte[]{47, 12, -120, -82, 5, -25, -30, 21}), C0098a.a(new byte[]{67, 32, -40, -37, 84, 71, -69, -47, 10, 31, -6, -41, 106, 77, -77, -49}, new byte[]{111, 109, -71, -72, 4, 43, -38, -88})));
    }

    public static String i(double d) {
        return d <= 0.0d ? "" : d > 1.099511627776E12d ? String.format(Locale.getDefault(), C0098a.a(new byte[]{75, 101, -26, 61, -54, 80}, new byte[]{110, 75, -44, 91, -17, 35, -128, -81}), Double.valueOf(d / 1.099511627776E12d), C0098a.a(new byte[]{-123, -55}, new byte[]{-47, -117, 63, -39, -29, 88, 52, 14})) : d > 1.073741824E9d ? String.format(Locale.getDefault(), C0098a.a(new byte[]{-35, -41, -5, -28, 22, 46}, new byte[]{-8, -7, -55, -126, 51, 93, 107, 92}), Double.valueOf(d / 1.073741824E9d), C0098a.a(new byte[]{-99, 45}, new byte[]{-38, 111, -79, -25, -96, -97, 100, -128})) : d > 1048576.0d ? String.format(Locale.getDefault(), C0098a.a(new byte[]{49, 81, 102, 104, 47, 15}, new byte[]{20, 127, 84, 14, 10, 124, -108, -13}), Double.valueOf(d / 1048576.0d), C0098a.a(new byte[]{103, -100}, new byte[]{42, -34, -125, 17, -125, 82, -11, 11})) : String.format(Locale.getDefault(), C0098a.a(new byte[]{123, -32, 79, 42, -19, 85}, new byte[]{94, -50, 125, 76, -56, 38, 21, 9}), Double.valueOf(d / 1024.0d), C0098a.a(new byte[]{42, -90}, new byte[]{97, -28, 101, 127, -83, -5, -89, -110}));
    }

    public static long j() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static ArrayList<String> k() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(C0098a.a(new byte[]{-103, -117, -17, 8, -99, -2, 47, 3, -37}, new byte[]{-17, -30, -117, 109, -14, -47, 66, 115}));
        arrayList.add(C0098a.a(new byte[]{53, 109, 11, -25, -124, 16, -39, -121, 46, 119, 25, -21, -113, 90, -50}, new byte[]{67, 4, 111, -126, -21, 63, -95, -86}));
        arrayList.add(C0098a.a(new byte[]{45, 60, -57, -56, 84, 13, 104, 23, 54, 52, -41, -33, 84, 81, 123, 91}, new byte[]{91, 85, -93, -83, 59, 34, 16, 58}));
        arrayList.add(C0098a.a(new byte[]{23, -1, 57, -72, 113, -70, -4, -7, 8, -11, 54, -87, 119, -8, -24}, new byte[]{97, -106, 93, -35, 30, -107, -115, -116}));
        arrayList.add(C0098a.a(new byte[]{-34, -5, 84, 65, -73, -106, 96, 10, -59, -31, 29, 83, -75, -49}, new byte[]{-88, -110, 48, 36, -40, -71, 24, 39}));
        arrayList.add(C0098a.a(new byte[]{92, -90, -120, 61, -27, -57, -126, 32, 76, -93, -102}, new byte[]{42, -49, -20, 88, -118, -24, -6, 13}));
        arrayList.add(C0098a.a(new byte[]{84, -126, -92, 28, 96, 106, 15, -124, 64, -122}, new byte[]{34, -21, -64, 121, 15, 69, 120, -31}));
        arrayList.add(C0098a.a(new byte[]{16, 95, -113, 95, -68, 92, 50, 42, 3, 81}, new byte[]{102, 54, -21, 58, -45, 115, 95, 90}));
        arrayList.add(C0098a.a(new byte[]{-77, -117, -55, 125, -54, 32, 81, -81, -75, -110}, new byte[]{-59, -30, -83, 24, -91, 15, 98, -56}));
        arrayList.add(C0098a.a(new byte[]{-69, -25, 23, -50, 126, 22, 13, 118, -86}, new byte[]{-51, -114, 115, -85, 17, 57, 98, 17}));
        arrayList.add(C0098a.a(new byte[]{-120, 8, 108, -86, -119, 102, -41, -6, -52, 53}, new byte[]{-2, 97, 8, -49, -26, 73, -102, -86}));
        arrayList.add(C0098a.a(new byte[]{103, -22, -51, 41, 84, 78, -92, 74, 111, -11, -45, 106, 75, 67, -95, 16, 116, -12, -112, 55, 88, 76, -87, 83, 99, -2, -44, 36}, new byte[]{6, -102, -67, 69, 61, 45, -59, 62}));
        arrayList.add(C0098a.a(new byte[]{-124, -27, 100, -21, -10, -107, 120, 52, -116, -6, 122, -88, -25, -37, 116, 33, -111, -25, 123, -12, -12, -105}, new byte[]{-27, -107, 20, -121, -97, -10, 25, 64}));
        arrayList.add(C0098a.a(new byte[]{-74, 2, -105, -72, 2, -87, 11, 81, -12, 29, -34, -72, 30}, new byte[]{-64, 107, -13, -35, 109, -122, 102, 33}));
        arrayList.add(C0098a.a(new byte[]{35, -58, -87, 126, 121, 60, -63, 48, 99, -101}, new byte[]{85, -81, -51, 27, 22, 19, -119, 2}));
        arrayList.add(C0098a.a(new byte[]{109, -8, -111, -35, 39, -98, 49, 81, 45, -92}, new byte[]{27, -111, -11, -72, 72, -79, 121, 99}));
        arrayList.add(C0098a.a(new byte[]{93, -12, -24, -11, 3, 15, 87, -19, 19}, new byte[]{43, -99, -116, -112, 108, 32, 1, -67}));
        arrayList.add(C0098a.a(new byte[]{-99, 110, 121, -116, -100, -100, 46, 88, -46}, new byte[]{-21, 7, 29, -23, -13, -77, 120, 8}));
        arrayList.add(C0098a.a(new byte[]{-40, 108, -113, 117, 50, 78, 44, -69, -40, 125}, new byte[]{-82, 5, -21, 16, 93, 97, 72, -46}));
        arrayList.add(C0098a.a(new byte[]{-70, 67, -36, 117, -103, 67, 27, -9, -91, 78}, new byte[]{-52, 42, -72, 16, -10, 108, 99, -127}));
        arrayList.add(C0098a.a(new byte[]{-108, 79, 74, -84, -52, -28, 76, 59, -45}, new byte[]{-30, 38, 46, -55, -93, -53, 13, 109}));
        return arrayList;
    }

    public static boolean l(String str) {
        Iterator it = Arrays.asList(C0098a.a(new byte[]{-1, 61, 2, -115, -28, -57, 101, -119, -65, 112}, new byte[]{-58, 10, 49, -76, -45, -12, 75, -15}), C0098a.a(new byte[]{59, 4, -3, 35, 64}, new byte[]{21, 98, -108, 87, 122, -7, -46, 68})).iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(String str) {
        return str.contains(C0098a.a(new byte[]{-100}, new byte[]{-36, -118, -37, 108, 12, -29, 46, -21})) && str.contains(C0098a.a(new byte[]{68}, new byte[]{106, 59, -75, 30, -37, -2, 48, -10}));
    }

    public static boolean n(String str) {
        return c.contains(str);
    }

    public static boolean o(String str) {
        if (str.contains(C0098a.a(new byte[]{26, 89, 57, -35, 33, 64, 25, -111}, new byte[]{111, 43, 85, -32, 73, 52, 109, -31})) || str.contains(C0098a.a(new byte[]{-13, -127, 119}, new byte[]{-35, -21, 4, -36, -48, -3, -75, -16})) || str.contains(C0098a.a(new byte[]{31, 65, -100, 114}, new byte[]{49, 34, -17, 1, 123, 100, -70, 21})) || str.contains(C0098a.a(new byte[]{91, 106, 17, 49, 81}, new byte[]{117, 2, 101, 92, 61, -65, -11, 87}))) {
            return false;
        }
        return a.matcher(str).find();
    }

    public static boolean p(String str) {
        Iterator it = Arrays.asList(C0098a.a(new byte[]{-124, -114, -93, 15, -51, -94, 78, -103, -128}, new byte[]{-19, -1, -54, 118, -92, -116, 45, -10}), C0098a.a(new byte[]{-28, -9, 99, -42, 53, 17, -103, -9}, new byte[]{-110, -39, 18, -89, 27, 114, -10, -102}), C0098a.a(new byte[]{-62, -127, 70, 18, 24, -124, 118, 43, -42}, new byte[]{-69, -18, 51, 121, 109, -86, 21, 68}), C0098a.a(new byte[]{-66, -56, -61, -41, 85, 107}, new byte[]{-46, -83, -19, -76, 58, 6, -37, -28}), C0098a.a(new byte[]{45, 115, 10, 40, 41, -40, -38, 7, 52}, new byte[]{89, 6, 110, 71, 92, -10, -71, 104}), C0098a.a(new byte[]{-81, -72, 91, -66, -17, -47, -91, -122}, new byte[]{-62, -33, 47, -56, -63, -78, -54, -21}), C0098a.a(new byte[]{-113, 97, -95, 121, -93, -10, -22, -47}, new byte[]{-4, 14, -55, 12, -115, -107, -123, -68}), C0098a.a(new byte[]{37, 46, -83, 49, -100, -8, -60, -45}, new byte[]{68, 77, -53, 68, -14, -42, -89, -67}), C0098a.a(new byte[]{-3, -112, 119, 111, -115, 18, 43, -107, -79, -102, 116, 107}, new byte[]{-97, -7, 27, 6, -17, 123, 71, -4}), C0098a.a(new byte[]{42, -91, -1, -113, 24, -122, -41, 31, 43, -85, -3}, new byte[]{72, -60, -112, -23, 125, -24, -80, 49}), C0098a.a(new byte[]{7, -5, -41, -42, -39, -69, -64, -62}, new byte[]{119, -117, -93, -96, -9, -40, -81, -81})).iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String q(String str) {
        return C0208a.j(new File(Init.context().getFilesDir(), str));
    }

    public static String r(String str) {
        return str.contains(C0098a.a(new byte[]{-59}, new byte[]{-21, -73, -88, 107, -79, 9, -111, 121})) ? str.substring(0, str.lastIndexOf(C0098a.a(new byte[]{64}, new byte[]{110, 30, 81, -72, -30, 93, 64, 30}))) : str;
    }

    public static String s(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    public static byte[] t(byte[] bArr) {
        try {
            com.github.catvod.spider.merge.O.b bVar = new com.github.catvod.spider.merge.O.b();
            bVar.c(bArr, bArr.length);
            bVar.a();
            return new String(bArr, bVar.b()).getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void u(String str, String str2) {
        C0208a.n(new File(Init.context().getFilesDir(), str), str2);
    }

    public static void v(String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        C0208a.n(C0208a.m(str), str2);
    }

    public static JSONObject w(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.startsWith(C0098a.a(new byte[]{-119, -128, 64, -84}, new byte[]{-31, -12, 52, -36, -24, -125, 118, -19}))) {
                jSONObject = new JSONObject(C0197c.l(str, null));
            }
            if (str.startsWith(C0098a.a(new byte[]{-28, 91, -97, -58}, new byte[]{-126, 50, -13, -93, -75, -29, 76, 26}))) {
                jSONObject = new JSONObject(C0208a.l(str));
            }
            if (str.startsWith(C0098a.a(new byte[]{-32}, new byte[]{-101, 124, -43, -10, 79, -58, -86, 56}))) {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has(C0098a.a(new byte[]{12, -3, 121, 17, 5, 36, -46, 127, 30, -6}, new byte[]{120, -107, 11, 116, 100, 64, -69, 17}))) {
                C0208a.n(C0208a.m(C0098a.a(new byte[]{-26, -92, -1, 16, -62, 115, 20, 64}, new byte[]{-55, -118, -117, 120, -80, 22, 117, 36})), jSONObject.getString(C0098a.a(new byte[]{-104, 6, 91, -96, -10, -44, 90, -72, -118, 1}, new byte[]{-20, 110, 41, -59, -105, -80, 51, -42})));
            }
            if (jSONObject.has(C0098a.a(new byte[]{127, -100, 98, 99, 16}, new byte[]{11, -13, 9, 6, 126, 53, -10, 62}))) {
                String string = jSONObject.getString(C0098a.a(new byte[]{26, -117, -72, -71, 115}, new byte[]{110, -28, -45, -36, 29, -69, 2, 55}));
                if (string.contains(C0098a.a(new byte[]{-35, 112, -25, 126}, new byte[]{-75, 4, -109, 14, 42, 1, -62, -124}))) {
                    string = C0197c.l(string, null);
                }
                com.github.catvod.spider.merge.b.x.p().L(string);
            }
            if (jSONObject.has(C0098a.a(new byte[]{54, -84, -66, 67, -15, 113, -127, -40, 44, -80, -70}, new byte[]{71, -39, -33, 49, -102, 50, -18, -73}))) {
                String string2 = jSONObject.getString(C0098a.a(new byte[]{-36, -34, 41, -95, 79, -26, -27, 60, -58, -62, 45}, new byte[]{-83, -85, 72, -45, 36, -91, -118, 83}));
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.contains(C0098a.a(new byte[]{-126, -126, 70, 101}, new byte[]{-22, -10, 50, 21, 11, 65, -94, 33}))) {
                        string2 = C0197c.l(string2, null);
                    }
                    u(C0098a.a(new byte[]{90, -60, -109, 7, 3, 42}, new byte[]{116, -75, -26, 102, 113, 65, 37, -2}), string2);
                }
            }
            if (jSONObject.has(C0098a.a(new byte[]{68, -61, 59, 34, 111, 63, -21, 28}, new byte[]{49, -96, 120, 77, 0, 84, -126, 121}))) {
                String string3 = jSONObject.getString(C0098a.a(new byte[]{103, -122, 55, 98, 74, -126, -88, -101}, new byte[]{18, -27, 116, 13, 37, -23, -63, -2}));
                if (!TextUtils.isEmpty(string3)) {
                    if (string3.contains(C0098a.a(new byte[]{82, -120, 86, 91}, new byte[]{58, -4, 34, 43, -87, -19, 58, 2}))) {
                        string3 = C0197c.l(string3, null);
                    }
                    u(C0098a.a(new byte[]{-31, 26, 38}, new byte[]{-49, 111, 69, 105, -34, 10, -78, 12}), string3);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            throw new Exception(e);
        }
    }
}
