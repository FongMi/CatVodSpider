package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Oi extends FR {
    public Oi(String str, String str2, String str3) {
        Rc.HM(str);
        Rc.HM(str2);
        Rc.HM(str3);
        b("name", str);
        b("publicId", str2);
        b("systemId", str3);
        B();
    }

    private void B() {
        if (x("publicId")) {
            b("pubSysKey", "PUBLIC");
        } else if (x("systemId")) {
            b("pubSysKey", "SYSTEM");
        }
    }

    private boolean x(String str) {
        return !tv.l(T4(str));
    }

    public void FG(String str) {
        if (str != null) {
            b("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ int HM() {
        return super.HM();
    }

    @Override // com.github.catvod.spider.merge.A0
    public String Q() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.A0
    void R(Appendable appendable, int i, g9.aA aAVar) {
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String T4(String str) {
        return super.T4(str);
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ A0 b(String str, String str2) {
        return super.b(str, str2);
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String l8(String str) {
        return super.l8(str);
    }

    @Override // com.github.catvod.spider.merge.A0
    void r1(Appendable appendable, int i, g9.aA aAVar) throws IOException {
        if (aAVar.n() != g9.aA.EnumC0001aA.html || x("publicId") || x("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (x("name")) {
            appendable.append(" ").append(T4("name"));
        }
        if (x("pubSysKey")) {
            appendable.append(" ").append(T4("pubSysKey"));
        }
        if (x("publicId")) {
            appendable.append(" \"").append(T4("publicId")).append('\"');
        }
        if (x("systemId")) {
            appendable.append(" \"").append(T4("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ A0 s() {
        return super.s();
    }
}
