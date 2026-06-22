package com.github.catvod.spider.merge.j;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class RunnableC1270h implements Runnable {
    final /* synthetic */ l b;

    RunnableC1270h(l lVar) {
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(true);
        this.b.invalidateSelf();
    }
}
