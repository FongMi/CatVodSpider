package com.github.catvod.spider.merge.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.github.catvod.spider.merge.L1.l;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1229a extends ViewGroup.MarginLayoutParams {
    public int a;

    public C1229a() {
        super(-2, -2);
        this.a = 8388627;
    }

    public C1229a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1229a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public C1229a(C1229a c1229a) {
        super((ViewGroup.MarginLayoutParams) c1229a);
        this.a = 0;
        this.a = c1229a.a;
    }
}
