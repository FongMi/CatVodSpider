package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class zy implements rb, Serializable {
    private final int arity;

    public zy(int i) {
        this.arity = i;
    }

    @Override // com.github.catvod.spider.merge.A0.rb
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        kw.a.getClass();
        String strA = q.a(this);
        ko.e("renderLambdaToString(...)", strA);
        return strA;
    }
}
