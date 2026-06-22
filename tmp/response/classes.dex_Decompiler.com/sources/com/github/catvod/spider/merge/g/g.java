package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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

    @Override // com.github.catvod.spider.merge.G.c
    public final boolean b(int i, Writer writer) throws IOException {
        if (i < this.b || i > this.c) {
            return false;
        }
        writer.write(oZP.d("534C"));
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
