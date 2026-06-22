package com.github.catvod.spider.merge.I;

import com.github.catvod.demo.MainActivity;
import com.github.catvod.spider.Init;
import org.json.JSONException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        switch (this.b) {
            case 0:
                G.d((G) this.c);
                break;
            case 1:
                ((O) this.c).k();
                break;
            case 2:
                C0754f0.a((C0754f0) this.c);
                break;
            case 3:
                v0.h((v0) this.c);
                break;
            case 4:
                ((MainActivity) this.c).i();
                break;
            case 5:
                Init.g((Init) this.c);
                break;
            default:
                Notice.b((Notice) this.c);
                break;
        }
    }
}
