package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.Q1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F extends AbstractC1239f {
    public F() {
    }

    public F(int i, int i2, int i3) {
        super(i, i2);
        d0(i3);
    }

    @Override // com.github.catvod.spider.merge.f1.Q1
    public final /* bridge */ /* synthetic */ Q1 N(int i) {
        d0(i);
        return this;
    }

    public final F d0(int i) {
        if (i != 43 && i != 42 && i != 45 && i != 44 && i != 164) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.C.u.b("Invalid node type: ", i));
        }
        this.b = i;
        return this;
    }
}
