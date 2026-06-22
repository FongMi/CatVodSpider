package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.d.C0146e;
import com.github.catvod.spider.merge.g.C0160b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0123i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0123i(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.i((x) this.b, (C0146e) this.c);
                break;
            case 1:
                C0104F.a((C0104F) this.b, (String[]) this.c);
                break;
            case 2:
                ((C0110L) this.b).D((String) this.c);
                break;
            case 3:
                U.k((U) this.b, (String) this.c);
                break;
            case 4:
                Bili.d((Bili) this.b, (C0160b) this.c);
                break;
            default:
                Config.a((Config) this.b, (JSONObject) this.c);
                break;
        }
    }
}
