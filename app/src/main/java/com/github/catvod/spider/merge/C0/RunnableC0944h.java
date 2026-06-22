package com.github.catvod.spider.merge.c0;

import com.github.catvod.demo.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.O;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0944h implements Runnable {
    public static final /* synthetic */ RunnableC0944h b = new RunnableC0944h();

    private /* synthetic */ RunnableC0944h() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = MainActivity.d;
        O oL = O.l();
        oL.getClass();
        Init.run(new M(oL, 0));
    }
}
