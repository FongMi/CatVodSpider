package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ഽ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0448 extends C0011 {

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private final C0455 f1108;

    public C0448(C0039 c0039, String str, C0542 c0542) {
        super(c0039, str, c0542);
        this.f1108 = new C0455();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ޕ */
    protected void mo694(AbstractC0191 abstractC0191) {
        super.mo694(abstractC0191);
        this.f1108.remove(abstractC0191);
    }

    /* JADX INFO: renamed from: ࢼ, reason: contains not printable characters */
    public C0448 m1678(C0011 c0011) {
        this.f1108.add(c0011);
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0011
    /* JADX INFO: renamed from: ࢽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0448 mo120() {
        return (C0448) super.mo120();
    }
}
