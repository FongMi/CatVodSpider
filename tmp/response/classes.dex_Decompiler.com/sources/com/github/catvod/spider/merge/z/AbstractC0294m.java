package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0294m {
    public int c;
    public com.github.catvod.spider.merge.B.k f;
    public C0282a a = null;
    public int b = -1;
    public boolean d = false;
    protected final List<t0> e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList(oZP.d("3C212100201C31"), oZP.d("372E24082F"), oZP.d("273A3B043306212E2515"), oZP.d("37233802270A263B361338"), oZP.d("2523221233173920340A3306212E2515"), oZP.d("263B361333173920340A3306212E2515"), oZP.d("21203C04220A263B361338"), oZP.d("273A3B043306212027"), oZP.d("37233802270A302133"), oZP.d("263B361333193A20271E2E143624"), oZP.d("263B361333193A20271E291B213D2E"), oZP.d("2523221233193A20271E2E143624"), oZP.d("3920381133103B2B")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    public final void a(t0 t0Var) {
        int size = this.e.size();
        boolean z = false;
        if (this.e.isEmpty()) {
            this.d = t0Var.b();
        } else if (this.d != t0Var.b()) {
            System.err.format(Locale.getDefault(), oZP.d("343B39611F21141B12614931550716324C371A1B1F61092506061B2E027514011361023A1B4212311F3C19001961182714010428183C1A01046F66"), Integer.valueOf(this.b));
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    public final int b() {
        return this.e.size();
    }

    public abstract int c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    public final t0 d(int i) {
        return (t0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0294m) && this.b == ((AbstractC0294m) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
