package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class en extends ur {
    public final boolean a(String str) {
        return !ws.j(au(str));
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String s() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final void u(StringBuilder sb, int i, ut utVar) throws IOException {
        if (this.aq > 0 && utVar.c) {
            sb.append('\n');
        }
        if (utVar.f != 1 || a("publicId") || a("systemId")) {
            sb.append("<!DOCTYPE");
        } else {
            sb.append("<!doctype");
        }
        if (a("#doctype")) {
            sb.append(" ").append(au("#doctype"));
        }
        if (a("pubSysKey")) {
            sb.append(" ").append(au("pubSysKey"));
        }
        if (a("publicId")) {
            sb.append(" \"").append(au("publicId")).append('\"');
        }
        if (a("systemId")) {
            sb.append(" \"").append(au("systemId")).append('\"');
        }
        sb.append('>');
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final void v(StringBuilder sb, int i, ut utVar) {
    }
}
