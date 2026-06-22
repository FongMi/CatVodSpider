package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.catvod.spider.merge.q.C1377f;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1324G {
    private static C1324G i;
    private WeakHashMap<Context, com.github.catvod.spider.merge.q.o<ColorStateList>> a;
    private com.github.catvod.spider.merge.q.n<String, InterfaceC1321D> b;
    private com.github.catvod.spider.merge.q.o<String> c;
    private final WeakHashMap<Context, C1377f<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private InterfaceC1322E g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final C1319B j = new C1319B();

    private void a(String str, InterfaceC1321D interfaceC1321D) {
        if (this.b == null) {
            this.b = new com.github.catvod.spider.merge.q.n<>();
        }
        this.b.put(str, interfaceC1321D);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1377f<WeakReference<Drawable.ConstantState>> c1377f = this.d.get(context);
            if (c1377f == null) {
                c1377f = new C1377f<>();
                this.d.put(context, c1377f);
            }
            c1377f.e(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        InterfaceC1322E interfaceC1322E = this.g;
        Drawable drawableC = interfaceC1322E == null ? null : ((C1333f) interfaceC1322E).c(this, context, i2);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, drawableC);
        }
        return drawableC;
    }

    public static synchronized C1324G d() {
        if (i == null) {
            C1324G c1324g = new C1324G();
            i = c1324g;
            j(c1324g);
        }
        return i;
    }

    private synchronized Drawable e(Context context, long j2) {
        C1377f<WeakReference<Drawable.ConstantState>> c1377f = this.d.get(context);
        if (c1377f == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceD = c1377f.d(j2, null);
        if (weakReferenceD != null) {
            Drawable.ConstantState constantState = weakReferenceD.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1377f.f(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterA;
        C1319B c1319b = j;
        c1319b.getClass();
        int i3 = (i2 + 31) * 31;
        porterDuffColorFilterA = c1319b.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilterA == null) {
            porterDuffColorFilterA = new PorterDuffColorFilter(i2, mode);
            c1319b.getClass();
            c1319b.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilterA);
        }
        return porterDuffColorFilterA;
    }

    private static void j(C1324G c1324g) {
        if (Build.VERSION.SDK_INT < 24) {
            c1324g.a("vector", new C1323F());
            c1324g.a("animated-vector", new C1318A());
            c1324g.a("animated-selector", new z());
            c1324g.a("drawable", new C1320C());
        }
    }

    private Drawable k(Context context, int i2) {
        int next;
        com.github.catvod.spider.merge.q.n<String, InterfaceC1321D> nVar = this.b;
        if (nVar == null || nVar.isEmpty()) {
            return null;
        }
        com.github.catvod.spider.merge.q.o<String> oVar = this.c;
        if (oVar != null) {
            String strC = oVar.c(i2, null);
            if ("appcompat_skip_skip".equals(strC) || (strC != null && this.b.getOrDefault(strC, null) == null)) {
                return null;
            }
        } else {
            this.c = new com.github.catvod.spider.merge.q.o<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new com.github.catvod.spider.merge.Q1.a("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                InterfaceC1321D orDefault = this.b.getOrDefault(name, null);
                if (orDefault != null) {
                    drawableE = orDefault.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableE == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    private Drawable m(Context context, int i2, Drawable drawable) {
        InterfaceC1322E interfaceC1322E;
        ColorStateList colorStateListI = i(context, i2);
        if (colorStateListI != null) {
            if (v.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(drawable, colorStateListI);
            PorterDuff.Mode mode = (this.g != null && i2 == 2131165249) ? PorterDuff.Mode.MULTIPLY : null;
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        } else {
            InterfaceC1322E interfaceC1322E2 = this.g;
            if ((interfaceC1322E2 == null || !((C1333f) interfaceC1322E2).g(context, i2, drawable)) && ((interfaceC1322E = this.g) == null || !((C1333f) interfaceC1322E).h(context, i2, drawable))) {
            }
        }
        return drawable;
    }

    static void n(Drawable drawable, K k, int[] iArr) {
        if (v.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = k.d;
        if (z || k.c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z ? k.a : null;
            PorterDuff.Mode mode = k.c ? k.b : h;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterH = h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f = r0     // Catch: java.lang.Throwable -> L52
            r1 = 2131165262(0x7f07004e, float:1.7944736E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch: java.lang.Throwable -> L52
            r2 = 0
            if (r1 == 0) goto L48
            boolean r3 = r1 instanceof androidx.vectordrawable.graphics.drawable.s     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L52
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L48
        L2b:
            android.graphics.drawable.Drawable r0 = r4.k(r5, r6)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch: java.lang.Throwable -> L52
        L35:
            if (r0 != 0) goto L3b
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r5, r6)     // Catch: java.lang.Throwable -> L52
        L3b:
            if (r0 == 0) goto L41
            android.graphics.drawable.Drawable r0 = r4.m(r5, r6, r0)     // Catch: java.lang.Throwable -> L52
        L41:
            if (r0 == 0) goto L46
            com.github.catvod.spider.merge.n.v.b(r0)     // Catch: java.lang.Throwable -> L52
        L46:
            monitor-exit(r4)
            return r0
        L48:
            r4.f = r2     // Catch: java.lang.Throwable -> L52
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L52
            throw r5     // Catch: java.lang.Throwable -> L52
        L52:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.C1324G.g(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateListC;
        com.github.catvod.spider.merge.q.o<ColorStateList> oVar;
        WeakHashMap<Context, com.github.catvod.spider.merge.q.o<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateListE = null;
        colorStateListC = (weakHashMap == null || (oVar = weakHashMap.get(context)) == null) ? null : oVar.c(i2, null);
        if (colorStateListC == null) {
            InterfaceC1322E interfaceC1322E = this.g;
            if (interfaceC1322E != null) {
                colorStateListE = ((C1333f) interfaceC1322E).e(context, i2);
            }
            if (colorStateListE != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                com.github.catvod.spider.merge.q.o<ColorStateList> oVar2 = this.a.get(context);
                if (oVar2 == null) {
                    oVar2 = new com.github.catvod.spider.merge.q.o<>();
                    this.a.put(context, oVar2);
                }
                oVar2.a(i2, colorStateListE);
            }
            colorStateListC = colorStateListE;
        }
        return colorStateListC;
    }

    public final synchronized void l(InterfaceC1322E interfaceC1322E) {
        this.g = interfaceC1322E;
    }

    final boolean o(Context context, int i2, Drawable drawable) {
        InterfaceC1322E interfaceC1322E = this.g;
        return interfaceC1322E != null && ((C1333f) interfaceC1322E).h(context, i2, drawable);
    }
}
