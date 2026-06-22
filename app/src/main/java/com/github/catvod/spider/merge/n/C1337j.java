package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.github.catvod.spider.merge.i.C1260b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1337j {
    private final ImageView a;
    private K b;
    private K c;

    public C1337j(ImageView imageView) {
        this.a = imageView;
    }

    final void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            v.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.c == null) {
                    this.c = new K();
                }
                K k = this.c;
                k.a = null;
                k.d = false;
                k.b = null;
                k.c = false;
                ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.a);
                if (imageTintList != null) {
                    k.d = true;
                    k.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.a);
                if (imageTintMode != null) {
                    k.c = true;
                    k.b = imageTintMode;
                }
                if (k.d || k.c) {
                    int[] drawableState = this.a.getDrawableState();
                    int i2 = C1334g.d;
                    C1324G.n(drawable, k, drawableState);
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            K k2 = this.b;
            if (k2 != null) {
                int[] drawableState2 = this.a.getDrawableState();
                int i3 = C1334g.d;
                C1324G.n(drawable, k2, drawableState2);
            }
        }
    }

    final ColorStateList b() {
        K k = this.b;
        if (k != null) {
            return k.a;
        }
        return null;
    }

    final PorterDuff.Mode c() {
        K k = this.b;
        if (k != null) {
            return k.b;
        }
        return null;
    }

    final boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public final void e(int i) {
        int iL;
        Context context = this.a.getContext();
        int[] iArr = com.github.catvod.spider.merge.L1.l.e;
        M mS = M.s(context, null, iArr, i, 0);
        ImageView imageView = this.a;
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), iArr, (AttributeSet) null, mS.o(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iL = mS.l(1, -1)) != -1 && (drawable = C1260b.b(this.a.getContext(), iL)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                v.b(drawable);
            }
            if (mS.p(2)) {
                ImageViewCompat.setImageTintList(this.a, mS.c(2));
            }
            if (mS.p(3)) {
                ImageViewCompat.setImageTintMode(this.a, v.c(mS.i(3, -1), null));
            }
        } finally {
            mS.t();
        }
    }

    public final void f(int i) {
        if (i != 0) {
            Drawable drawableB = C1260b.b(this.a.getContext(), i);
            if (drawableB != null) {
                v.b(drawableB);
            }
            this.a.setImageDrawable(drawableB);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    final void g(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new K();
        }
        K k = this.b;
        k.a = colorStateList;
        k.d = true;
        a();
    }

    final void h(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new K();
        }
        K k = this.b;
        k.b = mode;
        k.c = true;
        a();
    }
}
