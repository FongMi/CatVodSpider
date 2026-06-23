package com.github.catvod.spider.merge.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c0 extends AbstractC1239f {
    private List<AbstractC1239f> o;

    public c0() {
        this.b = 170;
    }

    public c0(int i) {
        super(i);
        this.b = 170;
    }

    public final List<AbstractC1239f> d0() {
        List<AbstractC1239f> list = this.o;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final List<b0> e0() {
        if (this.o == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1239f abstractC1239f : this.o) {
            if (abstractC1239f.v() == 171) {
                arrayList.add((b0) abstractC1239f);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final void f0(List<AbstractC1239f> list) {
        Object r0 = this.o;
        if (r0 != 0) {
            r0.clear();
        }
        for (AbstractC1239f abstractC1239f : list) {
            P(abstractC1239f);
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(abstractC1239f);
            abstractC1239f.a0(this);
        }
    }
}
