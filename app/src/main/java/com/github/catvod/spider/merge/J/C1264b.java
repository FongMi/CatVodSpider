package com.github.catvod.spider.merge.j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.github.catvod.spider.merge.q.C1377f;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1264b extends n {
    C1377f<Long> I;
    com.github.catvod.spider.merge.q.o<Integer> J;

    C1264b(C1264b c1264b, C1269g c1269g, Resources resources) {
        com.github.catvod.spider.merge.q.o<Integer> oVar;
        super(c1264b, c1269g, resources);
        if (c1264b != null) {
            this.I = c1264b.I;
            oVar = c1264b.J;
        } else {
            this.I = new C1377f<>();
            oVar = new com.github.catvod.spider.merge.q.o<>();
        }
        this.J = oVar;
    }

    private static long n(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    @Override // com.github.catvod.spider.merge.j.n, com.github.catvod.spider.merge.j.AbstractC1273k
    final void i() {
        this.I = this.I.clone();
        this.J = this.J.clone();
    }

    final int m(int i, int i2, Drawable drawable, boolean z) {
        int iA = a(drawable);
        long jN = n(i, i2);
        long j = z ? 8589934592L : 0L;
        long j2 = iA;
        this.I.a(jN, Long.valueOf(j2 | j));
        if (z) {
            this.I.a(n(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
        return iA;
    }

    @Override // com.github.catvod.spider.merge.j.n, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1269g(this, null);
    }

    @Override // com.github.catvod.spider.merge.j.n, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1269g(this, resources);
    }

    final int o(int i) {
        if (i < 0) {
            return 0;
        }
        return this.J.c(i, 0).intValue();
    }

    final int p(int i, int i2) {
        return (int) this.I.d(n(i, i2), -1L).longValue();
    }

    final boolean q(int i, int i2) {
        return (this.I.d(n(i, i2), -1L).longValue() & 4294967296L) != 0;
    }

    final boolean r(int i, int i2) {
        return (this.I.d(n(i, i2), -1L).longValue() & 8589934592L) != 0;
    }
}
