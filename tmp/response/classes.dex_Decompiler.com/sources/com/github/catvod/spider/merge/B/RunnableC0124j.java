package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.g.C0160b;
import com.github.catvod.spider.merge.p.C0206C;
import com.github.catvod.spider.merge.p.C0217j;
import java.io.PipedOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0124j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0124j(Object obj, Object obj2, int i) {
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
                C0110L.a((C0110L) this.b, (JSONObject) this.c);
                break;
            case 2:
                U.b((U) this.b, (JSONObject) this.c);
                break;
            case 3:
                Bili.e((Bili) this.b, (C0160b) this.c);
                break;
            case 4:
                C0217j.a((C0217j) this.b, (PipedOutputStream) this.c);
                break;
            default:
                ((C0206C) this.b).x((Map) this.c);
                break;
        }
    }
}
