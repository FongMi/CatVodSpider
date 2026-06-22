package com.github.catvod.en;

import android.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class TimeBasedEncryption {
    private static PublicKey a;

    static {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv70LA/hdYBX4q6Ssv63LgPUMCgGNeodU8kgiTYjFbS7JssMKNMCKEi6c4OKv4n2ovXcutysHAPh6lnis6WEp4YJILsh8uAQO5xm7bRGcxKoGZkPzg4aTByKA7eIcv4rz2HIqjRpG8zwlILpGHWrDbwnH2gKidR3X74mXrDLOnUc3pr3n8MhtpfQtKuGqgi8ys7UMRHmEWpy+gkD0xQLc8uv9r3nCJnom1hgBcBDtbIthQHlHme9CCM7lfx7++Wu/lgSvcqdNx9kkBFyKMJgofLn1dt2ercDWwpSlhNjuJw7V70ws46v+ddFK+lYp3oinCCMncnpAMRHVGFe70ZT+fwIDAQAB", 0));
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode("FIXED_PRIVATE_KEY", 0));
            a = keyFactory.generatePublic(x509EncodedKeySpec);
            keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        byte[] bytes = (str + ":" + simpleDateFormat.format(new Date())).getBytes();
        PublicKey publicKey = a;
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        return Base64.encodeToString(cipher.doFinal(bytes), 0);
    }

    public static String extracted(String str) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        return encrypt(str);
    }
}
