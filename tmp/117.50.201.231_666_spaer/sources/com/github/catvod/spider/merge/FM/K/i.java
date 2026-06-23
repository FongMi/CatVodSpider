package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i extends q {
    public i(String str, String str2, String str3) {
        String str4;
        com.github.catvod.spider.merge.FM.I.c.g(str);
        com.github.catvod.spider.merge.FM.I.c.g(str2);
        com.github.catvod.spider.merge.FM.I.c.g(str3);
        super.H("name", str);
        super.H("publicId", str2);
        super.H("systemId", str3);
        if (K("publicId")) {
            str4 = "PUBLIC";
        } else if (!K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.H("pubSysKey", str4);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.FM.J.b.d(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.H("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.K.q, com.github.catvod.spider.merge.FM.K.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final String s() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (this.b > 0 && gVar.i()) {
            appendable.append('\n');
        }
        appendable.append((gVar.k() != 1 || K("publicId") || K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (K("name")) {
            appendable.append(" ").append(super.c("name"));
        }
        if (K("pubSysKey")) {
            appendable.append(" ").append(super.c("pubSysKey"));
        }
        if (K("publicId")) {
            appendable.append(" \"").append(super.c("publicId")).append('\"');
        }
        if (K("systemId")) {
            appendable.append(" \"").append(super.c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
