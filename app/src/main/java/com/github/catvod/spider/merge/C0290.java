package com.github.catvod.spider.merge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.މ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0290 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m1071(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString(SOY.d("2F06175B4C"));
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }
}
