package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i extends q {
    public i(String str, String str2, String str3) {
        String str4;
        C0899d.h(str);
        C0899d.h(str2);
        C0899d.h(str3);
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
        return !C0906c.d(super.c(str));
    }

    public final String L() {
        return super.c("name");
    }

    public final String M() {
        return super.c("publicId");
    }

    public final void N(String str) {
        if (str != null) {
            super.H("pubSysKey", str);
        }
    }

    public final String O() {
        return super.c("systemId");
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String s() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        if (this.c > 0 && gVar.i()) {
            appendable.append('\n');
        }
        appendable.append((gVar.j() != 1 || K("publicId") || K("systemId")) ? "<!DOCTYPE" : "<!doctype");
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

    @Override // com.github.catvod.spider.merge.c1.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
