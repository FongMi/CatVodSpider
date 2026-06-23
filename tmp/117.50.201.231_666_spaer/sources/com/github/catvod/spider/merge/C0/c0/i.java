package com.github.catvod.spider.merge.C0.c0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i extends p {
    public i(String str, String str2, String str3) {
        String str4;
        com.github.catvod.spider.merge.C0.N.a.k(str);
        com.github.catvod.spider.merge.C0.N.a.k(str2);
        com.github.catvod.spider.merge.C0.N.a.k(str3);
        super.b("name", str);
        super.b("publicId", str2);
        super.b("systemId", str3);
        if (K("publicId")) {
            str4 = "PUBLIC";
        } else if (!K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.b("pubSysKey", str4);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.C0.b0.b.c(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.b("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.C0.c0.p, com.github.catvod.spider.merge.C0.c0.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.p, com.github.catvod.spider.merge.C0.c0.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final String t() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    final void w(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append((gVar.g() != 1 || K("publicId") || K("systemId")) ? "<!DOCTYPE" : "<!doctype");
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

    @Override // com.github.catvod.spider.merge.C0.c0.r
    final void x(Appendable appendable, int i, g gVar) {
    }
}
