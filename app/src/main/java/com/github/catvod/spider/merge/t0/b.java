package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class b {
    protected String b;
    private List<String> c;
    protected int d;
    protected String e;
    protected String f;
    protected boolean g;

    public b() {
    }

    public b(C1416e c1416e) {
        this.b = c1416e.x("videoId");
        if (c1416e.containsKey("lengthSeconds")) {
            this.d = c1416e.q("lengthSeconds");
        }
        this.c = (ArrayList) C0899d.k(c1416e.u("thumbnail"));
    }

    public final String b() {
        return this.e;
    }

    public boolean f() {
        return this.g;
    }

    public final int g() {
        return this.d;
    }

    public final List<String> h() {
        return this.c;
    }

    public final String i() {
        return this.b;
    }
}
