package com.github.catvod.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

public class ScrollTextView extends TextView {

    private Scroller scroller;
    private int duration = 30;

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
        setVisibility(INVISIBLE);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void startScroll() {
        int width = -1 * getWidth();
        setHorizontallyScrolling(true);
        setScroller(scroller = new Scroller(getContext(), new LinearInterpolator()));
        int scrollingLen = calculateScrollingLen();
        int distance = scrollingLen - (getWidth() + width);
        scroller.startScroll(width, 0, distance, 0, duration * 1000);
        setVisibility(VISIBLE);
        invalidate();
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
        if (scroller == null) return;
        if (scroller.isFinished()) {
            scroller.abortAnimation();
            setVisibility(GONE);
        }
    }
}