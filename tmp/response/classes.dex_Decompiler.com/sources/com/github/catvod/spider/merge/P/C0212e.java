package com.github.catvod.spider.merge.p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0212e {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static void b(File file) {
        Uri uriA;
        Intent intent = new Intent(C0098a.a(new byte[]{-50, 40, 44, 33, 39, -95, 74, -47, -58, 40, 60, 54, 38, -68, 0, -98, -52, 50, 33, 60, 38, -26, 120, -74, -22, 17}, new byte[]{-81, 70, 72, 83, 72, -56, 46, -1}));
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uriA = Uri.fromFile(file);
        } else {
            uriA = C0211d.a(Init.context(), Init.context().getPackageName() + C0098a.a(new byte[]{98, -75, -36, -74, -81, -71, 48, -103, 62}, new byte[]{76, -59, -82, -39, -39, -48, 84, -4}), file);
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = C0098a.a(new byte[]{-75, 113, -26}, new byte[]{-97, 94, -52, -74, -32, 58, 29, 88});
        }
        intent.setDataAndType(uriA, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    public static void c(File file, File file2) {
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
}
