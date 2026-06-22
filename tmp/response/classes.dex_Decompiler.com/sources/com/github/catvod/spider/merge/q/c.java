package com.github.catvod.spider.merge.Q;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c extends b {
    @Override // com.github.catvod.spider.merge.Q.b
    protected final int b(byte[] bArr, int i) {
        int i2;
        if ((bArr[i] & 255) != 130 || (i2 = bArr[i + 1] & 255) < 159 || i2 > 241) {
            return -1;
        }
        return i2 - 159;
    }
}
