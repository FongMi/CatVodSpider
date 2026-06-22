package com.github.catvod.spider.merge.R0;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public abstract class c extends b {
    @Override // com.github.catvod.spider.merge.R0.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean b(int i, Writer writer);
}
