package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum nj extends vs {
    public nj() {
        super("BIG_DECIMAL", 3);
    }

    @Override // com.github.catvod.spider.merge.A0.vs
    public final Number a(rd rdVar) throws IOException {
        String strAi = rdVar.ai();
        try {
            return sk.d(strAi);
        } catch (NumberFormatException e) {
            throw new tv("Cannot parse " + strAi + "; at path " + rdVar.w(true), e);
        }
    }
}
