package com.github.catvod.spider.merge.L;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class d extends s {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: A */
    public final s g() {
        return (d) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.s, com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: clone */
    public final Object g() {
        return (d) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.s, com.github.catvod.spider.merge.L.q
    public final q g() {
        return (d) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.s, com.github.catvod.spider.merge.L.q
    public final String o() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.L.s, com.github.catvod.spider.merge.L.q
    public final void q(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<![CDATA[").append(y());
    }

    @Override // com.github.catvod.spider.merge.L.s, com.github.catvod.spider.merge.L.q
    public final void r(Appendable appendable, int i, g gVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }
}
