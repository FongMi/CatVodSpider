package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rm extends vy {
    @Override // com.github.catvod.spider.merge.A0.vy
    /* JADX INFO: renamed from: a */
    public final vy clone() {
        return (rm) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.vy, com.github.catvod.spider.merge.A0.fw
    /* JADX INFO: renamed from: b */
    public final fw clone() {
        return (rm) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.vy, com.github.catvod.spider.merge.A0.fw
    public final Object clone() {
        return (rm) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.vy, com.github.catvod.spider.merge.A0.fw
    public final String s() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.A0.vy, com.github.catvod.spider.merge.A0.fw
    public final void u(StringBuilder sb, int i, ut utVar) throws IOException {
        sb.append("<![CDATA[").append(f());
    }

    @Override // com.github.catvod.spider.merge.A0.vy, com.github.catvod.spider.merge.A0.fw
    public final void v(StringBuilder sb, int i, ut utVar) {
        sb.append("]]>");
    }
}
