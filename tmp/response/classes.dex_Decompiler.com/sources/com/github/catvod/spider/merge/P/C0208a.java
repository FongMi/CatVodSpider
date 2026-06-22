package com.github.catvod.spider.merge.p;

import android.os.Environment;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0208a {
    public static String a(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[str.length() / 2];
            while (i < str.length()) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str3.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, C0098a.a(new byte[]{32, -74, -75}, new byte[]{97, -13, -26, -71, 65, 122, 18, -12}));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
        Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{-102, -111, -107, 127, -123, -11, -115, -87, -117, -97, -123, 3, -13, -25, -81, -30, -65, -67, -88, 55}, new byte[]{-37, -44, -58, 80, -58, -73, -50, -122}));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
    }

    public static String b(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{93, 28, -58, -96, -83, 88, 82, -127, 76, 18, -42, -36, -39, 74, 112, -54, 120, 48, -5, -24}, new byte[]{28, 89, -107, -113, -18, 26, 17, -82}));
            cipher.init(2, new SecretKeySpec(str2.getBytes(), C0098a.a(new byte[]{52, 85, -121}, new byte[]{117, 16, -44, 74, 112, -99, 124, 34})), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static String c(String str, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{-111, 68, -36, 0, -14, -116, -23, 7, -128, 74, -52, 124, -124, -98, -53, 76, -76, 104, -31, 72}, new byte[]{-48, 1, -113, 47, -79, -50, -86, 40}));
        cipher.init(1, new SecretKeySpec(bArr, C0098a.a(new byte[]{-35, 32, -25}, new byte[]{-100, 101, -76, 42, -104, -14, -118, 72})), new IvParameterSpec(bArr2));
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(String.format(C0098a.a(new byte[]{-44, -83, 5, 127}, new byte[]{-15, -99, 55, 7, -14, 98, 122, -6}), Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static File d(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            C0213f.a(C0098a.a(new byte[]{-115, -75, -119, 87, 85, 39, 69, 15, -39, -3}, new byte[]{-18, -35, -28, 56, 49, 7, 114, 56}) + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0098a.a(new byte[]{102, -24, -105}, new byte[]{39, -83, -60, 125, -112, -56, -116, -38}));
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

    public static String f(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        return new String(e(bArr, bArr2, bArr3, str));
    }

    public static byte[] g(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), C0098a.a(new byte[]{-67, -102, 82}, new byte[]{-4, -33, 1, -27, 15, -9, -73, -58}));
            Cipher cipher = Cipher.getInstance(C0098a.a(new byte[]{-118, 66, 86, 93, -8, -1, 118, -58, -101, 76, 70, 33, -114, -19, 116, -83, -113, 78, 75, 53}, new byte[]{-53, 7, 5, 114, -69, -67, 53, -23}));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    public static String h(String str) {
        if (str.startsWith(C0098a.a(new byte[]{-22, 56}, new byte[]{-38, 64, 23, 38, -100, 8, -99, -123}))) {
            str = str.substring(2);
        }
        return new String(new BigInteger(str, 16).toByteArray());
    }

    public static File i(String str) {
        File file = new File(str.replace(C0098a.a(new byte[]{-95, -87, -24, -32, -69, -63}, new byte[]{-57, -64, -124, -123, -127, -18, 63, -96}), ""));
        File file2 = new File(str.replace(C0098a.a(new byte[]{-45, 115, -89, -6, -18, -61}, new byte[]{-75, 26, -53, -97, -44, -20, -22, 34}), Environment.getExternalStorageDirectory().getAbsolutePath()));
        return file2.exists() ? file2 : file.exists() ? file : new File(str);
    }

    public static String j(File file) {
        try {
            return k(new FileInputStream(file));
        } catch (Exception unused) {
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

    public static String l(String str) {
        try {
            return k(new FileInputStream(i(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static File m(String str) {
        if (!str.startsWith(C0098a.a(new byte[]{-91}, new byte[]{-117, 10, 70, 48, -57, -88, 93, -17}))) {
            str = C0134u.b(new byte[]{-104}, new byte[]{-74, -61, 9, -15, 96, -2, -78, 68}, new StringBuilder(), str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        File file = new File(C0133t.b(new byte[]{-55, -92}, new byte[]{-99, -14, 43, -37, -99, 85, -99, 55}, sb));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public static File n(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            d(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }
}
