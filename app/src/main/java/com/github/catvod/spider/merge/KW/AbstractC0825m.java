package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0825m {
    public int c;
    public com.github.catvod.spider.merge.Bk.k f;
    public C0813a a = null;
    public int b = -1;
    public boolean d = false;
    protected final List<t0> e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList(ZrJ.d("300D1D0C040C3D"), ZrJ.d("3B0218040B"), ZrJ.d("2B16070817162D021919"), ZrJ.d("3B0F040E031A2A170A1F1C"), ZrJ.d("290F1E1E1707350C080617162D021919"), ZrJ.d("2A170A1F1707350C080617162D021919"), ZrJ.d("2D0C0008061A2A170A1F1C"), ZrJ.d("2B16070817162D0C1B"), ZrJ.d("3B0F040E031A3C0D0F"), ZrJ.d("2A170A1F1709360C1B120A043A08"), ZrJ.d("2A170A1F1709360C1B120D0B2D1112"), ZrJ.d("290F1E1E1709360C1B120A043A08"), ZrJ.d("350C041D17003707")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    public final void a(t0 t0Var) {
        int size = this.e.size();
        boolean z = false;
        if (this.e.isEmpty()) {
            this.d = t0Var.b();
        } else if (this.d != t0Var.b()) {
            System.err.format(Locale.getDefault(), ZrJ.d("3817056D3B3118372E6D6D21592B2A3E68271637236D2D350A2A27222665182D2F6D262A176E2E3D3B2C152C256D3C37182D38243C2C162D386342"), Integer.valueOf(this.b));
            this.d = false;
        }
        for (t0 t0Var2 : this.e) {
            if (t0Var2.a.b == t0Var.a.b && ((t0Var2.c() != null && t0Var.c() != null && t0Var2.c().equals(t0Var.c())) || (t0Var2.b() && t0Var.b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.e.add(size, t0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    public final int b() {
        return this.e.size();
    }

    public abstract int c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    public final t0 d(int i) {
        return (t0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0825m) && this.b == ((AbstractC0825m) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
