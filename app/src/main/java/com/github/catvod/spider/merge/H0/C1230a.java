package com.github.catvod.spider.merge.h0;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1230a extends TextView {
    private final Scroller b;
    private int c;

    public C1230a(Context context) {
        super(context, null, R.attr.textViewStyle);
        setSingleLine();
        setEllipsize(null);
        setHorizontallyScrolling(true);
        Scroller scroller = new Scroller(getContext(), new LinearInterpolator());
        this.b = scroller;
        setScroller(scroller);
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b() {
        Scroller scroller = this.b;
        int i = -getWidth();
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        String string = getText().toString();
        paint.getTextBounds(string, 0, string.length(), rect);
        scroller.startScroll(i, 0, getWidth() + rect.width(), 0, this.c * 1000);
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.b;
        if (scroller == null || !scroller.isFinished()) {
            return;
        }
        Scroller scroller2 = this.b;
        if (scroller2 != null) {
            scroller2.abortAnimation();
        }
        setVisibility(8);
    }
}
