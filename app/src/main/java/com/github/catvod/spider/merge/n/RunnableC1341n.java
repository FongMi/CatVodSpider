package com.github.catvod.spider.merge.n;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class RunnableC1341n implements Runnable {
    final /* synthetic */ TextView b;
    final /* synthetic */ Typeface c;
    final /* synthetic */ int d;

    RunnableC1341n(TextView textView, Typeface typeface, int i) {
        this.b = textView;
        this.c = typeface;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setTypeface(this.c, this.d);
    }
}
