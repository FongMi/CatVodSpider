package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class oh {
    public static final Object a(long j, xm xmVar) {
        if (j <= 0) {
            return jo.i;
        }
        sa saVar = new sa(hj.a(xmVar));
        saVar.w();
        if (j < Long.MAX_VALUE) {
            xo xoVar = saVar.f.get(jo.c);
            if (!(xoVar instanceof acp)) {
                xoVar = null;
            }
            acp acpVar = (acp) xoVar;
            if (acpVar == null) {
                acpVar = ack.a;
            }
            acpVar.d(j, saVar);
        }
        return saVar.t();
    }
}
