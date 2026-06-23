package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.H.g;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class XiongdiPan extends Pan {
    public static final byte[] a = "1234567812345678".getBytes(StandardCharsets.UTF_8);
    public String b = "";

    public static String encryptForCookie(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = a;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str = "https://www.xiongdipan.com" + list.get(0).replace("s/", "cv/");
        String str2 = "https://www.xiongdipan.com" + list.get(0);
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapB.put("Cookie", this.b);
        mapB.put("referer", str2);
        Matcher matcher = Pattern.compile("https://pan\\.baidu\\.com/s/[\\w\\-]+(?:\\?pwd=[\\w\\-]+)?").matcher(C0575b.b(str, mapB));
        return super.detailContent(Collections.singletonList(matcher.find() ? matcher.group() : null));
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) {
        StringBuilder sb = new StringBuilder("ck_ml_sea_=");
        HashMap mapB = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapB.put("Cookie", this.b);
        Matcher matcher = Pattern.compile("start_load\\(\"([a-f0-9]+)\"\\)").matcher(C0575b.l("https://www.xiongdipan.com", mapB));
        sb.append(encryptForCookie((!matcher.find() || matcher.group(1) == null) ? null : matcher.group(1)));
        this.b = sb.toString();
        String strG = com.github.catvod.spider.merge.A.a.g("https://www.xiongdipan.com/search?page=", str2, "&k=", str, "&s=2&t=-1");
        HashMap mapB2 = v.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapB2.put("Cookie", this.b);
        com.github.catvod.spider.merge.I.c cVarN0 = g.d(C0575b.l(strG, mapB2)).n0("van-row");
        ArrayList arrayList = new ArrayList();
        for (i iVar : cVarN0) {
            C0554e c0554e = new C0554e();
            if (!iVar.n0("div[style*=medium]").isEmpty()) {
                com.github.catvod.spider.merge.I.c cVarN02 = iVar.n0("div[style*=medium]");
                c0554e.k((cVarN02.isEmpty() ? null : cVarN02.get(0)).t0());
                c0554e.j(iVar.n0("a").a("href"));
                if (iVar.n0("a").a("href").contains("/s/")) {
                    c0554e.l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg");
                    arrayList.add(c0554e);
                }
            }
        }
        return C0552c.n(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
