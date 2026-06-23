package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.FM.d.C0336d;
import com.github.catvod.spider.merge.FM.g.C0346b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0311f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0311f(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.i((u) this.b, (C0336d) this.c);
                break;
            case 1:
                J.g((J) this.b, (JSONObject) this.c);
                break;
            case 2:
                Q.b((Q) this.b, (JSONObject) this.c);
                break;
            default:
                Bili.e((Bili) this.b, (C0346b) this.c);
                break;
        }
    }
}
