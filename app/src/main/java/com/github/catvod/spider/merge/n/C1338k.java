package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1338k extends ImageView implements TintableBackgroundView, TintableImageSourceView {
    private final C1332e b;
    private final C1337j c;

    public C1338k(Context context, int i) {
        super(C1327J.a(context), null, i);
        C1326I.a(this, getContext());
        C1332e c1332e = new C1332e(this);
        this.b = c1332e;
        c1332e.d(null, i);
        C1337j c1337j = new C1337j(this);
        this.c = c1337j;
        c1337j.e(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.a();
        }
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.a();
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            return c1332e.b();
        }
        return null;
    }

    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            return c1332e.c();
        }
        return null;
    }

    public final ColorStateList getSupportImageTintList() {
        C1337j c1337j = this.c;
        if (c1337j != null) {
            return c1337j.b();
        }
        return null;
    }

    public final PorterDuff.Mode getSupportImageTintMode() {
        C1337j c1337j = this.c;
        if (c1337j != null) {
            return c1337j.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.f(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.f(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.h(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.i(mode);
        }
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.g(colorStateList);
        }
    }

    public final void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1337j c1337j = this.c;
        if (c1337j != null) {
            c1337j.h(mode);
        }
    }
}
