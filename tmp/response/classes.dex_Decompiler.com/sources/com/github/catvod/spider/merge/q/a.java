package com.github.catvod.spider.merge.Q;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a extends b {
    @Override // com.github.catvod.spider.merge.Q.b
    protected final int b(byte[] bArr, int i) {
        int i2;
        if ((bArr[i] & 255) != 164 || (i2 = bArr[i + 1] & 255) < 161 || i2 > 243) {
            return -1;
        }
        return i2 - 161;
    }
}
