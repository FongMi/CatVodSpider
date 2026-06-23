package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.L.P;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0446m implements InterfaceC0433K, Serializable {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected com.github.catvod.spider.merge.FM.A.n<InterfaceC0429G, InterfaceC0437d> e;
    protected String f;
    protected int g = -1;
    protected int h;
    protected int i;

    public C0446m(com.github.catvod.spider.merge.FM.A.n<InterfaceC0429G, InterfaceC0437d> nVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = nVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        InterfaceC0429G interfaceC0429G = nVar.a;
        if (interfaceC0429G != null) {
            this.b = interfaceC0429G.getLine();
            this.c = nVar.a.a();
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final int a() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final InterfaceC0429G b() {
        return this.e.a;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final int c() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0433K
    public final void d(int i) {
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final int e() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final int getLine() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final String getText() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        InterfaceC0437d interfaceC0437d = this.e.b;
        if (interfaceC0437d == null) {
            return null;
        }
        int size = interfaceC0437d.size();
        int i2 = this.h;
        return (i2 >= size || (i = this.i) >= size) ? "<EOF>" : interfaceC0437d.e(com.github.catvod.spider.merge.FM.A.j.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0427E
    public final int getType() {
        return this.a;
    }

    public final String toString() {
        String string;
        if (this.d > 0) {
            StringBuilder sbB = P.b(",channel=");
            sbB.append(this.d);
            string = sbB.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.a);
        StringBuilder sbB2 = P.b("[@");
        sbB2.append(this.g);
        sbB2.append(",");
        sbB2.append(this.h);
        sbB2.append(":");
        sbB2.append(this.i);
        sbB2.append("='");
        sbB2.append(strReplace);
        sbB2.append("',<");
        sbB2.append(strValueOf);
        sbB2.append(">");
        sbB2.append(string);
        sbB2.append(",");
        sbB2.append(this.b);
        sbB2.append(":");
        sbB2.append(this.c);
        sbB2.append("]");
        return sbB2.toString();
    }
}
