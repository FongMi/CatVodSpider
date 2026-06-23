package com.github.catvod.spider.merge.B;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class g extends c {
    private final int b;
    private final int c;

    private g(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static g c(int i, int i2) {
        return new g(i, i2);
    }

    @Override // com.github.catvod.spider.merge.B.c
    public final boolean b(int i, Writer writer) throws IOException {
        if (i < this.b || i > this.c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
