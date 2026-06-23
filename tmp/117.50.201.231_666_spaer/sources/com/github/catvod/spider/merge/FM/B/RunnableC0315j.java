package com.github.catvod.spider.merge.FM.b;

import android.widget.EditText;
import com.github.catvod.spider.merge.FM.d.C0336d;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0315j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0315j(Object obj, String str, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.j((u) this.c, this.b, (C0336d) this.d);
                break;
            default:
                com.github.catvod.spider.merge.FM.o.y.l((com.github.catvod.spider.merge.FM.o.y) this.c, this.b, (EditText) this.d);
                break;
        }
    }
}
