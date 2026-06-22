package com.github.catvod.spider.merge.G;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class a extends b {
    private final b[] b;

    public a(b... bVarArr) {
        this.b = (b[]) ((Object[]) bVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.G.b
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
