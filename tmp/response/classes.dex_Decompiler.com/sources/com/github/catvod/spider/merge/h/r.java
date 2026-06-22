package com.github.catvod.spider.merge.H;

import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class r {
    final TimeZone a;
    final int b;

    r(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
