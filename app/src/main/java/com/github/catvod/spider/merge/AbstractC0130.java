package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ː, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0130 extends AbstractC0191 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    Object f324;

    AbstractC0130() {
    }

    /* JADX INFO: renamed from: ޡ, reason: contains not printable characters */
    private void m429() {
        if (mo168()) {
            return;
        }
        Object obj = this.f324;
        C0542 c0542 = new C0542();
        this.f324 = c0542;
        if (obj != null) {
            c0542.m1761(mo122(), (String) obj);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: Ϳ */
    public String mo116(String str) {
        m429();
        return super.mo116(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ԩ */
    public String mo117(String str) {
        C0034.m284(str);
        return !mo168() ? str.equals(mo122()) ? (String) this.f324 : "" : super.mo117(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public AbstractC0191 mo430(String str, String str2) {
        if (mo168() || !str.equals(mo122())) {
            m429();
            super.mo430(str, str2);
        } else {
            this.f324 = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ԫ */
    public final C0542 mo164() {
        m429();
        return (C0542) this.f324;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: Ԭ */
    public String mo118() {
        return m686() ? mo170().mo118() : "";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ԯ */
    public int mo119() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ށ */
    protected void mo166(String str) {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ނ */
    public AbstractC0191 mo121() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ރ */
    protected List<AbstractC0191> mo167() {
        return AbstractC0191.f476;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ޅ */
    protected final boolean mo168() {
        return this.f324 instanceof C0542;
    }

    /* JADX INFO: renamed from: ޟ, reason: contains not printable characters */
    String m431() {
        return mo117(mo122());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ޠ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC0130 mo165(AbstractC0191 abstractC0191) {
        AbstractC0130 abstractC0130 = (AbstractC0130) super.mo165(abstractC0191);
        if (mo168()) {
            abstractC0130.f324 = ((C0542) this.f324).clone();
        }
        return abstractC0130;
    }
}
