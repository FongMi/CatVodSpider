package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.A.C0022x;
import com.github.catvod.spider.merge.A.T;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class f implements Serializable {
    public final int a;
    public int b;
    public int c;
    public final int d;
    public final com.github.catvod.spider.merge.C.h e;
    public String f;
    public int g = -1;
    public final int h;
    public final int i;

    public f(com.github.catvod.spider.merge.C.h hVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = hVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        Object obj = hVar.a;
        if (obj != null) {
            this.b = ((C0022x) ((m) ((v) obj)).b).f;
            this.c = ((C0022x) ((m) ((v) obj)).b).g;
        }
    }

    public final String a() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        d dVar = (d) this.e.b;
        if (dVar == null) {
            return null;
        }
        int i2 = this.h;
        int i3 = dVar.a;
        return (i2 >= i3 || (i = this.i) >= i3) ? "<EOF>" : dVar.b(com.github.catvod.spider.merge.C.e.a(i2, i));
    }

    public final String toString() {
        int i = this.d;
        String strD = i > 0 ? T.d(i, ",channel=") : "";
        String strA = a();
        return "[@" + this.g + "," + this.h + ":" + this.i + "='" + (strA != null ? strA.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>") + "',<" + String.valueOf(this.a) + ">" + strD + "," + this.b + ":" + this.c + "]";
    }
}
