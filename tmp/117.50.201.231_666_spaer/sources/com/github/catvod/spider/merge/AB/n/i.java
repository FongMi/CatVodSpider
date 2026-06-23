package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AB.o.Z;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public final int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == 0) {
            new Thread(l.d).start();
            return;
        }
        try {
            SpiderDebug.log("addBaidu debug");
            HashMap map = new HashMap();
            map.put("site", "baidu");
            map.put("flag", "请使用百度网盘扫码");
            Z.o().x(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
