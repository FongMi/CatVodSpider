package com.github.catvod.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

public class ScrollTextView extends TextView {

    private final Scroller scroller;
    private int duration;

    public ScrollTextView(Context context) {
        this(context, null);
    }

    public ScrollTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public ScrollTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setSingleLine();
        setEllipsize(null);
        setHorizontallyScrolling(true);
        setScroller(scroller = new Scroller(getContext(), new LinearInterpolator()));
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void startScroll() {
        scroller.startScroll(-getWidth(), 0, calculateScrollingLen(), 0, duration * 1000);
    }

    public void stopScroll() {
        if (scroller != null) scroller.abortAnimation();
        setVisibility(GONE);
    }

    private int calculateScrollingLen() {
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        String text = getText().toString();
        paint.getTextBounds(text, 0, text.length(), rect);
        return rect.width() + getWidth();
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if (scroller != null && scroller.isFinished()) stopScroll();
    }
}