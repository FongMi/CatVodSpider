package com.github.catvod.spider.merge.FM.A;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.L.F;
import com.github.catvod.spider.merge.FM.o.C0388d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l {
    public static void a(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor == 0) {
                return;
            }
            throw new RuntimeException("Shell command failed with exit code " + iWaitFor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec("nohup " + str + " 2>&1 &");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.toLowerCase().contains("info") && !line.toLowerCase().contains("warn") && !line.toLowerCase().contains("error")) {
                    SpiderDebug.log(line);
                }
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                SpiderDebug.log(String.format("Shell command failed with exit code '%s'", Integer.valueOf(iWaitFor)));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int c(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static String d(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String e(String str) {
        return d(str).trim();
    }

    public static void f(File file) {
        Uri uriA;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uriA = Uri.fromFile(file);
        } else {
            uriA = C0388d.a(Init.context(), Init.context().getPackageName() + ".provider", file);
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = "*/*";
        }
        intent.setDataAndType(uriA, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    public static com.github.catvod.spider.merge.FM.K.h g(String str) {
        return F.d(str);
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
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i != -1) {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int i(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int j(int i, Object obj) {
        return i(i, obj != null ? obj.hashCode() : 0);
    }
}
