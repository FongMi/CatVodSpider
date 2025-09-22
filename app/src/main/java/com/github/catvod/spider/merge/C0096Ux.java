package com.github.catvod.spider.merge;

import org.apache.commons.logging.LogFactory;

/* renamed from: com.github.catvod.spider.merge.Ux */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0096Ux extends AbstractC0148tY {
    public C0096Ux() {
        super("Apache Common Logging");
        mo467q(LogFactory.class);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0148tY
    /* renamed from: q */
    protected void mo467q(Class<?> cls) {
        super.mo467q(cls);
        m715QU(C0096Ux.class);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0148tY
    /* renamed from: xC */
    public InterfaceC0074MS m716u(Class<?> cls) {
        try {
            return new C0103Y(cls);
        } catch (Exception unused) {
            return new C0072LA(cls);
        }
    }
}
