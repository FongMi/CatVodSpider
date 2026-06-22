package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0750d0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0750d0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0.d((C0754f0) this.c, (String) this.d, (String) this.e);
                break;
            default:
                Init.f((Init) this.c, (JSONObject) this.d, (Boolean) this.e);
                break;
        }
    }
}
