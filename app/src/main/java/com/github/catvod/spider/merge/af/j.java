package com.github.catvod.spider.merge.af;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ k a;

    j(k kVar) {
        this.a = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k kVar = this.a;
        k.c(kVar, kVar.h);
        k kVar2 = this.a;
        k.g(kVar2, kVar2.h);
        if (this.a.e + this.a.d < 0) {
            k kVar3 = this.a;
            kVar3.e = kVar3.f + this.a.d + this.a.g;
        }
        if (this.a.f + this.a.d < 0) {
            k kVar4 = this.a;
            kVar4.f = kVar4.e + this.a.d + this.a.g;
        }
        this.a.invalidate();
    }
}
