package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0268l implements InterfaceC0260d {
    protected final int a;
    protected int b = 0;

    AbstractC0268l(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int d() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final void e(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int i() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final void j() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException(oZP.d("160E192F0321550C182F1F20180A57042313"));
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.y.s
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return h(com.github.catvod.spider.merge.B.j.b(0, this.a - 1));
    }
}
