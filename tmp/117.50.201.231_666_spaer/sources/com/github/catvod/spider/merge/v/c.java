package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.t.C0623E;
import com.github.catvod.spider.merge.t.InterfaceC0622D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {
    private final b a;
    private final InterfaceC0622D b;

    public c(b bVar, InterfaceC0622D interfaceC0622D) {
        this.a = bVar;
        this.b = interfaceC0622D;
    }

    protected final String a(d dVar) {
        StringBuilder sb;
        int i = dVar.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.d ? ":" : "");
        sb2.append("s");
        sb2.append(i);
        sb2.append(dVar.g ? "^" : "");
        String string = sb2.toString();
        if (!dVar.d) {
            return string;
        }
        if (dVar.h != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(Arrays.toString(dVar.h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(dVar.e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    public final String toString() {
        if (this.a.b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b bVar = this.a;
        bVar.getClass();
        ArrayList<d> arrayList = new ArrayList(bVar.a.keySet());
        Collections.sort(arrayList, new a());
        for (d dVar : arrayList) {
            d[] dVarArr = dVar.c;
            int length = dVarArr != null ? dVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                d dVar2 = dVar.c[i];
                if (dVar2 != null && dVar2.a != Integer.MAX_VALUE) {
                    sb.append(a(dVar));
                    String strA = ((C0623E) this.b).a(i - 1);
                    sb.append("-");
                    sb.append(strA);
                    sb.append("->");
                    sb.append(a(dVar2));
                    sb.append('\n');
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }
}
