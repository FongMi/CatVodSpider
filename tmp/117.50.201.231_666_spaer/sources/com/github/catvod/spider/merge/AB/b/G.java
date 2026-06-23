package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Bili;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class G implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ G(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            J.a((J) this.c, (JSONObject) this.b);
        } else if (i != 1) {
            Bili.e((Bili) this.c, (com.github.catvod.spider.merge.AB.g.b) this.b);
        } else {
            Q.b((Q) this.c, (JSONObject) this.b);
        }
    }
}
