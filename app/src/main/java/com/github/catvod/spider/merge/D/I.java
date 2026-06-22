package com.github.catvod.spider.merge.D;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I implements X {
    public static final I a = new I();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        T t = T.i;
        try {
            Field declaredField = obj.getClass().getDeclaredField("map");
            if (Modifier.isPrivate(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
            }
            t.d(l, declaredField.get(obj), obj2, type, i);
        } catch (Exception unused) {
            h0Var.s();
        }
    }
}
