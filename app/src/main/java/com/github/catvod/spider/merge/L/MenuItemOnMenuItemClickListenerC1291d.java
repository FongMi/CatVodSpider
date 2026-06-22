package com.github.catvod.spider.merge.l;

import android.view.InflateException;
import android.view.MenuItem;
import com.github.catvod.spider.merge.H0.j;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class MenuItemOnMenuItemClickListenerC1291d implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] c = {MenuItem.class};
    private Object a;
    private Method b;

    public MenuItemOnMenuItemClickListenerC1291d(Object obj, String str) {
        this.a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.b = cls.getMethod(str, c);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't resolve menu item onClick handler ");
            sb.append(str);
            sb.append(" in class ");
            InflateException inflateException = new InflateException(j.b(cls, sb));
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.b.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
            }
            this.b.invoke(this.a, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
