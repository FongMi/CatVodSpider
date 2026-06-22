package com.github.catvod.spider.merge.p;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0205B implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0206C b;
    public final /* synthetic */ Map c;

    public /* synthetic */ RunnableC0205B(C0206C c0206c, Map map, int i) {
        this.a = i;
        this.b = c0206c;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n(this.c);
                break;
            default:
                this.b.x(this.c);
                break;
        }
    }
}
