package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.I.t0;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    private static final b a = new b();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbB = t0.b("unable to decode base64 string: ");
            sbB.append(e.getMessage());
            throw new c(sbB.toString(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            a.b(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sbB = t0.b("exception encoding base64 string: ");
            sbB.append(e.getMessage());
            throw new d(sbB.toString(), e);
        }
    }
}
