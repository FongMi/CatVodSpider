package com.github.catvod.spider.merge.z;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class m extends u implements v {
    public final d d;
    public final com.github.catvod.spider.merge.C.h e;
    public f g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public final g f = g.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.C.d n = new com.github.catvod.spider.merge.C.d();
    public int o = 0;

    public m(d dVar) {
        this.d = dVar;
        this.e = new com.github.catvod.spider.merge.C.h(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(n nVar) {
        int i = this.h;
        d dVar = this.d;
        String strB = dVar.b(com.github.catvod.spider.merge.C.e.a(i, dVar.b));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strB.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb2.append(strValueOf);
        }
        sb.append(sb2.toString());
        sb.append("'");
        String string = sb.toString();
        t tVar = this.a;
        if (tVar == null) {
            throw new NullPointerException("delegates");
        }
        int i2 = this.i;
        int i3 = this.j;
        Iterator<E> it = tVar.iterator();
        while (it.hasNext()) {
            ((i) it.next()).d(this, null, i2, i3, string, nVar);
        }
    }
}
