package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.z.C0276B;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class t extends AbstractC0248C<Integer, C0276B> implements InterfaceC0252G {
    public InterfaceC0260d d;
    protected com.github.catvod.spider.merge.B.n<InterfaceC0252G, InterfaceC0260d> e;
    public InterfaceC0250E g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected InterfaceC0251F<?> f = C0261e.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.B.i n = new com.github.catvod.spider.merge.B.i();
    public int o = 0;

    public t(InterfaceC0260d interfaceC0260d) {
        this.d = interfaceC0260d;
        this.e = new com.github.catvod.spider.merge.B.n<>(this, interfaceC0260d);
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0252G
    public final int a() {
        return ((C0276B) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0252G
    public final InterfaceC0260d b() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0252G
    public final InterfaceC0251F<? extends InterfaceC0250E> c() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0252G
    public final int getLine() {
        return ((C0276B) this.b).h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.y.F<?>, com.github.catvod.spider.merge.y.e] */
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
    public final InterfaceC0250E j() {
        InterfaceC0250E interfaceC0250EA = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, ((C0276B) this.b).h(), ((C0276B) this.b).g());
        this.g = interfaceC0250EA;
        return interfaceC0250EA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(u uVar) {
        InterfaceC0260d interfaceC0260d = this.d;
        String strH = interfaceC0260d.h(com.github.catvod.spider.merge.B.j.b(this.h, interfaceC0260d.i()));
        StringBuilder sbC = C0133t.c(oZP.d("01001C240275070A142E0B3B1C1B1E2E0275101D052E1E75141B4D614B"));
        StringBuilder sb = new StringBuilder();
        for (char c : strH.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = oZP.d("492A380752");
            } else if (c == 13) {
                strValueOf = oZP.d("291D");
            } else if (c == 9) {
                strValueOf = oZP.d("291B");
            } else if (c == 10) {
                strValueOf = oZP.d("2901");
            }
            sb.append(strValueOf);
        }
        sbC.append(sb.toString());
        sbC.append(oZP.d("52"));
        ((z) e()).a(this, null, this.i, this.j, sbC.toString(), uVar);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.github.catvod.spider.merge.y.F<?>, com.github.catvod.spider.merge.y.e] */
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
    @Override // com.github.catvod.spider.merge.y.InterfaceC0252G
    public final InterfaceC0250E nextToken() {
        int i;
        int i2;
        InterfaceC0260d interfaceC0260d = this.d;
        if (interfaceC0260d == null) {
            throw new IllegalStateException(oZP.d("1B0A0F35383A1E0A19611E30041A1E330926550E572F033B5801022D00751C0107341875061B05240D385B"));
        }
        interfaceC0260d.d();
        while (true) {
            try {
                if (this.k) {
                    j();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.i();
                this.j = ((C0276B) this.b).g();
                this.i = ((C0276B) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((C0276B) this.b).i(this.d, this.o);
                    } catch (u e) {
                        k(e);
                        if (this.d.g(1) != -1) {
                            ((C0276B) this.b).e(this.d);
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
