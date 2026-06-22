package com.github.catvod.spider.merge.l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.v;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1292e {
    private CharSequence A;
    private CharSequence B;
    final /* synthetic */ C1293f E;
    private Menu a;
    private boolean h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private int m;
    private char n;
    private int o;
    private char p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private String x;
    private String y;
    ActionProvider z;
    private ColorStateList C = null;
    private PorterDuff.Mode D = null;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private boolean f = true;
    private boolean g = true;

    public C1292e(C1293f c1293f, Menu menu) {
        this.E = c1293f;
        this.a = menu;
    }

    private <T> T d(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    private void h(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (this.E.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1291d(this.E.b(), this.y));
        }
        if (this.r >= 2) {
            if (menuItem instanceof k) {
                ((k) menuItem).o(true);
            } else if (menuItem instanceof j) {
                ((j) menuItem).f();
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) d(str, C1293f.e, this.E.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProvider actionProvider = this.z;
        if (actionProvider != null) {
            MenuItemCompat.setActionProvider(menuItem, actionProvider);
        }
        MenuItemCompat.setContentDescription(menuItem, this.A);
        MenuItemCompat.setTooltipText(menuItem, this.B);
        MenuItemCompat.setAlphabeticShortcut(menuItem, this.n, this.o);
        MenuItemCompat.setNumericShortcut(menuItem, this.p, this.q);
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            MenuItemCompat.setIconTintMode(menuItem, mode);
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            MenuItemCompat.setIconTintList(menuItem, colorStateList);
        }
    }

    public final void a() {
        this.h = true;
        h(this.a.add(this.b, this.i, this.j, this.k));
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        h(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    public final boolean c() {
        return this.h;
    }

    public final void e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.E.c.obtainStyledAttributes(attributeSet, l.l);
        this.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet) {
        M mR = M.r(this.E.c, attributeSet, l.m);
        this.i = mR.l(2, 0);
        this.j = (mR.i(5, this.c) & (-65536)) | (mR.i(6, this.d) & 65535);
        this.k = mR.n(7);
        this.l = mR.n(8);
        this.m = mR.l(0, 0);
        String strM = mR.m(9);
        this.n = strM == null ? (char) 0 : strM.charAt(0);
        this.o = mR.i(16, 4096);
        String strM2 = mR.m(10);
        this.p = strM2 == null ? (char) 0 : strM2.charAt(0);
        this.q = mR.i(20, 4096);
        this.r = mR.p(11) ? mR.a(11, false) : this.e;
        this.s = mR.a(3, false);
        this.t = mR.a(4, this.f);
        this.u = mR.a(1, this.g);
        this.v = mR.i(21, -1);
        this.y = mR.m(12);
        this.w = mR.l(13, 0);
        this.x = mR.m(15);
        String strM3 = mR.m(14);
        boolean z = strM3 != null;
        if (z && this.w == 0 && this.x == null) {
            this.z = (ActionProvider) d(strM3, C1293f.f, this.E.b);
        } else {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.z = null;
        }
        this.A = mR.n(17);
        this.B = mR.n(22);
        if (mR.p(19)) {
            this.D = v.c(mR.i(19, -1), this.D);
        } else {
            this.D = null;
        }
        if (mR.p(18)) {
            this.C = mR.c(18);
        } else {
            this.C = null;
        }
        mR.t();
        this.h = false;
    }

    public final void g() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }
}
