package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.a.C0529a;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i implements F, Serializable {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected com.github.catvod.spider.merge.w.k<InterfaceC0620B, InterfaceC0627d> e;
    protected String f;
    protected int g = -1;
    protected int h;
    protected int i;

    public i(com.github.catvod.spider.merge.w.k<InterfaceC0620B, InterfaceC0627d> kVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = kVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        InterfaceC0620B interfaceC0620B = kVar.a;
        if (interfaceC0620B != null) {
            this.b = interfaceC0620B.getLine();
            this.c = kVar.a.a();
        }
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final int a() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final InterfaceC0620B b() {
        return this.e.a;
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final int c() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.t.F
    public final void d(int i) {
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final int e() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final int getLine() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final String getText() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        InterfaceC0627d interfaceC0627d = this.e.b;
        if (interfaceC0627d == null) {
            return null;
        }
        int size = interfaceC0627d.size();
        int i2 = this.h;
        return (i2 >= size || (i = this.i) >= size) ? "<EOF>" : interfaceC0627d.d(com.github.catvod.spider.merge.w.h.b(i2, i));
    }

    @Override // com.github.catvod.spider.merge.t.z
    public final int getType() {
        return this.a;
    }

    public final String toString() {
        String string;
        if (this.d > 0) {
            StringBuilder sbA = C0529a.a(",channel=");
            sbA.append(this.d);
            string = sbA.toString();
        } else {
            string = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.a);
        StringBuilder sbA2 = C0529a.a("[@");
        sbA2.append(this.g);
        sbA2.append(",");
        sbA2.append(this.h);
        sbA2.append(":");
        sbA2.append(this.i);
        sbA2.append("='");
        sbA2.append(strReplace);
        sbA2.append("',<");
        com.github.catvod.spider.merge.b.x.a(sbA2, strValueOf, ">", string, ",");
        sbA2.append(this.b);
        sbA2.append(":");
        sbA2.append(this.c);
        sbA2.append("]");
        return sbA2.toString();
    }
}
