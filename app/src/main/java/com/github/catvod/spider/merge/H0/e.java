package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.I.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    private long a;
    private final List<a> b = Collections.synchronizedList(new ArrayList());

    public final void a() {
        Iterator it = new ArrayList(this.b).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public final void b(a aVar) {
        this.b.remove(aVar);
    }

    public final void c(a aVar) {
        this.a++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        StringBuilder sbB = t0.b("NanoHttpd Request Processor (#");
        sbB.append(this.a);
        sbB.append(")");
        thread.setName(sbB.toString());
        this.b.add(aVar);
        thread.start();
    }
}
