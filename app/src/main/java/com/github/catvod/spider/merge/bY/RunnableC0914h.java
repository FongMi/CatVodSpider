package com.github.catvod.spider.merge.bY;

import com.github.catvod.spider.Bili;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0914h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0914h(Object obj, Object obj2, int i) {
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
                L.g((L) this.b, (JSONObject) this.c);
                break;
            default:
                Bili.d((Bili) this.b, (com.github.catvod.spider.merge.CE.b) this.c);
                break;
        }
    }
}
