package com.github.catvod.spider.merge.bY;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ U b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ P(U u, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = u;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                U.j(this.b, this.c);
                break;
            default:
                U.i(this.b, this.c);
                break;
        }
    }
}
