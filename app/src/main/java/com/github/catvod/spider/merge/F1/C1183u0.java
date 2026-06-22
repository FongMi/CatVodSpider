package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1183u0 extends C1150k {
    final /* synthetic */ String t;
    final /* synthetic */ C1186v0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1183u0(C1186v0 c1186v0, n2 n2Var, n2 n2Var2, String str) {
        super(n2Var, n2Var2);
        this.u = c1186v0;
        this.t = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        Object obj;
        Object[] objArr2;
        C1186v0 c1186v0 = this.u;
        Object objD1 = objArr.length > 0 ? C1099O.D1(c1185v, n2Var2, objArr[0], C1099O.F1(c1186v0.c[0])) : G2.b;
        Object obj2 = c1186v0.g;
        if (obj2 == null) {
            objArr2 = new Object[]{objD1};
            obj = n2Var2;
        } else {
            Object[] objArr3 = {n2Var2, objD1};
            obj = obj2;
            objArr2 = objArr3;
        }
        return c1186v0.c(obj, objArr2);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        return this.t;
    }
}
