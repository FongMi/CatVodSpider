package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class e implements Serializable {
    private final EnumC1316h b;
    private final String c;
    private final boolean d;
    private final int e;

    public e(String str, boolean z, EnumC1316h enumC1316h, int i) {
        this.c = str;
        this.d = z;
        this.b = enumC1316h;
        this.e = i;
    }

    public static boolean a(e eVar, List<? extends e> list) {
        if (com.github.catvod.spider.merge.L1.m.k(list)) {
            return false;
        }
        Iterator<? extends e> it = list.iterator();
        while (it.hasNext()) {
            if (eVar.b(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean b(e eVar) {
        EnumC1316h enumC1316h;
        EnumC1316h enumC1316h2;
        return eVar != null && (enumC1316h = this.b) != null && (enumC1316h2 = eVar.b) != null && enumC1316h.b == enumC1316h2.b && this.e == eVar.e && this.d == eVar.d;
    }

    public final String c() {
        return this.c;
    }

    public final EnumC1316h d() {
        return this.b;
    }
}
