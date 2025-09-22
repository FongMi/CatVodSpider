package com.github.catvod.spider.merge;

import java.util.List;

/* renamed from: com.github.catvod.spider.merge.ma */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class AbstractC0132ma extends AbstractC0077NC {

    /* renamed from: UJ */
    Object f725UJ;

    AbstractC0132ma() {
    }

    /* renamed from: id */
    private void m680id() {
        if (mo275k()) {
            return;
        }
        Object obj = this.f725UJ;
        C0094Tz c0094Tz = new C0094Tz();
        this.f725UJ = c0094Tz;
        if (obj != null) {
            c0094Tz.m459go(mo129p(), (String) obj);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: F */
    public AbstractC0077NC mo123F() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: Mo */
    public String mo124Mo() {
        return m267Tz() ? mo278pb().mo124Mo() : "";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: QU */
    public String mo126QU(String str) {
        C0111bw.m559se(str);
        return !mo275k() ? str.equals(mo129p()) ? (String) this.f725UJ : "" : super.mo126QU(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: RH */
    protected List<AbstractC0077NC> mo265RH() {
        return AbstractC0077NC.f459q;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: UJ */
    public AbstractC0077NC mo127UJ(String str, String str2) {
        if (mo275k() || !str.equals(mo129p())) {
            m680id();
            super.mo127UJ(str, str2);
        } else {
            this.f725UJ = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: V */
    public AbstractC0132ma mo255B(AbstractC0077NC abstractC0077NC) {
        AbstractC0132ma abstractC0132ma = (AbstractC0132ma) super.mo255B(abstractC0077NC);
        if (mo275k()) {
            abstractC0132ma.f725UJ = ((C0094Tz) this.f725UJ).clone();
        }
        return abstractC0132ma;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: k */
    protected final boolean mo275k() {
        return this.f725UJ instanceof C0094Tz;
    }

    /* renamed from: mT */
    String m682mT() {
        return mo126QU(mo129p());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: q */
    public String mo130q(String str) {
        m680id();
        return super.mo130q(str);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: se */
    public int mo131se() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: u */
    public final C0094Tz mo282u() {
        m680id();
        return (C0094Tz) this.f725UJ;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: w8 */
    protected void mo283w8(String str) {
    }
}
