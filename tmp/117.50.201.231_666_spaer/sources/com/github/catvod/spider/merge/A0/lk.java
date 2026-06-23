package com.github.catvod.spider.merge.A0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class lk {
    public static String a(byte[] bArr) throws IOException {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ha haVar, pb pbVar, pb pbVar2) {
        try {
            qf.e(jo.i, hj.a(((qi) haVar).create(pbVar, pbVar2)));
        } catch (Throwable th) {
            pbVar2.resumeWith(act.b(th));
        }
    }
}
