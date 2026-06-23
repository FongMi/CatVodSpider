package com.github.catvod.spider.merge.C0.c0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d extends u {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.C0.c0.u, com.github.catvod.spider.merge.C0.c0.r
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d j() {
        return (d) super.j();
    }

    @Override // com.github.catvod.spider.merge.C0.c0.u, com.github.catvod.spider.merge.C0.c0.r
    public final String t() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.C0.c0.u, com.github.catvod.spider.merge.C0.c0.r
    final void w(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }

    @Override // com.github.catvod.spider.merge.C0.c0.u, com.github.catvod.spider.merge.C0.c0.r
    final void x(Appendable appendable, int i, g gVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.C0.Z.b(e);
        }
    }
}
