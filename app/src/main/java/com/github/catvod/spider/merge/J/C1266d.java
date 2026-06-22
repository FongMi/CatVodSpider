package com.github.catvod.spider.merge.j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1266d extends AbstractC1268f {
    private final ObjectAnimator a;
    private final boolean b;

    C1266d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C1267e c1267e = new C1267e(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c1267e.a());
        objectAnimatorOfInt.setInterpolator(c1267e);
        this.b = z2;
        this.a = objectAnimatorOfInt;
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final boolean a() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final void b() {
        this.a.reverse();
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final void c() {
        this.a.start();
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final void d() {
        this.a.cancel();
    }
}
