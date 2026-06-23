package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gp extends jk {
    public final gk a;
    public final boolean b;

    public gp(gp gpVar, lq lqVar) {
        super(gpVar, lqVar, gpVar.g, gpVar.i);
        this.a = gpVar.a;
        this.b = c(gpVar, lqVar);
    }

    public gp(gp gpVar, lq lqVar, gk gkVar) {
        super(gpVar, lqVar, gpVar.g, gpVar.i);
        this.a = gkVar;
        this.b = c(gpVar, lqVar);
    }

    public gp(gp gpVar, lq lqVar, xr xrVar) {
        super(gpVar, lqVar, xrVar, gpVar.i);
        this.a = gpVar.a;
        this.b = c(gpVar, lqVar);
    }

    public gp(lq lqVar, int i, dt dtVar) {
        super(lqVar, i, dtVar, vf.e);
        this.b = false;
        this.a = null;
    }

    public static boolean c(gp gpVar, lq lqVar) {
        return gpVar.b || ((lqVar instanceof acc) && ((acc) lqVar).m);
    }

    @Override // com.github.catvod.spider.merge.A0.jk
    public final boolean d(jk jkVar) {
        boolean zEquals = true;
        if (this == jkVar) {
            return true;
        }
        if (!(jkVar instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) jkVar;
        if (this.b != gpVar.b) {
            return false;
        }
        gk gkVar = this.a;
        gk gkVar2 = gpVar.a;
        if (gkVar != null) {
            zEquals = gkVar.equals(gkVar2);
        } else if (gkVar2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.d(jkVar);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.jk
    public final int hashCode() {
        return po.e(po.k(po.j(po.k(po.k(po.j(po.j(7, this.e.e), this.f), this.g), this.i), this.b ? 1 : 0), this.a), 6);
    }
}
