package com.github.catvod.spider.merge;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʸ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public abstract class AbstractC0110 extends AbstractC0108 {
    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ */
    public final int mo363(CharSequence charSequence, int i, Writer writer) {
        return mo391(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public abstract boolean mo391(int i, Writer writer);
}
