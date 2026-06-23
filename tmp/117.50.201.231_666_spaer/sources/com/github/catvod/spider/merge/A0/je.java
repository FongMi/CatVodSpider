package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum je extends wa {
    public je() {
        super("RCDATAEndTagName", 12);
    }

    public static void b(hm hmVar, sf sfVar) {
        hmVar.ad("</");
        hmVar.ae(hmVar.j);
        sfVar.an();
        hmVar.al(wa.e);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        if (sfVar.ah()) {
            String strW = sfVar.w();
            hmVar.m.y(strW);
            hmVar.j.append(strW);
            return;
        }
        char cT = sfVar.t();
        if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
            if (hmVar.ak()) {
                hmVar.al(wa.aj);
                return;
            } else {
                b(hmVar, sfVar);
                return;
            }
        }
        if (cT == '/') {
            if (hmVar.ak()) {
                hmVar.al(wa.ar);
                return;
            } else {
                b(hmVar, sfVar);
                return;
            }
        }
        if (cT != '>') {
            b(hmVar, sfVar);
        } else if (!hmVar.ak()) {
            b(hmVar, sfVar);
        } else {
            hmVar.ah();
            hmVar.al(wa.c);
        }
    }
}
