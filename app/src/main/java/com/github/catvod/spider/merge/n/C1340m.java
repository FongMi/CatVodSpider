package com.github.catvod.spider.merge.n;

import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1340m extends ResourcesCompat.FontCallback {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ C1342o d;

    C1340m(C1342o c1342o, int i, int i2, WeakReference weakReference) {
        this.d = c1342o;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    public final void onFontRetrievalFailed(int i) {
    }

    public final void onFontRetrieved(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        this.d.n(this.c, typeface);
    }
}
