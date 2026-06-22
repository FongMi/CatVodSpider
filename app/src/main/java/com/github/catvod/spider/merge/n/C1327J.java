package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1327J extends ContextWrapper {
    private static final Object b = new Object();
    private static ArrayList<WeakReference<C1327J>> c;
    private final Resources a;

    private C1327J(Context context) {
        super(context);
        int i = P.a;
        this.a = new L(this, context.getResources());
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof C1327J) && !(context.getResources() instanceof L)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = P.a;
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (b) {
            ArrayList<WeakReference<C1327J>> arrayList = c;
            if (arrayList == null) {
                c = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C1327J> weakReference = c.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        c.remove(size);
                    }
                }
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C1327J> weakReference2 = c.get(size2);
                    C1327J c1327j = weakReference2 != null ? weakReference2.get() : null;
                    if (c1327j != null && c1327j.getBaseContext() == context) {
                        return c1327j;
                    }
                }
            }
            C1327J c1327j2 = new C1327J(context);
            c.add(new WeakReference<>(c1327j2));
            return c1327j2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
    }
}
