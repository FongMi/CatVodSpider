package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.Z */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0105Z extends C0127lK {

    /* renamed from: FN */
    private final C0116dX f556FN;

    public C0105Z(C0073Lt c0073Lt, String str, C0094Tz c0094Tz) {
        super(c0073Lt, str, c0094Tz);
        this.f556FN = new C0116dX();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: U */
    protected void mo268U(AbstractC0077NC abstractC0077NC) {
        super.mo268U(abstractC0077NC);
        this.f556FN.remove(abstractC0077NC);
    }

    /* renamed from: Zu */
    public C0105Z m480Zu(C0127lK c0127lK) {
        this.f556FN.add(c0127lK);
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0127lK, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: zw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0105Z clone() {
        return (C0105Z) super.mo314L();
    }
}
