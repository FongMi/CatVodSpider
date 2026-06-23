package com.github.catvod.spider.merge.A0;

import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class st extends sd {
    public abstract boolean a(int i, StringWriter stringWriter);

    @Override // com.github.catvod.spider.merge.A0.sd
    public final int c(String str, int i, StringWriter stringWriter) {
        return a(Character.codePointAt(str, i), stringWriter) ? 1 : 0;
    }
}
