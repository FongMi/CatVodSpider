package com.github.catvod.spider.merge.j;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1267e implements TimeInterpolator {
    private int[] a;
    private int b;
    private int c;

    C1267e(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.b = numberOfFrames;
        int[] iArr = this.a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.a = new int[numberOfFrames];
        }
        int[] iArr2 = this.a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.c = i;
    }

    final int a() {
        return this.c;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.b;
        int[] iArr = this.a;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
    }
}
