package com.github.catvod.spider.merge.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ColorStateListInflaterCompat;
import com.github.catvod.spider.merge.n.C1324G;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class C1260b {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<C1259a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateListCreateFromXml;
        ColorStateList colorStateList;
        C1259a c1259a;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (c) {
            SparseArray<C1259a> sparseArray = b.get(context);
            colorStateListCreateFromXml = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (c1259a = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (c1259a.b.equals(context.getResources().getConfiguration())) {
                colorStateList = c1259a.a;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            Resources resources2 = context.getResources();
            try {
                colorStateListCreateFromXml = ColorStateListInflaterCompat.createFromXml(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListCreateFromXml == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        synchronized (c) {
            WeakHashMap<Context, SparseArray<C1259a>> weakHashMap = b;
            SparseArray<C1259a> sparseArray2 = weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new C1259a(colorStateListCreateFromXml, context.getResources().getConfiguration()));
        }
        return colorStateListCreateFromXml;
    }

    public static Drawable b(Context context, int i) {
        return C1324G.d().f(context, i);
    }
}
