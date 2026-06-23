package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.u.C0653w;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class q extends x<Integer, C0653w> implements InterfaceC0620B {
    public InterfaceC0627d d;
    protected com.github.catvod.spider.merge.w.k<InterfaceC0620B, InterfaceC0627d> e;
    public z g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected InterfaceC0619A<?> f = j.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.w.g n = new com.github.catvod.spider.merge.w.g();
    public int o = 0;

    public q(InterfaceC0627d interfaceC0627d) {
        this.d = interfaceC0627d;
        this.e = new com.github.catvod.spider.merge.w.k<>(this, interfaceC0627d);
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0620B
    public final int a() {
        return ((C0653w) this.b).g();
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0620B
    public final InterfaceC0619A<? extends z> b() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0620B
    public final InterfaceC0627d getInputStream() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.t.InterfaceC0620B
    public final int getLine() {
        return ((C0653w) this.b).h();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.t.A<?>, com.github.catvod.spider.merge.t.j] */
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
    public final z i() {
        z zVarA = this.f.a(this.e, -1, null, 0, this.d.h(), this.d.h() - 1, ((C0653w) this.b).h(), ((C0653w) this.b).g());
        this.g = zVarA;
        return zVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(r rVar) {
        InterfaceC0627d interfaceC0627d = this.d;
        String strD = interfaceC0627d.d(com.github.catvod.spider.merge.w.h.b(this.h, interfaceC0627d.h()));
        StringBuilder sbA = C0529a.a("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strD.toCharArray()) {
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
        sbA.append(sb.toString());
        sbA.append("'");
        ((v) d()).d(this, null, this.i, this.j, sbA.toString(), rVar);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.merge.t.A<?>, com.github.catvod.spider.merge.t.j] */
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
    @Override // com.github.catvod.spider.merge.t.InterfaceC0620B
    public final z nextToken() {
        int i;
        int i2;
        InterfaceC0627d interfaceC0627d = this.d;
        if (interfaceC0627d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC0627d.c();
        while (true) {
            try {
                if (this.k) {
                    i();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.h();
                this.j = ((C0653w) this.b).g();
                this.i = ((C0653w) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((C0653w) this.b).i(this.d, this.o);
                    } catch (r e) {
                        j(e);
                        if (this.d.g(1) != -1) {
                            ((C0653w) this.b).e(this.d);
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
                    this.g = this.f.a(this.e, i2, null, this.l, this.h, this.d.h() - 1, this.i, this.j);
                }
            } finally {
                this.d.release();
            }
        }
        return this.g;
    }
}
