package com.github.catvod.spider.merge.m;

import android.os.Build;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0592a {
    public static String a(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    public static String b(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)), "UTF-8");
        } catch (Exception e) {
            StringBuilder sbA = C0529a.a("");
            sbA.append(e.toString());
            SpiderDebug.log(sbA.toString());
            return null;
        }
    }

    public static String c(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str4 = new String(cipher.doFinal(k(str)), "UTF-8");
            SpiderDebug.log("->" + str4);
            return str4;
        } catch (Exception e) {
            StringBuilder sbA = C0529a.a("");
            sbA.append(e.toString());
            SpiderDebug.log(sbA.toString());
            return null;
        }
    }

    public static String d(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String e(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception e) {
            PrintStream printStream = System.out;
            StringBuilder sbA = C0529a.a("dec err::");
            sbA.append(e.toString());
            printStream.println(sbA.toString());
            return null;
        }
    }

    public static String f(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
        Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(Base64.decode(str, 0)));
    }

    public static String g(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String h(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String i(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String j(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrK = k(str);
            byte[] bArr4 = new byte[bArrK.length + bArr3.length];
            System.arraycopy(bArrK, 0, bArr4, 0, bArrK.length);
            System.arraycopy(bArr3, 0, bArr4, bArrK.length, bArr3.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            int i = Build.VERSION.SDK_INT;
            GCMParameterSpec gCMParameterSpec = i >= 19 ? new GCMParameterSpec(128, bArr2) : null;
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (i >= 19) {
                cipher.init(2, secretKeySpec, gCMParameterSpec);
            }
            return new String(cipher.doFinal(bArr4), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("invalid hex string");
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StringBuilder sbA = C0529a.a("");
            int i3 = i + 1;
            sbA.append(charArray[i]);
            sbA.append(charArray[i3]);
            bArr[i2] = new Integer(Integer.parseInt(sbA.toString(), 16) & 255).byteValue();
            i = i3 + 1;
            i2++;
        }
        return bArr;
    }

    public static byte[] l(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (Exception unused) {
            return "".getBytes();
        }
    }
}
