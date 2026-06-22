package com.github.catvod.spider.merge.NQ;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.pT.B;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class e implements Runnable {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new Thread(b.c).start();
                break;
            default:
                try {
                    SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{32, 27, -8, -102, 22, 8, -83, -20, 97, 27, -7, -70, 2, 6}, new byte[]{65, 127, -100, -40, 119, 97, -55, -103}));
                    HashMap map = new HashMap();
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-78, 42, -41, -59}, new byte[]{-63, 67, -93, -96, -82, -6, -98, -111}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-120, 0, 20, -96, 102}, new byte[]{-22, 97, 125, -60, 19, 72, 117, -74}));
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{83, 119, 89, 127}, new byte[]{53, 27, 56, 24, 4, -109, 73, -40}), com.github.catvod.spider.merge.XI.f.a(new byte[]{104, 15, -61, -37, -84, -1, -41, 108, 40, 71, -19, -127, -12, -6, -106, 31, 61, 49, -109, -92, -119, -90, -71, 83, 103, 0, -11}, new byte[]{-128, -96, 116, 63, 17, 64, 48, -8}));
                    B.o().x(map);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
