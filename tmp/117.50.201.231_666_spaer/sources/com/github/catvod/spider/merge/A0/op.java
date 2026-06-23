package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class op extends xm implements rb {
    private final int arity;

    public op(xl xlVar) {
        super(xlVar);
        this.arity = 2;
    }

    @Override // com.github.catvod.spider.merge.A0.rb
    public int getArity() {
        return this.arity;
    }

    @Override // com.github.catvod.spider.merge.A0.qi
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kw.a.getClass();
        String strA = q.a(this);
        ko.e("renderLambdaToString(...)", strA);
        return strA;
    }
}
