package com.github.catvod.spider.merge.p;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0220m {
    static volatile C0206C a = new C0206C();

    public static String a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString(C0098a.a(new byte[]{48, -126, -108, 9, 85}, new byte[]{101, -42, -46, 36, 109, 71, 90, -94}));
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    private static SharedPreferences b() {
        return Init.context().getSharedPreferences(Init.context().getPackageName() + C0098a.a(new byte[]{-75, -29, -20, -115, -74, 82, -51, -118, -124, -16, -5, -101}, new byte[]{-22, -109, -98, -24, -48, 55, -65, -17}), 0);
    }

    public static String c(String str) {
        return b().getString(str, "");
    }

    public static void d(String str, Object obj) {
        b().edit().putString(str, (String) obj).apply();
    }
}
