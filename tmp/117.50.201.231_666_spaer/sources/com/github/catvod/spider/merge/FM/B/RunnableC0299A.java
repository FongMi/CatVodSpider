package com.github.catvod.spider.merge.FM.b;

import android.widget.EditText;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0299A implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0299A(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0301C.d((C0301C) this.b, (String) this.c, (String) this.d);
                break;
            default:
                com.github.catvod.spider.merge.FM.o.y.i((com.github.catvod.spider.merge.FM.o.y) this.b, (EditText) this.c, (EditText) this.d);
                break;
        }
    }
}
