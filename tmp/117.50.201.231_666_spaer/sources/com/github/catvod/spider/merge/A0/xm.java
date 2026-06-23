package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class xm extends qi {
    private final yg _context;
    private transient xl intercepted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(xl xlVar) {
        super(xlVar);
        yg context = xlVar != null ? xlVar.getContext() : null;
        this._context = context;
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public yg getContext() {
        yg ygVar = this._context;
        ko.c(ygVar);
        return ygVar;
    }

    public final xl intercepted() {
        xl acuVar = this.intercepted;
        if (acuVar == null) {
            xn xnVar = (xn) getContext().get(jo.c);
            acuVar = xnVar != null ? new acu((ym) xnVar, this) : this;
            this.intercepted = acuVar;
        }
        return acuVar;
    }

    @Override // com.github.catvod.spider.merge.A0.qi
    public void releaseIntercepted() {
        xl xlVar = this.intercepted;
        if (xlVar != null && xlVar != this) {
            xo xoVar = getContext().get(jo.c);
            ko.c(xoVar);
            sa saVarG = ((acu) xlVar).g();
            if (saVarG != null) {
                saVarG.r();
            }
        }
        this.intercepted = ts.a;
    }
}
