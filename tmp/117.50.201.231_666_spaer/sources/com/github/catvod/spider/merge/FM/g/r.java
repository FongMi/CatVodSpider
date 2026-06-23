package com.github.catvod.spider.merge.FM.G;

import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class r {
    final TimeZone a;
    final int b;

    r(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
