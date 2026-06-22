package com.github.catvod.spider.merge.Y;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class d implements ILoggerFactory {
    public boolean a = false;
    public final HashMap b = new HashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    public final synchronized com.github.catvod.spider.merge.W.a a(String str) {
        c cVar;
        cVar = (c) this.b.get(str);
        if (cVar == null) {
            cVar = new c(str, this.c, this.a);
            this.b.put(str, cVar);
        }
        return cVar;
    }
}
