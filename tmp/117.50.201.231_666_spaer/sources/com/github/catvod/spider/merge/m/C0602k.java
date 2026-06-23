package com.github.catvod.spider.merge.m;

import android.os.Environment;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0531c;
import com.github.catvod.spider.merge.b.C0544h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0602k {
    public static String a(File file) {
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

    public static File b(String str) {
        if (!str.startsWith(".")) {
            str = C0531c.a(".", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        File file = new File(C0544h.b(sb, File.separator, "TVBox"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static File c(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime.getRuntime().exec("chmod 777 " + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return file;
    }

    public static File c(String str) {
        if (!str.startsWith(".")) {
            str = C0531c.a(".", str);
        }
        return new File(Init.context().getFilesDir(), str);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static void m127c(File file, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File d() {
        File file = new File(Init.context().getFilesDir(), "TV");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File d(String str) {
        if (!str.startsWith(".")) {
            str = C0531c.a(".", str);
        }
        return new File(d(), str);
    }
}
