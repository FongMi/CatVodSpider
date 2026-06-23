package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.y.C0453B;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class t extends AbstractC0425C<Integer, C0453B> implements InterfaceC0429G {
    public InterfaceC0437d d;
    protected com.github.catvod.spider.merge.FM.A.n<InterfaceC0429G, InterfaceC0437d> e;
    public InterfaceC0427E g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected InterfaceC0428F<?> f = C0438e.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.FM.A.i n = new com.github.catvod.spider.merge.FM.A.i();
    public int o = 0;

    public t(InterfaceC0437d interfaceC0437d) {
        this.d = interfaceC0437d;
        this.e = new com.github.catvod.spider.merge.FM.A.n<>(this, interfaceC0437d);
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0429G
    public final int a() {
        return ((C0453B) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0429G
    public final InterfaceC0437d b() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0429G
    public final InterfaceC0428F<? extends InterfaceC0427E> c() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0429G
    public final int getLine() {
        return ((C0453B) this.b).h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.FM.x.F<?>, com.github.catvod.spider.merge.FM.x.e] */
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
    public final InterfaceC0427E j() {
        InterfaceC0427E interfaceC0427EA = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, ((C0453B) this.b).h(), ((C0453B) this.b).g());
        this.g = interfaceC0427EA;
        return interfaceC0427EA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(u uVar) {
        InterfaceC0437d interfaceC0437d = this.d;
        String strE = interfaceC0437d.e(com.github.catvod.spider.merge.FM.A.j.b(this.h, interfaceC0437d.i()));
        StringBuilder sbB = P.b("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strE.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb.append(strValueOf);
        }
        sbB.append(sb.toString());
        sbB.append("'");
        ((z) e()).b(this, null, this.i, this.j, sbB.toString(), uVar);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.merge.FM.x.F<?>, com.github.catvod.spider.merge.FM.x.e] */
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
    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0429G
    public final InterfaceC0427E nextToken() {
        int i;
        int i2;
        InterfaceC0437d interfaceC0437d = this.d;
        if (interfaceC0437d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC0437d.d();
        while (true) {
            try {
                if (this.k) {
                    j();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.i();
                this.j = ((C0453B) this.b).g();
                this.i = ((C0453B) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((C0453B) this.b).i(this.d, this.o);
                    } catch (u e) {
                        k(e);
                        if (this.d.h(1) != -1) {
                            ((C0453B) this.b).e(this.d);
                        }
                        i = -3;
                    }
                    if (this.d.h(1) == -1) {
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
