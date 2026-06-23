package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class c0 extends i0 {
    public final com.github.catvod.spider.merge.w.i b;

    public c0(AbstractC0640i abstractC0640i, com.github.catvod.spider.merge.w.i iVar) {
        super(abstractC0640i);
        if (iVar == null) {
            iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
            iVar.a(0);
        }
        this.b = iVar;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final com.github.catvod.spider.merge.w.i c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
