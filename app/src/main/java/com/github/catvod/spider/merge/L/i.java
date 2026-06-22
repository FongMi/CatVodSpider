package com.github.catvod.spider.merge.L;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class i extends p {
    public i(String str, String str2, String str3) {
        String str4;
        com.github.catvod.spider.merge.J.b.f(str);
        com.github.catvod.spider.merge.J.b.f(str2);
        com.github.catvod.spider.merge.J.b.f(str3);
        x("name", str);
        x("publicId", str2);
        x("systemId", str3);
        if (A("publicId")) {
            str4 = "PUBLIC";
        } else if (!A("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        x("pubSysKey", str4);
    }

    public final boolean A(String str) {
        return !com.github.catvod.spider.merge.K.b.d(c(str));
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String o() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final void q(Appendable appendable, int i, g gVar) throws IOException {
        if (this.b > 0 && gVar.e) {
            appendable.append('\n');
        }
        appendable.append((gVar.h != 1 || A("publicId") || A("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (A("name")) {
            appendable.append(" ").append(c("name"));
        }
        if (A("pubSysKey")) {
            appendable.append(" ").append(c("pubSysKey"));
        }
        if (A("publicId")) {
            appendable.append(" \"").append(c("publicId")).append('\"');
        }
        if (A("systemId")) {
            appendable.append(" \"").append(c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final void r(Appendable appendable, int i, g gVar) {
    }
}
