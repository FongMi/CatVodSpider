package com.github.catvod.spider.merge.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC1273k extends Drawable.ConstantState {
    boolean A;
    ColorFilter B;
    boolean C;
    ColorStateList D;
    PorterDuff.Mode E;
    boolean F;
    boolean G;
    final l a;
    Resources b;
    int c;
    int d;
    int e;
    SparseArray<Drawable.ConstantState> f;
    Drawable[] g;
    int h;
    boolean i;
    boolean j;
    Rect k;
    boolean l;
    boolean m;
    int n;
    int o;
    int p;
    int q;
    boolean r;
    int s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    int x;
    int y;
    int z;

    AbstractC1273k(AbstractC1273k abstractC1273k, l lVar, Resources resources) {
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = lVar;
        this.b = resources != null ? resources : abstractC1273k != null ? abstractC1273k.b : null;
        int i = abstractC1273k != null ? abstractC1273k.c : 0;
        int i2 = l.n;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (abstractC1273k == null) {
            this.g = new Drawable[10];
            this.h = 0;
            return;
        }
        this.d = abstractC1273k.d;
        this.e = abstractC1273k.e;
        this.u = true;
        this.v = true;
        this.i = abstractC1273k.i;
        this.l = abstractC1273k.l;
        this.w = abstractC1273k.w;
        this.x = abstractC1273k.x;
        this.y = abstractC1273k.y;
        this.z = abstractC1273k.z;
        this.A = abstractC1273k.A;
        this.B = abstractC1273k.B;
        this.C = abstractC1273k.C;
        this.D = abstractC1273k.D;
        this.E = abstractC1273k.E;
        this.F = abstractC1273k.F;
        this.G = abstractC1273k.G;
        if (abstractC1273k.c == i) {
            if (abstractC1273k.j) {
                this.k = abstractC1273k.k != null ? new Rect(abstractC1273k.k) : null;
                this.j = true;
            }
            if (abstractC1273k.m) {
                this.n = abstractC1273k.n;
                this.o = abstractC1273k.o;
                this.p = abstractC1273k.p;
                this.q = abstractC1273k.q;
                this.m = true;
            }
        }
        if (abstractC1273k.r) {
            this.s = abstractC1273k.s;
            this.r = true;
        }
        if (abstractC1273k.t) {
            this.t = true;
        }
        Drawable[] drawableArr = abstractC1273k.g;
        this.g = new Drawable[drawableArr.length];
        this.h = abstractC1273k.h;
        SparseArray<Drawable.ConstantState> sparseArray = abstractC1273k.f;
        this.f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.h);
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                if (constantState != null) {
                    this.f.put(i4, constantState);
                } else {
                    this.g[i4] = drawableArr[i4];
                }
            }
        }
    }

    private void e() {
        SparseArray<Drawable.ConstantState> sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                this.g[this.f.keyAt(i)] = j(this.f.valueAt(i).newDrawable(this.b));
            }
            this.f = null;
        }
    }

    private Drawable j(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            DrawableCompat.setLayoutDirection(drawable, this.x);
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setCallback(this.a);
        return drawableMutate;
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            n nVar = (n) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = nVar.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            nVar.g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(nVar.H, 0, iArr, 0, i);
            nVar.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    final void b(Resources.Theme theme) {
        if (theme != null) {
            e();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && DrawableCompat.canApplyTheme(drawableArr[i2])) {
                    DrawableCompat.applyTheme(drawableArr[i2], theme);
                    this.e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            k(C1271i.c(theme));
        }
    }

    public final boolean c() {
        if (this.u) {
            return this.v;
        }
        e();
        this.u = true;
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.v = false;
                return false;
            }
        }
        this.v = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = this.f.get(i2);
                if (constantState != null && C1271i.a(constantState)) {
                    return true;
                }
            } else if (DrawableCompat.canApplyTheme(drawable)) {
                return true;
            }
        }
        return false;
    }

    protected final void d() {
        this.m = true;
        e();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final Drawable f(int i) {
        int iIndexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray<Drawable.ConstantState> sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableJ = j(this.f.valueAt(iIndexOfKey).newDrawable(this.b));
        this.g[i] = drawableJ;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableJ;
    }

    public final Rect g() {
        Rect rect = null;
        if (this.i) {
            return null;
        }
        Rect rect2 = this.k;
        if (rect2 != null || this.j) {
            return rect2;
        }
        e();
        Rect rect3 = new Rect();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getPadding(rect3)) {
                if (rect == null) {
                    rect = new Rect(0, 0, 0, 0);
                }
                int i3 = rect3.left;
                if (i3 > rect.left) {
                    rect.left = i3;
                }
                int i4 = rect3.top;
                if (i4 > rect.top) {
                    rect.top = i4;
                }
                int i5 = rect3.right;
                if (i5 > rect.right) {
                    rect.right = i5;
                }
                int i6 = rect3.bottom;
                if (i6 > rect.bottom) {
                    rect.bottom = i6;
                }
            }
        }
        this.j = true;
        this.k = rect;
        return rect;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    public final int h() {
        if (this.r) {
            return this.s;
        }
        e();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.s = opacity;
        this.r = true;
        return opacity;
    }

    abstract void i();

    final void k(Resources resources) {
        if (resources != null) {
            this.b = resources;
            int i = l.n;
            int i2 = resources.getDisplayMetrics().densityDpi;
            if (i2 == 0) {
                i2 = 160;
            }
            int i3 = this.c;
            this.c = i2;
            if (i3 != i2) {
                this.m = false;
                this.j = false;
            }
        }
    }
}
