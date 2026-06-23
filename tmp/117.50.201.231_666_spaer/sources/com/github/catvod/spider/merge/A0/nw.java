package com.github.catvod.spider.merge.A0;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class nw {
    public final lq g;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        rh rhVar = new rh();
        rhVar.put(ev.class, 1);
        rhVar.put(hr.class, 2);
        rhVar.put(abw.class, 3);
        rhVar.put(aaa.class, 4);
        rhVar.put(qc.class, 5);
        rhVar.put(pl.class, 6);
        rhVar.put(cm.class, 7);
        rhVar.put(ju.class, 8);
        rhVar.put(iy.class, 9);
        rhVar.put(li.class, 10);
        Collections.unmodifiableMap(rhVar);
    }

    public nw(lq lqVar) {
        if (lqVar == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.g = lqVar;
    }

    public abstract int b();

    public ii c() {
        return null;
    }

    public abstract boolean d(int i, int i2);

    public boolean e() {
        return this instanceof pl;
    }
}
