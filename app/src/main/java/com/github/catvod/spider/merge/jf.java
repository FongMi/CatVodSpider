package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class jf implements gp {
    boolean l8 = false;
    final Map<String, Yg> S = new HashMap();
    final LinkedBlockingQueue<zE> T4 = new LinkedBlockingQueue<>();

    public void OL() {
        this.l8 = true;
    }

    public void S() {
        this.S.clear();
        this.T4.clear();
    }

    public LinkedBlockingQueue<zE> T4() {
        return this.T4;
    }

    public List<Yg> b() {
        return new ArrayList(this.S.values());
    }

    @Override // com.github.catvod.spider.merge.gp
    public synchronized Sj l8(String str) {
        Yg yg;
        yg = this.S.get(str);
        if (yg == null) {
            yg = new Yg(str, this.T4, this.l8);
            this.S.put(str, yg);
        }
        return yg;
    }
}
