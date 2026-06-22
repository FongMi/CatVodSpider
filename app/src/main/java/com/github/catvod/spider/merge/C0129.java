package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˏ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0129 extends AbstractC0110 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final int f321;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final int f322;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final boolean f323;

    protected C0129(int i, int i2, boolean z) {
        this.f321 = i;
        this.f322 = i2;
        this.f323 = z;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0110
    /* JADX INFO: renamed from: Ԭ */
    public boolean mo391(int i, Writer writer) throws IOException {
        if (this.f323) {
            if (i < this.f321 || i > this.f322) {
                return false;
            }
        } else if (i >= this.f321 && i <= this.f322) {
            return false;
        }
        if (i > 65535) {
            writer.write(mo384(i));
            return true;
        }
        writer.write(SOY.d("2627"));
        char[] cArr = AbstractC0108.f282;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }

    /* JADX INFO: renamed from: ԭ */
    protected String mo384(int i) {
        throw null;
    }
}
