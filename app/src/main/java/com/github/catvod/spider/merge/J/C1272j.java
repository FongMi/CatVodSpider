package com.github.catvod.spider.merge.j;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1272j implements Drawable.Callback {
    private Drawable.Callback b;

    C1272j() {
    }

    public final Drawable.Callback a() {
        Drawable.Callback callback = this.b;
        this.b = null;
        return callback;
    }

    public final C1272j b(Drawable.Callback callback) {
        this.b = callback;
        return this;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.b;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.b;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
