package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class u implements t {
    public final String a;

    public u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.a);
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        return this.a.length();
    }
}
