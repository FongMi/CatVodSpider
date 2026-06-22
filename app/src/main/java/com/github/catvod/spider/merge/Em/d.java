package com.github.catvod.spider.merge.Em;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends u {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.Em.u, com.github.catvod.spider.merge.Em.r
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d j() {
        return (d) super.j();
    }

    @Override // com.github.catvod.spider.merge.Em.u, com.github.catvod.spider.merge.Em.r
    public final String t() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.Em.u, com.github.catvod.spider.merge.Em.r
    final void w(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }

    @Override // com.github.catvod.spider.merge.Em.u, com.github.catvod.spider.merge.Em.r
    final void x(Appendable appendable, int i, g gVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Dw.r(e);
        }
    }
}
