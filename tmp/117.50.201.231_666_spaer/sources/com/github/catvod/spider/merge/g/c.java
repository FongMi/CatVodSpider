package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c extends p {
    public c(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.G.p, com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        return (c) super.clone();
    }

    @Override // com.github.catvod.spider.merge.G.p, com.github.catvod.spider.merge.G.m
    public final String t() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.G.p, com.github.catvod.spider.merge.G.m
    final void w(Appendable appendable, int i, f.a aVar) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }

    @Override // com.github.catvod.spider.merge.G.p, com.github.catvod.spider.merge.G.m
    final void x(Appendable appendable, int i, f.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.D.c(e);
        }
    }
}
