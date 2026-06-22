package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.JSDemo;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0116b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0116b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.b((x) this.b);
                break;
            case 1:
                ((C0104F) this.b).i();
                break;
            case 2:
                ((U) this.b).R();
                break;
            case 3:
                ((MainActivity) this.b).i();
                break;
            case 4:
                Config.b((Config) this.b);
                break;
            default:
                JSDemo.b((JSDemo) this.b);
                break;
        }
    }
}
