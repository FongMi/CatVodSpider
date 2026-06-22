package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1334g {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static C1334g c;
    public static final /* synthetic */ int d = 0;
    private C1324G a;

    public static synchronized C1334g b() {
        if (c == null) {
            e();
        }
        return c;
    }

    public static synchronized void e() {
        if (c == null) {
            C1334g c1334g = new C1334g();
            c = c1334g;
            c1334g.a = C1324G.d();
            c.a.l(new C1333f());
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.a.f(context, i);
    }

    final synchronized ColorStateList d(Context context, int i) {
        return this.a.i(context, i);
    }
}
