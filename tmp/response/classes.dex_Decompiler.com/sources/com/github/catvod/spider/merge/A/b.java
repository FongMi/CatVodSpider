package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0255J;
import com.github.catvod.spider.merge.z.AbstractC0302v;
import com.github.catvod.spider.merge.z.C0287f;
import com.github.catvod.spider.merge.z.p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {
    public final Map<e, e> a = new HashMap();
    public volatile e b;
    public final int c;
    public final AbstractC0302v d;
    private final boolean e;

    public b(AbstractC0302v abstractC0302v, int i) {
        this.d = abstractC0302v;
        this.c = i;
        boolean z = true;
        if ((abstractC0302v instanceof p0) && ((p0) abstractC0302v).j) {
            e eVar = new e(new C0287f(true));
            eVar.c = new e[0];
            eVar.d = false;
            eVar.g = false;
            this.b = eVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final e a(int i) {
        if (!this.e) {
            throw new IllegalStateException(oZP.d("3A011B384C25070A142408301B0C12612813341C572C0D2C550C182F18341C0157204C25070A142408301B0C12611F21141D03611F21141B126F"));
        }
        if (i < 0 || i >= this.b.c.length) {
            return null;
        }
        return this.b.c[i];
    }

    public final boolean b() {
        return this.e;
    }

    public final void c(int i, e eVar) {
        if (!this.e) {
            throw new IllegalStateException(oZP.d("3A011B384C25070A142408301B0C12612813341C572C0D2C550C182F18341C0157204C25070A142408301B0C12611F21141D03611F21141B126F"));
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (e[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = eVar;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, C0255J.e).toString();
    }
}
