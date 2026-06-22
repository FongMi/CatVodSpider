package com.github.catvod.spider.merge.g0;

import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1202A implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ C1202A(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        List list;
        Object obj2;
        switch (this.a) {
            case 0:
                list = this.b;
                obj2 = (com.github.catvod.spider.merge.A0.f) obj;
                break;
            default:
                list = this.b;
                obj2 = (com.github.catvod.spider.merge.I1.q) obj;
                break;
        }
        list.add(obj2);
    }
}
