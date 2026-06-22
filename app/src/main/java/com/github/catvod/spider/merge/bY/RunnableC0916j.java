package com.github.catvod.spider.merge.bY;

import java.io.PipedOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0916j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0916j(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.a((x) this.b, (String) this.c);
                break;
            case 1:
                L.a((L) this.b, (JSONObject) this.c);
                break;
            case 2:
                U.b((U) this.b, (JSONObject) this.c);
                break;
            case 3:
                Bili.e((Bili) this.b, (com.github.catvod.spider.merge.CE.b) this.c);
                break;
            case 4:
                com.github.catvod.spider.merge.pT.i.a((com.github.catvod.spider.merge.pT.i) this.b, (PipedOutputStream) this.c);
                break;
            default:
                ((com.github.catvod.spider.merge.pT.B) this.b).x((Map) this.c);
                break;
        }
    }
}
