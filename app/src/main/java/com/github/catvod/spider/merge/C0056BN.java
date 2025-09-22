package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;

/* renamed from: com.github.catvod.spider.merge.BN */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0056BN extends AbstractC0132ma {
    public C0056BN(String str, String str2, String str3) {
        C0111bw.m559se(str);
        C0111bw.m559se(str2);
        C0111bw.m559se(str3);
        mo127UJ("name", str);
        mo127UJ("publicId", str2);
        mo127UJ("systemId", str3);
        m121BE();
    }

    /* renamed from: BE */
    private void m121BE() {
        if (m122BY("publicId")) {
            mo127UJ("pubSysKey", "PUBLIC");
        } else if (m122BY("systemId")) {
            mo127UJ("pubSysKey", "SYSTEM");
        }
    }

    /* renamed from: BY */
    private boolean m122BY(String str) {
        return !C0157x3.m769Mo(mo126QU(str));
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: F */
    public /* bridge */ /* synthetic */ AbstractC0077NC mo123F() {
        return super.mo123F();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: Mo */
    public /* bridge */ /* synthetic */ String mo124Mo() {
        return super.mo124Mo();
    }

    /* renamed from: Oz */
    public void m125Oz(String str) {
        if (str != null) {
            mo127UJ("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: QU */
    public /* bridge */ /* synthetic */ String mo126QU(String str) {
        return super.mo126QU(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: UJ */
    public /* bridge */ /* synthetic */ AbstractC0077NC mo127UJ(String str, String str2) {
        return super.mo127UJ(str, str2);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: UN */
    void mo128UN(Appendable appendable, int i, C0082OO.p pVar) {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: p */
    public String mo129p() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: q */
    public /* bridge */ /* synthetic */ String mo130q(String str) {
        return super.mo130q(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0132ma, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: se */
    public /* bridge */ /* synthetic */ int mo131se() {
        return super.mo131se();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: yS */
    void mo132yS(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        if (pVar.m325W() != C0082OO.p.EnumC0167p.html || m122BY("publicId") || m122BY("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m122BY("name")) {
            appendable.append(" ").append(mo126QU("name"));
        }
        if (m122BY("pubSysKey")) {
            appendable.append(" ").append(mo126QU("pubSysKey"));
        }
        if (m122BY("publicId")) {
            appendable.append(" \"").append(mo126QU("publicId")).append('\"');
        }
        if (m122BY("systemId")) {
            appendable.append(" \"").append(mo126QU("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
