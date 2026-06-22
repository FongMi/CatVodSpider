package com.github.catvod.spider.merge.n;

import android.R;
import android.app.Application;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0140a extends TextView {
    public final Scroller a;
    public int b;

    public C0140a(Application application) {
        super(application, null, R.attr.textViewStyle);
        setSingleLine();
        setEllipsize(null);
        setHorizontallyScrolling(true);
        Scroller scroller = new Scroller(getContext(), new LinearInterpolator());
        this.a = scroller;
        setScroller(scroller);
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.a;
        if (scroller == null || !scroller.isFinished()) {
            return;
        }
        if (scroller != null) {
            scroller.abortAnimation();
        }
        setVisibility(8);
    }
}
