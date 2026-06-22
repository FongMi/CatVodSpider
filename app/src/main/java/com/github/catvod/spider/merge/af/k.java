package com.github.catvod.spider.merge.af;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k extends HorizontalScrollView {
    private TextView a;
    private TextView b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ValueAnimator i;
    ValueAnimator.AnimatorUpdateListener j;

    public k(Context context) {
        super(context, null, 0);
        this.e = 0;
        this.f = 0;
        this.g = 100;
        this.h = 1;
        this.j = new j(this);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(relativeLayout);
        this.a = j();
        this.b = j();
        relativeLayout.addView(this.a);
        relativeLayout.addView(this.b);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.d);
        this.i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this.j);
        this.i.setRepeatCount(-1);
        this.i.setRepeatMode(1);
    }

    static /* synthetic */ int c(k kVar, int i) {
        int i2 = kVar.e - i;
        kVar.e = i2;
        return i2;
    }

    static /* synthetic */ int g(k kVar, int i) {
        int i2 = kVar.f - i;
        kVar.f = i2;
        return i2;
    }

    private TextView j() {
        TextView textView = new TextView(getContext());
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine();
        textView.setTextSize(20.0f);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        textView.setGravity(16);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return textView;
    }

    public final void k(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.b.setText(charSequence);
        int iMeasureText = (int) this.a.getPaint().measureText(charSequence, 0, charSequence.length());
        this.d = iMeasureText;
        this.e = 0;
        int i = iMeasureText + this.g;
        this.f = i;
        this.b.setX(i);
        invalidate();
        int i2 = this.d;
        if (i2 <= this.c) {
            m();
            return;
        }
        this.i.setDuration(i2);
        m();
        this.i.start();
    }

    public final void l(int i) {
        this.a.setTextColor(i);
        this.b.setTextColor(i);
    }

    public final void m() {
        this.i.cancel();
        this.e = 0;
        int i = this.d + this.g;
        this.f = i;
        this.b.setX(i);
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextView textView = this.a;
        if (textView == null || this.b == null) {
            return;
        }
        textView.setX(this.e);
        this.b.setX(this.f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = getMeasuredWidth();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.d;
        if (i5 <= this.c) {
            m();
            return;
        }
        this.i.setDuration(i5);
        m();
        this.i.start();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
