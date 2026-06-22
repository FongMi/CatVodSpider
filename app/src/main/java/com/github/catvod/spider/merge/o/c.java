package com.github.catvod.spider.merge.o;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.A.T;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class c {
    public static volatile C0019u a = new C0019u((byte) 0);

    public static File a(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                int iWaitFor = Runtime.getRuntime().exec("chmod 777 " + file).waitFor();
                if (iWaitFor != 0) {
                    throw new RuntimeException("Shell command failed with exit code " + iWaitFor);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return file;
        } catch (Exception e2) {
            e2.printStackTrace();
            return file;
        }
    }

    public static int b(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static Bitmap c(int i, String str) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    iArr[i3 + i4] = bitMatrixEncode.get(i4, i2) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void d(File file) {
        C0141a c0141aA;
        Uri uriBuild;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uriBuild = Uri.fromFile(file);
        } else {
            Application applicationContext = Init.context();
            String str = Init.context().getPackageName() + ".provider";
            HashMap map = b.a;
            synchronized (map) {
                try {
                    c0141aA = (C0141a) map.get(str);
                    if (c0141aA == null) {
                        try {
                            c0141aA = b.a(applicationContext, str);
                            map.put(str, c0141aA);
                        } catch (com.github.catvod.spider.merge.Z.b e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        } catch (IOException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : c0141aA.b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(T.f("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = ((File) entry.getValue()).getPath();
                uriBuild = new Uri.Builder().scheme("content").authority(c0141aA.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = "*/*";
        }
        intent.setDataAndType(uriBuild, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    public static JsonElement e(String str) {
        try {
            return JsonParser.parseString(str);
        } catch (Throwable unused) {
            return new JsonParser().parse(str);
        }
    }

    public static String f(File file) {
        String str = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                str = new String(bArr, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static File g(String str) {
        if (!str.startsWith(".")) {
            str = ".".concat(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        File file = new File(T.h(sb, File.separator, "TV"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static void h(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    File file3 = new File(file2, zipEntryNextElement.getName());
                    if (zipEntryNextElement.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        try {
                            byte[] bArr = new byte[8192];
                            a(file3);
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                            fileOutputStream.close();
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
