package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jl extends xy {
    public static final jl a = new jl(0);
    public static final jl b = new jl(1);
    public static final jl c = new jl(2);
    public final /* synthetic */ int d;

    public /* synthetic */ jl(int i) {
        this.d = i;
    }

    @Override // com.github.catvod.spider.merge.A0.xy
    public final boolean e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                jk jkVar = (jk) obj;
                jk jkVar2 = (jk) obj2;
                if (jkVar == jkVar2) {
                    return true;
                }
                return jkVar2 != null && jkVar.e.e == jkVar2.e.e && jkVar.f == jkVar2.f && jkVar.i.equals(jkVar2.i);
            case 1:
                return obj.equals(obj2);
            default:
                jk jkVar3 = (jk) obj;
                jk jkVar4 = (jk) obj2;
                if (jkVar3 == jkVar4) {
                    return true;
                }
                return jkVar4 != null && jkVar3.e.e == jkVar4.e.e && jkVar3.g.equals(jkVar4.g);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.xy
    public final int f(Object obj) {
        switch (this.d) {
            case 0:
                jk jkVar = (jk) obj;
                return jkVar.i.hashCode() + ((((217 + jkVar.e.e) * 31) + jkVar.f) * 31);
            case 1:
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            default:
                jk jkVar2 = (jk) obj;
                return po.e(po.k(po.j(7, jkVar2.e.e), jkVar2.g), 2);
        }
    }
}
