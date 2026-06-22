package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class t extends C<Integer, com.github.catvod.spider.merge.KW.B> implements G {
    public InterfaceC1439d d;
    protected com.github.catvod.spider.merge.Bk.n<G, InterfaceC1439d> e;
    public E g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected F<?> f = C1440e.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.Bk.i n = new com.github.catvod.spider.merge.Bk.i();
    public int o = 0;

    public t(InterfaceC1439d interfaceC1439d) {
        this.d = interfaceC1439d;
        this.e = new com.github.catvod.spider.merge.Bk.n<>(this, interfaceC1439d);
    }

    @Override // com.github.catvod.spider.merge.yZ.G
    public final int a() {
        return ((com.github.catvod.spider.merge.KW.B) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.yZ.G
    public final InterfaceC1439d b() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.yZ.G
    public final F<? extends E> c() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.yZ.G
    public final int getLine() {
        return ((com.github.catvod.spider.merge.KW.B) this.b).h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.yZ.F<?>, com.github.catvod.spider.merge.yZ.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final E j() {
        E eA = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, ((com.github.catvod.spider.merge.KW.B) this.b).h(), ((com.github.catvod.spider.merge.KW.B) this.b).g());
        this.g = eA;
        return eA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(u uVar) {
        InterfaceC1439d interfaceC1439d = this.d;
        String strH = interfaceC1439d.h(com.github.catvod.spider.merge.Bk.j.b(this.h, interfaceC1439d.i()));
        StringBuilder sbB = C0925t.b(ZrJ.d("0D2C202826650B2628222F2B1037222226651C3139223A651837716D6F"));
        StringBuilder sb = new StringBuilder();
        for (char c : strH.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = ZrJ.d("4506040B76");
            } else if (c == 13) {
                strValueOf = ZrJ.d("2531");
            } else if (c == 9) {
                strValueOf = ZrJ.d("2537");
            } else if (c == 10) {
                strValueOf = ZrJ.d("252D");
            }
            sb.append(strValueOf);
        }
        sbB.append(sb.toString());
        sbB.append(ZrJ.d("5E"));
        ((z) e()).a(this, null, this.i, this.j, sbB.toString(), uVar);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.github.catvod.spider.merge.yZ.F<?>, com.github.catvod.spider.merge.yZ.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.github.catvod.spider.merge.yZ.G
    public final E nextToken() {
        int i;
        int i2;
        InterfaceC1439d interfaceC1439d = this.d;
        if (interfaceC1439d == null) {
            throw new IllegalStateException(ZrJ.d("172633391C2A1226256D3A200836223F2D3659226B23272B542D3E212465102D3B383C650A373928292857"));
        }
        interfaceC1439d.d();
        while (true) {
            try {
                if (this.k) {
                    j();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.i();
                this.j = ((com.github.catvod.spider.merge.KW.B) this.b).g();
                this.i = ((com.github.catvod.spider.merge.KW.B) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((com.github.catvod.spider.merge.KW.B) this.b).i(this.d, this.o);
                    } catch (u e) {
                        k(e);
                        if (this.d.g(1) != -1) {
                            ((com.github.catvod.spider.merge.KW.B) this.b).e(this.d);
                        }
                        i = -3;
                    }
                    if (this.d.g(1) == -1) {
                        this.k = true;
                    }
                    if (this.m == 0) {
                        this.m = i;
                    }
                    i2 = this.m;
                    if (i2 == -3) {
                        break;
                    }
                } while (i2 == -2);
                if (this.g == null) {
                    this.g = this.f.a(this.e, i2, null, this.l, this.h, this.d.i() - 1, this.i, this.j);
                }
            } finally {
                this.d.a();
            }
        }
        return this.g;
    }
}
