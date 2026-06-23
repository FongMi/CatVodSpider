package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fz extends cj {
    @Override // com.github.catvod.spider.merge.A0.cj, com.github.catvod.spider.merge.A0.bi
    public final void i(Object obj) {
        Object objA = tw.a(obj);
        xl xlVar = this.ai;
        yg context = xlVar.getContext();
        Object objD = zr.d(context, null);
        try {
            xlVar.resumeWith(objA);
        } finally {
            zr.c(context, objD);
        }
    }
}
