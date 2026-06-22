package com.github.catvod.spider.merge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class xv {
    private static PublicKey HM(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(MN.l8(str)));
    }

    public static PrivateKey N(String str) {
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(MN.l8(str)));
    }

    public static String OL(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(MN.l8(str))));
            int length = str2.getBytes().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return MN.S(byteArray);
                }
                byte[] bArrDoFinal = i3 > 117 ? cipher.doFinal(str2.getBytes(), i, 117) : cipher.doFinal(str2.getBytes(), i, i3);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i2++;
                i = i2 * 117;
            }
        } catch (Exception unused) {
            return "error";
        }
    }

    public static String S(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] bArr;
        PrivateKey privateKeyN = N(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKeyN);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MN.l8(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[256];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                return new String(byteArrayOutputStream.toByteArray());
            }
            if (256 == i) {
                bArr = bArr2;
            } else {
                bArr = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = bArr2[i2];
                }
            }
            byteArrayOutputStream.write(cipher.doFinal(bArr));
        }
    }

    public static String T4(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyHM = HM(str);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKeyHM);
        return new String(cipher.doFinal(MN.l8(str2)));
    }

    public static String b(String str, String str2) {
        String str3 = "error";
        byte[] bArrL8 = MN.l8(str2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PublicKey publicKeyHM = HM(str);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, publicKeyHM);
            int length = bArrL8.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    break;
                }
                byte[] bArrDoFinal = i3 > 128 ? cipher.doFinal(bArrL8, i, 128) : cipher.doFinal(bArrL8, i, i3);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i2++;
                i = i2 * 128;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            if (byteArray == null) {
                return "error";
            }
            str3 = new String(byteArray);
            return str3;
        } catch (Exception unused) {
            return str3;
        }
    }

    public static String l(String str, String str2) {
        try {
            PublicKey publicKeyHM = HM(str2);
            System.out.println(str);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyHM);
            return new String(MN.S(cipher.doFinal(str.getBytes("UTF-8"))));
        } catch (Exception e) {
            System.out.println("sadsad4" + e);
            return null;
        }
    }

    public static String l8(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] bArr;
        PrivateKey privateKeyN = N(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKeyN);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MN.l8(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[128];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                return new String(byteArrayOutputStream.toByteArray());
            }
            if (128 == i) {
                bArr = bArr2;
            } else {
                bArr = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = bArr2[i2];
                }
            }
            byteArrayOutputStream.write(cipher.doFinal(bArr));
        }
    }

    public static String tT(String str, String str2) {
        try {
            PublicKey publicKeyHM = HM(str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyHM);
            byte[] bytes = str.getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (i < bytes.length) {
                int iMin = Math.min(bytes.length - i, 117);
                byteArrayOutputStream.write(cipher.doFinal(bytes, i, iMin));
                i += iMin;
            }
            return MN.S(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            System.out.println("加密失败: " + e);
            return null;
        }
    }
}
