package com.github.catvod.spider.merge.HN;

import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class r {
    final TimeZone a;
    final int b;

    r(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
