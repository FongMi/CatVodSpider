package com.github.catvod.spider.merge.n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import com.github.catvod.spider.merge.i.C1260b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1331d extends AutoCompleteTextView implements TintableBackgroundView {
    private static final int[] d = {R.attr.popupBackground};
    private final C1332e b;
    private final C1342o c;

    public C1331d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903095);
    }

    public C1331d(Context context, AttributeSet attributeSet, int i) {
        super(C1327J.a(context), attributeSet, 2130903095);
        C1326I.a(this, getContext());
        M mS = M.s(getContext(), attributeSet, d, 2130903095, 0);
        if (mS.p(0)) {
            setDropDownBackgroundDrawable(mS.f(0));
        }
        mS.t();
        C1332e c1332e = new C1332e(this);
        this.b = c1332e;
        c1332e.d(attributeSet, 2130903095);
        C1342o c1342o = new C1342o(this);
        this.c = c1342o;
        c1342o.m(attributeSet, 2130903095);
        c1342o.b();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1335h.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1260b.b(getContext(), i));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1342o c1342o = this.c;
        if (c1342o != null) {
            c1342o.p(context, i);
        }
    }
}
