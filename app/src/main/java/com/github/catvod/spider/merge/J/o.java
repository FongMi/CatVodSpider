package com.github.catvod.spider.merge.j;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@SuppressLint({"RestrictedAPI"})
class o extends l {
    private n o;
    private boolean p;

    o() {
    }

    o(n nVar, Resources resources) {
        f(new n(nVar, this, resources));
        onStateChange(getState());
    }

    @Override // com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.github.catvod.spider.merge.j.l
    void f(AbstractC1273k abstractC1273k) {
        super.f(abstractC1273k);
        if (abstractC1273k instanceof n) {
            this.o = (n) abstractC1273k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.j.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n b() {
        return new n(this.o, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.p) {
            super.mutate();
            this.o.i();
            this.p = true;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iL = this.o.l(iArr);
        if (iL < 0) {
            iL = this.o.l(StateSet.WILD_CARD);
        }
        return e(iL) || zOnStateChange;
    }
}
