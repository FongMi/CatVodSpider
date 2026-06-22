package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class A implements z {
    private final String a;

    A(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.a);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return this.a.length();
    }
}
