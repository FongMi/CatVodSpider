package com.github.catvod.spider.merge.AB.o;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class F {
    public static File a(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            L.a("chmod 777 " + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    public static File b(String str) {
        File file = new File(str.replace("file:/", ""));
        File file2 = new File(str.replace("file:/", Environment.getExternalStorageDirectory().getAbsolutePath()));
        return file2.exists() ? file2 : file.exists() ? file : new File(str);
    }

    public static String c(File file) {
        try {
            return d(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(InputStream inputStream) {
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String e(String str) {
        try {
            return d(new FileInputStream(b(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static File f(String str) {
        if (!str.startsWith(".")) {
            str = com.github.catvod.spider.merge.AB.b.u.b(new byte[]{50}, new byte[]{28, -36, 23, -38, 91, -85, -55, -54}, new StringBuilder(), str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        File file = new File(com.github.catvod.spider.merge.AB.b.t.b(new byte[]{90, 108}, new byte[]{14, 58, -57, -33, 56, 78, -95, 48}, sb));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static File g(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            a(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }
}
