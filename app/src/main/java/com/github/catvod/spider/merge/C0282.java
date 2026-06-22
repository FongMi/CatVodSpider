package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ބ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0282 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m1038(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance(SOY.d("3B1702593735397D013D37244D023012101E1435"));
            cipher.init(2, new SecretKeySpec(str2.getBytes(), SOY.d("3B1702")), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
