package com.github.catvod.spider.merge;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.github.catvod.spider.merge.Nx */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0079Nx {
    /* renamed from: q */
    public static String m309q(String str, String str2, String str3) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(str2.getBytes()));
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec(str3.getBytes()));
        return new String(cipher.doFinal(C0088Qt.m415q(str)), "utf-8");
    }
}
