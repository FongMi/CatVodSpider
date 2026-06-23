package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d extends v {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.FM.K.v, com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d i() {
        return (d) super.i();
    }

    @Override // com.github.catvod.spider.merge.FM.K.v, com.github.catvod.spider.merge.FM.K.s
    public final String s() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.FM.K.v, com.github.catvod.spider.merge.FM.K.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }

    @Override // com.github.catvod.spider.merge.FM.K.v, com.github.catvod.spider.merge.FM.K.s
    final void w(Appendable appendable, int i, g gVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.FM.H.b(e);
        }
    }
}
