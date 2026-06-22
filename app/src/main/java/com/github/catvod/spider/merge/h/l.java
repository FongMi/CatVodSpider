package com.github.catvod.spider.merge.H;

import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class l {
    public final TimeZone a;
    public final int b;

    public l(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
