package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lf implements u {
    public final String a;

    public lf(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.a);
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        return this.a.length();
    }
}
