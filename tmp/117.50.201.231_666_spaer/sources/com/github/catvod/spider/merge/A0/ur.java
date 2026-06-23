package com.github.catvod.spider.merge.A0;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ur extends fw {
    public Object d;

    public ur(String str) {
        wc.e(str);
        this.d = str;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String as(String str) {
        g();
        return super.as(str);
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String au(String str) {
        return !(this.d instanceof qh) ? s().equals(str) ? (String) this.d : "" : super.au(str);
    }

    public final ur e(String str, String str2) {
        if ((this.d instanceof qh) || !str.equals("#doctype")) {
            g();
            fw fwVarX = x();
            em emVar = fwVarX instanceof em ? (em) fwVarX : null;
            (emVar != null ? emVar.al : new xa(new zl())).getClass();
            String strC = qf.c(str.trim());
            qh qhVarL = l();
            int iM = qhVarL.m(strC);
            if (iM != -1) {
                qhVarL.c[iM] = str2;
                if (!qhVarL.b[iM].equals(strC)) {
                    qhVarL.b[iM] = strC;
                }
            } else {
                qhVarL.e(strC, str2);
            }
        } else {
            this.d = str2;
        }
        return this;
    }

    public final String f() {
        return au(s());
    }

    public final void g() {
        Object obj = this.d;
        if (obj instanceof qh) {
            return;
        }
        qh qhVar = new qh();
        this.d = qhVar;
        qhVar.n(s(), (String) obj);
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final qh l() {
        g();
        return (qh) this.d;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String m() {
        fw fwVar = this.ap;
        return fwVar != null ? fwVar.m() : "";
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final int n() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw o(fw fwVar) {
        ur urVar = (ur) super.o(fwVar);
        Object obj = this.d;
        if (obj instanceof qh) {
            urVar.d = ((qh) obj).clone();
        }
        return urVar;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw p() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final List q() {
        return fw.ao;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final boolean r() {
        return this.d instanceof qh;
    }
}
