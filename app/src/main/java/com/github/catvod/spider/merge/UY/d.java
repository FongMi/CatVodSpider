package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends v {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.UY.v, com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d i() {
        return (d) super.i();
    }

    @Override // com.github.catvod.spider.merge.UY.v, com.github.catvod.spider.merge.UY.s
    public final String s() {
        return ZrJ.d("5A202F2C3C24");
    }

    @Override // com.github.catvod.spider.merge.UY.v, com.github.catvod.spider.merge.UY.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append(ZrJ.d("4562100E0C042D0210")).append(I());
    }

    @Override // com.github.catvod.spider.merge.UY.v, com.github.catvod.spider.merge.UY.s
    final void w(Appendable appendable, int i, g gVar) {
        try {
            appendable.append(ZrJ.d("241E75"));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.XI.w(e);
        }
    }
}
