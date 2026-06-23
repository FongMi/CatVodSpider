package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class lq {
    public int f;
    public ii i;
    public jj d = null;
    public int e = -1;
    public boolean g = false;
    public final ArrayList h = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    public abstract int a();

    public final boolean equals(Object obj) {
        return (obj instanceof lq) && this.e == ((lq) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final void j(nw nwVar) {
        ArrayList<nw> arrayList = this.h;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.g = nwVar.e();
        } else if (this.g != nwVar.e()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.e));
            this.g = false;
        }
        for (nw nwVar2 : arrayList) {
            if (nwVar2.g.e == nwVar.g.e) {
                if (nwVar2.c() != null && nwVar.c() != null && nwVar2.c().equals(nwVar.c())) {
                    return;
                }
                if (nwVar2.e() && nwVar.e()) {
                    return;
                }
            }
        }
        arrayList.add(size, nwVar);
    }

    public final nw k(int i) {
        return (nw) this.h.get(i);
    }

    public final String toString() {
        return String.valueOf(this.e);
    }
}
