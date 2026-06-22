package com.github.catvod.spider.merge.j;

import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1271i {
    public static boolean a(Drawable.ConstantState constantState) {
        return constantState.canApplyTheme();
    }

    public static void b(Drawable drawable, Outline outline) {
        drawable.getOutline(outline);
    }

    public static Resources c(Resources.Theme theme) {
        return theme.getResources();
    }
}
