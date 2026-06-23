package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ca implements Runnable {
    public final /* synthetic */ ft a;
    public final /* synthetic */ sa b;

    public ca(ft ftVar, sa saVar) {
        this.a = ftVar;
        this.b = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.v(this.a);
    }
}
