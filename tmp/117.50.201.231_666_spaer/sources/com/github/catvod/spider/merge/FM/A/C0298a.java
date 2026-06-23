package com.github.catvod.spider.merge.FM.a;

import com.github.catvod.spider.merge.FM.b0.b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0298a implements com.github.catvod.spider.merge.FM.b0.a {
    public static String b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }

    @Override // com.github.catvod.spider.merge.FM.b0.a
    public b a(String str) {
        return com.github.catvod.spider.merge.FM.d0.b.a;
    }
}
