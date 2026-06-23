package com.github.catvod.spider.merge.b;

import android.widget.Toast;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.m.C0590I;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0543g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0543g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0545i.a((C0545i) this.b);
                break;
            case 1:
                ((MainActivity) this.b).m();
                break;
            case 2:
                Config.c((Config) this.b);
                break;
            default:
                String str = (String) this.b;
                List<String> list = C0590I.a;
                Toast.makeText(Init.context(), str, 1).show();
                break;
        }
    }
}
