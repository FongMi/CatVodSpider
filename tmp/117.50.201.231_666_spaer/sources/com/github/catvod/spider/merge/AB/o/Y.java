package com.github.catvod.spider.merge.AB.o;

import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class Y implements Runnable {
    public final int a;
    public final Z b;
    public final Map c;

    public /* synthetic */ Y(Z z, Map map, int i) {
        this.a = i;
        this.b = z;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            this.b.x(this.c);
        } else {
            this.b.y(this.c);
        }
    }
}
