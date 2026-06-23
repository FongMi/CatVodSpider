package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum gi extends wa {
    public gi() {
        super("TagName", 9);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        char c;
        sfVar.r();
        int i = sfVar.f;
        int i2 = sfVar.g;
        char[] cArr = sfVar.e;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '>') {
            i3++;
        }
        sfVar.f = i3;
        hmVar.m.y(i3 > i ? sf.p(sfVar.e, sfVar.c, i, i3 - i) : "");
        char cT = sfVar.t();
        if (cT == 0) {
            hmVar.m.y(wa.bt);
            return;
        }
        if (cT != ' ') {
            if (cT == '/') {
                hmVar.al(wa.ar);
                return;
            }
            cp cpVar = wa.c;
            if (cT == '>') {
                hmVar.ah();
                hmVar.al(cpVar);
                return;
            }
            if (cT == 65535) {
                hmVar.ai(this);
                hmVar.al(cpVar);
                return;
            } else if (cT != '\t' && cT != '\n' && cT != '\f' && cT != '\r') {
                wk wkVar = hmVar.m;
                wkVar.getClass();
                wkVar.y(String.valueOf(cT));
                return;
            }
        }
        hmVar.al(wa.aj);
    }
}
