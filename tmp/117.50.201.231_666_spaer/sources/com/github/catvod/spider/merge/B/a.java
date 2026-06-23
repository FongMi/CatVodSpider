package com.github.catvod.spider.merge.B;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class a extends b {
    private final b[] b;

    public a(b... bVarArr) {
        this.b = (b[]) ((Object[]) bVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.B.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        for (b bVar : this.b) {
            int iA = bVar.a(charSequence, i, writer);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
