package com.github.catvod.spider.merge.n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.ColorUtils;
import com.github.catvod.spider.merge.i.C1260b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1333f implements InterfaceC1322E {
    private final int[] a = {2131165260, 2131165258, 2131165184};
    private final int[] b = {2131165208, 2131165243, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
    private final int[] c = {2131165257, 2131165259, 2131165201, 2131165253, 2131165254, 2131165255, 2131165256};
    private final int[] d = {2131165233, 2131165199, 2131165232};
    private final int[] e = {2131165251, 2131165261};
    private final int[] f = {2131165187, 2131165193, 2131165188, 2131165194};

    C1333f() {
    }

    private boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ColorStateList b(Context context, int i) {
        int iC = C1326I.c(context, 2130903159);
        return new ColorStateList(new int[][]{C1326I.b, C1326I.d, C1326I.c, C1326I.f}, new int[]{C1326I.b(context, 2130903157), ColorUtils.compositeColors(iC, i), ColorUtils.compositeColors(iC, i), i});
    }

    private LayerDrawable d(C1324G c1324g, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = c1324g.f(context, 2131165247);
        Drawable drawableF2 = c1324g.f(context, 2131165248);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    private void f(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        if (v.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C1334g.b;
        }
        synchronized (C1334g.class) {
            porterDuffColorFilterH = C1324G.h(i, mode);
        }
        drawable.setColorFilter(porterDuffColorFilterH);
    }

    public final Drawable c(C1324G c1324g, Context context, int i) {
        int i2;
        if (i == 2131165200) {
            return new LayerDrawable(new Drawable[]{c1324g.f(context, 2131165199), c1324g.f(context, 2131165201)});
        }
        if (i == 2131165235) {
            i2 = 2131099707;
        } else if (i == 2131165234) {
            i2 = 2131099708;
        } else {
            if (i != 2131165236) {
                return null;
            }
            i2 = 2131099709;
        }
        return d(c1324g, context, i2);
    }

    public final ColorStateList e(Context context, int i) {
        if (i == 2131165204) {
            return C1260b.a(context, 2131034133);
        }
        if (i == 2131165250) {
            return C1260b.a(context, 2131034136);
        }
        if (i == 2131165249) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = C1326I.d(context, 2130903164);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = C1326I.b;
                iArr2[0] = C1326I.b(context, 2130903164);
                iArr[1] = C1326I.e;
                iArr2[1] = C1326I.c(context, 2130903158);
                iArr[2] = C1326I.f;
                iArr2[2] = C1326I.c(context, 2130903164);
            } else {
                iArr[0] = C1326I.b;
                iArr2[0] = colorStateListD.getColorForState(iArr[0], 0);
                iArr[1] = C1326I.e;
                iArr2[1] = C1326I.c(context, 2130903158);
                iArr[2] = C1326I.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == 2131165192) {
            return b(context, C1326I.c(context, 2130903157));
        }
        if (i == 2131165186) {
            return b(context, 0);
        }
        if (i == 2131165191) {
            return b(context, C1326I.c(context, 2130903155));
        }
        if (i == 2131165245 || i == 2131165246) {
            return C1260b.a(context, 2131034135);
        }
        if (a(this.b, i)) {
            return C1326I.d(context, 2130903160);
        }
        if (a(this.e, i)) {
            return C1260b.a(context, 2131034132);
        }
        if (a(this.f, i)) {
            return C1260b.a(context, 2131034131);
        }
        if (i == 2131165242) {
            return C1260b.a(context, 2131034134);
        }
        return null;
    }

    public final boolean g(Context context, int i, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable drawableFindDrawableByLayerId;
        int iC;
        if (i == 2131165244) {
            layerDrawable = (LayerDrawable) drawable;
            f(layerDrawable.findDrawableByLayerId(R.id.background), C1326I.c(context, 2130903160), C1334g.b);
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            iC = C1326I.c(context, 2130903160);
        } else {
            if (i != 2131165235 && i != 2131165234 && i != 2131165236) {
                return false;
            }
            layerDrawable = (LayerDrawable) drawable;
            f(layerDrawable.findDrawableByLayerId(R.id.background), C1326I.b(context, 2130903160), C1334g.b);
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            iC = C1326I.c(context, 2130903158);
        }
        f(drawableFindDrawableByLayerId, iC, C1334g.b);
        f(layerDrawable.findDrawableByLayerId(R.id.progress), C1326I.c(context, 2130903158), C1334g.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            android.graphics.PorterDuff$Mode r0 = com.github.catvod.spider.merge.n.C1334g.a()
            int[] r1 = r6.a
            boolean r1 = r6.a(r1, r8)
            r2 = 1
            r3 = 0
            r4 = -1
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            if (r1 == 0) goto L16
            r5 = 2130903160(0x7f030078, float:1.741313E38)
            goto L42
        L16:
            int[] r1 = r6.c
            boolean r1 = r6.a(r1, r8)
            if (r1 == 0) goto L22
            r5 = 2130903158(0x7f030076, float:1.7413126E38)
            goto L42
        L22:
            int[] r1 = r6.d
            boolean r1 = r6.a(r1, r8)
            if (r1 == 0) goto L2d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L42
        L2d:
            r1 = 2131165221(0x7f070025, float:1.7944653E38)
            if (r8 != r1) goto L3d
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            r1 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r1)
            goto L44
        L3d:
            r1 = 2131165203(0x7f070013, float:1.7944616E38)
            if (r8 != r1) goto L46
        L42:
            r8 = r5
            r1 = -1
        L44:
            r5 = 1
            goto L49
        L46:
            r8 = 0
            r1 = -1
            r5 = 0
        L49:
            if (r5 == 0) goto L6d
            boolean r3 = com.github.catvod.spider.merge.n.v.a(r9)
            if (r3 == 0) goto L55
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L55:
            int r7 = com.github.catvod.spider.merge.n.C1326I.c(r7, r8)
            java.lang.Class<com.github.catvod.spider.merge.n.g> r8 = com.github.catvod.spider.merge.n.C1334g.class
            monitor-enter(r8)
            android.graphics.PorterDuffColorFilter r7 = com.github.catvod.spider.merge.n.C1324G.h(r7, r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r8)
            r9.setColorFilter(r7)
            if (r1 == r4) goto L69
            r9.setAlpha(r1)
        L69:
            return r2
        L6a:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.n.C1333f.h(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
