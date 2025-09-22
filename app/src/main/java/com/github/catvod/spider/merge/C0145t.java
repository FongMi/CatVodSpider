package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;

/* renamed from: com.github.catvod.spider.merge.t */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0145t extends C0119h {
    public C0145t(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.C0119h, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0145t mo314L() {
        return (C0145t) super.mo314L();
    }

    @Override // com.github.catvod.spider.merge.C0119h, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: UN */
    void mo128UN(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C0161ze(e);
        }
    }

    @Override // com.github.catvod.spider.merge.C0119h, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: p */
    public String mo129p() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.C0119h, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: yS */
    void mo132yS(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        appendable.append("<![CDATA[").append(m610Oz());
    }
}
