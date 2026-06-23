package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum qy extends wa {
    public qy() {
        super("CdataSection", 66);
    }

    @Override // com.github.catvod.spider.merge.A0.wa
    public final void a(hm hmVar, sf sfVar) {
        String strP;
        int iAj = sfVar.aj("]]>");
        if (iAj != -1) {
            strP = sf.p(sfVar.e, sfVar.c, sfVar.f, iAj);
            sfVar.f += iAj;
        } else {
            int i = sfVar.g;
            int i2 = sfVar.f;
            if (i - i2 < 3) {
                sfVar.r();
                char[] cArr = sfVar.e;
                String[] strArr = sfVar.c;
                int i3 = sfVar.f;
                strP = sf.p(cArr, strArr, i3, sfVar.g - i3);
                sfVar.f = sfVar.g;
            } else {
                int i4 = i - 2;
                strP = sf.p(sfVar.e, sfVar.c, i2, i4 - i2);
                sfVar.f = i4;
            }
        }
        hmVar.j.append(strP);
        if (sfVar.ad("]]>") || sfVar.ab()) {
            String string = hmVar.j.toString();
            e eVar = new e(5);
            eVar.b = string;
            hmVar.ac(eVar);
            hmVar.al(wa.c);
        }
    }
}
