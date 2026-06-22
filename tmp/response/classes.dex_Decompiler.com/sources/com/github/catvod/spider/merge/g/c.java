package com.github.catvod.spider.merge.G;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public abstract class c extends b {
    @Override // com.github.catvod.spider.merge.G.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean b(int i, Writer writer);
}
