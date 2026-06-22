package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.Q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1257y extends V {
    private static final List<AbstractC1239f> V = Collections.unmodifiableList(new ArrayList());
    private K J;
    private List<AbstractC1239f> K;
    private AbstractC1239f L;
    private boolean M;
    private int N;
    private boolean O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private List<Q1> T;
    private AbstractC1239f U;

    public C1257y() {
        this.N = -1;
        this.b = 113;
    }

    public C1257y(int i) {
        super(i);
        this.N = -1;
        this.b = 113;
    }

    public C1257y(int i, K k) {
        super(i);
        this.N = -1;
        this.b = 113;
        this.J = k;
        if (k != null) {
            k.a0(this);
        }
    }

    @Override // com.github.catvod.spider.merge.h1.V
    public final boolean V0() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.f>] */
    public final void d1(AbstractC1239f abstractC1239f) {
        P(abstractC1239f);
        if (this.K == null) {
            this.K = new ArrayList();
        }
        this.K.add(abstractC1239f);
        abstractC1239f.a0(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.f1.Q1>] */
    public final void e1(Q1 q1) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(q1);
    }

    public final AbstractC1239f f1() {
        return this.L;
    }

    public final K g1() {
        return this.J;
    }

    public final String getName() {
        K k = this.J;
        return k != null ? k.d0() : "";
    }

    public final int h1() {
        return this.P;
    }

    public final int i1() {
        return this.N;
    }

    public final AbstractC1239f j1() {
        return this.U;
    }

    public final List<AbstractC1239f> k1() {
        List<AbstractC1239f> list = this.K;
        return list != null ? list : V;
    }

    public final boolean l1() {
        return this.S;
    }

    public final boolean m1() {
        return this.M;
    }

    public final boolean n1() {
        return this.R;
    }

    public final boolean o1() {
        return this.Q;
    }

    public final void p1(AbstractC1239f abstractC1239f) {
        this.L = abstractC1239f;
        if (Boolean.TRUE.equals(abstractC1239f.s(25))) {
            this.M = true;
        }
        int i = abstractC1239f.i + abstractC1239f.j;
        abstractC1239f.a0(this);
        int i2 = this.i;
        this.j = i - i2;
        Z0(i2, i);
    }

    public final void q1(int i) {
        this.P = i;
    }

    public final void r1() {
        this.O = true;
    }

    public final void s1() {
        this.S = true;
        this.R = true;
    }

    public final void t1() {
        this.R = true;
    }

    public final void u1(int i) {
        this.N = i;
    }

    public final void v1(int i, int i2) {
        this.N = 0;
    }

    public final void w1() {
        this.Q = true;
    }

    @Override // com.github.catvod.spider.merge.h1.V
    public final int y0(C1257y c1257y) {
        int iY0 = super.y0(c1257y);
        if (H0() > 0) {
            this.Q = true;
        }
        return iY0;
    }
}
