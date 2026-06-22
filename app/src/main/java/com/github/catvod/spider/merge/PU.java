package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class PU extends DQ {
    public PU(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.DQ, com.github.catvod.spider.merge.A0
    public String Q() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.DQ, com.github.catvod.spider.merge.A0
    void R(Appendable appendable, int i, g9.aA aAVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new VU(e);
        }
    }

    @Override // com.github.catvod.spider.merge.DQ
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public PU v() {
        return (PU) super.v();
    }

    @Override // com.github.catvod.spider.merge.DQ, com.github.catvod.spider.merge.A0
    void r1(Appendable appendable, int i, g9.aA aAVar) throws IOException {
        appendable.append("<![CDATA[").append(FG());
    }
}
