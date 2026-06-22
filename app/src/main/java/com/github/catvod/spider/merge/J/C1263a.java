package com.github.catvod.spider.merge.j;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1263a extends AbstractC1268f {
    private final Animatable a;

    C1263a(Animatable animatable) {
        this.a = animatable;
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final void c() {
        this.a.start();
    }

    @Override // com.github.catvod.spider.merge.j.AbstractC1268f
    public final void d() {
        this.a.stop();
    }
}
