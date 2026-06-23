package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.o.y;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public static final /* synthetic */ i b = new i(0);
    public static final /* synthetic */ i c = new i(1);
    public static final /* synthetic */ i d = new i(2);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0385a.m(C0385a.l("/.aliyun"), "");
                break;
            case 1:
                new Thread(j.d).start();
                break;
            default:
                try {
                    SpiderDebug.log("addBaidu debug");
                    HashMap map = new HashMap();
                    map.put("site", "baidu");
                    map.put("flag", "请使用百度网盘扫码");
                    y.o().x(map);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
