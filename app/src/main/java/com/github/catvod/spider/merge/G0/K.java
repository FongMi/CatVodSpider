package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.磁力集合;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class K implements Callable {
    public final /* synthetic */ 磁力集合 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ K(磁力集合 r1, String str, List list) {
        this.a = r1;
        this.b = str;
        this.c = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        磁力集合.a(this.a, this.b, this.c);
        return null;
    }
}
