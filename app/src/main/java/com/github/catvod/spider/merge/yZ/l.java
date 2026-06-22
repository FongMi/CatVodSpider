package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class l implements InterfaceC1439d {
    protected final int a;
    protected int b = 0;

    l(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int d() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final void e(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int i() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final void j() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException(ZrJ.d("1A2225232731592024233B3014266B080703"));
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.yZ.s
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return h(com.github.catvod.spider.merge.Bk.j.b(0, this.a - 1));
    }
}
