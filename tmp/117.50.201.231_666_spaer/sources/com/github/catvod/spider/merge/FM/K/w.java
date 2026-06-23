package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class w extends q {
    private final boolean e;

    public w(String str, boolean z) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        this.d = str;
        this.e = z;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final s i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String s() {
        return "#declaration";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<").append(this.e ? "!" : "?").append(I());
        c cVarD = d();
        cVarD.getClass();
        int i2 = 0;
        while (true) {
            if (i2 >= cVarD.a || !cVarD.t(cVarD.b[i2])) {
                if (!(i2 < cVarD.a)) {
                    break;
                }
                a aVar = new a(cVarD.b[i2], (String) cVarD.c[i2], cVarD);
                int i3 = i2 + 1;
                String strA = aVar.a();
                String value = aVar.getValue();
                if (!strA.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(strA);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        o.d(appendable, value, gVar, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            } else {
                i2++;
            }
        }
        appendable.append(this.e ? "!" : "?").append(">");
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
