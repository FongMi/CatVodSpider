package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class d extends v {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.L.v, com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d i() {
        return (d) super.i();
    }

    @Override // com.github.catvod.spider.merge.L.v, com.github.catvod.spider.merge.L.s
    public final String s() {
        return oZP.d("560C13201834");
    }

    @Override // com.github.catvod.spider.merge.L.v, com.github.catvod.spider.merge.L.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append(oZP.d("494E2C022814212E2C")).append(I());
    }

    @Override // com.github.catvod.spider.merge.L.v, com.github.catvod.spider.merge.L.s
    final void w(Appendable appendable, int i, g gVar) {
        try {
            appendable.append(oZP.d("283249"));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.b(e);
        }
    }
}
