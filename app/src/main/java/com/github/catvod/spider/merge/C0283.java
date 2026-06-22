package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޅ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0283 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static byte[] m1039(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, SOY.d("3B1702"));
            Cipher cipher = Cipher.getInstance(SOY.d("3B1702593735397D013D37244D023012101E1435"));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
