package com.github.catvod.spider.merge.AB.n;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class h implements Runnable {
    public static final h b = new h(0);
    public static final h c = new h(1);
    public final int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        (this.a != 0 ? new Thread(j.d) : new Thread(i.c)).start();
    }
}
