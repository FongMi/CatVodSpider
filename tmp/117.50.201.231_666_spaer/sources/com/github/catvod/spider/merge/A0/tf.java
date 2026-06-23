package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class tf implements yg, Serializable {
    public final yg a;
    public final xo b;

    public tf(yg ygVar, xo xoVar) {
        ko.f("left", ygVar);
        ko.f("element", xoVar);
        this.a = ygVar;
        this.b = xoVar;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this != obj) {
            if (!(obj instanceof tf)) {
                return false;
            }
            tf tfVar = (tf) obj;
            tfVar.getClass();
            int i = 2;
            tf tfVar2 = tfVar;
            int i2 = 2;
            while (true) {
                yg ygVar = tfVar2.a;
                tfVar2 = ygVar instanceof tf ? (tf) ygVar : null;
                if (tfVar2 == null) {
                    break;
                }
                i2++;
            }
            tf tfVar3 = this;
            while (true) {
                yg ygVar2 = tfVar3.a;
                tfVar3 = ygVar2 instanceof tf ? (tf) ygVar2 : null;
                if (tfVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            tf tfVar4 = this;
            while (true) {
                xo xoVar = tfVar4.b;
                if (!ko.b(tfVar.get(xoVar.getKey()), xoVar)) {
                    zB = false;
                    break;
                }
                yg ygVar3 = tfVar4.a;
                if (!(ygVar3 instanceof tf)) {
                    ko.d("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", ygVar3);
                    xo xoVar2 = (xo) ygVar3;
                    zB = ko.b(tfVar.get(xoVar2.getKey()), xoVar2);
                    break;
                }
                tfVar4 = (tf) ygVar3;
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final Object fold(Object obj, ha haVar) {
        return haVar.invoke(this.a.fold(obj, haVar), this.b);
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final xo get(xp xpVar) {
        ko.f("key", xpVar);
        tf tfVar = this;
        while (true) {
            xo xoVar = tfVar.b.get(xpVar);
            if (xoVar != null) {
                return xoVar;
            }
            yg ygVar = tfVar.a;
            if (!(ygVar instanceof tf)) {
                return ygVar.get(xpVar);
            }
            tfVar = (tf) ygVar;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg minusKey(xp xpVar) {
        ko.f("key", xpVar);
        xo xoVar = this.b;
        xo xoVar2 = xoVar.get(xpVar);
        yg ygVar = this.a;
        if (xoVar2 != null) {
            return ygVar;
        }
        yg ygVarMinusKey = ygVar.minusKey(xpVar);
        return ygVarMinusKey == ygVar ? this : ygVarMinusKey == ek.a ? xoVar : new tf(ygVarMinusKey, xoVar);
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg plus(yg ygVar) {
        ko.f("context", ygVar);
        return ygVar == ek.a ? this : (yg) ygVar.fold(this, te.b);
    }

    public final String toString() {
        return "[" + ((String) fold("", te.a)) + ']';
    }
}
