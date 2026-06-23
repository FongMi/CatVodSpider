package com.github.catvod.spider.merge.FM.o;

import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ Map c;

    public /* synthetic */ x(y yVar, Map map, int i) {
        this.a = i;
        this.b = yVar;
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
