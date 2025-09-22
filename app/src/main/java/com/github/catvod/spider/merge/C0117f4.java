package com.github.catvod.spider.merge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* renamed from: com.github.catvod.spider.merge.f4 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0117f4 {
    /* renamed from: q */
    public static String m598q(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    /* renamed from: xC */
    public static String m599xC(String str) throws IOException {
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(C0131mQ.m678q(str)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i == -1) {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
