package com.github.catvod.spider.merge.u0;

import com.github.catvod.spider.merge.t0.C1390a;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends C1390a {
    public c(C1416e c1416e) {
        super(c1416e);
        if (!((ArrayList) h()).isEmpty()) {
            this.g = ((String) ((ArrayList) h()).get(0)).contains("/hqdefault_live.jpg?");
        }
        if (c1416e.containsKey("index")) {
            c1416e.u("index").q("simpleText");
        }
        c1416e.o("isPlayable");
    }
}
