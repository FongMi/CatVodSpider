package com.github.catvod.spider.merge.c1;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends v {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.c1.v, com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final d i() {
        return (d) super.i();
    }

    @Override // com.github.catvod.spider.merge.c1.v, com.github.catvod.spider.merge.c1.s
    public final String s() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.c1.v, com.github.catvod.spider.merge.c1.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }

    @Override // com.github.catvod.spider.merge.c1.v, com.github.catvod.spider.merge.c1.s
    final void w(Appendable appendable, int i, g gVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.b(e);
        }
    }
}
