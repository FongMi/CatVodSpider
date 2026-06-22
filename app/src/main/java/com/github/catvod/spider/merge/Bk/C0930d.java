package com.github.catvod.spider.merge.bk;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0930d {
    static volatile C0931e a = new C0931e();

    public static void a(File file) {
        Uri uriA;
        Intent intent = new Intent(nIe.d("23083731262626483A2D3D2A2C127D222A3B2B093D6D1F060731"));
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uriA = Uri.fromFile(file);
        } else {
            uriA = C0929c.a(Init.context(), Init.context().getPackageName() + nIe.d("6C16212C3F26260321"), file);
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = nIe.d("684979");
        }
        intent.setDataAndType(uriA, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    public static void b(File file, File file2) {
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
