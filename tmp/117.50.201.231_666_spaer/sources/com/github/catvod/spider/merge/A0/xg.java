package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xg {
    public final Map a;
    public final boolean b;
    public final List c;

    public xg(Map map, boolean z, List list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public final ub e(fj fjVar) {
        String str;
        ub xbVar;
        int i = 1;
        int i2 = 0;
        Type type = fjVar.b;
        Map map = this.a;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = fjVar.a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        jo joVar = null;
        xc xcVar = EnumSet.class.isAssignableFrom(cls) ? new xc(type, 0) : cls == EnumMap.class ? new xc(type, 1) : null;
        if (xcVar != null) {
            return xcVar;
        }
        zb.b(this.c);
        if (Modifier.isAbstract(cls.getModifiers())) {
            xbVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                acs acsVar = ce.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ce.c(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ce.f(e);
                }
                xbVar = str != null ? new xb(str, 2) : new xa(i, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                xbVar = null;
            }
        }
        if (xbVar != null) {
            return xbVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            joVar = SortedSet.class.isAssignableFrom(cls) ? new jo(11) : Set.class.isAssignableFrom(cls) ? new jo(12) : Queue.class.isAssignableFrom(cls) ? new jo(13) : new jo(14);
        } else if (Map.class.isAssignableFrom(cls)) {
            joVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new jo(15) : ConcurrentMap.class.isAssignableFrom(cls) ? new jo(16) : SortedMap.class.isAssignableFrom(cls) ? new jo(17) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new fj(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new jo(19) : new jo(18);
        }
        if (joVar != null) {
            return joVar;
        }
        String strD = d(cls);
        if (strD != null) {
            return new xb(strD, 1);
        }
        if (this.b) {
            return new xa(i2, cls);
        }
        String str2 = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str2 = str2 + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new xb(str2, 0);
    }

    public final String toString() {
        return this.a.toString();
    }
}
