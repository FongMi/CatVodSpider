package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0255 extends AbstractC0110 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final int f645;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final int f646;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final boolean f647;

    private C0255(int i, int i2, boolean z) {
        this.f645 = i;
        this.f646 = i2;
        this.f647 = z;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static C0255 m915(int i, int i2) {
        return new C0255(i, i2, true);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0110
    /* JADX INFO: renamed from: Ԭ */
    public boolean mo391(int i, Writer writer) throws IOException {
        if (this.f647) {
            if (i < this.f645 || i > this.f646) {
                return false;
            }
        } else if (i >= this.f645 && i <= this.f646) {
            return false;
        }
        writer.write(SOY.d("5C71"));
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
