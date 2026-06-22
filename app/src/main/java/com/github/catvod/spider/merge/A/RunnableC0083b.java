package com.github.catvod.spider.merge.a;

import android.util.Base64;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.A.T;
import com.github.catvod.spider.merge.c.C0097a;
import com.github.catvod.spider.merge.c.C0101e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0083b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0091j b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0083b(C0091j c0091j, Object obj, int i) {
        this.a = i;
        this.b = c0091j;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0091j c0091j = this.b;
                c0091j.getClass();
                String strK = (String) this.c;
                if (strK.startsWith("http")) {
                    strK = C0019u.k(strK, null);
                }
                c0091j.s(strK);
                break;
            case 1:
                C0091j c0091j2 = this.b;
                C0101e c0101e = (C0101e) this.c;
                c0091j2.getClass();
                HashMap mapE = c0101e.e();
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                c0091j2.g = scheduledExecutorServiceNewScheduledThreadPool;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0083b(c0091j2, mapE, 2), 1L, 1L, TimeUnit.SECONDS);
                break;
            default:
                C0091j c0091j3 = this.b;
                c0091j3.getClass();
                C0101e c0101eD = C0101e.g(C0019u.g("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", (HashMap) ((Map) this.c), null).g()).c().d();
                if (c0101eD.f()) {
                    c0091j3.s(((C0097a) T.c(new String(Base64.decode(c0101eD.a(), 0)), C0097a.class)).a().b());
                }
                break;
        }
    }
}
