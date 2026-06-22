package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1399vv extends Iw {
    private final jk v;

    public C1399vv(hs hsVar, String str, Rz rz) {
        super(hsVar, str, rz);
        this.v = new jk();
    }

    @Override // com.github.catvod.spider.merge.Iw, com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C1399vv v() {
        return (C1399vv) super.v();
    }

    @Override // com.github.catvod.spider.merge.A0
    protected void d(A0 a0) {
        super.d(a0);
        this.v.remove(a0);
    }

    public C1399vv g(Iw iw) {
        this.v.add(iw);
        return this;
    }
}
