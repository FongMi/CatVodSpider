package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class A extends AbstractC0741y {
    public A(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return mVar != mVar2 && mVar2.Y() < this.a;
    }

    public final String toString() {
        return String.format(ZrJ.d("432F3F656D2150"), Integer.valueOf(this.a));
    }
}
