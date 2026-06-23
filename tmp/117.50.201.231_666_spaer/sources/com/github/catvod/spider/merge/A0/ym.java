package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ym extends pc implements xn {
    public static final yl w = new yl(jo.c, yk.a);

    public ym() {
        super(jo.c);
    }

    public abstract void e(yg ygVar, acw acwVar);

    public boolean g() {
        return !(this instanceof Cif);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.merge.A0.qw, com.github.catvod.spider.merge.A0.zy] */
    @Override // com.github.catvod.spider.merge.A0.pc, com.github.catvod.spider.merge.A0.yg
    public final xo get(xp xpVar) {
        ko.f("key", xpVar);
        if (!(xpVar instanceof yl)) {
            if (jo.c == xpVar) {
                return this;
            }
            return null;
        }
        yl ylVar = (yl) xpVar;
        xp key = getKey();
        ko.f("key", key);
        if (key != ylVar && ylVar.b != key) {
            return null;
        }
        xo xoVar = (xo) ylVar.a.invoke(this);
        if (xoVar instanceof xo) {
            return xoVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.merge.A0.qw, com.github.catvod.spider.merge.A0.zy] */
    @Override // com.github.catvod.spider.merge.A0.pc, com.github.catvod.spider.merge.A0.yg
    public final yg minusKey(xp xpVar) {
        ko.f("key", xpVar);
        boolean z = xpVar instanceof yl;
        ek ekVar = ek.a;
        if (z) {
            yl ylVar = (yl) xpVar;
            xp key = getKey();
            ko.f("key", key);
            if ((key == ylVar || ylVar.b == key) && ((xo) ylVar.a.invoke(this)) != null) {
                return ekVar;
            }
        } else if (jo.c == xpVar) {
            return ekVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + rs.a(this);
    }
}
