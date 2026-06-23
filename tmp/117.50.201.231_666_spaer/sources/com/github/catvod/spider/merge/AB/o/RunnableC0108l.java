package com.github.catvod.spider.merge.AB.o;

import android.widget.EditText;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0108l implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ RunnableC0108l(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            Z.l((Z) this.b, (String) this.c, (EditText) this.d);
        } else {
            C0113q.d((C0113q) this.b, (List) this.c, (Runnable) this.d);
        }
    }
}
