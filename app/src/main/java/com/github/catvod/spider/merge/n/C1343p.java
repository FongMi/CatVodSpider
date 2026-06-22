package com.github.catvod.spider.merge.n;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.github.catvod.spider.merge.i.C1260b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1343p extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView {
    private final C1332e b;
    private final C1342o c;
    private final C1339l d;
    private boolean e;

    public C1343p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C1343p(Context context, AttributeSet attributeSet, int i) {
        super(C1327J.a(context), attributeSet, i);
        this.e = false;
        C1326I.a(this, getContext());
        C1332e c1332e = new C1332e(this);
        this.b = c1332e;
        c1332e.d(attributeSet, i);
        C1342o c1342o = new C1342o(this);
        this.c = c1342o;
        c1342o.m(attributeSet, i);
        c1342o.b();
        this.d = new C1339l(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.a();
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            return c1342o.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            return c1342o.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            return c1342o.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1342o c1342o = this.c;
        return c1342o != null ? c1342o.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public final int getAutoSizeTextType() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            return c1342o.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            return c1332e.b();
        }
        return null;
    }

    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            return c1332e.c();
        }
        return null;
    }

    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        C1339l c1339l;
        return (Build.VERSION.SDK_INT >= 28 || (c1339l = this.d) == null) ? super.getTextClassifier() : c1339l.a();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.c.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, getText());
        }
        C1335h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.o();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1342o c1342o = this.c;
        if (c1342o == null || AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || !c1342o.l()) {
            return;
        }
        this.c.c();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.q(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.r(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.s(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C1260b.b(context, i) : null, i2 != 0 ? C1260b.b(context, i2) : null, i3 != 0 ? C1260b.b(context, i3) : null, i4 != 0 ? C1260b.b(context, i4) : null);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C1260b.b(context, i) : null, i2 != 0 ? C1260b.b(context, i2) : null, i3 != 0 ? C1260b.b(context, i3) : null, i4 != 0 ? C1260b.b(context, i4) : null);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        TextViewCompat.setLineHeight(this, i);
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.h(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1332e c1332e = this.b;
        if (c1332e != null) {
            c1332e.i(mode);
        }
    }

    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.t(colorStateList);
        this.c.b();
    }

    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.u(mode);
        this.c.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.p(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        C1339l c1339l;
        if (Build.VERSION.SDK_INT >= 28 || (c1339l = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1339l.b(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
            return;
        }
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.v(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            typefaceCreate = TypefaceCompat.create(getContext(), typeface, i);
        }
        this.e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.b();
        }
    }
}
