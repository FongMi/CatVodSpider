package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class x extends ViewGroup {
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public x(Context context) {
        this(context, null);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = -1;
        this.d = 0;
        this.f = 8388659;
        int[] iArr = com.github.catvod.spider.merge.L1.l.j;
        M mS = M.s(context, attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, mS.o(), i, 0);
        int i2 = mS.i(1, -1);
        if (i2 >= 0 && this.e != i2) {
            this.e = i2;
            requestLayout();
        }
        int i3 = mS.i(0, -1);
        if (i3 >= 0 && this.f != i3) {
            i3 = (8388615 & i3) == 0 ? i3 | 8388611 : i3;
            this.f = (i3 & 112) == 0 ? i3 | 48 : i3;
            requestLayout();
        }
        boolean zA = mS.a(2, true);
        if (!zA) {
            this.b = zA;
        }
        this.h = mS.g();
        this.c = mS.i(3, -1);
        this.i = mS.a(7, false);
        Drawable drawableF = mS.f(5);
        if (drawableF != this.l) {
            this.l = drawableF;
            if (drawableF != null) {
                this.m = drawableF.getIntrinsicWidth();
                this.n = drawableF.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            setWillNotDraw(drawableF == null);
            requestLayout();
        }
        this.o = mS.i(8, 0);
        this.p = mS.e(6, 0);
        mS.t();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w;
    }

    final void d(Canvas canvas, int i) {
        this.l.setBounds(getPaddingLeft() + this.p, i, (getWidth() - getPaddingRight()) - this.p, this.n + i);
        this.l.draw(canvas);
    }

    final void e(Canvas canvas, int i) {
        this.l.setBounds(i, getPaddingTop() + this.p, this.m + i, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public w generateDefaultLayoutParams() {
        int i = this.e;
        if (i == 0) {
            return new w(-2);
        }
        if (i == 1) {
            return new w(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w generateLayoutParams(AttributeSet attributeSet) {
        return new w(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.d;
        if (this.e == 1 && (i = this.f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((w) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public w generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new w(layoutParams);
    }

    public final Drawable i() {
        return this.l;
    }

    public final int j() {
        return this.m;
    }

    public final int k() {
        return this.f;
    }

    protected final boolean l(int i) {
        if (i == 0) {
            return (this.o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        this.b = false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.l == null) {
            return;
        }
        int i = 0;
        if (this.e == 1) {
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && l(i)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w) childAt.getLayoutParams())).topMargin) - this.n);
                }
                i++;
            }
            if (l(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zB = Q.b(this);
        while (i < childCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && l(i)) {
                w wVar = (w) childAt3.getLayoutParams();
                e(canvas, zB ? childAt3.getRight() + ((LinearLayout.LayoutParams) wVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) wVar).leftMargin) - this.m);
            }
            i++;
        }
        if (l(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                w wVar2 = (w) childAt4.getLayoutParams();
                if (zB) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) wVar2).leftMargin;
                    right = (left - paddingRight) - this.m;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) wVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.m;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.x.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.x.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
