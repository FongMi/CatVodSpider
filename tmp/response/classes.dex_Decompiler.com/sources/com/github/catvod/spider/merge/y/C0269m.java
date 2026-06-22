package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0269m implements InterfaceC0256K, Serializable {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected com.github.catvod.spider.merge.B.n<InterfaceC0252G, InterfaceC0260d> e;
    protected String f;
    protected int g = -1;
    protected int h;
    protected int i;

    public C0269m(com.github.catvod.spider.merge.B.n<InterfaceC0252G, InterfaceC0260d> nVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = nVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        InterfaceC0252G interfaceC0252G = nVar.a;
        if (interfaceC0252G != null) {
            this.b = interfaceC0252G.getLine();
            this.c = nVar.a.a();
        }
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final int a() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final InterfaceC0252G b() {
        return this.e.a;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final int c() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0256K
    public final void d(int i) {
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final int e() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final int getLine() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final String getText() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        InterfaceC0260d interfaceC0260d = this.e.b;
        if (interfaceC0260d == null) {
            return null;
        }
        int size = interfaceC0260d.size();
        int i2 = this.h;
        return (i2 >= size || (i = this.i) >= size) ? oZP.d("492A380752") : interfaceC0260d.h(com.github.catvod.spider.merge.B.j.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC0250E
    public final int getType() {
        return this.a;
    }

    public final String toString() {
        String string;
        if (this.d > 0) {
            StringBuilder sbC = C0133t.c(oZP.d("590C1F20023B10034A"));
            sbC.append(this.d);
            string = sbC.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace(oZP.d("7F"), oZP.d("2901")).replace(oZP.d("78"), oZP.d("291D")).replace(oZP.d("7C"), oZP.d("291B")) : oZP.d("4901186118300D1B49");
        String strValueOf = String.valueOf(this.a);
        StringBuilder sbC2 = C0133t.c(oZP.d("2E2F"));
        sbC2.append(this.g);
        String strD = oZP.d("59");
        sbC2.append(strD);
        sbC2.append(this.h);
        String strD2 = oZP.d("4F");
        sbC2.append(strD2);
        sbC2.append(this.i);
        sbC2.append(oZP.d("4848"));
        sbC2.append(strReplace);
        sbC2.append(oZP.d("52434B"));
        sbC2.append(strValueOf);
        sbC2.append(oZP.d("4B"));
        sbC2.append(string);
        sbC2.append(strD);
        sbC2.append(this.b);
        sbC2.append(strD2);
        sbC2.append(this.c);
        sbC2.append(oZP.d("28"));
        return sbC2.toString();
    }
}
