package com.github.catvod.ui;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MarqueeView extends HorizontalScrollView {

    private TextView mTextView;
    private TextView mGhostTextView;
    private int viewWidth;
    private int measureText;
    private int mOffset = 0;
    private int mGhostOffset = 0;
    private int spacing = 100;
    private int speed = 1;

    private ValueAnimator valueAnimator;

    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MarqueeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout();
        initAnim();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        viewWidth = getMeasuredWidth();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (measureText > viewWidth) {
            startAnim();
        } else {
            stopAnim();
        }
    }

    private void initLayout() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        mTextView = createTextView();
        mGhostTextView = createTextView();
        relativeLayout.addView(mTextView);
        relativeLayout.addView(mGhostTextView);
    }

    private void initAnim() {
        valueAnimator = ValueAnimator.ofFloat(0, measureText);
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setText(CharSequence text) {
        mTextView.setText(text);
        mGhostTextView.setText(text);
        measureText = (int) mTextView.getPaint().measureText(text, 0, text.length());
        resetMarqueeView();
        if (measureText > viewWidth) {
            startAnim();
        } else {
            stopAnim();
        }
    }

    public void setTextColor(int color) {
        mTextView.setTextColor(color);
        mGhostTextView.setTextColor(color);
    }

    private TextView createTextView() {
        TextView textView = new TextView(getContext());
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine();
        textView.setTextSize(20);
        LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return textView;
    }

    private void resetMarqueeView() {
        mOffset = 0;
        mGhostOffset = measureText + spacing;
        mGhostTextView.setX(mGhostOffset);
        invalidate();
    }

    public void startAnim() {
        valueAnimator.setDuration(measureText);
        stopAnim();
        valueAnimator.start();
    }

    public void stopAnim() {
        valueAnimator.cancel();
        resetMarqueeView();
    }

    ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator animation) {
            mOffset -= speed;
            mGhostOffset -= speed;
            if (mOffset + measureText < 0) {
                mOffset = mGhostOffset + measureText + spacing;
            }
            if (mGhostOffset + measureText < 0) {
                mGhostOffset = mOffset + measureText + spacing;
            }
            invalidate();
        }
    };

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mTextView == null || mGhostTextView == null) return;
        mTextView.setX(mOffset);
        mGhostTextView.setX(mGhostOffset);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return true;
    }
}