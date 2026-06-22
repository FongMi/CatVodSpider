package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.L.g;
import com.github.catvod.spider.merge.L.q;
import com.github.catvod.spider.merge.M.C0030a;
import com.github.catvod.spider.merge.N.p;
import com.github.catvod.spider.merge.z.w;
import com.github.catvod.spider.merge.z.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c implements p {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(b bVar, w wVar) {
        this.b = bVar;
        this.c = wVar;
    }

    public static String c(e eVar) {
        StringBuilder sb;
        int i = eVar.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.d ? ":" : "");
        sb2.append("s");
        sb2.append(i);
        sb2.append(eVar.g ? "^" : "");
        String string = sb2.toString();
        if (!eVar.d) {
            return string;
        }
        if (eVar.h != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(Arrays.toString(eVar.h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(eVar.e);
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void a(q qVar, int i) {
        if (qVar.o().equals("#text")) {
            return;
        }
        try {
            qVar.r((Appendable) this.b, i, (g) this.c);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void b(q qVar, int i) {
        try {
            qVar.q((Appendable) this.b, i, (g) this.c);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((b) this.b).b == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                b bVar = (b) this.b;
                bVar.getClass();
                ArrayList<e> arrayList = new ArrayList(bVar.a.keySet());
                Collections.sort(arrayList, new a());
                for (e eVar : arrayList) {
                    e[] eVarArr = eVar.c;
                    int length = eVarArr != null ? eVarArr.length : 0;
                    for (int i = 0; i < length; i++) {
                        e eVar2 = eVar.c[i];
                        if (eVar2 != null && eVar2.a != Integer.MAX_VALUE) {
                            sb.append(c(eVar));
                            String strA = ((x) ((w) this.c)).a(i - 1);
                            sb.append("-");
                            sb.append(strA);
                            sb.append("->");
                            sb.append(c(eVar2));
                            sb.append('\n');
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() == 0) {
                    return null;
                }
                return string;
            case 1:
            default:
                return super.toString();
            case 2:
                return "<" + ((String) this.b) + ">: " + ((String) this.c);
        }
    }

    public c(C0030a c0030a, String str) {
        c0030a.getClass();
        this.b = c0030a.m();
        this.c = str;
    }

    public c(C0030a c0030a, String str, Object[] objArr) {
        c0030a.getClass();
        this.b = c0030a.m();
        this.c = String.format(str, objArr);
    }

    public c(StringBuilder sb, g gVar) {
        this.b = sb;
        this.c = gVar;
        gVar.b();
    }
}
