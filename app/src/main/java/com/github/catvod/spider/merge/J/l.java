package com.github.catvod.spider.merge.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class l extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int n = 0;
    private AbstractC1273k b;
    private Rect c;
    private Drawable d;
    private Drawable e;
    private boolean g;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private C1272j m;
    private int f = 255;
    private int h = -1;

    l() {
    }

    private void d(Drawable drawable) {
        if (this.m == null) {
            this.m = new C1272j();
        }
        C1272j c1272j = this.m;
        c1272j.b(drawable.getCallback());
        drawable.setCallback(c1272j);
        try {
            if (this.b.y <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            AbstractC1273k abstractC1273k = this.b;
            if (abstractC1273k.C) {
                drawable.setColorFilter(abstractC1273k.B);
            } else {
                if (abstractC1273k.F) {
                    DrawableCompat.setTintList(drawable, abstractC1273k.D);
                }
                AbstractC1273k abstractC1273k2 = this.b;
                if (abstractC1273k2.G) {
                    DrawableCompat.setTintMode(drawable, abstractC1273k2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.b.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            }
            if (i >= 19) {
                DrawableCompat.setAutoMirrored(drawable, this.b.A);
            }
            Rect rect = this.c;
            if (i >= 21 && rect != null) {
                DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    final void a(boolean z) {
        boolean z2;
        boolean z3 = true;
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.d;
        if (drawable != null) {
            long j = this.k;
            if (j == 0) {
                z2 = false;
            } else if (j <= jUptimeMillis) {
                drawable.setAlpha(this.f);
                this.k = 0L;
                z2 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.b.y)) * this.f) / 255);
                z2 = true;
            }
        } else {
            this.k = 0L;
            z2 = false;
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            long j2 = this.l;
            if (j2 == 0) {
                z3 = z2;
            } else if (j2 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.e = null;
                this.l = 0L;
                z3 = z2;
            } else {
                drawable2.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.b.z) * this.f) / 255);
            }
        } else {
            this.l = 0L;
            z3 = z2;
        }
        if (z && z3) {
            scheduleSelf(this.j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.b.b(theme);
    }

    AbstractC1273k b() {
        throw null;
    }

    final int c() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean e(int r10) {
        /*
            r9 = this;
            int r0 = r9.h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            com.github.catvod.spider.merge.j.k r0 = r9.b
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L29
            r9.e = r0
            com.github.catvod.spider.merge.j.k r0 = r9.b
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.l = r0
            goto L35
        L29:
            r9.e = r4
            r9.l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            com.github.catvod.spider.merge.j.k r0 = r9.b
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.f(r10)
            r9.d = r0
            r9.h = r10
            if (r0 == 0) goto L5a
            com.github.catvod.spider.merge.j.k r10 = r9.b
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.k = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.d = r4
            r10 = -1
            r9.h = r10
        L5a:
            long r0 = r9.k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.j
            if (r0 != 0) goto L73
            com.github.catvod.spider.merge.j.h r0 = new com.github.catvod.spider.merge.j.h
            r0.<init>(r9)
            r9.j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.j.l.e(int):boolean");
    }

    void f(AbstractC1273k abstractC1273k) {
        this.b = abstractC1273k;
        int i = this.h;
        if (i >= 0) {
            Drawable drawableF = abstractC1273k.f(i);
            this.d = drawableF;
            if (drawableF != null) {
                d(drawableF);
            }
        }
        this.e = null;
    }

    final void g(Resources resources) {
        this.b.k(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC1273k abstractC1273k = this.b;
        return changingConfigurations | abstractC1273k.e | abstractC1273k.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.b.c()) {
            return null;
        }
        this.b.d = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.l) {
            if (!abstractC1273k.m) {
                abstractC1273k.d();
            }
            return abstractC1273k.o;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.l) {
            if (!abstractC1273k.m) {
                abstractC1273k.d();
            }
            return abstractC1273k.n;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.l) {
            if (!abstractC1273k.m) {
                abstractC1273k.d();
            }
            return abstractC1273k.q;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.l) {
            if (!abstractC1273k.m) {
                abstractC1273k.d();
            }
            return abstractC1273k.p;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.b.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            C1271i.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectG = this.b.g();
        if (rectG != null) {
            rect.set(rectG);
            padding = (rectG.right | ((rectG.left | rectG.top) | rectG.bottom)) != 0;
        } else {
            Drawable drawable = this.d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k != null) {
            abstractC1273k.r = false;
            abstractC1273k.t = false;
        }
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.b.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0) {
            this.l = 0L;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            AbstractC1273k abstractC1273kB = b();
            abstractC1273kB.i();
            f(abstractC1273kB);
            this.i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        AbstractC1273k abstractC1273k = this.b;
        int i2 = this.h;
        int i3 = abstractC1273k.h;
        Drawable[] drawableArr = abstractC1273k.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? DrawableCompat.setLayoutDirection(drawableArr[i4], i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        abstractC1273k.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.g && this.f == i) {
            return;
        }
        this.g = true;
        this.f = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            if (this.k == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.A != z) {
            abstractC1273k.A = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                DrawableCompat.setAutoMirrored(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC1273k abstractC1273k = this.b;
        abstractC1273k.C = true;
        if (abstractC1273k.B != colorFilter) {
            abstractC1273k.B = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC1273k abstractC1273k = this.b;
        if (abstractC1273k.w != z) {
            abstractC1273k.w = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.c;
        if (rect == null) {
            this.c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC1273k abstractC1273k = this.b;
        abstractC1273k.F = true;
        if (abstractC1273k.D != colorStateList) {
            abstractC1273k.D = colorStateList;
            DrawableCompat.setTintList(this.d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC1273k abstractC1273k = this.b;
        abstractC1273k.G = true;
        if (abstractC1273k.E != mode) {
            abstractC1273k.E = mode;
            DrawableCompat.setTintMode(this.d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
