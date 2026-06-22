package com.github.catvod.spider.merge.I;

import org.json.JSONException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class L implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ L(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        switch (this.b) {
            case 0:
                O.e((O) this.c);
                break;
            case 1:
                C0754f0.a((C0754f0) this.c);
                break;
            case 2:
                v0.h((v0) this.c);
                break;
            case 3:
                com.github.catvod.spider.merge.S.e.a((com.github.catvod.spider.merge.S.e) this.c);
                break;
            default:
                com.github.catvod.spider.merge.i0.d.a((String) this.c);
                break;
        }
    }
}
