package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1256x extends AbstractC1239f {
    protected static final List<AbstractC1239f> q = Collections.unmodifiableList(new ArrayList());
    protected AbstractC1239f o;
    protected List<AbstractC1239f> p;

    public C1256x() {
        this.b = 38;
    }

    public C1256x(int i) {
        super(i);
        this.b = 38;
    }

    public final List<AbstractC1239f> d0() {
        List<AbstractC1239f> list = this.p;
        return list != null ? list : q;
    }

    public final AbstractC1239f e0() {
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final void f0(List<AbstractC1239f> list) {
        if (list == null) {
            this.p = null;
            return;
        }
        ?? r0 = this.p;
        if (r0 != 0) {
            r0.clear();
        }
        for (AbstractC1239f abstractC1239f : list) {
            P(abstractC1239f);
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(abstractC1239f);
            abstractC1239f.a0(this);
        }
    }

    public final void g0(AbstractC1239f abstractC1239f) {
        this.o = abstractC1239f;
        abstractC1239f.a0(this);
    }
}
