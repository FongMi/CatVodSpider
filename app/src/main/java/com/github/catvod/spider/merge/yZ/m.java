package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m implements K, Serializable {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected com.github.catvod.spider.merge.Bk.n<G, InterfaceC1439d> e;
    protected String f;
    protected int g = -1;
    protected int h;
    protected int i;

    public m(com.github.catvod.spider.merge.Bk.n<G, InterfaceC1439d> nVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = nVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        G g = nVar.a;
        if (g != null) {
            this.b = g.getLine();
            this.c = nVar.a.a();
        }
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final int a() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final G b() {
        return this.e.a;
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final int c() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.yZ.K
    public final void d(int i) {
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final int e() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final int getLine() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final String getText() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        InterfaceC1439d interfaceC1439d = this.e.b;
        if (interfaceC1439d == null) {
            return null;
        }
        int size = interfaceC1439d.size();
        int i2 = this.h;
        return (i2 >= size || (i = this.i) >= size) ? ZrJ.d("4506040B76") : interfaceC1439d.h(com.github.catvod.spider.merge.Bk.j.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.yZ.E
    public final int getType() {
        return this.a;
    }

    public final String toString() {
        String string;
        if (this.d > 0) {
            StringBuilder sbB = C0925t.b(ZrJ.d("5520232C262B1C2F76"));
            sbB.append(this.d);
            string = sbB.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace(ZrJ.d("73"), ZrJ.d("252D")).replace(ZrJ.d("74"), ZrJ.d("2531")).replace(ZrJ.d("70"), ZrJ.d("2537")) : ZrJ.d("452D246D3C20013775");
        String strValueOf = String.valueOf(this.a);
        StringBuilder sbB2 = C0925t.b(ZrJ.d("2203"));
        sbB2.append(this.g);
        String strD = ZrJ.d("55");
        sbB2.append(strD);
        sbB2.append(this.h);
        String strD2 = ZrJ.d("43");
        sbB2.append(strD2);
        sbB2.append(this.i);
        sbB2.append(ZrJ.d("4464"));
        sbB2.append(strReplace);
        sbB2.append(ZrJ.d("5E6F77"));
        sbB2.append(strValueOf);
        sbB2.append(ZrJ.d("47"));
        sbB2.append(string);
        sbB2.append(strD);
        sbB2.append(this.b);
        sbB2.append(strD2);
        sbB2.append(this.c);
        sbB2.append(ZrJ.d("24"));
        return sbB2.toString();
    }
}
