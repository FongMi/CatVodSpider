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

/* renamed from: com.github.catvod.spider.merge.dC */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0114dC {
    /* renamed from: Mo */
    public static PrivateKey m573Mo(String str) {
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(C0131mQ.m678q(str)));
    }

    /* renamed from: QU */
    public static String m574QU(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        String str3 = "error";
        byte[] bArrM678q = C0131mQ.m678q(str2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PublicKey publicKeyM576i = m576i(str);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, publicKeyM576i);
            int length = bArrM678q.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    break;
                }
                byte[] bArrDoFinal = i3 > 128 ? cipher.doFinal(bArrM678q, i, 128) : cipher.doFinal(bArrM678q, i, i3);
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

    /* renamed from: UJ */
    public static String m575UJ(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0131mQ.m678q(str))));
            int length = str2.getBytes().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return C0131mQ.m679xC(byteArray);
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

    /* renamed from: i */
    private static PublicKey m576i(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0131mQ.m678q(str)));
    }

    /* renamed from: q */
    public static String m577q(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] bArr;
        PrivateKey privateKeyM573Mo = m573Mo(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKeyM573Mo);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C0131mQ.m678q(str));
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

    /* renamed from: u */
    public static String m578u(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            PublicKey publicKeyM576i = m576i(str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyM576i);
            return new String(C0131mQ.m679xC(cipher.doFinal(str.getBytes("UTF-8"))));
        } catch (Exception e) {
            System.out.println("sadsad4" + e);
            return null;
        }
    }

    /* renamed from: xC */
    public static String m579xC(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyM576i = m576i(str);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKeyM576i);
        return new String(cipher.doFinal(C0131mQ.m678q(str2)));
    }
}
