package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class A implements z {
    private final String a;

    A(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.a);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a.length();
    }
}
