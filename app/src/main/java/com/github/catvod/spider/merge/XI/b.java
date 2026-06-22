package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.KW.AbstractC0833v;
import com.github.catvod.spider.merge.KW.C0818f;
import com.github.catvod.spider.merge.KW.p0;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.yZ.J;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    public final Map<e, e> a = new HashMap();
    public volatile e b;
    public final int c;
    public final AbstractC0833v d;
    private final boolean e;

    public b(AbstractC0833v abstractC0833v, int i) {
        this.d = abstractC0833v;
        this.c = i;
        boolean z = true;
        if ((abstractC0833v instanceof p0) && ((p0) abstractC0833v).j) {
            e eVar = new e(new C0818f(true));
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
            throw new IllegalStateException(ZrJ.d("362D273468350B2628282C2017202E6D0C0338306B20293C592024233C24102D6B2C68350B2628282C2017202E6D3B3118313F6D3B3118372E63"));
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
            throw new IllegalStateException(ZrJ.d("362D273468350B2628282C2017202E6D0C0338306B20293C592024233C24102D6B2C68350B2628282C2017202E6D3B3118313F6D3B3118372E63"));
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
        return this.b == null ? "" : new c(this, J.e).toString();
    }
}
