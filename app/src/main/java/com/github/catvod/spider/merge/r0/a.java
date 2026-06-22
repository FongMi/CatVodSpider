package com.github.catvod.spider.merge.R0;

import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public final class a extends b {
    private final b[] b;

    public a(b... bVarArr) {
        this.b = (b[]) ((Object[]) bVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.R0.b
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
