package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xv extends st {
    public final int b;
    public final int d;

    public xv(int i, int i2) {
        this.b = i;
        this.d = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.st
    public final boolean a(int i, StringWriter stringWriter) throws IOException {
        if (i < this.b || i > this.d) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
