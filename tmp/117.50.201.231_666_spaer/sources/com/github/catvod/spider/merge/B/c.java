package com.github.catvod.spider.merge.B;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public abstract class c extends b {
    @Override // com.github.catvod.spider.merge.B.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean b(int i, Writer writer);
}
