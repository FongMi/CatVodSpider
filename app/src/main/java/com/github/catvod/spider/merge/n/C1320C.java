package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1320C implements InterfaceC1321D {
    C1320C() {
    }

    @Override // com.github.catvod.spider.merge.n.InterfaceC1321D
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute == null) {
            return null;
        }
        try {
            Drawable drawable = (Drawable) C1320C.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
            } else {
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
            }
            return drawable;
        } catch (Exception e) {
            Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
            return null;
        }
    }
}
