package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0255J;
import com.github.catvod.spider.merge.y.InterfaceC0254I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c {
    private final b a;
    private final InterfaceC0254I b;

    public c(b bVar, InterfaceC0254I interfaceC0254I) {
        this.a = bVar;
        this.b = interfaceC0254I;
    }

    protected final String a(e eVar) {
        StringBuilder sb;
        int i = eVar.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.d ? oZP.d("4F") : "");
        sb2.append(oZP.d("06"));
        sb2.append(i);
        sb2.append(eVar.g ? oZP.d("2B") : "");
        String string = sb2.toString();
        if (!eVar.d) {
            return string;
        }
        d[] dVarArr = eVar.h;
        String strD = oZP.d("4851");
        if (dVarArr != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append(strD);
            sb.append(Arrays.toString(eVar.h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append(strD);
            sb.append(eVar.e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    public final String toString() {
        if (this.a.b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b bVar = this.a;
        bVar.getClass();
        ArrayList<e> arrayList = new ArrayList(bVar.a.keySet());
        Collections.sort(arrayList, new a());
        for (e eVar : arrayList) {
            e[] eVarArr = eVar.c;
            int length = eVarArr != null ? eVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                e eVar2 = eVar.c[i];
                if (eVar2 != null && eVar2.a != Integer.MAX_VALUE) {
                    sb.append(a(eVar));
                    String strA = ((C0255J) this.b).a(i - 1);
                    sb.append(oZP.d("58"));
                    sb.append(strA);
                    sb.append(oZP.d("5851"));
                    sb.append(a(eVar2));
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
