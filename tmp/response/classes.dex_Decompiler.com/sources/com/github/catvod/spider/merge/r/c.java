package com.github.catvod.spider.merge.R;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c extends g {
    @Override // com.github.catvod.spider.merge.R.b
    protected final int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        if (i2 < 161) {
            return -1;
        }
        return (((i2 - 161) * 94) + (bArr[i + 1] & 255)) - 161;
    }
}
