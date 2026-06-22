package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.m1.AbstractC1313e;
import com.github.catvod.spider.merge.m1.InterfaceC1314f;
import com.github.catvod.spider.merge.p1.C1369f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1315g<I extends AbstractC1313e, E extends InterfaceC1314f> implements InterfaceC1309a<I, E> {
    private final int c;
    private final List<I> a = new ArrayList();
    private final List<Throwable> b = new ArrayList();
    private final Comparator<I> d = null;

    public AbstractC1315g(int i) {
        this.c = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    protected final void b(Exception exc) {
        this.b.add(exc);
    }

    protected final void c(I i) {
        this.a.add(i);
    }

    public void d(E e) {
        try {
            this.a.add(a(e));
        } catch (C1369f unused) {
        } catch (com.github.catvod.spider.merge.p1.i e2) {
            b(e2);
        }
    }

    public List<Throwable> e() {
        return Collections.unmodifiableList(this.b);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final List<I> f() {
        Comparator<I> comparator = this.d;
        if (comparator != null) {
            this.a.sort((Comparator<? super I>) comparator);
        }
        return Collections.unmodifiableList(this.a);
    }

    public final int g() {
        return this.c;
    }
}
