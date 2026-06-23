package com.github.catvod.spider.merge.FM.o;

import android.os.Environment;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0385a {
    public static String a(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static File b(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            com.github.catvod.spider.merge.FM.A.l.a("chmod 777 " + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(str);
            if (bArr3 != null) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            } else {
                cipher.init(2, secretKeySpec);
            }
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static String d(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        return new String(c(bArr, bArr2, bArr3, str));
    }

    public static String e(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] f(String str) {
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        while (i < str.length()) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    public static String g(String str) {
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        return new String(new BigInteger(str, 16).toByteArray());
    }

    public static File h(String str) {
        File file = new File(str.replace("file:/", ""));
        File file2 = new File(str.replace("file:/", Environment.getExternalStorageDirectory().getAbsolutePath()));
        return file2.exists() ? file2 : file.exists() ? file : new File(str);
    }

    public static String i(File file) {
        try {
            return j(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j(File file) {
        try {
            return k(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j(InputStream inputStream) {
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            return new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getString("cookie");
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String k(InputStream inputStream) {
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

    public static String k(String str) {
        try {
            return j(new FileInputStream(h(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static File l(String str) {
        if (!str.startsWith(".")) {
            str = "." + str;
        }
        File file = new File(Environment.getExternalStorageDirectory() + File.separator + "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static File m(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            b(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }
}
