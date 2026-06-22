package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1332e {
    private final View a;
    private K d;
    private K e;
    private K f;
    private int c = -1;
    private final C1334g b = C1334g.b();

    C1332e(View view) {
        this.a = view;
    }

    final void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.d != null) {
                if (this.f == null) {
                    this.f = new K();
                }
                K k = this.f;
                k.a = null;
                k.d = false;
                k.b = null;
                k.c = false;
                ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.a);
                if (backgroundTintList != null) {
                    k.d = true;
                    k.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.a);
                if (backgroundTintMode != null) {
                    k.c = true;
                    k.b = backgroundTintMode;
                }
                if (k.d || k.c) {
                    int[] drawableState = this.a.getDrawableState();
                    int i2 = C1334g.d;
                    C1324G.n(background, k, drawableState);
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            K k2 = this.e;
            if (k2 != null) {
                int[] drawableState2 = this.a.getDrawableState();
                int i3 = C1334g.d;
                C1324G.n(background, k2, drawableState2);
            } else {
                K k3 = this.d;
                if (k3 != null) {
                    int[] drawableState3 = this.a.getDrawableState();
                    int i4 = C1334g.d;
                    C1324G.n(background, k3, drawableState3);
                }
            }
        }
    }

    final ColorStateList b() {
        K k = this.e;
        if (k != null) {
            return k.a;
        }
        return null;
    }

    final PorterDuff.Mode c() {
        K k = this.e;
        if (k != null) {
            return k.b;
        }
        return null;
    }

    final void d(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = com.github.catvod.spider.merge.L1.l.t;
        M mS = M.s(context, attributeSet, iArr, i, 0);
        View view = this.a;
        ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), iArr, attributeSet, mS.o(), i, 0);
        try {
            if (mS.p(0)) {
                this.c = mS.l(0, -1);
                ColorStateList colorStateListD = this.b.d(this.a.getContext(), this.c);
                if (colorStateListD != null) {
                    g(colorStateListD);
                }
            }
            if (mS.p(1)) {
                ViewCompat.setBackgroundTintList(this.a, mS.c(1));
            }
            if (mS.p(2)) {
                ViewCompat.setBackgroundTintMode(this.a, v.c(mS.i(2, -1), null));
            }
        } finally {
            mS.t();
        }
    }

    final void e() {
        this.c = -1;
        g(null);
        a();
    }

    final void f(int i) {
        this.c = i;
        C1334g c1334g = this.b;
        g(c1334g != null ? c1334g.d(this.a.getContext(), i) : null);
        a();
    }

    final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new K();
            }
            K k = this.d;
            k.a = colorStateList;
            k.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new K();
        }
        K k = this.e;
        k.a = colorStateList;
        k.d = true;
        a();
    }

    final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new K();
        }
        K k = this.e;
        k.b = mode;
        k.c = true;
        a();
    }
}
