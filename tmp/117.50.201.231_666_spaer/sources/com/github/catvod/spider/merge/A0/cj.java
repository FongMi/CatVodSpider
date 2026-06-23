package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class cj extends pb implements yw {
    public final xl ai;

    public cj(yg ygVar, xl xlVar) {
        super(ygVar, true);
        this.ai = xlVar;
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public void h(Object obj) {
        qf.e(tw.a(obj), hj.a(this.ai));
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public void i(Object obj) {
        this.ai.resumeWith(tw.a(obj));
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final boolean z() {
        return true;
    }
}
