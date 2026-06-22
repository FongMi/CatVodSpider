package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1342o {
    private final TextView a;
    private K b;
    private K c;
    private K d;
    private K e;
    private K f;
    private K g;
    private K h;
    private final t i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    C1342o(TextView textView) {
        this.a = textView;
        this.i = new t(textView);
    }

    private void a(Drawable drawable, K k) {
        if (drawable == null || k == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        int i = C1334g.d;
        C1324G.n(drawable, k, drawableState);
    }

    private static K d(Context context, C1334g c1334g, int i) {
        ColorStateList colorStateListD = c1334g.d(context, i);
        if (colorStateListD == null) {
            return null;
        }
        K k = new K();
        k.d = true;
        k.a = colorStateListD;
        return k;
    }

    private void w(Context context, M m) {
        String strM;
        Typeface typefaceCreate;
        Typeface typeface;
        this.j = m.i(2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = m.i(11, -1);
            this.k = i2;
            if (i2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!m.p(10) && !m.p(12)) {
            if (m.p(1)) {
                this.m = false;
                int i3 = m.i(1, 1);
                if (i3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (i3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (i3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = m.p(12) ? 12 : 10;
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = m.h(i4, this.j, new C1340m(this, i5, i6, new WeakReference(this.a)));
                if (typefaceH != null) {
                    if (i >= 28 && this.k != -1) {
                        typefaceH = Typeface.create(Typeface.create(typefaceH, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceH;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strM = m.m(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(strM, this.j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strM, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }

    final void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    final void c() {
        this.i.a();
    }

    final int e() {
        return this.i.d();
    }

    final int f() {
        return this.i.e();
    }

    final int g() {
        return this.i.f();
    }

    final int[] h() {
        return this.i.g();
    }

    final int i() {
        return this.i.h();
    }

    final ColorStateList j() {
        K k = this.h;
        if (k != null) {
            return k.a;
        }
        return null;
    }

    final PorterDuff.Mode k() {
        K k = this.h;
        if (k != null) {
            return k.b;
        }
        return null;
    }

    final boolean l() {
        return this.i.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.C1342o.m(android.util.AttributeSet, int):void");
    }

    final void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (ViewCompat.isAttachedToWindow(textView)) {
                    textView.post(new RunnableC1341n(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    final void o() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return;
        }
        this.i.a();
    }

    final void p(Context context, int i) {
        String strM;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        M mQ = M.q(context, i, com.github.catvod.spider.merge.L1.l.r);
        if (mQ.p(14)) {
            this.a.setAllCaps(mQ.a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (mQ.p(3) && (colorStateListC3 = mQ.c(3)) != null) {
                this.a.setTextColor(colorStateListC3);
            }
            if (mQ.p(5) && (colorStateListC2 = mQ.c(5)) != null) {
                this.a.setLinkTextColor(colorStateListC2);
            }
            if (mQ.p(4) && (colorStateListC = mQ.c(4)) != null) {
                this.a.setHintTextColor(colorStateListC);
            }
        }
        if (mQ.p(0) && mQ.e(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        w(context, mQ);
        if (i2 >= 26 && mQ.p(13) && (strM = mQ.m(13)) != null) {
            this.a.setFontVariationSettings(strM);
        }
        mQ.t();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    final void q(int i, int i2, int i3, int i4) {
        this.i.m(i, i2, i3, i4);
    }

    final void r(int[] iArr, int i) {
        this.i.n(iArr, i);
    }

    final void s(int i) {
        this.i.o(i);
    }

    final void t(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new K();
        }
        K k = this.h;
        k.a = colorStateList;
        k.d = colorStateList != null;
        this.b = k;
        this.c = k;
        this.d = k;
        this.e = k;
        this.f = k;
        this.g = k;
    }

    final void u(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new K();
        }
        K k = this.h;
        k.b = mode;
        k.c = mode != null;
        this.b = k;
        this.c = k;
        this.d = k;
        this.e = k;
        this.f = k;
        this.g = k;
    }

    final void v(int i, float f) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || this.i.k()) {
            return;
        }
        this.i.p(i, f);
    }
}
