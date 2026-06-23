package com.github.catvod.spider.merge.A;

import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class n {
    public static void b(String str) {
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

    public static File e(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            b("chmod 777 " + file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public static File o(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            e(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
        }
        return file;
    }

    public static void u(String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory(), "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        o(new File(file, str), str2);
    }
}
