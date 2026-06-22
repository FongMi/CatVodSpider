package com.github.catvod.spider.merge.o;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.p.C0206C;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class d implements Runnable {
    public static final /* synthetic */ d b = new d(0);
    public static final /* synthetic */ d c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new Thread(RunnableC0202a.c).start();
                break;
            default:
                try {
                    SpiderDebug.log(C0098a.a(new byte[]{58, -29, -100, -60, -48, 120, 96, 100, 123, -29, -99, -28, -60, 118}, new byte[]{91, -121, -8, -122, -79, 17, 4, 17}));
                    HashMap map = new HashMap();
                    map.put(C0098a.a(new byte[]{90, -44, 89, 101}, new byte[]{41, -67, 45, 0, -111, 122, -49, 26}), C0098a.a(new byte[]{-23, -120, 64, -105, -23}, new byte[]{-117, -23, 41, -13, -100, 29, 9, 105}));
                    map.put(C0098a.a(new byte[]{11, -65, 78, -112}, new byte[]{109, -45, 47, -9, -46, 27, 64, -104}), C0098a.a(new byte[]{-20, 48, 18, -54, -33, -96, 3, 10, -84, 120, 60, -112, -121, -91, 66, 121, -71, 14, 66, -75, -6, -7, 109, 53, -29, 63, 36}, new byte[]{4, -97, -91, 46, 98, 31, -28, -98}));
                    C0206C.o().x(map);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
