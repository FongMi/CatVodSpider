package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.yZ.I;
import com.github.catvod.spider.merge.yZ.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    private final b a;
    private final I b;

    public c(b bVar, I i) {
        this.a = bVar;
        this.b = i;
    }

    protected final String a(e eVar) {
        StringBuilder sb;
        int i = eVar.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.d ? ZrJ.d("43") : "");
        sb2.append(ZrJ.d("0A"));
        sb2.append(i);
        sb2.append(eVar.g ? ZrJ.d("27") : "");
        String string = sb2.toString();
        if (!eVar.d) {
            return string;
        }
        d[] dVarArr = eVar.h;
        String strD = ZrJ.d("447D");
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

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
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
                    String strA = ((J) this.b).a(i - 1);
                    sb.append(ZrJ.d("54"));
                    sb.append(strA);
                    sb.append(ZrJ.d("547D"));
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
