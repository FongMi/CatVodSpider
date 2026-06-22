package com.github.catvod.spider.merge.o;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class c implements Runnable {
    public static final /* synthetic */ c b = new c(0);
    public static final /* synthetic */ c c = new c(1);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new Thread(h.d).start();
                break;
            default:
                new Thread(RunnableC0203b.c).start();
                break;
        }
    }
}
