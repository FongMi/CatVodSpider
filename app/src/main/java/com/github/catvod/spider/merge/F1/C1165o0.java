package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1165o0 extends C1150k {
    private final transient InterfaceC1161n t;
    private final String u;
    private final int v;

    public C1165o0(n2 n2Var, int i, InterfaceC1161n interfaceC1161n) {
        this.t = interfaceC1161n;
        this.v = i;
        this.u = "";
        C1185v.i();
        C1157l2.S0(this, n2Var, false);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        throw C1157l2.C1("msg.no.new", this.u);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return this.t.b(c1185v, n2Var, n2Var2, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        return this.v;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        return this.u;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        return this.v;
    }

    public C1165o0(n2 n2Var, String str, int i, InterfaceC1161n interfaceC1161n) {
        this.t = interfaceC1161n;
        this.u = str;
        this.v = i;
        C1185v.i();
        C1157l2.S0(this, n2Var, false);
        C1();
    }
}
