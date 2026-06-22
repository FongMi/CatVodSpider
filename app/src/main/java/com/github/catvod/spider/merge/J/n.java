package com.github.catvod.spider.merge.j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class n extends AbstractC1273k {
    int[][] H;

    n(n nVar, o oVar, Resources resources) {
        super(nVar, oVar, resources);
        if (nVar != null) {
            this.H = nVar.H;
        } else {
            this.H = new int[this.g.length][];
        }
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1273k
    void i() {
        int[][] iArr = this.H;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[][] iArr3 = this.H;
            iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
        }
        this.H = iArr2;
    }

    final int l(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new o(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new o(this, resources);
    }
}
