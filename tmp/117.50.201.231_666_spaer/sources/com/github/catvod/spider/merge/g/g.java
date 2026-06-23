package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g extends l {
    public g(String str, String str2, String str3) {
        String str4;
        com.github.catvod.spider.merge.E.c.g(str);
        com.github.catvod.spider.merge.E.c.g(str2);
        com.github.catvod.spider.merge.E.c.g(str3);
        super.c("name", str);
        super.c("publicId", str2);
        super.c("systemId", str3);
        if (K("publicId")) {
            str4 = "PUBLIC";
        } else if (!K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.c("pubSysKey", str4);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.F.b.d(super.d(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.c("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.G.l, com.github.catvod.spider.merge.G.m
    public final m m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String t() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.G.m
    final void w(Appendable appendable, int i, f.a aVar) throws IOException {
        if (this.b > 0 && aVar.g()) {
            appendable.append('\n');
        }
        appendable.append((aVar.h() != 1 || K("publicId") || K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (K("name")) {
            appendable.append(" ").append(super.d("name"));
        }
        if (K("pubSysKey")) {
            appendable.append(" ").append(super.d("pubSysKey"));
        }
        if (K("publicId")) {
            appendable.append(" \"").append(super.d("publicId")).append('\"');
        }
        if (K("systemId")) {
            appendable.append(" \"").append(super.d("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.G.m
    final void x(Appendable appendable, int i, f.a aVar) {
    }
}
