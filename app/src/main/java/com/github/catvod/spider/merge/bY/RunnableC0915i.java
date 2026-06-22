package com.github.catvod.spider.merge.bY;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0915i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0915i(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.i((x) this.b, (com.github.catvod.spider.merge.dO.e) this.c);
                break;
            case 1:
                F.a((F) this.b, (String[]) this.c);
                break;
            case 2:
                ((L) this.b).D((String) this.c);
                break;
            case 3:
                U.k((U) this.b, (String) this.c);
                break;
            case 4:
                Bili.d((Bili) this.b, (com.github.catvod.spider.merge.CE.b) this.c);
                break;
            default:
                Config.a((Config) this.b, (JSONObject) this.c);
                break;
        }
    }
}
