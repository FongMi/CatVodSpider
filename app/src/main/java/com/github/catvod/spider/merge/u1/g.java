package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.m1.C1317i;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class g implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((com.github.catvod.spider.merge.s1.c) this.b).d((f) obj);
                break;
            default:
                ((List) this.b).add((C1317i) obj);
                break;
        }
    }
}
