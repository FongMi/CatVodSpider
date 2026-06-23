package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class to implements Serializable {
    public int a;
    public int b;
    public int c;
    public int d;
    public aam e;
    public String f;
    public int g;
    public int h;
    public int i;

    public final String j() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        ss ssVar = (ss) this.e.b;
        if (ssVar == null) {
            return null;
        }
        int i2 = this.h;
        int i3 = ssVar.a;
        return (i2 >= i3 || (i = this.i) >= i3) ? "<EOF>" : ssVar.f(bd.d(i2, i));
    }

    public final String toString() {
        int i = this.d;
        String strC = i > 0 ? wb.c(",channel=", i) : "";
        String strJ = j();
        return "[@" + this.g + "," + this.h + ":" + this.i + "='" + (strJ != null ? strJ.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>") + "',<" + String.valueOf(this.a) + ">" + strC + "," + this.b + ":" + this.c + "]";
    }
}
