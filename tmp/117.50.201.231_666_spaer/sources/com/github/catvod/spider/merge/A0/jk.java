package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class jk {
    public final lq e;
    public final int f;
    public xr g;
    public int h;
    public final vf i;

    public jk(jk jkVar, lq lqVar, xr xrVar, vf vfVar) {
        this.e = lqVar;
        this.f = jkVar.f;
        this.g = xrVar;
        this.i = vfVar;
        this.h = jkVar.h;
    }

    public jk(lq lqVar, int i, xr xrVar) {
        this(lqVar, i, xrVar, vf.e);
    }

    public jk(lq lqVar, int i, xr xrVar, vf vfVar) {
        this.e = lqVar;
        this.f = i;
        this.g = xrVar;
        this.i = vfVar;
    }

    public boolean d(jk jkVar) {
        xr xrVar;
        xr xrVar2;
        if (this == jkVar) {
            return true;
        }
        return jkVar != null && this.e.e == jkVar.e.e && this.f == jkVar.f && ((xrVar = this.g) == (xrVar2 = jkVar.g) || (xrVar != null && xrVar.equals(xrVar2))) && this.i.equals(jkVar.i) && j() == jkVar.j();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jk) {
            return d((jk) obj);
        }
        return false;
    }

    public int hashCode() {
        return po.e(po.k(po.k(po.j(po.j(7, this.e.e), this.f), this.g), this.i), 4);
    }

    public final boolean j() {
        return (this.h & 1073741824) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.e);
        sb.append(",");
        sb.append(this.f);
        if (this.g != null) {
            sb.append(",[");
            sb.append(this.g.toString());
            sb.append("]");
        }
        vf vfVar = this.i;
        if (vfVar != null && vfVar != vf.e) {
            sb.append(",");
            sb.append(vfVar);
        }
        if ((this.h & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.h & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
