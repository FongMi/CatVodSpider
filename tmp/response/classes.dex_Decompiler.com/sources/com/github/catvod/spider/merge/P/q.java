package com.github.catvod.spider.merge.p;

import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0206C b;
    public final /* synthetic */ Map c;

    public /* synthetic */ q(C0206C c0206c, Map map, int i) {
        this.a = i;
        this.b = c0206c;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y(this.c);
                break;
            default:
                this.b.x(this.c);
                break;
        }
    }
}
