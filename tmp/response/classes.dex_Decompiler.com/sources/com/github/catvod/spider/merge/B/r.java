package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i) {
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
                ((x) this.b).o();
                break;
            default:
                ((MainActivity) this.b).h();
                break;
        }
    }
}
